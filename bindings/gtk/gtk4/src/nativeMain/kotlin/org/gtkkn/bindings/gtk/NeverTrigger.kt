// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkNeverTrigger
import org.gtkkn.native.gtk.gtk_never_trigger_get
import org.gtkkn.native.gtk.gtk_never_trigger_get_type

/**
 * A `GtkShortcutTrigger` that never triggers.
 */
public open class NeverTrigger(
    pointer: CPointer<GtkNeverTrigger>,
) : ShortcutTrigger(pointer.reinterpret()),
    KGTyped {
    public val gtkNeverTriggerPointer: CPointer<GtkNeverTrigger>
        get() = gPointer.reinterpret()

    public companion object : TypeCompanion<NeverTrigger> {
        override val type: GeneratedClassKGType<NeverTrigger> =
            GeneratedClassKGType(gtk_never_trigger_get_type()) { NeverTrigger(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Gets the never trigger.
         *
         * This is a singleton for a trigger that never triggers.
         * Use this trigger instead of null because it implements
         * all virtual functions.
         *
         * @return The never trigger
         */
        public fun `get`(): NeverTrigger =
            gtk_never_trigger_get()!!.run {
                NeverTrigger(reinterpret())
            }
    }
}
