// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
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
public open class OverlayLayoutChild(pointer: CPointer<GtkOverlayLayoutChild>) :
    LayoutChild(pointer.reinterpret()),
    KGTyped {
    public val gtkOverlayLayoutChildPointer: CPointer<GtkOverlayLayoutChild>
        get() = gPointer.reinterpret()

    /**
     * Whether the child should be clipped to fit the parent's size.
     */
    public open var clipOverlay: Boolean
        /**
         * Retrieves whether the child is clipped.
         *
         * @return whether the child is clipped
         */
        get() = gtk_overlay_layout_child_get_clip_overlay(gtkOverlayLayoutChildPointer.reinterpret()).asBoolean()

        /**
         * Sets whether to clip this child.
         *
         * @param clipOverlay whether to clip this child
         */
        set(
            clipOverlay
        ) = gtk_overlay_layout_child_set_clip_overlay(
            gtkOverlayLayoutChildPointer.reinterpret(),
            clipOverlay.asGBoolean()
        )

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
        get() = gtk_overlay_layout_child_get_measure(gtkOverlayLayoutChildPointer.reinterpret()).asBoolean()

        /**
         * Sets whether to measure this child.
         *
         * @param measure whether to measure this child
         */
        set(
            measure
        ) = gtk_overlay_layout_child_set_measure(gtkOverlayLayoutChildPointer.reinterpret(), measure.asGBoolean())

    public companion object : TypeCompanion<OverlayLayoutChild> {
        override val type: GeneratedClassKGType<OverlayLayoutChild> =
            GeneratedClassKGType(gtk_overlay_layout_child_get_type()) { OverlayLayoutChild(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of OverlayLayoutChild
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_overlay_layout_child_get_type()
    }
}
