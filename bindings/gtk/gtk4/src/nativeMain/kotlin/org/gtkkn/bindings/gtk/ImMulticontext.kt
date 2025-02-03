// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkIMMulticontext
import org.gtkkn.native.gtk.gtk_im_multicontext_get_context_id
import org.gtkkn.native.gtk.gtk_im_multicontext_get_type
import org.gtkkn.native.gtk.gtk_im_multicontext_new
import org.gtkkn.native.gtk.gtk_im_multicontext_set_context_id
import kotlin.String
import kotlin.Unit

/**
 * `GtkIMMulticontext` is an input method context supporting multiple,
 * switchable input methods.
 *
 * Text widgets such as `GtkText` or `GtkTextView` use a `GtkIMMultiContext`
 * to implement their `im-module` property for switching between different
 * input methods.
 */
public open class ImMulticontext(public val gtkImMulticontextPointer: CPointer<GtkIMMulticontext>) :
    ImContext(gtkImMulticontextPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    /**
     * Creates a new `GtkIMMulticontext`.
     *
     * @return a new `GtkIMMulticontext`.
     */
    public constructor() : this(gtk_im_multicontext_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * Gets the id of the currently active delegate of the @context.
     *
     * @return the id of the currently active delegate
     */
    public open fun getContextId(): String =
        gtk_im_multicontext_get_context_id(gtkImMulticontextPointer)?.toKString() ?: error("Expected not null string")

    /**
     * Sets the context id for @context.
     *
     * This causes the currently active delegate of @context to be
     * replaced by the delegate corresponding to the new context id.
     *
     * Setting this to a non-null value overrides the system-wide
     * IM module setting. See the [property@Gtk.Settings:gtk-im-module]
     * property.
     *
     * @param contextId the id to use
     */
    public open fun setContextId(contextId: String? = null): Unit =
        gtk_im_multicontext_set_context_id(gtkImMulticontextPointer, contextId)

    public companion object : TypeCompanion<ImMulticontext> {
        override val type: GeneratedClassKGType<ImMulticontext> =
            GeneratedClassKGType(getTypeOrNull()!!) { ImMulticontext(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of IMMulticontext
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_im_multicontext_get_type()

        /**
         * Gets the GType of from the symbol `gtk_im_multicontext_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_im_multicontext_get_type")
    }
}
