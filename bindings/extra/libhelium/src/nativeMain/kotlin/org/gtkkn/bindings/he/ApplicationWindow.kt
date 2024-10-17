// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.he.HeApplicationWindow
import org.gtkkn.native.he.he_application_window_get_has_back_button
import org.gtkkn.native.he.he_application_window_get_has_title
import org.gtkkn.native.he.he_application_window_get_type
import org.gtkkn.native.he.he_application_window_new
import org.gtkkn.native.he.he_application_window_set_has_back_button
import org.gtkkn.native.he.he_application_window_set_has_title
import kotlin.Boolean
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - method `has-title`: Property has no getter nor setter
 * - method `has-back-button`: Property has no getter nor setter
 */
public open class ApplicationWindow(
    pointer: CPointer<HeApplicationWindow>,
) : org.gtkkn.bindings.gtk.ApplicationWindow(pointer.reinterpret()), KGTyped {
    public val heApplicationWindowPointer: CPointer<HeApplicationWindow>
        get() = gPointer.reinterpret()

    /**
     *
     *
     * @param app
     */
    public constructor(app: Application) :
        this(he_application_window_new(app.heApplicationPointer.reinterpret())!!.reinterpret())

    public open fun getHasTitle(): Boolean =
        he_application_window_get_has_title(heApplicationWindowPointer.reinterpret()).asBoolean()

    /**
     *
     *
     * @param value
     */
    public open fun setHasTitle(`value`: Boolean): Unit =
        he_application_window_set_has_title(
            heApplicationWindowPointer.reinterpret(),
            `value`.asGBoolean()
        )

    public open fun getHasBackButton(): Boolean =
        he_application_window_get_has_back_button(heApplicationWindowPointer.reinterpret()).asBoolean()

    /**
     *
     *
     * @param value
     */
    public open fun setHasBackButton(`value`: Boolean): Unit =
        he_application_window_set_has_back_button(
            heApplicationWindowPointer.reinterpret(),
            `value`.asGBoolean()
        )

    public companion object : TypeCompanion<ApplicationWindow> {
        override val type: GeneratedClassKGType<ApplicationWindow> =
            GeneratedClassKGType(he_application_window_get_type()) {
                ApplicationWindow(it.reinterpret())
            }

        init {
            HeTypeProvider.register()
        }
    }
}
