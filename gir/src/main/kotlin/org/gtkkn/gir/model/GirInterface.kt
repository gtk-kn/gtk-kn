package org.gtkkn.gir.model

/**
 * Abstract interface to other classes.
 *
 * @property info attributes of an Interface (see [GirInfo]).
 * @property name name of the interface.
 * @property glibTypeName type name compatible with the GObject type system.
 * @property glibGetType function to get the GObject compatible type of the interface.
 * @property cSymbolPrefix prefix to filter out from C functions. For example, gtk_window_new will lose gtk_.
 * @property cType corresponding C type.
 * @property glibTypeStruct GObject compatible C structure defining the Interface.
 * @property prerequisites a list of [GirPrerequisite] that an interface can contain.
 * @property implements a list of [GirImplements] that an interface can contain.
 * @property functions a list of [GirFunction] that an interface can contain.
 * @property constructor a list of [GirConstructor] that an interface can contain.
 * @property methods a list of [GirMethod] that an interface can contain.
 * @property virtualMethods a list of [GirVirtualMethod] that an interface can contain.
 * @property fields a list of [GirField] that an interface can contain.
 * @property properties a list of [GirProperty] that an interface can contain.
 * @property signals a list of [GirSignal] that an interface can contain.
 * @property constants a list of [GirConstant] that an interface can contain.
 * @property callbacks a list of [GirCallback] that an interface can contain.
 */
data class GirInterface(
    val info: GirInfo,
    val name: String,
    val glibTypeName: String,
    val glibGetType: String,
    val cSymbolPrefix: String,
    val cType: String?,
    val glibTypeStruct: String?,
    val prerequisites: List<GirPrerequisite>,
    val implements: List<GirImplements>,
    val functions: List<GirFunction>,
    val constructor: GirConstructor?,
    val methods: List<GirMethod>,
    val virtualMethods: List<GirVirtualMethod>,
    val fields: List<GirField>,
    val properties: List<GirProperty>,
    val signals: List<GirSignal>,
    val constants: List<GirConstant>,
    val callbacks: List<GirCallback>,
)
