// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.Regex
import org.gtkkn.bindings.gtk.ListBoxRow
import org.gtkkn.bindings.gtk.Text
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.he.HeTextField
import org.gtkkn.native.he.he_text_field_get_entry
import org.gtkkn.native.he.he_text_field_get_is_valid
import org.gtkkn.native.he.he_text_field_get_max_length
import org.gtkkn.native.he.he_text_field_get_min_length
import org.gtkkn.native.he.he_text_field_get_needs_validation
import org.gtkkn.native.he.he_text_field_get_placeholder_text
import org.gtkkn.native.he.he_text_field_get_regex
import org.gtkkn.native.he.he_text_field_get_support_text
import org.gtkkn.native.he.he_text_field_get_text
import org.gtkkn.native.he.he_text_field_get_type
import org.gtkkn.native.he.he_text_field_get_visibility
import org.gtkkn.native.he.he_text_field_new
import org.gtkkn.native.he.he_text_field_new_from_regex
import org.gtkkn.native.he.he_text_field_set_is_valid
import org.gtkkn.native.he.he_text_field_set_max_length
import org.gtkkn.native.he.he_text_field_set_min_length
import org.gtkkn.native.he.he_text_field_set_needs_validation
import org.gtkkn.native.he.he_text_field_set_placeholder_text
import org.gtkkn.native.he.he_text_field_set_regex
import org.gtkkn.native.he.he_text_field_set_support_text
import org.gtkkn.native.he.he_text_field_set_text
import org.gtkkn.native.he.he_text_field_set_visibility
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - method `is-valid`: Property has no getter nor setter
 * - method `needs-validation`: Property has no getter nor setter
 * - method `min-length`: Property has no getter nor setter
 * - method `regex`: Property has no getter nor setter
 * - method `text`: Property has no getter nor setter
 * - method `support-text`: Property has no getter nor setter
 * - method `placeholder-text`: Property has no getter nor setter
 * - method `max-length`: Property has no getter nor setter
 * - method `visibility`: Property has no getter nor setter
 */
public open class TextField(
    pointer: CPointer<HeTextField>,
) : ListBoxRow(pointer.reinterpret()), KGTyped {
    public val heTextFieldPointer: CPointer<HeTextField>
        get() = gPointer.reinterpret()

    public constructor() : this(he_text_field_new()!!.reinterpret())

    /**
     *
     *
     * @param regexArg
     */
    public constructor(regexArg: Regex) :
        this(he_text_field_new_from_regex(regexArg.glibRegexPointer)!!.reinterpret())

    public open fun getIsValid(): Boolean = he_text_field_get_is_valid(heTextFieldPointer.reinterpret()).asBoolean()

    /**
     *
     *
     * @param value
     */
    public open fun setIsValid(`value`: Boolean): Unit =
        he_text_field_set_is_valid(heTextFieldPointer.reinterpret(), `value`.asGBoolean())

    public open fun getNeedsValidation(): Boolean =
        he_text_field_get_needs_validation(heTextFieldPointer.reinterpret()).asBoolean()

    /**
     *
     *
     * @param value
     */
    public open fun setNeedsValidation(`value`: Boolean): Unit =
        he_text_field_set_needs_validation(
            heTextFieldPointer.reinterpret(),
            `value`.asGBoolean()
        )

    public open fun getMinLength(): Int = he_text_field_get_min_length(heTextFieldPointer.reinterpret())

    /**
     *
     *
     * @param value
     */
    public open fun setMinLength(`value`: Int): Unit =
        he_text_field_set_min_length(heTextFieldPointer.reinterpret(), `value`)

    public open fun getRegex(): Regex =
        he_text_field_get_regex(heTextFieldPointer.reinterpret())!!.run {
            Regex(reinterpret())
        }

    /**
     *
     *
     * @param value
     */
    public open fun setRegex(`value`: Regex): Unit =
        he_text_field_set_regex(heTextFieldPointer.reinterpret(), `value`.glibRegexPointer)

    public open fun getEntry(): Text =
        he_text_field_get_entry(heTextFieldPointer.reinterpret())!!.run {
            Text(reinterpret())
        }

    public open fun getText(): String? = he_text_field_get_text(heTextFieldPointer.reinterpret())?.toKString()

    /**
     *
     *
     * @param value
     */
    public open fun setText(`value`: String?): Unit = he_text_field_set_text(heTextFieldPointer.reinterpret(), `value`)

    public open fun getSupportText(): String? =
        he_text_field_get_support_text(heTextFieldPointer.reinterpret())?.toKString()

    /**
     *
     *
     * @param value
     */
    public open fun setSupportText(`value`: String?): Unit =
        he_text_field_set_support_text(heTextFieldPointer.reinterpret(), `value`)

    public open fun getPlaceholderText(): String? =
        he_text_field_get_placeholder_text(heTextFieldPointer.reinterpret())?.toKString()

    /**
     *
     *
     * @param value
     */
    public open fun setPlaceholderText(`value`: String?): Unit =
        he_text_field_set_placeholder_text(heTextFieldPointer.reinterpret(), `value`)

    public open fun getMaxLength(): Int = he_text_field_get_max_length(heTextFieldPointer.reinterpret())

    /**
     *
     *
     * @param value
     */
    public open fun setMaxLength(`value`: Int): Unit =
        he_text_field_set_max_length(heTextFieldPointer.reinterpret(), `value`)

    public open fun getVisibility(): Boolean =
        he_text_field_get_visibility(heTextFieldPointer.reinterpret()).asBoolean()

    /**
     *
     *
     * @param value
     */
    public open fun setVisibility(`value`: Boolean): Unit =
        he_text_field_set_visibility(heTextFieldPointer.reinterpret(), `value`.asGBoolean())

    public companion object : TypeCompanion<TextField> {
        override val type: GeneratedClassKGType<TextField> =
            GeneratedClassKGType(he_text_field_get_type()) { TextField(it.reinterpret()) }

        init {
            HeTypeProvider.register()
        }
    }
}
