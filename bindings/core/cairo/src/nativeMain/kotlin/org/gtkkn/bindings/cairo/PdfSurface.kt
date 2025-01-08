// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.cairo.annotations.CairoVersion1_10
import org.gtkkn.bindings.cairo.annotations.CairoVersion1_16
import org.gtkkn.bindings.cairo.annotations.CairoVersion1_18
import org.gtkkn.bindings.cairo.annotations.CairoVersion1_2
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.cairo.cairo_gobject_surface_get_type
import org.gtkkn.native.cairo.cairo_pdf_surface_add_outline
import org.gtkkn.native.cairo.cairo_pdf_surface_create
import org.gtkkn.native.cairo.cairo_pdf_surface_restrict_to_version
import org.gtkkn.native.cairo.cairo_pdf_surface_set_custom_metadata
import org.gtkkn.native.cairo.cairo_pdf_surface_set_metadata
import org.gtkkn.native.cairo.cairo_pdf_surface_set_page_label
import org.gtkkn.native.cairo.cairo_pdf_surface_set_size
import org.gtkkn.native.cairo.cairo_pdf_surface_set_thumbnail_size
import org.gtkkn.native.cairo.cairo_surface_t
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import kotlin.String
import kotlin.Unit

/**
 *
 * @since 1.2
 */
@CairoVersion1_2
public open class PdfSurface(pointer: CPointer<cairo_surface_t>) :
    Surface(pointer.reinterpret()),
    KGTyped {
    public val cairoPdfSurfacePointer: CPointer<cairo_surface_t>
        get() = gPointer.reinterpret()

    /**
     *
     *
     * @param version
     * @since 1.10
     */
    @CairoVersion1_10
    public open fun restrictToVersion(version: PdfVersion): Unit =
        cairo_pdf_surface_restrict_to_version(cairoPdfSurfacePointer, version.nativeValue)

    public open fun setSize(widthInPoints: gdouble, heightInPoints: gdouble): Unit =
        cairo_pdf_surface_set_size(cairoPdfSurfacePointer, widthInPoints, heightInPoints)

    /**
     *
     *
     * @param parentId
     * @param utf8Name
     * @param linkAttribs
     * @param flags
     * @since 1.16
     */
    @CairoVersion1_16
    public open fun addOutline(parentId: gint, utf8Name: String, linkAttribs: String, flags: guint): gint =
        cairo_pdf_surface_add_outline(cairoPdfSurfacePointer, parentId, utf8Name, linkAttribs, flags)

    /**
     *
     *
     * @param metadata
     * @param utf8Value
     * @since 1.16
     */
    @CairoVersion1_16
    public open fun setMetadata(metadata: PdfMetadata, utf8Value: String): Unit =
        cairo_pdf_surface_set_metadata(cairoPdfSurfacePointer, metadata.nativeValue, utf8Value)

    /**
     *
     *
     * @param name
     * @param value
     * @since 1.18
     */
    @CairoVersion1_18
    public open fun setCustomMetadata(name: String, `value`: String): Unit =
        cairo_pdf_surface_set_custom_metadata(cairoPdfSurfacePointer, name, `value`)

    /**
     *
     *
     * @param label
     * @since 1.16
     */
    @CairoVersion1_16
    public open fun setPageLabel(label: String): Unit = cairo_pdf_surface_set_page_label(cairoPdfSurfacePointer, label)

    /**
     *
     *
     * @param width
     * @param height
     * @since 1.16
     */
    @CairoVersion1_16
    public open fun setThumbnailSize(width: gint, height: gint): Unit =
        cairo_pdf_surface_set_thumbnail_size(cairoPdfSurfacePointer, width, height)

    public companion object : TypeCompanion<PdfSurface> {
        override val type: GeneratedClassKGType<PdfSurface> =
            GeneratedClassKGType(cairo_gobject_surface_get_type()) { PdfSurface(it.reinterpret()) }

        init {
            CairoTypeProvider.register()
        }

        public fun create(filename: String?, widthInPoints: gdouble, heightInPoints: gdouble): PdfSurface =
            cairo_pdf_surface_create(filename, widthInPoints, heightInPoints)!!.run {
                PdfSurface(reinterpret())
            }

        /**
         * Get the GType of PDFSurface
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_surface_get_type()
    }
}
