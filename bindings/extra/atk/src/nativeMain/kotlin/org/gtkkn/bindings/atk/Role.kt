// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import kotlinx.cinterop.toKString
import org.gtkkn.native.atk.AtkRole
import org.gtkkn.native.atk.atk_role_for_name
import org.gtkkn.native.atk.atk_role_get_localized_name
import org.gtkkn.native.atk.atk_role_get_name
import org.gtkkn.native.atk.atk_role_register
import kotlin.String

/**
 * Describes the role of an object
 *
 * These are the built-in enumerated roles that UI components can have
 * in ATK.  Other roles may be added at runtime, so an AtkRole >=
 * %ATK_ROLE_LAST_DEFINED is not necessarily an error.
 */
public enum class Role(
    public val nativeValue: AtkRole,
) {
    /**
     * Invalid role
     */
    INVALID(AtkRole.ATK_ROLE_INVALID),

    /**
     * A label which represents an accelerator
     */
    ACCELERATOR_LABEL(AtkRole.ATK_ROLE_ACCEL_LABEL),

    /**
     * An object which is an alert to the user. Assistive Technologies typically respond to ATK_ROLE_ALERT by reading the entire onscreen contents of containers advertising this role.  Should be used for warning dialogs, etc.
     */
    ALERT(AtkRole.ATK_ROLE_ALERT),

    /**
     * An object which is an animated image
     */
    ANIMATION(AtkRole.ATK_ROLE_ANIMATION),

    /**
     * An arrow in one of the four cardinal directions
     */
    ARROW(AtkRole.ATK_ROLE_ARROW),

    /**
     * An object that displays a calendar and allows the user to select a date
     */
    CALENDAR(AtkRole.ATK_ROLE_CALENDAR),

    /**
     * An object that can be drawn into and is used to trap events
     */
    CANVAS(AtkRole.ATK_ROLE_CANVAS),

    /**
     * A choice that can be checked or unchecked and provides a separate indicator for the current state
     */
    CHECK_BOX(AtkRole.ATK_ROLE_CHECK_BOX),

    /**
     * A menu item with a check box
     */
    CHECK_MENU_ITEM(AtkRole.ATK_ROLE_CHECK_MENU_ITEM),

    /**
     * A specialized dialog that lets the user choose a color
     */
    COLOR_CHOOSER(AtkRole.ATK_ROLE_COLOR_CHOOSER),

    /**
     * The header for a column of data
     */
    COLUMN_HEADER(AtkRole.ATK_ROLE_COLUMN_HEADER),

    /**
     * A collapsible list of choices the user can select from
     */
    COMBO_BOX(AtkRole.ATK_ROLE_COMBO_BOX),

    /**
     * An object whose purpose is to allow a user to edit a date
     */
    DATE_EDITOR(AtkRole.ATK_ROLE_DATE_EDITOR),

    /**
     * An inconifed internal frame within a DESKTOP_PANE
     */
    DESKTOP_ICON(AtkRole.ATK_ROLE_DESKTOP_ICON),

    /**
     * A pane that supports internal frames and iconified versions of those internal frames
     */
    DESKTOP_FRAME(AtkRole.ATK_ROLE_DESKTOP_FRAME),

    /**
     * An object whose purpose is to allow a user to set a value
     */
    DIAL(AtkRole.ATK_ROLE_DIAL),

    /**
     * A top level window with title bar and a border
     */
    DIALOG(AtkRole.ATK_ROLE_DIALOG),

    /**
     * A pane that allows the user to navigate through and select the contents of a directory
     */
    DIRECTORY_PANE(AtkRole.ATK_ROLE_DIRECTORY_PANE),

    /**
     * An object used for drawing custom user interface elements
     */
    DRAWING_AREA(AtkRole.ATK_ROLE_DRAWING_AREA),

    /**
     * A specialized dialog that lets the user choose a file
     */
    FILE_CHOOSER(AtkRole.ATK_ROLE_FILE_CHOOSER),

    /**
     * A object that fills up space in a user interface
     */
    FILLER(AtkRole.ATK_ROLE_FILLER),

    /**
     * A specialized dialog that lets the user choose a font
     */
    FONT_CHOOSER(AtkRole.ATK_ROLE_FONT_CHOOSER),

    /**
     * A top level window with a title bar, border, menubar, etc.
     */
    FRAME(AtkRole.ATK_ROLE_FRAME),

    /**
     * A pane that is guaranteed to be painted on top of all panes beneath it
     */
    GLASS_PANE(AtkRole.ATK_ROLE_GLASS_PANE),

    /**
     * A document container for HTML, whose children represent the document content
     */
    HTML_CONTAINER(AtkRole.ATK_ROLE_HTML_CONTAINER),

    /**
     * A small fixed size picture, typically used to decorate components
     */
    ICON(AtkRole.ATK_ROLE_ICON),

    /**
     * An object whose primary purpose is to display an image
     */
    IMAGE(AtkRole.ATK_ROLE_IMAGE),

    /**
     * A frame-like object that is clipped by a desktop pane
     */
    INTERNAL_FRAME(AtkRole.ATK_ROLE_INTERNAL_FRAME),

    /**
     * An object used to present an icon or short string in an interface
     */
    LABEL(AtkRole.ATK_ROLE_LABEL),

    /**
     * A specialized pane that allows its children to be drawn in layers, providing a form of stacking order
     */
    LAYERED_PANE(AtkRole.ATK_ROLE_LAYERED_PANE),

    /**
     * An object that presents a list of objects to the user and allows the user to select one or more of them
     */
    LIST(AtkRole.ATK_ROLE_LIST),

    /**
     * An object that represents an element of a list
     */
    LIST_ITEM(AtkRole.ATK_ROLE_LIST_ITEM),

    /**
     * An object usually found inside a menu bar that contains a list of actions the user can choose from
     */
    MENU(AtkRole.ATK_ROLE_MENU),

    /**
     * An object usually drawn at the top of the primary dialog box of an application that contains a list of menus the user can choose from
     */
    MENU_BAR(AtkRole.ATK_ROLE_MENU_BAR),

    /**
     * An object usually contained in a menu that presents an action the user can choose
     */
    MENU_ITEM(AtkRole.ATK_ROLE_MENU_ITEM),

    /**
     * A specialized pane whose primary use is inside a DIALOG
     */
    OPTION_PANE(AtkRole.ATK_ROLE_OPTION_PANE),

    /**
     * An object that is a child of a page tab list
     */
    PAGE_TAB(AtkRole.ATK_ROLE_PAGE_TAB),

    /**
     * An object that presents a series of panels (or page tabs), one at a time, through some mechanism provided by the object
     */
    PAGE_TAB_LIST(AtkRole.ATK_ROLE_PAGE_TAB_LIST),

    /**
     * A generic container that is often used to group objects
     */
    PANEL(AtkRole.ATK_ROLE_PANEL),

    /**
     * A text object uses for passwords, or other places where the text content is not shown visibly to the user
     */
    PASSWORD_TEXT(AtkRole.ATK_ROLE_PASSWORD_TEXT),

    /**
     * A temporary window that is usually used to offer the user a list of choices, and then hides when the user selects one of those choices
     */
    POPUP_MENU(AtkRole.ATK_ROLE_POPUP_MENU),

    /**
     * An object used to indicate how much of a task has been completed
     */
    PROGRESS_BAR(AtkRole.ATK_ROLE_PROGRESS_BAR),

    /**
     * An object the user can manipulate to tell the application to do something
     */
    PUSH_BUTTON(AtkRole.ATK_ROLE_PUSH_BUTTON),

    /**
     * A specialized check box that will cause other radio buttons in the same group to become unchecked when this one is checked
     */
    RADIO_BUTTON(AtkRole.ATK_ROLE_RADIO_BUTTON),

    /**
     * A check menu item which belongs to a group. At each instant exactly one of the radio menu items from a group is selected
     */
    RADIO_MENU_ITEM(AtkRole.ATK_ROLE_RADIO_MENU_ITEM),

    /**
     * A specialized pane that has a glass pane and a layered pane as its children
     */
    ROOT_PANE(AtkRole.ATK_ROLE_ROOT_PANE),

    /**
     * The header for a row of data
     */
    ROW_HEADER(AtkRole.ATK_ROLE_ROW_HEADER),

    /**
     * An object usually used to allow a user to incrementally view a large amount of data.
     */
    SCROLL_BAR(AtkRole.ATK_ROLE_SCROLL_BAR),

    /**
     * An object that allows a user to incrementally view a large amount of information
     */
    SCROLL_PANE(AtkRole.ATK_ROLE_SCROLL_PANE),

    /**
     * An object usually contained in a menu to provide a visible and logical separation of the contents in a menu
     */
    SEPARATOR(AtkRole.ATK_ROLE_SEPARATOR),

    /**
     * An object that allows the user to select from a bounded range
     */
    SLIDER(AtkRole.ATK_ROLE_SLIDER),

    /**
     * A specialized panel that presents two other panels at the same time
     */
    SPLIT_PANE(AtkRole.ATK_ROLE_SPLIT_PANE),

    /**
     * An object used to get an integer or floating point number from the user
     */
    SPIN_BUTTON(AtkRole.ATK_ROLE_SPIN_BUTTON),

    /**
     * An object which reports messages of minor importance to the user
     */
    STATUSBAR(AtkRole.ATK_ROLE_STATUSBAR),

    /**
     * An object used to represent information in terms of rows and columns
     */
    TABLE(AtkRole.ATK_ROLE_TABLE),

    /**
     * A cell in a table
     */
    TABLE_CELL(AtkRole.ATK_ROLE_TABLE_CELL),

    /**
     * The header for a column of a table
     */
    TABLE_COLUMN_HEADER(AtkRole.ATK_ROLE_TABLE_COLUMN_HEADER),

    /**
     * The header for a row of a table
     */
    TABLE_ROW_HEADER(AtkRole.ATK_ROLE_TABLE_ROW_HEADER),

    /**
     * A menu item used to tear off and reattach its menu
     */
    TEAR_OFF_MENU_ITEM(AtkRole.ATK_ROLE_TEAR_OFF_MENU_ITEM),

    /**
     * An object that represents an accessible terminal.  (Since: 0.6)
     */
    TERMINAL(AtkRole.ATK_ROLE_TERMINAL),

    /**
     * An interactive widget that supports multiple lines of text and
     * optionally accepts user input, but whose purpose is not to solicit user input.
     * Thus ATK_ROLE_TEXT is appropriate for the text view in a plain text editor
     * but inappropriate for an input field in a dialog box or web form. For widgets
     * whose purpose is to solicit input from the user, see ATK_ROLE_ENTRY and
     * ATK_ROLE_PASSWORD_TEXT. For generic objects which display a brief amount of
     * textual information, see ATK_ROLE_STATIC.
     */
    TEXT(AtkRole.ATK_ROLE_TEXT),

    /**
     * A specialized push button that can be checked or unchecked, but does not provide a separate indicator for the current state
     */
    TOGGLE_BUTTON(AtkRole.ATK_ROLE_TOGGLE_BUTTON),

    /**
     * A bar or palette usually composed of push buttons or toggle buttons
     */
    TOOL_BAR(AtkRole.ATK_ROLE_TOOL_BAR),

    /**
     * An object that provides information about another object
     */
    TOOL_TIP(AtkRole.ATK_ROLE_TOOL_TIP),

    /**
     * An object used to represent hierarchical information to the user
     */
    TREE(AtkRole.ATK_ROLE_TREE),

    /**
     * An object capable of expanding and collapsing rows as well as showing multiple columns of data.   (Since: 0.7)
     */
    TREE_TABLE(AtkRole.ATK_ROLE_TREE_TABLE),

    /**
     * The object contains some Accessible information, but its role is not known
     */
    UNKNOWN(AtkRole.ATK_ROLE_UNKNOWN),

    /**
     * An object usually used in a scroll pane
     */
    VIEWPORT(AtkRole.ATK_ROLE_VIEWPORT),

    /**
     * A top level window with no title or border.
     */
    WINDOW(AtkRole.ATK_ROLE_WINDOW),

    /**
     * An object that serves as a document header. (Since: 1.1.1)
     */
    HEADER(AtkRole.ATK_ROLE_HEADER),

    /**
     * An object that serves as a document footer.  (Since: 1.1.1)
     */
    FOOTER(AtkRole.ATK_ROLE_FOOTER),

    /**
     * An object which is contains a paragraph of text content.   (Since: 1.1.1)
     */
    PARAGRAPH(AtkRole.ATK_ROLE_PARAGRAPH),

    /**
     * An object which describes margins and tab stops, etc. for text objects which it controls (should have CONTROLLER_FOR relation to such).   (Since: 1.1.1)
     */
    RULER(AtkRole.ATK_ROLE_RULER),

    /**
     * The object is an application object, which may contain @ATK_ROLE_FRAME objects or other types of accessibles.  The root accessible of any application's ATK hierarchy should have ATK_ROLE_APPLICATION.   (Since: 1.1.4)
     */
    APPLICATION(AtkRole.ATK_ROLE_APPLICATION),

    /**
     * The object is a dialog or list containing items for insertion into an entry widget, for instance a list of words for completion of a text entry.   (Since: 1.3)
     */
    AUTOCOMPLETE(AtkRole.ATK_ROLE_AUTOCOMPLETE),

    /**
     * The object is an editable text object in a toolbar.  (Since: 1.5)
     */
    EDIT_BAR(AtkRole.ATK_ROLE_EDITBAR),

    /**
     * The object is an embedded container within a document or panel.  This role is a grouping "hint" indicating that the contained objects share a context.  (Since: 1.7.2)
     */
    EMBEDDED(AtkRole.ATK_ROLE_EMBEDDED),

    /**
     * The object is a component whose textual content may be entered or modified by the user, provided @ATK_STATE_EDITABLE is present.   (Since: 1.11)
     */
    ENTRY(AtkRole.ATK_ROLE_ENTRY),

    /**
     * The object is a graphical depiction of quantitative data. It may contain multiple subelements whose attributes and/or description may be queried to obtain both the quantitative data and information about how the data is being presented. The LABELLED_BY relation is particularly important in interpreting objects of this type, as is the accessible-description property.  (Since: 1.11)
     */
    CHART(AtkRole.ATK_ROLE_CHART),

    /**
     * The object contains descriptive information, usually textual, about another user interface element such as a table, chart, or image.  (Since: 1.11)
     */
    CAPTION(AtkRole.ATK_ROLE_CAPTION),

    /**
     * The object is a visual frame or container which contains a view of document content. Document frames may occur within another Document instance, in which case the second document may be said to be embedded in the containing instance. HTML frames are often ROLE_DOCUMENT_FRAME. Either this object, or a singleton descendant, should implement the Document interface.  (Since: 1.11)
     */
    DOCUMENT_FRAME(AtkRole.ATK_ROLE_DOCUMENT_FRAME),

    /**
     * The object serves as a heading for content which follows it in a document. The 'heading level' of the heading, if availabe, may be obtained by querying the object's attributes.
     */
    HEADING(AtkRole.ATK_ROLE_HEADING),

    /**
     * The object is a containing instance which encapsulates a page of information. @ATK_ROLE_PAGE is used in documents and content which support a paginated navigation model.  (Since: 1.11)
     */
    PAGE(AtkRole.ATK_ROLE_PAGE),

    /**
     * The object is a containing instance of document content which constitutes a particular 'logical' section of the document. The type of content within a section, and the nature of the section division itself, may be obtained by querying the object's attributes. Sections may be nested. (Since: 1.11)
     */
    SECTION(AtkRole.ATK_ROLE_SECTION),

    /**
     * The object is redundant with another object in the hierarchy, and is exposed for purely technical reasons.  Objects of this role should normally be ignored by clients. (Since: 1.11)
     */
    REDUNDANT_OBJECT(AtkRole.ATK_ROLE_REDUNDANT_OBJECT),

    /**
     * The object is a container for form controls, for instance as part of a
     * web form or user-input form within a document.  This role is primarily a tag/convenience for
     * clients when navigating complex documents, it is not expected that ordinary GUI containers will
     * always have ATK_ROLE_FORM. (Since: 1.12.0)
     */
    FORM(AtkRole.ATK_ROLE_FORM),

    /**
     * The object is a hypertext anchor, i.e. a "link" in a
     * hypertext document.  Such objects are distinct from 'inline'
     * content which may also use the Hypertext/Hyperlink interfaces
     * to indicate the range/location within a text object where
     * an inline or embedded object lies.  (Since: 1.12.1)
     */
    LINK(AtkRole.ATK_ROLE_LINK),

    /**
     * The object is a window or similar viewport
     * which is used to allow composition or input of a 'complex character',
     * in other words it is an "input method window." (Since: 1.12.1)
     */
    INPUT_METHOD_WINDOW(AtkRole.ATK_ROLE_INPUT_METHOD_WINDOW),

    /**
     * A row in a table.  (Since: 2.1.0)
     */
    TABLE_ROW(AtkRole.ATK_ROLE_TABLE_ROW),

    /**
     * An object that represents an element of a tree.  (Since: 2.1.0)
     */
    TREE_ITEM(AtkRole.ATK_ROLE_TREE_ITEM),

    /**
     * A document frame which contains a spreadsheet.  (Since: 2.1.0)
     */
    DOCUMENT_SPREADSHEET(AtkRole.ATK_ROLE_DOCUMENT_SPREADSHEET),

    /**
     * A document frame which contains a presentation or slide content.  (Since: 2.1.0)
     */
    DOCUMENT_PRESENTATION(AtkRole.ATK_ROLE_DOCUMENT_PRESENTATION),

    /**
     * A document frame which contains textual content, such as found in a word processing application.  (Since: 2.1.0)
     */
    DOCUMENT_TEXT(AtkRole.ATK_ROLE_DOCUMENT_TEXT),

    /**
     * A document frame which contains HTML or other markup suitable for display in a web browser.  (Since: 2.1.0)
     */
    DOCUMENT_WEB(AtkRole.ATK_ROLE_DOCUMENT_WEB),

    /**
     * A document frame which contains email content to be displayed or composed either in plain text or HTML.  (Since: 2.1.0)
     */
    DOCUMENT_EMAIL(AtkRole.ATK_ROLE_DOCUMENT_EMAIL),

    /**
     * An object found within a document and designed to present a comment, note, or other annotation. In some cases, this object might not be visible until activated.  (Since: 2.1.0)
     */
    COMMENT(AtkRole.ATK_ROLE_COMMENT),

    /**
     * A non-collapsible list of choices the user can select from. (Since: 2.1.0)
     */
    LIST_BOX(AtkRole.ATK_ROLE_LIST_BOX),

    /**
     * A group of related widgets. This group typically has a label. (Since: 2.1.0)
     */
    GROUPING(AtkRole.ATK_ROLE_GROUPING),

    /**
     * An image map object. Usually a graphic with multiple hotspots, where each hotspot can be activated resulting in the loading of another document or section of a document. (Since: 2.1.0)
     */
    IMAGE_MAP(AtkRole.ATK_ROLE_IMAGE_MAP),

    /**
     * A transitory object designed to present a message to the user, typically at the desktop level rather than inside a particular application.  (Since: 2.1.0)
     */
    NOTIFICATION(AtkRole.ATK_ROLE_NOTIFICATION),

    /**
     * An object designed to present a message to the user within an existing window. (Since: 2.1.0)
     */
    INFO_BAR(AtkRole.ATK_ROLE_INFO_BAR),

    /**
     * A bar that serves as a level indicator to, for instance, show the strength of a password or the state of a battery.  (Since: 2.7.3)
     */
    LEVEL_BAR(AtkRole.ATK_ROLE_LEVEL_BAR),

    /**
     * A bar that serves as the title of a window or a
     * dialog. (Since: 2.12)
     */
    TITLE_BAR(AtkRole.ATK_ROLE_TITLE_BAR),

    /**
     * An object which contains a text section
     * that is quoted from another source. (Since: 2.12)
     */
    BLOCK_QUOTE(AtkRole.ATK_ROLE_BLOCK_QUOTE),

    /**
     * An object which represents an audio element. (Since: 2.12)
     */
    AUDIO(AtkRole.ATK_ROLE_AUDIO),

    /**
     * An object which represents a video element. (Since: 2.12)
     */
    VIDEO(AtkRole.ATK_ROLE_VIDEO),

    /**
     * A definition of a term or concept. (Since: 2.12)
     */
    DEFINITION(AtkRole.ATK_ROLE_DEFINITION),

    /**
     * A section of a page that consists of a
     * composition that forms an independent part of a document, page, or
     * site. Examples: A blog entry, a news story, a forum post. (Since: 2.12)
     */
    ARTICLE(AtkRole.ATK_ROLE_ARTICLE),

    /**
     * A region of a web page intended as a
     * navigational landmark. This is designed to allow Assistive
     * Technologies to provide quick navigation among key regions within a
     * document. (Since: 2.12)
     */
    LANDMARK(AtkRole.ATK_ROLE_LANDMARK),

    /**
     * A text widget or container holding log content, such
     * as chat history and error logs. In this role there is a
     * relationship between the arrival of new items in the log and the
     * reading order. The log contains a meaningful sequence and new
     * information is added only to the end of the log, not at arbitrary
     * points. (Since: 2.12)
     */
    LOG(AtkRole.ATK_ROLE_LOG),

    /**
     * A container where non-essential information
     * changes frequently. Common usages of marquee include stock tickers
     * and ad banners. The primary difference between a marquee and a log
     * is that logs usually have a meaningful order or sequence of
     * important content changes. (Since: 2.12)
     */
    MARQUEE(AtkRole.ATK_ROLE_MARQUEE),

    /**
     * A text widget or container that holds a mathematical
     * expression. (Since: 2.12)
     */
    MATH(AtkRole.ATK_ROLE_MATH),

    /**
     * A widget whose purpose is to display a rating,
     * such as the number of stars associated with a song in a media
     * player. Objects of this role should also implement
     * AtkValue. (Since: 2.12)
     */
    RATING(AtkRole.ATK_ROLE_RATING),

    /**
     * An object containing a numerical counter which
     * indicates an amount of elapsed time from a start point, or the time
     * remaining until an end point. (Since: 2.12)
     */
    TIMER(AtkRole.ATK_ROLE_TIMER),

    /**
     * An object that represents a list of
     * term-value groups. A term-value group represents a individual
     * description and consist of one or more names
     * (ATK_ROLE_DESCRIPTION_TERM) followed by one or more values
     * (ATK_ROLE_DESCRIPTION_VALUE). For each list, there should not be
     * more than one group with the same term name. (Since: 2.12)
     */
    DESCRIPTION_LIST(AtkRole.ATK_ROLE_DESCRIPTION_LIST),

    /**
     * An object that represents a term or phrase
     * with a corresponding definition. (Since: 2.12)
     */
    DESCRIPTION_TERM(AtkRole.ATK_ROLE_DESCRIPTION_TERM),

    /**
     * An object that represents the
     * description, definition or value of a term. (Since: 2.12)
     */
    DESCRIPTION_VALUE(AtkRole.ATK_ROLE_DESCRIPTION_VALUE),

    /**
     * A generic non-container object whose purpose is to display a
     * brief amount of information to the user and whose role is known by the
     * implementor but lacks semantic value for the user. Examples in which
     * %ATK_ROLE_STATIC is appropriate include the message displayed in a message box
     * and an image used as an alternative means to display text. %ATK_ROLE_STATIC
     * should not be applied to widgets which are traditionally interactive, objects
     * which display a significant amount of content, or any object which has an
     * accessible relation pointing to another object. Implementors should expose the
     * displayed information through the accessible name of the object. If doing so seems
     * inappropriate, it may indicate that a different role should be used. For
     * labels which describe another widget, see %ATK_ROLE_LABEL. For text views, see
     * %ATK_ROLE_TEXT. For generic containers, see %ATK_ROLE_PANEL. For objects whose
     * role is not known by the implementor, see %ATK_ROLE_UNKNOWN. (Since: 2.16)
     */
    STATIC(AtkRole.ATK_ROLE_STATIC),

    /**
     * An object that represents a mathematical fraction.
     * (Since: 2.16)
     */
    MATH_FRACTION(AtkRole.ATK_ROLE_MATH_FRACTION),

    /**
     * An object that represents a mathematical expression
     * displayed with a radical. (Since: 2.16)
     */
    MATH_ROOT(AtkRole.ATK_ROLE_MATH_ROOT),

    /**
     * An object that contains text that is displayed as a
     * subscript. (Since: 2.16)
     */
    SUBSCRIPT(AtkRole.ATK_ROLE_SUBSCRIPT),

    /**
     * An object that contains text that is displayed as a
     * superscript. (Since: 2.16)
     */
    SUPERSCRIPT(AtkRole.ATK_ROLE_SUPERSCRIPT),

    /**
     * An object that contains the text of a footnote. (Since: 2.26)
     */
    FOOTNOTE(AtkRole.ATK_ROLE_FOOTNOTE),

    /**
     * Content previously deleted or proposed to be
     * deleted, e.g. in revision history or a content view providing suggestions
     * from reviewers. (Since: 2.34)
     */
    CONTENT_DELETION(AtkRole.ATK_ROLE_CONTENT_DELETION),

    /**
     * Content previously inserted or proposed to be
     * inserted, e.g. in revision history or a content view providing suggestions
     * from reviewers. (Since: 2.34)
     */
    CONTENT_INSERTION(AtkRole.ATK_ROLE_CONTENT_INSERTION),

    /**
     * A run of content that is marked or highlighted, such as for
     * reference purposes, or to call it out as having a special purpose. If the
     * marked content has an associated section in the document elaborating on the
     * reason for the mark, then %ATK_RELATION_DETAILS should be used on the mark
     * to point to that associated section. In addition, the reciprocal relation
     * %ATK_RELATION_DETAILS_FOR should be used on the associated content section
     * to point back to the mark. (Since: 2.36)
     */
    MARK(AtkRole.ATK_ROLE_MARK),

    /**
     * A container for content that is called out as a proposed
     * change from the current version of the document, such as by a reviewer of the
     * content. This role should include either %ATK_ROLE_CONTENT_DELETION and/or
     * %ATK_ROLE_CONTENT_INSERTION children, in any order, to indicate what the
     * actual change is. (Since: 2.36)
     */
    SUGGESTION(AtkRole.ATK_ROLE_SUGGESTION),

    /**
     * A specialized push button to open a menu.
     * (Since: 2.46)
     */
    PUSH_BUTTON_MENU(AtkRole.ATK_ROLE_PUSH_BUTTON_MENU),

    /**
     * not a valid role, used for finding end of the enumeration
     */
    LAST_DEFINED(AtkRole.ATK_ROLE_LAST_DEFINED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: AtkRole): Role =
            when (nativeValue) {
                AtkRole.ATK_ROLE_INVALID -> INVALID
                AtkRole.ATK_ROLE_ACCEL_LABEL -> ACCELERATOR_LABEL
                AtkRole.ATK_ROLE_ALERT -> ALERT
                AtkRole.ATK_ROLE_ANIMATION -> ANIMATION
                AtkRole.ATK_ROLE_ARROW -> ARROW
                AtkRole.ATK_ROLE_CALENDAR -> CALENDAR
                AtkRole.ATK_ROLE_CANVAS -> CANVAS
                AtkRole.ATK_ROLE_CHECK_BOX -> CHECK_BOX
                AtkRole.ATK_ROLE_CHECK_MENU_ITEM -> CHECK_MENU_ITEM
                AtkRole.ATK_ROLE_COLOR_CHOOSER -> COLOR_CHOOSER
                AtkRole.ATK_ROLE_COLUMN_HEADER -> COLUMN_HEADER
                AtkRole.ATK_ROLE_COMBO_BOX -> COMBO_BOX
                AtkRole.ATK_ROLE_DATE_EDITOR -> DATE_EDITOR
                AtkRole.ATK_ROLE_DESKTOP_ICON -> DESKTOP_ICON
                AtkRole.ATK_ROLE_DESKTOP_FRAME -> DESKTOP_FRAME
                AtkRole.ATK_ROLE_DIAL -> DIAL
                AtkRole.ATK_ROLE_DIALOG -> DIALOG
                AtkRole.ATK_ROLE_DIRECTORY_PANE -> DIRECTORY_PANE
                AtkRole.ATK_ROLE_DRAWING_AREA -> DRAWING_AREA
                AtkRole.ATK_ROLE_FILE_CHOOSER -> FILE_CHOOSER
                AtkRole.ATK_ROLE_FILLER -> FILLER
                AtkRole.ATK_ROLE_FONT_CHOOSER -> FONT_CHOOSER
                AtkRole.ATK_ROLE_FRAME -> FRAME
                AtkRole.ATK_ROLE_GLASS_PANE -> GLASS_PANE
                AtkRole.ATK_ROLE_HTML_CONTAINER -> HTML_CONTAINER
                AtkRole.ATK_ROLE_ICON -> ICON
                AtkRole.ATK_ROLE_IMAGE -> IMAGE
                AtkRole.ATK_ROLE_INTERNAL_FRAME -> INTERNAL_FRAME
                AtkRole.ATK_ROLE_LABEL -> LABEL
                AtkRole.ATK_ROLE_LAYERED_PANE -> LAYERED_PANE
                AtkRole.ATK_ROLE_LIST -> LIST
                AtkRole.ATK_ROLE_LIST_ITEM -> LIST_ITEM
                AtkRole.ATK_ROLE_MENU -> MENU
                AtkRole.ATK_ROLE_MENU_BAR -> MENU_BAR
                AtkRole.ATK_ROLE_MENU_ITEM -> MENU_ITEM
                AtkRole.ATK_ROLE_OPTION_PANE -> OPTION_PANE
                AtkRole.ATK_ROLE_PAGE_TAB -> PAGE_TAB
                AtkRole.ATK_ROLE_PAGE_TAB_LIST -> PAGE_TAB_LIST
                AtkRole.ATK_ROLE_PANEL -> PANEL
                AtkRole.ATK_ROLE_PASSWORD_TEXT -> PASSWORD_TEXT
                AtkRole.ATK_ROLE_POPUP_MENU -> POPUP_MENU
                AtkRole.ATK_ROLE_PROGRESS_BAR -> PROGRESS_BAR
                AtkRole.ATK_ROLE_PUSH_BUTTON -> PUSH_BUTTON
                AtkRole.ATK_ROLE_RADIO_BUTTON -> RADIO_BUTTON
                AtkRole.ATK_ROLE_RADIO_MENU_ITEM -> RADIO_MENU_ITEM
                AtkRole.ATK_ROLE_ROOT_PANE -> ROOT_PANE
                AtkRole.ATK_ROLE_ROW_HEADER -> ROW_HEADER
                AtkRole.ATK_ROLE_SCROLL_BAR -> SCROLL_BAR
                AtkRole.ATK_ROLE_SCROLL_PANE -> SCROLL_PANE
                AtkRole.ATK_ROLE_SEPARATOR -> SEPARATOR
                AtkRole.ATK_ROLE_SLIDER -> SLIDER
                AtkRole.ATK_ROLE_SPLIT_PANE -> SPLIT_PANE
                AtkRole.ATK_ROLE_SPIN_BUTTON -> SPIN_BUTTON
                AtkRole.ATK_ROLE_STATUSBAR -> STATUSBAR
                AtkRole.ATK_ROLE_TABLE -> TABLE
                AtkRole.ATK_ROLE_TABLE_CELL -> TABLE_CELL
                AtkRole.ATK_ROLE_TABLE_COLUMN_HEADER -> TABLE_COLUMN_HEADER
                AtkRole.ATK_ROLE_TABLE_ROW_HEADER -> TABLE_ROW_HEADER
                AtkRole.ATK_ROLE_TEAR_OFF_MENU_ITEM -> TEAR_OFF_MENU_ITEM
                AtkRole.ATK_ROLE_TERMINAL -> TERMINAL
                AtkRole.ATK_ROLE_TEXT -> TEXT
                AtkRole.ATK_ROLE_TOGGLE_BUTTON -> TOGGLE_BUTTON
                AtkRole.ATK_ROLE_TOOL_BAR -> TOOL_BAR
                AtkRole.ATK_ROLE_TOOL_TIP -> TOOL_TIP
                AtkRole.ATK_ROLE_TREE -> TREE
                AtkRole.ATK_ROLE_TREE_TABLE -> TREE_TABLE
                AtkRole.ATK_ROLE_UNKNOWN -> UNKNOWN
                AtkRole.ATK_ROLE_VIEWPORT -> VIEWPORT
                AtkRole.ATK_ROLE_WINDOW -> WINDOW
                AtkRole.ATK_ROLE_HEADER -> HEADER
                AtkRole.ATK_ROLE_FOOTER -> FOOTER
                AtkRole.ATK_ROLE_PARAGRAPH -> PARAGRAPH
                AtkRole.ATK_ROLE_RULER -> RULER
                AtkRole.ATK_ROLE_APPLICATION -> APPLICATION
                AtkRole.ATK_ROLE_AUTOCOMPLETE -> AUTOCOMPLETE
                AtkRole.ATK_ROLE_EDITBAR -> EDIT_BAR
                AtkRole.ATK_ROLE_EMBEDDED -> EMBEDDED
                AtkRole.ATK_ROLE_ENTRY -> ENTRY
                AtkRole.ATK_ROLE_CHART -> CHART
                AtkRole.ATK_ROLE_CAPTION -> CAPTION
                AtkRole.ATK_ROLE_DOCUMENT_FRAME -> DOCUMENT_FRAME
                AtkRole.ATK_ROLE_HEADING -> HEADING
                AtkRole.ATK_ROLE_PAGE -> PAGE
                AtkRole.ATK_ROLE_SECTION -> SECTION
                AtkRole.ATK_ROLE_REDUNDANT_OBJECT -> REDUNDANT_OBJECT
                AtkRole.ATK_ROLE_FORM -> FORM
                AtkRole.ATK_ROLE_LINK -> LINK
                AtkRole.ATK_ROLE_INPUT_METHOD_WINDOW -> INPUT_METHOD_WINDOW
                AtkRole.ATK_ROLE_TABLE_ROW -> TABLE_ROW
                AtkRole.ATK_ROLE_TREE_ITEM -> TREE_ITEM
                AtkRole.ATK_ROLE_DOCUMENT_SPREADSHEET -> DOCUMENT_SPREADSHEET
                AtkRole.ATK_ROLE_DOCUMENT_PRESENTATION -> DOCUMENT_PRESENTATION
                AtkRole.ATK_ROLE_DOCUMENT_TEXT -> DOCUMENT_TEXT
                AtkRole.ATK_ROLE_DOCUMENT_WEB -> DOCUMENT_WEB
                AtkRole.ATK_ROLE_DOCUMENT_EMAIL -> DOCUMENT_EMAIL
                AtkRole.ATK_ROLE_COMMENT -> COMMENT
                AtkRole.ATK_ROLE_LIST_BOX -> LIST_BOX
                AtkRole.ATK_ROLE_GROUPING -> GROUPING
                AtkRole.ATK_ROLE_IMAGE_MAP -> IMAGE_MAP
                AtkRole.ATK_ROLE_NOTIFICATION -> NOTIFICATION
                AtkRole.ATK_ROLE_INFO_BAR -> INFO_BAR
                AtkRole.ATK_ROLE_LEVEL_BAR -> LEVEL_BAR
                AtkRole.ATK_ROLE_TITLE_BAR -> TITLE_BAR
                AtkRole.ATK_ROLE_BLOCK_QUOTE -> BLOCK_QUOTE
                AtkRole.ATK_ROLE_AUDIO -> AUDIO
                AtkRole.ATK_ROLE_VIDEO -> VIDEO
                AtkRole.ATK_ROLE_DEFINITION -> DEFINITION
                AtkRole.ATK_ROLE_ARTICLE -> ARTICLE
                AtkRole.ATK_ROLE_LANDMARK -> LANDMARK
                AtkRole.ATK_ROLE_LOG -> LOG
                AtkRole.ATK_ROLE_MARQUEE -> MARQUEE
                AtkRole.ATK_ROLE_MATH -> MATH
                AtkRole.ATK_ROLE_RATING -> RATING
                AtkRole.ATK_ROLE_TIMER -> TIMER
                AtkRole.ATK_ROLE_DESCRIPTION_LIST -> DESCRIPTION_LIST
                AtkRole.ATK_ROLE_DESCRIPTION_TERM -> DESCRIPTION_TERM
                AtkRole.ATK_ROLE_DESCRIPTION_VALUE -> DESCRIPTION_VALUE
                AtkRole.ATK_ROLE_STATIC -> STATIC
                AtkRole.ATK_ROLE_MATH_FRACTION -> MATH_FRACTION
                AtkRole.ATK_ROLE_MATH_ROOT -> MATH_ROOT
                AtkRole.ATK_ROLE_SUBSCRIPT -> SUBSCRIPT
                AtkRole.ATK_ROLE_SUPERSCRIPT -> SUPERSCRIPT
                AtkRole.ATK_ROLE_FOOTNOTE -> FOOTNOTE
                AtkRole.ATK_ROLE_CONTENT_DELETION -> CONTENT_DELETION
                AtkRole.ATK_ROLE_CONTENT_INSERTION -> CONTENT_INSERTION
                AtkRole.ATK_ROLE_MARK -> MARK
                AtkRole.ATK_ROLE_SUGGESTION -> SUGGESTION
                AtkRole.ATK_ROLE_PUSH_BUTTON_MENU -> PUSH_BUTTON_MENU
                AtkRole.ATK_ROLE_LAST_DEFINED -> LAST_DEFINED
                else -> error("invalid nativeValue")
            }

        /**
         * Get the #AtkRole type corresponding to a rolew name.
         *
         * @param name a string which is the (non-localized) name of an ATK role.
         * @return the #AtkRole enumerated type corresponding to the specified name,
         *          or #ATK_ROLE_INVALID if no matching role is found.
         */
        public fun forName(name: String): Role =
            atk_role_for_name(name).run {
                Role.fromNativeValue(this)
            }

        /**
         * Gets the localized description string describing the #AtkRole @role.
         *
         * @param role The #AtkRole whose localized name is required
         * @return the localized string describing the AtkRole
         */
        public fun getLocalizedName(role: Role): String =
            atk_role_get_localized_name(role.nativeValue)?.toKString() ?: error("Expected not null string")

        /**
         * Gets the description string describing the #AtkRole @role.
         *
         * @param role The #AtkRole whose name is required
         * @return the string describing the AtkRole
         */
        public fun getName(role: Role): String =
            atk_role_get_name(role.nativeValue)?.toKString() ?: error("Expected not null string")

        /**
         * Registers the role specified by @name. @name must be a meaningful
         * name. So it should not be empty, or consisting on whitespaces.
         *
         * @param name a character string describing the new role.
         * @return an #AtkRole for the new role if added
         * properly. ATK_ROLE_INVALID in case of error.
         */
        public fun register(name: String): Role =
            atk_role_register(name).run {
                Role.fromNativeValue(this)
            }
    }
}
