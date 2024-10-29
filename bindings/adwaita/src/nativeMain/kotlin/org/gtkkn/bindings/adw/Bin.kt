// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwBin
import org.gtkkn.native.adw.adw_bin_get_child
import org.gtkkn.native.adw.adw_bin_get_type
import org.gtkkn.native.adw.adw_bin_new
import org.gtkkn.native.adw.adw_bin_set_child
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import kotlin.Unit

/**
 * A widget with one child.
 *
 * <picture>
 *   <source srcset="bin-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="bin.png" alt="bin">
 * </picture>
 *
 * The `AdwBin` widget has only one child, set with the [property@Bin:child]
 * property.
 *
 * It is useful for deriving subclasses, since it provides common code needed
 * for handling a single child widget.
 */
public open class Bin(
    pointer: CPointer<AdwBin>,
) : Widget(pointer.reinterpret()), KGTyped {
    public val adwBinPointer: CPointer<AdwBin>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * The child widget of the `AdwBin`.
     */
    public open var child: Widget?
        /**
         * Gets the child widget of @self.
         *
         * @return the child widget of @self
         */
        get() =
            adw_bin_get_child(adwBinPointer.reinterpret())?.run {
                Widget(reinterpret())
            }

        /**
         * Sets the child widget of @self.
         *
         * @param child the child widget
         */
        set(child) =
            adw_bin_set_child(
                adwBinPointer.reinterpret(),
                child?.gtkWidgetPointer?.reinterpret()
            )

    /**
     * Creates a new `AdwBin`.
     *
     * @return the new created `AdwBin`
     */
    public constructor() : this(adw_bin_new()!!.reinterpret())

    /**
     * Gets the child widget of @self.
     *
     * @return the child widget of @self
     */
    public open fun getChild(): Widget? =
        adw_bin_get_child(adwBinPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

    /**
     * Sets the child widget of @self.
     *
     * @param child the child widget
     */
    public open fun setChild(child: Widget? = null): Unit =
        adw_bin_set_child(adwBinPointer.reinterpret(), child?.gtkWidgetPointer?.reinterpret())

    public companion object : TypeCompanion<Bin> {
        override val type: GeneratedClassKGType<Bin> =
            GeneratedClassKGType(adw_bin_get_type()) {
                Bin(it.reinterpret())
            }

        init {
            AdwTypeProvider.register()
        }
    }
}
