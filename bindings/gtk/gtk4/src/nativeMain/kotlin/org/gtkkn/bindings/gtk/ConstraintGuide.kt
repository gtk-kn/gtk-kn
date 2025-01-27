// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkConstraintGuide
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.gtk_constraint_guide_get_name
import org.gtkkn.native.gtk.gtk_constraint_guide_get_strength
import org.gtkkn.native.gtk.gtk_constraint_guide_get_type
import org.gtkkn.native.gtk.gtk_constraint_guide_new
import org.gtkkn.native.gtk.gtk_constraint_guide_set_max_size
import org.gtkkn.native.gtk.gtk_constraint_guide_set_min_size
import org.gtkkn.native.gtk.gtk_constraint_guide_set_name
import org.gtkkn.native.gtk.gtk_constraint_guide_set_nat_size
import org.gtkkn.native.gtk.gtk_constraint_guide_set_strength
import kotlin.String
import kotlin.Unit

/**
 * A `GtkConstraintGuide` is an invisible layout element in a
 * `GtkConstraintLayout`.
 *
 * The `GtkConstraintLayout` treats guides like widgets. They
 * can be used as the source or target of a `GtkConstraint`.
 *
 * Guides have a minimum, maximum and natural size. Depending
 * on the constraints that are applied, they can act like a
 * guideline that widgets can be aligned to, or like *flexible
 * space*.
 *
 * Unlike a `GtkWidget`, a `GtkConstraintGuide` will not be drawn.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `width`: width: Out parameter is not supported
 * - parameter `width`: width: Out parameter is not supported
 * - parameter `width`: width: Out parameter is not supported
 * - method `max-height`: Property has no getter nor setter
 * - method `max-width`: Property has no getter nor setter
 * - method `min-height`: Property has no getter nor setter
 * - method `min-width`: Property has no getter nor setter
 * - method `nat-height`: Property has no getter nor setter
 * - method `nat-width`: Property has no getter nor setter
 */
public open class ConstraintGuide(public val gtkConstraintGuidePointer: CPointer<GtkConstraintGuide>) :
    Object(gtkConstraintGuidePointer.reinterpret()),
    ConstraintTarget,
    KGTyped {
    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * A name that identifies the `GtkConstraintGuide`, for debugging.
     */
    public open var name: String?
        /**
         * Retrieves the name set using gtk_constraint_guide_set_name().
         *
         * @return the name of the guide
         */
        get() = gtk_constraint_guide_get_name(gtkConstraintGuidePointer)?.toKString()

        /**
         * Sets a name for the given `GtkConstraintGuide`.
         *
         * The name is useful for debugging purposes.
         *
         * @param name a name for the @guide
         */
        set(name) = gtk_constraint_guide_set_name(gtkConstraintGuidePointer, name)

    /**
     * The `GtkConstraintStrength` to be used for the constraint on
     * the natural size of the guide.
     */
    public open var strength: ConstraintStrength
        /**
         * Retrieves the strength set using gtk_constraint_guide_set_strength().
         *
         * @return the strength of the constraint on the natural size
         */
        get() = gtk_constraint_guide_get_strength(gtkConstraintGuidePointer).run {
            ConstraintStrength.fromNativeValue(this)
        }

        /**
         * Sets the strength of the constraint on the natural size of the
         * given `GtkConstraintGuide`.
         *
         * @param strength the strength of the constraint
         */
        set(strength) = gtk_constraint_guide_set_strength(gtkConstraintGuidePointer, strength.nativeValue)

    /**
     * Creates a new `GtkConstraintGuide` object.
     *
     * @return a new `GtkConstraintGuide` object.
     */
    public constructor() : this(gtk_constraint_guide_new()!!.reinterpret())

    /**
     * Sets the maximum size of @guide.
     *
     * If @guide is attached to a `GtkConstraintLayout`,
     * the constraints will be updated to reflect the new size.
     *
     * @param width the new maximum width, or -1 to not change it
     * @param height the new maximum height, or -1 to not change it
     */
    public open fun setMaxSize(width: gint, height: gint): Unit =
        gtk_constraint_guide_set_max_size(gtkConstraintGuidePointer, width, height)

    /**
     * Sets the minimum size of @guide.
     *
     * If @guide is attached to a `GtkConstraintLayout`,
     * the constraints will be updated to reflect the new size.
     *
     * @param width the new minimum width, or -1 to not change it
     * @param height the new minimum height, or -1 to not change it
     */
    public open fun setMinSize(width: gint, height: gint): Unit =
        gtk_constraint_guide_set_min_size(gtkConstraintGuidePointer, width, height)

    /**
     * Sets the natural size of @guide.
     *
     * If @guide is attached to a `GtkConstraintLayout`,
     * the constraints will be updated to reflect the new size.
     *
     * @param width the new natural width, or -1 to not change it
     * @param height the new natural height, or -1 to not change it
     */
    public open fun setNatSize(width: gint, height: gint): Unit =
        gtk_constraint_guide_set_nat_size(gtkConstraintGuidePointer, width, height)

    public companion object : TypeCompanion<ConstraintGuide> {
        override val type: GeneratedClassKGType<ConstraintGuide> =
            GeneratedClassKGType(getTypeOrNull("gtk_constraint_guide_get_type")!!) {
                ConstraintGuide(it.reinterpret())
            }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of ConstraintGuide
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_constraint_guide_get_type()
    }
}
