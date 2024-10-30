// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkNothingAction
import org.gtkkn.native.gtk.gtk_nothing_action_get
import org.gtkkn.native.gtk.gtk_nothing_action_get_type

/**
 * A `GtkShortcutAction` that does nothing.
 */
public open class NothingAction(
    pointer: CPointer<GtkNothingAction>,
) : ShortcutAction(pointer.reinterpret()),
    KGTyped {
    public val gtkNothingActionPointer: CPointer<GtkNothingAction>
        get() = gPointer.reinterpret()

    public companion object : TypeCompanion<NothingAction> {
        override val type: GeneratedClassKGType<NothingAction> =
            GeneratedClassKGType(gtk_nothing_action_get_type()) { NothingAction(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Gets the nothing action.
         *
         * This is an action that does nothing and where
         * activating it always fails.
         *
         * @return The nothing action
         */
        public fun `get`(): NothingAction =
            gtk_nothing_action_get()!!.run {
                NothingAction(reinterpret())
            }
    }
}
