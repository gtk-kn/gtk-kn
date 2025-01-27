// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.Variant
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkShortcut
import org.gtkkn.native.gtk.gtk_shortcut_get_action
import org.gtkkn.native.gtk.gtk_shortcut_get_arguments
import org.gtkkn.native.gtk.gtk_shortcut_get_trigger
import org.gtkkn.native.gtk.gtk_shortcut_get_type
import org.gtkkn.native.gtk.gtk_shortcut_new
import org.gtkkn.native.gtk.gtk_shortcut_set_action
import org.gtkkn.native.gtk.gtk_shortcut_set_arguments
import org.gtkkn.native.gtk.gtk_shortcut_set_trigger

/**
 * A `GtkShortcut` describes a keyboard shortcut.
 *
 * It contains a description of how to trigger the shortcut via a
 * [class@Gtk.ShortcutTrigger] and a way to activate the shortcut
 * on a widget via a [class@Gtk.ShortcutAction].
 *
 * The actual work is usually done via [class@Gtk.ShortcutController],
 * which decides if and when to activate a shortcut. Using that controller
 * directly however is rarely necessary as various higher level
 * convenience APIs exist on `GtkWidget`s that make it easier to use
 * shortcuts in GTK.
 *
 * `GtkShortcut` does provide functionality to make it easy for users
 * to work with shortcuts, either by providing informational strings
 * for display purposes or by allowing shortcuts to be configured.
 *
 * ## Skipped during bindings generation
 *
 * - constructor `new_with_arguments`: Varargs parameter is not supported
 */
public open class Shortcut(public val gtkShortcutPointer: CPointer<GtkShortcut>) :
    Object(gtkShortcutPointer.reinterpret()),
    KGTyped {
    /**
     * The action that gets activated by this shortcut.
     */
    public open var action: ShortcutAction?
        /**
         * Gets the action that is activated by this shortcut.
         *
         * @return the action
         */
        get() = gtk_shortcut_get_action(gtkShortcutPointer)?.run {
            ShortcutAction.ShortcutActionImpl(this)
        }

        /**
         * Sets the new action for @self to be @action.
         *
         * @param action The new action.
         *   If the @action is null, the nothing action will be used.
         */
        set(action) = gtk_shortcut_set_action(gtkShortcutPointer, action?.gtkShortcutActionPointer)

    /**
     * Arguments passed to activation.
     */
    public open var arguments: Variant?
        /**
         * Gets the arguments that are passed when activating the shortcut.
         *
         * @return the arguments
         */
        get() = gtk_shortcut_get_arguments(gtkShortcutPointer)?.run {
            Variant(this)
        }

        /**
         * Sets the arguments to pass when activating the shortcut.
         *
         * @param args arguments to pass when activating @self
         */
        set(args) = gtk_shortcut_set_arguments(gtkShortcutPointer, args?.glibVariantPointer)

    /**
     * The trigger that triggers this shortcut.
     */
    public open var trigger: ShortcutTrigger?
        /**
         * Gets the trigger used to trigger @self.
         *
         * @return the trigger used
         */
        get() = gtk_shortcut_get_trigger(gtkShortcutPointer)?.run {
            ShortcutTrigger.ShortcutTriggerImpl(this)
        }

        /**
         * Sets the new trigger for @self to be @trigger.
         *
         * @param trigger The new trigger.
         *   If the @trigger is null, the never trigger will be used.
         */
        set(trigger) = gtk_shortcut_set_trigger(gtkShortcutPointer, trigger?.gtkShortcutTriggerPointer)

    /**
     * Creates a new `GtkShortcut` that is triggered by
     * @trigger and then activates @action.
     *
     * @param trigger The trigger that will trigger the shortcut
     * @param action The action that will be activated upon
     *    triggering
     * @return a new `GtkShortcut`
     */
    public constructor(
        trigger: ShortcutTrigger? = null,
        action: ShortcutAction? = null,
    ) : this(gtk_shortcut_new(trigger?.gtkShortcutTriggerPointer, action?.gtkShortcutActionPointer)!!.reinterpret())

    public companion object : TypeCompanion<Shortcut> {
        override val type: GeneratedClassKGType<Shortcut> =
            GeneratedClassKGType(getTypeOrNull("gtk_shortcut_get_type")!!) { Shortcut(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of Shortcut
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_shortcut_get_type()
    }
}
