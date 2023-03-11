package org.gtkkn.gir.model

/**
 * An array type of data where each element is of the same type.
 *
 * @property name name of the array type.
 * @property zeroTerminated true if the last element of the array is zero. For example, in an array of pointers,
 *                          the last pointer would be NULL.
 * @property fixedSize size of an array of predetermined fixed size. For example a C array declared as char arr[5].
 * @property introspectable true if the element is introspectable. It doesn't exist in the bindings, due in general to
 *                          missing information in the annotations in the original C code.
 * @property length 0-based index of parameter element that specifies the length of the array.
 * @property cType the C representation of the array type.
 * @property type a [GirAnyType] that an array type can contain.
 */
data class GirArrayType(
    val name: String?,
    val zeroTerminated: Boolean?,
    val fixedSize: Int?,
    val introspectable: Boolean?,
    val length: Int?,
    val cType: String?,
    val type: GirAnyType,
) : GirAnyType
