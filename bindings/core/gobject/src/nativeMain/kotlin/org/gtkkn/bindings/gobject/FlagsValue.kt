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
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GFlagsValue
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * A structure which contains a single flags value, its name, and its
 * nickname.
 */
public class FlagsValue(public val gobjectFlagsValuePointer: CPointer<GFlagsValue>, cleaner: Cleaner? = null) :
    ProxyInstance(gobjectFlagsValuePointer) {
    /**
     * the flags value
     */
    public var `value`: guint
        get() = gobjectFlagsValuePointer.pointed.value

        @UnsafeFieldSetter
        set(`value`) {
            gobjectFlagsValuePointer.pointed.value = value
        }

    /**
     * the name of the value
     */
    public var valueName: String?
        get() = gobjectFlagsValuePointer.pointed.value_name?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            gobjectFlagsValuePointer.pointed.value_name?.let { g_free(it) }
            gobjectFlagsValuePointer.pointed.value_name = value?.let { g_strdup(it) }
        }

    /**
     * the nickname of the value
     */
    public var valueNick: String?
        get() = gobjectFlagsValuePointer.pointed.value_nick?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            gobjectFlagsValuePointer.pointed.value_nick?.let { g_free(it) }
            gobjectFlagsValuePointer.pointed.value_nick = value?.let { g_strdup(it) }
        }

    /**
     * Allocate a new FlagsValue.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GFlagsValue>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to FlagsValue and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<GFlagsValue>, Cleaner>,
    ) : this(gobjectFlagsValuePointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new FlagsValue using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GFlagsValue>().ptr)

    /**
     * Allocate a new FlagsValue.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param value the flags value
     * @param valueName the name of the value
     * @param valueNick the nickname of the value
     */
    public constructor(
        `value`: guint,
        valueName: String?,
        valueNick: String?,
    ) : this() {
        this.value = value
        this.valueName = valueName
        this.valueNick = valueNick
    }

    /**
     * Allocate a new FlagsValue using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param value the flags value
     * @param valueName the name of the value
     * @param valueNick the nickname of the value
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        `value`: guint,
        valueName: String?,
        valueNick: String?,
        scope: AutofreeScope,
    ) : this(scope) {
        this.value = value
        this.valueName = valueName
        this.valueNick = valueNick
    }

    override fun toString(): String = "FlagsValue(value=$value, valueName=$valueName, valueNick=$valueNick)"
}
