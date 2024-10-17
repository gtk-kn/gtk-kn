// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.Box
import org.gtkkn.bindings.gtk.Builder
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.he.HeSegmentedButton
import org.gtkkn.native.he.he_segmented_button_add_child
import org.gtkkn.native.he.he_segmented_button_get_type
import org.gtkkn.native.he.he_segmented_button_new
import kotlin.String
import kotlin.Unit

public open class SegmentedButton(
    pointer: CPointer<HeSegmentedButton>,
) : Box(pointer.reinterpret()), KGTyped {
    public val heSegmentedButtonPointer: CPointer<HeSegmentedButton>
        get() = gPointer.reinterpret()

    public constructor() : this(he_segmented_button_new()!!.reinterpret())

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
        he_segmented_button_add_child(
            heSegmentedButtonPointer.reinterpret(),
            builder.gtkBuilderPointer.reinterpret(),
            child.gPointer.reinterpret(),
            type
        )

    public companion object : TypeCompanion<SegmentedButton> {
        override val type: GeneratedClassKGType<SegmentedButton> =
            GeneratedClassKGType(he_segmented_button_get_type()) {
                SegmentedButton(it.reinterpret())
            }

        init {
            HeTypeProvider.register()
        }
    }
}
