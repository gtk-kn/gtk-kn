// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.he.HeScheme
import org.gtkkn.native.he.he_scheme_get_error_hex
import org.gtkkn.native.he.he_scheme_get_inverse_neutral_background_hex
import org.gtkkn.native.he.he_scheme_get_inverse_neutral_foreground_hex
import org.gtkkn.native.he.he_scheme_get_inverse_primary_hex
import org.gtkkn.native.he.he_scheme_get_neutral_background_hex
import org.gtkkn.native.he.he_scheme_get_neutral_background_variant_hex
import org.gtkkn.native.he.he_scheme_get_neutral_foreground_hex
import org.gtkkn.native.he.he_scheme_get_neutral_foreground_variant_hex
import org.gtkkn.native.he.he_scheme_get_on_error_hex
import org.gtkkn.native.he.he_scheme_get_on_primary_container_hex
import org.gtkkn.native.he.he_scheme_get_on_primary_hex
import org.gtkkn.native.he.he_scheme_get_on_secondary_container_hex
import org.gtkkn.native.he.he_scheme_get_on_secondary_hex
import org.gtkkn.native.he.he_scheme_get_on_tertiary_container_hex
import org.gtkkn.native.he.he_scheme_get_on_tertiary_hex
import org.gtkkn.native.he.he_scheme_get_outline_hex
import org.gtkkn.native.he.he_scheme_get_outline_variant_hex
import org.gtkkn.native.he.he_scheme_get_primary_container_hex
import org.gtkkn.native.he.he_scheme_get_primary_hex
import org.gtkkn.native.he.he_scheme_get_scrim_hex
import org.gtkkn.native.he.he_scheme_get_secondary_container_hex
import org.gtkkn.native.he.he_scheme_get_secondary_hex
import org.gtkkn.native.he.he_scheme_get_shadow_hex
import org.gtkkn.native.he.he_scheme_get_tertiary_container_hex
import org.gtkkn.native.he.he_scheme_get_tertiary_hex
import org.gtkkn.native.he.he_scheme_get_type
import org.gtkkn.native.he.he_scheme_set_error_hex
import org.gtkkn.native.he.he_scheme_set_inverse_neutral_background_hex
import org.gtkkn.native.he.he_scheme_set_inverse_neutral_foreground_hex
import org.gtkkn.native.he.he_scheme_set_inverse_primary_hex
import org.gtkkn.native.he.he_scheme_set_neutral_background_hex
import org.gtkkn.native.he.he_scheme_set_neutral_background_variant_hex
import org.gtkkn.native.he.he_scheme_set_neutral_foreground_hex
import org.gtkkn.native.he.he_scheme_set_neutral_foreground_variant_hex
import org.gtkkn.native.he.he_scheme_set_on_error_hex
import org.gtkkn.native.he.he_scheme_set_on_primary_container_hex
import org.gtkkn.native.he.he_scheme_set_on_primary_hex
import org.gtkkn.native.he.he_scheme_set_on_secondary_container_hex
import org.gtkkn.native.he.he_scheme_set_on_secondary_hex
import org.gtkkn.native.he.he_scheme_set_on_tertiary_container_hex
import org.gtkkn.native.he.he_scheme_set_on_tertiary_hex
import org.gtkkn.native.he.he_scheme_set_outline_hex
import org.gtkkn.native.he.he_scheme_set_outline_variant_hex
import org.gtkkn.native.he.he_scheme_set_primary_container_hex
import org.gtkkn.native.he.he_scheme_set_primary_hex
import org.gtkkn.native.he.he_scheme_set_scrim_hex
import org.gtkkn.native.he.he_scheme_set_secondary_container_hex
import org.gtkkn.native.he.he_scheme_set_secondary_hex
import org.gtkkn.native.he.he_scheme_set_shadow_hex
import org.gtkkn.native.he.he_scheme_set_tertiary_container_hex
import org.gtkkn.native.he.he_scheme_set_tertiary_hex
import kotlin.String
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - method `neutral-background-hex`: Property has no getter nor setter
 * - method `neutral-background-variant-hex`: Property has no getter nor setter
 * - method `neutral-foreground-hex`: Property has no getter nor setter
 * - method `neutral-foreground-variant-hex`: Property has no getter nor setter
 * - method `inverse-neutral-background-hex`: Property has no getter nor setter
 * - method `inverse-neutral-foreground-hex`: Property has no getter nor setter
 * - method `primary-hex`: Property has no getter nor setter
 * - method `on-primary-hex`: Property has no getter nor setter
 * - method `primary-container-hex`: Property has no getter nor setter
 * - method `on-primary-container-hex`: Property has no getter nor setter
 * - method `inverse-primary-hex`: Property has no getter nor setter
 * - method `error-hex`: Property has no getter nor setter
 * - method `on-error-hex`: Property has no getter nor setter
 * - method `secondary-hex`: Property has no getter nor setter
 * - method `on-secondary-hex`: Property has no getter nor setter
 * - method `secondary-container-hex`: Property has no getter nor setter
 * - method `on-secondary-container-hex`: Property has no getter nor setter
 * - method `tertiary-hex`: Property has no getter nor setter
 * - method `on-tertiary-hex`: Property has no getter nor setter
 * - method `tertiary-container-hex`: Property has no getter nor setter
 * - method `on-tertiary-container-hex`: Property has no getter nor setter
 * - method `outline-hex`: Property has no getter nor setter
 * - method `outline-variant-hex`: Property has no getter nor setter
 * - method `shadow-hex`: Property has no getter nor setter
 * - method `scrim-hex`: Property has no getter nor setter
 * - parameter `cam16_color`: He.HeCAM16Color
 */
public open class Scheme(
    pointer: CPointer<HeScheme>,
) : Object(pointer.reinterpret()), KGTyped {
    public val heSchemePointer: CPointer<HeScheme>
        get() = gPointer.reinterpret()

    public open fun getNeutralBackgroundHex(): String =
        he_scheme_get_neutral_background_hex(heSchemePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setNeutralBackgroundHex(`value`: String): Unit =
        he_scheme_set_neutral_background_hex(heSchemePointer.reinterpret(), `value`)

    public open fun getNeutralBackgroundVariantHex(): String =
        he_scheme_get_neutral_background_variant_hex(heSchemePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setNeutralBackgroundVariantHex(`value`: String): Unit =
        he_scheme_set_neutral_background_variant_hex(heSchemePointer.reinterpret(), `value`)

    public open fun getNeutralForegroundHex(): String =
        he_scheme_get_neutral_foreground_hex(heSchemePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setNeutralForegroundHex(`value`: String): Unit =
        he_scheme_set_neutral_foreground_hex(heSchemePointer.reinterpret(), `value`)

    public open fun getNeutralForegroundVariantHex(): String =
        he_scheme_get_neutral_foreground_variant_hex(heSchemePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setNeutralForegroundVariantHex(`value`: String): Unit =
        he_scheme_set_neutral_foreground_variant_hex(heSchemePointer.reinterpret(), `value`)

    public open fun getInverseNeutralBackgroundHex(): String =
        he_scheme_get_inverse_neutral_background_hex(heSchemePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setInverseNeutralBackgroundHex(`value`: String): Unit =
        he_scheme_set_inverse_neutral_background_hex(heSchemePointer.reinterpret(), `value`)

    public open fun getInverseNeutralForegroundHex(): String =
        he_scheme_get_inverse_neutral_foreground_hex(heSchemePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setInverseNeutralForegroundHex(`value`: String): Unit =
        he_scheme_set_inverse_neutral_foreground_hex(heSchemePointer.reinterpret(), `value`)

    public open fun getPrimaryHex(): String =
        he_scheme_get_primary_hex(heSchemePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setPrimaryHex(`value`: String): Unit =
        he_scheme_set_primary_hex(heSchemePointer.reinterpret(), `value`)

    public open fun getOnPrimaryHex(): String =
        he_scheme_get_on_primary_hex(heSchemePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setOnPrimaryHex(`value`: String): Unit =
        he_scheme_set_on_primary_hex(heSchemePointer.reinterpret(), `value`)

    public open fun getPrimaryContainerHex(): String =
        he_scheme_get_primary_container_hex(heSchemePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setPrimaryContainerHex(`value`: String): Unit =
        he_scheme_set_primary_container_hex(heSchemePointer.reinterpret(), `value`)

    public open fun getOnPrimaryContainerHex(): String =
        he_scheme_get_on_primary_container_hex(heSchemePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setOnPrimaryContainerHex(`value`: String): Unit =
        he_scheme_set_on_primary_container_hex(heSchemePointer.reinterpret(), `value`)

    public open fun getInversePrimaryHex(): String =
        he_scheme_get_inverse_primary_hex(heSchemePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setInversePrimaryHex(`value`: String): Unit =
        he_scheme_set_inverse_primary_hex(heSchemePointer.reinterpret(), `value`)

    public open fun getErrorHex(): String =
        he_scheme_get_error_hex(heSchemePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setErrorHex(`value`: String): Unit = he_scheme_set_error_hex(heSchemePointer.reinterpret(), `value`)

    public open fun getOnErrorHex(): String =
        he_scheme_get_on_error_hex(heSchemePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setOnErrorHex(`value`: String): Unit =
        he_scheme_set_on_error_hex(heSchemePointer.reinterpret(), `value`)

    public open fun getSecondaryHex(): String =
        he_scheme_get_secondary_hex(heSchemePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setSecondaryHex(`value`: String): Unit =
        he_scheme_set_secondary_hex(heSchemePointer.reinterpret(), `value`)

    public open fun getOnSecondaryHex(): String =
        he_scheme_get_on_secondary_hex(heSchemePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setOnSecondaryHex(`value`: String): Unit =
        he_scheme_set_on_secondary_hex(heSchemePointer.reinterpret(), `value`)

    public open fun getSecondaryContainerHex(): String =
        he_scheme_get_secondary_container_hex(heSchemePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setSecondaryContainerHex(`value`: String): Unit =
        he_scheme_set_secondary_container_hex(heSchemePointer.reinterpret(), `value`)

    public open fun getOnSecondaryContainerHex(): String =
        he_scheme_get_on_secondary_container_hex(heSchemePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setOnSecondaryContainerHex(`value`: String): Unit =
        he_scheme_set_on_secondary_container_hex(heSchemePointer.reinterpret(), `value`)

    public open fun getTertiaryHex(): String =
        he_scheme_get_tertiary_hex(heSchemePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setTertiaryHex(`value`: String): Unit =
        he_scheme_set_tertiary_hex(heSchemePointer.reinterpret(), `value`)

    public open fun getOnTertiaryHex(): String =
        he_scheme_get_on_tertiary_hex(heSchemePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setOnTertiaryHex(`value`: String): Unit =
        he_scheme_set_on_tertiary_hex(heSchemePointer.reinterpret(), `value`)

    public open fun getTertiaryContainerHex(): String =
        he_scheme_get_tertiary_container_hex(heSchemePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setTertiaryContainerHex(`value`: String): Unit =
        he_scheme_set_tertiary_container_hex(heSchemePointer.reinterpret(), `value`)

    public open fun getOnTertiaryContainerHex(): String =
        he_scheme_get_on_tertiary_container_hex(heSchemePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setOnTertiaryContainerHex(`value`: String): Unit =
        he_scheme_set_on_tertiary_container_hex(heSchemePointer.reinterpret(), `value`)

    public open fun getOutlineHex(): String =
        he_scheme_get_outline_hex(heSchemePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setOutlineHex(`value`: String): Unit =
        he_scheme_set_outline_hex(heSchemePointer.reinterpret(), `value`)

    public open fun getOutlineVariantHex(): String =
        he_scheme_get_outline_variant_hex(heSchemePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setOutlineVariantHex(`value`: String): Unit =
        he_scheme_set_outline_variant_hex(heSchemePointer.reinterpret(), `value`)

    public open fun getShadowHex(): String =
        he_scheme_get_shadow_hex(heSchemePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setShadowHex(`value`: String): Unit =
        he_scheme_set_shadow_hex(heSchemePointer.reinterpret(), `value`)

    public open fun getScrimHex(): String =
        he_scheme_get_scrim_hex(heSchemePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setScrimHex(`value`: String): Unit = he_scheme_set_scrim_hex(heSchemePointer.reinterpret(), `value`)

    public companion object : TypeCompanion<Scheme> {
        override val type: GeneratedClassKGType<Scheme> =
            GeneratedClassKGType(he_scheme_get_type()) { Scheme(it.reinterpret()) }

        init {
            HeTypeProvider.register()
        }
    }
}
