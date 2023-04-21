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

package org.gtkkn.gir.parser

import org.gtkkn.gir.log.logger
import org.gtkkn.gir.model.GirAlias
import org.gtkkn.gir.model.GirAnnotation
import org.gtkkn.gir.model.GirAnyType
import org.gtkkn.gir.model.GirAnyTypeOrVarargs
import org.gtkkn.gir.model.GirArrayType
import org.gtkkn.gir.model.GirBitField
import org.gtkkn.gir.model.GirBoxed
import org.gtkkn.gir.model.GirCInclude
import org.gtkkn.gir.model.GirCallback
import org.gtkkn.gir.model.GirCallbackOrAnyType
import org.gtkkn.gir.model.GirClass
import org.gtkkn.gir.model.GirConstant
import org.gtkkn.gir.model.GirConstructor
import org.gtkkn.gir.model.GirDirection
import org.gtkkn.gir.model.GirDoc
import org.gtkkn.gir.model.GirDocDeprecated
import org.gtkkn.gir.model.GirDocElements
import org.gtkkn.gir.model.GirDocStability
import org.gtkkn.gir.model.GirDocVersion
import org.gtkkn.gir.model.GirEnum
import org.gtkkn.gir.model.GirField
import org.gtkkn.gir.model.GirFunction
import org.gtkkn.gir.model.GirImplements
import org.gtkkn.gir.model.GirInclude
import org.gtkkn.gir.model.GirInfo
import org.gtkkn.gir.model.GirInstanceParameter
import org.gtkkn.gir.model.GirInterface
import org.gtkkn.gir.model.GirMember
import org.gtkkn.gir.model.GirMethod
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.model.GirPackage
import org.gtkkn.gir.model.GirParameter
import org.gtkkn.gir.model.GirParameters
import org.gtkkn.gir.model.GirPrerequisite
import org.gtkkn.gir.model.GirProperty
import org.gtkkn.gir.model.GirRecord
import org.gtkkn.gir.model.GirRepository
import org.gtkkn.gir.model.GirReturnValue
import org.gtkkn.gir.model.GirScope
import org.gtkkn.gir.model.GirSignal
import org.gtkkn.gir.model.GirSourcePosition
import org.gtkkn.gir.model.GirTransferOwnership
import org.gtkkn.gir.model.GirType
import org.gtkkn.gir.model.GirUnion
import org.gtkkn.gir.model.GirVarArgs
import org.gtkkn.gir.model.GirVirtualMethod
import org.w3c.dom.Node
import org.xml.sax.InputSource
import java.io.File
import java.io.StringReader
import javax.xml.parsers.DocumentBuilderFactory

class GirParser {
    fun parse(file: File): GirRepository {
        logger.info("Parsing GIR file ${file.name}")

        val dbFactory = DocumentBuilderFactory.newInstance()
        val dBuilder = dbFactory.newDocumentBuilder()
        val xmlInput = InputSource(StringReader(file.readText()))
        val doc = dBuilder.parse(xmlInput)

        val repositoryNode = doc.singleChildWithName("repository")
        return parseGirRepository(repositoryNode)
    }
}

private fun parseGirRepository(node: Node): GirRepository = GirRepository(
    version = node.attributeValue("version"),
    cIdentifierPrefixes = node.attributeValueOrNull("c:identifier-prefixes"),
    cSymbolPrefixes = node.attributeValueOrNull("c:symbol-prefixes"),
    includes = node.childNodesWithName("include").map { parseGirInclude(it) },
    cIncludes = node.childNodesWithName("c:include").map { parseGirCInclude(it) },
    packages = node.childNodesWithName("package").map { parseGirPackage(it) },
    namespace = parseGirNamespace(node.singleChildWithName("namespace")),
)

private fun parseGirInclude(node: Node): GirInclude = GirInclude(
    name = node.attributeValue("name"),
    version = node.attributeValueOrNull("version"),
)

private fun parseGirCInclude(node: Node): GirCInclude = GirCInclude(
    name = node.attributeValue("name"),
)

private fun parseGirNamespace(node: Node): GirNamespace = GirNamespace(
    name = node.attributeValue("name"),
    version = node.attributeValue("version"),
    cIdentifierPrefixes = node.attributeValueOrNull("c:identifier-prefixes"),
    cSymbolPrefixes = node.attributeValueOrNull("c:symbol-prefixes"),
    cPrefix = node.attributeValueOrNull("c:prefix"),
    sharedLibrary = node.attributeValueOrNull("shared-library"),
    aliases = node.childNodesWithName("alias").map { parseGirAlias(it) },
    interfaces = node.childNodesWithName("interface").map { parseGirInterface(it) },
    classes = node.childNodesWithName("class").map { parseGirClass(it) },
    unions = node.childNodesWithName("union").map { parseGirUnion(it) },
    records = node.childNodesWithName("record").map { parseGirRecord(it) },
    functions = node.childNodesWithName("function").map { parseGirFunction(it) },
    callbacks = node.childNodesWithName("callback").map { parseGirCallback(it) },
    constants = node.childNodesWithName("constant").map { parseGirConstant(it) },
    enums = node.childNodesWithName("enumeration").map { parseGirEnum(it) },
    bitfields = node.childNodesWithName("bitfield").map { parseGirBitField(it) },
    boxes = node.childNodesWithName("glib:boxed").map { parseGirBoxed(it) },
)

private fun parseGirPackage(node: Node): GirPackage = GirPackage(
    name = node.attributeValue("name"),
)

private fun parseGirAlias(node: Node): GirAlias = GirAlias(
    name = node.attributeValue("name"),
    cType = node.attributeValue("c:type"),
    type = parseGirType(node.singleChildWithName("type")),
    info = parseGirInfo(node),
)

private fun parseGirInterface(node: Node): GirInterface = GirInterface(
    name = node.attributeValue("name"),
    glibTypeName = node.attributeValue("glib:type-name"),
    glibGetType = node.attributeValue("glib:get-type"),
    glibTypeStruct = node.attributeValueOrNull("glib:type-struct"),
    cSymbolPrefix = node.attributeValue("c:symbol-prefix"),
    cType = node.attributeValueOrNull("c:type"),
    info = parseGirInfo(node),
    prerequisites = node.childNodesWithName("prerequisite").map { parseGirPrerequisite(it) },
    implements = node.childNodesWithName("implements").map { parseGirImplements(it) },
    functions = node.childNodesWithName("function").map { parseGirFunction(it) },
    methods = node.childNodesWithName("method").map { parseGirMethod(it) },
    virtualMethods = node.childNodesWithName("virtual-method").map { parseGirVirtualMethod(it) },
    fields = node.childNodesWithName("field").map { parseGirField(it) },
    properties = node.childNodesWithName("property").map { parseGirProperty(it) },
    signals = node.childNodesWithName("glib:signal").map { parseGirSignal(it) },
    constants = node.childNodesWithName("constant").map { parseGirConstant(it) },
    callbacks = node.childNodesWithName("callback").map { parseGirCallback(it) },
    constructor = node.singleChildWithNameOrNull("constructor")?.let { parseGirConstructor(it) },
)

private fun parseGirClass(node: Node): GirClass = GirClass(
    info = parseGirInfo(node),
    name = node.attributeValue("name"),
    glibTypeName = node.attributeValue("glib:type-name"),
    glibGetType = node.attributeValue("glib:get-type"),
    parent = node.attributeValueOrNull("parent"),
    glibTypeStruct = node.attributeValueOrNull("glib:type-struct"),
    glibRefFunc = node.attributeValueOrNull("glib:ref-func"),
    glibUnrefFunc = node.attributeValueOrNull("glib:unref-func"),
    glibSetValueFunc = node.attributeValueOrNull("glib:set-value-func"),
    glibGetValueFunc = node.attributeValueOrNull("glib:get-value-func"),
    cType = node.attributeValueOrNull("c:type"),
    cSymbolPrefix = node.attributeValueOrNull("c:symbol-prefix"),
    abstract = node.attributeValueOrNull("abstract")?.requireBoolean(),
    glibFundamental = node.attributeValueOrNull("glib:fundamental")?.requireBoolean(),
    final = node.attributeValueOrNull("final")?.requireBoolean(),
    implements = node.childNodesWithName("implements").map { parseGirImplements(it) },
    constructors = node.childNodesWithName("constructor").map { parseGirConstructor(it) },
    methods = node.childNodesWithName("method").map { parseGirMethod(it) },
    functions = node.childNodesWithName("function").map { parseGirFunction(it) },
    virtualMethods = node.childNodesWithName("virtual-method").map { parseGirVirtualMethod(it) },
    fields = node.childNodesWithName("field").map { parseGirField(it) },
    properties = node.childNodesWithName("property").map { parseGirProperty(it) },
    signals = node.childNodesWithName("glib:signal").map { parseGirSignal(it) },
    unions = node.childNodesWithName("union").map { parseGirUnion(it) },
    constants = node.childNodesWithName("constant").map { parseGirConstant(it) },
    callbacks = node.childNodesWithName("callback").map { parseGirCallback(it) },
    records = node.childNodesWithName("record").map { parseGirRecord(it) },
)

private fun parseGirDocVersion(node: Node): GirDocVersion = GirDocVersion(
    preserveSpace = node.attributeValueOrNull("xml:space")?.let { it == "preserve" } == true,
    preserveWhitespace = node.attributeValueOrNull("xml:whitespace")?.let { it == "preserve" } == true,
    text = node.textContent,
)

private fun parseGirDocStability(node: Node): GirDocStability = GirDocStability(
    preserveSpace = node.attributeValueOrNull("xml:space")?.let { it == "preserve" } == true,
    preserveWhitespace = node.attributeValueOrNull("xml:whitespace")?.let { it == "preserve" } == true,
    text = node.textContent,
)

private fun parseGirDocDeprecated(node: Node): GirDocDeprecated = GirDocDeprecated(
    preserveSpace = node.attributeValueOrNull("xml:space")?.let { it == "preserve" } == true,
    preserveWhitespace = node.attributeValueOrNull("xml:whitespace")?.let { it == "preserve" } == true,
    text = node.textContent,
)

private fun parseGirDoc(node: Node): GirDoc = GirDoc(
    preserveSpace = node.attributeValueOrNull("xml:space")?.let { it == "preserve" } == true,
    preserveWhitespace = node.attributeValueOrNull("xml:whitespace")?.let { it == "preserve" } == true,
    text = node.textContent,
    filename = node.attributeValueOrNull("filename"),
    line = node.attributeValueOrNull("line"),
    column = node.attributeValueOrNull("column"),
)

private fun parseGirSourcePosition(node: Node): GirSourcePosition = GirSourcePosition(
    filename = node.attributeValue("filename"),
    line = node.attributeValue("line"),
    column = node.attributeValueOrNull("column"),
)

private fun parseGirPrerequisite(node: Node): GirPrerequisite = GirPrerequisite(
    name = node.attributeValue("name"),
)

private fun parseGirImplements(node: Node): GirImplements = GirImplements(
    name = node.attributeValue("name"),
)

private fun parseGirFunction(node: Node): GirFunction = GirFunction(
    info = parseGirInfo(node),
    name = node.attributeValue("name"),
    cIdentifier = node.attributeValueOrNull("c:identifier"),
    shadowedBy = node.attributeValueOrNull("shadowed-by"),
    shadows = node.attributeValueOrNull("shadows"),
    throws = node.attributeValueOrNull("throws")?.let { it == "1" } == true,
    movedTo = node.attributeValueOrNull("moved-to"),
    parameters = node.singleChildWithNameOrNull("parameters")?.let { parseGirParameters(it) },
    returnValue = node.singleChildWithNameOrNull("return-value")?.let { parseGirReturnValue(it) },
    docs = parseGirDocElements(node),
)

private fun parseGirConstructor(node: Node): GirConstructor = GirConstructor(
    info = parseGirInfo(node),
    name = node.attributeValue("name"),
    cIdentifier = node.attributeValueOrNull("c:identifier"),
    shadowedBy = node.attributeValueOrNull("shadowed-by"),
    shadows = node.attributeValueOrNull("shadows"),
    throws = node.attributeValueOrNull("throws")?.let { it == "1" } == true,
    movedTo = node.attributeValueOrNull("moved-to"),
    parameters = node.singleChildWithNameOrNull("parameters")?.let { parseGirParameters(it) },
    returnValue = node.singleChildWithNameOrNull("return-value")?.let { parseGirReturnValue(it) },
)

private fun parseGirMethod(node: Node): GirMethod = GirMethod(
    info = parseGirInfo(node),
    name = node.attributeValue("name"),
    cIdentifier = node.attributeValueOrNull("c:identifier"),
    shadowedBy = node.attributeValueOrNull("shadowed-by"),
    shadows = node.attributeValueOrNull("shadows"),
    throws = node.attributeValueOrNull("throws")?.let { it == "1" } == true,
    movedTo = node.attributeValueOrNull("moved-to"),
    parameters = node.singleChildWithNameOrNull("parameters")?.let { parseGirParameters(it) },
    glibGetProperty = node.attributeValueOrNull("glib:get-property"),
    glibSetProperty = node.attributeValueOrNull("glib:set-property"),
    returnValue = node.singleChildWithNameOrNull("return-value")?.let { parseGirReturnValue(it) },
)

private fun parseGirVirtualMethod(node: Node): GirVirtualMethod = GirVirtualMethod(
    info = parseGirInfo(node),
    name = node.attributeValue("name"),
    cIdentifier = node.attributeValueOrNull("c:identifier"),
    shadowedBy = node.attributeValueOrNull("shadowed-by"),
    shadows = node.attributeValueOrNull("shadows"),
    throws = node.attributeValueOrNull("throws")?.let { it == "1" } == true,
    movedTo = node.attributeValueOrNull("moved-to"),
    parameters = node.singleChildWithNameOrNull("parameters")?.let { parseGirParameters(it) },
    invoker = node.attributeValueOrNull("invokeder"),
    returnValue = node.singleChildWithNameOrNull("return-value")?.let { parseGirReturnValue(it) },
)

private fun parseGirParameters(node: Node): GirParameters = GirParameters(
    parameters = node.childNodesWithName("parameter").map { parseGirParameter(it) },
    instanceParameter = node.singleChildWithNameOrNull("instance-parameter")?.let { parseGirInstanceParameter(it) },
)

private fun parseGirParameter(node: Node): GirParameter {
    val childTypes = node.childNodesWithNames("type", "array", "varargs").map { parseGirAnyTypeOrVarArgs(it) }
    require(childTypes.size == 1)
    return GirParameter(
        name = node.attributeValue("name"),
        nullable = node.attributeValueOrNull("nullable")?.requireBoolean(),
        allowNone = node.attributeValueOrNull("allow-none")?.requireBoolean(),
        introspectable = node.attributeValueOrNull("introspectable")?.requireBoolean(),
        closure = node.attributeValueOrNull("closure")?.toInt(),
        destroy = node.attributeValueOrNull("destroy")?.toInt(),
        scope = node.attributeValueOrNull("scope")?.let { GirScope.fromString(it) },
        direction = node.attributeValueOrNull("direction")?.let { GirDirection.fromString(it) },
        callerAllocates = node.attributeValueOrNull("caller-allocates")?.requireBoolean(),
        optional = node.attributeValueOrNull("optional")?.requireBoolean(),
        skip = node.attributeValueOrNull("skip")?.requireBoolean(),
        transferOwnership = node.attributeValueOrNull("transfer-ownership")
            ?.let { GirTransferOwnership.fromString(it) },
        type = childTypes.first(),
        docs = parseGirDocElements(node),
    )
}

private fun parseGirInstanceParameter(node: Node): GirInstanceParameter = GirInstanceParameter(
    name = node.attributeValue("name"),
    nullable = node.attributeValueOrNull("nullable")?.requireBoolean(),
    allowNone = node.attributeValueOrNull("allow-none")?.requireBoolean(),
    direction = node.attributeValueOrNull("direction")?.let { GirDirection.fromString(it) },
    callerAllocates = node.attributeValueOrNull("caller-allocates")?.requireBoolean(),
    transferOwnership = node.attributeValueOrNull("transfer-ownership")?.let { GirTransferOwnership.fromString(it) },
    type = parseGirType(node.singleChildWithName("type")),
    docs = parseGirDocElements(node),
)

private fun parseGirField(node: Node): GirField {
    val childTypes = node.childNodesWithNames("callback", "type", "array").map { parseGirCallbackOrAnyType(it) }
    require(childTypes.size == 1) { "Field does not contain exactly 1 callback, type or array child" }

    return GirField(
        info = parseGirInfo(node),
        name = node.attributeValue("name"),
        writable = node.attributeValueOrNull("writable")?.requireBoolean(),
        readable = node.attributeValueOrNull("readable")?.requireBoolean(),
        private = node.attributeValueOrNull("private")?.requireBoolean(),
        bits = node.attributeValueOrNull("bits")?.toInt(),
        type = childTypes.first(),
    )
}

private fun parseGirProperty(node: Node): GirProperty {
    val childTypes = node.childNodesWithNames("type", "array").map { parseGirAnyType(it) }
    require(childTypes.size == 1) {
        "Property does not have a type or array child"
    }
    return GirProperty(
        info = parseGirInfo(node),

        name = node.attributeValue("name"),
        writable = node.attributeValueOrNull("writable")?.requireBoolean(),
        readable = node.attributeValueOrNull("readable")?.requireBoolean(),
        construct = node.attributeValueOrNull("construct")?.requireBoolean(),
        constructOnly = node.attributeValueOrNull("construct-only")?.requireBoolean(),
        setter = node.attributeValueOrNull("setter"),
        getter = node.attributeValueOrNull("getter"),
        defaultValue = node.attributeValueOrNull("default-value"),
        transferOwnership = node.attributeValueOrNull("transfer-ownership")
            ?.let { GirTransferOwnership.fromString(it) },
        type = childTypes.first(),
    )
}

private fun parseGirSignal(node: Node): GirSignal = GirSignal(
    info = parseGirInfo(node),
    name = node.attributeValue("name"),
    detailed = node.attributeValueOrNull("detailed")?.requireBoolean(),
    `when` = node.attributeValueOrNull("when")?.let { GirSignal.When.fromString(it) },
    action = node.attributeValueOrNull("action")?.requireBoolean(),
    noHooks = node.attributeValueOrNull("no-hooks")?.requireBoolean(),
    noRecurse = node.attributeValueOrNull("no-recurse")?.requireBoolean(),
    emitter = node.attributeValueOrNull("emitter"),
    parameters = node.singleChildWithNameOrNull("parameters")?.let { parseGirParameters(it) },
    returnValue = node.singleChildWithNameOrNull("return-value")?.let { parseGirReturnValue(it) },
)

private fun parseGirConstant(node: Node): GirConstant {
    val childTypes = node.childNodesWithNames("type", "array").map { parseGirAnyType(it) }
    require(childTypes.size <= 1) { "Constant has multiple type or array elements" }
    return GirConstant(
        info = parseGirInfo(node),
        name = node.attributeValue("name"),
        value = node.attributeValue("value"),
        cType = node.attributeValueOrNull("c:type"),
        cIdentifier = node.attributeValueOrNull("c:identifier"),
        type = childTypes.firstOrNull(),
    )
}

private fun parseGirCallback(node: Node): GirCallback = GirCallback(
    info = parseGirInfo(node),
    name = node.attributeValue("name"),
    cType = node.attributeValueOrNull("c:type"),
    throws = node.attributeValueOrNull("throws")?.requireBoolean(),
    parameters = node.singleChildWithNameOrNull("parameters")?.let { parseGirParameters(it) },
    returnValue = node.singleChildWithNameOrNull("return-value")?.let { parseGirReturnValue(it) },
)

private fun parseGirUnion(node: Node): GirUnion = GirUnion(
    info = parseGirInfo(node),
    name = node.attributeValueOrNull("name"),
    cType = node.attributeValueOrNull("c:type"),
    cSymbolPrefix = node.attributeValueOrNull("c:symbol-prefix"),
    glibTypeName = node.attributeValueOrNull("glib:type-name"),
    glibGetType = node.attributeValueOrNull("glib:get-type"),
    copyFunction = node.attributeValueOrNull("copy-function"),
    freeFunction = node.attributeValueOrNull("free-function"),
    fields = node.childNodesWithName("field").map { parseGirField(it) },
    constructors = node.childNodesWithName("constructor").map { parseGirConstructor(it) },
    methods = node.childNodesWithName("method").map { parseGirMethod(it) },
    functions = node.childNodesWithName("function").map { parseGirFunction(it) },
    records = node.childNodesWithName("record").map { parseGirRecord(it) },
)

private fun parseGirRecord(node: Node): GirRecord = GirRecord(
    info = parseGirInfo(node),
    name = node.attributeValue("name"),
    cType = node.attributeValueOrNull("c:type"),
    disguised = node.attributeValueOrNull("disguised")?.requireBoolean(),
    opaque = node.attributeValueOrNull("opaque")?.requireBoolean(),
    pointer = node.attributeValueOrNull("pointer")?.requireBoolean(),
    glibTypeName = node.attributeValueOrNull("glib:type-name"),
    glibGetType = node.attributeValueOrNull("glib:get-type"),
    cSymbolPrefix = node.attributeValueOrNull("c:symbol-prefix"),
    foreign = node.attributeValueOrNull("foreign")?.requireBoolean(),
    glibIsGtypeStructFor = node.attributeValueOrNull("glib:is-gtype-struct-for"),
    copyFunction = node.attributeValueOrNull("copy-function"),
    freeFunction = node.attributeValueOrNull("free-function"),
    fields = node.childNodesWithName("field").map { parseGirField(it) },
    functions = node.childNodesWithName("function").map { parseGirFunction(it) },
    unions = node.childNodesWithName("union").map { parseGirUnion(it) },
    methods = node.childNodesWithName("method").map { parseGirMethod(it) },
    constructors = node.childNodesWithName("constructor").map { parseGirConstructor(it) },
)

private fun parseGirEnum(node: Node): GirEnum = GirEnum(
    info = parseGirInfo(node),
    name = node.attributeValue("name"),
    cType = node.attributeValue("c:type"),
    glibTypeName = node.attributeValueOrNull("glib:type-name"),
    glibGetType = node.attributeValueOrNull("glib:get-type"),
    glibErrorDomain = node.attributeValueOrNull("glib:error-domain"),
    members = node.childNodesWithName("member").map { parseGirMember(it) },
    functions = node.childNodesWithName("function").map { parseGirFunction(it) },
)

private fun parseGirMember(node: Node): GirMember = GirMember(
    info = parseGirInfo(node),
    name = node.attributeValue("name"),
    value = node.attributeValue("value"),
    cIdentifier = node.attributeValue("c:identifier"),
    glibNick = node.attributeValueOrNull("glib:nick"),
    glibName = node.attributeValueOrNull("glib:name"),
)

private fun parseGirBitField(node: Node): GirBitField = GirBitField(
    info = parseGirInfo(node),
    name = node.attributeValue("name"),
    cType = node.attributeValue("c:type"),
    glibTypeName = node.attributeValueOrNull("glib:type-name"),
    glibGetType = node.attributeValueOrNull("glib:get-type"),
    functions = node.childNodesWithName("function").map { parseGirFunction(it) },
    members = node.childNodesWithName("member").map { parseGirMember(it) },
)

private fun parseGirBoxed(node: Node): GirBoxed = GirBoxed(
    info = parseGirInfo(node),
    glibName = node.attributeValue("glib:name"),
    cSymbolPrefix = node.attributeValue("c:symbol-prefix"),
    glibTypeName = node.attributeValueOrNull("glib:type-name"),
    glibGetType = node.attributeValueOrNull("glib:get-type"),
    functions = node.childNodesWithName("function").map { parseGirFunction(it) },
)

private fun parseGirAnnotation(node: Node): GirAnnotation = GirAnnotation(
    name = node.attributeValue("name"),
    value = node.attributeValue("value"),
)

private fun parseGirReturnValue(node: Node): GirReturnValue {
    val returnTypes = node.childNodesWithNames("type", "array").map { parseGirAnyType(it) }
    require(returnTypes.size == 1) { "Return value does not have type or array" }
    return GirReturnValue(
        introspectable = node.attributeValueOrNull("introspectable")?.requireBoolean(),
        nullable = node.attributeValueOrNull("nullable")?.requireBoolean(),
        closure = node.attributeValueOrNull("closure")?.toInt(),
        scope = node.attributeValueOrNull("scope")?.run { GirScope.fromString(this) },
        destroy = node.attributeValueOrNull("destroy")?.toInt(),
        skip = node.attributeValueOrNull("skip")?.requireBoolean(),
        allowNone = node.attributeValueOrNull("allow-none")?.requireBoolean(),
        transferOwnership = node.attributeValueOrNull("transfer-ownership")
            ?.let { GirTransferOwnership.fromString(it) },
        type = returnTypes.first(),
        docs = parseGirDocElements(node),
    )
}

private fun parseGirAnyTypeOrVarArgs(node: Node): GirAnyTypeOrVarargs =
    if (node.nodeName == "varargs") {
        GirVarArgs
    } else {
        parseGirAnyType(node)
    }

private fun parseGirAnyType(node: Node): GirAnyType =
    when (node.nodeName) {
        "type" -> parseGirType(node)
        "array" -> parseGirArrayType(node)
        else -> error("AnyType is not a Type or ArrayType")
    }

private fun parseGirCallbackOrAnyType(node: Node): GirCallbackOrAnyType =
    if (node.nodeName == "callback") {
        parseGirCallback(node)
    } else {
        parseGirAnyType(node)
    }

private fun parseGirType(node: Node): GirType = GirType(
    name = node.attributeValueOrNull("name"),
    cType = node.attributeValueOrNull("c:type"),
    introspectable = node.attributeValueOrNull("introspectable")?.let { it == "1" },
    types = node.childNodesWithNames("type", "array").map { parseGirAnyType(it) },
    docs = parseGirDocElements(node),
)

private fun parseGirArrayType(node: Node): GirArrayType {
    val childTypes = node.childNodesWithNames("type", "array").map { parseGirAnyType(it) }
    require(childTypes.size == 1) { "Array Type has more than 1 type or array element" }
    return GirArrayType(
        name = node.attributeValueOrNull("name"),
        zeroTerminated = node.attributeValueOrNull("zero-terminated")?.requireBoolean(),
        fixedSize = node.attributeValueOrNull("fixed-size")?.toInt(),
        introspectable = node.attributeValueOrNull("introspectable")?.requireBoolean(),
        length = node.attributeValueOrNull("length")?.toInt(),
        cType = node.attributeValueOrNull("c:type"),
        type = childTypes.first(),
    )
}

private fun parseGirInfo(node: Node): GirInfo = GirInfo(
    introspectable = node.attributeValueOrNull("introspectable")?.let { it == "1" },
    deprecated = node.attributeValueOrNull("deprecated")?.let { it == "1" },
    deprecatedVersion = node.attributeValueOrNull("deprecated-version"),
    version = node.attributeValueOrNull("version"),
    stability = node.attributeValueOrNull("stability")?.let { GirInfo.Stability.fromString(it) },
    annotations = node.childNodesWithName("attribute").map { parseGirAnnotation(it) },
    docs = parseGirDocElements(node),
)

private fun parseGirDocElements(node: Node): GirDocElements = GirDocElements(
    docVersion = node.singleChildWithNameOrNull("doc-version")?.let { parseGirDocVersion(it) },
    docStability = node.singleChildWithNameOrNull("doc-stability")?.let { parseGirDocStability(it) },
    docDeprecated = node.singleChildWithNameOrNull("doc-deprecated")?.let { parseGirDocDeprecated(it) },
    doc = node.singleChildWithNameOrNull("doc")?.let { parseGirDoc(it) },
    sourcePosition = node.singleChildWithNameOrNull("source-position")?.let { parseGirSourcePosition(it) },
)

private fun String.requireBoolean(): Boolean = when (this) {
    "0" -> false
    "1" -> true
    else -> error("String '$this' is not a valid boolean value")
}
