// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.atk.AtkAttribute
import kotlin.String

/**
 * AtkAttribute is a string name/value pair representing a generic
 * attribute. This can be used to expose additional information from
 * an accessible object as a whole (see atk_object_get_attributes())
 * or an document (see atk_document_get_attributes()). In the case of
 * text attributes (see atk_text_get_default_attributes()),
 * #AtkTextAttribute enum defines all the possible text attribute
 * names. You can use atk_text_attribute_get_name() to get the string
 * name from the enum value. See also atk_text_attribute_for_name()
 * and atk_text_attribute_get_value() for more information.
 *
 * A string name/value pair representing a generic attribute.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `attrib_set`: AttributeSet
 */
public class Attribute(
    pointer: CPointer<AtkAttribute>,
) : Record {
    public val atkAttributePointer: CPointer<AtkAttribute> = pointer

    /**
     * The attribute name.
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val name: String?
        get() = atkAttributePointer.pointed.name?.toKString()

    /**
     * the value of the attribute, represented as a string.
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val `value`: String?
        get() = atkAttributePointer.pointed.value?.toKString()

    public companion object : RecordCompanion<Attribute, AtkAttribute> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Attribute = Attribute(pointer.reinterpret())
    }
}
