// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gio.annotations.GioVersion2_28
import org.gtkkn.bindings.gio.annotations.GioVersion2_30
import org.gtkkn.bindings.gio.annotations.GioVersion2_44
import org.gtkkn.bindings.glib.Variant
import org.gtkkn.bindings.glib.VariantType
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GAction
import org.gtkkn.native.gio.GSimpleAction
import org.gtkkn.native.gio.g_simple_action_get_type
import org.gtkkn.native.gio.g_simple_action_new
import org.gtkkn.native.gio.g_simple_action_new_stateful
import org.gtkkn.native.gio.g_simple_action_set_enabled
import org.gtkkn.native.gio.g_simple_action_set_state
import org.gtkkn.native.gio.g_simple_action_set_state_hint
import org.gtkkn.native.glib.GVariant
import org.gtkkn.native.gobject.g_signal_connect_data
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * A `GSimpleAction` is the obvious simple implementation of the
 * [iface@Gio.Action] interface. This is the easiest way to create an action for
 * purposes of adding it to a [class@Gio.SimpleActionGroup].
 *
 * ## Skipped during bindings generation
 *
 * - method `enabled`: Property has no getter
 * - method `name`: Property has no getter nor setter
 * - method `parameter-type`: Property has no getter nor setter
 * - method `state`: Property has no getter
 * - method `state-type`: Property has no getter nor setter
 */
public open class SimpleAction(
    pointer: CPointer<GSimpleAction>,
) : Object(pointer.reinterpret()),
    Action,
    KGTyped {
    public val gioSimpleActionPointer: CPointer<GSimpleAction>
        get() = gPointer.reinterpret()

    override val gioActionPointer: CPointer<GAction>
        get() = gPointer.reinterpret()

    /**
     * Creates a new action.
     *
     * The created action is stateless. See g_simple_action_new_stateful() to create
     * an action that has state.
     *
     * @param name the name of the action
     * @param parameterType the type of parameter that will be passed to
     *   handlers for the #GSimpleAction::activate signal, or null for no parameter
     * @return a new #GSimpleAction
     * @since 2.28
     */
    public constructor(
        name: String,
        parameterType: VariantType? = null,
    ) : this(g_simple_action_new(name, parameterType?.glibVariantTypePointer)!!.reinterpret())

    /**
     * Creates a new stateful action.
     *
     * All future state values must have the same #GVariantType as the initial
     * @state.
     *
     * If the @state #GVariant is floating, it is consumed.
     *
     * @param name the name of the action
     * @param parameterType the type of the parameter that will be passed to
     *   handlers for the #GSimpleAction::activate signal, or null for no parameter
     * @param state the initial state of the action
     * @return a new #GSimpleAction
     * @since 2.28
     */
    public constructor(
        name: String,
        parameterType: VariantType? = null,
        state: Variant,
    ) : this(
        g_simple_action_new_stateful(
            name,
            parameterType?.glibVariantTypePointer,
            state.glibVariantPointer
        )!!.reinterpret()
    )

    /**
     * Sets the action as enabled or not.
     *
     * An action must be enabled in order to be activated or in order to
     * have its state changed from outside callers.
     *
     * This should only be called by the implementor of the action.  Users
     * of the action should not attempt to modify its enabled flag.
     *
     * @param enabled whether the action is enabled
     * @since 2.28
     */
    @GioVersion2_28
    public open fun setEnabled(enabled: Boolean): Unit =
        g_simple_action_set_enabled(gioSimpleActionPointer.reinterpret(), enabled.asGBoolean())

    /**
     * Sets the state of the action.
     *
     * This directly updates the 'state' property to the given value.
     *
     * This should only be called by the implementor of the action.  Users
     * of the action should not attempt to directly modify the 'state'
     * property.  Instead, they should call g_action_change_state() to
     * request the change.
     *
     * If the @value GVariant is floating, it is consumed.
     *
     * @param value the new #GVariant for the state
     * @since 2.30
     */
    @GioVersion2_30
    public open fun setState(`value`: Variant): Unit =
        g_simple_action_set_state(gioSimpleActionPointer.reinterpret(), `value`.glibVariantPointer)

    /**
     * Sets the state hint for the action.
     *
     * See g_action_get_state_hint() for more information about
     * action state hints.
     *
     * @param stateHint a #GVariant representing the state hint
     * @since 2.44
     */
    @GioVersion2_44
    public open fun setStateHint(stateHint: Variant? = null): Unit =
        g_simple_action_set_state_hint(gioSimpleActionPointer.reinterpret(), stateHint?.glibVariantPointer)

    /**
     * Indicates that the action was just activated.
     *
     * @parameter will always be of the expected type, i.e. the parameter type
     * specified when the action was created. If an incorrect type is given when
     * activating the action, this signal is not emitted.
     *
     * Since GLib 2.40, if no handler is connected to this signal then the
     * default behaviour for boolean-stated actions with a null parameter
     * type is to toggle them via the #GSimpleAction::change-state signal.
     * For stateful actions where the state type is equal to the parameter
     * type, the default is to forward them directly to
     * #GSimpleAction::change-state.  This should allow almost all users
     * of #GSimpleAction to connect only one handler or the other.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `parameter` the parameter to the activation, or null if it has
     *   no parameter
     * @since 2.28
     */
    @GioVersion2_28
    public fun connectActivate(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (parameter: Variant?) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "activate",
            connectActivateFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Indicates that the action just received a request to change its
     * state.
     *
     * @value will always be of the correct state type, i.e. the type of the
     * initial state passed to g_simple_action_new_stateful(). If an incorrect
     * type is given when requesting to change the state, this signal is not
     * emitted.
     *
     * If no handler is connected to this signal then the default
     * behaviour is to call g_simple_action_set_state() to set the state
     * to the requested value. If you connect a signal handler then no
     * default action is taken. If the state should change then you must
     * call g_simple_action_set_state() from the handler.
     *
     * An example of a 'change-state' handler:
     * |[<!-- language="C" -->
     * static void
     * change_volume_state (GSimpleAction *action,
     *                      GVariant      *value,
     *                      gpointer       user_data)
     * {
     *   gint requested;
     *
     *   requested = g_variant_get_int32 (value);
     *
     *   // Volume only goes from 0 to 10
     *   if (0 <= requested && requested <= 10)
     *     g_simple_action_set_state (action, value);
     * }
     * ]|
     *
     * The handler need not set the state to the requested value.
     * It could set it to any value at all, or take some other action.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `value` the requested value for the state
     * @since 2.30
     */
    @GioVersion2_30
    public fun connectChangeState(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (`value`: Variant?) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "change-state",
            connectChangeStateFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<SimpleAction> {
        override val type: GeneratedClassKGType<SimpleAction> =
            GeneratedClassKGType(g_simple_action_get_type()) { SimpleAction(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }
    }
}

private val connectActivateFunc: CPointer<CFunction<(CPointer<GVariant>?) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            parameter: CPointer<GVariant>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(parameter: Variant?) -> Unit>().get().invoke(
            parameter?.run {
                Variant(reinterpret())
            }
        )
    }.reinterpret()

private val connectChangeStateFunc: CPointer<CFunction<(CPointer<GVariant>?) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            `value`: CPointer<GVariant>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(`value`: Variant?) -> Unit>().get().invoke(
            `value`?.run {
                Variant(reinterpret())
            }
        )
    }.reinterpret()
