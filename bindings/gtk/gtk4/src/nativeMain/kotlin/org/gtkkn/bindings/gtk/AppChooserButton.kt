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
import kotlinx.cinterop.cstr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.Icon
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_4
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkAppChooser
import org.gtkkn.native.gtk.GtkAppChooserButton
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.gtk_app_chooser_button_append_custom_item
import org.gtkkn.native.gtk.gtk_app_chooser_button_append_separator
import org.gtkkn.native.gtk.gtk_app_chooser_button_get_heading
import org.gtkkn.native.gtk.gtk_app_chooser_button_get_modal
import org.gtkkn.native.gtk.gtk_app_chooser_button_get_show_default_item
import org.gtkkn.native.gtk.gtk_app_chooser_button_get_show_dialog_item
import org.gtkkn.native.gtk.gtk_app_chooser_button_get_type
import org.gtkkn.native.gtk.gtk_app_chooser_button_new
import org.gtkkn.native.gtk.gtk_app_chooser_button_set_active_custom_item
import org.gtkkn.native.gtk.gtk_app_chooser_button_set_heading
import org.gtkkn.native.gtk.gtk_app_chooser_button_set_modal
import org.gtkkn.native.gtk.gtk_app_chooser_button_set_show_default_item
import org.gtkkn.native.gtk.gtk_app_chooser_button_set_show_dialog_item
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
 * The `GtkAppChooserButton` lets the user select an application.
 *
 * ![An example GtkAppChooserButton](appchooserbutton.png)
 *
 * Initially, a `GtkAppChooserButton` selects the first application
 * in its list, which will either be the most-recently used application
 * or, if [property@Gtk.AppChooserButton:show-default-item] is true, the
 * default application.
 *
 * The list of applications shown in a `GtkAppChooserButton` includes
 * the recommended applications for the given content type. When
 * [property@Gtk.AppChooserButton:show-default-item] is set, the default
 * application is also included. To let the user chooser other applications,
 * you can set the [property@Gtk.AppChooserButton:show-dialog-item] property,
 * which allows to open a full [class@Gtk.AppChooserDialog].
 *
 * It is possible to add custom items to the list, using
 * [method@Gtk.AppChooserButton.append_custom_item]. These items cause
 * the [signal@Gtk.AppChooserButton::custom-item-activated] signal to be
 * emitted when they are selected.
 *
 * To track changes in the selected application, use the
 * [signal@Gtk.AppChooserButton::changed] signal.
 *
 * ## CSS nodes
 *
 * `GtkAppChooserButton` has a single CSS node with the name “appchooserbutton”.
 *
 * ## Skipped during bindings generation
 *
 * - method `heading`: Property TypeInfo of getter and setter do not match
 */
public open class AppChooserButton(public val gtkAppChooserButtonPointer: CPointer<GtkAppChooserButton>) :
    Widget(gtkAppChooserButtonPointer.reinterpret()),
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
     * Whether the app chooser dialog should be modal.
     */
    public open var modal: Boolean
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         *
         * This widget will be removed in GTK 5
         * ---
         *
         * Gets whether the dialog is modal.
         *
         * @return true if the dialog is modal
         */
        get() = gtk_app_chooser_button_get_modal(gtkAppChooserButtonPointer).asBoolean()

        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         *
         * This widget will be removed in GTK 5
         * ---
         *
         * Sets whether the dialog should be modal.
         *
         * @param modal true to make the dialog modal
         */
        set(modal) = gtk_app_chooser_button_set_modal(gtkAppChooserButtonPointer, modal.asGBoolean())

    /**
     * Determines whether the dropdown menu shows the default application
     * on top for the provided content type.
     */
    public open var showDefaultItem: Boolean
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         *
         * This widget will be removed in GTK 5
         * ---
         *
         * Returns whether the dropdown menu should show the default
         * application at the top.
         *
         * @return the value of [property@Gtk.AppChooserButton:show-default-item]
         */
        get() = gtk_app_chooser_button_get_show_default_item(gtkAppChooserButtonPointer).asBoolean()

        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         *
         * This widget will be removed in GTK 5
         * ---
         *
         * Sets whether the dropdown menu of this button should show the
         * default application for the given content type at top.
         *
         * @param setting the new value for [property@Gtk.AppChooserButton:show-default-item]
         */
        set(setting) = gtk_app_chooser_button_set_show_default_item(gtkAppChooserButtonPointer, setting.asGBoolean())

    /**
     * Determines whether the dropdown menu shows an item to open
     * a `GtkAppChooserDialog`.
     */
    public open var showDialogItem: Boolean
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         *
         * This widget will be removed in GTK 5
         * ---
         *
         * Returns whether the dropdown menu shows an item
         * for a `GtkAppChooserDialog`.
         *
         * @return the value of [property@Gtk.AppChooserButton:show-dialog-item]
         */
        get() = gtk_app_chooser_button_get_show_dialog_item(gtkAppChooserButtonPointer).asBoolean()

        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         *
         * This widget will be removed in GTK 5
         * ---
         *
         * Sets whether the dropdown menu of this button should show an
         * entry to trigger a `GtkAppChooserDialog`.
         *
         * @param setting the new value for [property@Gtk.AppChooserButton:show-dialog-item]
         */
        set(setting) = gtk_app_chooser_button_set_show_dialog_item(gtkAppChooserButtonPointer, setting.asGBoolean())

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This widget will be removed in GTK 5
     * ---
     *
     * Creates a new `GtkAppChooserButton` for applications
     * that can handle content of the given type.
     *
     * @param contentType the content type to show applications for
     * @return a newly created `GtkAppChooserButton`
     */
    public constructor(contentType: String) : this(gtk_app_chooser_button_new(contentType)!!.reinterpret()) {
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
     * Appends a custom item to the list of applications that is shown
     * in the popup.
     *
     * The item name must be unique per-widget. Clients can use the
     * provided name as a detail for the
     * [signal@Gtk.AppChooserButton::custom-item-activated] signal, to add a
     * callback for the activation of a particular custom item in the list.
     *
     * See also [method@Gtk.AppChooserButton.append_separator].
     *
     * @param name the name of the custom item
     * @param label the label for the custom item
     * @param icon the icon for the custom item
     */
    public open fun appendCustomItem(name: String, label: String, icon: Icon): Unit =
        gtk_app_chooser_button_append_custom_item(gtkAppChooserButtonPointer, name, label, icon.gioIconPointer)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This widget will be removed in GTK 5
     * ---
     *
     * Appends a separator to the list of applications that is shown
     * in the popup.
     */
    public open fun appendSeparator(): Unit = gtk_app_chooser_button_append_separator(gtkAppChooserButtonPointer)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This widget will be removed in GTK 5
     * ---
     *
     * Returns the text to display at the top of the dialog.
     *
     * @return the text to display at the top of the dialog,
     *   or null, in which case a default text is displayed
     */
    public open fun getHeading(): String? = gtk_app_chooser_button_get_heading(gtkAppChooserButtonPointer)?.toKString()

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This widget will be removed in GTK 5
     * ---
     *
     * Selects a custom item.
     *
     * See [method@Gtk.AppChooserButton.append_custom_item].
     *
     * Use [method@Gtk.AppChooser.refresh] to bring the selection
     * to its initial state.
     *
     * @param name the name of the custom item
     */
    public open fun setActiveCustomItem(name: String): Unit =
        gtk_app_chooser_button_set_active_custom_item(gtkAppChooserButtonPointer, name)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This widget will be removed in GTK 5
     * ---
     *
     * Sets the text to display at the top of the dialog.
     *
     * If the heading is not set, the dialog displays a default text.
     *
     * @param heading a string containing Pango markup
     */
    public open fun setHeading(heading: String): Unit =
        gtk_app_chooser_button_set_heading(gtkAppChooserButtonPointer, heading)

    /**
     * Emitted to when the button is activated.
     *
     * The `::activate` signal on `GtkAppChooserButton` is an action signal and
     * emitting it causes the button to pop up its dialog.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 4.4
     */
    @GtkVersion4_4
    public fun onActivate(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkAppChooserButtonPointer,
            "activate",
            onActivateFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "activate" signal. See [onActivate].
     *
     * @since 4.4
     */
    @GtkVersion4_4
    public fun emitActivate() {
        g_signal_emit_by_name(gtkAppChooserButtonPointer.reinterpret(), "activate")
    }

    /**
     * Emitted when the active application changes.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onChanged(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkAppChooserButtonPointer,
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
        g_signal_emit_by_name(gtkAppChooserButtonPointer.reinterpret(), "changed")
    }

    /**
     * Emitted when a custom item is activated.
     *
     * Use [method@Gtk.AppChooserButton.append_custom_item],
     * to add custom items.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param detail the signal detail
     * @param handler the Callback to connect. Params: `itemName` the name of the activated item
     */
    public fun onCustomItemActivated(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        detail: String? = null,
        handler: (itemName: String) -> Unit,
    ): ULong = g_signal_connect_data(
        gtkAppChooserButtonPointer,
        "custom-item-activated" + (
            detail?.let {
                "::$it"
            } ?: ""
            ),
        onCustomItemActivatedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "custom-item-activated" signal. See [onCustomItemActivated].
     *
     * @param detail the signal detail
     * @param itemName the name of the activated item
     */
    public fun emitCustomItemActivated(detail: String? = null, itemName: String) {
        g_signal_emit_by_name(
            gtkAppChooserButtonPointer.reinterpret(),
            "custom-item-activated" + (detail?.let { "::$it" } ?: ""),
            itemName.cstr
        )
    }

    public companion object : TypeCompanion<AppChooserButton> {
        override val type: GeneratedClassKGType<AppChooserButton> =
            GeneratedClassKGType(getTypeOrNull()!!) { AppChooserButton(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of AppChooserButton
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_app_chooser_button_get_type()

        /**
         * Gets the GType of from the symbol `gtk_app_chooser_button_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_app_chooser_button_get_type")
    }
}

private val onActivateFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onChangedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onCustomItemActivatedFunc: CPointer<CFunction<(CPointer<ByteVar>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            itemName: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(itemName: String) -> Unit>().get().invoke(
            itemName?.toKString() ?: error("Expected not null string")
        )
    }
        .reinterpret()
