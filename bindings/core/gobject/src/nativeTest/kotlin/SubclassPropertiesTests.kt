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

import org.gtkkn.bindings.gobject.BindingFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gobject.Value
import org.gtkkn.extensions.glib.allocate
import org.gtkkn.extensions.gobject.ObjectType
import org.gtkkn.extensions.gobject.getBooleanProperty
import org.gtkkn.extensions.gobject.getIntProperty
import org.gtkkn.extensions.gobject.getStringProperty
import org.gtkkn.extensions.gobject.setProperty
import org.gtkkn.native.gobject.G_TYPE_INT
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class SubclassPropertiesTests {

    @Test
    fun testStringProperty() {
        val person = Person()
        person.setProperty("name", "Steven")
        assertEquals("Steven", person.getStringProperty("name"))
        assertEquals("Steven", person.name)
    }

    @Test
    fun testStringPropertyKotlinWrite() {
        val person = Person()
        person.name = "Test"
        assertEquals("Test", person.getStringProperty("name"))
    }

    @Test
    fun testPropertyBinding() {
        val person1 = Person()
        val person2 = Person()

        person1.bindProperty("name", person2, "name", BindingFlags.DEFAULT)
        person1.name = "bound"

        assertEquals("bound", person2.name)
    }

    @Test
    fun testKotlinWriteNotifies() {
        val person = Person()
        var notifyNameCalled = false

        person.connectNotify {
            if (it.getName() == "name") {
                notifyNameCalled = true
            }
        }
        person.name = "test"

        assertTrue(notifyNameCalled)
    }

    @Test
    fun testDefault() {
        val person = Person()
        assertEquals("self-employed", person.company)
        assertEquals("self-employed", person.getStringProperty("company"))
    }

    @Test
    fun testSetPropertyWithOverriddenName() {
        val person = Person()
        person.setProperty("my-property", "testvalue")
        assertEquals("testvalue", person.myProperty)
    }

    @Test
    fun testIntProperty() {
        val person = Person()

        val inValue = Value.allocate().get().init(G_TYPE_INT)
        inValue.setInt(42)
        person.setProperty("age", inValue)

        assertEquals(42, person.age)

        val outValue = Value.allocate().get()
        person.getProperty("age", outValue)
        assertEquals(42, outValue.getInt())
    }

    @Test
    fun testSetPropertyExtensions() {
        val person = Person()
        person.setProperty("age", 1)
        assertEquals(1, person.age)

        person.setProperty("name", "extension")
        assertEquals("extension", person.name)
    }

    @Test
    fun testGetPropertyExtensions() {
        val person = Person()
        person.name = "Steven"
        person.age = 35
        person.bool = true

        assertEquals("Steven", person.getStringProperty("name"))
        assertEquals(35, person.getIntProperty("age"))
        assertTrue(person.getBooleanProperty("bool"))
    }

    @Test
    fun testBooleanProperty() {
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
