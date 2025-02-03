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

package org.gtkkn.extensions.gobject.ext

import org.gtkkn.bindings.gio.Menu
import org.gtkkn.bindings.gobject.GObject
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gobject.ParamFlags
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.native.gobject.g_object_new
import org.gtkkn.native.gobject.g_object_unref
import kotlin.native.internal.performGCOnCleanerWorker
import kotlin.native.runtime.GC
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

/**
 * Unit tests for `isGObject()` and `isGParam()` extension functions.
 *
 * These tests ensure that various `gpointer` instances are correctly recognized as
 * GObject and GParam types based on their actual memory allocations.
 */
class GpointerExtTest {
    @BeforeTest
    fun setUp() {
        // Ensure a clean test environment
        GC.collect()
        performGCOnCleanerWorker()
        // Clear caches
        InstanceCache.clearForTest()
    }

    @Test
    fun `GObject instance should be recognized as GObject`() {
        val gObject = g_object_new(Object.getType(), null)!!
        assertTrue(gObject.isGObject(), "Expected a valid GObject instance.")
        g_object_unref(gObject)
    }

    @Test
    fun `GObject GMenu should be recognized as GObject`() {
        val gMenuPointer = Menu().handle
        assertTrue(gMenuPointer.isGObject(), "Expected GMenu to be recognized as a GObject.")
    }

    @Test
    fun `GObject instance should not be recognized as GParam`() {
        val gObject = g_object_new(Object.getType(), null)!!
        assertFalse(gObject.isGParam(), "Expected a GObject instance to NOT be recognized as GParam.")
        g_object_unref(gObject)
    }

    @Test
    fun `GParamSpec should be recognized as GParam`() {
        val gParamPointer = createParamSpec().handle
        assertTrue(gParamPointer.isGParam(), "Expected GParamSpec to be recognized as a GParam instance.")
    }

    @Test
    fun `GParamSpec should not be recognized as GObject`() {
        val gParamPointer = createParamSpec().handle
        assertFalse(gParamPointer.isGObject(), "Expected GParamSpec to NOT be recognized as a GObject.")
    }

    private fun createParamSpec() = GObject.paramSpecInt(
        name = "my-property",
        nick = "My Property",
        blurb = "An example integer property",
        minimum = 0,
        maximum = 100,
        defaultValue = 50,
        flags = ParamFlags.READWRITE,
    )
}
