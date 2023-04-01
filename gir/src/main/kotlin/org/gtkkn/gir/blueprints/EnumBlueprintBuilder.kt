package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.MemberName
import org.gtkkn.gir.model.GirEnum
import org.gtkkn.gir.model.GirFunction
import org.gtkkn.gir.model.GirMember
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.processor.NotIntrospectableException
import org.gtkkn.gir.processor.ProcessorContext

class EnumBlueprintBuilder(
    context: ProcessorContext,
    private val girNamespace: GirNamespace,
    private val girEnum: GirEnum,
) : BlueprintBuilder<EnumBlueprint>(context) {
    private val members = mutableListOf<EnumMemberBlueprint>()
    private val functionBlueprints = mutableListOf<FunctionBlueprint>()

    override fun blueprintObjectType() = "enum"

    override fun blueprintObjectName(): String = girEnum.name

    private fun addMember(girMember: GirMember) {
        val nativeValue = girMember.value.toLong()
        val nativeMemberName = if (context.needsEnumMemberPackageImport(girEnum)) {
            MemberName(context.namespaceNativePackageName(girNamespace), girMember.cIdentifier)
        } else {
            MemberName(
                context.namespaceNativePackageName(girNamespace) + "." + girEnum.cType,
                girMember.cIdentifier,
            )
        }

        var memberBlueprint = EnumMemberBlueprint(
            kotlinName = context.kotlinzeEnumMemberName(girMember.name),
            nativeName = girMember.name,
            nativeValue = nativeValue,
            nativeMemberName = nativeMemberName,
            version = girMember.info.version,
            kdoc = context.processKdoc(girMember.info.docs.doc?.text),
        )

        if (members.any { it.nativeValue == nativeValue }) {
            // If a member has the same value as an already added member,
            // it means the member is aliased to another member in the enum typedef.
            // Cinterop adds these members to the companion object of the generated enum.

            memberBlueprint = memberBlueprint.copy(
                nativeMemberName = MemberName(nativeMemberName.packageName + ".Companion", nativeMemberName.simpleName),
            )
        }

        members.add(
            memberBlueprint,
        )
    }

    private fun addFunction(function: GirFunction) {
        when (val result = FunctionBlueprintBuilder(context, girNamespace, function).build()) {
            is BlueprintResult.Ok -> functionBlueprints.add(result.blueprint)
            is BlueprintResult.Skip -> skippedObjects.add(result.skippedObject)
        }
    }

    override fun buildInternal(): EnumBlueprint {
        if (girEnum.info.introspectable == false) {
            throw NotIntrospectableException(girEnum.cType)
        }

        context.checkIgnoredType(girEnum.cType)

        girEnum.members.forEach { addMember(it) }
        girEnum.functions.forEach { addFunction(it) }

        val kotlinName = context.kotlinizeEnumName(girEnum.name)
        val nativePackageName = context.namespaceNativePackageName(girNamespace)
        val nativeValueTypeName = ClassName(nativePackageName, girEnum.cType)

        return EnumBlueprint(
            kotlinName = context.kotlinizeEnumName(girEnum.name),
            kotlinTypeName = ClassName(context.namespaceBindingsPackageName(girNamespace), kotlinName),
            nativeTypeName = ClassName(context.namespaceNativePackageName(girNamespace), girEnum.cType),
            nativeValueTypeName = nativeValueTypeName,
            memberBlueprints = members,
            functionBlueprints = functionBlueprints,
            errorDomain = girEnum.glibErrorDomain,
            version = girEnum.info.version,
            kdoc = context.processKdoc(girEnum.info.docs.doc?.text),
        )
    }
}
