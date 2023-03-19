package org.gtkkn.gir.util

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class StringExtTests {
    @Test
    fun testToCamelCase() {
        assertEquals("hello", "hello".toCamelCase())
        assertEquals("hello", "Hello".toCamelCase())
        assertEquals("helloWorld", "hello_world".toCamelCase())
        assertEquals("helloWorld", "helloWorld".toCamelCase())
        assertEquals("helloWorld", "HelloWorld".toCamelCase())
        assertEquals("helloWorld123", "helloWorld123".toCamelCase())
        assertEquals("helloWorld123", "HelloWorld123".toCamelCase())
        assertEquals("helloWorld123", "hello_world_123".toCamelCase())
        assertFailsWith<IllegalStateException> { "hello-world".toCamelCase() }
        assertFailsWith<IllegalStateException> { "helloWorld_".toCamelCase() }
        assertFailsWith<IllegalStateException> { "1helloWorld".toCamelCase() }
    }

    @Test
    fun testToPascalCase() {
        assertEquals("Hello", "hello".toPascalCase())
        assertEquals("Hello", "Hello".toPascalCase())
        assertEquals("HelloWorld", "hello_world".toPascalCase())
        assertEquals("HelloWorld", "helloWorld".toPascalCase())
        assertEquals("HelloWorld", "HelloWorld".toPascalCase())
        assertEquals("HelloWorld123", "helloWorld123".toPascalCase())
        assertEquals("HelloWorld123", "HelloWorld123".toPascalCase())
        assertEquals("HelloWorld123", "hello_world_123".toPascalCase())
        assertFailsWith<IllegalStateException> { "hello-world".toPascalCase() }
        assertFailsWith<IllegalStateException> { "helloWorld_".toPascalCase() }
        assertFailsWith<IllegalStateException> { "1HelloWorld".toPascalCase() }
    }

    @Test
    fun testIsCamelCase() {
        assertTrue("hello".isCamelCase())
        assertTrue("helloWorld".isCamelCase())
        assertTrue("helloWorld123".isCamelCase())
        assertFalse("HelloWorld".isCamelCase())
        assertFalse("hello_world".isCamelCase())
        assertFalse("hello-world".isCamelCase())
        assertFalse("helloWorld_".isCamelCase())
        assertFalse("helloWorld$".isCamelCase())
    }

    @Test
    fun testIsPascalCase() {
        assertTrue("Hello".isPascalCase())
        assertTrue("HelloWorld".isPascalCase())
        assertTrue("HelloWorld123".isPascalCase())
        assertFalse("helloWorld".isPascalCase())
        assertFalse("hello_world".isPascalCase())
        assertFalse("hello-world".isPascalCase())
        assertFalse("HelloWorld_".isPascalCase())
        assertFalse("HelloWorld$".isPascalCase())
    }

    @Test
    fun testIsSnakeCase() {
        assertTrue("hello".isSnakeCase())
        assertTrue("hello_world".isSnakeCase())
        assertTrue("hello_world_123".isSnakeCase())
        assertFalse("helloWorld".isSnakeCase())
        assertFalse("HelloWorld".isSnakeCase())
        assertFalse("hello-world".isSnakeCase())
        assertFalse("helloWorld_".isSnakeCase())
        assertFalse("helloWorld$".isSnakeCase())
    }
}
