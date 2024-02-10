// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gtk.GtkPadActionEntry
import kotlin.Int
import kotlin.String

/**
 * Struct defining a pad action entry.
 */
public class PadActionEntry(
    pointer: CPointer<GtkPadActionEntry>,
) : Record {
    public val gtkPadActionEntryPointer: CPointer<GtkPadActionEntry> = pointer

    /**
     * the type of pad feature that will trigger this action entry.
     */
    public var type: PadActionType
        get() =
            gtkPadActionEntryPointer.pointed.type.run {
                PadActionType.fromNativeValue(this)
            }
        set(`value`) {
            gtkPadActionEntryPointer.pointed.type = value.nativeValue
        }

    /**
     * the 0-indexed button/ring/strip number that will trigger this action
     *   entry.
     */
    public var index: Int
        get() = gtkPadActionEntryPointer.pointed.index
        set(`value`) {
            gtkPadActionEntryPointer.pointed.index = value
        }

    /**
     * the mode that will trigger this action entry, or -1 for all modes.
     */
    public var mode: Int
        get() = gtkPadActionEntryPointer.pointed.mode
        set(`value`) {
            gtkPadActionEntryPointer.pointed.mode = value
        }

    /**
     * Human readable description of this action entry, this string should
     *   be deemed user-visible.
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val label: String?
        get() = gtkPadActionEntryPointer.pointed.label?.toKString()

    /**
     * action name that will be activated in the `GActionGroup`.
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val actionName: String?
        get() = gtkPadActionEntryPointer.pointed.action_name?.toKString()

    public companion object : RecordCompanion<PadActionEntry, GtkPadActionEntry> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): PadActionEntry =
            PadActionEntry(pointer.reinterpret())
    }
}
