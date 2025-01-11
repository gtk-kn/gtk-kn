// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkMnemonicAction
import org.gtkkn.native.gtk.gtk_mnemonic_action_get
import org.gtkkn.native.gtk.gtk_mnemonic_action_get_type

/**
 * A `GtkShortcutAction` that calls gtk_widget_mnemonic_activate().
 */
public open class MnemonicAction(public val gtkMnemonicActionPointer: CPointer<GtkMnemonicAction>) :
    ShortcutAction(gtkMnemonicActionPointer.reinterpret()),
    KGTyped {
    public companion object : TypeCompanion<MnemonicAction> {
        override val type: GeneratedClassKGType<MnemonicAction> =
            GeneratedClassKGType(gtk_mnemonic_action_get_type()) { MnemonicAction(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Gets the mnemonic action.
         *
         * This is an action that calls gtk_widget_mnemonic_activate()
         * on the given widget upon activation.
         *
         * @return The mnemonic action
         */
        public fun `get`(): MnemonicAction = gtk_mnemonic_action_get()!!.run {
            MnemonicAction(reinterpret())
        }

        /**
         * Get the GType of MnemonicAction
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_mnemonic_action_get_type()
    }
}
