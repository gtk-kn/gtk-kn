/*
 * Copyright (c) 2023 gtk-kn
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

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.ObjectSubclassCompanion
import org.gtkkn.native.gobject.g_type_from_name
import org.gtkkn.native.gobject.g_type_name_from_instance
import kotlin.test.Test
import kotlin.test.assertEquals

class SubclassingTests {

    @Test
    fun testSubclassTypeRegistration() {
        val object1 = TestObject1()

        val typeName = g_type_name_from_instance(object1.gPointer.reinterpret())?.toKString()
        assertEquals("TestObject1", typeName)
        val gType = g_type_from_name(typeName)
        assertEquals(TestObject1.gType, gType)
    }

    @Test
    fun testMultiLevelSubclassTypeRegistration() {
        val object2 = TestObject2()
        val typeName = g_type_name_from_instance(object2.gPointer.reinterpret())?.toKString()
        assertEquals("TestObject2", typeName)
        val gType = g_type_from_name(typeName)
        assertEquals(TestObject2.gType, gType)
    }

}

private open class TestObject1(pointer: CPointer<CPointed>) : Object(pointer.reinterpret()) {

    constructor() : this(newInstancePointer())

    companion object : ObjectSubclassCompanion<TestObject1>(
        "TestObject1", Object.type,
    )
}

private class TestObject2 : TestObject1(newInstancePointer()) {
    companion object : ObjectSubclassCompanion<TestObject2>(
        "TestObject2", TestObject1.type,
    )
}
