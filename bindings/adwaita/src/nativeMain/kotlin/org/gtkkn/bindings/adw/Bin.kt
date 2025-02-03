// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.adw.AdwBin
import org.gtkkn.native.adw.adw_bin_get_child
import org.gtkkn.native.adw.adw_bin_get_type
import org.gtkkn.native.adw.adw_bin_new
import org.gtkkn.native.adw.adw_bin_set_child
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget

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
public open class Bin(public val adwBinPointer: CPointer<AdwBin>) :
    Widget(adwBinPointer.reinterpret()),
    KGTyped {
    init {
        Adw
    }

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * The child widget of the `AdwBin`.
     */
    public open var child: Widget?
        /**
         * Gets the child widget of @self.
         *
         * @return the child widget of @self
         */
        get() = adw_bin_get_child(adwBinPointer)?.run {
            InstanceCache.get(this, true) { Widget.WidgetImpl(reinterpret()) }!!
        }

        /**
         * Sets the child widget of @self.
         *
         * @param child the child widget
         */
        set(child) = adw_bin_set_child(adwBinPointer, child?.gtkWidgetPointer)

    /**
     * Creates a new `AdwBin`.
     *
     * @return the new created `AdwBin`
     */
    public constructor() : this(adw_bin_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<Bin> {
        override val type: GeneratedClassKGType<Bin> =
            GeneratedClassKGType(getTypeOrNull()!!) { Bin(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of Bin
         *
         * @return the GType
         */
        public fun getType(): GType = adw_bin_get_type()

        /**
         * Gets the GType of from the symbol `adw_bin_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? = org.gtkkn.extensions.glib.cinterop.getTypeOrNull("adw_bin_get_type")
    }
}
