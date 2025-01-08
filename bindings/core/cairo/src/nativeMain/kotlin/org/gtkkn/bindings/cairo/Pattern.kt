// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.cairo.annotations.CairoVersion1_18
import org.gtkkn.bindings.cairo.annotations.CairoVersion1_2
import org.gtkkn.bindings.cairo.annotations.CairoVersion1_4
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.cairo.cairo_gobject_pattern_get_type
import org.gtkkn.native.cairo.cairo_pattern_get_dither
import org.gtkkn.native.cairo.cairo_pattern_get_extend
import org.gtkkn.native.cairo.cairo_pattern_get_filter
import org.gtkkn.native.cairo.cairo_pattern_get_matrix
import org.gtkkn.native.cairo.cairo_pattern_get_type
import org.gtkkn.native.cairo.cairo_pattern_get_user_data
import org.gtkkn.native.cairo.cairo_pattern_set_dither
import org.gtkkn.native.cairo.cairo_pattern_set_extend
import org.gtkkn.native.cairo.cairo_pattern_set_filter
import org.gtkkn.native.cairo.cairo_pattern_set_matrix
import org.gtkkn.native.cairo.cairo_pattern_status
import org.gtkkn.native.cairo.cairo_pattern_t
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.gobject.GType
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - parameter `destroy`: GLib.DestroyNotify
 */
public open class Pattern(pointer: CPointer<cairo_pattern_t>) : KGTyped {
    public val gPointer: CPointer<cairo_pattern_t> = pointer

    public open fun status(): Status = cairo_pattern_status(gPointer).run {
        Status.fromNativeValue(this)
    }

    public open fun setExtend(extend: Extend): Unit = cairo_pattern_set_extend(gPointer, extend.nativeValue)

    public open fun getExtend(): Extend = cairo_pattern_get_extend(gPointer).run {
        Extend.fromNativeValue(this)
    }

    public open fun setFilter(filter: Filter): Unit = cairo_pattern_set_filter(gPointer, filter.nativeValue)

    public open fun getFilter(): Filter = cairo_pattern_get_filter(gPointer).run {
        Filter.fromNativeValue(this)
    }

    public open fun setMatrix(matrix: Matrix): Unit = cairo_pattern_set_matrix(gPointer, matrix.gPointer)

    public open fun getMatrix(matrix: Matrix): Unit = cairo_pattern_get_matrix(gPointer, matrix.gPointer)

    /**
     *
     *
     * @since 1.2
     */
    @CairoVersion1_2
    public open fun getPatternType(): PatternType = cairo_pattern_get_type(gPointer).run {
        PatternType.fromNativeValue(this)
    }

    /**
     *
     *
     * @param key
     * @since 1.4
     */
    @CairoVersion1_4
    public open fun getUserData(key: UserDataKey): gpointer = cairo_pattern_get_user_data(gPointer, key.gPointer)!!

    /**
     *
     *
     * @param dither
     * @since 1.18
     */
    @CairoVersion1_18
    public open fun setDither(dither: Dither): Unit = cairo_pattern_set_dither(gPointer, dither.nativeValue)

    /**
     *
     *
     * @since 1.18
     */
    @CairoVersion1_18
    public open fun getDither(): Dither = cairo_pattern_get_dither(gPointer).run {
        Dither.fromNativeValue(this)
    }

    public companion object : TypeCompanion<Pattern> {
        override val type: GeneratedClassKGType<Pattern> =
            GeneratedClassKGType(cairo_gobject_pattern_get_type()) { Pattern(it.reinterpret()) }

        init {
            CairoTypeProvider.register()
        }

        /**
         * Get the GType of Pattern
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_pattern_get_type()
    }
}
