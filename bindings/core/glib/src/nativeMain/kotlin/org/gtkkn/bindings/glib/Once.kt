// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.annotations.GLibVersion2_4
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GOnce

/**
 * A #GOnce struct controls a one-time initialization function. Any
 * one-time initialization function must have its own unique #GOnce
 * struct.
 *
 * ## Skipped during bindings generation
 *
 * - function `init_enter`: In/Out parameter is not supported
 * - parameter `location`: Unsupported pointer to primitive type
 * - parameter `location`: gpointer
 * - function `init_leave`: In/Out parameter is not supported
 * - parameter `location`: gpointer
 * - field `retval`: gpointer
 *
 * @since 2.4
 */
@GLibVersion2_4
public class Once(
    pointer: CPointer<GOnce>,
) : Record {
    public val glibOncePointer: CPointer<GOnce> = pointer

    /**
     * the status of the #GOnce
     */
    public var status: OnceStatus
        get() =
            glibOncePointer.pointed.status.run {
                OnceStatus.fromNativeValue(this)
            }
        set(`value`) {
            glibOncePointer.pointed.status = value.nativeValue
        }

    public companion object : RecordCompanion<Once, GOnce> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Once = Once(pointer.reinterpret())
    }
}
