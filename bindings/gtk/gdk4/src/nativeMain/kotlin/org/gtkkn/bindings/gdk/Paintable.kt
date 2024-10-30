// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkPaintable
import org.gtkkn.native.gdk.gdk_paintable_get_current_image
import org.gtkkn.native.gdk.gdk_paintable_get_flags
import org.gtkkn.native.gdk.gdk_paintable_get_intrinsic_aspect_ratio
import org.gtkkn.native.gdk.gdk_paintable_get_intrinsic_height
import org.gtkkn.native.gdk.gdk_paintable_get_intrinsic_width
import org.gtkkn.native.gdk.gdk_paintable_get_type
import org.gtkkn.native.gdk.gdk_paintable_invalidate_contents
import org.gtkkn.native.gdk.gdk_paintable_invalidate_size
import org.gtkkn.native.gdk.gdk_paintable_new_empty
import org.gtkkn.native.gdk.gdk_paintable_snapshot
import org.gtkkn.native.gobject.g_signal_connect_data
import kotlin.Double
import kotlin.Int
import kotlin.ULong
import kotlin.Unit

/**
 * `GdkPaintable` is a simple interface used by GTK to represent content that
 * can be painted.
 *
 * The content of a `GdkPaintable` can be painted anywhere at any size
 * without requiring any sort of layout. The interface is inspired by
 * similar concepts elsewhere, such as
 * [ClutterContent](https://developer.gnome.org/clutter/stable/ClutterContent.html),
 * [HTML/CSS Paint Sources](https://www.w3.org/TR/css-images-4/#paint-source),
 * or [SVG Paint Servers](https://www.w3.org/TR/SVG2/pservers.html).
 *
 * A `GdkPaintable` can be snapshot at any time and size using
 * [method@Gdk.Paintable.snapshot]. How the paintable interprets that size and
 * if it scales or centers itself into the given rectangle is implementation
 * defined, though if you are implementing a `GdkPaintable` and don't know what
 * to do, it is suggested that you scale your paintable ignoring any potential
 * aspect ratio.
 *
 * The contents that a `GdkPaintable` produces may depend on the [class@Gdk.Snapshot]
 * passed to it. For example, paintables may decide to use more detailed images
 * on higher resolution screens or when OpenGL is available. A `GdkPaintable`
 * will however always produce the same output for the same snapshot.
 *
 * A `GdkPaintable` may change its contents, meaning that it will now produce
 * a different output with the same snapshot. Once that happens, it will call
 * [method@Gdk.Paintable.invalidate_contents] which will emit the
 * [signal@Gdk.Paintable::invalidate-contents] signal. If a paintable is known
 * to never change its contents, it will set the %GDK_PAINTABLE_STATIC_CONTENTS
 * flag. If a consumer cannot deal with changing contents, it may call
 * [method@Gdk.Paintable.get_current_image] which will return a static
 * paintable and use that.
 *
 * A paintable can report an intrinsic (or preferred) size or aspect ratio it
 * wishes to be rendered at, though it doesn't have to. Consumers of the interface
 * can use this information to layout thepaintable appropriately. Just like the
 * contents, the size of a paintable can change. A paintable will indicate this
 * by calling [method@Gdk.Paintable.invalidate_size] which will emit the
 * [signal@Gdk.Paintable::invalidate-size] signal. And just like for contents,
 * if a paintable is known to never change its size, it will set the
 * %GDK_PAINTABLE_STATIC_SIZE flag.
 *
 * Besides API for applications, there are some functions that are only
 * useful for implementing subclasses and should not be used by applications:
 * [method@Gdk.Paintable.invalidate_contents],
 * [method@Gdk.Paintable.invalidate_size],
 * [func@Gdk.Paintable.new_empty].
 *
 * ## Skipped during bindings generation
 *
 * - parameter `concrete_width`: concrete_width: Out parameter is not supported
 */
public interface Paintable :
    Interface,
    KGTyped {
    public val gdkPaintablePointer: CPointer<GdkPaintable>

    /**
     * Gets an immutable paintable for the current contents displayed by @paintable.
     *
     * This is useful when you want to retain the current state of an animation,
     * for example to take a screenshot of a running animation.
     *
     * If the @paintable is already immutable, it will return itself.
     *
     * @return An immutable paintable for the current
     *   contents of @paintable
     */
    public fun getCurrentImage(): Paintable =
        gdk_paintable_get_current_image(gdkPaintablePointer.reinterpret())!!.run {
            Paintable.wrap(reinterpret())
        }

    /**
     * Get flags for the paintable.
     *
     * This is oftentimes useful for optimizations.
     *
     * See [flags@Gdk.PaintableFlags] for the flags and what they mean.
     *
     * @return The `GdkPaintableFlags` for this paintable
     */
    public fun getFlags(): PaintableFlags =
        gdk_paintable_get_flags(gdkPaintablePointer.reinterpret()).run {
            PaintableFlags(this)
        }

    /**
     * Gets the preferred aspect ratio the @paintable would like to be displayed at.
     *
     * The aspect ratio is the width divided by the height, so a value of 0.5
     * means that the @paintable prefers to be displayed twice as high as it
     * is wide. Consumers of this interface can use this to preserve aspect
     * ratio when displaying the paintable.
     *
     * This is a purely informational value and does not in any way limit the
     * values that may be passed to [method@Gdk.Paintable.snapshot].
     *
     * Usually when a @paintable returns nonzero values from
     * [method@Gdk.Paintable.get_intrinsic_width] and
     * [method@Gdk.Paintable.get_intrinsic_height] the aspect ratio
     * should conform to those values, though that is not required.
     *
     * If the @paintable does not have a preferred aspect ratio,
     * it returns 0. Negative values are never returned.
     *
     * @return the intrinsic aspect ratio of @paintable or 0 if none.
     */
    public fun getIntrinsicAspectRatio(): Double =
        gdk_paintable_get_intrinsic_aspect_ratio(gdkPaintablePointer.reinterpret())

    /**
     * Gets the preferred height the @paintable would like to be displayed at.
     *
     * Consumers of this interface can use this to reserve enough space to draw
     * the paintable.
     *
     * This is a purely informational value and does not in any way limit the
     * values that may be passed to [method@Gdk.Paintable.snapshot].
     *
     * If the @paintable does not have a preferred height, it returns 0.
     * Negative values are never returned.
     *
     * @return the intrinsic height of @paintable or 0 if none.
     */
    public fun getIntrinsicHeight(): Int = gdk_paintable_get_intrinsic_height(gdkPaintablePointer.reinterpret())

    /**
     * Gets the preferred width the @paintable would like to be displayed at.
     *
     * Consumers of this interface can use this to reserve enough space to draw
     * the paintable.
     *
     * This is a purely informational value and does not in any way limit the
     * values that may be passed to [method@Gdk.Paintable.snapshot].
     *
     * If the @paintable does not have a preferred width, it returns 0.
     * Negative values are never returned.
     *
     * @return the intrinsic width of @paintable or 0 if none.
     */
    public fun getIntrinsicWidth(): Int = gdk_paintable_get_intrinsic_width(gdkPaintablePointer.reinterpret())

    /**
     * Called by implementations of `GdkPaintable` to invalidate their contents.
     *
     * Unless the contents are invalidated, implementations must guarantee that
     * multiple calls of [method@Gdk.Paintable.snapshot] produce the same output.
     *
     * This function will emit the [signal@Gdk.Paintable::invalidate-contents]
     * signal.
     *
     * If a @paintable reports the %GDK_PAINTABLE_STATIC_CONTENTS flag,
     * it must not call this function.
     */
    public fun invalidateContents(): Unit = gdk_paintable_invalidate_contents(gdkPaintablePointer.reinterpret())

    /**
     * Called by implementations of `GdkPaintable` to invalidate their size.
     *
     * As long as the size is not invalidated, @paintable must return the same
     * values for its intrinsic width, height and aspect ratio.
     *
     * This function will emit the [signal@Gdk.Paintable::invalidate-size]
     * signal.
     *
     * If a @paintable reports the %GDK_PAINTABLE_STATIC_SIZE flag,
     * it must not call this function.
     */
    public fun invalidateSize(): Unit = gdk_paintable_invalidate_size(gdkPaintablePointer.reinterpret())

    /**
     * Snapshots the given paintable with the given @width and @height.
     *
     * The paintable is drawn at the current (0,0) offset of the @snapshot.
     * If @width and @height are not larger than zero, this function will
     * do nothing.
     *
     * @param snapshot a `GdkSnapshot` to snapshot to
     * @param width width to snapshot in
     * @param height height to snapshot in
     */
    public fun snapshot(
        snapshot: Snapshot,
        width: Double,
        height: Double,
    ): Unit =
        gdk_paintable_snapshot(
            gdkPaintablePointer.reinterpret(),
            snapshot.gdkSnapshotPointer.reinterpret(),
            width,
            height
        )

    /**
     * Emitted when the contents of the @paintable change.
     *
     * Examples for such an event would be videos changing to the next frame or
     * the icon theme for an icon changing.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectInvalidateContents(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gdkPaintablePointer.reinterpret(),
            "invalidate-contents",
            connectInvalidateContentsFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when the intrinsic size of the @paintable changes.
     *
     * This means the values reported by at least one of
     * [method@Gdk.Paintable.get_intrinsic_width],
     * [method@Gdk.Paintable.get_intrinsic_height] or
     * [method@Gdk.Paintable.get_intrinsic_aspect_ratio]
     * has changed.
     *
     * Examples for such an event would be a paintable displaying
     * the contents of a toplevel surface being resized.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectInvalidateSize(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gdkPaintablePointer.reinterpret(),
            "invalidate-size",
            connectInvalidateSizeFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    private data class Wrapper(
        private val pointer: CPointer<GdkPaintable>,
    ) : Paintable {
        override val gdkPaintablePointer: CPointer<GdkPaintable> = pointer
    }

    public companion object : TypeCompanion<Paintable> {
        override val type: GeneratedInterfaceKGType<Paintable> =
            GeneratedInterfaceKGType(gdk_paintable_get_type()) { Wrapper(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GdkPaintable>): Paintable = Wrapper(pointer)

        /**
         * Returns a paintable that has the given intrinsic size and draws nothing.
         *
         * This is often useful for implementing the
         * [vfunc@Gdk.Paintable.get_current_image] virtual function
         * when the paintable is in an incomplete state (like a
         * [GtkMediaStream](../gtk4/class.MediaStream.html) before receiving
         * the first frame).
         *
         * @param intrinsicWidth The intrinsic width to report. Can be 0 for no width.
         * @param intrinsicHeight The intrinsic height to report. Can be 0 for no height.
         * @return a `GdkPaintable`
         */
        public fun newEmpty(
            intrinsicWidth: Int,
            intrinsicHeight: Int,
        ): Paintable =
            gdk_paintable_new_empty(intrinsicWidth, intrinsicHeight)!!.run {
                Paintable.wrap(reinterpret())
            }
    }
}

private val connectInvalidateContentsFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

private val connectInvalidateSizeFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()
