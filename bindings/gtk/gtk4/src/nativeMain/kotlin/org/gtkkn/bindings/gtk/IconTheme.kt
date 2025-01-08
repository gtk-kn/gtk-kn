// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gdk.Display
import org.gtkkn.bindings.gio.Icon
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_2
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.toCStringList
import org.gtkkn.extensions.glib.ext.toKStringList
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkIconTheme
import org.gtkkn.native.gtk.gtk_icon_theme_add_resource_path
import org.gtkkn.native.gtk.gtk_icon_theme_add_search_path
import org.gtkkn.native.gtk.gtk_icon_theme_get_display
import org.gtkkn.native.gtk.gtk_icon_theme_get_for_display
import org.gtkkn.native.gtk.gtk_icon_theme_get_icon_names
import org.gtkkn.native.gtk.gtk_icon_theme_get_resource_path
import org.gtkkn.native.gtk.gtk_icon_theme_get_search_path
import org.gtkkn.native.gtk.gtk_icon_theme_get_theme_name
import org.gtkkn.native.gtk.gtk_icon_theme_get_type
import org.gtkkn.native.gtk.gtk_icon_theme_has_gicon
import org.gtkkn.native.gtk.gtk_icon_theme_has_icon
import org.gtkkn.native.gtk.gtk_icon_theme_lookup_by_gicon
import org.gtkkn.native.gtk.gtk_icon_theme_lookup_icon
import org.gtkkn.native.gtk.gtk_icon_theme_new
import org.gtkkn.native.gtk.gtk_icon_theme_set_resource_path
import org.gtkkn.native.gtk.gtk_icon_theme_set_search_path
import org.gtkkn.native.gtk.gtk_icon_theme_set_theme_name
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit
import kotlin.collections.List

/**
 * `GtkIconTheme` provides a facility for loading themed icons.
 *
 * The main reason for using a name rather than simply providing a filename
 * is to allow different icons to be used depending on what “icon theme” is
 * selected by the user. The operation of icon themes on Linux and Unix
 * follows the [Icon Theme Specification](http://www.freedesktop.org/Standards/icon-theme-spec)
 * There is a fallback icon theme, named `hicolor`, where applications
 * should install their icons, but additional icon themes can be installed
 * as operating system vendors and users choose.
 *
 * In many cases, named themes are used indirectly, via [class@Gtk.Image]
 * rather than directly, but looking up icons directly is also simple. The
 * `GtkIconTheme` object acts as a database of all the icons in the current
 * theme. You can create new `GtkIconTheme` objects, but it’s much more
 * efficient to use the standard icon theme of the `GtkWidget` so that the
 * icon information is shared with other people looking up icons.
 *
 * ```c
 * GtkIconTheme *icon_theme;
 * GtkIconPaintable *icon;
 * GdkPaintable *paintable;
 *
 * icon_theme = gtk_icon_theme_get_for_display (gtk_widget_get_display (my_widget));
 * icon = gtk_icon_theme_lookup_icon (icon_theme,
 *                                    "my-icon-name", // icon name
 *                                    48, // icon size
 *                                    1,  // scale
 *                                    0,  // flags);
 * paintable = GDK_PAINTABLE (icon);
 * // Use the paintable
 * g_object_unref (icon);
 * ```
 *
 * ## Skipped during bindings generation
 *
 * - method `get_icon_sizes`: Array parameter of type gint is not supported
 * - method `theme-name`: Property TypeInfo of getter and setter do not match
 */
public open class IconTheme(pointer: CPointer<GtkIconTheme>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val gtkIconThemePointer: CPointer<GtkIconTheme>
        get() = gPointer.reinterpret()

    /**
     * The display that this icon theme object is attached to.
     */
    public open val display: Display?
        /**
         * Returns the display that the `GtkIconTheme` object was
         * created for.
         *
         * @return the display of @icon_theme
         */
        get() = gtk_icon_theme_get_display(gtkIconThemePointer)?.run {
            Display(this)
        }

    /**
     * The icon names that are supported by the icon theme.
     */
    public open val iconNames: List<String>
        /**
         * Lists the names of icons in the current icon theme.
         *
         * @return a string array
         *   holding the names of all the icons in the theme. You must
         *   free the array using g_strfreev().
         */
        get() = gtk_icon_theme_get_icon_names(gtkIconThemePointer)?.toKStringList()
            ?: error("Expected not null string array")

    /**
     * Resource paths that will be looked at when looking for icons,
     * similar to search paths.
     *
     * The resources are considered as part of the hicolor icon theme
     * and must be located in subdirectories that are defined in the
     * hicolor icon theme, such as `@path/16x16/actions/run.png`.
     * Icons that are directly placed in the resource path instead
     * of a subdirectory are also considered as ultimate fallback.
     */
    public open var resourcePath: List<String>?
        /**
         * Gets the current resource path.
         *
         * See [method@Gtk.IconTheme.set_resource_path].
         *
         * @return A list of resource paths
         */
        get() = gtk_icon_theme_get_resource_path(gtkIconThemePointer)?.toKStringList()

        /**
         * Sets the resource paths that will be looked at when
         * looking for icons, similar to search paths.
         *
         * The resources are considered as part of the hicolor icon theme
         * and must be located in subdirectories that are defined in the
         * hicolor icon theme, such as `@path/16x16/actions/run.png`
         * or `@path/scalable/actions/run.svg`.
         *
         * Icons that are directly placed in the resource path instead
         * of a subdirectory are also considered as ultimate fallback,
         * but they are treated like unthemed icons.
         *
         * @param path NULL-terminated array of resource paths
         *   that are searched for icons
         */
        set(path) = memScoped {
            return gtk_icon_theme_set_resource_path(gtkIconThemePointer, path?.toCStringList(this))
        }

    /**
     * The search path for this icon theme.
     *
     * When looking for icons, GTK will search for a subdirectory of
     * one or more of the directories in the search path with the same
     * name as the icon theme containing an index.theme file. (Themes
     * from multiple of the path elements are combined to allow themes
     * to be extended by adding icons in the user’s home directory.)
     */
    public open var searchPath: List<String>?
        /**
         * Gets the current search path.
         *
         * See [method@Gtk.IconTheme.set_search_path].
         *
         * @return a list of icon theme path directories
         */
        get() = gtk_icon_theme_get_search_path(gtkIconThemePointer)?.toKStringList()

        /**
         * Sets the search path for the icon theme object.
         *
         * When looking for an icon theme, GTK will search for a subdirectory
         * of one or more of the directories in @path with the same name
         * as the icon theme containing an index.theme file. (Themes from
         * multiple of the path elements are combined to allow themes to be
         * extended by adding icons in the user’s home directory.)
         *
         * In addition if an icon found isn’t found either in the current
         * icon theme or the default icon theme, and an image file with
         * the right name is found directly in one of the elements of
         * @path, then that image will be used for the icon name.
         * (This is legacy feature, and new icons should be put
         * into the fallback icon theme, which is called hicolor,
         * rather than directly on the icon path.)
         *
         * @param path NULL-terminated
         *   array of directories that are searched for icon themes
         */
        set(path) = memScoped {
            return gtk_icon_theme_set_search_path(gtkIconThemePointer, path?.toCStringList(this))
        }

    /**
     * Creates a new icon theme object.
     *
     * Icon theme objects are used to lookup up an icon by name
     * in a particular icon theme. Usually, you’ll want to use
     * [func@Gtk.IconTheme.get_for_display] rather than creating
     * a new icon theme object for scratch.
     *
     * @return the newly created `GtkIconTheme` object.
     */
    public constructor() : this(gtk_icon_theme_new()!!.reinterpret())

    /**
     * Adds a resource path that will be looked at when looking
     * for icons, similar to search paths.
     *
     * See [method@Gtk.IconTheme.set_resource_path].
     *
     * This function should be used to make application-specific icons
     * available as part of the icon theme.
     *
     * @param path a resource path
     */
    public open fun addResourcePath(path: String): Unit = gtk_icon_theme_add_resource_path(gtkIconThemePointer, path)

    /**
     * Appends a directory to the search path.
     *
     * See [method@Gtk.IconTheme.set_search_path].
     *
     * @param path directory name to append to the icon path
     */
    public open fun addSearchPath(path: String): Unit = gtk_icon_theme_add_search_path(gtkIconThemePointer, path)

    /**
     * Gets the current icon theme name.
     *
     * Returns (transfer full): the current icon theme name,
     */
    public open fun getThemeName(): String =
        gtk_icon_theme_get_theme_name(gtkIconThemePointer)?.toKString() ?: error("Expected not null string")

    /**
     * Checks whether an icon theme includes an icon
     * for a particular `GIcon`.
     *
     * @param gicon a `GIcon`
     * @return true if @self includes an icon for @gicon
     * @since 4.2
     */
    @GtkVersion4_2
    public open fun hasGicon(gicon: Icon): Boolean =
        gtk_icon_theme_has_gicon(gtkIconThemePointer, gicon.gioIconPointer).asBoolean()

    /**
     * Checks whether an icon theme includes an icon
     * for a particular name.
     *
     * @param iconName the name of an icon
     * @return true if @self includes an
     *  icon for @icon_name.
     */
    public open fun hasIcon(iconName: String): Boolean =
        gtk_icon_theme_has_icon(gtkIconThemePointer, iconName).asBoolean()

    /**
     * Looks up a icon for a desired size and window scale.
     *
     * The icon can then be rendered by using it as a `GdkPaintable`,
     * or you can get information such as the filename and size.
     *
     * @param icon the `GIcon` to look up
     * @param size desired icon size
     * @param scale the desired scale
     * @param direction text direction the icon will be displayed in
     * @param flags flags modifying the behavior of the icon lookup
     * @return a `GtkIconPaintable` containing
     *   information about the icon. Unref with g_object_unref()
     */
    public open fun lookupByGicon(
        icon: Icon,
        size: gint,
        scale: gint,
        direction: TextDirection,
        flags: IconLookupFlags,
    ): IconPaintable = gtk_icon_theme_lookup_by_gicon(
        gtkIconThemePointer,
        icon.gioIconPointer,
        size,
        scale,
        direction.nativeValue,
        flags.mask
    )!!.run {
        IconPaintable(this)
    }

    /**
     * Looks up a named icon for a desired size and window scale,
     * returning a `GtkIconPaintable`.
     *
     * The icon can then be rendered by using it as a `GdkPaintable`,
     * or you can get information such as the filename and size.
     *
     * If the available @icon_name is not available and @fallbacks are
     * provided, they will be tried in order.
     *
     * If no matching icon is found, then a paintable that renders the
     * "missing icon" icon is returned. If you need to do something else
     * for missing icons you need to use [method@Gtk.IconTheme.has_icon].
     *
     * Note that you probably want to listen for icon theme changes and
     * update the icon. This is usually done by overriding the
     * GtkWidgetClass.css-changed() function.
     *
     * @param iconName the name of the icon to lookup
     * @param fallbacks
     * @param size desired icon size.
     * @param scale the window scale this will be displayed on
     * @param direction text direction the icon will be displayed in
     * @param flags flags modifying the behavior of the icon lookup
     * @return a `GtkIconPaintable` object
     *   containing the icon.
     */
    public open fun lookupIcon(
        iconName: String,
        fallbacks: List<String>? = null,
        size: gint,
        scale: gint,
        direction: TextDirection,
        flags: IconLookupFlags,
    ): IconPaintable = memScoped {
        return gtk_icon_theme_lookup_icon(
            gtkIconThemePointer,
            iconName,
            fallbacks?.toCStringList(this),
            size,
            scale,
            direction.nativeValue,
            flags.mask
        )!!.run {
            IconPaintable(this)
        }
    }

    /**
     * Sets the name of the icon theme that the `GtkIconTheme` object uses
     * overriding system configuration.
     *
     * This function cannot be called on the icon theme objects returned
     * from [func@Gtk.IconTheme.get_for_display].
     *
     * @param themeName name of icon theme to use instead of
     *   configured theme, or null to unset a previously set custom theme
     */
    public open fun setThemeName(themeName: String? = null): Unit =
        gtk_icon_theme_set_theme_name(gtkIconThemePointer, themeName)

    /**
     * Emitted when the icon theme changes.
     *
     * This can happen because current icon theme is switched or
     * because GTK detects that a change has occurred in the
     * contents of the current icon theme.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onChanged(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer,
            "changed",
            onChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "changed" signal. See [onChanged].
     */
    public fun emitChanged() {
        g_signal_emit_by_name(gPointer.reinterpret(), "changed")
    }

    public companion object : TypeCompanion<IconTheme> {
        override val type: GeneratedClassKGType<IconTheme> =
            GeneratedClassKGType(gtk_icon_theme_get_type()) { IconTheme(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Gets the icon theme object associated with @display.
         *
         * If this function has not previously been called for the given
         * display, a new icon theme object will be created and associated
         * with the display. Icon theme objects are fairly expensive to create,
         * so using this function is usually a better choice than calling
         * [ctor@Gtk.IconTheme.new] and setting the display yourself; by using
         * this function a single icon theme object will be shared between users.
         *
         * @param display a `GdkDisplay`
         * @return A unique `GtkIconTheme` associated with
         *   the given display. This icon theme is associated with the display
         *   and can be used as long as the display is open. Do not ref or unref it.
         */
        public fun getForDisplay(display: Display): IconTheme =
            gtk_icon_theme_get_for_display(display.gdkDisplayPointer)!!.run {
                IconTheme(this)
            }

        /**
         * Get the GType of IconTheme
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_icon_theme_get_type()
    }
}

private val onChangedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
