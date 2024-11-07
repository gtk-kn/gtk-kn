// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import kotlinx.cinterop.toKString
import org.gtkkn.native.atk.AtkStateType
import org.gtkkn.native.atk.atk_state_type_for_name
import org.gtkkn.native.atk.atk_state_type_get_name
import org.gtkkn.native.atk.atk_state_type_register
import kotlin.String

/**
 * The possible types of states of an object
 */
public enum class StateType(
    public val nativeValue: AtkStateType,
) {
    /**
     * Indicates an invalid state - probably an error condition.
     */
    INVALID(AtkStateType.ATK_STATE_INVALID),

    /**
     * Indicates a window is currently the active window, or an object is the active subelement within a container or table. ATK_STATE_ACTIVE should not be used for objects which have ATK_STATE_FOCUSABLE or ATK_STATE_SELECTABLE: Those objects should use ATK_STATE_FOCUSED and ATK_STATE_SELECTED respectively. ATK_STATE_ACTIVE is a means to indicate that an object which is not focusable and not selectable is the currently-active item within its parent container.
     */
    ACTIVE(AtkStateType.ATK_STATE_ACTIVE),

    /**
     * Indicates that the object is 'armed', i.e. will be activated by if a pointer button-release event occurs within its bounds.  Buttons often enter this state when a pointer click occurs within their bounds, as a precursor to activation. ATK_STATE_ARMED has been deprecated since ATK-2.16 and should not be used in newly-written code.
     */
    ARMED(AtkStateType.ATK_STATE_ARMED),

    /**
     * Indicates the current object is busy, i.e. onscreen representation is in the process of changing, or the object is temporarily unavailable for interaction due to activity already in progress.  This state may be used by implementors of Document to indicate that content loading is underway.  It also may indicate other 'pending' conditions; clients may wish to interrogate this object when the ATK_STATE_BUSY flag is removed.
     */
    BUSY(AtkStateType.ATK_STATE_BUSY),

    /**
     * Indicates this object is currently checked, for instance a checkbox is 'non-empty'.
     */
    CHECKED(AtkStateType.ATK_STATE_CHECKED),

    /**
     * Indicates that this object no longer has a valid backing widget (for instance, if its peer object has been destroyed)
     */
    DEFUNCT(AtkStateType.ATK_STATE_DEFUNCT),

    /**
     * Indicates that this object can contain text, and that the
     * user can change the textual contents of this object by editing those contents
     * directly. For an object which is expected to be editable due to its type, but
     * which cannot be edited due to the application or platform preventing the user
     * from doing so, that object's #AtkStateSet should lack ATK_STATE_EDITABLE and
     * should contain ATK_STATE_READ_ONLY.
     */
    EDITABLE(AtkStateType.ATK_STATE_EDITABLE),

    /**
     * Indicates that this object is enabled, i.e. that it currently reflects some application state. Objects that are "greyed out" may lack this state, and may lack the STATE_SENSITIVE if direct user interaction cannot cause them to acquire STATE_ENABLED. See also: ATK_STATE_SENSITIVE
     */
    ENABLED(AtkStateType.ATK_STATE_ENABLED),

    /**
     * Indicates this object allows progressive disclosure of its children
     */
    EXPANDABLE(AtkStateType.ATK_STATE_EXPANDABLE),

    /**
     * Indicates this object its expanded - see ATK_STATE_EXPANDABLE above
     */
    EXPANDED(AtkStateType.ATK_STATE_EXPANDED),

    /**
     * Indicates this object can accept keyboard focus, which means all events resulting from typing on the keyboard will normally be passed to it when it has focus
     */
    FOCUSABLE(AtkStateType.ATK_STATE_FOCUSABLE),

    /**
     * Indicates this object currently has the keyboard focus
     */
    FOCUSED(AtkStateType.ATK_STATE_FOCUSED),

    /**
     * Indicates the orientation of this object is horizontal; used, for instance, by objects of ATK_ROLE_SCROLL_BAR.  For objects where vertical/horizontal orientation is especially meaningful.
     */
    HORIZONTAL(AtkStateType.ATK_STATE_HORIZONTAL),

    /**
     * Indicates this object is minimized and is represented only by an icon
     */
    ICONIFIED(AtkStateType.ATK_STATE_ICONIFIED),

    /**
     * Indicates something must be done with this object before the user can interact with an object in a different window
     */
    MODAL(AtkStateType.ATK_STATE_MODAL),

    /**
     * Indicates this (text) object can contain multiple lines of text
     */
    MULTI_LINE(AtkStateType.ATK_STATE_MULTI_LINE),

    /**
     * Indicates this object allows more than one of its children to be selected at the same time, or in the case of text objects, that the object supports non-contiguous text selections.
     */
    MULTISELECTABLE(AtkStateType.ATK_STATE_MULTISELECTABLE),

    /**
     * Indicates this object paints every pixel within its rectangular region.
     */
    OPAQUE(AtkStateType.ATK_STATE_OPAQUE),

    /**
     * Indicates this object is currently pressed.
     */
    PRESSED(AtkStateType.ATK_STATE_PRESSED),

    /**
     * Indicates the size of this object is not fixed
     */
    RESIZABLE(AtkStateType.ATK_STATE_RESIZABLE),

    /**
     * Indicates this object is the child of an object that allows its children to be selected and that this child is one of those children that can be selected
     */
    SELECTABLE(AtkStateType.ATK_STATE_SELECTABLE),

    /**
     * Indicates this object is the child of an object that allows its children to be selected and that this child is one of those children that has been selected
     */
    SELECTED(AtkStateType.ATK_STATE_SELECTED),

    /**
     * Indicates this object is sensitive, e.g. to user interaction.
     * STATE_SENSITIVE usually accompanies STATE_ENABLED for user-actionable controls,
     * but may be found in the absence of STATE_ENABLED if the current visible state of the
     * control is "disconnected" from the application state.  In such cases, direct user interaction
     * can often result in the object gaining STATE_SENSITIVE, for instance if a user makes
     * an explicit selection using an object whose current state is ambiguous or undefined.
     * @see STATE_ENABLED, STATE_INDETERMINATE.
     */
    SENSITIVE(AtkStateType.ATK_STATE_SENSITIVE),

    /**
     * Indicates this object, the object's parent, the object's parent's parent, and so on,
     * are all 'shown' to the end-user, i.e. subject to "exposure" if blocking or obscuring objects do not interpose
     * between this object and the top of the window stack.
     */
    SHOWING(AtkStateType.ATK_STATE_SHOWING),

    /**
     * Indicates this (text) object can contain only a single line of text
     */
    SINGLE_LINE(AtkStateType.ATK_STATE_SINGLE_LINE),

    /**
     * Indicates that the information returned for this object may no longer be
     * synchronized with the application state.  This is implied if the object has STATE_TRANSIENT,
     * and can also occur towards the end of the object peer's lifecycle. It can also be used to indicate that
     * the index associated with this object has changed since the user accessed the object (in lieu of
     * "index-in-parent-changed" events).
     */
    STALE(AtkStateType.ATK_STATE_STALE),

    /**
     * Indicates this object is transient, i.e. a snapshot which may not emit events when its
     * state changes.  Data from objects with ATK_STATE_TRANSIENT should not be cached, since there may be no
     * notification given when the cached data becomes obsolete.
     */
    TRANSIENT(AtkStateType.ATK_STATE_TRANSIENT),

    /**
     * Indicates the orientation of this object is vertical
     */
    VERTICAL(AtkStateType.ATK_STATE_VERTICAL),

    /**
     * Indicates this object is visible, e.g. has been explicitly marked for exposure to the user.
     * **note**: %ATK_STATE_VISIBLE is no guarantee that the object is actually unobscured on the screen, only
     * that it is 'potentially' visible, barring obstruction, being scrolled or clipped out of the
     * field of view, or having an ancestor container that has not yet made visible.
     * A widget is potentially onscreen if it has both %ATK_STATE_VISIBLE and %ATK_STATE_SHOWING.
     * The absence of %ATK_STATE_VISIBLE and %ATK_STATE_SHOWING is semantically equivalent to saying
     * that an object is 'hidden'.  See also %ATK_STATE_TRUNCATED, which applies if an object with
     * %ATK_STATE_VISIBLE and %ATK_STATE_SHOWING set lies within a viewport which means that its
     * contents are clipped, e.g. a truncated spreadsheet cell or
     * an image within a scrolling viewport.  Mostly useful for screen-review and magnification
     * algorithms.
     */
    VISIBLE(AtkStateType.ATK_STATE_VISIBLE),

    /**
     * Indicates that "active-descendant-changed" event
     * is sent when children become 'active' (i.e. are selected or navigated to onscreen).
     * Used to prevent need to enumerate all children in very large containers, like tables.
     * The presence of STATE_MANAGES_DESCENDANTS is an indication to the client.
     * that the children should not, and need not, be enumerated by the client.
     * Objects implementing this state are expected to provide relevant state
     * notifications to listening clients, for instance notifications of visibility
     * changes and activation of their contained child objects, without the client
     * having previously requested references to those children.
     */
    MANAGES_DESCENDANTS(AtkStateType.ATK_STATE_MANAGES_DESCENDANTS),

    /**
     * Indicates that the value, or some other quantifiable
     * property, of this AtkObject cannot be fully determined. In the case of a large
     * data set in which the total number of items in that set is unknown (e.g. 1 of
     * 999+), implementors should expose the currently-known set size (999) along
     * with this state. In the case of a check box, this state should be used to
     * indicate that the check box is a tri-state check box which is currently
     * neither checked nor unchecked.
     */
    INDETERMINATE(AtkStateType.ATK_STATE_INDETERMINATE),

    /**
     * Indicates that an object is truncated, e.g. a text value in a speradsheet cell.
     */
    TRUNCATED(AtkStateType.ATK_STATE_TRUNCATED),

    /**
     * Indicates that explicit user interaction with an object is required by the user interface, e.g. a required field in a "web-form" interface.
     */
    REQUIRED(AtkStateType.ATK_STATE_REQUIRED),

    /**
     * Indicates that the object has encountered an error condition due to failure of input validation. For instance, a form control may acquire this state in response to invalid or malformed user input.
     */
    INVALID_ENTRY(AtkStateType.ATK_STATE_INVALID_ENTRY),

    /**
     * Indicates that the object in question implements some form of ¨typeahead¨ or
     * pre-selection behavior whereby entering the first character of one or more sub-elements
     * causes those elements to scroll into view or become selected.  Subsequent character input
     * may narrow the selection further as long as one or more sub-elements match the string.
     * This state is normally only useful and encountered on objects that implement Selection.
     * In some cases the typeahead behavior may result in full or partial ¨completion¨ of
     * the data in the input field, in which case these input events may trigger text-changed
     * events from the AtkText interface.  This state supplants @ATK_ROLE_AUTOCOMPLETE.
     */
    SUPPORTS_AUTOCOMPLETION(AtkStateType.ATK_STATE_SUPPORTS_AUTOCOMPLETION),

    /**
     * Indicates that the object in question supports text selection. It should only be exposed on objects which implement the Text interface, in order to distinguish this state from @ATK_STATE_SELECTABLE, which infers that the object in question is a selectable child of an object which implements Selection. While similar, text selection and subelement selection are distinct operations.
     */
    SELECTABLE_TEXT(AtkStateType.ATK_STATE_SELECTABLE_TEXT),

    /**
     * Indicates that the object is the "default" active component, i.e. the object which is activated by an end-user press of the "Enter" or "Return" key.  Typically a "close" or "submit" button.
     */
    DEFAULT(AtkStateType.ATK_STATE_DEFAULT),

    /**
     * Indicates that the object changes its appearance dynamically as an inherent part of its presentation.  This state may come and go if an object is only temporarily animated on the way to a 'final' onscreen presentation.
     * **note**: some applications, notably content viewers, may not be able to detect
     * all kinds of animated content.  Therefore the absence of this state should not
     * be taken as definitive evidence that the object's visual representation is
     * static; this state is advisory.
     */
    ANIMATED(AtkStateType.ATK_STATE_ANIMATED),

    /**
     * Indicates that the object (typically a hyperlink) has already been 'activated', and/or its backing data has already been downloaded, rendered, or otherwise "visited".
     */
    VISITED(AtkStateType.ATK_STATE_VISITED),

    /**
     * Indicates this object has the potential to be
     *  checked, such as a checkbox or toggle-able table cell. @Since:
     *  ATK-2.12
     */
    CHECKABLE(AtkStateType.ATK_STATE_CHECKABLE),

    /**
     * Indicates that the object has a popup context
     * menu or sub-level menu which may or may not be showing. This means
     * that activation renders conditional content.  Note that ordinary
     * tooltips are not considered popups in this context. @Since: ATK-2.12
     */
    HAS_POPUP(AtkStateType.ATK_STATE_HAS_POPUP),

    /**
     * Indicates this object has a tooltip. @Since: ATK-2.16
     */
    HAS_TOOLTIP(AtkStateType.ATK_STATE_HAS_TOOLTIP),

    /**
     * Indicates that a widget which is ENABLED and SENSITIVE
     * has a value which can be read, but not modified, by the user. Note that this
     * state should only be applied to widget types whose value is normally directly
     * user modifiable, such as check boxes, radio buttons, spin buttons, text input
     * fields, and combo boxes, as a means to convey that the expected interaction
     * with that widget is not possible. When the expected interaction with a
     * widget does not include modification by the user, as is the case with
     * labels and containers, ATK_STATE_READ_ONLY should not be applied. See also
     * ATK_STATE_EDITABLE. @Since: ATK-2-16
     */
    READ_ONLY(AtkStateType.ATK_STATE_READ_ONLY),

    /**
     * Indicates this object is collapsed. @Since: ATK-2.38
     */
    COLLAPSED(AtkStateType.ATK_STATE_COLLAPSED),

    /**
     * Not a valid state, used for finding end of enumeration
     */
    LAST_DEFINED(AtkStateType.ATK_STATE_LAST_DEFINED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: AtkStateType): StateType =
            when (nativeValue) {
                AtkStateType.ATK_STATE_INVALID -> INVALID
                AtkStateType.ATK_STATE_ACTIVE -> ACTIVE
                AtkStateType.ATK_STATE_ARMED -> ARMED
                AtkStateType.ATK_STATE_BUSY -> BUSY
                AtkStateType.ATK_STATE_CHECKED -> CHECKED
                AtkStateType.ATK_STATE_DEFUNCT -> DEFUNCT
                AtkStateType.ATK_STATE_EDITABLE -> EDITABLE
                AtkStateType.ATK_STATE_ENABLED -> ENABLED
                AtkStateType.ATK_STATE_EXPANDABLE -> EXPANDABLE
                AtkStateType.ATK_STATE_EXPANDED -> EXPANDED
                AtkStateType.ATK_STATE_FOCUSABLE -> FOCUSABLE
                AtkStateType.ATK_STATE_FOCUSED -> FOCUSED
                AtkStateType.ATK_STATE_HORIZONTAL -> HORIZONTAL
                AtkStateType.ATK_STATE_ICONIFIED -> ICONIFIED
                AtkStateType.ATK_STATE_MODAL -> MODAL
                AtkStateType.ATK_STATE_MULTI_LINE -> MULTI_LINE
                AtkStateType.ATK_STATE_MULTISELECTABLE -> MULTISELECTABLE
                AtkStateType.ATK_STATE_OPAQUE -> OPAQUE
                AtkStateType.ATK_STATE_PRESSED -> PRESSED
                AtkStateType.ATK_STATE_RESIZABLE -> RESIZABLE
                AtkStateType.ATK_STATE_SELECTABLE -> SELECTABLE
                AtkStateType.ATK_STATE_SELECTED -> SELECTED
                AtkStateType.ATK_STATE_SENSITIVE -> SENSITIVE
                AtkStateType.ATK_STATE_SHOWING -> SHOWING
                AtkStateType.ATK_STATE_SINGLE_LINE -> SINGLE_LINE
                AtkStateType.ATK_STATE_STALE -> STALE
                AtkStateType.ATK_STATE_TRANSIENT -> TRANSIENT
                AtkStateType.ATK_STATE_VERTICAL -> VERTICAL
                AtkStateType.ATK_STATE_VISIBLE -> VISIBLE
                AtkStateType.ATK_STATE_MANAGES_DESCENDANTS -> MANAGES_DESCENDANTS
                AtkStateType.ATK_STATE_INDETERMINATE -> INDETERMINATE
                AtkStateType.ATK_STATE_TRUNCATED -> TRUNCATED
                AtkStateType.ATK_STATE_REQUIRED -> REQUIRED
                AtkStateType.ATK_STATE_INVALID_ENTRY -> INVALID_ENTRY
                AtkStateType.ATK_STATE_SUPPORTS_AUTOCOMPLETION -> SUPPORTS_AUTOCOMPLETION
                AtkStateType.ATK_STATE_SELECTABLE_TEXT -> SELECTABLE_TEXT
                AtkStateType.ATK_STATE_DEFAULT -> DEFAULT
                AtkStateType.ATK_STATE_ANIMATED -> ANIMATED
                AtkStateType.ATK_STATE_VISITED -> VISITED
                AtkStateType.ATK_STATE_CHECKABLE -> CHECKABLE
                AtkStateType.ATK_STATE_HAS_POPUP -> HAS_POPUP
                AtkStateType.ATK_STATE_HAS_TOOLTIP -> HAS_TOOLTIP
                AtkStateType.ATK_STATE_READ_ONLY -> READ_ONLY
                AtkStateType.ATK_STATE_COLLAPSED -> COLLAPSED
                AtkStateType.ATK_STATE_LAST_DEFINED -> LAST_DEFINED
                else -> error("invalid nativeValue")
            }

        /**
         * Gets the #AtkStateType corresponding to the description string @name.
         *
         * @param name a character string state name
         * @return an #AtkStateType corresponding to @name
         */
        public fun forName(name: String): StateType =
            atk_state_type_for_name(name).run {
                StateType.fromNativeValue(this)
            }

        /**
         * Gets the description string describing the #AtkStateType @type.
         *
         * @param type The #AtkStateType whose name is required
         * @return the string describing the AtkStateType
         */
        public fun getName(type: StateType): String =
            atk_state_type_get_name(type.nativeValue)?.toKString() ?: error("Expected not null string")

        /**
         * Register a new object state.
         *
         * @param name a character string describing the new state.
         * @return an #AtkState value for the new state.
         */
        public fun register(name: String): StateType =
            atk_state_type_register(name).run {
                StateType.fromNativeValue(this)
            }
    }
}
