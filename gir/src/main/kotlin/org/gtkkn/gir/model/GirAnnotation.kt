package org.gtkkn.gir.model

/**
 * Element defining an annotation from the source code.
 *
 * Usually a user-defined annotation associated to a parameter or a return value.
 *
 * @property name name of the attribute.
 * @property value value of the attribute.
 */
data class GirAnnotation(
    val name: String,
    val value: String,
)
