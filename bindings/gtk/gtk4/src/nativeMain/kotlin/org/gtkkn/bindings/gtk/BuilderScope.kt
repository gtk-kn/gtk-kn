// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.gobject.legacy.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkBuilderScope
import org.gtkkn.native.gtk.gtk_builder_scope_get_type

/**
 * `GtkBuilderScope` is an interface to provide language binding support
 * to `GtkBuilder`.
 *
 * The goal of `GtkBuilderScope` is to look up programming-language-specific
 * values for strings that are given in a `GtkBuilder` UI file.
 *
 * The primary intended audience is bindings that want to provide deeper
 * integration of `GtkBuilder` into the language.
 *
 * A `GtkBuilderScope` instance may be used with multiple `GtkBuilder` objects,
 * even at once.
 *
 * By default, GTK will use its own implementation of `GtkBuilderScope`
 * for the C language which can be created via [ctor@Gtk.BuilderCScope.new].
 *
 * If you implement `GtkBuilderScope` for a language binding, you
 * may want to (partially) derive from or fall back to a [class@Gtk.BuilderCScope],
 * as that class implements support for automatic lookups from C symbols.
 */
public interface BuilderScope :
    Proxy,
    KGTyped {
    public val gtkBuilderScopePointer: CPointer<GtkBuilderScope>

    /**
     * The BuilderScopeImpl type represents a native instance of the BuilderScope interface.
     *
     * @constructor Creates a new instance of BuilderScope for the provided [CPointer].
     */
    public class BuilderScopeImpl(gtkBuilderScopePointer: CPointer<GtkBuilderScope>) :
        Object(gtkBuilderScopePointer.reinterpret()),
        BuilderScope {
        init {
            Gtk
        }

        override val gtkBuilderScopePointer: CPointer<GtkBuilderScope> = gtkBuilderScopePointer
    }

    public companion object : TypeCompanion<BuilderScope> {
        override val type: GeneratedInterfaceKGType<BuilderScope> =
            GeneratedInterfaceKGType(getTypeOrNull()!!) { BuilderScopeImpl(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of BuilderScope
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_builder_scope_get_type()

        /**
         * Gets the GType of from the symbol `gtk_builder_scope_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_builder_scope_get_type")
    }
}
