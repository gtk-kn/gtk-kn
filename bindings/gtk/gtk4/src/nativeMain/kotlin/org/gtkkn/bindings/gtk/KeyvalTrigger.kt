// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.ModifierType
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkKeyvalTrigger
import org.gtkkn.native.gtk.gtk_keyval_trigger_get_keyval
import org.gtkkn.native.gtk.gtk_keyval_trigger_get_modifiers
import org.gtkkn.native.gtk.gtk_keyval_trigger_get_type
import org.gtkkn.native.gtk.gtk_keyval_trigger_new
import kotlin.UInt

/**
 * A `GtkShortcutTrigger` that triggers when a specific keyval and modifiers are pressed.
 */
public open class KeyvalTrigger(
    pointer: CPointer<GtkKeyvalTrigger>,
) : ShortcutTrigger(pointer.reinterpret()), KGTyped {
    public val gtkKeyvalTriggerPointer: CPointer<GtkKeyvalTrigger>
        get() = gPointer.reinterpret()

    /**
     * The key value for the trigger.
     */
    public open val keyval: UInt
        /**
         * Gets the keyval that must be pressed to succeed
         * triggering @self.
         *
         * @return the keyval
         */
        get() = gtk_keyval_trigger_get_keyval(gtkKeyvalTriggerPointer.reinterpret())

    /**
     * The key modifiers for the trigger.
     */
    public open val modifiers: ModifierType
        /**
         * Gets the modifiers that must be present to succeed
         * triggering @self.
         *
         * @return the modifiers
         */
        get() =
            gtk_keyval_trigger_get_modifiers(gtkKeyvalTriggerPointer.reinterpret()).run {
                ModifierType(this)
            }

    /**
     * Creates a `GtkShortcutTrigger` that will trigger whenever
     * the key with the given @keyval and @modifiers is pressed.
     *
     * @param keyval The keyval to trigger for
     * @param modifiers the modifiers that need to be present
     * @return A new `GtkShortcutTrigger`
     */
    public constructor(keyval: UInt, modifiers: ModifierType) : this(
        gtk_keyval_trigger_new(
            keyval,
            modifiers.mask
        )!!.reinterpret()
    )

    /**
     * Gets the keyval that must be pressed to succeed
     * triggering @self.
     *
     * @return the keyval
     */
    public open fun getKeyval(): UInt = gtk_keyval_trigger_get_keyval(gtkKeyvalTriggerPointer.reinterpret())

    /**
     * Gets the modifiers that must be present to succeed
     * triggering @self.
     *
     * @return the modifiers
     */
    public open fun getModifiers(): ModifierType =
        gtk_keyval_trigger_get_modifiers(gtkKeyvalTriggerPointer.reinterpret()).run {
            ModifierType(this)
        }

    public companion object : TypeCompanion<KeyvalTrigger> {
        override val type: GeneratedClassKGType<KeyvalTrigger> =
            GeneratedClassKGType(gtk_keyval_trigger_get_type()) {
                KeyvalTrigger(it.reinterpret())
            }

        init {
            GtkTypeProvider.register()
        }
    }
}
