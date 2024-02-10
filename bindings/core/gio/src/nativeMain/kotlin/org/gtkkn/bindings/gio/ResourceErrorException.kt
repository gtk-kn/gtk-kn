// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.glib.Error
import org.gtkkn.extensions.glib.GlibException

public class ResourceErrorException(
    error: Error,
    public val code: ResourceError,
) : GlibException(error)
