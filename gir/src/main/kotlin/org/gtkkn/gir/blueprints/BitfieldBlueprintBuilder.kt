package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.MemberName
import org.gtkkn.gir.model.GirBitField
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.processor.ProcessorContext

class BitfieldBlueprintBuilder(
    context: ProcessorContext,
    private val girNamespace: GirNamespace,
    private val girBitfield: GirBitField
) : BlueprintBuilder<BitfieldBlueprint>(context) {

    private val members = mutableListOf<BitfieldMemberBlueprint>()

    override fun blueprintObjectType(): String = "bitfield"

    override fun blueprintObjectName(): String = girBitfield.name

    override fun buildInternal(): BitfieldBlueprint {
        context.checkIgnoredType(girBitfield.cType)

        val kotlinName = context.kotlinizeBitfieldName(girBitfield.name)
        val kotlinPackageName = context.kotlinizePackageName(girNamespace.name)
        val kotlinTypeName = ClassName(kotlinPackageName, kotlinName)

        val nativePackageName = context.namespaceNativePackageName(girNamespace)
        val nativeValueTypeName = ClassName(nativePackageName, girBitfield.cType)

        girBitfield.members.forEach { m ->
            val memberKotlinName = context.kotlinizeBitfieldMemberName(m.name)
            members.add(
                BitfieldMemberBlueprint(
                    kotlinName = memberKotlinName,
                    nativeValue = m.value.toLong(),
                    nativeMemberName = MemberName(nativePackageName, m.cIdentifier),
                ),
            )
        }

        return BitfieldBlueprint(
            kotlinName = context.kotlinizeClassName(girBitfield.name),
            members = members,
            kotlinTypeName = kotlinTypeName,
            nativeValueTypeName = nativeValueTypeName,
        )
    }
}
