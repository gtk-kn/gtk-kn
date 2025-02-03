// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.gio.annotations.GioVersion2_22
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.legacy.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gio.GInitable
import org.gtkkn.native.gio.g_initable_get_type
import org.gtkkn.native.gio.g_initable_init
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.GType
import kotlin.Boolean
import kotlin.Result

/**
 * `GInitable` is implemented by objects that can fail during
 * initialization. If an object implements this interface then
 * it must be initialized as the first thing after construction,
 * either via [method@Gio.Initable.init] or [method@Gio.AsyncInitable.init_async]
 * (the latter is only available if it also implements [iface@Gio.AsyncInitable]).
 *
 * If the object is not initialized, or initialization returns with an
 * error, then all operations on the object except `g_object_ref()` and
 * `g_object_unref()` are considered to be invalid, and have undefined
 * behaviour. They will often fail with [func@GLib.critical] or
 * [func@GLib.warning], but this must not be relied on.
 *
 * Users of objects implementing this are not intended to use
 * the interface method directly, instead it will be used automatically
 * in various ways. For C applications you generally just call
 * [func@Gio.Initable.new] directly, or indirectly via a `foo_thing_new()` wrapper.
 * This will call [method@Gio.Initable.init] under the cover, returning `NULL`
 * and setting a `GError` on failure (at which point the instance is
 * unreferenced).
 *
 * For bindings in languages where the native constructor supports
 * exceptions the binding could check for objects implementing `GInitable`
 * during normal construction and automatically initialize them, throwing
 * an exception on failure.
 *
 * ## Skipped during bindings generation
 *
 * - function `new`: Varargs parameter is not supported
 * - parameter `var_args`: va_list type is not supported
 * - parameter `parameters`: Array parameter of type GObject.Parameter is not supported
 *
 * @since 2.22
 */
@GioVersion2_22
public interface Initable :
    Proxy,
    KGTyped {
    public val gioInitablePointer: CPointer<GInitable>

    /**
     * Initializes the object implementing the interface.
     *
     * This method is intended for language bindings. If writing in C,
     * g_initable_new() should typically be used instead.
     *
     * The object must be initialized before any real use after initial
     * construction, either with this function or g_async_initable_init_async().
     *
     * Implementations may also support cancellation. If @cancellable is not null,
     * then initialization can be cancelled by triggering the cancellable object
     * from another thread. If the operation was cancelled, the error
     * %G_IO_ERROR_CANCELLED will be returned. If @cancellable is not null and
     * the object doesn't support cancellable initialization the error
     * %G_IO_ERROR_NOT_SUPPORTED will be returned.
     *
     * If the object is not initialized, or initialization returns with an
     * error, then all operations on the object except g_object_ref() and
     * g_object_unref() are considered to be invalid, and have undefined
     * behaviour. See the [introduction][ginitable] for more details.
     *
     * Callers should not assume that a class which implements #GInitable can be
     * initialized multiple times, unless the class explicitly documents itself as
     * supporting this. Generally, a class’ implementation of init() can assume
     * (and assert) that it will only be called once. Previously, this documentation
     * recommended all #GInitable implementations should be idempotent; that
     * recommendation was relaxed in GLib 2.54.
     *
     * If a class explicitly supports being initialized multiple times, it is
     * recommended that the method is idempotent: multiple calls with the same
     * arguments should return the same results. Only the first call initializes
     * the object; further calls return the result of the first call.
     *
     * One reason why a class might need to support idempotent initialization is if
     * it is designed to be used via the singleton pattern, with a
     * #GObjectClass.constructor that sometimes returns an existing instance.
     * In this pattern, a caller would expect to be able to call g_initable_init()
     * on the result of g_object_new(), regardless of whether it is in fact a new
     * instance.
     *
     * @param cancellable optional #GCancellable object, null to ignore.
     * @return true if successful. If an error has occurred, this function will
     *     return false and set @error appropriately if present.
     * @since 2.22
     */
    @GioVersion2_22
    public fun `init`(cancellable: Cancellable? = null): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_initable_init(gioInitablePointer, cancellable?.gioCancellablePointer, gError.ptr).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * The InitableImpl type represents a native instance of the Initable interface.
     *
     * @constructor Creates a new instance of Initable for the provided [CPointer].
     */
    public class InitableImpl(gioInitablePointer: CPointer<GInitable>) :
        Object(gioInitablePointer.reinterpret()),
        Initable {
        init {
            Gio
        }

        override val gioInitablePointer: CPointer<GInitable> = gioInitablePointer
    }

    public companion object : TypeCompanion<Initable> {
        override val type: GeneratedInterfaceKGType<Initable> =
            GeneratedInterfaceKGType(getTypeOrNull()!!) { InitableImpl(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of Initable
         *
         * @return the GType
         */
        public fun getType(): GType = g_initable_get_type()

        /**
         * Gets the GType of from the symbol `g_initable_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? = org.gtkkn.extensions.glib.cinterop.getTypeOrNull("g_initable_get_type")
    }
}
