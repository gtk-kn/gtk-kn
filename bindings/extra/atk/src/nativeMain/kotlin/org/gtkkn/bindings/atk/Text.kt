// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.atk.annotations.AtkVersion1_3
import org.gtkkn.bindings.atk.annotations.AtkVersion2_32
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.atk.AtkText
import org.gtkkn.native.atk.atk_text_add_selection
import org.gtkkn.native.atk.atk_text_get_caret_offset
import org.gtkkn.native.atk.atk_text_get_character_at_offset
import org.gtkkn.native.atk.atk_text_get_character_count
import org.gtkkn.native.atk.atk_text_get_n_selections
import org.gtkkn.native.atk.atk_text_get_offset_at_point
import org.gtkkn.native.atk.atk_text_get_range_extents
import org.gtkkn.native.atk.atk_text_get_text
import org.gtkkn.native.atk.atk_text_get_type
import org.gtkkn.native.atk.atk_text_remove_selection
import org.gtkkn.native.atk.atk_text_scroll_substring_to
import org.gtkkn.native.atk.atk_text_scroll_substring_to_point
import org.gtkkn.native.atk.atk_text_set_caret_offset
import org.gtkkn.native.atk.atk_text_set_selection
import org.gtkkn.native.gobject.g_signal_connect_data
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.UInt
import kotlin.ULong
import kotlin.Unit

/**
 * The ATK interface implemented by components with text content.
 *
 * #AtkText should be implemented by #AtkObjects on behalf of widgets
 * that have text content which is either attributed or otherwise
 * non-trivial.  #AtkObjects whose text content is simple,
 * unattributed, and very brief may expose that content via
 * #atk_object_get_name instead; however if the text is editable,
 * multi-line, typically longer than three or four words, attributed,
 * selectable, or if the object already uses the 'name' ATK property
 * for other information, the #AtkText interface should be used to
 * expose the text content.  In the case of editable text content,
 * #AtkEditableText (a subtype of the #AtkText interface) should be
 * implemented instead.
 *
 *  #AtkText provides not only traversal facilities and change
 * notification for text content, but also caret tracking and glyph
 * bounding box calculations.  Note that the text strings are exposed
 * as UTF-8, and are therefore potentially multi-byte, and
 * caret-to-byte offset mapping makes no assumptions about the
 * character length; also bounding box glyph-to-offset mapping may be
 * complex for languages which use ligatures.
 *
 * ## Skipped during bindings generation
 *
 * - method `get_bounded_ranges`: Array parameter of type TextRange is not supported
 * - parameter `x`: x: Out parameter is not supported
 * - method `get_default_attributes`: Return type AttributeSet is unsupported
 * - parameter `start_offset`: start_offset: Out parameter is not supported
 * - parameter `start_offset`: start_offset: Out parameter is not supported
 * - parameter `start_offset`: start_offset: Out parameter is not supported
 * - parameter `start_offset`: start_offset: Out parameter is not supported
 * - parameter `start_offset`: start_offset: Out parameter is not supported
 * - parameter `start_offset`: start_offset: Out parameter is not supported
 * - parameter `ranges`: Array parameter of type TextRange is not supported
 */
public interface Text :
    Interface,
    KGTyped {
    public val atkTextPointer: CPointer<AtkText>

    /**
     * Adds a selection bounded by the specified offsets.
     *
     * @param startOffset the starting character offset of the selected region
     * @param endOffset the offset of the first character after the selected region.
     * @return true if successful, false otherwise
     */
    public fun addSelection(
        startOffset: Int,
        endOffset: Int,
    ): Boolean = atk_text_add_selection(atkTextPointer.reinterpret(), startOffset, endOffset).asBoolean()

    /**
     * Gets the offset of the position of the caret (cursor).
     *
     * @return the character offset of the position of the caret or -1 if
     *          the caret is not located inside the element or in the case of
     *          any other failure.
     */
    public fun getCaretOffset(): Int = atk_text_get_caret_offset(atkTextPointer.reinterpret())

    /**
     * Gets the specified text.
     *
     * @param offset a character offset within @text
     * @return the character at @offset or 0 in the case of failure.
     */
    public fun getCharacterAtOffset(offset: Int): UInt =
        atk_text_get_character_at_offset(atkTextPointer.reinterpret(), offset)

    /**
     * Gets the character count.
     *
     * @return the number of characters or -1 in case of failure.
     */
    public fun getCharacterCount(): Int = atk_text_get_character_count(atkTextPointer.reinterpret())

    /**
     * Gets the number of selected regions.
     *
     * @return The number of selected regions, or -1 in the case of failure.
     */
    public fun getNSelections(): Int = atk_text_get_n_selections(atkTextPointer.reinterpret())

    /**
     * Gets the offset of the character located at coordinates @x and @y. @x and @y
     * are interpreted as being relative to the screen or this widget's window
     * depending on @coords.
     *
     * @param x screen x-position of character
     * @param y screen y-position of character
     * @param coords specify whether coordinates are relative to the screen or
     * widget window
     * @return the offset to the character which is located at  the specified
     *          @x and @y coordinates of -1 in case of failure.
     */
    public fun getOffsetAtPoint(
        x: Int,
        y: Int,
        coords: CoordType,
    ): Int = atk_text_get_offset_at_point(atkTextPointer.reinterpret(), x, y, coords.nativeValue)

    /**
     * Get the bounding box for text within the specified range.
     *
     * If the extents can not be obtained (e.g. or missing support), the rectangle
     * fields are set to -1.
     *
     * @param startOffset The offset of the first text character for which boundary
     *        information is required.
     * @param endOffset The offset of the text character after the last character
     *        for which boundary information is required.
     * @param coordType Specify whether coordinates are relative to the screen or widget window.
     * @param rect A pointer to a AtkTextRectangle which is filled in by this function.
     * @since 1.3
     */
    @AtkVersion1_3
    public fun getRangeExtents(
        startOffset: Int,
        endOffset: Int,
        coordType: CoordType,
        rect: TextRectangle,
    ): Unit =
        atk_text_get_range_extents(
            atkTextPointer.reinterpret(),
            startOffset,
            endOffset,
            coordType.nativeValue,
            rect.atkTextRectanglePointer
        )

    /**
     * Gets the specified text.
     *
     * @param startOffset a starting character offset within @text
     * @param endOffset an ending character offset within @text, or -1 for the end of the string.
     * @return a newly allocated string containing the text from @start_offset up
     *          to, but not including @end_offset. Use g_free() to free the returned
     *          string.
     */
    public fun getText(
        startOffset: Int,
        endOffset: Int,
    ): String =
        atk_text_get_text(atkTextPointer.reinterpret(), startOffset, endOffset)?.toKString()
            ?: error("Expected not null string")

    /**
     * Removes the specified selection.
     *
     * @param selectionNum The selection number.  The selected regions are
     * assigned numbers that correspond to how far the region is from the
     * start of the text.  The selected region closest to the beginning
     * of the text region is assigned the number 0, etc.  Note that adding,
     * moving or deleting a selected region can change the numbering.
     * @return true if successful, false otherwise
     */
    public fun removeSelection(selectionNum: Int): Boolean =
        atk_text_remove_selection(atkTextPointer.reinterpret(), selectionNum).asBoolean()

    /**
     * Makes a substring of @text visible on the screen by scrolling all necessary parents.
     *
     * @param startOffset start offset in the @text
     * @param endOffset end offset in the @text, or -1 for the end of the text.
     * @param type specify where the object should be made visible.
     * @return whether scrolling was successful.
     * @since 2.32
     */
    @AtkVersion2_32
    public fun scrollSubstringTo(
        startOffset: Int,
        endOffset: Int,
        type: ScrollType,
    ): Boolean =
        atk_text_scroll_substring_to(atkTextPointer.reinterpret(), startOffset, endOffset, type.nativeValue).asBoolean()

    /**
     * Move the top-left of a substring of @text to a given position of the screen
     * by scrolling all necessary parents.
     *
     * @param startOffset start offset in the @text
     * @param endOffset end offset in the @text, or -1 for the end of the text.
     * @param coords specify whether coordinates are relative to the screen or to the
     * parent object.
     * @param x x-position where to scroll to
     * @param y y-position where to scroll to
     * @return whether scrolling was successful.
     * @since 2.32
     */
    @AtkVersion2_32
    public fun scrollSubstringToPoint(
        startOffset: Int,
        endOffset: Int,
        coords: CoordType,
        x: Int,
        y: Int,
    ): Boolean =
        atk_text_scroll_substring_to_point(
            atkTextPointer.reinterpret(),
            startOffset,
            endOffset,
            coords.nativeValue,
            x,
            y
        ).asBoolean()

    /**
     * Sets the caret (cursor) position to the specified @offset.
     *
     * In the case of rich-text content, this method should either grab focus
     * or move the sequential focus navigation starting point (if the application
     * supports this concept) as if the user had clicked on the new caret position.
     * Typically, this means that the target of this operation is the node containing
     * the new caret position or one of its ancestors. In other words, after this
     * method is called, if the user advances focus, it should move to the first
     * focusable node following the new caret position.
     *
     * Calling this method should also scroll the application viewport in a way
     * that matches the behavior of the application's typical caret motion or tab
     * navigation as closely as possible. This also means that if the application's
     * caret motion or focus navigation does not trigger a scroll operation, this
     * method should not trigger one either. If the application does not have a caret
     * motion or focus navigation operation, this method should try to scroll the new
     * caret position into view while minimizing unnecessary scroll motion.
     *
     * @param offset the character offset of the new caret position
     * @return true if successful, false otherwise.
     */
    public fun setCaretOffset(offset: Int): Boolean =
        atk_text_set_caret_offset(atkTextPointer.reinterpret(), offset).asBoolean()

    /**
     * Changes the start and end offset of the specified selection.
     *
     * @param selectionNum The selection number.  The selected regions are
     * assigned numbers that correspond to how far the region is from the
     * start of the text.  The selected region closest to the beginning
     * of the text region is assigned the number 0, etc.  Note that adding,
     * moving or deleting a selected region can change the numbering.
     * @param startOffset the new starting character offset of the selection
     * @param endOffset the new end position of (e.g. offset immediately past)
     * the selection
     * @return true if successful, false otherwise
     */
    public fun setSelection(
        selectionNum: Int,
        startOffset: Int,
        endOffset: Int,
    ): Boolean = atk_text_set_selection(atkTextPointer.reinterpret(), selectionNum, startOffset, endOffset).asBoolean()

    /**
     * The "text-attributes-changed" signal is emitted when the text
     * attributes of the text of an object which implements AtkText
     * changes.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectTextAttributesChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            atkTextPointer.reinterpret(),
            "text-attributes-changed",
            connectTextAttributesChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The "text-caret-moved" signal is emitted when the caret
     * position of the text of an object which implements AtkText
     * changes.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `arg1` The new position of the text caret.
     */
    public fun connectTextCaretMoved(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (arg1: Int) -> Unit,
    ): ULong =
        g_signal_connect_data(
            atkTextPointer.reinterpret(),
            "text-caret-moved",
            connectTextCaretMovedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The "text-changed" signal is emitted when the text of the
     * object which implements the AtkText interface changes, This
     * signal will have a detail which is either "insert" or
     * "delete" which identifies whether the text change was an
     * insertion or a deletion.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `arg1` The position (character offset) of the insertion or deletion.; `arg2` The length (in characters) of text inserted or deleted.
     */
    public fun connectTextChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (arg1: Int, arg2: Int) -> Unit,
    ): ULong =
        g_signal_connect_data(
            atkTextPointer.reinterpret(),
            "text-changed",
            connectTextChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The "text-insert" signal is emitted when a new text is
     * inserted. If the signal was not triggered by the user
     * (e.g. typing or pasting text), the "system" detail should be
     * included.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `arg1` The position (character offset) of the insertion.; `arg2` The length (in characters) of text inserted.; `arg3` The new text inserted
     */
    public fun connectTextInsert(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            arg1: Int,
            arg2: Int,
            arg3: String,
        ) -> Unit,
    ): ULong =
        g_signal_connect_data(
            atkTextPointer.reinterpret(),
            "text-insert",
            connectTextInsertFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The "text-remove" signal is emitted when a new text is
     * removed. If the signal was not triggered by the user
     * (e.g. typing or pasting text), the "system" detail should be
     * included.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `arg1` The position (character offset) of the removal.; `arg2` The length (in characters) of text removed.; `arg3` The old text removed
     */
    public fun connectTextRemove(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            arg1: Int,
            arg2: Int,
            arg3: String,
        ) -> Unit,
    ): ULong =
        g_signal_connect_data(
            atkTextPointer.reinterpret(),
            "text-remove",
            connectTextRemoveFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The "text-selection-changed" signal is emitted when the
     * selected text of an object which implements AtkText changes.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectTextSelectionChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            atkTextPointer.reinterpret(),
            "text-selection-changed",
            connectTextSelectionChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    private data class Wrapper(
        private val pointer: CPointer<AtkText>,
    ) : Text {
        override val atkTextPointer: CPointer<AtkText> = pointer
    }

    public companion object : TypeCompanion<Text> {
        override val type: GeneratedInterfaceKGType<Text> =
            GeneratedInterfaceKGType(atk_text_get_type()) { Wrapper(it.reinterpret()) }

        init {
            AtkTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<AtkText>): Text = Wrapper(pointer)
    }
}

private val connectTextAttributesChangedFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

private val connectTextCaretMovedFunc: CPointer<CFunction<(Int) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            arg1: Int,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(arg1: Int) -> Unit>().get().invoke(arg1)
    }.reinterpret()

private val connectTextChangedFunc: CPointer<CFunction<(Int, Int) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            arg1: Int,
            arg2: Int,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(arg1: Int, arg2: Int) -> Unit>().get().invoke(arg1, arg2)
    }.reinterpret()

private val connectTextInsertFunc: CPointer<
    CFunction<
        (
            Int,
            Int,
            CPointer<ByteVar>,
        ) -> Unit
    >
> =
    staticCFunction {
            _: COpaquePointer,
            arg1: Int,
            arg2: Int,
            arg3: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<
                (
                    arg1: Int,
                    arg2: Int,
                    arg3: String,
                ) -> Unit
            >()
            .get()
            .invoke(arg1, arg2, arg3?.toKString() ?: error("Expected not null string"))
    }.reinterpret()

private val connectTextRemoveFunc: CPointer<
    CFunction<
        (
            Int,
            Int,
            CPointer<ByteVar>,
        ) -> Unit
    >
> =
    staticCFunction {
            _: COpaquePointer,
            arg1: Int,
            arg2: Int,
            arg3: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<
                (
                    arg1: Int,
                    arg2: Int,
                    arg3: String,
                ) -> Unit
            >()
            .get()
            .invoke(arg1, arg2, arg3?.toKString() ?: error("Expected not null string"))
    }.reinterpret()

private val connectTextSelectionChangedFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()
