// This is a generated file. Do not modify.
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
 * - field `geometry`: Not-pointer record GlyphGeometry is ignored
 * - field `attr`: Not-pointer record GlyphVisAttr is ignored
 */
public class GlyphInfo(pointer: CPointer<PangoGlyphInfo>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val gPointer: CPointer<PangoGlyphInfo> = pointer

    /**
     * the glyph itself.
     */
    public var glyph: Glyph
        get() = gPointer.pointed.glyph

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.glyph = value
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
    ) : this(pointer = pair.first, cleaner = pair.second)

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
