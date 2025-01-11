// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
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
     * Creates a `GtkVolumeButton`.
     *
     * The button has a range between 0.0 and 1.0, with a stepping of 0.02.
     * Volume values can be obtained and modified using the functions from
     * [class@Gtk.ScaleButton].
     *
     * @return a new `GtkVolumeButton`
     */
    public constructor() : this(gtk_volume_button_new()!!.reinterpret())

    public companion object : TypeCompanion<VolumeButton> {
        override val type: GeneratedClassKGType<VolumeButton> =
            GeneratedClassKGType(gtk_volume_button_get_type()) { VolumeButton(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of VolumeButton
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_volume_button_get_type()
    }
}
