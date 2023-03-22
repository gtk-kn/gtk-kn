package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.MemberName
import org.gtkkn.gir.model.GirBitField
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.processor.NotIntrospectableException
import org.gtkkn.gir.processor.ProcessorContext

class BitfieldBlueprintBuilder(
    context: ProcessorContext,
    private val girNamespace: GirNamespace,
    private val girBitfield: GirBitField,
) : BlueprintBuilder<BitfieldBlueprint>(context) {

    private val members = mutableListOf<BitfieldMemberBlueprint>()

    override fun blueprintObjectType(): String = "bitfield"

    override fun blueprintObjectName(): String = girBitfield.name

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
                    kdoc = context.processKdoc(member.info.docs.doc?.text),
                ),
            )
        }

        return BitfieldBlueprint(
            kotlinName = context.kotlinizeClassName(girBitfield.name),
            members = members,
            kotlinTypeName = kotlinTypeName,
            nativeValueTypeName = nativeValueTypeName,
            kdoc = context.processKdoc(girBitfield.info.docs.doc?.text),
        )
    }
}
