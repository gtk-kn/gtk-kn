// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwPreferencesPage
import org.gtkkn.native.adw.adw_preferences_page_add
import org.gtkkn.native.adw.adw_preferences_page_get_icon_name
import org.gtkkn.native.adw.adw_preferences_page_get_title
import org.gtkkn.native.adw.adw_preferences_page_get_type
import org.gtkkn.native.adw.adw_preferences_page_get_use_underline
import org.gtkkn.native.adw.adw_preferences_page_new
import org.gtkkn.native.adw.adw_preferences_page_remove
import org.gtkkn.native.adw.adw_preferences_page_set_icon_name
import org.gtkkn.native.adw.adw_preferences_page_set_title
import org.gtkkn.native.adw.adw_preferences_page_set_use_underline
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * A page from [class@PreferencesWindow].
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
 *
 * ## Skipped during bindings generation
 *
 * - method `get_name`: C function adw_preferences_page_get_name is ignored
 * - method `set_name`: C function adw_preferences_page_set_name is ignored
 * - method `name`: Property has no getter nor setter
 *
 * @since 1.0
 */
public open class PreferencesPage(
    pointer: CPointer<AdwPreferencesPage>,
) : Widget(pointer.reinterpret()), KGTyped {
    public val adwPreferencesPagePointer: CPointer<AdwPreferencesPage>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * The icon name for this page.
     *
     * @since 1.0
     */
    public open var iconName: String?
        /**
         * Gets the icon name for @self.
         *
         * @return the icon name for @self
         * @since 1.0
         */
        get() =
            adw_preferences_page_get_icon_name(adwPreferencesPagePointer.reinterpret())?.toKString()

        /**
         * Sets the icon name for @self.
         *
         * @param iconName the icon name
         * @since 1.0
         */
        set(iconName) =
            adw_preferences_page_set_icon_name(
                adwPreferencesPagePointer.reinterpret(),
                iconName
            )

    /**
     * The title for this page.
     *
     * @since 1.0
     */
    public open var title: String
        /**
         * Gets the title of @self.
         *
         * @return the title of @self.
         * @since 1.0
         */
        get() =
            adw_preferences_page_get_title(adwPreferencesPagePointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

        /**
         * Sets the title of @self.
         *
         * @param title the title
         * @since 1.0
         */
        set(title) = adw_preferences_page_set_title(adwPreferencesPagePointer.reinterpret(), title)

    /**
     * Whether an embedded underline in the title indicates a mnemonic.
     *
     * @since 1.0
     */
    public open var useUnderline: Boolean
        /**
         * Gets whether an embedded underline in the title indicates a mnemonic.
         *
         * @return whether an embedded underline in the title indicates a mnemonic
         * @since 1.0
         */
        get() =
            adw_preferences_page_get_use_underline(adwPreferencesPagePointer.reinterpret()).asBoolean()

        /**
         * Sets whether an embedded underline in the title indicates a mnemonic.
         *
         * @param useUnderline `TRUE` if underlines in the text indicate mnemonics
         * @since 1.0
         */
        set(useUnderline) =
            adw_preferences_page_set_use_underline(
                adwPreferencesPagePointer.reinterpret(),
                useUnderline.asGBoolean()
            )

    /**
     * Creates a new `AdwPreferencesPage`.
     *
     * @return the newly created `AdwPreferencesPage`
     * @since 1.0
     */
    public constructor() : this(adw_preferences_page_new()!!.reinterpret())

    /**
     * Adds a preferences group to @self.
     *
     * @param group the group to add
     * @since 1.0
     */
    public open fun add(group: PreferencesGroup): Unit =
        adw_preferences_page_add(
            adwPreferencesPagePointer.reinterpret(),
            group.adwPreferencesGroupPointer.reinterpret()
        )

    /**
     * Gets the icon name for @self.
     *
     * @return the icon name for @self
     * @since 1.0
     */
    public open fun getIconName(): String? =
        adw_preferences_page_get_icon_name(adwPreferencesPagePointer.reinterpret())?.toKString()

    /**
     * Gets the title of @self.
     *
     * @return the title of @self.
     * @since 1.0
     */
    public open fun getTitle(): String =
        adw_preferences_page_get_title(adwPreferencesPagePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets whether an embedded underline in the title indicates a mnemonic.
     *
     * @return whether an embedded underline in the title indicates a mnemonic
     * @since 1.0
     */
    public open fun getUseUnderline(): Boolean =
        adw_preferences_page_get_use_underline(adwPreferencesPagePointer.reinterpret()).asBoolean()

    /**
     * Removes a group from @self.
     *
     * @param group the group to remove
     * @since 1.0
     */
    public open fun remove(group: PreferencesGroup): Unit =
        adw_preferences_page_remove(
            adwPreferencesPagePointer.reinterpret(),
            group.adwPreferencesGroupPointer.reinterpret()
        )

    /**
     * Sets the icon name for @self.
     *
     * @param iconName the icon name
     * @since 1.0
     */
    public open fun setIconName(iconName: String? = null): Unit =
        adw_preferences_page_set_icon_name(adwPreferencesPagePointer.reinterpret(), iconName)

    /**
     * Sets the title of @self.
     *
     * @param title the title
     * @since 1.0
     */
    public open fun setTitle(title: String): Unit =
        adw_preferences_page_set_title(adwPreferencesPagePointer.reinterpret(), title)

    /**
     * Sets whether an embedded underline in the title indicates a mnemonic.
     *
     * @param useUnderline `TRUE` if underlines in the text indicate mnemonics
     * @since 1.0
     */
    public open fun setUseUnderline(useUnderline: Boolean): Unit =
        adw_preferences_page_set_use_underline(
            adwPreferencesPagePointer.reinterpret(),
            useUnderline.asGBoolean()
        )

    public companion object : TypeCompanion<PreferencesPage> {
        override val type: GeneratedClassKGType<PreferencesPage> =
            GeneratedClassKGType(adw_preferences_page_get_type()) {
                PreferencesPage(it.reinterpret())
            }

        init {
            AdwTypeProvider.register()
        }
    }
}
