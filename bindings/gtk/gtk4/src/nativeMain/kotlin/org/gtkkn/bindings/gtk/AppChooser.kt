// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.AppInfo
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.gobject.legacy.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAppChooser
import org.gtkkn.native.gtk.gtk_app_chooser_get_app_info
import org.gtkkn.native.gtk.gtk_app_chooser_get_content_type
import org.gtkkn.native.gtk.gtk_app_chooser_get_type
import org.gtkkn.native.gtk.gtk_app_chooser_refresh
import kotlin.String
import kotlin.Unit

/**
 * # ⚠️ Deprecated ⚠️
 *
 * This is deprecated since version 4.10.
 *
 * The application selection widgets should be
 *   implemented according to the design of each platform and/or
 *   application requiring them.
 * ---
 *
 * `GtkAppChooser` is an interface for widgets which allow the user to
 * choose an application.
 *
 * The main objects that implement this interface are
 * [class@Gtk.AppChooserWidget],
 * [class@Gtk.AppChooserDialog] and [class@Gtk.AppChooserButton].
 *
 * Applications are represented by GIO `GAppInfo` objects here.
 * GIO has a concept of recommended and fallback applications for a
 * given content type. Recommended applications are those that claim
 * to handle the content type itself, while fallback also includes
 * applications that handle a more generic content type. GIO also
 * knows the default and last-used application for a given content
 * type. The `GtkAppChooserWidget` provides detailed control over
 * whether the shown list of applications should include default,
 * recommended or fallback applications.
 *
 * To obtain the application that has been selected in a `GtkAppChooser`,
 * use [method@Gtk.AppChooser.get_app_info].
 */
public interface AppChooser :
    Proxy,
    KGTyped {
    public val gtkAppChooserPointer: CPointer<GtkAppChooser>

    /**
     * The content type of the `GtkAppChooser` object.
     *
     * See `GContentType` for more information about content types.
     */
    public val contentType: String
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         *
         * This widget will be removed in GTK 5
         * ---
         *
         * Returns the content type for which the `GtkAppChooser`
         * shows applications.
         *
         * @return the content type of @self. Free with g_free()
         */
        get() = gtk_app_chooser_get_content_type(gtkAppChooserPointer)?.toKString() ?: error("Expected not null string")

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This widget will be removed in GTK 5
     * ---
     *
     * Returns the currently selected application.
     *
     * @return a `GAppInfo` for the
     *   currently selected application
     */
    public fun getAppInfo(): AppInfo? = gtk_app_chooser_get_app_info(gtkAppChooserPointer)?.run {
        AppInfo.AppInfoImpl(reinterpret())
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This widget will be removed in GTK 5
     * ---
     *
     * Returns the content type for which the `GtkAppChooser`
     * shows applications.
     *
     * @return the content type of @self. Free with g_free()
     */
    public fun getContentType(): String =
        gtk_app_chooser_get_content_type(gtkAppChooserPointer)?.toKString() ?: error("Expected not null string")

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This widget will be removed in GTK 5
     * ---
     *
     * Reloads the list of applications.
     */
    public fun refresh(): Unit = gtk_app_chooser_refresh(gtkAppChooserPointer)

    /**
     * The AppChooserImpl type represents a native instance of the AppChooser interface.
     *
     * @constructor Creates a new instance of AppChooser for the provided [CPointer].
     */
    public class AppChooserImpl(gtkAppChooserPointer: CPointer<GtkAppChooser>) :
        Widget(gtkAppChooserPointer.reinterpret()),
        AppChooser {
        init {
            Gtk
        }

        override val gtkAppChooserPointer: CPointer<GtkAppChooser> = gtkAppChooserPointer
    }

    public companion object : TypeCompanion<AppChooser> {
        override val type: GeneratedInterfaceKGType<AppChooser> =
            GeneratedInterfaceKGType(getTypeOrNull()!!) { AppChooserImpl(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of AppChooser
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_app_chooser_get_type()

        /**
         * Gets the GType of from the symbol `gtk_app_chooser_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_app_chooser_get_type")
    }
}
