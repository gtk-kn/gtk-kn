// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GSimplePermission
import org.gtkkn.native.gio.g_simple_permission_get_type
import org.gtkkn.native.gio.g_simple_permission_new
import org.gtkkn.native.gobject.GType
import kotlin.Boolean

/**
 * `GSimplePermission` is a trivial implementation of [class@Gio.Permission]
 * that represents a permission that is either always or never allowed.  The
 * value is given at construction and doesn’t change.
 *
 * Calling [method@Gio.Permission.acquire] or [method@Gio.Permission.release]
 * on a `GSimplePermission` will result in errors.
 */
public open class SimplePermission(public val gioSimplePermissionPointer: CPointer<GSimplePermission>) :
    Permission(gioSimplePermissionPointer.reinterpret()),
    KGTyped {
    /**
     * Creates a new #GPermission instance that represents an action that is
     * either always or never allowed.
     *
     * @param allowed true if the action is allowed
     * @return the #GSimplePermission, as a #GPermission
     * @since 2.26
     */
    public constructor(allowed: Boolean) : this(g_simple_permission_new(allowed.asGBoolean())!!.reinterpret())

    public companion object : TypeCompanion<SimplePermission> {
        override val type: GeneratedClassKGType<SimplePermission> =
            GeneratedClassKGType(g_simple_permission_get_type()) { SimplePermission(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of SimplePermission
         *
         * @return the GType
         */
        public fun getType(): GType = g_simple_permission_get_type()
    }
}
