// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtksource

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
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gtk.ImContext
import org.gtkkn.bindings.gtk.TextIter
import org.gtkkn.bindings.gtksource.annotations.GtkSourceVersion5_4
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkTextIter
import org.gtkkn.native.gtksource.GtkSourceView
import org.gtkkn.native.gtksource.GtkSourceVimIMContext
import org.gtkkn.native.gtksource.gtk_source_vim_im_context_execute_command
import org.gtkkn.native.gtksource.gtk_source_vim_im_context_get_command_bar_text
import org.gtkkn.native.gtksource.gtk_source_vim_im_context_get_command_text
import org.gtkkn.native.gtksource.gtk_source_vim_im_context_get_type
import org.gtkkn.native.gtksource.gtk_source_vim_im_context_new
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * Vim emulation.
 *
 * The `GtkSourceVimIMContext` is a [class@Gtk.IMContext] implementation that can
 * be used to provide Vim-like editing controls within a [class@View].
 *
 * The `GtkSourceViMIMContext` will process incoming [class@Gdk.KeyEvent] as the
 * user types. It should be used in conjunction with a [class@Gtk.EventControllerKey].
 *
 * Various features supported by `GtkSourceVimIMContext` include:
 *
 *  - Normal, Insert, Replace, Visual, and Visual Line modes
 *  - Support for an integrated command bar and current command preview
 *  - Search and replace
 *  - Motions and Text Objects
 *  - History replay
 *  - Jumplists within the current file
 *  - Registers including the system and primary clipboards
 *  - Creation and motion to marks
 *  - Some commonly used Vim commands
 *
 * It is recommended that applications display the contents of
 * [property@VimIMContext:command-bar-text] and
 * [property@VimIMContext:command-text] to the user as they represent the
 * command-bar and current command preview found in Vim.
 *
 * `GtkSourceVimIMContext` attempts to work with additional [class@Gtk.IMContext]
 * implementations such as IBus by querying the [class@Gtk.TextView] before processing
 * the command in states which support it (notably Insert and Replace modes).
 *
 * ```c
 * GtkEventController *key;
 * GtkIMContext *im_context;
 * GtkWidget *view;
 *
 * view = gtk_source_view_new ();
 * im_context = gtk_source_vim_im_context_new ();
 * key = gtk_event_controller_key_new ();
 *
 * gtk_event_controller_key_set_im_context (GTK_EVENT_CONTROLLER_KEY (key), im_context);
 * gtk_event_controller_set_propagation_phase (key, GTK_PHASE_CAPTURE);
 * gtk_widget_add_controller (view, key);
 * gtk_im_context_set_client_widget (im_context, view);
 *
 * g_object_bind_property (im_context, "command-bar-text", command_bar_label, "label", 0);
 * g_object_bind_property (im_context, "command-text", command_label, "label", 0);
 * ```
 * @since 5.4
 */
@GtkSourceVersion5_4
public open class VimImContext(public val gtksourceVimImContextPointer: CPointer<GtkSourceVimIMContext>) :
    ImContext(gtksourceVimImContextPointer.reinterpret()),
    KGTyped {
    public open val commandBarText: String
        /**
         * Gets the current command-bar text as it is entered by the user.
         *
         * @return A string containing the command-bar text
         * @since 5.4
         */
        get() = gtk_source_vim_im_context_get_command_bar_text(gtksourceVimImContextPointer)?.toKString()
            ?: error("Expected not null string")

    public open val commandText: String
        /**
         * Gets the current command text as it is entered by the user.
         *
         * @return A string containing the command text
         * @since 5.4
         */
        get() = gtk_source_vim_im_context_get_command_text(gtksourceVimImContextPointer)?.toKString()
            ?: error("Expected not null string")

    public constructor() : this(gtk_source_vim_im_context_new()!!.reinterpret())

    /**
     * Executes @command as if it was typed into the command bar by the
     * user except that this does not emit the
     * [signal@VimIMContext::execute-command] signal.
     *
     * @param command the command text
     * @since 5.4
     */
    @GtkSourceVersion5_4
    public open fun executeCommand(command: String): Unit =
        gtk_source_vim_im_context_execute_command(gtksourceVimImContextPointer, command)

    /**
     * Requests the application open the file found at @path.
     *
     * If @path is null, then the current file should be reloaded from storage.
     *
     * This may be executed in relation to the user running the
     * `:edit` or `:e` commands.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `view` the #GtkSourceView; `path` the path if provided, otherwise null
     * @since 5.4
     */
    @GtkSourceVersion5_4
    public fun onEdit(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (view: View, path: String?) -> Unit,
    ): ULong = g_signal_connect_data(
        gtksourceVimImContextPointer,
        "edit",
        onEditFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "edit" signal. See [onEdit].
     *
     * @param view the #GtkSourceView
     * @param path the path if provided, otherwise null
     * @since 5.4
     */
    @GtkSourceVersion5_4
    public fun emitEdit(view: View, path: String?) {
        g_signal_emit_by_name(gtksourceVimImContextPointer.reinterpret(), "edit", view.gtksourceViewPointer, path?.cstr)
    }

    /**
     * The signal is emitted when a command should be
     * executed. This might be something like `:wq` or `:e <path>`.
     *
     * If the application chooses to implement this, it should return
     * true from this signal to indicate the command has been handled.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `command` the command to execute. Returns true if handled; otherwise false.
     * @since 5.4
     */
    @GtkSourceVersion5_4
    public fun onExecuteCommand(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (command: String) -> Boolean,
    ): ULong = g_signal_connect_data(
        gtksourceVimImContextPointer,
        "execute-command",
        onExecuteCommandFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Requests that the application format the text between
     * @begin and @end.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `begin` the start location; `end` the end location
     * @since 5.4
     */
    @GtkSourceVersion5_4
    public fun onFormatText(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (begin: TextIter, end: TextIter) -> Unit,
    ): ULong = g_signal_connect_data(
        gtksourceVimImContextPointer,
        "format-text",
        onFormatTextFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "format-text" signal. See [onFormatText].
     *
     * @param begin the start location
     * @param end the end location
     * @since 5.4
     */
    @GtkSourceVersion5_4
    public fun emitFormatText(begin: TextIter, end: TextIter) {
        g_signal_emit_by_name(
            gtksourceVimImContextPointer.reinterpret(),
            "format-text",
            begin.gtkTextIterPointer,
            end.gtkTextIterPointer
        )
    }

    /**
     * Requests the application save the file.
     *
     * If a filename was provided, it will be available to the signal handler as @path.
     * This may be executed in relation to the user running the `:write` or `:w` commands.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `view` the #GtkSourceView; `path` the path if provided, otherwise null
     * @since 5.4
     */
    @GtkSourceVersion5_4
    public fun onWrite(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (view: View, path: String?) -> Unit,
    ): ULong = g_signal_connect_data(
        gtksourceVimImContextPointer,
        "write",
        onWriteFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "write" signal. See [onWrite].
     *
     * @param view the #GtkSourceView
     * @param path the path if provided, otherwise null
     * @since 5.4
     */
    @GtkSourceVersion5_4
    public fun emitWrite(view: View, path: String?) {
        g_signal_emit_by_name(
            gtksourceVimImContextPointer.reinterpret(),
            "write",
            view.gtksourceViewPointer,
            path?.cstr
        )
    }

    public companion object : TypeCompanion<VimImContext> {
        override val type: GeneratedClassKGType<VimImContext> =
            GeneratedClassKGType(getTypeOrNull("gtk_source_vim_im_context_get_type")!!) {
                VimImContext(it.reinterpret())
            }

        init {
            GtksourceTypeProvider.register()
        }

        /**
         * Get the GType of VimIMContext
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_vim_im_context_get_type()
    }
}

private val onEditFunc: CPointer<CFunction<(CPointer<GtkSourceView>, CPointer<ByteVar>?) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            view: CPointer<GtkSourceView>?,
            path: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(view: View, path: String?) -> Unit>().get().invoke(
            view!!.run {
                View(this)
            },
            path?.toKString()
        )
    }
        .reinterpret()

private val onExecuteCommandFunc: CPointer<CFunction<(CPointer<ByteVar>) -> gboolean>> =
    staticCFunction {
            _: COpaquePointer,
            command: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(command: String) -> Boolean>().get().invoke(
            command?.toKString() ?: error("Expected not null string")
        ).asGBoolean()
    }
        .reinterpret()

private val onFormatTextFunc:
    CPointer<CFunction<(CPointer<GtkTextIter>, CPointer<GtkTextIter>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            begin: CPointer<GtkTextIter>?,
            end: CPointer<GtkTextIter>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(begin: TextIter, end: TextIter) -> Unit>().get().invoke(
            begin!!.run {
                TextIter(this)
            },
            end!!.run {
                TextIter(this)
            }
        )
    }
        .reinterpret()

private val onWriteFunc: CPointer<CFunction<(CPointer<GtkSourceView>, CPointer<ByteVar>?) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            view: CPointer<GtkSourceView>?,
            path: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(view: View, path: String?) -> Unit>().get().invoke(
            view!!.run {
                View(this)
            },
            path?.toKString()
        )
    }
        .reinterpret()
