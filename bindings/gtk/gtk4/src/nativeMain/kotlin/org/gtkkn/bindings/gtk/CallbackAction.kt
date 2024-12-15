// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkCallbackAction
import org.gtkkn.native.gtk.gtk_callback_action_get_type
import org.gtkkn.native.gtk.gtk_callback_action_new

/**
 * A `GtkShortcutAction` that invokes a callback.
 */
public open class CallbackAction(pointer: CPointer<GtkCallbackAction>) :
    ShortcutAction(pointer.reinterpret()),
    KGTyped {
    public val gtkCallbackActionPointer: CPointer<GtkCallbackAction>
        get() = gPointer.reinterpret()

    /**
     * Create a custom action that calls the given @callback when
     * activated.
     *
     * @param callback the callback to call
     * @return A new shortcut action
     */
    public constructor(
        callback: ShortcutFunc?,
    ) : this(
        gtk_callback_action_new(
            callback?.let {
                ShortcutFuncFunc.reinterpret()
            },
            callback?.let {
                StableRef.create(callback).asCPointer()
            },
            callback?.let { staticStableRefDestroy.reinterpret() }
        )!!.reinterpret()
    )

    public companion object : TypeCompanion<CallbackAction> {
        override val type: GeneratedClassKGType<CallbackAction> =
            GeneratedClassKGType(gtk_callback_action_get_type()) { CallbackAction(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of CallbackAction
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_callback_action_get_type()
    }
}
