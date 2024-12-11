// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.adw.annotations.AdwVersion1_1
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwPreferencesGroup
import org.gtkkn.native.adw.adw_preferences_group_add
import org.gtkkn.native.adw.adw_preferences_group_get_description
import org.gtkkn.native.adw.adw_preferences_group_get_header_suffix
import org.gtkkn.native.adw.adw_preferences_group_get_title
import org.gtkkn.native.adw.adw_preferences_group_get_type
import org.gtkkn.native.adw.adw_preferences_group_new
import org.gtkkn.native.adw.adw_preferences_group_remove
import org.gtkkn.native.adw.adw_preferences_group_set_description
import org.gtkkn.native.adw.adw_preferences_group_set_header_suffix
import org.gtkkn.native.adw.adw_preferences_group_set_title
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import kotlin.String
import kotlin.Unit

/**
 * A group of preference rows.
 *
 * <picture>
 *   <source srcset="preferences-group-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="preferences-group.png" alt="preferences-group">
 * </picture>
 *
 * An `AdwPreferencesGroup` represents a group or tightly related preferences,
 * which in turn are represented by [class@PreferencesRow].
 *
 * To summarize the role of the preferences it gathers, a group can have both a
 * title and a description. The title will be used by [class@PreferencesDialog]
 * to let the user look for a preference.
 *
 * ## AdwPreferencesGroup as GtkBuildable
 *
 * The `AdwPreferencesGroup` implementation of the [iface@Gtk.Buildable] interface
 * supports adding [class@PreferencesRow]s to the list by omitting "type". If "type"
 * is omitted and the widget isn't a [class@PreferencesRow] the child is added to
 * a box below the list.
 *
 * When the "type" attribute of a child is `header-suffix`, the child
 * is set as the suffix on the end of the title and description.
 *
 * ## CSS nodes
 *
 * `AdwPreferencesGroup` has a single CSS node with name `preferencesgroup`.
 *
 * ## Accessibility
 *
 * `AdwPreferencesGroup` uses the `GTK_ACCESSIBLE_ROLE_GROUP` role.
 */
public open class PreferencesGroup(pointer: CPointer<AdwPreferencesGroup>) :
    Widget(pointer.reinterpret()),
    KGTyped {
    public val adwPreferencesGroupPointer: CPointer<AdwPreferencesGroup>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * The description for this group of preferences.
     */
    public open var description: String?
        /**
         * Gets the description of @self.
         *
         * @return the description of @self
         */
        get() = adw_preferences_group_get_description(adwPreferencesGroupPointer.reinterpret())?.toKString()

        /**
         * Sets the description for @self.
         *
         * @param description the description
         */
        set(description) = adw_preferences_group_set_description(adwPreferencesGroupPointer.reinterpret(), description)

    /**
     * The header suffix widget.
     *
     * Displayed above the list, next to the title and description.
     *
     * Suffixes are commonly used to show a button or a spinner for the whole
     * group.
     *
     * @since 1.1
     */
    @AdwVersion1_1
    public open var headerSuffix: Widget?
        /**
         * Gets the suffix for @self's header.
         *
         * @return the suffix for @self's header.
         * @since 1.1
         */
        get() = adw_preferences_group_get_header_suffix(adwPreferencesGroupPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

        /**
         * Sets the suffix for @self's header.
         *
         * Displayed above the list, next to the title and description.
         *
         * Suffixes are commonly used to show a button or a spinner for the whole group.
         *
         * @param suffix the suffix to set
         * @since 1.1
         */
        @AdwVersion1_1
        set(
            suffix
        ) = adw_preferences_group_set_header_suffix(
            adwPreferencesGroupPointer.reinterpret(),
            suffix?.gtkWidgetPointer?.reinterpret()
        )

    /**
     * The title for this group of preferences.
     */
    public open var title: String
        /**
         * Gets the title of @self.
         *
         * @return the title of @self
         */
        get() = adw_preferences_group_get_title(adwPreferencesGroupPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

        /**
         * Sets the title for @self.
         *
         * @param title the title
         */
        set(title) = adw_preferences_group_set_title(adwPreferencesGroupPointer.reinterpret(), title)

    /**
     * Creates a new `AdwPreferencesGroup`.
     *
     * @return the newly created `AdwPreferencesGroup`
     */
    public constructor() : this(adw_preferences_group_new()!!.reinterpret())

    /**
     * Adds a child to @self.
     *
     * @param child the widget to add
     */
    public open fun add(child: Widget): Unit =
        adw_preferences_group_add(adwPreferencesGroupPointer.reinterpret(), child.gtkWidgetPointer.reinterpret())

    /**
     * Removes a child from @self.
     *
     * @param child the child to remove
     */
    public open fun remove(child: Widget): Unit =
        adw_preferences_group_remove(adwPreferencesGroupPointer.reinterpret(), child.gtkWidgetPointer.reinterpret())

    public companion object : TypeCompanion<PreferencesGroup> {
        override val type: GeneratedClassKGType<PreferencesGroup> =
            GeneratedClassKGType(adw_preferences_group_get_type()) { PreferencesGroup(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of PreferencesGroup
         *
         * @return the GType
         */
        public fun getType(): GType = adw_preferences_group_get_type()
    }
}
