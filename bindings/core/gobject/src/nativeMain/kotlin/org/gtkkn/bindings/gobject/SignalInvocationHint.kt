// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import org.gtkkn.bindings.glib.Quark
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gobject.GSignalInvocationHint
import org.gtkkn.native.gobject.guint
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * The #GSignalInvocationHint structure is used to pass on additional information
 * to callbacks during a signal emission.
 */
public class SignalInvocationHint(pointer: CPointer<GSignalInvocationHint>, cleaner: Cleaner? = null) :
    ProxyInstance(pointer) {
    public val gobjectSignalInvocationHintPointer: CPointer<GSignalInvocationHint> = pointer

    /**
     * The signal id of the signal invoking the callback
     */
    public var signalId: guint
        get() = gobjectSignalInvocationHintPointer.pointed.signal_id

        @UnsafeFieldSetter
        set(`value`) {
            gobjectSignalInvocationHintPointer.pointed.signal_id = value
        }

    /**
     * The detail passed on for this emission
     */
    public var detail: Quark
        get() = gobjectSignalInvocationHintPointer.pointed.detail

        @UnsafeFieldSetter
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
        get() = gobjectSignalInvocationHintPointer.pointed.run_type.run {
            SignalFlags(this)
        }

        @UnsafeFieldSetter
        set(`value`) {
            gobjectSignalInvocationHintPointer.pointed.run_type = value.mask
        }

    /**
     * Allocate a new SignalInvocationHint.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GSignalInvocationHint>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to SignalInvocationHint and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<GSignalInvocationHint>, Cleaner>,
    ) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new SignalInvocationHint using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GSignalInvocationHint>().ptr)

    /**
     * Allocate a new SignalInvocationHint.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param signalId The signal id of the signal invoking the callback
     * @param detail The detail passed on for this emission
     * @param runType The stage the signal emission is currently in, this
     *  field will contain one of %G_SIGNAL_RUN_FIRST,
     *  %G_SIGNAL_RUN_LAST or %G_SIGNAL_RUN_CLEANUP and %G_SIGNAL_ACCUMULATOR_FIRST_RUN.
     *  %G_SIGNAL_ACCUMULATOR_FIRST_RUN is only set for the first run of the accumulator
     *  function for a signal emission.
     */
    public constructor(
        signalId: guint,
        detail: Quark,
        runType: SignalFlags,
    ) : this() {
        this.signalId = signalId
        this.detail = detail
        this.runType = runType
    }

    /**
     * Allocate a new SignalInvocationHint using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param signalId The signal id of the signal invoking the callback
     * @param detail The detail passed on for this emission
     * @param runType The stage the signal emission is currently in, this
     *  field will contain one of %G_SIGNAL_RUN_FIRST,
     *  %G_SIGNAL_RUN_LAST or %G_SIGNAL_RUN_CLEANUP and %G_SIGNAL_ACCUMULATOR_FIRST_RUN.
     *  %G_SIGNAL_ACCUMULATOR_FIRST_RUN is only set for the first run of the accumulator
     *  function for a signal emission.
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        signalId: guint,
        detail: Quark,
        runType: SignalFlags,
        scope: AutofreeScope,
    ) : this(scope) {
        this.signalId = signalId
        this.detail = detail
        this.runType = runType
    }

    override fun toString(): String = "SignalInvocationHint(signalId=$signalId, detail=$detail, runType=$runType)"
}
