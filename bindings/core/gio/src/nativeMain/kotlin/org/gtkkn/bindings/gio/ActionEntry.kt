// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gio.GActionEntry
import kotlin.String

/**
 * This struct defines a single action.  It is for use with
 * g_action_map_add_action_entries().
 *
 * The order of the items in the structure are intended to reflect
 * frequency of use.  It is permissible to use an incomplete initialiser
 * in order to leave some of the later values as null.  All values
 * after @name are optional.  Additional optional fields may be added in
 * the future.
 *
 * See g_action_map_add_action_entries() for an example.
 *
 * ## Skipped during bindings generation
 *
 * - field `activate`: Fields with callbacks are not supported
 * - field `change_state`: Fields with callbacks are not supported
 * - field `padding`: Record field padding is private
 */
public class ActionEntry(
    pointer: CPointer<GActionEntry>,
) : Record {
    public val gioActionEntryPointer: CPointer<GActionEntry> = pointer

    /**
     * the name of the action
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val name: String?
        get() = gioActionEntryPointer.pointed.name?.toKString()

    /**
     * the type of the parameter that must be passed to the
     *                  activate function for this action, given as a single
     *                  GVariant type string (or null for no parameter)
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val parameterType: String?
        get() = gioActionEntryPointer.pointed.parameter_type?.toKString()

    /**
     * the initial state for this action, given in
     *         [GVariant text format][gvariant-text].  The state is parsed
     *         with no extra type information, so type tags must be added to
     *         the string if they are necessary.  Stateless actions should
     *         give null here.
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val state: String?
        get() = gioActionEntryPointer.pointed.state?.toKString()

    public companion object : RecordCompanion<ActionEntry, GActionEntry> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): ActionEntry =
            ActionEntry(pointer.reinterpret())
    }
}
