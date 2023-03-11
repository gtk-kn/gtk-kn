package org.gtkkn.gir.model

/**
 * Dependant namespace to include with the current namespace.
 *
 * For example, Gtk will need the namespace GLib.
 *
 * @property name name of the dependant namespace to include.
 * @property version version of the dependant namespace to use.
 */
data class GirInclude(
    val name: String,
    val version: String?,
)
