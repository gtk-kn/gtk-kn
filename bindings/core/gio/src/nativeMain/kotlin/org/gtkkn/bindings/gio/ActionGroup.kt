// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.annotations.GioVersion2_28
import org.gtkkn.bindings.glib.Variant
import org.gtkkn.bindings.glib.VariantType
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.ext.toKStringList
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GActionGroup
import org.gtkkn.native.gio.g_action_group_action_added
import org.gtkkn.native.gio.g_action_group_action_enabled_changed
import org.gtkkn.native.gio.g_action_group_action_removed
import org.gtkkn.native.gio.g_action_group_action_state_changed
import org.gtkkn.native.gio.g_action_group_activate_action
import org.gtkkn.native.gio.g_action_group_change_action_state
import org.gtkkn.native.gio.g_action_group_get_action_enabled
import org.gtkkn.native.gio.g_action_group_get_action_parameter_type
import org.gtkkn.native.gio.g_action_group_get_action_state
import org.gtkkn.native.gio.g_action_group_get_action_state_hint
import org.gtkkn.native.gio.g_action_group_get_action_state_type
import org.gtkkn.native.gio.g_action_group_get_type
import org.gtkkn.native.gio.g_action_group_has_action
import org.gtkkn.native.gio.g_action_group_list_actions
import org.gtkkn.native.glib.GVariant
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.gboolean
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit
import kotlin.collections.List

/**
 * `GActionGroup` represents a group of actions.
 *
 * Actions can be used to expose functionality in a structured way, either
 * from one part of a program to another, or to the outside world. Action
 * groups are often used together with a `GMenuModel` that provides additional
 * representation data for displaying the actions to the user, e.g. in a menu.
 *
 * The main way to interact with the actions in a `GActionGroup` is to
 * activate them with [method@Gio.ActionGroup.activate_action]. Activating an
 * action may require a `GVariant` parameter. The required type of the
 * parameter can be inquired with [method@Gio.ActionGroup.get_action_parameter_type].
 * Actions may be disabled, see [method@Gio.ActionGroup.get_action_enabled].
 * Activating a disabled action has no effect.
 *
 * Actions may optionally have a state in the form of a #GVariant. The current
 * state of an action can be inquired with [method@Gio.ActionGroup.get_action_state].
 * Activating a stateful action may change its state, but it is also possible to
 * set the state by calling [method@Gio.ActionGroup.change_action_state].
 *
 * As typical example, consider a text editing application which has an
 * option to change the current font to 'bold'. A good way to represent
 * this would be a stateful action, with a boolean state. Activating the
 * action would toggle the state.
 *
 * Each action in the group has a unique name (which is a string).  All
 * method calls, except [method@Gio.ActionGroup.list_actions] take the name of
 * an action as an argument.
 *
 * The `GActionGroup` API is meant to be the 'public' API to the action
 * group. The calls here are exactly the interaction that 'external
 * forces' (eg: UI, incoming D-Bus messages, etc.) are supposed to have
 * with actions. 'Internal' APIs (ie: ones meant only to be accessed by
 * the action group implementation) are found on subclasses. This is
 * why you will find - for example - [method@Gio.ActionGroup.get_action_enabled]
 * but not an equivalent set() call.
 *
 * Signals are emitted on the action group in response to state changes
 * on individual actions.
 *
 * Implementations of `GActionGroup` should provide implementations for
 * the virtual functions [method@Gio.ActionGroup.list_actions] and
 * [method@Gio.ActionGroup.query_action]. The other virtual functions should
 * not be implemented - their "wrappers" are actually implemented with
 * calls to [method@Gio.ActionGroup.query_action].
 *
 * ## Skipped during bindings generation
 *
 * - parameter `enabled`: enabled: Out parameter is not supported
 */
public interface ActionGroup :
    Interface,
    KGTyped {
    public val gioActionGroupPointer: CPointer<GActionGroup>

    /**
     * Emits the #GActionGroup::action-added signal on @action_group.
     *
     * This function should only be called by #GActionGroup implementations.
     *
     * @param actionName the name of an action in the group
     * @since 2.28
     */
    @GioVersion2_28
    public fun actionAdded(actionName: String): Unit =
        g_action_group_action_added(gioActionGroupPointer.reinterpret(), actionName)

    /**
     * Emits the #GActionGroup::action-enabled-changed signal on @action_group.
     *
     * This function should only be called by #GActionGroup implementations.
     *
     * @param actionName the name of an action in the group
     * @param enabled whether or not the action is now enabled
     * @since 2.28
     */
    @GioVersion2_28
    public fun actionEnabledChanged(actionName: String, enabled: Boolean): Unit =
        g_action_group_action_enabled_changed(gioActionGroupPointer.reinterpret(), actionName, enabled.asGBoolean())

    /**
     * Emits the #GActionGroup::action-removed signal on @action_group.
     *
     * This function should only be called by #GActionGroup implementations.
     *
     * @param actionName the name of an action in the group
     * @since 2.28
     */
    @GioVersion2_28
    public fun actionRemoved(actionName: String): Unit =
        g_action_group_action_removed(gioActionGroupPointer.reinterpret(), actionName)

    /**
     * Emits the #GActionGroup::action-state-changed signal on @action_group.
     *
     * This function should only be called by #GActionGroup implementations.
     *
     * @param actionName the name of an action in the group
     * @param state the new state of the named action
     * @since 2.28
     */
    @GioVersion2_28
    public fun actionStateChanged(actionName: String, state: Variant): Unit = g_action_group_action_state_changed(
        gioActionGroupPointer.reinterpret(),
        actionName,
        state.glibVariantPointer.reinterpret()
    )

    /**
     * Activate the named action within @action_group.
     *
     * If the action is expecting a parameter, then the correct type of
     * parameter must be given as @parameter.  If the action is expecting no
     * parameters then @parameter must be null.  See
     * g_action_group_get_action_parameter_type().
     *
     * If the #GActionGroup implementation supports asynchronous remote
     * activation over D-Bus, this call may return before the relevant
     * D-Bus traffic has been sent, or any replies have been received. In
     * order to block on such asynchronous activation calls,
     * g_dbus_connection_flush() should be called prior to the code, which
     * depends on the result of the action activation. Without flushing
     * the D-Bus connection, there is no guarantee that the action would
     * have been activated.
     *
     * The following code which runs in a remote app instance, shows an
     * example of a "quit" action being activated on the primary app
     * instance over D-Bus. Here g_dbus_connection_flush() is called
     * before `exit()`. Without g_dbus_connection_flush(), the "quit" action
     * may fail to be activated on the primary instance.
     *
     * |[<!-- language="C" -->
     * // call "quit" action on primary instance
     * g_action_group_activate_action (G_ACTION_GROUP (app), "quit", NULL);
     *
     * // make sure the action is activated now
     * g_dbus_connection_flush (...);
     *
     * g_debug ("application has been terminated. exiting.");
     *
     * exit (0);
     * ]|
     *
     * @param actionName the name of the action to activate
     * @param parameter parameters to the activation
     * @since 2.28
     */
    @GioVersion2_28
    public fun activateAction(actionName: String, parameter: Variant? = null): Unit = g_action_group_activate_action(
        gioActionGroupPointer.reinterpret(),
        actionName,
        parameter?.glibVariantPointer?.reinterpret()
    )

    /**
     * Request for the state of the named action within @action_group to be
     * changed to @value.
     *
     * The action must be stateful and @value must be of the correct type.
     * See g_action_group_get_action_state_type().
     *
     * This call merely requests a change.  The action may refuse to change
     * its state or may change its state to something other than @value.
     * See g_action_group_get_action_state_hint().
     *
     * If the @value GVariant is floating, it is consumed.
     *
     * @param actionName the name of the action to request the change on
     * @param value the new state
     * @since 2.28
     */
    @GioVersion2_28
    public fun changeActionState(actionName: String, `value`: Variant): Unit = g_action_group_change_action_state(
        gioActionGroupPointer.reinterpret(),
        actionName,
        `value`.glibVariantPointer.reinterpret()
    )

    /**
     * Checks if the named action within @action_group is currently enabled.
     *
     * An action must be enabled in order to be activated or in order to
     * have its state changed from outside callers.
     *
     * @param actionName the name of the action to query
     * @return whether or not the action is currently enabled
     * @since 2.28
     */
    @GioVersion2_28
    public fun getActionEnabled(actionName: String): Boolean =
        g_action_group_get_action_enabled(gioActionGroupPointer.reinterpret(), actionName).asBoolean()

    /**
     * Queries the type of the parameter that must be given when activating
     * the named action within @action_group.
     *
     * When activating the action using g_action_group_activate_action(),
     * the #GVariant given to that function must be of the type returned
     * by this function.
     *
     * In the case that this function returns null, you must not give any
     * #GVariant, but null instead.
     *
     * The parameter type of a particular action will never change but it is
     * possible for an action to be removed and for a new action to be added
     * with the same name but a different parameter type.
     *
     * @param actionName the name of the action to query
     * @return the parameter type
     * @since 2.28
     */
    @GioVersion2_28
    public fun getActionParameterType(actionName: String): VariantType? =
        g_action_group_get_action_parameter_type(gioActionGroupPointer.reinterpret(), actionName)?.run {
            VariantType(reinterpret())
        }

    /**
     * Queries the current state of the named action within @action_group.
     *
     * If the action is not stateful then null will be returned.  If the
     * action is stateful then the type of the return value is the type
     * given by g_action_group_get_action_state_type().
     *
     * The return value (if non-null) should be freed with
     * g_variant_unref() when it is no longer required.
     *
     * @param actionName the name of the action to query
     * @return the current state of the action
     * @since 2.28
     */
    @GioVersion2_28
    public fun getActionState(actionName: String): Variant? =
        g_action_group_get_action_state(gioActionGroupPointer.reinterpret(), actionName)?.run {
            Variant(reinterpret())
        }

    /**
     * Requests a hint about the valid range of values for the state of the
     * named action within @action_group.
     *
     * If null is returned it either means that the action is not stateful
     * or that there is no hint about the valid range of values for the
     * state of the action.
     *
     * If a #GVariant array is returned then each item in the array is a
     * possible value for the state.  If a #GVariant pair (ie: two-tuple) is
     * returned then the tuple specifies the inclusive lower and upper bound
     * of valid values for the state.
     *
     * In any case, the information is merely a hint.  It may be possible to
     * have a state value outside of the hinted range and setting a value
     * within the range may fail.
     *
     * The return value (if non-null) should be freed with
     * g_variant_unref() when it is no longer required.
     *
     * @param actionName the name of the action to query
     * @return the state range hint
     * @since 2.28
     */
    @GioVersion2_28
    public fun getActionStateHint(actionName: String): Variant? =
        g_action_group_get_action_state_hint(gioActionGroupPointer.reinterpret(), actionName)?.run {
            Variant(reinterpret())
        }

    /**
     * Queries the type of the state of the named action within
     * @action_group.
     *
     * If the action is stateful then this function returns the
     * #GVariantType of the state.  All calls to
     * g_action_group_change_action_state() must give a #GVariant of this
     * type and g_action_group_get_action_state() will return a #GVariant
     * of the same type.
     *
     * If the action is not stateful then this function will return null.
     * In that case, g_action_group_get_action_state() will return null
     * and you must not call g_action_group_change_action_state().
     *
     * The state type of a particular action will never change but it is
     * possible for an action to be removed and for a new action to be added
     * with the same name but a different state type.
     *
     * @param actionName the name of the action to query
     * @return the state type, if the action is stateful
     * @since 2.28
     */
    @GioVersion2_28
    public fun getActionStateType(actionName: String): VariantType? =
        g_action_group_get_action_state_type(gioActionGroupPointer.reinterpret(), actionName)?.run {
            VariantType(reinterpret())
        }

    /**
     * Checks if the named action exists within @action_group.
     *
     * @param actionName the name of the action to check for
     * @return whether the named action exists
     * @since 2.28
     */
    @GioVersion2_28
    public fun hasAction(actionName: String): Boolean =
        g_action_group_has_action(gioActionGroupPointer.reinterpret(), actionName).asBoolean()

    /**
     * Lists the actions contained within @action_group.
     *
     * The caller is responsible for freeing the list with g_strfreev() when
     * it is no longer required.
     *
     * @return a null-terminated array of the names of the
     * actions in the group
     * @since 2.28
     */
    @GioVersion2_28
    public fun listActions(): List<String> =
        g_action_group_list_actions(gioActionGroupPointer.reinterpret())?.toKStringList()
            ?: error("Expected not null string array")

    /**
     * Signals that a new action was just added to the group.
     * This signal is emitted after the action has been added
     * and is now visible.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `actionName` the name of the action in @action_group
     * @since 2.28
     */
    @GioVersion2_28
    public fun connectActionAdded(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (actionName: String) -> Unit,
    ): ULong = g_signal_connect_data(
        gioActionGroupPointer.reinterpret(),
        "action-added",
        connectActionAddedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Signals that the enabled status of the named action has changed.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `actionName` the name of the action in @action_group; `enabled` whether the action is enabled or not
     * @since 2.28
     */
    @GioVersion2_28
    public fun connectActionEnabledChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (actionName: String, enabled: Boolean) -> Unit,
    ): ULong = g_signal_connect_data(
        gioActionGroupPointer.reinterpret(),
        "action-enabled-changed",
        connectActionEnabledChangedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Signals that an action is just about to be removed from the group.
     * This signal is emitted before the action is removed, so the action
     * is still visible and can be queried from the signal handler.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `actionName` the name of the action in @action_group
     * @since 2.28
     */
    @GioVersion2_28
    public fun connectActionRemoved(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (actionName: String) -> Unit,
    ): ULong = g_signal_connect_data(
        gioActionGroupPointer.reinterpret(),
        "action-removed",
        connectActionRemovedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Signals that the state of the named action has changed.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `actionName` the name of the action in @action_group; `value` the new value of the state
     * @since 2.28
     */
    @GioVersion2_28
    public fun connectActionStateChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (actionName: String, `value`: Variant) -> Unit,
    ): ULong = g_signal_connect_data(
        gioActionGroupPointer.reinterpret(),
        "action-state-changed",
        connectActionStateChangedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    private data class Wrapper(private val pointer: CPointer<GActionGroup>) : ActionGroup {
        override val gioActionGroupPointer: CPointer<GActionGroup> = pointer
    }

    public companion object : TypeCompanion<ActionGroup> {
        override val type: GeneratedInterfaceKGType<ActionGroup> =
            GeneratedInterfaceKGType(g_action_group_get_type()) { Wrapper(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GActionGroup>): ActionGroup = Wrapper(pointer)

        /**
         * Get the GType of ActionGroup
         *
         * @return the GType
         */
        public fun getType(): GType = g_action_group_get_type()
    }
}

private val connectActionAddedFunc: CPointer<CFunction<(CPointer<ByteVar>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            actionName: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(actionName: String) -> Unit>().get().invoke(
            actionName?.toKString() ?: error("Expected not null string")
        )
    }
        .reinterpret()

private val connectActionEnabledChangedFunc:
    CPointer<CFunction<(CPointer<ByteVar>, gboolean) -> Unit>> = staticCFunction {
            _: COpaquePointer,
            actionName: CPointer<ByteVar>?,
            enabled: gboolean,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(actionName: String, enabled: Boolean) -> Unit>().get().invoke(
            actionName?.toKString() ?: error("Expected not null string"),
            enabled.asBoolean()
        )
    }
        .reinterpret()

private val connectActionRemovedFunc: CPointer<CFunction<(CPointer<ByteVar>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            actionName: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(actionName: String) -> Unit>().get().invoke(
            actionName?.toKString() ?: error("Expected not null string")
        )
    }
        .reinterpret()

private val connectActionStateChangedFunc:
    CPointer<CFunction<(CPointer<ByteVar>, CPointer<GVariant>) -> Unit>> = staticCFunction {
            _: COpaquePointer,
            actionName: CPointer<ByteVar>?,
            `value`: CPointer<GVariant>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(actionName: String, `value`: Variant) -> Unit>().get().invoke(
            actionName?.toKString() ?: error("Expected not null string"),
            `value`!!.run {
                Variant(reinterpret())
            }
        )
    }
        .reinterpret()
