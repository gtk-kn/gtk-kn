// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.Surface
import org.gtkkn.bindings.gsk.Renderer
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkNative
import org.gtkkn.native.gtk.gtk_native_get_for_surface
import org.gtkkn.native.gtk.gtk_native_get_renderer
import org.gtkkn.native.gtk.gtk_native_get_surface
import org.gtkkn.native.gtk.gtk_native_get_type
import org.gtkkn.native.gtk.gtk_native_realize
import org.gtkkn.native.gtk.gtk_native_unrealize
import kotlin.Unit

/**
 * `GtkNative` is the interface implemented by all widgets that have
 * their own `GdkSurface`.
 *
 * The obvious example of a `GtkNative` is `GtkWindow`.
 *
 * Every widget that is not itself a `GtkNative` is contained in one,
 * and you can get it with [method@Gtk.Widget.get_native].
 *
 * To get the surface of a `GtkNative`, use [method@Gtk.Native.get_surface].
 * It is also possible to find the `GtkNative` to which a surface
 * belongs, with [func@Gtk.Native.get_for_surface].
 *
 * In addition to a [class@Gdk.Surface], a `GtkNative` also provides
 * a [class@Gsk.Renderer] for rendering on that surface. To get the
 * renderer, use [method@Gtk.Native.get_renderer].
 *
 * ## Skipped during bindings generation
 *
 * - parameter `x`: x: Out parameter is not supported
 */
public interface Native :
    Proxy,
    KGTyped {
    public val gtkNativePointer: CPointer<GtkNative>

    /**
     * Returns the renderer that is used for this `GtkNative`.
     *
     * @return the renderer for @self
     */
    public fun getRenderer(): Renderer? = gtk_native_get_renderer(gtkNativePointer)?.run {
        Renderer.RendererImpl(this)
    }

    /**
     * Returns the surface of this `GtkNative`.
     *
     * @return the surface of @self
     */
    public fun getSurface(): Surface? = gtk_native_get_surface(gtkNativePointer)?.run {
        Surface.SurfaceImpl(this)
    }

    /**
     * Realizes a `GtkNative`.
     *
     * This should only be used by subclasses.
     */
    public fun nativeRealize(): Unit = gtk_native_realize(gtkNativePointer)

    /**
     * Unrealizes a `GtkNative`.
     *
     * This should only be used by subclasses.
     */
    public fun nativeUnrealize(): Unit = gtk_native_unrealize(gtkNativePointer)

    /**
     * The NativeImpl type represents a native instance of the Native interface.
     *
     * @constructor Creates a new instance of Native for the provided [CPointer].
     */
    public data class NativeImpl(override val gtkNativePointer: CPointer<GtkNative>) :
        Widget(gtkNativePointer.reinterpret()),
        Native

    public companion object : TypeCompanion<Native> {
        override val type: GeneratedInterfaceKGType<Native> =
            GeneratedInterfaceKGType(getTypeOrNull("gtk_native_get_type")!!) { NativeImpl(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Finds the `GtkNative` associated with the surface.
         *
         * @param surface a `GdkSurface`
         * @return the `GtkNative` that is associated with @surface
         */
        public fun getForSurface(surface: Surface): Native? =
            gtk_native_get_for_surface(surface.gdkSurfacePointer)?.run {
                NativeImpl(reinterpret())
            }

        /**
         * Get the GType of Native
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_native_get_type()
    }
}
