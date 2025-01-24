// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.pango

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import org.gtkkn.bindings.glib.SList
import org.gtkkn.bindings.pango.annotations.PangoVersion1_10
import org.gtkkn.bindings.pango.annotations.PangoVersion1_50
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.pango.PangoLayoutLine
import org.gtkkn.native.pango.pango_layout_line_get_extents
import org.gtkkn.native.pango.pango_layout_line_get_length
import org.gtkkn.native.pango.pango_layout_line_get_pixel_extents
import org.gtkkn.native.pango.pango_layout_line_get_resolved_direction
import org.gtkkn.native.pango.pango_layout_line_get_start_index
import org.gtkkn.native.pango.pango_layout_line_get_type
import org.gtkkn.native.pango.pango_layout_line_is_paragraph_start
import org.gtkkn.native.pango.pango_layout_line_ref
import org.gtkkn.native.pango.pango_layout_line_unref
import kotlin.Boolean
import kotlin.Pair
import kotlin.String
import kotlin.Unit
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * A `PangoLayoutLine` represents one of the lines resulting from laying
 * out a paragraph via `PangoLayout`.
 *
 * `PangoLayoutLine` structures are obtained by calling
 * [method@Pango.Layout.get_line] and are only valid until the text,
 * attributes, or settings of the parent `PangoLayout` are modified.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `height`: height: Out parameter is not supported
 * - parameter `ranges`: ranges: Out parameter is not supported
 * - parameter `x_pos`: x_pos: Out parameter is not supported
 * - parameter `index`: index: Out parameter is not supported
 */
public class LayoutLine(public val pangoLayoutLinePointer: CPointer<PangoLayoutLine>, cleaner: Cleaner? = null) :
    ProxyInstance(pangoLayoutLinePointer) {
    /**
     * the layout this line belongs to, might be null
     */
    public var layout: Layout?
        get() = pangoLayoutLinePointer.pointed.layout?.run {
            Layout(this)
        }

        @UnsafeFieldSetter
        set(`value`) {
            pangoLayoutLinePointer.pointed.layout = value?.pangoLayoutPointer
        }

    /**
     * start of line as byte index into layout->text
     */
    public var startIndex: gint
        get() = pangoLayoutLinePointer.pointed.start_index

        @UnsafeFieldSetter
        set(`value`) {
            pangoLayoutLinePointer.pointed.start_index = value
        }

    /**
     * length of line in bytes
     */
    public var length: gint
        get() = pangoLayoutLinePointer.pointed.length

        @UnsafeFieldSetter
        set(`value`) {
            pangoLayoutLinePointer.pointed.length = value
        }

    /**
     * list of runs in the
     *   line, from left to right
     */
    public var runs: SList?
        get() = pangoLayoutLinePointer.pointed.runs?.run {
            SList(this)
        }

        @UnsafeFieldSetter
        set(`value`) {
            pangoLayoutLinePointer.pointed.runs = value?.glibSListPointer
        }

    /**
     * #TRUE if this is the first line of the paragraph
     */
    public var isParagraphStart: guint
        get() = pangoLayoutLinePointer.pointed.is_paragraph_start

        @UnsafeFieldSetter
        set(`value`) {
            pangoLayoutLinePointer.pointed.is_paragraph_start = value
        }

    /**
     * #Resolved PangoDirection of line
     */
    public var resolvedDir: guint
        get() = pangoLayoutLinePointer.pointed.resolved_dir

        @UnsafeFieldSetter
        set(`value`) {
            pangoLayoutLinePointer.pointed.resolved_dir = value
        }

    /**
     * Allocate a new LayoutLine.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<PangoLayoutLine>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to LayoutLine and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<PangoLayoutLine>, Cleaner>,
    ) : this(pangoLayoutLinePointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new LayoutLine using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<PangoLayoutLine>().ptr)

    /**
     * Allocate a new LayoutLine.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param layout the layout this line belongs to, might be null
     * @param startIndex start of line as byte index into layout->text
     * @param length length of line in bytes
     * @param runs list of runs in the
     *   line, from left to right
     * @param isParagraphStart #TRUE if this is the first line of the paragraph
     * @param resolvedDir #Resolved PangoDirection of line
     */
    public constructor(
        layout: Layout?,
        startIndex: gint,
        length: gint,
        runs: SList?,
        isParagraphStart: guint,
        resolvedDir: guint,
    ) : this() {
        this.layout = layout
        this.startIndex = startIndex
        this.length = length
        this.runs = runs
        this.isParagraphStart = isParagraphStart
        this.resolvedDir = resolvedDir
    }

    /**
     * Allocate a new LayoutLine using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param layout the layout this line belongs to, might be null
     * @param startIndex start of line as byte index into layout->text
     * @param length length of line in bytes
     * @param runs list of runs in the
     *   line, from left to right
     * @param isParagraphStart #TRUE if this is the first line of the paragraph
     * @param resolvedDir #Resolved PangoDirection of line
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        layout: Layout?,
        startIndex: gint,
        length: gint,
        runs: SList?,
        isParagraphStart: guint,
        resolvedDir: guint,
        scope: AutofreeScope,
    ) : this(scope) {
        this.layout = layout
        this.startIndex = startIndex
        this.length = length
        this.runs = runs
        this.isParagraphStart = isParagraphStart
        this.resolvedDir = resolvedDir
    }

    /**
     * Computes the logical and ink extents of a layout line.
     *
     * See [method@Pango.Font.get_glyph_extents] for details
     * about the interpretation of the rectangles.
     *
     * @param inkRect rectangle used to store the extents of
     *   the glyph string as drawn
     * @param logicalRect rectangle used to store the logical
     *   extents of the glyph string
     */
    public fun getExtents(inkRect: Rectangle?, logicalRect: Rectangle?): Unit = pango_layout_line_get_extents(
        pangoLayoutLinePointer,
        inkRect?.pangoRectanglePointer,
        logicalRect?.pangoRectanglePointer
    )

    /**
     * Returns the length of the line, in bytes.
     *
     * @return the length of the line
     * @since 1.50
     */
    @PangoVersion1_50
    public fun getLength(): gint = pango_layout_line_get_length(pangoLayoutLinePointer)

    /**
     * Computes the logical and ink extents of @layout_line in device units.
     *
     * This function just calls [method@Pango.LayoutLine.get_extents] followed by
     * two [func@extents_to_pixels] calls, rounding @ink_rect and @logical_rect
     * such that the rounded rectangles fully contain the unrounded one (that is,
     * passes them as first argument to [func@extents_to_pixels]).
     *
     * @param inkRect rectangle used to store the extents of
     *   the glyph string as drawn
     * @param logicalRect rectangle used to store the logical
     *   extents of the glyph string
     */
    public fun getPixelExtents(inkRect: Rectangle?, logicalRect: Rectangle?): Unit =
        pango_layout_line_get_pixel_extents(
            pangoLayoutLinePointer,
            inkRect?.pangoRectanglePointer,
            logicalRect?.pangoRectanglePointer
        )

    /**
     * Returns the resolved direction of the line.
     *
     * @return the resolved direction of the line
     * @since 1.50
     */
    @PangoVersion1_50
    public fun getResolvedDirection(): Direction =
        pango_layout_line_get_resolved_direction(pangoLayoutLinePointer).run {
            Direction.fromNativeValue(this)
        }

    /**
     * Returns the start index of the line, as byte index
     * into the text of the layout.
     *
     * @return the start index of the line
     * @since 1.50
     */
    @PangoVersion1_50
    public fun getStartIndex(): gint = pango_layout_line_get_start_index(pangoLayoutLinePointer)

    /**
     * Returns whether this is the first line of the paragraph.
     *
     * @return true if this is the first line
     * @since 1.50
     */
    @PangoVersion1_50
    public fun isParagraphStart(): Boolean = pango_layout_line_is_paragraph_start(pangoLayoutLinePointer).asBoolean()

    /**
     * Increase the reference count of a `PangoLayoutLine` by one.
     *
     * @return the line passed in.
     * @since 1.10
     */
    @PangoVersion1_10
    public fun ref(): LayoutLine? = pango_layout_line_ref(pangoLayoutLinePointer)?.run {
        LayoutLine(this)
    }

    /**
     * Decrease the reference count of a `PangoLayoutLine` by one.
     *
     * If the result is zero, the line and all associated memory
     * will be freed.
     */
    public fun unref(): Unit = pango_layout_line_unref(pangoLayoutLinePointer)

    override fun toString(): String =
        "LayoutLine(layout=$layout, startIndex=$startIndex, length=$length, runs=$runs, isParagraphStart=$isParagraphStart, resolvedDir=$resolvedDir)"

    public companion object {
        /**
         * Get the GType of LayoutLine
         *
         * @return the GType
         */
        public fun getType(): GType = pango_layout_line_get_type()
    }
}
