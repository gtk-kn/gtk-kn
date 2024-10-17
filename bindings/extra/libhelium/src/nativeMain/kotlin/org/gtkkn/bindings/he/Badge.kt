// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.he.HeBadge
import org.gtkkn.native.he.he_badge_get_label
import org.gtkkn.native.he.he_badge_get_type
import org.gtkkn.native.he.he_badge_new
import org.gtkkn.native.he.he_badge_set_child
import org.gtkkn.native.he.he_badge_set_label
import kotlin.String
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - method `get_child`: C function he_badge_get_child is ignored
 * - method `child`: Property has no getter nor setter
 * - method `label`: Property has no getter nor setter
 */
public open class Badge(
    pointer: CPointer<HeBadge>,
) : Bin(pointer.reinterpret()), KGTyped {
    public val heBadgePointer: CPointer<HeBadge>
        get() = gPointer.reinterpret()

    public constructor() : this(he_badge_new()!!.reinterpret())

    /**
     *
     *
     * @param value
     */
    public open fun setChild_(`value`: Widget?): Unit =
        he_badge_set_child(
            heBadgePointer.reinterpret(),
            `value`?.gtkWidgetPointer?.reinterpret()
        )

    public open fun getLabel(): String? = he_badge_get_label(heBadgePointer.reinterpret())?.toKString()

    /**
     *
     *
     * @param value
     */
    public open fun setLabel(`value`: String?): Unit = he_badge_set_label(heBadgePointer.reinterpret(), `value`)

    public companion object : TypeCompanion<Badge> {
        override val type: GeneratedClassKGType<Badge> =
            GeneratedClassKGType(he_badge_get_type()) {
                Badge(it.reinterpret())
            }

        init {
            HeTypeProvider.register()
        }
    }
}
