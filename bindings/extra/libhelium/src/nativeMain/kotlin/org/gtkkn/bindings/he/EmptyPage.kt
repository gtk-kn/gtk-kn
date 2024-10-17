// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.he.HeEmptyPage
import org.gtkkn.native.he.he_empty_page_get_button
import org.gtkkn.native.he.he_empty_page_get_description
import org.gtkkn.native.he.he_empty_page_get_icon
import org.gtkkn.native.he.he_empty_page_get_title
import org.gtkkn.native.he.he_empty_page_get_type
import org.gtkkn.native.he.he_empty_page_new
import org.gtkkn.native.he.he_empty_page_set_button
import org.gtkkn.native.he.he_empty_page_set_description
import org.gtkkn.native.he.he_empty_page_set_icon
import org.gtkkn.native.he.he_empty_page_set_resource
import org.gtkkn.native.he.he_empty_page_set_title
import kotlin.String
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - method `title`: Property has no getter nor setter
 * - method `description`: Property has no getter nor setter
 * - method `icon`: Property has no getter nor setter
 * - method `resource`: Property has no getter nor setter
 * - method `button`: Property has no getter nor setter
 */
public open class EmptyPage(
    pointer: CPointer<HeEmptyPage>,
) : Bin(pointer.reinterpret()), KGTyped {
    public val heEmptyPagePointer: CPointer<HeEmptyPage>
        get() = gPointer.reinterpret()

    public constructor() : this(he_empty_page_new()!!.reinterpret())

    public open fun getTitle(): String =
        he_empty_page_get_title(heEmptyPagePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setTitle(`value`: String): Unit = he_empty_page_set_title(heEmptyPagePointer.reinterpret(), `value`)

    public open fun getDescription(): String =
        he_empty_page_get_description(heEmptyPagePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setDescription(`value`: String): Unit =
        he_empty_page_set_description(heEmptyPagePointer.reinterpret(), `value`)

    public open fun getIcon(): String =
        he_empty_page_get_icon(heEmptyPagePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setIcon(`value`: String): Unit = he_empty_page_set_icon(heEmptyPagePointer.reinterpret(), `value`)

    /**
     *
     *
     * @param value
     */
    public open fun setResource(`value`: String): Unit =
        he_empty_page_set_resource(heEmptyPagePointer.reinterpret(), `value`)

    public open fun getButton(): String =
        he_empty_page_get_button(heEmptyPagePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setButton(`value`: String): Unit =
        he_empty_page_set_button(heEmptyPagePointer.reinterpret(), `value`)

    public companion object : TypeCompanion<EmptyPage> {
        override val type: GeneratedClassKGType<EmptyPage> =
            GeneratedClassKGType(he_empty_page_get_type()) { EmptyPage(it.reinterpret()) }

        init {
            HeTypeProvider.register()
        }
    }
}
