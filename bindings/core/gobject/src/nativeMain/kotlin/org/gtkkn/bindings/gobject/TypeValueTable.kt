// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gobject.GTypeValueTable
import kotlin.String

/**
 * The #GTypeValueTable provides the functions required by the #GValue
 * implementation, to serve as a container for values of a type.
 *
 * ## Skipped during bindings generation
 *
 * - field `value_init`: Fields with callbacks are not supported
 * - field `value_free`: Fields with callbacks are not supported
 * - field `value_copy`: Fields with callbacks are not supported
 * - field `value_peek_pointer`: Fields with callbacks are not supported
 * - field `collect_value`: Fields with callbacks are not supported
 * - field `lcopy_value`: Fields with callbacks are not supported
 */
public class TypeValueTable(
    pointer: CPointer<GTypeValueTable>,
) : Record {
    public val gobjectTypeValueTablePointer: CPointer<GTypeValueTable> = pointer

    /**
     * A string format describing how to collect the contents of
     *  this value bit-by-bit. Each character in the format represents
     *  an argument to be collected, and the characters themselves indicate
     *  the type of the argument. Currently supported arguments are:
     *  - 'i' - Integers. passed as collect_values[].v_int.
     *  - 'l' - Longs. passed as collect_values[].v_long.
     *  - 'd' - Doubles. passed as collect_values[].v_double.
     *  - 'p' - Pointers. passed as collect_values[].v_pointer.
     *  It should be noted that for variable argument list construction,
     *  ANSI C promotes every type smaller than an integer to an int, and
     *  floats to doubles. So for collection of short int or char, 'i'
     *  needs to be used, and for collection of floats 'd'.
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val collectFormat: String?
        get() = gobjectTypeValueTablePointer.pointed.collect_format?.toKString()

    /**
     * Format description of the arguments to collect for @lcopy_value,
     *  analogous to @collect_format. Usually, @lcopy_format string consists
     *  only of 'p's to provide lcopy_value() with pointers to storage locations.
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val lcopyFormat: String?
        get() = gobjectTypeValueTablePointer.pointed.lcopy_format?.toKString()

    public companion object : RecordCompanion<TypeValueTable, GTypeValueTable> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): TypeValueTable =
            TypeValueTable(pointer.reinterpret())
    }
}
