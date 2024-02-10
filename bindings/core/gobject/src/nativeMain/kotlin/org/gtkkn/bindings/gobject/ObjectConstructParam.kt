// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gobject.GObjectConstructParam

/**
 * The GObjectConstructParam struct is an auxiliary structure used to hand
 * #GParamSpec/#GValue pairs to the @constructor of a #GObjectClass.
 */
public class ObjectConstructParam(
    pointer: CPointer<GObjectConstructParam>,
) : Record {
    public val gobjectObjectConstructParamPointer: CPointer<GObjectConstructParam> = pointer

    /**
     * the #GParamSpec of the construct parameter
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val pspec: ParamSpec?
        get() =
            gobjectObjectConstructParamPointer.pointed.pspec?.run {
                ParamSpec(reinterpret())
            }

    /**
     * the value to set the parameter to
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val `value`: Value?
        get() =
            gobjectObjectConstructParamPointer.pointed.value?.run {
                Value(reinterpret())
            }

    public companion object : RecordCompanion<ObjectConstructParam, GObjectConstructParam> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): ObjectConstructParam =
            ObjectConstructParam(pointer.reinterpret())
    }
}
