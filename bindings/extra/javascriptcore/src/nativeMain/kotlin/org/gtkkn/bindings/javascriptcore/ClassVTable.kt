// This is a generated file. Do not modify.
package org.gtkkn.bindings.javascriptcore

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.javascriptcore.JSCClassVTable

/**
 * Virtual table for a JSCClass. This can be optionally used when registering a #JSCClass in a #JSCContext
 * to provide a custom implementation for the class. All virtual functions are optional and can be set to
 * null to fallback to the default implementation.
 *
 * ## Skipped during bindings generation
 *
 * - field `get_property`: ClassGetPropertyFunction
 * - field `set_property`: ClassSetPropertyFunction
 * - field `has_property`: ClassHasPropertyFunction
 * - field `delete_property`: ClassDeletePropertyFunction
 * - field `enumerate_properties`: ClassEnumeratePropertiesFunction
 * - field `_jsc_reserved0`: Fields with callbacks are not supported
 * - field `_jsc_reserved1`: Fields with callbacks are not supported
 * - field `_jsc_reserved2`: Fields with callbacks are not supported
 * - field `_jsc_reserved3`: Fields with callbacks are not supported
 * - field `_jsc_reserved4`: Fields with callbacks are not supported
 * - field `_jsc_reserved5`: Fields with callbacks are not supported
 * - field `_jsc_reserved6`: Fields with callbacks are not supported
 * - field `_jsc_reserved7`: Fields with callbacks are not supported
 */
public class ClassVTable(
    pointer: CPointer<JSCClassVTable>,
) : Record {
    public val javascriptcoreClassVTablePointer: CPointer<JSCClassVTable> = pointer

    public companion object : RecordCompanion<ClassVTable, JSCClassVTable> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): ClassVTable =
            ClassVTable(pointer.reinterpret())
    }
}
