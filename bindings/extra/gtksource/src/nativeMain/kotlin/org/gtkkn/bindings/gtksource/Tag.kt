// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gtk.TextTag
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtksource.GtkSourceTag
import org.gtkkn.native.gtksource.gtk_source_tag_get_type
import org.gtkkn.native.gtksource.gtk_source_tag_new
import kotlin.String

/**
 * A tag that can be applied to text in a [class@Buffer].
 *
 * `GtkSourceTag` is a subclass of [class@Gtk.TextTag] that adds properties useful for
 * the GtkSourceView library.
 *
 * If, for a certain tag, [class@Gtk.TextTag] is sufficient, it's better that you create
 * a [class@Gtk.TextTag], not a [class@Tag].
 *
 * ## Skipped during bindings generation
 *
 * - method `draw-spaces`: Property has no getter nor setter
 * - method `draw-spaces-set`: Property has no getter nor setter
 */
public open class Tag(public val gtksourceTagPointer: CPointer<GtkSourceTag>) :
    TextTag(gtksourceTagPointer.reinterpret()),
    KGTyped {
    init {
        GtkSource
    }

    /**
     * Creates a `GtkSourceTag`.
     *
     * Configure the tag using object arguments, i.e. using [method@GObject.Object.set].
     *
     * For usual cases, [method@Buffer.create_source_tag] is more convenient to
     * use.
     *
     * @param name tag name, or null.
     * @return a new `GtkSourceTag`.
     */
    public constructor(name: String? = null) : this(gtk_source_tag_new(name)!!.reinterpret()) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<Tag> {
        override val type: GeneratedClassKGType<Tag> =
            GeneratedClassKGType(getTypeOrNull()!!) { Tag(it.reinterpret()) }

        init {
            GtkSourceTypeProvider.register()
        }

        /**
         * Get the GType of Tag
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_tag_get_type()

        /**
         * Gets the GType of from the symbol `gtk_source_tag_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_source_tag_get_type")
    }
}
