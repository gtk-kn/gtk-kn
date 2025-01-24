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
import org.gtkkn.bindings.pango.annotations.PangoVersion1_8
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.guint
import org.gtkkn.native.pango.PangoAttrSize
import org.gtkkn.native.pango.pango_attr_size_new
import org.gtkkn.native.pango.pango_attr_size_new_absolute
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * The `PangoAttrSize` structure is used to represent attributes which
 * set font size.
 *
 * ## Skipped during bindings generation
 *
 * - field `attr`: Field with not-pointer record/union PangoAttribute is not supported
 */
public class AttrSize(public val pangoAttrSizePointer: CPointer<PangoAttrSize>, cleaner: Cleaner? = null) :
    ProxyInstance(pangoAttrSizePointer) {
    /**
     * size of font, in units of 1/%PANGO_SCALE of a point (for
     *   %PANGO_ATTR_SIZE) or of a device unit (for %PANGO_ATTR_ABSOLUTE_SIZE)
     */
    public var size: gint
        get() = pangoAttrSizePointer.pointed.size

        @UnsafeFieldSetter
        set(`value`) {
            pangoAttrSizePointer.pointed.size = value
        }

    /**
     * whether the font size is in device units or points.
     *   This field is only present for compatibility with Pango-1.8.0
     *   (%PANGO_ATTR_ABSOLUTE_SIZE was added in 1.8.1); and always will
     *   be false for %PANGO_ATTR_SIZE and true for %PANGO_ATTR_ABSOLUTE_SIZE.
     */
    public var absolute: guint
        get() = pangoAttrSizePointer.pointed.absolute

        @UnsafeFieldSetter
        set(`value`) {
            pangoAttrSizePointer.pointed.absolute = value
        }

    /**
     * Allocate a new AttrSize.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<PangoAttrSize>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to AttrSize and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<PangoAttrSize>, Cleaner>,
    ) : this(pangoAttrSizePointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new AttrSize using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<PangoAttrSize>().ptr)

    /**
     * Allocate a new AttrSize.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param size size of font, in units of 1/%PANGO_SCALE of a point (for
     *   %PANGO_ATTR_SIZE) or of a device unit (for %PANGO_ATTR_ABSOLUTE_SIZE)
     * @param absolute whether the font size is in device units or points.
     *   This field is only present for compatibility with Pango-1.8.0
     *   (%PANGO_ATTR_ABSOLUTE_SIZE was added in 1.8.1); and always will
     *   be false for %PANGO_ATTR_SIZE and true for %PANGO_ATTR_ABSOLUTE_SIZE.
     */
    public constructor(size: gint, absolute: guint) : this() {
        this.size = size
        this.absolute = absolute
    }

    /**
     * Allocate a new AttrSize using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param size size of font, in units of 1/%PANGO_SCALE of a point (for
     *   %PANGO_ATTR_SIZE) or of a device unit (for %PANGO_ATTR_ABSOLUTE_SIZE)
     * @param absolute whether the font size is in device units or points.
     *   This field is only present for compatibility with Pango-1.8.0
     *   (%PANGO_ATTR_ABSOLUTE_SIZE was added in 1.8.1); and always will
     *   be false for %PANGO_ATTR_SIZE and true for %PANGO_ATTR_ABSOLUTE_SIZE.
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        size: gint,
        absolute: guint,
        scope: AutofreeScope,
    ) : this(scope) {
        this.size = size
        this.absolute = absolute
    }

    override fun toString(): String = "AttrSize(size=$size, absolute=$absolute)"

    public companion object {
        /**
         * Create a new font-size attribute in fractional points.
         *
         * @param size the font size, in %PANGO_SCALE-ths of a point
         * @return the newly allocated
         *   `PangoAttribute`, which should be freed with
         *   [method@Pango.Attribute.destroy]
         */
        public fun new(size: gint): Attribute = pango_attr_size_new(size)!!.run {
            Attribute(this)
        }

        /**
         * Create a new font-size attribute in device units.
         *
         * @param size the font size, in %PANGO_SCALE-ths of a device unit
         * @return the newly allocated
         *   `PangoAttribute`, which should be freed with
         *   [method@Pango.Attribute.destroy]
         * @since 1.8
         */
        @PangoVersion1_8
        public fun newAbsolute(size: gint): Attribute = pango_attr_size_new_absolute(size)!!.run {
            Attribute(this)
        }
    }
}
