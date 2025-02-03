// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
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
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gio.GAppInfo
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
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
 * # ⚠️ Deprecated ⚠️
 *
 * This is deprecated since version 4.10.
 *
 * The application selection widgets should be
 *   implemented according to the design of each platform and/or
 *   application requiring them.
 * ---
 *
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
public open class AppChooserWidget(public val gtkAppChooserWidgetPointer: CPointer<GtkAppChooserWidget>) :
    Widget(gtkAppChooserWidgetPointer.reinterpret()),
    AppChooser,
    KGTyped {
    init {
        Gtk
    }

    override val gtkAppChooserPointer: CPointer<GtkAppChooser>
        get() = handle.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * If true, the app chooser presents all applications
     * in a single list, without subsections for default,
     * recommended or related applications.
     */
    public open var showAll: Boolean
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         *
         * This widget will be removed in GTK 5
         * ---
         *
         * Gets whether the app chooser should show all applications
         * in a flat list.
         *
         * @return the value of [property@Gtk.AppChooserWidget:show-all]
         */
        get() = gtk_app_chooser_widget_get_show_all(gtkAppChooserWidgetPointer).asBoolean()

        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         *
         * This widget will be removed in GTK 5
         * ---
         *
         * Sets whether the app chooser should show all applications
         * in a flat list.
         *
         * @param setting the new value for [property@Gtk.AppChooserWidget:show-all]
         */
        set(setting) = gtk_app_chooser_widget_set_show_all(gtkAppChooserWidgetPointer, setting.asGBoolean())

    /**
     * Determines whether the app chooser should show the default
     * handler for the content type in a separate section.
     *
     * If false, the default handler is listed among the recommended
     * applications.
     */
    public open var showDefault: Boolean
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         *
         * This widget will be removed in GTK 5
         * ---
         *
         * Gets whether the app chooser should show the default handler
         * for the content type in a separate section.
         *
         * @return the value of [property@Gtk.AppChooserWidget:show-default]
         */
        get() = gtk_app_chooser_widget_get_show_default(gtkAppChooserWidgetPointer).asBoolean()

        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         *
         * This widget will be removed in GTK 5
         * ---
         *
         * Sets whether the app chooser should show the default handler
         * for the content type in a separate section.
         *
         * @param setting the new value for [property@Gtk.AppChooserWidget:show-default]
         */
        set(setting) = gtk_app_chooser_widget_set_show_default(gtkAppChooserWidgetPointer, setting.asGBoolean())

    /**
     * Determines whether the app chooser should show a section
     * for fallback applications.
     *
     * If false, the fallback applications are listed among the
     * other applications.
     */
    public open var showFallback: Boolean
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         *
         * This widget will be removed in GTK 5
         * ---
         *
         * Gets whether the app chooser should show related applications
         * for the content type in a separate section.
         *
         * @return the value of [property@Gtk.AppChooserWidget:show-fallback]
         */
        get() = gtk_app_chooser_widget_get_show_fallback(gtkAppChooserWidgetPointer).asBoolean()

        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         *
         * This widget will be removed in GTK 5
         * ---
         *
         * Sets whether the app chooser should show related applications
         * for the content type in a separate section.
         *
         * @param setting the new value for [property@Gtk.AppChooserWidget:show-fallback]
         */
        set(setting) = gtk_app_chooser_widget_set_show_fallback(gtkAppChooserWidgetPointer, setting.asGBoolean())

    /**
     * Determines whether the app chooser should show a section
     * for other applications.
     */
    public open var showOther: Boolean
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         *
         * This widget will be removed in GTK 5
         * ---
         *
         * Gets whether the app chooser should show applications
         * which are unrelated to the content type.
         *
         * @return the value of [property@Gtk.AppChooserWidget:show-other]
         */
        get() = gtk_app_chooser_widget_get_show_other(gtkAppChooserWidgetPointer).asBoolean()

        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         *
         * This widget will be removed in GTK 5
         * ---
         *
         * Sets whether the app chooser should show applications
         * which are unrelated to the content type.
         *
         * @param setting the new value for [property@Gtk.AppChooserWidget:show-other]
         */
        set(setting) = gtk_app_chooser_widget_set_show_other(gtkAppChooserWidgetPointer, setting.asGBoolean())

    /**
     * Determines whether the app chooser should show a section
     * for recommended applications.
     *
     * If false, the recommended applications are listed
     * among the other applications.
     */
    public open var showRecommended: Boolean
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         *
         * This widget will be removed in GTK 5
         * ---
         *
         * Gets whether the app chooser should show recommended applications
         * for the content type in a separate section.
         *
         * @return the value of [property@Gtk.AppChooserWidget:show-recommended]
         */
        get() = gtk_app_chooser_widget_get_show_recommended(gtkAppChooserWidgetPointer).asBoolean()

        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         *
         * This widget will be removed in GTK 5
         * ---
         *
         * Sets whether the app chooser should show recommended applications
         * for the content type in a separate section.
         *
         * @param setting the new value for [property@Gtk.AppChooserWidget:show-recommended]
         */
        set(setting) = gtk_app_chooser_widget_set_show_recommended(gtkAppChooserWidgetPointer, setting.asGBoolean())

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This widget will be removed in GTK 5
     * ---
     *
     * Creates a new `GtkAppChooserWidget` for applications
     * that can handle content of the given type.
     *
     * @param contentType the content type to show applications for
     * @return a newly created `GtkAppChooserWidget`
     */
    public constructor(contentType: String) : this(gtk_app_chooser_widget_new(contentType)!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This widget will be removed in GTK 5
     * ---
     *
     * Returns the text that is shown if there are not applications
     * that can handle the content type.
     *
     * @return the value of [property@Gtk.AppChooserWidget:default-text]
     */
    public open fun getDefaultText(): String? =
        gtk_app_chooser_widget_get_default_text(gtkAppChooserWidgetPointer)?.toKString()

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This widget will be removed in GTK 5
     * ---
     *
     * Sets the text that is shown if there are not applications
     * that can handle the content type.
     *
     * @param text the new value for [property@Gtk.AppChooserWidget:default-text]
     */
    public open fun setDefaultText(text: String): Unit =
        gtk_app_chooser_widget_set_default_text(gtkAppChooserWidgetPointer, text)

    /**
     * Emitted when an application item is activated from the widget's list.
     *
     * This usually happens when the user double clicks an item, or an item
     * is selected and the user presses one of the keys Space, Shift+Space,
     * Return or Enter.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `application` the activated `GAppInfo`
     */
    public fun onApplicationActivated(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (application: AppInfo) -> Unit,
    ): ULong = g_signal_connect_data(
        gtkAppChooserWidgetPointer,
        "application-activated",
        onApplicationActivatedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "application-activated" signal. See [onApplicationActivated].
     *
     * @param application the activated `GAppInfo`
     */
    public fun emitApplicationActivated(application: AppInfo) {
        g_signal_emit_by_name(
            gtkAppChooserWidgetPointer.reinterpret(),
            "application-activated",
            application.gioAppInfoPointer
        )
    }

    /**
     * Emitted when an application item is selected from the widget's list.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `application` the selected `GAppInfo`
     */
    public fun onApplicationSelected(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (application: AppInfo) -> Unit,
    ): ULong = g_signal_connect_data(
        gtkAppChooserWidgetPointer,
        "application-selected",
        onApplicationSelectedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "application-selected" signal. See [onApplicationSelected].
     *
     * @param application the selected `GAppInfo`
     */
    public fun emitApplicationSelected(application: AppInfo) {
        g_signal_emit_by_name(
            gtkAppChooserWidgetPointer.reinterpret(),
            "application-selected",
            application.gioAppInfoPointer
        )
    }

    public companion object : TypeCompanion<AppChooserWidget> {
        override val type: GeneratedClassKGType<AppChooserWidget> =
            GeneratedClassKGType(getTypeOrNull()!!) { AppChooserWidget(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of AppChooserWidget
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_app_chooser_widget_get_type()

        /**
         * Gets the GType of from the symbol `gtk_app_chooser_widget_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_app_chooser_widget_get_type")
    }
}

private val onApplicationActivatedFunc: CPointer<CFunction<(CPointer<GAppInfo>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            application: CPointer<GAppInfo>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(application: AppInfo) -> Unit>().get().invoke(
            application!!.run {
                AppInfo.AppInfoImpl(reinterpret())
            }
        )
    }
        .reinterpret()

private val onApplicationSelectedFunc: CPointer<CFunction<(CPointer<GAppInfo>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            application: CPointer<GAppInfo>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(application: AppInfo) -> Unit>().get().invoke(
            application!!.run {
                AppInfo.AppInfoImpl(reinterpret())
            }
        )
    }
        .reinterpret()
