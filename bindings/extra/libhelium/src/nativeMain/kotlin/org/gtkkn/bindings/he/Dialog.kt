// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.he.HeDialog
import org.gtkkn.native.he.he_dialog_add
import org.gtkkn.native.he.he_dialog_get_icon
import org.gtkkn.native.he.he_dialog_get_info
import org.gtkkn.native.he.he_dialog_get_primary_button
import org.gtkkn.native.he.he_dialog_get_secondary_button
import org.gtkkn.native.he.he_dialog_get_title
import org.gtkkn.native.he.he_dialog_get_type
import org.gtkkn.native.he.he_dialog_new
import org.gtkkn.native.he.he_dialog_set_icon
import org.gtkkn.native.he.he_dialog_set_info
import org.gtkkn.native.he.he_dialog_set_primary_button
import org.gtkkn.native.he.he_dialog_set_secondary_button
import org.gtkkn.native.he.he_dialog_set_title
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - method `title`: Property has no getter nor setter
 * - method `info`: Property has no getter nor setter
 * - method `icon`: Property has no getter nor setter
 * - method `secondary-button`: Property has no getter nor setter
 * - method `primary-button`: Property has no getter nor setter
 */
public open class Dialog(
    pointer: CPointer<HeDialog>,
) : Window(pointer.reinterpret()), KGTyped {
    public val heDialogPointer: CPointer<HeDialog>
        get() = gPointer.reinterpret()

    /**
     *
     *
     * @param modal
     * @param parent
     * @param title
     * @param subtitle
     * @param info
     * @param icon
     * @param primaryButton
     * @param secondaryButton
     */
    public constructor(
        modal: Boolean,
        parent: org.gtkkn.bindings.gtk.Window?,
        title: String,
        subtitle: String,
        info: String,
        icon: String,
        primaryButton: FillButton?,
        secondaryButton: TintButton?,
    ) : this(
        he_dialog_new(
            modal.asGBoolean(),
            parent?.gtkWindowPointer?.reinterpret(),
            title,
            subtitle,
            info,
            icon,
            primaryButton?.heFillButtonPointer?.reinterpret(),
            secondaryButton?.heTintButtonPointer?.reinterpret()
        )!!.reinterpret()
    )

    public open fun getTitle_(): String =
        he_dialog_get_title(heDialogPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setTitle_(`value`: String): Unit = he_dialog_set_title(heDialogPointer.reinterpret(), `value`)

    public open fun getInfo(): String =
        he_dialog_get_info(heDialogPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setInfo(`value`: String): Unit = he_dialog_set_info(heDialogPointer.reinterpret(), `value`)

    public open fun getIcon(): String =
        he_dialog_get_icon(heDialogPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setIcon(`value`: String): Unit = he_dialog_set_icon(heDialogPointer.reinterpret(), `value`)

    public open fun getSecondaryButton(): TintButton =
        he_dialog_get_secondary_button(heDialogPointer.reinterpret())!!.run {
            TintButton(reinterpret())
        }

    /**
     *
     *
     * @param value
     */
    public open fun setSecondaryButton(`value`: TintButton): Unit =
        he_dialog_set_secondary_button(
            heDialogPointer.reinterpret(),
            `value`.heTintButtonPointer.reinterpret()
        )

    public open fun getPrimaryButton(): FillButton =
        he_dialog_get_primary_button(heDialogPointer.reinterpret())!!.run {
            FillButton(reinterpret())
        }

    /**
     *
     *
     * @param value
     */
    public open fun setPrimaryButton(`value`: FillButton): Unit =
        he_dialog_set_primary_button(
            heDialogPointer.reinterpret(),
            `value`.heFillButtonPointer.reinterpret()
        )

    /**
     *
     *
     * @param widget
     */
    public open fun add(widget: Widget): Unit =
        he_dialog_add(
            heDialogPointer.reinterpret(),
            widget.gtkWidgetPointer.reinterpret()
        )

    public companion object : TypeCompanion<Dialog> {
        override val type: GeneratedClassKGType<Dialog> =
            GeneratedClassKGType(he_dialog_get_type()) { Dialog(it.reinterpret()) }

        init {
            HeTypeProvider.register()
        }
    }
}
