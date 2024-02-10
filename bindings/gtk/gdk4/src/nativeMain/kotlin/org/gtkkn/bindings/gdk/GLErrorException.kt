// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import org.gtkkn.bindings.glib.Error
import org.gtkkn.extensions.glib.GlibException

public class GLErrorException(
    error: Error,
    public val code: GLError,
) : GlibException(error)
