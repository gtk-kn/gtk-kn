// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.gio.annotations.GioVersion2_26
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gio.GPermission
import org.gtkkn.native.gio.g_permission_acquire
import org.gtkkn.native.gio.g_permission_acquire_async
import org.gtkkn.native.gio.g_permission_acquire_finish
import org.gtkkn.native.gio.g_permission_get_allowed
import org.gtkkn.native.gio.g_permission_get_can_acquire
import org.gtkkn.native.gio.g_permission_get_can_release
import org.gtkkn.native.gio.g_permission_get_type
import org.gtkkn.native.gio.g_permission_impl_update
import org.gtkkn.native.gio.g_permission_release
import org.gtkkn.native.gio.g_permission_release_async
import org.gtkkn.native.gio.g_permission_release_finish
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.GType
import kotlin.Boolean
import kotlin.Result
import kotlin.Unit

/**
 * A `GPermission` represents the status of the caller’s permission to
 * perform a certain action.
 *
 * You can query if the action is currently allowed and if it is
 * possible to acquire the permission so that the action will be allowed
 * in the future.
 *
 * There is also an API to actually acquire the permission and one to
 * release it.
 *
 * As an example, a `GPermission` might represent the ability for the
 * user to write to a [class@Gio.Settings] object.  This `GPermission` object
 * could then be used to decide if it is appropriate to show a “Click here to
 * unlock” button in a dialog and to provide the mechanism to invoke
 * when that button is clicked.
 */
public abstract class Permission(public val gioPermissionPointer: CPointer<GPermission>) :
    Object(gioPermissionPointer.reinterpret()),
    KGTyped {
    init {
        Gio
    }

    /**
     * true if the caller currently has permission to perform the action that
     * @permission represents the permission to perform.
     */
    public open val allowed: Boolean
        /**
         * Gets the value of the 'allowed' property.  This property is true if
         * the caller currently has permission to perform the action that
         * @permission represents the permission to perform.
         *
         * @return the value of the 'allowed' property
         * @since 2.26
         */
        get() = g_permission_get_allowed(gioPermissionPointer).asBoolean()

    /**
     * true if it is generally possible to acquire the permission by calling
     * g_permission_acquire().
     */
    public open val canAcquire: Boolean
        /**
         * Gets the value of the 'can-acquire' property.  This property is true
         * if it is generally possible to acquire the permission by calling
         * g_permission_acquire().
         *
         * @return the value of the 'can-acquire' property
         * @since 2.26
         */
        get() = g_permission_get_can_acquire(gioPermissionPointer).asBoolean()

    /**
     * true if it is generally possible to release the permission by calling
     * g_permission_release().
     */
    public open val canRelease: Boolean
        /**
         * Gets the value of the 'can-release' property.  This property is true
         * if it is generally possible to release the permission by calling
         * g_permission_release().
         *
         * @return the value of the 'can-release' property
         * @since 2.26
         */
        get() = g_permission_get_can_release(gioPermissionPointer).asBoolean()

    /**
     * Attempts to acquire the permission represented by @permission.
     *
     * The precise method by which this happens depends on the permission
     * and the underlying authentication mechanism.  A simple example is
     * that a dialog may appear asking the user to enter their password.
     *
     * You should check with g_permission_get_can_acquire() before calling
     * this function.
     *
     * If the permission is acquired then true is returned.  Otherwise,
     * false is returned and @error is set appropriately.
     *
     * This call is blocking, likely for a very long time (in the case that
     * user interaction is required).  See g_permission_acquire_async() for
     * the non-blocking version.
     *
     * @param cancellable a #GCancellable, or null
     * @return true if the permission was successfully acquired
     * @since 2.26
     */
    @GioVersion2_26
    public open fun acquire(cancellable: Cancellable? = null): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_permission_acquire(
            gioPermissionPointer,
            cancellable?.gioCancellablePointer,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Attempts to acquire the permission represented by @permission.
     *
     * This is the first half of the asynchronous version of
     * g_permission_acquire().
     *
     * @param cancellable a #GCancellable, or null
     * @param callback the #GAsyncReadyCallback to call when done
     * @since 2.26
     */
    @GioVersion2_26
    public open fun acquireAsync(cancellable: Cancellable? = null, callback: AsyncReadyCallback?): Unit =
        g_permission_acquire_async(
            gioPermissionPointer,
            cancellable?.gioCancellablePointer,
            callback?.let {
                AsyncReadyCallbackFunc.reinterpret()
            },
            callback?.let { StableRef.create(callback).asCPointer() }
        )

    /**
     * Collects the result of attempting to acquire the permission
     * represented by @permission.
     *
     * This is the second half of the asynchronous version of
     * g_permission_acquire().
     *
     * @param result the #GAsyncResult given to the #GAsyncReadyCallback
     * @return true if the permission was successfully acquired
     * @since 2.26
     */
    @GioVersion2_26
    public open fun acquireFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_permission_acquire_finish(
            gioPermissionPointer,
            result.gioAsyncResultPointer,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * This function is called by the #GPermission implementation to update
     * the properties of the permission.  You should never call this
     * function except from a #GPermission implementation.
     *
     * GObject notify signals are generated, as appropriate.
     *
     * @param allowed the new value for the 'allowed' property
     * @param canAcquire the new value for the 'can-acquire' property
     * @param canRelease the new value for the 'can-release' property
     * @since 2.26
     */
    @GioVersion2_26
    public open fun implUpdate(allowed: Boolean, canAcquire: Boolean, canRelease: Boolean): Unit =
        g_permission_impl_update(
            gioPermissionPointer,
            allowed.asGBoolean(),
            canAcquire.asGBoolean(),
            canRelease.asGBoolean()
        )

    /**
     * Attempts to release the permission represented by @permission.
     *
     * The precise method by which this happens depends on the permission
     * and the underlying authentication mechanism.  In most cases the
     * permission will be dropped immediately without further action.
     *
     * You should check with g_permission_get_can_release() before calling
     * this function.
     *
     * If the permission is released then true is returned.  Otherwise,
     * false is returned and @error is set appropriately.
     *
     * This call is blocking, likely for a very long time (in the case that
     * user interaction is required).  See g_permission_release_async() for
     * the non-blocking version.
     *
     * @param cancellable a #GCancellable, or null
     * @return true if the permission was successfully released
     * @since 2.26
     */
    @GioVersion2_26
    public open fun release(cancellable: Cancellable? = null): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_permission_release(
            gioPermissionPointer,
            cancellable?.gioCancellablePointer,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Attempts to release the permission represented by @permission.
     *
     * This is the first half of the asynchronous version of
     * g_permission_release().
     *
     * @param cancellable a #GCancellable, or null
     * @param callback the #GAsyncReadyCallback to call when done
     * @since 2.26
     */
    @GioVersion2_26
    public open fun releaseAsync(cancellable: Cancellable? = null, callback: AsyncReadyCallback?): Unit =
        g_permission_release_async(
            gioPermissionPointer,
            cancellable?.gioCancellablePointer,
            callback?.let {
                AsyncReadyCallbackFunc.reinterpret()
            },
            callback?.let { StableRef.create(callback).asCPointer() }
        )

    /**
     * Collects the result of attempting to release the permission
     * represented by @permission.
     *
     * This is the second half of the asynchronous version of
     * g_permission_release().
     *
     * @param result the #GAsyncResult given to the #GAsyncReadyCallback
     * @return true if the permission was successfully released
     * @since 2.26
     */
    @GioVersion2_26
    public open fun releaseFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_permission_release_finish(
            gioPermissionPointer,
            result.gioAsyncResultPointer,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * The PermissionImpl type represents a native instance of the abstract Permission class.
     *
     * @constructor Creates a new instance of Permission for the provided [CPointer].
     */
    public class PermissionImpl(pointer: CPointer<GPermission>) : Permission(pointer)

    public companion object : TypeCompanion<Permission> {
        override val type: GeneratedClassKGType<Permission> =
            GeneratedClassKGType(getTypeOrNull()!!) { PermissionImpl(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of Permission
         *
         * @return the GType
         */
        public fun getType(): GType = g_permission_get_type()

        /**
         * Gets the GType of from the symbol `g_permission_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? = org.gtkkn.extensions.glib.cinterop.getTypeOrNull("g_permission_get_type")
    }
}
