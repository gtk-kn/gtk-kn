// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.Quark
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gobject.GSignalInvocationHint
import kotlin.UInt

/**
 * The #GSignalInvocationHint structure is used to pass on additional information
 * to callbacks during a signal emission.
 */
public class SignalInvocationHint(
    pointer: CPointer<GSignalInvocationHint>,
) : Record {
    public val gobjectSignalInvocationHintPointer: CPointer<GSignalInvocationHint> = pointer

    /**
     * The signal id of the signal invoking the callback
     */
    public var signalId: UInt
        get() = gobjectSignalInvocationHintPointer.pointed.signal_id
        set(`value`) {
            gobjectSignalInvocationHintPointer.pointed.signal_id = value
        }

    /**
     * The detail passed on for this emission
     */
    public var detail: Quark
        get() = gobjectSignalInvocationHintPointer.pointed.detail
        set(`value`) {
            gobjectSignalInvocationHintPointer.pointed.detail = value
        }

    /**
     * The stage the signal emission is currently in, this
     *  field will contain one of %G_SIGNAL_RUN_FIRST,
     *  %G_SIGNAL_RUN_LAST or %G_SIGNAL_RUN_CLEANUP and %G_SIGNAL_ACCUMULATOR_FIRST_RUN.
     *  %G_SIGNAL_ACCUMULATOR_FIRST_RUN is only set for the first run of the accumulator
     *  function for a signal emission.
     */
    public var runType: SignalFlags
        get() =
            gobjectSignalInvocationHintPointer.pointed.run_type.run {
                SignalFlags(this)
            }
        set(`value`) {
            gobjectSignalInvocationHintPointer.pointed.run_type = value.mask
        }

    public companion object : RecordCompanion<SignalInvocationHint, GSignalInvocationHint> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): SignalInvocationHint =
            SignalInvocationHint(pointer.reinterpret())
    }
}
