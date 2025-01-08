// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.adw.annotations.AdwVersion1_4
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwButtonContent
import org.gtkkn.native.adw.adw_button_content_get_can_shrink
import org.gtkkn.native.adw.adw_button_content_get_icon_name
import org.gtkkn.native.adw.adw_button_content_get_label
import org.gtkkn.native.adw.adw_button_content_get_type
import org.gtkkn.native.adw.adw_button_content_get_use_underline
import org.gtkkn.native.adw.adw_button_content_new
import org.gtkkn.native.adw.adw_button_content_set_can_shrink
import org.gtkkn.native.adw.adw_button_content_set_icon_name
import org.gtkkn.native.adw.adw_button_content_set_label
import org.gtkkn.native.adw.adw_button_content_set_use_underline
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import kotlin.Boolean
import kotlin.String

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
 * ╰── box
 *     ├── image
 *     ╰── label
 * ```
 *
 * `AdwButtonContent`'s CSS node is called `buttoncontent`. It contains a `box`
 * subnode that serves as a container for the  `image` and `label` nodes.
 *
 * When inside a `GtkButton` or `AdwSplitButton`, the button will receive the
 * `.image-text-button` style class. When inside a `GtkMenuButton`, the
 * internal `GtkButton` will receive it instead.
 *
 * ## Accessibility
 *
 * `AdwButtonContent` uses the `GTK_ACCESSIBLE_ROLE_GROUP` role.
 */
public class ButtonContent(pointer: CPointer<AdwButtonContent>) :
    Widget(pointer.reinterpret()),
    KGTyped {
    public val adwButtonContentPointer: CPointer<AdwButtonContent>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * Whether the button can be smaller than the natural size of its contents.
     *
     * If set to `TRUE`, the label will ellipsize.
     *
     * See [property@Gtk.Button:can-shrink].
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public var canShrink: Boolean
        /**
         * gets whether the button can be smaller than the natural size of its contents.
         *
         * @return whether the button can shrink
         * @since 1.4
         */
        get() = adw_button_content_get_can_shrink(adwButtonContentPointer).asBoolean()

        /**
         * Sets whether the button can be smaller than the natural size of its contents.
         *
         * If set to `TRUE`, the label will ellipsize.
         *
         * See [method@Gtk.Button.set_can_shrink].
         *
         * @param canShrink whether the button can shrink
         * @since 1.4
         */
        @AdwVersion1_4
        set(canShrink) = adw_button_content_set_can_shrink(adwButtonContentPointer, canShrink.asGBoolean())

    /**
     * The name of the displayed icon.
     *
     * If empty, the icon is not shown.
     */
    public var iconName: String
        /**
         * Gets the name of the displayed icon.
         *
         * @return the icon name
         */
        get() = adw_button_content_get_icon_name(adwButtonContentPointer)?.toKString()
            ?: error("Expected not null string")

        /**
         * Sets the name of the displayed icon.
         *
         * If empty, the icon is not shown.
         *
         * @param iconName the new icon name
         */
        set(iconName) = adw_button_content_set_icon_name(adwButtonContentPointer, iconName)

    /**
     * The displayed label.
     */
    public var label: String
        /**
         * Gets the displayed label.
         *
         * @return the label
         */
        get() = adw_button_content_get_label(adwButtonContentPointer)?.toKString() ?: error("Expected not null string")

        /**
         * Sets the displayed label.
         *
         * @param label the new label
         */
        set(label) = adw_button_content_set_label(adwButtonContentPointer, label)

    /**
     * Whether an underline in the text indicates a mnemonic.
     *
     * The mnemonic can be used to activate the parent button.
     *
     * See [property@ButtonContent:label].
     */
    public var useUnderline: Boolean
        /**
         * Gets whether an underline in the text indicates a mnemonic.
         *
         * @return whether an underline in the text indicates a mnemonic
         */
        get() = adw_button_content_get_use_underline(adwButtonContentPointer).asBoolean()

        /**
         * Sets whether an underline in the text indicates a mnemonic.
         *
         * The mnemonic can be used to activate the parent button.
         *
         * See [property@ButtonContent:label].
         *
         * @param useUnderline whether an underline in the text indicates a mnemonic
         */
        set(useUnderline) = adw_button_content_set_use_underline(adwButtonContentPointer, useUnderline.asGBoolean())

    /**
     * Creates a new `AdwButtonContent`.
     *
     * @return the new created `AdwButtonContent`
     */
    public constructor() : this(adw_button_content_new()!!.reinterpret())

    public companion object : TypeCompanion<ButtonContent> {
        override val type: GeneratedClassKGType<ButtonContent> =
            GeneratedClassKGType(adw_button_content_get_type()) { ButtonContent(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of ButtonContent
         *
         * @return the GType
         */
        public fun getType(): GType = adw_button_content_get_type()
    }
}
