// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.MainContext
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gobject.Value
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GAsyncResult
import org.gtkkn.native.gio.GTask
import org.gtkkn.native.gio.g_task_get_cancellable
import org.gtkkn.native.gio.g_task_get_check_cancellable
import org.gtkkn.native.gio.g_task_get_completed
import org.gtkkn.native.gio.g_task_get_context
import org.gtkkn.native.gio.g_task_get_name
import org.gtkkn.native.gio.g_task_get_priority
import org.gtkkn.native.gio.g_task_get_return_on_cancel
import org.gtkkn.native.gio.g_task_get_source_object
import org.gtkkn.native.gio.g_task_get_type
import org.gtkkn.native.gio.g_task_had_error
import org.gtkkn.native.gio.g_task_is_valid
import org.gtkkn.native.gio.g_task_new
import org.gtkkn.native.gio.g_task_propagate_boolean
import org.gtkkn.native.gio.g_task_propagate_int
import org.gtkkn.native.gio.g_task_propagate_value
import org.gtkkn.native.gio.g_task_return_boolean
import org.gtkkn.native.gio.g_task_return_error
import org.gtkkn.native.gio.g_task_return_error_if_cancelled
import org.gtkkn.native.gio.g_task_return_int
import org.gtkkn.native.gio.g_task_return_value
import org.gtkkn.native.gio.g_task_set_check_cancellable
import org.gtkkn.native.gio.g_task_set_name
import org.gtkkn.native.gio.g_task_set_priority
import org.gtkkn.native.gio.g_task_set_return_on_cancel
import org.gtkkn.native.glib.GError
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Result
import kotlin.String
import kotlin.Unit

/**
 * A #GTask represents and manages a cancellable "task".
 *
 * ## Asynchronous operations
 *
 * The most common usage of #GTask is as a #GAsyncResult, to
 * manage data during an asynchronous operation. You call
 * g_task_new() in the "start" method, followed by
 * g_task_set_task_data() and the like if you need to keep some
 * additional data associated with the task, and then pass the
 * task object around through your asynchronous operation.
 * Eventually, you will call a method such as
 * g_task_return_pointer() or g_task_return_error(), which will
 * save the value you give it and then invoke the task's callback
 * function in the
 * [thread-default main context][g-main-context-push-thread-default]
 * where it was created (waiting until the next iteration of the main
 * loop first, if necessary). The caller will pass the #GTask back to
 * the operation's finish function (as a #GAsyncResult), and you can
 * use g_task_propagate_pointer() or the like to extract the
 * return value.
 *
 * Using #GTask requires the thread-default #GMainContext from when the
 * #GTask was constructed to be running at least until the task has completed
 * and its data has been freed.
 *
 * Here is an example for using GTask as a GAsyncResult:
 * |[<!-- language="C" -->
 *     typedef struct {
 *       CakeFrostingType frosting;
 *       char *message;
 *     } DecorationData;
 *
 *     static void
 *     decoration_data_free (DecorationData *decoration)
 *     {
 *       g_free (decoration->message);
 *       g_slice_free (DecorationData, decoration);
 *     }
 *
 *     static void
 *     baked_cb (Cake     *cake,
 *               gpointer  user_data)
 *     {
 *       GTask *task = user_data;
 *       DecorationData *decoration = g_task_get_task_data (task);
 *       GError *error = NULL;
 *
 *       if (cake == NULL)
 *         {
 *           g_task_return_new_error (task, BAKER_ERROR, BAKER_ERROR_NO_FLOUR,
 *                                    "Go to the supermarket");
 *           g_object_unref (task);
 *           return;
 *         }
 *
 *       if (!cake_decorate (cake, decoration->frosting, decoration->message, &error))
 *         {
 *           g_object_unref (cake);
 *           // g_task_return_error() takes ownership of error
 *           g_task_return_error (task, error);
 *           g_object_unref (task);
 *           return;
 *         }
 *
 *       g_task_return_pointer (task, cake, g_object_unref);
 *       g_object_unref (task);
 *     }
 *
 *     void
 *     baker_bake_cake_async (Baker               *self,
 *                            guint                radius,
 *                            CakeFlavor           flavor,
 *                            CakeFrostingType     frosting,
 *                            const char          *message,
 *                            GCancellable        *cancellable,
 *                            GAsyncReadyCallback  callback,
 *                            gpointer             user_data)
 *     {
 *       GTask *task;
 *       DecorationData *decoration;
 *       Cake  *cake;
 *
 *       task = g_task_new (self, cancellable, callback, user_data);
 *       if (radius < 3)
 *         {
 *           g_task_return_new_error (task, BAKER_ERROR, BAKER_ERROR_TOO_SMALL,
 *                                    "%ucm radius cakes are silly",
 *                                    radius);
 *           g_object_unref (task);
 *           return;
 *         }
 *
 *       cake = _baker_get_cached_cake (self, radius, flavor, frosting, message);
 *       if (cake != NULL)
 *         {
 *           // _baker_get_cached_cake() returns a reffed cake
 *           g_task_return_pointer (task, cake, g_object_unref);
 *           g_object_unref (task);
 *           return;
 *         }
 *
 *       decoration = g_slice_new (DecorationData);
 *       decoration->frosting = frosting;
 *       decoration->message = g_strdup (message);
 *       g_task_set_task_data (task, decoration, (GDestroyNotify) decoration_data_free);
 *
 *       _baker_begin_cake (self, radius, flavor, cancellable, baked_cb, task);
 *     }
 *
 *     Cake *
 *     baker_bake_cake_finish (Baker         *self,
 *                             GAsyncResult  *result,
 *                             GError       **error)
 *     {
 *       g_return_val_if_fail (g_task_is_valid (result, self), NULL);
 *
 *       return g_task_propagate_pointer (G_TASK (result), error);
 *     }
 * ]|
 *
 * ## Chained asynchronous operations
 *
 * #GTask also tries to simplify asynchronous operations that
 * internally chain together several smaller asynchronous
 * operations. g_task_get_cancellable(), g_task_get_context(),
 * and g_task_get_priority() allow you to get back the task's
 * #GCancellable, #GMainContext, and [I/O priority][io-priority]
 * when starting a new subtask, so you don't have to keep track
 * of them yourself. g_task_attach_source() simplifies the case
 * of waiting for a source to fire (automatically using the correct
 * #GMainContext and priority).
 *
 * Here is an example for chained asynchronous operations:
 *   |[<!-- language="C" -->
 *     typedef struct {
 *       Cake *cake;
 *       CakeFrostingType frosting;
 *       char *message;
 *     } BakingData;
 *
 *     static void
 *     decoration_data_free (BakingData *bd)
 *     {
 *       if (bd->cake)
 *         g_object_unref (bd->cake);
 *       g_free (bd->message);
 *       g_slice_free (BakingData, bd);
 *     }
 *
 *     static void
 *     decorated_cb (Cake         *cake,
 *                   GAsyncResult *result,
 *                   gpointer      user_data)
 *     {
 *       GTask *task = user_data;
 *       GError *error = NULL;
 *
 *       if (!cake_decorate_finish (cake, result, &error))
 *         {
 *           g_object_unref (cake);
 *           g_task_return_error (task, error);
 *           g_object_unref (task);
 *           return;
 *         }
 *
 *       // baking_data_free() will drop its ref on the cake, so we have to
 *       // take another here to give to the caller.
 *       g_task_return_pointer (task, g_object_ref (cake), g_object_unref);
 *       g_object_unref (task);
 *     }
 *
 *     static gboolean
 *     decorator_ready (gpointer user_data)
 *     {
 *       GTask *task = user_data;
 *       BakingData *bd = g_task_get_task_data (task);
 *
 *       cake_decorate_async (bd->cake, bd->frosting, bd->message,
 *                            g_task_get_cancellable (task),
 *                            decorated_cb, task);
 *
 *       return G_SOURCE_REMOVE;
 *     }
 *
 *     static void
 *     baked_cb (Cake     *cake,
 *               gpointer  user_data)
 *     {
 *       GTask *task = user_data;
 *       BakingData *bd = g_task_get_task_data (task);
 *       GError *error = NULL;
 *
 *       if (cake == NULL)
 *         {
 *           g_task_return_new_error (task, BAKER_ERROR, BAKER_ERROR_NO_FLOUR,
 *                                    "Go to the supermarket");
 *           g_object_unref (task);
 *           return;
 *         }
 *
 *       bd->cake = cake;
 *
 *       // Bail out now if the user has already cancelled
 *       if (g_task_return_error_if_cancelled (task))
 *         {
 *           g_object_unref (task);
 *           return;
 *         }
 *
 *       if (cake_decorator_available (cake))
 *         decorator_ready (task);
 *       else
 *         {
 *           GSource *source;
 *
 *           source = cake_decorator_wait_source_new (cake);
 *           // Attach @source to @task's GMainContext and have it call
 *           // decorator_ready() when it is ready.
 *           g_task_attach_source (task, source, decorator_ready);
 *           g_source_unref (source);
 *         }
 *     }
 *
 *     void
 *     baker_bake_cake_async (Baker               *self,
 *                            guint                radius,
 *                            CakeFlavor           flavor,
 *                            CakeFrostingType     frosting,
 *                            const char          *message,
 *                            gint                 priority,
 *                            GCancellable        *cancellable,
 *                            GAsyncReadyCallback  callback,
 *                            gpointer             user_data)
 *     {
 *       GTask *task;
 *       BakingData *bd;
 *
 *       task = g_task_new (self, cancellable, callback, user_data);
 *       g_task_set_priority (task, priority);
 *
 *       bd = g_slice_new0 (BakingData);
 *       bd->frosting = frosting;
 *       bd->message = g_strdup (message);
 *       g_task_set_task_data (task, bd, (GDestroyNotify) baking_data_free);
 *
 *       _baker_begin_cake (self, radius, flavor, cancellable, baked_cb, task);
 *     }
 *
 *     Cake *
 *     baker_bake_cake_finish (Baker         *self,
 *                             GAsyncResult  *result,
 *                             GError       **error)
 *     {
 *       g_return_val_if_fail (g_task_is_valid (result, self), NULL);
 *
 *       return g_task_propagate_pointer (G_TASK (result), error);
 *     }
 * ]|
 *
 * ## Asynchronous operations from synchronous ones
 *
 * You can use g_task_run_in_thread() to turn a synchronous
 * operation into an asynchronous one, by running it in a thread.
 * When it completes, the result will be dispatched to the
 * [thread-default main context][g-main-context-push-thread-default]
 * where the #GTask was created.
 *
 * Running a task in a thread:
 *   |[<!-- language="C" -->
 *     typedef struct {
 *       guint radius;
 *       CakeFlavor flavor;
 *       CakeFrostingType frosting;
 *       char *message;
 *     } CakeData;
 *
 *     static void
 *     cake_data_free (CakeData *cake_data)
 *     {
 *       g_free (cake_data->message);
 *       g_slice_free (CakeData, cake_data);
 *     }
 *
 *     static void
 *     bake_cake_thread (GTask         *task,
 *                       gpointer       source_object,
 *                       gpointer       task_data,
 *                       GCancellable  *cancellable)
 *     {
 *       Baker *self = source_object;
 *       CakeData *cake_data = task_data;
 *       Cake *cake;
 *       GError *error = NULL;
 *
 *       cake = bake_cake (baker, cake_data->radius, cake_data->flavor,
 *                         cake_data->frosting, cake_data->message,
 *                         cancellable, &error);
 *       if (cake)
 *         g_task_return_pointer (task, cake, g_object_unref);
 *       else
 *         g_task_return_error (task, error);
 *     }
 *
 *     void
 *     baker_bake_cake_async (Baker               *self,
 *                            guint                radius,
 *                            CakeFlavor           flavor,
 *                            CakeFrostingType     frosting,
 *                            const char          *message,
 *                            GCancellable        *cancellable,
 *                            GAsyncReadyCallback  callback,
 *                            gpointer             user_data)
 *     {
 *       CakeData *cake_data;
 *       GTask *task;
 *
 *       cake_data = g_slice_new (CakeData);
 *       cake_data->radius = radius;
 *       cake_data->flavor = flavor;
 *       cake_data->frosting = frosting;
 *       cake_data->message = g_strdup (message);
 *       task = g_task_new (self, cancellable, callback, user_data);
 *       g_task_set_task_data (task, cake_data, (GDestroyNotify) cake_data_free);
 *       g_task_run_in_thread (task, bake_cake_thread);
 *       g_object_unref (task);
 *     }
 *
 *     Cake *
 *     baker_bake_cake_finish (Baker         *self,
 *                             GAsyncResult  *result,
 *                             GError       **error)
 *     {
 *       g_return_val_if_fail (g_task_is_valid (result, self), NULL);
 *
 *       return g_task_propagate_pointer (G_TASK (result), error);
 *     }
 * ]|
 *
 * ## Adding cancellability to uncancellable tasks
 *
 * Finally, g_task_run_in_thread() and g_task_run_in_thread_sync()
 * can be used to turn an uncancellable operation into a
 * cancellable one. If you call g_task_set_return_on_cancel(),
 * passing true, then if the task's #GCancellable is cancelled,
 * it will return control back to the caller immediately, while
 * allowing the task thread to continue running in the background
 * (and simply discarding its result when it finally does finish).
 * Provided that the task thread is careful about how it uses
 * locks and other externally-visible resources, this allows you
 * to make "GLib-friendly" asynchronous and cancellable
 * synchronous variants of blocking APIs.
 *
 * Cancelling a task:
 *   |[<!-- language="C" -->
 *     static void
 *     bake_cake_thread (GTask         *task,
 *                       gpointer       source_object,
 *                       gpointer       task_data,
 *                       GCancellable  *cancellable)
 *     {
 *       Baker *self = source_object;
 *       CakeData *cake_data = task_data;
 *       Cake *cake;
 *       GError *error = NULL;
 *
 *       cake = bake_cake (baker, cake_data->radius, cake_data->flavor,
 *                         cake_data->frosting, cake_data->message,
 *                         &error);
 *       if (error)
 *         {
 *           g_task_return_error (task, error);
 *           return;
 *         }
 *
 *       // If the task has already been cancelled, then we don't want to add
 *       // the cake to the cake cache. Likewise, we don't  want to have the
 *       // task get cancelled in the middle of updating the cache.
 *       // g_task_set_return_on_cancel() will return true here if it managed
 *       // to disable return-on-cancel, or false if the task was cancelled
 *       // before it could.
 *       if (g_task_set_return_on_cancel (task, FALSE))
 *         {
 *           // If the caller cancels at this point, their
 *           // GAsyncReadyCallback won't be invoked until we return,
 *           // so we don't have to worry that this code will run at
 *           // the same time as that code does. But if there were
 *           // other functions that might look at the cake cache,
 *           // then we'd probably need a GMutex here as well.
 *           baker_add_cake_to_cache (baker, cake);
 *           g_task_return_pointer (task, cake, g_object_unref);
 *         }
 *     }
 *
 *     void
 *     baker_bake_cake_async (Baker               *self,
 *                            guint                radius,
 *                            CakeFlavor           flavor,
 *                            CakeFrostingType     frosting,
 *                            const char          *message,
 *                            GCancellable        *cancellable,
 *                            GAsyncReadyCallback  callback,
 *                            gpointer             user_data)
 *     {
 *       CakeData *cake_data;
 *       GTask *task;
 *
 *       cake_data = g_slice_new (CakeData);
 *
 *       ...
 *
 *       task = g_task_new (self, cancellable, callback, user_data);
 *       g_task_set_task_data (task, cake_data, (GDestroyNotify) cake_data_free);
 *       g_task_set_return_on_cancel (task, TRUE);
 *       g_task_run_in_thread (task, bake_cake_thread);
 *     }
 *
 *     Cake *
 *     baker_bake_cake_sync (Baker               *self,
 *                           guint                radius,
 *                           CakeFlavor           flavor,
 *                           CakeFrostingType     frosting,
 *                           const char          *message,
 *                           GCancellable        *cancellable,
 *                           GError             **error)
 *     {
 *       CakeData *cake_data;
 *       GTask *task;
 *       Cake *cake;
 *
 *       cake_data = g_slice_new (CakeData);
 *
 *       ...
 *
 *       task = g_task_new (self, cancellable, NULL, NULL);
 *       g_task_set_task_data (task, cake_data, (GDestroyNotify) cake_data_free);
 *       g_task_set_return_on_cancel (task, TRUE);
 *       g_task_run_in_thread_sync (task, bake_cake_thread);
 *
 *       cake = g_task_propagate_pointer (task, error);
 *       g_object_unref (task);
 *       return cake;
 *     }
 * ]|
 *
 * ## Porting from GSimpleAsyncResult
 *
 * #GTask's API attempts to be simpler than #GSimpleAsyncResult's
 * in several ways:
 * - You can save task-specific data with g_task_set_task_data(), and
 *   retrieve it later with g_task_get_task_data(). This replaces the
 *   abuse of g_simple_async_result_set_op_res_gpointer() for the same
 *   purpose with #GSimpleAsyncResult.
 * - In addition to the task data, #GTask also keeps track of the
 *   [priority][io-priority], #GCancellable, and
 *   #GMainContext associated with the task, so tasks that consist of
 *   a chain of simpler asynchronous operations will have easy access
 *   to those values when starting each sub-task.
 * - g_task_return_error_if_cancelled() provides simplified
 *   handling for cancellation. In addition, cancellation
 *   overrides any other #GTask return value by default, like
 *   #GSimpleAsyncResult does when
 *   g_simple_async_result_set_check_cancellable() is called.
 *   (You can use g_task_set_check_cancellable() to turn off that
 *   behavior.) On the other hand, g_task_run_in_thread()
 *   guarantees that it will always run your
 *   `task_func`, even if the task's #GCancellable
 *   is already cancelled before the task gets a chance to run;
 *   you can start your `task_func` with a
 *   g_task_return_error_if_cancelled() check if you need the
 *   old behavior.
 * - The "return" methods (eg, g_task_return_pointer())
 *   automatically cause the task to be "completed" as well, and
 *   there is no need to worry about the "complete" vs "complete
 *   in idle" distinction. (#GTask automatically figures out
 *   whether the task's callback can be invoked directly, or
 *   if it needs to be sent to another #GMainContext, or delayed
 *   until the next iteration of the current #GMainContext.)
 * - The "finish" functions for #GTask based operations are generally
 *   much simpler than #GSimpleAsyncResult ones, normally consisting
 *   of only a single call to g_task_propagate_pointer() or the like.
 *   Since g_task_propagate_pointer() "steals" the return value from
 *   the #GTask, it is not necessary to juggle pointers around to
 *   prevent it from being freed twice.
 * - With #GSimpleAsyncResult, it was common to call
 *   g_simple_async_result_propagate_error() from the
 *   `_finish()` wrapper function, and have
 *   virtual method implementations only deal with successful
 *   returns. This behavior is deprecated, because it makes it
 *   difficult for a subclass to chain to a parent class's async
 *   methods. Instead, the wrapper function should just be a
 *   simple wrapper, and the virtual method should call an
 *   appropriate `g_task_propagate_` function.
 *   Note that wrapper methods can now use
 *   g_async_result_legacy_propagate_error() to do old-style
 *   #GSimpleAsyncResult error-returning behavior, and
 *   g_async_result_is_tagged() to check if a result is tagged as
 *   having come from the `_async()` wrapper
 *   function (for "short-circuit" results, such as when passing
 *   0 to g_input_stream_read_async()).
 *
 * ## Skipped during bindings generation
 *
 * - method `get_source_tag`: Return type gpointer is unsupported
 * - method `get_task_data`: Return type gpointer is unsupported
 * - method `propagate_pointer`: Return type gpointer is unsupported
 * - parameter `result`: gpointer
 * - parameter `task_func`: TaskThreadFunc
 * - parameter `task_func`: TaskThreadFunc
 * - parameter `source_tag`: gpointer
 * - parameter `task_data`: gpointer
 * - parameter `source_tag`: gpointer
 */
public open class Task(
    pointer: CPointer<GTask>,
) : Object(pointer.reinterpret()), AsyncResult, KGTyped {
    public val gioTaskPointer: CPointer<GTask>
        get() = gPointer.reinterpret()

    override val gioAsyncResultPointer: CPointer<GAsyncResult>
        get() = gPointer.reinterpret()

    /**
     * Whether the task has completed, meaning its callback (if set) has been
     * invoked. This can only happen after g_task_return_pointer(),
     * g_task_return_error() or one of the other return functions have been called
     * on the task.
     *
     * This property is guaranteed to change from false to true exactly once.
     *
     * The #GObject::notify signal for this change is emitted in the same main
     * context as the task’s callback, immediately after that callback is invoked.
     *
     * @since 2.44
     */
    public open val completed: Boolean
        /**
         * Gets the value of #GTask:completed. This changes from false to true after
         * the task’s callback is invoked, and will return false if called from inside
         * the callback.
         *
         * @return true if the task has completed, false otherwise.
         * @since 2.44
         */
        get() = g_task_get_completed(gioTaskPointer.reinterpret()).asBoolean()

    /**
     * Creates a #GTask acting on @source_object, which will eventually be
     * used to invoke @callback in the current
     * [thread-default main context][g-main-context-push-thread-default].
     *
     * Call this in the "start" method of your asynchronous method, and
     * pass the #GTask around throughout the asynchronous operation. You
     * can use g_task_set_task_data() to attach task-specific data to the
     * object, which you can retrieve later via g_task_get_task_data().
     *
     * By default, if @cancellable is cancelled, then the return value of
     * the task will always be %G_IO_ERROR_CANCELLED, even if the task had
     * already completed before the cancellation. This allows for
     * simplified handling in cases where cancellation may imply that
     * other objects that the task depends on have been destroyed. If you
     * do not want this behavior, you can use
     * g_task_set_check_cancellable() to change it.
     *
     * @param sourceObject the #GObject that owns
     *   this task, or null.
     * @param cancellable optional #GCancellable object, null to ignore.
     * @param callback a #GAsyncReadyCallback.
     * @return a #GTask.
     * @since 2.36
     */
    public constructor(
        sourceObject: Object? = null,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ) : this(
        g_task_new(
            sourceObject?.gPointer?.reinterpret(),
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )!!.reinterpret()
    )

    /**
     * Gets @task's #GCancellable
     *
     * @return @task's #GCancellable
     * @since 2.36
     */
    public open fun getCancellable(): Cancellable =
        g_task_get_cancellable(gioTaskPointer.reinterpret())!!.run {
            Cancellable(reinterpret())
        }

    /**
     * Gets @task's check-cancellable flag. See
     * g_task_set_check_cancellable() for more details.
     *
     * @since 2.36
     */
    public open fun getCheckCancellable(): Boolean =
        g_task_get_check_cancellable(gioTaskPointer.reinterpret()).asBoolean()

    /**
     * Gets the value of #GTask:completed. This changes from false to true after
     * the task’s callback is invoked, and will return false if called from inside
     * the callback.
     *
     * @return true if the task has completed, false otherwise.
     * @since 2.44
     */
    public open fun getCompleted(): Boolean = g_task_get_completed(gioTaskPointer.reinterpret()).asBoolean()

    /**
     * Gets the #GMainContext that @task will return its result in (that
     * is, the context that was the
     * [thread-default main context][g-main-context-push-thread-default]
     * at the point when @task was created).
     *
     * This will always return a non-null value, even if the task's
     * context is the default #GMainContext.
     *
     * @return @task's #GMainContext
     * @since 2.36
     */
    public open fun getContext(): MainContext =
        g_task_get_context(gioTaskPointer.reinterpret())!!.run {
            MainContext(reinterpret())
        }

    /**
     * Gets @task’s name. See g_task_set_name().
     *
     * @return @task’s name, or null
     * @since 2.60
     */
    public open fun getName(): String? = g_task_get_name(gioTaskPointer.reinterpret())?.toKString()

    /**
     * Gets @task's priority
     *
     * @return @task's priority
     * @since 2.36
     */
    public open fun getPriority(): Int = g_task_get_priority(gioTaskPointer.reinterpret())

    /**
     * Gets @task's return-on-cancel flag. See
     * g_task_set_return_on_cancel() for more details.
     *
     * @since 2.36
     */
    public open fun getReturnOnCancel(): Boolean = g_task_get_return_on_cancel(gioTaskPointer.reinterpret()).asBoolean()

    /**
     * Gets the source object from @task. Like
     * g_async_result_get_source_object(), but does not ref the object.
     *
     * @return @task's source object, or null
     * @since 2.36
     */
    public open fun getSourceObject_(): Object? =
        g_task_get_source_object(gioTaskPointer.reinterpret())?.run {
            Object(reinterpret())
        }

    /**
     * Tests if @task resulted in an error.
     *
     * @return true if the task resulted in an error, false otherwise.
     * @since 2.36
     */
    public open fun hadError(): Boolean = g_task_had_error(gioTaskPointer.reinterpret()).asBoolean()

    /**
     * Gets the result of @task as a #gboolean.
     *
     * If the task resulted in an error, or was cancelled, then this will
     * instead return false and set @error.
     *
     * Since this method transfers ownership of the return value (or
     * error) to the caller, you may only call it once.
     *
     * @return the task result, or false on error
     * @since 2.36
     */
    public open fun propagateBoolean(): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_task_propagate_boolean(gioTaskPointer.reinterpret(), gError.ptr).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Gets the result of @task as an integer (#gssize).
     *
     * If the task resulted in an error, or was cancelled, then this will
     * instead return -1 and set @error.
     *
     * Since this method transfers ownership of the return value (or
     * error) to the caller, you may only call it once.
     *
     * @return the task result, or -1 on error
     * @since 2.36
     */
    public open fun propagateInt(): Result<Long> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_task_propagate_int(gioTaskPointer.reinterpret(), gError.ptr)
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Gets the result of @task as a #GValue, and transfers ownership of
     * that value to the caller. As with g_task_return_value(), this is
     * a generic low-level method; g_task_propagate_pointer() and the like
     * will usually be more useful for C code.
     *
     * If the task resulted in an error, or was cancelled, then this will
     * instead set @error and return false.
     *
     * Since this method transfers ownership of the return value (or
     * error) to the caller, you may only call it once.
     *
     * @param value return location for the #GValue
     * @return true if @task succeeded, false on error.
     * @since 2.64
     */
    public open fun propagateValue(`value`: Value): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_task_propagate_value(
                    gioTaskPointer.reinterpret(),
                    `value`.gobjectValuePointer,
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Sets @task's result to @result and completes the task (see
     * g_task_return_pointer() for more discussion of exactly what this
     * means).
     *
     * @param result the #gboolean result of a task function.
     * @since 2.36
     */
    public open fun returnBoolean(result: Boolean): Unit =
        g_task_return_boolean(gioTaskPointer.reinterpret(), result.asGBoolean())

    /**
     * Sets @task's result to @error (which @task assumes ownership of)
     * and completes the task (see g_task_return_pointer() for more
     * discussion of exactly what this means).
     *
     * Note that since the task takes ownership of @error, and since the
     * task may be completed before returning from g_task_return_error(),
     * you cannot assume that @error is still valid after calling this.
     * Call g_error_copy() on the error if you need to keep a local copy
     * as well.
     *
     * See also g_task_return_new_error().
     *
     * @param error the #GError result of a task function.
     * @since 2.36
     */
    public open fun returnError(error: Error): Unit =
        g_task_return_error(gioTaskPointer.reinterpret(), error.glibErrorPointer)

    /**
     * Checks if @task's #GCancellable has been cancelled, and if so, sets
     * @task's error accordingly and completes the task (see
     * g_task_return_pointer() for more discussion of exactly what this
     * means).
     *
     * @return true if @task has been cancelled, false if not
     * @since 2.36
     */
    public open fun returnErrorIfCancelled(): Boolean =
        g_task_return_error_if_cancelled(gioTaskPointer.reinterpret()).asBoolean()

    /**
     * Sets @task's result to @result and completes the task (see
     * g_task_return_pointer() for more discussion of exactly what this
     * means).
     *
     * @param result the integer (#gssize) result of a task function.
     * @since 2.36
     */
    public open fun returnInt(result: Long): Unit =
        g_task_return_int(
            gioTaskPointer.reinterpret(),
            result
        )

    /**
     * Sets @task's result to @result (by copying it) and completes the task.
     *
     * If @result is null then a #GValue of type %G_TYPE_POINTER
     * with a value of null will be used for the result.
     *
     * This is a very generic low-level method intended primarily for use
     * by language bindings; for C code, g_task_return_pointer() and the
     * like will normally be much easier to use.
     *
     * @param result the #GValue result of
     *                                      a task function
     * @since 2.64
     */
    public open fun returnValue(result: Value? = null): Unit =
        g_task_return_value(gioTaskPointer.reinterpret(), result?.gobjectValuePointer)

    /**
     * Sets or clears @task's check-cancellable flag. If this is true
     * (the default), then g_task_propagate_pointer(), etc, and
     * g_task_had_error() will check the task's #GCancellable first, and
     * if it has been cancelled, then they will consider the task to have
     * returned an "Operation was cancelled" error
     * (%G_IO_ERROR_CANCELLED), regardless of any other error or return
     * value the task may have had.
     *
     * If @check_cancellable is false, then the #GTask will not check the
     * cancellable itself, and it is up to @task's owner to do this (eg,
     * via g_task_return_error_if_cancelled()).
     *
     * If you are using g_task_set_return_on_cancel() as well, then
     * you must leave check-cancellable set true.
     *
     * @param checkCancellable whether #GTask will check the state of
     *   its #GCancellable for you.
     * @since 2.36
     */
    public open fun setCheckCancellable(checkCancellable: Boolean): Unit =
        g_task_set_check_cancellable(
            gioTaskPointer.reinterpret(),
            checkCancellable.asGBoolean()
        )

    /**
     * Sets @task’s name, used in debugging and profiling. The name defaults to
     * null.
     *
     * The task name should describe in a human readable way what the task does.
     * For example, ‘Open file’ or ‘Connect to network host’. It is used to set the
     * name of the #GSource used for idle completion of the task.
     *
     * This function may only be called before the @task is first used in a thread
     * other than the one it was constructed in. It is called automatically by
     * g_task_set_source_tag() if not called already.
     *
     * @param name a human readable name for the task, or null to unset it
     * @since 2.60
     */
    public open fun setName(name: String? = null): Unit = g_task_set_name(gioTaskPointer.reinterpret(), name)

    /**
     * Sets @task's priority. If you do not call this, it will default to
     * %G_PRIORITY_DEFAULT.
     *
     * This will affect the priority of #GSources created with
     * g_task_attach_source() and the scheduling of tasks run in threads,
     * and can also be explicitly retrieved later via
     * g_task_get_priority().
     *
     * @param priority the [priority][io-priority] of the request
     * @since 2.36
     */
    public open fun setPriority(priority: Int): Unit = g_task_set_priority(gioTaskPointer.reinterpret(), priority)

    /**
     * Sets or clears @task's return-on-cancel flag. This is only
     * meaningful for tasks run via g_task_run_in_thread() or
     * g_task_run_in_thread_sync().
     *
     * If @return_on_cancel is true, then cancelling @task's
     * #GCancellable will immediately cause it to return, as though the
     * task's #GTaskThreadFunc had called
     * g_task_return_error_if_cancelled() and then returned.
     *
     * This allows you to create a cancellable wrapper around an
     * uninterruptible function. The #GTaskThreadFunc just needs to be
     * careful that it does not modify any externally-visible state after
     * it has been cancelled. To do that, the thread should call
     * g_task_set_return_on_cancel() again to (atomically) set
     * return-on-cancel false before making externally-visible changes;
     * if the task gets cancelled before the return-on-cancel flag could
     * be changed, g_task_set_return_on_cancel() will indicate this by
     * returning false.
     *
     * You can disable and re-enable this flag multiple times if you wish.
     * If the task's #GCancellable is cancelled while return-on-cancel is
     * false, then calling g_task_set_return_on_cancel() to set it true
     * again will cause the task to be cancelled at that point.
     *
     * If the task's #GCancellable is already cancelled before you call
     * g_task_run_in_thread()/g_task_run_in_thread_sync(), then the
     * #GTaskThreadFunc will still be run (for consistency), but the task
     * will also be completed right away.
     *
     * @param returnOnCancel whether the task returns automatically when
     *   it is cancelled.
     * @return true if @task's return-on-cancel flag was changed to
     *   match @return_on_cancel. false if @task has already been
     *   cancelled.
     * @since 2.36
     */
    public open fun setReturnOnCancel(returnOnCancel: Boolean): Boolean =
        g_task_set_return_on_cancel(
            gioTaskPointer.reinterpret(),
            returnOnCancel.asGBoolean()
        ).asBoolean()

    public companion object : TypeCompanion<Task> {
        override val type: GeneratedClassKGType<Task> =
            GeneratedClassKGType(g_task_get_type()) {
                Task(it.reinterpret())
            }

        init {
            GioTypeProvider.register()
        }

        /**
         * Checks that @result is a #GTask, and that @source_object is its
         * source object (or that @source_object is null and @result has no
         * source object). This can be used in g_return_if_fail() checks.
         *
         * @param result A #GAsyncResult
         * @param sourceObject the source object
         *   expected to be associated with the task
         * @return true if @result and @source_object are valid, false
         * if not
         * @since 2.36
         */
        public fun isValid(
            result: AsyncResult,
            sourceObject: Object? = null,
        ): Boolean =
            g_task_is_valid(
                result.gioAsyncResultPointer,
                sourceObject?.gPointer?.reinterpret()
            ).asBoolean()
    }
}
