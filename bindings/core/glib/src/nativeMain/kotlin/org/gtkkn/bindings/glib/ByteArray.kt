// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GByteArray
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_byte_array_get_type
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * Contains the public fields of a GByteArray.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `array`: GLib.ByteArray parameter of type guint8 is not supported
 * - parameter `array`: GLib.ByteArray parameter of type guint8 is not supported
 * - parameter `array`: GLib.ByteArray parameter of type guint8 is not supported
 * - function `new`: GLib.ByteArray parameter of type guint8 is not supported
 * - parameter `data`: Array parameter of type guint8 is not supported
 * - parameter `array`: GLib.ByteArray parameter of type guint8 is not supported
 * - parameter `array`: GLib.ByteArray parameter of type guint8 is not supported
 * - parameter `array`: GLib.ByteArray parameter of type guint8 is not supported
 * - parameter `array`: GLib.ByteArray parameter of type guint8 is not supported
 * - parameter `array`: GLib.ByteArray parameter of type guint8 is not supported
 * - parameter `array`: GLib.ByteArray parameter of type guint8 is not supported
 * - function `sized_new`: GLib.ByteArray parameter of type guint8 is not supported
 * - parameter `array`: GLib.ByteArray parameter of type guint8 is not supported
 * - parameter `array`: GLib.ByteArray parameter of type guint8 is not supported
 * - parameter `array`: GLib.ByteArray parameter of type guint8 is not supported
 * - parameter `array`: GLib.ByteArray parameter of type guint8 is not supported
 * - field `data`: Unsupported pointer to primitive type
 */
public class ByteArray(pointer: CPointer<GByteArray>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val gPointer: CPointer<GByteArray> = pointer

    /**
     * the number of elements in the #GByteArray
     */
    public var len: guint
        get() = gPointer.pointed.len

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.len = value
        }

    /**
     * Allocate a new ByteArray.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GByteArray>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to ByteArray and a [Cleaner] instance.
     */
    private constructor(pair: Pair<CPointer<GByteArray>, Cleaner>) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new ByteArray using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GByteArray>().ptr)

    /**
     * Allocate a new ByteArray.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param len the number of elements in the #GByteArray
     */
    public constructor(len: guint) : this() {
        this.len = len
    }

    /**
     * Allocate a new ByteArray using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param len the number of elements in the #GByteArray
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(len: guint, scope: AutofreeScope) : this(scope) {
        this.len = len
    }

    override fun toString(): String = "ByteArray(len=$len)"

    public companion object {
        /**
         * Get the GType of ByteArray
         *
         * @return the GType
         */
        public fun getType(): GType = g_byte_array_get_type()
    }
}
