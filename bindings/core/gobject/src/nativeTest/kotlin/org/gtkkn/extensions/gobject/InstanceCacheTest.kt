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

import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.ActionEntry
import org.gtkkn.bindings.gio.Menu
import org.gtkkn.bindings.gio.SimpleAction
import org.gtkkn.bindings.glib.VariantType
import org.gtkkn.bindings.gobject.InitiallyUnowned
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.native.gobject.g_object_new
import org.gtkkn.native.gobject.gpointer
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertNotSame
import kotlin.test.assertNull
import kotlin.test.assertSame
import kotlin.test.assertTrue

class InstanceCacheTest {
    @BeforeTest
    fun setUp() {
        InstanceCache.debugLogs = false
        InstanceCache.clearForTest()
        TypeCache.clearForTest()
        TypeCache.register(
            clazz = Object::class,
            type = Object.getType(),
        ) { ptr -> Object(ptr.reinterpret()) }
        TypeCache.register(
            clazz = SimpleAction::class,
            type = SimpleAction.getType(),
        ) { ptr -> SimpleAction(ptr.reinterpret()) }
        TypeCache.register(
            clazz = Menu::class,
            type = Menu.getType(),
        ) { ptr -> Menu(ptr.reinterpret()) }
    }

    @Test
    fun `put returns same instance for same pointer`() {
        // Create a real GObject
        val action = SimpleAction("launch", VariantType("s"))

        // Put it in the cache
        val fromPut = InstanceCache.put(action)
        assertSame(action, fromPut, "put() should return the same instance passed in")

        // Re-putting the same pointer should return the same instance, not override it
        val again = InstanceCache.put(action)
        assertSame(action, again, "Putting the same pointer again should return the same instance")
    }

    @Test
    fun `getForType returns same instance for same pointer when cache is true`() {
        // Create a real GObject
        val menu = Menu()
        val ptr = menu.handle

        // getForType should create and cache the instance
        val instance1 = InstanceCache.getForType(ptr, fallback = { Menu(it.reinterpret()) }, cache = true)
        assertNotNull(instance1, "getForType should return a valid Proxy instance")
        assertEquals(menu, instance1, "Expected the same object (the default GObject binding)")

        // Calling getForType again with the same pointer should return the same instance
        val instance2 = InstanceCache.getForType(ptr, fallback = { Menu(it.reinterpret()) }, cache = true)
        assertSame(instance1, instance2, "Should return the same Kotlin instance from cache")
    }

    @Test
    fun `getForType does not cache non GObject based proxy if cache is true`() {
        assertTrue(true)
        val nonGObjectProxy = NonGObjectProxy()
        // If we do getForType with fallback returning the nonGObjectProxy, it
        // should NOT store it in the cache, since it's not a GObject-based type
        val fallback: (gpointer) -> Proxy = { NonGObjectProxy(it.reinterpret()) }

        // The pointer can be anything non-null for testing
        val testPtr = nonGObjectProxy.handle

        val instance1 = InstanceCache.getForType(testPtr, fallback, cache = true)
        assertNull(instance1, "Fallback should return null for non-GObject proxy")

        // Next call with the same pointer should create a new instance via fallback
        val instance2 = InstanceCache.getForType(testPtr, fallback, cache = true)
        assertNull(instance2, "Non-GObject proxy should not be cached, and null should be returned")
    }

    @Test
    fun `getForType does not cache if cache is false for a GObject based pointer`() {
        val action = SimpleAction("launch", VariantType("s"))
        val ptr = action.handle

        // getForType with cache=false -> not cached
        val instance1 = InstanceCache.getForType(ptr, fallback = { SimpleAction(it.reinterpret()) }, cache = false)
        assertEquals(action, instance1, "We get the same native instance from the default K/N binding")
        assertNotSame(action, instance1, "Expect a new instance each time if not cached")

        // With the same pointer, we get a new instance from getForType again
        val instance2 = InstanceCache.getForType(ptr, fallback = { SimpleAction(it.reinterpret()) }, cache = false)

        assertEquals(instance1, instance2, "We get the same native instance from the default K/N binding")
        assertNotSame(instance1, instance2, "Expect a new instance each time if not cached")
    }

    @Test
    fun `test fallback usage when type not found`() {
        TypeCache.clearForTest()
        var fallbackFuncCallCount = 0

        val action = SimpleAction("launch", VariantType("s"))
        val fallback: (gpointer) -> Proxy = { gpointer ->
            fallbackFuncCallCount++
            SimpleAction(gpointer.reinterpret())
        }

        val testPtr = action.handle

        // Force the TypeCache to always return null, forcing fallback
        TypeCache.clearForTest()
        // Should execute the fallback because getConstructor returned null
        val fromGet = InstanceCache.getForType(testPtr, fallback = fallback, cache = true)
        assertEquals(action, fromGet, "We get the same native instance from the default K/N binding")
        assertNotSame(action, fromGet, "Expect a new instance each time if not cached")
        assertEquals(1, fallbackFuncCallCount, "We expect the fallbackFuncCallCount to be exactly 1")
    }

    @Test
    fun `test initially unowned object calls refSink`() {
        val unownedObj = FakeInitiallyUnownedObject()
        assertEquals(0, unownedObj.refSinkCalledCount)

        InstanceCache.put(unownedObj)
        assertEquals(1, unownedObj.refSinkCalledCount, "refSink() must be called for InitiallyUnowned object")
    }

    @Test
    fun `test same pointer returns same instance after put`() {
        // Manually put a new Proxy instance in the cache
        val action = SimpleAction("launch", VariantType("s"))
        val address = action.handle

        // put() it
        InstanceCache.put(action)

        // Next time we do getForType with the same pointer, we should get the same instance
        val fromGet = InstanceCache.getForType(address, fallback = null, cache = true)
        assertSame(action, fromGet, "Should retrieve the same instance from the cache")
    }
}

/**
 * A fake 'initially unowned' GObject that tracks `refSink()` calls.
 */
private class FakeInitiallyUnownedObject :
    InitiallyUnowned(g_object_new(Object.getType(), "first_property")!!.reinterpret()), Proxy {
    var refSinkCalledCount = 0
    override fun refSink(): Object {
        refSinkCalledCount++
        return super.refSink()
    }
}

private typealias NonGObjectProxy = ActionEntry
