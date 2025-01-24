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
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GObject
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkSignalListItemFactory
import org.gtkkn.native.gtk.gtk_signal_list_item_factory_get_type
import org.gtkkn.native.gtk.gtk_signal_list_item_factory_new
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkSignalListItemFactory` is a `GtkListItemFactory` that emits signals
 * to manage listitems.
 *
 * Signals are emitted for every listitem in the same order:
 *
 *  1. [signal@Gtk.SignalListItemFactory::setup] is emitted to set up permanent
 *  things on the listitem. This usually means constructing the widgets used in
 *  the row and adding them to the listitem.
 *
 *  2. [signal@Gtk.SignalListItemFactory::bind] is emitted to bind the item passed
 *  via [property@Gtk.ListItem:item] to the widgets that have been created in
 *  step 1 or to add item-specific widgets. Signals are connected to listen to
 *  changes - both to changes in the item to update the widgets or to changes
 *  in the widgets to update the item. After this signal has been called, the
 *  listitem may be shown in a list widget.
 *
 *  3. [signal@Gtk.SignalListItemFactory::unbind] is emitted to undo everything
 *  done in step 2. Usually this means disconnecting signal handlers. Once this
 *  signal has been called, the listitem will no longer be used in a list
 *  widget.
 *
 *  4. [signal@Gtk.SignalListItemFactory::bind] and
 *  [signal@Gtk.SignalListItemFactory::unbind] may be emitted multiple times
 *  again to bind the listitem for use with new items. By reusing listitems,
 *  potentially costly setup can be avoided. However, it means code needs to
 *  make sure to properly clean up the listitem in step 3 so that no information
 *  from the previous use leaks into the next use.
 *
 * 5. [signal@Gtk.SignalListItemFactory::teardown] is emitted to allow undoing
 * the effects of [signal@Gtk.SignalListItemFactory::setup]. After this signal
 * was emitted on a listitem, the listitem will be destroyed and not be used again.
 *
 * Note that during the signal emissions, changing properties on the
 * listitems passed will not trigger notify signals as the listitem's
 * notifications are frozen. See g_object_freeze_notify() for details.
 *
 * For tracking changes in other properties in the listitem, the
 * ::notify signal is recommended. The signal can be connected in the
 * [signal@Gtk.SignalListItemFactory::setup] signal and removed again during
 * [signal@Gtk.SignalListItemFactory::teardown].
 */
public open class SignalListItemFactory(
    public val gtkSignalListItemFactoryPointer: CPointer<GtkSignalListItemFactory>,
) : ListItemFactory(gtkSignalListItemFactoryPointer.reinterpret()),
    KGTyped {
    /**
     * Creates a new `GtkSignalListItemFactory`.
     *
     * You need to connect signal handlers before you use it.
     *
     * @return a new `GtkSignalListItemFactory`
     */
    public constructor() : this(gtk_signal_list_item_factory_new()!!.reinterpret())

    /**
     * Emitted when an object has been bound, for example when a
     * new [property@Gtk.ListItem:item] has been set on a
     * listitem and should be bound for use.
     *
     * After this signal was emitted, the object might be shown in
     * a [class@Gtk.ListView] or other widget.
     *
     * The [signal@Gtk.SignalListItemFactory::unbind] signal is the
     * opposite of this signal and can be used to undo everything done
     * in this signal.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `object` The `GObject` to bind
     */
    public fun onBind(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (`object`: Object) -> Unit): ULong =
        g_signal_connect_data(
            gtkSignalListItemFactoryPointer,
            "bind",
            onBindFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "bind" signal. See [onBind].
     *
     * @param object The `GObject` to bind
     */
    public fun emitBind(`object`: Object) {
        g_signal_emit_by_name(gtkSignalListItemFactoryPointer.reinterpret(), "bind", `object`.gobjectObjectPointer)
    }

    /**
     * Emitted when a new listitem has been created and needs to be setup for use.
     *
     * It is the first signal emitted for every listitem.
     *
     * The [signal@Gtk.SignalListItemFactory::teardown] signal is the opposite
     * of this signal and can be used to undo everything done in this signal.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `object` The `GObject` to set up
     */
    public fun onSetup(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (`object`: Object) -> Unit): ULong =
        g_signal_connect_data(
            gtkSignalListItemFactoryPointer,
            "setup",
            onSetupFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "setup" signal. See [onSetup].
     *
     * @param object The `GObject` to set up
     */
    public fun emitSetup(`object`: Object) {
        g_signal_emit_by_name(gtkSignalListItemFactoryPointer.reinterpret(), "setup", `object`.gobjectObjectPointer)
    }

    /**
     * Emitted when an object is about to be destroyed.
     *
     * It is the last signal ever emitted for this @object.
     *
     * This signal is the opposite of the [signal@Gtk.SignalListItemFactory::setup]
     * signal and should be used to undo everything done in that signal.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `object` The `GObject` to tear down
     */
    public fun onTeardown(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (`object`: Object) -> Unit): ULong =
        g_signal_connect_data(
            gtkSignalListItemFactoryPointer,
            "teardown",
            onTeardownFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "teardown" signal. See [onTeardown].
     *
     * @param object The `GObject` to tear down
     */
    public fun emitTeardown(`object`: Object) {
        g_signal_emit_by_name(gtkSignalListItemFactoryPointer.reinterpret(), "teardown", `object`.gobjectObjectPointer)
    }

    /**
     * Emitted when an object has been unbound from its item, for example when
     * a listitem was removed from use in a list widget
     * and its [property@Gtk.ListItem:item] is about to be unset.
     *
     * This signal is the opposite of the [signal@Gtk.SignalListItemFactory::bind]
     * signal and should be used to undo everything done in that signal.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `object` The `GObject` to unbind
     */
    public fun onUnbind(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (`object`: Object) -> Unit): ULong =
        g_signal_connect_data(
            gtkSignalListItemFactoryPointer,
            "unbind",
            onUnbindFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "unbind" signal. See [onUnbind].
     *
     * @param object The `GObject` to unbind
     */
    public fun emitUnbind(`object`: Object) {
        g_signal_emit_by_name(gtkSignalListItemFactoryPointer.reinterpret(), "unbind", `object`.gobjectObjectPointer)
    }

    public companion object : TypeCompanion<SignalListItemFactory> {
        override val type: GeneratedClassKGType<SignalListItemFactory> =
            GeneratedClassKGType(gtk_signal_list_item_factory_get_type()) {
                SignalListItemFactory(it.reinterpret())
            }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of SignalListItemFactory
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_signal_list_item_factory_get_type()
    }
}

private val onBindFunc: CPointer<CFunction<(CPointer<GObject>) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        `object`: CPointer<GObject>?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(`object`: Object) -> Unit>().get().invoke(
        `object`!!.run {
            Object(this)
        }
    )
}
    .reinterpret()

private val onSetupFunc: CPointer<CFunction<(CPointer<GObject>) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        `object`: CPointer<GObject>?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(`object`: Object) -> Unit>().get().invoke(
        `object`!!.run {
            Object(this)
        }
    )
}
    .reinterpret()

private val onTeardownFunc: CPointer<CFunction<(CPointer<GObject>) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        `object`: CPointer<GObject>?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(`object`: Object) -> Unit>().get().invoke(
        `object`!!.run {
            Object(this)
        }
    )
}
    .reinterpret()

private val onUnbindFunc: CPointer<CFunction<(CPointer<GObject>) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        `object`: CPointer<GObject>?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(`object`: Object) -> Unit>().get().invoke(
        `object`!!.run {
            Object(this)
        }
    )
}
    .reinterpret()
