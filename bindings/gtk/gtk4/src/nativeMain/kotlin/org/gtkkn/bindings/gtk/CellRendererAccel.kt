// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.cstr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gdk.ModifierType
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkModifierType
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkCellRendererAccel
import org.gtkkn.native.gtk.gtk_cell_renderer_accel_get_type
import org.gtkkn.native.gtk.gtk_cell_renderer_accel_new
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * Renders a keyboard accelerator in a cell
 *
 * `GtkCellRendererAccel` displays a keyboard accelerator (i.e. a key
 * combination like `Control + a`). If the cell renderer is editable,
 * the accelerator can be changed by simply typing the new combination.
 *
 * ## Skipped during bindings generation
 *
 * - method `accel-key`: Property has no getter nor setter
 * - method `accel-mode`: Property has no getter nor setter
 * - method `accel-mods`: Property has no getter nor setter
 * - method `keycode`: Property has no getter nor setter
 */
public open class CellRendererAccel(public val gtkCellRendererAccelPointer: CPointer<GtkCellRendererAccel>) :
    CellRendererText(gtkCellRendererAccelPointer.reinterpret()),
    KGTyped {
    /**
     * Creates a new `GtkCellRendererAccel`.
     *
     * @return the new cell renderer
     */
    public constructor() : this(gtk_cell_renderer_accel_new()!!.reinterpret())

    /**
     * Gets emitted when the user has removed the accelerator.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `pathString` the path identifying the row of the edited cell
     */
    public fun onAccelCleared(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (pathString: String) -> Unit,
    ): ULong = g_signal_connect_data(
        gtkCellRendererAccelPointer,
        "accel-cleared",
        onAccelClearedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "accel-cleared" signal. See [onAccelCleared].
     *
     * @param pathString the path identifying the row of the edited cell
     */
    public fun emitAccelCleared(pathString: String) {
        g_signal_emit_by_name(gtkCellRendererAccelPointer.reinterpret(), "accel-cleared", pathString.cstr)
    }

    /**
     * Gets emitted when the user has selected a new accelerator.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `pathString` the path identifying the row of the edited cell; `accelKey` the new accelerator keyval; `accelMods` the new accelerator modifier mask; `hardwareKeycode` the keycode of the new accelerator
     */
    public fun onAccelEdited(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            pathString: String,
            accelKey: guint,
            accelMods: ModifierType,
            hardwareKeycode: guint,
        ) -> Unit,
    ): ULong = g_signal_connect_data(
        gtkCellRendererAccelPointer,
        "accel-edited",
        onAccelEditedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "accel-edited" signal. See [onAccelEdited].
     *
     * @param pathString the path identifying the row of the edited cell
     * @param accelKey the new accelerator keyval
     * @param accelMods the new accelerator modifier mask
     * @param hardwareKeycode the keycode of the new accelerator
     */
    public fun emitAccelEdited(pathString: String, accelKey: guint, accelMods: ModifierType, hardwareKeycode: guint) {
        g_signal_emit_by_name(
            gtkCellRendererAccelPointer.reinterpret(),
            "accel-edited",
            pathString.cstr,
            accelKey,
            accelMods.mask,
            hardwareKeycode
        )
    }

    public companion object : TypeCompanion<CellRendererAccel> {
        override val type: GeneratedClassKGType<CellRendererAccel> =
            GeneratedClassKGType(getTypeOrNull("gtk_cell_renderer_accel_get_type")!!) {
                CellRendererAccel(it.reinterpret())
            }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of CellRendererAccel
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_cell_renderer_accel_get_type()
    }
}

private val onAccelClearedFunc: CPointer<CFunction<(CPointer<ByteVar>) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        pathString: CPointer<ByteVar>?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(pathString: String) -> Unit>().get().invoke(
        pathString?.toKString() ?: error("Expected not null string")
    )
}
    .reinterpret()

private val onAccelEditedFunc: CPointer<
    CFunction<
        (
            CPointer<ByteVar>,
            guint,
            GdkModifierType,
            guint,
        ) -> Unit
        >
    > = staticCFunction {
        _: COpaquePointer,
        pathString: CPointer<ByteVar>?,
        accelKey: guint,
        accelMods: GdkModifierType,
        hardwareKeycode: guint,
        userData: COpaquePointer,
    ->
    userData.asStableRef<
        (
            pathString: String,
            accelKey: guint,
            accelMods: ModifierType,
            hardwareKeycode: guint,
        ) -> Unit
        >().get().invoke(
        pathString?.toKString() ?: error("Expected not null string"),
        accelKey,
        accelMods.run {
            ModifierType(this)
        },
        hardwareKeycode
    )
}
    .reinterpret()
