package org.gtkkn.gir.processor

/**
 * Exception thrown during gir processing when a function or method is shadowed by another so we should not generate
 * anything for it.
 */
class ShadowedFunctionException(
    val objectName: String,
    val shadowName: String
) : BlueprintException("$objectName is shadowedBy $shadowName")
