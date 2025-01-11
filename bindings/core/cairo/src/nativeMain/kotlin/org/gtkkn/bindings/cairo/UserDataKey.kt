// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.cairo.cairo_user_data_key_t
import org.gtkkn.native.glib.gint
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

public class UserDataKey(
    public val cairoUserDataKeyPointer: CPointer<cairo_user_data_key_t>,
    cleaner: Cleaner? = null,
) : ProxyInstance(cairoUserDataKeyPointer) {
    public var unused: gint
        get() = cairoUserDataKeyPointer.pointed.unused

        @UnsafeFieldSetter
        set(`value`) {
            cairoUserDataKeyPointer.pointed.unused = value
        }

    /**
     * Allocate a new UserDataKey.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<cairo_user_data_key_t>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to UserDataKey and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<cairo_user_data_key_t>, Cleaner>,
    ) : this(cairoUserDataKeyPointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new UserDataKey using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<cairo_user_data_key_t>().ptr)

    /**
     * Allocate a new UserDataKey.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param unused
     */
    public constructor(unused: gint) : this() {
        this.unused = unused
    }

    /**
     * Allocate a new UserDataKey using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param unused
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(unused: gint, scope: AutofreeScope) : this(scope) {
        this.unused = unused
    }

    override fun toString(): String = "UserDataKey(unused=$unused)"
}
