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

import kotlinx.cinterop.CValuesRef
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.ActionEntry
import org.gtkkn.bindings.gio.Menu
import org.gtkkn.bindings.gio.SimpleAction
import org.gtkkn.bindings.glib.VariantType
import org.gtkkn.bindings.gobject.InitiallyUnowned
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.native.gio.g_simple_action_new
import org.gtkkn.native.gobject.GObject
import org.gtkkn.native.gobject.GToggleNotify
import org.gtkkn.native.gobject.g_object_add_toggle_ref
import org.gtkkn.native.gobject.g_object_new
import org.gtkkn.native.gobject.g_object_remove_toggle_ref
import org.gtkkn.native.gobject.g_object_unref
import org.gtkkn.native.gobject.gpointer
import org.gtkkn.native.gobject.guint
import kotlin.native.concurrent.ObsoleteWorkersApi
import kotlin.native.concurrent.TransferMode
import kotlin.native.concurrent.Worker
import kotlin.native.internal.performGCOnCleanerWorker
import kotlin.native.ref.WeakReference
import kotlin.native.runtime.GC
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertIs
import kotlin.test.assertNotNull
import kotlin.test.assertNotSame
import kotlin.test.assertNull
import kotlin.test.assertSame
import kotlin.test.assertTrue

/**
 * This class provides unit tests for the `InstanceCache` object.
 *
 * The purpose of these tests is to verify that the caching and lifecycle management
 * of GObject instances in Kotlin/Native is implemented correctly.
 *
 * ### **Tested Features:**
 *
 * - Ensuring that `InstanceCache` returns the same instance for the same pointer.
 * - Verifying the toggle reference mechanism works correctly.
 * - Ensuring weak and strong references are correctly handled.
 * - Testing behavior when caching is disabled.
 * - Ensuring garbage collection properly removes objects from the cache.
 * - Verifying that floating references are correctly handled via `refSink()`.
 *
 * ### **Key Concepts:**
 *
 * - **Toggle References:** Used to manage GObject lifecycle between Kotlin and native code.
 * - **Reference Switching:** Ensures that objects are cached using **strong**
 *   or **weak** references based on their usage.
 * - **Garbage Collection:** Uses `GC.collect()` and `performGCOnCleanerWorker()` to verify object cleanup.
 */
@OptIn(ObsoleteWorkersApi::class)
class InstanceCacheTest {
    @BeforeTest
    fun setUp() {
        // Ensure a clean test environment
        GC.collect()
        performGCOnCleanerWorker()

        // Use the mock implementation to track calls instead of performing real native operations
        InstanceCache.nativeFunctions = TestGObject

        // Reset reference counters
        addToggleRefCount = 0
        removeToggleRefCount = 0
        unrefCount = 0

        // Clear caches
        InstanceCache.clearForTest()
        TypeCache.clearForTest()

        // Register test object types
        TypeCache.register(clazz = Object::class, type = Object.getType()) { ptr -> Object(ptr.reinterpret()) }
        TypeCache.register(
            clazz = SimpleAction::class,
            type = SimpleAction.getType(),
        ) { ptr -> SimpleAction(ptr.reinterpret()) }
        TypeCache.register(clazz = Menu::class, type = Menu.getType()) { ptr -> Menu(ptr.reinterpret()) }
    }

    /**
     * Ensures that `put()` caches and returns the same instance for the same pointer.
     */
    @Test
    fun `put caches and returns the same instance for the same pointer`() {
        // Arrange
        val action = createSimpleAction()

        // Act
        val cachedInstance1 = InstanceCache.put(action)
        val cachedInstance2 = InstanceCache.put(action)

        // Assert
        assertSame(action, cachedInstance1, "put() should return the same instance passed in")
        assertSame(
            action,
            cachedInstance2,
            "Calling put() again with the same pointer should return the cached instance",
        )
    }

    /**
     * Ensures that `get()` caches and returns the same instance when caching is enabled.
     */
    @Test
    fun `get caches and returns the same instance when caching is enabled`() {
        // Arrange
        val menu = Menu()
        val objectHandle = menu.handle

        // Act
        val instance1 = InstanceCache.get(objectHandle, cache = true) { Menu(it.reinterpret()) }
        val instance2 = InstanceCache.get(objectHandle, cache = true) { Menu(it.reinterpret()) }

        // Assert
        assertIs<Menu>(instance1)
        assertSame(instance1, instance2, "get() should return the same instance from cache")
    }

    /**
     * Ensures that `InstanceCache.put()` throws an `IllegalArgumentException`
     * when attempting to cache a non-GObject instance.
     */
    @Test
    fun `put throws IllegalArgumentException when caching a non-GObject instance`() {
        // Arrange
        val nonGObjectProxy = NonGObjectProxy()

        // Act & Assert
        val exception = assertFailsWith<IllegalArgumentException> {
            InstanceCache.put(nonGObjectProxy)
        }

        // Ensure the exception message is meaningful (optional but useful for debugging)
        assertTrue(
            exception.message?.contains("Expected a GObject-based instance") == true,
            "Exception message should indicate that a non-GObject instance was provided",
        )
    }

    /**
     * Ensures that `InstanceCache.get()` throws an `IllegalArgumentException`
     * when attempting to retrieve a non-GObject instance.
     */
    @Test
    fun `get throws IllegalArgumentException when retrieving a non-GObject instance`() {
        // Arrange
        val nonGObjectProxy = NonGObjectProxy()
        val objectHandle = nonGObjectProxy.handle
        val fallback: (gpointer) -> Proxy = { NonGObjectProxy(it.reinterpret()) }

        // Act & Assert
        val exception = assertFailsWith<IllegalArgumentException> {
            InstanceCache.get(objectHandle, cache = true, fallback = fallback)
        }

        // Ensure exception message is meaningful (optional, but useful for debugging)
        assertTrue(
            exception.message?.contains("Expected a GObject-based instance") == true,
            "Exception message should indicate that a non-GObject instance was provided",
        )
    }

    /**
     * Ensures that `get()` does not cache instances when `cache = false`
     * for a GObject-based pointer, always returning a new instance.
     */
    @Test
    fun `get does not cache GObject-based pointer when caching is disabled`() {
        // Arrange
        val action = createSimpleAction()
        val ptr = action.handle
        val fallback: (gpointer) -> Proxy = { SimpleAction(it.reinterpret()) }

        // Act
        val instance1 = InstanceCache.get(ptr, fallback = fallback, cache = false)
        val instance2 = InstanceCache.get(ptr, fallback = fallback, cache = false)

        // Assert
        assertIs<SimpleAction>(instance1)
        assertEquals(action, instance1, "We get the same native instance from the default K/N binding")
        assertNotSame(action, instance1, "Expect a new instance each time if not cached")
        assertIs<SimpleAction>(instance2)
        assertEquals(instance1, instance2, "We get the same native instance from the default K/N binding")
        assertNotSame(instance1, instance2, "Expect a new instance each time if not cached")
    }

    /**
     * Ensures that `get()` correctly falls back to the provided constructor when the type is not found.
     */
    @Test
    fun `get falls back to provided constructor when type is not found`() {
        // Arrange
        TypeCache.clearForTest()
        var fallbackInvocationCount = 0
        val action = createSimpleAction()
        val objectHandle = action.handle

        val fallback: (gpointer) -> Proxy = { ptr ->
            fallbackInvocationCount++
            SimpleAction(ptr.reinterpret())
        }

        // Act
        val fallbackInstance = InstanceCache.get(objectHandle, fallback = fallback, cache = true)
        // Force the TypeCache to always return null, forcing fallback
        TypeCache.clearForTest()

        // Assert
        assertIs<SimpleAction>(fallbackInstance)
        assertEquals(action, fallbackInstance, "Expected a new instance from fallback")
        assertNotSame(action, fallbackInstance, "Fallback should return a fresh instance, not reuse an existing one")
        assertEquals(1, fallbackInvocationCount, "Fallback constructor should be invoked exactly once")
    }

    /**
     * Ensures that `InstanceCache` correctly calls `refSink()` for initially unowned objects.
     */
    @Test
    fun `InstanceCache calls refSink for InitiallyUnowned objects`() {
        // Arrange
        val unownedObj = FakeInitiallyUnownedObject()
        assertEquals(0, unownedObj.refSinkCalledCount)

        // Act
        InstanceCache.put(unownedObj)

        // Assert
        assertEquals(1, unownedObj.refSinkCalledCount, "refSink() must be called for InitiallyUnowned object")
        assertEquals(1, addToggleRefCount, "put() should be adding a toggle ref on the object exactly once")
        assertEquals(0, removeToggleRefCount, "put() should not call remove a toggle ref")
        assertEquals(1, unrefCount, "put() should unref the object exactly once after adding a toggle ref")
    }

    /**
     * Ensures that `get()` does not cache instances when `cache = false`
     */
    @Test
    fun `InstanceCache retrieves the same instance after put`() {
        // Arrange
        val action = createSimpleAction()
        val address = action.handle

        // Act
        InstanceCache.put(action)
        val fromGet: SimpleAction? = InstanceCache.get(address, fallback = null, cache = true)

        // Assert
        assertSame(action, fromGet, "Should retrieve the same instance from the cache")
        assertIs<SimpleAction>(fromGet)
        assertEquals(1u, fromGet.gobjectObjectPointer.pointed.ref_count, "ref_count should be 1")
        assertEquals(1, addToggleRefCount, "put() should be adding a toggle ref on the object exactly once")
        assertEquals(0, removeToggleRefCount, "put() should not call remove a toggle ref")
        assertEquals(1, unrefCount, "put() should unref the object exactly once after adding a toggle ref")
    }

    @Test
    fun `verify reference count changes after put`() {
        // Arrange
        val action = createSimpleAction()
        val initialRefCount = action.gobjectObjectPointer.pointed.ref_count
        assertEquals(1u, initialRefCount, "Expected 1 ref initially")

        // Act
        InstanceCache.put(action)

        // The GObject add_toggle_ref increments the ref count by 1,
        // then InstanceCache calls unref() once, which decrements it by 1,
        // so net effect on ref_count is 0 for many GObjects that start with a normal ref.
        val refCountAfterPut = action.gobjectObjectPointer.pointed.ref_count

        // Assert
        assertEquals(
            initialRefCount,
            refCountAfterPut,
            "Net effect on reference count should be zero after toggle-ref + unref in put().",
        )

        // Also check that our mock functions were invoked correctly
        assertEquals(1, addToggleRefCount, "put() should be adding a toggle ref on the object exactly once")
        assertEquals(0, removeToggleRefCount, "put() should not call remove a toggle ref")
        assertEquals(1, unrefCount, "put() should unref the object exactly once after adding a toggle ref")
    }

    /**
     * Ensures that `InstanceCache` correctly removes the toggle reference
     * when the object is garbage collected.
     */
    @Test
    fun `finalizer removes toggle reference when object is garbage collected`() {
        // Arrange
        var weakReference: WeakReference<SimpleAction>? = null

        // Wrapping lambda to ensure `action` goes out of scope
        {
            val action = createSimpleAction()
            // Put the object in InstanceCache, which adds a toggle ref without changing the ref_count
            InstanceCache.put(action)
            weakReference = WeakReference(action)
            // We don't hold any strong reference to `action` beyond this block
        }()

        // Act
        GC.collect()
        performGCOnCleanerWorker()

        // Assert
        assertNull(weakReference?.value, "SimpleAction should have been collected")
        assertEquals(1, removeToggleRefCount, "Expected exactly one removeToggleRef call after GC")
    }

    /**
     * Ensures that the finalizer does not remove the toggle reference
     * if the object's reference count is greater than 1.
     */
    @Test
    fun `finalizer is not called when object reference count is greater than 1`() {
        // Arrange
        var weakReference: WeakReference<SimpleAction>? = null
        var objectHandle: gpointer? = null

        // Wrapping lambda to ensure `action` goes out of scope
        {
            val action = createSimpleAction()
            objectHandle = action.handle
            // Put the object in InstanceCache, which adds a toggle ref without changing the ref_count
            InstanceCache.put(action)
            action.ref()
            weakReference = WeakReference(action)
            // We don't hold any strong reference to `action` beyond this block
        }()

        // Act
        GC.collect()
        performGCOnCleanerWorker()

        // Assert
        assertNotNull(weakReference?.value, "Object should not have been garbage collected")
        assertEquals(0, removeToggleRefCount, "Expected no removeToggleRef call after GC")

        g_object_unref(objectHandle)
    }

    /**
     * Ensures that the finalizer does not remove the toggle reference
     * if the object still has a strong reference elsewhere.
     */
    @Test
    fun `finalizer is not called when a strong reference to the object still exists`() {
        // Arrange
        var strongReference: SimpleAction? = null

        // Wrapping lambda to ensure `action` goes out of scope
        {
            val action = createSimpleAction()
            // Put the object in InstanceCache, which adds a toggle ref without changing the ref_count
            InstanceCache.put(action)
            action.ref()
            strongReference = action
            // We don't hold any strong reference to `action` beyond this block
        }()

        // Act
        GC.collect()
        performGCOnCleanerWorker()

        // Assert
        assertNotNull(strongReference, "Object should not have been garbage collected")
        assertEquals(0, removeToggleRefCount, "Expected no removeToggleRef call after GC")

        g_object_unref(strongReference!!.handle)
    }

    /**
     * Ensures that `InstanceCache` removes the toggle reference only
     * when the object has no strong references and the reference count is less than 2.
     */
    @Test
    fun `finalizer removes toggle reference once object has no strong references and reference count is below 2`() {
        // Arrange
        var weakReference: WeakReference<SimpleAction>? = null
        var objectHandle: gpointer? = null
        var refCountBeforeUnref: guint = 0u

        {
            val action = createSimpleAction()
            objectHandle = action.handle
            // Put the object in InstanceCache, which adds a toggle ref without changing the ref_count
            InstanceCache.put(action)
            action.ref()
            weakReference = WeakReference(action)
            refCountBeforeUnref = weakReference!!.value!!.gobjectObjectPointer.pointed.ref_count
            // We don't hold any strong reference to `action` beyond this block
        }()

        // Manually unref one reference
        g_object_unref(objectHandle)

        // Act
        GC.collect()
        performGCOnCleanerWorker()
        InstanceCache.logCacheContent()
        // Assert
        assertEquals(2u, refCountBeforeUnref, "Expected ref count to be 2 before unref")
        assertNull(weakReference?.value, "SimpleAction should have been collected")
        assertEquals(1, removeToggleRefCount, "Expected exactly one removeToggleRef call after GC")
    }

    /**
     * Ensures that manually calling `ref()` and `unref()` around `InstanceCache` usage
     * does not cause unexpected changes in the reference count.
     */
    @Test
    fun `manual ref and unref do not affect final reference count after put`() {
        // Arrange
        val action = SimpleAction("launch", VariantType("s"))
        val initialRefCount = 1u

        // Manually ref() the object
        action.ref()
        InstanceCache.put(action)
        action.unref()
        val finalRefCount = action.gobjectObjectPointer.pointed.ref_count

        // Assert
        assertEquals(
            initialRefCount,
            finalRefCount,
            "Reference count should return to initial state after manual ref/unref",
        )
    }

    /**
     * Ensures that multiple concurrent calls to `InstanceCache.get(...)` on the same pointer
     * result in only **one shared instance** in the cache.
     *
     * - Multiple worker threads simulate concurrent access.
     * - Each thread repeatedly retrieves the same pointer's instance.
     * - All threads must receive the same instance.
     */
    @Test
    fun `concurrent access to InstanceCache returns single instance per pointer`() {
        // Arrange
        val gobjectPtr = g_object_new(Object.getType(), null)!!
        val threadCount = 50  // Number of concurrent workers
        val workers = List(threadCount) { Worker.start() }
        val instance = mutableListOf<Object>()

        // Act
        val futures = workers.map { worker ->
            worker.execute(
                mode = TransferMode.SAFE,
                producer = { gobjectPtr },
            ) { ptr ->
                // Each worker thread calls `InstanceCache.get` with the same pointer
                InstanceCache.get<Object>(address = ptr, fallback = null, cache = true)!!
            }
        }

        // Collect results and clean up workers
        futures.forEach { future -> instance += future.result }
        workers.forEach { it.requestTermination().result }

        // Assert
        val expected = instance.first()
        instance.forEach { assertSame(expected, it, "All threads must return the same GObject instance.") }
    }

    private fun createSimpleAction() =
        SimpleAction(g_simple_action_new("launch", VariantType("s").glibVariantTypePointer)!!)

    /**
     * Companion object containing mock implementations and test utilities.
     */
    companion object {
        var addToggleRefCount = 0
        var removeToggleRefCount = 0
        var unrefCount = 0

        /**
         * Mock implementation of native functions for testing.
         */
        object TestGObject : InstanceCache.NativeFunctions {
            override fun gObjectAddToggleRef(`object`: CValuesRef<GObject>?, notify: GToggleNotify?, data: gpointer?) {
                addToggleRefCount++
                g_object_add_toggle_ref(`object`, notify, data)
            }

            override fun gObjectRemoveToggleRef(
                `object`: CValuesRef<GObject>?,
                notify: GToggleNotify?,
                data: gpointer?
            ) {
                removeToggleRefCount++
                g_object_remove_toggle_ref(`object`, notify, data)
            }

            override fun gObjectUnref(`object`: gpointer) {
                unrefCount++
                g_object_unref(`object`)
            }
        }

        /**
         * Fake `InitiallyUnowned` GObject that tracks `refSink()` calls.
         */
        private class FakeInitiallyUnownedObject :
            InitiallyUnowned(g_object_new(Object.getType(), null)!!.reinterpret()), Proxy {
            var refSinkCalledCount = 0
            override fun refSink(): Object {
                refSinkCalledCount++
                return super.refSink()
            }
        }
    }
}

private typealias NonGObjectProxy = ActionEntry
