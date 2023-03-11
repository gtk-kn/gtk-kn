package org.gtkkn.gir.model

/**
 * A field of struct of union structure, that is a C bit field, that is a fixed length in bits variable.
 *
 * @property info a [GirInfo] that a field can contain.
 * @property name name of the field.
 * @property writable true if the field is writeable.
 * @property readable true if the field is readable.
 * @property private true if the field is private to the structure or has public (false) visibility.
 * @property bits number of bits of the field.
 * @property type a [GirCallbackOrAnyType] that a field can contain.
 */
data class GirField(
    val info: GirInfo,
    val name: String,
    val writable: Boolean?,
    val readable: Boolean?,
    val private: Boolean?,
    val bits: Int?,
    val type: GirCallbackOrAnyType,
)
