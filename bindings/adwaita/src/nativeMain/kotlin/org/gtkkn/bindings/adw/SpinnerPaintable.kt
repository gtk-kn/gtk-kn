// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.adw.annotations.AdwVersion1_6
import org.gtkkn.bindings.gdk.Paintable
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.SymbolicPaintable
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.adw.AdwSpinnerPaintable
import org.gtkkn.native.adw.adw_spinner_paintable_get_type
import org.gtkkn.native.adw.adw_spinner_paintable_get_widget
import org.gtkkn.native.adw.adw_spinner_paintable_new
import org.gtkkn.native.adw.adw_spinner_paintable_set_widget
import org.gtkkn.native.gdk.GdkPaintable
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkSymbolicPaintable

/**
 * A paintable showing a loading spinner.
 *
 * <picture>
 *   <source srcset="spinner-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="spinner.png" alt="spinner">
 * </picture>
 *
 * `AdwSpinnerPaintable` size varies depending on the available space, but is
 * capped at 64×64 pixels.
 *
 * To be able to animate, `AdwSpinnerPaintable` needs a widget. It will be
 * animated according to that widget's frame clock, and only if that widget is
 * mapped. Ideally it should be the same widget the paintable is displayed in,
 * but that's not a requirement.
 *
 * Most applications should be using [class@Spinner] instead.
 * `AdwSpinnerPaintable` is provided for the cases where using a widget is
 * impractical or impossible, such as [property@StatusPage:paintable]:
 *
 * ```xml
 * <object class="AdwStatusPage" id="status_page">
 *   <property name="paintable">
 *     <object class="AdwSpinnerPaintable">
 *       <property name="widget">status_page</property>
 *     </object>
 *   </property>
 *   <!-- ... -->
 * </object>
 * ```
 * @since 1.6
 */
@AdwVersion1_6
public class SpinnerPaintable(public val adwSpinnerPaintablePointer: CPointer<AdwSpinnerPaintable>) :
    Object(adwSpinnerPaintablePointer.reinterpret()),
    Paintable,
    SymbolicPaintable,
    KGTyped {
    init {
        Adw
    }

    override val gdkPaintablePointer: CPointer<GdkPaintable>
        get() = handle.reinterpret()

    override val gtkSymbolicPaintablePointer: CPointer<GtkSymbolicPaintable>
        get() = handle.reinterpret()

    /**
     * The widget the spinner uses for frame clock.
     *
     * @since 1.6
     */
    @AdwVersion1_6
    public var widget: Widget?
        /**
         * Gets the widget used for frame clock.
         *
         * @return the widget
         * @since 1.6
         */
        get() = adw_spinner_paintable_get_widget(adwSpinnerPaintablePointer)?.run {
            InstanceCache.get(this, true) { Widget.WidgetImpl(reinterpret()) }!!
        }

        /**
         * Sets the widget used for frame clock.
         *
         * @param widget the widget to use for frame clock
         * @since 1.6
         */
        @AdwVersion1_6
        set(widget) = adw_spinner_paintable_set_widget(adwSpinnerPaintablePointer, widget?.gtkWidgetPointer)

    /**
     * Creates a new `AdwSpinnerPaintable` for @widget.
     *
     * @param widget the widget used for frame clock
     * @return the newly created `AdwSpinnerPaintable`
     * @since 1.6
     */
    public constructor(widget: Widget? = null) : this(adw_spinner_paintable_new(widget?.gtkWidgetPointer)!!) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<SpinnerPaintable> {
        override val type: GeneratedClassKGType<SpinnerPaintable> =
            GeneratedClassKGType(getTypeOrNull()!!) { SpinnerPaintable(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of SpinnerPaintable
         *
         * @return the GType
         */
        public fun getType(): GType = adw_spinner_paintable_get_type()

        /**
         * Gets the GType of from the symbol `adw_spinner_paintable_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("adw_spinner_paintable_get_type")
    }
}
