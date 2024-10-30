// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.bindings.gobject.Value
import org.gtkkn.native.gtk.GtkAccessibleRelation
import org.gtkkn.native.gtk.GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_ACTIVE_DESCENDANT
import org.gtkkn.native.gtk.GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_COL_COUNT
import org.gtkkn.native.gtk.GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_COL_INDEX
import org.gtkkn.native.gtk.GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_COL_INDEX_TEXT
import org.gtkkn.native.gtk.GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_COL_SPAN
import org.gtkkn.native.gtk.GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_CONTROLS
import org.gtkkn.native.gtk.GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_DESCRIBED_BY
import org.gtkkn.native.gtk.GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_DETAILS
import org.gtkkn.native.gtk.GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_ERROR_MESSAGE
import org.gtkkn.native.gtk.GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_FLOW_TO
import org.gtkkn.native.gtk.GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_LABELLED_BY
import org.gtkkn.native.gtk.GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_OWNS
import org.gtkkn.native.gtk.GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_POS_IN_SET
import org.gtkkn.native.gtk.GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_ROW_COUNT
import org.gtkkn.native.gtk.GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_ROW_INDEX
import org.gtkkn.native.gtk.GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_ROW_INDEX_TEXT
import org.gtkkn.native.gtk.GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_ROW_SPAN
import org.gtkkn.native.gtk.GtkAccessibleRelation.GTK_ACCESSIBLE_RELATION_SET_SIZE
import org.gtkkn.native.gtk.gtk_accessible_relation_init_value
import kotlin.Unit

/**
 * The possible accessible relations of a [iface@Accessible].
 *
 * Accessible relations can be references to other widgets,
 * integers or strings.
 */
public enum class AccessibleRelation(
    public val nativeValue: GtkAccessibleRelation,
) {
    /**
     * Identifies the currently active
     *    element when focus is on a composite widget, combobox, textbox, group,
     *    or application. Value type: reference
     */
    ACTIVE_DESCENDANT(GTK_ACCESSIBLE_RELATION_ACTIVE_DESCENDANT),

    /**
     * Defines the total number of columns
     *    in a table, grid, or treegrid. Value type: integer
     */
    COL_COUNT(GTK_ACCESSIBLE_RELATION_COL_COUNT),

    /**
     * Defines an element's column index or
     *    position with respect to the total number of columns within a table,
     *    grid, or treegrid. Value type: integer
     */
    COL_INDEX(GTK_ACCESSIBLE_RELATION_COL_INDEX),

    /**
     * Defines a human readable text
     *   alternative of %GTK_ACCESSIBLE_RELATION_COL_INDEX. Value type: string
     */
    COL_INDEX_TEXT(GTK_ACCESSIBLE_RELATION_COL_INDEX_TEXT),

    /**
     * Defines the number of columns spanned
     *   by a cell or gridcell within a table, grid, or treegrid. Value type: integer
     */
    COL_SPAN(GTK_ACCESSIBLE_RELATION_COL_SPAN),

    /**
     * Identifies the element (or elements) whose
     *    contents or presence are controlled by the current element. Value type: reference
     */
    CONTROLS(GTK_ACCESSIBLE_RELATION_CONTROLS),

    /**
     * Identifies the element (or elements)
     *    that describes the object. Value type: reference
     */
    DESCRIBED_BY(GTK_ACCESSIBLE_RELATION_DESCRIBED_BY),

    /**
     * Identifies the element (or elements) that
     *    provide additional information related to the object. Value type: reference
     */
    DETAILS(GTK_ACCESSIBLE_RELATION_DETAILS),

    /**
     * Identifies the element that provides
     *    an error message for an object. Value type: reference
     */
    ERROR_MESSAGE(GTK_ACCESSIBLE_RELATION_ERROR_MESSAGE),

    /**
     * Identifies the next element (or elements)
     *    in an alternate reading order of content which, at the user's discretion,
     *    allows assistive technology to override the general default of reading in
     *    document source order. Value type: reference
     */
    FLOW_TO(GTK_ACCESSIBLE_RELATION_FLOW_TO),

    /**
     * Identifies the element (or elements)
     *    that labels the current element. Value type: reference
     */
    LABELLED_BY(GTK_ACCESSIBLE_RELATION_LABELLED_BY),

    /**
     * Identifies an element (or elements) in order
     *    to define a visual, functional, or contextual parent/child relationship
     *    between elements where the widget hierarchy cannot be used to represent
     *    the relationship. Value type: reference
     */
    OWNS(GTK_ACCESSIBLE_RELATION_OWNS),

    /**
     * Defines an element's number or position
     *    in the current set of listitems or treeitems. Value type: integer
     */
    POS_IN_SET(GTK_ACCESSIBLE_RELATION_POS_IN_SET),

    /**
     * Defines the total number of rows in a table,
     *    grid, or treegrid. Value type: integer
     */
    ROW_COUNT(GTK_ACCESSIBLE_RELATION_ROW_COUNT),

    /**
     * Defines an element's row index or position
     *    with respect to the total number of rows within a table, grid, or treegrid.
     *    Value type: integer
     */
    ROW_INDEX(GTK_ACCESSIBLE_RELATION_ROW_INDEX),

    /**
     * Defines a human readable text
     *    alternative of aria-rowindex. Value type: string
     */
    ROW_INDEX_TEXT(GTK_ACCESSIBLE_RELATION_ROW_INDEX_TEXT),

    /**
     * Defines the number of rows spanned by a
     *    cell or gridcell within a table, grid, or treegrid. Value type: integer
     */
    ROW_SPAN(GTK_ACCESSIBLE_RELATION_ROW_SPAN),

    /**
     * Defines the number of items in the current
     *    set of listitems or treeitems. Value type: integer
     */
    SET_SIZE(GTK_ACCESSIBLE_RELATION_SET_SIZE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkAccessibleRelation): AccessibleRelation =
            when (nativeValue) {
                GTK_ACCESSIBLE_RELATION_ACTIVE_DESCENDANT -> ACTIVE_DESCENDANT
                GTK_ACCESSIBLE_RELATION_COL_COUNT -> COL_COUNT
                GTK_ACCESSIBLE_RELATION_COL_INDEX -> COL_INDEX
                GTK_ACCESSIBLE_RELATION_COL_INDEX_TEXT -> COL_INDEX_TEXT
                GTK_ACCESSIBLE_RELATION_COL_SPAN -> COL_SPAN
                GTK_ACCESSIBLE_RELATION_CONTROLS -> CONTROLS
                GTK_ACCESSIBLE_RELATION_DESCRIBED_BY -> DESCRIBED_BY
                GTK_ACCESSIBLE_RELATION_DETAILS -> DETAILS
                GTK_ACCESSIBLE_RELATION_ERROR_MESSAGE -> ERROR_MESSAGE
                GTK_ACCESSIBLE_RELATION_FLOW_TO -> FLOW_TO
                GTK_ACCESSIBLE_RELATION_LABELLED_BY -> LABELLED_BY
                GTK_ACCESSIBLE_RELATION_OWNS -> OWNS
                GTK_ACCESSIBLE_RELATION_POS_IN_SET -> POS_IN_SET
                GTK_ACCESSIBLE_RELATION_ROW_COUNT -> ROW_COUNT
                GTK_ACCESSIBLE_RELATION_ROW_INDEX -> ROW_INDEX
                GTK_ACCESSIBLE_RELATION_ROW_INDEX_TEXT -> ROW_INDEX_TEXT
                GTK_ACCESSIBLE_RELATION_ROW_SPAN -> ROW_SPAN
                GTK_ACCESSIBLE_RELATION_SET_SIZE -> SET_SIZE
                else -> error("invalid nativeValue")
            }

        /**
         *
         *
         * @param relation
         * @param value
         */
        public fun initValue(
            relation: AccessibleRelation,
            `value`: Value,
        ): Unit = gtk_accessible_relation_init_value(relation.nativeValue, `value`.gobjectValuePointer)
    }
}
