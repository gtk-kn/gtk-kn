package org.gtkkn.gir.processor

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.TypeName
import com.squareup.kotlinpoet.WildcardTypeName

object NativeTypes {
    val KP_CPOINTED = ClassName("kotlinx.cinterop", "CPointed")

    /**
     * A [TypeName] for kotlinx.cinterop.CPointer.
     */
    val KP_CPOINTER = ClassName("kotlinx.cinterop", "CPointer")

    val KP_WILDCARD_CPOINTER = cpointerOf(WildcardTypeName.producerOf(KP_CPOINTED))

    val KP_BYTEVAR = ClassName("kotlinx.cinterop", "ByteVar")

    /**
     * A [TypeName] for kotlinx.cinterop.CPointer pointing to [typeName]
     */
    fun cpointerOf(typeName: TypeName): TypeName = KP_CPOINTER.parameterizedBy(typeName)
}
