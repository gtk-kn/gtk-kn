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
import org.gtkkn.native.pango.PangoGlyphInfo
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * A `PangoGlyphInfo` structure represents a single glyph with
 * positioning information and visual attributes.
 *
 * ## Skipped during bindings generation
 *
 * - field `geometry`: Field with not-pointer record/union PangoGlyphGeometry is not supported
 * - field `attr`: Field with not-pointer record/union PangoGlyphVisAttr is not supported
 */
public class GlyphInfo(public val pangoGlyphInfoPointer: CPointer<PangoGlyphInfo>, cleaner: Cleaner? = null) :
    ProxyInstance(pangoGlyphInfoPointer) {
    /**
     * the glyph itself.
     */
    public var glyph: Glyph
        get() = pangoGlyphInfoPointer.pointed.glyph

        @UnsafeFieldSetter
        set(`value`) {
            pangoGlyphInfoPointer.pointed.glyph = value
        }

    /**
     * Allocate a new GlyphInfo.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<PangoGlyphInfo>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to GlyphInfo and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<PangoGlyphInfo>, Cleaner>,
    ) : this(pangoGlyphInfoPointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new GlyphInfo using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<PangoGlyphInfo>().ptr)

    /**
     * Allocate a new GlyphInfo.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param glyph the glyph itself.
     */
    public constructor(glyph: Glyph) : this() {
        this.glyph = glyph
    }

    /**
     * Allocate a new GlyphInfo using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param glyph the glyph itself.
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(glyph: Glyph, scope: AutofreeScope) : this(scope) {
        this.glyph = glyph
    }

    override fun toString(): String = "GlyphInfo(glyph=$glyph)"
}
