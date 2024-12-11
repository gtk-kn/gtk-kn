// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
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
    Interface,
    KGTyped {
    public val gtkBuilderScopePointer: CPointer<GtkBuilderScope>

    private data class Wrapper(private val pointer: CPointer<GtkBuilderScope>) : BuilderScope {
        override val gtkBuilderScopePointer: CPointer<GtkBuilderScope> = pointer
    }

    public companion object : TypeCompanion<BuilderScope> {
        override val type: GeneratedInterfaceKGType<BuilderScope> =
            GeneratedInterfaceKGType(gtk_builder_scope_get_type()) { Wrapper(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GtkBuilderScope>): BuilderScope = Wrapper(pointer)

        /**
         * Get the GType of BuilderScope
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_builder_scope_get_type()
    }
}
