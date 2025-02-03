// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gdk.Paintable
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.ext.toCStringList
import org.gtkkn.extensions.glib.ext.toKStringList
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkAboutDialog
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkNative
import org.gtkkn.native.gtk.GtkRoot
import org.gtkkn.native.gtk.GtkShortcutManager
import org.gtkkn.native.gtk.gtk_about_dialog_add_credit_section
import org.gtkkn.native.gtk.gtk_about_dialog_get_artists
import org.gtkkn.native.gtk.gtk_about_dialog_get_authors
import org.gtkkn.native.gtk.gtk_about_dialog_get_comments
import org.gtkkn.native.gtk.gtk_about_dialog_get_copyright
import org.gtkkn.native.gtk.gtk_about_dialog_get_documenters
import org.gtkkn.native.gtk.gtk_about_dialog_get_license
import org.gtkkn.native.gtk.gtk_about_dialog_get_license_type
import org.gtkkn.native.gtk.gtk_about_dialog_get_logo
import org.gtkkn.native.gtk.gtk_about_dialog_get_logo_icon_name
import org.gtkkn.native.gtk.gtk_about_dialog_get_program_name
import org.gtkkn.native.gtk.gtk_about_dialog_get_system_information
import org.gtkkn.native.gtk.gtk_about_dialog_get_translator_credits
import org.gtkkn.native.gtk.gtk_about_dialog_get_type
import org.gtkkn.native.gtk.gtk_about_dialog_get_version
import org.gtkkn.native.gtk.gtk_about_dialog_get_website
import org.gtkkn.native.gtk.gtk_about_dialog_get_website_label
import org.gtkkn.native.gtk.gtk_about_dialog_get_wrap_license
import org.gtkkn.native.gtk.gtk_about_dialog_new
import org.gtkkn.native.gtk.gtk_about_dialog_set_artists
import org.gtkkn.native.gtk.gtk_about_dialog_set_authors
import org.gtkkn.native.gtk.gtk_about_dialog_set_comments
import org.gtkkn.native.gtk.gtk_about_dialog_set_copyright
import org.gtkkn.native.gtk.gtk_about_dialog_set_documenters
import org.gtkkn.native.gtk.gtk_about_dialog_set_license
import org.gtkkn.native.gtk.gtk_about_dialog_set_license_type
import org.gtkkn.native.gtk.gtk_about_dialog_set_logo
import org.gtkkn.native.gtk.gtk_about_dialog_set_logo_icon_name
import org.gtkkn.native.gtk.gtk_about_dialog_set_program_name
import org.gtkkn.native.gtk.gtk_about_dialog_set_system_information
import org.gtkkn.native.gtk.gtk_about_dialog_set_translator_credits
import org.gtkkn.native.gtk.gtk_about_dialog_set_version
import org.gtkkn.native.gtk.gtk_about_dialog_set_website
import org.gtkkn.native.gtk.gtk_about_dialog_set_website_label
import org.gtkkn.native.gtk.gtk_about_dialog_set_wrap_license
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit
import kotlin.collections.List

/**
 * The `GtkAboutDialog` offers a simple way to display information about
 * a program.
 *
 * The shown information includes the programs' logo, name, copyright,
 * website and license. It is also possible to give credits to the authors,
 * documenters, translators and artists who have worked on the program.
 *
 * An about dialog is typically opened when the user selects the `About`
 * option from the `Help` menu. All parts of the dialog are optional.
 *
 * ![An example GtkAboutDialog](aboutdialog.png)
 *
 * About dialogs often contain links and email addresses. `GtkAboutDialog`
 * displays these as clickable links. By default, it calls [method@Gtk.FileLauncher.launch]
 * when a user clicks one. The behaviour can be overridden with the
 * [signal@Gtk.AboutDialog::activate-link] signal.
 *
 * To specify a person with an email address, use a string like
 * `Edgar Allan Poe <edgar@poe.com>`. To specify a website with a title,
 * use a string like `GTK team https://www.gtk.org`.
 *
 * To make constructing a `GtkAboutDialog` as convenient as possible, you can
 * use the function [func@Gtk.show_about_dialog] which constructs and shows
 * a dialog and keeps it around so that it can be shown again.
 *
 * Note that GTK sets a default title of `_("About %s")` on the dialog
 * window (where `%s` is replaced by the name of the application, but in
 * order to ensure proper translation of the title, applications should
 * set the title property explicitly when constructing a `GtkAboutDialog`,
 * as shown in the following example:
 *
 * ```c
 * GFile *logo_file = g_file_new_for_path ("./logo.png");
 * GdkTexture *example_logo = gdk_texture_new_from_file (logo_file, NULL);
 * g_object_unref (logo_file);
 *
 * gtk_show_about_dialog (NULL,
 *                        "program-name", "ExampleCode",
 *                        "logo", example_logo,
 *                        "title", _("About ExampleCode"),
 *                        NULL);
 * ```
 *
 * ## CSS nodes
 *
 * `GtkAboutDialog` has a single CSS node with the name `window` and style
 * class `.aboutdialog`.
 *
 * ## Skipped during bindings generation
 *
 * - method `website-label`: Property TypeInfo of getter and setter do not match
 */
public open class AboutDialog(public val gtkAboutDialogPointer: CPointer<GtkAboutDialog>) :
    Window(gtkAboutDialogPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    override val gtkNativePointer: CPointer<GtkNative>
        get() = handle.reinterpret()

    override val gtkRootPointer: CPointer<GtkRoot>
        get() = handle.reinterpret()

    override val gtkShortcutManagerPointer: CPointer<GtkShortcutManager>
        get() = handle.reinterpret()

    /**
     * The people who contributed artwork to the program, as a `NULL`-terminated
     * array of strings.
     *
     * Each string may contain email addresses and URLs, which will be displayed
     * as links.
     */
    public open var artists: List<String>
        /**
         * Returns the names of the artists which are displayed
         * in the credits page.
         *
         * @return A
         *   `NULL`-terminated string array containing the artists
         */
        get() = gtk_about_dialog_get_artists(gtkAboutDialogPointer)?.toKStringList()
            ?: error("Expected not null string array")

        /**
         * Sets the names of the artists to be displayed
         * in the "Credits" page.
         *
         * @param artists the authors of the artwork
         *   of the application
         */
        set(artists) = memScoped {
            return gtk_about_dialog_set_artists(gtkAboutDialogPointer, artists.toCStringList(this))
        }

    /**
     * The authors of the program, as a `NULL`-terminated array of strings.
     *
     * Each string may contain email addresses and URLs, which will be displayed
     * as links, see the introduction for more details.
     */
    public open var authors: List<String>
        /**
         * Returns the names of the authors which are displayed
         * in the credits page.
         *
         * @return A
         *   `NULL`-terminated string array containing the authors
         */
        get() = gtk_about_dialog_get_authors(gtkAboutDialogPointer)?.toKStringList()
            ?: error("Expected not null string array")

        /**
         * Sets the names of the authors which are displayed
         * in the "Credits" page of the about dialog.
         *
         * @param authors the authors of the application
         */
        set(authors) = memScoped {
            return gtk_about_dialog_set_authors(gtkAboutDialogPointer, authors.toCStringList(this))
        }

    /**
     * Comments about the program.
     *
     * This string is displayed in a label in the main dialog, thus it
     * should be a short explanation of the main purpose of the program,
     * not a detailed list of features.
     */
    public open var comments: String?
        /**
         * Returns the comments string.
         *
         * @return The comments
         */
        get() = gtk_about_dialog_get_comments(gtkAboutDialogPointer)?.toKString()

        /**
         * Sets the comments string to display in the about dialog.
         *
         * This should be a short string of one or two lines.
         *
         * @param comments a comments string
         */
        set(comments) = gtk_about_dialog_set_comments(gtkAboutDialogPointer, comments)

    /**
     * Copyright information for the program.
     */
    public open var copyright: String?
        /**
         * Returns the copyright string.
         *
         * @return The copyright string
         */
        get() = gtk_about_dialog_get_copyright(gtkAboutDialogPointer)?.toKString()

        /**
         * Sets the copyright string to display in the about dialog.
         *
         * This should be a short string of one or two lines.
         *
         * @param copyright the copyright string
         */
        set(copyright) = gtk_about_dialog_set_copyright(gtkAboutDialogPointer, copyright)

    /**
     * The people documenting the program, as a `NULL`-terminated array of strings.
     *
     * Each string may contain email addresses and URLs, which will be displayed
     * as links, see the introduction for more details.
     */
    public open var documenters: List<String>
        /**
         * Returns the name of the documenters which are displayed
         * in the credits page.
         *
         * @return A
         *   `NULL`-terminated string array containing the documenters
         */
        get() = gtk_about_dialog_get_documenters(gtkAboutDialogPointer)?.toKStringList()
            ?: error("Expected not null string array")

        /**
         * Sets the names of the documenters which are displayed
         * in the "Credits" page.
         *
         * @param documenters the authors of the documentation
         *   of the application
         */
        set(documenters) = memScoped {
            return gtk_about_dialog_set_documenters(gtkAboutDialogPointer, documenters.toCStringList(this))
        }

    /**
     * The license of the program, as free-form text.
     *
     * This string is displayed in a text view in a secondary dialog, therefore
     * it is fine to use a long multi-paragraph text. Note that the text is only
     * wrapped in the text view if the "wrap-license" property is set to `TRUE`;
     * otherwise the text itself must contain the intended linebreaks.
     *
     * When setting this property to a non-`NULL` value, the
     * [property@Gtk.AboutDialog:license-type] property is set to
     * `GTK_LICENSE_CUSTOM` as a side effect.
     *
     * The text may contain links in this format `<http://www.some.place/>`
     * and email references in the form `<mail-to@some.body>`, and these will
     * be converted into clickable links.
     */
    public open var license: String?
        /**
         * Returns the license information.
         *
         * @return The license information
         */
        get() = gtk_about_dialog_get_license(gtkAboutDialogPointer)?.toKString()

        /**
         * Sets the license information to be displayed in the
         * about dialog.
         *
         * If `license` is `NULL`, the license page is hidden.
         *
         * @param license the license information
         */
        set(license) = gtk_about_dialog_set_license(gtkAboutDialogPointer, license)

    /**
     * The license of the program.
     *
     * The `GtkAboutDialog` will automatically fill out a standard disclaimer
     * and link the user to the appropriate online resource for the license
     * text.
     *
     * If `GTK_LICENSE_UNKNOWN` is used, the link used will be the same
     * specified in the [property@Gtk.AboutDialog:website] property.
     *
     * If `GTK_LICENSE_CUSTOM` is used, the current contents of the
     * [property@Gtk.AboutDialog:license] property are used.
     *
     * For any other [enum@Gtk.License] value, the contents of the
     * [property@Gtk.AboutDialog:license] property are also set by this property as
     * a side effect.
     */
    public open var licenseType: License
        /**
         * Retrieves the license type.
         *
         * @return a [enum@Gtk.License] value
         */
        get() = gtk_about_dialog_get_license_type(gtkAboutDialogPointer).run {
            License.fromNativeValue(this)
        }

        /**
         * Sets the license of the application showing the about dialog from a
         * list of known licenses.
         *
         * This function overrides the license set using
         * [method@Gtk.AboutDialog.set_license].
         *
         * @param licenseType the type of license
         */
        set(licenseType) = gtk_about_dialog_set_license_type(gtkAboutDialogPointer, licenseType.nativeValue)

    /**
     * A logo for the about box.
     *
     * If it is `NULL`, the default window icon set with
     * [func@Gtk.Window.set_default_icon_name] will be used.
     */
    public open var logo: Paintable?
        /**
         * Returns the paintable displayed as logo in the about dialog.
         *
         * @return the paintable displayed as
         *   logo or `NULL` if the logo is unset or has been set via
         *   [method@Gtk.AboutDialog.set_logo_icon_name]
         */
        get() = gtk_about_dialog_get_logo(gtkAboutDialogPointer)?.run {
            Paintable.PaintableImpl(reinterpret())
        }

        /**
         * Sets the logo in the about dialog.
         *
         * @param logo a `GdkPaintable`
         */
        set(logo) = gtk_about_dialog_set_logo(gtkAboutDialogPointer, logo?.gdkPaintablePointer)

    /**
     * A named icon to use as the logo for the about box.
     *
     * This property overrides the [property@Gtk.AboutDialog:logo] property.
     */
    public open var logoIconName: String?
        /**
         * Returns the icon name displayed as logo in the about dialog.
         *
         * @return the icon name displayed as logo,
         *   or `NULL` if the logo has been set via [method@Gtk.AboutDialog.set_logo]
         */
        get() = gtk_about_dialog_get_logo_icon_name(gtkAboutDialogPointer)?.toKString()

        /**
         * Sets the icon name to be displayed as logo in the about dialog.
         *
         * @param iconName an icon name
         */
        set(iconName) = gtk_about_dialog_set_logo_icon_name(gtkAboutDialogPointer, iconName)

    /**
     * The name of the program.
     *
     * If this is not set, it defaults to the value returned by
     * `g_get_application_name()`.
     */
    public open var programName: String?
        /**
         * Returns the program name displayed in the about dialog.
         *
         * @return The program name
         */
        get() = gtk_about_dialog_get_program_name(gtkAboutDialogPointer)?.toKString()

        /**
         * Sets the name to display in the about dialog.
         *
         * If `name` is not set, the string returned
         * by `g_get_application_name()` is used.
         *
         * @param name the program name
         */
        set(name) = gtk_about_dialog_set_program_name(gtkAboutDialogPointer, name)

    /**
     * Information about the system on which the program is running.
     *
     * This information is displayed in a separate page, therefore it is fine
     * to use a long multi-paragraph text. Note that the text should contain
     * the intended linebreaks.
     *
     * The text may contain links in this format `<http://www.some.place/>`
     * and email references in the form `<mail-to@some.body>`, and these will
     * be converted into clickable links.
     */
    public open var systemInformation: String?
        /**
         * Returns the system information that is shown in the about dialog.
         *
         * @return the system information
         */
        get() = gtk_about_dialog_get_system_information(gtkAboutDialogPointer)?.toKString()

        /**
         * Sets the system information to be displayed in the about
         * dialog.
         *
         * If `system_information` is `NULL`, the system information
         * page is hidden.
         *
         * See [property@Gtk.AboutDialog:system-information].
         *
         * @param systemInformation system information
         */
        set(systemInformation) = gtk_about_dialog_set_system_information(gtkAboutDialogPointer, systemInformation)

    /**
     * Credits to the translators.
     *
     * This string should be marked as translatable.
     *
     * The string may contain email addresses and URLs, which will be displayed
     * as links, see the introduction for more details.
     */
    public open var translatorCredits: String?
        /**
         * Returns the translator credits string which is displayed
         * in the credits page.
         *
         * @return The translator credits string
         */
        get() = gtk_about_dialog_get_translator_credits(gtkAboutDialogPointer)?.toKString()

        /**
         * Sets the translator credits string which is displayed in
         * the credits page.
         *
         * The intended use for this string is to display the translator
         * of the language which is currently used in the user interface.
         * Using `gettext()`, a simple way to achieve that is to mark the
         * string for translation:
         *
         * ```c
         * GtkWidget *about = gtk_about_dialog_new ();
         *  gtk_about_dialog_set_translator_credits (GTK_ABOUT_DIALOG (about),
         *                                           _("translator-credits"));
         * ```
         *
         * It is a good idea to use the customary `msgid` “translator-credits”
         * for this purpose, since translators will already know the purpose of
         * that `msgid`, and since `GtkAboutDialog` will detect if “translator-credits”
         * is untranslated and omit translator credits.
         *
         * @param translatorCredits the translator credits
         */
        set(translatorCredits) = gtk_about_dialog_set_translator_credits(gtkAboutDialogPointer, translatorCredits)

    /**
     * The version of the program.
     */
    public open var version: String?
        /**
         * Returns the version string.
         *
         * @return The version string
         */
        get() = gtk_about_dialog_get_version(gtkAboutDialogPointer)?.toKString()

        /**
         * Sets the version string to display in the about dialog.
         *
         * @param version the version string
         */
        set(version) = gtk_about_dialog_set_version(gtkAboutDialogPointer, version)

    /**
     * The URL for the link to the website of the program.
     *
     * This should be a string starting with `http://` or `https://`.
     */
    public open var website: String?
        /**
         * Returns the website URL.
         *
         * @return The website URL
         */
        get() = gtk_about_dialog_get_website(gtkAboutDialogPointer)?.toKString()

        /**
         * Sets the URL to use for the website link.
         *
         * @param website a URL string starting with `http://`
         */
        set(website) = gtk_about_dialog_set_website(gtkAboutDialogPointer, website)

    /**
     * Whether to wrap the text in the license dialog.
     */
    public open var wrapLicense: Boolean
        /**
         * Returns whether the license text in the about dialog is
         * automatically wrapped.
         *
         * @return `TRUE` if the license text is wrapped
         */
        get() = gtk_about_dialog_get_wrap_license(gtkAboutDialogPointer).asBoolean()

        /**
         * Sets whether the license text in the about dialog should be
         * automatically wrapped.
         *
         * @param wrapLicense whether to wrap the license
         */
        set(wrapLicense) = gtk_about_dialog_set_wrap_license(gtkAboutDialogPointer, wrapLicense.asGBoolean())

    /**
     * Creates a new `GtkAboutDialog`.
     *
     * @return a newly created `GtkAboutDialog`
     */
    public constructor() : this(gtk_about_dialog_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * Creates a new section in the "Credits" page.
     *
     * @param sectionName The name of the section
     * @param people The people who belong to that section
     */
    public open fun addCreditSection(sectionName: String, people: List<String>): Unit = memScoped {
        return gtk_about_dialog_add_credit_section(gtkAboutDialogPointer, sectionName, people.toCStringList(this))
    }

    /**
     * Returns the label used for the website link.
     *
     * @return The label used for the website link
     */
    public open fun getWebsiteLabel(): String? = gtk_about_dialog_get_website_label(gtkAboutDialogPointer)?.toKString()

    /**
     * Sets the label to be used for the website link.
     *
     * @param websiteLabel the label used for the website link
     */
    public open fun setWebsiteLabel(websiteLabel: String): Unit =
        gtk_about_dialog_set_website_label(gtkAboutDialogPointer, websiteLabel)

    /**
     * Emitted every time a URL is activated.
     *
     * Applications may connect to it to override the default behaviour,
     * which is to call [method@Gtk.FileLauncher.launch].
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `uri` the URI that is activated. Returns `TRUE` if the link has been activated
     */
    public fun onActivateLink(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (uri: String) -> Boolean): ULong =
        g_signal_connect_data(
            gtkAboutDialogPointer,
            "activate-link",
            onActivateLinkFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<AboutDialog> {
        override val type: GeneratedClassKGType<AboutDialog> =
            GeneratedClassKGType(getTypeOrNull()!!) { AboutDialog(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of AboutDialog
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_about_dialog_get_type()

        /**
         * Gets the GType of from the symbol `gtk_about_dialog_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_about_dialog_get_type")
    }
}

private val onActivateLinkFunc: CPointer<CFunction<(CPointer<ByteVar>) -> gboolean>> =
    staticCFunction {
            _: COpaquePointer,
            uri: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<
            (
                uri: String,
            ) -> Boolean
            >().get().invoke(uri?.toKString() ?: error("Expected not null string")).asGBoolean()
    }
        .reinterpret()
