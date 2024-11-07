// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.atk.AtkStateSet
import org.gtkkn.native.atk.atk_state_set_add_state
import org.gtkkn.native.atk.atk_state_set_and_sets
import org.gtkkn.native.atk.atk_state_set_clear_states
import org.gtkkn.native.atk.atk_state_set_contains_state
import org.gtkkn.native.atk.atk_state_set_get_type
import org.gtkkn.native.atk.atk_state_set_is_empty
import org.gtkkn.native.atk.atk_state_set_new
import org.gtkkn.native.atk.atk_state_set_or_sets
import org.gtkkn.native.atk.atk_state_set_remove_state
import org.gtkkn.native.atk.atk_state_set_xor_sets
import kotlin.Boolean
import kotlin.Unit

/**
 * An AtkStateSet contains the states of an object.
 *
 * An AtkStateSet is a read-only representation of the full set of #AtkStates
 * that apply to an object at a given time. This set is not meant to be
 * modified, but rather created when #atk_object_ref_state_set() is called.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `types`: Array parameter of type StateType is not supported
 * - parameter `types`: Array parameter of type StateType is not supported
 */
public open class StateSet(
    pointer: CPointer<AtkStateSet>,
) : Object(pointer.reinterpret()),
    KGTyped {
    public val atkStateSetPointer: CPointer<AtkStateSet>
        get() = gPointer.reinterpret()

    /**
     * Creates a new empty state set.
     *
     * @return a new #AtkStateSet
     */
    public constructor() : this(atk_state_set_new()!!.reinterpret())

    /**
     * Adds the state of the specified type to the state set if it is not already
     * present.
     *
     * Note that because an #AtkStateSet is a read-only object, this method should
     * be used to add a state to a newly-created set which will then be returned by
     * #atk_object_ref_state_set. It should not be used to modify the existing state
     * of an object. See also #atk_object_notify_state_change.
     *
     * @param type an #AtkStateType
     * @return true if  the state for @type is not already in @set.
     */
    public open fun addState(type: StateType): Boolean =
        atk_state_set_add_state(atkStateSetPointer.reinterpret(), type.nativeValue).asBoolean()

    /**
     * Constructs the intersection of the two sets, returning null if the
     * intersection is empty.
     *
     * @param compareSet another #AtkStateSet
     * @return a new #AtkStateSet which is the intersection of
     * the two sets.
     */
    public open fun andSets(compareSet: StateSet): StateSet =
        atk_state_set_and_sets(atkStateSetPointer.reinterpret(), compareSet.atkStateSetPointer.reinterpret())!!.run {
            StateSet(reinterpret())
        }

    /**
     * Removes all states from the state set.
     */
    public open fun clearStates(): Unit = atk_state_set_clear_states(atkStateSetPointer.reinterpret())

    /**
     * Checks whether the state for the specified type is in the specified set.
     *
     * @param type an #AtkStateType
     * @return true if @type is the state type is in @set.
     */
    public open fun containsState(type: StateType): Boolean =
        atk_state_set_contains_state(atkStateSetPointer.reinterpret(), type.nativeValue).asBoolean()

    /**
     * Checks whether the state set is empty, i.e. has no states set.
     *
     * @return true if @set has no states set, otherwise false
     */
    public open fun isEmpty(): Boolean = atk_state_set_is_empty(atkStateSetPointer.reinterpret()).asBoolean()

    /**
     * Constructs the union of the two sets.
     *
     * @param compareSet another #AtkStateSet
     * @return a new #AtkStateSet which is
     * the union of the two sets, returning null is empty.
     */
    public open fun orSets(compareSet: StateSet): StateSet? =
        atk_state_set_or_sets(atkStateSetPointer.reinterpret(), compareSet.atkStateSetPointer.reinterpret())?.run {
            StateSet(reinterpret())
        }

    /**
     * Removes the state for the specified type from the state set.
     *
     * Note that because an #AtkStateSet is a read-only object, this method should
     * be used to remove a state to a newly-created set which will then be returned
     * by #atk_object_ref_state_set. It should not be used to modify the existing
     * state of an object. See also #atk_object_notify_state_change.
     *
     * @param type an #AtkType
     * @return true if @type was the state type is in @set.
     */
    public open fun removeState(type: StateType): Boolean =
        atk_state_set_remove_state(atkStateSetPointer.reinterpret(), type.nativeValue).asBoolean()

    /**
     * Constructs the exclusive-or of the two sets, returning null is empty.
     * The set returned by this operation contains the states in exactly
     * one of the two sets.
     *
     * @param compareSet another #AtkStateSet
     * @return a new #AtkStateSet which contains the states
     * which are in exactly one of the two sets.
     */
    public open fun xorSets(compareSet: StateSet): StateSet =
        atk_state_set_xor_sets(atkStateSetPointer.reinterpret(), compareSet.atkStateSetPointer.reinterpret())!!.run {
            StateSet(reinterpret())
        }

    public companion object : TypeCompanion<StateSet> {
        override val type: GeneratedClassKGType<StateSet> =
            GeneratedClassKGType(atk_state_set_get_type()) { StateSet(it.reinterpret()) }

        init {
            AtkTypeProvider.register()
        }
    }
}
