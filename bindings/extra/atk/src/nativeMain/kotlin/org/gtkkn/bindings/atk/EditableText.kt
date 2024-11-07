// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.atk.AtkEditableText
import org.gtkkn.native.atk.atk_editable_text_copy_text
import org.gtkkn.native.atk.atk_editable_text_cut_text
import org.gtkkn.native.atk.atk_editable_text_delete_text
import org.gtkkn.native.atk.atk_editable_text_get_type
import org.gtkkn.native.atk.atk_editable_text_paste_text
import org.gtkkn.native.atk.atk_editable_text_set_text_contents
import kotlin.Int
import kotlin.String
import kotlin.Unit

/**
 * The ATK interface implemented by components containing user-editable text content.
 *
 * #AtkEditableText should be implemented by UI components which
 * contain text which the user can edit, via the #AtkObject
 * corresponding to that component (see #AtkObject).
 *
 * #AtkEditableText is a subclass of #AtkText, and as such, an object
 * which implements #AtkEditableText is by definition an #AtkText
 * implementor as well.
 *
 * See [iface@AtkText]
 *
 * ## Skipped during bindings generation
 *
 * - parameter `position`: Unsupported pointer to primitive type
 * - parameter `attrib_set`: AttributeSet
 */
public interface EditableText :
    Interface,
    KGTyped {
    public val atkEditableTextPointer: CPointer<AtkEditableText>

    /**
     * Copy text from @start_pos up to, but not including @end_pos
     * to the clipboard.
     *
     * @param startPos start position
     * @param endPos end position
     */
    public fun copyText(
        startPos: Int,
        endPos: Int,
    ): Unit = atk_editable_text_copy_text(atkEditableTextPointer.reinterpret(), startPos, endPos)

    /**
     * Copy text from @start_pos up to, but not including @end_pos
     * to the clipboard and then delete from the widget.
     *
     * @param startPos start position
     * @param endPos end position
     */
    public fun cutText(
        startPos: Int,
        endPos: Int,
    ): Unit = atk_editable_text_cut_text(atkEditableTextPointer.reinterpret(), startPos, endPos)

    /**
     * Delete text @start_pos up to, but not including @end_pos.
     *
     * @param startPos start position
     * @param endPos end position
     */
    public fun deleteText(
        startPos: Int,
        endPos: Int,
    ): Unit = atk_editable_text_delete_text(atkEditableTextPointer.reinterpret(), startPos, endPos)

    /**
     * Paste text from clipboard to specified @position.
     *
     * @param position position to paste
     */
    public fun pasteText(position: Int): Unit =
        atk_editable_text_paste_text(atkEditableTextPointer.reinterpret(), position)

    /**
     * Set text contents of @text.
     *
     * @param string string to set for text contents of @text
     */
    public fun setTextContents(string: String): Unit =
        atk_editable_text_set_text_contents(atkEditableTextPointer.reinterpret(), string)

    private data class Wrapper(
        private val pointer: CPointer<AtkEditableText>,
    ) : EditableText {
        override val atkEditableTextPointer: CPointer<AtkEditableText> = pointer
    }

    public companion object : TypeCompanion<EditableText> {
        override val type: GeneratedInterfaceKGType<EditableText> =
            GeneratedInterfaceKGType(atk_editable_text_get_type()) { Wrapper(it.reinterpret()) }

        init {
            AtkTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<AtkEditableText>): EditableText = Wrapper(pointer)
    }
}
