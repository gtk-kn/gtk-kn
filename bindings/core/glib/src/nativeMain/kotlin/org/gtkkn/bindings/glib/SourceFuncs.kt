// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GSourceFuncs

/**
 * The `GSourceFuncs` struct contains a table of
 * functions used to handle event sources in a generic manner.
 *
 * For idle sources, the prepare and check functions always return true
 * to indicate that the source is always ready to be processed. The prepare
 * function also returns a timeout value of 0 to ensure that the poll() call
 * doesn't block (since that would be time wasted which could have been spent
 * running the idle function).
 *
 * For timeout sources, the prepare and check functions both return true
 * if the timeout interval has expired. The prepare function also returns
 * a timeout value to ensure that the poll() call doesn't block too long
 * and miss the next timeout.
 *
 * For file descriptor sources, the prepare function typically returns false,
 * since it must wait until poll() has been called before it knows whether
 * any events need to be processed. It sets the returned timeout to -1 to
 * indicate that it doesn't mind how long the poll() call blocks. In the
 * check function, it tests the results of the poll() call to see if the
 * required condition has been met, and returns true if so.
 *
 * ## Skipped during bindings generation
 *
 * - field `prepare`: Fields with callbacks are not supported
 * - field `check`: Fields with callbacks are not supported
 * - field `dispatch`: Fields with callbacks are not supported
 * - field `finalize`: Fields with callbacks are not supported
 * - field `closure_callback`: Record field closure_callback is private
 * - field `closure_marshal`: Record field closure_marshal is private
 */
public class SourceFuncs(
    pointer: CPointer<GSourceFuncs>,
) : Record {
    public val glibSourceFuncsPointer: CPointer<GSourceFuncs> = pointer

    public companion object : RecordCompanion<SourceFuncs, GSourceFuncs> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): SourceFuncs =
            SourceFuncs(pointer.reinterpret())
    }
}
