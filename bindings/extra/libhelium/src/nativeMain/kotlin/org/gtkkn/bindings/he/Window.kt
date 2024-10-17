// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.he.HeWindow
import org.gtkkn.native.he.he_window_get_has_back_button
import org.gtkkn.native.he.he_window_get_has_title
import org.gtkkn.native.he.he_window_get_parent
import org.gtkkn.native.he.he_window_get_type
import org.gtkkn.native.he.he_window_new
import org.gtkkn.native.he.he_window_set_has_back_button
import org.gtkkn.native.he.he_window_set_has_title
import org.gtkkn.native.he.he_window_set_parent
import kotlin.Boolean
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - method `parent`: Property has no getter nor setter
 * - method `has-title`: Property has no getter nor setter
 * - method `has-back-button`: Property has no getter nor setter
 */
public open class Window(
    pointer: CPointer<HeWindow>,
) : org.gtkkn.bindings.gtk.Window(pointer.reinterpret()), KGTyped {
    public val heWindowPointer: CPointer<HeWindow>
        get() = gPointer.reinterpret()

    public constructor() : this(he_window_new()!!.reinterpret())

    public open fun getParent_(): org.gtkkn.bindings.gtk.Window? =
        he_window_get_parent(heWindowPointer.reinterpret())?.run {
            org.gtkkn.bindings.gtk.Window(reinterpret())
        }

    /**
     *
     *
     * @param value
     */
    public open fun setParent_(`value`: org.gtkkn.bindings.gtk.Window?): Unit =
        he_window_set_parent(
            heWindowPointer.reinterpret(),
            `value`?.gtkWindowPointer?.reinterpret()
        )

    public open fun getHasTitle(): Boolean = he_window_get_has_title(heWindowPointer.reinterpret()).asBoolean()

    /**
     *
     *
     * @param value
     */
    public open fun setHasTitle(`value`: Boolean): Unit =
        he_window_set_has_title(heWindowPointer.reinterpret(), `value`.asGBoolean())

    public open fun getHasBackButton(): Boolean =
        he_window_get_has_back_button(heWindowPointer.reinterpret()).asBoolean()

    /**
     *
     *
     * @param value
     */
    public open fun setHasBackButton(`value`: Boolean): Unit =
        he_window_set_has_back_button(heWindowPointer.reinterpret(), `value`.asGBoolean())

    public companion object : TypeCompanion<Window> {
        override val type: GeneratedClassKGType<Window> =
            GeneratedClassKGType(he_window_get_type()) { Window(it.reinterpret()) }

        init {
            HeTypeProvider.register()
        }
    }
}
