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
import org.gtkkn.bindings.glib.SeekType
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GSeekable
import org.gtkkn.native.gio.g_seekable_can_seek
import org.gtkkn.native.gio.g_seekable_can_truncate
import org.gtkkn.native.gio.g_seekable_get_type
import org.gtkkn.native.gio.g_seekable_seek
import org.gtkkn.native.gio.g_seekable_tell
import org.gtkkn.native.gio.g_seekable_truncate
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.gint64
import org.gtkkn.native.gobject.GType
import kotlin.Boolean
import kotlin.Result

/**
 * `GSeekable` is implemented by streams (implementations of
 * [class@Gio.InputStream] or [class@Gio.OutputStream]) that support seeking.
 *
 * Seekable streams largely fall into two categories: resizable and
 * fixed-size.
 *
 * `GSeekable` on fixed-sized streams is approximately the same as POSIX
 * [`lseek()`](man:lseek(2)) on a block device (for example: attempting to seek
 * past the end of the device is an error).  Fixed streams typically cannot be
 * truncated.
 *
 * `GSeekable` on resizable streams is approximately the same as POSIX
 * [`lseek()`](man:lseek(2)) on a normal file.  Seeking past the end and writing
 * data will usually cause the stream to resize by introducing zero bytes.
 */
public interface Seekable :
    Interface,
    KGTyped {
    public val gioSeekablePointer: CPointer<GSeekable>

    /**
     * Tests if the stream supports the #GSeekableIface.
     *
     * @return true if @seekable can be seeked. false otherwise.
     */
    public fun canSeek(): Boolean = g_seekable_can_seek(gioSeekablePointer).asBoolean()

    /**
     * Tests if the length of the stream can be adjusted with
     * g_seekable_truncate().
     *
     * @return true if the stream can be truncated, false otherwise.
     */
    public fun canTruncate(): Boolean = g_seekable_can_truncate(gioSeekablePointer).asBoolean()

    /**
     * Seeks in the stream by the given @offset, modified by @type.
     *
     * Attempting to seek past the end of the stream will have different
     * results depending on if the stream is fixed-sized or resizable.  If
     * the stream is resizable then seeking past the end and then writing
     * will result in zeros filling the empty space.  Seeking past the end
     * of a resizable stream and reading will result in EOF.  Seeking past
     * the end of a fixed-sized stream will fail.
     *
     * Any operation that would result in a negative offset will fail.
     *
     * If @cancellable is not null, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     *
     * @param offset a #goffset.
     * @param type a #GSeekType.
     * @param cancellable optional #GCancellable object, null to ignore.
     * @return true if successful. If an error
     *     has occurred, this function will return false and set @error
     *     appropriately if present.
     */
    public fun seek(offset: gint64, type: SeekType, cancellable: Cancellable? = null): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_seekable_seek(
            gioSeekablePointer,
            offset,
            type.nativeValue,
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
     * Tells the current position within the stream.
     *
     * @return the (positive or zero) offset from the beginning of the
     * buffer, zero if the target is not seekable.
     */
    public fun tell(): gint64 = g_seekable_tell(gioSeekablePointer)

    /**
     * Sets the length of the stream to @offset. If the stream was previously
     * larger than @offset, the extra data is discarded. If the stream was
     * previously shorter than @offset, it is extended with NUL ('\0') bytes.
     *
     * If @cancellable is not null, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned. If an
     * operation was partially finished when the operation was cancelled the
     * partial result will be returned, without an error.
     *
     * @param offset new length for @seekable, in bytes.
     * @param cancellable optional #GCancellable object, null to ignore.
     * @return true if successful. If an error
     *     has occurred, this function will return false and set @error
     *     appropriately if present.
     */
    public fun truncate(offset: gint64, cancellable: Cancellable? = null): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_seekable_truncate(
            gioSeekablePointer,
            offset,
            cancellable?.gioCancellablePointer,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    private data class Wrapper(private val pointer: CPointer<GSeekable>) : Seekable {
        override val gioSeekablePointer: CPointer<GSeekable> = pointer
    }

    public companion object : TypeCompanion<Seekable> {
        override val type: GeneratedInterfaceKGType<Seekable> =
            GeneratedInterfaceKGType(g_seekable_get_type()) { Wrapper(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GSeekable>): Seekable = Wrapper(pointer)

        /**
         * Get the GType of Seekable
         *
         * @return the GType
         */
        public fun getType(): GType = g_seekable_get_type()
    }
}
