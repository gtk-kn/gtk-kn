// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import kotlinx.cinterop.toKString
import org.gtkkn.native.atk.AtkRelationType
import org.gtkkn.native.atk.atk_relation_type_for_name
import org.gtkkn.native.atk.atk_relation_type_get_name
import org.gtkkn.native.atk.atk_relation_type_register
import kotlin.String

/**
 * Describes the type of the relation
 */
public enum class RelationType(
    public val nativeValue: AtkRelationType,
) {
    /**
     * Not used, represens "no relationship" or an error condition.
     */
    NULL(AtkRelationType.ATK_RELATION_NULL),

    /**
     * Indicates an object controlled by one or more target objects.
     */
    CONTROLLED_BY(AtkRelationType.ATK_RELATION_CONTROLLED_BY),

    /**
     * Indicates an object is an controller for one or more target objects.
     */
    CONTROLLER_FOR(AtkRelationType.ATK_RELATION_CONTROLLER_FOR),

    /**
     * Indicates an object is a label for one or more target objects.
     */
    LABEL_FOR(AtkRelationType.ATK_RELATION_LABEL_FOR),

    /**
     * Indicates an object is labelled by one or more target objects.
     */
    LABELLED_BY(AtkRelationType.ATK_RELATION_LABELLED_BY),

    /**
     * Indicates an object is a member of a group of one or more target objects.
     */
    MEMBER_OF(AtkRelationType.ATK_RELATION_MEMBER_OF),

    /**
     * Indicates an object is a cell in a treetable which is displayed because a cell in the same column is expanded and identifies that cell.
     */
    NODE_CHILD_OF(AtkRelationType.ATK_RELATION_NODE_CHILD_OF),

    /**
     * Indicates that the object has content that flows logically to another
     *  AtkObject in a sequential way, (for instance text-flow).
     */
    FLOWS_TO(AtkRelationType.ATK_RELATION_FLOWS_TO),

    /**
     * Indicates that the object has content that flows logically from
     *  another AtkObject in a sequential way, (for instance text-flow).
     */
    FLOWS_FROM(AtkRelationType.ATK_RELATION_FLOWS_FROM),

    /**
     * Indicates a subwindow attached to a component but otherwise has no connection in  the UI heirarchy to that component.
     */
    SUBWINDOW_OF(AtkRelationType.ATK_RELATION_SUBWINDOW_OF),

    /**
     * Indicates that the object visually embeds
     *  another object's content, i.e. this object's content flows around
     *  another's content.
     */
    EMBEDS(AtkRelationType.ATK_RELATION_EMBEDS),

    /**
     * Reciprocal of %ATK_RELATION_EMBEDS, indicates that
     *  this object's content is visualy embedded in another object.
     */
    EMBEDDED_BY(AtkRelationType.ATK_RELATION_EMBEDDED_BY),

    /**
     * Indicates that an object is a popup for another object.
     */
    POPUP_FOR(AtkRelationType.ATK_RELATION_POPUP_FOR),

    /**
     * Indicates that an object is a parent window of another object.
     */
    PARENT_WINDOW_OF(AtkRelationType.ATK_RELATION_PARENT_WINDOW_OF),

    /**
     * Reciprocal of %ATK_RELATION_DESCRIPTION_FOR. Indicates that one
     * or more target objects provide descriptive information about this object. This relation
     * type is most appropriate for information that is not essential as its presentation may
     * be user-configurable and/or limited to an on-demand mechanism such as an assistive
     * technology command. For brief, essential information such as can be found in a widget's
     * on-screen label, use %ATK_RELATION_LABELLED_BY. For an on-screen error message, use
     * %ATK_RELATION_ERROR_MESSAGE. For lengthy extended descriptive information contained in
     * an on-screen object, consider using %ATK_RELATION_DETAILS as assistive technologies may
     * provide a means for the user to navigate to objects containing detailed descriptions so
     * that their content can be more closely reviewed.
     */
    DESCRIBED_BY(AtkRelationType.ATK_RELATION_DESCRIBED_BY),

    /**
     * Reciprocal of %ATK_RELATION_DESCRIBED_BY. Indicates that this
     * object provides descriptive information about the target object(s). See also
     * %ATK_RELATION_DETAILS_FOR and %ATK_RELATION_ERROR_FOR.
     */
    DESCRIPTION_FOR(AtkRelationType.ATK_RELATION_DESCRIPTION_FOR),

    /**
     * Indicates an object is a cell in a treetable and is expanded to display other cells in the same column.
     */
    NODE_PARENT_OF(AtkRelationType.ATK_RELATION_NODE_PARENT_OF),

    /**
     * Reciprocal of %ATK_RELATION_DETAILS_FOR. Indicates that this object
     * has a detailed or extended description, the contents of which can be found in the target
     * object(s). This relation type is most appropriate for information that is sufficiently
     * lengthy as to make navigation to the container of that information desirable. For less
     * verbose information suitable for announcement only, see %ATK_RELATION_DESCRIBED_BY. If
     * the detailed information describes an error condition, %ATK_RELATION_ERROR_FOR should be
     * used instead. @Since: ATK-2.26.
     */
    DETAILS(AtkRelationType.ATK_RELATION_DETAILS),

    /**
     * Reciprocal of %ATK_RELATION_DETAILS. Indicates that this object
     * provides a detailed or extended description about the target object(s). See also
     * %ATK_RELATION_DESCRIPTION_FOR and %ATK_RELATION_ERROR_FOR. @Since: ATK-2.26.
     */
    DETAILS_FOR(AtkRelationType.ATK_RELATION_DETAILS_FOR),

    /**
     * Reciprocal of %ATK_RELATION_ERROR_FOR. Indicates that this object
     * has one or more errors, the nature of which is described in the contents of the target
     * object(s). Objects that have this relation type should also contain %ATK_STATE_INVALID_ENTRY
     * in their #AtkStateSet. @Since: ATK-2.26.
     */
    ERROR_MESSAGE(AtkRelationType.ATK_RELATION_ERROR_MESSAGE),

    /**
     * Reciprocal of %ATK_RELATION_ERROR_MESSAGE. Indicates that this object
     * contains an error message describing an invalid condition in the target object(s). @Since:
     * ATK_2.26.
     */
    ERROR_FOR(AtkRelationType.ATK_RELATION_ERROR_FOR),

    /**
     * Not used, this value indicates the end of the enumeration.
     */
    LAST_DEFINED(AtkRelationType.ATK_RELATION_LAST_DEFINED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: AtkRelationType): RelationType =
            when (nativeValue) {
                AtkRelationType.ATK_RELATION_NULL -> NULL
                AtkRelationType.ATK_RELATION_CONTROLLED_BY -> CONTROLLED_BY
                AtkRelationType.ATK_RELATION_CONTROLLER_FOR -> CONTROLLER_FOR
                AtkRelationType.ATK_RELATION_LABEL_FOR -> LABEL_FOR
                AtkRelationType.ATK_RELATION_LABELLED_BY -> LABELLED_BY
                AtkRelationType.ATK_RELATION_MEMBER_OF -> MEMBER_OF
                AtkRelationType.ATK_RELATION_NODE_CHILD_OF -> NODE_CHILD_OF
                AtkRelationType.ATK_RELATION_FLOWS_TO -> FLOWS_TO
                AtkRelationType.ATK_RELATION_FLOWS_FROM -> FLOWS_FROM
                AtkRelationType.ATK_RELATION_SUBWINDOW_OF -> SUBWINDOW_OF
                AtkRelationType.ATK_RELATION_EMBEDS -> EMBEDS
                AtkRelationType.ATK_RELATION_EMBEDDED_BY -> EMBEDDED_BY
                AtkRelationType.ATK_RELATION_POPUP_FOR -> POPUP_FOR
                AtkRelationType.ATK_RELATION_PARENT_WINDOW_OF -> PARENT_WINDOW_OF
                AtkRelationType.ATK_RELATION_DESCRIBED_BY -> DESCRIBED_BY
                AtkRelationType.ATK_RELATION_DESCRIPTION_FOR -> DESCRIPTION_FOR
                AtkRelationType.ATK_RELATION_NODE_PARENT_OF -> NODE_PARENT_OF
                AtkRelationType.ATK_RELATION_DETAILS -> DETAILS
                AtkRelationType.ATK_RELATION_DETAILS_FOR -> DETAILS_FOR
                AtkRelationType.ATK_RELATION_ERROR_MESSAGE -> ERROR_MESSAGE
                AtkRelationType.ATK_RELATION_ERROR_FOR -> ERROR_FOR
                AtkRelationType.ATK_RELATION_LAST_DEFINED -> LAST_DEFINED
                else -> error("invalid nativeValue")
            }

        /**
         * Get the #AtkRelationType type corresponding to a relation name.
         *
         * @param name a string which is the (non-localized) name of an ATK relation type.
         * @return the #AtkRelationType enumerated type corresponding to the specified name,
         *          or #ATK_RELATION_NULL if no matching relation type is found.
         */
        public fun forName(name: String): RelationType =
            atk_relation_type_for_name(name).run {
                RelationType.fromNativeValue(this)
            }

        /**
         * Gets the description string describing the #AtkRelationType @type.
         *
         * @param type The #AtkRelationType whose name is required
         * @return the string describing the AtkRelationType
         */
        public fun getName(type: RelationType): String =
            atk_relation_type_get_name(type.nativeValue)?.toKString() ?: error("Expected not null string")

        /**
         * Associate @name with a new #AtkRelationType
         *
         * @param name a name string
         * @return an #AtkRelationType associated with @name
         */
        public fun register(name: String): RelationType =
            atk_relation_type_register(name).run {
                RelationType.fromNativeValue(this)
            }
    }
}
