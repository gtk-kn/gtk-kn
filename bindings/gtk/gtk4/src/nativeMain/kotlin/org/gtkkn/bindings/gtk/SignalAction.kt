// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkSignalAction
import org.gtkkn.native.gtk.gtk_signal_action_get_signal_name
import org.gtkkn.native.gtk.gtk_signal_action_get_type
import org.gtkkn.native.gtk.gtk_signal_action_new
import kotlin.String

/**
 * A `GtkShortcut`Action that emits a signal.
 *
 * Signals that are used in this way are referred to as keybinding signals,
 * and they are expected to be defined with the %G_SIGNAL_ACTION flag.
 */
public open class SignalAction(
    pointer: CPointer<GtkSignalAction>,
) : ShortcutAction(pointer.reinterpret()), KGTyped {
    public val gtkSignalActionPointer: CPointer<GtkSignalAction>
        get() = gPointer.reinterpret()

    /**
     * The name of the signal to emit.
     */
    public open val signalName: String
        /**
         * Returns the name of the signal that will be emitted.
         *
         * @return the name of the signal to emit
         */
        get() =
            gtk_signal_action_get_signal_name(gtkSignalActionPointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

    /**
     * Creates an action that when activated, emits the given action signal
     * on the provided widget.
     *
     * It will also unpack the args into arguments passed to the signal.
     *
     * @param signalName name of the signal to emit
     * @return a new `GtkShortcutAction`
     */
    public constructor(signalName: String) : this(gtk_signal_action_new(signalName)!!.reinterpret())

    /**
     * Returns the name of the signal that will be emitted.
     *
     * @return the name of the signal to emit
     */
    public open fun getSignalName(): String =
        gtk_signal_action_get_signal_name(gtkSignalActionPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    public companion object : TypeCompanion<SignalAction> {
        override val type: GeneratedClassKGType<SignalAction> =
            GeneratedClassKGType(gtk_signal_action_get_type()) {
                SignalAction(it.reinterpret())
            }

        init {
            GtkTypeProvider.register()
        }
    }
}
