package org.gtkkn.gir.model

/**
 * A constant entity, similar to const variable in C.
 *
 * @property info info attributes of a constant (see [GirInfo]).
 * @property name name of the constant.
 * @property value value of the constant.
 * @property cType corresponding C type of the constant in C.
 * @property cIdentifier corresponding C identifier in the source code.
 * @property type a [GirType] that a const can contain.
 */
data class GirConstant(
    val info: GirInfo,
    val name: String,
    val value: String,
    val cType: String?,
    val cIdentifier: String?,
    val type: GirAnyType?,
)
