// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
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
public interface StyleProvider : Interface, KGTyped {
    public val gtkStyleProviderPointer: CPointer<GtkStyleProvider>

    /**
     *
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectGtkPrivateChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gtkStyleProviderPointer.reinterpret(),
            "gtk-private-changed",
            connectGtkPrivateChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    private data class Wrapper(
        private val pointer: CPointer<GtkStyleProvider>,
    ) : StyleProvider {
        override val gtkStyleProviderPointer: CPointer<GtkStyleProvider> = pointer
    }

    public companion object : TypeCompanion<StyleProvider> {
        override val type: GeneratedInterfaceKGType<StyleProvider> =
            GeneratedInterfaceKGType(gtk_style_provider_get_type()) {
                Wrapper(it.reinterpret())
            }

        init {
            GtkTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GtkStyleProvider>): StyleProvider = Wrapper(pointer)
    }
}

private val connectGtkPrivateChangedFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()
