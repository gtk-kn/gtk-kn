// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
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
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtksource.GtkSource.resolveException
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.GType
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
    Proxy,
    KGTyped {
    public val gtksourceHoverProviderPointer: CPointer<GtkSourceHoverProvider>

    public fun populateAsync(
        context: HoverContext,
        display: HoverDisplay,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = gtk_source_hover_provider_populate_async(
        gtksourceHoverProviderPointer,
        context.gtksourceHoverContextPointer,
        display.gtksourceHoverDisplayPointer,
        cancellable?.gioCancellablePointer,
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    public fun populateFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gtk_source_hover_provider_populate_finish(
            gtksourceHoverProviderPointer,
            result.gioAsyncResultPointer,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * The HoverProviderImpl type represents a native instance of the HoverProvider interface.
     *
     * @constructor Creates a new instance of HoverProvider for the provided [CPointer].
     */
    public data class HoverProviderImpl(override val gtksourceHoverProviderPointer: CPointer<GtkSourceHoverProvider>) :
        Object(gtksourceHoverProviderPointer.reinterpret()),
        HoverProvider

    public companion object : TypeCompanion<HoverProvider> {
        override val type: GeneratedInterfaceKGType<HoverProvider> =
            GeneratedInterfaceKGType(getTypeOrNull("gtk_source_hover_provider_get_type")!!) {
                HoverProviderImpl(it.reinterpret())
            }

        init {
            GtksourceTypeProvider.register()
        }

        /**
         * Get the GType of HoverProvider
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_hover_provider_get_type()
    }
}
