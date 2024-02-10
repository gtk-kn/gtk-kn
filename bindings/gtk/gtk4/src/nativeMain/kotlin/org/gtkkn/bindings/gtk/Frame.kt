// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkFrame
import org.gtkkn.native.gtk.gtk_frame_get_child
import org.gtkkn.native.gtk.gtk_frame_get_label
import org.gtkkn.native.gtk.gtk_frame_get_label_align
import org.gtkkn.native.gtk.gtk_frame_get_label_widget
import org.gtkkn.native.gtk.gtk_frame_get_type
import org.gtkkn.native.gtk.gtk_frame_new
import org.gtkkn.native.gtk.gtk_frame_set_child
import org.gtkkn.native.gtk.gtk_frame_set_label
import org.gtkkn.native.gtk.gtk_frame_set_label_align
import org.gtkkn.native.gtk.gtk_frame_set_label_widget
import kotlin.Float
import kotlin.String
import kotlin.Unit

/**
 * `GtkFrame` is a widget that surrounds its child with a decorative
 * frame and an optional label.
 *
 * ![An example GtkFrame](frame.png)
 *
 * If present, the label is drawn inside the top edge of the frame.
 * The horizontal position of the label can be controlled with
 * [method@Gtk.Frame.set_label_align].
 *
 * `GtkFrame` clips its child. You can use this to add rounded corners
 * to widgets, but be aware that it also cuts off shadows.
 *
 * # GtkFrame as GtkBuildable
 *
 * The `GtkFrame` implementation of the `GtkBuildable` interface supports
 * placing a child in the label position by specifying “label” as the
 * “type” attribute of a <child> element. A normal content child can
 * be specified without specifying a <child> type attribute.
 *
 * An example of a UI definition fragment with GtkFrame:
 * ```xml
 * <object class="GtkFrame">
 *   <child type="label">
 *     <object class="GtkLabel" id="frame_label"/>
 *   </child>
 *   <child>
 *     <object class="GtkEntry" id="frame_content"/>
 *   </child>
 * </object>
 * ```
 *
 * # CSS nodes
 *
 * ```
 * frame
 * ├── <label widget>
 * ╰── <child>
 * ```
 *
 * `GtkFrame` has a main CSS node with name “frame”, which is used to draw the
 * visible border. You can set the appearance of the border using CSS properties
 * like “border-style” on this node.
 *
 * ## Skipped during bindings generation
 *
 * - method `label-xalign`: Property has no getter nor setter
 */
public open class Frame(
    pointer: CPointer<GtkFrame>,
) : Widget(pointer.reinterpret()), KGTyped {
    public val gtkFramePointer: CPointer<GtkFrame>
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
         * Gets the child widget of @frame.
         *
         * @return the child widget of @frame
         */
        get() =
            gtk_frame_get_child(gtkFramePointer.reinterpret())?.run {
                Widget(reinterpret())
            }

        /**
         * Sets the child widget of @frame.
         *
         * @param child the child widget
         */
        set(child) =
            gtk_frame_set_child(
                gtkFramePointer.reinterpret(),
                child?.gtkWidgetPointer?.reinterpret()
            )

    /**
     * Text of the frame's label.
     */
    public open var label: String?
        /**
         * Returns the frame labels text.
         *
         * If the frame's label widget is not a `GtkLabel`, null
         * is returned.
         *
         * @return the text in the label, or null if there
         *    was no label widget or the label widget was not a `GtkLabel`.
         *    This string is owned by GTK and must not be modified or freed.
         */
        get() = gtk_frame_get_label(gtkFramePointer.reinterpret())?.toKString()

        /**
         * Creates a new `GtkLabel` with the @label and sets it as the frame's
         * label widget.
         *
         * @param label the text to use as the label of the frame
         */
        set(label) = gtk_frame_set_label(gtkFramePointer.reinterpret(), label)

    /**
     * Widget to display in place of the usual frame label.
     */
    public open var labelWidget: Widget?
        /**
         * Retrieves the label widget for the frame.
         *
         * @return the label widget
         */
        get() =
            gtk_frame_get_label_widget(gtkFramePointer.reinterpret())?.run {
                Widget(reinterpret())
            }

        /**
         * Sets the label widget for the frame.
         *
         * This is the widget that will appear embedded in the top edge
         * of the frame as a title.
         *
         * @param labelWidget the new label widget
         */
        set(labelWidget) =
            gtk_frame_set_label_widget(
                gtkFramePointer.reinterpret(),
                labelWidget?.gtkWidgetPointer?.reinterpret()
            )

    /**
     * Creates a new `GtkFrame`, with optional label @label.
     *
     * If @label is null, the label is omitted.
     *
     * @param label the text to use as the label of the frame
     * @return a new `GtkFrame` widget
     */
    public constructor(label: String? = null) : this(gtk_frame_new(label)!!.reinterpret())

    /**
     * Gets the child widget of @frame.
     *
     * @return the child widget of @frame
     */
    public open fun getChild(): Widget? =
        gtk_frame_get_child(gtkFramePointer.reinterpret())?.run {
            Widget(reinterpret())
        }

    /**
     * Returns the frame labels text.
     *
     * If the frame's label widget is not a `GtkLabel`, null
     * is returned.
     *
     * @return the text in the label, or null if there
     *    was no label widget or the label widget was not a `GtkLabel`.
     *    This string is owned by GTK and must not be modified or freed.
     */
    public open fun getLabel(): String? = gtk_frame_get_label(gtkFramePointer.reinterpret())?.toKString()

    /**
     * Retrieves the X alignment of the frame’s label.
     *
     * @return the frames X alignment
     */
    public open fun getLabelAlign(): Float = gtk_frame_get_label_align(gtkFramePointer.reinterpret())

    /**
     * Retrieves the label widget for the frame.
     *
     * @return the label widget
     */
    public open fun getLabelWidget(): Widget? =
        gtk_frame_get_label_widget(gtkFramePointer.reinterpret())?.run {
            Widget(reinterpret())
        }

    /**
     * Sets the child widget of @frame.
     *
     * @param child the child widget
     */
    public open fun setChild(child: Widget? = null): Unit =
        gtk_frame_set_child(
            gtkFramePointer.reinterpret(),
            child?.gtkWidgetPointer?.reinterpret()
        )

    /**
     * Creates a new `GtkLabel` with the @label and sets it as the frame's
     * label widget.
     *
     * @param label the text to use as the label of the frame
     */
    public open fun setLabel(label: String? = null): Unit = gtk_frame_set_label(gtkFramePointer.reinterpret(), label)

    /**
     * Sets the X alignment of the frame widget’s label.
     *
     * The default value for a newly created frame is 0.0.
     *
     * @param xalign The position of the label along the top edge
     *   of the widget. A value of 0.0 represents left alignment;
     *   1.0 represents right alignment.
     */
    public open fun setLabelAlign(xalign: Float): Unit =
        gtk_frame_set_label_align(gtkFramePointer.reinterpret(), xalign)

    /**
     * Sets the label widget for the frame.
     *
     * This is the widget that will appear embedded in the top edge
     * of the frame as a title.
     *
     * @param labelWidget the new label widget
     */
    public open fun setLabelWidget(labelWidget: Widget? = null): Unit =
        gtk_frame_set_label_widget(
            gtkFramePointer.reinterpret(),
            labelWidget?.gtkWidgetPointer?.reinterpret()
        )

    public companion object : TypeCompanion<Frame> {
        override val type: GeneratedClassKGType<Frame> =
            GeneratedClassKGType(gtk_frame_get_type()) { Frame(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}
