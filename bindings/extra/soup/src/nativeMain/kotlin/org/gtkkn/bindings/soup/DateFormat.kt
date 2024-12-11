// This is a generated file. Do not modify.
package org.gtkkn.bindings.soup

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.soup.SoupDateFormat
import org.gtkkn.native.soup.soup_date_format_get_type

/**
 * Date formats that [func@date_time_to_string] can use.
 *
 * @SOUP_DATE_HTTP and @SOUP_DATE_COOKIE always coerce the time to
 * UTC.
 *
 * This enum may be extended with more values in future releases.
 */
public enum class DateFormat(public val nativeValue: SoupDateFormat) {
    /**
     * RFC 1123 format, used by the HTTP "Date" header. Eg
     *   "Sun, 06 Nov 1994 08:49:37 GMT".
     */
    HTTP(SoupDateFormat.SOUP_DATE_HTTP),

    /**
     * The format for the "Expires" timestamp in the
     *   Netscape cookie specification. Eg, "Sun, 06-Nov-1994 08:49:37 GMT".
     */
    COOKIE(SoupDateFormat.SOUP_DATE_COOKIE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: SoupDateFormat): DateFormat = when (nativeValue) {
            SoupDateFormat.SOUP_DATE_HTTP -> HTTP
            SoupDateFormat.SOUP_DATE_COOKIE -> COOKIE
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of DateFormat
         *
         * @return the GType
         */
        public fun getType(): GType = soup_date_format_get_type()
    }
}
