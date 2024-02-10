// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import org.gtkkn.bindings.glib.Error
import org.gtkkn.extensions.glib.GlibException

public class SerializationErrorException(
    error: Error,
    public val code: SerializationError,
) : GlibException(error)
