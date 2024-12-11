// This is a generated file. Do not modify.
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
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GObject
import org.gtkkn.native.gobject.GSignalGroup
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_group_block
import org.gtkkn.native.gobject.g_signal_group_connect
import org.gtkkn.native.gobject.g_signal_group_connect_after
import org.gtkkn.native.gobject.g_signal_group_connect_closure
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
 * - parameter `notify`: ClosureNotify
 * - parameter `c_handler`: Callback
 * - method `target`: Property has no getter
 * - method `target-type`: Property has no getter nor setter
 *
 * @since 2.72
 */
@GObjectVersion2_72
public open class SignalGroup(pointer: CPointer<GSignalGroup>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val gobjectSignalGroupPointer: CPointer<GSignalGroup>
        get() = gPointer.reinterpret()

    /**
     * Creates a new #GSignalGroup for target instances of @target_type.
     *
     * @param targetType the #GType of the target instance.
     * @return a new #GSignalGroup
     * @since 2.72
     */
    public constructor(targetType: GType) : this(g_signal_group_new(targetType)!!.reinterpret())

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
    public open fun block(): Unit = g_signal_group_block(gobjectSignalGroupPointer.reinterpret())

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
        gobjectSignalGroupPointer.reinterpret(),
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
        gobjectSignalGroupPointer.reinterpret(),
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
            gobjectSignalGroupPointer.reinterpret(),
            detailedSignal,
            closure.gobjectClosurePointer.reinterpret(),
            after.asGBoolean()
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
        gobjectSignalGroupPointer.reinterpret(),
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
    public open fun dupTarget(): Object? = g_signal_group_dup_target(gobjectSignalGroupPointer.reinterpret())?.run {
        Object(reinterpret())
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
        g_signal_group_set_target(gobjectSignalGroupPointer.reinterpret(), target?.gPointer?.reinterpret())

    /**
     * Unblocks all signal handlers managed by @self so they will be
     * called again during any signal emissions unless it is blocked
     * again. Must be unblocked exactly the same number of times it
     * has been blocked to become active again.
     *
     * @since 2.72
     */
    @GObjectVersion2_72
    public open fun unblock(): Unit = g_signal_group_unblock(gobjectSignalGroupPointer.reinterpret())

    /**
     * This signal is emitted when #GSignalGroup:target is set to a new value
     * other than null. It is similar to #GObject::notify on `target` except it
     * will not emit when #GSignalGroup:target is null and also allows for
     * receiving the #GObject without a data-race.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `instance` a #GObject containing the new value for #GSignalGroup:target
     * @since 2.72
     */
    @GObjectVersion2_72
    public fun connectBind(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (instance: Object) -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "bind",
            connectBindFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * This signal is emitted when the target instance of @self is set to a
     * new #GObject.
     *
     * This signal will only be emitted if the previous target of @self is
     * non-null.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 2.72
     */
    @GObjectVersion2_72
    public fun connectUnbind(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "unbind",
            connectUnbindFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<SignalGroup> {
        override val type: GeneratedClassKGType<SignalGroup> =
            GeneratedClassKGType(g_signal_group_get_type()) { SignalGroup(it.reinterpret()) }

        init {
            GobjectTypeProvider.register()
        }

        /**
         * Get the GType of SignalGroup
         *
         * @return the GType
         */
        public fun getType(): GType = g_signal_group_get_type()
    }
}

private val connectBindFunc: CPointer<CFunction<(CPointer<GObject>) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        instance: CPointer<GObject>?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(instance: Object) -> Unit>().get().invoke(
        instance!!.run {
            Object(reinterpret())
        }
    )
}
    .reinterpret()

private val connectUnbindFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
