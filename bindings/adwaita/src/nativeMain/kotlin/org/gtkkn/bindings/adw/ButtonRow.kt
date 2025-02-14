// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.adw.annotations.AdwVersion1_6
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.adw.AdwButtonRow
import org.gtkkn.native.adw.adw_button_row_get_end_icon_name
import org.gtkkn.native.adw.adw_button_row_get_start_icon_name
import org.gtkkn.native.adw.adw_button_row_get_type
import org.gtkkn.native.adw.adw_button_row_new
import org.gtkkn.native.adw.adw_button_row_set_end_icon_name
import org.gtkkn.native.adw.adw_button_row_set_start_icon_name
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkActionable
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * A [class@Gtk.ListBoxRow] that looks like a button.
 *
 * <picture>
 *   <source srcset="button-rows-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="button-rows.png" alt="button-rows">
 * </picture>
 *
 * The `AdwButtonRow` widget has a title and two icons: before and after the
 * title.
 *
 * It is convenient for presenting actions like "Delete" at the end of a boxed
 * list.
 *
 * `AdwButtonRow` is always activatable.
 *
 * ## CSS nodes
 *
 * `AdwButtonRow` has a main CSS node with name `row` and the style class
 * `.button`.
 *
 * It contains the subnode `box` for its main horizontal box, which contains the
 * nodes: `image.icon.start` for the start icon, `label.title` for the title,
 * and `image.icon.end` for the end icon.
 *
 * ## Style classes
 *
 * The [`.suggested-action`](style-classes.html#suggested-action) style class
 * makes `AdwButtonRow` use accent color for its background. It should be used
 * very sparingly to denote important buttons.
 *
 * <picture>
 *   <source srcset="button-row-suggested-action-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="button-row-suggested-action.png" alt="button-row-suggested-action">
 * </picture>
 *
 * The [`.destructive-action`](style-classes.html#destructive-action) style
 * makes the row use destructive colors. It can be used to draw attention to the
 * potentially damaging consequences of using it. This style acts as a warning
 * to the user.
 *
 * <picture>
 *   <source srcset="button-row-destructive-action-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="button-row-destructive-action.png" alt="button-row-destructive-action">
 * </picture>
 * @since 1.6
 */
@AdwVersion1_6
public class ButtonRow(public val adwButtonRowPointer: CPointer<AdwButtonRow>) :
    PreferencesRow(adwButtonRowPointer.reinterpret()),
    KGTyped {
    init {
        Adw
    }

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkActionablePointer: CPointer<GtkActionable>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * The icon name to show after the title.
     *
     * @since 1.6
     */
    @AdwVersion1_6
    public var endIconName: String?
        /**
         * Gets the end icon name for @self.
         *
         * @return the end icon name for @self
         * @since 1.6
         */
        get() = adw_button_row_get_end_icon_name(adwButtonRowPointer)?.toKString()

        /**
         * Sets the end icon name for @self.
         *
         * @param iconName the end icon name
         * @since 1.6
         */
        @AdwVersion1_6
        set(iconName) = adw_button_row_set_end_icon_name(adwButtonRowPointer, iconName)

    /**
     * The icon name to show before the title.
     *
     * @since 1.6
     */
    @AdwVersion1_6
    public var startIconName: String?
        /**
         * Gets the start icon name for @self.
         *
         * @return the start icon name for @self
         * @since 1.6
         */
        get() = adw_button_row_get_start_icon_name(adwButtonRowPointer)?.toKString()

        /**
         * Sets the start icon name for @self.
         *
         * @param iconName the start icon name
         * @since 1.6
         */
        @AdwVersion1_6
        set(iconName) = adw_button_row_set_start_icon_name(adwButtonRowPointer, iconName)

    /**
     * Creates a new `AdwButtonRow`.
     *
     * @return the newly created `AdwButtonRow`
     * @since 1.6
     */
    public constructor() : this(adw_button_row_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * This signal is emitted after the row has been activated.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 1.6
     */
    @AdwVersion1_6
    public fun onActivated(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            adwButtonRowPointer,
            "activated",
            onActivatedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "activated" signal. See [onActivated].
     *
     * @since 1.6
     */
    @AdwVersion1_6
    public fun emitActivated() {
        g_signal_emit_by_name(adwButtonRowPointer.reinterpret(), "activated")
    }

    public companion object : TypeCompanion<ButtonRow> {
        override val type: GeneratedClassKGType<ButtonRow> =
            GeneratedClassKGType(getTypeOrNull()!!) { ButtonRow(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of ButtonRow
         *
         * @return the GType
         */
        public fun getType(): GType = adw_button_row_get_type()

        /**
         * Gets the GType of from the symbol `adw_button_row_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("adw_button_row_get_type")
    }
}

private val onActivatedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
