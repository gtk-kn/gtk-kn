// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkFlowBoxChild
import org.gtkkn.native.gtk.gtk_flow_box_child_changed
import org.gtkkn.native.gtk.gtk_flow_box_child_get_child
import org.gtkkn.native.gtk.gtk_flow_box_child_get_index
import org.gtkkn.native.gtk.gtk_flow_box_child_get_type
import org.gtkkn.native.gtk.gtk_flow_box_child_is_selected
import org.gtkkn.native.gtk.gtk_flow_box_child_new
import org.gtkkn.native.gtk.gtk_flow_box_child_set_child
import kotlin.Boolean
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkFlowBoxChild` is the kind of widget that can be added to a `GtkFlowBox`.
 */
public open class FlowBoxChild(public val gtkFlowBoxChildPointer: CPointer<GtkFlowBoxChild>) :
    Widget(gtkFlowBoxChildPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * The child widget.
     */
    public open var child: Widget?
        /**
         * Gets the child widget of @self.
         *
         * @return the child widget of @self
         */
        get() = gtk_flow_box_child_get_child(gtkFlowBoxChildPointer)?.run {
            InstanceCache.get(this, true) { Widget.WidgetImpl(reinterpret()) }!!
        }

        /**
         * Sets the child widget of @self.
         *
         * @param child the child widget
         */
        set(child) = gtk_flow_box_child_set_child(gtkFlowBoxChildPointer, child?.gtkWidgetPointer)

    /**
     * Creates a new `GtkFlowBoxChild`.
     *
     * This should only be used as a child of a `GtkFlowBox`.
     *
     * @return a new `GtkFlowBoxChild`
     */
    public constructor() : this(gtk_flow_box_child_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * Marks @child as changed, causing any state that depends on this
     * to be updated.
     *
     * This affects sorting and filtering.
     *
     * Note that calls to this method must be in sync with the data
     * used for the sorting and filtering functions. For instance, if
     * the list is mirroring some external data set, and *two* children
     * changed in the external data set when you call
     * gtk_flow_box_child_changed() on the first child, the sort function
     * must only read the new data for the first of the two changed
     * children, otherwise the resorting of the children will be wrong.
     *
     * This generally means that if you don’t fully control the data
     * model, you have to duplicate the data that affects the sorting
     * and filtering functions into the widgets themselves.
     *
     * Another alternative is to call [method@Gtk.FlowBox.invalidate_sort]
     * on any model change, but that is more expensive.
     */
    public open fun changed(): Unit = gtk_flow_box_child_changed(gtkFlowBoxChildPointer)

    /**
     * Gets the current index of the @child in its `GtkFlowBox` container.
     *
     * @return the index of the @child, or -1 if the @child is not
     *   in a flow box
     */
    public open fun getIndex(): gint = gtk_flow_box_child_get_index(gtkFlowBoxChildPointer)

    /**
     * Returns whether the @child is currently selected in its
     * `GtkFlowBox` container.
     *
     * @return true if @child is selected
     */
    public open fun isSelected(): Boolean = gtk_flow_box_child_is_selected(gtkFlowBoxChildPointer).asBoolean()

    /**
     * Emitted when the user activates a child widget in a `GtkFlowBox`.
     *
     * This can happen either by clicking or double-clicking,
     * or via a keybinding.
     *
     * This is a [keybinding signal](class.SignalAction.html),
     * but it can be used by applications for their own purposes.
     *
     * The default bindings are <kbd>Space</kbd> and <kbd>Enter</kbd>.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onActivate(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkFlowBoxChildPointer,
            "activate",
            onActivateFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "activate" signal. See [onActivate].
     */
    public fun emitActivate() {
        g_signal_emit_by_name(gtkFlowBoxChildPointer.reinterpret(), "activate")
    }

    public companion object : TypeCompanion<FlowBoxChild> {
        override val type: GeneratedClassKGType<FlowBoxChild> =
            GeneratedClassKGType(getTypeOrNull()!!) { FlowBoxChild(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of FlowBoxChild
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_flow_box_child_get_type()

        /**
         * Gets the GType of from the symbol `gtk_flow_box_child_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_flow_box_child_get_type")
    }
}

private val onActivateFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
