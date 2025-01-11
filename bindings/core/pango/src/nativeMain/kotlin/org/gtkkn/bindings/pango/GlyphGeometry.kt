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
import org.gtkkn.native.pango.PangoGlyphGeometry
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * The `PangoGlyphGeometry` structure contains width and positioning
 * information for a single glyph.
 *
 * Note that @width is not guaranteed to be the same as the glyph
 * extents. Kerning and other positioning applied during shaping will
 * affect both the @width and the @x_offset for the glyphs in the
 * glyph string that results from shaping.
 *
 * The information in this struct is intended for rendering the glyphs,
 * as follows:
 *
 * 1. Assume the current point is (x, y)
 * 2. Render the current glyph at (x + x_offset, y + y_offset),
 * 3. Advance the current point to (x + width, y)
 * 4. Render the next glyph
 */
public class GlyphGeometry(
    public val pangoGlyphGeometryPointer: CPointer<PangoGlyphGeometry>,
    cleaner: Cleaner? = null,
) : ProxyInstance(pangoGlyphGeometryPointer) {
    /**
     * the logical width to use for the the character.
     */
    public var width: GlyphUnit
        get() = pangoGlyphGeometryPointer.pointed.width

        @UnsafeFieldSetter
        set(`value`) {
            pangoGlyphGeometryPointer.pointed.width = value
        }

    /**
     * horizontal offset from nominal character position.
     */
    public var xOffset: GlyphUnit
        get() = pangoGlyphGeometryPointer.pointed.x_offset

        @UnsafeFieldSetter
        set(`value`) {
            pangoGlyphGeometryPointer.pointed.x_offset = value
        }

    /**
     * vertical offset from nominal character position.
     */
    public var yOffset: GlyphUnit
        get() = pangoGlyphGeometryPointer.pointed.y_offset

        @UnsafeFieldSetter
        set(`value`) {
            pangoGlyphGeometryPointer.pointed.y_offset = value
        }

    /**
     * Allocate a new GlyphGeometry.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<PangoGlyphGeometry>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to GlyphGeometry and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<PangoGlyphGeometry>, Cleaner>,
    ) : this(pangoGlyphGeometryPointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new GlyphGeometry using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<PangoGlyphGeometry>().ptr)

    /**
     * Allocate a new GlyphGeometry.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param width the logical width to use for the the character.
     * @param xOffset horizontal offset from nominal character position.
     * @param yOffset vertical offset from nominal character position.
     */
    public constructor(
        width: GlyphUnit,
        xOffset: GlyphUnit,
        yOffset: GlyphUnit,
    ) : this() {
        this.width = width
        this.xOffset = xOffset
        this.yOffset = yOffset
    }

    /**
     * Allocate a new GlyphGeometry using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param width the logical width to use for the the character.
     * @param xOffset horizontal offset from nominal character position.
     * @param yOffset vertical offset from nominal character position.
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        width: GlyphUnit,
        xOffset: GlyphUnit,
        yOffset: GlyphUnit,
        scope: AutofreeScope,
    ) : this(scope) {
        this.width = width
        this.xOffset = xOffset
        this.yOffset = yOffset
    }

    override fun toString(): String = "GlyphGeometry(width=$width, xOffset=$xOffset, yOffset=$yOffset)"
}
