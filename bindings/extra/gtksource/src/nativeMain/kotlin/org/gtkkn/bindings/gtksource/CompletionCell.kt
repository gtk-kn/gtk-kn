// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.Paintable
import org.gtkkn.bindings.gio.Icon
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.bindings.pango.AttrList
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtksource.GtkSourceCompletionCell
import org.gtkkn.native.gtksource.gtk_source_completion_cell_get_column
import org.gtkkn.native.gtksource.gtk_source_completion_cell_get_type
import org.gtkkn.native.gtksource.gtk_source_completion_cell_get_widget
import org.gtkkn.native.gtksource.gtk_source_completion_cell_set_gicon
import org.gtkkn.native.gtksource.gtk_source_completion_cell_set_icon_name
import org.gtkkn.native.gtksource.gtk_source_completion_cell_set_markup
import org.gtkkn.native.gtksource.gtk_source_completion_cell_set_paintable
import org.gtkkn.native.gtksource.gtk_source_completion_cell_set_text
import org.gtkkn.native.gtksource.gtk_source_completion_cell_set_text_with_attributes
import org.gtkkn.native.gtksource.gtk_source_completion_cell_set_widget
import kotlin.String
import kotlin.Unit

/**
 * Widget for single cell of completion proposal.
 *
 * The `GtkSourceCompletionCell` widget provides a container to display various
 * types of information with the completion display.
 *
 * Each proposal may consist of multiple cells depending on the complexity of
 * the proposal. For example, programming language proposals may contain a cell
 * for the "left-hand-side" of an operation along with the "typed-text" for a
 * function name and "parameters". They may also optionally set an icon to
 * signify the kind of result.
 *
 * A [iface@CompletionProvider] should implement the
 * [vfunc@CompletionProvider.display] virtual function to control
 * how to convert data from their [iface@CompletionProposal] to content for
 * the `GtkSourceCompletionCell`.
 *
 * ## Skipped during bindings generation
 *
 * - method `markup`: Property has no getter
 * - method `paintable`: Property has no getter
 * - method `text`: Property has no getter
 * - method `widget`: Property TypeInfo of getter and setter do not match
 */
public open class CompletionCell(public val gtksourceCompletionCellPointer: CPointer<GtkSourceCompletionCell>) :
    Widget(gtksourceCompletionCellPointer.reinterpret()),
    KGTyped {
    init {
        GtkSource
    }

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    public open val column: CompletionColumn
        get() = gtk_source_completion_cell_get_column(gtksourceCompletionCellPointer).run {
            CompletionColumn.fromNativeValue(this)
        }

    /**
     * Gets the child #GtkWidget, if any.
     *
     * @return a #GtkWidget or null
     */
    public open fun getWidget(): Widget? = gtk_source_completion_cell_get_widget(gtksourceCompletionCellPointer)?.run {
        InstanceCache.get(this, true) { Widget.WidgetImpl(reinterpret()) }!!
    }

    public open fun setGicon(gicon: Icon): Unit =
        gtk_source_completion_cell_set_gicon(gtksourceCompletionCellPointer, gicon.gioIconPointer)

    public open fun setIconName(iconName: String): Unit =
        gtk_source_completion_cell_set_icon_name(gtksourceCompletionCellPointer, iconName)

    public open fun setMarkup(markup: String): Unit =
        gtk_source_completion_cell_set_markup(gtksourceCompletionCellPointer, markup)

    public open fun setPaintable(paintable: Paintable): Unit =
        gtk_source_completion_cell_set_paintable(gtksourceCompletionCellPointer, paintable.gdkPaintablePointer)

    /**
     * Sets the text for the column cell. Use null to unset.
     *
     * @param text the text to set or null
     */
    public open fun setText(text: String? = null): Unit =
        gtk_source_completion_cell_set_text(gtksourceCompletionCellPointer, text)

    public open fun setTextWithAttributes(text: String, attrs: AttrList): Unit =
        gtk_source_completion_cell_set_text_with_attributes(
            gtksourceCompletionCellPointer,
            text,
            attrs.pangoAttrListPointer
        )

    public open fun setWidget(child: Widget): Unit =
        gtk_source_completion_cell_set_widget(gtksourceCompletionCellPointer, child.gtkWidgetPointer)

    public companion object : TypeCompanion<CompletionCell> {
        override val type: GeneratedClassKGType<CompletionCell> =
            GeneratedClassKGType(getTypeOrNull()!!) { CompletionCell(it.reinterpret()) }

        init {
            GtkSourceTypeProvider.register()
        }

        /**
         * Get the GType of CompletionCell
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_completion_cell_get_type()

        /**
         * Gets the GType of from the symbol `gtk_source_completion_cell_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_source_completion_cell_get_type")
    }
}
