// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.Bytes
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.SList
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.pango.Pango.resolveException
import org.gtkkn.bindings.pango.annotations.PangoVersion1_16
import org.gtkkn.bindings.pango.annotations.PangoVersion1_20
import org.gtkkn.bindings.pango.annotations.PangoVersion1_22
import org.gtkkn.bindings.pango.annotations.PangoVersion1_30
import org.gtkkn.bindings.pango.annotations.PangoVersion1_32_4
import org.gtkkn.bindings.pango.annotations.PangoVersion1_4
import org.gtkkn.bindings.pango.annotations.PangoVersion1_44
import org.gtkkn.bindings.pango.annotations.PangoVersion1_46
import org.gtkkn.bindings.pango.annotations.PangoVersion1_50
import org.gtkkn.bindings.pango.annotations.PangoVersion1_6
import org.gtkkn.bindings.pango.annotations.PangoVersion1_8
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.GError
import org.gtkkn.native.pango.PangoLayout
import org.gtkkn.native.pango.pango_layout_context_changed
import org.gtkkn.native.pango.pango_layout_copy
import org.gtkkn.native.pango.pango_layout_get_alignment
import org.gtkkn.native.pango.pango_layout_get_attributes
import org.gtkkn.native.pango.pango_layout_get_auto_dir
import org.gtkkn.native.pango.pango_layout_get_baseline
import org.gtkkn.native.pango.pango_layout_get_caret_pos
import org.gtkkn.native.pango.pango_layout_get_character_count
import org.gtkkn.native.pango.pango_layout_get_cursor_pos
import org.gtkkn.native.pango.pango_layout_get_direction
import org.gtkkn.native.pango.pango_layout_get_ellipsize
import org.gtkkn.native.pango.pango_layout_get_extents
import org.gtkkn.native.pango.pango_layout_get_font_description
import org.gtkkn.native.pango.pango_layout_get_height
import org.gtkkn.native.pango.pango_layout_get_indent
import org.gtkkn.native.pango.pango_layout_get_iter
import org.gtkkn.native.pango.pango_layout_get_justify
import org.gtkkn.native.pango.pango_layout_get_justify_last_line
import org.gtkkn.native.pango.pango_layout_get_line
import org.gtkkn.native.pango.pango_layout_get_line_count
import org.gtkkn.native.pango.pango_layout_get_line_readonly
import org.gtkkn.native.pango.pango_layout_get_line_spacing
import org.gtkkn.native.pango.pango_layout_get_lines
import org.gtkkn.native.pango.pango_layout_get_lines_readonly
import org.gtkkn.native.pango.pango_layout_get_pixel_extents
import org.gtkkn.native.pango.pango_layout_get_serial
import org.gtkkn.native.pango.pango_layout_get_single_paragraph_mode
import org.gtkkn.native.pango.pango_layout_get_spacing
import org.gtkkn.native.pango.pango_layout_get_tabs
import org.gtkkn.native.pango.pango_layout_get_text
import org.gtkkn.native.pango.pango_layout_get_type
import org.gtkkn.native.pango.pango_layout_get_unknown_glyphs_count
import org.gtkkn.native.pango.pango_layout_get_width
import org.gtkkn.native.pango.pango_layout_get_wrap
import org.gtkkn.native.pango.pango_layout_index_to_pos
import org.gtkkn.native.pango.pango_layout_is_ellipsized
import org.gtkkn.native.pango.pango_layout_is_wrapped
import org.gtkkn.native.pango.pango_layout_serialize
import org.gtkkn.native.pango.pango_layout_set_alignment
import org.gtkkn.native.pango.pango_layout_set_attributes
import org.gtkkn.native.pango.pango_layout_set_auto_dir
import org.gtkkn.native.pango.pango_layout_set_ellipsize
import org.gtkkn.native.pango.pango_layout_set_font_description
import org.gtkkn.native.pango.pango_layout_set_height
import org.gtkkn.native.pango.pango_layout_set_indent
import org.gtkkn.native.pango.pango_layout_set_justify
import org.gtkkn.native.pango.pango_layout_set_justify_last_line
import org.gtkkn.native.pango.pango_layout_set_line_spacing
import org.gtkkn.native.pango.pango_layout_set_markup
import org.gtkkn.native.pango.pango_layout_set_single_paragraph_mode
import org.gtkkn.native.pango.pango_layout_set_spacing
import org.gtkkn.native.pango.pango_layout_set_tabs
import org.gtkkn.native.pango.pango_layout_set_text
import org.gtkkn.native.pango.pango_layout_set_width
import org.gtkkn.native.pango.pango_layout_set_wrap
import org.gtkkn.native.pango.pango_layout_write_to_file
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Result
import kotlin.String
import kotlin.UInt
import kotlin.Unit

/**
 * A `PangoLayout` structure represents an entire paragraph of text.
 *
 * While complete access to the layout capabilities of Pango is provided
 * using the detailed interfaces for itemization and shaping, using
 * that functionality directly involves writing a fairly large amount
 * of code. `PangoLayout` provides a high-level driver for formatting
 * entire paragraphs of text at once. This includes paragraph-level
 * functionality such as line breaking, justification, alignment and
 * ellipsization.
 *
 * A `PangoLayout` is initialized with a `PangoContext`, UTF-8 string
 * and set of attributes for that string. Once that is done, the set of
 * formatted lines can be extracted from the object, the layout can be
 * rendered, and conversion between logical character positions within
 * the layout's text, and the physical position of the resulting glyphs
 * can be made.
 *
 * There are a number of parameters to adjust the formatting of a
 * `PangoLayout`. The following image shows adjustable parameters
 * (on the left) and font metrics (on the right):
 *
 * <picture>
 *   <source srcset="layout-dark.png" media="(prefers-color-scheme: dark)">
 *   <img alt="Pango Layout Parameters" src="layout-light.png">
 * </picture>
 *
 * The following images demonstrate the effect of alignment and
 * justification on the layout of text:
 *
 * | | |
 * | --- | --- |
 * | ![align=left](align-left.png) | ![align=left, justify](align-left-justify.png) |
 * | ![align=center](align-center.png) | ![align=center, justify](align-center-justify.png) |
 * | ![align=right](align-right.png) | ![align=right, justify](align-right-justify.png) |
 *
 *
 * It is possible, as well, to ignore the 2-D setup,
 * and simply treat the results of a `PangoLayout` as a list of lines.
 *
 * ## Skipped during bindings generation
 *
 * - method `get_context`: C function pango_layout_get_context is ignored
 * - parameter `attrs`: attrs: Out parameter is not supported
 * - parameter `n_attrs`: n_attrs: Out parameter is not supported
 * - parameter `width`: width: Out parameter is not supported
 * - parameter `width`: width: Out parameter is not supported
 * - parameter `line`: line: Out parameter is not supported
 * - parameter `new_index`: new_index: Out parameter is not supported
 * - parameter `accel_char`: accel_char: Out parameter is not supported
 * - parameter `index_`: index_: Out parameter is not supported
 * - parameter `context`: C Type PangoContext is ignored
 * - parameter `context`: C Type PangoContext is ignored
 */
public open class Layout(
    pointer: CPointer<PangoLayout>,
) : Object(pointer.reinterpret()),
    KGTyped {
    public val pangoLayoutPointer: CPointer<PangoLayout>
        get() = gPointer.reinterpret()

    /**
     * Forces recomputation of any state in the `PangoLayout` that
     * might depend on the layout's context.
     *
     * This function should be called if you make changes to the context
     * subsequent to creating the layout.
     */
    public open fun contextChanged(): Unit = pango_layout_context_changed(pangoLayoutPointer.reinterpret())

    /**
     * Creates a deep copy-by-value of the layout.
     *
     * The attribute list, tab array, and text from the original layout
     * are all copied by value.
     *
     * @return the newly allocated `PangoLayout`
     */
    public open fun copy(): Layout =
        pango_layout_copy(pangoLayoutPointer.reinterpret())!!.run {
            Layout(reinterpret())
        }

    /**
     * Gets the alignment for the layout: how partial lines are
     * positioned within the horizontal space available.
     *
     * @return the alignment
     */
    public open fun getAlignment(): Alignment =
        pango_layout_get_alignment(pangoLayoutPointer.reinterpret()).run {
            Alignment.fromNativeValue(this)
        }

    /**
     * Gets the attribute list for the layout, if any.
     *
     * @return a `PangoAttrList`
     */
    public open fun getAttributes(): AttrList? =
        pango_layout_get_attributes(pangoLayoutPointer.reinterpret())?.run {
            AttrList(reinterpret())
        }

    /**
     * Gets whether to calculate the base direction for the layout
     * according to its contents.
     *
     * See [method@Pango.Layout.set_auto_dir].
     *
     * @return true if the bidirectional base direction
     *   is computed from the layout's contents, false otherwise
     * @since 1.4
     */
    @PangoVersion1_4
    public open fun getAutoDir(): Boolean = pango_layout_get_auto_dir(pangoLayoutPointer.reinterpret()).asBoolean()

    /**
     * Gets the Y position of baseline of the first line in @layout.
     *
     * @return baseline of first line, from top of @layout
     * @since 1.22
     */
    @PangoVersion1_22
    public open fun getBaseline(): Int = pango_layout_get_baseline(pangoLayoutPointer.reinterpret())

    /**
     * Given an index within a layout, determines the positions that of the
     * strong and weak cursors if the insertion point is at that index.
     *
     * This is a variant of [method@Pango.Layout.get_cursor_pos] that applies
     * font metric information about caret slope and offset to the positions
     * it returns.
     *
     * <picture>
     *   <source srcset="caret-metrics-dark.png" media="(prefers-color-scheme: dark)">
     *   <img alt="Caret metrics" src="caret-metrics-light.png">
     * </picture>
     *
     * @param index the byte index of the cursor
     * @param strongPos location to store the strong cursor position
     * @param weakPos location to store the weak cursor position
     * @since 1.50
     */
    @PangoVersion1_50
    public open fun getCaretPos(
        index: Int,
        strongPos: Rectangle?,
        weakPos: Rectangle?,
    ): Unit =
        pango_layout_get_caret_pos(
            pangoLayoutPointer.reinterpret(),
            index,
            strongPos?.pangoRectanglePointer,
            weakPos?.pangoRectanglePointer
        )

    /**
     * Returns the number of Unicode characters in the
     * the text of @layout.
     *
     * @return the number of Unicode characters
     *   in the text of @layout
     * @since 1.30
     */
    @PangoVersion1_30
    public open fun getCharacterCount(): Int = pango_layout_get_character_count(pangoLayoutPointer.reinterpret())

    /**
     * Given an index within a layout, determines the positions that of the
     * strong and weak cursors if the insertion point is at that index.
     *
     * The position of each cursor is stored as a zero-width rectangle
     * with the height of the run extents.
     *
     * <picture>
     *   <source srcset="cursor-positions-dark.png" media="(prefers-color-scheme: dark)">
     *   <img alt="Cursor positions" src="cursor-positions-light.png">
     * </picture>
     *
     * The strong cursor location is the location where characters of the
     * directionality equal to the base direction of the layout are inserted.
     * The weak cursor location is the location where characters of the
     * directionality opposite to the base direction of the layout are inserted.
     *
     * The following example shows text with both a strong and a weak cursor.
     *
     * <picture>
     *   <source srcset="split-cursor-dark.png" media="(prefers-color-scheme: dark)">
     *   <img alt="Strong and weak cursors" src="split-cursor-light.png">
     * </picture>
     *
     * The strong cursor has a little arrow pointing to the right, the weak
     * cursor to the left. Typing a 'c' in this situation will insert the
     * character after the 'b', and typing another Hebrew character, like 'ג',
     * will insert it at the end.
     *
     * @param index the byte index of the cursor
     * @param strongPos location to store the strong cursor position
     * @param weakPos location to store the weak cursor position
     */
    public open fun getCursorPos(
        index: Int,
        strongPos: Rectangle?,
        weakPos: Rectangle?,
    ): Unit =
        pango_layout_get_cursor_pos(
            pangoLayoutPointer.reinterpret(),
            index,
            strongPos?.pangoRectanglePointer,
            weakPos?.pangoRectanglePointer
        )

    /**
     * Gets the text direction at the given character position in @layout.
     *
     * @param index the byte index of the char
     * @return the text direction at @index
     * @since 1.46
     */
    @PangoVersion1_46
    public open fun getDirection(index: Int): Direction =
        pango_layout_get_direction(pangoLayoutPointer.reinterpret(), index).run {
            Direction.fromNativeValue(this)
        }

    /**
     * Gets the type of ellipsization being performed for @layout.
     *
     * See [method@Pango.Layout.set_ellipsize].
     *
     * Use [method@Pango.Layout.is_ellipsized] to query whether any
     * paragraphs were actually ellipsized.
     *
     * @return the current ellipsization mode for @layout
     * @since 1.6
     */
    @PangoVersion1_6
    public open fun getEllipsize(): EllipsizeMode =
        pango_layout_get_ellipsize(pangoLayoutPointer.reinterpret()).run {
            EllipsizeMode.fromNativeValue(this)
        }

    /**
     * Computes the logical and ink extents of @layout.
     *
     * Logical extents are usually what you want for positioning things. Note
     * that both extents may have non-zero x and y. You may want to use those
     * to offset where you render the layout. Not doing that is a very typical
     * bug that shows up as right-to-left layouts not being correctly positioned
     * in a layout with a set width.
     *
     * The extents are given in layout coordinates and in Pango units; layout
     * coordinates begin at the top left corner of the layout.
     *
     * @param inkRect rectangle used to store the extents of the
     *   layout as drawn
     * @param logicalRect rectangle used to store the logical
     *   extents of the layout
     */
    public open fun getExtents(
        inkRect: Rectangle?,
        logicalRect: Rectangle?,
    ): Unit =
        pango_layout_get_extents(
            pangoLayoutPointer.reinterpret(),
            inkRect?.pangoRectanglePointer,
            logicalRect?.pangoRectanglePointer
        )

    /**
     * Gets the font description for the layout, if any.
     *
     * @return a pointer to the
     *   layout's font description, or null if the font description
     *   from the layout's context is inherited.
     * @since 1.8
     */
    @PangoVersion1_8
    public open fun getFontDescription(): FontDescription? =
        pango_layout_get_font_description(pangoLayoutPointer.reinterpret())?.run {
            FontDescription(reinterpret())
        }

    /**
     * Gets the height of layout used for ellipsization.
     *
     * See [method@Pango.Layout.set_height] for details.
     *
     * @return the height, in Pango units if positive,
     *   or number of lines if negative.
     * @since 1.20
     */
    @PangoVersion1_20
    public open fun getHeight(): Int = pango_layout_get_height(pangoLayoutPointer.reinterpret())

    /**
     * Gets the paragraph indent width in Pango units.
     *
     * A negative value indicates a hanging indentation.
     *
     * @return the indent in Pango units
     */
    public open fun getIndent(): Int = pango_layout_get_indent(pangoLayoutPointer.reinterpret())

    /**
     * Returns an iterator to iterate over the visual extents of the layout.
     *
     * @return the new `PangoLayoutIter`
     */
    public open fun getIter(): LayoutIter =
        pango_layout_get_iter(pangoLayoutPointer.reinterpret())!!.run {
            LayoutIter(reinterpret())
        }

    /**
     * Gets whether each complete line should be stretched to fill the entire
     * width of the layout.
     *
     * @return the justify value
     */
    public open fun getJustify(): Boolean = pango_layout_get_justify(pangoLayoutPointer.reinterpret()).asBoolean()

    /**
     * Gets whether the last line should be stretched
     * to fill the entire width of the layout.
     *
     * @return the justify value
     * @since 1.50
     */
    @PangoVersion1_50
    public open fun getJustifyLastLine(): Boolean =
        pango_layout_get_justify_last_line(pangoLayoutPointer.reinterpret()).asBoolean()

    /**
     * Retrieves a particular line from a `PangoLayout`.
     *
     * Use the faster [method@Pango.Layout.get_line_readonly] if you do not
     * plan to modify the contents of the line (glyphs, glyph widths, etc.).
     *
     * @param line the index of a line, which must be between 0 and
     *   `pango_layout_get_line_count(layout) - 1`, inclusive.
     * @return the requested `PangoLayoutLine`,
     *   or null if the index is out of range. This layout line can be ref'ed
     *   and retained, but will become invalid if changes are made to the
     *   `PangoLayout`.
     */
    public open fun getLine(line: Int): LayoutLine? =
        pango_layout_get_line(pangoLayoutPointer.reinterpret(), line)?.run {
            LayoutLine(reinterpret())
        }

    /**
     * Retrieves the count of lines for the @layout.
     *
     * @return the line count
     */
    public open fun getLineCount(): Int = pango_layout_get_line_count(pangoLayoutPointer.reinterpret())

    /**
     * Retrieves a particular line from a `PangoLayout`.
     *
     * This is a faster alternative to [method@Pango.Layout.get_line],
     * but the user is not expected to modify the contents of the line
     * (glyphs, glyph widths, etc.).
     *
     * @param line the index of a line, which must be between 0 and
     *   `pango_layout_get_line_count(layout) - 1`, inclusive.
     * @return the requested `PangoLayoutLine`,
     *   or null if the index is out of range. This layout line can be ref'ed
     *   and retained, but will become invalid if changes are made to the
     *   `PangoLayout`. No changes should be made to the line.
     * @since 1.16
     */
    @PangoVersion1_16
    public open fun getLineReadonly(line: Int): LayoutLine? =
        pango_layout_get_line_readonly(pangoLayoutPointer.reinterpret(), line)?.run {
            LayoutLine(reinterpret())
        }

    /**
     * Gets the line spacing factor of @layout.
     *
     * See [method@Pango.Layout.set_line_spacing].
     *
     * @since 1.44
     */
    @PangoVersion1_44
    public open fun getLineSpacing(): Float = pango_layout_get_line_spacing(pangoLayoutPointer.reinterpret())

    /**
     * Returns the lines of the @layout as a list.
     *
     * Use the faster [method@Pango.Layout.get_lines_readonly] if you do not
     * plan to modify the contents of the lines (glyphs, glyph widths, etc.).
     *
     * @return a `GSList`
     *   containing the lines in the layout. This points to internal data of the
     *   `PangoLayout` and must be used with care. It will become invalid on any
     *   change to the layout's text or properties.
     */
    public open fun getLines(): SList =
        pango_layout_get_lines(pangoLayoutPointer.reinterpret())!!.run {
            SList(reinterpret())
        }

    /**
     * Returns the lines of the @layout as a list.
     *
     * This is a faster alternative to [method@Pango.Layout.get_lines],
     * but the user is not expected to modify the contents of the lines
     * (glyphs, glyph widths, etc.).
     *
     * @return a `GSList`
     *   containing the lines in the layout. This points to internal data of the
     *   `PangoLayout` and must be used with care. It will become invalid on any
     *   change to the layout's text or properties. No changes should be made to
     *   the lines.
     * @since 1.16
     */
    @PangoVersion1_16
    public open fun getLinesReadonly(): SList =
        pango_layout_get_lines_readonly(pangoLayoutPointer.reinterpret())!!.run {
            SList(reinterpret())
        }

    /**
     * Computes the logical and ink extents of @layout in device units.
     *
     * This function just calls [method@Pango.Layout.get_extents] followed by
     * two [func@extents_to_pixels] calls, rounding @ink_rect and @logical_rect
     * such that the rounded rectangles fully contain the unrounded one (that is,
     * passes them as first argument to [func@Pango.extents_to_pixels]).
     *
     * @param inkRect rectangle used to store the extents of the
     *   layout as drawn
     * @param logicalRect rectangle used to store the logical
     *   extents of the layout
     */
    public open fun getPixelExtents(
        inkRect: Rectangle?,
        logicalRect: Rectangle?,
    ): Unit =
        pango_layout_get_pixel_extents(
            pangoLayoutPointer.reinterpret(),
            inkRect?.pangoRectanglePointer,
            logicalRect?.pangoRectanglePointer
        )

    /**
     * Returns the current serial number of @layout.
     *
     * The serial number is initialized to an small number larger than zero
     * when a new layout is created and is increased whenever the layout is
     * changed using any of the setter functions, or the `PangoContext` it
     * uses has changed. The serial may wrap, but will never have the value 0.
     * Since it can wrap, never compare it with "less than", always use "not equals".
     *
     * This can be used to automatically detect changes to a `PangoLayout`,
     * and is useful for example to decide whether a layout needs redrawing.
     * To force the serial to be increased, use
     * [method@Pango.Layout.context_changed].
     *
     * @return The current serial number of @layout.
     * @since 1.32.4
     */
    @PangoVersion1_32_4
    public open fun getSerial(): UInt = pango_layout_get_serial(pangoLayoutPointer.reinterpret())

    /**
     * Obtains whether @layout is in single paragraph mode.
     *
     * See [method@Pango.Layout.set_single_paragraph_mode].
     *
     * @return true if the layout does not break paragraphs
     *   at paragraph separator characters, false otherwise
     */
    public open fun getSingleParagraphMode(): Boolean =
        pango_layout_get_single_paragraph_mode(pangoLayoutPointer.reinterpret()).asBoolean()

    /**
     * Gets the amount of spacing between the lines of the layout.
     *
     * @return the spacing in Pango units
     */
    public open fun getSpacing(): Int = pango_layout_get_spacing(pangoLayoutPointer.reinterpret())

    /**
     * Gets the current `PangoTabArray` used by this layout.
     *
     * If no `PangoTabArray` has been set, then the default tabs are
     * in use and null is returned. Default tabs are every 8 spaces.
     *
     * The return value should be freed with [method@Pango.TabArray.free].
     *
     * @return a copy of the tabs for this layout
     */
    public open fun getTabs(): TabArray? =
        pango_layout_get_tabs(pangoLayoutPointer.reinterpret())?.run {
            TabArray(reinterpret())
        }

    /**
     * Gets the text in the layout.
     *
     * The returned text should not be freed or modified.
     *
     * @return the text in the @layout
     */
    public open fun getText(): String =
        pango_layout_get_text(pangoLayoutPointer.reinterpret())?.toKString() ?: error("Expected not null string")

    /**
     * Counts the number of unknown glyphs in @layout.
     *
     * This function can be used to determine if there are any fonts
     * available to render all characters in a certain string, or when
     * used in combination with %PANGO_ATTR_FALLBACK, to check if a
     * certain font supports all the characters in the string.
     *
     * @return The number of unknown glyphs in @layout
     * @since 1.16
     */
    @PangoVersion1_16
    public open fun getUnknownGlyphsCount(): Int =
        pango_layout_get_unknown_glyphs_count(pangoLayoutPointer.reinterpret())

    /**
     * Gets the width to which the lines of the `PangoLayout` should wrap.
     *
     * @return the width in Pango units, or -1 if no width set.
     */
    public open fun getWidth(): Int = pango_layout_get_width(pangoLayoutPointer.reinterpret())

    /**
     * Gets the wrap mode for the layout.
     *
     * Use [method@Pango.Layout.is_wrapped] to query whether
     * any paragraphs were actually wrapped.
     *
     * @return active wrap mode.
     */
    public open fun getWrap(): WrapMode =
        pango_layout_get_wrap(pangoLayoutPointer.reinterpret()).run {
            WrapMode.fromNativeValue(this)
        }

    /**
     * Converts from an index within a `PangoLayout` to the onscreen position
     * corresponding to the grapheme at that index.
     *
     * The returns is represented as rectangle. Note that `pos->x` is
     * always the leading edge of the grapheme and `pos->x + pos->width` the
     * trailing edge of the grapheme. If the directionality of the grapheme
     * is right-to-left, then `pos->width` will be negative.
     *
     * @param index byte index within @layout
     * @param pos rectangle in which to store the position of the grapheme
     */
    public open fun indexToPos(
        index: Int,
        pos: Rectangle,
    ): Unit = pango_layout_index_to_pos(pangoLayoutPointer.reinterpret(), index, pos.pangoRectanglePointer)

    /**
     * Queries whether the layout had to ellipsize any paragraphs.
     *
     * This returns true if the ellipsization mode for @layout
     * is not %PANGO_ELLIPSIZE_NONE, a positive width is set on @layout,
     * and there are paragraphs exceeding that width that have to be
     * ellipsized.
     *
     * @return true if any paragraphs had to be ellipsized,
     *   false otherwise
     * @since 1.16
     */
    @PangoVersion1_16
    public open fun isEllipsized(): Boolean = pango_layout_is_ellipsized(pangoLayoutPointer.reinterpret()).asBoolean()

    /**
     * Queries whether the layout had to wrap any paragraphs.
     *
     * This returns true if a positive width is set on @layout,
     * ellipsization mode of @layout is set to %PANGO_ELLIPSIZE_NONE,
     * and there are paragraphs exceeding the layout width that have
     * to be wrapped.
     *
     * @return true if any paragraphs had to be wrapped, false
     *   otherwise
     * @since 1.16
     */
    @PangoVersion1_16
    public open fun isWrapped(): Boolean = pango_layout_is_wrapped(pangoLayoutPointer.reinterpret()).asBoolean()

    /**
     * Serializes the @layout for later deserialization via [func@Pango.Layout.deserialize].
     *
     * There are no guarantees about the format of the output across different
     * versions of Pango and [func@Pango.Layout.deserialize] will reject data
     * that it cannot parse.
     *
     * The intended use of this function is testing, benchmarking and debugging.
     * The format is not meant as a permanent storage format.
     *
     * @param flags `PangoLayoutSerializeFlags`
     * @return a `GBytes` containing the serialized form of @layout
     * @since 1.50
     */
    @PangoVersion1_50
    public open fun serialize(flags: LayoutSerializeFlags): Bytes =
        pango_layout_serialize(pangoLayoutPointer.reinterpret(), flags.mask)!!.run {
            Bytes(reinterpret())
        }

    /**
     * Sets the alignment for the layout: how partial lines are
     * positioned within the horizontal space available.
     *
     * The default alignment is %PANGO_ALIGN_LEFT.
     *
     * @param alignment the alignment
     */
    public open fun setAlignment(alignment: Alignment): Unit =
        pango_layout_set_alignment(pangoLayoutPointer.reinterpret(), alignment.nativeValue)

    /**
     * Sets the text attributes for a layout object.
     *
     * References @attrs, so the caller can unref its reference.
     *
     * @param attrs a `PangoAttrList`
     */
    public open fun setAttributes(attrs: AttrList? = null): Unit =
        pango_layout_set_attributes(pangoLayoutPointer.reinterpret(), attrs?.pangoAttrListPointer)

    /**
     * Sets whether to calculate the base direction
     * for the layout according to its contents.
     *
     * When this flag is on (the default), then paragraphs in @layout that
     * begin with strong right-to-left characters (Arabic and Hebrew principally),
     * will have right-to-left layout, paragraphs with letters from other scripts
     * will have left-to-right layout. Paragraphs with only neutral characters
     * get their direction from the surrounding paragraphs.
     *
     * When false, the choice between left-to-right and right-to-left
     * layout is done according to the base direction of the layout's
     * `PangoContext`. (See [method@Pango.Context.set_base_dir]).
     *
     * When the auto-computed direction of a paragraph differs from the
     * base direction of the context, the interpretation of
     * %PANGO_ALIGN_LEFT and %PANGO_ALIGN_RIGHT are swapped.
     *
     * @param autoDir if true, compute the bidirectional base direction
     *   from the layout's contents
     * @since 1.4
     */
    @PangoVersion1_4
    public open fun setAutoDir(autoDir: Boolean): Unit =
        pango_layout_set_auto_dir(pangoLayoutPointer.reinterpret(), autoDir.asGBoolean())

    /**
     * Sets the type of ellipsization being performed for @layout.
     *
     * Depending on the ellipsization mode @ellipsize text is
     * removed from the start, middle, or end of text so they
     * fit within the width and height of layout set with
     * [method@Pango.Layout.set_width] and [method@Pango.Layout.set_height].
     *
     * If the layout contains characters such as newlines that
     * force it to be layed out in multiple paragraphs, then whether
     * each paragraph is ellipsized separately or the entire layout
     * is ellipsized as a whole depends on the set height of the layout.
     *
     * The default value is %PANGO_ELLIPSIZE_NONE.
     *
     * See [method@Pango.Layout.set_height] for details.
     *
     * @param ellipsize the new ellipsization mode for @layout
     * @since 1.6
     */
    @PangoVersion1_6
    public open fun setEllipsize(ellipsize: EllipsizeMode): Unit =
        pango_layout_set_ellipsize(pangoLayoutPointer.reinterpret(), ellipsize.nativeValue)

    /**
     * Sets the default font description for the layout.
     *
     * If no font description is set on the layout, the
     * font description from the layout's context is used.
     *
     * @param desc the new `PangoFontDescription`
     *   to unset the current font description
     */
    public open fun setFontDescription(desc: FontDescription? = null): Unit =
        pango_layout_set_font_description(pangoLayoutPointer.reinterpret(), desc?.pangoFontDescriptionPointer)

    /**
     * Sets the height to which the `PangoLayout` should be ellipsized at.
     *
     * There are two different behaviors, based on whether @height is positive
     * or negative.
     *
     * If @height is positive, it will be the maximum height of the layout. Only
     * lines would be shown that would fit, and if there is any text omitted,
     * an ellipsis added. At least one line is included in each paragraph regardless
     * of how small the height value is. A value of zero will render exactly one
     * line for the entire layout.
     *
     * If @height is negative, it will be the (negative of) maximum number of lines
     * per paragraph. That is, the total number of lines shown may well be more than
     * this value if the layout contains multiple paragraphs of text.
     * The default value of -1 means that the first line of each paragraph is ellipsized.
     * This behavior may be changed in the future to act per layout instead of per
     * paragraph. File a bug against pango at
     * [https://gitlab.gnome.org/gnome/pango](https://gitlab.gnome.org/gnome/pango)
     * if your code relies on this behavior.
     *
     * Height setting only has effect if a positive width is set on
     * @layout and ellipsization mode of @layout is not %PANGO_ELLIPSIZE_NONE.
     * The behavior is undefined if a height other than -1 is set and
     * ellipsization mode is set to %PANGO_ELLIPSIZE_NONE, and may change in the
     * future.
     *
     * @param height the desired height of the layout in Pango units if positive,
     *   or desired number of lines if negative.
     * @since 1.20
     */
    @PangoVersion1_20
    public open fun setHeight(height: Int): Unit = pango_layout_set_height(pangoLayoutPointer.reinterpret(), height)

    /**
     * Sets the width in Pango units to indent each paragraph.
     *
     * A negative value of @indent will produce a hanging indentation.
     * That is, the first line will have the full width, and subsequent
     * lines will be indented by the absolute value of @indent.
     *
     * The indent setting is ignored if layout alignment is set to
     * %PANGO_ALIGN_CENTER.
     *
     * The default value is 0.
     *
     * @param indent the amount by which to indent
     */
    public open fun setIndent(indent: Int): Unit = pango_layout_set_indent(pangoLayoutPointer.reinterpret(), indent)

    /**
     * Sets whether each complete line should be stretched to fill the
     * entire width of the layout.
     *
     * Stretching is typically done by adding whitespace, but for some scripts
     * (such as Arabic), the justification may be done in more complex ways,
     * like extending the characters.
     *
     * Note that this setting is not implemented and so is ignored in
     * Pango older than 1.18.
     *
     * Note that tabs and justification conflict with each other:
     * Justification will move content away from its tab-aligned
     * positions.
     *
     * The default value is false.
     *
     * Also see [method@Pango.Layout.set_justify_last_line].
     *
     * @param justify whether the lines in the layout should be justified
     */
    public open fun setJustify(justify: Boolean): Unit =
        pango_layout_set_justify(pangoLayoutPointer.reinterpret(), justify.asGBoolean())

    /**
     * Sets whether the last line should be stretched to fill the
     * entire width of the layout.
     *
     * This only has an effect if [method@Pango.Layout.set_justify] has
     * been called as well.
     *
     * The default value is false.
     *
     * @param justify whether the last line in the layout should be justified
     * @since 1.50
     */
    @PangoVersion1_50
    public open fun setJustifyLastLine(justify: Boolean): Unit =
        pango_layout_set_justify_last_line(pangoLayoutPointer.reinterpret(), justify.asGBoolean())

    /**
     * Sets a factor for line spacing.
     *
     * Typical values are: 0, 1, 1.5, 2. The default values is 0.
     *
     * If @factor is non-zero, lines are placed so that
     *
     *     baseline2 = baseline1 + factor * height2
     *
     * where height2 is the line height of the second line
     * (as determined by the font(s)). In this case, the spacing
     * set with [method@Pango.Layout.set_spacing] is ignored.
     *
     * If @factor is zero (the default), spacing is applied as before.
     *
     * Note: for semantics that are closer to the CSS line-height
     * property, see [func@Pango.attr_line_height_new].
     *
     * @param factor the new line spacing factor
     * @since 1.44
     */
    @PangoVersion1_44
    public open fun setLineSpacing(factor: Float): Unit =
        pango_layout_set_line_spacing(pangoLayoutPointer.reinterpret(), factor)

    /**
     * Sets the layout text and attribute list from marked-up text.
     *
     * See [Pango Markup](pango_markup.html)).
     *
     * Replaces the current text and attribute list.
     *
     * This is the same as [method@Pango.Layout.set_markup_with_accel],
     * but the markup text isn't scanned for accelerators.
     *
     * @param markup marked-up text
     * @param length length of marked-up text in bytes, or -1 if @markup is
     *   `NUL`-terminated
     */
    public open fun setMarkup(
        markup: String,
        length: Int,
    ): Unit = pango_layout_set_markup(pangoLayoutPointer.reinterpret(), markup, length)

    /**
     * Sets the single paragraph mode of @layout.
     *
     * If @setting is true, do not treat newlines and similar characters
     * as paragraph separators; instead, keep all text in a single paragraph,
     * and display a glyph for paragraph separator characters. Used when
     * you want to allow editing of newlines on a single text line.
     *
     * The default value is false.
     *
     * @param setting new setting
     */
    public open fun setSingleParagraphMode(setting: Boolean): Unit =
        pango_layout_set_single_paragraph_mode(pangoLayoutPointer.reinterpret(), setting.asGBoolean())

    /**
     * Sets the amount of spacing in Pango units between
     * the lines of the layout.
     *
     * When placing lines with spacing, Pango arranges things so that
     *
     *     line2.top = line1.bottom + spacing
     *
     * The default value is 0.
     *
     * Note: Since 1.44, Pango is using the line height (as determined
     * by the font) for placing lines when the line spacing factor is set
     * to a non-zero value with [method@Pango.Layout.set_line_spacing].
     * In that case, the @spacing set with this function is ignored.
     *
     * Note: for semantics that are closer to the CSS line-height
     * property, see [func@Pango.attr_line_height_new].
     *
     * @param spacing the amount of spacing
     */
    public open fun setSpacing(spacing: Int): Unit = pango_layout_set_spacing(pangoLayoutPointer.reinterpret(), spacing)

    /**
     * Sets the tabs to use for @layout, overriding the default tabs.
     *
     * `PangoLayout` will place content at the next tab position
     * whenever it meets a Tab character (U+0009).
     *
     * By default, tabs are every 8 spaces. If @tabs is null, the
     * default tabs are reinstated. @tabs is copied into the layout;
     * you must free your copy of @tabs yourself.
     *
     * Note that tabs and justification conflict with each other:
     * Justification will move content away from its tab-aligned
     * positions. The same is true for alignments other than
     * %PANGO_ALIGN_LEFT.
     *
     * @param tabs a `PangoTabArray`
     */
    public open fun setTabs(tabs: TabArray? = null): Unit =
        pango_layout_set_tabs(pangoLayoutPointer.reinterpret(), tabs?.pangoTabArrayPointer)

    /**
     * Sets the text of the layout.
     *
     * This function validates @text and renders invalid UTF-8
     * with a placeholder glyph.
     *
     * Note that if you have used [method@Pango.Layout.set_markup] or
     * [method@Pango.Layout.set_markup_with_accel] on @layout before, you
     * may want to call [method@Pango.Layout.set_attributes] to clear the
     * attributes set on the layout from the markup as this function does
     * not clear attributes.
     *
     * @param text the text
     * @param length maximum length of @text, in bytes. -1 indicates that
     *   the string is nul-terminated and the length should be calculated.
     *   The text will also be truncated on encountering a nul-termination
     *   even when @length is positive.
     */
    public open fun setText(
        text: String,
        length: Int,
    ): Unit = pango_layout_set_text(pangoLayoutPointer.reinterpret(), text, length)

    /**
     * Sets the width to which the lines of the `PangoLayout` should wrap or
     * ellipsized.
     *
     * The default value is -1: no width set.
     *
     * @param width the desired width in Pango units, or -1 to indicate that no
     *   wrapping or ellipsization should be performed.
     */
    public open fun setWidth(width: Int): Unit = pango_layout_set_width(pangoLayoutPointer.reinterpret(), width)

    /**
     * Sets the wrap mode.
     *
     * The wrap mode only has effect if a width is set on the layout
     * with [method@Pango.Layout.set_width]. To turn off wrapping,
     * set the width to -1.
     *
     * The default value is %PANGO_WRAP_WORD.
     *
     * @param wrap the wrap mode
     */
    public open fun setWrap(wrap: WrapMode): Unit =
        pango_layout_set_wrap(pangoLayoutPointer.reinterpret(), wrap.nativeValue)

    /**
     * A convenience method to serialize a layout to a file.
     *
     * It is equivalent to calling [method@Pango.Layout.serialize]
     * followed by [func@GLib.file_set_contents].
     *
     * See those two functions for details on the arguments.
     *
     * It is mostly intended for use inside a debugger to quickly dump
     * a layout to a file for later inspection.
     *
     * @param flags `PangoLayoutSerializeFlags`
     * @param filename the file to save it to
     * @return true if saving was successful
     * @since 1.50
     */
    @PangoVersion1_50
    public open fun writeToFile(
        flags: LayoutSerializeFlags,
        filename: String,
    ): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                pango_layout_write_to_file(
                    pangoLayoutPointer.reinterpret(),
                    flags.mask,
                    filename,
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    public companion object : TypeCompanion<Layout> {
        override val type: GeneratedClassKGType<Layout> =
            GeneratedClassKGType(pango_layout_get_type()) { Layout(it.reinterpret()) }

        init {
            PangoTypeProvider.register()
        }
    }
}
