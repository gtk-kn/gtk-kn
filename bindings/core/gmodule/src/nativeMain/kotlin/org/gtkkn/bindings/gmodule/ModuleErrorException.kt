// This is a generated file. Do not modify.
package org.gtkkn.bindings.gmodule

import org.gtkkn.bindings.glib.Error
import org.gtkkn.extensions.glib.GlibException

public class ModuleErrorException(
    error: Error,
    public val code: ModuleError,
) : GlibException(error)
