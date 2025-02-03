// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.gfloat
import org.gtkkn.native.gsk.GskShadow
import kotlin.String

/**
 * The shadow parameters in a shadow node.
 *
 * ## Skipped during bindings generation
 *
 * - field `color`: Field with not-pointer record/union GdkRGBA is not supported
 */
public class Shadow(public val gskShadowPointer: CPointer<GskShadow>) : ProxyInstance(gskShadowPointer) {
    /**
     * the horizontal offset of the shadow
     */
    public var dx: gfloat
        get() = gskShadowPointer.pointed.dx

        @UnsafeFieldSetter
        set(`value`) {
            gskShadowPointer.pointed.dx = value
        }

    /**
     * the vertical offset of the shadow
     */
    public var dy: gfloat
        get() = gskShadowPointer.pointed.dy

        @UnsafeFieldSetter
        set(`value`) {
            gskShadowPointer.pointed.dy = value
        }

    /**
     * the radius of the shadow
     */
    public var radius: gfloat
        get() = gskShadowPointer.pointed.radius

        @UnsafeFieldSetter
        set(`value`) {
            gskShadowPointer.pointed.radius = value
        }

    /**
     * Allocate a new Shadow.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<GskShadow>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

    /**
     * Allocate a new Shadow using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GskShadow>().ptr)

    /**
     * Allocate a new Shadow.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param dx the horizontal offset of the shadow
     * @param dy the vertical offset of the shadow
     * @param radius the radius of the shadow
     */
    public constructor(
        dx: gfloat,
        dy: gfloat,
        radius: gfloat,
    ) : this() {
        this.dx = dx
        this.dy = dy
        this.radius = radius
    }

    /**
     * Allocate a new Shadow using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param dx the horizontal offset of the shadow
     * @param dy the vertical offset of the shadow
     * @param radius the radius of the shadow
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        dx: gfloat,
        dy: gfloat,
        radius: gfloat,
        scope: AutofreeScope,
    ) : this(scope) {
        this.dx = dx
        this.dy = dy
        this.radius = radius
    }

    override fun toString(): String = "Shadow(dx=$dx, dy=$dy, radius=$radius)"
}
