/*
 * Copyright (c) 2025 gtk-kn
 *
 * SPDX-License-Identifier: LGPL-2.1-or-later
 *
 * This file is part of gtk-kn.
 * gtk-kn is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, see <http://www.gnu.org/licenses/>.
 */

package org.gtkkn.gir.parser.metadata

/**
 * Represents various types of arguments that can be associated with metadata elements.
 */
enum class ArgumentType {
    /**
     * Whether the symbol is abstract or not.
     */
    ABSTRACT,

    /**
     * Whether the type is an array or not.
     */
    ARRAY,

    /**
     * The index of the C array length parameter.
     */
    ARRAY_LENGTH_IDX,

    /**
     * Whether the array is null-terminated.
     */
    ARRAY_NULL_TERMINATED,

    /**
     * Base type of the symbol.
     */
    BASE_TYPE,

    /**
     * C headers separated by commas.
     */
    CHEADER_FILENAME,

    /**
     * Specifies the index of the parameter representing the user data for this callback.
     */
    CLOSURE,

    /**
     * Function to copy the symbol.
     */
    COPY_FUNCTION,

    /**
     * C type of the symbol.
     */
    CTYPE,

    /**
     * Default expression for the parameter.
     */
    DEFAULT,

    /**
     * Delegate target for the symbol.
     */
    DELEGATE_TARGET,

    /**
     * C name of the delegate target.
     */
    DELEGATE_TARGET_CNAME,

    /**
     * Whether the symbol is deprecated or not.
     */
    DEPRECATED,

    /**
     * Deprecated since version, implies deprecated=true.
     */
    DEPRECATED_SINCE,

    /**
     * Specifies the destroy function for the symbol.
     */
    DESTROY,

    /**
     * Whether the instance is owned by the method.
     */
    DESTROYS_INSTANCE,

    /**
     * C name of the destroy notify function.
     */
    DESTROY_NOTIFY_CNAME,

    /**
     * Whether the enum should use raw value or not.
     */
    ENUM_RAW_VALUE,

    /**
     * Whether the enumeration is an error domain or not.
     */
    ERRORDOMAIN,

    /**
     * Feature test macro for the symbol.
     */
    FEATURE_TEST_MACRO,

    /**
     * Whether the instance is finished.
     */
    FINISH_INSTANCE,

    /**
     * Name of the finish function for the symbol.
     */
    FINISH_NAME,

    /**
     * Whether the symbol has a floating reference.
     */
    FLOATING,

    /**
     * Function to free the symbol.
     */
    FREE_FUNCTION,

    /**
     * Ignore the symbol.
     */
    IGNORE,

    /**
     * Index of the instance for the symbol.
     */
    INSTANCE_IDX,

    /**
     * Whether the symbol is introspectable.
     */
    INTROSPECTABLE,

    /**
     * Symbol name.
     */
    NAME,

    /**
     * Whether the accessor method is omitted.
     */
    NO_ACCESSOR_METHOD,

    /**
     * If automatic conversion is skipped and raw pointers are used in the bindings.
     */
    NO_STRING_CONVERSION,

    /**
     * Whether the type is nullable or not.
     */
    NULLABLE,

    /**
     * Whether the parameter direction is out or not.
     */
    OUT,

    /**
     * Whether the parameter value should be owned.
     */
    OWNED,

    /**
     * Move the symbol to the specified container symbol.
     * If no container exists, a new namespace will be created.
     */
    PARENT,

    /**
     * Whether the field should be private.
     */
    PRIVATE,

    /**
     * Whether the field/property should be readable.
     */
    READABLE,

    /**
     * Whether the parameter direction is ref or not.
     */
    REF,

    /**
     * Function to get the reference of the symbol.
     */
    REF_FUNCTION,

    /**
     * Function to get the sink reference of the symbol.
     */
    REF_SINK_FUNCTION,

    /**
     * Whether the symbol's pointer require a reinterpret().
     */
    REINTERPRET,

    /**
     * Deprecation replacement, implies deprecated=true.
     */
    REPLACEMENT,

    /**
     * Whether the symbol returns a modified pointer.
     */
    RETURNS_MODIFIED_POINTER,

    /**
     * Scope of the delegate, in GIR terms.
     */
    SCOPE,

    /**
     * Whether the symbol is sealed.
     */
    SEALED,

    /**
     * Indicates the version since the symbol is available.
     */
    SHADOWS,

    /**
     * Indicates the version since the symbol is available.
     */
    SINCE,

    /**
     * Type of exception the method throws.
     */
    THROWS,

    /**
     * Indicates the c:type of the type.
     */
    TYPE_CTYPE,

    /**
     * Type ID of the symbol.
     */
    TYPE_ID,

    /**
     * Indicates the name of the type.
     */
    TYPE_NAME,

    /**
     * Whether the symbol is unowned.
     */
    UNOWNED,

    /**
     * Function to unreference the symbol.
     */
    UNREF_FUNCTION,

    /**
     * Whether the symbol is virtual or not.
     */
    VIRTUAL;

    companion object {
        /**
         * Finds the corresponding `ArgumentType` by its string representation.
         *
         * @param name The name of the argument type.
         * @return The corresponding `ArgumentType` if found, otherwise `null`.
         */
        fun fromString(name: String): ArgumentType? {
            val nick = name.replace("_", "-")
            return entries.find { it.name.replace("_", "-").equals(nick, ignoreCase = true) }
        }
    }
}
