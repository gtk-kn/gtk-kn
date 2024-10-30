// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkMnemonicTrigger
import org.gtkkn.native.gtk.gtk_mnemonic_trigger_get_keyval
import org.gtkkn.native.gtk.gtk_mnemonic_trigger_get_type
import org.gtkkn.native.gtk.gtk_mnemonic_trigger_new
import kotlin.UInt

/**
 * A `GtkShortcutTrigger` that triggers when a specific mnemonic is pressed.
 *
 * Mnemonics require a *mnemonic modifier* (typically <kbd>Alt</kbd>) to be
 * pressed together with the mnemonic key.
 */
public open class MnemonicTrigger(
    pointer: CPointer<GtkMnemonicTrigger>,
) : ShortcutTrigger(pointer.reinterpret()),
    KGTyped {
    public val gtkMnemonicTriggerPointer: CPointer<GtkMnemonicTrigger>
        get() = gPointer.reinterpret()

    /**
     * The key value for the trigger.
     */
    public open val keyval: UInt
        /**
         * Gets the keyval that must be pressed to succeed triggering @self.
         *
         * @return the keyval
         */
        get() = gtk_mnemonic_trigger_get_keyval(gtkMnemonicTriggerPointer.reinterpret())

    /**
     * Creates a `GtkShortcutTrigger` that will trigger whenever the key with
     * the given @keyval is pressed and mnemonics have been activated.
     *
     * Mnemonics are activated by calling code when a key event with the right
     * modifiers is detected.
     *
     * @param keyval The keyval to trigger for
     * @return A new `GtkShortcutTrigger`
     */
    public constructor(keyval: UInt) : this(gtk_mnemonic_trigger_new(keyval)!!.reinterpret())

    /**
     * Gets the keyval that must be pressed to succeed triggering @self.
     *
     * @return the keyval
     */
    public open fun getKeyval(): UInt = gtk_mnemonic_trigger_get_keyval(gtkMnemonicTriggerPointer.reinterpret())

    public companion object : TypeCompanion<MnemonicTrigger> {
        override val type: GeneratedClassKGType<MnemonicTrigger> =
            GeneratedClassKGType(gtk_mnemonic_trigger_get_type()) { MnemonicTrigger(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}
