// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import org.gtkkn.bindings.glib.Error
import org.gtkkn.extensions.glib.GlibException

public class SnapshotErrorException(
    error: Error,
    public val code: SnapshotError,
) : GlibException(error)