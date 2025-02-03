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
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.pango.annotations.PangoVersion1_22
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.glib.g_free
import org.gtkkn.native.glib.g_strdup
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.pango.PangoGlyphItemIter
import org.gtkkn.native.pango.pango_glyph_item_iter_copy
import org.gtkkn.native.pango.pango_glyph_item_iter_free
import org.gtkkn.native.pango.pango_glyph_item_iter_get_type
import org.gtkkn.native.pango.pango_glyph_item_iter_init_end
import org.gtkkn.native.pango.pango_glyph_item_iter_init_start
import org.gtkkn.native.pango.pango_glyph_item_iter_next_cluster
import org.gtkkn.native.pango.pango_glyph_item_iter_prev_cluster
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * A `PangoGlyphItemIter` is an iterator over the clusters in a
 * `PangoGlyphItem`.
 *
 * The *forward direction* of the iterator is the logical direction of text.
 * That is, with increasing @start_index and @start_char values. If @glyph_item
 * is right-to-left (that is, if `glyph_item->item->analysis.level` is odd),
 * then @start_glyph decreases as the iterator moves forward.  Moreover,
 * in right-to-left cases, @start_glyph is greater than @end_glyph.
 *
 * An iterator should be initialized using either
 * pango_glyph_item_iter_init_start() or
 * pango_glyph_item_iter_init_end(), for forward and backward iteration
 * respectively, and walked over using any desired mixture of
 * pango_glyph_item_iter_next_cluster() and
 * pango_glyph_item_iter_prev_cluster().
 *
 * A common idiom for doing a forward iteration over the clusters is:
 *
 * ```
 * PangoGlyphItemIter cluster_iter;
 * gboolean have_cluster;
 *
 * for (have_cluster = pango_glyph_item_iter_init_start (&cluster_iter,
 *                                                       glyph_item, text);
 *      have_cluster;
 *      have_cluster = pango_glyph_item_iter_next_cluster (&cluster_iter))
 * {
 *   ...
 * }
 * ```
 *
 * Note that @text is the start of the text for layout, which is then
 * indexed by `glyph_item->item->offset` to get to the text of @glyph_item.
 * The @start_index and @end_index values can directly index into @text. The
 * @start_glyph, @end_glyph, @start_char, and @end_char values however are
 * zero-based for the @glyph_item.  For each cluster, the item pointed at by
 * the start variables is included in the cluster while the one pointed at by
 * end variables is not.
 *
 * None of the members of a `PangoGlyphItemIter` should be modified manually.
 * @since 1.22
 */
@PangoVersion1_22
public class GlyphItemIter(public val pangoGlyphItemIterPointer: CPointer<PangoGlyphItemIter>) :
    ProxyInstance(pangoGlyphItemIterPointer) {
    public var glyphItem: GlyphItem?
        get() = pangoGlyphItemIterPointer.pointed.glyph_item?.run {
            GlyphItem(this)
        }

        @UnsafeFieldSetter
        set(`value`) {
            pangoGlyphItemIterPointer.pointed.glyph_item = value?.pangoGlyphItemPointer
        }

    public var text: String?
        get() = pangoGlyphItemIterPointer.pointed.text?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            pangoGlyphItemIterPointer.pointed.text?.let { g_free(it) }
            pangoGlyphItemIterPointer.pointed.text = value?.let { g_strdup(it) }
        }

    public var startGlyph: gint
        get() = pangoGlyphItemIterPointer.pointed.start_glyph

        @UnsafeFieldSetter
        set(`value`) {
            pangoGlyphItemIterPointer.pointed.start_glyph = value
        }

    public var startIndex: gint
        get() = pangoGlyphItemIterPointer.pointed.start_index

        @UnsafeFieldSetter
        set(`value`) {
            pangoGlyphItemIterPointer.pointed.start_index = value
        }

    public var startChar: gint
        get() = pangoGlyphItemIterPointer.pointed.start_char

        @UnsafeFieldSetter
        set(`value`) {
            pangoGlyphItemIterPointer.pointed.start_char = value
        }

    public var endGlyph: gint
        get() = pangoGlyphItemIterPointer.pointed.end_glyph

        @UnsafeFieldSetter
        set(`value`) {
            pangoGlyphItemIterPointer.pointed.end_glyph = value
        }

    public var endIndex: gint
        get() = pangoGlyphItemIterPointer.pointed.end_index

        @UnsafeFieldSetter
        set(`value`) {
            pangoGlyphItemIterPointer.pointed.end_index = value
        }

    public var endChar: gint
        get() = pangoGlyphItemIterPointer.pointed.end_char

        @UnsafeFieldSetter
        set(`value`) {
            pangoGlyphItemIterPointer.pointed.end_char = value
        }

    /**
     * Allocate a new GlyphItemIter.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<PangoGlyphItemIter>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

    /**
     * Allocate a new GlyphItemIter using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<PangoGlyphItemIter>().ptr)

    /**
     * Allocate a new GlyphItemIter.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param glyphItem
     * @param text
     * @param startGlyph
     * @param startIndex
     * @param startChar
     * @param endGlyph
     * @param endIndex
     * @param endChar
     */
    public constructor(
        glyphItem: GlyphItem?,
        text: String?,
        startGlyph: gint,
        startIndex: gint,
        startChar: gint,
        endGlyph: gint,
        endIndex: gint,
        endChar: gint,
    ) : this() {
        this.glyphItem = glyphItem
        this.text = text
        this.startGlyph = startGlyph
        this.startIndex = startIndex
        this.startChar = startChar
        this.endGlyph = endGlyph
        this.endIndex = endIndex
        this.endChar = endChar
    }

    /**
     * Allocate a new GlyphItemIter using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param glyphItem
     * @param text
     * @param startGlyph
     * @param startIndex
     * @param startChar
     * @param endGlyph
     * @param endIndex
     * @param endChar
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        glyphItem: GlyphItem?,
        text: String?,
        startGlyph: gint,
        startIndex: gint,
        startChar: gint,
        endGlyph: gint,
        endIndex: gint,
        endChar: gint,
        scope: AutofreeScope,
    ) : this(scope) {
        this.glyphItem = glyphItem
        this.text = text
        this.startGlyph = startGlyph
        this.startIndex = startIndex
        this.startChar = startChar
        this.endGlyph = endGlyph
        this.endIndex = endIndex
        this.endChar = endChar
    }

    /**
     * Make a shallow copy of an existing `PangoGlyphItemIter` structure.
     *
     * @return the newly allocated `PangoGlyphItemIter`
     * @since 1.22
     */
    @PangoVersion1_22
    public fun copy(): GlyphItemIter? = pango_glyph_item_iter_copy(pangoGlyphItemIterPointer)?.run {
        GlyphItemIter(this)
    }

    /**
     * Frees a `PangoGlyphItem`Iter.
     *
     * @since 1.22
     */
    @PangoVersion1_22
    public fun free(): Unit = pango_glyph_item_iter_free(pangoGlyphItemIterPointer)

    /**
     * Initializes a `PangoGlyphItemIter` structure to point to the
     * last cluster in a glyph item.
     *
     * See `PangoGlyphItemIter` for details of cluster orders.
     *
     * @param glyphItem the glyph item to iterate over
     * @param text text corresponding to the glyph item
     * @return false if there are no clusters in the glyph item
     * @since 1.22
     */
    @PangoVersion1_22
    public fun initEnd(glyphItem: GlyphItem, text: String): Boolean =
        pango_glyph_item_iter_init_end(pangoGlyphItemIterPointer, glyphItem.pangoGlyphItemPointer, text).asBoolean()

    /**
     * Initializes a `PangoGlyphItemIter` structure to point to the
     * first cluster in a glyph item.
     *
     * See `PangoGlyphItemIter` for details of cluster orders.
     *
     * @param glyphItem the glyph item to iterate over
     * @param text text corresponding to the glyph item
     * @return false if there are no clusters in the glyph item
     * @since 1.22
     */
    @PangoVersion1_22
    public fun initStart(glyphItem: GlyphItem, text: String): Boolean =
        pango_glyph_item_iter_init_start(pangoGlyphItemIterPointer, glyphItem.pangoGlyphItemPointer, text).asBoolean()

    /**
     * Advances the iterator to the next cluster in the glyph item.
     *
     * See `PangoGlyphItemIter` for details of cluster orders.
     *
     * @return true if the iterator was advanced,
     *   false if we were already on the  last cluster.
     * @since 1.22
     */
    @PangoVersion1_22
    public fun nextCluster(): Boolean = pango_glyph_item_iter_next_cluster(pangoGlyphItemIterPointer).asBoolean()

    /**
     * Moves the iterator to the preceding cluster in the glyph item.
     * See `PangoGlyphItemIter` for details of cluster orders.
     *
     * @return true if the iterator was moved,
     *   false if we were already on the first cluster.
     * @since 1.22
     */
    @PangoVersion1_22
    public fun prevCluster(): Boolean = pango_glyph_item_iter_prev_cluster(pangoGlyphItemIterPointer).asBoolean()

    override fun toString(): String =
        "GlyphItemIter(glyphItem=$glyphItem, text=$text, startGlyph=$startGlyph, startIndex=$startIndex, startChar=$startChar, endGlyph=$endGlyph, endIndex=$endIndex, endChar=$endChar)"

    public companion object {
        /**
         * Get the GType of GlyphItemIter
         *
         * @return the GType
         */
        public fun getType(): GType = pango_glyph_item_iter_get_type()
    }
}
