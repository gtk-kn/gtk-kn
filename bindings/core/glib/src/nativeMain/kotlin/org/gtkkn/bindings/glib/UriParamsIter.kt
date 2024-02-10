// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GUriParamsIter
import org.gtkkn.native.glib.g_uri_params_iter_init
import kotlin.Long
import kotlin.String
import kotlin.Unit

/**
 * Many URI schemes include one or more attribute/value pairs as part of the URI
 * value. For example `scheme://server/path?query=string&is=there` has two
 * attributes – `query=string` and `is=there` – in its query part.
 *
 * A #GUriParamsIter structure represents an iterator that can be used to
 * iterate over the attribute/value pairs of a URI query string. #GUriParamsIter
 * structures are typically allocated on the stack and then initialized with
 * g_uri_params_iter_init(). See the documentation for g_uri_params_iter_init()
 * for a usage example.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `attribute`: attribute: Out parameter is not supported
 * - field `dummy0`: Record field dummy0 is private
 * - field `dummy1`: Record field dummy1 is private
 * - field `dummy2`: Record field dummy2 is private
 * - field `dummy3`: Record field dummy3 is private
 *
 * @since 2.66
 */
public class UriParamsIter(
    pointer: CPointer<GUriParamsIter>,
) : Record {
    public val glibUriParamsIterPointer: CPointer<GUriParamsIter> = pointer

    /**
     * Initializes an attribute/value pair iterator.
     *
     * The iterator keeps pointers to the @params and @separators arguments, those
     * variables must thus outlive the iterator and not be modified during the
     * iteration.
     *
     * If %G_URI_PARAMS_WWW_FORM is passed in @flags, `+` characters in the param
     * string will be replaced with spaces in the output. For example, `foo=bar+baz`
     * will give attribute `foo` with value `bar baz`. This is commonly used on the
     * web (the `https` and `http` schemes only), but is deprecated in favour of
     * the equivalent of encoding spaces as `%20`.
     *
     * Unlike with g_uri_parse_params(), %G_URI_PARAMS_CASE_INSENSITIVE has no
     * effect if passed to @flags for g_uri_params_iter_init(). The caller is
     * responsible for doing their own case-insensitive comparisons.
     *
     * |[<!-- language="C" -->
     * GUriParamsIter iter;
     * GError *error = NULL;
     * gchar *unowned_attr, *unowned_value;
     *
     * g_uri_params_iter_init (&iter, "foo=bar&baz=bar&Foo=frob&baz=bar2", -1, "&",
     * G_URI_PARAMS_NONE);
     * while (g_uri_params_iter_next (&iter, &unowned_attr, &unowned_value, &error))
     *   {
     *     g_autofree gchar *attr = g_steal_pointer (&unowned_attr);
     *     g_autofree gchar *value = g_steal_pointer (&unowned_value);
     *     // do something with attr and value; this code will be called 4 times
     *     // for the params string in this example: once with attr=foo and value=bar,
     *     // then with baz/bar, then Foo/frob, then baz/bar2.
     *   }
     * if (error)
     *   // handle parsing error
     * ]|
     *
     * @param params a `%`-encoded string containing `attribute=value`
     *   parameters
     * @param length the length of @params, or `-1` if it is nul-terminated
     * @param separators the separator byte character set between parameters. (usually
     *   `&`, but sometimes `;` or both `&;`). Note that this function works on
     *   bytes not characters, so it can't be used to delimit UTF-8 strings for
     *   anything but ASCII characters. You may pass an empty set, in which case
     *   no splitting will occur.
     * @param flags flags to modify the way the parameters are handled.
     * @since 2.66
     */
    public fun `init`(
        params: String,
        length: Long,
        separators: String,
        flags: UriParamsFlags,
    ): Unit =
        g_uri_params_iter_init(
            glibUriParamsIterPointer.reinterpret(),
            params,
            length,
            separators,
            flags.mask
        )

    public companion object : RecordCompanion<UriParamsIter, GUriParamsIter> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): UriParamsIter =
            UriParamsIter(pointer.reinterpret())
    }
}
