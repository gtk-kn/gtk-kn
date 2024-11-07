// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_26
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.webkit.WebKitGeolocationPosition
import org.gtkkn.native.webkit.webkit_geolocation_position_copy
import org.gtkkn.native.webkit.webkit_geolocation_position_free
import org.gtkkn.native.webkit.webkit_geolocation_position_new
import org.gtkkn.native.webkit.webkit_geolocation_position_set_altitude
import org.gtkkn.native.webkit.webkit_geolocation_position_set_altitude_accuracy
import org.gtkkn.native.webkit.webkit_geolocation_position_set_heading
import org.gtkkn.native.webkit.webkit_geolocation_position_set_speed
import org.gtkkn.native.webkit.webkit_geolocation_position_set_timestamp
import kotlin.Double
import kotlin.ULong
import kotlin.Unit

/**
 * An opaque struct to provide position updates to a #WebKitGeolocationManager.
 *
 * WebKitGeolocationPosition is an opaque struct used to provide position updates to a
 * #WebKitGeolocationManager using webkit_geolocation_manager_update_position().
 * @since 2.26
 */
@WebKitVersion2_26
public class GeolocationPosition(
    pointer: CPointer<WebKitGeolocationPosition>,
) : Record {
    public val webkitGeolocationPositionPointer: CPointer<WebKitGeolocationPosition> = pointer

    /**
     * Make a copy of the #WebKitGeolocationPosition.
     *
     * @return a copy of @position
     * @since 2.26
     */
    @WebKitVersion2_26
    public fun copy(): GeolocationPosition =
        webkit_geolocation_position_copy(webkitGeolocationPositionPointer.reinterpret())!!.run {
            GeolocationPosition(reinterpret())
        }

    /**
     * Free the #WebKitGeolocationPosition
     *
     * @since 2.26
     */
    @WebKitVersion2_26
    public fun free(): Unit = webkit_geolocation_position_free(webkitGeolocationPositionPointer.reinterpret())

    /**
     * Set the @position altitude.
     *
     * @param altitude altitude in meters
     * @since 2.26
     */
    @WebKitVersion2_26
    public fun setAltitude(altitude: Double): Unit =
        webkit_geolocation_position_set_altitude(webkitGeolocationPositionPointer.reinterpret(), altitude)

    /**
     * Set the accuracy of @position altitude.
     *
     * @param altitudeAccuracy accuracy of position altitude in meters
     * @since 2.26
     */
    @WebKitVersion2_26
    public fun setAltitudeAccuracy(altitudeAccuracy: Double): Unit =
        webkit_geolocation_position_set_altitude_accuracy(
            webkitGeolocationPositionPointer.reinterpret(),
            altitudeAccuracy
        )

    /**
     * Set the @position heading.
     *
     * Set the @position heading, as a positive angle between the direction of movement and the North
     * direction, in clockwise direction.
     *
     * @param heading heading in degrees
     * @since 2.26
     */
    @WebKitVersion2_26
    public fun setHeading(heading: Double): Unit =
        webkit_geolocation_position_set_heading(webkitGeolocationPositionPointer.reinterpret(), heading)

    /**
     * Set the @position speed.
     *
     * @param speed speed in meters per second
     * @since 2.26
     */
    @WebKitVersion2_26
    public fun setSpeed(speed: Double): Unit =
        webkit_geolocation_position_set_speed(webkitGeolocationPositionPointer.reinterpret(), speed)

    /**
     * Set the @position timestamp.
     *
     * By default it's the time when the @position was created.
     *
     * @param timestamp timestamp in seconds since the epoch, or 0 to use current time
     * @since 2.26
     */
    @WebKitVersion2_26
    public fun setTimestamp(timestamp: ULong): Unit =
        webkit_geolocation_position_set_timestamp(webkitGeolocationPositionPointer.reinterpret(), timestamp)

    public companion object : RecordCompanion<GeolocationPosition, WebKitGeolocationPosition> {
        /**
         * Create a new #WebKitGeolocationPosition.
         *
         * @param latitude a valid latitude in degrees
         * @param longitude a valid longitude in degrees
         * @param accuracy accuracy of location in meters
         * @return a newly created #WebKitGeolocationPosition
         * @since 2.26
         */
        public fun new(
            latitude: Double,
            longitude: Double,
            accuracy: Double,
        ): GeolocationPosition =
            GeolocationPosition(webkit_geolocation_position_new(latitude, longitude, accuracy)!!.reinterpret())

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): GeolocationPosition =
            GeolocationPosition(pointer.reinterpret())
    }
}
