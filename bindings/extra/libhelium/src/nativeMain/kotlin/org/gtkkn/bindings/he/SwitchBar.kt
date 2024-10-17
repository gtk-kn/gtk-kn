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
import org.gtkkn.native.he.HeSwitchBar
import org.gtkkn.native.he.he_switch_bar_get_sensitive_widget
import org.gtkkn.native.he.he_switch_bar_get_subtitle
import org.gtkkn.native.he.he_switch_bar_get_title
import org.gtkkn.native.he.he_switch_bar_get_type
import org.gtkkn.native.he.he_switch_bar_new
import org.gtkkn.native.he.he_switch_bar_set_sensitive_widget
import org.gtkkn.native.he.he_switch_bar_set_subtitle
import org.gtkkn.native.he.he_switch_bar_set_title
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - method `title`: Property has no getter nor setter
 * - method `subtitle`: Property has no getter nor setter
 * - method `sensitive-widget`: Property has no getter nor setter
 */
public open class SwitchBar(
    pointer: CPointer<HeSwitchBar>,
) : Bin(pointer.reinterpret()), KGTyped {
    public val heSwitchBarPointer: CPointer<HeSwitchBar>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    public constructor() : this(he_switch_bar_new()!!.reinterpret())

    public open fun getTitle(): String =
        he_switch_bar_get_title(heSwitchBarPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setTitle(`value`: String): Unit = he_switch_bar_set_title(heSwitchBarPointer.reinterpret(), `value`)

    public open fun getSubtitle(): String =
        he_switch_bar_get_subtitle(heSwitchBarPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setSubtitle(`value`: String): Unit =
        he_switch_bar_set_subtitle(heSwitchBarPointer.reinterpret(), `value`)

    public open fun getSensitiveWidget(): Widget? =
        he_switch_bar_get_sensitive_widget(heSwitchBarPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

    /**
     *
     *
     * @param value
     */
    public open fun setSensitiveWidget(`value`: Widget?): Unit =
        he_switch_bar_set_sensitive_widget(
            heSwitchBarPointer.reinterpret(),
            `value`?.gtkWidgetPointer?.reinterpret()
        )

    /**
     *
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectActivated(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "activated",
            connectActivatedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<SwitchBar> {
        override val type: GeneratedClassKGType<SwitchBar> =
            GeneratedClassKGType(he_switch_bar_get_type()) { SwitchBar(it.reinterpret()) }

        init {
            HeTypeProvider.register()
        }
    }
}

private val connectActivatedFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()
