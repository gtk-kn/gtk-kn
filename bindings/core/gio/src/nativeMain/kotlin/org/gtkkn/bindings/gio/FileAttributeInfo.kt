// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gio.GFileAttributeInfo

/**
 * Information about a specific attribute.
 *
 * ## Skipped during bindings generation
 *
 * - field `name`: Unsupported string type with cType: char*
 */
public class FileAttributeInfo(
    pointer: CPointer<GFileAttributeInfo>,
) : Record {
    public val gioFileAttributeInfoPointer: CPointer<GFileAttributeInfo> = pointer

    /**
     * the #GFileAttributeType type of the attribute.
     */
    public var type: FileAttributeType
        get() =
            gioFileAttributeInfoPointer.pointed.type.run {
                FileAttributeType.fromNativeValue(this)
            }
        set(`value`) {
            gioFileAttributeInfoPointer.pointed.type = value.nativeValue
        }

    /**
     * a set of #GFileAttributeInfoFlags.
     */
    public var flags: FileAttributeInfoFlags
        get() =
            gioFileAttributeInfoPointer.pointed.flags.run {
                FileAttributeInfoFlags(this)
            }
        set(`value`) {
            gioFileAttributeInfoPointer.pointed.flags = value.mask
        }

    public companion object : RecordCompanion<FileAttributeInfo, GFileAttributeInfo> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): FileAttributeInfo =
            FileAttributeInfo(pointer.reinterpret())
    }
}
