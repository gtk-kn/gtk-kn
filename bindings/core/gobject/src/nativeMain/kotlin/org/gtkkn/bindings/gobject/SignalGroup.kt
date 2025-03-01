// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gobject.annotations.GObjectVersion2_72
import org.gtkkn.bindings.gobject.annotations.GObjectVersion2_74
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GSignalGroup
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gobject.g_signal_group_block
import org.gtkkn.native.gobject.g_signal_group_connect
import org.gtkkn.native.gobject.g_signal_group_connect_after
import org.gtkkn.native.gobject.g_signal_group_connect_closure
import org.gtkkn.native.gobject.g_signal_group_connect_data
import org.gtkkn.native.gobject.g_signal_group_connect_swapped
import org.gtkkn.native.gobject.g_signal_group_dup_target
import org.gtkkn.native.gobject.g_signal_group_get_type
import org.gtkkn.native.gobject.g_signal_group_new
import org.gtkkn.native.gobject.g_signal_group_set_target
import org.gtkkn.native.gobject.g_signal_group_unblock
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * `GSignalGroup` manages a collection of signals on a `GObject`.
 *
 * `GSignalGroup` simplifies the process of connecting  many signals to a `GObject`
 * as a group. As such there is no API to disconnect a signal from the group.
 *
 * In particular, this allows you to:
 *
 *  - Change the target instance, which automatically causes disconnection
 *    of the signals from the old instance and connecting to the new instance.
 *  - Block and unblock signals as a group
 *  - Ensuring that blocked state transfers across target instances.
 *
 * One place you might want to use such a structure is with `GtkTextView` and
 * `GtkTextBuffer`. Often times, you'll need to connect to many signals on
 * `GtkTextBuffer` from a `GtkTextView` subclass. This allows you to create a
 * signal group during instance construction, simply bind the
 * `GtkTextView:buffer` property to `GSignalGroup:target` and connect
 * all the signals you need. When the `GtkTextView:buffer` property changes
 * all of the signals will be transitioned correctly.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `c_handler`: Callback
 * - method `target`: Property has no getter
 * - method `target-type`: Property has no getter nor setter
 *
 * @since 2.72
 */
@GObjectVersion2_72
public open class SignalGroup(public val gobjectSignalGroupPointer: CPointer<GSignalGroup>) :
    Object(gobjectSignalGroupPointer.reinterpret()),
    KGTyped {
    init {
        GObject
    }

    /**
     * Creates a new #GSignalGroup for target instances of @target_type.
     *
     * @param targetType the #GType of the target instance.
     * @return a new #GSignalGroup
     * @since 2.72
     */
    public constructor(targetType: GType) : this(g_signal_group_new(targetType)!!) {
        InstanceCache.put(this)
    }

    /**
     * Blocks all signal handlers managed by @self so they will not
     * be called during any signal emissions. Must be unblocked exactly
     * the same number of times it has been blocked to become active again.
     *
     * This blocked state will be kept across changes of the target instance.
     *
     * @since 2.72
     */
    @GObjectVersion2_72
    public open fun block(): Unit = g_signal_group_block(gobjectSignalGroupPointer)

    /**
     * Connects @c_handler to the signal @detailed_signal
     * on the target instance of @self.
     *
     * You cannot connect a signal handler after #GSignalGroup:target has been set.
     *
     * @param detailedSignal a string of the form "signal-name::detail"
     * @param cHandler the #GCallback to connect
     * @since 2.72
     */
    @GObjectVersion2_72
    public open fun connect(detailedSignal: String, cHandler: Callback): Unit = g_signal_group_connect(
        gobjectSignalGroupPointer,
        detailedSignal,
        CallbackFunc.reinterpret(),
        StableRef.create(cHandler).asCPointer()
    )

    /**
     * Connects @c_handler to the signal @detailed_signal
     * on the target instance of @self.
     *
     * The @c_handler will be called after the default handler of the signal.
     *
     * You cannot connect a signal handler after #GSignalGroup:target has been set.
     *
     * @param detailedSignal a string of the form "signal-name::detail"
     * @param cHandler the #GCallback to connect
     * @since 2.72
     */
    @GObjectVersion2_72
    public open fun connectAfter(detailedSignal: String, cHandler: Callback): Unit = g_signal_group_connect_after(
        gobjectSignalGroupPointer,
        detailedSignal,
        CallbackFunc.reinterpret(),
        StableRef.create(cHandler).asCPointer()
    )

    /**
     * Connects @closure to the signal @detailed_signal on #GSignalGroup:target.
     *
     * You cannot connect a signal handler after #GSignalGroup:target has been set.
     *
     * @param detailedSignal a string of the form `signal-name` with optional `::signal-detail`
     * @param closure the closure to connect.
     * @param after whether the handler should be called before or after the
     *  default handler of the signal.
     * @since 2.74
     */
    @GObjectVersion2_74
    public open fun connectClosure(detailedSignal: String, closure: Closure, after: Boolean): Unit =
        g_signal_group_connect_closure(
            gobjectSignalGroupPointer,
            detailedSignal,
            closure.gobjectClosurePointer,
            after.asGBoolean()
        )

    /**
     * Connects @c_handler to the signal @detailed_signal
     * on the target instance of @self.
     *
     * You cannot connect a signal handler after #GSignalGroup:target has been set.
     *
     * @param detailedSignal a string of the form "signal-name::detail"
     * @param cHandler the #GCallback to connect
     * @param flags the flags used to create the signal connection
     * @since 2.72
     */
    @GObjectVersion2_72
    public open fun connectData(detailedSignal: String, cHandler: Callback, flags: ConnectFlags): Unit =
        g_signal_group_connect_data(
            gobjectSignalGroupPointer,
            detailedSignal,
            CallbackFunc.reinterpret(),
            StableRef.create(cHandler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            flags.mask
        )

    /**
     * Connects @c_handler to the signal @detailed_signal
     * on the target instance of @self.
     *
     * The instance on which the signal is emitted and @data
     * will be swapped when calling @c_handler.
     *
     * You cannot connect a signal handler after #GSignalGroup:target has been set.
     *
     * @param detailedSignal a string of the form "signal-name::detail"
     * @param cHandler the #GCallback to connect
     * @since 2.72
     */
    @GObjectVersion2_72
    public open fun connectSwapped(detailedSignal: String, cHandler: Callback): Unit = g_signal_group_connect_swapped(
        gobjectSignalGroupPointer,
        detailedSignal,
        CallbackFunc.reinterpret(),
        StableRef.create(cHandler).asCPointer()
    )

    /**
     * Gets the target instance used when connecting signals.
     *
     * @return The target instance
     * @since 2.72
     */
    @GObjectVersion2_72
    public open fun dupTarget(): Object? = g_signal_group_dup_target(gobjectSignalGroupPointer)?.run {
        InstanceCache.get(reinterpret(), true) { Object(reinterpret()) }!!
    }

    /**
     * Sets the target instance used when connecting signals. Any signal
     * that has been registered with g_signal_group_connect_object() or
     * similar functions will be connected to this object.
     *
     * If the target instance was previously set, signals will be
     * disconnected from that object prior to connecting to @target.
     *
     * @param target The target instance used
     *     when connecting signals.
     * @since 2.72
     */
    @GObjectVersion2_72
    public open fun setTarget(target: Object? = null): Unit =
        g_signal_group_set_target(gobjectSignalGroupPointer, target?.gobjectObjectPointer?.reinterpret())

    /**
     * Unblocks all signal handlers managed by @self so they will be
     * called again during any signal emissions unless it is blocked
     * again. Must be unblocked exactly the same number of times it
     * has been blocked to become active again.
     *
     * @since 2.72
     */
    @GObjectVersion2_72
    public open fun unblock(): Unit = g_signal_group_unblock(gobjectSignalGroupPointer)

    /**
     * This signal is emitted when #GSignalGroup:target is set to a new value
     * other than null. It is similar to #GObject::notify on `target` except it
     * will not emit when #GSignalGroup:target is null and also allows for
     * receiving the #GObject without a data-race.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `instance` a #GObject containing the new value for #GSignalGroup:target
     * @since 2.72
     */
    @GObjectVersion2_72
    public fun onBind(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (instance: Object) -> Unit): ULong =
        g_signal_connect_data(
            gobjectSignalGroupPointer,
            "bind",
            onBindFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "bind" signal. See [onBind].
     *
     * @param instance a #GObject containing the new value for #GSignalGroup:target
     * @since 2.72
     */
    @GObjectVersion2_72
    public fun emitBind(instance: Object) {
        g_signal_emit_by_name(gobjectSignalGroupPointer.reinterpret(), "bind", instance.gobjectObjectPointer)
    }

    /**
     * This signal is emitted when the target instance of @self is set to a
     * new #GObject.
     *
     * This signal will only be emitted if the previous target of @self is
     * non-null.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 2.72
     */
    @GObjectVersion2_72
    public fun onUnbind(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gobjectSignalGroupPointer,
            "unbind",
            onUnbindFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "unbind" signal. See [onUnbind].
     *
     * @since 2.72
     */
    @GObjectVersion2_72
    public fun emitUnbind() {
        g_signal_emit_by_name(gobjectSignalGroupPointer.reinterpret(), "unbind")
    }

    public companion object : TypeCompanion<SignalGroup> {
        override val type: GeneratedClassKGType<SignalGroup> =
            GeneratedClassKGType(getTypeOrNull()!!) { SignalGroup(it.reinterpret()) }

        init {
            GObjectTypeProvider.register()
        }

        /**
         * Get the GType of SignalGroup
         *
         * @return the GType
         */
        public fun getType(): GType = g_signal_group_get_type()

        /**
         * Gets the GType of from the symbol `g_signal_group_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("g_signal_group_get_type")
    }
}

private val onBindFunc: CPointer<CFunction<(CPointer<org.gtkkn.native.gobject.GObject>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            instance: CPointer<org.gtkkn.native.gobject.GObject>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(instance: Object) -> Unit>().get().invoke(
            instance!!.run {
                InstanceCache.get(this, false) { Object(reinterpret()) }!!
            }
        )
    }
        .reinterpret()

private val onUnbindFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
