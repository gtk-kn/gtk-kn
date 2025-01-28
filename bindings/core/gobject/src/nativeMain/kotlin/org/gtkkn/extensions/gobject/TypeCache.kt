/*
 * Copyright (c) 2025 gtk-kn
 *
 * SPDX-License-Identifier: LGPL-2.1-or-later
 *
 * This file is part of gtk-kn.
 * gtk-kn is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, see <http://www.gnu.org/licenses/>.
 */

package org.gtkkn.extensions.gobject

import kotlinx.cinterop.UIntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.get
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value
import org.gtkkn.bindings.gobject.GObject
import org.gtkkn.bindings.gobject.TypeInstance
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.glib.collections.ConcurrentMap
import org.gtkkn.native.glib.g_free
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_type_interfaces
import org.gtkkn.native.gobject.gpointer
import kotlin.native.internal.NativePtr
import kotlin.reflect.KClass

/**
 * A cache that maps GTypes to constructors for Kotlin/Native [Proxy] classes.
 */
public object TypeCache {
    private val typeRegisterMap = ConcurrentMap<GType, RegisteredConstructor>()
    private val classToTypeMap = ConcurrentMap<KClass<*>, GType>()

    /**
     * Retrieves a constructor for the native object at [address], or returns `null` if the address is null.
     *
     * @param address A pointer to a native GObject (or similar).
     * @param fallback Optional fallback data to use if no constructor is found.
     * @return A constructor function or `null` if none is found.
     */
    public fun getConstructor(
        address: gpointer,
        fallback: Fallback? = null
    ): ((gpointer) -> Proxy)? =
        if (address.rawValue == NativePtr.NULL) {
            null
        } else {
            TypeInstance(address.reinterpret()).gClass?.gType?.let { getConstructor(it, fallback) }
        }

    /**
     * Retrieves a constructor for the given [type], or falls back to parent/interface logic if necessary.
     *
     * @param type The GType to look up.
     * @param fallback Optional fallback data to use if no constructor is found.
     * @return A constructor function or `null` if none is found.
     */
    public fun getConstructor(
        type: GType,
        fallback: Fallback? = null
    ): ((gpointer) -> Proxy)? {
        // Direct lookup
        typeRegisterMap[type]?.let { return it.constructor }

        // Attempt parent type if not fundamental
        val parentType = GObject.typeParent(type)
        if (!Types.isFundamental(parentType)) {
            tryConstruct(parentType, fallback?.gType)?.let { constructor ->
                return registerConstructor(type, parentType, constructor)
            }
        }

        // Attempt each interface
        for (iface in typeInterfaces(type)) {
            tryConstruct(iface, fallback?.gType)?.let { constructor ->
                return registerConstructor(type, iface, constructor)
            }
        }

        // Register fallback if present
        fallback?.constructor?.let { constructor ->
            typeRegisterMap[type] = RegisteredConstructor(
                gType = fallback.gType ?: type,
                constructor = constructor,
            )
            return constructor
        }

        // Fallback to fundamental parent's constructor
        return tryConstruct(parentType, null)?.let { constructor ->
            registerConstructor(type, parentType, constructor)
        }
    }

    /**
     * Registers the GType and constructor function for the provided [clazz].
     *
     * @param clazz The Kotlin class implementing [Proxy].
     * @param type The GType this class represents.
     * @param constructor The lambda that instantiates the class from a [gpointer].
     */
    public fun register(
        clazz: KClass<out Proxy>,
        type: GType?,
        constructor: ((gpointer) -> Proxy)?
    ) {
        if (type != null && constructor != null) {
            typeRegisterMap[type] = RegisteredConstructor(type, constructor)
        }
        type?.let { classToTypeMap[clazz] = it }
    }

    /**
     * Retrieves the GType for the provided [clazz].
     *
     * @throws IllegalStateException if the GType is not found.
     */
    public fun getType(clazz: KClass<*>): GType =
        classToTypeMap[clazz] ?: error("Class ${clazz.simpleName} is not a registered GType.")

    /**
     * Clears all cached entries (intended for testing purposes).
     */
    internal fun clearForTest() {
        typeRegisterMap.clear()
        classToTypeMap.clear()
    }

    /**
     * Attempts to retrieve a constructor for [searchType], ensuring compatibility with [expectedBase] if provided.
     *
     * @param searchType The GType to search for.
     * @param expectedBase If non-null, ensures the constructor's GType is a descendant of this base type.
     * @return A constructor function or `null` if none is found or compatible.
     */
    private fun tryConstruct(
        searchType: GType,
        expectedBase: GType?
    ): ((gpointer) -> Proxy)? {
        val registeredConstructor = typeRegisterMap[searchType] ?: return null
        return if (expectedBase == null || GObject.typeIsA(registeredConstructor.gType, expectedBase)) {
            registeredConstructor.constructor
        } else {
            null
        }
    }

    /**
     * Registers a constructor for [type] based on an existing [baseType].
     *
     * @param type The GType to register.
     * @param baseType The base type providing the constructor.
     * @param constructor The constructor function.
     * @return The constructor function.
     */
    private fun registerConstructor(
        type: GType,
        baseType: GType,
        constructor: (gpointer) -> Proxy
    ): (gpointer) -> Proxy {
        typeRegisterMap[baseType]?.let { baseConstructor ->
            typeRegisterMap[type] = baseConstructor
        }
        return constructor
    }

    /**
     * Retrieves the list of interface GTypes for the given [type].
     *
     * @return A list of interface GTypes.
     */
    private fun typeInterfaces(type: GType): List<GType> = memScoped {
        val interfaceCountVar = alloc<UIntVar>()
        val interfacesPointer = g_type_interfaces(type, interfaceCountVar.ptr)

        if (interfacesPointer == null) {
            emptyList()
        } else {
            List(interfaceCountVar.value.toInt()) { index -> interfacesPointer[index] }
                .also { g_free(interfacesPointer) }
        }
    }

    /**
     * Data class containing fallback data for `getConstructor` calls.
     *
     * @property gType The GType of the fallback type.
     * @property constructor The constructor function for the fallback.
     */
    public data class Fallback(
        val gType: GType?,
        val constructor: ((gpointer) -> Proxy)?,
    )

    /**
     * Data class holding the constructor and associated GType for a registered type.
     *
     * @property gType The GType of the registered type.
     * @property constructor The constructor function for the registered type.
     */
    private data class RegisteredConstructor(
        val gType: GType,
        val constructor: (gpointer) -> Proxy,
    )
}
