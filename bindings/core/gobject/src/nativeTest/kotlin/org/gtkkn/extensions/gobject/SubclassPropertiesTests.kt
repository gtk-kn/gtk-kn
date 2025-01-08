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

import org.gtkkn.bindings.gobject.BindingFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gobject.Value
import org.gtkkn.native.gobject.G_TYPE_INT
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class SubclassPropertiesTests {
    /**
     * Test setting and getting a string property via direct access and `setProperty`.
     */
    @Test
    fun `string property can be set and retrieved via property and setProperty`() {
        val person = Person()
        person.setProperty("name", "Steven")
        assertEquals("Steven", person.getStringProperty("name"))
        assertEquals("Steven", person.name)
    }

    /**
     * Test setting a string property via Kotlin property syntax updates the backing property.
     */
    @Test
    fun `string property can be set via Kotlin property syntax`() {
        val person = Person()
        person.name = "Test"
        assertEquals("Test", person.getStringProperty("name"))
    }

    /**
     * Test binding properties between two objects propagates updates.
     */
    @Test
    fun `binding properties propagates changes to the bound object`() {
        val person1 = Person()
        val person2 = Person()

        person1.bindProperty("name", person2, "name", BindingFlags.DEFAULT)
        person1.name = "bound"

        assertEquals("bound", person2.name)
    }

    /**
     * Test that setting a Kotlin property triggers a notification.
     */
    @Test
    fun `Kotlin property updates trigger notifications`() {
        val person = Person()
        var notifyNameCalled = false

        person.onNotify {
            if (it.getName() == "name") {
                notifyNameCalled = true
            }
        }
        person.name = "test"

        assertTrue(notifyNameCalled, "Notification should have been triggered for 'name' property.")
    }

    /**
     * Test default property values are correctly applied.
     */
    @Test
    fun `default property values are applied correctly`() {
        val person = Person()
        assertEquals("self-employed", person.company)
        assertEquals("self-employed", person.getStringProperty("company"))
    }

    /**
     * Test setting a property with an overridden name works correctly.
     */
    @Test
    fun `property with overridden name can be set and retrieved`() {
        val person = Person()
        person.setProperty("my-property", "testvalue")
        assertEquals("testvalue", person.myProperty)
    }

    /**
     * Test setting and retrieving an integer property using Value objects.
     */
    @Test
    fun `integer property can be set and retrieved via Value objects`() {
        val person = Person()

        val inValue = Value().init(G_TYPE_INT)
        inValue.setInt(42)
        person.setProperty("age", inValue)

        assertEquals(42, person.age)

        val outValue = Value()
        person.getProperty("age", outValue)
        assertEquals(42, outValue.getInt())
    }

    /**
     * Test setting properties using `setProperty` extensions.
     */
    @Test
    fun `setProperty extensions work correctly for different property types`() {
        val person = Person()
        person.setProperty("age", 1)
        assertEquals(1, person.age)

        person.setProperty("name", "extension")
        assertEquals("extension", person.name)
    }

    /**
     * Test retrieving properties using `getProperty` extensions.
     */
    @Test
    fun `getProperty extensions work correctly for different property types`() {
        val person = Person()
        person.name = "Steven"
        person.age = 35
        person.bool = true

        assertEquals("Steven", person.getStringProperty("name"))
        assertEquals(35, person.getIntProperty("age"))
        assertTrue(person.getBooleanProperty("bool"))
    }

    /**
     * Test setting and retrieving a boolean property works correctly.
     */
    @Test
    fun `boolean property can be set and retrieved via property and setProperty`() {
        val person = Person()
        assertFalse(person.bool)
        assertFalse(person.getBooleanProperty("bool"))

        person.bool = true
        assertTrue(person.bool)
        assertTrue(person.getBooleanProperty("bool"))

        person.setProperty("bool", false)
        assertFalse(person.bool)
        assertFalse(person.getBooleanProperty("bool"))

        assertTrue(person.configuredBool)
        assertTrue(person.getBooleanProperty("configured-bool"))
    }
}

private class Person : Object(newInstancePointer()) {
    var name by Type.name
    val company by Type.company
    val myProperty by Type.myProperty
    var age by Type.age
    var bool by Type.bool

    var configuredBool by Type.configuredBool

    companion object Type : ObjectType<Person>(Person::class, Object.type) {
        val name by stringProperty()
        val company by stringProperty(defaultValue = "self-employed")
        val myProperty by stringProperty(name = "my-property")

        val age by intProperty()
        val bool by booleanProperty()
        val configuredBool by booleanProperty(name = "configured-bool", defaultValue = true)
    }
}
