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

import org.junit.jupiter.api.assertThrows
import org.w3c.dom.Document
import org.w3c.dom.Node
import org.xml.sax.InputSource
import java.io.StringReader
import javax.xml.parsers.DocumentBuilderFactory
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNotNull
import kotlin.test.assertNull
import kotlin.test.assertTrue

@Suppress("LargeClass")
class MetadataProcessorTest {
    private lateinit var metadataParser: MetadataParser
    private lateinit var processor: MetadataProcessor
    private lateinit var document: Document

    @BeforeTest
    fun setUp() {
        metadataParser = MetadataParser()
    }

    @Test
    fun `test apply ABSTRACT argument to class node`() {
        // Prepare the XML document
        val xmlContent =
            """
                <repository>
                  <namespace name="TestNamespace">
                    <class name="AbstractClass" />
                  </namespace>
                </repository>
            """.trimIndent()

        // Prepare the metadata content
        val metadataContent =
            """
                AbstractClass abstract=true
            """.trimIndent()

        // Parse the XML document
        document = parseXml(xmlContent)

        // Parse the metadata
        val metadata = metadataParser.parse(metadataContent)

        // Create the processor
        processor = MetadataProcessor(metadata, document)

        // Apply the metadata
        processor.apply()

        // Find the class node
        val classNode = findNodeByName(document.documentElement, "class", "AbstractClass")
        assertNotNull(classNode)

        val abstractAttr = classNode.attributes.getNamedItem("abstract")?.nodeValue?.toBoolean()
        assertTrue(abstractAttr == true, "The 'abstract' attribute should be true")
    }

    @Test
    fun `test apply ARRAY argument to method return-value`() {
        // Prepare the XML document
        val xmlContent =
            """
                <repository>
                  <namespace name="TestNamespace">
                    <class name="TestClass">
                      <method name="array_method">
                        <return-value>
                          <type name="gchar" c:type="char"/>
                        </return-value>
                      </method>
                    </class>
                  </namespace>
                </repository>
            """.trimIndent()

        // Prepare the metadata content
        val metadataContent =
            """
                TestClass.array_method array=true
            """.trimIndent()

        // Parse the XML document
        document = parseXml(xmlContent)

        // Parse the metadata
        val metadata = metadataParser.parse(metadataContent)

        // Create the processor
        processor = MetadataProcessor(metadata, document)

        // Apply the metadata
        processor.apply()

        // Find the return-value node
        val methodNode = findNodeByName(document.documentElement, "method", "array_method")
        val returnValueNode = processor.getChildNode(checkNotNull(methodNode), "return-value")
        assertNotNull(returnValueNode, "The method should have a return-value")

        // Check if the type node is replaced by an array node
        val arrayNode = processor.getChildNode(returnValueNode, "array")
        assertNotNull(arrayNode, "An 'array' node should be present in the return-value")

        val typeNode = processor.getChildNode(arrayNode, "type")
        assertNotNull(typeNode, "The 'array' node should contain the original 'type' node")
    }

    @Test
    fun `test apply ARRAY_LENGTH_IDX argument to method return-value array`() {
        // Prepare the XML document (same as previous test)
        val xmlContent =
            """
                <repository>
                  <namespace name="TestNamespace">
                    <class name="TestClass">
                      <method name="array_method">
                        <return-value>
                          <array>
                            <type name="gchar" c:type="char"/>
                          </array>
                        </return-value>
                      </method>
                    </class>
                  </namespace>
                </repository>
            """.trimIndent()

        // Prepare the metadata content
        val metadataContent =
            """
                TestClass.array_method array_length_idx=1
            """.trimIndent()

        // Parse the XML document
        document = parseXml(xmlContent)
        // Ensure the array node is already present for this test
        // Apply the metadata
        val metadata = metadataParser.parse(metadataContent)
        processor = MetadataProcessor(metadata, document)
        processor.apply()

        // Find the array node in return-value
        val methodNode = findNodeByName(document.documentElement, "method", "array_method")
        val returnValueNode = processor.getChildNode(checkNotNull(methodNode), "return-value")
        val arrayNode = processor.getChildNode(checkNotNull(returnValueNode), "array")
        assertNotNull(arrayNode, "An 'array' node should be present in the return-value")

        val lengthAttr = arrayNode.attributes.getNamedItem("length")?.nodeValue
        assertEquals("1", lengthAttr, "The 'length' attribute of the array should be '1'")
    }

    @Test
    fun `test apply ARRAY_NULL_TERMINATED argument to method return-value array`() {
        // Prepare the XML document (same as previous test)
        val xmlContent =
            """
                <repository>
                  <namespace name="TestNamespace">
                    <class name="TestClass">
                      <method name="array_method">
                        <return-value>
                          <array>
                            <type name="gchar" c:type="char"/>
                          </array>
                        </return-value>
                      </method>
                    </class>
                  </namespace>
                </repository>
            """.trimIndent()

        // Prepare the metadata content
        val metadataContent =
            """
                TestClass.array_method array_null_terminated=true
            """.trimIndent()

        // Parse the XML document
        document = parseXml(xmlContent)
        // Ensure the array node is already present for this test
        // Apply the metadata
        val metadata = metadataParser.parse(metadataContent)
        processor = MetadataProcessor(metadata, document)
        processor.apply()

        // Find the array node in return-value
        val methodNode = findNodeByName(document.documentElement, "method", "array_method")
        val returnValueNode = processor.getChildNode(checkNotNull(methodNode), "return-value")
        val arrayNode = processor.getChildNode(checkNotNull(returnValueNode), "array")
        assertNotNull(arrayNode, "An 'array' node should be present in the return-value")

        val zeroTerminatedAttr = arrayNode.attributes.getNamedItem("zero-terminated")?.nodeValue?.toBoolean()
        assertTrue(zeroTerminatedAttr == true, "The 'zero-terminated' attribute of the array should be 'true'")
    }

    @Test
    fun `test apply BASE_TYPE argument to alias node`() {
        // Prepare the XML document
        val xmlContent =
            """
                <repository>
                  <namespace name="TestNamespace">
                    <alias name="AliasType" />
                  </namespace>
                </repository>
            """.trimIndent()

        // Prepare the metadata content
        val metadataContent =
            """
                AliasType base_type="BaseType"
            """.trimIndent()

        // Parse the XML document
        document = parseXml(xmlContent)

        // Parse the metadata
        val metadata = metadataParser.parse(metadataContent)

        // Create the processor
        processor = MetadataProcessor(metadata, document)

        // Apply the metadata
        processor.apply()

        // Find the alias node
        val aliasNode = findNodeByName(document.documentElement, "alias", "AliasType")
        assertNotNull(aliasNode)

        val parentAttr = aliasNode.attributes.getNamedItem("parent")?.nodeValue
        assertEquals("BaseType", parentAttr, "The 'parent' attribute should be 'BaseType'")
    }

    @Test
    fun `test apply CHEADER_FILENAME to namespace node`() {
        // Prepare the XML document
        val xmlContent =
            """
                <repository>
                  <namespace name="TestNamespace">
                    <class name="TestClass">
                      <method name="test_method">
                        <parameters>
                          <parameter name="param1" />
                        </parameters>
                      </method>
                    </class>
                  </namespace>
                </repository>
            """.trimIndent()

        // Prepare the metadata content
        val metadataContent =
            """
                TestNamespace cheader_filename="header1.h,header2.h"
            """.trimIndent()

        // Parse the XML document
        document = parseXml(xmlContent)

        // Parse the metadata
        val metadata = metadataParser.parse(metadataContent)

        // Create the processor
        processor = MetadataProcessor(metadata, document)

        // Apply the metadata
        processor.apply()

        // Assert that the c:include nodes have been updated
        val repositoryNode = document.documentElement
        val cIncludeNodes = processor.getChildNodesByName(repositoryNode, "c:include")

        assertEquals(2, cIncludeNodes.size, "There should be 2 c:include nodes")
        val cIncludeNames = cIncludeNodes.map { it.attributes.getNamedItem("name")?.nodeValue }
        assertTrue(cIncludeNames.contains("header1.h"), "c:include should contain 'header1.h'")
        assertTrue(cIncludeNames.contains("header2.h"), "c:include should contain 'header2.h'")
    }

    @Test
    fun `test apply COPY_FUNCTION argument to boxed node`() {
        val xmlContent =
            """
                <repository>
                  <namespace name="TestNamespace">
                    <glib:boxed name="TestBoxed" />
                  </namespace>
                </repository>
            """.trimIndent()

        val metadataContent =
            """
                TestBoxed copy_function="test_copy_function"
            """.trimIndent()

        document = parseXml(xmlContent)
        val metadata = metadataParser.parse(metadataContent)
        processor = MetadataProcessor(metadata, document)
        processor.apply()

        val boxedNode = findNodeByName(document.documentElement, "glib:boxed", "TestBoxed")
        assertNotNull(boxedNode)
        val copyFunctionAttr = boxedNode.attributes.getNamedItem("copy-function")?.nodeValue
        assertEquals(
            "test_copy_function",
            copyFunctionAttr,
            "The 'copy-function' attribute should be 'test_copy_function'",
        )
    }

    @Test
    fun `test apply CTYPE argument to class node`() {
        val xmlContent =
            """
                <repository>
                  <namespace name="TestNamespace">
                    <class name="TestClass" />
                  </namespace>
                </repository>
            """.trimIndent()

        val metadataContent =
            """
                TestClass ctype="TestCType"
            """.trimIndent()

        document = parseXml(xmlContent)
        val metadata = metadataParser.parse(metadataContent)
        processor = MetadataProcessor(metadata, document)
        processor.apply()

        val classNode = findNodeByName(document.documentElement, "class", "TestClass")
        assertNotNull(classNode)
        val cTypeAttr = classNode.attributes.getNamedItem("c:type")?.nodeValue
        assertEquals("TestCType", cTypeAttr, "The 'c:type' attribute should be 'TestCType'")
    }

    @Test
    fun `test apply DEFAULT argument to parameter node`() {
        // Prepare the XML document
        val xmlContent =
            """
                <repository>
                  <namespace name="TestNamespace">
                    <class name="TestClass">
                      <method name="test_method">
                        <parameters>
                          <parameter name="param1" />
                        </parameters>
                      </method>
                    </class>
                  </namespace>
                </repository>
            """.trimIndent()

        // Prepare the metadata content
        val metadataContent =
            """
                TestClass.test_method.param1 default="42"
            """.trimIndent()

        // Parse the XML document
        document = parseXml(xmlContent)

        // Parse the metadata
        val metadata = metadataParser.parse(metadataContent)

        // Create the processor
        processor = MetadataProcessor(metadata, document)

        // Apply the metadata
        processor.apply()

        // Find the parameter node
        val paramNode = findNodeByName(document.documentElement, "parameter", "param1")
        assertNotNull(paramNode)

        val defaultAttr = paramNode.attributes.getNamedItem("gtk-kn-default")?.nodeValue
        assertEquals("42", defaultAttr, "The 'gtk-kn-default' attribute should be '42'")
    }

    @Test
    fun `test apply DELEGATE_TARGET argument to callback node`() {
        val xmlContent =
            """
                <repository>
                  <namespace name="TestNamespace">
                    <callback name="TestCallback" />
                  </namespace>
                </repository>
            """.trimIndent()

        val metadataContent =
            """
                TestCallback delegate_target=true
            """.trimIndent()

        document = parseXml(xmlContent)
        val metadata = metadataParser.parse(metadataContent)
        processor = MetadataProcessor(metadata, document)
        processor.apply()

        val callbackNode = findNodeByName(document.documentElement, "callback", "TestCallback")
        assertNotNull(callbackNode)
        val delegateTargetAttr = callbackNode.attributes.getNamedItem("gtk-kn-delegate-target")?.nodeValue?.toBoolean()
        assertTrue(delegateTargetAttr == true, "The 'gtk-kn-delegate-target' attribute should be true")
    }

    @Test
    fun `test apply DELEGATE_TARGET_CNAME argument to callback node`() {
        val xmlContent =
            """
                <repository>
                  <namespace name="TestNamespace">
                    <callback name="TestCallback" />
                  </namespace>
                </repository>
            """.trimIndent()

        val metadataContent =
            """
                TestCallback delegate_target_cname="test_delegate_target_cname"
            """.trimIndent()

        document = parseXml(xmlContent)
        val metadata = metadataParser.parse(metadataContent)
        processor = MetadataProcessor(metadata, document)
        processor.apply()

        val callbackNode = findNodeByName(document.documentElement, "callback", "TestCallback")
        assertNotNull(callbackNode)
        val cnameAttr = callbackNode.attributes.getNamedItem("gtk-kn-delegate-target-cname")?.nodeValue
        assertEquals(
            "test_delegate_target_cname",
            cnameAttr,
            "The 'gtk-kn-delegate-target-cname' attribute should be 'test_delegate_target_cname'",
        )
    }

    @Test
    fun `test apply DEPRECATED argument to function node`() {
        // Prepare the XML document
        val xmlContent =
            """
                <repository>
                  <namespace name="TestNamespace">
                    <class name="DeprecatedClass">
                      <method name="old_method" />
                    </class>
                  </namespace>
                </repository>
            """.trimIndent()

        // Prepare the metadata content
        val metadataContent =
            """
                DeprecatedClass.old_method deprecated
            """.trimIndent()

        // Parse the XML document
        document = parseXml(xmlContent)

        // Parse the metadata
        val metadata = metadataParser.parse(metadataContent)

        // Create the processor
        processor = MetadataProcessor(metadata, document)

        // Apply the metadata
        processor.apply()

        // Find the method node
        val methodNode = findNodeByName(document.documentElement, "method", "old_method")
        assertNotNull(methodNode)

        val deprecatedAttr = methodNode.attributes.getNamedItem("deprecated")?.nodeValue?.toBoolean()
        assertTrue(deprecatedAttr == true, "The 'deprecated' attribute should be true")
    }

    @Test
    fun `test apply DEPRECATED_SINCE argument to class node`() {
        // Prepare the XML document
        val xmlContent =
            """
                <repository>
                  <namespace name="TestNamespace">
                    <class name="OldClass" />
                  </namespace>
                </repository>
            """.trimIndent()

        // Prepare the metadata content
        val metadataContent =
            """
                OldClass deprecated_since="2.0"
            """.trimIndent()

        // Parse the XML document
        document = parseXml(xmlContent)

        // Parse the metadata
        val metadata = metadataParser.parse(metadataContent)

        // Create the processor
        processor = MetadataProcessor(metadata, document)

        // Apply the metadata
        processor.apply()

        // Find the class node
        val classNode = findNodeByName(document.documentElement, "class", "OldClass")
        assertNotNull(classNode)

        val deprecatedVersion = classNode.attributes.getNamedItem("deprecated-version")?.nodeValue
        assertEquals("2.0", deprecatedVersion, "The 'deprecated-version' attribute should be '2.0'")
    }

    @Test
    fun `test apply DESTROY_NOTIFY_CNAME argument to parameter node`() {
        val xmlContent =
            """
                <repository>
                  <namespace name="TestNamespace">
                    <function name="test_function">
                      <parameters>
                        <parameter name="param1" />
                      </parameters>
                    </function>
                  </namespace>
                </repository>
            """.trimIndent()

        val metadataContent =
            """
                test_function.param1 destroy_notify_cname="test_destroy_notify_cname"
            """.trimIndent()

        document = parseXml(xmlContent)
        val metadata = metadataParser.parse(metadataContent)
        processor = MetadataProcessor(metadata, document)
        processor.apply()

        val paramNode = findNodeByName(document.documentElement, "parameter", "param1")
        assertNotNull(paramNode)
        val cnameAttr = paramNode.attributes.getNamedItem("gtk-kn-destroy-notify-cname")?.nodeValue
        assertEquals(
            "test_destroy_notify_cname",
            cnameAttr,
            "The 'gtk-kn-destroy-notify-cname' attribute should be 'test_destroy_notify_cname'",
        )
    }

    @Test
    fun `test apply ERRORDOMAIN argument to enumeration node`() {
        // Prepare the XML document
        val xmlContent =
            """
                <repository>
                  <namespace name="TestNamespace">
                    <enumeration name="ErrorEnum" />
                  </namespace>
                </repository>
            """.trimIndent()

        // Prepare the metadata content
        val metadataContent =
            """
                ErrorEnum errordomain="test-error-domain"
            """.trimIndent()

        // Parse the XML document
        document = parseXml(xmlContent)

        // Parse the metadata
        val metadata = metadataParser.parse(metadataContent)

        // Create the processor
        processor = MetadataProcessor(metadata, document)

        // Apply the metadata
        processor.apply()

        // Find the enumeration node
        val enumNode = findNodeByName(document.documentElement, "enumeration", "ErrorEnum")
        assertNotNull(enumNode)

        val errorDomainAttr = enumNode.attributes.getNamedItem("glib:error-domain")?.nodeValue
        assertEquals(
            "test-error-domain",
            errorDomainAttr,
            "The 'glib:error-domain' attribute should be 'test-error-domain'",
        )
    }

    @Test
    fun `test apply FLOATING argument to class node`() {
        val xmlContent =
            """
                <repository>
                  <namespace name="TestNamespace">
                    <class name="TestClass" />
                  </namespace>
                </repository>
            """.trimIndent()

        val metadataContent =
            """
                TestClass floating=true
            """.trimIndent()

        document = parseXml(xmlContent)
        val metadata = metadataParser.parse(metadataContent)
        processor = MetadataProcessor(metadata, document)
        processor.apply()

        val classNode = findNodeByName(document.documentElement, "class", "TestClass")
        assertNotNull(classNode)
        val floatingAttr = classNode.attributes.getNamedItem("gtk-kn-floating")?.nodeValue?.toBoolean()
        assertTrue(floatingAttr == true, "The 'gtk-kn-floating' attribute should be true")
    }

    @Test
    fun `test apply FREE_FUNCTION argument to boxed node`() {
        val xmlContent =
            """
                <repository>
                  <namespace name="TestNamespace">
                    <glib:boxed name="TestBoxed" />
                  </namespace>
                </repository>
            """.trimIndent()

        val metadataContent =
            """
                TestBoxed free_function="test_free_function"
            """.trimIndent()

        document = parseXml(xmlContent)
        val metadata = metadataParser.parse(metadataContent)
        processor = MetadataProcessor(metadata, document)
        processor.apply()

        val boxedNode = findNodeByName(document.documentElement, "glib:boxed", "TestBoxed")
        assertNotNull(boxedNode)
        val freeFunctionAttr = boxedNode.attributes.getNamedItem("free-function")?.nodeValue
        assertEquals(
            "test_free_function",
            freeFunctionAttr,
            "The 'free-function' attribute should be 'test_free_function'",
        )
    }

    @Test
    fun `test apply HIDDEN argument to node`() {
        // Prepare the XML document
        val xmlContent =
            """
                <repository>
                    <namespace name="TestNamespace">
                        <class name="HiddenClass"/>
                    </namespace>
                </repository>
            """.trimIndent()

        // Prepare the metadata content
        val metadataContent =
            """
                HiddenClass hidden = true
            """.trimIndent()

        // Parse the XML document
        document = parseXml(xmlContent)

        // Parse the metadata
        val metadata = metadataParser.parse(metadataContent)

        // Create the processor
        processor = MetadataProcessor(metadata, document)

        // Apply the metadata
        processor.apply()

        // Assert that the 'introspectable' attribute is set to 'false' on the HiddenClass node
        val hiddenClassNode = findNodeByName(document.documentElement, "class", "HiddenClass")
        assertNotNull(hiddenClassNode)
        val introspectable = hiddenClassNode.attributes.getNamedItem("introspectable")?.nodeValue?.toBoolean()
        assertFalse(introspectable != false, "The 'introspectable' attribute should be false")
    }

    @Test
    fun `test apply INSTANCE_IDX argument to function node`() {
        // Prepare the XML document
        val xmlContent =
            """
                <repository>
                  <namespace name="TestNamespace">
                    <function name="test_function" />
                  </namespace>
                </repository>
            """.trimIndent()

        // Prepare the metadata content
        val metadataContent =
            """
                test_function instance_idx=1
            """.trimIndent()

        // Parse the XML document
        document = parseXml(xmlContent)
        val metadata = metadataParser.parse(metadataContent)
        processor = MetadataProcessor(metadata, document)
        processor.apply()

        val functionNode = findNodeByName(document.documentElement, "function", "test_function")
        assertNotNull(functionNode)
        val instanceIdxAttr = functionNode.attributes.getNamedItem("instance-idx")?.nodeValue
        assertEquals("1", instanceIdxAttr, "The 'instance-idx' attribute should be '1'")
    }

    @Test
    fun `test apply NAME argument to method node with simple replacement`() {
        // Prepare the XML document
        val xmlContent =
            """
                <repository>
                  <namespace name="TestNamespace">
                    <class name="TestClass">
                      <method name="old_method" />
                    </class>
                  </namespace>
                </repository>
            """.trimIndent()

        // Prepare the metadata content
        val metadataContent =
            """
                TestClass.old_method name="new_method"
            """.trimIndent()

        // Parse the XML document
        document = parseXml(xmlContent)

        // Parse the metadata
        val metadata = metadataParser.parse(metadataContent)

        // Create the processor
        processor = MetadataProcessor(metadata, document)

        // Apply the metadata
        processor.apply()

        // Find the method node
        val methodNode = findNodeByName(document.documentElement, "method", "new_method")
        assertNotNull(methodNode, "The method node should be renamed to 'new_method'")

        // Ensure the old method name does not exist
        val oldMethodNode = findNodeByName(document.documentElement, "method", "old_method")
        assertNull(oldMethodNode, "The old method name 'old_method' should not exist")
    }

    @Test
    fun `test apply NAME argument to method node with regex replacement to remove prefix`() {
        // Prepare the XML document
        val xmlContent =
            """
                <repository>
                  <namespace name="TestNamespace">
                    <class name="TestClass">
                      <method name="new_method" />
                    </class>
                  </namespace>
                </repository>
            """.trimIndent()

        // Prepare the metadata content
        val metadataContent =
            """
                TestClass.new_method name="new_(.+)"
            """.trimIndent()

        // Parse the XML document
        document = parseXml(xmlContent)

        // Parse the metadata
        val metadata = metadataParser.parse(metadataContent)

        // Create the processor
        processor = MetadataProcessor(metadata, document)

        // Apply the metadata
        processor.apply()

        // Find the method node
        val methodNode = findNodeByName(document.documentElement, "method", "method")
        assertNotNull(methodNode, "The method node should be renamed to 'method'")

        // Ensure the old method name does not exist
        val oldMethodNode = findNodeByName(document.documentElement, "method", "new_method")
        assertNull(oldMethodNode, "The old method name 'new_method' should not exist")
    }

    @Test
    fun `test apply NAME argument to method node with regex replacement`() {
        // Prepare the XML document
        val xmlContent =
            """
                <repository>
                  <namespace name="TestNamespace">
                    <class name="TestClass">
                      <method name="old_method" />
                    </class>
                  </namespace>
                </repository>
            """.trimIndent()

        // Prepare the metadata content
        val metadataContent =
            """
                TestClass.old_method name="(old)_(method)/new_$1"
            """.trimIndent()

        // Parse the XML document
        document = parseXml(xmlContent)

        // Parse the metadata
        val metadata = metadataParser.parse(metadataContent)

        // Create the processor
        processor = MetadataProcessor(metadata, document)

        // Apply the metadata
        processor.apply()

        // Find the method node with the new name
        val methodNode = findNodeByName(document.documentElement, "method", "new_old")
        assertNotNull(methodNode, "The method node should be renamed to 'new_old'")

        // Ensure the old method name does not exist
        val oldMethodNode = findNodeByName(document.documentElement, "method", "old_method")
        assertNull(oldMethodNode, "The old method name 'old_method' should not exist")
    }

    @Test
    fun `test apply NAME argument to remove prefix and suffix from parameter names`() {
        // Prepare the XML document
        val xmlContent =
            """
                <repository>
                  <namespace name="TestNamespace">
                    <class name="TestClass">
                      <method name="new_method">
                        <parameters>
                          <parameter name="_index_" />
                        </parameters>
                      </method>
                    </class>
                  </namespace>
                </repository>
            """.trimIndent()

        // Prepare the metadata content
        val metadataContent =
            """
                *.*.*#parameter name="^_(.+)_$/$1"
            """.trimIndent()

        // Parse the XML document
        document = parseXml(xmlContent)

        // Parse the metadata
        val metadata = metadataParser.parse(metadataContent)

        // Create the processor
        processor = MetadataProcessor(metadata, document)

        // Apply the metadata
        processor.apply()

        // Find the parameter node with the new name
        val paramNode = findNodeByName(document.documentElement, "parameter", "index")
        assertNotNull(paramNode, "The parameter node should be renamed to 'index'")

        // Ensure the old parameter name does not exist
        val oldParamNode = findNodeByName(document.documentElement, "parameter", "_index_")
        assertNull(oldParamNode, "The old parameter name '_index_' should not exist")
    }

    @Test
    fun `test apply NAME argument to replace dashes with underscores in parameter names`() {
        // Prepare the XML document
        val xmlContent =
            """
                <repository>
                  <namespace name="TestNamespace">
                    <class name="TestClass">
                      <method name="testMethod">
                        <parameters>
                          <parameter name="this-is-a-test" />
                        </parameters>
                      </method>
                    </class>
                  </namespace>
                </repository>
            """.trimIndent()

        // Prepare the metadata content
        val metadataContent =
            """
                *.*.*#parameter name="-/_"
            """.trimIndent()

        // Parse the XML document
        document = parseXml(xmlContent)

        // Parse the metadata
        val metadata = metadataParser.parse(metadataContent)

        // Create the processor
        processor = MetadataProcessor(metadata, document)

        // Apply the metadata
        processor.apply()

        // Find the parameter node with the new name
        val paramNode = findNodeByName(document.documentElement, "parameter", "this_is_a_test")
        assertNotNull(paramNode, "The parameter name should have dashes replaced with underscores")

        // Ensure the old parameter name does not exist
        val oldParamNode = findNodeByName(document.documentElement, "parameter", "this-is-a-test")
        assertNull(oldParamNode, "The old parameter name 'this-is-a-test' should not exist")
    }

    @Test
    fun `test apply NO_ACCESSOR_METHOD argument to property node`() {
        val xmlContent =
            """
                <repository>
                  <namespace name="TestNamespace">
                    <class name="TestClass">
                       <method name="test_method" />
                    </class>
                  </namespace>
                </repository>
            """.trimIndent()

        val metadataContent =
            """
                TestClass.test_method no_accessor_method
            """.trimIndent()

        document = parseXml(xmlContent)
        val metadata = metadataParser.parse(metadataContent)
        processor = MetadataProcessor(metadata, document)
        processor.apply()

        val methodNode = findNodeByName(document.documentElement, "method", "test_method")
        assertNotNull(methodNode)
        val noAccessorMethodAttr =
            methodNode.attributes.getNamedItem("gtk-kn-no-accessor-method")?.nodeValue?.toBoolean()
        assertTrue(noAccessorMethodAttr == true, "The 'gtk-kn-no-accessor-method' attribute should be true")
    }

    @Test
    fun `test apply NULLABLE argument to parameter node`() {
        // Prepare the XML document
        val xmlContent =
            """
                <repository>
                  <namespace name="TestNamespace">
                    <class name="TestClass">
                      <method name="test_method">
                        <parameters>
                          <parameter name="param1" />
                        </parameters>
                      </method>
                    </class>
                  </namespace>
                </repository>
            """.trimIndent()

        // Prepare the metadata content
        val metadataContent =
            """
                TestClass.test_method.param1 nullable
            """.trimIndent()

        // Parse the XML document
        document = parseXml(xmlContent)

        // Parse the metadata
        val metadata = metadataParser.parse(metadataContent)

        // Create the processor
        processor = MetadataProcessor(metadata, document)

        // Apply the metadata
        processor.apply()

        // Find the parameter node
        val paramNode = findNodeByName(document.documentElement, "parameter", "param1")
        assertNotNull(paramNode)

        val nullableAttr = paramNode.attributes.getNamedItem("nullable")?.nodeValue?.toBoolean()
        assertTrue(nullableAttr == true, "The 'nullable' attribute should be true")
    }

    @Test
    fun `test apply OUT argument to parameter node`() {
        // Prepare the XML document
        val xmlContent =
            """
                <repository>
                  <namespace name="TestNamespace">
                    <class name="TestClass">
                      <method name="test_method">
                        <parameters>
                          <parameter name="param1" />
                        </parameters>
                      </method>
                    </class>
                  </namespace>
                </repository>
            """.trimIndent()

        // Prepare the metadata content
        val metadataContent =
            """
                TestClass.test_method.param1 out=true
            """.trimIndent()

        // Parse the XML document
        document = parseXml(xmlContent)

        // Parse the metadata
        val metadata = metadataParser.parse(metadataContent)

        // Create the processor
        processor = MetadataProcessor(metadata, document)

        // Apply the metadata
        processor.apply()

        // Find the parameter node
        val paramNode = findNodeByName(document.documentElement, "parameter", "param1")
        assertNotNull(paramNode)

        val directionAttr = paramNode.attributes.getNamedItem("direction")?.nodeValue
        assertEquals("out", directionAttr, "The 'direction' attribute should be 'out'")
    }

    @Test
    fun `test apply OWNED argument to parameter node`() {
        // Prepare the XML document
        val xmlContent =
            """
                <repository>
                  <namespace name="TestNamespace">
                    <class name="TestClass">
                      <method name="test_method">
                        <parameters>
                          <parameter name="param1" />
                        </parameters>
                      </method>
                    </class>
                  </namespace>
                </repository>
            """.trimIndent()

        // Prepare the metadata content
        val metadataContent =
            """
                TestClass.test_method.param1 owned=true
            """.trimIndent()

        // Parse the XML document
        document = parseXml(xmlContent)

        // Parse the metadata
        val metadata = metadataParser.parse(metadataContent)

        // Create the processor
        processor = MetadataProcessor(metadata, document)

        // Apply the metadata
        processor.apply()

        // Find the parameter nodes
        val paramNode1 = findNodeByName(document.documentElement, "parameter", "param1")
        assertNotNull(paramNode1)

        val transferOwnership = paramNode1.attributes.getNamedItem("transfer-ownership")?.nodeValue
        assertEquals("full", transferOwnership, "transfer-ownership should be 'full'")
    }

    @Test
    fun `test apply PARENT should throw IllegalStateException when parent argument is invalid `() {
        // Prepare the XML document
        val xmlContent =
            """
                <repository>
                  <namespace name="TestNamespace">
                    <class name="TestClass">
                      <method name="test_method" />
                    </class>
                  </namespace>
                </repository>
            """.trimIndent()

        // Prepare the metadata content
        val metadataContent =
            """
                TestClass.test_method parent="TestNamespace.NewClass"
            """.trimIndent()

        // Parse the XML document
        document = parseXml(xmlContent)

        // Parse the metadata
        val metadata = metadataParser.parse(metadataContent)

        // Create the processor
        processor = MetadataProcessor(metadata, document)

        // Apply the metadata and assert that it throws IllegalStateException
        assertThrows<IllegalStateException> {
            processor.apply()
        }
    }

    @Test
    fun `test apply PARENT argument to method node to existing parent`() {
        // Prepare the XML document
        val xmlContent =
            """
                <repository>
                  <namespace name="TestNamespace">
                    <class name="OriginClass">
                      <method name="test_method" />
                    </class>
                    <class name="DestinationClass" />
                  </namespace>
                </repository>
            """.trimIndent()

        // Prepare the metadata content
        val metadataContent =
            """
                OriginClass.test_method parent="TestNamespace.DestinationClass"
            """.trimIndent()

        // Parse the XML document
        document = parseXml(xmlContent)

        // Parse the metadata
        val metadata = metadataParser.parse(metadataContent)

        // Create the processor
        processor = MetadataProcessor(metadata, document)

        // Apply the metadata
        processor.apply()

        // Find the new parent class node
        val newClassNode = findNodeByName(document.documentElement, "class", "DestinationClass")
        assertNotNull(newClassNode, "The new parent class 'DestinationClass' should exist")

        // Check that 'test_method' is now a child of 'DestinationClass'
        val methodNode = findNodeByName(newClassNode, "method", "test_method")
        assertNotNull(methodNode, "The method 'test_method' should be moved under 'DestinationClass'")

        // Ensure 'test_method' is no longer under 'OriginClass'
        val oldParentNode = checkNotNull(findNodeByName(document.documentElement, "class", "OriginClass"))
        val oldMethodNode = findNodeByName(oldParentNode, "method", "test_method")
        assertNull(oldMethodNode, "The method 'test_method' should not be under 'OriginClass' anymore")
    }

    @Test
    fun `test apply REF argument to parameter node`() {
        // Prepare the XML document
        val xmlContent =
            """
                <repository>
                  <namespace name="TestNamespace">
                    <class name="TestClass">
                      <method name="test_method">
                        <parameters>
                          <parameter name="param1" />
                        </parameters>
                      </method>
                    </class>
                  </namespace>
                </repository>
            """.trimIndent()

        // Prepare the metadata content
        val metadataContent =
            """
                TestClass.test_method.param1 ref=true
            """.trimIndent()

        // Parse the XML document
        document = parseXml(xmlContent)

        // Parse the metadata
        val metadata = metadataParser.parse(metadataContent)

        // Create the processor
        processor = MetadataProcessor(metadata, document)

        // Apply the metadata
        processor.apply()

        // Find the parameter node
        val paramNode = findNodeByName(document.documentElement, "parameter", "param1")
        assertNotNull(paramNode)

        val directionAttr = paramNode.attributes.getNamedItem("direction")?.nodeValue
        assertEquals("inout", directionAttr, "The 'direction' attribute should be 'inout'")
    }

    @Test
    fun `test apply REF_FUNCTION argument to class node`() {
        val xmlContent =
            """
                <repository>
                  <namespace name="TestNamespace">
                    <class name="TestClass" />
                  </namespace>
                </repository>
            """.trimIndent()

        val metadataContent =
            """
                TestClass ref_function="test_ref_function"
            """.trimIndent()

        document = parseXml(xmlContent)
        val metadata = metadataParser.parse(metadataContent)
        processor = MetadataProcessor(metadata, document)
        processor.apply()

        val classNode = findNodeByName(document.documentElement, "class", "TestClass")
        assertNotNull(classNode)
        val refFuncAttr = classNode.attributes.getNamedItem("glib:ref-func")?.nodeValue
        assertEquals("test_ref_function", refFuncAttr, "The 'glib:ref-func' attribute should be 'test_ref_function'")
    }

    @Test
    fun `test apply REF_SYNC_FUNCTION argument to class node`() {
        val xmlContent =
            """
                <repository>
                  <namespace name="TestNamespace">
                    <class name="TestClass" />
                  </namespace>
                </repository>
            """.trimIndent()

        val metadataContent =
            """
                TestClass ref_sink_function="test_ref_sink_function"
            """.trimIndent()

        document = parseXml(xmlContent)
        val metadata = metadataParser.parse(metadataContent)
        processor = MetadataProcessor(metadata, document)
        processor.apply()

        val classNode = findNodeByName(document.documentElement, "class", "TestClass")
        assertNotNull(classNode)
        val refSyncFuncAttr = classNode.attributes.getNamedItem("gtk-kn-ref-sink-function")?.nodeValue
        assertEquals(
            "test_ref_sink_function",
            refSyncFuncAttr,
            "The 'gtk-kn-ref-sink-function' attribute should be 'test_ref_function'",
        )
    }

    @Test
    fun `test apply REPLACEMENT argument to function node`() {
        // Prepare the XML document
        val xmlContent =
            """
                <repository>
                  <namespace name="TestNamespace">
                    <class name="DeprecatedClass">
                      <method name="old_method" />
                    </class>
                  </namespace>
                </repository>
            """.trimIndent()

        // Prepare the metadata content
        val metadataContent =
            """
                DeprecatedClass.old_method replacement="new_method"
            """.trimIndent()

        // Parse the XML document
        document = parseXml(xmlContent)

        // Parse the metadata
        val metadata = metadataParser.parse(metadataContent)

        // Create the processor
        processor = MetadataProcessor(metadata, document)

        // Apply the metadata
        processor.apply()

        // Find the method node
        val methodNode = findNodeByName(document.documentElement, "method", "old_method")
        assertNotNull(methodNode)

        val movedToAttr = methodNode.attributes.getNamedItem("moved-to")?.nodeValue
        assertEquals("new_method", movedToAttr, "The 'moved-to' attribute should be 'new_method'")
    }

    @Test
    fun `test apply RETURNS_MODIFIED_POINTER argument to function node`() {
        val xmlContent =
            """
                <repository>
                  <namespace name="TestNamespace">
                    <function name="test_function" />
                  </namespace>
                </repository>
            """.trimIndent()

        val metadataContent =
            """
                test_function returns_modified_pointer=true
            """.trimIndent()

        document = parseXml(xmlContent)
        val metadata = metadataParser.parse(metadataContent)
        processor = MetadataProcessor(metadata, document)
        processor.apply()

        val functionNode = findNodeByName(document.documentElement, "function", "test_function")
        assertNotNull(functionNode)
        val retModPointerAttr =
            functionNode.attributes.getNamedItem("gtk-kn-returns-modified-pointer")?.nodeValue?.toBoolean()
        assertTrue(retModPointerAttr == true, "The 'gtk-kn-returns-modified-pointer' attribute should be true")
    }

    @Test
    fun `test apply SCOPE argument to callback node`() {
        // Prepare the XML document
        val xmlContent =
            """
                <repository>
                  <namespace name="TestNamespace">
                    <callback name="TestCallback" />
                  </namespace>
                </repository>
            """.trimIndent()

        // Prepare the metadata content
        val metadataContent =
            """
                TestCallback scope="async"
            """.trimIndent()

        // Parse the XML document
        document = parseXml(xmlContent)

        // Parse the metadata
        val metadata = metadataParser.parse(metadataContent)

        // Create the processor
        processor = MetadataProcessor(metadata, document)

        // Apply the metadata
        processor.apply()

        // Find the callback node
        val callbackNode = findNodeByName(document.documentElement, "callback", "TestCallback")
        assertNotNull(callbackNode)

        val scopeAttr = callbackNode.attributes.getNamedItem("scope")?.nodeValue
        assertEquals("async", scopeAttr, "The 'scope' attribute should be 'async'")
    }

    @Test
    fun `test apply SEALED argument to class node`() {
        // Prepare the XML document
        val xmlContent =
            """
                <repository>
                  <namespace name="TestNamespace">
                    <class name="SealedClass" />
                  </namespace>
                </repository>
            """.trimIndent()

        // Prepare the metadata content
        val metadataContent =
            """
                SealedClass sealed=true
            """.trimIndent()

        // Parse the XML document
        document = parseXml(xmlContent)

        // Parse the metadata
        val metadata = metadataParser.parse(metadataContent)

        // Create the processor
        processor = MetadataProcessor(metadata, document)

        // Apply the metadata
        processor.apply()

        // Find the class node
        val classNode = findNodeByName(document.documentElement, "class", "SealedClass")
        assertNotNull(classNode)

        val finalAttr = classNode.attributes.getNamedItem("final")?.nodeValue?.toBoolean()
        assertTrue(finalAttr == true, "The 'final' attribute should be true")
    }

    @Test
    fun `test apply SINCE argument to method node`() {
        // Prepare the XML document
        val xmlContent =
            """
                <repository>
                  <namespace name="TestNamespace">
                    <class name="TestClass">
                      <method name="new_method" />
                    </class>
                  </namespace>
                </repository>
            """.trimIndent()

        // Prepare the metadata content
        val metadataContent =
            """
                TestClass.new_method since="1.5"
            """.trimIndent()

        // Parse the XML document
        document = parseXml(xmlContent)

        // Parse the metadata
        val metadata = metadataParser.parse(metadataContent)

        // Create the processor
        processor = MetadataProcessor(metadata, document)

        // Apply the metadata
        processor.apply()

        // Find the method node
        val methodNode = findNodeByName(document.documentElement, "method", "new_method")
        assertNotNull(methodNode)

        val versionAttr = methodNode.attributes.getNamedItem("version")?.nodeValue
        assertEquals("1.5", versionAttr, "The 'version' attribute should be '1.5'")
    }

    @Test
    fun `test apply SKIP argument to node`() {
        // Prepare the XML document
        val xmlContent =
            """
                <repository>
                    <namespace name="TestNamespace">
                        <class name="TestClass"/>
                    </namespace>
                </repository>
            """.trimIndent()

        // Prepare the metadata content
        val metadataContent =
            """
                TestClass skip = true
            """.trimIndent()

        // Parse the XML document
        document = parseXml(xmlContent)

        // Parse the metadata
        val metadata = metadataParser.parse(metadataContent)

        // Create the processor
        processor = MetadataProcessor(metadata, document)

        // Apply the metadata
        processor.apply()

        // Assert that the 'introspectable' attribute is set to 'false' on the TestClass node
        val testClassNode = findNodeByName(document.documentElement, "class", "TestClass")
        assertNotNull(testClassNode)
        val introspectable = testClassNode.attributes.getNamedItem("introspectable")?.nodeValue?.toBoolean()
        assertFalse(introspectable != false, "The 'introspectable' attribute should be false")
    }

    @Test
    fun `test apply THROWS argument to function node`() {
        // Prepare the XML document
        val xmlContent =
            """
                <repository>
                  <namespace name="TestNamespace">
                    <class name="TestClass">
                      <method name="throwing_method" />
                    </class>
                  </namespace>
                </repository>
            """.trimIndent()

        // Prepare the metadata content
        val metadataContent =
            """
                TestClass.throwing_method throws=true
            """.trimIndent()

        // Parse the XML document
        document = parseXml(xmlContent)

        // Parse the metadata
        val metadata = metadataParser.parse(metadataContent)

        // Create the processor
        processor = MetadataProcessor(metadata, document)

        // Apply the metadata
        processor.apply()

        // Find the function node
        val methodNode = findNodeByName(document.documentElement, "method", "throwing_method")
        assertNotNull(methodNode)

        val throwsAttr = methodNode.attributes.getNamedItem("throws")?.nodeValue?.toBoolean()
        assertTrue(throwsAttr == true, "The 'throws' attribute should be true")
    }

    @Test
    fun `test apply TYPE_ID argument to class node`() {
        val xmlContent =
            """
                <repository>
                  <namespace name="TestNamespace">
                    <class name="TestClass" />
                  </namespace>
                </repository>
            """.trimIndent()

        val metadataContent =
            """
                TestClass type_id="test_get_type"
            """.trimIndent()

        document = parseXml(xmlContent)
        val metadata = metadataParser.parse(metadataContent)
        processor = MetadataProcessor(metadata, document)
        processor.apply()

        val classNode = findNodeByName(document.documentElement, "class", "TestClass")
        assertNotNull(classNode)
        val getTypeAttr = classNode.attributes.getNamedItem("glib:get-type")?.nodeValue
        assertEquals("test_get_type", getTypeAttr, "The 'glib:get-type' attribute should be 'test_get_type'")
    }

    @Test
    fun `test apply UNOWNED argument to return-value node`() {
        // Prepare the XML document
        val xmlContent =
            """
                <repository>
                  <namespace name="TestNamespace">
                    <class name="TestClass">
                      <method name="test_method">
                        <return-value />
                      </method>
                    </class>
                  </namespace>
                </repository>
            """.trimIndent()

        // Prepare the metadata content
        val metadataContent =
            """
                TestClass.test_method unowned=true
            """.trimIndent()

        // Parse the XML document
        document = parseXml(xmlContent)

        // Parse the metadata
        val metadata = metadataParser.parse(metadataContent)

        // Create the processor
        processor = MetadataProcessor(metadata, document)

        // Apply the metadata
        processor.apply()

        // Find the return-value node
        val returnValueNode = findNodeByName(document.documentElement, "return-value", null)
        assertNotNull(returnValueNode)

        val transferOwnership = returnValueNode.attributes.getNamedItem("transfer-ownership")?.nodeValue
        assertEquals("none", transferOwnership, "transfer-ownership should be 'none'")
    }

    @Test
    fun `test apply UNREF_FUNCTION argument to class node`() {
        val xmlContent =
            """
                <repository>
                  <namespace name="TestNamespace">
                    <class name="TestClass" />
                  </namespace>
                </repository>
            """.trimIndent()

        val metadataContent =
            """
                TestClass unref_function="test_unref_function"
            """.trimIndent()

        document = parseXml(xmlContent)
        val metadata = metadataParser.parse(metadataContent)
        processor = MetadataProcessor(metadata, document)
        processor.apply()

        val classNode = findNodeByName(document.documentElement, "class", "TestClass")
        assertNotNull(classNode)
        val unrefFuncAttr = classNode.attributes.getNamedItem("glib:unref-func")?.nodeValue
        assertEquals(
            "test_unref_function",
            unrefFuncAttr,
            "The 'glib:unref-func' attribute should be 'test_unref_function'",
        )
    }

    @Test
    fun `test apply VIRTUAL argument to method node`() {
        // Prepare the XML document
        val xmlContent =
            """
                <repository>
                  <namespace name="TestNamespace">
                    <class name="TestClass">
                      <method name="virtual_method" />
                    </class>
                  </namespace>
                </repository>
            """.trimIndent()

        // Prepare the metadata content
        val metadataContent =
            """
                TestClass.virtual_method virtual=true
            """.trimIndent()

        // Parse the XML document
        document = parseXml(xmlContent)

        // Parse the metadata
        val metadata = metadataParser.parse(metadataContent)

        // Create the processor
        processor = MetadataProcessor(metadata, document)

        // Apply the metadata
        processor.apply()

        // Find the method node
        val methodNode = findNodeByName(document.documentElement, "method", "virtual_method")
        assertNotNull(methodNode)

        val virtualAttr = methodNode.attributes.getNamedItem("gtk-kn-virtual")?.nodeValue?.toBoolean()
        assertTrue(virtualAttr == true, "The 'gtk-kn-virtual' attribute should be true")
    }

    /**
     * Parses an XML string into a Document object.
     */
    private fun parseXml(xmlContent: String): Document {
        val factory = DocumentBuilderFactory.newInstance()
        val builder = factory.newDocumentBuilder()
        val inputSource = InputSource(StringReader(xmlContent))
        return builder.parse(inputSource)
    }

    /**
     * Finds a node by its tag name and name attribute.
     */
    private fun findNodeByName(node: Node, tagName: String, name: String?): Node? {
        if (node.nodeType == Node.ELEMENT_NODE && node.nodeName == tagName) {
            val nodeName = node.attributes?.getNamedItem("name")?.nodeValue
            if (nodeName == name) {
                return node
            }
        }
        val childNodes = node.childNodes
        for (i in 0 until childNodes.length) {
            val found = findNodeByName(childNodes.item(i), tagName, name)
            if (found != null) {
                return found
            }
        }
        return null
    }

    @Test
    fun `test node remains unchanged when no matching metadata`() {
        // Prepare the XML document
        val xmlContent =
            """
                <repository>
                    <namespace name="TestNamespace">
                        <class name="UnchangedClass"/>
                    </namespace>
                </repository>
            """.trimIndent()

        // Prepare empty metadata content
        val metadataContent =
            """
                SomeOtherClass skip = true
            """.trimIndent()

        // Parse the XML document
        document = parseXml(xmlContent)

        // Parse the metadata
        val metadata = metadataParser.parse(metadataContent)

        // Create the processor
        processor = MetadataProcessor(metadata, document)

        // Apply the metadata
        processor.apply()

        // Assert that the 'introspectable' attribute is not set on the UnchangedClass node
        val unchangedClassNode = findNodeByName(document.documentElement, "class", "UnchangedClass")
        assertNotNull(unchangedClassNode)
        val introspectable = unchangedClassNode.attributes.getNamedItem("introspectable")
        assertNull(introspectable, "The 'introspectable' attribute should not be set")
    }

    @Test
    fun `test process node when matchChild returns null`() {
        // Prepare the XML document
        val xmlContent =
            """
                <repository>
                    <namespace name="TestNamespace">
                        <class name="NullMatchClass"/>
                    </namespace>
                </repository>
            """.trimIndent()

        // Prepare metadata content that doesn't match
        val metadataContent =
            """
                SomeOtherClass skip = true
            """.trimIndent()

        // Parse the XML document
        document = parseXml(xmlContent)

        // Parse the metadata
        val metadata = metadataParser.parse(metadataContent)

        // Modify the matchChild function to return null (simulate the edge case)
        val mockMetadata = object : Metadata(metadata.pattern, metadata.selector) {
            override fun matchChild(name: String, selector: String?): Metadata? = null
        }

        // Create the processor with the mock metadata
        processor = MetadataProcessor(mockMetadata, document)

        // Apply the metadata
        processor.apply()

        // Assert that the 'introspectable' attribute is not set on the NullMatchClass node
        val nullMatchClassNode = findNodeByName(document.documentElement, "class", "NullMatchClass")
        assertNotNull(nullMatchClassNode)
        val introspectable = nullMatchClassNode.attributes.getNamedItem("introspectable")
        assertNull(introspectable, "The 'introspectable' attribute should not be set")
    }

    @Test
    fun `test processing child nodes when parent is not introspectable`() {
        // Prepare the XML document
        val xmlContent =
            """
                <repository>
                    <namespace name="TestNamespace">
                        <class name="ParentClass">
                            <method name="ChildMethod"/>
                        </class>
                    </namespace>
                </repository>
            """.trimIndent()

        // Prepare metadata to skip the parent class
        val metadataContent =
            """
                ParentClass skip = true
            """.trimIndent()

        // Parse the XML document
        document = parseXml(xmlContent)

        // Parse the metadata
        val metadata = metadataParser.parse(metadataContent)

        // Create the processor
        processor = MetadataProcessor(metadata, document)

        // Apply the metadata
        processor.apply()

        // Assert that the 'introspectable' attribute is set to 'false' on the ParentClass node
        val parentClassNode = findNodeByName(document.documentElement, "class", "ParentClass")
        assertNotNull(parentClassNode)
        val parentIntrospectable = parentClassNode.attributes.getNamedItem("introspectable")?.nodeValue?.toBoolean()
        assertFalse(parentIntrospectable != false, "Parent 'introspectable' should be false")

        // Assert that the child method is not processed (introspectable attribute is not set)
        val childMethodNode = findNodeByName(parentClassNode, "method", "ChildMethod")
        assertNotNull(childMethodNode)
        val childIntrospectable = childMethodNode.attributes.getNamedItem("introspectable")
        assertNull(childIntrospectable, "Child 'introspectable' attribute should not be set")
    }

    @Test
    fun `test getCurrentMetadata handles null name correctly`() {
        // Prepare the XML document with a node without a name
        val xmlContent =
            """
                <repository>
                    <namespace name="TestNamespace">
                        <union>
                            <field name="Field1"/>
                        </union>
                    </namespace>
                </repository>
            """.trimIndent()

        // Prepare metadata that matches 'union'
        val metadataContent =
            """
                union skip = true
            """.trimIndent()

        // Parse the XML document
        document = parseXml(xmlContent)

        // Parse the metadata
        val metadata = metadataParser.parse(metadataContent)

        // Create the processor
        processor = MetadataProcessor(metadata, document)

        // Apply the metadata
        processor.apply()

        // Assert that the 'introspectable' attribute is set to 'false' on the union node
        val unionNode = findNodeByName(document.documentElement, "union", null)
        assertNotNull(unionNode)
        val introspectable = unionNode.attributes.getNamedItem("introspectable")?.nodeValue?.toBoolean()
        assertFalse(introspectable != false, "The 'introspectable' attribute should be false for union")
    }

    @Test
    fun `test processing node with tag not in relevantTypes`() {
        // Prepare the XML document with a node not in relevantTypes
        val xmlContent =
            """
                <repository>
                    <namespace name="TestNamespace">
                        <someTag name="SomeNode"/>
                    </namespace>
                </repository>
            """.trimIndent()

        // Prepare metadata
        val metadataContent =
            """
                SomeNode skip = true
            """.trimIndent()

        // Parse the XML document
        document = parseXml(xmlContent)

        // Parse the metadata
        val metadata = metadataParser.parse(metadataContent)

        // Create the processor
        processor = MetadataProcessor(metadata, document)

        // Apply the metadata
        processor.apply()

        // Assert that the 'introspectable' attribute is not set on the SomeNode node
        val someNode = findNodeByName(document.documentElement, "someTag", "SomeNode")
        assertNotNull(someNode)
        val introspectable = someNode.attributes.getNamedItem("introspectable")
        assertNull(introspectable, "The 'introspectable' attribute should not be set for tags not in relevantTypes")
    }

    @Test
    fun `test multiple metadata entries matching correctly`() {
        // Prepare the XML document with multiple classes
        val xmlContent =
            """
                <repository>
                    <namespace name="TestNamespace">
                        <class name="FirstClass"/>
                        <class name="SecondClass"/>
                        <class name="ThirdClass"/>
                    </namespace>
                </repository>
            """.trimIndent()

        // Prepare metadata for multiple classes
        val metadataContent =
            """
                FirstClass skip = true
                SecondClass hidden = true
                ThirdClass skip = true
            """.trimIndent()

        // Parse the XML document
        document = parseXml(xmlContent)

        // Parse the metadata
        val metadata = metadataParser.parse(metadataContent)

        // Create the processor
        processor = MetadataProcessor(metadata, document)

        // Apply the metadata
        processor.apply()

        // Assert that the 'introspectable' attribute is set correctly on each class
        val firstClassNode = findNodeByName(document.documentElement, "class", "FirstClass")
        assertNotNull(firstClassNode)
        val firstIntrospectable = firstClassNode.attributes.getNamedItem("introspectable")?.nodeValue?.toBoolean()
        assertFalse(firstIntrospectable != false, "FirstClass 'introspectable' should be false")

        val secondClassNode = findNodeByName(document.documentElement, "class", "SecondClass")
        assertNotNull(secondClassNode)
        val secondIntrospectable = secondClassNode.attributes.getNamedItem("introspectable")?.nodeValue?.toBoolean()
        assertFalse(secondIntrospectable != false, "SecondClass 'introspectable' should be false")

        val thirdClassNode = findNodeByName(document.documentElement, "class", "ThirdClass")
        assertNotNull(thirdClassNode)
        val thirdIntrospectable = thirdClassNode.attributes.getNamedItem("introspectable")?.nodeValue?.toBoolean()
        assertFalse(thirdIntrospectable != false, "ThirdClass 'introspectable' should be false")
    }

    @Test
    fun `test node with no name and no matching metadata`() {
        // Prepare the XML document with a node without a name
        val xmlContent =
            """
                <repository>
                    <namespace name="TestNamespace">
                        <union>
                            <field name="Field1"/>
                        </union>
                    </namespace>
                </repository>
            """.trimIndent()

        // Prepare empty metadata content
        val metadataContent =
            """
                SomeOtherNode skip = true
            """.trimIndent()

        // Parse the XML document
        document = parseXml(xmlContent)

        // Parse the metadata
        val metadata = metadataParser.parse(metadataContent)

        // Create the processor
        processor = MetadataProcessor(metadata, document)

        // Apply the metadata
        processor.apply()

        // Assert that the 'introspectable' attribute is not set on the union node
        val unionNode = findNodeByName(document.documentElement, "union", null)
        assertNotNull(unionNode)
        val introspectable = unionNode.attributes.getNamedItem("introspectable")
        assertNull(
            introspectable,
            "The 'introspectable' attribute should not be set when name is null and no metadata match",
        )
    }
}
