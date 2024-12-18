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
import org.gtkkn.bindings.gio.AppInfo
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GAppInfo
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkAppChooser
import org.gtkkn.native.gtk.GtkAppChooserWidget
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.gtk_app_chooser_widget_get_default_text
import org.gtkkn.native.gtk.gtk_app_chooser_widget_get_show_all
import org.gtkkn.native.gtk.gtk_app_chooser_widget_get_show_default
import org.gtkkn.native.gtk.gtk_app_chooser_widget_get_show_fallback
import org.gtkkn.native.gtk.gtk_app_chooser_widget_get_show_other
import org.gtkkn.native.gtk.gtk_app_chooser_widget_get_show_recommended
import org.gtkkn.native.gtk.gtk_app_chooser_widget_get_type
import org.gtkkn.native.gtk.gtk_app_chooser_widget_new
import org.gtkkn.native.gtk.gtk_app_chooser_widget_set_default_text
import org.gtkkn.native.gtk.gtk_app_chooser_widget_set_show_all
import org.gtkkn.native.gtk.gtk_app_chooser_widget_set_show_default
import org.gtkkn.native.gtk.gtk_app_chooser_widget_set_show_fallback
import org.gtkkn.native.gtk.gtk_app_chooser_widget_set_show_other
import org.gtkkn.native.gtk.gtk_app_chooser_widget_set_show_recommended
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkAppChooserWidget` is a widget for selecting applications.
 *
 * It is the main building block for [class@Gtk.AppChooserDialog].
 * Most applications only need to use the latter; but you can use
 * this widget as part of a larger widget if you have special needs.
 *
 * `GtkAppChooserWidget` offers detailed control over what applications
 * are shown, using the
 * [property@Gtk.AppChooserWidget:show-default],
 * [property@Gtk.AppChooserWidget:show-recommended],
 * [property@Gtk.AppChooserWidget:show-fallback],
 * [property@Gtk.AppChooserWidget:show-other] and
 * [property@Gtk.AppChooserWidget:show-all] properties. See the
 * [iface@Gtk.AppChooser] documentation for more information about these
 * groups of applications.
 *
 * To keep track of the selected application, use the
 * [signal@Gtk.AppChooserWidget::application-selected] and
 * [signal@Gtk.AppChooserWidget::application-activated] signals.
 *
 * ## CSS nodes
 *
 * `GtkAppChooserWidget` has a single CSS node with name appchooser.
 *
 * ## Skipped during bindings generation
 *
 * - method `default-text`: Property TypeInfo of getter and setter do not match
 */
public open class AppChooserWidget(pointer: CPointer<GtkAppChooserWidget>) :
    Widget(pointer.reinterpret()),
    AppChooser,
    KGTyped {
    public val gtkAppChooserWidgetPointer: CPointer<GtkAppChooserWidget>
        get() = gPointer.reinterpret()

    override val gtkAppChooserPointer: CPointer<GtkAppChooser>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * If true, the app chooser presents all applications
     * in a single list, without subsections for default,
     * recommended or related applications.
     */
    public open var showAll: Boolean
        /**
         * Gets whether the app chooser should show all applications
         * in a flat list.
         *
         * @return the value of [property@Gtk.AppChooserWidget:show-all]
         */
        get() = gtk_app_chooser_widget_get_show_all(gtkAppChooserWidgetPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the app chooser should show all applications
         * in a flat list.
         *
         * @param setting the new value for [property@Gtk.AppChooserWidget:show-all]
         */
        set(
            setting
        ) = gtk_app_chooser_widget_set_show_all(gtkAppChooserWidgetPointer.reinterpret(), setting.asGBoolean())

    /**
     * Determines whether the app chooser should show the default
     * handler for the content type in a separate section.
     *
     * If false, the default handler is listed among the recommended
     * applications.
     */
    public open var showDefault: Boolean
        /**
         * Gets whether the app chooser should show the default handler
         * for the content type in a separate section.
         *
         * @return the value of [property@Gtk.AppChooserWidget:show-default]
         */
        get() = gtk_app_chooser_widget_get_show_default(gtkAppChooserWidgetPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the app chooser should show the default handler
         * for the content type in a separate section.
         *
         * @param setting the new value for [property@Gtk.AppChooserWidget:show-default]
         */
        set(
            setting
        ) = gtk_app_chooser_widget_set_show_default(gtkAppChooserWidgetPointer.reinterpret(), setting.asGBoolean())

    /**
     * Determines whether the app chooser should show a section
     * for fallback applications.
     *
     * If false, the fallback applications are listed among the
     * other applications.
     */
    public open var showFallback: Boolean
        /**
         * Gets whether the app chooser should show related applications
         * for the content type in a separate section.
         *
         * @return the value of [property@Gtk.AppChooserWidget:show-fallback]
         */
        get() = gtk_app_chooser_widget_get_show_fallback(gtkAppChooserWidgetPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the app chooser should show related applications
         * for the content type in a separate section.
         *
         * @param setting the new value for [property@Gtk.AppChooserWidget:show-fallback]
         */
        set(
            setting
        ) = gtk_app_chooser_widget_set_show_fallback(gtkAppChooserWidgetPointer.reinterpret(), setting.asGBoolean())

    /**
     * Determines whether the app chooser should show a section
     * for other applications.
     */
    public open var showOther: Boolean
        /**
         * Gets whether the app chooser should show applications
         * which are unrelated to the content type.
         *
         * @return the value of [property@Gtk.AppChooserWidget:show-other]
         */
        get() = gtk_app_chooser_widget_get_show_other(gtkAppChooserWidgetPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the app chooser should show applications
         * which are unrelated to the content type.
         *
         * @param setting the new value for [property@Gtk.AppChooserWidget:show-other]
         */
        set(
            setting
        ) = gtk_app_chooser_widget_set_show_other(gtkAppChooserWidgetPointer.reinterpret(), setting.asGBoolean())

    /**
     * Determines whether the app chooser should show a section
     * for recommended applications.
     *
     * If false, the recommended applications are listed
     * among the other applications.
     */
    public open var showRecommended: Boolean
        /**
         * Gets whether the app chooser should show recommended applications
         * for the content type in a separate section.
         *
         * @return the value of [property@Gtk.AppChooserWidget:show-recommended]
         */
        get() = gtk_app_chooser_widget_get_show_recommended(gtkAppChooserWidgetPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the app chooser should show recommended applications
         * for the content type in a separate section.
         *
         * @param setting the new value for [property@Gtk.AppChooserWidget:show-recommended]
         */
        set(
            setting
        ) = gtk_app_chooser_widget_set_show_recommended(gtkAppChooserWidgetPointer.reinterpret(), setting.asGBoolean())

    /**
     * Creates a new `GtkAppChooserWidget` for applications
     * that can handle content of the given type.
     *
     * @param contentType the content type to show applications for
     * @return a newly created `GtkAppChooserWidget`
     */
    public constructor(contentType: String) : this(gtk_app_chooser_widget_new(contentType)!!.reinterpret())

    /**
     * Returns the text that is shown if there are not applications
     * that can handle the content type.
     *
     * @return the value of [property@Gtk.AppChooserWidget:default-text]
     */
    public open fun getDefaultText(): String? =
        gtk_app_chooser_widget_get_default_text(gtkAppChooserWidgetPointer.reinterpret())?.toKString()

    /**
     * Sets the text that is shown if there are not applications
     * that can handle the content type.
     *
     * @param text the new value for [property@Gtk.AppChooserWidget:default-text]
     */
    public open fun setDefaultText(text: String): Unit =
        gtk_app_chooser_widget_set_default_text(gtkAppChooserWidgetPointer.reinterpret(), text)

    /**
     * Emitted when an application item is activated from the widget's list.
     *
     * This usually happens when the user double clicks an item, or an item
     * is selected and the user presses one of the keys Space, Shift+Space,
     * Return or Enter.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `application` the activated `GAppInfo`
     */
    public fun connectApplicationActivated(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (application: AppInfo) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "application-activated",
        connectApplicationActivatedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted when an application item is selected from the widget's list.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `application` the selected `GAppInfo`
     */
    public fun connectApplicationSelected(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (application: AppInfo) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "application-selected",
        connectApplicationSelectedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    public companion object : TypeCompanion<AppChooserWidget> {
        override val type: GeneratedClassKGType<AppChooserWidget> =
            GeneratedClassKGType(gtk_app_chooser_widget_get_type()) { AppChooserWidget(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of AppChooserWidget
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_app_chooser_widget_get_type()
    }
}

private val connectApplicationActivatedFunc: CPointer<CFunction<(CPointer<GAppInfo>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            application: CPointer<GAppInfo>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(application: AppInfo) -> Unit>().get().invoke(
            application!!.run {
                AppInfo.wrap(reinterpret())
            }
        )
    }
        .reinterpret()

private val connectApplicationSelectedFunc: CPointer<CFunction<(CPointer<GAppInfo>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            application: CPointer<GAppInfo>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(application: AppInfo) -> Unit>().get().invoke(
            application!!.run {
                AppInfo.wrap(reinterpret())
            }
        )
    }
        .reinterpret()
