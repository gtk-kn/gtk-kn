// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.glib.Error
import org.gtkkn.extensions.glib.GlibException

public class TlsChannelBindingErrorException(
    error: Error,
    public val code: TlsChannelBindingError,
) : GlibException(error)
