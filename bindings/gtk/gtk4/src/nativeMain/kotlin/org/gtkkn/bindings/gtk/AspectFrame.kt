// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.glib.gfloat
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkAspectFrame
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.gtk_aspect_frame_get_child
import org.gtkkn.native.gtk.gtk_aspect_frame_get_obey_child
import org.gtkkn.native.gtk.gtk_aspect_frame_get_ratio
import org.gtkkn.native.gtk.gtk_aspect_frame_get_type
import org.gtkkn.native.gtk.gtk_aspect_frame_get_xalign
import org.gtkkn.native.gtk.gtk_aspect_frame_get_yalign
import org.gtkkn.native.gtk.gtk_aspect_frame_new
import org.gtkkn.native.gtk.gtk_aspect_frame_set_child
import org.gtkkn.native.gtk.gtk_aspect_frame_set_obey_child
import org.gtkkn.native.gtk.gtk_aspect_frame_set_ratio
import org.gtkkn.native.gtk.gtk_aspect_frame_set_xalign
import org.gtkkn.native.gtk.gtk_aspect_frame_set_yalign
import kotlin.Boolean

/**
 * `GtkAspectFrame` preserves the aspect ratio of its child.
 *
 * The frame can respect the aspect ratio of the child widget,
 * or use its own aspect ratio.
 *
 * # CSS nodes
 *
 * `GtkAspectFrame` uses a CSS node with name `frame`.
 *
 * # Accessibility
 *
 * Until GTK 4.10, `GtkAspectFrame` used the `GTK_ACCESSIBLE_ROLE_GROUP` role.
 *
 * Starting from GTK 4.12, `GtkAspectFrame` uses the `GTK_ACCESSIBLE_ROLE_GENERIC` role.
 */
public open class AspectFrame(public val gtkAspectFramePointer: CPointer<GtkAspectFrame>) :
    Widget(gtkAspectFramePointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * The child widget.
     */
    public open var child: Widget?
        /**
         * Gets the child widget of @self.
         *
         * @return the child widget of @self
         */
        get() = gtk_aspect_frame_get_child(gtkAspectFramePointer)?.run {
            InstanceCache.get(this, true) { Widget.WidgetImpl(reinterpret()) }!!
        }

        /**
         * Sets the child widget of @self.
         *
         * @param child the child widget
         */
        set(child) = gtk_aspect_frame_set_child(gtkAspectFramePointer, child?.gtkWidgetPointer)

    /**
     * Whether the `GtkAspectFrame` should use the aspect ratio of its child.
     */
    public open var obeyChild: Boolean
        /**
         * Returns whether the child's size request should override
         * the set aspect ratio of the `GtkAspectFrame`.
         *
         * @return whether to obey the child's size request
         */
        get() = gtk_aspect_frame_get_obey_child(gtkAspectFramePointer).asBoolean()

        /**
         * Sets whether the aspect ratio of the child's size
         * request should override the set aspect ratio of
         * the `GtkAspectFrame`.
         *
         * @param obeyChild If true, @ratio is ignored, and the aspect
         *    ratio is taken from the requisition of the child.
         */
        set(obeyChild) = gtk_aspect_frame_set_obey_child(gtkAspectFramePointer, obeyChild.asGBoolean())

    /**
     * The aspect ratio to be used by the `GtkAspectFrame`.
     *
     * This property is only used if
     * [property@Gtk.AspectFrame:obey-child] is set to false.
     */
    public open var ratio: gfloat
        /**
         * Returns the desired aspect ratio of the child.
         *
         * @return the desired aspect ratio
         */
        get() = gtk_aspect_frame_get_ratio(gtkAspectFramePointer)

        /**
         * Sets the desired aspect ratio of the child.
         *
         * @param ratio aspect ratio of the child
         */
        set(ratio) = gtk_aspect_frame_set_ratio(gtkAspectFramePointer, ratio)

    /**
     * The horizontal alignment of the child.
     */
    public open var xalign: gfloat
        /**
         * Returns the horizontal alignment of the child within the
         * allocation of the `GtkAspectFrame`.
         *
         * @return the horizontal alignment
         */
        get() = gtk_aspect_frame_get_xalign(gtkAspectFramePointer)

        /**
         * Sets the horizontal alignment of the child within the allocation
         * of the `GtkAspectFrame`.
         *
         * @param xalign horizontal alignment, from 0.0 (left aligned) to 1.0 (right aligned)
         */
        set(xalign) = gtk_aspect_frame_set_xalign(gtkAspectFramePointer, xalign)

    /**
     * The vertical alignment of the child.
     */
    public open var yalign: gfloat
        /**
         * Returns the vertical alignment of the child within the
         * allocation of the `GtkAspectFrame`.
         *
         * @return the vertical alignment
         */
        get() = gtk_aspect_frame_get_yalign(gtkAspectFramePointer)

        /**
         * Sets the vertical alignment of the child within the allocation
         * of the `GtkAspectFrame`.
         *
         * @param yalign horizontal alignment, from 0.0 (top aligned) to 1.0 (bottom aligned)
         */
        set(yalign) = gtk_aspect_frame_set_yalign(gtkAspectFramePointer, yalign)

    /**
     * Create a new `GtkAspectFrame`.
     *
     * @param xalign Horizontal alignment of the child within the parent.
     *   Ranges from 0.0 (left aligned) to 1.0 (right aligned)
     * @param yalign Vertical alignment of the child within the parent.
     *   Ranges from 0.0 (top aligned) to 1.0 (bottom aligned)
     * @param ratio The desired aspect ratio.
     * @param obeyChild If true, @ratio is ignored, and the aspect
     *   ratio is taken from the requistion of the child.
     * @return the new `GtkAspectFrame`.
     */
    public constructor(
        xalign: gfloat,
        yalign: gfloat,
        ratio: gfloat,
        obeyChild: Boolean,
    ) : this(gtk_aspect_frame_new(xalign, yalign, ratio, obeyChild.asGBoolean())!!.reinterpret()) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<AspectFrame> {
        override val type: GeneratedClassKGType<AspectFrame> =
            GeneratedClassKGType(getTypeOrNull()!!) { AspectFrame(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of AspectFrame
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_aspect_frame_get_type()

        /**
         * Gets the GType of from the symbol `gtk_aspect_frame_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_aspect_frame_get_type")
    }
}
