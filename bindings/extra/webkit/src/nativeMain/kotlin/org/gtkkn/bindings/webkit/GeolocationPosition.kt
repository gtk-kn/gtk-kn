// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_26
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.glib.guint64
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitGeolocationPosition
import org.gtkkn.native.webkit.webkit_geolocation_position_copy
import org.gtkkn.native.webkit.webkit_geolocation_position_free
import org.gtkkn.native.webkit.webkit_geolocation_position_get_type
import org.gtkkn.native.webkit.webkit_geolocation_position_new
import org.gtkkn.native.webkit.webkit_geolocation_position_set_altitude
import org.gtkkn.native.webkit.webkit_geolocation_position_set_altitude_accuracy
import org.gtkkn.native.webkit.webkit_geolocation_position_set_heading
import org.gtkkn.native.webkit.webkit_geolocation_position_set_speed
import org.gtkkn.native.webkit.webkit_geolocation_position_set_timestamp
import kotlin.Unit

/**
 * An opaque struct to provide position updates to a #WebKitGeolocationManager.
 *
 * WebKitGeolocationPosition is an opaque struct used to provide position updates to a
 * #WebKitGeolocationManager using webkit_geolocation_manager_update_position().
 * @since 2.26
 */
@WebKitVersion2_26
public class GeolocationPosition(pointer: CPointer<WebKitGeolocationPosition>) : ProxyInstance(pointer) {
    public val gPointer: CPointer<WebKitGeolocationPosition> = pointer

    /**
     * Make a copy of the #WebKitGeolocationPosition.
     *
     * @return a copy of @position
     * @since 2.26
     */
    @WebKitVersion2_26
    public fun copy(): GeolocationPosition = webkit_geolocation_position_copy(gPointer)!!.run {
        GeolocationPosition(this)
    }

    /**
     * Free the #WebKitGeolocationPosition
     *
     * @since 2.26
     */
    @WebKitVersion2_26
    public fun free(): Unit = webkit_geolocation_position_free(gPointer)

    /**
     * Set the @position altitude.
     *
     * @param altitude altitude in meters
     * @since 2.26
     */
    @WebKitVersion2_26
    public fun setAltitude(altitude: gdouble): Unit = webkit_geolocation_position_set_altitude(gPointer, altitude)

    /**
     * Set the accuracy of @position altitude.
     *
     * @param altitudeAccuracy accuracy of position altitude in meters
     * @since 2.26
     */
    @WebKitVersion2_26
    public fun setAltitudeAccuracy(altitudeAccuracy: gdouble): Unit =
        webkit_geolocation_position_set_altitude_accuracy(gPointer, altitudeAccuracy)

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
    public fun setHeading(heading: gdouble): Unit = webkit_geolocation_position_set_heading(gPointer, heading)

    /**
     * Set the @position speed.
     *
     * @param speed speed in meters per second
     * @since 2.26
     */
    @WebKitVersion2_26
    public fun setSpeed(speed: gdouble): Unit = webkit_geolocation_position_set_speed(gPointer, speed)

    /**
     * Set the @position timestamp.
     *
     * By default it's the time when the @position was created.
     *
     * @param timestamp timestamp in seconds since the epoch, or 0 to use current time
     * @since 2.26
     */
    @WebKitVersion2_26
    public fun setTimestamp(timestamp: guint64): Unit = webkit_geolocation_position_set_timestamp(gPointer, timestamp)

    public companion object {
        /**
         * Create a new #WebKitGeolocationPosition.
         *
         * @param latitude a valid latitude in degrees
         * @param longitude a valid longitude in degrees
         * @param accuracy accuracy of location in meters
         * @return a newly created #WebKitGeolocationPosition
         * @since 2.26
         */
        public fun new(latitude: gdouble, longitude: gdouble, accuracy: gdouble): GeolocationPosition =
            GeolocationPosition(webkit_geolocation_position_new(latitude, longitude, accuracy)!!.reinterpret())

        /**
         * Get the GType of GeolocationPosition
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_geolocation_position_get_type()
    }
}
