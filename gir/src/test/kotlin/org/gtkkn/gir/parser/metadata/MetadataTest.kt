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

package org.gtkkn.gir.parser.metadata

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertIs
import kotlin.test.assertNotNull
import kotlin.test.assertNull
import kotlin.test.assertTrue

class MetadataTest {
    @Test
    fun `test creating metadata`() {
        val metadata = Metadata(
            "TestPattern",
            "TestSelector",
            SourceReference("source", SourceLocation(0, 1, 1), SourceLocation(10, 1, 11)),
        )

        assertEquals("TestPattern", metadata.pattern)
        assertEquals("TestSelector", metadata.selector)
        assertNotNull(metadata.sourceReference)
        assertEquals("source", metadata.sourceReference?.source)
    }

    @Test
    fun `test adding and matching children`() {
        val parent = Metadata("ParentPattern")
        val child1 = Metadata("ChildPattern1")
        val child2 = Metadata("ChildPattern2", "selector")

        parent.addChild(child1)
        parent.addChild(child2)

        assertEquals(2, parent.children.size)

        val matchedChild1 = parent.matchChild("ChildPattern1")
        val matchedChild2 = parent.matchChild("ChildPattern2", "selector")

        assertEquals(child1, matchedChild1)
        assertEquals(child2, matchedChild2)
    }

    @Test
    fun `test matching child with no match returns null`() {
        val parent = Metadata("ParentPattern")
        val child = Metadata("ChildPattern")

        parent.addChild(child)

        val unmatched = parent.matchChild("NonexistentPattern")
        assertNull(unmatched)
    }

    @Test
    fun `test matching multiple children returns metadata set`() {
        val parent = Metadata("ParentPattern")
        val child1 = Metadata("ChildPattern", "selector")
        val child2 = Metadata("ChildPattern", "selector")

        val expression = StringLiteral("TestValue")
        child1.addArgument(ArgumentType.NAME, Argument(expression, null))
        child2.addArgument(ArgumentType.BASE_TYPE, Argument(expression, null))

        parent.addChild(child1)
        parent.addChild(child2)

        val matched = parent.matchChild("ChildPattern", "selector")

        // Verify that the matched result is a MetadataSet
        assertIs<MetadataSet>(matched)

        // Verify that the MetadataSet contains the merged children and arguments
        val metadataSet = matched as MetadataSet
        assertTrue(metadataSet.children.containsAll(child1.children + child2.children))
        assertEquals(child1.args + child2.args, metadataSet.args) // Ensure args are merged correctly

        // Check that the selector is preserved
        assertEquals("selector", metadataSet.selector)
    }

    @Test
    fun `test adding arguments`() {
        val metadata = Metadata("TestPattern")
        val argument = Argument(StringLiteral("TestValue"), null)

        metadata.addArgument(ArgumentType.NAME, argument)

        assertTrue(metadata.hasArgument(ArgumentType.NAME))
        assertEquals(argument, metadata.args[ArgumentType.NAME])
    }

    @Test
    fun `test getting expressions`() {
        val metadata = Metadata("TestPattern")
        val expression = StringLiteral("TestValue")
        metadata.addArgument(ArgumentType.NAME, Argument(expression, null))

        val result = metadata.getExpression(ArgumentType.NAME)
        assertEquals(expression, result)
    }

    @Test
    fun `test getting string from argument`() {
        val metadata = Metadata("TestPattern")
        metadata.addArgument(ArgumentType.NAME, Argument(StringLiteral("TestValue"), null))

        val result = metadata.getString(ArgumentType.NAME)
        assertEquals("TestValue", result)
    }

    @Test
    fun `test getting integer from argument`() {
        val metadata = Metadata("TestPattern")
        metadata.addArgument(ArgumentType.DEFAULT, Argument(IntegerLiteral("42"), null))

        val result = metadata.getInteger(ArgumentType.DEFAULT)
        assertEquals(42, result)
    }

    @Test
    fun `test getting negative integer from unary expression`() {
        val metadata = Metadata("TestPattern")
        metadata.addArgument(
            ArgumentType.DEFAULT,
            Argument(UnaryExpression(UnaryOperator.MINUS, IntegerLiteral("42")), null),
        )

        val result = metadata.getInteger(ArgumentType.DEFAULT)
        assertEquals(-42, result)
    }

    @Test
    fun `test getting boolean from argument`() {
        val metadata = Metadata("TestPattern")
        metadata.addArgument(ArgumentType.NULLABLE, Argument(BooleanLiteral(true), null))

        val result = metadata.getBool(ArgumentType.NULLABLE)
        assertTrue(result)

        val defaultFalse = metadata.getBool(ArgumentType.OWNED, defaultValue = false)
        assertFalse(defaultFalse)
    }

    @Test
    fun `test getting source reference from argument`() {
        val metadata = Metadata("TestPattern")
        val sourceReference = SourceReference("source", SourceLocation(0, 1, 1), SourceLocation(10, 1, 11))
        metadata.addArgument(ArgumentType.NAME, Argument(StringLiteral("TestValue"), sourceReference))

        val result = metadata.getSourceReference(ArgumentType.NAME)
        assertEquals(sourceReference, result)
    }

    @Test
    fun `test toString outputs correctly`() {
        val metadata = Metadata("ParentPattern")
        metadata.addArgument(ArgumentType.NAME, Argument(StringLiteral("TestValue"), null))
        val child = Metadata("ChildPattern")
        metadata.addChild(child)

        val result = metadata.toString()
        val expected = """
            ParentPattern name=TestValue
              .ChildPattern
        """.trimIndent()
        assertEquals(expected, result)
    }

    @Test
    fun `test empty metadata singleton`() {
        val emptyMetadata = Metadata.empty

        assertNotNull(emptyMetadata)
        assertEquals("", emptyMetadata.pattern)
        assertTrue(emptyMetadata.children.isEmpty())
        assertTrue(emptyMetadata.args.isEmpty())
    }

    @Test
    fun `test used flag is updated when matching child`() {
        val parent = Metadata("ParentPattern")
        val child = Metadata("ChildPattern")

        parent.addChild(child)
        parent.matchChild("ChildPattern")

        assertTrue(child.used)
    }

    @Test
    fun `test used flag is updated when getting expression`() {
        val metadata = Metadata("TestPattern")
        val argument = Argument(StringLiteral("TestValue"), null)

        metadata.addArgument(ArgumentType.NAME, argument)
        metadata.getExpression(ArgumentType.NAME)

        assertTrue(argument.used)
    }

    @Test
    fun `test metadata toString with onlyUnused = false`() {
        val root = Metadata("Root")
        val child1 = Metadata("Child1", "mySelector")
        val child2 = Metadata("Child2")
        val grandchild = Metadata("Grandchild")
        val arg1 = Argument(BooleanLiteral(true))
        val arg2 = Argument(BooleanLiteral(false))
        val arg3 = Argument(BooleanLiteral(true))

        root.addChild(child1)
        root.addChild(child2)
        child1.addChild(grandchild)

        root.addArgument(ArgumentType.SKIP, arg1)
        child1.addArgument(ArgumentType.DEPRECATED, arg2)
        grandchild.addArgument(ArgumentType.REPLACEMENT, arg3)

        val expectedOutput = """
            Root skip=true
              .Child1#mySelector deprecated=false
                .Grandchild replacement=true
              .Child2
        """.trimIndent()

        val output = root.toString(onlyUnused = false)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun `test metadata toString with onlyUnused = true and all used`() {
        val root = Metadata("Root").apply { used = true }
        val child1 = Metadata("Child1").apply { used = true }
        val child2 = Metadata("Child2").apply { used = true }
        val grandchild = Metadata("Grandchild").apply { used = true }
        val arg1 = Argument(BooleanLiteral(true)).apply { used = true }
        val arg2 = Argument(BooleanLiteral(false)).apply { used = true }
        val arg3 = Argument(BooleanLiteral(true)).apply { used = true }

        root.addChild(child1)
        root.addChild(child2)
        child1.addChild(grandchild)

        root.addArgument(ArgumentType.SKIP, arg1)
        child1.addArgument(ArgumentType.DEPRECATED, arg2)
        grandchild.addArgument(ArgumentType.REPLACEMENT, arg3)

        val output = root.toString(onlyUnused = true)
        assertTrue(output.isEmpty())
    }

    @Test
    fun `test metadata toString with onlyUnused = true and some unused arguments`() {
        val root = Metadata("Root").apply { used = true }
        val child1 = Metadata("Child1").apply { used = true }
        val child2 = Metadata("Child2").apply { used = true }
        val grandchild = Metadata("Grandchild").apply { used = true }
        val arg1 = Argument(BooleanLiteral(true)).apply { used = false } // Unused
        val arg2 = Argument(BooleanLiteral(false)).apply { used = true }
        val arg3 = Argument(BooleanLiteral(true)).apply { used = false } // Unused

        root.addChild(child1)
        root.addChild(child2)
        child1.addChild(grandchild)

        root.addArgument(ArgumentType.SKIP, arg1)
        child1.addArgument(ArgumentType.DEPRECATED, arg2)
        grandchild.addArgument(ArgumentType.REPLACEMENT, arg3)

        val expectedOutput = """
            Root skip=true
              .Child1
                .Grandchild replacement=true
        """.trimIndent()

        val output = root.toString(onlyUnused = true)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun `test metadata toString with onlyUnused = true and unused children`() {
        val root = Metadata("Root").apply { used = true }
        val child1 = Metadata("Child1").apply { used = false } // Unused
        val child2 = Metadata("Child2").apply { used = true }
        val grandchild = Metadata("Grandchild").apply { used = false } // Unused
        val arg1 = Argument(BooleanLiteral(true)).apply { used = true }
        val arg2 = Argument(BooleanLiteral(false)).apply { used = false } // Unused

        root.addChild(child1)
        root.addChild(child2)
        child1.addChild(grandchild)

        root.addArgument(ArgumentType.SKIP, arg1)
        child1.addArgument(ArgumentType.DEPRECATED, arg2)

        val expectedOutput = """
            Root
              .Child1 deprecated=false
                .Grandchild
        """.trimIndent()

        val output = root.toString(onlyUnused = true)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun `test metadata toString with onlyUnused = true and unused root`() {
        val root = Metadata("Root").apply { used = false } // Unused
        val child1 = Metadata("Child1").apply { used = true }
        val child2 = Metadata("Child2").apply { used = true }
        val arg1 = Argument(BooleanLiteral(true)).apply { used = false } // Unused

        root.addChild(child1)
        root.addChild(child2)

        root.addArgument(ArgumentType.SKIP, arg1)

        val expectedOutput = """
            Root skip=true
        """.trimIndent()

        val output = root.toString(onlyUnused = true)
        assertEquals(expectedOutput, output)
    }
}
