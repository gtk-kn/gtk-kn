// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gdk.Paintable
import org.gtkkn.bindings.gdkpixbuf.Pixbuf
import org.gtkkn.bindings.gio.File
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_8
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkPicture
import org.gtkkn.native.gtk.gtk_picture_get_alternative_text
import org.gtkkn.native.gtk.gtk_picture_get_can_shrink
import org.gtkkn.native.gtk.gtk_picture_get_content_fit
import org.gtkkn.native.gtk.gtk_picture_get_file
import org.gtkkn.native.gtk.gtk_picture_get_keep_aspect_ratio
import org.gtkkn.native.gtk.gtk_picture_get_paintable
import org.gtkkn.native.gtk.gtk_picture_get_type
import org.gtkkn.native.gtk.gtk_picture_new
import org.gtkkn.native.gtk.gtk_picture_new_for_file
import org.gtkkn.native.gtk.gtk_picture_new_for_filename
import org.gtkkn.native.gtk.gtk_picture_new_for_paintable
import org.gtkkn.native.gtk.gtk_picture_new_for_pixbuf
import org.gtkkn.native.gtk.gtk_picture_new_for_resource
import org.gtkkn.native.gtk.gtk_picture_set_alternative_text
import org.gtkkn.native.gtk.gtk_picture_set_can_shrink
import org.gtkkn.native.gtk.gtk_picture_set_content_fit
import org.gtkkn.native.gtk.gtk_picture_set_file
import org.gtkkn.native.gtk.gtk_picture_set_filename
import org.gtkkn.native.gtk.gtk_picture_set_keep_aspect_ratio
import org.gtkkn.native.gtk.gtk_picture_set_paintable
import org.gtkkn.native.gtk.gtk_picture_set_pixbuf
import org.gtkkn.native.gtk.gtk_picture_set_resource
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * The `GtkPicture` widget displays a `GdkPaintable`.
 *
 * ![An example GtkPicture](picture.png)
 *
 * Many convenience functions are provided to make pictures simple to use.
 * For example, if you want to load an image from a file, and then display
 * it, there’s a convenience function to do this:
 *
 * ```c
 * GtkWidget *widget = gtk_picture_new_for_filename ("myfile.png");
 * ```
 *
 * If the file isn’t loaded successfully, the picture will contain a
 * “broken image” icon similar to that used in many web browsers.
 * If you want to handle errors in loading the file yourself,
 * for example by displaying an error message, then load the image with
 * [ctor@Gdk.Texture.new_from_file], then create the `GtkPicture` with
 * [ctor@Gtk.Picture.new_for_paintable].
 *
 * Sometimes an application will want to avoid depending on external data
 * files, such as image files. See the documentation of `GResource` for details.
 * In this case, [ctor@Gtk.Picture.new_for_resource] and
 * [method@Gtk.Picture.set_resource] should be used.
 *
 * `GtkPicture` displays an image at its natural size. See [class@Gtk.Image]
 * if you want to display a fixed-size image, such as an icon.
 *
 * ## Sizing the paintable
 *
 * You can influence how the paintable is displayed inside the `GtkPicture`
 * by changing [property@Gtk.Picture:content-fit]. See [enum@Gtk.ContentFit]
 * for details. [property@Gtk.Picture:can-shrink] can be unset to make sure
 * that paintables are never made smaller than their ideal size - but
 * be careful if you do not know the size of the paintable in use (like
 * when displaying user-loaded images). This can easily cause the picture to
 * grow larger than the screen. And [property@Gtk.Widget:halign] and
 * [property@Gtk.Widget:valign] can be used to make sure the paintable doesn't
 * fill all available space but is instead displayed at its original size.
 *
 * ## CSS nodes
 *
 * `GtkPicture` has a single CSS node with the name `picture`.
 *
 * ## Accessibility
 *
 * `GtkPicture` uses the `GTK_ACCESSIBLE_ROLE_IMG` role.
 */
public open class Picture(
    pointer: CPointer<GtkPicture>,
) : Widget(pointer.reinterpret()),
    KGTyped {
    public val gtkPicturePointer: CPointer<GtkPicture>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * The alternative textual description for the picture.
     */
    public open var alternativeText: String?
        /**
         * Gets the alternative textual description of the picture.
         *
         * The returned string will be null if the picture cannot be described textually.
         *
         * @return the alternative textual description of @self.
         */
        get() = gtk_picture_get_alternative_text(gtkPicturePointer.reinterpret())?.toKString()

        /**
         * Sets an alternative textual description for the picture contents.
         *
         * It is equivalent to the "alt" attribute for images on websites.
         *
         * This text will be made available to accessibility tools.
         *
         * If the picture cannot be described textually, set this property to null.
         *
         * @param alternativeText a textual description of the contents
         */
        set(alternativeText) = gtk_picture_set_alternative_text(gtkPicturePointer.reinterpret(), alternativeText)

    /**
     * If the `GtkPicture` can be made smaller than the natural size of its contents.
     */
    public open var canShrink: Boolean
        /**
         * Returns whether the `GtkPicture` respects its contents size.
         *
         * @return true if the picture can be made smaller than its contents
         */
        get() = gtk_picture_get_can_shrink(gtkPicturePointer.reinterpret()).asBoolean()

        /**
         * If set to true, the @self can be made smaller than its contents.
         *
         * The contents will then be scaled down when rendering.
         *
         * If you want to still force a minimum size manually, consider using
         * [method@Gtk.Widget.set_size_request].
         *
         * Also of note is that a similar function for growing does not exist
         * because the grow behavior can be controlled via
         * [method@Gtk.Widget.set_halign] and [method@Gtk.Widget.set_valign].
         *
         * @param canShrink if @self can be made smaller than its contents
         */
        set(canShrink) = gtk_picture_set_can_shrink(gtkPicturePointer.reinterpret(), canShrink.asGBoolean())

    /**
     * How the content should be resized to fit inside the `GtkPicture`.
     *
     * @since 4.8
     */
    @GtkVersion4_8
    public open var contentFit: ContentFit
        /**
         * Returns the fit mode for the content of the `GtkPicture`.
         *
         * See [enum@Gtk.ContentFit] for details.
         *
         * @return the content fit mode
         * @since 4.8
         */
        get() =
            gtk_picture_get_content_fit(gtkPicturePointer.reinterpret()).run {
                ContentFit.fromNativeValue(this)
            }

        /**
         * Sets how the content should be resized to fit the `GtkPicture`.
         *
         * See [enum@Gtk.ContentFit] for details.
         *
         * @param contentFit the content fit mode
         * @since 4.8
         */
        @GtkVersion4_8
        set(contentFit) = gtk_picture_set_content_fit(gtkPicturePointer.reinterpret(), contentFit.nativeValue)

    /**
     * The `GFile` that is displayed or null if none.
     */
    public open var `file`: File?
        /**
         * Gets the `GFile` currently displayed if @self is displaying a file.
         *
         * If @self is not displaying a file, for example when
         * [method@Gtk.Picture.set_paintable] was used, then null is returned.
         *
         * @return The `GFile` displayed by @self.
         */
        get() =
            gtk_picture_get_file(gtkPicturePointer.reinterpret())?.run {
                File.wrap(reinterpret())
            }

        /**
         * Makes @self load and display @file.
         *
         * See [ctor@Gtk.Picture.new_for_file] for details.
         *
         * @param file a `GFile`
         */
        set(`file`) = gtk_picture_set_file(gtkPicturePointer.reinterpret(), `file`?.gioFilePointer)

    /**
     * Whether the GtkPicture will render its contents trying to preserve the aspect
     * ratio.
     */
    public open var keepAspectRatio: Boolean
        /**
         * Returns whether the `GtkPicture` preserves its contents aspect ratio.
         *
         * @return true if the self tries to keep the contents' aspect ratio
         */
        get() = gtk_picture_get_keep_aspect_ratio(gtkPicturePointer.reinterpret()).asBoolean()

        /**
         * If set to true, the @self will render its contents according to
         * their aspect ratio.
         *
         * That means that empty space may show up at the top/bottom or
         * left/right of @self.
         *
         * If set to false or if the contents provide no aspect ratio,
         * the contents will be stretched over the picture's whole area.
         *
         * @param keepAspectRatio whether to keep aspect ratio
         */
        set(
            keepAspectRatio
        ) = gtk_picture_set_keep_aspect_ratio(gtkPicturePointer.reinterpret(), keepAspectRatio.asGBoolean())

    /**
     * The `GdkPaintable` to be displayed by this `GtkPicture`.
     */
    public open var paintable: Paintable?
        /**
         * Gets the `GdkPaintable` being displayed by the `GtkPicture`.
         *
         * @return the displayed paintable
         */
        get() =
            gtk_picture_get_paintable(gtkPicturePointer.reinterpret())?.run {
                Paintable.wrap(reinterpret())
            }

        /**
         * Makes @self display the given @paintable.
         *
         * If @paintable is null, nothing will be displayed.
         *
         * See [ctor@Gtk.Picture.new_for_paintable] for details.
         *
         * @param paintable a `GdkPaintable`
         */
        set(paintable) = gtk_picture_set_paintable(gtkPicturePointer.reinterpret(), paintable?.gdkPaintablePointer)

    /**
     * Creates a new empty `GtkPicture` widget.
     *
     * @return a newly created `GtkPicture` widget.
     */
    public constructor() : this(gtk_picture_new()!!.reinterpret())

    /**
     * Creates a new `GtkPicture` displaying the given @file.
     *
     * If the file isn’t found or can’t be loaded, the resulting
     * `GtkPicture` is empty.
     *
     * If you need to detect failures to load the file, use
     * [ctor@Gdk.Texture.new_from_file] to load the file yourself,
     * then create the `GtkPicture` from the texture.
     *
     * @param file a `GFile`
     * @return a new `GtkPicture`
     */
    public constructor(`file`: File? = null) : this(gtk_picture_new_for_file(`file`?.gioFilePointer)!!.reinterpret())

    /**
     * Creates a new `GtkPicture` displaying the file @filename.
     *
     * This is a utility function that calls [ctor@Gtk.Picture.new_for_file].
     * See that function for details.
     *
     * @param filename a filename
     * @return a new `GtkPicture`
     */
    public constructor(filename: String? = null) : this(gtk_picture_new_for_filename(filename)!!.reinterpret())

    /**
     * Creates a new `GtkPicture` displaying @paintable.
     *
     * The `GtkPicture` will track changes to the @paintable and update
     * its size and contents in response to it.
     *
     * @param paintable a `GdkPaintable`
     * @return a new `GtkPicture`
     */
    public constructor(
        paintable: Paintable? = null,
    ) : this(gtk_picture_new_for_paintable(paintable?.gdkPaintablePointer)!!.reinterpret())

    /**
     * Creates a new `GtkPicture` displaying @pixbuf.
     *
     * This is a utility function that calls [ctor@Gtk.Picture.new_for_paintable],
     * See that function for details.
     *
     * The pixbuf must not be modified after passing it to this function.
     *
     * @param pixbuf a `GdkPixbuf`
     * @return a new `GtkPicture`
     */
    public constructor(
        pixbuf: Pixbuf? = null,
    ) : this(gtk_picture_new_for_pixbuf(pixbuf?.gdkpixbufPixbufPointer?.reinterpret())!!.reinterpret())

    /**
     * Gets the alternative textual description of the picture.
     *
     * The returned string will be null if the picture cannot be described textually.
     *
     * @return the alternative textual description of @self.
     */
    public open fun getAlternativeText(): String? =
        gtk_picture_get_alternative_text(gtkPicturePointer.reinterpret())?.toKString()

    /**
     * Returns whether the `GtkPicture` respects its contents size.
     *
     * @return true if the picture can be made smaller than its contents
     */
    public open fun getCanShrink(): Boolean = gtk_picture_get_can_shrink(gtkPicturePointer.reinterpret()).asBoolean()

    /**
     * Returns the fit mode for the content of the `GtkPicture`.
     *
     * See [enum@Gtk.ContentFit] for details.
     *
     * @return the content fit mode
     * @since 4.8
     */
    @GtkVersion4_8
    public open fun getContentFit(): ContentFit =
        gtk_picture_get_content_fit(gtkPicturePointer.reinterpret()).run {
            ContentFit.fromNativeValue(this)
        }

    /**
     * Gets the `GFile` currently displayed if @self is displaying a file.
     *
     * If @self is not displaying a file, for example when
     * [method@Gtk.Picture.set_paintable] was used, then null is returned.
     *
     * @return The `GFile` displayed by @self.
     */
    public open fun getFile(): File? =
        gtk_picture_get_file(gtkPicturePointer.reinterpret())?.run {
            File.wrap(reinterpret())
        }

    /**
     * Returns whether the `GtkPicture` preserves its contents aspect ratio.
     *
     * @return true if the self tries to keep the contents' aspect ratio
     */
    public open fun getKeepAspectRatio(): Boolean =
        gtk_picture_get_keep_aspect_ratio(gtkPicturePointer.reinterpret()).asBoolean()

    /**
     * Gets the `GdkPaintable` being displayed by the `GtkPicture`.
     *
     * @return the displayed paintable
     */
    public open fun getPaintable(): Paintable? =
        gtk_picture_get_paintable(gtkPicturePointer.reinterpret())?.run {
            Paintable.wrap(reinterpret())
        }

    /**
     * Sets an alternative textual description for the picture contents.
     *
     * It is equivalent to the "alt" attribute for images on websites.
     *
     * This text will be made available to accessibility tools.
     *
     * If the picture cannot be described textually, set this property to null.
     *
     * @param alternativeText a textual description of the contents
     */
    public open fun setAlternativeText(alternativeText: String? = null): Unit =
        gtk_picture_set_alternative_text(gtkPicturePointer.reinterpret(), alternativeText)

    /**
     * If set to true, the @self can be made smaller than its contents.
     *
     * The contents will then be scaled down when rendering.
     *
     * If you want to still force a minimum size manually, consider using
     * [method@Gtk.Widget.set_size_request].
     *
     * Also of note is that a similar function for growing does not exist
     * because the grow behavior can be controlled via
     * [method@Gtk.Widget.set_halign] and [method@Gtk.Widget.set_valign].
     *
     * @param canShrink if @self can be made smaller than its contents
     */
    public open fun setCanShrink(canShrink: Boolean): Unit =
        gtk_picture_set_can_shrink(gtkPicturePointer.reinterpret(), canShrink.asGBoolean())

    /**
     * Sets how the content should be resized to fit the `GtkPicture`.
     *
     * See [enum@Gtk.ContentFit] for details.
     *
     * @param contentFit the content fit mode
     * @since 4.8
     */
    @GtkVersion4_8
    public open fun setContentFit(contentFit: ContentFit): Unit =
        gtk_picture_set_content_fit(gtkPicturePointer.reinterpret(), contentFit.nativeValue)

    /**
     * Makes @self load and display @file.
     *
     * See [ctor@Gtk.Picture.new_for_file] for details.
     *
     * @param file a `GFile`
     */
    public open fun setFile(`file`: File? = null): Unit =
        gtk_picture_set_file(gtkPicturePointer.reinterpret(), `file`?.gioFilePointer)

    /**
     * Makes @self load and display the given @filename.
     *
     * This is a utility function that calls [method@Gtk.Picture.set_file].
     *
     * @param filename the filename to play
     */
    public open fun setFilename(filename: String? = null): Unit =
        gtk_picture_set_filename(gtkPicturePointer.reinterpret(), filename)

    /**
     * If set to true, the @self will render its contents according to
     * their aspect ratio.
     *
     * That means that empty space may show up at the top/bottom or
     * left/right of @self.
     *
     * If set to false or if the contents provide no aspect ratio,
     * the contents will be stretched over the picture's whole area.
     *
     * @param keepAspectRatio whether to keep aspect ratio
     */
    public open fun setKeepAspectRatio(keepAspectRatio: Boolean): Unit =
        gtk_picture_set_keep_aspect_ratio(gtkPicturePointer.reinterpret(), keepAspectRatio.asGBoolean())

    /**
     * Makes @self display the given @paintable.
     *
     * If @paintable is null, nothing will be displayed.
     *
     * See [ctor@Gtk.Picture.new_for_paintable] for details.
     *
     * @param paintable a `GdkPaintable`
     */
    public open fun setPaintable(paintable: Paintable? = null): Unit =
        gtk_picture_set_paintable(gtkPicturePointer.reinterpret(), paintable?.gdkPaintablePointer)

    /**
     * Sets a `GtkPicture` to show a `GdkPixbuf`.
     *
     * See [ctor@Gtk.Picture.new_for_pixbuf] for details.
     *
     * This is a utility function that calls [method@Gtk.Picture.set_paintable].
     *
     * @param pixbuf a `GdkPixbuf`
     */
    public open fun setPixbuf(pixbuf: Pixbuf? = null): Unit =
        gtk_picture_set_pixbuf(gtkPicturePointer.reinterpret(), pixbuf?.gdkpixbufPixbufPointer?.reinterpret())

    /**
     * Makes @self load and display the resource at the given
     * @resource_path.
     *
     * This is a utility function that calls [method@Gtk.Picture.set_file].
     *
     * @param resourcePath the resource to set
     */
    public open fun setResource(resourcePath: String? = null): Unit =
        gtk_picture_set_resource(gtkPicturePointer.reinterpret(), resourcePath)

    public companion object : TypeCompanion<Picture> {
        override val type: GeneratedClassKGType<Picture> =
            GeneratedClassKGType(gtk_picture_get_type()) { Picture(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Creates a new `GtkPicture` displaying the file @filename.
         *
         * This is a utility function that calls [ctor@Gtk.Picture.new_for_file].
         * See that function for details.
         *
         * @param filename a filename
         * @return a new `GtkPicture`
         */
        public fun newForFilename(filename: String? = null): Picture =
            Picture(gtk_picture_new_for_filename(filename)!!.reinterpret())

        /**
         * Creates a new `GtkPicture` displaying the resource at @resource_path.
         *
         * This is a utility function that calls [ctor@Gtk.Picture.new_for_file].
         * See that function for details.
         *
         * @param resourcePath resource path to play back
         * @return a new `GtkPicture`
         */
        public fun newForResource(resourcePath: String? = null): Picture =
            Picture(gtk_picture_new_for_resource(resourcePath)!!.reinterpret())
    }
}
