// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdkpixbuf

import org.gtkkn.bindings.glib.Error
import org.gtkkn.extensions.glib.GlibException

public class PixbufErrorException(
    error: Error,
    public val code: PixbufError,
) : GlibException(error)
