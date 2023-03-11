package org.gtkkn.gir.model

/**
 * A simple type of data (as opposed to an array).
 *
 * @property name name of the type.
 * @property cType the C representation of the type.
 * @property introspectable true if the element is introspectable. It doesn't exist in the bindings, due in general to
 *                          missing information in the annotations in the original C code.
 * @property types a list of [GirAnyType] that a simple type can contain.
 * @property docs a [GirDocElements].
 */
data class GirType(
    val name: String?,
    val cType: String?,
    val introspectable: Boolean?,
    val types: List<GirAnyType>,
    val docs: GirDocElements,
) : GirAnyType
