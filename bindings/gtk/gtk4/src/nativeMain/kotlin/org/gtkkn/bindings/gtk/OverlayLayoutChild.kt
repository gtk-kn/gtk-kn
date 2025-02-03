// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkOverlayLayoutChild
import org.gtkkn.native.gtk.gtk_overlay_layout_child_get_clip_overlay
import org.gtkkn.native.gtk.gtk_overlay_layout_child_get_measure
import org.gtkkn.native.gtk.gtk_overlay_layout_child_get_type
import org.gtkkn.native.gtk.gtk_overlay_layout_child_set_clip_overlay
import org.gtkkn.native.gtk.gtk_overlay_layout_child_set_measure
import kotlin.Boolean

/**
 * `GtkLayoutChild` subclass for children in a `GtkOverlayLayout`.
 */
public open class OverlayLayoutChild(public val gtkOverlayLayoutChildPointer: CPointer<GtkOverlayLayoutChild>) :
    LayoutChild(gtkOverlayLayoutChildPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    /**
     * Whether the child should be clipped to fit the parent's size.
     */
    public open var clipOverlay: Boolean
        /**
         * Retrieves whether the child is clipped.
         *
         * @return whether the child is clipped
         */
        get() = gtk_overlay_layout_child_get_clip_overlay(gtkOverlayLayoutChildPointer).asBoolean()

        /**
         * Sets whether to clip this child.
         *
         * @param clipOverlay whether to clip this child
         */
        set(
            clipOverlay
        ) = gtk_overlay_layout_child_set_clip_overlay(gtkOverlayLayoutChildPointer, clipOverlay.asGBoolean())

    /**
     * Whether the child size should contribute to the `GtkOverlayLayout`'s
     * measurement.
     */
    public open var measure: Boolean
        /**
         * Retrieves whether the child is measured.
         *
         * @return whether the child is measured
         */
        get() = gtk_overlay_layout_child_get_measure(gtkOverlayLayoutChildPointer).asBoolean()

        /**
         * Sets whether to measure this child.
         *
         * @param measure whether to measure this child
         */
        set(measure) = gtk_overlay_layout_child_set_measure(gtkOverlayLayoutChildPointer, measure.asGBoolean())

    public companion object : TypeCompanion<OverlayLayoutChild> {
        override val type: GeneratedClassKGType<OverlayLayoutChild> =
            GeneratedClassKGType(getTypeOrNull()!!) { OverlayLayoutChild(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of OverlayLayoutChild
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_overlay_layout_child_get_type()

        /**
         * Gets the GType of from the symbol `gtk_overlay_layout_child_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_overlay_layout_child_get_type")
    }
}
