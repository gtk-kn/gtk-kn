// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.AppInfo
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkAppChooser
import org.gtkkn.native.gtk.gtk_app_chooser_get_app_info
import org.gtkkn.native.gtk.gtk_app_chooser_get_content_type
import org.gtkkn.native.gtk.gtk_app_chooser_get_type
import org.gtkkn.native.gtk.gtk_app_chooser_refresh
import kotlin.String
import kotlin.Unit

/**
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
    Interface,
    KGTyped {
    public val gtkAppChooserPointer: CPointer<GtkAppChooser>

    /**
     * The content type of the `GtkAppChooser` object.
     *
     * See `GContentType` for more information about content types.
     */
    public val contentType: String
        /**
         * Returns the content type for which the `GtkAppChooser`
         * shows applications.
         *
         * @return the content type of @self. Free with g_free()
         */
        get() =
            gtk_app_chooser_get_content_type(gtkAppChooserPointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

    /**
     * Returns the currently selected application.
     *
     * @return a `GAppInfo` for the
     *   currently selected application
     */
    public fun getAppInfo(): AppInfo? =
        gtk_app_chooser_get_app_info(gtkAppChooserPointer.reinterpret())?.run {
            AppInfo.wrap(reinterpret())
        }

    /**
     * Returns the content type for which the `GtkAppChooser`
     * shows applications.
     *
     * @return the content type of @self. Free with g_free()
     */
    public fun getContentType(): String =
        gtk_app_chooser_get_content_type(gtkAppChooserPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Reloads the list of applications.
     */
    public fun refresh(): Unit = gtk_app_chooser_refresh(gtkAppChooserPointer.reinterpret())

    private data class Wrapper(
        private val pointer: CPointer<GtkAppChooser>,
    ) : AppChooser {
        override val gtkAppChooserPointer: CPointer<GtkAppChooser> = pointer
    }

    public companion object : TypeCompanion<AppChooser> {
        override val type: GeneratedInterfaceKGType<AppChooser> =
            GeneratedInterfaceKGType(gtk_app_chooser_get_type()) { Wrapper(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GtkAppChooser>): AppChooser = Wrapper(pointer)
    }
}
