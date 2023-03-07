package org.gtkkn.gir.model

/**
 * Instance-parameter is a parameter of a C function which is an instance of an existing object.
 *
 * So the callable is surely a method of a class, and this parameter points to the instance of the object. In C++,
 * this would be equivalent to the pointer this which is not passed to the method, in Python it's equivalent to self.
 *
 * @property name name of the instance-parameter.
 * @property nullable true if the instance-parameter can have a null value.
 * @property allowNone deprecated. Replaced by nullable and optional.
 * @property direction direction of the instance-parameter.
 * @property callerAllocates true if the caller should allocate the instance-parameter before calling the callable.
 * @property transferOwnership an [GirTransferOwnership].
 * @property type a [GirAnyTypeOrVarargs].
 * @property docs a [GirDocElements].
 */
data class GirInstanceParameter(
    val name: String,
    val nullable: Boolean?,
    val allowNone: Boolean?,
    val direction: GirDirection?,
    val callerAllocates: Boolean?,
    val transferOwnership: GirTransferOwnership?,
    val type: GirType,
    val docs: GirDocElements,
)
