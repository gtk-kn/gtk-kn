// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gdk.ModifierType
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkModifierType
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkEventControllerKey
import org.gtkkn.native.gtk.gtk_event_controller_key_forward
import org.gtkkn.native.gtk.gtk_event_controller_key_get_group
import org.gtkkn.native.gtk.gtk_event_controller_key_get_im_context
import org.gtkkn.native.gtk.gtk_event_controller_key_get_type
import org.gtkkn.native.gtk.gtk_event_controller_key_new
import org.gtkkn.native.gtk.gtk_event_controller_key_set_im_context
import kotlin.Boolean
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkEventControllerKey` is an event controller that provides access
 * to key events.
 */
public open class EventControllerKey(pointer: CPointer<GtkEventControllerKey>) :
    EventController(pointer.reinterpret()),
    KGTyped {
    public val gtkEventControllerKeyPointer: CPointer<GtkEventControllerKey>
        get() = gPointer.reinterpret()

    /**
     * Creates a new event controller that will handle key events.
     *
     * @return a new `GtkEventControllerKey`
     */
    public constructor() : this(gtk_event_controller_key_new()!!.reinterpret())

    /**
     * Forwards the current event of this @controller to a @widget.
     *
     * This function can only be used in handlers for the
     * [signal@Gtk.EventControllerKey::key-pressed],
     * [signal@Gtk.EventControllerKey::key-released]
     * or [signal@Gtk.EventControllerKey::modifiers] signals.
     *
     * @param widget a `GtkWidget`
     * @return whether the @widget handled the event
     */
    public open fun forward(widget: Widget): Boolean = gtk_event_controller_key_forward(
        gtkEventControllerKeyPointer.reinterpret(),
        widget.gtkWidgetPointer.reinterpret()
    ).asBoolean()

    /**
     * Gets the key group of the current event of this @controller.
     *
     * See [method@Gdk.KeyEvent.get_layout].
     *
     * @return the key group
     */
    public open fun getGroup(): guint = gtk_event_controller_key_get_group(gtkEventControllerKeyPointer.reinterpret())

    /**
     * Gets the input method context of the key @controller.
     *
     * @return the `GtkIMContext`
     */
    public open fun getImContext(): ImContext? =
        gtk_event_controller_key_get_im_context(gtkEventControllerKeyPointer.reinterpret())?.run {
            ImContext(reinterpret())
        }

    /**
     * Sets the input method context of the key @controller.
     *
     * @param imContext a `GtkIMContext`
     */
    public open fun setImContext(imContext: ImContext? = null): Unit = gtk_event_controller_key_set_im_context(
        gtkEventControllerKeyPointer.reinterpret(),
        imContext?.gtkImContextPointer?.reinterpret()
    )

    /**
     * Emitted whenever the input method context filters away
     * a keypress and prevents the @controller receiving it.
     *
     * See [method@Gtk.EventControllerKey.set_im_context] and
     * [method@Gtk.IMContext.filter_keypress].
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectImUpdate(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "im-update",
            connectImUpdateFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted whenever a key is pressed.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `keyval` the pressed key.; `keycode` the raw code of the pressed key.; `state` the bitmask, representing the state of modifier keys and pointer buttons.. Returns true if the key press was handled, false otherwise.
     */
    public fun connectKeyPressed(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            keyval: guint,
            keycode: guint,
            state: ModifierType,
        ) -> Boolean,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "key-pressed",
        connectKeyPressedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted whenever a key is released.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `keyval` the released key.; `keycode` the raw code of the released key.; `state` the bitmask, representing the state of modifier keys and pointer buttons.
     */
    public fun connectKeyReleased(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            keyval: guint,
            keycode: guint,
            state: ModifierType,
        ) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "key-released",
        connectKeyReleasedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted whenever the state of modifier keys and pointer buttons change.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `state` the bitmask, representing the new state of modifier keys and
     *   pointer buttons.
     */
    public fun connectModifiers(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (state: ModifierType) -> Boolean,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "modifiers",
        connectModifiersFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    public companion object : TypeCompanion<EventControllerKey> {
        override val type: GeneratedClassKGType<EventControllerKey> =
            GeneratedClassKGType(gtk_event_controller_key_get_type()) { EventControllerKey(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of EventControllerKey
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_event_controller_key_get_type()
    }
}

private val connectImUpdateFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val connectKeyPressedFunc: CPointer<
    CFunction<
        (
            guint,
            guint,
            GdkModifierType,
        ) -> gboolean
        >
    > = staticCFunction {
        _: COpaquePointer,
        keyval: guint,
        keycode: guint,
        state: GdkModifierType,
        userData: COpaquePointer,
    ->
    userData.asStableRef<
        (
            keyval: guint,
            keycode: guint,
            state: ModifierType,
        ) -> Boolean
        >().get().invoke(
        keyval,
        keycode,
        state.run {
            ModifierType(this)
        }
    ).asGBoolean()
}
    .reinterpret()

private val connectKeyReleasedFunc: CPointer<
    CFunction<
        (
            guint,
            guint,
            GdkModifierType,
        ) -> Unit
        >
    > = staticCFunction {
        _: COpaquePointer,
        keyval: guint,
        keycode: guint,
        state: GdkModifierType,
        userData: COpaquePointer,
    ->
    userData.asStableRef<
        (
            keyval: guint,
            keycode: guint,
            state: ModifierType,
        ) -> Unit
        >().get().invoke(
        keyval,
        keycode,
        state.run {
            ModifierType(this)
        }
    )
}
    .reinterpret()

private val connectModifiersFunc: CPointer<CFunction<(GdkModifierType) -> gboolean>> =
    staticCFunction {
            _: COpaquePointer,
            state: GdkModifierType,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(state: ModifierType) -> Boolean>().get().invoke(
            state.run {
                ModifierType(this)
            }
        ).asGBoolean()
    }
        .reinterpret()
