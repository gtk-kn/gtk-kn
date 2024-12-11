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
import org.gtkkn.native.gobject.gfloat
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
public open class AspectFrame(pointer: CPointer<GtkAspectFrame>) :
    Widget(pointer.reinterpret()),
    KGTyped {
    public val gtkAspectFramePointer: CPointer<GtkAspectFrame>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * The child widget.
     */
    public open var child: Widget?
        /**
         * Gets the child widget of @self.
         *
         * @return the child widget of @self
         */
        get() = gtk_aspect_frame_get_child(gtkAspectFramePointer.reinterpret())?.run {
            Widget(reinterpret())
        }

        /**
         * Sets the child widget of @self.
         *
         * @param child the child widget
         */
        set(
            child
        ) = gtk_aspect_frame_set_child(gtkAspectFramePointer.reinterpret(), child?.gtkWidgetPointer?.reinterpret())

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
        get() = gtk_aspect_frame_get_obey_child(gtkAspectFramePointer.reinterpret()).asBoolean()

        /**
         * Sets whether the aspect ratio of the child's size
         * request should override the set aspect ratio of
         * the `GtkAspectFrame`.
         *
         * @param obeyChild If true, @ratio is ignored, and the aspect
         *    ratio is taken from the requisition of the child.
         */
        set(obeyChild) = gtk_aspect_frame_set_obey_child(gtkAspectFramePointer.reinterpret(), obeyChild.asGBoolean())

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
        get() = gtk_aspect_frame_get_ratio(gtkAspectFramePointer.reinterpret())

        /**
         * Sets the desired aspect ratio of the child.
         *
         * @param ratio aspect ratio of the child
         */
        set(ratio) = gtk_aspect_frame_set_ratio(gtkAspectFramePointer.reinterpret(), ratio)

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
        get() = gtk_aspect_frame_get_xalign(gtkAspectFramePointer.reinterpret())

        /**
         * Sets the horizontal alignment of the child within the allocation
         * of the `GtkAspectFrame`.
         *
         * @param xalign horizontal alignment, from 0.0 (left aligned) to 1.0 (right aligned)
         */
        set(xalign) = gtk_aspect_frame_set_xalign(gtkAspectFramePointer.reinterpret(), xalign)

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
        get() = gtk_aspect_frame_get_yalign(gtkAspectFramePointer.reinterpret())

        /**
         * Sets the vertical alignment of the child within the allocation
         * of the `GtkAspectFrame`.
         *
         * @param yalign horizontal alignment, from 0.0 (top aligned) to 1.0 (bottom aligned)
         */
        set(yalign) = gtk_aspect_frame_set_yalign(gtkAspectFramePointer.reinterpret(), yalign)

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
    ) : this(gtk_aspect_frame_new(xalign, yalign, ratio, obeyChild.asGBoolean())!!.reinterpret())

    public companion object : TypeCompanion<AspectFrame> {
        override val type: GeneratedClassKGType<AspectFrame> =
            GeneratedClassKGType(gtk_aspect_frame_get_type()) { AspectFrame(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of AspectFrame
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_aspect_frame_get_type()
    }
}
