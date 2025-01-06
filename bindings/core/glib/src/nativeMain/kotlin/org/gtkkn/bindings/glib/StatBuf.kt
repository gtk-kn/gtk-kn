// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GStatBuf

/**
 * A type corresponding to the appropriate struct type for the stat()
 * system call, depending on the platform and/or compiler being used.
 *
 * See g_stat() for more information.
 */
public class StatBuf(pointer: CPointer<GStatBuf>) : ProxyInstance(pointer) {
    public val gPointer: CPointer<GStatBuf> = pointer
}
