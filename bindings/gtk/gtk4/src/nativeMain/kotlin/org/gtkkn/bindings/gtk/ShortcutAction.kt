// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.Variant
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkShortcutAction
import org.gtkkn.native.gtk.gtk_shortcut_action_activate
import org.gtkkn.native.gtk.gtk_shortcut_action_get_type
import org.gtkkn.native.gtk.gtk_shortcut_action_parse_string
import org.gtkkn.native.gtk.gtk_shortcut_action_print
import kotlin.Boolean
import kotlin.Unit
import kotlin.String as KotlinString
import org.gtkkn.bindings.glib.String as GlibString

/**
 * `GtkShortcutAction` encodes an action that can be triggered by a
 * keyboard shortcut.
 *
 * `GtkShortcutActions` contain functions that allow easy presentation
 * to end users as well as being printed for debugging.
 *
 * All `GtkShortcutActions` are immutable, you can only specify their
 * properties during construction. If you want to change a action, you
 * have to replace it with a new one. If you need to pass arguments to
 * an action, these are specified by the higher-level `GtkShortcut` object.
 *
 * To activate a `GtkShortcutAction` manually, [method@Gtk.ShortcutAction.activate]
 * can be called.
 *
 * GTK provides various actions:
 *
 *  - [class@Gtk.MnemonicAction]: a shortcut action that calls
 *    gtk_widget_mnemonic_activate()
 *  - [class@Gtk.CallbackAction]: a shortcut action that invokes
 *    a given callback
 *  - [class@Gtk.SignalAction]: a shortcut action that emits a
 *    given signal
 *  - [class@Gtk.ActivateAction]: a shortcut action that calls
 *    gtk_widget_activate()
 *  - [class@Gtk.NamedAction]: a shortcut action that calls
 *    gtk_widget_activate_action()
 *  - [class@Gtk.NothingAction]: a shortcut action that does nothing
 *
 * ## Skipped during bindings generation
 *
 * - method `to_string`: C function gtk_shortcut_action_to_string is ignored
 */
public open class ShortcutAction(
    pointer: CPointer<GtkShortcutAction>,
) : Object(pointer.reinterpret()),
    KGTyped {
    public val gtkShortcutActionPointer: CPointer<GtkShortcutAction>
        get() = gPointer.reinterpret()

    /**
     * Tries to parse the given string into an action.
     *
     * On success, the parsed action is returned. When parsing
     * failed, null is returned.
     *
     * The accepted strings are:
     *
     * - `nothing`, for `GtkNothingAction`
     * - `activate`, for `GtkActivateAction`
     * - `mnemonic-activate`, for `GtkMnemonicAction`
     * - `action(NAME)`, for a `GtkNamedAction` for the action named `NAME`
     * - `signal(NAME)`, for a `GtkSignalAction` for the signal `NAME`
     *
     * @param string the string to parse
     * @return a new `GtkShortcutAction`
     */
    public constructor(string: KotlinString) : this(gtk_shortcut_action_parse_string(string)!!.reinterpret())

    /**
     * Activates the action on the @widget with the given @args.
     *
     * Note that some actions ignore the passed in @flags, @widget or @args.
     *
     * Activation of an action can fail for various reasons. If the action
     * is not supported by the @widget, if the @args don't match the action
     * or if the activation otherwise had no effect, false will be returned.
     *
     * @param flags flags to activate with
     * @param widget Target of the activation
     * @param args arguments to pass
     * @return true if this action was activated successfully
     */
    public open fun activate(
        flags: ShortcutActionFlags,
        widget: Widget,
        args: Variant? = null,
    ): Boolean =
        gtk_shortcut_action_activate(
            gtkShortcutActionPointer.reinterpret(),
            flags.mask,
            widget.gtkWidgetPointer.reinterpret(),
            args?.glibVariantPointer
        ).asBoolean()

    /**
     * Prints the given action into a string for the developer.
     *
     * This is meant for debugging and logging.
     *
     * The form of the representation may change at any time and is
     * not guaranteed to stay identical.
     *
     * @param string a `GString` to print into
     */
    public open fun print(string: GlibString): Unit =
        gtk_shortcut_action_print(gtkShortcutActionPointer.reinterpret(), string.glibStringPointer)

    public companion object : TypeCompanion<ShortcutAction> {
        override val type: GeneratedClassKGType<ShortcutAction> =
            GeneratedClassKGType(gtk_shortcut_action_get_type()) { ShortcutAction(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}
