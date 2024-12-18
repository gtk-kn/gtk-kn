// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.annotations.GioVersion2_32
import org.gtkkn.bindings.gio.annotations.GioVersion2_40
import org.gtkkn.bindings.gio.annotations.GioVersion2_44
import org.gtkkn.bindings.gio.annotations.GioVersion2_46
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.toKStringList
import org.gtkkn.native.gio.GSettingsSchema
import org.gtkkn.native.gio.g_settings_schema_get_id
import org.gtkkn.native.gio.g_settings_schema_get_key
import org.gtkkn.native.gio.g_settings_schema_get_path
import org.gtkkn.native.gio.g_settings_schema_get_type
import org.gtkkn.native.gio.g_settings_schema_has_key
import org.gtkkn.native.gio.g_settings_schema_list_children
import org.gtkkn.native.gio.g_settings_schema_list_keys
import org.gtkkn.native.gio.g_settings_schema_ref
import org.gtkkn.native.gio.g_settings_schema_unref
import org.gtkkn.native.gobject.GType
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * The [struct@Gio.SettingsSchemaSource] and `GSettingsSchema` APIs provide a
 * mechanism for advanced control over the loading of schemas and a
 * mechanism for introspecting their content.
 *
 * Plugin loading systems that wish to provide plugins a way to access
 * settings face the problem of how to make the schemas for these
 * settings visible to GSettings.  Typically, a plugin will want to ship
 * the schema along with itself and it won't be installed into the
 * standard system directories for schemas.
 *
 * [struct@Gio.SettingsSchemaSource] provides a mechanism for dealing with this
 * by allowing the creation of a new ‘schema source’ from which schemas can
 * be acquired.  This schema source can then become part of the metadata
 * associated with the plugin and queried whenever the plugin requires
 * access to some settings.
 *
 * Consider the following example:
 *
 * ```c
 * typedef struct
 * {
 *    …
 *    GSettingsSchemaSource *schema_source;
 *    …
 * } Plugin;
 *
 * Plugin *
 * initialise_plugin (const gchar *dir)
 * {
 *   Plugin *plugin;
 *
 *   …
 *
 *   plugin->schema_source =
 *     g_settings_schema_source_new_from_directory (dir,
 *       g_settings_schema_source_get_default (), FALSE, NULL);
 *
 *   …
 *
 *   return plugin;
 * }
 *
 * …
 *
 * GSettings *
 * plugin_get_settings (Plugin      *plugin,
 *                      const gchar *schema_id)
 * {
 *   GSettingsSchema *schema;
 *
 *   if (schema_id == NULL)
 *     schema_id = plugin->identifier;
 *
 *   schema = g_settings_schema_source_lookup (plugin->schema_source,
 *                                             schema_id, FALSE);
 *
 *   if (schema == NULL)
 *     {
 *       … disable the plugin or abort, etc …
 *     }
 *
 *   return g_settings_new_full (schema, NULL, NULL);
 * }
 * ```
 *
 * The code above shows how hooks should be added to the code that
 * initialises (or enables) the plugin to create the schema source and
 * how an API can be added to the plugin system to provide a convenient
 * way for the plugin to access its settings, using the schemas that it
 * ships.
 *
 * From the standpoint of the plugin, it would need to ensure that it
 * ships a gschemas.compiled file as part of itself, and then simply do
 * the following:
 *
 * ```c
 * {
 *   GSettings *settings;
 *   gint some_value;
 *
 *   settings = plugin_get_settings (self, NULL);
 *   some_value = g_settings_get_int (settings, "some-value");
 *   …
 * }
 * ```
 *
 * It's also possible that the plugin system expects the schema source
 * files (ie: `.gschema.xml` files) instead of a `gschemas.compiled` file.
 * In that case, the plugin loading system must compile the schemas for
 * itself before attempting to create the settings source.
 * @since 2.32
 */
@GioVersion2_32
public class SettingsSchema(pointer: CPointer<GSettingsSchema>) : ProxyInstance(pointer) {
    public val gioSettingsSchemaPointer: CPointer<GSettingsSchema> = pointer

    /**
     * Get the ID of @schema.
     *
     * @return the ID
     */
    public fun getId(): String = g_settings_schema_get_id(gioSettingsSchemaPointer.reinterpret())?.toKString()
        ?: error("Expected not null string")

    /**
     * Gets the key named @name from @schema.
     *
     * It is a programmer error to request a key that does not exist.  See
     * g_settings_schema_list_keys().
     *
     * @param name the name of a key
     * @return the #GSettingsSchemaKey for @name
     * @since 2.40
     */
    @GioVersion2_40
    public fun getKey(name: String): SettingsSchemaKey =
        g_settings_schema_get_key(gioSettingsSchemaPointer.reinterpret(), name)!!.run {
            SettingsSchemaKey(reinterpret())
        }

    /**
     * Gets the path associated with @schema, or null.
     *
     * Schemas may be single-instance or relocatable.  Single-instance
     * schemas correspond to exactly one set of keys in the backend
     * database: those located at the path returned by this function.
     *
     * Relocatable schemas can be referenced by other schemas and can
     * therefore describe multiple sets of keys at different locations.  For
     * relocatable schemas, this function will return null.
     *
     * @return the path of the schema, or null
     * @since 2.32
     */
    @GioVersion2_32
    public fun getPath(): String? = g_settings_schema_get_path(gioSettingsSchemaPointer.reinterpret())?.toKString()

    /**
     * Checks if @schema has a key named @name.
     *
     * @param name the name of a key
     * @return true if such a key exists
     * @since 2.40
     */
    @GioVersion2_40
    public fun hasKey(name: String): Boolean =
        g_settings_schema_has_key(gioSettingsSchemaPointer.reinterpret(), name).asBoolean()

    /**
     * Gets the list of children in @schema.
     *
     * You should free the return value with g_strfreev() when you are done
     * with it.
     *
     * @return a list of
     *    the children on @settings, in no defined order
     * @since 2.44
     */
    @GioVersion2_44
    public fun listChildren(): List<String> =
        g_settings_schema_list_children(gioSettingsSchemaPointer.reinterpret())?.toKStringList()
            ?: error("Expected not null string array")

    /**
     * Introspects the list of keys on @schema.
     *
     * You should probably not be calling this function from "normal" code
     * (since you should already know what keys are in your schema).  This
     * function is intended for introspection reasons.
     *
     * @return a list
     *   of the keys on @schema, in no defined order
     * @since 2.46
     */
    @GioVersion2_46
    public fun listKeys(): List<String> =
        g_settings_schema_list_keys(gioSettingsSchemaPointer.reinterpret())?.toKStringList()
            ?: error("Expected not null string array")

    /**
     * Increase the reference count of @schema, returning a new reference.
     *
     * @return a new reference to @schema
     * @since 2.32
     */
    @GioVersion2_32
    public fun ref(): SettingsSchema = g_settings_schema_ref(gioSettingsSchemaPointer.reinterpret())!!.run {
        SettingsSchema(reinterpret())
    }

    /**
     * Decrease the reference count of @schema, possibly freeing it.
     *
     * @since 2.32
     */
    @GioVersion2_32
    public fun unref(): Unit = g_settings_schema_unref(gioSettingsSchemaPointer.reinterpret())

    public companion object {
        /**
         * Get the GType of SettingsSchema
         *
         * @return the GType
         */
        public fun getType(): GType = g_settings_schema_get_type()
    }
}
