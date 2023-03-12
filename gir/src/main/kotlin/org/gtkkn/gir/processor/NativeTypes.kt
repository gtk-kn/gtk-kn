package org.gtkkn.gir.processor

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.TypeName

object NativeTypes {
    /**
     * A [TypeName] for kotlinx.cinterop.CPointer.
     */
    val KP_CPOINTER = ClassName("kotlinx.cinterop", "CPointer")

    val KP_BYTEVAR = ClassName("kotlinx.cinterop", "ByteVar")

    /**
     * A [TypeName] for kotlinx.cinterop.CPointer pointing to [typeName]
     */
    fun cpointerOf(typeName: TypeName): TypeName = KP_CPOINTER.parameterizedBy(typeName)
}
