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
import org.gtkkn.bindings.gdk.Paintable
import org.gtkkn.bindings.gio.Icon
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gtk.ListBoxRow
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.he.HeSettingsRow
import org.gtkkn.native.he.he_settings_row_get_activatable_widget
import org.gtkkn.native.he.he_settings_row_get_icon
import org.gtkkn.native.he.he_settings_row_get_primary_button
import org.gtkkn.native.he.he_settings_row_get_subtitle
import org.gtkkn.native.he.he_settings_row_get_title
import org.gtkkn.native.he.he_settings_row_get_type
import org.gtkkn.native.he.he_settings_row_new
import org.gtkkn.native.he.he_settings_row_new_with_details
import org.gtkkn.native.he.he_settings_row_set_activatable_widget
import org.gtkkn.native.he.he_settings_row_set_gicon
import org.gtkkn.native.he.he_settings_row_set_icon
import org.gtkkn.native.he.he_settings_row_set_paintable
import org.gtkkn.native.he.he_settings_row_set_primary_button
import org.gtkkn.native.he.he_settings_row_set_subtitle
import org.gtkkn.native.he.he_settings_row_set_title
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - method `title`: Property has no getter nor setter
 * - method `subtitle`: Property has no getter nor setter
 * - method `icon`: Property has no getter nor setter
 * - method `gicon`: Property has no getter nor setter
 * - method `paintable`: Property has no getter nor setter
 * - method `primary-button`: Property has no getter nor setter
 * - method `activatable-widget`: Property has no getter nor setter
 */
public open class SettingsRow(
    pointer: CPointer<HeSettingsRow>,
) : ListBoxRow(pointer.reinterpret()), KGTyped {
    public val heSettingsRowPointer: CPointer<HeSettingsRow>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    public constructor() : this(he_settings_row_new()!!.reinterpret())

    /**
     *
     *
     * @param title
     * @param subtitle
     * @param primaryButton
     */
    public constructor(
        title: String?,
        subtitle: String?,
        primaryButton: Button?,
    ) : this(
        he_settings_row_new_with_details(
            title,
            subtitle,
            primaryButton?.heButtonPointer?.reinterpret()
        )!!.reinterpret()
    )

    public open fun getTitle(): String =
        he_settings_row_get_title(heSettingsRowPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setTitle(`value`: String): Unit =
        he_settings_row_set_title(heSettingsRowPointer.reinterpret(), `value`)

    public open fun getSubtitle(): String =
        he_settings_row_get_subtitle(heSettingsRowPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setSubtitle(`value`: String): Unit =
        he_settings_row_set_subtitle(heSettingsRowPointer.reinterpret(), `value`)

    public open fun getIcon(): String =
        he_settings_row_get_icon(heSettingsRowPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setIcon(`value`: String): Unit =
        he_settings_row_set_icon(heSettingsRowPointer.reinterpret(), `value`)

    /**
     *
     *
     * @param value
     */
    public open fun setGicon(`value`: Icon): Unit =
        he_settings_row_set_gicon(heSettingsRowPointer.reinterpret(), `value`.gioIconPointer)

    /**
     *
     *
     * @param value
     */
    public open fun setPaintable(`value`: Paintable): Unit =
        he_settings_row_set_paintable(
            heSettingsRowPointer.reinterpret(),
            `value`.gdkPaintablePointer
        )

    public open fun getPrimaryButton(): Button =
        he_settings_row_get_primary_button(heSettingsRowPointer.reinterpret())!!.run {
            Button(reinterpret())
        }

    /**
     *
     *
     * @param value
     */
    public open fun setPrimaryButton(`value`: Button): Unit =
        he_settings_row_set_primary_button(
            heSettingsRowPointer.reinterpret(),
            `value`.heButtonPointer.reinterpret()
        )

    public open fun getActivatableWidget(): Widget? =
        he_settings_row_get_activatable_widget(heSettingsRowPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

    /**
     *
     *
     * @param value
     */
    public open fun setActivatableWidget(`value`: Widget?): Unit =
        he_settings_row_set_activatable_widget(
            heSettingsRowPointer.reinterpret(),
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

    public companion object : TypeCompanion<SettingsRow> {
        override val type: GeneratedClassKGType<SettingsRow> =
            GeneratedClassKGType(he_settings_row_get_type()) { SettingsRow(it.reinterpret()) }

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
