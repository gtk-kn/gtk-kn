// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gtk.GtkRecentData
import kotlin.Boolean
import kotlin.String

/**
 * Meta-data to be passed to gtk_recent_manager_add_full() when
 * registering a recently used resource.
 *
 * ## Skipped during bindings generation
 *
 * - field `groups`: Fields with arrays are not supported
 */
public class RecentData(pointer: CPointer<GtkRecentData>) : Record {
    public val gtkRecentDataPointer: CPointer<GtkRecentData> = pointer

    /**
     * a UTF-8 encoded string, containing the name of the recently
     *   used resource to be displayed, or null;
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val displayName: String?
        get() = gtkRecentDataPointer.pointed.display_name?.toKString()

    /**
     * a UTF-8 encoded string, containing a short description of
     *   the resource, or null;
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val description: String?
        get() = gtkRecentDataPointer.pointed.description?.toKString()

    /**
     * the MIME type of the resource;
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val mimeType: String?
        get() = gtkRecentDataPointer.pointed.mime_type?.toKString()

    /**
     * the name of the application that is registering this recently
     *   used resource;
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val appName: String?
        get() = gtkRecentDataPointer.pointed.app_name?.toKString()

    /**
     * command line used to launch this resource; may contain the
     *   “\%f” and “\%u” escape characters which will be expanded
     *   to the resource file path and URI respectively when the command line
     *   is retrieved;
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val appExec: String?
        get() = gtkRecentDataPointer.pointed.app_exec?.toKString()

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
