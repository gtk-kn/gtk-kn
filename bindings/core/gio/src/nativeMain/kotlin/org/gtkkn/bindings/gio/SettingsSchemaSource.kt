// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.gio.annotations.GioVersion2_32
import org.gtkkn.bindings.glib.Error
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.native.gio.GSettingsSchemaSource
import org.gtkkn.native.gio.g_settings_schema_source_get_default
import org.gtkkn.native.gio.g_settings_schema_source_get_type
import org.gtkkn.native.gio.g_settings_schema_source_lookup
import org.gtkkn.native.gio.g_settings_schema_source_new_from_directory
import org.gtkkn.native.gio.g_settings_schema_source_ref
import org.gtkkn.native.gio.g_settings_schema_source_unref
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.GType
import kotlin.Boolean
import kotlin.Result
import kotlin.String
import kotlin.Unit

/**
 * This is an opaque structure type.  You may not access it directly.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `non_relocatable`: non_relocatable: Out parameter is not supported
 *
 * @since 2.32
 */
@GioVersion2_32
public class SettingsSchemaSource(public val gioSettingsSchemaSourcePointer: CPointer<GSettingsSchemaSource>) :
    ProxyInstance(gioSettingsSchemaSourcePointer) {
    /**
     * Looks up a schema with the identifier @schema_id in @source.
     *
     * This function is not required for normal uses of #GSettings but it
     * may be useful to authors of plugin management systems or to those who
     * want to introspect the content of schemas.
     *
     * If the schema isn't found directly in @source and @recursive is true
     * then the parent sources will also be checked.
     *
     * If the schema isn't found, null is returned.
     *
     * @param schemaId a schema ID
     * @param recursive true if the lookup should be recursive
     * @return a new #GSettingsSchema
     * @since 2.32
     */
    @GioVersion2_32
    public fun lookup(schemaId: String, recursive: Boolean): SettingsSchema? =
        g_settings_schema_source_lookup(gioSettingsSchemaSourcePointer, schemaId, recursive.asGBoolean())?.run {
            SettingsSchema(this)
        }

    /**
     * Increase the reference count of @source, returning a new reference.
     *
     * @return a new reference to @source
     * @since 2.32
     */
    @GioVersion2_32
    public fun ref(): SettingsSchemaSource = g_settings_schema_source_ref(gioSettingsSchemaSourcePointer)!!.run {
        SettingsSchemaSource(this)
    }

    /**
     * Decrease the reference count of @source, possibly freeing it.
     *
     * @since 2.32
     */
    @GioVersion2_32
    public fun unref(): Unit = g_settings_schema_source_unref(gioSettingsSchemaSourcePointer)

    public companion object {
        /**
         * Attempts to create a new schema source corresponding to the contents
         * of the given directory.
         *
         * This function is not required for normal uses of #GSettings but it
         * may be useful to authors of plugin management systems.
         *
         * The directory should contain a file called `gschemas.compiled` as
         * produced by the [glib-compile-schemas][glib-compile-schemas] tool.
         *
         * If @trusted is true then `gschemas.compiled` is trusted not to be
         * corrupted. This assumption has a performance advantage, but can result
         * in crashes or inconsistent behaviour in the case of a corrupted file.
         * Generally, you should set @trusted to true for files installed by the
         * system and to false for files in the home directory.
         *
         * In either case, an empty file or some types of corruption in the file will
         * result in %G_FILE_ERROR_INVAL being returned.
         *
         * If @parent is non-null then there are two effects.
         *
         * First, if g_settings_schema_source_lookup() is called with the
         * @recursive flag set to true and the schema can not be found in the
         * source, the lookup will recurse to the parent.
         *
         * Second, any references to other schemas specified within this
         * source (ie: `child` or `extends`) references may be resolved
         * from the @parent.
         *
         * For this second reason, except in very unusual situations, the
         * @parent should probably be given as the default schema source, as
         * returned by g_settings_schema_source_get_default().
         *
         * @param directory the filename of a directory
         * @param parent a #GSettingsSchemaSource, or null
         * @param trusted true, if the directory is trusted
         * @since 2.32
         */
        public fun newFromDirectory(
            directory: String,
            parent: SettingsSchemaSource? = null,
            trusted: Boolean,
        ): Result<SettingsSchemaSource> {
            memScoped {
                val gError = allocPointerTo<GError>()
                val gResult =
                    g_settings_schema_source_new_from_directory(
                        directory,
                        parent?.gioSettingsSchemaSourcePointer,
                        trusted.asGBoolean(),
                        gError.ptr
                    )
                return if (gError.pointed != null) {
                    Result.failure(resolveException(Error(gError.pointed!!.ptr)))
                } else {
                    Result.success(SettingsSchemaSource(checkNotNull(gResult)))
                }
            }
        }

        /**
         * Gets the default system schema source.
         *
         * This function is not required for normal uses of #GSettings but it
         * may be useful to authors of plugin management systems or to those who
         * want to introspect the content of schemas.
         *
         * If no schemas are installed, null will be returned.
         *
         * The returned source may actually consist of multiple schema sources
         * from different directories, depending on which directories were given
         * in `XDG_DATA_DIRS` and `GSETTINGS_SCHEMA_DIR`. For this reason, all
         * lookups performed against the default source should probably be done
         * recursively.
         *
         * @return the default schema source
         * @since 2.32
         */
        @GioVersion2_32
        public fun getDefault(): SettingsSchemaSource? = g_settings_schema_source_get_default()?.run {
            SettingsSchemaSource(this)
        }

        /**
         * Get the GType of SettingsSchemaSource
         *
         * @return the GType
         */
        public fun getType(): GType = g_settings_schema_source_get_type()
    }
}
