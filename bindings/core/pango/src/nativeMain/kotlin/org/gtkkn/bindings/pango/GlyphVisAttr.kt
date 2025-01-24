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
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.guint
import org.gtkkn.native.pango.PangoGlyphVisAttr
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * A `PangoGlyphVisAttr` structure communicates information between
 * the shaping and rendering phases.
 *
 * Currently, it contains cluster start and color information.
 * More attributes may be added in the future.
 *
 * Clusters are stored in visual order, within the cluster, glyphs
 * are always ordered in logical order, since visual order is meaningless;
 * that is, in Arabic text, accent glyphs follow the glyphs for the
 * base character.
 */
public class GlyphVisAttr(public val pangoGlyphVisAttrPointer: CPointer<PangoGlyphVisAttr>, cleaner: Cleaner? = null) :
    ProxyInstance(pangoGlyphVisAttrPointer) {
    /**
     * set for the first logical glyph in each cluster.
     */
    public var isClusterStart: guint
        get() = pangoGlyphVisAttrPointer.pointed.is_cluster_start

        @UnsafeFieldSetter
        set(`value`) {
            pangoGlyphVisAttrPointer.pointed.is_cluster_start = value
        }

    /**
     * set if the the font will render this glyph with color. Since 1.50
     */
    public var isColor: guint
        get() = pangoGlyphVisAttrPointer.pointed.is_color

        @UnsafeFieldSetter
        set(`value`) {
            pangoGlyphVisAttrPointer.pointed.is_color = value
        }

    /**
     * Allocate a new GlyphVisAttr.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<PangoGlyphVisAttr>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to GlyphVisAttr and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<PangoGlyphVisAttr>, Cleaner>,
    ) : this(pangoGlyphVisAttrPointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new GlyphVisAttr using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<PangoGlyphVisAttr>().ptr)

    /**
     * Allocate a new GlyphVisAttr.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param isClusterStart set for the first logical glyph in each cluster.
     * @param isColor set if the the font will render this glyph with color. Since 1.50
     */
    public constructor(isClusterStart: guint, isColor: guint) : this() {
        this.isClusterStart = isClusterStart
        this.isColor = isColor
    }

    /**
     * Allocate a new GlyphVisAttr using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param isClusterStart set for the first logical glyph in each cluster.
     * @param isColor set if the the font will render this glyph with color. Since 1.50
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        isClusterStart: guint,
        isColor: guint,
        scope: AutofreeScope,
    ) : this(scope) {
        this.isClusterStart = isClusterStart
        this.isColor = isColor
    }

    override fun toString(): String = "GlyphVisAttr(isClusterStart=$isClusterStart, isColor=$isColor)"
}
