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
import org.gtkkn.bindings.gdk.Display
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkATContext
import org.gtkkn.native.gtk.gtk_at_context_create
import org.gtkkn.native.gtk.gtk_at_context_get_accessible
import org.gtkkn.native.gtk.gtk_at_context_get_accessible_role
import org.gtkkn.native.gtk.gtk_at_context_get_type
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkATContext` is an abstract class provided by GTK to communicate to
 * platform-specific assistive technologies API.
 *
 * Each platform supported by GTK implements a `GtkATContext` subclass, and
 * is responsible for updating the accessible state in response to state
 * changes in `GtkAccessible`.
 *
 * ## Skipped during bindings generation
 *
 * - method `display`: Property has no getter nor setter
 */
public abstract class AtContext(public val gtkAtContextPointer: CPointer<GtkATContext>) :
    Object(gtkAtContextPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    /**
     * The `GtkAccessible` that created the `GtkATContext` instance.
     */
    public open val accessible: Accessible
        /**
         * Retrieves the `GtkAccessible` using this context.
         *
         * @return a `GtkAccessible`
         */
        get() = gtk_at_context_get_accessible(gtkAtContextPointer)!!.run {
            Accessible.AccessibleImpl(reinterpret())
        }

    /**
     * The accessible role used by the AT context.
     *
     * Depending on the given role, different states and properties can be
     * set or retrieved.
     */
    public open val accessibleRole: AccessibleRole
        /**
         * Retrieves the accessible role of this context.
         *
         * @return a `GtkAccessibleRole`
         */
        get() = gtk_at_context_get_accessible_role(gtkAtContextPointer).run {
            AccessibleRole.fromNativeValue(this)
        }

    /**
     * Creates a new `GtkATContext` instance for the given accessible role,
     * accessible instance, and display connection.
     *
     * The `GtkATContext` implementation being instantiated will depend on the
     * platform.
     *
     * @param accessibleRole the accessible role used by the `GtkATContext`
     * @param accessible the `GtkAccessible` implementation using the `GtkATContext`
     * @param display the `GdkDisplay` used by the `GtkATContext`
     * @return the `GtkATContext`
     */
    public constructor(
        accessibleRole: AccessibleRole,
        accessible: Accessible,
        display: Display,
    ) : this(
        gtk_at_context_create(
            accessibleRole.nativeValue,
            accessible.gtkAccessiblePointer,
            display.gdkDisplayPointer
        )!!.reinterpret()
    ) {
        InstanceCache.put(this)
    }

    /**
     * Emitted when the attributes of the accessible for the
     * `GtkATContext` instance change.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onStateChange(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkAtContextPointer,
            "state-change",
            onStateChangeFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "state-change" signal. See [onStateChange].
     */
    public fun emitStateChange() {
        g_signal_emit_by_name(gtkAtContextPointer.reinterpret(), "state-change")
    }

    /**
     * The AtContextImpl type represents a native instance of the abstract AtContext class.
     *
     * @constructor Creates a new instance of AtContext for the provided [CPointer].
     */
    public class AtContextImpl(pointer: CPointer<GtkATContext>) : AtContext(pointer)

    public companion object : TypeCompanion<AtContext> {
        override val type: GeneratedClassKGType<AtContext> =
            GeneratedClassKGType(getTypeOrNull()!!) { AtContextImpl(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of ATContext
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_at_context_get_type()

        /**
         * Gets the GType of from the symbol `gtk_at_context_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_at_context_get_type")
    }
}

private val onStateChangeFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
