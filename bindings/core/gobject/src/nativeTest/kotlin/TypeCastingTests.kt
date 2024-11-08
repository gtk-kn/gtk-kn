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

import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.ObjectType
import org.gtkkn.extensions.gobject.asType
import kotlin.test.Test
import kotlin.test.assertEquals

class TypeCastingTests {

    @Test
    fun testAsType() {
        val obj1 = MyObject("object1")
        val erasedAsObject = obj1.asType<Object>()
        val inflatedObject = erasedAsObject.asType<MyObject>()
        assertEquals(obj1.name, inflatedObject.name)
    }
}

private class MyObject(val name: String) : Object(newInstancePointer()) {
    companion object Type : ObjectType<MyObject>(MyObject::class, Object.type)
}
