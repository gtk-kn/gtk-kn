// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gobject.GSignalQuery
import kotlin.String
import kotlin.UInt
import kotlin.ULong

/**
 * A structure holding in-depth information for a specific signal.
 *
 * See also: g_signal_query()
 *
 * ## Skipped during bindings generation
 *
 * - field `param_types`: Fields with arrays are not supported
 */
public class SignalQuery(
    pointer: CPointer<GSignalQuery>,
) : Record {
    public val gobjectSignalQueryPointer: CPointer<GSignalQuery> = pointer

    /**
     * The signal id of the signal being queried, or 0 if the
     *  signal to be queried was unknown.
     */
    public var signalId: UInt
        get() = gobjectSignalQueryPointer.pointed.signal_id
        set(`value`) {
            gobjectSignalQueryPointer.pointed.signal_id = value
        }

    /**
     * The signal name.
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val signalName: String?
        get() = gobjectSignalQueryPointer.pointed.signal_name?.toKString()

    /**
     * The interface/instance type that this signal can be emitted for.
     */
    public var itype: ULong
        get() = gobjectSignalQueryPointer.pointed.itype
        set(`value`) {
            gobjectSignalQueryPointer.pointed.itype = value
        }

    /**
     * The signal flags as passed in to g_signal_new().
     */
    public var signalFlags: SignalFlags
        get() =
            gobjectSignalQueryPointer.pointed.signal_flags.run {
                SignalFlags(this)
            }
        set(`value`) {
            gobjectSignalQueryPointer.pointed.signal_flags = value.mask
        }

    /**
     * The return type for user callbacks.
     */
    public var returnType: ULong
        get() = gobjectSignalQueryPointer.pointed.return_type
        set(`value`) {
            gobjectSignalQueryPointer.pointed.return_type = value
        }

    /**
     * The number of parameters that user callbacks take.
     */
    public var nParams: UInt
        get() = gobjectSignalQueryPointer.pointed.n_params
        set(`value`) {
            gobjectSignalQueryPointer.pointed.n_params = value
        }

    public companion object : RecordCompanion<SignalQuery, GSignalQuery> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): SignalQuery =
            SignalQuery(pointer.reinterpret())
    }
}
