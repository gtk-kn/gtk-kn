// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.pango

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.pango.PangoAttrColor

/**
 * The `PangoAttrColor` structure is used to represent attributes that
 * are colors.
 *
 * ## Skipped during bindings generation
 *
 * - field `attr`: Field with not-pointer record/union PangoAttribute is not supported
 * - field `color`: Field with not-pointer record/union PangoColor is not supported
 */
public class AttrColor(public val pangoAttrColorPointer: CPointer<PangoAttrColor>) :
    ProxyInstance(pangoAttrColorPointer) {
    /**
     * Allocate a new AttrColor.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<PangoAttrColor>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

    /**
     * Allocate a new AttrColor using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<PangoAttrColor>().ptr)
}
