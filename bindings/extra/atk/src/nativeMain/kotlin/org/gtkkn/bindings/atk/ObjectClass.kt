// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.atk.AtkObjectClass

/**
 * ## Skipped during bindings generation
 *
 * - field `parent`: GObject.ObjectClass
 * - field `get_name`: Fields with callbacks are not supported
 * - field `get_description`: Fields with callbacks are not supported
 * - field `get_parent`: Fields with callbacks are not supported
 * - field `get_n_children`: Fields with callbacks are not supported
 * - field `ref_child`: Fields with callbacks are not supported
 * - field `get_index_in_parent`: Fields with callbacks are not supported
 * - field `ref_relation_set`: Fields with callbacks are not supported
 * - field `get_role`: Fields with callbacks are not supported
 * - field `get_layer`: Fields with callbacks are not supported
 * - field `get_mdi_zorder`: Fields with callbacks are not supported
 * - field `ref_state_set`: Fields with callbacks are not supported
 * - field `set_name`: Fields with callbacks are not supported
 * - field `set_description`: Fields with callbacks are not supported
 * - field `set_parent`: Fields with callbacks are not supported
 * - field `set_role`: Fields with callbacks are not supported
 * - field `connect_property_change_handler`: Fields with callbacks are not supported
 * - field `remove_property_change_handler`: Fields with callbacks are not supported
 * - field `initialize`: Fields with callbacks are not supported
 * - field `children_changed`: Fields with callbacks are not supported
 * - field `focus_event`: Fields with callbacks are not supported
 * - field `property_change`: Fields with callbacks are not supported
 * - field `state_change`: Fields with callbacks are not supported
 * - field `visible_data_changed`: Fields with callbacks are not supported
 * - field `active_descendant_changed`: Fields with callbacks are not supported
 * - field `get_attributes`: Fields with callbacks are not supported
 * - field `get_object_locale`: Fields with callbacks are not supported
 * - field `pad1`: Function
 */
public class ObjectClass(
    pointer: CPointer<AtkObjectClass>,
) : Record {
    public val atkObjectClassPointer: CPointer<AtkObjectClass> = pointer

    public companion object : RecordCompanion<ObjectClass, AtkObjectClass> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): ObjectClass =
            ObjectClass(pointer.reinterpret())
    }
}
