package org.gtkkn.gir.model

/**
 * Element defining a virtual method from a class, concept similar to C++.
 *
 * @property name name of the virtual method.
 * @property cIdentifier C identifier in the source code of the virtual method.
 * @property shadowedBy virtual method it is shadowed by. For example, in C++, only one version of an overloaded
 *                      callable will appear.
 * @property shadows virtual method it shadows. For example, in C++, only one version of an overloaded callable will
 *                   appear.
 * @property throws true if the virtual method can throw an error.
 * @property movedTo if for backward compatibility reason the virtual method has a name in the source code but should be
 *                   known by another one, this attribute contains the new name.
 * @property info attributes of a Function (see [GirInfo]).
 * @property parameters a [GirParameters] that a virtual method can contain.
 * @property invoker name of the callable called when invoking this virtual method.
 * @property returnValue a [GirReturnValue] that a virtual method can contain.
 */
data class GirVirtualMethod(
    // Callable.attrs
    val name: String,
    val cIdentifier: String?,
    val shadowedBy: String?,
    val shadows: String?,
    val throws: Boolean,
    val movedTo: String?,
    val info: GirInfo,
    val parameters: GirParameters?,
    val invoker: String?,
    val returnValue: GirReturnValue?,
)
