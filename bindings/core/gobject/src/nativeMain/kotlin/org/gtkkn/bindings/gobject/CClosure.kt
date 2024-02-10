// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gobject.GCClosure

/**
 * A #GCClosure is a specialization of #GClosure for C function callbacks.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `invocation_hint`: gpointer
 * - parameter `invocation_hint`: gpointer
 * - parameter `invocation_hint`: gpointer
 * - parameter `invocation_hint`: gpointer
 * - parameter `invocation_hint`: gpointer
 * - parameter `invocation_hint`: gpointer
 * - parameter `invocation_hint`: gpointer
 * - parameter `invocation_hint`: gpointer
 * - parameter `invocation_hint`: gpointer
 * - parameter `invocation_hint`: gpointer
 * - parameter `invocation_hint`: gpointer
 * - parameter `invocation_hint`: gpointer
 * - parameter `invocation_hint`: gpointer
 * - parameter `invocation_hint`: gpointer
 * - parameter `invocation_hint`: gpointer
 * - parameter `invocation_hint`: gpointer
 * - parameter `invocation_hint`: gpointer
 * - parameter `invocation_hint`: gpointer
 * - parameter `invocation_hint`: gpointer
 * - parameter `invocation_hint`: gpointer
 * - parameter `invocation_hint`: gpointer
 * - parameter `invocation_hint`: gpointer
 * - parameter `invocation_hint`: gpointer
 * - field `closure`: Closure
 * - field `callback`: gpointer
 */
public class CClosure(
    pointer: CPointer<GCClosure>,
) : Record {
    public val gobjectCClosurePointer: CPointer<GCClosure> = pointer

    public companion object : RecordCompanion<CClosure, GCClosure> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): CClosure = CClosure(pointer.reinterpret())
    }
}
