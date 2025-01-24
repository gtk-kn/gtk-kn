// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessibleRole
import org.gtkkn.native.gtk.gtk_accessible_role_get_type

/**
 * The accessible role for a [iface@Accessible] implementation.
 *
 * Abstract roles are only used as part of the ontology; application
 * developers must not use abstract roles in their code.
 */
public enum class AccessibleRole(public val nativeValue: GtkAccessibleRole) {
    /**
     * An element with important, and usually
     *   time-sensitive, information
     */
    ALERT(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_ALERT),

    /**
     * A type of dialog that contains an
     *   alert message
     */
    ALERT_DIALOG(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_ALERT_DIALOG),

    /**
     * Unused
     */
    BANNER(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_BANNER),

    /**
     * An input element that allows for
     *   user-triggered actions when clicked or pressed
     */
    BUTTON(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_BUTTON),

    /**
     * Unused
     */
    CAPTION(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_CAPTION),

    /**
     * Unused
     */
    CELL(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_CELL),

    /**
     * A checkable input element that has
     *   three possible values: `true`, `false`, or `mixed`
     */
    CHECKBOX(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_CHECKBOX),

    /**
     * A header in a columned list.
     */
    COLUMN_HEADER(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_COLUMN_HEADER),

    /**
     * An input that controls another element,
     *   such as a list or a grid, that can dynamically pop up to help the user
     *   set the value of the input
     */
    COMBO_BOX(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_COMBO_BOX),

    /**
     * Abstract role.
     */
    COMMAND(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_COMMAND),

    /**
     * Abstract role.
     */
    COMPOSITE(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_COMPOSITE),

    /**
     * A dialog is a window that is designed to interrupt
     *   the current processing of an application in order to prompt the user to enter
     *   information or require a response.
     */
    DIALOG(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_DIALOG),

    /**
     * Content that assistive technology users may want to
     *   browse in a reading mode.
     */
    DOCUMENT(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_DOCUMENT),

    /**
     * Unused
     */
    FEED(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_FEED),

    /**
     * Unused
     */
    FORM(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_FORM),

    /**
     * A nameless container that has no semantic meaning
     *   of its own. This is the role that GTK uses by default for widgets.
     */
    GENERIC(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_GENERIC),

    /**
     * A grid of items.
     */
    GRID(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_GRID),

    /**
     * An item in a grid or tree grid.
     */
    GRID_CELL(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_GRID_CELL),

    /**
     * An element that groups multiple related widgets. GTK uses
     *   this role for various containers, like [class@Gtk.HeaderBar] or [class@Gtk.Notebook].
     */
    GROUP(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_GROUP),

    /**
     * Unused
     */
    HEADING(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_HEADING),

    /**
     * An image.
     */
    IMG(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_IMG),

    /**
     * Abstract role.
     */
    INPUT(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_INPUT),

    /**
     * A visible name or caption for a user interface component.
     */
    LABEL(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_LABEL),

    /**
     * Abstract role.
     */
    LANDMARK(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_LANDMARK),

    /**
     * Unused
     */
    LEGEND(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_LEGEND),

    /**
     * A clickable link.
     */
    LINK(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_LINK),

    /**
     * A list of items.
     */
    LIST(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_LIST),

    /**
     * Unused.
     */
    LIST_BOX(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_LIST_BOX),

    /**
     * An item in a list.
     */
    LIST_ITEM(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_LIST_ITEM),

    /**
     * Unused
     */
    LOG(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_LOG),

    /**
     * Unused
     */
    MAIN(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_MAIN),

    /**
     * Unused
     */
    MARQUEE(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_MARQUEE),

    /**
     * Unused
     */
    MATH(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_MATH),

    /**
     * An element that represents a value within a known range.
     */
    METER(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_METER),

    /**
     * A menu.
     */
    MENU(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_MENU),

    /**
     * A menubar.
     */
    MENU_BAR(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_MENU_BAR),

    /**
     * An item in a menu.
     */
    MENU_ITEM(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_MENU_ITEM),

    /**
     * A check item in a menu.
     */
    MENU_ITEM_CHECKBOX(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_MENU_ITEM_CHECKBOX),

    /**
     * A radio item in a menu.
     */
    MENU_ITEM_RADIO(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_MENU_ITEM_RADIO),

    /**
     * Unused
     */
    NAVIGATION(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_NAVIGATION),

    /**
     * An element that is not represented to accessibility technologies.
     *   This role is synonymous to @GTK_ACCESSIBLE_ROLE_PRESENTATION.
     */
    NONE(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_NONE),

    /**
     * Unused
     */
    NOTE(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_NOTE),

    /**
     * Unused
     */
    OPTION(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_OPTION),

    /**
     * An element that is not represented to accessibility technologies.
     *   This role is synonymous to @GTK_ACCESSIBLE_ROLE_NONE.
     */
    PRESENTATION(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_PRESENTATION),

    /**
     * An element that displays the progress
     *   status for tasks that take a long time.
     */
    PROGRESS_BAR(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_PROGRESS_BAR),

    /**
     * A checkable input in a group of radio roles,
     *   only one of which can be checked at a time.
     */
    RADIO(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_RADIO),

    /**
     * Unused
     */
    RADIO_GROUP(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_RADIO_GROUP),

    /**
     * Abstract role.
     */
    RANGE(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_RANGE),

    /**
     * Unused
     */
    REGION(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_REGION),

    /**
     * A row in a columned list.
     */
    ROW(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_ROW),

    /**
     * Unused
     */
    ROW_GROUP(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_ROW_GROUP),

    /**
     * Unused
     */
    ROW_HEADER(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_ROW_HEADER),

    /**
     * A graphical object that controls the scrolling
     *   of content within a viewing area, regardless of whether the content is fully
     *   displayed within the viewing area.
     */
    SCROLLBAR(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_SCROLLBAR),

    /**
     * Unused
     */
    SEARCH(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_SEARCH),

    /**
     * A type of textbox intended for specifying
     *   search criteria.
     */
    SEARCH_BOX(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_SEARCH_BOX),

    /**
     * Abstract role.
     */
    SECTION(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_SECTION),

    /**
     * Abstract role.
     */
    SECTION_HEAD(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_SECTION_HEAD),

    /**
     * Abstract role.
     */
    SELECT(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_SELECT),

    /**
     * A divider that separates and distinguishes
     *   sections of content or groups of menuitems.
     */
    SEPARATOR(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_SEPARATOR),

    /**
     * A user input where the user selects a value
     *   from within a given range.
     */
    SLIDER(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_SLIDER),

    /**
     * A form of range that expects the user to
     *   select from among discrete choices.
     */
    SPIN_BUTTON(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_SPIN_BUTTON),

    /**
     * Unused
     */
    STATUS(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_STATUS),

    /**
     * Abstract role.
     */
    STRUCTURE(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_STRUCTURE),

    /**
     * A type of checkbox that represents on/off values,
     *   as opposed to checked/unchecked values.
     */
    SWITCH(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_SWITCH),

    /**
     * An item in a list of tab used for switching pages.
     */
    TAB(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TAB),

    /**
     * Unused
     */
    TABLE(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TABLE),

    /**
     * A list of tabs for switching pages.
     */
    TAB_LIST(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TAB_LIST),

    /**
     * A page in a notebook or stack.
     */
    TAB_PANEL(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TAB_PANEL),

    /**
     * A type of input that allows free-form text
     *   as its value.
     */
    TEXT_BOX(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TEXT_BOX),

    /**
     * Unused
     */
    TIME(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TIME),

    /**
     * Unused
     */
    TIMER(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TIMER),

    /**
     * Unused
     */
    TOOLBAR(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TOOLBAR),

    /**
     * Unused
     */
    TOOLTIP(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TOOLTIP),

    /**
     * Unused
     */
    TREE(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TREE),

    /**
     * A treeview-like, columned list.
     */
    TREE_GRID(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TREE_GRID),

    /**
     * Unused
     */
    TREE_ITEM(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TREE_ITEM),

    /**
     * Abstract role for interactive components of a
     *   graphical user interface
     */
    WIDGET(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_WIDGET),

    /**
     * Abstract role for windows.
     */
    WINDOW(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_WINDOW),

    /**
     * A type of push button which stays pressed until depressed by a second
     * activation.
     * @since 4.10
     */
    TOGGLE_BUTTON(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TOGGLE_BUTTON),

    /**
     * A toplevel element of a graphical user interface.
     *
     * This is the role that GTK uses by default for windows.
     * @since 4.12
     */
    APPLICATION(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_APPLICATION),

    /**
     * A paragraph of content.
     * @since 4.14
     */
    PARAGRAPH(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_PARAGRAPH),

    /**
     * A section of content that is quoted from another source.
     * @since 4.14
     */
    BLOCK_QUOTE(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_BLOCK_QUOTE),

    /**
     * A section of a page that consists of a composition that forms an independent
     * part of a document, page, or site.
     * @since 4.14
     */
    ARTICLE(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_ARTICLE),

    /**
     * A comment contains content expressing reaction to other content.
     * @since 4.14
     */
    COMMENT(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_COMMENT),

    /**
     * A virtual terminal.
     * @since 4.14
     */
    TERMINAL(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TERMINAL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkAccessibleRole): AccessibleRole = when (nativeValue) {
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_ALERT -> ALERT
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_ALERT_DIALOG -> ALERT_DIALOG
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_BANNER -> BANNER
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_BUTTON -> BUTTON
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_CAPTION -> CAPTION
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_CELL -> CELL
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_CHECKBOX -> CHECKBOX
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_COLUMN_HEADER -> COLUMN_HEADER
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_COMBO_BOX -> COMBO_BOX
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_COMMAND -> COMMAND
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_COMPOSITE -> COMPOSITE
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_DIALOG -> DIALOG
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_DOCUMENT -> DOCUMENT
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_FEED -> FEED
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_FORM -> FORM
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_GENERIC -> GENERIC
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_GRID -> GRID
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_GRID_CELL -> GRID_CELL
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_GROUP -> GROUP
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_HEADING -> HEADING
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_IMG -> IMG
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_INPUT -> INPUT
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_LABEL -> LABEL
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_LANDMARK -> LANDMARK
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_LEGEND -> LEGEND
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_LINK -> LINK
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_LIST -> LIST
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_LIST_BOX -> LIST_BOX
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_LIST_ITEM -> LIST_ITEM
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_LOG -> LOG
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_MAIN -> MAIN
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_MARQUEE -> MARQUEE
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_MATH -> MATH
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_METER -> METER
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_MENU -> MENU
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_MENU_BAR -> MENU_BAR
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_MENU_ITEM -> MENU_ITEM
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_MENU_ITEM_CHECKBOX -> MENU_ITEM_CHECKBOX
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_MENU_ITEM_RADIO -> MENU_ITEM_RADIO
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_NAVIGATION -> NAVIGATION
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_NONE -> NONE
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_NOTE -> NOTE
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_OPTION -> OPTION
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_PRESENTATION -> PRESENTATION
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_PROGRESS_BAR -> PROGRESS_BAR
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_RADIO -> RADIO
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_RADIO_GROUP -> RADIO_GROUP
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_RANGE -> RANGE
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_REGION -> REGION
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_ROW -> ROW
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_ROW_GROUP -> ROW_GROUP
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_ROW_HEADER -> ROW_HEADER
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_SCROLLBAR -> SCROLLBAR
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_SEARCH -> SEARCH
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_SEARCH_BOX -> SEARCH_BOX
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_SECTION -> SECTION
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_SECTION_HEAD -> SECTION_HEAD
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_SELECT -> SELECT
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_SEPARATOR -> SEPARATOR
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_SLIDER -> SLIDER
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_SPIN_BUTTON -> SPIN_BUTTON
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_STATUS -> STATUS
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_STRUCTURE -> STRUCTURE
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_SWITCH -> SWITCH
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TAB -> TAB
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TABLE -> TABLE
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TAB_LIST -> TAB_LIST
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TAB_PANEL -> TAB_PANEL
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TEXT_BOX -> TEXT_BOX
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TIME -> TIME
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TIMER -> TIMER
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TOOLBAR -> TOOLBAR
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TOOLTIP -> TOOLTIP
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TREE -> TREE
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TREE_GRID -> TREE_GRID
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TREE_ITEM -> TREE_ITEM
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_WIDGET -> WIDGET
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_WINDOW -> WINDOW
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TOGGLE_BUTTON -> TOGGLE_BUTTON
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_APPLICATION -> APPLICATION
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_PARAGRAPH -> PARAGRAPH
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_BLOCK_QUOTE -> BLOCK_QUOTE
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_ARTICLE -> ARTICLE
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_COMMENT -> COMMENT
            GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TERMINAL -> TERMINAL
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of AccessibleRole
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_accessible_role_get_type()
    }
}
