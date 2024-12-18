// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GIConv
import org.gtkkn.native.glib.g_iconv_close
import org.gtkkn.native.gobject.gint

/**
 * The GIConv struct wraps an iconv() conversion descriptor. It contains
 * private data and should only be accessed using the following functions.
 *
 * ## Skipped during bindings generation
 *
 * - method `iconv`: In/Out parameter is not supported
 * - function `open`: Return type IConv is unsupported
 */
public class IConv(pointer: GIConv) : ProxyInstance(pointer) {
    public val glibIConvPointer: GIConv = pointer

    /**
     * Same as the standard UNIX routine iconv_close(), but
     * may be implemented via libiconv on UNIX flavors that lack
     * a native implementation. Should be called to clean up
     * the conversion descriptor from g_iconv_open() when
     * you are done converting things.
     *
     * GLib provides g_convert() and g_locale_to_utf8() which are likely
     * more convenient than the raw iconv wrappers.
     *
     * @return -1 on error, 0 on success
     */
    public fun close(): gint = g_iconv_close(glibIConvPointer.reinterpret())
}
