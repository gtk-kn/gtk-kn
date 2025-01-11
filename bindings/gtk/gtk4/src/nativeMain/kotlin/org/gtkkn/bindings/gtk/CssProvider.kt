// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.File
import org.gtkkn.bindings.glib.Bytes
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_12
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkCssProvider
import org.gtkkn.native.gtk.GtkCssSection
import org.gtkkn.native.gtk.GtkStyleProvider
import org.gtkkn.native.gtk.gtk_css_provider_get_type
import org.gtkkn.native.gtk.gtk_css_provider_load_from_bytes
import org.gtkkn.native.gtk.gtk_css_provider_load_from_data
import org.gtkkn.native.gtk.gtk_css_provider_load_from_file
import org.gtkkn.native.gtk.gtk_css_provider_load_from_path
import org.gtkkn.native.gtk.gtk_css_provider_load_from_resource
import org.gtkkn.native.gtk.gtk_css_provider_load_from_string
import org.gtkkn.native.gtk.gtk_css_provider_load_named
import org.gtkkn.native.gtk.gtk_css_provider_new
import org.gtkkn.native.gtk.gtk_css_provider_to_string
import kotlin.Long
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkCssProvider` is an object implementing the `GtkStyleProvider` interface
 * for CSS.
 *
 * It is able to parse CSS-like input in order to style widgets.
 *
 * An application can make GTK parse a specific CSS style sheet by calling
 * [method@Gtk.CssProvider.load_from_file] or
 * [method@Gtk.CssProvider.load_from_resource]
 * and adding the provider with [method@Gtk.StyleContext.add_provider] or
 * [func@Gtk.StyleContext.add_provider_for_display].
 *
 * In addition, certain files will be read when GTK is initialized.
 * First, the file `$XDG_CONFIG_HOME/gtk-4.0/gtk.css` is loaded if it
 * exists. Then, GTK loads the first existing file among
 * `XDG_DATA_HOME/themes/THEME/gtk-VERSION/gtk-VARIANT.css`,
 * `$HOME/.themes/THEME/gtk-VERSION/gtk-VARIANT.css`,
 * `$XDG_DATA_DIRS/themes/THEME/gtk-VERSION/gtk-VARIANT.css` and
 * `DATADIR/share/themes/THEME/gtk-VERSION/gtk-VARIANT.css`,
 * where `THEME` is the name of the current theme (see the
 * [property@Gtk.Settings:gtk-theme-name] setting), `VARIANT` is the
 * variant to load (see the
 * [property@Gtk.Settings:gtk-application-prefer-dark-theme] setting),
 * `DATADIR` is the prefix configured when GTK was compiled (unless
 * overridden by the `GTK_DATA_PREFIX` environment variable), and
 * `VERSION` is the GTK version number. If no file is found for the
 * current version, GTK tries older versions all the way back to 4.0.
 *
 * To track errors while loading CSS, connect to the
 * [signal@Gtk.CssProvider::parsing-error] signal.
 */
public open class CssProvider(public val gtkCssProviderPointer: CPointer<GtkCssProvider>) :
    Object(gtkCssProviderPointer.reinterpret()),
    StyleProvider,
    KGTyped {
    override val gtkStyleProviderPointer: CPointer<GtkStyleProvider>
        get() = handle.reinterpret()

    /**
     * Returns a newly created `GtkCssProvider`.
     *
     * @return A new `GtkCssProvider`
     */
    public constructor() : this(gtk_css_provider_new()!!.reinterpret())

    /**
     * Loads @data into @css_provider.
     *
     * This clears any previously loaded information.
     *
     * @param data `GBytes` containing the data to load
     * @since 4.12
     */
    @GtkVersion4_12
    public open fun loadFromBytes(`data`: Bytes): Unit =
        gtk_css_provider_load_from_bytes(gtkCssProviderPointer, `data`.glibBytesPointer)

    /**
     * Loads @data into @css_provider.
     *
     * This clears any previously loaded information.
     *
     * @param data CSS data to be parsed
     * @param length the length of @data in bytes, or -1 for NUL terminated strings
     */
    public open fun loadFromData(`data`: String, length: Long): Unit =
        gtk_css_provider_load_from_data(gtkCssProviderPointer, `data`, length)

    /**
     * Loads the data contained in @file into @css_provider.
     *
     * This clears any previously loaded information.
     *
     * @param file `GFile` pointing to a file to load
     */
    public open fun loadFromFile(`file`: File): Unit =
        gtk_css_provider_load_from_file(gtkCssProviderPointer, `file`.gioFilePointer)

    /**
     * Loads the data contained in @path into @css_provider.
     *
     * This clears any previously loaded information.
     *
     * @param path the path of a filename to load, in the GLib filename encoding
     */
    public open fun loadFromPath(path: String): Unit = gtk_css_provider_load_from_path(gtkCssProviderPointer, path)

    /**
     * Loads the data contained in the resource at @resource_path into
     * the @css_provider.
     *
     * This clears any previously loaded information.
     *
     * @param resourcePath a `GResource` resource path
     */
    public open fun loadFromResource(resourcePath: String): Unit =
        gtk_css_provider_load_from_resource(gtkCssProviderPointer, resourcePath)

    /**
     * Loads @string into @css_provider.
     *
     * This clears any previously loaded information.
     *
     * @param string the CSS to load
     * @since 4.12
     */
    @GtkVersion4_12
    public open fun loadFromString(string: String): Unit =
        gtk_css_provider_load_from_string(gtkCssProviderPointer, string)

    /**
     * Loads a theme from the usual theme paths.
     *
     * The actual process of finding the theme might change between
     * releases, but it is guaranteed that this function uses the same
     * mechanism to load the theme that GTK uses for loading its own theme.
     *
     * @param name A theme name
     * @param variant variant to load, for example, "dark", or
     *   null for the default
     */
    public open fun loadNamed(name: String, variant: String? = null): Unit =
        gtk_css_provider_load_named(gtkCssProviderPointer, name, variant)

    /**
     * Converts the @provider into a string representation in CSS
     * format.
     *
     * Using [method@Gtk.CssProvider.load_from_string] with the return
     * value from this function on a new provider created with
     * [ctor@Gtk.CssProvider.new] will basically create a duplicate
     * of this @provider.
     *
     * @return a new string representing the @provider.
     */
    override fun toString(): String =
        gtk_css_provider_to_string(gtkCssProviderPointer)?.toKString() ?: error("Expected not null string")

    /**
     * Signals that a parsing error occurred.
     *
     * The @path, @line and @position describe the actual location of
     * the error as accurately as possible.
     *
     * Parsing errors are never fatal, so the parsing will resume after
     * the error. Errors may however cause parts of the given data or
     * even all of it to not be parsed at all. So it is a useful idea
     * to check that the parsing succeeds by connecting to this signal.
     *
     * Note that this signal may be emitted at any time as the css provider
     * may opt to defer parsing parts or all of the input to a later time
     * than when a loading function was called.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `section` section the error happened in; `error` The parsing error
     */
    public fun onParsingError(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (section: CssSection, error: Error) -> Unit,
    ): ULong = g_signal_connect_data(
        gtkCssProviderPointer,
        "parsing-error",
        onParsingErrorFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "parsing-error" signal. See [onParsingError].
     *
     * @param section section the error happened in
     * @param error The parsing error
     */
    public fun emitParsingError(section: CssSection, error: Error) {
        g_signal_emit_by_name(
            gtkCssProviderPointer.reinterpret(),
            "parsing-error",
            section.gtkCssSectionPointer,
            error.glibErrorPointer
        )
    }

    public companion object : TypeCompanion<CssProvider> {
        override val type: GeneratedClassKGType<CssProvider> =
            GeneratedClassKGType(gtk_css_provider_get_type()) { CssProvider(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of CssProvider
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_css_provider_get_type()
    }
}

private val onParsingErrorFunc:
    CPointer<CFunction<(CPointer<GtkCssSection>, CPointer<GError>) -> Unit>> = staticCFunction {
            _: COpaquePointer,
            section: CPointer<GtkCssSection>?,
            error: CPointer<GError>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(section: CssSection, error: Error) -> Unit>().get().invoke(
            section!!.run {
                CssSection(this)
            },
            error!!.run {
                Error(this)
            }
        )
    }
        .reinterpret()
