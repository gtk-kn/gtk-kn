// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.atk.annotations.AtkVersion2_34
import org.gtkkn.bindings.atk.annotations.AtkVersion2_46
import org.gtkkn.bindings.atk.annotations.AtkVersion2_50
import org.gtkkn.bindings.atk.annotations.AtkVersion2_52
import org.gtkkn.bindings.atk.annotations.AtkVersion2_8
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.atk.AtkObject
import org.gtkkn.native.atk.AtkPropertyValues
import org.gtkkn.native.atk.atk_object_add_relationship
import org.gtkkn.native.atk.atk_object_get_accessible_id
import org.gtkkn.native.atk.atk_object_get_description
import org.gtkkn.native.atk.atk_object_get_help_text
import org.gtkkn.native.atk.atk_object_get_index_in_parent
import org.gtkkn.native.atk.atk_object_get_layer
import org.gtkkn.native.atk.atk_object_get_mdi_zorder
import org.gtkkn.native.atk.atk_object_get_n_accessible_children
import org.gtkkn.native.atk.atk_object_get_name
import org.gtkkn.native.atk.atk_object_get_object_locale
import org.gtkkn.native.atk.atk_object_get_parent
import org.gtkkn.native.atk.atk_object_get_role
import org.gtkkn.native.atk.atk_object_get_type
import org.gtkkn.native.atk.atk_object_peek_parent
import org.gtkkn.native.atk.atk_object_ref_accessible_child
import org.gtkkn.native.atk.atk_object_ref_relation_set
import org.gtkkn.native.atk.atk_object_ref_state_set
import org.gtkkn.native.atk.atk_object_remove_property_change_handler
import org.gtkkn.native.atk.atk_object_remove_relationship
import org.gtkkn.native.atk.atk_object_set_accessible_id
import org.gtkkn.native.atk.atk_object_set_description
import org.gtkkn.native.atk.atk_object_set_help_text
import org.gtkkn.native.atk.atk_object_set_name
import org.gtkkn.native.atk.atk_object_set_parent
import org.gtkkn.native.atk.atk_object_set_role
import org.gtkkn.native.gobject.g_signal_connect_data
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.UInt
import kotlin.ULong
import kotlin.Unit

/**
 * The base object class for the Accessibility Toolkit API.
 *
 * This class is the primary class for accessibility support via the
 * Accessibility ToolKit (ATK).  Objects which are instances of
 * #AtkObject (or instances of AtkObject-derived types) are queried
 * for properties which relate basic (and generic) properties of a UI
 * component such as name and description.  Instances of #AtkObject
 * may also be queried as to whether they implement other ATK
 * interfaces (e.g. #AtkAction, #AtkComponent, etc.), as appropriate
 * to the role which a given UI component plays in a user interface.
 *
 * All UI components in an application which provide useful
 * information or services to the user must provide corresponding
 * #AtkObject instances on request (in GTK+, for instance, usually on
 * a call to #gtk_widget_get_accessible ()), either via ATK support
 * built into the toolkit for the widget class or ancestor class, or
 * in the case of custom widgets, if the inherited #AtkObject
 * implementation is insufficient, via instances of a new #AtkObject
 * subclass.
 *
 * See [class@AtkObjectFactory], [class@AtkRegistry].  (GTK+ users see also
 * #GtkAccessible).
 *
 * ## Skipped during bindings generation
 *
 * - method `get_attributes`: Return type AttributeSet is unsupported
 * - parameter `data`: gpointer
 * - parameter `state`: State
 * - method `accessible-component-layer`: Property has no getter nor setter
 * - method `accessible-component-mdi-zorder`: Property has no getter nor setter
 * - method `accessible-description`: Property has no getter nor setter
 * - method `accessible-help-text`: Property has no getter nor setter
 * - method `accessible-hypertext-nlinks`: Property has no getter nor setter
 * - method `accessible-name`: Property has no getter nor setter
 * - method `accessible-parent`: Property has no getter nor setter
 * - method `accessible-role`: Property has no getter nor setter
 * - method `accessible-table-caption`: Property has no getter nor setter
 * - method `accessible-table-caption-object`: Property has no getter nor setter
 * - method `accessible-table-column-description`: Property has no getter nor setter
 * - method `accessible-table-column-header`: Property has no getter nor setter
 * - method `accessible-table-row-description`: Property has no getter nor setter
 * - method `accessible-table-row-header`: Property has no getter nor setter
 * - method `accessible-table-summary`: Property has no getter nor setter
 * - method `accessible-value`: Property has no getter nor setter
 */
public open class Object(
    pointer: CPointer<AtkObject>,
) : org.gtkkn.bindings.gobject.Object(pointer.reinterpret()),
    KGTyped {
    public val atkObjectPointer: CPointer<AtkObject>
        get() = gPointer.reinterpret()

    public open var accessibleId: String
        /**
         * Gets the accessible id of the accessible.
         *
         * @return a character string representing the accessible id of the object, or
         * NULL if no such string was set.
         * @since 2.34
         */
        get() =
            atk_object_get_accessible_id(atkObjectPointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

        /**
         * Sets the accessible ID of the accessible.  This is not meant to be presented
         * to the user, but to be an ID which is stable over application development.
         * Typically, this is the gtkbuilder ID. Such an ID will be available for
         * instance to identify a given well-known accessible object for tailored screen
         * reading, or for automatic regression testing.
         *
         * @param id a character string to be set as the accessible id
         * @since 2.34
         */
        @AtkVersion2_34
        set(id) = atk_object_set_accessible_id(atkObjectPointer.reinterpret(), id)

    /**
     * Adds a relationship of the specified type with the specified target.
     *
     * @param relationship The #AtkRelationType of the relation
     * @param target The #AtkObject which is to be the target of the relation.
     * @return TRUE if the relationship is added.
     */
    public open fun addRelationship(
        relationship: RelationType,
        target: Object,
    ): Boolean =
        atk_object_add_relationship(
            atkObjectPointer.reinterpret(),
            relationship.nativeValue,
            target.atkObjectPointer.reinterpret()
        ).asBoolean()

    /**
     * Gets the accessible id of the accessible.
     *
     * @return a character string representing the accessible id of the object, or
     * NULL if no such string was set.
     * @since 2.34
     */
    @AtkVersion2_34
    public open fun getAccessibleId(): String =
        atk_object_get_accessible_id(atkObjectPointer.reinterpret())?.toKString() ?: error("Expected not null string")

    /**
     * Gets the accessible description of the accessible.
     *
     * @return a character string representing the accessible description
     * of the accessible.
     */
    public open fun getDescription(): String =
        atk_object_get_description(atkObjectPointer.reinterpret())?.toKString() ?: error("Expected not null string")

    /**
     * Gets the help text associated with the accessible.
     *
     * @return a character string representing the help text or the object, or
     * NULL if no such string was set.
     * @since 2.52
     */
    @AtkVersion2_52
    public open fun getHelpText(): String =
        atk_object_get_help_text(atkObjectPointer.reinterpret())?.toKString() ?: error("Expected not null string")

    /**
     * Gets the 0-based index of this accessible in its parent; returns -1 if the
     * accessible does not have an accessible parent.
     *
     * @return an integer which is the index of the accessible in its parent
     */
    public open fun getIndexInParent(): Int = atk_object_get_index_in_parent(atkObjectPointer.reinterpret())

    /**
     * Gets the layer of the accessible.
     *
     * @return an #AtkLayer which is the layer of the accessible
     */
    public open fun getLayer(): Layer =
        atk_object_get_layer(atkObjectPointer.reinterpret()).run {
            Layer.fromNativeValue(this)
        }

    /**
     * Gets the zorder of the accessible. The value G_MININT will be returned
     * if the layer of the accessible is not ATK_LAYER_MDI.
     *
     * @return a gint which is the zorder of the accessible, i.e. the depth at
     * which the component is shown in relation to other components in the same
     * container.
     */
    public open fun getMdiZorder(): Int = atk_object_get_mdi_zorder(atkObjectPointer.reinterpret())

    /**
     * Gets the number of accessible children of the accessible.
     *
     * @return an integer representing the number of accessible children
     * of the accessible.
     */
    public open fun getNAccessibleChildren(): Int = atk_object_get_n_accessible_children(atkObjectPointer.reinterpret())

    /**
     * Gets the accessible name of the accessible.
     *
     * @return a character string representing the accessible name of the object.
     */
    public open fun getName(): String =
        atk_object_get_name(atkObjectPointer.reinterpret())?.toKString() ?: error("Expected not null string")

    /**
     * Gets a UTF-8 string indicating the POSIX-style LC_MESSAGES locale
     * of @accessible.
     *
     * @return a UTF-8 string indicating the POSIX-style LC_MESSAGES
     *          locale of @accessible.
     * @since 2.8
     */
    @AtkVersion2_8
    public open fun getObjectLocale(): String =
        atk_object_get_object_locale(atkObjectPointer.reinterpret())?.toKString() ?: error("Expected not null string")

    /**
     * Gets the accessible parent of the accessible. By default this is
     * the one assigned with atk_object_set_parent(), but it is assumed
     * that ATK implementors have ways to get the parent of the object
     * without the need of assigning it manually with
     * atk_object_set_parent(), and will return it with this method.
     *
     * If you are only interested on the parent assigned with
     * atk_object_set_parent(), use atk_object_peek_parent().
     *
     * @return an #AtkObject representing the accessible
     * parent of the accessible
     */
    public open fun getParent(): Object =
        atk_object_get_parent(atkObjectPointer.reinterpret())!!.run {
            Object(reinterpret())
        }

    /**
     * Gets the role of the accessible.
     *
     * @return an #AtkRole which is the role of the accessible
     */
    public open fun getRole(): Role =
        atk_object_get_role(atkObjectPointer.reinterpret()).run {
            Role.fromNativeValue(this)
        }

    /**
     * Gets the accessible parent of the accessible, if it has been
     * manually assigned with atk_object_set_parent. Otherwise, this
     * function returns null.
     *
     * This method is intended as an utility for ATK implementors, and not
     * to be exposed to accessible tools. See atk_object_get_parent() for
     * further reference.
     *
     * @return an #AtkObject representing the accessible
     * parent of the accessible if assigned
     */
    public open fun peekParent(): Object =
        atk_object_peek_parent(atkObjectPointer.reinterpret())!!.run {
            Object(reinterpret())
        }

    /**
     * Gets a reference to the specified accessible child of the object.
     * The accessible children are 0-based so the first accessible child is
     * at index 0, the second at index 1 and so on.
     *
     * @param i a gint representing the position of the child, starting from 0
     * @return an #AtkObject representing the specified
     * accessible child of the accessible.
     */
    public open fun refAccessibleChild(i: Int): Object =
        atk_object_ref_accessible_child(atkObjectPointer.reinterpret(), i)!!.run {
            Object(reinterpret())
        }

    /**
     * Gets the #AtkRelationSet associated with the object.
     *
     * @return an #AtkRelationSet representing the relation set
     * of the object.
     */
    public open fun refRelationSet(): RelationSet =
        atk_object_ref_relation_set(atkObjectPointer.reinterpret())!!.run {
            RelationSet(reinterpret())
        }

    /**
     * Gets a reference to the state set of the accessible; the caller must
     * unreference it when it is no longer needed.
     *
     * @return a reference to an #AtkStateSet which is the state
     * set of the accessible
     */
    public open fun refStateSet(): StateSet =
        atk_object_ref_state_set(atkObjectPointer.reinterpret())!!.run {
            StateSet(reinterpret())
        }

    /**
     * Removes a property change handler.
     *
     * @param handlerId a guint which identifies the handler to be removed.
     */
    public open fun removePropertyChangeHandler(handlerId: UInt): Unit =
        atk_object_remove_property_change_handler(atkObjectPointer.reinterpret(), handlerId)

    /**
     * Removes a relationship of the specified type with the specified target.
     *
     * @param relationship The #AtkRelationType of the relation
     * @param target The #AtkObject which is the target of the relation to be removed.
     * @return TRUE if the relationship is removed.
     */
    public open fun removeRelationship(
        relationship: RelationType,
        target: Object,
    ): Boolean =
        atk_object_remove_relationship(
            atkObjectPointer.reinterpret(),
            relationship.nativeValue,
            target.atkObjectPointer.reinterpret()
        ).asBoolean()

    /**
     * Sets the accessible ID of the accessible.  This is not meant to be presented
     * to the user, but to be an ID which is stable over application development.
     * Typically, this is the gtkbuilder ID. Such an ID will be available for
     * instance to identify a given well-known accessible object for tailored screen
     * reading, or for automatic regression testing.
     *
     * @param id a character string to be set as the accessible id
     * @since 2.34
     */
    @AtkVersion2_34
    public open fun setAccessibleId(id: String): Unit = atk_object_set_accessible_id(atkObjectPointer.reinterpret(), id)

    /**
     * Sets the accessible description of the accessible. You can't set
     * the description to NULL. This is reserved for the initial value. In
     * this aspect NULL is similar to ATK_ROLE_UNKNOWN. If you want to set
     * the name to a empty value you can use "".
     *
     * @param description a character string to be set as the accessible description
     */
    public open fun setDescription(description: String): Unit =
        atk_object_set_description(atkObjectPointer.reinterpret(), description)

    /**
     * Sets the help text associated with the accessible. This can be used to
     * expose context-sensitive information to help a user understand how to
     * interact with the object.
     *
     * @param helpText a character string to be set as the accessible's help text
     * @since 2.52
     */
    @AtkVersion2_52
    public open fun setHelpText(helpText: String): Unit =
        atk_object_set_help_text(atkObjectPointer.reinterpret(), helpText)

    /**
     * Sets the accessible name of the accessible. You can't set the name
     * to NULL. This is reserved for the initial value. In this aspect
     * NULL is similar to ATK_ROLE_UNKNOWN. If you want to set the name to
     * a empty value you can use "".
     *
     * @param name a character string to be set as the accessible name
     */
    public open fun setName(name: String): Unit = atk_object_set_name(atkObjectPointer.reinterpret(), name)

    /**
     * Sets the accessible parent of the accessible. @parent can be NULL.
     *
     * @param parent an #AtkObject to be set as the accessible parent
     */
    public open fun setParent(parent: Object): Unit =
        atk_object_set_parent(atkObjectPointer.reinterpret(), parent.atkObjectPointer.reinterpret())

    /**
     * Sets the role of the accessible.
     *
     * @param role an #AtkRole to be set as the role
     */
    public open fun setRole(role: Role): Unit = atk_object_set_role(atkObjectPointer.reinterpret(), role.nativeValue)

    /**
     * The "active-descendant-changed" signal is emitted by an object
     * which has the state ATK_STATE_MANAGES_DESCENDANTS when the focus
     * object in the object changes. For instance, a table will emit the
     * signal when the cell in the table which has focus changes.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `arg1` the newly focused object.
     */
    public fun connectActiveDescendantChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (arg1: Object) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "active-descendant-changed",
            connectActiveDescendantChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The "announcement" signal can be emitted to pass an announcement on to
     * be read by a screen reader.
     *
     * Depcrecated (2.50): Use AtkObject::notification instead.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `arg1` the text to be announced.
     * @since 2.46
     */
    @AtkVersion2_46
    public fun connectAnnouncement(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (arg1: String) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "announcement",
            connectAnnouncementFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The "attribute-changed" signal should be emitted when one of an object's
     * attributes changes.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `arg1` the name of the attribute being modified, or null if not
     *          available.; `arg2` the attribute's new value, or %null if not available.
     * @since 2.52
     */
    @AtkVersion2_52
    public fun connectAttributeChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (arg1: String, arg2: String) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "attribute-changed",
            connectAttributeChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The signal "children-changed" is emitted when a child is added or
     * removed from an object. It supports two details: "add" and
     * "remove"
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `arg1` The index of the added or removed child. The value can be
     * -1. This is used if the value is not known by the implementor
     * when the child is added/removed or irrelevant.; `arg2` A gpointer to the child AtkObject which was added or
     * removed. If the child was removed, it is possible that it is not
     * available for the implementor. In that case this pointer can be
     * NULL.
     */
    public fun connectChildrenChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (arg1: UInt, arg2: Object) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "children-changed",
            connectChildrenChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The signal "focus-event" is emitted when an object gained or lost
     * focus.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `arg1` a boolean value which indicates whether the object gained
     * or lost focus.
     */
    public fun connectFocusEvent(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (arg1: Boolean) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "focus-event",
            connectFocusEventFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The "notification" signal can be emitted to pass an announcement on to
     * be read by a screen reader.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `arg1` the text to be announced.; `arg2` an #AtkLive specifying the politeness of the notification.
     * Should be either ATK_LIVE_POLITE or ATK_LIVE_ASSERTIVE.
     * @since 2.50
     */
    @AtkVersion2_50
    public fun connectNotification(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (arg1: String, arg2: Int) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "notification",
            connectNotificationFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The signal "property-change" is emitted when an object's property
     * value changes. @arg1 contains an #AtkPropertyValues with the name
     * and the new value of the property whose value has changed. Note
     * that, as with GObject notify, getting this signal does not
     * guarantee that the value of the property has actually changed; it
     * may also be emitted when the setter of the property is called to
     * reinstate the previous value.
     *
     * Toolkit implementor note: ATK implementors should use
     * g_object_notify() to emit property-changed
     * notifications. #AtkObject::property-changed is needed by the
     * implementation of atk_add_global_event_listener() because GObject
     * notify doesn't support emission hooks.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `arg1` an #AtkPropertyValues containing the new
     * value of the property which changed.
     */
    public fun connectPropertyChange(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (arg1: PropertyValues) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "property-change",
            connectPropertyChangeFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The "state-change" signal is emitted when an object's state
     * changes.  The detail value identifies the state type which has
     * changed.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `arg1` The name of the state which has changed; `arg2` A boolean which indicates whether the state has been set or unset.
     */
    public fun connectStateChange(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (arg1: String, arg2: Boolean) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "state-change",
            connectStateChangeFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The "visible-data-changed" signal is emitted when the visual
     * appearance of the object changed.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectVisibleDataChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "visible-data-changed",
            connectVisibleDataChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<Object> {
        override val type: GeneratedClassKGType<Object> =
            GeneratedClassKGType(atk_object_get_type()) { Object(it.reinterpret()) }

        init {
            AtkTypeProvider.register()
        }
    }
}

private val connectActiveDescendantChangedFunc: CPointer<CFunction<(CPointer<AtkObject>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            arg1: CPointer<AtkObject>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(arg1: Object) -> Unit>().get().invoke(
            arg1!!.run {
                Object(reinterpret())
            }
        )
    }.reinterpret()

private val connectAnnouncementFunc: CPointer<CFunction<(CPointer<ByteVar>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            arg1: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<
                (
                    arg1: String,
                ) -> Unit
            >()
            .get()
            .invoke(arg1?.toKString() ?: error("Expected not null string"))
    }.reinterpret()

private val connectAttributeChangedFunc:
    CPointer<CFunction<(CPointer<ByteVar>, CPointer<ByteVar>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            arg1: CPointer<ByteVar>?,
            arg2: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(arg1: String, arg2: String) -> Unit>().get().invoke(
            arg1?.toKString() ?: error("Expected not null string"),
            arg2?.toKString() ?: error("Expected not null string")
        )
    }.reinterpret()

private val connectChildrenChangedFunc: CPointer<CFunction<(UInt, CPointer<AtkObject>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            arg1: UInt,
            arg2: CPointer<AtkObject>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(arg1: UInt, arg2: Object) -> Unit>().get().invoke(
            arg1,
            arg2!!.run {
                Object(reinterpret())
            }
        )
    }.reinterpret()

private val connectFocusEventFunc: CPointer<CFunction<(Int) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            arg1: Int,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(arg1: Boolean) -> Unit>().get().invoke(arg1.asBoolean())
    }.reinterpret()

private val connectNotificationFunc: CPointer<CFunction<(CPointer<ByteVar>, Int) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            arg1: CPointer<ByteVar>?,
            arg2: Int,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(arg1: String, arg2: Int) -> Unit>().get().invoke(
            arg1?.toKString() ?: error("Expected not null string"),
            arg2
        )
    }.reinterpret()

private val connectPropertyChangeFunc: CPointer<CFunction<(CPointer<AtkPropertyValues>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            arg1: CPointer<AtkPropertyValues>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(arg1: PropertyValues) -> Unit>().get().invoke(
            arg1!!.run {
                PropertyValues(reinterpret())
            }
        )
    }.reinterpret()

private val connectStateChangeFunc: CPointer<CFunction<(CPointer<ByteVar>, Int) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            arg1: CPointer<ByteVar>?,
            arg2: Int,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(arg1: String, arg2: Boolean) -> Unit>().get().invoke(
            arg1?.toKString() ?: error("Expected not null string"),
            arg2.asBoolean()
        )
    }.reinterpret()

private val connectVisibleDataChangedFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()
