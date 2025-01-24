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
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkStyleProvider
import org.gtkkn.native.gtk.gtk_style_provider_get_type
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkStyleProvider` is an interface for style information used by
 * `GtkStyleContext`.
 *
 * See [method@Gtk.StyleContext.add_provider] and
 * [func@Gtk.StyleContext.add_provider_for_display] for
 * adding `GtkStyleProviders`.
 *
 * GTK uses the `GtkStyleProvider` implementation for CSS in
 * [class@Gtk.CssProvider].
 */
public interface StyleProvider :
    Proxy,
    KGTyped {
    public val gtkStyleProviderPointer: CPointer<GtkStyleProvider>

    /**
     *
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onGtkPrivateChanged(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkStyleProviderPointer,
            "gtk-private-changed",
            onGtkPrivateChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The StyleProviderImpl type represents a native instance of the StyleProvider interface.
     *
     * @constructor Creates a new instance of StyleProvider for the provided [CPointer].
     */
    public data class StyleProviderImpl(override val gtkStyleProviderPointer: CPointer<GtkStyleProvider>) :
        Object(gtkStyleProviderPointer.reinterpret()),
        StyleProvider

    public companion object : TypeCompanion<StyleProvider> {
        override val type: GeneratedInterfaceKGType<StyleProvider> =
            GeneratedInterfaceKGType(gtk_style_provider_get_type()) { StyleProviderImpl(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of StyleProvider
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_style_provider_get_type()
    }
}

private val onGtkPrivateChangedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
