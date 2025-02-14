// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_32
import org.gtkkn.bindings.gio.annotations.GioVersion2_34
import org.gtkkn.bindings.gio.annotations.GioVersion2_38
import org.gtkkn.bindings.glib.Variant
import org.gtkkn.bindings.glib.VariantType
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gio.GMenuItem
import org.gtkkn.native.gio.g_menu_item_get_attribute_value
import org.gtkkn.native.gio.g_menu_item_get_link
import org.gtkkn.native.gio.g_menu_item_get_type
import org.gtkkn.native.gio.g_menu_item_new
import org.gtkkn.native.gio.g_menu_item_new_from_model
import org.gtkkn.native.gio.g_menu_item_new_section
import org.gtkkn.native.gio.g_menu_item_new_submenu
import org.gtkkn.native.gio.g_menu_item_set_action_and_target_value
import org.gtkkn.native.gio.g_menu_item_set_attribute_value
import org.gtkkn.native.gio.g_menu_item_set_detailed_action
import org.gtkkn.native.gio.g_menu_item_set_icon
import org.gtkkn.native.gio.g_menu_item_set_label
import org.gtkkn.native.gio.g_menu_item_set_link
import org.gtkkn.native.gio.g_menu_item_set_section
import org.gtkkn.native.gio.g_menu_item_set_submenu
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import kotlin.String
import kotlin.Unit

/**
 * #GMenuItem is an opaque structure type.  You must access it using the
 * functions below.
 *
 * ## Skipped during bindings generation
 *
 * - method `get_attribute`: Varargs parameter is not supported
 * - method `set_action_and_target`: Varargs parameter is not supported
 * - method `set_attribute`: Varargs parameter is not supported
 *
 * @since 2.32
 */
@GioVersion2_32
public open class MenuItem(public val gioMenuItemPointer: CPointer<GMenuItem>) :
    Object(gioMenuItemPointer.reinterpret()),
    KGTyped {
    init {
        Gio
    }

    /**
     * Creates a new #GMenuItem.
     *
     * If @label is non-null it is used to set the "label" attribute of the
     * new item.
     *
     * If @detailed_action is non-null it is used to set the "action" and
     * possibly the "target" attribute of the new item.  See
     * g_menu_item_set_detailed_action() for more information.
     *
     * @param label the section label, or null
     * @param detailedAction the detailed action string, or null
     * @return a new #GMenuItem
     * @since 2.32
     */
    public constructor(
        label: String? = null,
        detailedAction: String? = null,
    ) : this(g_menu_item_new(label, detailedAction)!!) {
        InstanceCache.put(this)
    }

    /**
     * Creates a #GMenuItem as an exact copy of an existing menu item in a
     * #GMenuModel.
     *
     * @item_index must be valid (ie: be sure to call
     * g_menu_model_get_n_items() first).
     *
     * @param model a #GMenuModel
     * @param itemIndex the index of an item in @model
     * @return a new #GMenuItem.
     * @since 2.34
     */
    public constructor(
        model: MenuModel,
        itemIndex: gint,
    ) : this(g_menu_item_new_from_model(model.gioMenuModelPointer, itemIndex)!!) {
        InstanceCache.put(this)
    }

    /**
     * Creates a new #GMenuItem representing a section.
     *
     * This is a convenience API around g_menu_item_new() and
     * g_menu_item_set_section().
     *
     * The effect of having one menu appear as a section of another is
     * exactly as it sounds: the items from @section become a direct part of
     * the menu that @menu_item is added to.
     *
     * Visual separation is typically displayed between two non-empty
     * sections.  If @label is non-null then it will be incorporated into
     * this visual indication.  This allows for labeled subsections of a
     * menu.
     *
     * As a simple example, consider a typical "Edit" menu from a simple
     * program.  It probably contains an "Undo" and "Redo" item, followed by
     * a separator, followed by "Cut", "Copy" and "Paste".
     *
     * This would be accomplished by creating three #GMenu instances.  The
     * first would be populated with the "Undo" and "Redo" items, and the
     * second with the "Cut", "Copy" and "Paste" items.  The first and
     * second menus would then be added as submenus of the third.  In XML
     * format, this would look something like the following:
     * |[
     * <menu id='edit-menu'>
     *   <section>
     *     <item label='Undo'/>
     *     <item label='Redo'/>
     *   </section>
     *   <section>
     *     <item label='Cut'/>
     *     <item label='Copy'/>
     *     <item label='Paste'/>
     *   </section>
     * </menu>
     * ]|
     *
     * The following example is exactly equivalent.  It is more illustrative
     * of the exact relationship between the menus and items (keeping in
     * mind that the 'link' element defines a new menu that is linked to the
     * containing one).  The style of the second example is more verbose and
     * difficult to read (and therefore not recommended except for the
     * purpose of understanding what is really going on).
     * |[
     * <menu id='edit-menu'>
     *   <item>
     *     <link name='section'>
     *       <item label='Undo'/>
     *       <item label='Redo'/>
     *     </link>
     *   </item>
     *   <item>
     *     <link name='section'>
     *       <item label='Cut'/>
     *       <item label='Copy'/>
     *       <item label='Paste'/>
     *     </link>
     *   </item>
     * </menu>
     * ]|
     *
     * @param label the section label, or null
     * @param section a #GMenuModel with the items of the section
     * @return a new #GMenuItem
     * @since 2.32
     */
    public constructor(
        label: String? = null,
        section: MenuModel,
    ) : this(g_menu_item_new_section(label, section.gioMenuModelPointer)!!) {
        InstanceCache.put(this)
    }

    /**
     * Queries the named @attribute on @menu_item.
     *
     * If @expected_type is specified and the attribute does not have this
     * type, null is returned.  null is also returned if the attribute
     * simply does not exist.
     *
     * @param attribute the attribute name to query
     * @param expectedType the expected type of the attribute
     * @return the attribute value, or null
     * @since 2.34
     */
    @GioVersion2_34
    public open fun getAttributeValue(attribute: String, expectedType: VariantType? = null): Variant? =
        g_menu_item_get_attribute_value(gioMenuItemPointer, attribute, expectedType?.glibVariantTypePointer)?.run {
            Variant(this)
        }

    /**
     * Queries the named @link on @menu_item.
     *
     * @param link the link name to query
     * @return the link, or null
     * @since 2.34
     */
    @GioVersion2_34
    public open fun getLink(link: String): MenuModel? = g_menu_item_get_link(gioMenuItemPointer, link)?.run {
        InstanceCache.get(this, true) { MenuModel.MenuModelImpl(reinterpret()) }!!
    }

    /**
     * Sets or unsets the "action" and "target" attributes of @menu_item.
     *
     * If @action is null then both the "action" and "target" attributes
     * are unset (and @target_value is ignored).
     *
     * If @action is non-null then the "action" attribute is set.  The
     * "target" attribute is then set to the value of @target_value if it is
     * non-null or unset otherwise.
     *
     * Normal menu items (ie: not submenu, section or other custom item
     * types) are expected to have the "action" attribute set to identify
     * the action that they are associated with.  The state type of the
     * action help to determine the disposition of the menu item.  See
     * #GAction and #GActionGroup for an overview of actions.
     *
     * In general, clicking on the menu item will result in activation of
     * the named action with the "target" attribute given as the parameter
     * to the action invocation.  If the "target" attribute is not set then
     * the action is invoked with no parameter.
     *
     * If the action has no state then the menu item is usually drawn as a
     * plain menu item (ie: with no additional decoration).
     *
     * If the action has a boolean state then the menu item is usually drawn
     * as a toggle menu item (ie: with a checkmark or equivalent
     * indication).  The item should be marked as 'toggled' or 'checked'
     * when the boolean state is true.
     *
     * If the action has a string state then the menu item is usually drawn
     * as a radio menu item (ie: with a radio bullet or equivalent
     * indication).  The item should be marked as 'selected' when the string
     * state is equal to the value of the @target property.
     *
     * See g_menu_item_set_action_and_target() or
     * g_menu_item_set_detailed_action() for two equivalent calls that are
     * probably more convenient for most uses.
     *
     * @param action the name of the action for this item
     * @param targetValue a #GVariant to use as the action target
     * @since 2.32
     */
    @GioVersion2_32
    public open fun setActionAndTargetValue(action: String? = null, targetValue: Variant? = null): Unit =
        g_menu_item_set_action_and_target_value(gioMenuItemPointer, action, targetValue?.glibVariantPointer)

    /**
     * Sets or unsets an attribute on @menu_item.
     *
     * The attribute to set or unset is specified by @attribute. This
     * can be one of the standard attribute names %G_MENU_ATTRIBUTE_LABEL,
     * %G_MENU_ATTRIBUTE_ACTION, %G_MENU_ATTRIBUTE_TARGET, or a custom
     * attribute name.
     * Attribute names are restricted to lowercase characters, numbers
     * and '-'. Furthermore, the names must begin with a lowercase character,
     * must not end with a '-', and must not contain consecutive dashes.
     *
     * must consist only of lowercase
     * ASCII characters, digits and '-'.
     *
     * If @value is non-null then it is used as the new value for the
     * attribute.  If @value is null then the attribute is unset. If
     * the @value #GVariant is floating, it is consumed.
     *
     * See also g_menu_item_set_attribute() for a more convenient way to do
     * the same.
     *
     * @param attribute the attribute to set
     * @param value a #GVariant to use as the value, or null
     * @since 2.32
     */
    @GioVersion2_32
    public open fun setAttributeValue(attribute: String, `value`: Variant? = null): Unit =
        g_menu_item_set_attribute_value(gioMenuItemPointer, attribute, `value`?.glibVariantPointer)

    /**
     * Sets the "action" and possibly the "target" attribute of @menu_item.
     *
     * The format of @detailed_action is the same format parsed by
     * g_action_parse_detailed_name().
     *
     * See g_menu_item_set_action_and_target() or
     * g_menu_item_set_action_and_target_value() for more flexible (but
     * slightly less convenient) alternatives.
     *
     * See also g_menu_item_set_action_and_target_value() for a description of
     * the semantics of the action and target attributes.
     *
     * @param detailedAction the "detailed" action string
     * @since 2.32
     */
    @GioVersion2_32
    public open fun setDetailedAction(detailedAction: String): Unit =
        g_menu_item_set_detailed_action(gioMenuItemPointer, detailedAction)

    /**
     * Sets (or unsets) the icon on @menu_item.
     *
     * This call is the same as calling g_icon_serialize() and using the
     * result as the value to g_menu_item_set_attribute_value() for
     * %G_MENU_ATTRIBUTE_ICON.
     *
     * This API is only intended for use with "noun" menu items; things like
     * bookmarks or applications in an "Open With" menu.  Don't use it on
     * menu items corresponding to verbs (eg: stock icons for 'Save' or
     * 'Quit').
     *
     * If @icon is null then the icon is unset.
     *
     * @param icon a #GIcon, or null
     * @since 2.38
     */
    @GioVersion2_38
    public open fun setIcon(icon: Icon): Unit = g_menu_item_set_icon(gioMenuItemPointer, icon.gioIconPointer)

    /**
     * Sets or unsets the "label" attribute of @menu_item.
     *
     * If @label is non-null it is used as the label for the menu item.  If
     * it is null then the label attribute is unset.
     *
     * @param label the label to set, or null to unset
     * @since 2.32
     */
    @GioVersion2_32
    public open fun setLabel(label: String? = null): Unit = g_menu_item_set_label(gioMenuItemPointer, label)

    /**
     * Creates a link from @menu_item to @model if non-null, or unsets it.
     *
     * Links are used to establish a relationship between a particular menu
     * item and another menu.  For example, %G_MENU_LINK_SUBMENU is used to
     * associate a submenu with a particular menu item, and %G_MENU_LINK_SECTION
     * is used to create a section. Other types of link can be used, but there
     * is no guarantee that clients will be able to make sense of them.
     * Link types are restricted to lowercase characters, numbers
     * and '-'. Furthermore, the names must begin with a lowercase character,
     * must not end with a '-', and must not contain consecutive dashes.
     *
     * @param link type of link to establish or unset
     * @param model the #GMenuModel to link to (or null to unset)
     * @since 2.32
     */
    @GioVersion2_32
    public open fun setLink(link: String, model: MenuModel? = null): Unit =
        g_menu_item_set_link(gioMenuItemPointer, link, model?.gioMenuModelPointer)

    /**
     * Sets or unsets the "section" link of @menu_item to @section.
     *
     * The effect of having one menu appear as a section of another is
     * exactly as it sounds: the items from @section become a direct part of
     * the menu that @menu_item is added to.  See g_menu_item_new_section()
     * for more information about what it means for a menu item to be a
     * section.
     *
     * @param section a #GMenuModel, or null
     * @since 2.32
     */
    @GioVersion2_32
    public open fun setSection(section: MenuModel? = null): Unit =
        g_menu_item_set_section(gioMenuItemPointer, section?.gioMenuModelPointer)

    /**
     * Sets or unsets the "submenu" link of @menu_item to @submenu.
     *
     * If @submenu is non-null, it is linked to.  If it is null then the
     * link is unset.
     *
     * The effect of having one menu appear as a submenu of another is
     * exactly as it sounds.
     *
     * @param submenu a #GMenuModel, or null
     * @since 2.32
     */
    @GioVersion2_32
    public open fun setSubmenu(submenu: MenuModel? = null): Unit =
        g_menu_item_set_submenu(gioMenuItemPointer, submenu?.gioMenuModelPointer)

    public companion object : TypeCompanion<MenuItem> {
        override val type: GeneratedClassKGType<MenuItem> =
            GeneratedClassKGType(getTypeOrNull()!!) { MenuItem(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of MenuItem
         *
         * @return the GType
         */
        public fun getType(): GType = g_menu_item_get_type()

        /**
         * Gets the GType of from the symbol `g_menu_item_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? = org.gtkkn.extensions.glib.cinterop.getTypeOrNull("g_menu_item_get_type")

        /**
         * Creates a new #GMenuItem representing a submenu.
         *
         * This is a convenience API around g_menu_item_new() and
         * g_menu_item_set_submenu().
         *
         * @param label the section label, or null
         * @param submenu a #GMenuModel with the items of the submenu
         * @return a new #GMenuItem
         * @since 2.32
         */
        public fun submenu(label: String? = null, submenu: MenuModel): MenuItem =
            MenuItem(g_menu_item_new_submenu(label, submenu.gioMenuModelPointer)!!).apply {
                InstanceCache.put(this)
            }
    }
}
