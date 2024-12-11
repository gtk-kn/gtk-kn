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
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkEditable
import org.gtkkn.native.gtk.GtkEditableLabel
import org.gtkkn.native.gtk.gtk_editable_label_get_editing
import org.gtkkn.native.gtk.gtk_editable_label_get_type
import org.gtkkn.native.gtk.gtk_editable_label_new
import org.gtkkn.native.gtk.gtk_editable_label_start_editing
import org.gtkkn.native.gtk.gtk_editable_label_stop_editing
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * A `GtkEditableLabel` is a label that allows users to
 * edit the text by switching to an “edit mode”.
 *
 * ![An example GtkEditableLabel](editable-label.png)
 *
 * `GtkEditableLabel` does not have API of its own, but it
 * implements the [iface@Gtk.Editable] interface.
 *
 * The default bindings for activating the edit mode is
 * to click or press the Enter key. The default bindings
 * for leaving the edit mode are the Enter key (to save
 * the results) or the Escape key (to cancel the editing).
 *
 * # CSS nodes
 *
 * ```
 * editablelabel[.editing]
 * ╰── stack
 *     ├── label
 *     ╰── text
 * ```
 *
 * `GtkEditableLabel` has a main node with the name editablelabel.
 * When the entry is in editing mode, it gets the .editing style
 * class.
 *
 * For all the subnodes added to the text node in various situations,
 * see [class@Gtk.Text].
 */
public open class EditableLabel(pointer: CPointer<GtkEditableLabel>) :
    Widget(pointer.reinterpret()),
    Editable,
    KGTyped {
    public val gtkEditableLabelPointer: CPointer<GtkEditableLabel>
        get() = gPointer.reinterpret()

    override val gtkEditablePointer: CPointer<GtkEditable>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * This property is true while the widget is in edit mode.
     */
    public open val editing: Boolean
        /**
         * Returns whether the label is currently in “editing mode”.
         *
         * @return true if @self is currently in editing mode
         */
        get() = gtk_editable_label_get_editing(gtkEditableLabelPointer.reinterpret()).asBoolean()

    /**
     * Creates a new `GtkEditableLabel` widget.
     *
     * @param str the text for the label
     * @return the new `GtkEditableLabel`
     */
    public constructor(str: String) : this(gtk_editable_label_new(str)!!.reinterpret())

    /**
     * Switches the label into “editing mode”.
     */
    public open fun startEditing(): Unit = gtk_editable_label_start_editing(gtkEditableLabelPointer.reinterpret())

    /**
     * Switches the label out of “editing mode”.
     *
     * If @commit is true, the resulting text is kept as the
     * [property@Gtk.Editable:text] property value, otherwise the
     * resulting text is discarded and the label will keep its
     * previous [property@Gtk.Editable:text] property value.
     *
     * @param commit whether to set the edited text on the label
     */
    public open fun stopEditing(commit: Boolean): Unit =
        gtk_editable_label_stop_editing(gtkEditableLabelPointer.reinterpret(), commit.asGBoolean())

    public companion object : TypeCompanion<EditableLabel> {
        override val type: GeneratedClassKGType<EditableLabel> =
            GeneratedClassKGType(gtk_editable_label_get_type()) { EditableLabel(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of EditableLabel
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_editable_label_get_type()
    }
}
