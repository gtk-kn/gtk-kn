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
import kotlinx.cinterop.CValuesRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.glib.GLib
import org.gtkkn.bindings.glib.MainContext
import org.gtkkn.bindings.gobject.InitiallyUnowned
import org.gtkkn.bindings.gobject.ParamSpec
import org.gtkkn.bindings.gobject.TypeInstance
import org.gtkkn.extensions.GtkKn
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.glib.collections.ConcurrentMap
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.util.log.LogLevel
import org.gtkkn.extensions.gobject.InstanceCache.Ref.Strong
import org.gtkkn.extensions.gobject.ext.isGObject
import org.gtkkn.native.gobject.GToggleNotify
import org.gtkkn.native.gobject._GObject
import org.gtkkn.native.gobject.g_object_add_toggle_ref
import org.gtkkn.native.gobject.g_object_remove_toggle_ref
import org.gtkkn.native.gobject.g_object_unref
import org.gtkkn.native.gobject.gboolean
import org.gtkkn.native.gobject.gpointer
import kotlin.native.internal.NativePtr
import kotlin.native.ref.WeakReference
import kotlin.native.ref.createCleaner

/*
 * Portions of this class are inspired by the open-source project Java-GI.
 * Original source: https://github.com/jwharm/java-gi/
 */
/**
 * A singleton object responsible for caching and managing [Proxy] instances associated with native GObject pointers.
 *
 * ### **How It Works**
 * - Uses **toggle references** to track Kotlin/Native-to-GObject bindings.
 * - Ensures that each GObject is associated with **only one Kotlin instance**.
 * - Eliminates the need for manual `g_object_ref()` and `g_object_unref()` calls in Kotlin.
 * - Uses a **global cache** of objects, switching between strong and weak references.
 * - Ensures safe disposal when objects are no longer needed.
 *
 * ### **Instance Cache**
 * - Maintains a **global map** (`references`) of all GObjects used in Kotlin.
 * - Each GObject is stored using either a **strong** or **weak** reference:
 *   - **Strong reference**: Prevents GC and ensures the instance stays alive.
 *   - **Weak reference**: Allows GC when the object is no longer used.
 *
 * ### **Toggle References**
 * GObjects are reference-counted. Normally, objects are explicitly `g_object_ref()` and `g_object_unref()`.
 * However, **toggle references** automate this:
 * - If the **toggle reference becomes the last reference**, the cache switches to **weak**.
 * - If other references appear, the cache switches back to **strong**.
 * - This prevents memory leaks while ensuring the instance is reusable.
 *
 * Toggle references are added like this:
 * ```c
 * g_object_add_toggle_ref(obj, toggle_notify_cb, NULL);
 * g_object_unref(obj);
 * ```
 *
 * ### **Garbage Collection & Cleaners**
 * - When an instance is GC'ed, a **Cleaner** calls `g_object_remove_toggle_ref()`.
 * - This reduces the reference count to 0, ensuring safe disposal.
 *
 * ### **Floating References**
 * - Some GObjects (e.g., `GInitiallyUnowned`) have **floating references**.
 * - Floating references **must be "sunk"** (`refSink()`) to ensure correct ownership.
 * - `InstanceCache` **automatically sinks** floating references.
 */
public object InstanceCache {
    /**
     * Interface for native function calls.
     *
     * The default implementation is [NativeFunctionsImpl], but a mock can be used for testing.
     */
    internal var nativeFunctions: NativeFunctions = NativeFunctionsImpl

    /** Cache mapping native pointers ([gpointer]) to references (strong or weak). */
    private val references = ConcurrentMap<gpointer, Ref<out Proxy>>()

    /**
     * Callback function for GObject's toggle references.
     *
     * This function is executed when the last reference is dropped (or added back).
     */
    private val toggleNotifyCallback =
        staticCFunction<gpointer?, CPointer<_GObject>?, gboolean, Unit> { _, gobjectPtr, isLastRef ->
            gobjectPtr?.let { handleToggleNotify(it, isLastRef.asBoolean()) }
        }

    /**
     * Retrieves a [T] instance for the given [gpointer].
     *
     * - If the instance exists in the cache, it is returned.
     * - Otherwise, a new instance is created via [TypeCache].
     * - If the object is a GObject, it is stored in the cache.
     *
     * @param T The expected type of the retrieved instance, which must extend [Proxy].
     * @param address Pointer to the native object.
     * @param cache If `true`, the new instance will be cached if applicable.
     * @param fallback Optional constructor if the type is unknown.
     * @return The retrieved or newly created instance of [T], or `null` if the type is unknown.
     */
    public fun <T : Proxy> get(
        address: gpointer,
        cache: Boolean,
        fallback: ((gpointer) -> T)?
    ): T? {
        require(address.isGObject()) { "Expected a GObject-based instance" }
        @Suppress("UNCHECKED_CAST")
        references[address]?.proxy
            .takeIf { address.rawValue != NativePtr.NULL }
            ?.let { return it as? T }

        val constructor = TypeCache.getConstructor(
            address,
            fallback?.let { fb -> TypeCache.Fallback(null, fb) },
        ) ?: return null

        val newInstance = constructor(address)

        // If it's a GObject-based type, store it in the cache
        return if (cache &&
            newInstance is TypeInstance &&
            newInstance.handle.isGObject()
        ) {
            put(newInstance)
        } else {
            newInstance
        }
    }

    /**
     * Adds a [T] instance to the cache and attaches a toggle reference.
     *
     * - If the object is floating, it is sunk (`refSink()`).
     * - A **toggle reference** is added and the object is **unreferenced**.
     * - A **Cleaner** ensures proper removal when the object is GC'ed.
     *
     * @param T The type of the instance being cached.
     * @param proxy The instance to be cached.
     * @return The existing or newly added instance.
     */
    public fun <T : Proxy> put(proxy: T): T {
        val address: gpointer = proxy.handle
        require(address.isGObject()) { "Expected a GObject-based instance" }

        @Suppress("UNCHECKED_CAST")
        references.putIfAbsent(address, Strong(proxy))?.proxy?.let { return it as T }

        log { "Caching instance: ${proxy.getSimpleNameWithHandle()}" }

        // Sink floating references, if necessary
        if (proxy is ParamSpec) {
            proxy.refSink()
        } else if (proxy is InitiallyUnowned) {
            proxy.refSink()
        }

        // Add toggle ref, which increases the ref_count, then unref, to restore the original ref_count value
        nativeFunctions.gObjectAddToggleRef(proxy.handle.reinterpret(), toggleNotifyCallback, null)
        nativeFunctions.gObjectUnref(proxy.handle)

        // Register a finalizer to remove the toggle ref when `proxy` is garbage collected.
        // The cleaner must be stored inside `proxy` to prevent premature execution, ensuring
        // that the toggle reference is only removed when `proxy` is truly no longer reachable.
        val cleaner = createCleaner(address) { MainContext.default().invoke { removeToggleRef(it) } }
        proxy.addCleaner(cleaner)

        return proxy
    }

    /**
     * Logs the current content of the instance cache.
     *
     * - Displays the number of cached entries.
     * - Shows each entry with its handle and reference type (Strong/Weak).
     */
    public fun logCacheContent() {
        log { "InstanceCache contains ${references.size} entries:" }
        var index = 0
        references.forEach { (ptr, ref) -> log { "[${index++}] $ptr [$ref]" } }
    }

    /**
     * Handles toggle reference notifications, switching between strong and weak references.
     */
    private fun handleToggleNotify(address: gpointer, isLastRef: Boolean) {
        log {
            val proxyName = references[address]?.proxy?.getSimpleNameWithHandle() ?: address
            "Toggle notify for $proxyName, isLastRef=$isLastRef"
        }
        references.computeIfPresent(address) { _, ref ->
            when (isLastRef) {
                true -> ref.asWeak()
                false -> ref.asStrong()
            }
        }
    }

    /**
     * Removes the toggle-ref from this GObject pointer and
     * removes the reference from the internal map.
     */
    private fun removeToggleRef(address: gpointer): Boolean {
        log { "Removing toggle reference for ${references[address]?.proxy?.getSimpleNameWithHandle() ?: address}" }
        nativeFunctions.gObjectRemoveToggleRef(address.reinterpret(), toggleNotifyCallback, null)
        references.remove(address)
        return GLib.SOURCE_REMOVE
    }

    /**
     * Clears all cached entries (intended for testing purposes).
     */
    internal fun clearForTest() {
        log { "Clearing cache for testing purposes" }
        references.clear()
    }

    /**
     * Logs a debug message if [debugLogs] is enabled.
     */
    private inline fun log(
        domain: String = "InstanceCache",
        level: LogLevel = LogLevel.DEBUG,
        message: () -> String
    ) {
        if (GtkKn.debugLogs) {
            org.gtkkn.extensions.glib.util.log.log(domain, level, message)
        }
    }

    /**
     * Represents a reference to a cached instance, which can be either strong or weak.
     */
    internal sealed interface Ref<T : Proxy> {
        val proxy: T?
        fun asWeak(): Ref<T>
        fun asStrong(): Ref<T>

        data class Strong<T : Proxy>(override val proxy: T) : Ref<T> {
            override fun asWeak(): Ref<T> = Weak(WeakReference(proxy))
            override fun asStrong(): Ref<T> = this
        }

        data class Weak<T : Proxy>(private val weakRef: WeakReference<T>) : Ref<T> {
            override val proxy: T? get() = weakRef.value
            override fun asWeak(): Ref<T> = this
            override fun asStrong(): Ref<T> = Strong(checkNotNull(proxy))
        }
    }

    /**
     * Interface for native cleanup functions.
     *
     * This interface abstracts native function calls to allow for dependency injection during testing.
     *
     * - **In Testing:** A mock implementation (`TestGObject`) replaces the default
     *   `NativeFunctionsImpl` to track calls.
     * - **In Production:** The `NativeFunctionsImpl` provides the real implementation,
     *   invoking actual native cleanup functions.
     */
    internal interface NativeFunctions {
        fun gObjectAddToggleRef(
            `object`: CValuesRef<org.gtkkn.native.gobject.GObject>?,
            notify: GToggleNotify?,
            data: gpointer?
        )

        fun gObjectRemoveToggleRef(
            `object`: CValuesRef<org.gtkkn.native.gobject.GObject>?,
            notify: GToggleNotify?,
            data: gpointer?
        )

        fun gObjectUnref(`object`: gpointer)
    }

    /**
     * Default implementation of native cleanup functions for production use.
     */
    public object NativeFunctionsImpl : NativeFunctions {
        override fun gObjectAddToggleRef(
            `object`: CValuesRef<org.gtkkn.native.gobject.GObject>?,
            notify: GToggleNotify?,
            data: gpointer?
        ) {
            g_object_add_toggle_ref(`object`, notify, data)
        }

        override fun gObjectRemoveToggleRef(
            `object`: CValuesRef<org.gtkkn.native.gobject.GObject>?,
            notify: GToggleNotify?,
            data: gpointer?
        ) {
            g_object_remove_toggle_ref(`object`, notify, data)
        }

        override fun gObjectUnref(`object`: gpointer) {
            g_object_unref(`object`)
        }
    }
}
