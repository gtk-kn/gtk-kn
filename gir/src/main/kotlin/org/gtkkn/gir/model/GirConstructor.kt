package org.gtkkn.gir.model

/**
 * A constructor of a class.
 *
 * @property info a [GirInfo] that a constructor can contain.
 * @property name name of the constructor.
 * @property cIdentifier C identifier in the source code of the constructor.
 * @property shadowedBy constructor it is shadowed by. For example, in C++, only one version of an overloaded callable
 *                      will appear.
 * @property shadows constructor it shadows. For example, in C++, only one version of an overloaded callable will
 *                   appear.
 * @property throws true if the constructor can throw an error.
 * @property movedTo if for backward compatibility reason the constructor has a name in the source code but should be
 *                   known by another one, this attribute contains the new name.
 * @property parameters a [GirParameters] that a constructor can contain.
 * @property returnValue a [GirReturnValue] that a constructor can contain.
 */
data class GirConstructor(
    val info: GirInfo,
    // constructor.attrs
    val name: String,
    val cIdentifier: String?,
    val shadowedBy: String?,
    val shadows: String?,
    val throws: Boolean?,
    val movedTo: String?,
    val parameters: GirParameters?,
    val returnValue: GirReturnValue?,
)
