// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.annotations.GLibVersion2_14
import org.gtkkn.bindings.glib.annotations.GLibVersion2_4
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GStringChunk
import org.gtkkn.native.glib.g_string_chunk_clear
import org.gtkkn.native.glib.g_string_chunk_free
import org.gtkkn.native.glib.g_string_chunk_insert
import org.gtkkn.native.glib.g_string_chunk_insert_const
import org.gtkkn.native.glib.g_string_chunk_insert_len
import kotlin.Long
import kotlin.String
import kotlin.Unit

/**
 * `GStringChunk` provides efficient storage of groups of strings
 *
 * String chunks are used to store groups of strings. Memory is
 * allocated in blocks, and as strings are added to the `GStringChunk`
 * they are copied into the next free position in a block. When a block
 * is full a new block is allocated.
 *
 * When storing a large number of strings, string chunks are more
 * efficient than using [func@GLib.strdup] since fewer calls to `malloc()`
 * are needed, and less memory is wasted in memory allocation overheads.
 *
 * By adding strings with [method@GLib.StringChunk.insert_const] it is also
 * possible to remove duplicates.
 *
 * To create a new `GStringChunk` use [func@GLib.StringChunk.new].
 *
 * To add strings to a `GStringChunk` use [method@GLib.StringChunk.insert].
 *
 * To add strings to a `GStringChunk`, but without duplicating strings
 * which are already in the `GStringChunk`, use [method@GLib.StringChunk.insert_const].
 *
 * To free the entire `GStringChunk` use [method@GLib.StringChunk.free].
 * It is not possible to free individual strings.
 *
 * ## Skipped during bindings generation
 *
 * - function `new`: Return type StringChunk is unsupported
 */
public class StringChunk(pointer: CPointer<GStringChunk>) : ProxyInstance(pointer) {
    public val glibStringChunkPointer: CPointer<GStringChunk> = pointer

    /**
     * Frees all strings contained within the #GStringChunk.
     * After calling g_string_chunk_clear() it is not safe to
     * access any of the strings which were contained within it.
     *
     * @since 2.14
     */
    @GLibVersion2_14
    public fun clear(): Unit = g_string_chunk_clear(glibStringChunkPointer.reinterpret())

    /**
     * Frees all memory allocated by the #GStringChunk.
     * After calling g_string_chunk_free() it is not safe to
     * access any of the strings which were contained within it.
     */
    public fun free(): Unit = g_string_chunk_free(glibStringChunkPointer.reinterpret())

    /**
     * Adds a copy of @string to the #GStringChunk.
     * It returns a pointer to the new copy of the string
     * in the #GStringChunk. The characters in the string
     * can be changed, if necessary, though you should not
     * change anything after the end of the string.
     *
     * Unlike g_string_chunk_insert_const(), this function
     * does not check for duplicates. Also strings added
     * with g_string_chunk_insert() will not be searched
     * by g_string_chunk_insert_const() when looking for
     * duplicates.
     *
     * @param string the string to add
     * @return a pointer to the copy of @string within
     *     the #GStringChunk
     */
    public fun insert(string: String): String =
        g_string_chunk_insert(glibStringChunkPointer.reinterpret(), string)?.toKString()
            ?: error("Expected not null string")

    /**
     * Adds a copy of @string to the #GStringChunk, unless the same
     * string has already been added to the #GStringChunk with
     * g_string_chunk_insert_const().
     *
     * This function is useful if you need to copy a large number
     * of strings but do not want to waste space storing duplicates.
     * But you must remember that there may be several pointers to
     * the same string, and so any changes made to the strings
     * should be done very carefully.
     *
     * Note that g_string_chunk_insert_const() will not return a
     * pointer to a string added with g_string_chunk_insert(), even
     * if they do match.
     *
     * @param string the string to add
     * @return a pointer to the new or existing copy of @string
     *     within the #GStringChunk
     */
    public fun insertConst(string: String): String =
        g_string_chunk_insert_const(glibStringChunkPointer.reinterpret(), string)?.toKString()
            ?: error("Expected not null string")

    /**
     * Adds a copy of the first @len bytes of @string to the #GStringChunk.
     * The copy is nul-terminated.
     *
     * Since this function does not stop at nul bytes, it is the caller's
     * responsibility to ensure that @string has at least @len addressable
     * bytes.
     *
     * The characters in the returned string can be changed, if necessary,
     * though you should not change anything after the end of the string.
     *
     * @param string bytes to insert
     * @param len number of bytes of @string to insert, or -1 to insert a
     *     nul-terminated string
     * @return a pointer to the copy of @string within the #GStringChunk
     * @since 2.4
     */
    @GLibVersion2_4
    public fun insertLen(string: String, len: Long): String =
        g_string_chunk_insert_len(glibStringChunkPointer.reinterpret(), string, len)?.toKString()
            ?: error("Expected not null string")
}
