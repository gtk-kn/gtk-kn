// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.adw.annotations.AdwVersion1_6
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.adw.AdwSpinner
import org.gtkkn.native.adw.adw_spinner_get_type
import org.gtkkn.native.adw.adw_spinner_new
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget

/**
 * A widget showing a loading spinner.
 *
 * <picture>
 *   <source srcset="spinner-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="spinner.png" alt="spinner">
 * </picture>
 *
 * The size of the spinner depends on the available size, never smaller than
 * 16×16 pixels and never larger than 64×64 pixels.
 *
 * Use the [property@Gtk.Widget:halign] and [property@Gtk.Widget:valign]
 * properties in combination with [property@Gtk.Widget:width-request] and
 * [property@Gtk.Widget:height-request] for fine sizing control.
 *
 * For example, the following snippet shows the spinner at 48×48 pixels:
 *
 * ```xml
 * <object class="AdwSpinner">
 *   <property name="halign">center</property>
 *   <property name="valign">center</property>
 *   <property name="width-request">48</property>
 *   <property name="height-request">48</property>
 * </object>
 * ```
 *
 * See [class@SpinnerPaintable] for cases where using a widget is impractical or
 * impossible, such as [property@StatusPage:paintable].
 *
 * ## CSS nodes
 *
 * `AdwSpinner` has a single node with the name `image` and the style class
 * `.spinner`.
 * @since 1.6
 */
@AdwVersion1_6
public class Spinner(public val adwSpinnerPointer: CPointer<AdwSpinner>) :
    Widget(adwSpinnerPointer.reinterpret()),
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
     * Creates a new `AdwSpinner`.
     *
     * @return the newly created `AdwSpinner`
     * @since 1.6
     */
    public constructor() : this(adw_spinner_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<Spinner> {
        override val type: GeneratedClassKGType<Spinner> =
            GeneratedClassKGType(getTypeOrNull()!!) { Spinner(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of Spinner
         *
         * @return the GType
         */
        public fun getType(): GType = adw_spinner_get_type()

        /**
         * Gets the GType of from the symbol `adw_spinner_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? = org.gtkkn.extensions.glib.cinterop.getTypeOrNull("adw_spinner_get_type")
    }
}
