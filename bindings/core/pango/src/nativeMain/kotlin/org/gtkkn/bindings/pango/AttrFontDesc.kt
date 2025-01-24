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
import org.gtkkn.native.pango.PangoAttrFontDesc
import org.gtkkn.native.pango.pango_attr_font_desc_new
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * The `PangoAttrFontDesc` structure is used to store an attribute that
 * sets all aspects of the font description at once.
 *
 * ## Skipped during bindings generation
 *
 * - field `attr`: Field with not-pointer record/union PangoAttribute is not supported
 */
public class AttrFontDesc(public val pangoAttrFontDescPointer: CPointer<PangoAttrFontDesc>, cleaner: Cleaner? = null) :
    ProxyInstance(pangoAttrFontDescPointer) {
    /**
     * the font description which is the value of this attribute
     */
    public var desc: FontDescription?
        get() = pangoAttrFontDescPointer.pointed.desc?.run {
            FontDescription(this)
        }

        @UnsafeFieldSetter
        set(`value`) {
            pangoAttrFontDescPointer.pointed.desc = value?.pangoFontDescriptionPointer
        }

    /**
     * Allocate a new AttrFontDesc.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<PangoAttrFontDesc>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to AttrFontDesc and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<PangoAttrFontDesc>, Cleaner>,
    ) : this(pangoAttrFontDescPointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new AttrFontDesc using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<PangoAttrFontDesc>().ptr)

    /**
     * Allocate a new AttrFontDesc.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param desc the font description which is the value of this attribute
     */
    public constructor(desc: FontDescription?) : this() {
        this.desc = desc
    }

    /**
     * Allocate a new AttrFontDesc using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param desc the font description which is the value of this attribute
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(desc: FontDescription?, scope: AutofreeScope) : this(scope) {
        this.desc = desc
    }

    override fun toString(): String = "AttrFontDesc(desc=$desc)"

    public companion object {
        /**
         * Create a new font description attribute.
         *
         * This attribute allows setting family, style, weight, variant,
         * stretch, and size simultaneously.
         *
         * @param desc the font description
         * @return the newly allocated
         *   `PangoAttribute`, which should be freed with
         *   [method@Pango.Attribute.destroy]
         */
        public fun new(desc: FontDescription): Attribute =
            pango_attr_font_desc_new(desc.pangoFontDescriptionPointer)!!.run {
                Attribute(this)
            }
    }
}
