// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.annotations.GioVersion2_32
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.gio.GFileAttributeMatcher
import org.gtkkn.native.gio.g_file_attribute_matcher_enumerate_namespace
import org.gtkkn.native.gio.g_file_attribute_matcher_enumerate_next
import org.gtkkn.native.gio.g_file_attribute_matcher_get_type
import org.gtkkn.native.gio.g_file_attribute_matcher_matches
import org.gtkkn.native.gio.g_file_attribute_matcher_matches_only
import org.gtkkn.native.gio.g_file_attribute_matcher_new
import org.gtkkn.native.gio.g_file_attribute_matcher_ref
import org.gtkkn.native.gio.g_file_attribute_matcher_subtract
import org.gtkkn.native.gio.g_file_attribute_matcher_to_string
import org.gtkkn.native.gio.g_file_attribute_matcher_unref
import org.gtkkn.native.gobject.GType
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Determines if a string matches a file attribute.
 */
public class FileAttributeMatcher(public val gioFileAttributeMatcherPointer: CPointer<GFileAttributeMatcher>) :
    ProxyInstance(gioFileAttributeMatcherPointer) {
    /**
     * Creates a new file attribute matcher, which matches attributes
     * against a given string. #GFileAttributeMatchers are reference
     * counted structures, and are created with a reference count of 1. If
     * the number of references falls to 0, the #GFileAttributeMatcher is
     * automatically destroyed.
     *
     * The @attributes string should be formatted with specific keys separated
     * from namespaces with a double colon. Several "namespace::key" strings may be
     * concatenated with a single comma (e.g. "standard::type,standard::is-hidden").
     * The wildcard "*" may be used to match all keys and namespaces, or
     * "namespace::*" will match all keys in a given namespace.
     *
     * ## Examples of file attribute matcher strings and results
     *
     * - `"*"`: matches all attributes.
     * - `"standard::is-hidden"`: matches only the key is-hidden in the
     *   standard namespace.
     * - `"standard::type,unix::*"`: matches the type key in the standard
     *   namespace and all keys in the unix namespace.
     *
     * @param attributes an attribute string to match.
     * @return a #GFileAttributeMatcher
     */
    public constructor(attributes: String) : this(g_file_attribute_matcher_new(attributes)!!) {
        MemoryCleaner.setBoxedType(this, getType(), owned = true)
    }

    /**
     * Checks if the matcher will match all of the keys in a given namespace.
     * This will always return true if a wildcard character is in use (e.g. if
     * matcher was created with "standard::*" and @ns is "standard", or if matcher was created
     * using "*" and namespace is anything.)
     *
     * TODO: this is awkwardly worded.
     *
     * @param ns a string containing a file attribute namespace.
     * @return true if the matcher matches all of the entries
     * in the given @ns, false otherwise.
     */
    public fun enumerateNamespace(ns: String): Boolean =
        g_file_attribute_matcher_enumerate_namespace(gioFileAttributeMatcherPointer, ns).asBoolean()

    /**
     * Gets the next matched attribute from a #GFileAttributeMatcher.
     *
     * @return a string containing the next attribute or, null if
     * no more attribute exist.
     */
    public fun enumerateNext(): String? =
        g_file_attribute_matcher_enumerate_next(gioFileAttributeMatcherPointer)?.toKString()

    /**
     * Checks if an attribute will be matched by an attribute matcher. If
     * the matcher was created with the "*" matching string, this function
     * will always return true.
     *
     * @param attribute a file attribute key.
     * @return true if @attribute matches @matcher. false otherwise.
     */
    public fun matches(attribute: String): Boolean =
        g_file_attribute_matcher_matches(gioFileAttributeMatcherPointer, attribute).asBoolean()

    /**
     * Checks if an attribute matcher only matches a given attribute. Always
     * returns false if "*" was used when creating the matcher.
     *
     * @param attribute a file attribute key.
     * @return true if the matcher only matches @attribute. false otherwise.
     */
    public fun matchesOnly(attribute: String): Boolean =
        g_file_attribute_matcher_matches_only(gioFileAttributeMatcherPointer, attribute).asBoolean()

    /**
     * References a file attribute matcher.
     *
     * @return a #GFileAttributeMatcher.
     */
    public fun ref(): FileAttributeMatcher = g_file_attribute_matcher_ref(gioFileAttributeMatcherPointer)!!.run {
        FileAttributeMatcher(this)
    }

    /**
     * Subtracts all attributes of @subtract from @matcher and returns
     * a matcher that supports those attributes.
     *
     * Note that currently it is not possible to remove a single
     * attribute when the @matcher matches the whole namespace - or remove
     * a namespace or attribute when the matcher matches everything. This
     * is a limitation of the current implementation, but may be fixed
     * in the future.
     *
     * @param subtract The matcher to subtract
     * @return A file attribute matcher matching all attributes of
     *     @matcher that are not matched by @subtract
     */
    public fun subtract(subtract: FileAttributeMatcher? = null): FileAttributeMatcher? =
        g_file_attribute_matcher_subtract(
            gioFileAttributeMatcherPointer,
            subtract?.gioFileAttributeMatcherPointer
        )?.run {
            FileAttributeMatcher(this)
        }

    /**
     * Prints what the matcher is matching against. The format will be
     * equal to the format passed to g_file_attribute_matcher_new().
     * The output however, might not be identical, as the matcher may
     * decide to use a different order or omit needless parts.
     *
     * @return a string describing the attributes the matcher matches
     *   against or null if @matcher was null.
     * @since 2.32
     */
    @Suppress("POTENTIALLY_NON_REPORTED_ANNOTATION")
    @GioVersion2_32
    override fun toString(): String = g_file_attribute_matcher_to_string(gioFileAttributeMatcherPointer)?.toKString()
        ?: error("Expected not null string")

    /**
     * Unreferences @matcher. If the reference count falls below 1,
     * the @matcher is automatically freed.
     */
    public fun unref(): Unit = g_file_attribute_matcher_unref(gioFileAttributeMatcherPointer)

    public companion object {
        /**
         * Get the GType of FileAttributeMatcher
         *
         * @return the GType
         */
        public fun getType(): GType = g_file_attribute_matcher_get_type()
    }
}
