// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.List
import org.gtkkn.bindings.gobject.annotations.GObjectVersion2_80
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gobject.GParamSpecPool
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_param_spec_pool_free
import org.gtkkn.native.gobject.g_param_spec_pool_insert
import org.gtkkn.native.gobject.g_param_spec_pool_list_owned
import org.gtkkn.native.gobject.g_param_spec_pool_lookup
import org.gtkkn.native.gobject.g_param_spec_pool_remove
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * A #GParamSpecPool maintains a collection of #GParamSpecs which can be
 * quickly accessed by owner and name.
 *
 * The implementation of the #GObject property system uses such a pool to
 * store the #GParamSpecs of the properties all object types.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `n_pspecs_p`: n_pspecs_p: Out parameter is not supported
 * - function `new`: Return type ParamSpecPool is unsupported
 */
public class ParamSpecPool(pointer: CPointer<GParamSpecPool>) : ProxyInstance(pointer) {
    public val gobjectParamSpecPoolPointer: CPointer<GParamSpecPool> = pointer

    /**
     * Frees the resources allocated by a #GParamSpecPool.
     *
     * @since 2.80
     */
    @GObjectVersion2_80
    public fun free(): Unit = g_param_spec_pool_free(gobjectParamSpecPoolPointer.reinterpret())

    /**
     * Inserts a #GParamSpec in the pool.
     *
     * @param pspec the #GParamSpec to insert
     * @param ownerType a #GType identifying the owner of @pspec
     */
    public fun insert(pspec: ParamSpec, ownerType: GType): Unit =
        g_param_spec_pool_insert(gobjectParamSpecPoolPointer.reinterpret(), pspec.gPointer.reinterpret(), ownerType)

    /**
     * Gets an #GList of all #GParamSpecs owned by @owner_type in
     * the pool.
     *
     * @param ownerType the owner to look for
     * @return a
     *          #GList of all #GParamSpecs owned by @owner_type in
     *          the pool#GParamSpecs.
     */
    public fun listOwned(ownerType: GType): List =
        g_param_spec_pool_list_owned(gobjectParamSpecPoolPointer.reinterpret(), ownerType)!!.run {
            List(reinterpret())
        }

    /**
     * Looks up a #GParamSpec in the pool.
     *
     * @param paramName the name to look for
     * @param ownerType the owner to look for
     * @param walkAncestors If true, also try to find a #GParamSpec with @param_name
     *  owned by an ancestor of @owner_type.
     * @return The found #GParamSpec, or null if no
     * matching #GParamSpec was found.
     */
    public fun lookup(paramName: String, ownerType: GType, walkAncestors: Boolean): ParamSpec? =
        g_param_spec_pool_lookup(
            gobjectParamSpecPoolPointer.reinterpret(),
            paramName,
            ownerType,
            walkAncestors.asGBoolean()
        )?.run {
            ParamSpec(reinterpret())
        }

    /**
     * Removes a #GParamSpec from the pool.
     *
     * @param pspec the #GParamSpec to remove
     */
    public fun remove(pspec: ParamSpec): Unit =
        g_param_spec_pool_remove(gobjectParamSpecPoolPointer.reinterpret(), pspec.gPointer.reinterpret())
}
