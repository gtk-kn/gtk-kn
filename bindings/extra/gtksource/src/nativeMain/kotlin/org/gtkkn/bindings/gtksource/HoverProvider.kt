// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.AsyncReadyCallback
import org.gtkkn.bindings.gio.AsyncReadyCallbackFunc
import org.gtkkn.bindings.gio.AsyncResult
import org.gtkkn.bindings.gio.Cancellable
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gtksource.Gtksource.resolveException
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gtksource.GtkSourceHoverProvider
import org.gtkkn.native.gtksource.gtk_source_hover_provider_get_type
import org.gtkkn.native.gtksource.gtk_source_hover_provider_populate_async
import org.gtkkn.native.gtksource.gtk_source_hover_provider_populate_finish
import kotlin.Boolean
import kotlin.Result
import kotlin.Unit

/**
 * Interface to populate interactive tooltips.
 *
 * `GtkSourceHoverProvider` is an interface that should be implemented to extend
 * the contents of a [class@HoverDisplay]. This is typical in editors that
 * interact external tooling such as those utilizing Language Server Protocol.
 *
 * If you can populate the [class@HoverDisplay] synchronously, use
 * [vfunc@HoverProvider.populate]. Otherwise, interface implementations that
 * may take additional time should use [vfunc@HoverProvider.populate_async]
 * to avoid blocking the main loop.
 */
public interface HoverProvider :
    Interface,
    KGTyped {
    public val gtksourceHoverProviderPointer: CPointer<GtkSourceHoverProvider>

    /**
     *
     *
     * @param context
     * @param display
     * @param cancellable
     * @param callback
     */
    public fun populateAsync(
        context: HoverContext,
        display: HoverDisplay,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        gtk_source_hover_provider_populate_async(
            gtksourceHoverProviderPointer.reinterpret(),
            context.gtksourceHoverContextPointer.reinterpret(),
            display.gtksourceHoverDisplayPointer.reinterpret(),
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     *
     *
     * @param result
     */
    public fun populateFinish(result: AsyncResult): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                gtk_source_hover_provider_populate_finish(
                    gtksourceHoverProviderPointer.reinterpret(),
                    result.gioAsyncResultPointer,
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    private data class Wrapper(
        private val pointer: CPointer<GtkSourceHoverProvider>,
    ) : HoverProvider {
        override val gtksourceHoverProviderPointer: CPointer<GtkSourceHoverProvider> = pointer
    }

    public companion object : TypeCompanion<HoverProvider> {
        override val type: GeneratedInterfaceKGType<HoverProvider> =
            GeneratedInterfaceKGType(gtk_source_hover_provider_get_type()) { Wrapper(it.reinterpret()) }

        init {
            GtksourceTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GtkSourceHoverProvider>): HoverProvider = Wrapper(pointer)
    }
}
