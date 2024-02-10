// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkActivateAction
import org.gtkkn.native.gtk.gtk_activate_action_get
import org.gtkkn.native.gtk.gtk_activate_action_get_type

/**
 * A `GtkShortcutAction` that calls gtk_widget_activate().
 */
public open class ActivateAction(
    pointer: CPointer<GtkActivateAction>,
) : ShortcutAction(pointer.reinterpret()), KGTyped {
    public val gtkActivateActionPointer: CPointer<GtkActivateAction>
        get() = gPointer.reinterpret()

    public companion object : TypeCompanion<ActivateAction> {
        override val type: GeneratedClassKGType<ActivateAction> =
            GeneratedClassKGType(gtk_activate_action_get_type()) {
                ActivateAction(it.reinterpret())
            }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Gets the activate action.
         *
         * This is an action that calls gtk_widget_activate()
         * on the given widget upon activation.
         *
         * @return The activate action
         */
        public fun `get`(): ActivateAction =
            gtk_activate_action_get()!!.run {
                ActivateAction(reinterpret())
            }
    }
}
