// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkBuilderCScope
import org.gtkkn.native.gtk.GtkBuilderScope
import org.gtkkn.native.gtk.gtk_builder_cscope_get_type
import org.gtkkn.native.gtk.gtk_builder_cscope_new

/**
 * A `GtkBuilderScope` implementation for the C language.
 *
 * `GtkBuilderCScope` instances use symbols explicitly added to @builder
 * with prior calls to [method@Gtk.BuilderCScope.add_callback_symbol].
 * If developers want to do that, they are encouraged to create their
 * own scopes for that purpose.
 *
 * In the case that symbols are not explicitly added; GTK will uses
 * `GModule`’s introspective features (by opening the module null) to
 * look at the application’s symbol table. From here it tries to match
 * the signal function names given in the interface description with
 * symbols in the application.
 *
 * Note that unless [method@Gtk.BuilderCScope.add_callback_symbol] is
 * called for all signal callbacks which are referenced by the loaded XML,
 * this functionality will require that `GModule` be supported on the platform.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `callback_symbol`: GObject.Callback
 * - method `add_callback_symbols`: Varargs parameter is not supported
 * - method `lookup_callback_symbol`: Return type GObject.Callback is not supported
 */
public open class BuilderCScope(public val gtkBuilderCScopePointer: CPointer<GtkBuilderCScope>) :
    Object(gtkBuilderCScopePointer.reinterpret()),
    BuilderScope,
    KGTyped {
    override val gtkBuilderScopePointer: CPointer<GtkBuilderScope>
        get() = handle.reinterpret()

    /**
     * Creates a new `GtkBuilderCScope` object to use with future
     * `GtkBuilder` instances.
     *
     * Calling this function is only necessary if you want to add
     * custom callbacks via [method@Gtk.BuilderCScope.add_callback_symbol].
     *
     * @return a new `GtkBuilderCScope`
     */
    public constructor() : this(gtk_builder_cscope_new()!!.reinterpret())

    public companion object : TypeCompanion<BuilderCScope> {
        override val type: GeneratedClassKGType<BuilderCScope> =
            GeneratedClassKGType(gtk_builder_cscope_get_type()) { BuilderCScope(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of BuilderCScope
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_builder_cscope_get_type()
    }
}
