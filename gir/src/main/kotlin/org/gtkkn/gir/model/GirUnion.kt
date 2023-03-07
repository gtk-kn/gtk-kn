package org.gtkkn.gir.model

/**
 * Element defining a type of data being a union of type, similar to union in C/C++ but extended with fields and methods
 *
 * @property info attributes of a union (see [GirInfo]).
 * @property name name of the union.
 * @property cType corresponding C type.
 * @property cSymbolPrefix prefix to filter out from C functions. For example, gtk_window_new will lose gtk_.
 * @property glibTypeName type name compatible with the GObject type system.
 * @property glibGetType function to get the GObject compatible type of the union.
 * @property copyFunction name of the function used to copy the union.
 * @property freeFunction name of the function used to free the union.
 * @property fields a list of [GirField] that a union can contain.
 * @property constructors a list of [GirConstructor] that a union can contain.
 * @property methods a list of [GirMethod] that a union can contain.
 * @property functions a list of [GirFunction] that a union can contain.
 * @property records a list of [GirRecord] that a union can contain.
 */
data class GirUnion(
    val info: GirInfo,
    val name: String?,
    val cType: String?,
    val cSymbolPrefix: String?,
    val glibTypeName: String?,
    val glibGetType: String?,
    val copyFunction: String?,
    val freeFunction: String?,
    val fields: List<GirField>,
    val constructors: List<GirConstructor>,
    val methods: List<GirMethod>,
    val functions: List<GirFunction>,
    val records: List<GirRecord>,
)
