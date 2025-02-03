// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gdk.Paintable
import org.gtkkn.bindings.gdk.Pixbuf
import org.gtkkn.bindings.gio.Icon
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkImage
import org.gtkkn.native.gtk.gtk_image_clear
import org.gtkkn.native.gtk.gtk_image_get_gicon
import org.gtkkn.native.gtk.gtk_image_get_icon_name
import org.gtkkn.native.gtk.gtk_image_get_icon_size
import org.gtkkn.native.gtk.gtk_image_get_paintable
import org.gtkkn.native.gtk.gtk_image_get_pixel_size
import org.gtkkn.native.gtk.gtk_image_get_storage_type
import org.gtkkn.native.gtk.gtk_image_get_type
import org.gtkkn.native.gtk.gtk_image_new
import org.gtkkn.native.gtk.gtk_image_new_from_file
import org.gtkkn.native.gtk.gtk_image_new_from_gicon
import org.gtkkn.native.gtk.gtk_image_new_from_icon_name
import org.gtkkn.native.gtk.gtk_image_new_from_paintable
import org.gtkkn.native.gtk.gtk_image_new_from_pixbuf
import org.gtkkn.native.gtk.gtk_image_new_from_resource
import org.gtkkn.native.gtk.gtk_image_set_from_file
import org.gtkkn.native.gtk.gtk_image_set_from_gicon
import org.gtkkn.native.gtk.gtk_image_set_from_icon_name
import org.gtkkn.native.gtk.gtk_image_set_from_paintable
import org.gtkkn.native.gtk.gtk_image_set_from_pixbuf
import org.gtkkn.native.gtk.gtk_image_set_from_resource
import org.gtkkn.native.gtk.gtk_image_set_icon_size
import org.gtkkn.native.gtk.gtk_image_set_pixel_size
import kotlin.String
import kotlin.Unit

/**
 * The `GtkImage` widget displays an image.
 *
 * ![An example GtkImage](image.png)
 *
 * Various kinds of object can be displayed as an image; most typically,
 * you would load a `GdkTexture` from a file, using the convenience function
 * [ctor@Gtk.Image.new_from_file], for instance:
 *
 * ```c
 * GtkWidget *image = gtk_image_new_from_file ("myfile.png");
 * ```
 *
 * If the file isn’t loaded successfully, the image will contain a
 * “broken image” icon similar to that used in many web browsers.
 *
 * If you want to handle errors in loading the file yourself,
 * for example by displaying an error message, then load the image with
 * [ctor@Gdk.Texture.new_from_file], then create the `GtkImage` with
 * [ctor@Gtk.Image.new_from_paintable].
 *
 * Sometimes an application will want to avoid depending on external data
 * files, such as image files. See the documentation of `GResource` inside
 * GIO, for details. In this case, [property@Gtk.Image:resource],
 * [ctor@Gtk.Image.new_from_resource], and [method@Gtk.Image.set_from_resource]
 * should be used.
 *
 * `GtkImage` displays its image as an icon, with a size that is determined
 * by the application. See [class@Gtk.Picture] if you want to show an image
 * at is actual size.
 *
 * ## CSS nodes
 *
 * `GtkImage` has a single CSS node with the name `image`. The style classes
 * `.normal-icons` or `.large-icons` may appear, depending on the
 * [property@Gtk.Image:icon-size] property.
 *
 * ## Accessibility
 *
 * `GtkImage` uses the `GTK_ACCESSIBLE_ROLE_IMG` role.
 *
 * ## Skipped during bindings generation
 *
 * - method `file`: Property has no getter nor setter
 * - method `resource`: Property has no getter nor setter
 * - method `use-fallback`: Property has no getter nor setter
 */
public open class Image(public val gtkImagePointer: CPointer<GtkImage>) :
    Widget(gtkImagePointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * The `GIcon` displayed in the GtkImage.
     *
     * For themed icons, If the icon theme is changed, the image will be updated
     * automatically.
     */
    public open val gicon: Icon?
        /**
         * Gets the `GIcon` being displayed by the `GtkImage`.
         *
         * The storage type of the image must be %GTK_IMAGE_EMPTY or
         * %GTK_IMAGE_GICON (see [method@Gtk.Image.get_storage_type]).
         * The caller of this function does not own a reference to the
         * returned `GIcon`.
         *
         * @return a `GIcon`
         */
        get() = gtk_image_get_gicon(gtkImagePointer)?.run {
            Icon.IconImpl(reinterpret())
        }

    /**
     * The name of the icon in the icon theme.
     *
     * If the icon theme is changed, the image will be updated automatically.
     */
    public open val iconName: String?
        /**
         * Gets the icon name and size being displayed by the `GtkImage`.
         *
         * The storage type of the image must be %GTK_IMAGE_EMPTY or
         * %GTK_IMAGE_ICON_NAME (see [method@Gtk.Image.get_storage_type]).
         * The returned string is owned by the `GtkImage` and should not
         * be freed.
         *
         * @return the icon name
         */
        get() = gtk_image_get_icon_name(gtkImagePointer)?.toKString()

    /**
     * The symbolic size to display icons at.
     */
    public open var iconSize: IconSize
        /**
         * Gets the icon size used by the @image when rendering icons.
         *
         * @return the image size used by icons
         */
        get() = gtk_image_get_icon_size(gtkImagePointer).run {
            IconSize.fromNativeValue(this)
        }

        /**
         * Suggests an icon size to the theme for named icons.
         *
         * @param iconSize the new icon size
         */
        set(iconSize) = gtk_image_set_icon_size(gtkImagePointer, iconSize.nativeValue)

    /**
     * The `GdkPaintable` to display.
     */
    public open val paintable: Paintable?
        /**
         * Gets the image `GdkPaintable` being displayed by the `GtkImage`.
         *
         * The storage type of the image must be %GTK_IMAGE_EMPTY or
         * %GTK_IMAGE_PAINTABLE (see [method@Gtk.Image.get_storage_type]).
         * The caller of this function does not own a reference to the
         * returned paintable.
         *
         * @return the displayed paintable
         */
        get() = gtk_image_get_paintable(gtkImagePointer)?.run {
            Paintable.PaintableImpl(reinterpret())
        }

    /**
     * The size in pixels to display icons at.
     *
     * If set to a value != -1, this property overrides the
     * [property@Gtk.Image:icon-size] property for images of type
     * `GTK_IMAGE_ICON_NAME`.
     */
    public open var pixelSize: gint
        /**
         * Gets the pixel size used for named icons.
         *
         * @return the pixel size used for named icons.
         */
        get() = gtk_image_get_pixel_size(gtkImagePointer)

        /**
         * Sets the pixel size to use for named icons.
         *
         * If the pixel size is set to a value != -1, it is used instead
         * of the icon size set by [method@Gtk.Image.set_from_icon_name].
         *
         * @param pixelSize the new pixel size
         */
        set(pixelSize) = gtk_image_set_pixel_size(gtkImagePointer, pixelSize)

    /**
     * The representation being used for image data.
     */
    public open val storageType: ImageType
        /**
         * Gets the type of representation being used by the `GtkImage`
         * to store image data.
         *
         * If the `GtkImage` has no image data, the return value will
         * be %GTK_IMAGE_EMPTY.
         *
         * @return image representation being used
         */
        get() = gtk_image_get_storage_type(gtkImagePointer).run {
            ImageType.fromNativeValue(this)
        }

    /**
     * Creates a new empty `GtkImage` widget.
     *
     * @return a newly created `GtkImage` widget.
     */
    public constructor() : this(gtk_image_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * Creates a new `GtkImage` displaying the file @filename.
     *
     * If the file isn’t found or can’t be loaded, the resulting `GtkImage`
     * will display a “broken image” icon. This function never returns null,
     * it always returns a valid `GtkImage` widget.
     *
     * If you need to detect failures to load the file, use
     * [ctor@Gdk.Texture.new_from_file] to load the file yourself,
     * then create the `GtkImage` from the texture.
     *
     * The storage type (see [method@Gtk.Image.get_storage_type])
     * of the returned image is not defined, it will be whatever
     * is appropriate for displaying the file.
     *
     * @param filename a filename
     * @return a new `GtkImage`
     */
    public constructor(filename: String) : this(gtk_image_new_from_file(filename)!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * Creates a `GtkImage` displaying an icon from the current icon theme.
     *
     * If the icon name isn’t known, a “broken image” icon will be
     * displayed instead. If the current icon theme is changed, the icon
     * will be updated appropriately.
     *
     * @param icon an icon
     * @return a new `GtkImage` displaying the themed icon
     */
    public constructor(icon: Icon) : this(gtk_image_new_from_gicon(icon.gioIconPointer)!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * Creates a `GtkImage` displaying an icon from the current icon theme.
     *
     * If the icon name isn’t known, a “broken image” icon will be
     * displayed instead. If the current icon theme is changed, the icon
     * will be updated appropriately.
     *
     * @param iconName an icon name
     * @return a new `GtkImage` displaying the themed icon
     */
    public constructor(iconName: String? = null) : this(gtk_image_new_from_icon_name(iconName)!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * Creates a new `GtkImage` displaying @paintable.
     *
     * The `GtkImage` does not assume a reference to the paintable; you still
     * need to unref it if you own references. `GtkImage` will add its own
     * reference rather than adopting yours.
     *
     * The `GtkImage` will track changes to the @paintable and update
     * its size and contents in response to it.
     *
     * @param paintable a `GdkPaintable`
     * @return a new `GtkImage`
     */
    public constructor(
        paintable: Paintable? = null,
    ) : this(gtk_image_new_from_paintable(paintable?.gdkPaintablePointer)!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.12.
     *
     * Use [ctor@Gtk.Image.new_from_paintable] and
     *   [ctor@Gdk.Texture.new_for_pixbuf] instead
     * ---
     *
     * Creates a new `GtkImage` displaying @pixbuf.
     *
     * The `GtkImage` does not assume a reference to the pixbuf; you still
     * need to unref it if you own references. `GtkImage` will add its own
     * reference rather than adopting yours.
     *
     * This is a helper for [ctor@Gtk.Image.new_from_paintable], and you can't
     * get back the exact pixbuf once this is called, only a texture.
     *
     * Note that this function just creates an `GtkImage` from the pixbuf.
     * The `GtkImage` created will not react to state changes. Should you
     * want that, you should use [ctor@Gtk.Image.new_from_icon_name].
     *
     * @param pixbuf a `GdkPixbuf`
     * @return a new `GtkImage`
     */
    public constructor(
        pixbuf: Pixbuf? = null,
    ) : this(gtk_image_new_from_pixbuf(pixbuf?.gdkPixbufPointer)!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * Resets the image to be empty.
     */
    public open fun clear(): Unit = gtk_image_clear(gtkImagePointer)

    /**
     * Sets a `GtkImage` to show a file.
     *
     * See [ctor@Gtk.Image.new_from_file] for details.
     *
     * @param filename a filename
     */
    public open fun setFromFile(filename: String? = null): Unit = gtk_image_set_from_file(gtkImagePointer, filename)

    /**
     * Sets a `GtkImage` to show a `GIcon`.
     *
     * See [ctor@Gtk.Image.new_from_gicon] for details.
     *
     * @param icon an icon
     */
    public open fun setFromGicon(icon: Icon): Unit = gtk_image_set_from_gicon(gtkImagePointer, icon.gioIconPointer)

    /**
     * Sets a `GtkImage` to show a named icon.
     *
     * See [ctor@Gtk.Image.new_from_icon_name] for details.
     *
     * @param iconName an icon name
     */
    public open fun setFromIconName(iconName: String? = null): Unit =
        gtk_image_set_from_icon_name(gtkImagePointer, iconName)

    /**
     * Sets a `GtkImage` to show a `GdkPaintable`.
     *
     * See [ctor@Gtk.Image.new_from_paintable] for details.
     *
     * @param paintable a `GdkPaintable`
     */
    public open fun setFromPaintable(paintable: Paintable? = null): Unit =
        gtk_image_set_from_paintable(gtkImagePointer, paintable?.gdkPaintablePointer)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.12.
     *
     * Use [method@Gtk.Image.set_from_paintable] instead
     * ---
     *
     * Sets a `GtkImage` to show a `GdkPixbuf`.
     *
     * See [ctor@Gtk.Image.new_from_pixbuf] for details.
     *
     * Note: This is a helper for [method@Gtk.Image.set_from_paintable],
     * and you can't get back the exact pixbuf once this is called,
     * only a paintable.
     *
     * @param pixbuf a `GdkPixbuf` or `NULL`
     */
    public open fun setFromPixbuf(pixbuf: Pixbuf? = null): Unit =
        gtk_image_set_from_pixbuf(gtkImagePointer, pixbuf?.gdkPixbufPointer)

    /**
     * Sets a `GtkImage` to show a resource.
     *
     * See [ctor@Gtk.Image.new_from_resource] for details.
     *
     * @param resourcePath a resource path
     */
    public open fun setFromResource(resourcePath: String? = null): Unit =
        gtk_image_set_from_resource(gtkImagePointer, resourcePath)

    public companion object : TypeCompanion<Image> {
        override val type: GeneratedClassKGType<Image> =
            GeneratedClassKGType(getTypeOrNull()!!) { Image(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of Image
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_image_get_type()

        /**
         * Gets the GType of from the symbol `gtk_image_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? = org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_image_get_type")

        /**
         * Creates a new `GtkImage` displaying the resource file @resource_path.
         *
         * If the file isn’t found or can’t be loaded, the resulting `GtkImage` will
         * display a “broken image” icon. This function never returns null,
         * it always returns a valid `GtkImage` widget.
         *
         * If you need to detect failures to load the file, use
         * [ctor@GdkPixbuf.Pixbuf.new_from_file] to load the file yourself,
         * then create the `GtkImage` from the pixbuf.
         *
         * The storage type (see [method@Gtk.Image.get_storage_type]) of
         * the returned image is not defined, it will be whatever is
         * appropriate for displaying the file.
         *
         * @param resourcePath a resource path
         * @return a new `GtkImage`
         */
        public fun fromResource(resourcePath: String): Image =
            Image(gtk_image_new_from_resource(resourcePath)!!.reinterpret()).apply {
                InstanceCache.put(this)
            }
    }
}
