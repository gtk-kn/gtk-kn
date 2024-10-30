// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gobject.Parameter
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GAsyncInitable
import org.gtkkn.native.gio.g_async_initable_get_type
import org.gtkkn.native.gio.g_async_initable_init_async
import org.gtkkn.native.gio.g_async_initable_init_finish
import org.gtkkn.native.gio.g_async_initable_new_finish
import org.gtkkn.native.gio.g_async_initable_newv_async
import org.gtkkn.native.glib.GError
import kotlin.Boolean
import kotlin.Int
import kotlin.Result
import kotlin.UInt
import kotlin.ULong
import kotlin.Unit

/**
 * `GAsyncInitable` is an interface for asynchronously initializable objects.
 *
 * This is the asynchronous version of [iface@Gio.Initable]; it behaves the same
 * in all ways except that initialization is asynchronous. For more details
 * see the descriptions on `GInitable`.
 *
 * A class may implement both the `GInitable` and `GAsyncInitable` interfaces.
 *
 * Users of objects implementing this are not intended to use the interface
 * method directly; instead it will be used automatically in various ways.
 * For C applications you generally just call [func@Gio.AsyncInitable.new_async]
 * directly, or indirectly via a foo_thing_new_async() wrapper. This will call
 * [method@Gio.AsyncInitable.init_async] under the covers, calling back with `NULL`
 * and a set `GError` on failure.
 *
 * A typical implementation might look something like this:
 *
 * ```c
 * enum {
 *    NOT_INITIALIZED,
 *    INITIALIZING,
 *    INITIALIZED
 * };
 *
 * static void
 * _foo_ready_cb (Foo *self)
 * {
 *   GList *l;
 *
 *   self->priv->state = INITIALIZED;
 *
 *   for (l = self->priv->init_results; l != NULL; l = l->next)
 *     {
 *       GTask *task = l->data;
 *
 *       if (self->priv->success)
 *         g_task_return_boolean (task, TRUE);
 *       else
 *         g_task_return_new_error (task, ...);
 *       g_object_unref (task);
 *     }
 *
 *   g_list_free (self->priv->init_results);
 *   self->priv->init_results = NULL;
 * }
 *
 * static void
 * foo_init_async (GAsyncInitable       *initable,
 *                 int                   io_priority,
 *                 GCancellable         *cancellable,
 *                 GAsyncReadyCallback   callback,
 *                 gpointer              user_data)
 * {
 *   Foo *self = FOO (initable);
 *   GTask *task;
 *
 *   task = g_task_new (initable, cancellable, callback, user_data);
 *   g_task_set_name (task, G_STRFUNC);
 *
 *   switch (self->priv->state)
 *     {
 *       case NOT_INITIALIZED:
 *         _foo_get_ready (self);
 *         self->priv->init_results = g_list_append (self->priv->init_results,
 *                                                   task);
 *         self->priv->state = INITIALIZING;
 *         break;
 *       case INITIALIZING:
 *         self->priv->init_results = g_list_append (self->priv->init_results,
 *                                                   task);
 *         break;
 *       case INITIALIZED:
 *         if (!self->priv->success)
 *           g_task_return_new_error (task, ...);
 *         else
 *           g_task_return_boolean (task, TRUE);
 *         g_object_unref (task);
 *         break;
 *     }
 * }
 *
 * static gboolean
 * foo_init_finish (GAsyncInitable       *initable,
 *                  GAsyncResult         *result,
 *                  GError              **error)
 * {
 *   g_return_val_if_fail (g_task_is_valid (result, initable), FALSE);
 *
 *   return g_task_propagate_boolean (G_TASK (result), error);
 * }
 *
 * static void
 * foo_async_initable_iface_init (gpointer g_iface,
 *                                gpointer data)
 * {
 *   GAsyncInitableIface *iface = g_iface;
 *
 *   iface->init_async = foo_init_async;
 *   iface->init_finish = foo_init_finish;
 * }
 * ```
 * @since 2.22
 */
public interface AsyncInitable :
    Interface,
    KGTyped {
    public val gioAsyncInitablePointer: CPointer<GAsyncInitable>

    /**
     * Starts asynchronous initialization of the object implementing the
     * interface. This must be done before any real use of the object after
     * initial construction. If the object also implements #GInitable you can
     * optionally call g_initable_init() instead.
     *
     * This method is intended for language bindings. If writing in C,
     * g_async_initable_new_async() should typically be used instead.
     *
     * When the initialization is finished, @callback will be called. You can
     * then call g_async_initable_init_finish() to get the result of the
     * initialization.
     *
     * Implementations may also support cancellation. If @cancellable is not
     * null, then initialization can be cancelled by triggering the cancellable
     * object from another thread. If the operation was cancelled, the error
     * %G_IO_ERROR_CANCELLED will be returned. If @cancellable is not null, and
     * the object doesn't support cancellable initialization, the error
     * %G_IO_ERROR_NOT_SUPPORTED will be returned.
     *
     * As with #GInitable, if the object is not initialized, or initialization
     * returns with an error, then all operations on the object except
     * g_object_ref() and g_object_unref() are considered to be invalid, and
     * have undefined behaviour. They will often fail with g_critical() or
     * g_warning(), but this must not be relied on.
     *
     * Callers should not assume that a class which implements #GAsyncInitable can
     * be initialized multiple times; for more information, see g_initable_init().
     * If a class explicitly supports being initialized multiple times,
     * implementation requires yielding all subsequent calls to init_async() on the
     * results of the first call.
     *
     * For classes that also support the #GInitable interface, the default
     * implementation of this method will run the g_initable_init() function
     * in a thread, so if you want to support asynchronous initialization via
     * threads, just implement the #GAsyncInitable interface without overriding
     * any interface methods.
     *
     * @param ioPriority the [I/O priority][io-priority] of the operation
     * @param cancellable optional #GCancellable object, null to ignore.
     * @param callback a #GAsyncReadyCallback to call when the request is satisfied
     * @since 2.22
     */
    public fun initAsync(
        ioPriority: Int,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        g_async_initable_init_async(
            gioAsyncInitablePointer.reinterpret(),
            ioPriority,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finishes asynchronous initialization and returns the result.
     * See g_async_initable_init_async().
     *
     * @param res a #GAsyncResult.
     * @return true if successful. If an error has occurred, this function
     * will return false and set @error appropriately if present.
     * @since 2.22
     */
    public fun initFinish(res: AsyncResult): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_async_initable_init_finish(
                    gioAsyncInitablePointer.reinterpret(),
                    res.gioAsyncResultPointer,
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Finishes the async construction for the various g_async_initable_new
     * calls, returning the created object or null on error.
     *
     * @param res the #GAsyncResult from the callback
     * @return a newly created #GObject,
     *      or null on error. Free with g_object_unref().
     * @since 2.22
     */
    public fun newFinish(res: AsyncResult): Result<Object> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_async_initable_new_finish(
                    gioAsyncInitablePointer.reinterpret(),
                    res.gioAsyncResultPointer,
                    gError.ptr
                )?.run {
                    Object(reinterpret())
                }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    private data class Wrapper(
        private val pointer: CPointer<GAsyncInitable>,
    ) : AsyncInitable {
        override val gioAsyncInitablePointer: CPointer<GAsyncInitable> = pointer
    }

    public companion object : TypeCompanion<AsyncInitable> {
        override val type: GeneratedInterfaceKGType<AsyncInitable> =
            GeneratedInterfaceKGType(g_async_initable_get_type()) { Wrapper(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GAsyncInitable>): AsyncInitable = Wrapper(pointer)

        /**
         * Helper function for constructing #GAsyncInitable object. This is
         * similar to g_object_newv() but also initializes the object asynchronously.
         *
         * When the initialization is finished, @callback will be called. You can
         * then call g_async_initable_new_finish() to get the new object and check
         * for any errors.
         *
         * @param objectType a #GType supporting #GAsyncInitable.
         * @param nParameters the number of parameters in @parameters
         * @param parameters the parameters to use to construct the object
         * @param ioPriority the [I/O priority][io-priority] of the operation
         * @param cancellable optional #GCancellable object, null to ignore.
         * @param callback a #GAsyncReadyCallback to call when the initialization is
         *     finished
         * @since 2.22
         */
        public fun newvAsync(
            objectType: ULong,
            nParameters: UInt,
            parameters: Parameter,
            ioPriority: Int,
            cancellable: Cancellable? = null,
            callback: AsyncReadyCallback,
        ): Unit =
            g_async_initable_newv_async(
                objectType,
                nParameters,
                parameters.gobjectParameterPointer,
                ioPriority,
                cancellable?.gioCancellablePointer?.reinterpret(),
                AsyncReadyCallbackFunc.reinterpret(),
                StableRef.create(callback).asCPointer()
            )
    }
}
