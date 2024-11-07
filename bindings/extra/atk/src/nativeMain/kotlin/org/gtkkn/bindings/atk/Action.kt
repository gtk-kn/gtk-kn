// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.atk.AtkAction
import org.gtkkn.native.atk.atk_action_do_action
import org.gtkkn.native.atk.atk_action_get_description
import org.gtkkn.native.atk.atk_action_get_keybinding
import org.gtkkn.native.atk.atk_action_get_localized_name
import org.gtkkn.native.atk.atk_action_get_n_actions
import org.gtkkn.native.atk.atk_action_get_name
import org.gtkkn.native.atk.atk_action_get_type
import org.gtkkn.native.atk.atk_action_set_description
import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * The ATK interface provided by UI components
 * which the user can activate/interact with.
 *
 * #AtkAction should be implemented by instances of #AtkObject classes
 * with which the user can interact directly, i.e. buttons,
 * checkboxes, scrollbars, e.g. components which are not "passive"
 * providers of UI information.
 *
 * Exceptions: when the user interaction is already covered by another
 * appropriate interface such as #AtkEditableText (insert/delete text,
 * etc.) or #AtkValue (set value) then these actions should not be
 * exposed by #AtkAction as well.
 *
 * Though most UI interactions on components should be invocable via
 * keyboard as well as mouse, there will generally be a close mapping
 * between "mouse actions" that are possible on a component and the
 * AtkActions.  Where mouse and keyboard actions are redundant in
 * effect, #AtkAction should expose only one action rather than
 * exposing redundant actions if possible.  By convention we have been
 * using "mouse centric" terminology for #AtkAction names.
 */
public interface Action :
    Interface,
    KGTyped {
    public val atkActionPointer: CPointer<AtkAction>

    /**
     * Perform the specified action on the object.
     *
     * @param i the action index corresponding to the action to be performed
     * @return true if success, false otherwise
     */
    public fun doAction(i: Int): Boolean = atk_action_do_action(atkActionPointer.reinterpret(), i).asBoolean()

    /**
     * Returns a description of the specified action of the object.
     *
     * @param i the action index corresponding to the action to be performed
     * @return a description string, or null if @action does
     * not implement this interface.
     */
    public fun getDescription(i: Int): String? =
        atk_action_get_description(atkActionPointer.reinterpret(), i)?.toKString()

    /**
     * Gets the keybinding which can be used to activate this action, if one
     * exists. The string returned should contain localized, human-readable,
     * key sequences as they would appear when displayed on screen. It must
     * be in the format "mnemonic;sequence;shortcut".
     *
     * - The mnemonic key activates the object if it is presently enabled onscreen.
     *   This typically corresponds to the underlined letter within the widget.
     *   Example: "n" in a traditional "New..." menu item or the "a" in "Apply" for
     *   a button.
     * - The sequence is the full list of keys which invoke the action even if the
     *   relevant element is not currently shown on screen. For instance, for a menu
     *   item the sequence is the keybindings used to open the parent menus before
     *   invoking. The sequence string is colon-delimited. Example: "Alt+F:N" in a
     *   traditional "New..." menu item.
     * - The shortcut, if it exists, will invoke the same action without showing
     *   the component or its enclosing menus or dialogs. Example: "Ctrl+N" in a
     *   traditional "New..." menu item.
     *
     * Example: For a traditional "New..." menu item, the expected return value
     * would be: "N;Alt+F:N;Ctrl+N" for the English locale and "N;Alt+D:N;Strg+N"
     * for the German locale. If, hypothetically, this menu item lacked a mnemonic,
     * it would be represented by ";;Ctrl+N" and ";;Strg+N" respectively.
     *
     * @param i the action index corresponding to the action to be performed
     * @return the keybinding which can be used to activate
     * this action, or null if there is no keybinding for this action.
     */
    public fun getKeybinding(i: Int): String? =
        atk_action_get_keybinding(atkActionPointer.reinterpret(), i)?.toKString()

    /**
     * Returns the localized name of the specified action of the object.
     *
     * @param i the action index corresponding to the action to be performed
     * @return a name string, or null if @action does not
     * implement this interface.
     */
    public fun getLocalizedName(i: Int): String? =
        atk_action_get_localized_name(atkActionPointer.reinterpret(), i)?.toKString()

    /**
     * Gets the number of accessible actions available on the object.
     * If there are more than one, the first one is considered the
     * "default" action of the object.
     *
     * @return a the number of actions, or 0 if @action does not
     * implement this interface.
     */
    public fun getNActions(): Int = atk_action_get_n_actions(atkActionPointer.reinterpret())

    /**
     * Returns a non-localized string naming the specified action of the
     * object. This name is generally not descriptive of the end result
     * of the action, but instead names the 'interaction type' which the
     * object supports. By convention, the above strings should be used to
     * represent the actions which correspond to the common point-and-click
     * interaction techniques of the same name: i.e.
     * "click", "press", "release", "drag", "drop", "popup", etc.
     * The "popup" action should be used to pop up a context menu for the
     * object, if one exists.
     *
     * For technical reasons, some toolkits cannot guarantee that the
     * reported action is actually 'bound' to a nontrivial user event;
     * i.e. the result of some actions via atk_action_do_action() may be
     * NIL.
     *
     * @param i the action index corresponding to the action to be performed
     * @return a name string, or null if @action does not
     * implement this interface.
     */
    public fun getName(i: Int): String? = atk_action_get_name(atkActionPointer.reinterpret(), i)?.toKString()

    /**
     * Sets a description of the specified action of the object.
     *
     * @param i the action index corresponding to the action to be performed
     * @param desc the description to be assigned to this action
     * @return a gboolean representing if the description was successfully set;
     */
    public fun setDescription(
        i: Int,
        desc: String,
    ): Boolean = atk_action_set_description(atkActionPointer.reinterpret(), i, desc).asBoolean()

    private data class Wrapper(
        private val pointer: CPointer<AtkAction>,
    ) : Action {
        override val atkActionPointer: CPointer<AtkAction> = pointer
    }

    public companion object : TypeCompanion<Action> {
        override val type: GeneratedInterfaceKGType<Action> =
            GeneratedInterfaceKGType(atk_action_get_type()) { Wrapper(it.reinterpret()) }

        init {
            AtkTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<AtkAction>): Action = Wrapper(pointer)
    }
}
