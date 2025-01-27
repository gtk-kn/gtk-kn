// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_8
import org.gtkkn.bindings.pango.AttrList
import org.gtkkn.bindings.pango.WrapMode
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.gfloat
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkAccessibleText
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkInscription
import org.gtkkn.native.gtk.gtk_inscription_get_attributes
import org.gtkkn.native.gtk.gtk_inscription_get_min_chars
import org.gtkkn.native.gtk.gtk_inscription_get_min_lines
import org.gtkkn.native.gtk.gtk_inscription_get_nat_chars
import org.gtkkn.native.gtk.gtk_inscription_get_nat_lines
import org.gtkkn.native.gtk.gtk_inscription_get_text
import org.gtkkn.native.gtk.gtk_inscription_get_text_overflow
import org.gtkkn.native.gtk.gtk_inscription_get_type
import org.gtkkn.native.gtk.gtk_inscription_get_wrap_mode
import org.gtkkn.native.gtk.gtk_inscription_get_xalign
import org.gtkkn.native.gtk.gtk_inscription_get_yalign
import org.gtkkn.native.gtk.gtk_inscription_new
import org.gtkkn.native.gtk.gtk_inscription_set_attributes
import org.gtkkn.native.gtk.gtk_inscription_set_markup
import org.gtkkn.native.gtk.gtk_inscription_set_min_chars
import org.gtkkn.native.gtk.gtk_inscription_set_min_lines
import org.gtkkn.native.gtk.gtk_inscription_set_nat_chars
import org.gtkkn.native.gtk.gtk_inscription_set_nat_lines
import org.gtkkn.native.gtk.gtk_inscription_set_text
import org.gtkkn.native.gtk.gtk_inscription_set_text_overflow
import org.gtkkn.native.gtk.gtk_inscription_set_wrap_mode
import org.gtkkn.native.gtk.gtk_inscription_set_xalign
import org.gtkkn.native.gtk.gtk_inscription_set_yalign
import kotlin.String
import kotlin.Unit

/**
 * `GtkInscription` is a widget to show text in a predefined area.
 *
 * You likely want to use `GtkLabel` instead as this widget is intended only
 * for a small subset of use cases. The main scenario envisaged is inside lists
 * such as `GtkColumnView`.
 *
 * While a `GtkLabel` sizes itself depending on the text that is displayed,
 * `GtkInscription` is given a size and inscribes the given text into that
 * space as well as it can.
 *
 * Users of this widget should take care to plan behaviour for the common case
 * where the text doesn't fit exactly in the allocated space.
 *
 * ## Skipped during bindings generation
 *
 * - method `markup`: Property has no getter
 *
 * @since 4.8
 */
@GtkVersion4_8
public open class Inscription(public val gtkInscriptionPointer: CPointer<GtkInscription>) :
    Widget(gtkInscriptionPointer.reinterpret()),
    AccessibleText,
    KGTyped {
    override val gtkAccessibleTextPointer: CPointer<GtkAccessibleText>
        get() = handle.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * A list of style attributes to apply to the text of the inscription.
     *
     * @since 4.8
     */
    @GtkVersion4_8
    public open var attributes: AttrList?
        /**
         * Gets the inscription's attribute list.
         *
         * @return the attribute list
         * @since 4.8
         */
        get() = gtk_inscription_get_attributes(gtkInscriptionPointer)?.run {
            AttrList(this)
        }

        /**
         * Apply attributes to the inscription text.
         *
         * These attributes will not be evaluated for sizing the inscription.
         *
         * @param attrs a [struct@Pango.AttrList]
         * @since 4.8
         */
        @GtkVersion4_8
        set(attrs) = gtk_inscription_set_attributes(gtkInscriptionPointer, attrs?.pangoAttrListPointer)

    /**
     * The number of characters that should fit into the inscription at minimum.
     *
     * This influences the requested width, not the width actually given to the widget,
     * which might turn out to be larger.
     *
     * Note that this is an approximate character width, so some characters might be
     * wider and some might be thinner, so do not expect the number of characters to
     * exactly match.
     *
     * If you set this property to 0, the inscription will not request any width at all
     * and its width will be determined entirely by its surroundings.
     *
     * @since 4.8
     */
    @GtkVersion4_8
    public open var minChars: guint
        /**
         * Gets the `min-chars` of the inscription.
         *
         * See the [property@Gtk.Inscription:min-chars] property.
         *
         * @return the min-chars property
         * @since 4.8
         */
        get() = gtk_inscription_get_min_chars(gtkInscriptionPointer)

        /**
         * Sets the `min-chars` of the inscription.
         *
         * See the [property@Gtk.Inscription:min-chars] property.
         *
         * @param minChars the minimum number of characters that should fit, approximately
         * @since 4.8
         */
        @GtkVersion4_8
        set(minChars) = gtk_inscription_set_min_chars(gtkInscriptionPointer, minChars)

    /**
     * The number of lines that should fit into the inscription at minimum.
     *
     * This influences the requested height, not the height actually given to the widget,
     * which might turn out to be larger.
     *
     * Note that this is an approximate line height, so if the text uses things like fancy
     * Unicode or attribute that influence the height, the text might not fit.
     *
     * If you set this property to 0, the inscription will not request any height at all
     * and its height will be determined entirely by its surroundings.
     *
     * @since 4.8
     */
    @GtkVersion4_8
    public open var minLines: guint
        /**
         * Gets the `min-lines` of the inscription.
         *
         * See the [property@Gtk.Inscription:min-lines] property.
         *
         * @return the min-lines property
         * @since 4.8
         */
        get() = gtk_inscription_get_min_lines(gtkInscriptionPointer)

        /**
         * Sets the `min-lines` of the inscription.
         *
         * See the [property@Gtk.Inscription:min-lines] property.
         *
         * @param minLines the minimum number of lines that should fit, approximately
         * @since 4.8
         */
        @GtkVersion4_8
        set(minLines) = gtk_inscription_set_min_lines(gtkInscriptionPointer, minLines)

    /**
     * The number of characters that should ideally fit into the inscription.
     *
     * This influences the requested width, not the width actually given to the widget.
     * The widget might turn out larger as well as smaller.
     *
     * If this property is set to a value smaller than [property@Gtk.Inscription:min-chars],
     * that value will be used. In particular, for the default value of 0, this will always
     * be the case.
     *
     * @since 4.8
     */
    @GtkVersion4_8
    public open var natChars: guint
        /**
         * Gets the `nat-chars` of the inscription.
         *
         * See the [property@Gtk.Inscription:nat-chars] property.
         *
         * @return the nat-chars property
         * @since 4.8
         */
        get() = gtk_inscription_get_nat_chars(gtkInscriptionPointer)

        /**
         * Sets the `nat-chars` of the inscription.
         *
         * See the [property@Gtk.Inscription:nat-chars] property.
         *
         * @param natChars the number of characters that should ideally fit, approximately
         * @since 4.8
         */
        @GtkVersion4_8
        set(natChars) = gtk_inscription_set_nat_chars(gtkInscriptionPointer, natChars)

    /**
     * The number of lines that should ideally fit into the inscription.
     *
     * This influences the requested height, not the height actually given to the widget.
     * The widget might turn out larger as well as smaller.
     *
     * If this property is set to a value smaller than [property@Gtk.Inscription:min-lines],
     * that value will be used. In particular, for the default value of 0, this will always
     * be the case.
     *
     * @since 4.8
     */
    @GtkVersion4_8
    public open var natLines: guint
        /**
         * Gets the `nat-lines` of the inscription.
         *
         * See the [property@Gtk.Inscription:nat-lines] property.
         *
         * @return the nat-lines property
         * @since 4.8
         */
        get() = gtk_inscription_get_nat_lines(gtkInscriptionPointer)

        /**
         * Sets the `nat-lines` of the inscription.
         *
         * See the [property@Gtk.Inscription:nat-lines] property.
         *
         * @param natLines the number of lines that should ideally fit
         * @since 4.8
         */
        @GtkVersion4_8
        set(natLines) = gtk_inscription_set_nat_lines(gtkInscriptionPointer, natLines)

    /**
     * The displayed text.
     *
     * @since 4.8
     */
    @GtkVersion4_8
    public open var text: String?
        /**
         * Gets the text that is displayed.
         *
         * @return The displayed text
         * @since 4.8
         */
        get() = gtk_inscription_get_text(gtkInscriptionPointer)?.toKString()

        /**
         * Sets the text to be displayed.
         *
         * @param text The text to display
         * @since 4.8
         */
        @GtkVersion4_8
        set(text) = gtk_inscription_set_text(gtkInscriptionPointer, text)

    /**
     * The overflow method to use for the text.
     *
     * @since 4.8
     */
    @GtkVersion4_8
    public open var textOverflow: InscriptionOverflow
        /**
         * Gets the inscription's overflow method.
         *
         * @return the overflow method
         * @since 4.8
         */
        get() = gtk_inscription_get_text_overflow(gtkInscriptionPointer).run {
            InscriptionOverflow.fromNativeValue(this)
        }

        /**
         * Sets what to do when the text doesn't fit.
         *
         * @param overflow the overflow method to use
         * @since 4.8
         */
        @GtkVersion4_8
        set(overflow) = gtk_inscription_set_text_overflow(gtkInscriptionPointer, overflow.nativeValue)

    /**
     * Controls how the line wrapping is done.
     *
     * Note that unlike `GtkLabel`, the default here is %PANGO_WRAP_WORD_CHAR.
     *
     * @since 4.8
     */
    @GtkVersion4_8
    public open var wrapMode: WrapMode
        /**
         * Returns line wrap mode used by the inscription.
         *
         * See [method@Gtk.Inscription.set_wrap_mode].
         *
         * @return the line wrap mode
         * @since 4.8
         */
        get() = gtk_inscription_get_wrap_mode(gtkInscriptionPointer).run {
            WrapMode.fromNativeValue(this)
        }

        /**
         * Controls how line wrapping is done.
         *
         * @param wrapMode the line wrapping mode
         * @since 4.8
         */
        @GtkVersion4_8
        set(wrapMode) = gtk_inscription_set_wrap_mode(gtkInscriptionPointer, wrapMode.nativeValue)

    /**
     * The horizontal alignment of the text inside the allocated size.
     *
     * Compare this to [property@Gtk.Widget:halign], which determines how the
     * inscription's size allocation is positioned in the available space.
     *
     * @since 4.8
     */
    @GtkVersion4_8
    public open var xalign: gfloat
        /**
         * Gets the `xalign` of the inscription.
         *
         * See the [property@Gtk.Inscription:xalign] property.
         *
         * @return the xalign property
         * @since 4.8
         */
        get() = gtk_inscription_get_xalign(gtkInscriptionPointer)

        /**
         * Sets the `xalign` of the inscription.
         *
         * See the [property@Gtk.Inscription:xalign] property.
         *
         * @param xalign the new xalign value, between 0 and 1
         * @since 4.8
         */
        @GtkVersion4_8
        set(xalign) = gtk_inscription_set_xalign(gtkInscriptionPointer, xalign)

    /**
     * The vertical alignment of the text inside the allocated size.
     *
     * Compare this to [property@Gtk.Widget:valign], which determines how the
     * inscription's size allocation is positioned in the available space.
     *
     * @since 4.8
     */
    @GtkVersion4_8
    public open var yalign: gfloat
        /**
         * Gets the `yalign` of the inscription.
         *
         * See the [property@Gtk.Inscription:yalign] property.
         *
         * @return the yalign property
         * @since 4.8
         */
        get() = gtk_inscription_get_yalign(gtkInscriptionPointer)

        /**
         * Sets the `yalign` of the inscription.
         *
         * See the [property@Gtk.Inscription:yalign] property.
         *
         * @param yalign the new yalign value, between 0 and 1
         * @since 4.8
         */
        @GtkVersion4_8
        set(yalign) = gtk_inscription_set_yalign(gtkInscriptionPointer, yalign)

    /**
     * Creates a new `GtkInscription` with the given text.
     *
     * @param text The text to display.
     * @return a new `GtkInscription`
     * @since 4.8
     */
    public constructor(text: String? = null) : this(gtk_inscription_new(text)!!.reinterpret())

    /**
     * Utility function to set the text and attributes to be displayed.
     *
     * See the [property@Gtk.Inscription:markup] property.
     *
     * @param markup The markup to display
     * @since 4.8
     */
    @GtkVersion4_8
    public open fun setMarkup(markup: String? = null): Unit = gtk_inscription_set_markup(gtkInscriptionPointer, markup)

    public companion object : TypeCompanion<Inscription> {
        override val type: GeneratedClassKGType<Inscription> =
            GeneratedClassKGType(getTypeOrNull("gtk_inscription_get_type")!!) { Inscription(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of Inscription
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_inscription_get_type()
    }
}
