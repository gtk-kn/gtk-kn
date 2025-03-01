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
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkCellRendererToggle
import org.gtkkn.native.gtk.gtk_cell_renderer_toggle_get_activatable
import org.gtkkn.native.gtk.gtk_cell_renderer_toggle_get_active
import org.gtkkn.native.gtk.gtk_cell_renderer_toggle_get_radio
import org.gtkkn.native.gtk.gtk_cell_renderer_toggle_get_type
import org.gtkkn.native.gtk.gtk_cell_renderer_toggle_new
import org.gtkkn.native.gtk.gtk_cell_renderer_toggle_set_activatable
import org.gtkkn.native.gtk.gtk_cell_renderer_toggle_set_active
import org.gtkkn.native.gtk.gtk_cell_renderer_toggle_set_radio
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * # ⚠️ Deprecated ⚠️
 *
 * This is deprecated since version 4.10.
 *
 * List views use widgets to display their contents.
 *   You should use [class@Gtk.ToggleButton] instead
 * ---
 *
 * Renders a toggle button in a cell
 *
 * `GtkCellRendererToggle` renders a toggle button in a cell. The
 * button is drawn as a radio or a checkbutton, depending on the
 * `GtkCellRendererToggle:radio` property.
 * When activated, it emits the `GtkCellRendererToggle::toggled` signal.
 *
 * ## Skipped during bindings generation
 *
 * - method `inconsistent`: Property has no getter nor setter
 */
public open class CellRendererToggle(public val gtkCellRendererTogglePointer: CPointer<GtkCellRendererToggle>) :
    CellRenderer(gtkCellRendererTogglePointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    public open var activatable: Boolean
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         * ---
         *
         * Returns whether the cell renderer is activatable. See
         * gtk_cell_renderer_toggle_set_activatable().
         *
         * @return true if the cell renderer is activatable.
         */
        get() = gtk_cell_renderer_toggle_get_activatable(gtkCellRendererTogglePointer).asBoolean()

        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         * ---
         *
         * Makes the cell renderer activatable.
         *
         * @param setting the value to set.
         */
        set(setting) = gtk_cell_renderer_toggle_set_activatable(gtkCellRendererTogglePointer, setting.asGBoolean())

    public open var active: Boolean
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         * ---
         *
         * Returns whether the cell renderer is active. See
         * gtk_cell_renderer_toggle_set_active().
         *
         * @return true if the cell renderer is active.
         */
        get() = gtk_cell_renderer_toggle_get_active(gtkCellRendererTogglePointer).asBoolean()

        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         * ---
         *
         * Activates or deactivates a cell renderer.
         *
         * @param setting the value to set.
         */
        set(setting) = gtk_cell_renderer_toggle_set_active(gtkCellRendererTogglePointer, setting.asGBoolean())

    public open var radio: Boolean
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         * ---
         *
         * Returns whether we’re rendering radio toggles rather than checkboxes.
         *
         * @return true if we’re rendering radio toggles rather than checkboxes
         */
        get() = gtk_cell_renderer_toggle_get_radio(gtkCellRendererTogglePointer).asBoolean()

        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         * ---
         *
         * If @radio is true, the cell renderer renders a radio toggle
         * (i.e. a toggle in a group of mutually-exclusive toggles).
         * If false, it renders a check toggle (a standalone boolean option).
         * This can be set globally for the cell renderer, or changed just
         * before rendering each cell in the model (for `GtkTreeView`, you set
         * up a per-row setting using `GtkTreeViewColumn` to associate model
         * columns with cell renderer properties).
         *
         * @param radio true to make the toggle look like a radio button
         */
        set(radio) = gtk_cell_renderer_toggle_set_radio(gtkCellRendererTogglePointer, radio.asGBoolean())

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     * ---
     *
     * Creates a new `GtkCellRendererToggle`. Adjust rendering
     * parameters using object properties. Object properties can be set
     * globally (with g_object_set()). Also, with `GtkTreeViewColumn`, you
     * can bind a property to a value in a `GtkTreeModel`. For example, you
     * can bind the “active” property on the cell renderer to a boolean value
     * in the model, thus causing the check button to reflect the state of
     * the model.
     *
     * @return the new cell renderer
     */
    public constructor() : this(gtk_cell_renderer_toggle_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * The ::toggled signal is emitted when the cell is toggled.
     *
     * It is the responsibility of the application to update the model
     * with the correct value to store at @path.  Often this is simply the
     * opposite of the value currently stored at @path.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `path` string representation of `GtkTreePath` describing the
     *        event location
     */
    public fun onToggled(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (path: String) -> Unit): ULong =
        g_signal_connect_data(
            gtkCellRendererTogglePointer,
            "toggled",
            onToggledFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "toggled" signal. See [onToggled].
     *
     * @param path string representation of `GtkTreePath` describing the
     *        event location
     */
    public fun emitToggled(path: String) {
        g_signal_emit_by_name(gtkCellRendererTogglePointer.reinterpret(), "toggled", path.cstr)
    }

    public companion object : TypeCompanion<CellRendererToggle> {
        override val type: GeneratedClassKGType<CellRendererToggle> =
            GeneratedClassKGType(getTypeOrNull()!!) { CellRendererToggle(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of CellRendererToggle
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_cell_renderer_toggle_get_type()

        /**
         * Gets the GType of from the symbol `gtk_cell_renderer_toggle_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_cell_renderer_toggle_get_type")
    }
}

private val onToggledFunc: CPointer<CFunction<(CPointer<ByteVar>) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        path: CPointer<ByteVar>?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<
        (
            path: String,
        ) -> Unit
        >().get().invoke(path?.toKString() ?: error("Expected not null string"))
}
    .reinterpret()
