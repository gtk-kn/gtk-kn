// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gobject.GTypeFundamentalInfo

/**
 * A structure that provides information to the type system which is
 * used specifically for managing fundamental types.
 */
public class TypeFundamentalInfo(
    pointer: CPointer<GTypeFundamentalInfo>,
) : Record {
    public val gobjectTypeFundamentalInfoPointer: CPointer<GTypeFundamentalInfo> = pointer

    /**
     * #GTypeFundamentalFlags describing the characteristics of the fundamental type
     */
    public var typeFlags: TypeFundamentalFlags
        get() =
            gobjectTypeFundamentalInfoPointer.pointed.type_flags.run {
                TypeFundamentalFlags(this)
            }
        set(`value`) {
            gobjectTypeFundamentalInfoPointer.pointed.type_flags = value.mask
        }

    public companion object : RecordCompanion<TypeFundamentalInfo, GTypeFundamentalInfo> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): TypeFundamentalInfo =
            TypeFundamentalInfo(pointer.reinterpret())
    }
}
