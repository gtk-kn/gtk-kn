// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GPrivate

/**
 * The #GPrivate struct is an opaque data structure to represent a
 * thread-local data key. It is approximately equivalent to the
 * pthread_setspecific()/pthread_getspecific() APIs on POSIX and to
 * TlsSetValue()/TlsGetValue() on Windows.
 *
 * If you don't already know why you might want this functionality,
 * then you probably don't need it.
 *
 * #GPrivate is a very limited resource (as far as 128 per program,
 * shared between all libraries). It is also not possible to destroy a
 * #GPrivate after it has been used. As such, it is only ever acceptable
 * to use #GPrivate in static scope, and even then sparingly so.
 *
 * See G_PRIVATE_INIT() for a couple of examples.
 *
 * The #GPrivate structure should be considered opaque.  It should only
 * be accessed via the g_private_ functions.
 *
 * ## Skipped during bindings generation
 *
 * - method `get`: Return type gpointer is unsupported
 * - parameter `value`: gpointer
 * - parameter `value`: gpointer
 * - field `p`: Record field p is private
 * - field `notify`: Record field notify is private
 * - field `future`: Record field future is private
 */
public class Private(
    pointer: CPointer<GPrivate>,
) : Record {
    public val glibPrivatePointer: CPointer<GPrivate> = pointer

    public companion object : RecordCompanion<Private, GPrivate> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Private = Private(pointer.reinterpret())
    }
}
