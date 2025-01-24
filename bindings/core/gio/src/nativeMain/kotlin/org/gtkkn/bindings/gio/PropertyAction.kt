// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_38
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GAction
import org.gtkkn.native.gio.GPropertyAction
import org.gtkkn.native.gio.g_property_action_get_type
import org.gtkkn.native.gio.g_property_action_new
import org.gtkkn.native.gobject.GType
import kotlin.String

/**
 * A `GPropertyAction` is a way to get a [iface@Gio.Action] with a state value
 * reflecting and controlling the value of a [class@GObject.Object] property.
 *
 * The state of the action will correspond to the value of the property.
 * Changing it will change the property (assuming the requested value
 * matches the requirements as specified in the [type@GObject.ParamSpec]).
 *
 * Only the most common types are presently supported.  Booleans are
 * mapped to booleans, strings to strings, signed/unsigned integers to
 * int32/uint32 and floats and doubles to doubles.
 *
 * If the property is an enum then the state will be string-typed and
 * conversion will automatically be performed between the enum value and
 * ‘nick’ string as per the [type@GObject.EnumValue] table.
 *
 * Flags types are not currently supported.
 *
 * Properties of object types, boxed types and pointer types are not
 * supported and probably never will be.
 *
 * Properties of [type@GLib.Variant] types are not currently supported.
 *
 * If the property is boolean-valued then the action will have a `NULL`
 * parameter type, and activating the action (with no parameter) will
 * toggle the value of the property.
 *
 * In all other cases, the parameter type will correspond to the type of
 * the property.
 *
 * The general idea here is to reduce the number of locations where a
 * particular piece of state is kept (and therefore has to be synchronised
 * between). `GPropertyAction` does not have a separate state that is kept
 * in sync with the property value — its state is the property value.
 *
 * For example, it might be useful to create a [iface@Gio.Action] corresponding
 * to the `visible-child-name` property of a [`GtkStack`](https://docs.gtk.org/gtk4/class.Stack.html)
 * so that the current page can be switched from a menu.  The active radio
 * indication in the menu is then directly determined from the active page of
 * the `GtkStack`.
 *
 * An anti-example would be binding the `active-id` property on a
 * [`GtkComboBox`](https://docs.gtk.org/gtk4/class.ComboBox.html). This is
 * because the state of the combo box itself is probably uninteresting and is
 * actually being used to control something else.
 *
 * Another anti-example would be to bind to the `visible-child-name`
 * property of a [`GtkStack`](https://docs.gtk.org/gtk4/class.Stack.html) if
 * this value is actually stored in [class@Gio.Settings].  In that case, the
 * real source of the value is* [class@Gio.Settings].  If you want
 * a [iface@Gio.Action] to control a setting stored in [class@Gio.Settings],
 * see [method@Gio.Settings.create_action] instead, and possibly combine its
 * use with [method@Gio.Settings.bind].
 *
 * ## Skipped during bindings generation
 *
 * - method `enabled`: Property has no getter nor setter
 * - method `invert-boolean`: Property has no getter nor setter
 * - method `name`: Property has no getter nor setter
 * - method `object`: Property has no getter nor setter
 * - method `parameter-type`: Property has no getter nor setter
 * - method `property-name`: Property has no getter nor setter
 * - method `state`: Property has no getter nor setter
 * - method `state-type`: Property has no getter nor setter
 *
 * @since 2.38
 */
@GioVersion2_38
public open class PropertyAction(public val gioPropertyActionPointer: CPointer<GPropertyAction>) :
    Object(gioPropertyActionPointer.reinterpret()),
    Action,
    KGTyped {
    override val gioActionPointer: CPointer<GAction>
        get() = handle.reinterpret()

    /**
     * Creates a #GAction corresponding to the value of property
     * @property_name on @object.
     *
     * The property must be existent and readable and writable (and not
     * construct-only).
     *
     * This function takes a reference on @object and doesn't release it
     * until the action is destroyed.
     *
     * @param name the name of the action to create
     * @param object the object that has the property
     *   to wrap
     * @param propertyName the name of the property
     * @return a new #GPropertyAction
     * @since 2.38
     */
    public constructor(
        name: String,
        `object`: Object,
        propertyName: String,
    ) : this(g_property_action_new(name, `object`.gobjectObjectPointer.reinterpret(), propertyName)!!.reinterpret())

    public companion object : TypeCompanion<PropertyAction> {
        override val type: GeneratedClassKGType<PropertyAction> =
            GeneratedClassKGType(g_property_action_get_type()) { PropertyAction(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of PropertyAction
         *
         * @return the GType
         */
        public fun getType(): GType = g_property_action_get_type()
    }
}
