// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.adw.AdwWindowTitle
import org.gtkkn.native.adw.adw_window_title_get_subtitle
import org.gtkkn.native.adw.adw_window_title_get_title
import org.gtkkn.native.adw.adw_window_title_get_type
import org.gtkkn.native.adw.adw_window_title_new
import org.gtkkn.native.adw.adw_window_title_set_subtitle
import org.gtkkn.native.adw.adw_window_title_set_title
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import kotlin.String

/**
 * A helper widget for setting a window's title and subtitle.
 *
 * <picture>
 *   <source srcset="window-title-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="window-title.png" alt="window-title">
 * </picture>
 *
 * `AdwWindowTitle` shows a title and subtitle. It's intended to be used as the
 * title child of [class@Gtk.HeaderBar] or [class@HeaderBar].
 *
 * ## CSS nodes
 *
 * `AdwWindowTitle` has a single CSS node with name `windowtitle`.
 */
public class WindowTitle(public val adwWindowTitlePointer: CPointer<AdwWindowTitle>) :
    Widget(adwWindowTitlePointer.reinterpret()),
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
     * The subtitle to display.
     *
     * The subtitle should give the user additional details.
     */
    public var subtitle: String
        /**
         * Gets the subtitle of @self.
         *
         * @return the subtitle
         */
        get() = adw_window_title_get_subtitle(adwWindowTitlePointer)?.toKString() ?: error("Expected not null string")

        /**
         * Sets the subtitle of @self.
         *
         * The subtitle should give the user additional details.
         *
         * @param subtitle a subtitle
         */
        set(subtitle) = adw_window_title_set_subtitle(adwWindowTitlePointer, subtitle)

    /**
     * The title to display.
     *
     * The title typically identifies the current view or content item, and
     * generally does not use the application name.
     */
    public var title: String
        /**
         * Gets the title of @self.
         *
         * @return the title
         */
        get() = adw_window_title_get_title(adwWindowTitlePointer)?.toKString() ?: error("Expected not null string")

        /**
         * Sets the title of @self.
         *
         * The title typically identifies the current view or content item, and
         * generally does not use the application name.
         *
         * @param title a title
         */
        set(title) = adw_window_title_set_title(adwWindowTitlePointer, title)

    /**
     * Creates a new `AdwWindowTitle`.
     *
     * @param title a title
     * @param subtitle a subtitle
     * @return the newly created `AdwWindowTitle`
     */
    public constructor(title: String, subtitle: String) : this(adw_window_title_new(title, subtitle)!!.reinterpret()) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<WindowTitle> {
        override val type: GeneratedClassKGType<WindowTitle> =
            GeneratedClassKGType(getTypeOrNull()!!) { WindowTitle(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of WindowTitle
         *
         * @return the GType
         */
        public fun getType(): GType = adw_window_title_get_type()

        /**
         * Gets the GType of from the symbol `adw_window_title_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("adw_window_title_get_type")
    }
}
