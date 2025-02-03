// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkAccessibleRange
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkOrientable
import org.gtkkn.native.gtk.GtkVolumeButton
import org.gtkkn.native.gtk.gtk_volume_button_get_type
import org.gtkkn.native.gtk.gtk_volume_button_new

/**
 * # ⚠️ Deprecated ⚠️
 *
 * This is deprecated since version 4.10.
 *
 * This widget will be removed in GTK 5
 * ---
 *
 * `GtkVolumeButton` is a `GtkScaleButton` subclass tailored for
 * volume control.
 *
 * ![An example GtkVolumeButton](volumebutton.png)
 *
 * ## Skipped during bindings generation
 *
 * - method `use-symbolic`: Property has no getter nor setter
 */
public open class VolumeButton(public val gtkVolumeButtonPointer: CPointer<GtkVolumeButton>) :
    ScaleButton(gtkVolumeButtonPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkAccessibleRangePointer: CPointer<GtkAccessibleRange>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    override val gtkOrientablePointer: CPointer<GtkOrientable>
        get() = handle.reinterpret()

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This widget will be removed in GTK 5
     * ---
     *
     * Creates a `GtkVolumeButton`.
     *
     * The button has a range between 0.0 and 1.0, with a stepping of 0.02.
     * Volume values can be obtained and modified using the functions from
     * [class@Gtk.ScaleButton].
     *
     * @return a new `GtkVolumeButton`
     */
    public constructor() : this(gtk_volume_button_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<VolumeButton> {
        override val type: GeneratedClassKGType<VolumeButton> =
            GeneratedClassKGType(getTypeOrNull()!!) { VolumeButton(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of VolumeButton
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_volume_button_get_type()

        /**
         * Gets the GType of from the symbol `gtk_volume_button_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_volume_button_get_type")
    }
}
