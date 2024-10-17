// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.he.HeOverlayButton
import org.gtkkn.native.he.he_overlay_button_get_alignment
import org.gtkkn.native.he.he_overlay_button_get_color
import org.gtkkn.native.he.he_overlay_button_get_icon
import org.gtkkn.native.he.he_overlay_button_get_label
import org.gtkkn.native.he.he_overlay_button_get_primary_tooltip
import org.gtkkn.native.he.he_overlay_button_get_secondary_color
import org.gtkkn.native.he.he_overlay_button_get_secondary_icon
import org.gtkkn.native.he.he_overlay_button_get_secondary_tooltip
import org.gtkkn.native.he.he_overlay_button_get_size
import org.gtkkn.native.he.he_overlay_button_get_type
import org.gtkkn.native.he.he_overlay_button_get_typeb
import org.gtkkn.native.he.he_overlay_button_get_typeb2
import org.gtkkn.native.he.he_overlay_button_new
import org.gtkkn.native.he.he_overlay_button_set_alignment
import org.gtkkn.native.he.he_overlay_button_set_child
import org.gtkkn.native.he.he_overlay_button_set_color
import org.gtkkn.native.he.he_overlay_button_set_icon
import org.gtkkn.native.he.he_overlay_button_set_label
import org.gtkkn.native.he.he_overlay_button_set_primary_tooltip
import org.gtkkn.native.he.he_overlay_button_set_secondary_color
import org.gtkkn.native.he.he_overlay_button_set_secondary_icon
import org.gtkkn.native.he.he_overlay_button_set_secondary_tooltip
import org.gtkkn.native.he.he_overlay_button_set_size
import org.gtkkn.native.he.he_overlay_button_set_typeb
import org.gtkkn.native.he.he_overlay_button_set_typeb2
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - method `get_child`: C function he_overlay_button_get_child is ignored
 * - method `size`: Property has no getter nor setter
 * - method `typeb`: Property has no getter nor setter
 * - method `typeb2`: Property has no getter nor setter
 * - method `color`: Property has no getter nor setter
 * - method `secondary-color`: Property has no getter nor setter
 * - method `secondary-icon`: Property has no getter nor setter
 * - method `icon`: Property has no getter nor setter
 * - method `label`: Property has no getter nor setter
 * - method `primary-tooltip`: Property has no getter nor setter
 * - method `secondary-tooltip`: Property has no getter nor setter
 * - method `child`: Property has no getter nor setter
 * - method `alignment`: Property has no getter nor setter
 */
public open class OverlayButton(
    pointer: CPointer<HeOverlayButton>,
) : Bin(pointer.reinterpret()), KGTyped {
    public val heOverlayButtonPointer: CPointer<HeOverlayButton>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    /**
     *
     *
     * @param icon
     * @param label
     * @param secondaryIcon
     */
    public constructor(
        icon: String,
        label: String?,
        secondaryIcon: String?,
    ) : this(he_overlay_button_new(icon, label, secondaryIcon)!!.reinterpret())

    public open fun getSize_(): OverlayButtonSize =
        he_overlay_button_get_size(heOverlayButtonPointer.reinterpret()).run {
            OverlayButtonSize.fromNativeValue(this)
        }

    /**
     *
     *
     * @param value
     */
    public open fun setSize(`value`: OverlayButtonSize): Unit =
        he_overlay_button_set_size(heOverlayButtonPointer.reinterpret(), `value`.nativeValue)

    public open fun getTypeb(): OverlayButtonTypeButton =
        he_overlay_button_get_typeb(heOverlayButtonPointer.reinterpret()).run {
            OverlayButtonTypeButton.fromNativeValue(this)
        }

    /**
     *
     *
     * @param value
     */
    public open fun setTypeb(`value`: OverlayButtonTypeButton): Unit =
        he_overlay_button_set_typeb(heOverlayButtonPointer.reinterpret(), `value`.nativeValue)

    public open fun getTypeb2(): OverlayButtonTypeButton =
        he_overlay_button_get_typeb2(heOverlayButtonPointer.reinterpret()).run {
            OverlayButtonTypeButton.fromNativeValue(this)
        }

    /**
     *
     *
     * @param value
     */
    public open fun setTypeb2(`value`: OverlayButtonTypeButton): Unit =
        he_overlay_button_set_typeb2(heOverlayButtonPointer.reinterpret(), `value`.nativeValue)

    public open fun getColor_(): Colors =
        he_overlay_button_get_color(heOverlayButtonPointer.reinterpret()).run {
            Colors.fromNativeValue(this)
        }

    /**
     *
     *
     * @param value
     */
    public open fun setColor(`value`: Colors): Unit =
        he_overlay_button_set_color(heOverlayButtonPointer.reinterpret(), `value`.nativeValue)

    public open fun getSecondaryColor(): Colors =
        he_overlay_button_get_secondary_color(heOverlayButtonPointer.reinterpret()).run {
            Colors.fromNativeValue(this)
        }

    /**
     *
     *
     * @param value
     */
    public open fun setSecondaryColor(`value`: Colors): Unit =
        he_overlay_button_set_secondary_color(
            heOverlayButtonPointer.reinterpret(),
            `value`.nativeValue
        )

    public open fun getSecondaryIcon(): String =
        he_overlay_button_get_secondary_icon(heOverlayButtonPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setSecondaryIcon(`value`: String?): Unit =
        he_overlay_button_set_secondary_icon(heOverlayButtonPointer.reinterpret(), `value`)

    public open fun getIcon(): String =
        he_overlay_button_get_icon(heOverlayButtonPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setIcon(`value`: String): Unit =
        he_overlay_button_set_icon(heOverlayButtonPointer.reinterpret(), `value`)

    public open fun getLabel(): String? = he_overlay_button_get_label(heOverlayButtonPointer.reinterpret())?.toKString()

    /**
     *
     *
     * @param value
     */
    public open fun setLabel(`value`: String?): Unit =
        he_overlay_button_set_label(heOverlayButtonPointer.reinterpret(), `value`)

    public open fun getPrimaryTooltip(): String =
        he_overlay_button_get_primary_tooltip(heOverlayButtonPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setPrimaryTooltip(`value`: String): Unit =
        he_overlay_button_set_primary_tooltip(heOverlayButtonPointer.reinterpret(), `value`)

    public open fun getSecondaryTooltip(): String =
        he_overlay_button_get_secondary_tooltip(heOverlayButtonPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setSecondaryTooltip(`value`: String): Unit =
        he_overlay_button_set_secondary_tooltip(heOverlayButtonPointer.reinterpret(), `value`)

    /**
     *
     *
     * @param value
     */
    public open fun setChild_(`value`: Widget?): Unit =
        he_overlay_button_set_child(
            heOverlayButtonPointer.reinterpret(),
            `value`?.gtkWidgetPointer?.reinterpret()
        )

    public open fun getAlignment(): OverlayButtonAlignment =
        he_overlay_button_get_alignment(heOverlayButtonPointer.reinterpret()).run {
            OverlayButtonAlignment.fromNativeValue(this)
        }

    /**
     *
     *
     * @param value
     */
    public open fun setAlignment(`value`: OverlayButtonAlignment): Unit =
        he_overlay_button_set_alignment(
            heOverlayButtonPointer.reinterpret(),
            `value`.nativeValue
        )

    /**
     *
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectClicked(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "clicked",
            connectClickedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     *
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectSecondaryClicked(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "secondary-clicked",
            connectSecondaryClickedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<OverlayButton> {
        override val type: GeneratedClassKGType<OverlayButton> =
            GeneratedClassKGType(he_overlay_button_get_type()) {
                OverlayButton(it.reinterpret())
            }

        init {
            HeTypeProvider.register()
        }
    }
}

private val connectClickedFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()

private val connectSecondaryClickedFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()
