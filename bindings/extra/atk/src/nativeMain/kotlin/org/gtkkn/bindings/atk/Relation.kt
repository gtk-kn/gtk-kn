// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.atk.annotations.AtkVersion1_9
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.atk.AtkRelation
import org.gtkkn.native.atk.atk_relation_add_target
import org.gtkkn.native.atk.atk_relation_get_relation_type
import org.gtkkn.native.atk.atk_relation_get_type
import org.gtkkn.native.atk.atk_relation_remove_target
import kotlin.Boolean
import kotlin.Unit

/**
 * An object used to describe a relation between a
 *  object and one or more other objects.
 *
 * An AtkRelation describes a relation between an object and one or
 * more other objects. The actual relations that an object has with
 * other objects are defined as an AtkRelationSet, which is a set of
 * AtkRelations.
 *
 * ## Skipped during bindings generation
 *
 * - method `get_target`: Array parameter of type Object is not supported
 * - method `target`: Property has no getter nor setter
 * - parameter `targets`: Array parameter of type Object is not supported
 */
public open class Relation(
    pointer: CPointer<AtkRelation>,
) : org.gtkkn.bindings.gobject.Object(pointer.reinterpret()),
    KGTyped {
    public val atkRelationPointer: CPointer<AtkRelation>
        get() = gPointer.reinterpret()

    public open val relationType: RelationType
        /**
         * Gets the type of @relation
         *
         * @return the type of @relation
         */
        get() =
            atk_relation_get_relation_type(atkRelationPointer.reinterpret()).run {
                RelationType.fromNativeValue(this)
            }

    /**
     * Adds the specified AtkObject to the target for the relation, if it is
     * not already present.  See also atk_object_add_relationship().
     *
     * @param target an #AtkObject
     * @since 1.9
     */
    @AtkVersion1_9
    public open fun addTarget(target: Object): Unit =
        atk_relation_add_target(atkRelationPointer.reinterpret(), target.atkObjectPointer.reinterpret())

    /**
     * Gets the type of @relation
     *
     * @return the type of @relation
     */
    public open fun getRelationType(): RelationType =
        atk_relation_get_relation_type(atkRelationPointer.reinterpret()).run {
            RelationType.fromNativeValue(this)
        }

    /**
     * Remove the specified AtkObject from the target for the relation.
     *
     * @param target an #AtkObject
     * @return TRUE if the removal is successful.
     */
    public open fun removeTarget(target: Object): Boolean =
        atk_relation_remove_target(atkRelationPointer.reinterpret(), target.atkObjectPointer.reinterpret()).asBoolean()

    public companion object : TypeCompanion<Relation> {
        override val type: GeneratedClassKGType<Relation> =
            GeneratedClassKGType(atk_relation_get_type()) { Relation(it.reinterpret()) }

        init {
            AtkTypeProvider.register()
        }
    }
}
