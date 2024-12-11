// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.annotations.GLibVersion2_76
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GPathBuf
import org.gtkkn.native.glib.g_path_buf_clear
import org.gtkkn.native.glib.g_path_buf_clear_to_path
import org.gtkkn.native.glib.g_path_buf_copy
import org.gtkkn.native.glib.g_path_buf_free
import org.gtkkn.native.glib.g_path_buf_free_to_path
import org.gtkkn.native.glib.g_path_buf_init
import org.gtkkn.native.glib.g_path_buf_init_from_path
import org.gtkkn.native.glib.g_path_buf_new
import org.gtkkn.native.glib.g_path_buf_new_from_path
import org.gtkkn.native.glib.g_path_buf_pop
import org.gtkkn.native.glib.g_path_buf_push
import org.gtkkn.native.glib.g_path_buf_set_extension
import org.gtkkn.native.glib.g_path_buf_set_filename
import org.gtkkn.native.glib.g_path_buf_to_path
import kotlin.Boolean
import kotlin.Pair
import kotlin.String
import kotlin.Unit
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * `GPathBuf` is a helper type that allows you to easily build paths from
 * individual elements, using the platform specific conventions for path
 * separators.
 *
 * ```c
 * g_auto (GPathBuf) path;
 *
 * g_path_buf_init (&path);
 *
 * g_path_buf_push (&path, "usr");
 * g_path_buf_push (&path, "bin");
 * g_path_buf_push (&path, "echo");
 *
 * g_autofree char *echo = g_path_buf_to_path (&path);
 * g_assert_cmpstr (echo, ==, "/usr/bin/echo");
 * ```
 *
 * You can also load a full path and then operate on its components:
 *
 * ```c
 * g_auto (GPathBuf) path;
 *
 * g_path_buf_init_from_path (&path, "/usr/bin/echo");
 *
 * g_path_buf_pop (&path);
 * g_path_buf_push (&path, "sh");
 *
 * g_autofree char *sh = g_path_buf_to_path (&path);
 * g_assert_cmpstr (sh, ==, "/usr/bin/sh");
 * ```
 *
 * ## Skipped during bindings generation
 *
 * - parameter `v1`: gpointer
 * - field `dummy`: Record field dummy is private
 *
 * @since 2.76
 */
@GLibVersion2_76
public class PathBuf(pointer: CPointer<GPathBuf>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val glibPathBufPointer: CPointer<GPathBuf> = pointer

    /**
     * Allocate a new PathBuf.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GPathBuf>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to PathBuf and a [Cleaner] instance.
     */
    private constructor(pair: Pair<CPointer<GPathBuf>, Cleaner>) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new PathBuf using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GPathBuf>().ptr)

    /**
     * Clears the contents of the path buffer.
     *
     * This function should be use to free the resources in a stack-allocated
     * `GPathBuf` initialized using g_path_buf_init() or
     * g_path_buf_init_from_path().
     *
     * @since 2.76
     */
    @GLibVersion2_76
    public fun clear(): Unit = g_path_buf_clear(glibPathBufPointer.reinterpret())

    /**
     * Clears the contents of the path buffer and returns the built path.
     *
     * This function returns `NULL` if the `GPathBuf` is empty.
     *
     * See also: g_path_buf_to_path()
     *
     * @return the built path
     * @since 2.76
     */
    @GLibVersion2_76
    public fun clearToPath(): String? = g_path_buf_clear_to_path(glibPathBufPointer.reinterpret())?.toKString()

    /**
     * Copies the contents of a path buffer into a new `GPathBuf`.
     *
     * @return the newly allocated path buffer
     * @since 2.76
     */
    @GLibVersion2_76
    public fun copy(): PathBuf = g_path_buf_copy(glibPathBufPointer.reinterpret())!!.run {
        PathBuf(reinterpret())
    }

    /**
     * Frees a `GPathBuf` allocated by g_path_buf_new().
     *
     * @since 2.76
     */
    @GLibVersion2_76
    public fun free(): Unit = g_path_buf_free(glibPathBufPointer.reinterpret())

    /**
     * Frees a `GPathBuf` allocated by g_path_buf_new(), and
     * returns the path inside the buffer.
     *
     * This function returns `NULL` if the `GPathBuf` is empty.
     *
     * See also: g_path_buf_to_path()
     *
     * @return the path
     * @since 2.76
     */
    @GLibVersion2_76
    public fun freeToPath(): String? = g_path_buf_free_to_path(glibPathBufPointer.reinterpret())?.toKString()

    /**
     * Initializes a `GPathBuf` instance.
     *
     * @return the initialized path builder
     * @since 2.76
     */
    @GLibVersion2_76
    public fun `init`(): PathBuf = g_path_buf_init(glibPathBufPointer.reinterpret())!!.run {
        PathBuf(reinterpret())
    }

    /**
     * Initializes a `GPathBuf` instance with the given path.
     *
     * @param path a file system path
     * @return the initialized path builder
     * @since 2.76
     */
    @GLibVersion2_76
    public fun initFromPath(path: String? = null): PathBuf =
        g_path_buf_init_from_path(glibPathBufPointer.reinterpret(), path)!!.run {
            PathBuf(reinterpret())
        }

    /**
     * Removes the last element of the path buffer.
     *
     * If there is only one element in the path buffer (for example, `/` on
     * Unix-like operating systems or the drive on Windows systems), it will
     * not be removed and false will be returned instead.
     *
     * |[<!-- language="C" -->
     * GPathBuf buf, cmp;
     *
     * g_path_buf_init_from_path (&buf, "/bin/sh");
     *
     * g_path_buf_pop (&buf);
     * g_path_buf_init_from_path (&cmp, "/bin");
     * g_assert_true (g_path_buf_equal (&buf, &cmp));
     * g_path_buf_clear (&cmp);
     *
     * g_path_buf_pop (&buf);
     * g_path_buf_init_from_path (&cmp, "/");
     * g_assert_true (g_path_buf_equal (&buf, &cmp));
     * g_path_buf_clear (&cmp);
     *
     * g_path_buf_clear (&buf);
     * ]|
     *
     * @return `TRUE` if the buffer was modified and `FALSE` otherwise
     * @since 2.76
     */
    @GLibVersion2_76
    public fun pop(): Boolean = g_path_buf_pop(glibPathBufPointer.reinterpret()).asBoolean()

    /**
     * Extends the given path buffer with @path.
     *
     * If @path is absolute, it replaces the current path.
     *
     * If @path contains a directory separator, the buffer is extended by
     * as many elements the path provides.
     *
     * On Windows, both forward slashes and backslashes are treated as
     * directory separators. On other platforms, %G_DIR_SEPARATOR_S is the
     * only directory separator.
     *
     * |[<!-- language="C" -->
     * GPathBuf buf, cmp;
     *
     * g_path_buf_init_from_path (&buf, "/tmp");
     * g_path_buf_push (&buf, ".X11-unix/X0");
     * g_path_buf_init_from_path (&cmp, "/tmp/.X11-unix/X0");
     * g_assert_true (g_path_buf_equal (&buf, &cmp));
     * g_path_buf_clear (&cmp);
     *
     * g_path_buf_push (&buf, "/etc/locale.conf");
     * g_path_buf_init_from_path (&cmp, "/etc/locale.conf");
     * g_assert_true (g_path_buf_equal (&buf, &cmp));
     * g_path_buf_clear (&cmp);
     *
     * g_path_buf_clear (&buf);
     * ]|
     *
     * @param path a path
     * @return the same pointer to @buf, for convenience
     * @since 2.76
     */
    @GLibVersion2_76
    public fun push(path: String): PathBuf = g_path_buf_push(glibPathBufPointer.reinterpret(), path)!!.run {
        PathBuf(reinterpret())
    }

    /**
     * Adds an extension to the file name in the path buffer.
     *
     * If @extension is `NULL`, the extension will be unset.
     *
     * If the path buffer does not have a file name set, this function returns
     * `FALSE` and leaves the path buffer unmodified.
     *
     * @param extension the file extension
     * @return `TRUE` if the extension was replaced, and `FALSE` otherwise
     * @since 2.76
     */
    @GLibVersion2_76
    public fun setExtension(extension: String? = null): Boolean =
        g_path_buf_set_extension(glibPathBufPointer.reinterpret(), extension).asBoolean()

    /**
     * Sets the file name of the path.
     *
     * If the path buffer is empty, the filename is left unset and this
     * function returns `FALSE`.
     *
     * If the path buffer only contains the root element (on Unix-like operating
     * systems) or the drive (on Windows), this is the equivalent of pushing
     * the new @file_name.
     *
     * If the path buffer contains a path, this is the equivalent of
     * popping the path buffer and pushing @file_name, creating a
     * sibling of the original path.
     *
     * |[<!-- language="C" -->
     * GPathBuf buf, cmp;
     *
     * g_path_buf_init_from_path (&buf, "/");
     *
     * g_path_buf_set_filename (&buf, "bar");
     * g_path_buf_init_from_path (&cmp, "/bar");
     * g_assert_true (g_path_buf_equal (&buf, &cmp));
     * g_path_buf_clear (&cmp);
     *
     * g_path_buf_set_filename (&buf, "baz.txt");
     * g_path_buf_init_from_path (&cmp, "/baz.txt");
     * g_assert_true (g_path_buf_equal (&buf, &cmp);
     * g_path_buf_clear (&cmp);
     *
     * g_path_buf_clear (&buf);
     * ]|
     *
     * @param fileName the file name in the path
     * @return `TRUE` if the file name was replaced, and `FALSE` otherwise
     * @since 2.76
     */
    @GLibVersion2_76
    public fun setFilename(fileName: String): Boolean =
        g_path_buf_set_filename(glibPathBufPointer.reinterpret(), fileName).asBoolean()

    /**
     * Retrieves the built path from the path buffer.
     *
     * On Windows, the result contains backslashes as directory separators,
     * even if forward slashes were used in input.
     *
     * If the path buffer is empty, this function returns `NULL`.
     *
     * @return the path
     * @since 2.76
     */
    @GLibVersion2_76
    public fun toPath(): String? = g_path_buf_to_path(glibPathBufPointer.reinterpret())?.toKString()

    public companion object {
        /**
         * Allocates a new `GPathBuf`.
         *
         * @return the newly allocated path buffer
         * @since 2.76
         */
        @GLibVersion2_76
        public fun new(): PathBuf = g_path_buf_new()!!.run {
            PathBuf(reinterpret())
        }

        /**
         * Allocates a new `GPathBuf` with the given @path.
         *
         * @param path the path used to initialize the buffer
         * @return the newly allocated path buffer
         * @since 2.76
         */
        @GLibVersion2_76
        public fun newFromPath(path: String? = null): PathBuf = g_path_buf_new_from_path(path)!!.run {
            PathBuf(reinterpret())
        }
    }
}
