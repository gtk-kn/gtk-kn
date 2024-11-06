// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.annotations.GioVersion2_26
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gio.GDBusAnnotationInfo
import org.gtkkn.native.gio.g_dbus_annotation_info_ref
import org.gtkkn.native.gio.g_dbus_annotation_info_unref
import kotlin.Int
import kotlin.String
import kotlin.Unit

/**
 * Information about an annotation.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `annotations`: Array parameter of type DBusAnnotationInfo is not supported
 * - field `annotations`: Fields with arrays are not supported
 *
 * @since 2.26
 */
@GioVersion2_26
public class DBusAnnotationInfo(
    pointer: CPointer<GDBusAnnotationInfo>,
) : Record {
    public val gioDBusAnnotationInfoPointer: CPointer<GDBusAnnotationInfo> = pointer

    /**
     * The reference count or -1 if statically allocated.
     */
    public var refCount: Int
        get() = gioDBusAnnotationInfoPointer.pointed.ref_count
        set(`value`) {
            gioDBusAnnotationInfoPointer.pointed.ref_count = value
        }

    /**
     * The name of the annotation, e.g. "org.freedesktop.DBus.Deprecated".
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val key: String?
        get() = gioDBusAnnotationInfoPointer.pointed.key?.toKString()

    /**
     * The value of the annotation.
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val `value`: String?
        get() = gioDBusAnnotationInfoPointer.pointed.value?.toKString()

    /**
     * If @info is statically allocated does nothing. Otherwise increases
     * the reference count.
     *
     * @return The same @info.
     * @since 2.26
     */
    @GioVersion2_26
    public fun ref(): DBusAnnotationInfo =
        g_dbus_annotation_info_ref(gioDBusAnnotationInfoPointer.reinterpret())!!.run {
            DBusAnnotationInfo(reinterpret())
        }

    /**
     * If @info is statically allocated, does nothing. Otherwise decreases
     * the reference count of @info. When its reference count drops to 0,
     * the memory used is freed.
     *
     * @since 2.26
     */
    @GioVersion2_26
    public fun unref(): Unit = g_dbus_annotation_info_unref(gioDBusAnnotationInfoPointer.reinterpret())

    public companion object : RecordCompanion<DBusAnnotationInfo, GDBusAnnotationInfo> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): DBusAnnotationInfo =
            DBusAnnotationInfo(pointer.reinterpret())
    }
}
