// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import org.gtkkn.bindings.glib.Error
import org.gtkkn.extensions.glib.GlibException

/**
 * ## Skipped during bindings generation
 *
 * - function `image_surface_create`: C function cairo_image_surface_create is ignored
 * - record `Context`: foreign records are ignored
 * - record `Device`: foreign records are ignored
 * - record `Surface`: foreign records are ignored
 * - record `Matrix`: foreign records are ignored
 * - record `Pattern`: foreign records are ignored
 * - record `Region`: foreign records are ignored
 * - record `FontOptions`: foreign records are ignored
 * - record `FontFace`: foreign records are ignored
 * - record `ScaledFont`: foreign records are ignored
 * - record `Path`: foreign records are ignored
 */
public object Cairo {
    public fun resolveException(error: Error): GlibException {
        val ex =
            when (error.domain) {
                else -> null
            }
        return ex ?: GlibException(error)
    }
}
