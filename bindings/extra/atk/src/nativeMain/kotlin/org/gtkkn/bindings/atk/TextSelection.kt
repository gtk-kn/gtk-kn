// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.atk.annotations.AtkVersion2_52
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.atk.AtkTextSelection
import kotlin.Boolean
import kotlin.Int

/**
 * This structure represents a single  text selection within a document. This
 * selection is defined by two points in the content, where each one is defined
 * by an AtkObject supporting the AtkText interface and a character offset
 * relative to it.
 *
 * The end object must appear after the start object in the accessibility tree,
 * i.e. the end object must be reachable from the start object by navigating
 * forward (next, first child etc).
 *
 * This struct also contains a @start_is_active boolean, to communicate if the
 * start of the selection is the active point or not.
 *
 * The active point corresponds to the user's focus or point of interest. The
 * user moves the active point to expand or collapse the range. The anchor
 * point is the other point of the range and typically remains constant. In
 * most cases, anchor is the start of the range and active is the end. However,
 * when selecting backwards (e.g. pressing shift+left arrow in a text field),
 * the start of the range is the active point, as the user moves this to
 * manipulate the selection.
 * @since 2.52
 */
@AtkVersion2_52
public class TextSelection(
    pointer: CPointer<AtkTextSelection>,
) : Record {
    public val atkTextSelectionPointer: CPointer<AtkTextSelection> = pointer

    /**
     * the AtkText containing the start of the selection.
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val startObject: Object?
        get() =
            atkTextSelectionPointer.pointed.start_object?.run {
                Object(reinterpret())
            }

    /**
     * the text offset of the beginning of the selection within
     *                @start_object.
     */
    public var startOffset: Int
        get() = atkTextSelectionPointer.pointed.start_offset
        set(`value`) {
            atkTextSelectionPointer.pointed.start_offset = value
        }

    /**
     * the AtkText containing the end of the selection.
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val endObject: Object?
        get() =
            atkTextSelectionPointer.pointed.end_object?.run {
                Object(reinterpret())
            }

    /**
     * the text offset of the end of the selection within @end_object.
     */
    public var endOffset: Int
        get() = atkTextSelectionPointer.pointed.end_offset
        set(`value`) {
            atkTextSelectionPointer.pointed.end_offset = value
        }

    /**
     * a gboolean indicating whether the start of the selection
     *                  is the active point.
     */
    public var startIsActive: Boolean
        get() = atkTextSelectionPointer.pointed.start_is_active.asBoolean()
        set(`value`) {
            atkTextSelectionPointer.pointed.start_is_active = value.asGBoolean()
        }

    public companion object : RecordCompanion<TextSelection, AtkTextSelection> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): TextSelection =
            TextSelection(pointer.reinterpret())
    }
}
