// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GArray
import org.gtkkn.native.glib.g_free
import org.gtkkn.native.glib.g_strdup
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_array_get_type
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * Contains the public fields of a GArray.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `array`: GLib.Array parameter of type gpointer is not supported
 * - parameter `array`: GLib.Array parameter of type gpointer is not supported
 * - parameter `array`: GLib.Array parameter of type gpointer is not supported
 * - parameter `array`: GLib.Array parameter of type gpointer is not supported
 * - parameter `array`: GLib.Array parameter of type gpointer is not supported
 * - parameter `array`: GLib.Array parameter of type gpointer is not supported
 * - function `new`: GLib.Array parameter of type gpointer is not supported
 * - parameter `data`: Array parameter of type gpointer is not supported
 * - parameter `data`: Array parameter of type gpointer is not supported
 * - parameter `array`: GLib.Array parameter of type gpointer is not supported
 * - parameter `array`: GLib.Array parameter of type gpointer is not supported
 * - parameter `array`: GLib.Array parameter of type gpointer is not supported
 * - parameter `array`: GLib.Array parameter of type gpointer is not supported
 * - parameter `array`: GLib.Array parameter of type gpointer is not supported
 * - parameter `array`: GLib.Array parameter of type gpointer is not supported
 * - parameter `array`: GLib.Array parameter of type gpointer is not supported
 * - function `sized_new`: GLib.Array parameter of type gpointer is not supported
 * - parameter `array`: GLib.Array parameter of type gpointer is not supported
 * - parameter `array`: GLib.Array parameter of type gpointer is not supported
 * - parameter `array`: GLib.Array parameter of type gpointer is not supported
 * - parameter `array`: GLib.Array parameter of type gpointer is not supported
 */
public class Array(public val glibArrayPointer: CPointer<GArray>, cleaner: Cleaner? = null) :
    ProxyInstance(glibArrayPointer) {
    /**
     * a pointer to the element data. The data may be moved as
     *     elements are added to the #GArray.
     */
    public var `data`: String?
        get() = glibArrayPointer.pointed.data?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            glibArrayPointer.pointed.data?.let { g_free(it) }
            glibArrayPointer.pointed.data = value?.let { g_strdup(it) }
        }

    /**
     * the number of elements in the #GArray not including the
     *     possible terminating zero element.
     */
    public var len: guint
        get() = glibArrayPointer.pointed.len

        @UnsafeFieldSetter
        set(`value`) {
            glibArrayPointer.pointed.len = value
        }

    /**
     * Allocate a new Array.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GArray>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to Array and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<GArray>, Cleaner>,
    ) : this(glibArrayPointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new Array using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GArray>().ptr)

    /**
     * Allocate a new Array.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param data a pointer to the element data. The data may be moved as
     *     elements are added to the #GArray.
     * @param len the number of elements in the #GArray not including the
     *     possible terminating zero element.
     */
    public constructor(`data`: String?, len: guint) : this() {
        this.data = data
        this.len = len
    }

    /**
     * Allocate a new Array using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param data a pointer to the element data. The data may be moved as
     *     elements are added to the #GArray.
     * @param len the number of elements in the #GArray not including the
     *     possible terminating zero element.
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        `data`: String?,
        len: guint,
        scope: AutofreeScope,
    ) : this(scope) {
        this.data = data
        this.len = len
    }

    override fun toString(): String = "Array(data=$data, len=$len)"

    public companion object {
        /**
         * Get the GType of Array
         *
         * @return the GType
         */
        public fun getType(): GType = g_array_get_type()
    }
}
