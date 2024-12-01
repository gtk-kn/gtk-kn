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

import org.gtkkn.gir.util.loadResourceAsFile
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class MetadataParserTest {
    @Test
    fun `test skipping a symbol`() {
        assertArgument("MySymbol", ArgumentType.SKIP, BooleanLiteral(true))
    }

    @Test
    fun `test hiding a symbol`() {
        assertArgument("IntrospectableSymbol", ArgumentType.INTROSPECTABLE, BooleanLiteral(false))
    }

    @Test
    fun `test specifying C header filenames`() {
        assertArgument("MyNamespace", ArgumentType.CHEADER_FILENAME, StringLiteral("\"my_header.h\""))
    }

    @Test
    fun `test specifying a custom name`() {
        assertArgument("CustomNamedSymbol", ArgumentType.NAME, StringLiteral("\"CustomSymbol\""))
    }

    @Test
    fun `test ownership`() {
        assertArgument("OwnedParameter", ArgumentType.OWNED, BooleanLiteral(true))
        assertArgument("UnownedMethod", ArgumentType.UNOWNED, BooleanLiteral(true))
    }

    @Test
    fun `test specifying parent`() {
        assertArgument("ChildSymbol", ArgumentType.PARENT, StringLiteral("\"ParentClass\""))
    }

    @Test
    fun `test nullable attributes`() {
        assertArgument("NullableField", ArgumentType.NULLABLE, BooleanLiteral(true))
    }

    @Test
    fun `test deprecation`() {
        assertArgument("DeprecatedMethod", ArgumentType.DEPRECATED, BooleanLiteral(true))
        assertArgument("DeprecatedMethodWithReplacement", ArgumentType.REPLACEMENT, StringLiteral("\"NewMethod\""))
        assertArgument("DeprecatedMethodWithVersion", ArgumentType.DEPRECATED_SINCE, StringLiteral("\"2.0\""))
    }

    @Test
    fun `test adding version information`() {
        assertArgument("VersionedSymbol", ArgumentType.SINCE, StringLiteral("\"3.0\""))
    }

    @Test
    fun `test array attributes`() {
        assertArgument("ArrayField", ArgumentType.ARRAY, BooleanLiteral(true))
        assertArgument("ArrayFieldWithLength", ArgumentType.ARRAY_LENGTH_IDX, IntegerLiteral("2"))
        assertArgument("ArrayFieldNullTerminated", ArgumentType.ARRAY_NULL_TERMINATED, BooleanLiteral(true))
    }

    @Test
    fun `test default values`() {
        assertArgument("DefaultParameter", ArgumentType.DEFAULT, IntegerLiteral("42"))
        assertArgument("DefaultWithoutValue", ArgumentType.DEFAULT, BooleanLiteral(true))
    }

    @Test
    fun `test out and ref attributes`() {
        assertArgument("OutParameter", ArgumentType.OUT, BooleanLiteral(true))
        assertArgument("RefParameter", ArgumentType.REF, BooleanLiteral(true))
    }

    @Test
    fun `test abstract and sealed attributes`() {
        assertArgument("AbstractClass", ArgumentType.ABSTRACT, BooleanLiteral(true))
        assertArgument("SealedClass", ArgumentType.SEALED, BooleanLiteral(true))
    }

    @Test
    fun `test exceptions`() {
        assertArgument("ThrowsExceptionMethod", ArgumentType.THROWS, StringLiteral("\"CustomException\""))
    }

    @Test
    fun `test closure attributes`() {
        assertArgument("ClosureMethod", ArgumentType.CLOSURE, IntegerLiteral("3"))
    }

    @Test
    fun `test destroy-related attributes`() {
        assertArgument("DestroyMethod", ArgumentType.DESTROY, BooleanLiteral(true))
        assertArgument("DestroysInstanceMethod", ArgumentType.DESTROYS_INSTANCE, BooleanLiteral(true))
    }

    @Test
    fun `test error domain`() {
        assertArgument("ErrorEnum", ArgumentType.ERRORDOMAIN, BooleanLiteral(true))
    }

    @Test
    fun `test base type attributes`() {
        assertArgument("BaseTypedSymbol", ArgumentType.BASE_TYPE, StringLiteral("\"BaseClass\""))
    }

    @Test
    fun `test finish functions`() {
        assertArgument("FinishFunction", ArgumentType.FINISH_NAME, StringLiteral("\"finish_method\""))
    }

    @Test
    fun `test finish instance`() {
        assertArgument("FinishInstanceMethod", ArgumentType.FINISH_INSTANCE, BooleanLiteral(true))
    }

    @Test
    fun `test instance index`() {
        assertArgument("InstanceIndexedMethod", ArgumentType.INSTANCE_IDX, IntegerLiteral("1"))
    }

    @Test
    fun `test feature test macros`() {
        assertArgument("FeatureTestedSymbol", ArgumentType.FEATURE_TEST_MACRO, StringLiteral("\"FEATURE_MACRO\""))
    }

    @Test
    fun `test floating references`() {
        assertArgument("FloatingReferenceMethod", ArgumentType.FLOATING, BooleanLiteral(true))
    }

    @Test
    fun `test type ID`() {
        assertArgument("TypeIdMethod", ArgumentType.TYPE_ID, StringLiteral("\"CustomTypeId\""))
    }

    @Test
    fun `test copy, free, ref, and unref functions`() {
        assertArgument("CopyFunctionMethod", ArgumentType.COPY_FUNCTION, StringLiteral("\"copy_func\""))
        assertArgument("FreeFunctionMethod", ArgumentType.FREE_FUNCTION, StringLiteral("\"free_func\""))
        assertArgument("RefFunctionMethod", ArgumentType.REF_FUNCTION, StringLiteral("\"ref_func\""))
        assertArgument("RefSinkFunctionMethod", ArgumentType.REF_SINK_FUNCTION, StringLiteral("\"ref_sink_func\""))
        assertArgument("UnrefFunctionMethod", ArgumentType.UNREF_FUNCTION, StringLiteral("\"unref_func\""))
    }

    @Test
    fun `test delegate-related attributes`() {
        assertArgument("DelegateTargetCname", ArgumentType.DELEGATE_TARGET_CNAME, StringLiteral("\"delegate_cname\""))
        assertArgument("DelegateTargetMethod", ArgumentType.DELEGATE_TARGET, StringLiteral("\"delegate_target\""))
        assertArgument("DestroyNotifyMethod", ArgumentType.DESTROY_NOTIFY_CNAME, StringLiteral("\"destroy_notify\""))
    }

    @Test
    fun `test no accessor method`() {
        assertArgument("NoAccessorMethod", ArgumentType.NO_ACCESSOR_METHOD, BooleanLiteral(true))
    }

    @Test
    fun `test C Type`() {
        assertArgument("CTypeSymbol", ArgumentType.CTYPE, StringLiteral("\"CustomCType\""))
    }

    @Test
    fun `test using relative rules`() {
        val bazMethodMetadata = assertChildExists("FooBar", "baz_method")
        assertArgument(bazMethodMetadata, ArgumentType.DEPRECATED_SINCE, StringLiteral("\"1.0\""))
        assertArgument(bazMethodMetadata, ArgumentType.REPLACEMENT, StringLiteral("\"new_baz_method\""))
    }

    @Test
    fun `test using selectors`() {
        val bazMethodMetadata = assertChildExists("FooBar", "baz_method", "method")
        assertArgument(bazMethodMetadata, ArgumentType.VIRTUAL, BooleanLiteral(true))
    }

    @Test
    fun `test using arguments with expressions`() {
        val someMethodMetadata = assertChildExists("SomeClass", "some_method")
        assertArgument(someMethodMetadata, ArgumentType.ARRAY_LENGTH_IDX, IntegerLiteral("2"))
        assertArgument(someMethodMetadata, ArgumentType.NULLABLE, BooleanLiteral(false))
    }

    @Test
    fun `test using a symbol in an expression`() {
        val somePropertyMetadata = metadata.matchChild("YetAnotherClass")?.matchChild("some_property")
        assertNotNull(somePropertyMetadata, "YetAnotherClass.some_property should be present in metadata")
        val defaultArg = somePropertyMetadata.args[ArgumentType.DEFAULT]
        assertNotNull(defaultArg, "some_property should have 'default' argument")
        val expectedExpr = MemberAccess(MemberAccess(null, "SomeOtherClass"), "DEFAULT_VALUE")
        assertEquals(expectedExpr.toString(), defaultArg.expression.toString())
    }

    @Test
    fun `test using multiple arguments`() {
        val methodMetadata = assertChildExists("ClassName", "method_name")
        assertArgument(methodMetadata, ArgumentType.DEPRECATED_SINCE, StringLiteral("\"2.0\""))
        assertArgument(methodMetadata, ArgumentType.DEPRECATED, BooleanLiteral(true))
        assertArgument(methodMetadata, ArgumentType.REPLACEMENT, StringLiteral("\"new_method\""))
    }

    @Test
    fun `test using relative rules relative to absolute rule`() {
        val baseClassMetadata = assertMetadataExists("BaseClass")
        val subClassMetadata = assertChildExists(baseClassMetadata, "SubClass")
        assertArgument(subClassMetadata, ArgumentType.SKIP, BooleanLiteral(true))

        val anotherSubClassMetadata = assertChildExists(baseClassMetadata, "AnotherSubClass")
        assertArgument(anotherSubClassMetadata, ArgumentType.UNOWNED, BooleanLiteral(true))
    }

    @Test
    fun `test using complex patterns`() {
        val functionMetadata = assertMetadataExists("*#function")
        assertArgument(functionMetadata, ArgumentType.SKIP, BooleanLiteral(true))
    }

    @Test
    fun `test using nullable and array arguments`() {
        val exampleMethodMetadata = assertChildExists("ExampleClass", "example_method")
        assertArgument(exampleMethodMetadata, ArgumentType.NULLABLE, BooleanLiteral(true))
        assertArgument(exampleMethodMetadata, ArgumentType.ARRAY, BooleanLiteral(true))
    }

    @Test
    fun `test using closure and scope`() {
        val asyncMethodMetadata = assertChildExists("AsyncClass", "async_method")
        assertArgument(asyncMethodMetadata, ArgumentType.CLOSURE, IntegerLiteral("1"))

        val scopeArg = asyncMethodMetadata.args[ArgumentType.SCOPE]
        assertNotNull(scopeArg, "async_method should have 'scope' argument")
        val stringLiteral = scopeArg.expression as StringLiteral
        assertEquals("async", stringLiteral.eval(), "Scope argument should evaluate correctly")
        assertEquals(StringLiteral("\"async\""), stringLiteral, "Scope argument raw value mismatch")
    }

    @Test
    fun `test using default without expression`() {
        val parameterlessMethodMetadata = assertMetadataExists("ParameterlessMethod")
        assertArgument(parameterlessMethodMetadata, ArgumentType.DEFAULT, BooleanLiteral(true))
    }

    @Test
    fun `test using different selectors`() {
        val selectorTestMetadata = assertMetadataExists("SelectorTest")

        val constructorMetadata = assertChildExists(selectorTestMetadata, "method", "constructor")
        assertArgument(constructorMetadata, ArgumentType.SKIP, BooleanLiteral(true))

        val propertyMetadata = assertChildExists(selectorTestMetadata, "property", "property")
        assertArgument(propertyMetadata, ArgumentType.NULLABLE, BooleanLiteral(false))
    }

    @Test
    fun `test overriding namespace attributes`() {
        val myNamespaceMetadata = assertMetadataExists("MyNamespace")
        assertArgument(myNamespaceMetadata, ArgumentType.CHEADER_FILENAME, StringLiteral("\"my_header.h\""))
    }

    @Test
    fun `test wildcard patterns in metadata parsing`() {
        // Validate that metadata for pattern "DBus*VTable" exists
        val dbusVTableMetadata = assertMetadataExists("DBus*VTable")

        // Check that the pattern matches "DBusInterfaceVTable"
        assertNotNull(
            assertMetadataExists("DBusInterfaceVTable"),
            "DBus*VTable should be present in metadata'",
        )

        // Validate child metadata with pattern ".*" and selector "field"
        val childMetadata = assertChildExists(dbusVTableMetadata, "*", "field")

        // Ensure the 'delegate_target' argument is set to false
        assertArgument(childMetadata, ArgumentType.DELEGATE_TARGET, BooleanLiteral(false))
    }

    // Helper Methods
    private fun assertArgument(
        metadataName: String,
        argumentType: ArgumentType,
        expectedValue: Expression
    ) {
        val metadata = assertMetadataExists(metadataName)
        assertArgument(metadata, argumentType, expectedValue)
    }

    private fun assertArgument(
        metadata: Metadata,
        argumentType: ArgumentType,
        expectedValue: Expression
    ) {
        val argument = metadata.args[argumentType]
        assertNotNull(argument, "should have '${argumentType.name.lowercase()}' argument")
        assertEquals(expectedValue, argument.expression)
    }

    private fun assertMetadataExists(name: String): Metadata {
        val metadata = MetadataParserTest.metadata.matchChild(name)
        assertNotNull(metadata, "$name should be present in metadata")
        return metadata
    }

    private fun assertChildExists(
        parentMetadataName: String,
        childName: String,
        selector: String? = null
    ): Metadata {
        val parentMetadata = assertMetadataExists(parentMetadataName)
        return assertChildExists(parentMetadata, childName, selector)
    }

    private fun assertChildExists(
        parentMetadata: Metadata,
        childName: String,
        selector: String? = null
    ): Metadata {
        val childMetadata = parentMetadata.matchChild(childName, selector)
        assertNotNull(
            childMetadata,
            "should have a child '${childName}${selector?.let { "#$it" }.orEmpty()}'",
        )
        return childMetadata
    }

    companion object {
        private val metadata: Metadata by lazy {
            val metadataFile = checkNotNull(loadResourceAsFile("patches/Test.metadata"))
            val parser = MetadataParser()
            parser.parse(metadataFile)
        }
    }
}
