// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.he.HeButtonContent
import org.gtkkn.native.he.he_button_content_get_icon
import org.gtkkn.native.he.he_button_content_get_label
import org.gtkkn.native.he.he_button_content_get_type
import org.gtkkn.native.he.he_button_content_new
import org.gtkkn.native.he.he_button_content_set_icon
import org.gtkkn.native.he.he_button_content_set_label
import kotlin.String
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - method `icon`: Property has no getter nor setter
 * - method `label`: Property has no getter nor setter
 */
public open class ButtonContent(
    pointer: CPointer<HeButtonContent>,
) : Widget(pointer.reinterpret()), KGTyped {
    public val heButtonContentPointer: CPointer<HeButtonContent>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    public constructor() : this(he_button_content_new()!!.reinterpret())

    public open fun getIcon(): String =
        he_button_content_get_icon(heButtonContentPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setIcon(`value`: String): Unit =
        he_button_content_set_icon(heButtonContentPointer.reinterpret(), `value`)

    public open fun getLabel(): String =
        he_button_content_get_label(heButtonContentPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setLabel(`value`: String): Unit =
        he_button_content_set_label(heButtonContentPointer.reinterpret(), `value`)

    public companion object : TypeCompanion<ButtonContent> {
        override val type: GeneratedClassKGType<ButtonContent> =
            GeneratedClassKGType(he_button_content_get_type()) {
                ButtonContent(it.reinterpret())
            }

        init {
            HeTypeProvider.register()
        }
    }
}
