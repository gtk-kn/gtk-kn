// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.adw.annotations.AdwVersion1_1
import org.gtkkn.bindings.adw.annotations.AdwVersion1_2
import org.gtkkn.bindings.gtk.ListBoxRow
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
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
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkActionable
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import kotlin.Boolean
import kotlin.String

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
public open class PreferencesRow(pointer: CPointer<AdwPreferencesRow>) :
    ListBoxRow(pointer.reinterpret()),
    KGTyped {
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
        get() = adw_preferences_row_get_title(adwPreferencesRowPointer)?.toKString()
            ?: error("Expected not null string")

        /**
         * Sets the title of the preference represented by @self.
         *
         * The title is interpreted as Pango markup unless
         * [property@PreferencesRow:use-markup] is set to `FALSE`.
         *
         * @param title the title
         */
        set(title) = adw_preferences_row_set_title(adwPreferencesRowPointer, title)

    /**
     * Whether the user can copy the title from the label.
     *
     * See also [property@Gtk.Label:selectable].
     *
     * @since 1.1
     */
    @AdwVersion1_1
    public open var titleSelectable: Boolean
        /**
         * Gets whether the user can copy the title from the label
         *
         * @return whether the user can copy the title from the label
         * @since 1.1
         */
        get() = adw_preferences_row_get_title_selectable(adwPreferencesRowPointer).asBoolean()

        /**
         * Sets whether the user can copy the title from the label
         *
         * See also [property@Gtk.Label:selectable].
         *
         * @param titleSelectable `TRUE` if the user can copy the title from the label
         * @since 1.1
         */
        @AdwVersion1_1
        set(
            titleSelectable
        ) = adw_preferences_row_set_title_selectable(adwPreferencesRowPointer, titleSelectable.asGBoolean())

    /**
     * Whether to use Pango markup for the title label.
     *
     * Subclasses may also use it for other labels, such as subtitle.
     *
     * See also [func@Pango.parse_markup].
     *
     * @since 1.2
     */
    @AdwVersion1_2
    public open var useMarkup: Boolean
        /**
         * Gets whether to use Pango markup for the title label.
         *
         * @return whether to use markup
         * @since 1.2
         */
        get() = adw_preferences_row_get_use_markup(adwPreferencesRowPointer).asBoolean()

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
        @AdwVersion1_2
        set(useMarkup) = adw_preferences_row_set_use_markup(adwPreferencesRowPointer, useMarkup.asGBoolean())

    /**
     * Whether an embedded underline in the title indicates a mnemonic.
     */
    public open var useUnderline: Boolean
        /**
         * Gets whether an embedded underline in the title indicates a mnemonic.
         *
         * @return whether an embedded underline in the title indicates a mnemonic
         */
        get() = adw_preferences_row_get_use_underline(adwPreferencesRowPointer).asBoolean()

        /**
         * Sets whether an embedded underline in the title indicates a mnemonic.
         *
         * @param useUnderline `TRUE` if underlines in the text indicate mnemonics
         */
        set(useUnderline) = adw_preferences_row_set_use_underline(adwPreferencesRowPointer, useUnderline.asGBoolean())

    /**
     * Creates a new `AdwPreferencesRow`.
     *
     * @return the newly created `AdwPreferencesRow`
     */
    public constructor() : this(adw_preferences_row_new()!!.reinterpret())

    public companion object : TypeCompanion<PreferencesRow> {
        override val type: GeneratedClassKGType<PreferencesRow> =
            GeneratedClassKGType(adw_preferences_row_get_type()) { PreferencesRow(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of PreferencesRow
         *
         * @return the GType
         */
        public fun getType(): GType = adw_preferences_row_get_type()
    }
}
