package org.gtkkn.gir.model

/**
 * Element defining a standalone function (as usual in most programming languages).
 *
 * @property info attributes of a Function (see [GirInfo]).
 * @property name name of the function.
 * @property cIdentifier C identifier in the source code of the function.
 * @property shadowedBy function it is shadowed by. For example, in C++, only one version of an overloaded callable
 *                      will appear.
 * @property shadows function it shadows. For example, in C++, only one version of an overloaded callable will
 *                   appear.
 * @property throws true if the function can throw an error.
 * @property movedTo if for backward compatibility reason the function has a name in the source code but should be
 *                   known by another one, this attribute contains the new name.
 * @property parameters a [GirParameters] that a function can contain.
 * @property returnValue a [GirReturnValue] that a function can contain.
 * @property docs a [GirDocElements].
 */
data class GirFunction(
    val info: GirInfo,
    // Callable.attrs
    val name: String,
    val cIdentifier: String?,
    val shadowedBy: String?,
    val shadows: String?,
    val throws: Boolean,
    val movedTo: String?,
    val parameters: GirParameters?,
    val returnValue: GirReturnValue?,
    val docs: GirDocElements,
)
