// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_32
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gio.GStaticResource
import org.gtkkn.native.gio.g_static_resource_fini
import org.gtkkn.native.gio.g_static_resource_get_resource
import org.gtkkn.native.gio.g_static_resource_init
import kotlin.Pair
import kotlin.Unit
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * #GStaticResource is an opaque data structure and can only be accessed
 * using the following functions.
 */
public class StaticResource(pointer: CPointer<GStaticResource>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val gioStaticResourcePointer: CPointer<GStaticResource> = pointer

    /**
     * Allocate a new StaticResource.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GStaticResource>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to StaticResource and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<GStaticResource>, Cleaner>,
    ) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new StaticResource using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GStaticResource>().ptr)

    /**
     * Finalized a GResource initialized by g_static_resource_init().
     *
     * This is normally used by code generated by
     * [glib-compile-resources][glib-compile-resources]
     * and is not typically used by other code.
     *
     * @since 2.32
     */
    @GioVersion2_32
    public fun fini(): Unit = g_static_resource_fini(gioStaticResourcePointer.reinterpret())

    /**
     * Gets the GResource that was registered by a call to g_static_resource_init().
     *
     * This is normally used by code generated by
     * [glib-compile-resources][glib-compile-resources]
     * and is not typically used by other code.
     *
     * @return a #GResource
     * @since 2.32
     */
    @GioVersion2_32
    public fun getResource(): Resource = g_static_resource_get_resource(gioStaticResourcePointer.reinterpret())!!.run {
        Resource(reinterpret())
    }

    /**
     * Initializes a GResource from static data using a
     * GStaticResource.
     *
     * This is normally used by code generated by
     * [glib-compile-resources][glib-compile-resources]
     * and is not typically used by other code.
     *
     * @since 2.32
     */
    @GioVersion2_32
    public fun `init`(): Unit = g_static_resource_init(gioStaticResourcePointer.reinterpret())
}
