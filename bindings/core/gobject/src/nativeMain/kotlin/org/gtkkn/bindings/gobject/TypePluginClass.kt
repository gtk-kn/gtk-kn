// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gobject.GTypePluginClass

/**
 * The #GTypePlugin interface is used by the type system in order to handle
 * the lifecycle of dynamically loaded types.
 *
 * ## Skipped during bindings generation
 *
 * - field `base_iface`: Record field base_iface is private
 * - field `use_plugin`: TypePluginUse
 * - field `unuse_plugin`: TypePluginUnuse
 * - field `complete_type_info`: TypePluginCompleteTypeInfo
 * - field `complete_interface_info`: TypePluginCompleteInterfaceInfo
 */
public class TypePluginClass(
    pointer: CPointer<GTypePluginClass>,
) : Record {
    public val gobjectTypePluginClassPointer: CPointer<GTypePluginClass> = pointer

    public companion object : RecordCompanion<TypePluginClass, GTypePluginClass> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): TypePluginClass =
            TypePluginClass(pointer.reinterpret())
    }
}
