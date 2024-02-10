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
import org.gtkkn.native.adw.AdwButtonContent
import org.gtkkn.native.adw.adw_button_content_get_icon_name
import org.gtkkn.native.adw.adw_button_content_get_label
import org.gtkkn.native.adw.adw_button_content_get_type
import org.gtkkn.native.adw.adw_button_content_get_use_underline
import org.gtkkn.native.adw.adw_button_content_new
import org.gtkkn.native.adw.adw_button_content_set_icon_name
import org.gtkkn.native.adw.adw_button_content_set_label
import org.gtkkn.native.adw.adw_button_content_set_use_underline
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * A helper widget for creating buttons.
 *
 * <picture>
 *   <source srcset="button-content-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="button-content.png" alt="button-content">
 * </picture>
 *
 * `AdwButtonContent` is a box-like widget with an icon and a label.
 *
 * It's intended to be used as a direct child of [class@Gtk.Button],
 * [class@Gtk.MenuButton] or [class@SplitButton], when they need to have both an
 * icon and a label, as follows:
 *
 * ```xml
 * <object class="GtkButton">
 *   <property name="child">
 *     <object class="AdwButtonContent">
 *       <property name="icon-name">document-open-symbolic</property>
 *       <property name="label" translatable="yes">_Open</property>
 *       <property name="use-underline">True</property>
 *     </object>
 *   </property>
 * </object>
 * ```
 *
 * `AdwButtonContent` handles style classes and connecting the mnemonic to the
 * button automatically.
 *
 * ## CSS nodes
 *
 * ```
 * buttoncontent
 * ├── image
 * ╰── label
 * ```
 *
 * `AdwButtonContent`'s CSS node is called `buttoncontent`. It contains the
 * subnodes `image` and `label`.
 *
 * When inside a `GtkButton` or `AdwSplitButton`, the button will receive the
 * `.image-text-button` style class. When inside a `GtkMenuButton`, the
 * internal `GtkButton` will receive it instead.
 *
 * ## Accessibility
 *
 * `AdwButtonContent` uses the `GTK_ACCESSIBLE_ROLE_GROUP` role.
 * @since 1.0
 */
public class ButtonContent(
    pointer: CPointer<AdwButtonContent>,
) : Widget(pointer.reinterpret()), KGTyped {
    public val adwButtonContentPointer: CPointer<AdwButtonContent>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * The name of the displayed icon.
     *
     * If empty, the icon is not shown.
     *
     * @since 1.0
     */
    public var iconName: String
        /**
         * Gets the name of the displayed icon.
         *
         * @return the icon name
         * @since 1.0
         */
        get() =
            adw_button_content_get_icon_name(adwButtonContentPointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

        /**
         * Sets the name of the displayed icon.
         *
         * @param iconName the new icon name
         * @since 1.0
         */
        set(iconName) =
            adw_button_content_set_icon_name(
                adwButtonContentPointer.reinterpret(),
                iconName
            )

    /**
     * The displayed label.
     *
     * @since 1.0
     */
    public var label: String
        /**
         * Gets the displayed label.
         *
         * @return the label
         * @since 1.0
         */
        get() =
            adw_button_content_get_label(adwButtonContentPointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

        /**
         * Sets the displayed label.
         *
         * @param label the new label
         * @since 1.0
         */
        set(label) = adw_button_content_set_label(adwButtonContentPointer.reinterpret(), label)

    /**
     * Whether an underline in the text indicates a mnemonic.
     *
     * The mnemonic can be used to activate the parent button.
     *
     * See [property@ButtonContent:label].
     *
     * @since 1.0
     */
    public var useUnderline: Boolean
        /**
         * Gets whether an underline in the text indicates a mnemonic.
         *
         * @return whether an underline in the text indicates a mnemonic
         * @since 1.0
         */
        get() =
            adw_button_content_get_use_underline(adwButtonContentPointer.reinterpret()).asBoolean()

        /**
         * Sets whether an underline in the text indicates a mnemonic.
         *
         * @param useUnderline whether an underline in the text indicates a mnemonic
         * @since 1.0
         */
        set(useUnderline) =
            adw_button_content_set_use_underline(
                adwButtonContentPointer.reinterpret(),
                useUnderline.asGBoolean()
            )

    /**
     * Creates a new `AdwButtonContent`.
     *
     * @return the new created `AdwButtonContent`
     * @since 1.0
     */
    public constructor() : this(adw_button_content_new()!!.reinterpret())

    /**
     * Gets the name of the displayed icon.
     *
     * @return the icon name
     * @since 1.0
     */
    public fun getIconName(): String =
        adw_button_content_get_icon_name(adwButtonContentPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the displayed label.
     *
     * @return the label
     * @since 1.0
     */
    public fun getLabel(): String =
        adw_button_content_get_label(adwButtonContentPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets whether an underline in the text indicates a mnemonic.
     *
     * @return whether an underline in the text indicates a mnemonic
     * @since 1.0
     */
    public fun getUseUnderline(): Boolean =
        adw_button_content_get_use_underline(adwButtonContentPointer.reinterpret()).asBoolean()

    /**
     * Sets the name of the displayed icon.
     *
     * @param iconName the new icon name
     * @since 1.0
     */
    public fun setIconName(iconName: String): Unit =
        adw_button_content_set_icon_name(adwButtonContentPointer.reinterpret(), iconName)

    /**
     * Sets the displayed label.
     *
     * @param label the new label
     * @since 1.0
     */
    public fun setLabel(label: String): Unit =
        adw_button_content_set_label(adwButtonContentPointer.reinterpret(), label)

    /**
     * Sets whether an underline in the text indicates a mnemonic.
     *
     * @param useUnderline whether an underline in the text indicates a mnemonic
     * @since 1.0
     */
    public fun setUseUnderline(useUnderline: Boolean): Unit =
        adw_button_content_set_use_underline(
            adwButtonContentPointer.reinterpret(),
            useUnderline.asGBoolean()
        )

    public companion object : TypeCompanion<ButtonContent> {
        override val type: GeneratedClassKGType<ButtonContent> =
            GeneratedClassKGType(adw_button_content_get_type()) {
                ButtonContent(it.reinterpret())
            }

        init {
            AdwTypeProvider.register()
        }
    }
}
