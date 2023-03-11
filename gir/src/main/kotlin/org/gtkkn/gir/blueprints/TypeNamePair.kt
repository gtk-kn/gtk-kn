package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.TypeName

/**
 * Helper structure for combining a native type with an associated kotlin type.
 */
data class TypeNamePair(
    val nativeTypeName: TypeName,
    val kotlinTypeName: TypeName,
)
