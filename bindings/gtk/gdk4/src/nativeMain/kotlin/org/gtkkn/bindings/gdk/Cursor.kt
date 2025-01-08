// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkCursor
import org.gtkkn.native.gdk.gdk_cursor_get_fallback
import org.gtkkn.native.gdk.gdk_cursor_get_hotspot_x
import org.gtkkn.native.gdk.gdk_cursor_get_hotspot_y
import org.gtkkn.native.gdk.gdk_cursor_get_name
import org.gtkkn.native.gdk.gdk_cursor_get_texture
import org.gtkkn.native.gdk.gdk_cursor_get_type
import org.gtkkn.native.gdk.gdk_cursor_new_from_name
import org.gtkkn.native.gdk.gdk_cursor_new_from_texture
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import kotlin.String

/**
 * `GdkCursor` is used to create and destroy cursors.
 *
 * Cursors are immutable objects, so once you created them, there is no way
 * to modify them later. You should create a new cursor when you want to change
 * something about it.
 *
 * Cursors by themselves are not very interesting: they must be bound to a
 * window for users to see them. This is done with [method@Gdk.Surface.set_cursor]
 * or [method@Gdk.Surface.set_device_cursor]. Applications will typically
 * use higher-level GTK functions such as [gtk_widget_set_cursor()](../gtk4/method.Widget.set_cursor.html)
 * instead.
 *
 * Cursors are not bound to a given [class@Gdk.Display], so they can be shared.
 * However, the appearance of cursors may vary when used on different
 * platforms.
 *
 * ## Named and texture cursors
 *
 * There are multiple ways to create cursors. The platform's own cursors
 * can be created with [ctor@Gdk.Cursor.new_from_name]. That function lists
 * the commonly available names that are shared with the CSS specification.
 * Other names may be available, depending on the platform in use. On some
 * platforms, what images are used for named cursors may be influenced by
 * the cursor theme.
 *
 * Another option to create a cursor is to use [ctor@Gdk.Cursor.new_from_texture]
 * and provide an image to use for the cursor.
 *
 * To ease work with unsupported cursors, a fallback cursor can be provided.
 * If a [class@Gdk.Surface] cannot use a cursor because of the reasons mentioned
 * above, it will try the fallback cursor. Fallback cursors can themselves have
 * fallback cursors again, so it is possible to provide a chain of progressively
 * easier to support cursors. If none of the provided cursors can be supported,
 * the default cursor will be the ultimate fallback.
 */
public open class Cursor(pointer: CPointer<GdkCursor>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val gdkCursorPointer: CPointer<GdkCursor>
        get() = gPointer.reinterpret()

    /**
     * Cursor to fall back to if this cursor cannot be displayed.
     */
    public open val fallback: Cursor?
        /**
         * Returns the fallback for this @cursor.
         *
         * The fallback will be used if this cursor is not available on a given
         * `GdkDisplay`. For named cursors, this can happen when using nonstandard
         * names or when using an incomplete cursor theme. For textured cursors,
         * this can happen when the texture is too large or when the `GdkDisplay`
         * it is used on does not support textured cursors.
         *
         * @return the fallback of the cursor or null
         *   to use the default cursor as fallback
         */
        get() = gdk_cursor_get_fallback(gdkCursorPointer)?.run {
            Cursor(this)
        }

    /**
     * X position of the cursor hotspot in the cursor image.
     */
    public open val hotspotX: gint
        /**
         * Returns the horizontal offset of the hotspot.
         *
         * The hotspot indicates the pixel that will be directly above the cursor.
         *
         * Note that named cursors may have a nonzero hotspot, but this function
         * will only return the hotspot position for cursors created with
         * [ctor@Gdk.Cursor.new_from_texture].
         *
         * @return the horizontal offset of the hotspot or 0 for named cursors
         */
        get() = gdk_cursor_get_hotspot_x(gdkCursorPointer)

    /**
     * Y position of the cursor hotspot in the cursor image.
     */
    public open val hotspotY: gint
        /**
         * Returns the vertical offset of the hotspot.
         *
         * The hotspot indicates the pixel that will be directly above the cursor.
         *
         * Note that named cursors may have a nonzero hotspot, but this function
         * will only return the hotspot position for cursors created with
         * [ctor@Gdk.Cursor.new_from_texture].
         *
         * @return the vertical offset of the hotspot or 0 for named cursors
         */
        get() = gdk_cursor_get_hotspot_y(gdkCursorPointer)

    /**
     * Name of this this cursor.
     *
     * The name will be null if the cursor was created from a texture.
     */
    public open val name: String?
        /**
         * Returns the name of the cursor.
         *
         * If the cursor is not a named cursor, null will be returned.
         *
         * @return the name of the cursor or null
         *   if it is not a named cursor
         */
        get() = gdk_cursor_get_name(gdkCursorPointer)?.toKString()

    /**
     * The texture displayed by this cursor.
     *
     * The texture will be null if the cursor was created from a name.
     */
    public open val texture: Texture?
        /**
         * Returns the texture for the cursor.
         *
         * If the cursor is a named cursor, null will be returned.
         *
         * @return the texture for cursor or null
         *   if it is a named cursor
         */
        get() = gdk_cursor_get_texture(gdkCursorPointer)?.run {
            Texture(this)
        }

    /**
     * Creates a new cursor by looking up @name in the current cursor
     * theme.
     *
     * A recommended set of cursor names that will work across different
     * platforms can be found in the CSS specification:
     *
     * | | | | |
     * | --- | --- | ---- | --- |
     * | "none" | ![](default_cursor.png) "default" | ![](help_cursor.png) "help" | ![](pointer_cursor.png) "pointer" |
     * | ![](context_menu_cursor.png) "context-menu" | ![](progress_cursor.png) "progress" | ![](wait_cursor.png) "wait" | ![](cell_cursor.png) "cell" |
     * | ![](crosshair_cursor.png) "crosshair" | ![](text_cursor.png) "text" | ![](vertical_text_cursor.png) "vertical-text" | ![](alias_cursor.png) "alias" |
     * | ![](copy_cursor.png) "copy" | ![](no_drop_cursor.png) "no-drop" | ![](move_cursor.png) "move" | ![](not_allowed_cursor.png) "not-allowed" |
     * | ![](grab_cursor.png) "grab" | ![](grabbing_cursor.png) "grabbing" | ![](all_scroll_cursor.png) "all-scroll" | ![](col_resize_cursor.png) "col-resize" |
     * | ![](row_resize_cursor.png) "row-resize" | ![](n_resize_cursor.png) "n-resize" | ![](e_resize_cursor.png) "e-resize" | ![](s_resize_cursor.png) "s-resize" |
     * | ![](w_resize_cursor.png) "w-resize" | ![](ne_resize_cursor.png) "ne-resize" | ![](nw_resize_cursor.png) "nw-resize" | ![](sw_resize_cursor.png) "sw-resize" |
     * | ![](se_resize_cursor.png) "se-resize" | ![](ew_resize_cursor.png) "ew-resize" | ![](ns_resize_cursor.png) "ns-resize" | ![](nesw_resize_cursor.png) "nesw-resize" |
     * | ![](nwse_resize_cursor.png) "nwse-resize" | ![](zoom_in_cursor.png) "zoom-in" | ![](zoom_out_cursor.png) "zoom-out" | |
     *
     * @param name the name of the cursor
     * @param fallback null or the `GdkCursor` to fall back to when
     *   this one cannot be supported
     * @return a new `GdkCursor`, or null if there is no
     *   cursor with the given name
     */
    public constructor(
        name: String,
        fallback: Cursor? = null,
    ) : this(gdk_cursor_new_from_name(name, fallback?.gdkCursorPointer)!!.reinterpret())

    /**
     * Creates a new cursor from a `GdkTexture`.
     *
     * @param texture the texture providing the pixel data
     * @param hotspotX the horizontal offset of the “hotspot” of the cursor
     * @param hotspotY the vertical offset of the “hotspot” of the cursor
     * @param fallback the `GdkCursor` to fall back to when
     *   this one cannot be supported
     * @return a new `GdkCursor`
     */
    public constructor(
        texture: Texture,
        hotspotX: gint,
        hotspotY: gint,
        fallback: Cursor? = null,
    ) : this(
        gdk_cursor_new_from_texture(
            texture.gdkTexturePointer,
            hotspotX,
            hotspotY,
            fallback?.gdkCursorPointer
        )!!.reinterpret()
    )

    public companion object : TypeCompanion<Cursor> {
        override val type: GeneratedClassKGType<Cursor> =
            GeneratedClassKGType(gdk_cursor_get_type()) { Cursor(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }

        /**
         * Get the GType of Cursor
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_cursor_get_type()
    }
}
