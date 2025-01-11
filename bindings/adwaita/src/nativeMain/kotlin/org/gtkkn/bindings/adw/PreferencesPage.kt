// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.adw.annotations.AdwVersion1_3
import org.gtkkn.bindings.adw.annotations.AdwVersion1_4
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwPreferencesPage
import org.gtkkn.native.adw.adw_preferences_page_add
import org.gtkkn.native.adw.adw_preferences_page_get_description
import org.gtkkn.native.adw.adw_preferences_page_get_icon_name
import org.gtkkn.native.adw.adw_preferences_page_get_name
import org.gtkkn.native.adw.adw_preferences_page_get_title
import org.gtkkn.native.adw.adw_preferences_page_get_type
import org.gtkkn.native.adw.adw_preferences_page_get_use_underline
import org.gtkkn.native.adw.adw_preferences_page_new
import org.gtkkn.native.adw.adw_preferences_page_remove
import org.gtkkn.native.adw.adw_preferences_page_scroll_to_top
import org.gtkkn.native.adw.adw_preferences_page_set_description
import org.gtkkn.native.adw.adw_preferences_page_set_icon_name
import org.gtkkn.native.adw.adw_preferences_page_set_name
import org.gtkkn.native.adw.adw_preferences_page_set_title
import org.gtkkn.native.adw.adw_preferences_page_set_use_underline
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * A page from [class@PreferencesDialog].
 *
 * <picture>
 *   <source srcset="preferences-page-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="preferences-page.png" alt="preferences-page">
 * </picture>
 *
 * The `AdwPreferencesPage` widget gathers preferences groups into a single page
 * of a preferences window.
 *
 * ## CSS nodes
 *
 * `AdwPreferencesPage` has a single CSS node with name `preferencespage`.
 *
 * ## Accessibility
 *
 * `AdwPreferencesPage` uses the `GTK_ACCESSIBLE_ROLE_GROUP` role.
 */
public open class PreferencesPage(public val adwPreferencesPagePointer: CPointer<AdwPreferencesPage>) :
    Widget(adwPreferencesPagePointer.reinterpret()),
    KGTyped {
    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * The description to be displayed at the top of the page.
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public open var description: String
        /**
         * Gets the description of @self.
         *
         * @return the description of @self.
         * @since 1.4
         */
        get() = adw_preferences_page_get_description(adwPreferencesPagePointer)?.toKString()
            ?: error("Expected not null string")

        /**
         * Sets the description of @self.
         *
         * The description is displayed at the top of the page.
         *
         * @param description the description
         * @since 1.4
         */
        @AdwVersion1_4
        set(description) = adw_preferences_page_set_description(adwPreferencesPagePointer, description)

    /**
     * The icon name for this page.
     */
    public open var iconName: String?
        /**
         * Gets the icon name for @self.
         *
         * @return the icon name for @self
         */
        get() = adw_preferences_page_get_icon_name(adwPreferencesPagePointer)?.toKString()

        /**
         * Sets the icon name for @self.
         *
         * @param iconName the icon name
         */
        set(iconName) = adw_preferences_page_set_icon_name(adwPreferencesPagePointer, iconName)

    /**
     * The name of this page.
     */
    public open var namePreferencesPage: String?
        /**
         * Gets the name of @self.
         *
         * @return the name of @self
         */
        get() = adw_preferences_page_get_name(adwPreferencesPagePointer)?.toKString()

        /**
         * Sets the name of @self.
         *
         * @param name the name
         */
        set(name) = adw_preferences_page_set_name(adwPreferencesPagePointer, name)

    /**
     * The title for this page.
     */
    public open var title: String
        /**
         * Gets the title of @self.
         *
         * @return the title of @self.
         */
        get() = adw_preferences_page_get_title(adwPreferencesPagePointer)?.toKString()
            ?: error("Expected not null string")

        /**
         * Sets the title of @self.
         *
         * @param title the title
         */
        set(title) = adw_preferences_page_set_title(adwPreferencesPagePointer, title)

    /**
     * Whether an embedded underline in the title indicates a mnemonic.
     */
    public open var useUnderline: Boolean
        /**
         * Gets whether an embedded underline in the title indicates a mnemonic.
         *
         * @return whether an embedded underline in the title indicates a mnemonic
         */
        get() = adw_preferences_page_get_use_underline(adwPreferencesPagePointer).asBoolean()

        /**
         * Sets whether an embedded underline in the title indicates a mnemonic.
         *
         * @param useUnderline `TRUE` if underlines in the text indicate mnemonics
         */
        set(useUnderline) = adw_preferences_page_set_use_underline(adwPreferencesPagePointer, useUnderline.asGBoolean())

    /**
     * Creates a new `AdwPreferencesPage`.
     *
     * @return the newly created `AdwPreferencesPage`
     */
    public constructor() : this(adw_preferences_page_new()!!.reinterpret())

    /**
     * Adds a preferences group to @self.
     *
     * @param group the group to add
     */
    public open fun add(group: PreferencesGroup): Unit =
        adw_preferences_page_add(adwPreferencesPagePointer, group.adwPreferencesGroupPointer)

    /**
     * Removes a group from @self.
     *
     * @param group the group to remove
     */
    public open fun remove(group: PreferencesGroup): Unit =
        adw_preferences_page_remove(adwPreferencesPagePointer, group.adwPreferencesGroupPointer)

    /**
     * Scrolls the scrolled window of @self to the top.
     *
     * @since 1.3
     */
    @AdwVersion1_3
    public open fun scrollToTop(): Unit = adw_preferences_page_scroll_to_top(adwPreferencesPagePointer)

    public companion object : TypeCompanion<PreferencesPage> {
        override val type: GeneratedClassKGType<PreferencesPage> =
            GeneratedClassKGType(adw_preferences_page_get_type()) { PreferencesPage(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of PreferencesPage
         *
         * @return the GType
         */
        public fun getType(): GType = adw_preferences_page_get_type()
    }
}
