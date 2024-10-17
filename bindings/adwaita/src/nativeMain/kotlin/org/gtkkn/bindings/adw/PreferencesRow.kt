// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gtk.ListBoxRow
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwPreferencesRow
import org.gtkkn.native.adw.adw_preferences_row_get_title
import org.gtkkn.native.adw.adw_preferences_row_get_title_selectable
import org.gtkkn.native.adw.adw_preferences_row_get_type
import org.gtkkn.native.adw.adw_preferences_row_get_use_markup
import org.gtkkn.native.adw.adw_preferences_row_get_use_underline
import org.gtkkn.native.adw.adw_preferences_row_new
import org.gtkkn.native.adw.adw_preferences_row_set_title
import org.gtkkn.native.adw.adw_preferences_row_set_title_selectable
import org.gtkkn.native.adw.adw_preferences_row_set_use_markup
import org.gtkkn.native.adw.adw_preferences_row_set_use_underline
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkActionable
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * A [class@Gtk.ListBoxRow] used to present preferences.
 *
 * The `AdwPreferencesRow` widget has a title that [class@PreferencesDialog]
 * will use to let the user look for a preference. It doesn't present the title
 * in any way and lets you present the preference as you please.
 *
 * [class@ActionRow] and its derivatives are convenient to use as preference
 * rows as they take care of presenting the preference's title while letting you
 * compose the inputs of the preference around it.
 */
public open class PreferencesRow(
    pointer: CPointer<AdwPreferencesRow>,
) : ListBoxRow(pointer.reinterpret()), KGTyped {
    public val adwPreferencesRowPointer: CPointer<AdwPreferencesRow>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkActionablePointer: CPointer<GtkActionable>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * The title of the preference represented by this row.
     *
     * The title is interpreted as Pango markup unless
     * [property@PreferencesRow:use-markup] is set to `FALSE`.
     */
    public open var title: String
        /**
         * Gets the title of the preference represented by @self.
         *
         * @return the title
         */
        get() =
            adw_preferences_row_get_title(adwPreferencesRowPointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

        /**
         * Sets the title of the preference represented by @self.
         *
         * The title is interpreted as Pango markup unless
         * [property@PreferencesRow:use-markup] is set to `FALSE`.
         *
         * @param title the title
         */
        set(title) = adw_preferences_row_set_title(adwPreferencesRowPointer.reinterpret(), title)

    /**
     * Whether the user can copy the title from the label.
     *
     * See also [property@Gtk.Label:selectable].
     *
     * @since 1.1
     */
    public open var titleSelectable: Boolean
        /**
         * Gets whether the user can copy the title from the label
         *
         * @return whether the user can copy the title from the label
         * @since 1.1
         */
        get() =
            adw_preferences_row_get_title_selectable(adwPreferencesRowPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the user can copy the title from the label
         *
         * See also [property@Gtk.Label:selectable].
         *
         * @param titleSelectable `TRUE` if the user can copy the title from the label
         * @since 1.1
         */
        set(titleSelectable) =
            adw_preferences_row_set_title_selectable(
                adwPreferencesRowPointer.reinterpret(),
                titleSelectable.asGBoolean()
            )

    /**
     * Whether to use Pango markup for the title label.
     *
     * Subclasses may also use it for other labels, such as subtitle.
     *
     * See also [func@Pango.parse_markup].
     *
     * @since 1.2
     */
    public open var useMarkup: Boolean
        /**
         * Gets whether to use Pango markup for the title label.
         *
         * @return whether to use markup
         * @since 1.2
         */
        get() =
            adw_preferences_row_get_use_markup(adwPreferencesRowPointer.reinterpret()).asBoolean()

        /**
         * Sets whether to use Pango markup for the title label.
         *
         * Subclasses may also use it for other labels, such as subtitle.
         *
         * See also [func@Pango.parse_markup].
         *
         * @param useMarkup whether to use markup
         * @since 1.2
         */
        set(useMarkup) =
            adw_preferences_row_set_use_markup(
                adwPreferencesRowPointer.reinterpret(),
                useMarkup.asGBoolean()
            )

    /**
     * Whether an embedded underline in the title indicates a mnemonic.
     */
    public open var useUnderline: Boolean
        /**
         * Gets whether an embedded underline in the title indicates a mnemonic.
         *
         * @return whether an embedded underline in the title indicates a mnemonic
         */
        get() =
            adw_preferences_row_get_use_underline(adwPreferencesRowPointer.reinterpret()).asBoolean()

        /**
         * Sets whether an embedded underline in the title indicates a mnemonic.
         *
         * @param useUnderline `TRUE` if underlines in the text indicate mnemonics
         */
        set(useUnderline) =
            adw_preferences_row_set_use_underline(
                adwPreferencesRowPointer.reinterpret(),
                useUnderline.asGBoolean()
            )

    /**
     * Creates a new `AdwPreferencesRow`.
     *
     * @return the newly created `AdwPreferencesRow`
     */
    public constructor() : this(adw_preferences_row_new()!!.reinterpret())

    /**
     * Gets the title of the preference represented by @self.
     *
     * @return the title
     */
    public open fun getTitle(): String =
        adw_preferences_row_get_title(adwPreferencesRowPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets whether the user can copy the title from the label
     *
     * @return whether the user can copy the title from the label
     * @since 1.1
     */
    public open fun getTitleSelectable(): Boolean =
        adw_preferences_row_get_title_selectable(adwPreferencesRowPointer.reinterpret()).asBoolean()

    /**
     * Gets whether to use Pango markup for the title label.
     *
     * @return whether to use markup
     * @since 1.2
     */
    public open fun getUseMarkup(): Boolean =
        adw_preferences_row_get_use_markup(adwPreferencesRowPointer.reinterpret()).asBoolean()

    /**
     * Gets whether an embedded underline in the title indicates a mnemonic.
     *
     * @return whether an embedded underline in the title indicates a mnemonic
     */
    public open fun getUseUnderline(): Boolean =
        adw_preferences_row_get_use_underline(adwPreferencesRowPointer.reinterpret()).asBoolean()

    /**
     * Sets the title of the preference represented by @self.
     *
     * The title is interpreted as Pango markup unless
     * [property@PreferencesRow:use-markup] is set to `FALSE`.
     *
     * @param title the title
     */
    public open fun setTitle(title: String): Unit =
        adw_preferences_row_set_title(adwPreferencesRowPointer.reinterpret(), title)

    /**
     * Sets whether the user can copy the title from the label
     *
     * See also [property@Gtk.Label:selectable].
     *
     * @param titleSelectable `TRUE` if the user can copy the title from the label
     * @since 1.1
     */
    public open fun setTitleSelectable(titleSelectable: Boolean): Unit =
        adw_preferences_row_set_title_selectable(
            adwPreferencesRowPointer.reinterpret(),
            titleSelectable.asGBoolean()
        )

    /**
     * Sets whether to use Pango markup for the title label.
     *
     * Subclasses may also use it for other labels, such as subtitle.
     *
     * See also [func@Pango.parse_markup].
     *
     * @param useMarkup whether to use markup
     * @since 1.2
     */
    public open fun setUseMarkup(useMarkup: Boolean): Unit =
        adw_preferences_row_set_use_markup(
            adwPreferencesRowPointer.reinterpret(),
            useMarkup.asGBoolean()
        )

    /**
     * Sets whether an embedded underline in the title indicates a mnemonic.
     *
     * @param useUnderline `TRUE` if underlines in the text indicate mnemonics
     */
    public open fun setUseUnderline(useUnderline: Boolean): Unit =
        adw_preferences_row_set_use_underline(
            adwPreferencesRowPointer.reinterpret(),
            useUnderline.asGBoolean()
        )

    public companion object : TypeCompanion<PreferencesRow> {
        override val type: GeneratedClassKGType<PreferencesRow> =
            GeneratedClassKGType(adw_preferences_row_get_type()) {
                PreferencesRow(it.reinterpret())
            }

        init {
            AdwTypeProvider.register()
        }
    }
}
