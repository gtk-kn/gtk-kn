// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
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
public open class StackPage(pointer: CPointer<GtkStackPage>) :
    Object(pointer.reinterpret()),
    Accessible,
    KGTyped {
    public val gtkStackPagePointer: CPointer<GtkStackPage>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    /**
     * The child that this page is for.
     */
    public open val child: Widget
        /**
         * Returns the stack child to which @self belongs.
         *
         * @return the child to which @self belongs
         */
        get() = gtk_stack_page_get_child(gtkStackPagePointer.reinterpret())!!.run {
            Widget(reinterpret())
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
        get() = gtk_stack_page_get_needs_attention(gtkStackPagePointer.reinterpret()).asBoolean()

        /**
         * Sets whether the page is marked as “needs attention”.
         *
         * @param setting the new value to set
         */
        set(setting) = gtk_stack_page_set_needs_attention(gtkStackPagePointer.reinterpret(), setting.asGBoolean())

    /**
     * If set, an underline in the title indicates a mnemonic.
     */
    public open var useUnderline: Boolean
        /**
         * Gets whether underlines in the page title indicate mnemonics.
         *
         * @return The value of the [property@Gtk.StackPage:use-underline] property
         */
        get() = gtk_stack_page_get_use_underline(gtkStackPagePointer.reinterpret()).asBoolean()

        /**
         * Sets whether underlines in the page title indicate mnemonics.
         *
         * @param setting the new value to set
         */
        set(setting) = gtk_stack_page_set_use_underline(gtkStackPagePointer.reinterpret(), setting.asGBoolean())

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
        get() = gtk_stack_page_get_visible(gtkStackPagePointer.reinterpret()).asBoolean()

        /**
         * Sets whether @page is visible in its `GtkStack`.
         *
         * @param visible The new property value
         */
        set(visible) = gtk_stack_page_set_visible(gtkStackPagePointer.reinterpret(), visible.asGBoolean())

    /**
     * Returns the icon name of the page.
     *
     * @return The value of the [property@Gtk.StackPage:icon-name] property
     */
    public open fun getIconName(): String? =
        gtk_stack_page_get_icon_name(gtkStackPagePointer.reinterpret())?.toKString()

    /**
     * Returns the name of the page.
     *
     * @return The value of the [property@Gtk.StackPage:name] property
     */
    public open fun getName(): String? = gtk_stack_page_get_name(gtkStackPagePointer.reinterpret())?.toKString()

    /**
     * Gets the page title.
     *
     * @return The value of the [property@Gtk.StackPage:title] property
     */
    public open fun getTitle(): String? = gtk_stack_page_get_title(gtkStackPagePointer.reinterpret())?.toKString()

    /**
     * Sets the icon name of the page.
     *
     * @param setting the new value to set
     */
    public open fun setIconName(setting: String): Unit =
        gtk_stack_page_set_icon_name(gtkStackPagePointer.reinterpret(), setting)

    /**
     * Sets the name of the page.
     *
     * @param setting the new value to set
     */
    public open fun setName(setting: String): Unit = gtk_stack_page_set_name(gtkStackPagePointer.reinterpret(), setting)

    /**
     * Sets the page title.
     *
     * @param setting the new value to set
     */
    public open fun setTitle(setting: String): Unit =
        gtk_stack_page_set_title(gtkStackPagePointer.reinterpret(), setting)

    public companion object : TypeCompanion<StackPage> {
        override val type: GeneratedClassKGType<StackPage> =
            GeneratedClassKGType(gtk_stack_page_get_type()) { StackPage(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of StackPage
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_stack_page_get_type()
    }
}
