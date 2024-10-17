// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.he.HeViewTitle
import org.gtkkn.native.he.he_view_title_get_label
import org.gtkkn.native.he.he_view_title_get_type
import org.gtkkn.native.he.he_view_title_new
import org.gtkkn.native.he.he_view_title_set_label
import kotlin.String
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - method `label`: Property has no getter nor setter
 */
public open class ViewTitle(
    pointer: CPointer<HeViewTitle>,
) : Bin(pointer.reinterpret()), KGTyped {
    public val heViewTitlePointer: CPointer<HeViewTitle>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    public constructor() : this(he_view_title_new()!!.reinterpret())

    public open fun getLabel(): String? = he_view_title_get_label(heViewTitlePointer.reinterpret())?.toKString()

    /**
     *
     *
     * @param value
     */
    public open fun setLabel(`value`: String?): Unit =
        he_view_title_set_label(heViewTitlePointer.reinterpret(), `value`)

    public companion object : TypeCompanion<ViewTitle> {
        override val type: GeneratedClassKGType<ViewTitle> =
            GeneratedClassKGType(he_view_title_get_type()) { ViewTitle(it.reinterpret()) }

        init {
            HeTypeProvider.register()
        }
    }
}
