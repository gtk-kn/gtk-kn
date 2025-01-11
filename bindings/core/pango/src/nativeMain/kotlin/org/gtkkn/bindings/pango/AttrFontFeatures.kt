// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.pango.annotations.PangoVersion1_38
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.g_free
import org.gtkkn.native.glib.g_strdup
import org.gtkkn.native.pango.PangoAttrFontFeatures
import org.gtkkn.native.pango.pango_attr_font_features_new
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * The `PangoAttrFontFeatures` structure is used to represent OpenType
 * font features as an attribute.
 *
 * ## Skipped during bindings generation
 *
 * - field `attr`: Field with not-pointer record/union PangoAttribute is not supported
 *
 * @since 1.38
 */
@PangoVersion1_38
public class AttrFontFeatures(
    public val pangoAttrFontFeaturesPointer: CPointer<PangoAttrFontFeatures>,
    cleaner: Cleaner? = null,
) : ProxyInstance(pangoAttrFontFeaturesPointer) {
    /**
     * the features, as a string in CSS syntax
     */
    public var features: String?
        get() = pangoAttrFontFeaturesPointer.pointed.features?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            pangoAttrFontFeaturesPointer.pointed.features?.let { g_free(it) }
            pangoAttrFontFeaturesPointer.pointed.features = value?.let { g_strdup(it) }
        }

    /**
     * Allocate a new AttrFontFeatures.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<PangoAttrFontFeatures>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to AttrFontFeatures and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<PangoAttrFontFeatures>, Cleaner>,
    ) : this(pangoAttrFontFeaturesPointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new AttrFontFeatures using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<PangoAttrFontFeatures>().ptr)

    /**
     * Allocate a new AttrFontFeatures.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param features the features, as a string in CSS syntax
     */
    public constructor(features: String?) : this() {
        this.features = features
    }

    /**
     * Allocate a new AttrFontFeatures using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param features the features, as a string in CSS syntax
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(features: String?, scope: AutofreeScope) : this(scope) {
        this.features = features
    }

    override fun toString(): String = "AttrFontFeatures(features=$features)"

    public companion object {
        /**
         * Create a new font features tag attribute.
         *
         * You can use this attribute to select OpenType font features like small-caps,
         * alternative glyphs, ligatures, etc. for fonts that support them.
         *
         * @param features a string with OpenType font features, with the syntax of the [CSS
         * font-feature-settings property](https://www.w3.org/TR/css-fonts-4/#font-rend-desc)
         * @return the newly allocated
         *   `PangoAttribute`, which should be freed with
         *   [method@Pango.Attribute.destroy]
         * @since 1.38
         */
        @PangoVersion1_38
        public fun new(features: String): Attribute = pango_attr_font_features_new(features)!!.run {
            Attribute(this)
        }
    }
}
