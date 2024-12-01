// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.pango.annotations.PangoVersion1_22
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.pango.PangoGlyphItemIter
import org.gtkkn.native.pango.pango_glyph_item_iter_copy
import org.gtkkn.native.pango.pango_glyph_item_iter_free
import org.gtkkn.native.pango.pango_glyph_item_iter_init_end
import org.gtkkn.native.pango.pango_glyph_item_iter_init_start
import org.gtkkn.native.pango.pango_glyph_item_iter_next_cluster
import org.gtkkn.native.pango.pango_glyph_item_iter_prev_cluster
import kotlin.Boolean
import kotlin.Int
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
public class GlyphItemIter(
    pointer: CPointer<PangoGlyphItemIter>,
) : Record {
    public val pangoGlyphItemIterPointer: CPointer<PangoGlyphItemIter> = pointer

    /**
     *
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val glyphItem: GlyphItem?
        get() =
            pangoGlyphItemIterPointer.pointed.glyph_item?.run {
                GlyphItem(reinterpret())
            }

    /**
     *
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val text: String?
        get() = pangoGlyphItemIterPointer.pointed.text?.toKString()

    public var startGlyph: Int
        get() = pangoGlyphItemIterPointer.pointed.start_glyph
        set(`value`) {
            pangoGlyphItemIterPointer.pointed.start_glyph = value
        }

    public var startIndex: Int
        get() = pangoGlyphItemIterPointer.pointed.start_index
        set(`value`) {
            pangoGlyphItemIterPointer.pointed.start_index = value
        }

    public var startChar: Int
        get() = pangoGlyphItemIterPointer.pointed.start_char
        set(`value`) {
            pangoGlyphItemIterPointer.pointed.start_char = value
        }

    public var endGlyph: Int
        get() = pangoGlyphItemIterPointer.pointed.end_glyph
        set(`value`) {
            pangoGlyphItemIterPointer.pointed.end_glyph = value
        }

    public var endIndex: Int
        get() = pangoGlyphItemIterPointer.pointed.end_index
        set(`value`) {
            pangoGlyphItemIterPointer.pointed.end_index = value
        }

    public var endChar: Int
        get() = pangoGlyphItemIterPointer.pointed.end_char
        set(`value`) {
            pangoGlyphItemIterPointer.pointed.end_char = value
        }

    /**
     * Make a shallow copy of an existing `PangoGlyphItemIter` structure.
     *
     * @return the newly allocated `PangoGlyphItemIter`
     * @since 1.22
     */
    @PangoVersion1_22
    public fun copy(): GlyphItemIter? =
        pango_glyph_item_iter_copy(pangoGlyphItemIterPointer.reinterpret())?.run {
            GlyphItemIter(reinterpret())
        }

    /**
     * Frees a `PangoGlyphItem`Iter.
     *
     * @since 1.22
     */
    @PangoVersion1_22
    public fun free(): Unit = pango_glyph_item_iter_free(pangoGlyphItemIterPointer.reinterpret())

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
    public fun initEnd(
        glyphItem: GlyphItem,
        text: String,
    ): Boolean =
        pango_glyph_item_iter_init_end(
            pangoGlyphItemIterPointer.reinterpret(),
            glyphItem.pangoGlyphItemPointer.reinterpret(),
            text
        ).asBoolean()

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
    public fun initStart(
        glyphItem: GlyphItem,
        text: String,
    ): Boolean =
        pango_glyph_item_iter_init_start(
            pangoGlyphItemIterPointer.reinterpret(),
            glyphItem.pangoGlyphItemPointer.reinterpret(),
            text
        ).asBoolean()

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
    public fun nextCluster(): Boolean =
        pango_glyph_item_iter_next_cluster(pangoGlyphItemIterPointer.reinterpret()).asBoolean()

    /**
     * Moves the iterator to the preceding cluster in the glyph item.
     * See `PangoGlyphItemIter` for details of cluster orders.
     *
     * @return true if the iterator was moved,
     *   false if we were already on the first cluster.
     * @since 1.22
     */
    @PangoVersion1_22
    public fun prevCluster(): Boolean =
        pango_glyph_item_iter_prev_cluster(pangoGlyphItemIterPointer.reinterpret()).asBoolean()

    public companion object : RecordCompanion<GlyphItemIter, PangoGlyphItemIter> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): GlyphItemIter =
            GlyphItemIter(pointer.reinterpret())
    }
}
