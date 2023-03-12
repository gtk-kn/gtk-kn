package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.MemberName
import org.gtkkn.gir.model.GirEnum
import org.gtkkn.gir.model.GirMember
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.processor.ProcessorContext

data class EnumBlueprint(
    val kotlinName: String,
    val kotlinTypeName: ClassName,
    val nativeTypeName: ClassName,
    val memberBlueprints: List<EnumMemberBlueprint>,
)

data class EnumMemberBlueprint(
    val kotlinName: String,
    val nativeName: String,
    val nativeValue: Long,
    val nativeMemberName: MemberName,
)

class EnumBlueprintBuilder(
    context: ProcessorContext,
    private val girNamespace: GirNamespace,
    private val girEnum: GirEnum
) : BlueprintBuilder<EnumBlueprint>(context) {
    private val members = mutableListOf<EnumMemberBlueprint>()

    override fun blueprintObjectType() = "enum"
    override fun blueprintObjectName(): String = girEnum.name

    private fun addMember(girMember: GirMember) {
        members.add(
            EnumMemberBlueprint(
                kotlinName = context.kotlinzeEnumMemberName(girMember.name),
                nativeName = girMember.name,
                nativeValue = girMember.value.toLong(),
                nativeMemberName = MemberName(
                    context.namespaceNativePackageName(girNamespace) + "." + girEnum.cType,
                    girMember.cIdentifier,
                ),
            ),
        )
    }

    override fun build(): BlueprintResult<EnumBlueprint> {
        println("Building enum")

        girEnum.members.forEach { addMember(it) }

        val kotlinName = context.kotlinizeEnumName(girEnum.name)

        return ok(
            EnumBlueprint(
                kotlinName = context.kotlinizeEnumName(girEnum.name),
                kotlinTypeName = ClassName(context.namespaceBindingsPackageName(girNamespace), kotlinName),
                nativeTypeName = ClassName(context.namespaceNativePackageName(girNamespace), girEnum.cType),
                memberBlueprints = members,
            ),
        )
    }
}
