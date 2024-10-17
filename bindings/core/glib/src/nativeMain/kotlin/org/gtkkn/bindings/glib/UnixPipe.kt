// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GUnixPipe

/**
 * A Unix pipe. The advantage of this type over `int[2]` is that it can
 * be closed automatically when it goes out of scope, using `g_auto(GUnixPipe)`,
 * on compilers that support that feature.
 *
 * ## Skipped during bindings generation
 *
 * - field `fds`: Fields with arrays are not supported
 *
 * @since 2.80
 */
public class UnixPipe(
    pointer: CPointer<GUnixPipe>,
) : Record {
    public val glibUnixPipePointer: CPointer<GUnixPipe> = pointer

    public companion object : RecordCompanion<UnixPipe, GUnixPipe> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): UnixPipe = UnixPipe(pointer.reinterpret())
    }
}
