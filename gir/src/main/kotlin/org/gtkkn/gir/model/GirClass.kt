package org.gtkkn.gir.model

/**
 * GObject inherited class definition.
 *
 * @property info attributes of a Class (see [GirInfo]).
 * @property name name of the class.
 * @property glibTypeName GObject compatible type name of the class.
 * @property glibGetType function to get the GObject compatible type of the class.
 * @property parent name of the parent class if any.
 * @property glibTypeStruct GObject compatible C structure defining the class
 * @property glibRefFunc GObject compatible function to reference or increase the reference count of the class.
 * @property glibUnrefFunc GObject compatible function to unreference or decrease the reference count of the class.
 * @property glibSetValueFunc GObject compatible function to set a value of a property of the class.
 * @property glibGetValueFunc GObject compatible function to get a value of a property of the class.
 * @property cType C type of the class.
 * @property cSymbolPrefix prefix to filter out from C functions. For example, gtk_window_new will lose gtk_.
 * @property abstract true to declare the class abstract.
 * @property glibFundamental true to declare the class fundamental (top-level class which do not derives from any other
 *                           type).
 * @property final true to declare the class final (non-derivable class in a derivable hierarchy).
 * @property implements a list of [GirImplements] that a class can contain.
 * @property constructors a list of [GirConstructor] that a class can contain.
 * @property methods a list of [GirMethod] that a class can contain.
 * @property functions a list of [GirFunction] that a class can contain.
 * @property virtualMethods a list of [GirVirtualMethod] that a class can contain.
 * @property fields a list of [GirField] that a class can contain.
 * @property properties a list of [GirProperty] that a class can contain.
 * @property signals a list of [GirSignal] that a class can contain.
 * @property unions a list of [GirUnion] that a class can contain.
 * @property constants a list of [GirConstant] that a class can contain.
 * @property records a list of [GirRecord] that a class can contain.
 * @property callbacks a list of [GirCallback] that a class can contain.
 */
data class GirClass(
    val info: GirInfo,
    val name: String,
    val glibTypeName: String,
    val glibGetType: String,
    val parent: String?,
    val glibTypeStruct: String?,
    val glibRefFunc: String?,
    val glibUnrefFunc: String?,
    val glibSetValueFunc: String?,
    val glibGetValueFunc: String?,
    val cType: String?,
    val cSymbolPrefix: String?,
    val abstract: Boolean?,
    val glibFundamental: Boolean?,
    val final: Boolean?,
    val implements: List<GirImplements>,
    val constructors: List<GirConstructor>,
    val methods: List<GirMethod>,
    val functions: List<GirFunction>,
    val virtualMethods: List<GirVirtualMethod>,
    val fields: List<GirField>,
    val properties: List<GirProperty>,
    val signals: List<GirSignal>,
    val unions: List<GirUnion>,
    val constants: List<GirConstant>,
    val records: List<GirRecord>,
    val callbacks: List<GirCallback>,
)
