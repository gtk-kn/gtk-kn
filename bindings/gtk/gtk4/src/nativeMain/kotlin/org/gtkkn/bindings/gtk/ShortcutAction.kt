// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.Variant
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkShortcutAction
import org.gtkkn.native.gtk.gtk_shortcut_action_activate
import org.gtkkn.native.gtk.gtk_shortcut_action_get_type
import org.gtkkn.native.gtk.gtk_shortcut_action_parse_string
import org.gtkkn.native.gtk.gtk_shortcut_action_print
import org.gtkkn.native.gtk.gtk_shortcut_action_to_string
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
 */
public abstract class ShortcutAction(public val gtkShortcutActionPointer: CPointer<GtkShortcutAction>) :
    Object(gtkShortcutActionPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

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
    public constructor(string: KotlinString) : this(gtk_shortcut_action_parse_string(string)!!.reinterpret()) {
        InstanceCache.put(this)
    }

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
    public open fun activate(flags: ShortcutActionFlags, widget: Widget, args: Variant? = null): Boolean =
        gtk_shortcut_action_activate(
            gtkShortcutActionPointer,
            flags.mask,
            widget.gtkWidgetPointer,
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
        gtk_shortcut_action_print(gtkShortcutActionPointer, string.glibStringPointer)

    /**
     * Prints the given action into a human-readable string.
     *
     * This is a small wrapper around [method@Gtk.ShortcutAction.print]
     * to help when debugging.
     *
     * @return a new string
     */
    override fun toString(): KotlinString =
        gtk_shortcut_action_to_string(gtkShortcutActionPointer)?.toKString() ?: error("Expected not null string")

    /**
     * The ShortcutActionImpl type represents a native instance of the abstract ShortcutAction class.
     *
     * @constructor Creates a new instance of ShortcutAction for the provided [CPointer].
     */
    public class ShortcutActionImpl(pointer: CPointer<GtkShortcutAction>) : ShortcutAction(pointer)

    public companion object : TypeCompanion<ShortcutAction> {
        override val type: GeneratedClassKGType<ShortcutAction> =
            GeneratedClassKGType(getTypeOrNull()!!) { ShortcutActionImpl(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of ShortcutAction
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_shortcut_action_get_type()

        /**
         * Gets the GType of from the symbol `gtk_shortcut_action_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_shortcut_action_get_type")
    }
}
