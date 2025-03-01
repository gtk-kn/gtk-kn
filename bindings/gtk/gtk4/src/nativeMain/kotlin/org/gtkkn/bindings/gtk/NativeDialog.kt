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
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkNativeDialog
import org.gtkkn.native.gtk.gtk_native_dialog_destroy
import org.gtkkn.native.gtk.gtk_native_dialog_get_modal
import org.gtkkn.native.gtk.gtk_native_dialog_get_title
import org.gtkkn.native.gtk.gtk_native_dialog_get_transient_for
import org.gtkkn.native.gtk.gtk_native_dialog_get_type
import org.gtkkn.native.gtk.gtk_native_dialog_get_visible
import org.gtkkn.native.gtk.gtk_native_dialog_hide
import org.gtkkn.native.gtk.gtk_native_dialog_set_modal
import org.gtkkn.native.gtk.gtk_native_dialog_set_title
import org.gtkkn.native.gtk.gtk_native_dialog_set_transient_for
import org.gtkkn.native.gtk.gtk_native_dialog_show
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * Native dialogs are platform dialogs that don't use `GtkDialog`.
 *
 * They are used in order to integrate better with a platform, by
 * looking the same as other native applications and supporting
 * platform specific features.
 *
 * The [class@Gtk.Dialog] functions cannot be used on such objects,
 * but we need a similar API in order to drive them. The `GtkNativeDialog`
 * object is an API that allows you to do this. It allows you to set
 * various common properties on the dialog, as well as show and hide
 * it and get a [signal@Gtk.NativeDialog::response] signal when the user
 * finished with the dialog.
 *
 * Note that unlike `GtkDialog`, `GtkNativeDialog` objects are not
 * toplevel widgets, and GTK does not keep them alive. It is your
 * responsibility to keep a reference until you are done with the
 * object.
 *
 * ## Skipped during bindings generation
 *
 * - method `title`: Property TypeInfo of getter and setter do not match
 */
public abstract class NativeDialog(public val gtkNativeDialogPointer: CPointer<GtkNativeDialog>) :
    Object(gtkNativeDialogPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    /**
     * Whether the window should be modal with respect to its transient parent.
     */
    public open var modal: Boolean
        /**
         * Returns whether the dialog is modal.
         *
         * @return true if the dialog is set to be modal
         */
        get() = gtk_native_dialog_get_modal(gtkNativeDialogPointer).asBoolean()

        /**
         * Sets a dialog modal or non-modal.
         *
         * Modal dialogs prevent interaction with other windows in the same
         * application. To keep modal dialogs on top of main application
         * windows, use [method@Gtk.NativeDialog.set_transient_for] to make
         * the dialog transient for the parent; most window managers will
         * then disallow lowering the dialog below the parent.
         *
         * @param modal whether the window is modal
         */
        set(modal) = gtk_native_dialog_set_modal(gtkNativeDialogPointer, modal.asGBoolean())

    /**
     * The transient parent of the dialog, or null for none.
     */
    public open var transientFor: Window?
        /**
         * Fetches the transient parent for this window.
         *
         * @return the transient parent for this window,
         *   or null if no transient parent has been set.
         */
        get() = gtk_native_dialog_get_transient_for(gtkNativeDialogPointer)?.run {
            InstanceCache.get(this, true) { Window(reinterpret()) }!!
        }

        /**
         * Dialog windows should be set transient for the main application
         * window they were spawned from.
         *
         * This allows window managers to e.g. keep the dialog on top of the
         * main window, or center the dialog over the main window.
         *
         * Passing null for @parent unsets the current transient window.
         *
         * @param parent parent window
         */
        set(parent) = gtk_native_dialog_set_transient_for(gtkNativeDialogPointer, parent?.gtkWindowPointer)

    /**
     * Whether the window is currently visible.
     */
    public open val visible: Boolean
        /**
         * Determines whether the dialog is visible.
         *
         * @return true if the dialog is visible
         */
        get() = gtk_native_dialog_get_visible(gtkNativeDialogPointer).asBoolean()

    /**
     * Destroys a dialog.
     *
     * When a dialog is destroyed, it will break any references it holds
     * to other objects.
     *
     * If it is visible it will be hidden and any underlying window system
     * resources will be destroyed.
     *
     * Note that this does not release any reference to the object (as opposed
     * to destroying a `GtkWindow`) because there is no reference from the
     * windowing system to the `GtkNativeDialog`.
     */
    public open fun destroy(): Unit = gtk_native_dialog_destroy(gtkNativeDialogPointer)

    /**
     * Gets the title of the `GtkNativeDialog`.
     *
     * @return the title of the dialog, or null if none has
     *    been set explicitly. The returned string is owned by the widget
     *    and must not be modified or freed.
     */
    public open fun getTitle(): String? = gtk_native_dialog_get_title(gtkNativeDialogPointer)?.toKString()

    /**
     * Hides the dialog if it is visible, aborting any interaction.
     *
     * Once this is called the [signal@Gtk.NativeDialog::response] signal
     * will *not* be emitted until after the next call to
     * [method@Gtk.NativeDialog.show].
     *
     * If the dialog is not visible this does nothing.
     */
    public open fun hide(): Unit = gtk_native_dialog_hide(gtkNativeDialogPointer)

    /**
     * Sets the title of the `GtkNativeDialog.`
     *
     * @param title title of the dialog
     */
    public open fun setTitle(title: String): Unit = gtk_native_dialog_set_title(gtkNativeDialogPointer, title)

    /**
     * Shows the dialog on the display.
     *
     * When the user accepts the state of the dialog the dialog will
     * be automatically hidden and the [signal@Gtk.NativeDialog::response]
     * signal will be emitted.
     *
     * Multiple calls while the dialog is visible will be ignored.
     */
    public open fun show(): Unit = gtk_native_dialog_show(gtkNativeDialogPointer)

    /**
     * Emitted when the user responds to the dialog.
     *
     * When this is called the dialog has been hidden.
     *
     * If you call [method@Gtk.NativeDialog.hide] before the user
     * responds to the dialog this signal will not be emitted.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `responseId` the response ID
     */
    public fun onResponse(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (responseId: gint) -> Unit): ULong =
        g_signal_connect_data(
            gtkNativeDialogPointer,
            "response",
            onResponseFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "response" signal. See [onResponse].
     *
     * @param responseId the response ID
     */
    public fun emitResponse(responseId: gint) {
        g_signal_emit_by_name(gtkNativeDialogPointer.reinterpret(), "response", responseId)
    }

    /**
     * The NativeDialogImpl type represents a native instance of the abstract NativeDialog class.
     *
     * @constructor Creates a new instance of NativeDialog for the provided [CPointer].
     */
    public class NativeDialogImpl(pointer: CPointer<GtkNativeDialog>) : NativeDialog(pointer)

    public companion object : TypeCompanion<NativeDialog> {
        override val type: GeneratedClassKGType<NativeDialog> =
            GeneratedClassKGType(getTypeOrNull()!!) { NativeDialogImpl(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of NativeDialog
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_native_dialog_get_type()

        /**
         * Gets the GType of from the symbol `gtk_native_dialog_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_native_dialog_get_type")
    }
}

private val onResponseFunc: CPointer<CFunction<(gint) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        responseId: gint,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(responseId: gint) -> Unit>().get().invoke(responseId)
}
    .reinterpret()
