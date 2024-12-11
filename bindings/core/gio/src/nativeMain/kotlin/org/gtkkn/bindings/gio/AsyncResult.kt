// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.gio.annotations.GioVersion2_34
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GAsyncResult
import org.gtkkn.native.gio.g_async_result_get_source_object
import org.gtkkn.native.gio.g_async_result_get_type
import org.gtkkn.native.gio.g_async_result_legacy_propagate_error
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.GType
import kotlin.Boolean
import kotlin.Result

/**
 * `GAsyncResult` provides a base class for implementing asynchronous function results.
 *
 * Asynchronous operations are broken up into two separate operations
 * which are chained together by a `GAsyncReadyCallback`. To begin
 * an asynchronous operation, provide a `GAsyncReadyCallback` to the
 * asynchronous function. This callback will be triggered when the
 * operation has completed, and must be run in a later iteration of
 * the thread-default main context (see
 * [method@GLib.MainContext.push_thread_default]) from where the operation was
 * initiated. It will be passed a `GAsyncResult` instance filled with the
 * details of the operation's success or failure, the object the asynchronous
 * function was started for and any error codes returned. The asynchronous
 * callback function is then expected to call the corresponding `_finish()`
 * function, passing the object the function was called for, the
 * `GAsyncResult` instance, and (optionally) an @error to grab any
 * error conditions that may have occurred.
 *
 * The `_finish()` function for an operation takes the generic result
 * (of type `GAsyncResult`) and returns the specific result that the
 * operation in question yields (e.g. a [class@Gio.FileEnumerator] for a
 * "enumerate children" operation). If the result or error status of the
 * operation is not needed, there is no need to call the `_finish()`
 * function; GIO will take care of cleaning up the result and error
 * information after the `GAsyncReadyCallback` returns. You can pass
 * `NULL` for the `GAsyncReadyCallback` if you don't need to take any
 * action at all after the operation completes. Applications may also
 * take a reference to the `GAsyncResult` and call `_finish()` later;
 * however, the `_finish()` function may be called at most once.
 *
 * Example of a typical asynchronous operation flow:
 *
 * ```c
 * void _theoretical_frobnitz_async (Theoretical         *t,
 *                                   GCancellable        *c,
 *                                   GAsyncReadyCallback  cb,
 *                                   gpointer             u);
 *
 * gboolean _theoretical_frobnitz_finish (Theoretical   *t,
 *                                        GAsyncResult  *res,
 *                                        GError       **e);
 *
 * static void
 * frobnitz_result_func (GObject      *source_object,
 * 		 GAsyncResult *res,
 * 		 gpointer      user_data)
 * {
 *   gboolean success = FALSE;
 *
 *   success = _theoretical_frobnitz_finish (source_object, res, NULL);
 *
 *   if (success)
 *     g_printf ("Hurray!\n");
 *   else
 *     g_printf ("Uh oh!\n");
 *
 *   ...
 *
 * }
 *
 * int main (int argc, void *argv[])
 * {
 *    ...
 *
 *    _theoretical_frobnitz_async (theoretical_data,
 *                                 NULL,
 *                                 frobnitz_result_func,
 *                                 NULL);
 *
 *    ...
 * }
 * ```
 *
 * The callback for an asynchronous operation is called only once, and is
 * always called, even in the case of a cancelled operation. On cancellation
 * the result is a `G_IO_ERROR_CANCELLED` error.
 *
 * ## I/O Priority
 *
 * Many I/O-related asynchronous operations have a priority parameter,
 * which is used in certain cases to determine the order in which
 * operations are executed. They are not used to determine system-wide
 * I/O scheduling. Priorities are integers, with lower numbers indicating
 * higher priority. It is recommended to choose priorities between
 * `G_PRIORITY_LOW` and `G_PRIORITY_HIGH`, with `G_PRIORITY_DEFAULT`
 * as a default.
 *
 * ## Skipped during bindings generation
 *
 * - method `get_user_data`: Return type gpointer is unsupported
 * - parameter `source_tag`: gpointer
 */
public interface AsyncResult :
    Interface,
    KGTyped {
    public val gioAsyncResultPointer: CPointer<GAsyncResult>

    /**
     * Gets the source object from a #GAsyncResult.
     *
     * @return a new reference to the source
     *    object for the @res, or null if there is none.
     */
    public fun getSourceObject(): Object? = g_async_result_get_source_object(gioAsyncResultPointer.reinterpret())?.run {
        Object(reinterpret())
    }

    /**
     * If @res is a #GSimpleAsyncResult, this is equivalent to
     * g_simple_async_result_propagate_error(). Otherwise it returns
     * false.
     *
     * This can be used for legacy error handling in async *_finish()
     * wrapper functions that traditionally handled #GSimpleAsyncResult
     * error returns themselves rather than calling into the virtual method.
     * This should not be used in new code; #GAsyncResult errors that are
     * set by virtual methods should also be extracted by virtual methods,
     * to enable subclasses to chain up correctly.
     *
     * @return true if @error is has been filled in with an error from
     *   @res, false if not.
     * @since 2.34
     */
    @GioVersion2_34
    public fun legacyPropagateError(): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_async_result_legacy_propagate_error(gioAsyncResultPointer.reinterpret(), gError.ptr).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    private data class Wrapper(private val pointer: CPointer<GAsyncResult>) : AsyncResult {
        override val gioAsyncResultPointer: CPointer<GAsyncResult> = pointer
    }

    public companion object : TypeCompanion<AsyncResult> {
        override val type: GeneratedInterfaceKGType<AsyncResult> =
            GeneratedInterfaceKGType(g_async_result_get_type()) { Wrapper(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GAsyncResult>): AsyncResult = Wrapper(pointer)

        /**
         * Get the GType of AsyncResult
         *
         * @return the GType
         */
        public fun getType(): GType = g_async_result_get_type()
    }
}
