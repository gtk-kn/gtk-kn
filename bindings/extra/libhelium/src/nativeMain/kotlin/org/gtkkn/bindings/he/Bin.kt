// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.Builder
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.he.HeBin
import org.gtkkn.native.he.he_bin_add_child
import org.gtkkn.native.he.he_bin_get_child
import org.gtkkn.native.he.he_bin_get_type
import org.gtkkn.native.he.he_bin_new
import org.gtkkn.native.he.he_bin_set_child
import kotlin.String
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - method `child`: Property has no getter nor setter
 */
public open class Bin(
    pointer: CPointer<HeBin>,
) : Widget(pointer.reinterpret()), KGTyped {
    public val heBinPointer: CPointer<HeBin>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    public constructor() : this(he_bin_new()!!.reinterpret())

    public open fun getChild(): Widget =
        he_bin_get_child(heBinPointer.reinterpret())!!.run {
            Widget(reinterpret())
        }

    /**
     *
     *
     * @param value
     */
    public open fun setChild(`value`: Widget): Unit =
        he_bin_set_child(
            heBinPointer.reinterpret(),
            `value`.gtkWidgetPointer.reinterpret()
        )

    /**
     *
     *
     * @param builder
     * @param child
     * @param type
     */
    public open fun addChild(
        builder: Builder,
        child: Object,
        type: String?,
    ): Unit =
        he_bin_add_child(
            heBinPointer.reinterpret(),
            builder.gtkBuilderPointer.reinterpret(),
            child.gPointer.reinterpret(),
            type
        )

    public companion object : TypeCompanion<Bin> {
        override val type: GeneratedClassKGType<Bin> =
            GeneratedClassKGType(he_bin_get_type()) {
                Bin(it.reinterpret())
            }

        init {
            HeTypeProvider.register()
        }
    }
}
