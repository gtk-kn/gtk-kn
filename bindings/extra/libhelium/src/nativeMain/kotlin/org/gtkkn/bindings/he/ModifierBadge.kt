// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.he.HeModifierBadge
import org.gtkkn.native.he.he_modifier_badge_get_alignment
import org.gtkkn.native.he.he_modifier_badge_get_color
import org.gtkkn.native.he.he_modifier_badge_get_label
import org.gtkkn.native.he.he_modifier_badge_get_tinted
import org.gtkkn.native.he.he_modifier_badge_get_type
import org.gtkkn.native.he.he_modifier_badge_new
import org.gtkkn.native.he.he_modifier_badge_set_alignment
import org.gtkkn.native.he.he_modifier_badge_set_color
import org.gtkkn.native.he.he_modifier_badge_set_label
import org.gtkkn.native.he.he_modifier_badge_set_tinted
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - method `color`: Property has no getter nor setter
 * - method `tinted`: Property has no getter nor setter
 * - method `label`: Property has no getter nor setter
 * - method `alignment`: Property has no getter nor setter
 */
public open class ModifierBadge(
    pointer: CPointer<HeModifierBadge>,
) : Bin(pointer.reinterpret()), KGTyped {
    public val heModifierBadgePointer: CPointer<HeModifierBadge>
        get() = gPointer.reinterpret()

    /**
     *
     *
     * @param label
     */
    public constructor(label: String?) : this(he_modifier_badge_new(label)!!.reinterpret())

    public open fun getColor_(): Colors =
        he_modifier_badge_get_color(heModifierBadgePointer.reinterpret()).run {
            Colors.fromNativeValue(this)
        }

    /**
     *
     *
     * @param value
     */
    public open fun setColor(`value`: Colors): Unit =
        he_modifier_badge_set_color(heModifierBadgePointer.reinterpret(), `value`.nativeValue)

    public open fun getTinted(): Boolean =
        he_modifier_badge_get_tinted(heModifierBadgePointer.reinterpret()).asBoolean()

    /**
     *
     *
     * @param value
     */
    public open fun setTinted(`value`: Boolean): Unit =
        he_modifier_badge_set_tinted(heModifierBadgePointer.reinterpret(), `value`.asGBoolean())

    public open fun getLabel(): String? = he_modifier_badge_get_label(heModifierBadgePointer.reinterpret())?.toKString()

    /**
     *
     *
     * @param value
     */
    public open fun setLabel(`value`: String?): Unit =
        he_modifier_badge_set_label(heModifierBadgePointer.reinterpret(), `value`)

    public open fun getAlignment(): ModifierBadgeAlignment =
        he_modifier_badge_get_alignment(heModifierBadgePointer.reinterpret()).run {
            ModifierBadgeAlignment.fromNativeValue(this)
        }

    /**
     *
     *
     * @param value
     */
    public open fun setAlignment(`value`: ModifierBadgeAlignment): Unit =
        he_modifier_badge_set_alignment(
            heModifierBadgePointer.reinterpret(),
            `value`.nativeValue
        )

    public companion object : TypeCompanion<ModifierBadge> {
        override val type: GeneratedClassKGType<ModifierBadge> =
            GeneratedClassKGType(he_modifier_badge_get_type()) {
                ModifierBadge(it.reinterpret())
            }

        init {
            HeTypeProvider.register()
        }
    }
}
