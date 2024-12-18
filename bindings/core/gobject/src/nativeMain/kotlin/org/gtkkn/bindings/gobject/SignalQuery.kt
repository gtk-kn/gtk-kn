// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.g_free
import org.gtkkn.native.glib.g_strdup
import org.gtkkn.native.gobject.GSignalQuery
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.guint
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * A structure holding in-depth information for a specific signal.
 *
 * See also: g_signal_query()
 *
 * ## Skipped during bindings generation
 *
 * - field `param_types`: Array parameter of type GType is not supported
 */
public class SignalQuery(pointer: CPointer<GSignalQuery>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val gobjectSignalQueryPointer: CPointer<GSignalQuery> = pointer

    /**
     * The signal id of the signal being queried, or 0 if the
     *  signal to be queried was unknown.
     */
    public var signalId: guint
        get() = gobjectSignalQueryPointer.pointed.signal_id

        @UnsafeFieldSetter
        set(`value`) {
            gobjectSignalQueryPointer.pointed.signal_id = value
        }

    /**
     * The signal name.
     */
    public var signalName: String?
        get() = gobjectSignalQueryPointer.pointed.signal_name?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            gobjectSignalQueryPointer.pointed.signal_name?.let { g_free(it) }
            gobjectSignalQueryPointer.pointed.signal_name = value?.let { g_strdup(it) }
        }

    /**
     * The interface/instance type that this signal can be emitted for.
     */
    public var itype: GType
        get() = gobjectSignalQueryPointer.pointed.itype

        @UnsafeFieldSetter
        set(`value`) {
            gobjectSignalQueryPointer.pointed.itype = value
        }

    /**
     * The signal flags as passed in to g_signal_new().
     */
    public var signalFlags: SignalFlags
        get() = gobjectSignalQueryPointer.pointed.signal_flags.run {
            SignalFlags(this)
        }

        @UnsafeFieldSetter
        set(`value`) {
            gobjectSignalQueryPointer.pointed.signal_flags = value.mask
        }

    /**
     * The return type for user callbacks.
     */
    public var returnType: GType
        get() = gobjectSignalQueryPointer.pointed.return_type

        @UnsafeFieldSetter
        set(`value`) {
            gobjectSignalQueryPointer.pointed.return_type = value
        }

    /**
     * The number of parameters that user callbacks take.
     */
    public var nParams: guint
        get() = gobjectSignalQueryPointer.pointed.n_params

        @UnsafeFieldSetter
        set(`value`) {
            gobjectSignalQueryPointer.pointed.n_params = value
        }

    /**
     * Allocate a new SignalQuery.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GSignalQuery>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to SignalQuery and a [Cleaner] instance.
     */
    private constructor(pair: Pair<CPointer<GSignalQuery>, Cleaner>) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new SignalQuery using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GSignalQuery>().ptr)

    /**
     * Allocate a new SignalQuery.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param signalId The signal id of the signal being queried, or 0 if the
     *  signal to be queried was unknown.
     * @param signalName The signal name.
     * @param itype The interface/instance type that this signal can be emitted for.
     * @param signalFlags The signal flags as passed in to g_signal_new().
     * @param returnType The return type for user callbacks.
     * @param nParams The number of parameters that user callbacks take.
     */
    public constructor(
        signalId: guint,
        signalName: String?,
        itype: GType,
        signalFlags: SignalFlags,
        returnType: GType,
        nParams: guint,
    ) : this() {
        this.signalId = signalId
        this.signalName = signalName
        this.itype = itype
        this.signalFlags = signalFlags
        this.returnType = returnType
        this.nParams = nParams
    }

    /**
     * Allocate a new SignalQuery using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param signalId The signal id of the signal being queried, or 0 if the
     *  signal to be queried was unknown.
     * @param signalName The signal name.
     * @param itype The interface/instance type that this signal can be emitted for.
     * @param signalFlags The signal flags as passed in to g_signal_new().
     * @param returnType The return type for user callbacks.
     * @param nParams The number of parameters that user callbacks take.
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        signalId: guint,
        signalName: String?,
        itype: GType,
        signalFlags: SignalFlags,
        returnType: GType,
        nParams: guint,
        scope: AutofreeScope,
    ) : this(scope) {
        this.signalId = signalId
        this.signalName = signalName
        this.itype = itype
        this.signalFlags = signalFlags
        this.returnType = returnType
        this.nParams = nParams
    }

    override fun toString(): String =
        "SignalQuery(signalId=$signalId, signalName=$signalName, itype=$itype, signalFlags=$signalFlags, returnType=$returnType, nParams=$nParams)"
}
