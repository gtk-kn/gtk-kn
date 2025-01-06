// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.annotations.GLibVersion2_12
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.glib.GTimeVal
import org.gtkkn.native.glib.g_time_val_add
import org.gtkkn.native.glib.g_time_val_from_iso8601
import org.gtkkn.native.glib.g_time_val_to_iso8601
import org.gtkkn.native.glib.glong
import kotlin.Boolean
import kotlin.Pair
import kotlin.String
import kotlin.Unit
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * Represents a precise time, with seconds and microseconds.
 *
 * Similar to the struct timeval returned by the `gettimeofday()`
 * UNIX system call.
 *
 * GLib is attempting to unify around the use of 64-bit integers to
 * represent microsecond-precision time. As such, this type will be
 * removed from a future version of GLib. A consequence of using `glong` for
 * `tv_sec` is that on 32-bit systems `GTimeVal` is subject to the year 2038
 * problem.
 */
public class TimeVal(pointer: CPointer<GTimeVal>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val gPointer: CPointer<GTimeVal> = pointer

    /**
     * seconds
     */
    public var tvSec: glong
        get() = gPointer.pointed.tv_sec

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.tv_sec = value
        }

    /**
     * microseconds
     */
    public var tvUsec: glong
        get() = gPointer.pointed.tv_usec

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.tv_usec = value
        }

    /**
     * Allocate a new TimeVal.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GTimeVal>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to TimeVal and a [Cleaner] instance.
     */
    private constructor(pair: Pair<CPointer<GTimeVal>, Cleaner>) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new TimeVal using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GTimeVal>().ptr)

    /**
     * Allocate a new TimeVal.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param tvSec seconds
     * @param tvUsec microseconds
     */
    public constructor(tvSec: glong, tvUsec: glong) : this() {
        this.tvSec = tvSec
        this.tvUsec = tvUsec
    }

    /**
     * Allocate a new TimeVal using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param tvSec seconds
     * @param tvUsec microseconds
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        tvSec: glong,
        tvUsec: glong,
        scope: AutofreeScope,
    ) : this(scope) {
        this.tvSec = tvSec
        this.tvUsec = tvUsec
    }

    /**
     * Adds the given number of microseconds to @time_. @microseconds can
     * also be negative to decrease the value of @time_.
     *
     * @param microseconds number of microseconds to add to @time
     */
    public fun add(microseconds: glong): Unit = g_time_val_add(gPointer.reinterpret(), microseconds)

    /**
     * Converts @time_ into an RFC 3339 encoded string, relative to the
     * Coordinated Universal Time (UTC). This is one of the many formats
     * allowed by ISO 8601.
     *
     * ISO 8601 allows a large number of date/time formats, with or without
     * punctuation and optional elements. The format returned by this function
     * is a complete date and time, with optional punctuation included, the
     * UTC time zone represented as "Z", and the @tv_usec part included if
     * and only if it is nonzero, i.e. either
     * "YYYY-MM-DDTHH:MM:SSZ" or "YYYY-MM-DDTHH:MM:SS.fffffZ".
     *
     * This corresponds to the Internet date/time format defined by
     * [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt),
     * and to either of the two most-precise formats defined by
     * the W3C Note
     * [Date and Time Formats](http://www.w3.org/TR/NOTE-datetime-19980827).
     * Both of these documents are profiles of ISO 8601.
     *
     * Use g_date_time_format() or g_strdup_printf() if a different
     * variation of ISO 8601 format is required.
     *
     * If @time_ represents a date which is too large to fit into a `struct tm`,
     * null will be returned. This is platform dependent. Note also that since
     * `GTimeVal` stores the number of seconds as a `glong`, on 32-bit systems it
     * is subject to the year 2038 problem. Accordingly, since GLib 2.62, this
     * function has been deprecated. Equivalent functionality is available using:
     * |[
     * GDateTime *dt = g_date_time_new_from_unix_utc (time_val);
     * iso8601_string = g_date_time_format_iso8601 (dt);
     * g_date_time_unref (dt);
     * ]|
     *
     * The return value of g_time_val_to_iso8601() has been nullable since GLib
     * 2.54; before then, GLib would crash under the same conditions.
     *
     * @return a newly allocated string containing an ISO 8601 date,
     *    or null if @time_ was too large
     * @since 2.12
     */
    @GLibVersion2_12
    public fun toIso8601(): String? = g_time_val_to_iso8601(gPointer.reinterpret())?.toKString()

    override fun toString(): String = "TimeVal(tvSec=$tvSec, tvUsec=$tvUsec)"

    public companion object {
        /**
         * Converts a string containing an ISO 8601 encoded date and time
         * to a #GTimeVal and puts it into @time_.
         *
         * @iso_date must include year, month, day, hours, minutes, and
         * seconds. It can optionally include fractions of a second and a time
         * zone indicator. (In the absence of any time zone indication, the
         * timestamp is assumed to be in local time.)
         *
         * Any leading or trailing space in @iso_date is ignored.
         *
         * This function was deprecated, along with #GTimeVal itself, in GLib 2.62.
         * Equivalent functionality is available using code like:
         * |[
         * GDateTime *dt = g_date_time_new_from_iso8601 (iso8601_string, NULL);
         * gint64 time_val = g_date_time_to_unix (dt);
         * g_date_time_unref (dt);
         * ]|
         *
         * @param isoDate an ISO 8601 encoded date string
         * @param time a #GTimeVal
         * @return true if the conversion was successful.
         * @since 2.12
         */
        @GLibVersion2_12
        public fun fromIso8601(isoDate: String, time: TimeVal): Boolean =
            g_time_val_from_iso8601(isoDate, time.gPointer.reinterpret()).asBoolean()
    }
}
