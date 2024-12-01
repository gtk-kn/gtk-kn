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

package org.gtkkn.gir.parser.gir

import org.gtkkn.gir.ext.attributeBooleanValueOrNull
import org.gtkkn.gir.ext.attributeValue
import org.gtkkn.gir.ext.attributeValueOrNull
import org.gtkkn.gir.ext.childNodesWithName
import org.gtkkn.gir.ext.childNodesWithNames
import org.gtkkn.gir.ext.singleChildWithName
import org.gtkkn.gir.log.logger
import org.gtkkn.gir.model.GirAlias
import org.gtkkn.gir.model.GirAnnotation
import org.gtkkn.gir.model.GirAnyType
import org.gtkkn.gir.model.GirAnyTypeOrVarargs
import org.gtkkn.gir.model.GirArrayType
import org.gtkkn.gir.model.GirBitfield
import org.gtkkn.gir.model.GirBoxed
import org.gtkkn.gir.model.GirCInclude
import org.gtkkn.gir.model.GirCallable
import org.gtkkn.gir.model.GirCallback
import org.gtkkn.gir.model.GirClass
import org.gtkkn.gir.model.GirConstant
import org.gtkkn.gir.model.GirConstructor
import org.gtkkn.gir.model.GirDirection
import org.gtkkn.gir.model.GirDoc
import org.gtkkn.gir.model.GirDocDeprecated
import org.gtkkn.gir.model.GirDocSection
import org.gtkkn.gir.model.GirDocStability
import org.gtkkn.gir.model.GirDocText
import org.gtkkn.gir.model.GirDocVersion
import org.gtkkn.gir.model.GirEnumeration
import org.gtkkn.gir.model.GirField
import org.gtkkn.gir.model.GirFieldType
import org.gtkkn.gir.model.GirFunction
import org.gtkkn.gir.model.GirFunctionInline
import org.gtkkn.gir.model.GirImplements
import org.gtkkn.gir.model.GirInclude
import org.gtkkn.gir.model.GirInfo
import org.gtkkn.gir.model.GirInstanceParameter
import org.gtkkn.gir.model.GirInterface
import org.gtkkn.gir.model.GirMember
import org.gtkkn.gir.model.GirMethod
import org.gtkkn.gir.model.GirMethodInline
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.model.GirPackage
import org.gtkkn.gir.model.GirParameter
import org.gtkkn.gir.model.GirParameters
import org.gtkkn.gir.model.GirPrerequisite
import org.gtkkn.gir.model.GirProperty
import org.gtkkn.gir.model.GirRecord
import org.gtkkn.gir.model.GirRepository
import org.gtkkn.gir.model.GirReturnValue
import org.gtkkn.gir.model.GirSignal
import org.gtkkn.gir.model.GirSourcePosition
import org.gtkkn.gir.model.GirTransferOwnership
import org.gtkkn.gir.model.GirType
import org.gtkkn.gir.model.GirUnion
import org.gtkkn.gir.model.GirVarArgs
import org.gtkkn.gir.model.GirVirtualMethod
import org.gtkkn.gir.parser.metadata.MetadataParser
import org.gtkkn.gir.parser.metadata.MetadataProcessor
import org.gtkkn.gir.util.loadResourceAsFile
import org.w3c.dom.Node
import org.xml.sax.InputSource
import java.io.File
import java.io.StringReader
import javax.xml.parsers.DocumentBuilderFactory

class GirParser(
    private val metadataParser: MetadataParser
) {
    fun parse(file: File): GirRepository {
        logger.info { "Parsing GIR file ${file.name}" }

        val metadataFilePath = "patches/${file.nameWithoutExtension}.metadata"
        val metadata = loadResourceAsFile(metadataFilePath)?.let { metadataParser.parse(it) }

        val xmlInput = InputSource(StringReader(file.readText()))
        val dbFactory = DocumentBuilderFactory.newInstance()
        val dBuilder = dbFactory.newDocumentBuilder()
        val doc = dBuilder.parse(xmlInput)

        // Apply metadata to the Document
        if (metadata != null) {
            val metadataProcessor = MetadataProcessor(metadata, doc)
            metadataProcessor.apply()
        }

        val repositoryNode = doc.singleChildWithName("repository")
        val girRepository = parseGirRepository(repositoryNode)

        if (metadata != null) {
            val unusedRules = metadata.getUnusedRules()
            if (unusedRules.isNotBlank()) {
                logger.warn { "Unused metadata rules from ${file.nameWithoutExtension}.metadata:\n$unusedRules" }
            }
        }
        return girRepository
    }

    private fun parseGirRepository(node: Node): GirRepository {
        val namespaces = node.childNodesWithName("namespace").map { parseGirNamespace(it) }
        namespaces.forEach { it.initializeChildren(it) }
        return GirRepository(
            version = node.attributeValueOrNull("version"),
            cIdentifierPrefixes = node.attributeValueOrNull("c:identifier-prefixes"),
            cSymbolPrefixes = node.attributeValueOrNull("c:symbol-prefixes"),
            includes = node.childNodesWithName("include").map { parseGirInclude(it) },
            cIncludes = node.childNodesWithName("c:include").map { parseGirCInclude(it) },
            packages = node.childNodesWithName("package").map { parseGirPackage(it) },
            namespaces = namespaces,
        )
    }

    private fun parseGirInclude(node: Node): GirInclude = GirInclude(
        name = node.attributeValue("name"),
        version = node.attributeValueOrNull("version"),
    )

    private fun parseGirCInclude(node: Node): GirCInclude = GirCInclude(
        name = node.attributeValue("name"),
    )

    private fun parseGirPackage(node: Node): GirPackage = GirPackage(
        name = node.attributeValue("name"),
    )

    private fun parseGirNamespace(node: Node): GirNamespace = GirNamespace(
        name = node.attributeValueOrNull("name"),
        version = node.attributeValueOrNull("version"),
        cIdentifierPrefixes = node.attributeValueOrNull("c:identifier-prefixes"),
        cSymbolPrefixes = node.attributeValueOrNull("c:symbol-prefixes"),
        cPrefix = node.attributeValueOrNull("c:prefix"),
        sharedLibrary = node.attributeValueOrNull("shared-library"),
        aliases = node.childNodesWithName("alias").map { parseGirAlias(it) },
        classes = node.childNodesWithName("class").map { parseGirClass(it) },
        interfaces = node.childNodesWithName("interface").map { parseGirInterface(it) },
        records = node.childNodesWithName("record").map { parseGirRecord(it) },
        enumerations = node.childNodesWithName("enumeration").map { parseGirEnumeration(it) },
        functions = node.childNodesWithName("function").map { parseGirFunction(it) },
        functionInlines = node.childNodesWithName("function-inline").map { parseGirFunctionInline(it) },
        unions = node.childNodesWithName("union").map { parseGirUnion(it) },
        bitfields = node.childNodesWithName("bitfield").map { parseGirBitfield(it) },
        callbacks = node.childNodesWithName("callback").map { parseGirCallback(it) },
        constants = node.childNodesWithName("constant").map { parseGirConstant(it) },
        annotations = node.childNodesWithName("attribute").map { parseGirAnnotation(it) },
        boxeds = node.childNodesWithName("glib:boxed").map { parseGirBoxed(it) },
        docSections = node.childNodesWithName("docsection").map { parseGirDocSection(it) },
    )

    private fun parseGirAlias(node: Node): GirAlias = GirAlias(
        info = parseGirInfo(node),
        name = node.attributeValue("name"),
        cType = node.attributeValue("c:type"),
        doc = parseGirDocElements(node),
        annotations = node.childNodesWithName("attribute").map { parseGirAnnotation(it) },
        type = parseGirAnyType(node.singleChildWithName("type")),
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
        abstract = node.attributeBooleanValueOrNull("abstract"),
        glibFundamental = node.attributeBooleanValueOrNull("glib:fundamental"),
        final = node.attributeBooleanValueOrNull("final"),
        doc = parseGirDocElements(node),
        annotations = node.childNodesWithName("attribute").map { parseGirAnnotation(it) },
        implements = node.childNodesWithName("implements").map { parseGirImplements(it) },
        constructors = node.childNodesWithName("constructor").map { parseGirConstructor(it) },
        methods = node.childNodesWithName("method").map { parseGirMethod(it) },
        methodInlines = node.childNodesWithName("method-inline").map { parseGirMethodInline(it) },
        functions = node.childNodesWithName("function").map { parseGirFunction(it) },
        functionInlines = node.childNodesWithName("function-inline").map { parseGirFunctionInline(it) },
        virtualMethods = node.childNodesWithName("virtual-method").map { parseGirVirtualMethod(it) },
        fields = node.childNodesWithName("field").map { parseGirField(it) },
        properties = node.childNodesWithName("property").map { parseGirProperty(it) },
        signals = node.childNodesWithName("glib:signal").map { parseGirSignal(it) },
        unions = node.childNodesWithName("union").map { parseGirUnion(it) },
        constants = node.childNodesWithName("constant").map { parseGirConstant(it) },
        records = node.childNodesWithName("record").map { parseGirRecord(it) },
        callbacks = node.childNodesWithName("callback").map { parseGirCallback(it) },
    )

    private fun parseGirInterface(node: Node): GirInterface = GirInterface(
        info = parseGirInfo(node),
        name = node.attributeValueOrNull("name"),
        glibTypeName = node.attributeValue("glib:type-name"),
        glibGetType = node.attributeValue("glib:get-type"),
        cSymbolPrefix = node.attributeValueOrNull("c:symbol-prefix"),
        cType = node.attributeValueOrNull("c:type"),
        glibTypeStruct = node.attributeValueOrNull("glib:type-struct"),
        doc = parseGirDocElements(node),
        annotations = node.childNodesWithName("attribute").map { parseGirAnnotation(it) },
        prerequisites = node.childNodesWithName("prerequisite").map { parseGirPrerequisite(it) },
        implements = node.childNodesWithName("implements").map { parseGirImplements(it) },
        functions = node.childNodesWithName("function").map { parseGirFunction(it) },
        functionInlines = node.childNodesWithName("function-inline").map { parseGirFunctionInline(it) },
        constructor = node.childNodesWithName("constructor").firstOrNull()?.let { parseGirConstructor(it) },
        methods = node.childNodesWithName("method").map { parseGirMethod(it) },
        methodInlines = node.childNodesWithName("method-inline").map { parseGirMethodInline(it) },
        virtualMethods = node.childNodesWithName("virtual-method").map { parseGirVirtualMethod(it) },
        fields = node.childNodesWithName("field").map { parseGirField(it) },
        properties = node.childNodesWithName("property").map { parseGirProperty(it) },
        signals = node.childNodesWithName("glib:signal").map { parseGirSignal(it) },
        callbacks = node.childNodesWithName("callback").map { parseGirCallback(it) },
        constants = node.childNodesWithName("constant").map { parseGirConstant(it) },
    )

    private fun parseGirRecord(node: Node): GirRecord = GirRecord(
        info = parseGirInfo(node),
        name = node.attributeValue("name"),
        cType = node.attributeValueOrNull("c:type"),
        disguised = node.attributeBooleanValueOrNull("disguised"),
        opaque = node.attributeBooleanValueOrNull("opaque"),
        pointer = node.attributeBooleanValueOrNull("pointer"),
        glibTypeName = node.attributeValueOrNull("glib:type-name"),
        glibGetType = node.attributeValueOrNull("glib:get-type"),
        cSymbolPrefix = node.attributeValueOrNull("c:symbol-prefix"),
        foreign = node.attributeBooleanValueOrNull("foreign"),
        glibIsGTypeStructFor = node.attributeValueOrNull("glib:is-gtype-struct-for"),
        copyFunction = node.attributeValueOrNull("copy-function"),
        freeFunction = node.attributeValueOrNull("free-function"),
        doc = parseGirDocElements(node),
        annotations = node.childNodesWithName("attribute").map { parseGirAnnotation(it) },
        fields = node.childNodesWithName("field").map { parseGirField(it) },
        functions = node.childNodesWithName("function").map { parseGirFunction(it) },
        functionInlines = node.childNodesWithName("function-inline").map { parseGirFunctionInline(it) },
        unions = node.childNodesWithName("union").map { parseGirUnion(it) },
        methods = node.childNodesWithName("method").map { parseGirMethod(it) },
        methodInlines = node.childNodesWithName("method-inline").map { parseGirMethodInline(it) },
        constructors = node.childNodesWithName("constructor").map { parseGirConstructor(it) },
    )

    private fun parseGirEnumeration(node: Node): GirEnumeration = GirEnumeration(
        info = parseGirInfo(node),
        name = node.attributeValue("name"),
        cType = node.attributeValue("c:type"),
        glibTypeName = node.attributeValueOrNull("glib:type-name"),
        glibGetType = node.attributeValueOrNull("glib:get-type"),
        glibErrorDomain = node.attributeValueOrNull("glib:error-domain"),
        doc = parseGirDocElements(node),
        annotations = node.childNodesWithName("attribute").map { parseGirAnnotation(it) },
        members = node.childNodesWithName("member").map { parseGirMember(it) },
        functions = node.childNodesWithName("function").map { parseGirFunction(it) },
        functionInlines = node.childNodesWithName("function-inline").map { parseGirFunctionInline(it) },
    )

    private fun parseGirFunction(node: Node): GirFunction = GirFunction(
        callable = parseGirCallable(node),
        doc = parseGirDocElements(node),
        annotations = node.childNodesWithName("attribute").map { parseGirAnnotation(it) },
        parameters = node.childNodesWithName("parameters").firstOrNull()?.let { parseGirParameters(it) },
        returnValue = node.childNodesWithName("return-value").firstOrNull()?.let { parseGirReturnValue(it) },
    )

    private fun parseGirFunctionInline(node: Node): GirFunctionInline = GirFunctionInline(
        callable = parseGirCallable(node),
        parameters = node.childNodesWithName("parameters").firstOrNull()?.let { parseGirParameters(it) },
        returnValue = node.childNodesWithName("return-value").firstOrNull()?.let { parseGirReturnValue(it) },
        doc = parseGirDocElements(node),
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
        doc = parseGirDocElements(node),
        annotations = node.childNodesWithName("attribute").map { parseGirAnnotation(it) },
        fields = node.childNodesWithName("field").map { parseGirField(it) },
        constructors = node.childNodesWithName("constructor").map { parseGirConstructor(it) },
        methods = node.childNodesWithName("method").map { parseGirMethod(it) },
        methodInlines = node.childNodesWithName("method-inline").map { parseGirMethodInline(it) },
        functions = node.childNodesWithName("function").map { parseGirFunction(it) },
        functionInlines = node.childNodesWithName("function-inline").map { parseGirFunctionInline(it) },
        records = node.childNodesWithName("record").mapNotNull { record ->
            // ignoring records without name for now: https://gitlab.com/gtk-kn/gtk-kn/-/issues/99
            record.attributeValueOrNull("name")?.let { parseGirRecord(record) }
        },
    )

    private fun parseGirBitfield(node: Node): GirBitfield = GirBitfield(
        info = parseGirInfo(node),
        name = node.attributeValue("name"),
        cType = node.attributeValue("c:type"),
        glibTypeName = node.attributeValueOrNull("glib:type-name"),
        glibGetType = node.attributeValueOrNull("glib:get-type"),
        doc = parseGirDocElements(node),
        annotations = node.childNodesWithName("attribute").map { parseGirAnnotation(it) },
        members = node.childNodesWithName("member").map { parseGirMember(it) },
        functions = node.childNodesWithName("function").map { parseGirFunction(it) },
        functionInlines = node.childNodesWithName("function-inline").map { parseGirFunctionInline(it) },
    )

    private fun parseGirCallback(node: Node): GirCallback = GirCallback(
        info = parseGirInfo(node),
        name = node.attributeValue("name"),
        cType = node.attributeValueOrNull("c:type"),
        throws = node.attributeBooleanValueOrNull("throws"),
        doc = parseGirDocElements(node),
        annotations = node.childNodesWithName("attribute").map { parseGirAnnotation(it) },
        parameters = node.childNodesWithName("parameters").firstOrNull()?.let { parseGirParameters(it) },
        returnValue = node.childNodesWithName("return-value").firstOrNull()?.let { parseGirReturnValue(it) },
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
            doc = parseGirDocElements(node),
            annotations = node.childNodesWithName("attribute").map { parseGirAnnotation(it) },
            type = childTypes.firstOrNull(),
        )
    }

    private fun parseGirField(node: Node): GirField {
        val childTypes = node.childNodesWithNames("callback", "type", "array").map { parseGirFieldType(it) }
        require(childTypes.size == 1) { "Field does not contain exactly 1 callback, type or array child" }

        return GirField(
            info = parseGirInfo(node),
            name = node.attributeValueOrNull("name"),
            writable = node.attributeBooleanValueOrNull("writable"),
            readable = node.attributeBooleanValueOrNull("readable"),
            private = node.attributeBooleanValueOrNull("private"),
            bits = node.attributeValueOrNull("bits")?.toInt(),
            doc = parseGirDocElements(node),
            annotations = node.childNodesWithName("attribute").map { parseGirAnnotation(it) },
            type = childTypes.first(),
        )
    }

    private fun parseGirFieldType(node: Node): GirFieldType =
        if (node.nodeName == "callback") {
            parseGirCallback(node)
        } else {
            parseGirAnyType(node)
        }

    private fun parseGirProperty(node: Node): GirProperty {
        val childTypes = node.childNodesWithNames("type", "array").map { parseGirAnyType(it) }
        require(childTypes.size == 1) {
            "Property does not have a type or array child"
        }
        return GirProperty(
            info = parseGirInfo(node),
            name = node.attributeValue("name"),
            writable = node.attributeBooleanValueOrNull("writable"),
            readable = node.attributeBooleanValueOrNull("readable"),
            construct = node.attributeBooleanValueOrNull("construct"),
            constructOnly = node.attributeBooleanValueOrNull("construct-only"),
            setter = node.attributeValueOrNull("setter"),
            getter = node.attributeValueOrNull("getter"),
            defaultValue = node.attributeValueOrNull("default-value"),
            transferOwnership = node.attributeValueOrNull("transfer-ownership")
                ?.let { GirTransferOwnership.fromString(it) },
            doc = parseGirDocElements(node),
            annotations = node.childNodesWithName("attribute").map { parseGirAnnotation(it) },
            type = childTypes.first(),
        )
    }

    private fun parseGirSignal(node: Node): GirSignal = GirSignal(
        info = parseGirInfo(node),
        name = node.attributeValue("name"),
        detailed = node.attributeBooleanValueOrNull("detailed"),
        whenEmitted = node.attributeValueOrNull("when"),
        action = node.attributeBooleanValueOrNull("action"),
        noHooks = node.attributeBooleanValueOrNull("no-hooks"),
        noRecurse = node.attributeBooleanValueOrNull("no-recurse"),
        emitter = node.attributeValueOrNull("emitter"),
        doc = parseGirDocElements(node),
        annotations = node.childNodesWithName("attribute").map { parseGirAnnotation(it) },
        parameters = node.childNodesWithName("parameters").firstOrNull()?.let { parseGirParameters(it) },
        returnValue = node.childNodesWithName("return-value").firstOrNull()?.let { parseGirReturnValue(it) },
    )

    private fun parseGirDocSection(node: Node): GirDocSection = GirDocSection(
        name = node.attributeValue("name"),
        doc = parseGirDocElements(node),
    )

    private fun parseGirMember(node: Node): GirMember = GirMember(
        info = parseGirInfo(node),
        name = node.attributeValue("name"),
        value = node.attributeValue("value"),
        cIdentifier = node.attributeValue("c:identifier"),
        glibNick = node.attributeValueOrNull("glib:nick"),
        glibName = node.attributeValueOrNull("glib:name"),
        doc = parseGirDocElements(node),
    )

    private fun parseGirBoxed(node: Node): GirBoxed = GirBoxed(
        info = parseGirInfo(node),
        glibName = node.attributeValue("glib:name"),
        cSymbolPrefix = node.attributeValueOrNull("c:symbol-prefix"),
        glibTypeName = node.attributeValueOrNull("glib:type-name"),
        glibGetType = node.attributeValueOrNull("glib:get-type"),
        doc = parseGirDocElements(node),
        annotations = node.childNodesWithName("attribute").map { parseGirAnnotation(it) },
        functions = node.childNodesWithName("function").map { parseGirFunction(it) },
        functionInlines = node.childNodesWithName("function-inline").map { parseGirFunctionInline(it) },
    )

    private fun parseGirAnnotation(node: Node): GirAnnotation = GirAnnotation(
        name = node.attributeValue("name"),
        value = node.attributeValue("value"),
    )

    private fun parseGirInfo(node: Node): GirInfo = GirInfo(
        introspectable = node.attributeBooleanValueOrNull("introspectable"),
        deprecated = node.attributeBooleanValueOrNull("deprecated"),
        deprecatedVersion = node.attributeValueOrNull("deprecated-version"),
        version = node.attributeValueOrNull("version"),
        stability = node.attributeValueOrNull("stability"),
    )

    private fun parseGirCallable(node: Node): GirCallable = GirCallable(
        info = parseGirInfo(node),
        name = node.attributeValue("name"),
        cIdentifier = node.attributeValueOrNull("c:identifier"),
        shadowedBy = node.attributeValueOrNull("shadowed-by"),
        shadows = node.attributeValueOrNull("shadows"),
        throws = node.attributeBooleanValueOrNull("throws"),
        movedTo = node.attributeValueOrNull("moved-to"),
        glibAsyncFunc = node.attributeValueOrNull("glib:async-func"),
        glibSyncFunc = node.attributeValueOrNull("glib:sync-func"),
        glibFinishFunc = node.attributeValueOrNull("glib:finish-func"),
    )

    private fun parseGirParameters(node: Node): GirParameters = GirParameters(
        parameters = node.childNodesWithName("parameter").map { parseGirParameter(it) },
        instanceParameter = node.childNodesWithName("instance-parameter").firstOrNull()
            ?.let { parseGirInstanceParameter(it) },
    )

    private fun parseGirParameter(node: Node): GirParameter {
        val childTypes = node.childNodesWithNames("type", "array", "varargs").map { parseGirAnyTypeOrVarArgs(it) }
        require(childTypes.size == 1)
        return GirParameter(
            name = node.attributeValueOrNull("name"),
            nullable = node.attributeBooleanValueOrNull("nullable"),
            allowNone = node.attributeBooleanValueOrNull("allow-none"),
            introspectable = node.attributeBooleanValueOrNull("introspectable"),
            closure = node.attributeValueOrNull("closure")?.toInt(),
            destroy = node.attributeValueOrNull("destroy")?.toInt(),
            scope = node.attributeValueOrNull("scope"),
            direction = node.attributeValueOrNull("direction")?.let { GirDirection.fromString(it) },
            callerAllocates = node.attributeBooleanValueOrNull("caller-allocates"),
            optional = node.attributeBooleanValueOrNull("optional"),
            skip = node.attributeBooleanValueOrNull("skip"),
            transferOwnership = node.attributeValueOrNull("transfer-ownership")
                ?.let { GirTransferOwnership.fromString(it) },
            doc = parseGirDocElements(node),
            annotations = node.childNodesWithName("attribute").map { parseGirAnnotation(it) },
            type = childTypes.first(),
        )
    }

    private fun parseGirInstanceParameter(node: Node): GirInstanceParameter = GirInstanceParameter(
        name = node.attributeValue("name"),
        nullable = node.attributeBooleanValueOrNull("nullable"),
        allowNone = node.attributeBooleanValueOrNull("allow-none"),
        direction = node.attributeValueOrNull("direction")?.let { GirDirection.fromString(it) },
        callerAllocates = node.attributeBooleanValueOrNull("caller-allocates"),
        transferOwnership = node.attributeValueOrNull("transfer-ownership")
            ?.let { GirTransferOwnership.fromString(it) },
        doc = parseGirDocElements(node),
        type = node.childNodesWithName("type").firstOrNull()?.let { parseGirType(it) }
            ?: throw MissingNodeAttributeError(node.nodeName, "type"),
    )

    private fun parseGirReturnValue(node: Node): GirReturnValue {
        val returnTypes = node.childNodesWithNames("type", "array").map { parseGirAnyType(it) }
        require(returnTypes.size == 1) { "Return value does not have type or array" }
        return GirReturnValue(
            introspectable = node.attributeBooleanValueOrNull("introspectable"),
            nullable = node.attributeBooleanValueOrNull("nullable"),
            closure = node.attributeValueOrNull("closure")?.toInt(),
            scope = node.attributeValueOrNull("scope"),
            destroy = node.attributeValueOrNull("destroy")?.toInt(),
            skip = node.attributeBooleanValueOrNull("skip"),
            allowNone = node.attributeBooleanValueOrNull("allow-none"),
            transferOwnership = node.attributeValueOrNull("transfer-ownership")
                ?.let { GirTransferOwnership.fromString(it) },
            doc = parseGirDocElements(node),
            annotations = node.childNodesWithName("attribute").map { parseGirAnnotation(it) },
            type = returnTypes.first(),
        )
    }

    private fun parseGirAnyTypeOrVarArgs(node: Node): GirAnyTypeOrVarargs =
        if (node.nodeName == "varargs") {
            GirVarArgs
        } else {
            parseGirAnyType(node)
        }

    private fun parseGirAnyType(node: Node): GirAnyType =
        when (val name = node.nodeName) {
            "type" -> parseGirType(node)
            "array" -> parseGirArrayType(node)
            else -> error("AnyType is not a Type or ArrayType: $name")
        }

    private fun parseGirType(node: Node): GirType = GirType(
        name = node.attributeValueOrNull("name"),
        cType = node.attributeValueOrNull("c:type"),
        introspectable = node.attributeBooleanValueOrNull("introspectable"),
        doc = parseGirDocElements(node),
        annotations = node.childNodesWithName("attribute").map { parseGirAnnotation(it) },
        types = node.childNodesWithNames("type", "array").map { parseGirAnyType(it) },
    )

    private fun parseGirArrayType(node: Node): GirArrayType {
        val childTypes = node.childNodesWithNames("type", "array").map { parseGirAnyType(it) }
        require(childTypes.size == 1) { "Array Type has more than 1 type or array element" }
        return GirArrayType(
            name = node.attributeValueOrNull("name"),
            zeroTerminated = node.attributeBooleanValueOrNull("zero-terminated"),
            fixedSize = node.attributeValueOrNull("fixed-size")?.toInt(),
            introspectable = node.attributeBooleanValueOrNull("introspectable"),
            length = node.attributeValueOrNull("length")?.toInt(),
            cType = node.attributeValueOrNull("c:type"),
            type = childTypes.first(),
        )
    }

    private fun parseGirDocElements(node: Node): GirDoc? {
        val docVersionNode = node.childNodesWithName("doc-version").firstOrNull()
        val docStabilityNode = node.childNodesWithName("doc-stability").firstOrNull()
        val docNode = node.childNodesWithName("doc").firstOrNull()
        val docDeprecatedNode = node.childNodesWithName("doc-deprecated").firstOrNull()
        val sourcePositionNode = node.childNodesWithName("source-position").firstOrNull()

        if (docVersionNode == null &&
            docStabilityNode == null &&
            docNode == null &&
            docDeprecatedNode == null &&
            sourcePositionNode == null
        ) {
            return null
        }

        return GirDoc(
            docVersion = docVersionNode?.let { parseGirDocVersion(it) },
            docStability = docStabilityNode?.let { parseGirDocStability(it) },
            doc = docNode?.let { parseGirDocText(it) },
            docDeprecated = docDeprecatedNode?.let { parseGirDocDeprecated(it) },
            sourcePosition = sourcePositionNode?.let { parseGirSourcePosition(it) },
        )
    }

    private fun parseGirDocVersion(node: Node): GirDocVersion = GirDocVersion(
        xmlSpace = node.attributeValueOrNull("xml:space"),
        xmlWhitespace = node.attributeValueOrNull("xml:whitespace"),
        text = node.textContent.trim(),
    )

    private fun parseGirDocStability(node: Node): GirDocStability = GirDocStability(
        xmlSpace = node.attributeValueOrNull("xml:space"),
        xmlWhitespace = node.attributeValueOrNull("xml:whitespace"),
        text = node.textContent.trim(),
    )

    private fun parseGirDocText(node: Node): GirDocText = GirDocText(
        xmlSpace = node.attributeValueOrNull("xml:space"),
        xmlWhitespace = node.attributeValueOrNull("xml:whitespace"),
        filename = node.attributeValue("filename"),
        line = node.attributeValue("line"),
        column = node.attributeValueOrNull("column"),
        text = node.textContent.trim(),
    )

    private fun parseGirDocDeprecated(node: Node): GirDocDeprecated = GirDocDeprecated(
        xmlSpace = node.attributeValueOrNull("xml:space"),
        xmlWhitespace = node.attributeValueOrNull("xml:whitespace"),
        text = node.textContent.trim(),
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

    private fun parseGirConstructor(node: Node): GirConstructor = GirConstructor(
        callable = parseGirCallable(node),
        doc = parseGirDocElements(node),
        annotations = node.childNodesWithName("attribute").map { parseGirAnnotation(it) },
        parameters = node.childNodesWithName("parameters").firstOrNull()?.let { parseGirParameters(it) },
        returnValue = node.childNodesWithName("return-value").firstOrNull()?.let { parseGirReturnValue(it) },
    )

    private fun parseGirMethod(node: Node): GirMethod = GirMethod(
        callable = parseGirCallable(node),
        glibSetProperty = node.attributeValueOrNull("glib:set-property"),
        glibGetProperty = node.attributeValueOrNull("glib:get-property"),
        doc = parseGirDocElements(node),
        annotations = node.childNodesWithName("attribute").map { parseGirAnnotation(it) },
        parameters = node.childNodesWithName("parameters").firstOrNull()?.let { parseGirParameters(it) },
        returnValue = node.childNodesWithName("return-value").firstOrNull()?.let { parseGirReturnValue(it) },
    )

    private fun parseGirMethodInline(node: Node): GirMethodInline = GirMethodInline(
        callable = parseGirCallable(node),
        doc = parseGirDocElements(node),
        annotations = node.childNodesWithName("attribute").map { parseGirAnnotation(it) },
        parameters = node.childNodesWithName("parameters").firstOrNull()?.let { parseGirParameters(it) },
        returnValue = node.childNodesWithName("return-value").firstOrNull()?.let { parseGirReturnValue(it) },
    )

    private fun parseGirVirtualMethod(node: Node): GirVirtualMethod = GirVirtualMethod(
        callable = parseGirCallable(node),
        invoker = node.attributeValueOrNull("invoker"),
        doc = parseGirDocElements(node),
        annotations = node.childNodesWithName("attribute").map { parseGirAnnotation(it) },
        parameters = node.childNodesWithName("parameters").firstOrNull()?.let { parseGirParameters(it) },
        returnValue = node.childNodesWithName("return-value").firstOrNull()?.let { parseGirReturnValue(it) },
    )
}
