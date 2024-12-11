// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.Accessible
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwViewStackPage
import org.gtkkn.native.adw.adw_view_stack_page_get_badge_number
import org.gtkkn.native.adw.adw_view_stack_page_get_child
import org.gtkkn.native.adw.adw_view_stack_page_get_icon_name
import org.gtkkn.native.adw.adw_view_stack_page_get_name
import org.gtkkn.native.adw.adw_view_stack_page_get_needs_attention
import org.gtkkn.native.adw.adw_view_stack_page_get_title
import org.gtkkn.native.adw.adw_view_stack_page_get_type
import org.gtkkn.native.adw.adw_view_stack_page_get_use_underline
import org.gtkkn.native.adw.adw_view_stack_page_get_visible
import org.gtkkn.native.adw.adw_view_stack_page_set_badge_number
import org.gtkkn.native.adw.adw_view_stack_page_set_icon_name
import org.gtkkn.native.adw.adw_view_stack_page_set_name
import org.gtkkn.native.adw.adw_view_stack_page_set_needs_attention
import org.gtkkn.native.adw.adw_view_stack_page_set_title
import org.gtkkn.native.adw.adw_view_stack_page_set_use_underline
import org.gtkkn.native.adw.adw_view_stack_page_set_visible
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.guint
import org.gtkkn.native.gtk.GtkAccessible
import kotlin.Boolean
import kotlin.String

/**
 * An auxiliary class used by [class@ViewStack].
 */
public class ViewStackPage(pointer: CPointer<AdwViewStackPage>) :
    Object(pointer.reinterpret()),
    Accessible,
    KGTyped {
    public val adwViewStackPagePointer: CPointer<AdwViewStackPage>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    /**
     * The badge number for this page.
     *
     * [class@ViewSwitcher] can display it as a badge next to the page icon. It is
     * commonly used to display a number of unread items within the page.
     *
     * It can be used together with [property@ViewStack{age}:needs-attention].
     */
    public var badgeNumber: guint
        /**
         * Gets the badge number for this page.
         *
         * @return the badge number for this page
         */
        get() = adw_view_stack_page_get_badge_number(adwViewStackPagePointer.reinterpret())

        /**
         * Sets the badge number for this page.
         *
         * [class@ViewSwitcher] can display it as a badge next to the page icon. It is
         * commonly used to display a number of unread items within the page.
         *
         * It can be used together with [property@ViewStack{age}:needs-attention].
         *
         * @param badgeNumber the new value to set
         */
        set(badgeNumber) = adw_view_stack_page_set_badge_number(adwViewStackPagePointer.reinterpret(), badgeNumber)

    /**
     * The stack child to which the page belongs.
     */
    public val child: Widget
        /**
         * Gets the stack child to which @self belongs.
         *
         * @return the child to which @self belongs
         */
        get() = adw_view_stack_page_get_child(adwViewStackPagePointer.reinterpret())!!.run {
            Widget(reinterpret())
        }

    /**
     * The icon name of the child page.
     */
    public var iconName: String?
        /**
         * Gets the icon name of the page.
         *
         * @return the icon name of the page
         */
        get() = adw_view_stack_page_get_icon_name(adwViewStackPagePointer.reinterpret())?.toKString()

        /**
         * Sets the icon name of the page.
         *
         * @param iconName the icon name
         */
        set(iconName) = adw_view_stack_page_set_icon_name(adwViewStackPagePointer.reinterpret(), iconName)

    /**
     * The name of the child page.
     */
    public var name: String?
        /**
         * Gets the name of the page.
         *
         * @return the name of the page
         */
        get() = adw_view_stack_page_get_name(adwViewStackPagePointer.reinterpret())?.toKString()

        /**
         * Sets the name of the page.
         *
         * @param name the page name
         */
        set(name) = adw_view_stack_page_set_name(adwViewStackPagePointer.reinterpret(), name)

    /**
     * Whether the page requires the user attention.
     *
     * [class@ViewSwitcher] will display it as a dot next to the page icon.
     */
    public var needsAttention: Boolean
        /**
         * Gets whether the page requires the user attention.
         *
         * @return whether the page needs attention
         */
        get() = adw_view_stack_page_get_needs_attention(adwViewStackPagePointer.reinterpret()).asBoolean()

        /**
         * Sets whether the page requires the user attention.
         *
         * [class@ViewSwitcher] will display it as a dot next to the page icon.
         *
         * @param needsAttention the new value to set
         */
        set(
            needsAttention
        ) = adw_view_stack_page_set_needs_attention(adwViewStackPagePointer.reinterpret(), needsAttention.asGBoolean())

    /**
     * The title of the child page.
     */
    public var title: String?
        /**
         * Gets the page title.
         *
         * @return the page title
         */
        get() = adw_view_stack_page_get_title(adwViewStackPagePointer.reinterpret())?.toKString()

        /**
         * Sets the page title.
         *
         * @param title the page title
         */
        set(title) = adw_view_stack_page_set_title(adwViewStackPagePointer.reinterpret(), title)

    /**
     * Whether an embedded underline in the title indicates a mnemonic.
     */
    public var useUnderline: Boolean
        /**
         * Gets whether underlines in the page title indicate mnemonics.
         *
         * @return whether underlines in the page title indicate mnemonics
         */
        get() = adw_view_stack_page_get_use_underline(adwViewStackPagePointer.reinterpret()).asBoolean()

        /**
         * Sets whether underlines in the page title indicate mnemonics.
         *
         * @param useUnderline the new value to set
         */
        set(
            useUnderline
        ) = adw_view_stack_page_set_use_underline(adwViewStackPagePointer.reinterpret(), useUnderline.asGBoolean())

    /**
     * Whether this page is visible.
     *
     * This is independent from the [property@Gtk.Widget:visible] property of
     * [property@ViewStackPage:child].
     */
    public var visible: Boolean
        /**
         * Gets whether @self is visible in its `AdwViewStack`.
         *
         * This is independent from the [property@Gtk.Widget:visible]
         * property of its widget.
         *
         * @return whether @self is visible
         */
        get() = adw_view_stack_page_get_visible(adwViewStackPagePointer.reinterpret()).asBoolean()

        /**
         * Sets whether @page is visible in its `AdwViewStack`.
         *
         * This is independent from the [property@Gtk.Widget:visible] property of
         * [property@ViewStackPage:child].
         *
         * @param visible whether @self is visible
         */
        set(visible) = adw_view_stack_page_set_visible(adwViewStackPagePointer.reinterpret(), visible.asGBoolean())

    public companion object : TypeCompanion<ViewStackPage> {
        override val type: GeneratedClassKGType<ViewStackPage> =
            GeneratedClassKGType(adw_view_stack_page_get_type()) { ViewStackPage(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of ViewStackPage
         *
         * @return the GType
         */
        public fun getType(): GType = adw_view_stack_page_get_type()
    }
}
