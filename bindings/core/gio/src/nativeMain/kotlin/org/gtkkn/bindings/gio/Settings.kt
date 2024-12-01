// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.annotations.GioVersion2_26
import org.gtkkn.bindings.gio.annotations.GioVersion2_28
import org.gtkkn.bindings.gio.annotations.GioVersion2_30
import org.gtkkn.bindings.gio.annotations.GioVersion2_32
import org.gtkkn.bindings.gio.annotations.GioVersion2_40
import org.gtkkn.bindings.gio.annotations.GioVersion2_50
import org.gtkkn.bindings.glib.Variant
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.common.toCStringList
import org.gtkkn.extensions.common.toKStringList
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GSettings
import org.gtkkn.native.gio.g_settings_apply
import org.gtkkn.native.gio.g_settings_bind
import org.gtkkn.native.gio.g_settings_bind_writable
import org.gtkkn.native.gio.g_settings_create_action
import org.gtkkn.native.gio.g_settings_delay
import org.gtkkn.native.gio.g_settings_get_boolean
import org.gtkkn.native.gio.g_settings_get_child
import org.gtkkn.native.gio.g_settings_get_default_value
import org.gtkkn.native.gio.g_settings_get_double
import org.gtkkn.native.gio.g_settings_get_enum
import org.gtkkn.native.gio.g_settings_get_flags
import org.gtkkn.native.gio.g_settings_get_has_unapplied
import org.gtkkn.native.gio.g_settings_get_int
import org.gtkkn.native.gio.g_settings_get_int64
import org.gtkkn.native.gio.g_settings_get_range
import org.gtkkn.native.gio.g_settings_get_string
import org.gtkkn.native.gio.g_settings_get_strv
import org.gtkkn.native.gio.g_settings_get_type
import org.gtkkn.native.gio.g_settings_get_uint
import org.gtkkn.native.gio.g_settings_get_uint64
import org.gtkkn.native.gio.g_settings_get_user_value
import org.gtkkn.native.gio.g_settings_get_value
import org.gtkkn.native.gio.g_settings_is_writable
import org.gtkkn.native.gio.g_settings_list_children
import org.gtkkn.native.gio.g_settings_list_keys
import org.gtkkn.native.gio.g_settings_list_relocatable_schemas
import org.gtkkn.native.gio.g_settings_list_schemas
import org.gtkkn.native.gio.g_settings_new
import org.gtkkn.native.gio.g_settings_new_full
import org.gtkkn.native.gio.g_settings_new_with_backend
import org.gtkkn.native.gio.g_settings_new_with_backend_and_path
import org.gtkkn.native.gio.g_settings_new_with_path
import org.gtkkn.native.gio.g_settings_range_check
import org.gtkkn.native.gio.g_settings_reset
import org.gtkkn.native.gio.g_settings_revert
import org.gtkkn.native.gio.g_settings_set_boolean
import org.gtkkn.native.gio.g_settings_set_double
import org.gtkkn.native.gio.g_settings_set_enum
import org.gtkkn.native.gio.g_settings_set_flags
import org.gtkkn.native.gio.g_settings_set_int
import org.gtkkn.native.gio.g_settings_set_int64
import org.gtkkn.native.gio.g_settings_set_string
import org.gtkkn.native.gio.g_settings_set_strv
import org.gtkkn.native.gio.g_settings_set_uint
import org.gtkkn.native.gio.g_settings_set_uint64
import org.gtkkn.native.gio.g_settings_set_value
import org.gtkkn.native.gio.g_settings_sync
import org.gtkkn.native.gio.g_settings_unbind
import org.gtkkn.native.gobject.g_signal_connect_data
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.UInt
import kotlin.ULong
import kotlin.Unit
import kotlin.collections.List

/**
 * The `GSettings` class provides a convenient API for storing and retrieving
 * application settings.
 *
 * Reads and writes can be considered to be non-blocking.  Reading
 * settings with `GSettings` is typically extremely fast: on
 * approximately the same order of magnitude (but slower than) a
 * [struct@GLib.HashTable] lookup.  Writing settings is also extremely fast in
 * terms of time to return to your application, but can be extremely expensive
 * for other threads and other processes.  Many settings backends
 * (including dconf) have lazy initialisation which means in the common
 * case of the user using their computer without modifying any settings
 * a lot of work can be avoided.  For dconf, the D-Bus service doesn’t
 * even need to be started in this case.  For this reason, you should
 * only ever modify `GSettings` keys in response to explicit user action.
 * Particular care should be paid to ensure that modifications are not
 * made during startup — for example, when setting the initial value
 * of preferences widgets.  The built-in [method@Gio.Settings.bind]
 * functionality is careful not to write settings in response to notify signals
 * as a result of modifications that it makes to widgets.
 *
 * When creating a `GSettings` instance, you have to specify a schema
 * that describes the keys in your settings and their types and default
 * values, as well as some other information.
 *
 * Normally, a schema has a fixed path that determines where the settings
 * are stored in the conceptual global tree of settings. However, schemas
 * can also be ‘[relocatable](#relocatable-schemas)’, i.e. not equipped with
 * a fixed path. This is
 * useful e.g. when the schema describes an ‘account’, and you want to be
 * able to store a arbitrary number of accounts.
 *
 * Paths must start with and end with a forward slash character (`/`)
 * and must not contain two sequential slash characters.  Paths should
 * be chosen based on a domain name associated with the program or
 * library to which the settings belong.  Examples of paths are
 * `/org/gtk/settings/file-chooser/` and `/ca/desrt/dconf-editor/`.
 * Paths should not start with `/apps/`, `/desktop/` or `/system/` as
 * they often did in GConf.
 *
 * Unlike other configuration systems (like GConf), GSettings does not
 * restrict keys to basic types like strings and numbers. GSettings stores
 * values as [struct@GLib.Variant], and allows any [type@GLib.VariantType] for
 * keys. Key names are restricted to lowercase characters, numbers and `-`.
 * Furthermore, the names must begin with a lowercase character, must not end
 * with a `-`, and must not contain consecutive dashes.
 *
 * Similar to GConf, the default values in GSettings schemas can be
 * localized, but the localized values are stored in gettext catalogs
 * and looked up with the domain that is specified in the
 * `gettext-domain` attribute of the `<schemalist>` or `<schema>`
 * elements and the category that is specified in the `l10n` attribute of
 * the `<default>` element. The string which is translated includes all text in
 * the `<default>` element, including any surrounding quotation marks.
 *
 * The `l10n` attribute must be set to `messages` or `time`, and sets the
 * [locale category for
 * translation](https://www.gnu.org/software/gettext/manual/html_node/Aspects.html#index-locale-categories-1).
 * The `messages` category should be used by default; use `time` for
 * translatable date or time formats. A translation comment can be added as an
 * XML comment immediately above the `<default>` element — it is recommended to
 * add these comments to aid translators understand the meaning and
 * implications of the default value. An optional translation `context`
 * attribute can be set on the `<default>` element to disambiguate multiple
 * defaults which use the same string.
 *
 * For example:
 * ```xml
 *  <!-- Translators: A list of words which are not allowed to be typed, in
 *       GVariant serialization syntax.
 *       See: https://developer.gnome.org/glib/stable/gvariant-text.html -->
 *  <default l10n='messages' context='Banned words'>['bad', 'words']</default>
 * ```
 *
 * Translations of default values must remain syntactically valid serialized
 * [struct@GLib.Variant]s (e.g. retaining any surrounding quotation marks) or
 * runtime errors will occur.
 *
 * GSettings uses schemas in a compact binary form that is created
 * by the [`glib-compile-schemas`](glib-compile-schemas.html)
 * utility. The input is a schema description in an XML format.
 *
 * A DTD for the gschema XML format can be found here:
 * [gschema.dtd](https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/gschema.dtd)
 *
 * The [`glib-compile-schemas`](glib-compile-schemas.html) tool expects schema
 * files to have the extension `.gschema.xml`.
 *
 * At runtime, schemas are identified by their ID (as specified in the
 * `id` attribute of the `<schema>` element). The convention for schema
 * IDs is to use a dotted name, similar in style to a D-Bus bus name,
 * e.g. `org.gnome.SessionManager`. In particular, if the settings are
 * for a specific service that owns a D-Bus bus name, the D-Bus bus name
 * and schema ID should match. For schemas which deal with settings not
 * associated with one named application, the ID should not use
 * StudlyCaps, e.g. `org.gnome.font-rendering`.
 *
 * In addition to [struct@GLib.Variant] types, keys can have types that have
 * enumerated types. These can be described by a `<choice>`,
 * `<enum>` or `<flags>` element, as seen in the
 * second example below. The underlying type of such a key
 * is string, but you can use [method@Gio.Settings.get_enum],
 * [method@Gio.Settings.set_enum], [method@Gio.Settings.get_flags],
 * [method@Gio.Settings.set_flags] access the numeric values corresponding to
 * the string value of enum and flags keys.
 *
 * An example for default value:
 * ```xml
 * <schemalist>
 *   <schema id="org.gtk.Test" path="/org/gtk/Test/" gettext-domain="test">
 *
 *     <key name="greeting" type="s">
 *       <default l10n="messages">"Hello, earthlings"</default>
 *       <summary>A greeting</summary>
 *       <description>
 *         Greeting of the invading martians
 *       </description>
 *     </key>
 *
 *     <key name="box" type="(ii)">
 *       <default>(20,30)</default>
 *     </key>
 *
 *     <key name="empty-string" type="s">
 *       <default>""</default>
 *       <summary>Empty strings have to be provided in GVariant form</summary>
 *     </key>
 *
 *   </schema>
 * </schemalist>
 * ```
 *
 * An example for ranges, choices and enumerated types:
 * ```xml
 * <schemalist>
 *
 *   <enum id="org.gtk.Test.myenum">
 *     <value nick="first" value="1"/>
 *     <value nick="second" value="2"/>
 *   </enum>
 *
 *   <flags id="org.gtk.Test.myflags">
 *     <value nick="flag1" value="1"/>
 *     <value nick="flag2" value="2"/>
 *     <value nick="flag3" value="4"/>
 *   </flags>
 *
 *   <schema id="org.gtk.Test">
 *
 *     <key name="key-with-range" type="i">
 *       <range min="1" max="100"/>
 *       <default>10</default>
 *     </key>
 *
 *     <key name="key-with-choices" type="s">
 *       <choices>
 *         <choice value='Elisabeth'/>
 *         <choice value='Annabeth'/>
 *         <choice value='Joe'/>
 *       </choices>
 *       <aliases>
 *         <alias value='Anna' target='Annabeth'/>
 *         <alias value='Beth' target='Elisabeth'/>
 *       </aliases>
 *       <default>'Joe'</default>
 *     </key>
 *
 *     <key name='enumerated-key' enum='org.gtk.Test.myenum'>
 *       <default>'first'</default>
 *     </key>
 *
 *     <key name='flags-key' flags='org.gtk.Test.myflags'>
 *       <default>["flag1","flag2"]</default>
 *     </key>
 *   </schema>
 * </schemalist>
 * ```
 *
 * ## Vendor overrides
 *
 * Default values are defined in the schemas that get installed by
 * an application. Sometimes, it is necessary for a vendor or distributor
 * to adjust these defaults. Since patching the XML source for the schema
 * is inconvenient and error-prone,
 * [`glib-compile-schemas`](glib-compile-schemas.html) reads so-called ‘vendor
 * override’ files. These are keyfiles in the same directory as the XML
 * schema sources which can override default values. The schema ID serves
 * as the group name in the key file, and the values are expected in
 * serialized [struct@GLib.Variant] form, as in the following example:
 * ```
 * [org.gtk.Example]
 * key1='string'
 * key2=1.5
 * ```
 *
 * `glib-compile-schemas` expects schema files to have the extension
 * `.gschema.override`.
 *
 * ## Binding
 *
 * A very convenient feature of GSettings lets you bind [class@GObject.Object]
 * properties directly to settings, using [method@Gio.Settings.bind]. Once a
 * [class@GObject.Object] property has been bound to a setting, changes on
 * either side are automatically propagated to the other side. GSettings handles
 * details like mapping between [class@GObject.Object] and [struct@GLib.Variant]
 * types, and preventing infinite cycles.
 *
 * This makes it very easy to hook up a preferences dialog to the
 * underlying settings. To make this even more convenient, GSettings
 * looks for a boolean property with the name `sensitivity` and
 * automatically binds it to the writability of the bound setting.
 * If this ‘magic’ gets in the way, it can be suppressed with the
 * `G_SETTINGS_BIND_NO_SENSITIVITY` flag.
 *
 * ## Relocatable schemas
 *
 * A relocatable schema is one with no `path` attribute specified on its
 * `<schema>` element. By using [ctor@Gio.Settings.new_with_path], a `GSettings`
 * object can be instantiated for a relocatable schema, assigning a path to the
 * instance. Paths passed to [ctor@Gio.Settings.new_with_path] will typically be
 * constructed dynamically from a constant prefix plus some form of instance
 * identifier; but they must still be valid GSettings paths. Paths could also
 * be constant and used with a globally installed schema originating from a
 * dependency library.
 *
 * For example, a relocatable schema could be used to store geometry information
 * for different windows in an application. If the schema ID was
 * `org.foo.MyApp.Window`, it could be instantiated for paths
 * `/org/foo/MyApp/main/`, `/org/foo/MyApp/document-1/`,
 * `/org/foo/MyApp/document-2/`, etc. If any of the paths are well-known
 * they can be specified as `<child>` elements in the parent schema, e.g.:
 * ```xml
 * <schema id="org.foo.MyApp" path="/org/foo/MyApp/">
 *   <child name="main" schema="org.foo.MyApp.Window"/>
 * </schema>
 * ```
 *
 * ## Build system integration
 *
 * GSettings comes with autotools integration to simplify compiling and
 * installing schemas. To add GSettings support to an application, add the
 * following to your `configure.ac`:
 * ```
 * GLIB_GSETTINGS
 * ```
 *
 * In the appropriate `Makefile.am`, use the following snippet to compile and
 * install the named schema:
 * ```
 * gsettings_SCHEMAS = org.foo.MyApp.gschema.xml
 * EXTRA_DIST = $(gsettings_SCHEMAS)
 *
 * @GSETTINGS_RULES@
 * ```
 *
 * No changes are needed to the build system to mark a schema XML file for
 * translation. Assuming it sets the `gettext-domain` attribute, a schema may
 * be marked for translation by adding it to `POTFILES.in`, assuming gettext
 * 0.19 is in use (the preferred method for translation):
 * ```
 * data/org.foo.MyApp.gschema.xml
 * ```
 *
 * Alternatively, if intltool 0.50.1 is in use:
 * ```
 * [type: gettext/gsettings]data/org.foo.MyApp.gschema.xml
 * ```
 *
 * GSettings will use gettext to look up translations for the `<summary>` and
 * `<description>` elements, and also any `<default>` elements which have a
 * `l10n` attribute set. Translations must not be included in the `.gschema.xml`
 * file by the build system, for example by using intltool XML rules with a
 * `.gschema.xml.in` template.
 *
 * If an enumerated type defined in a C header file is to be used in a GSettings
 * schema, it can either be defined manually using an `<enum>` element in the
 * schema XML, or it can be extracted automatically from the C header. This
 * approach is preferred, as it ensures the two representations are always
 * synchronised. To do so, add the following to the relevant `Makefile.am`:
 * ```
 * gsettings_ENUM_NAMESPACE = org.foo.MyApp
 * gsettings_ENUM_FILES = my-app-enums.h my-app-misc.h
 * ```
 *
 * `gsettings_ENUM_NAMESPACE` specifies the schema namespace for the enum files,
 * which are specified in `gsettings_ENUM_FILES`. This will generate a
 * `org.foo.MyApp.enums.xml` file containing the extracted enums, which will be
 * automatically included in the schema compilation, install and uninstall
 * rules. It should not be committed to version control or included in
 * `EXTRA_DIST`.
 *
 * ## Skipped during bindings generation
 *
 * - method `get_mapped`: Return type gpointer is unsupported
 * - method `backend`: Property has no getter nor setter
 * - method `delay-apply`: Property has no getter nor setter
 * - method `path`: Property has no getter nor setter
 * - method `schema`: Property has no getter nor setter
 * - method `schema-id`: Property has no getter nor setter
 * - method `settings-schema`: Property has no getter nor setter
 * - signal `change-event`: Unsupported parameter `keys` : Array parameter of type GLib.Quark is not supported
 */
public open class Settings(
    pointer: CPointer<GSettings>,
) : Object(pointer.reinterpret()),
    KGTyped {
    public val gioSettingsPointer: CPointer<GSettings>
        get() = gPointer.reinterpret()

    /**
     * If this property is true, the #GSettings object has outstanding
     * changes that will be applied when g_settings_apply() is called.
     */
    public open val hasUnapplied: Boolean
        /**
         * Returns whether the #GSettings object has any unapplied
         * changes.  This can only be the case if it is in 'delayed-apply' mode.
         *
         * @return true if @settings has unapplied changes
         * @since 2.26
         */
        get() = g_settings_get_has_unapplied(gioSettingsPointer.reinterpret()).asBoolean()

    /**
     * Creates a new #GSettings object with the schema specified by
     * @schema_id.
     *
     * It is an error for the schema to not exist: schemas are an
     * essential part of a program, as they provide type information.
     * If schemas need to be dynamically loaded (for example, from an
     * optional runtime dependency), g_settings_schema_source_lookup()
     * can be used to test for their existence before loading them.
     *
     * Signals on the newly created #GSettings object will be dispatched
     * via the thread-default #GMainContext in effect at the time of the
     * call to g_settings_new().  The new #GSettings will hold a reference
     * on the context.  See g_main_context_push_thread_default().
     *
     * @param schemaId the id of the schema
     * @return a new #GSettings object
     * @since 2.26
     */
    public constructor(schemaId: String) : this(g_settings_new(schemaId)!!.reinterpret())

    /**
     * Creates a new #GSettings object with a given schema, backend and
     * path.
     *
     * It should be extremely rare that you ever want to use this function.
     * It is made available for advanced use-cases (such as plugin systems
     * that want to provide access to schemas loaded from custom locations,
     * etc).
     *
     * At the most basic level, a #GSettings object is a pure composition of
     * 4 things: a #GSettingsSchema, a #GSettingsBackend, a path within that
     * backend, and a #GMainContext to which signals are dispatched.
     *
     * This constructor therefore gives you full control over constructing
     * #GSettings instances.  The first 3 parameters are given directly as
     * @schema, @backend and @path, and the main context is taken from the
     * thread-default (as per g_settings_new()).
     *
     * If @backend is null then the default backend is used.
     *
     * If @path is null then the path from the schema is used.  It is an
     * error if @path is null and the schema has no path of its own or if
     * @path is non-null and not equal to the path that the schema does
     * have.
     *
     * @param schema a #GSettingsSchema
     * @param backend a #GSettingsBackend
     * @param path the path to use
     * @return a new #GSettings object
     * @since 2.32
     */
    public constructor(
        schema: SettingsSchema,
        backend: SettingsBackend? = null,
        path: String? = null,
    ) : this(
        g_settings_new_full(
            schema.gioSettingsSchemaPointer.reinterpret(),
            backend?.gioSettingsBackendPointer?.reinterpret(),
            path
        )!!.reinterpret()
    )

    /**
     * Creates a new #GSettings object with the schema specified by
     * @schema_id and a given #GSettingsBackend.
     *
     * Creating a #GSettings object with a different backend allows accessing
     * settings from a database other than the usual one. For example, it may make
     * sense to pass a backend corresponding to the "defaults" settings database on
     * the system to get a settings object that modifies the system default
     * settings instead of the settings for this user.
     *
     * @param schemaId the id of the schema
     * @param backend the #GSettingsBackend to use
     * @return a new #GSettings object
     * @since 2.26
     */
    public constructor(
        schemaId: String,
        backend: SettingsBackend,
    ) : this(g_settings_new_with_backend(schemaId, backend.gioSettingsBackendPointer.reinterpret())!!.reinterpret())

    /**
     * Creates a new #GSettings object with the schema specified by
     * @schema_id and a given #GSettingsBackend and path.
     *
     * This is a mix of g_settings_new_with_backend() and
     * g_settings_new_with_path().
     *
     * @param schemaId the id of the schema
     * @param backend the #GSettingsBackend to use
     * @param path the path to use
     * @return a new #GSettings object
     * @since 2.26
     */
    public constructor(
        schemaId: String,
        backend: SettingsBackend,
        path: String,
    ) : this(
        g_settings_new_with_backend_and_path(
            schemaId,
            backend.gioSettingsBackendPointer.reinterpret(),
            path
        )!!.reinterpret()
    )

    /**
     * Creates a new #GSettings object with the relocatable schema specified
     * by @schema_id and a given path.
     *
     * You only need to do this if you want to directly create a settings
     * object with a schema that doesn't have a specified path of its own.
     * That's quite rare.
     *
     * It is a programmer error to call this function for a schema that
     * has an explicitly specified path.
     *
     * It is a programmer error if @path is not a valid path.  A valid path
     * begins and ends with '/' and does not contain two consecutive '/'
     * characters.
     *
     * @param schemaId the id of the schema
     * @param path the path to use
     * @return a new #GSettings object
     * @since 2.26
     */
    public constructor(schemaId: String, path: String) : this(g_settings_new_with_path(schemaId, path)!!.reinterpret())

    /**
     * Applies any changes that have been made to the settings.  This
     * function does nothing unless @settings is in 'delay-apply' mode;
     * see g_settings_delay().  In the normal case settings are always
     * applied immediately.
     */
    public open fun apply(): Unit = g_settings_apply(gioSettingsPointer.reinterpret())

    /**
     * Create a binding between the @key in the @settings object
     * and the property @property of @object.
     *
     * The binding uses the default GIO mapping functions to map
     * between the settings and property values. These functions
     * handle booleans, numeric types and string types in a
     * straightforward way. Use g_settings_bind_with_mapping() if
     * you need a custom mapping, or map between types that are not
     * supported by the default mapping functions.
     *
     * Unless the @flags include %G_SETTINGS_BIND_NO_SENSITIVITY, this
     * function also establishes a binding between the writability of
     * @key and the "sensitive" property of @object (if @object has
     * a boolean property by that name). See g_settings_bind_writable()
     * for more details about writable bindings.
     *
     * Note that the lifecycle of the binding is tied to @object,
     * and that you can have only one binding per object property.
     * If you bind the same property twice on the same object, the second
     * binding overrides the first one.
     *
     * @param key the key to bind
     * @param object a #GObject
     * @param property the name of the property to bind
     * @param flags flags for the binding
     * @since 2.26
     */
    @GioVersion2_26
    public open fun bind(
        key: String,
        `object`: Object,
        `property`: String,
        flags: SettingsBindFlags,
    ): Unit =
        g_settings_bind(gioSettingsPointer.reinterpret(), key, `object`.gPointer.reinterpret(), `property`, flags.mask)

    /**
     * Create a binding between the writability of @key in the
     * @settings object and the property @property of @object.
     * The property must be boolean; "sensitive" or "visible"
     * properties of widgets are the most likely candidates.
     *
     * Writable bindings are always uni-directional; changes of the
     * writability of the setting will be propagated to the object
     * property, not the other way.
     *
     * When the @inverted argument is true, the binding inverts the
     * value as it passes from the setting to the object, i.e. @property
     * will be set to true if the key is not writable.
     *
     * Note that the lifecycle of the binding is tied to @object,
     * and that you can have only one binding per object property.
     * If you bind the same property twice on the same object, the second
     * binding overrides the first one.
     *
     * @param key the key to bind
     * @param object a #GObject
     * @param property the name of a boolean property to bind
     * @param inverted whether to 'invert' the value
     * @since 2.26
     */
    @GioVersion2_26
    public open fun bindWritable(
        key: String,
        `object`: Object,
        `property`: String,
        inverted: Boolean,
    ): Unit =
        g_settings_bind_writable(
            gioSettingsPointer.reinterpret(),
            key,
            `object`.gPointer.reinterpret(),
            `property`,
            inverted.asGBoolean()
        )

    /**
     * Creates a #GAction corresponding to a given #GSettings key.
     *
     * The action has the same name as the key.
     *
     * The value of the key becomes the state of the action and the action
     * is enabled when the key is writable.  Changing the state of the
     * action results in the key being written to.  Changes to the value or
     * writability of the key cause appropriate change notifications to be
     * emitted for the action.
     *
     * For boolean-valued keys, action activations take no parameter and
     * result in the toggling of the value.  For all other types,
     * activations take the new value for the key (which must have the
     * correct type).
     *
     * @param key the name of a key in @settings
     * @return a new #GAction
     * @since 2.32
     */
    @GioVersion2_32
    public open fun createAction(key: String): Action =
        g_settings_create_action(gioSettingsPointer.reinterpret(), key)!!.run {
            Action.wrap(reinterpret())
        }

    /**
     * Changes the #GSettings object into 'delay-apply' mode. In this
     * mode, changes to @settings are not immediately propagated to the
     * backend, but kept locally until g_settings_apply() is called.
     *
     * @since 2.26
     */
    @GioVersion2_26
    public open fun delay(): Unit = g_settings_delay(gioSettingsPointer.reinterpret())

    /**
     * Gets the value that is stored at @key in @settings.
     *
     * A convenience variant of g_settings_get() for booleans.
     *
     * It is a programmer error to give a @key that isn't specified as
     * having a boolean type in the schema for @settings.
     *
     * @param key the key to get the value for
     * @return a boolean
     * @since 2.26
     */
    @GioVersion2_26
    public open fun getBoolean(key: String): Boolean =
        g_settings_get_boolean(gioSettingsPointer.reinterpret(), key).asBoolean()

    /**
     * Creates a child settings object which has a base path of
     * `base-path/@name`, where `base-path` is the base path of
     * @settings.
     *
     * The schema for the child settings object must have been declared
     * in the schema of @settings using a `<child>` element.
     *
     * The created child settings object will inherit the #GSettings:delay-apply
     * mode from @settings.
     *
     * @param name the name of the child schema
     * @return a 'child' settings object
     * @since 2.26
     */
    @GioVersion2_26
    public open fun getChild(name: String): Settings =
        g_settings_get_child(gioSettingsPointer.reinterpret(), name)!!.run {
            Settings(reinterpret())
        }

    /**
     * Gets the "default value" of a key.
     *
     * This is the value that would be read if g_settings_reset() were to be
     * called on the key.
     *
     * Note that this may be a different value than returned by
     * g_settings_schema_key_get_default_value() if the system administrator
     * has provided a default value.
     *
     * Comparing the return values of g_settings_get_default_value() and
     * g_settings_get_value() is not sufficient for determining if a value
     * has been set because the user may have explicitly set the value to
     * something that happens to be equal to the default.  The difference
     * here is that if the default changes in the future, the user's key
     * will still be set.
     *
     * This function may be useful for adding an indication to a UI of what
     * the default value was before the user set it.
     *
     * It is a programmer error to give a @key that isn't contained in the
     * schema for @settings.
     *
     * @param key the key to get the default value for
     * @return the default value
     * @since 2.40
     */
    @GioVersion2_40
    public open fun getDefaultValue(key: String): Variant? =
        g_settings_get_default_value(gioSettingsPointer.reinterpret(), key)?.run {
            Variant(reinterpret())
        }

    /**
     * Gets the value that is stored at @key in @settings.
     *
     * A convenience variant of g_settings_get() for doubles.
     *
     * It is a programmer error to give a @key that isn't specified as
     * having a 'double' type in the schema for @settings.
     *
     * @param key the key to get the value for
     * @return a double
     * @since 2.26
     */
    @GioVersion2_26
    public open fun getDouble(key: String): Double = g_settings_get_double(gioSettingsPointer.reinterpret(), key)

    /**
     * Gets the value that is stored in @settings for @key and converts it
     * to the enum value that it represents.
     *
     * In order to use this function the type of the value must be a string
     * and it must be marked in the schema file as an enumerated type.
     *
     * It is a programmer error to give a @key that isn't contained in the
     * schema for @settings or is not marked as an enumerated type.
     *
     * If the value stored in the configuration database is not a valid
     * value for the enumerated type then this function will return the
     * default value.
     *
     * @param key the key to get the value for
     * @return the enum value
     * @since 2.26
     */
    @GioVersion2_26
    public open fun getEnum(key: String): Int = g_settings_get_enum(gioSettingsPointer.reinterpret(), key)

    /**
     * Gets the value that is stored in @settings for @key and converts it
     * to the flags value that it represents.
     *
     * In order to use this function the type of the value must be an array
     * of strings and it must be marked in the schema file as a flags type.
     *
     * It is a programmer error to give a @key that isn't contained in the
     * schema for @settings or is not marked as a flags type.
     *
     * If the value stored in the configuration database is not a valid
     * value for the flags type then this function will return the default
     * value.
     *
     * @param key the key to get the value for
     * @return the flags value
     * @since 2.26
     */
    @GioVersion2_26
    public open fun getFlags(key: String): UInt = g_settings_get_flags(gioSettingsPointer.reinterpret(), key)

    /**
     * Returns whether the #GSettings object has any unapplied
     * changes.  This can only be the case if it is in 'delayed-apply' mode.
     *
     * @return true if @settings has unapplied changes
     * @since 2.26
     */
    @GioVersion2_26
    public open fun getHasUnapplied(): Boolean =
        g_settings_get_has_unapplied(gioSettingsPointer.reinterpret()).asBoolean()

    /**
     * Gets the value that is stored at @key in @settings.
     *
     * A convenience variant of g_settings_get() for 32-bit integers.
     *
     * It is a programmer error to give a @key that isn't specified as
     * having a int32 type in the schema for @settings.
     *
     * @param key the key to get the value for
     * @return an integer
     * @since 2.26
     */
    @GioVersion2_26
    public open fun getInt(key: String): Int = g_settings_get_int(gioSettingsPointer.reinterpret(), key)

    /**
     * Gets the value that is stored at @key in @settings.
     *
     * A convenience variant of g_settings_get() for 64-bit integers.
     *
     * It is a programmer error to give a @key that isn't specified as
     * having a int64 type in the schema for @settings.
     *
     * @param key the key to get the value for
     * @return a 64-bit integer
     * @since 2.50
     */
    @GioVersion2_50
    public open fun getInt64(key: String): Long = g_settings_get_int64(gioSettingsPointer.reinterpret(), key)

    /**
     * Queries the range of a key.
     *
     * @param key the key to query the range of
     * @since 2.28
     */
    @GioVersion2_28
    public open fun getRange(key: String): Variant =
        g_settings_get_range(gioSettingsPointer.reinterpret(), key)!!.run {
            Variant(reinterpret())
        }

    /**
     * Gets the value that is stored at @key in @settings.
     *
     * A convenience variant of g_settings_get() for strings.
     *
     * It is a programmer error to give a @key that isn't specified as
     * having a string type in the schema for @settings.
     *
     * @param key the key to get the value for
     * @return a newly-allocated string
     * @since 2.26
     */
    @GioVersion2_26
    public open fun getString(key: String): String =
        g_settings_get_string(gioSettingsPointer.reinterpret(), key)?.toKString() ?: error("Expected not null string")

    /**
     * A convenience variant of g_settings_get() for string arrays.
     *
     * It is a programmer error to give a @key that isn't specified as
     * having an array of strings type in the schema for @settings.
     *
     * @param key the key to get the value for
     * @return a
     * newly-allocated, null-terminated array of strings, the value that
     * is stored at @key in @settings.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun getStrv(key: String): List<String> =
        g_settings_get_strv(gioSettingsPointer.reinterpret(), key)?.toKStringList()
            ?: error("Expected not null string array")

    /**
     * Gets the value that is stored at @key in @settings.
     *
     * A convenience variant of g_settings_get() for 32-bit unsigned
     * integers.
     *
     * It is a programmer error to give a @key that isn't specified as
     * having a uint32 type in the schema for @settings.
     *
     * @param key the key to get the value for
     * @return an unsigned integer
     * @since 2.30
     */
    @GioVersion2_30
    public open fun getUint(key: String): UInt = g_settings_get_uint(gioSettingsPointer.reinterpret(), key)

    /**
     * Gets the value that is stored at @key in @settings.
     *
     * A convenience variant of g_settings_get() for 64-bit unsigned
     * integers.
     *
     * It is a programmer error to give a @key that isn't specified as
     * having a uint64 type in the schema for @settings.
     *
     * @param key the key to get the value for
     * @return a 64-bit unsigned integer
     * @since 2.50
     */
    @GioVersion2_50
    public open fun getUint64(key: String): ULong = g_settings_get_uint64(gioSettingsPointer.reinterpret(), key)

    /**
     * Checks the "user value" of a key, if there is one.
     *
     * The user value of a key is the last value that was set by the user.
     *
     * After calling g_settings_reset() this function should always return
     * null (assuming something is not wrong with the system
     * configuration).
     *
     * It is possible that g_settings_get_value() will return a different
     * value than this function.  This can happen in the case that the user
     * set a value for a key that was subsequently locked down by the system
     * administrator -- this function will return the user's old value.
     *
     * This function may be useful for adding a "reset" option to a UI or
     * for providing indication that a particular value has been changed.
     *
     * It is a programmer error to give a @key that isn't contained in the
     * schema for @settings.
     *
     * @param key the key to get the user value for
     * @return the user's value, if set
     * @since 2.40
     */
    @GioVersion2_40
    public open fun getUserValue(key: String): Variant? =
        g_settings_get_user_value(gioSettingsPointer.reinterpret(), key)?.run {
            Variant(reinterpret())
        }

    /**
     * Gets the value that is stored in @settings for @key.
     *
     * It is a programmer error to give a @key that isn't contained in the
     * schema for @settings.
     *
     * @param key the key to get the value for
     * @return a new #GVariant
     * @since 2.26
     */
    @GioVersion2_26
    public open fun getValue(key: String): Variant =
        g_settings_get_value(gioSettingsPointer.reinterpret(), key)!!.run {
            Variant(reinterpret())
        }

    /**
     * Finds out if a key can be written or not
     *
     * @param name the name of a key
     * @return true if the key @name is writable
     * @since 2.26
     */
    @GioVersion2_26
    public open fun isWritable(name: String): Boolean =
        g_settings_is_writable(gioSettingsPointer.reinterpret(), name).asBoolean()

    /**
     * Gets the list of children on @settings.
     *
     * The list is exactly the list of strings for which it is not an error
     * to call g_settings_get_child().
     *
     * There is little reason to call this function from "normal" code, since
     * you should already know what children are in your schema. This function
     * may still be useful there for introspection reasons, however.
     *
     * You should free the return value with g_strfreev() when you are done
     * with it.
     *
     * @return a list of the children
     *    on @settings, in no defined order
     */
    public open fun listChildren(): List<String> =
        g_settings_list_children(gioSettingsPointer.reinterpret())?.toKStringList()
            ?: error("Expected not null string array")

    /**
     * Introspects the list of keys on @settings.
     *
     * You should probably not be calling this function from "normal" code
     * (since you should already know what keys are in your schema).  This
     * function is intended for introspection reasons.
     *
     * You should free the return value with g_strfreev() when you are done
     * with it.
     *
     * @return a list
     *    of the keys on @settings, in no defined order
     */
    public open fun listKeys(): List<String> =
        g_settings_list_keys(gioSettingsPointer.reinterpret())?.toKStringList()
            ?: error("Expected not null string array")

    /**
     * Checks if the given @value is of the correct type and within the
     * permitted range for @key.
     *
     * @param key the key to check
     * @param value the value to check
     * @return true if @value is valid for @key
     * @since 2.28
     */
    @GioVersion2_28
    public open fun rangeCheck(
        key: String,
        `value`: Variant,
    ): Boolean =
        g_settings_range_check(
            gioSettingsPointer.reinterpret(),
            key,
            `value`.glibVariantPointer.reinterpret()
        ).asBoolean()

    /**
     * Resets @key to its default value.
     *
     * This call resets the key, as much as possible, to its default value.
     * That might be the value specified in the schema or the one set by the
     * administrator.
     *
     * @param key the name of a key
     */
    public open fun reset(key: String): Unit = g_settings_reset(gioSettingsPointer.reinterpret(), key)

    /**
     * Reverts all non-applied changes to the settings.  This function
     * does nothing unless @settings is in 'delay-apply' mode; see
     * g_settings_delay().  In the normal case settings are always applied
     * immediately.
     *
     * Change notifications will be emitted for affected keys.
     */
    public open fun revert(): Unit = g_settings_revert(gioSettingsPointer.reinterpret())

    /**
     * Sets @key in @settings to @value.
     *
     * A convenience variant of g_settings_set() for booleans.
     *
     * It is a programmer error to give a @key that isn't specified as
     * having a boolean type in the schema for @settings.
     *
     * @param key the name of the key to set
     * @param value the value to set it to
     * @return true if setting the key succeeded,
     *     false if the key was not writable
     * @since 2.26
     */
    @GioVersion2_26
    public open fun setBoolean(
        key: String,
        `value`: Boolean,
    ): Boolean = g_settings_set_boolean(gioSettingsPointer.reinterpret(), key, `value`.asGBoolean()).asBoolean()

    /**
     * Sets @key in @settings to @value.
     *
     * A convenience variant of g_settings_set() for doubles.
     *
     * It is a programmer error to give a @key that isn't specified as
     * having a 'double' type in the schema for @settings.
     *
     * @param key the name of the key to set
     * @param value the value to set it to
     * @return true if setting the key succeeded,
     *     false if the key was not writable
     * @since 2.26
     */
    @GioVersion2_26
    public open fun setDouble(
        key: String,
        `value`: Double,
    ): Boolean = g_settings_set_double(gioSettingsPointer.reinterpret(), key, `value`).asBoolean()

    /**
     * Looks up the enumerated type nick for @value and writes it to @key,
     * within @settings.
     *
     * It is a programmer error to give a @key that isn't contained in the
     * schema for @settings or is not marked as an enumerated type, or for
     * @value not to be a valid value for the named type.
     *
     * After performing the write, accessing @key directly with
     * g_settings_get_string() will return the 'nick' associated with
     * @value.
     *
     * @param key a key, within @settings
     * @param value an enumerated value
     * @return true, if the set succeeds
     */
    public open fun setEnum(
        key: String,
        `value`: Int,
    ): Boolean = g_settings_set_enum(gioSettingsPointer.reinterpret(), key, `value`).asBoolean()

    /**
     * Looks up the flags type nicks for the bits specified by @value, puts
     * them in an array of strings and writes the array to @key, within
     * @settings.
     *
     * It is a programmer error to give a @key that isn't contained in the
     * schema for @settings or is not marked as a flags type, or for @value
     * to contain any bits that are not value for the named type.
     *
     * After performing the write, accessing @key directly with
     * g_settings_get_strv() will return an array of 'nicks'; one for each
     * bit in @value.
     *
     * @param key a key, within @settings
     * @param value a flags value
     * @return true, if the set succeeds
     */
    public open fun setFlags(
        key: String,
        `value`: UInt,
    ): Boolean = g_settings_set_flags(gioSettingsPointer.reinterpret(), key, `value`).asBoolean()

    /**
     * Sets @key in @settings to @value.
     *
     * A convenience variant of g_settings_set() for 32-bit integers.
     *
     * It is a programmer error to give a @key that isn't specified as
     * having a int32 type in the schema for @settings.
     *
     * @param key the name of the key to set
     * @param value the value to set it to
     * @return true if setting the key succeeded,
     *     false if the key was not writable
     * @since 2.26
     */
    @GioVersion2_26
    public open fun setInt(
        key: String,
        `value`: Int,
    ): Boolean = g_settings_set_int(gioSettingsPointer.reinterpret(), key, `value`).asBoolean()

    /**
     * Sets @key in @settings to @value.
     *
     * A convenience variant of g_settings_set() for 64-bit integers.
     *
     * It is a programmer error to give a @key that isn't specified as
     * having a int64 type in the schema for @settings.
     *
     * @param key the name of the key to set
     * @param value the value to set it to
     * @return true if setting the key succeeded,
     *     false if the key was not writable
     * @since 2.50
     */
    @GioVersion2_50
    public open fun setInt64(
        key: String,
        `value`: Long,
    ): Boolean = g_settings_set_int64(gioSettingsPointer.reinterpret(), key, `value`).asBoolean()

    /**
     * Sets @key in @settings to @value.
     *
     * A convenience variant of g_settings_set() for strings.
     *
     * It is a programmer error to give a @key that isn't specified as
     * having a string type in the schema for @settings.
     *
     * @param key the name of the key to set
     * @param value the value to set it to
     * @return true if setting the key succeeded,
     *     false if the key was not writable
     * @since 2.26
     */
    @GioVersion2_26
    public open fun setString(
        key: String,
        `value`: String,
    ): Boolean = g_settings_set_string(gioSettingsPointer.reinterpret(), key, `value`).asBoolean()

    /**
     * Sets @key in @settings to @value.
     *
     * A convenience variant of g_settings_set() for string arrays.  If
     * @value is null, then @key is set to be the empty array.
     *
     * It is a programmer error to give a @key that isn't specified as
     * having an array of strings type in the schema for @settings.
     *
     * @param key the name of the key to set
     * @param value the value to set it to, or null
     * @return true if setting the key succeeded,
     *     false if the key was not writable
     * @since 2.26
     */
    @GioVersion2_26
    public open fun setStrv(
        key: String,
        `value`: List<String>? = null,
    ): Boolean =
        memScoped {
            return g_settings_set_strv(gioSettingsPointer.reinterpret(), key, `value`?.toCStringList(this)).asBoolean()
        }

    /**
     * Sets @key in @settings to @value.
     *
     * A convenience variant of g_settings_set() for 32-bit unsigned
     * integers.
     *
     * It is a programmer error to give a @key that isn't specified as
     * having a uint32 type in the schema for @settings.
     *
     * @param key the name of the key to set
     * @param value the value to set it to
     * @return true if setting the key succeeded,
     *     false if the key was not writable
     * @since 2.30
     */
    @GioVersion2_30
    public open fun setUint(
        key: String,
        `value`: UInt,
    ): Boolean = g_settings_set_uint(gioSettingsPointer.reinterpret(), key, `value`).asBoolean()

    /**
     * Sets @key in @settings to @value.
     *
     * A convenience variant of g_settings_set() for 64-bit unsigned
     * integers.
     *
     * It is a programmer error to give a @key that isn't specified as
     * having a uint64 type in the schema for @settings.
     *
     * @param key the name of the key to set
     * @param value the value to set it to
     * @return true if setting the key succeeded,
     *     false if the key was not writable
     * @since 2.50
     */
    @GioVersion2_50
    public open fun setUint64(
        key: String,
        `value`: ULong,
    ): Boolean = g_settings_set_uint64(gioSettingsPointer.reinterpret(), key, `value`).asBoolean()

    /**
     * Sets @key in @settings to @value.
     *
     * It is a programmer error to give a @key that isn't contained in the
     * schema for @settings or for @value to have the incorrect type, per
     * the schema.
     *
     * If @value is floating then this function consumes the reference.
     *
     * @param key the name of the key to set
     * @param value a #GVariant of the correct type
     * @return true if setting the key succeeded,
     *     false if the key was not writable
     * @since 2.26
     */
    @GioVersion2_26
    public open fun setValue(
        key: String,
        `value`: Variant,
    ): Boolean =
        g_settings_set_value(
            gioSettingsPointer.reinterpret(),
            key,
            `value`.glibVariantPointer.reinterpret()
        ).asBoolean()

    /**
     * The "changed" signal is emitted when a key has potentially changed.
     * You should call one of the g_settings_get() calls to check the new
     * value.
     *
     * This signal supports detailed connections.  You can connect to the
     * detailed signal "changed::x" in order to only receive callbacks
     * when key "x" changes.
     *
     * Note that @settings only emits this signal if you have read @key at
     * least once while a signal handler was already connected for @key.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `key` the name of the key that changed
     */
    public fun connectChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (key: String) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "changed",
            connectChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The "writable-change-event" signal is emitted once per writability
     * change event that affects this settings object.  You should connect
     * to this signal if you are interested in viewing groups of changes
     * before they are split out into multiple emissions of the
     * "writable-changed" signal.  For most use cases it is more
     * appropriate to use the "writable-changed" signal.
     *
     * In the event that the writability change applies only to a single
     * key, @key will be set to the #GQuark for that key.  In the event
     * that the writability change affects the entire settings object,
     * @key will be 0.
     *
     * The default handler for this signal invokes the "writable-changed"
     * and "changed" signals for each affected key.  This is done because
     * changes in writability might also imply changes in value (if for
     * example, a new mandatory setting is introduced).  If any other
     * connected handler returns true then this default functionality
     * will be suppressed.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `key` the quark of the key, or 0. Returns true to stop other handlers from being invoked for the
     *          event. FALSE to propagate the event further.
     */
    public fun connectWritableChangeEvent(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (key: UInt) -> Boolean,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "writable-change-event",
            connectWritableChangeEventFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The "writable-changed" signal is emitted when the writability of a
     * key has potentially changed.  You should call
     * g_settings_is_writable() in order to determine the new status.
     *
     * This signal supports detailed connections.  You can connect to the
     * detailed signal "writable-changed::x" in order to only receive
     * callbacks when the writability of "x" changes.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `key` the key
     */
    public fun connectWritableChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (key: String) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "writable-changed",
            connectWritableChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<Settings> {
        override val type: GeneratedClassKGType<Settings> =
            GeneratedClassKGType(g_settings_get_type()) { Settings(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Deprecated.
         *
         * @return a list of
         *   relocatable #GSettings schemas that are available, in no defined order.
         *   The list must not be modified or freed.
         * @since 2.28
         */
        @GioVersion2_28
        public fun listRelocatableSchemas(): List<String> =
            g_settings_list_relocatable_schemas()?.toKStringList() ?: error("Expected not null string array")

        /**
         * Deprecated.
         *
         * @return a list of
         *   #GSettings schemas that are available, in no defined order.  The list
         *   must not be modified or freed.
         * @since 2.26
         */
        @GioVersion2_26
        public fun listSchemas(): List<String> =
            g_settings_list_schemas()?.toKStringList() ?: error("Expected not null string array")

        /**
         * Ensures that all pending operations are complete for the default backend.
         *
         * Writes made to a #GSettings are handled asynchronously.  For this
         * reason, it is very unlikely that the changes have it to disk by the
         * time g_settings_set() returns.
         *
         * This call will block until all of the writes have made it to the
         * backend.  Since the mainloop is not running, no change notifications
         * will be dispatched during this call (but some may be queued by the
         * time the call is done).
         */
        public fun sync(): Unit = g_settings_sync()

        /**
         * Removes an existing binding for @property on @object.
         *
         * Note that bindings are automatically removed when the
         * object is finalized, so it is rarely necessary to call this
         * function.
         *
         * @param object the object
         * @param property the property whose binding is removed
         * @since 2.26
         */
        @GioVersion2_26
        public fun unbind(
            `object`: Object,
            `property`: String,
        ): Unit = g_settings_unbind(`object`.gPointer.reinterpret(), `property`)
    }
}

private val connectChangedFunc: CPointer<CFunction<(CPointer<ByteVar>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            key: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<
                (
                    key: String,
                ) -> Unit
            >()
            .get()
            .invoke(key?.toKString() ?: error("Expected not null string"))
    }.reinterpret()

private val connectWritableChangeEventFunc: CPointer<CFunction<(UInt) -> Int>> =
    staticCFunction {
            _: COpaquePointer,
            key: UInt,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<(key: UInt) -> Boolean>()
            .get()
            .invoke(key)
            .asGBoolean()
    }.reinterpret()

private val connectWritableChangedFunc: CPointer<CFunction<(CPointer<ByteVar>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            key: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<
                (
                    key: String,
                ) -> Unit
            >()
            .get()
            .invoke(key?.toKString() ?: error("Expected not null string"))
    }.reinterpret()
