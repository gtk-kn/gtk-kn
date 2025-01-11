// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.cairo.annotations.CairoVersion1_18
import org.gtkkn.bindings.cairo.annotations.CairoVersion1_2
import org.gtkkn.bindings.cairo.annotations.CairoVersion1_4
import org.gtkkn.bindings.gobject.TypeInstance
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
public abstract class Pattern(public val cairoPatternPointer: CPointer<cairo_pattern_t>) :
    TypeInstance(cairoPatternPointer.reinterpret()),
    KGTyped {
    public open fun status(): Status = cairo_pattern_status(cairoPatternPointer).run {
        Status.fromNativeValue(this)
    }

    public open fun setExtend(extend: Extend): Unit = cairo_pattern_set_extend(cairoPatternPointer, extend.nativeValue)

    public open fun getExtend(): Extend = cairo_pattern_get_extend(cairoPatternPointer).run {
        Extend.fromNativeValue(this)
    }

    public open fun setFilter(filter: Filter): Unit = cairo_pattern_set_filter(cairoPatternPointer, filter.nativeValue)

    public open fun getFilter(): Filter = cairo_pattern_get_filter(cairoPatternPointer).run {
        Filter.fromNativeValue(this)
    }

    public open fun setMatrix(matrix: Matrix): Unit =
        cairo_pattern_set_matrix(cairoPatternPointer, matrix.cairoMatrixPointer)

    public open fun getMatrix(matrix: Matrix): Unit =
        cairo_pattern_get_matrix(cairoPatternPointer, matrix.cairoMatrixPointer)

    /**
     *
     *
     * @since 1.2
     */
    @CairoVersion1_2
    public open fun getPatternType(): PatternType = cairo_pattern_get_type(cairoPatternPointer).run {
        PatternType.fromNativeValue(this)
    }

    /**
     *
     *
     * @param key
     * @since 1.4
     */
    @CairoVersion1_4
    public open fun getUserData(key: UserDataKey): gpointer =
        cairo_pattern_get_user_data(cairoPatternPointer, key.cairoUserDataKeyPointer)!!

    /**
     *
     *
     * @param dither
     * @since 1.18
     */
    @CairoVersion1_18
    public open fun setDither(dither: Dither): Unit = cairo_pattern_set_dither(cairoPatternPointer, dither.nativeValue)

    /**
     *
     *
     * @since 1.18
     */
    @CairoVersion1_18
    public open fun getDither(): Dither = cairo_pattern_get_dither(cairoPatternPointer).run {
        Dither.fromNativeValue(this)
    }

    /**
     * The PatternImpl type represents a native instance of the abstract Pattern class.
     *
     * @constructor Creates a new instance of Pattern for the provided [CPointer].
     */
    public class PatternImpl(pointer: CPointer<cairo_pattern_t>) : Pattern(pointer)

    public companion object : TypeCompanion<Pattern> {
        override val type: GeneratedClassKGType<Pattern> =
            GeneratedClassKGType(cairo_gobject_pattern_get_type()) { PatternImpl(it.reinterpret()) }

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
