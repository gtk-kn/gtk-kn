// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.guint
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkStatusbar
import org.gtkkn.native.gtk.gtk_statusbar_get_context_id
import org.gtkkn.native.gtk.gtk_statusbar_get_type
import org.gtkkn.native.gtk.gtk_statusbar_new
import org.gtkkn.native.gtk.gtk_statusbar_pop
import org.gtkkn.native.gtk.gtk_statusbar_push
import org.gtkkn.native.gtk.gtk_statusbar_remove
import org.gtkkn.native.gtk.gtk_statusbar_remove_all
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * A `GtkStatusbar` widget is usually placed along the bottom of an application's
 * main [class@Gtk.Window].
 *
 * ![An example GtkStatusbar](statusbar.png)
 *
 * A `GtkStatusBar` may provide a regular commentary of the application's
 * status (as is usually the case in a web browser, for example), or may be
 * used to simply output a message when the status changes, (when an upload
 * is complete in an FTP client, for example).
 *
 * Status bars in GTK maintain a stack of messages. The message at
 * the top of the each bar’s stack is the one that will currently be displayed.
 *
 * Any messages added to a statusbar’s stack must specify a context id that
 * is used to uniquely identify the source of a message. This context id can
 * be generated by [method@Gtk.Statusbar.get_context_id], given a message and
 * the statusbar that it will be added to. Note that messages are stored in a
 * stack, and when choosing which message to display, the stack structure is
 * adhered to, regardless of the context identifier of a message.
 *
 * One could say that a statusbar maintains one stack of messages for
 * display purposes, but allows multiple message producers to maintain
 * sub-stacks of the messages they produced (via context ids).
 *
 * Status bars are created using [ctor@Gtk.Statusbar.new].
 *
 * Messages are added to the bar’s stack with [method@Gtk.Statusbar.push].
 *
 * The message at the top of the stack can be removed using
 * [method@Gtk.Statusbar.pop]. A message can be removed from anywhere in the
 * stack if its message id was recorded at the time it was added. This is done
 * using [method@Gtk.Statusbar.remove].
 *
 * ## CSS node
 *
 * `GtkStatusbar` has a single CSS node with name `statusbar`.
 */
public open class Statusbar(pointer: CPointer<GtkStatusbar>) :
    Widget(pointer.reinterpret()),
    KGTyped {
    public val gtkStatusbarPointer: CPointer<GtkStatusbar>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * Creates a new `GtkStatusbar` ready for messages.
     *
     * @return the new `GtkStatusbar`
     */
    public constructor() : this(gtk_statusbar_new()!!.reinterpret())

    /**
     * Returns a new context identifier, given a description
     * of the actual context.
     *
     * Note that the description is not shown in the UI.
     *
     * @param contextDescription textual description of what context
     *   the new message is being used in
     * @return an integer id
     */
    public open fun getContextId(contextDescription: String): guint =
        gtk_statusbar_get_context_id(gtkStatusbarPointer.reinterpret(), contextDescription)

    /**
     * Removes the first message in the `GtkStatusbar`’s stack
     * with the given context id.
     *
     * Note that this may not change the displayed message,
     * if the message at the top of the stack has a different
     * context id.
     *
     * @param contextId a context identifier
     */
    public open fun pop(contextId: guint): Unit = gtk_statusbar_pop(gtkStatusbarPointer.reinterpret(), contextId)

    /**
     * Pushes a new message onto a statusbar’s stack.
     *
     * @param contextId the message’s context id, as returned by
     *    gtk_statusbar_get_context_id()
     * @param text the message to add to the statusbar
     * @return a message id that can be used with
     *   [method@Gtk.Statusbar.remove].
     */
    public open fun push(contextId: guint, text: String): guint =
        gtk_statusbar_push(gtkStatusbarPointer.reinterpret(), contextId, text)

    /**
     * Forces the removal of a message from a statusbar’s stack.
     * The exact @context_id and @message_id must be specified.
     *
     * @param contextId a context identifier
     * @param messageId a message identifier, as returned by [method@Gtk.Statusbar.push]
     */
    public open fun remove(contextId: guint, messageId: guint): Unit =
        gtk_statusbar_remove(gtkStatusbarPointer.reinterpret(), contextId, messageId)

    /**
     * Forces the removal of all messages from a statusbar's
     * stack with the exact @context_id.
     *
     * @param contextId a context identifier
     */
    public open fun removeAll(contextId: guint): Unit =
        gtk_statusbar_remove_all(gtkStatusbarPointer.reinterpret(), contextId)

    /**
     * Emitted whenever a new message is popped off a statusbar's stack.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `contextId` the context id of the relevant message/statusbar; `text` the message that was just popped
     */
    public fun connectTextPopped(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (contextId: guint, text: String) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "text-popped",
        connectTextPoppedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted whenever a new message gets pushed onto a statusbar's stack.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `contextId` the context id of the relevant message/statusbar; `text` the message that was pushed
     */
    public fun connectTextPushed(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (contextId: guint, text: String) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "text-pushed",
        connectTextPushedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    public companion object : TypeCompanion<Statusbar> {
        override val type: GeneratedClassKGType<Statusbar> =
            GeneratedClassKGType(gtk_statusbar_get_type()) { Statusbar(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of Statusbar
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_statusbar_get_type()
    }
}

private val connectTextPoppedFunc: CPointer<CFunction<(guint, CPointer<ByteVar>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            contextId: guint,
            text: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(contextId: guint, text: String) -> Unit>().get().invoke(
            contextId,
            text?.toKString() ?: error("Expected not null string")
        )
    }
        .reinterpret()

private val connectTextPushedFunc: CPointer<CFunction<(guint, CPointer<ByteVar>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            contextId: guint,
            text: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(contextId: guint, text: String) -> Unit>().get().invoke(
            contextId,
            text?.toKString() ?: error("Expected not null string")
        )
    }
        .reinterpret()
