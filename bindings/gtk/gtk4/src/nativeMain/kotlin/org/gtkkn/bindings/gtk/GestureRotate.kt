// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkGestureRotate
import org.gtkkn.native.gtk.gtk_gesture_rotate_get_angle_delta
import org.gtkkn.native.gtk.gtk_gesture_rotate_get_type
import org.gtkkn.native.gtk.gtk_gesture_rotate_new
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkGestureRotate` is a `GtkGesture` for 2-finger rotations.
 *
 * Whenever the angle between both handled sequences changes, the
 * [signal@Gtk.GestureRotate::angle-changed] signal is emitted.
 */
public open class GestureRotate(public val gtkGestureRotatePointer: CPointer<GtkGestureRotate>) :
    Gesture(gtkGestureRotatePointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    /**
     * Returns a newly created `GtkGesture` that recognizes 2-touch
     * rotation gestures.
     *
     * @return a newly created `GtkGestureRotate`
     */
    public constructor() : this(gtk_gesture_rotate_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * Gets the angle delta in radians.
     *
     * If @gesture is active, this function returns the angle difference
     * in radians since the gesture was first recognized. If @gesture is
     * not active, 0 is returned.
     *
     * @return the angle delta in radians
     */
    public open fun getAngleDelta(): gdouble = gtk_gesture_rotate_get_angle_delta(gtkGestureRotatePointer)

    /**
     * Emitted when the angle between both tracked points changes.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `angle` Current angle in radians; `angleDelta` Difference with the starting angle, in radians
     */
    public fun onAngleChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (angle: gdouble, angleDelta: gdouble) -> Unit,
    ): ULong = g_signal_connect_data(
        gtkGestureRotatePointer,
        "angle-changed",
        onAngleChangedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "angle-changed" signal. See [onAngleChanged].
     *
     * @param angle Current angle in radians
     * @param angleDelta Difference with the starting angle, in radians
     */
    public fun emitAngleChanged(angle: gdouble, angleDelta: gdouble) {
        g_signal_emit_by_name(gtkGestureRotatePointer.reinterpret(), "angle-changed", angle, angleDelta)
    }

    public companion object : TypeCompanion<GestureRotate> {
        override val type: GeneratedClassKGType<GestureRotate> =
            GeneratedClassKGType(getTypeOrNull()!!) { GestureRotate(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of GestureRotate
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_gesture_rotate_get_type()

        /**
         * Gets the GType of from the symbol `gtk_gesture_rotate_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_gesture_rotate_get_type")
    }
}

private val onAngleChangedFunc: CPointer<CFunction<(gdouble, gdouble) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        angle: gdouble,
        angleDelta: gdouble,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(angle: gdouble, angleDelta: gdouble) -> Unit>().get().invoke(angle, angleDelta)
}
    .reinterpret()
