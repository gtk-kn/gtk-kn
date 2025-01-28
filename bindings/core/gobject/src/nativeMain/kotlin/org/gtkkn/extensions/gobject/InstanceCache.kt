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

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.glib.GLib
import org.gtkkn.bindings.glib.MainContext
import org.gtkkn.bindings.gobject.GObject
import org.gtkkn.bindings.gobject.InitiallyUnowned
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gobject.TypeInstance
import org.gtkkn.extensions.glib.cinterop.Floating
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner.debugLogs
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.glib.collections.ConcurrentMap
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.util.log.LogLevel
import org.gtkkn.extensions.gobject.InstanceCache.Ref.Strong
import org.gtkkn.extensions.gobject.InstanceCache.Ref.Weak
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject._GObject
import org.gtkkn.native.gobject.g_object_add_toggle_ref
import org.gtkkn.native.gobject.g_object_remove_toggle_ref
import org.gtkkn.native.gobject.g_object_unref
import org.gtkkn.native.gobject.gboolean
import org.gtkkn.native.gobject.gpointer
import kotlin.native.internal.NativePtr
import kotlin.native.ref.WeakReference
import kotlin.native.ref.createCleaner

/**
 * Caches [Proxy] objects keyed by their native [gpointer], adding GObject
 * toggle references so the same Kotlin instance is reused for identical
 * underlying native objects.
 */
public object InstanceCache {
    /**
     * Enable/disable debug logs for memory cleanup operations.
     */
    public var debugLogs: Boolean = false

    /**
     * The map of pointer -> reference (weak or strong).
     */
    private val references = ConcurrentMap<gpointer, Ref>()

    /**
     * The GObject "fundamental" GType, used for type checks.
     */
    private val GOBJECT_TYPE: GType = Object.getType()

    /**
     * GObject toggle-notify callback in Kotlin/Native via staticCFunction.
     * We pass null for `data`, so we ignore it.
     */
    private val toggleNotifyCallback = staticCFunction<
        gpointer?, CPointer<_GObject>?, gboolean, Unit,
        > { _, gobjectPtr, isLastRef ->
        if (gobjectPtr != null) {
            handleToggleNotify(gobjectPtr, isLastRef.asBoolean())
        }
    }

    /**
     * Adjust strong/weak references in the cache depending on whether
     * this is the last reference (`isLastRef = true`) on the C side.
     */
    private fun handleToggleNotify(address: gpointer, isLastRef: Boolean) {
        log { "Toggle $address, isLastRef=$isLastRef" }
        references.computeIfPresent(address) { _, ref ->
            if (isLastRef) ref.asWeak() else ref.asStrong()
        }
    }

    /**
     * Looks up the [Proxy] instance corresponding to [address].
     */
    private fun lookup(address: gpointer): Proxy? =
        if (address.rawValue == NativePtr.NULL) null else references[address]?.proxy

    /**
     * Retrieves a [Proxy] for [address]. If not found, a new instance is created
     * using the constructor from [TypeCache], then optionally cached if it is
     * a GObject-based instance.
     *
     * @param address pointer to the native object
     * @param fallback optional fallback constructor if the type is not found
     * @param cache whether to cache the newly-created proxy
     */
    public fun getForType(
        address: gpointer,
        fallback: ((gpointer) -> Proxy)?,
        cache: Boolean
    ): Proxy? {
        // Quick check if address is null or already in the map
        lookup(address)?.let { return it }
        // Look up the constructor via TypeCache
        val ctor = TypeCache.getConstructor(
            address,
            fallback?.let { fb -> TypeCache.Fallback(null, fb) },
        ) ?: return null

        val newInstance = ctor(address)

        // If it's a GObject-based type, store it in the cache
        if (cache &&
            newInstance is TypeInstance &&
            newInstance.gClass?.gType?.let { GObject.typeIsA(it, GOBJECT_TYPE) } == true
        ) {
            return put(newInstance)
        }
        return newInstance
    }

    /**
     * Caches [proxy] at [address]. If it's a floating GObject, sink it; then
     * add a toggle reference, unref once, and register a finalizer that
     * eventually removes the toggle ref from the main context.
     */
    public fun put(proxy: Proxy): Proxy {
        val address: gpointer = proxy.handle
        // If one already exists in the cache, reuse it
        val existing = references.putIfAbsent(address, Strong(proxy))
        if (existing != null) {
            return existing.proxy ?: proxy
        }

        log { "New ${proxy::class.simpleName} $address" }

        // Sink floating references, if necessary
        if (proxy is Floating) {
            proxy.refSink()
        } else if (proxy is InitiallyUnowned) {
            proxy.refSink()
        }

        // Add toggle ref, then unref
        addToggleRef(proxy)
        unref(proxy)

        // Register a finalizer to remove the toggle ref when `obj` is GCed
        createCleaner(address) { rawPtr ->
            // Must remove toggle-ref from the main context
            MainContext.default().invoke {
                removeToggleRef(rawPtr)
            }
        }

        return proxy
    }

    private fun addToggleRef(obj: Proxy) {
        g_object_add_toggle_ref(obj.handle.reinterpret(), toggleNotifyCallback, null)
    }

    private fun unref(obj: Proxy) {
        g_object_unref(obj.handle)
    }

    /**
     * Actually removes the toggle-ref from this GObject pointer and
     * removes the reference from the internal map.
     */
    private fun removeToggleRef(address: gpointer): Boolean {
        log { "Unref $address" }
        g_object_remove_toggle_ref(address.reinterpret(), toggleNotifyCallback, null)
        references.remove(address)
        return GLib.SOURCE_REMOVE
    }

    /**
     * Clears all cached entries (intended for testing purposes).
     */
    internal fun clearForTest() {
        references.clear()
    }

    /**
     * Logs a debug message if [debugLogs] is enabled.
     */
    private inline fun log(
        domain: String? = "InstanceCache",
        level: LogLevel = LogLevel.DEBUG,
        message: () -> String
    ) {
        if (debugLogs) {
            org.gtkkn.extensions.glib.util.log.log(domain, level, message)
        }
    }

    /**
     * [Ref] is either a strong reference ([Strong]) or a weak reference ([Weak])
     * to a [Proxy].
     */
    private sealed class Ref {
        abstract val proxy: Proxy?
        abstract fun asWeak(): Ref
        abstract fun asStrong(): Ref

        data class Strong(override val proxy: Proxy) : Ref() {
            override fun asWeak(): Ref = Weak(WeakReference(proxy))
            override fun asStrong(): Ref = this
        }

        data class Weak(val weakRef: WeakReference<Proxy>) : Ref() {
            override val proxy: Proxy? get() = weakRef.value
            override fun asWeak(): Ref = this
            override fun asStrong(): Ref = Strong(checkNotNull(proxy))
        }
    }
}
