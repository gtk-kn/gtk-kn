// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import org.gtkkn.bindings.glib.Error
import org.gtkkn.extensions.glib.GlibException

public class NetworkErrorException(
    error: Error,
    public val code: NetworkError,
) : GlibException(error)
