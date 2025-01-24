/*
 * Copyright (c) 2025 gtk-kn
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
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
    private val typeRegister = ConcurrentMap<GType, RegisteredConstructor>()
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
        typeRegister[type]?.let { return it.constructor }

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
            typeRegister[type] = RegisteredConstructor(
                gType = fallback.gType ?: type,
                constructor = constructor
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
            typeRegister[type] = RegisteredConstructor(type, constructor)
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
        typeRegister.clear()
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
        val registeredConstructor = typeRegister[searchType] ?: return null
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
        typeRegister[baseType]?.let { baseConstructor ->
            typeRegister[type] = baseConstructor
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
