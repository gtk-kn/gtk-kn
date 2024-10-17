// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.glib.Error
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GInitable
import org.gtkkn.native.gio.g_initable_get_type
import org.gtkkn.native.gio.g_initable_init
import org.gtkkn.native.glib.GError
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
 * - parameter `parameters`: GObject.Parameter
 *
 * @since 2.22
 */
public interface Initable : Interface, KGTyped {
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
    public fun `init`(cancellable: Cancellable? = null): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_initable_init(
                    gioInitablePointer.reinterpret(),
                    cancellable?.gioCancellablePointer?.reinterpret(),
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    private data class Wrapper(
        private val pointer: CPointer<GInitable>,
    ) : Initable {
        override val gioInitablePointer: CPointer<GInitable> = pointer
    }

    public companion object : TypeCompanion<Initable> {
        override val type: GeneratedInterfaceKGType<Initable> =
            GeneratedInterfaceKGType(g_initable_get_type()) { Wrapper(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GInitable>): Initable = Wrapper(pointer)
    }
}
