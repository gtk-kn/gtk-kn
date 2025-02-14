// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.annotations.GioVersion2_28
import org.gtkkn.bindings.gio.annotations.GioVersion2_30
import org.gtkkn.bindings.gio.annotations.GioVersion2_38
import org.gtkkn.bindings.glib.Variant
import org.gtkkn.bindings.glib.VariantType
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.legacy.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gio.GAction
import org.gtkkn.native.gio.g_action_activate
import org.gtkkn.native.gio.g_action_change_state
import org.gtkkn.native.gio.g_action_get_enabled
import org.gtkkn.native.gio.g_action_get_name
import org.gtkkn.native.gio.g_action_get_parameter_type
import org.gtkkn.native.gio.g_action_get_state
import org.gtkkn.native.gio.g_action_get_state_hint
import org.gtkkn.native.gio.g_action_get_state_type
import org.gtkkn.native.gio.g_action_get_type
import org.gtkkn.native.gio.g_action_name_is_valid
import org.gtkkn.native.gio.g_action_print_detailed_name
import org.gtkkn.native.gobject.GType
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * `GAction` represents a single named action.
 *
 * The main interface to an action is that it can be activated with
 * [method@Gio.Action.activate]. This results in the 'activate' signal being
 * emitted. An activation has a `GVariant` parameter (which may be
 * `NULL`). The correct type for the parameter is determined by a static
 * parameter type (which is given at construction time).
 *
 * An action may optionally have a state, in which case the state may be
 * set with [method@Gio.Action.change_state]. This call takes a [type@GLib.Variant]. The
 * correct type for the state is determined by a static state type
 * (which is given at construction time).
 *
 * The state may have a hint associated with it, specifying its valid
 * range.
 *
 * `GAction` is merely the interface to the concept of an action, as
 * described above.  Various implementations of actions exist, including
 * [class@Gio.SimpleAction].
 *
 * In all cases, the implementing class is responsible for storing the
 * name of the action, the parameter type, the enabled state, the optional
 * state type and the state and emitting the appropriate signals when these
 * change. The implementor is responsible for filtering calls to
 * [method@Gio.Action.activate] and [method@Gio.Action.change_state]
 * for type safety and for the state being enabled.
 *
 * Probably the only useful thing to do with a `GAction` is to put it
 * inside of a [class@Gio.SimpleActionGroup].
 *
 * ## Skipped during bindings generation
 *
 * - parameter `action_name`: action_name: Out parameter is not supported
 */
public interface Action :
    Proxy,
    KGTyped {
    public val gioActionPointer: CPointer<GAction>

    /**
     * If @action is currently enabled.
     *
     * If the action is disabled then calls to [method@Gio.Action.activate] and
     * [method@Gio.Action.change_state] have no effect.
     *
     * @since 2.28
     */
    @GioVersion2_28
    public val enabled: Boolean
        /**
         * Checks if @action is currently enabled.
         *
         * An action must be enabled in order to be activated or in order to
         * have its state changed from outside callers.
         *
         * @return whether the action is enabled
         * @since 2.28
         */
        get() = g_action_get_enabled(gioActionPointer).asBoolean()

    /**
     * The name of the action.  This is mostly meaningful for identifying
     * the action once it has been added to a [type@Gio.ActionGroup]. It is immutable.
     *
     * @since 2.28
     */
    @GioVersion2_28
    public val name: String
        /**
         * Queries the name of @action.
         *
         * @return the name of the action
         * @since 2.28
         */
        get() = g_action_get_name(gioActionPointer)?.toKString() ?: error("Expected not null string")

    /**
     * The type of the parameter that must be given when activating the
     * action. This is immutable, and may be `NULL` if no parameter is needed when
     * activating the action.
     *
     * @since 2.28
     */
    @GioVersion2_28
    public val parameterType: VariantType?
        /**
         * Queries the type of the parameter that must be given when activating
         * @action.
         *
         * When activating the action using [method@Gio.Action.activate], the
         * [type@GLib.Variant] given to that function must be of the type returned by
         * this function.
         *
         * In the case that this function returns `NULL`, you must not give any
         * [type@GLib.Variant], but `NULL` instead.
         *
         * @return the parameter type
         * @since 2.28
         */
        get() = g_action_get_parameter_type(gioActionPointer)?.run {
            VariantType(this)
        }

    /**
     * The state of the action, or `NULL` if the action is stateless.
     *
     * @since 2.28
     */
    @GioVersion2_28
    public val state: Variant?
        /**
         * Queries the current state of @action.
         *
         * If the action is not stateful then `NULL` will be returned.  If the
         * action is stateful then the type of the return value is the type
         * given by [method@Gio.Action.get_state_type].
         *
         * The return value (if non-`NULL`) should be freed with
         * [method@GLib.Variant.unref] when it is no longer required.
         *
         * @return the current state of the action
         * @since 2.28
         */
        get() = g_action_get_state(gioActionPointer)?.run {
            Variant(this)
        }

    /**
     * The [type@GLib.VariantType] of the state that the action has, or `NULL` if the
     * action is stateless. This is immutable.
     *
     * @since 2.28
     */
    @GioVersion2_28
    public val stateType: VariantType?
        /**
         * Queries the type of the state of @action.
         *
         * If the action is stateful (e.g. created with
         * [ctor@Gio.SimpleAction.new_stateful]) then this function returns the
         * [type@GLib.VariantType] of the state.  This is the type of the initial value
         * given as the state. All calls to [method@Gio.Action.change_state] must give a
         * [type@GLib.Variant] of this type and [method@Gio.Action.get_state] will return a
         * [type@GLib.Variant] of the same type.
         *
         * If the action is not stateful (e.g. created with [ctor@Gio.SimpleAction.new])
         * then this function will return `NULL`. In that case, [method@Gio.Action.get_state]
         * will return `NULL` and you must not call [method@Gio.Action.change_state].
         *
         * @return the state type, if the action is stateful
         * @since 2.28
         */
        get() = g_action_get_state_type(gioActionPointer)?.run {
            VariantType(this)
        }

    /**
     * Activates the action.
     *
     * @parameter must be the correct type of parameter for the action (ie:
     * the parameter type given at construction time).  If the parameter
     * type was `NULL` then @parameter must also be `NULL`.
     *
     * If the @parameter [type@GLib.Variant] is floating, it is consumed.
     *
     * @param parameter the parameter to the activation
     * @since 2.28
     */
    @GioVersion2_28
    public fun activate(parameter: Variant? = null): Unit =
        g_action_activate(gioActionPointer, parameter?.glibVariantPointer)

    /**
     * Request for the state of @action to be changed to @value.
     *
     * The action must be stateful and @value must be of the correct type.
     * See [method@Gio.Action.get_state_type].
     *
     * This call merely requests a change.  The action may refuse to change
     * its state or may change its state to something other than @value.
     * See [method@Gio.Action.get_state_hint].
     *
     * If the @value [type@GLib.Variant] is floating, it is consumed.
     *
     * @param value the new state
     * @since 2.30
     */
    @GioVersion2_30
    public fun changeState(`value`: Variant): Unit = g_action_change_state(gioActionPointer, `value`.glibVariantPointer)

    /**
     * Checks if @action is currently enabled.
     *
     * An action must be enabled in order to be activated or in order to
     * have its state changed from outside callers.
     *
     * @return whether the action is enabled
     * @since 2.28
     */
    @GioVersion2_28
    public fun getEnabled(): Boolean = g_action_get_enabled(gioActionPointer).asBoolean()

    /**
     * Queries the name of @action.
     *
     * @return the name of the action
     * @since 2.28
     */
    @GioVersion2_28
    public fun getName(): String = g_action_get_name(gioActionPointer)?.toKString() ?: error("Expected not null string")

    /**
     * Queries the type of the parameter that must be given when activating
     * @action.
     *
     * When activating the action using [method@Gio.Action.activate], the
     * [type@GLib.Variant] given to that function must be of the type returned by
     * this function.
     *
     * In the case that this function returns `NULL`, you must not give any
     * [type@GLib.Variant], but `NULL` instead.
     *
     * @return the parameter type
     * @since 2.28
     */
    @GioVersion2_28
    public fun getParameterType(): VariantType? = g_action_get_parameter_type(gioActionPointer)?.run {
        VariantType(this)
    }

    /**
     * Queries the current state of @action.
     *
     * If the action is not stateful then `NULL` will be returned.  If the
     * action is stateful then the type of the return value is the type
     * given by [method@Gio.Action.get_state_type].
     *
     * The return value (if non-`NULL`) should be freed with
     * [method@GLib.Variant.unref] when it is no longer required.
     *
     * @return the current state of the action
     * @since 2.28
     */
    @GioVersion2_28
    public fun getState(): Variant? = g_action_get_state(gioActionPointer)?.run {
        Variant(this)
    }

    /**
     * Requests a hint about the valid range of values for the state of
     * @action.
     *
     * If `NULL` is returned it either means that the action is not stateful
     * or that there is no hint about the valid range of values for the
     * state of the action.
     *
     * If a [type@GLib.Variant] array is returned then each item in the array is a
     * possible value for the state.  If a [type@GLib.Variant] pair (ie: two-tuple) is
     * returned then the tuple specifies the inclusive lower and upper bound
     * of valid values for the state.
     *
     * In any case, the information is merely a hint.  It may be possible to
     * have a state value outside of the hinted range and setting a value
     * within the range may fail.
     *
     * The return value (if non-`NULL`) should be freed with
     * [method@GLib.Variant.unref] when it is no longer required.
     *
     * @return the state range hint
     * @since 2.28
     */
    @GioVersion2_28
    public fun getStateHint(): Variant? = g_action_get_state_hint(gioActionPointer)?.run {
        Variant(this)
    }

    /**
     * Queries the type of the state of @action.
     *
     * If the action is stateful (e.g. created with
     * [ctor@Gio.SimpleAction.new_stateful]) then this function returns the
     * [type@GLib.VariantType] of the state.  This is the type of the initial value
     * given as the state. All calls to [method@Gio.Action.change_state] must give a
     * [type@GLib.Variant] of this type and [method@Gio.Action.get_state] will return a
     * [type@GLib.Variant] of the same type.
     *
     * If the action is not stateful (e.g. created with [ctor@Gio.SimpleAction.new])
     * then this function will return `NULL`. In that case, [method@Gio.Action.get_state]
     * will return `NULL` and you must not call [method@Gio.Action.change_state].
     *
     * @return the state type, if the action is stateful
     * @since 2.28
     */
    @GioVersion2_28
    public fun getStateType(): VariantType? = g_action_get_state_type(gioActionPointer)?.run {
        VariantType(this)
    }

    /**
     * The ActionImpl type represents a native instance of the Action interface.
     *
     * @constructor Creates a new instance of Action for the provided [CPointer].
     */
    public class ActionImpl(gioActionPointer: CPointer<GAction>) :
        Object(gioActionPointer.reinterpret()),
        Action {
        init {
            Gio
        }

        override val gioActionPointer: CPointer<GAction> = gioActionPointer
    }

    public companion object : TypeCompanion<Action> {
        override val type: GeneratedInterfaceKGType<Action> =
            GeneratedInterfaceKGType(getTypeOrNull()!!) { ActionImpl(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Checks if @action_name is valid.
         *
         * @action_name is valid if it consists only of alphanumeric characters,
         * plus `-` and `.`.  The empty string is not a valid action name.
         *
         * It is an error to call this function with a non-UTF-8 @action_name.
         * @action_name must not be `NULL`.
         *
         * @param actionName a potential action name
         * @return `TRUE` if @action_name is valid
         * @since 2.38
         */
        @GioVersion2_38
        public fun nameIsValid(actionName: String): Boolean = g_action_name_is_valid(actionName).asBoolean()

        /**
         * Formats a detailed action name from @action_name and @target_value.
         *
         * It is an error to call this function with an invalid action name.
         *
         * This function is the opposite of [func@Gio.Action.parse_detailed_name].
         * It will produce a string that can be parsed back to the @action_name
         * and @target_value by that function.
         *
         * See that function for the types of strings that will be printed by
         * this function.
         *
         * @param actionName a valid action name
         * @param targetValue a [type@GLib.Variant] target value, or `NULL`
         * @return a detailed format string
         * @since 2.38
         */
        @GioVersion2_38
        public fun printDetailedName(actionName: String, targetValue: Variant? = null): String =
            g_action_print_detailed_name(actionName, targetValue?.glibVariantPointer)?.toKString()
                ?: error("Expected not null string")

        /**
         * Get the GType of Action
         *
         * @return the GType
         */
        public fun getType(): GType = g_action_get_type()

        /**
         * Gets the GType of from the symbol `g_action_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? = org.gtkkn.extensions.glib.cinterop.getTypeOrNull("g_action_get_type")
    }
}
