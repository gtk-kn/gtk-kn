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

package org.gtkkn.gir

import net.pearx.kasechange.toCamelCase
import net.pearx.kasechange.toPascalCase
import kotlin.test.Test
import kotlin.test.assertEquals

class CaseTests {
    @Test
    fun `toCamelCase - converts various strings to camel case`() {
        assertEquals("hello", "hello".toCamelCase(), "Single lowercase word remains unchanged")
        assertEquals("hello", "Hello".toCamelCase(), "Uppercase word converts to lowercase")
        assertEquals("helloWorld", "hello_world".toCamelCase(), "Snake case converts to camel case")
        assertEquals("helloWorld", "helloWorld".toCamelCase(), "Camel case remains unchanged")
        assertEquals("helloWorld", "HelloWorld".toCamelCase(), "Pascal case converts to camel case")
        assertEquals("helloWorld123", "helloWorld123".toCamelCase(), "Camel case with numbers remains unchanged")
        assertEquals("helloWorld123", "HelloWorld123".toCamelCase(), "Pascal case with numbers converts to camel case")
        assertEquals("helloWorld123", "hello_world_123".toCamelCase(), "Snake case with numbers converts to camel case")
        assertEquals("helloWorld", "hello-world".toCamelCase(), "Kebab case converts to camel case")
        assertEquals("helloWorld", "helloWorld_".toCamelCase(), "Trailing underscores are ignored")
        assertEquals("helloWorld123", "HelloWORLD123".toCamelCase(), "Uppercase with numbers converts to camel case")
        assertEquals("helloWOrld", "HelloWOrld".toCamelCase(), "Partially uppercase words convert to camel case")
    }

    @Test
    fun `toPascalCase - converts various strings to Pascal case`() {
        assertEquals("Hello", "hello".toPascalCase(), "Lowercase word converts to Pascal case")
        assertEquals("Hello", "Hello".toPascalCase(), "Uppercase single word remains unchanged")
        assertEquals("HelloWorld", "hello_world".toPascalCase(), "Snake case converts to Pascal case")
        assertEquals("HelloWorld", "helloWorld".toPascalCase(), "Camel case converts to Pascal case")
        assertEquals("HelloWorld", "HelloWorld".toPascalCase(), "Pascal case remains unchanged")
        assertEquals("HelloWorld123", "helloWorld123".toPascalCase(), "Camel case with numbers converts to Pascal case")
        assertEquals("HelloWorld123", "HelloWorld123".toPascalCase(), "Pascal case with numbers remains unchanged")
        assertEquals(
            expected = "HelloWorld123",
            actual = "hello_world_123".toPascalCase(),
            message = "Snake case with numbers converts to Pascal case",
        )
        assertEquals("HelloWorld", "hello-world".toPascalCase(), "Kebab case converts to Pascal case")
        assertEquals("HelloWorld", "helloWorld_".toPascalCase(), "Trailing underscores are ignored")
        assertEquals("HelloWorld123", "HelloWORLD123".toPascalCase(), "Uppercase with numbers converts to Pascal case")
        assertEquals("HelloWOrld", "HelloWOrld".toPascalCase(), "Partially uppercase words convert to Pascal case")
        assertEquals("ValueDataUnion", "_Value__data__union".toPascalCase(), "Strange case found in unions")
    }
}
