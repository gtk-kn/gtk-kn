// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.atk.annotations.AtkVersion1_20
import org.gtkkn.bindings.atk.annotations.AtkVersion1_6
import org.gtkkn.bindings.atk.annotations.AtkVersion2_8
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.native.atk.AtkKeyEventStruct
import org.gtkkn.native.atk.AtkObject
import org.gtkkn.native.atk.AtkPropertyValues
import org.gtkkn.native.atk.atk_focus_tracker_notify
import org.gtkkn.native.atk.atk_get_binary_age
import org.gtkkn.native.atk.atk_get_default_registry
import org.gtkkn.native.atk.atk_get_focus_object
import org.gtkkn.native.atk.atk_get_interface_age
import org.gtkkn.native.atk.atk_get_major_version
import org.gtkkn.native.atk.atk_get_micro_version
import org.gtkkn.native.atk.atk_get_minor_version
import org.gtkkn.native.atk.atk_get_root
import org.gtkkn.native.atk.atk_get_toolkit_name
import org.gtkkn.native.atk.atk_get_toolkit_version
import org.gtkkn.native.atk.atk_get_version
import org.gtkkn.native.atk.atk_relation_type_for_name
import org.gtkkn.native.atk.atk_relation_type_get_name
import org.gtkkn.native.atk.atk_relation_type_register
import org.gtkkn.native.atk.atk_remove_focus_tracker
import org.gtkkn.native.atk.atk_remove_global_event_listener
import org.gtkkn.native.atk.atk_remove_key_event_listener
import org.gtkkn.native.atk.atk_role_for_name
import org.gtkkn.native.atk.atk_role_get_localized_name
import org.gtkkn.native.atk.atk_role_get_name
import org.gtkkn.native.atk.atk_role_register
import org.gtkkn.native.atk.atk_state_type_for_name
import org.gtkkn.native.atk.atk_state_type_get_name
import org.gtkkn.native.atk.atk_state_type_register
import org.gtkkn.native.atk.atk_text_attribute_for_name
import org.gtkkn.native.atk.atk_text_attribute_get_name
import org.gtkkn.native.atk.atk_text_attribute_get_value
import org.gtkkn.native.atk.atk_text_attribute_register
import org.gtkkn.native.atk.atk_value_type_get_localized_name
import org.gtkkn.native.atk.atk_value_type_get_name
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.UInt
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - parameter `attrib_set`: AttributeSet
 * - parameter `ranges`: Array parameter of type TextRange is not supported
 * - record `ActionIface`: glib type struct are ignored
 * - record `ComponentIface`: glib type struct are ignored
 * - record `DocumentIface`: glib type struct are ignored
 * - record `EditableTextIface`: glib type struct are ignored
 * - record `GObjectAccessibleClass`: glib type struct are ignored
 * - record `HyperlinkClass`: glib type struct are ignored
 * - record `HyperlinkImplIface`: glib type struct are ignored
 * - record `HypertextIface`: glib type struct are ignored
 * - record `ImageIface`: glib type struct are ignored
 * - record `Implementor`: Disguised records are ignored
 * - record `MiscClass`: glib type struct are ignored
 * - record `NoOpObjectClass`: glib type struct are ignored
 * - record `NoOpObjectFactoryClass`: glib type struct are ignored
 * - record `ObjectFactoryClass`: glib type struct are ignored
 * - record `PlugClass`: glib type struct are ignored
 * - record `RegistryClass`: glib type struct are ignored
 * - record `RelationClass`: glib type struct are ignored
 * - record `RelationSetClass`: glib type struct are ignored
 * - record `SelectionIface`: glib type struct are ignored
 * - record `SocketClass`: glib type struct are ignored
 * - record `StateSetClass`: glib type struct are ignored
 * - record `StreamableContentIface`: glib type struct are ignored
 * - record `TableCellIface`: glib type struct are ignored
 * - record `TableIface`: glib type struct are ignored
 * - record `TextIface`: glib type struct are ignored
 * - record `UtilClass`: glib type struct are ignored
 * - record `ValueIface`: glib type struct are ignored
 * - record `WindowIface`: glib type struct are ignored
 */
public object Atk {
    /**
     * Like atk_get_binary_age(), but from the headers used at
     * application compile time, rather than from the library linked
     * against at application run time.
     *
     * @since 2.7.4
     */
    public const val BINARY_AGE: Int = 25210

    /**
     * Like atk_get_interface_age(), but from the headers used at
     * application compile time, rather than from the library linked
     * against at application run time.
     *
     * @since 2.7.4
     */
    public const val INTERFACE_AGE: Int = 1

    /**
     * Like atk_get_major_version(), but from the headers used at
     * application compile time, rather than from the library linked
     * against at application run time.
     *
     * @since 2.7.4
     */
    public const val MAJOR_VERSION: Int = 2

    /**
     * Like atk_get_micro_version(), but from the headers used at
     * application compile time, rather than from the library linked
     * against at application run time.
     *
     * @since 2.7.4
     */
    public const val MICRO_VERSION: Int = 0

    /**
     * Like atk_get_minor_version(), but from the headers used at
     * application compile time, rather than from the library linked
     * against at application run time.
     *
     * @since 2.7.4
     */
    public const val MINOR_VERSION: Int = 52

    /**
     * A macro that should be defined by the user prior to including
     * the atk/atk.h header.
     * The definition should be one of the predefined ATK version
     * macros: %ATK_VERSION_2_12, %ATK_VERSION_2_14,...
     *
     * This macro defines the earliest version of ATK that the package is
     * required to be able to compile against.
     *
     * If the compiler is configured to warn about the use of deprecated
     * functions, then using functions that were deprecated in version
     * %ATK_VERSION_MIN_REQUIRED or earlier will cause warnings (but
     * using functions deprecated in later releases will not).
     *
     * @since 2.14
     */
    public const val VERSION_MIN_REQUIRED: Int = 2

    /**
     * Cause the focus tracker functions which have been specified to be
     * executed for the object.
     *
     * @param object an #AtkObject
     */
    public fun focusTrackerNotify(`object`: Object): Unit =
        atk_focus_tracker_notify(`object`.atkObjectPointer.reinterpret())

    /**
     * Returns the binary age as passed to libtool when building the ATK
     * library the process is running against.
     *
     * @return the binary age of the ATK library
     * @since 2.8
     */
    @AtkVersion2_8
    public fun getBinaryAge(): UInt = atk_get_binary_age()

    /**
     * Gets a default implementation of the #AtkObjectFactory/type
     * registry.
     * Note: For most toolkit maintainers, this will be the correct
     * registry for registering new #AtkObject factories. Following
     * a call to this function, maintainers may call atk_registry_set_factory_type()
     * to associate an #AtkObjectFactory subclass with the GType of objects
     * for whom accessibility information will be provided.
     *
     * @return a default implementation of the
     * #AtkObjectFactory/type registry
     */
    public fun getDefaultRegistry(): Registry =
        atk_get_default_registry()!!.run {
            Registry(reinterpret())
        }

    /**
     * Gets the currently focused object.
     *
     * @return the currently focused object for the current
     * application
     * @since 1.6
     */
    @AtkVersion1_6
    public fun getFocusObject(): Object =
        atk_get_focus_object()!!.run {
            Object(reinterpret())
        }

    /**
     * Returns the interface age as passed to libtool when building the
     * ATK library the process is running against.
     *
     * @return the interface age of the ATK library
     * @since 2.8
     */
    @AtkVersion2_8
    public fun getInterfaceAge(): UInt = atk_get_interface_age()

    /**
     * Returns the major version number of the ATK library.  (e.g. in ATK
     * version 2.7.4 this is 2.)
     *
     * This function is in the library, so it represents the ATK library
     * your code is running against. In contrast, the #ATK_MAJOR_VERSION
     * macro represents the major version of the ATK headers you have
     * included when compiling your code.
     *
     * @return the major version number of the ATK library
     * @since 2.8
     */
    @AtkVersion2_8
    public fun getMajorVersion(): UInt = atk_get_major_version()

    /**
     * Returns the micro version number of the ATK library.  (e.g. in ATK
     * version 2.7.4 this is 4.)
     *
     * This function is in the library, so it represents the ATK library
     * your code is are running against. In contrast, the
     * #ATK_MICRO_VERSION macro represents the micro version of the ATK
     * headers you have included when compiling your code.
     *
     * @return the micro version number of the ATK library
     * @since 2.8
     */
    @AtkVersion2_8
    public fun getMicroVersion(): UInt = atk_get_micro_version()

    /**
     * Returns the minor version number of the ATK library.  (e.g. in ATK
     * version 2.7.4 this is 7.)
     *
     * This function is in the library, so it represents the ATK library
     * your code is are running against. In contrast, the
     * #ATK_MINOR_VERSION macro represents the minor version of the ATK
     * headers you have included when compiling your code.
     *
     * @return the minor version number of the ATK library
     * @since 2.8
     */
    @AtkVersion2_8
    public fun getMinorVersion(): UInt = atk_get_minor_version()

    /**
     * Gets the root accessible container for the current application.
     *
     * @return the root accessible container for the current
     * application
     */
    public fun getRoot(): Object =
        atk_get_root()!!.run {
            Object(reinterpret())
        }

    /**
     * Gets name string for the GUI toolkit implementing ATK for this application.
     *
     * @return name string for the GUI toolkit implementing ATK for this application
     */
    public fun getToolkitName(): String = atk_get_toolkit_name()?.toKString() ?: error("Expected not null string")

    /**
     * Gets version string for the GUI toolkit implementing ATK for this application.
     *
     * @return version string for the GUI toolkit implementing ATK for this application
     */
    public fun getToolkitVersion(): String = atk_get_toolkit_version()?.toKString() ?: error("Expected not null string")

    /**
     * Gets the current version for ATK.
     *
     * @return version string for ATK
     * @since 1.20
     */
    @AtkVersion1_20
    public fun getVersion(): String = atk_get_version()?.toKString() ?: error("Expected not null string")

    /**
     * Get the #AtkRelationType type corresponding to a relation name.
     *
     * @param name a string which is the (non-localized) name of an ATK relation type.
     * @return the #AtkRelationType enumerated type corresponding to the specified name,
     *          or #ATK_RELATION_NULL if no matching relation type is found.
     */
    public fun relationTypeForName(name: String): RelationType =
        atk_relation_type_for_name(name).run {
            RelationType.fromNativeValue(this)
        }

    /**
     * Gets the description string describing the #AtkRelationType @type.
     *
     * @param type The #AtkRelationType whose name is required
     * @return the string describing the AtkRelationType
     */
    public fun relationTypeGetName(type: RelationType): String =
        atk_relation_type_get_name(type.nativeValue)?.toKString() ?: error("Expected not null string")

    /**
     * Associate @name with a new #AtkRelationType
     *
     * @param name a name string
     * @return an #AtkRelationType associated with @name
     */
    public fun relationTypeRegister(name: String): RelationType =
        atk_relation_type_register(name).run {
            RelationType.fromNativeValue(this)
        }

    /**
     * Removes the specified focus tracker from the list of functions
     * to be called when any object receives focus.
     *
     * @param trackerId the id of the focus tracker to remove
     */
    public fun removeFocusTracker(trackerId: UInt): Unit = atk_remove_focus_tracker(trackerId)

    /**
     * @listener_id is the value returned by #atk_add_global_event_listener
     * when you registered that event listener.
     *
     * Toolkit implementor note: ATK provides a default implementation for
     * this virtual method. ATK implementors are discouraged from
     * reimplementing this method.
     *
     * Toolkit implementor note: this method is not intended to be used by
     * ATK implementors but by ATK consumers.
     *
     * Removes the specified event listener
     *
     * @param listenerId the id of the event listener to remove
     */
    public fun removeGlobalEventListener(listenerId: UInt): Unit = atk_remove_global_event_listener(listenerId)

    /**
     * @listener_id is the value returned by #atk_add_key_event_listener
     * when you registered that event listener.
     *
     * Removes the specified event listener.
     *
     * @param listenerId the id of the event listener to remove
     */
    public fun removeKeyEventListener(listenerId: UInt): Unit = atk_remove_key_event_listener(listenerId)

    /**
     * Get the #AtkRole type corresponding to a rolew name.
     *
     * @param name a string which is the (non-localized) name of an ATK role.
     * @return the #AtkRole enumerated type corresponding to the specified name,
     *          or #ATK_ROLE_INVALID if no matching role is found.
     */
    public fun roleForName(name: String): Role =
        atk_role_for_name(name).run {
            Role.fromNativeValue(this)
        }

    /**
     * Gets the localized description string describing the #AtkRole @role.
     *
     * @param role The #AtkRole whose localized name is required
     * @return the localized string describing the AtkRole
     */
    public fun roleGetLocalizedName(role: Role): String =
        atk_role_get_localized_name(role.nativeValue)?.toKString() ?: error("Expected not null string")

    /**
     * Gets the description string describing the #AtkRole @role.
     *
     * @param role The #AtkRole whose name is required
     * @return the string describing the AtkRole
     */
    public fun roleGetName(role: Role): String =
        atk_role_get_name(role.nativeValue)?.toKString() ?: error("Expected not null string")

    /**
     * Registers the role specified by @name. @name must be a meaningful
     * name. So it should not be empty, or consisting on whitespaces.
     *
     * @param name a character string describing the new role.
     * @return an #AtkRole for the new role if added
     * properly. ATK_ROLE_INVALID in case of error.
     */
    public fun roleRegister(name: String): Role =
        atk_role_register(name).run {
            Role.fromNativeValue(this)
        }

    /**
     * Gets the #AtkStateType corresponding to the description string @name.
     *
     * @param name a character string state name
     * @return an #AtkStateType corresponding to @name
     */
    public fun stateTypeForName(name: String): StateType =
        atk_state_type_for_name(name).run {
            StateType.fromNativeValue(this)
        }

    /**
     * Gets the description string describing the #AtkStateType @type.
     *
     * @param type The #AtkStateType whose name is required
     * @return the string describing the AtkStateType
     */
    public fun stateTypeGetName(type: StateType): String =
        atk_state_type_get_name(type.nativeValue)?.toKString() ?: error("Expected not null string")

    /**
     * Register a new object state.
     *
     * @param name a character string describing the new state.
     * @return an #AtkState value for the new state.
     */
    public fun stateTypeRegister(name: String): StateType =
        atk_state_type_register(name).run {
            StateType.fromNativeValue(this)
        }

    /**
     * Get the #AtkTextAttribute type corresponding to a text attribute name.
     *
     * @param name a string which is the (non-localized) name of an ATK text attribute.
     * @return the #AtkTextAttribute enumerated type corresponding to the specified
     *          name, or #ATK_TEXT_ATTRIBUTE_INVALID if no matching text attribute
     *          is found.
     */
    public fun textAttributeForName(name: String): TextAttribute =
        atk_text_attribute_for_name(name).run {
            TextAttribute.fromNativeValue(this)
        }

    /**
     * Gets the name corresponding to the #AtkTextAttribute
     *
     * @param attr The #AtkTextAttribute whose name is required
     * @return a string containing the name; this string should not be freed
     */
    public fun textAttributeGetName(attr: TextAttribute): String =
        atk_text_attribute_get_name(attr.nativeValue)?.toKString() ?: error("Expected not null string")

    /**
     * Gets the value for the index of the #AtkTextAttribute
     *
     * @param attr The #AtkTextAttribute for which a value is required
     * @param index The index of the required value
     * @return a string containing the value; this string
     * should not be freed; null is returned if there are no values
     * maintained for the attr value.
     */
    public fun textAttributeGetValue(
        attr: TextAttribute,
        index: Int,
    ): String? = atk_text_attribute_get_value(attr.nativeValue, index)?.toKString()

    /**
     * Associate @name with a new #AtkTextAttribute
     *
     * @param name a name string
     * @return an #AtkTextAttribute associated with @name
     */
    public fun textAttributeRegister(name: String): TextAttribute =
        atk_text_attribute_register(name).run {
            TextAttribute.fromNativeValue(this)
        }

    /**
     * Gets the localized description string describing the #AtkValueType @value_type.
     *
     * @param valueType The #AtkValueType whose localized name is required
     * @return the localized string describing the #AtkValueType
     */
    public fun valueTypeGetLocalizedName(valueType: ValueType): String =
        atk_value_type_get_localized_name(valueType.nativeValue)?.toKString() ?: error("Expected not null string")

    /**
     * Gets the description string describing the #AtkValueType @value_type.
     *
     * @param valueType The #AtkValueType whose name is required
     * @return the string describing the #AtkValueType
     */
    public fun valueTypeGetName(valueType: ValueType): String =
        atk_value_type_get_name(valueType.nativeValue)?.toKString() ?: error("Expected not null string")
}

public val EventListenerFunc: CPointer<CFunction<(CPointer<AtkObject>) -> Unit>> =
    staticCFunction {
            obj: CPointer<AtkObject>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(obj: Object) -> Unit>().get().invoke(
            obj!!.run {
                Object(reinterpret())
            }
        )
    }.reinterpret()

public val EventListenerInitFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction { userData: COpaquePointer ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

public val FocusHandlerFunc: CPointer<CFunction<(CPointer<AtkObject>, Int) -> Unit>> =
    staticCFunction {
            `object`: CPointer<AtkObject>?,
            focusIn: Int,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(`object`: Object, focusIn: Boolean) -> Unit>().get().invoke(
            `object`!!.run {
                Object(reinterpret())
            },
            focusIn.asBoolean()
        )
    }.reinterpret()

public val FunctionFunc: CPointer<CFunction<() -> Int>> =
    staticCFunction { userData: COpaquePointer ->
        userData
            .asStableRef<() -> Boolean>()
            .get()
            .invoke()
            .asGBoolean()
    }.reinterpret()

public val KeySnoopFuncFunc: CPointer<CFunction<(CPointer<AtkKeyEventStruct>) -> Int>> =
    staticCFunction {
            event: CPointer<AtkKeyEventStruct>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(event: KeyEventStruct) -> Int>().get().invoke(
            event!!.run {
                KeyEventStruct(reinterpret())
            }
        )
    }.reinterpret()

public val PropertyChangeHandlerFunc:
    CPointer<CFunction<(CPointer<AtkObject>, CPointer<AtkPropertyValues>) -> Unit>> =
    staticCFunction {
            obj: CPointer<AtkObject>?,
            vals: CPointer<AtkPropertyValues>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(obj: Object, vals: PropertyValues) -> Unit>().get().invoke(
            obj!!.run {
                Object(reinterpret())
            },
            vals!!.run {
                PropertyValues(reinterpret())
            }
        )
    }.reinterpret()

/**
 * A function which is called when an object emits a matching event,
 * as used in #atk_add_focus_tracker.
 * Currently the only events for which object-specific handlers are
 * supported are events of type "focus:".  Most clients of ATK will prefer to
 * attach signal handlers for the various ATK signals instead.
 *
 * see [id@atk_add_focus_tracker]
 *
 * - param `obj` An #AtkObject instance for whom the callback will be called when
 * the specified event (e.g. 'focus:') takes place.
 */
public typealias EventListener = (obj: Object) -> Unit

/**
 * An #AtkEventListenerInit function is a special function that is
 * called in order to initialize the per-object event registration system
 * used by #AtkEventListener, if any preparation is required.
 *
 * see [id@atk_focus_tracker_init]
 */
public typealias EventListenerInit = () -> Unit

/**
 * The type of callback function used for
 * atk_component_add_focus_handler() and
 * atk_component_remove_focus_handler()
 *
 * - param `object` the #AtkObject that receives/lose the focus
 * - param `focusIn` TRUE if the object receives the focus
 */
public typealias FocusHandler = (`object`: Object, focusIn: Boolean) -> Unit

/**
 * An AtkFunction is a function definition used for padding which has
 * been added to class and interface structures to allow for expansion
 * in the future.
 *
 * - return not used
 */
public typealias Function = () -> Boolean

/**
 * An #AtkKeySnoopFunc is a type of callback which is called whenever a key event occurs,
 * if registered via atk_add_key_event_listener.  It allows for pre-emptive
 * interception of key events via the return code as described below.
 *
 * - param `event` an AtkKeyEventStruct containing information about the key event for which
 * notification is being given.
 * - return TRUE (nonzero) if the event emission should be stopped and the event
 * discarded without being passed to the normal GUI recipient; FALSE (zero) if the
 * event dispatch to the client application should proceed as normal.
 *
 * see [id@atk_add_key_event_listener]
 */
public typealias KeySnoopFunc = (event: KeyEventStruct) -> Int

/**
 * An AtkPropertyChangeHandler is a function which is executed when an
 * AtkObject's property changes value. It is specified in a call to
 * atk_object_connect_property_change_handler().
 *
 * - param `obj` atkobject which property changes
 * - param `vals` values changed
 */
public typealias PropertyChangeHandler = (obj: Object, vals: PropertyValues) -> Unit
