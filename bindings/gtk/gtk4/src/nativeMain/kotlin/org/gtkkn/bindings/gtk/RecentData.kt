// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gtk.GtkRecentData
import kotlin.Boolean

/**
 * Meta-data to be passed to gtk_recent_manager_add_full() when
 * registering a recently used resource.
 *
 * ## Skipped during bindings generation
 *
 * - field `display_name`: Unsupported string type with cType: char*
 * - field `description`: Unsupported string type with cType: char*
 * - field `mime_type`: Unsupported string type with cType: char*
 * - field `app_name`: Unsupported string type with cType: char*
 * - field `app_exec`: Unsupported string type with cType: char*
 * - field `groups`: Fields with arrays are not supported
 */
public class RecentData(
    pointer: CPointer<GtkRecentData>,
) : Record {
    public val gtkRecentDataPointer: CPointer<GtkRecentData> = pointer

    /**
     * whether this resource should be displayed only by the
     *   applications that have registered it or not.
     */
    public var isPrivate: Boolean
        get() = gtkRecentDataPointer.pointed.is_private.asBoolean()
        set(`value`) {
            gtkRecentDataPointer.pointed.is_private = value.asGBoolean()
        }

    public companion object : RecordCompanion<RecentData, GtkRecentData> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): RecentData = RecentData(pointer.reinterpret())
    }
}
