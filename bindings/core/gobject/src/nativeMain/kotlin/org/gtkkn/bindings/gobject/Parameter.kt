// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gobject.GParameter
import kotlin.String

/**
 * The GParameter struct is an auxiliary structure used
 * to hand parameter name/value pairs to g_object_newv().
 *
 * ## Skipped during bindings generation
 *
 * - field `value`: Value
 */
public class Parameter(
    pointer: CPointer<GParameter>,
) : Record {
    public val gobjectParameterPointer: CPointer<GParameter> = pointer

    /**
     * the parameter name
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val name: String?
        get() = gobjectParameterPointer.pointed.name?.toKString()

    public companion object : RecordCompanion<Parameter, GParameter> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Parameter = Parameter(pointer.reinterpret())
    }
}
