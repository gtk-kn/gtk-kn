package org.gtkkn.gir.model

/**
 * Boxed type (wrapper to opaque C structures registered by the type system).
 *
 * @property info attributes of a Boxed type (see [GirInfo]).
 * @property glibName GObject compatible type name of the boxed type.
 * @property cSymbolPrefix prefix to filter out from C functions. For example, gtk_window_new will lose gtk_.
 * @property glibTypeName GObject compatible type name of the boxed type.
 * @property glibGetType function to get the GObject compatible type of the boxed type.
 * @property functions a list of [GirFunction] that a Boxed type can contain.
 */
data class GirBoxed(
    val info: GirInfo,
    val glibName: String,
    val cSymbolPrefix: String?,
    val glibTypeName: String?,
    val glibGetType: String?,
    val functions: List<GirFunction>,
)
