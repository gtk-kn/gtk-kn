// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkAccessible
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
public open class VolumeButton(
    pointer: CPointer<GtkVolumeButton>,
) : ScaleButton(pointer.reinterpret()), KGTyped {
    public val gtkVolumeButtonPointer: CPointer<GtkVolumeButton>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    override val gtkOrientablePointer: CPointer<GtkOrientable>
        get() = gPointer.reinterpret()

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
            GeneratedClassKGType(gtk_volume_button_get_type()) {
                VolumeButton(it.reinterpret())
            }

        init {
            GtkTypeProvider.register()
        }
    }
}
