package org.gtkkn.gir.model

/**
 * A callback closure, that is a function called when a signal is emitted (as an answer to that signal).
 *
 * @property info a [GirInfo] that a callback can contain.
 * @property name name of the callback.
 * @property cType the C type returned by the callback closure (i.e. function).
 * @property throws true if the callback can throw an error.
 * @property parameters a [GirParameters] that a callback can contain.
 * @property returnValue a [GirReturnValue] that a callback can contain.
 */
data class GirCallback(
    val info: GirInfo,
    val name: String,
    val cType: String?,
    val throws: Boolean?,
    val parameters: GirParameters?,
    val returnValue: GirReturnValue?,
) : GirCallbackOrAnyType
