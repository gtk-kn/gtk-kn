/*
 * Copyright (c) 2024 gtk-kn
 *
 * This file is part of gtk-kn.
 * gtk-kn is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * gtk-kn is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with gtk-kn. If not, see https://www.gnu.org/licenses/.
 */

package org.gtkkn.extensions.gobject

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.native.gobject.g_type_from_name
import org.gtkkn.native.gobject.g_type_name_from_instance
import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * Unit tests for verifying subclassing and type registration functionality.
 */
class SubclassingTests {
    /**
     * Test that a single-level subclass type is registered correctly with the GObject type system.
     */
    @Test
    fun `single-level subclass type is registered correctly`() {
        val object1 = TestObject1()

        // Verify type name from GObject system
        val typeName = g_type_name_from_instance(object1.gobjectObjectPointer.reinterpret())?.toKString()
        assertEquals("TestObject1", typeName, "Type name should match TestObject1.")

        // Verify GType from name matches the registered GType
        val gType = g_type_from_name(typeName)
        assertEquals(TestObject1.gType, gType, "GType should match TestObject1's registered GType.")
    }

    /**
     * Test that a multi-level subclass type is registered correctly with the GObject type system.
     */
    @Test
    fun `multi-level subclass type is registered correctly`() {
        val object2 = TestObject2()

        // Verify type name from GObject system
        val typeName = g_type_name_from_instance(object2.gobjectObjectPointer.reinterpret())?.toKString()
        assertEquals("TestObject2", typeName, "Type name should match TestObject2.")

        // Verify GType from name matches the registered GType
        val gType = g_type_from_name(typeName)
        assertEquals(TestObject2.gType, gType, "GType should match TestObject2's registered GType.")
    }
}

/**
 * A test class for verifying single-level subclassing in GObject.
 */
private open class TestObject1(pointer: CPointer<CPointed>) : Object(pointer.reinterpret()) {
    /**
     * Primary constructor for creating a new instance.
     */
    constructor() : this(newInstancePointer())

    companion object : ObjectType<TestObject1>(
        typeClass = TestObject1::class,
        parentType = Object.type,
    )
}

/**
 * A test class for verifying multi-level subclassing in GObject.
 */
private class TestObject2 : TestObject1(newInstancePointer()) {
    companion object : ObjectType<TestObject2>(
        typeClass = TestObject2::class,
        parentType = TestObject1.type,
    )
}
