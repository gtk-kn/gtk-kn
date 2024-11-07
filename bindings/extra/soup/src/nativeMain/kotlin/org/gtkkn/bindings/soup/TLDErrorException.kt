// This is a generated file. Do not modify.
package org.gtkkn.bindings.soup

import org.gtkkn.bindings.glib.Error
import org.gtkkn.extensions.glib.GlibException

public class TLDErrorException(
    error: Error,
    public val code: TLDError,
) : GlibException(error)
