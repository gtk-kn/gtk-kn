// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gdk.GdkTimeCoord
import org.gtkkn.native.glib.guint
import kotlin.String

/**
 * A `GdkTimeCoord` stores a single event in a motion history.
 *
 * To check whether an axis is present, check whether the corresponding
 * flag from the [flags@Gdk.AxisFlags] enumeration is set in the @flags
 * To access individual axis values, use the values of the values of
 * the [enum@Gdk.AxisUse] enumerations as indices.
 *
 * ## Skipped during bindings generation
 *
 * - field `axes`: Array parameter of type gdouble is not supported
 */
public class TimeCoord(public val gdkTimeCoordPointer: CPointer<GdkTimeCoord>) : ProxyInstance(gdkTimeCoordPointer) {
    /**
     * The timestamp for this event
     */
    public var time: guint
        get() = gdkTimeCoordPointer.pointed.time

        @UnsafeFieldSetter
        set(`value`) {
            gdkTimeCoordPointer.pointed.time = value
        }

    /**
     * Flags indicating what axes are present, see [flags@Gdk.AxisFlags]
     */
    public var flags: AxisFlags
        get() = gdkTimeCoordPointer.pointed.flags.run {
            AxisFlags(this)
        }

        @UnsafeFieldSetter
        set(`value`) {
            gdkTimeCoordPointer.pointed.flags = value.mask
        }

    /**
     * Allocate a new TimeCoord.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<GdkTimeCoord>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

    /**
     * Allocate a new TimeCoord using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GdkTimeCoord>().ptr)

    /**
     * Allocate a new TimeCoord.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param time The timestamp for this event
     * @param flags Flags indicating what axes are present, see [flags@Gdk.AxisFlags]
     */
    public constructor(time: guint, flags: AxisFlags) : this() {
        this.time = time
        this.flags = flags
    }

    /**
     * Allocate a new TimeCoord using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param time The timestamp for this event
     * @param flags Flags indicating what axes are present, see [flags@Gdk.AxisFlags]
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        time: guint,
        flags: AxisFlags,
        scope: AutofreeScope,
    ) : this(scope) {
        this.time = time
        this.flags = flags
    }

    override fun toString(): String = "TimeCoord(time=$time, flags=$flags)"
}
