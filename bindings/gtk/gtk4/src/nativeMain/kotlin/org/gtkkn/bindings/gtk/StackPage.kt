// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkStackPage
import org.gtkkn.native.gtk.gtk_stack_page_get_child
import org.gtkkn.native.gtk.gtk_stack_page_get_icon_name
import org.gtkkn.native.gtk.gtk_stack_page_get_name
import org.gtkkn.native.gtk.gtk_stack_page_get_needs_attention
import org.gtkkn.native.gtk.gtk_stack_page_get_title
import org.gtkkn.native.gtk.gtk_stack_page_get_type
import org.gtkkn.native.gtk.gtk_stack_page_get_use_underline
import org.gtkkn.native.gtk.gtk_stack_page_get_visible
import org.gtkkn.native.gtk.gtk_stack_page_set_icon_name
import org.gtkkn.native.gtk.gtk_stack_page_set_name
import org.gtkkn.native.gtk.gtk_stack_page_set_needs_attention
import org.gtkkn.native.gtk.gtk_stack_page_set_title
import org.gtkkn.native.gtk.gtk_stack_page_set_use_underline
import org.gtkkn.native.gtk.gtk_stack_page_set_visible
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * `GtkStackPage` is an auxiliary class used by `GtkStack`.
 *
 * ## Skipped during bindings generation
 *
 * - method `icon-name`: Property TypeInfo of getter and setter do not match
 * - method `name`: Property TypeInfo of getter and setter do not match
 * - method `title`: Property TypeInfo of getter and setter do not match
 */
public open class StackPage(public val gtkStackPagePointer: CPointer<GtkStackPage>) :
    Object(gtkStackPagePointer.reinterpret()),
    Accessible,
    KGTyped {
    init {
        Gtk
    }

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    /**
     * The child that this page is for.
     */
    public open val child: Widget
        /**
         * Returns the stack child to which @self belongs.
         *
         * @return the child to which @self belongs
         */
        get() = gtk_stack_page_get_child(gtkStackPagePointer)!!.run {
            InstanceCache.get(this, true) { Widget.WidgetImpl(reinterpret()) }!!
        }

    /**
     * Whether the page requires the user attention.
     *
     * This is used by the [class@Gtk.StackSwitcher] to change the
     * appearance of the corresponding button when a page needs
     * attention and it is not the current one.
     */
    public open var needsAttention: Boolean
        /**
         * Returns whether the page is marked as “needs attention”.
         *
         * @return The value of the [property@Gtk.StackPage:needs-attention]
         *   property.
         */
        get() = gtk_stack_page_get_needs_attention(gtkStackPagePointer).asBoolean()

        /**
         * Sets whether the page is marked as “needs attention”.
         *
         * @param setting the new value to set
         */
        set(setting) = gtk_stack_page_set_needs_attention(gtkStackPagePointer, setting.asGBoolean())

    /**
     * If set, an underline in the title indicates a mnemonic.
     */
    public open var useUnderline: Boolean
        /**
         * Gets whether underlines in the page title indicate mnemonics.
         *
         * @return The value of the [property@Gtk.StackPage:use-underline] property
         */
        get() = gtk_stack_page_get_use_underline(gtkStackPagePointer).asBoolean()

        /**
         * Sets whether underlines in the page title indicate mnemonics.
         *
         * @param setting the new value to set
         */
        set(setting) = gtk_stack_page_set_use_underline(gtkStackPagePointer, setting.asGBoolean())

    /**
     * Whether this page is visible.
     */
    public open var visible: Boolean
        /**
         * Returns whether @page is visible in its `GtkStack`.
         *
         * This is independent from the [property@Gtk.Widget:visible]
         * property of its widget.
         *
         * @return true if @page is visible
         */
        get() = gtk_stack_page_get_visible(gtkStackPagePointer).asBoolean()

        /**
         * Sets whether @page is visible in its `GtkStack`.
         *
         * @param visible The new property value
         */
        set(visible) = gtk_stack_page_set_visible(gtkStackPagePointer, visible.asGBoolean())

    /**
     * Returns the icon name of the page.
     *
     * @return The value of the [property@Gtk.StackPage:icon-name] property
     */
    public open fun getIconName(): String? = gtk_stack_page_get_icon_name(gtkStackPagePointer)?.toKString()

    /**
     * Returns the name of the page.
     *
     * @return The value of the [property@Gtk.StackPage:name] property
     */
    public open fun getName(): String? = gtk_stack_page_get_name(gtkStackPagePointer)?.toKString()

    /**
     * Gets the page title.
     *
     * @return The value of the [property@Gtk.StackPage:title] property
     */
    public open fun getTitle(): String? = gtk_stack_page_get_title(gtkStackPagePointer)?.toKString()

    /**
     * Sets the icon name of the page.
     *
     * @param setting the new value to set
     */
    public open fun setIconName(setting: String): Unit = gtk_stack_page_set_icon_name(gtkStackPagePointer, setting)

    /**
     * Sets the name of the page.
     *
     * @param setting the new value to set
     */
    public open fun setName(setting: String): Unit = gtk_stack_page_set_name(gtkStackPagePointer, setting)

    /**
     * Sets the page title.
     *
     * @param setting the new value to set
     */
    public open fun setTitle(setting: String): Unit = gtk_stack_page_set_title(gtkStackPagePointer, setting)

    public companion object : TypeCompanion<StackPage> {
        override val type: GeneratedClassKGType<StackPage> =
            GeneratedClassKGType(getTypeOrNull()!!) { StackPage(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of StackPage
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_stack_page_get_type()

        /**
         * Gets the GType of from the symbol `gtk_stack_page_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_stack_page_get_type")
    }
}
