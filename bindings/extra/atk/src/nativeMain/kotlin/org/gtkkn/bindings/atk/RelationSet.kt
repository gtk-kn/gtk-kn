// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.atk.annotations.AtkVersion1_9
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.atk.AtkRelationSet
import org.gtkkn.native.atk.atk_relation_set_add
import org.gtkkn.native.atk.atk_relation_set_add_relation_by_type
import org.gtkkn.native.atk.atk_relation_set_contains
import org.gtkkn.native.atk.atk_relation_set_contains_target
import org.gtkkn.native.atk.atk_relation_set_get_n_relations
import org.gtkkn.native.atk.atk_relation_set_get_relation
import org.gtkkn.native.atk.atk_relation_set_get_relation_by_type
import org.gtkkn.native.atk.atk_relation_set_get_type
import org.gtkkn.native.atk.atk_relation_set_new
import org.gtkkn.native.atk.atk_relation_set_remove
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit

/**
 * A set of AtkRelations, normally the set of
 *  AtkRelations which an AtkObject has.
 *
 * The AtkRelationSet held by an object establishes its relationships
 * with objects beyond the normal "parent/child" hierarchical
 * relationships that all user interface objects have.
 * AtkRelationSets establish whether objects are labelled or
 * controlled by other components, share group membership with other
 * components (for instance within a radio-button group), or share
 * content which "flows" between them, among other types of possible
 * relationships.
 */
public open class RelationSet(
    pointer: CPointer<AtkRelationSet>,
) : org.gtkkn.bindings.gobject.Object(pointer.reinterpret()),
    KGTyped {
    public val atkRelationSetPointer: CPointer<AtkRelationSet>
        get() = gPointer.reinterpret()

    /**
     * Creates a new empty relation set.
     *
     * @return a new #AtkRelationSet
     */
    public constructor() : this(atk_relation_set_new()!!.reinterpret())

    /**
     * Add a new relation to the current relation set if it is not already
     * present.
     * This function ref's the AtkRelation so the caller of this function
     * should unref it to ensure that it will be destroyed when the AtkRelationSet
     * is destroyed.
     *
     * @param relation an #AtkRelation
     */
    public open fun add(relation: Relation): Unit =
        atk_relation_set_add(atkRelationSetPointer.reinterpret(), relation.atkRelationPointer.reinterpret())

    /**
     * Add a new relation of the specified type with the specified target to
     * the current relation set if the relation set does not contain a relation
     * of that type. If it is does contain a relation of that typea the target
     * is added to the relation.
     *
     * @param relationship an #AtkRelationType
     * @param target an #AtkObject
     * @since 1.9
     */
    @AtkVersion1_9
    public open fun addRelationByType(
        relationship: RelationType,
        target: Object,
    ): Unit =
        atk_relation_set_add_relation_by_type(
            atkRelationSetPointer.reinterpret(),
            relationship.nativeValue,
            target.atkObjectPointer.reinterpret()
        )

    /**
     * Determines whether the relation set contains a relation that matches the
     * specified type.
     *
     * @param relationship an #AtkRelationType
     * @return true if @relationship is the relationship type of a relation
     * in @set, false otherwise
     */
    public open fun contains(relationship: RelationType): Boolean =
        atk_relation_set_contains(atkRelationSetPointer.reinterpret(), relationship.nativeValue).asBoolean()

    /**
     * Determines whether the relation set contains a relation that
     * matches the specified pair formed by type @relationship and object
     * @target.
     *
     * @param relationship an #AtkRelationType
     * @param target an #AtkObject
     * @return true if @set contains a relation with the relationship
     * type @relationship with an object @target, false otherwise
     */
    public open fun containsTarget(
        relationship: RelationType,
        target: Object,
    ): Boolean =
        atk_relation_set_contains_target(
            atkRelationSetPointer.reinterpret(),
            relationship.nativeValue,
            target.atkObjectPointer.reinterpret()
        ).asBoolean()

    /**
     * Determines the number of relations in a relation set.
     *
     * @return an integer representing the number of relations in the set.
     */
    public open fun getNRelations(): Int = atk_relation_set_get_n_relations(atkRelationSetPointer.reinterpret())

    /**
     * Determines the relation at the specified position in the relation set.
     *
     * @param i a gint representing a position in the set, starting from 0.
     * @return a #AtkRelation, which is the relation at
     * position i in the set.
     */
    public open fun getRelation(i: Int): Relation =
        atk_relation_set_get_relation(atkRelationSetPointer.reinterpret(), i)!!.run {
            Relation(reinterpret())
        }

    /**
     * Finds a relation that matches the specified type.
     *
     * @param relationship an #AtkRelationType
     * @return an #AtkRelation, which is a relation matching the
     * specified type.
     */
    public open fun getRelationByType(relationship: RelationType): Relation =
        atk_relation_set_get_relation_by_type(atkRelationSetPointer.reinterpret(), relationship.nativeValue)!!.run {
            Relation(reinterpret())
        }

    /**
     * Removes a relation from the relation set.
     * This function unref's the #AtkRelation so it will be deleted unless there
     * is another reference to it.
     *
     * @param relation an #AtkRelation
     */
    public open fun remove(relation: Relation): Unit =
        atk_relation_set_remove(atkRelationSetPointer.reinterpret(), relation.atkRelationPointer.reinterpret())

    public companion object : TypeCompanion<RelationSet> {
        override val type: GeneratedClassKGType<RelationSet> =
            GeneratedClassKGType(atk_relation_set_get_type()) { RelationSet(it.reinterpret()) }

        init {
            AtkTypeProvider.register()
        }
    }
}
