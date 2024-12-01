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

import org.gtkkn.bindings.gobject.Object
import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * Unit tests for verifying the type casting functionality of `asType`.
 */
class TypeCastingTests {

    /**
     * Test that an object can be cast to a more generic type and back to its original type.
     */
    @Test
    fun `object can be cast to a generic type and back to the original type`() {
        val obj1 = MyObject("object1")

        // Cast to a generic Object type
        val erasedAsObject = obj1.asType<Object>()

        // Cast back to the original MyObject type
        val inflatedObject = erasedAsObject.asType<MyObject>()

        // Verify that the properties remain consistent after casting
        assertEquals(obj1.name, inflatedObject.name, "Type casting should preserve object properties.")
    }
}

/**
 * A custom class for testing type casting functionality.
 */
private class MyObject(val name: String) : Object(newInstancePointer()) {
    companion object Type : ObjectType<MyObject>(MyObject::class, Object.type)
}
