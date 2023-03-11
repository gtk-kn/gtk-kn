package org.gtkkn.gir.model

/**
 * A signal as defined in the  GObject system (https://docs.gtk.org/gobject/concepts.html#signals).
 *
 * @property info a [GirInfo] that a signal can contain.
 * @property name name of the signal.
 * @property detailed true if the signal has a detailed parameter
 *                    (https://docs.gtk.org/gobject/concepts.html#the-detail-argument and
 *                    https://docs.gtk.org/gobject/flags.SignalFlags.html).
 * @property when when to run the signal during the 5 steps of signal emission
 *                (https://docs.gtk.org/gobject/concepts.html#signal-emission and
 *                https://docs.gtk.org/gobject/flags.SignalFlags.html).
 * @property action true if the signal can be freely emitted on alive objects from user code.
 * @property noHooks true if no emission hooks are supported for this signal.
 * @property noRecurse true if signals emitted for an object while currently being in emission for this very object
 *                     will not be emitted recursively, but instead cause the first emission to be restarted
 *                     (https://docs.gtk.org/gobject/flags.SignalFlags.html).
 * @property emitter the emitter method for the signal.
 * @property parameters a [GirParameters] that a signal can contain.
 * @property returnValue a [GirReturnValue] that a signal can contain.
 */
data class GirSignal(
    val info: GirInfo,
    val name: String,
    val detailed: Boolean?,
    val `when`: When?,
    val action: Boolean?,
    val noHooks: Boolean?,
    val noRecurse: Boolean?,
    val emitter: String?,
    val parameters: GirParameters?,
    val returnValue: GirReturnValue?,
) {
    enum class When {
        FIRST,
        LAST,
        CLEANUP;

        companion object {
            fun fromString(str: String): When = when (str) {
                "first" -> FIRST
                "last" -> LAST
                "cleanup" -> CLEANUP
                else -> error("String '$str' is not a valid Signal When value")
            }
        }
    }
}
