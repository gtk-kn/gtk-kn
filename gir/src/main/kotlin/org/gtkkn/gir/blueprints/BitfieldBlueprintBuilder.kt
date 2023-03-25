package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.MemberName
import org.gtkkn.gir.model.GirBitField
import org.gtkkn.gir.model.GirFunction
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.processor.NotIntrospectableException
import org.gtkkn.gir.processor.ProcessorContext

class BitfieldBlueprintBuilder(
    context: ProcessorContext,
    private val girNamespace: GirNamespace,
    private val girBitfield: GirBitField,
) : BlueprintBuilder<BitfieldBlueprint>(context) {

    private val members = mutableListOf<BitfieldMemberBlueprint>()
    private val functionBlueprints = mutableListOf<FunctionBlueprint>()

    override fun blueprintObjectType(): String = "bitfield"

    override fun blueprintObjectName(): String = girBitfield.name

    private fun addFunction(function: GirFunction) {
        when (val result = FunctionBlueprintBuilder(context, girNamespace, function).build()) {
            is BlueprintResult.Ok -> functionBlueprints.add(result.blueprint)
            is BlueprintResult.Skip -> skippedObjects.add(result.skippedObject)
        }
    }

    override fun buildInternal(): BitfieldBlueprint {
        context.checkIgnoredType(girBitfield.cType)

        if (girBitfield.info.introspectable == false) {
            throw NotIntrospectableException(girBitfield.cType)
        }

        val kotlinName = context.kotlinizeBitfieldName(girBitfield.name)
        val kotlinPackageName = context.kotlinizePackageName(girNamespace.name)
        val kotlinTypeName = ClassName(kotlinPackageName, kotlinName)

        val nativePackageName = context.namespaceNativePackageName(girNamespace)
        val nativeValueTypeName = ClassName(nativePackageName, girBitfield.cType)

        girBitfield.members.forEach { member ->
            val memberKotlinName = context.kotlinizeBitfieldMemberName(member.name)
            members.add(
                BitfieldMemberBlueprint(
                    kotlinName = memberKotlinName,
                    nativeValue = member.value.toLong(),
                    nativeMemberName = MemberName(nativePackageName, member.cIdentifier),
                    version = member.info.version,
                    kdoc = context.processKdoc(member.info.docs.doc?.text),
                ),
            )
        }

        girBitfield.functions.forEach { addFunction(it) }

        return BitfieldBlueprint(
            kotlinName = context.kotlinizeClassName(girBitfield.name),
            members = members,
            functionBlueprints = functionBlueprints,
            kotlinTypeName = kotlinTypeName,
            nativeValueTypeName = nativeValueTypeName,
            version = girBitfield.info.version,
            kdoc = context.processKdoc(girBitfield.info.docs.doc?.text),
        )
    }
}
