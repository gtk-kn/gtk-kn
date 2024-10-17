// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.ApplicationFlags
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.he.HeApplication
import org.gtkkn.native.he.he_application_get_default_font_weight
import org.gtkkn.native.he.he_application_get_type
import org.gtkkn.native.he.he_application_new
import org.gtkkn.native.he.he_application_set_default_font_weight
import kotlin.Double
import kotlin.String
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - method `get_default_accent_color`: Return type He.HeRGBColor is unsupported
 * - parameter `value`: He.HeRGBColor
 * - parameter `result`: result: Out parameter is not supported
 * - parameter `result`: result: Out parameter is not supported
 * - parameter `result`: result: Out parameter is not supported
 * - method `default-accent-color`: Property has no getter nor setter
 * - method `default-font-weight`: Property has no getter nor setter
 * - method `accent-color`: Property has no getter nor setter
 * - method `foreground`: Property has no getter nor setter
 * - method `accent-foreground`: Property has no getter nor setter
 */
public open class Application(
    pointer: CPointer<HeApplication>,
) : org.gtkkn.bindings.gtk.Application(pointer.reinterpret()), KGTyped {
    public val heApplicationPointer: CPointer<HeApplication>
        get() = gPointer.reinterpret()

    /**
     *
     *
     * @param applicationId
     * @param flags
     */
    public constructor(applicationId: String?, flags: ApplicationFlags) :
        this(he_application_new(applicationId, flags.mask)!!.reinterpret())

    public open fun getDefaultFontWeight(): Double =
        he_application_get_default_font_weight(heApplicationPointer.reinterpret())

    /**
     *
     *
     * @param value
     */
    public open fun setDefaultFontWeight(`value`: Double): Unit =
        he_application_set_default_font_weight(heApplicationPointer.reinterpret(), `value`)

    public companion object : TypeCompanion<Application> {
        override val type: GeneratedClassKGType<Application> =
            GeneratedClassKGType(he_application_get_type()) { Application(it.reinterpret()) }

        init {
            HeTypeProvider.register()
        }
    }
}
