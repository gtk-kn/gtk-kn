package org.gtkkn.extensions.glib

import org.gtkkn.bindings.glib.Error

public class GlibException(public val error: Error) : Exception(
    error.message,
//    "GERROR MESSAGE PLACEHOLDER"
)
