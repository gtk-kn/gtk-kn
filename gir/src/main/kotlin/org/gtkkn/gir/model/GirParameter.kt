package org.gtkkn.gir.model

/**
 * Parameters element of a callable, that is in general parameters of a function or similar.
 *
 * @property name name of the parameter.
 * @property nullable true if the parameter can have a null value.
 * @property allowNone deprecated. Replaced by nullable and optional.
 * @property introspectable true if the element is introspectable. It doesn't exist in the bindings, due in general to
 *                          missing information in the annotations in the original C code.
 * @property closure the parameter is a user_data for callbacks. The value points to a different parameter that is the
 *                   actual callback.
 * @property destroy the parameter is a destroy_data for callbacks. The value points to a different parameter that is
 *                   the actual callback.
 * @property scope indicates the lifetime of the call.
 * @property direction direction of the parameter.
 * @property callerAllocates true if the caller should allocate the parameter before calling the callable.
 * @property optional true if the parameter is optional.
 * @property skip true if the parameter can be omitted from the introspected output.
 * @property transferOwnership an [GirTransferOwnership].
 * @property docs a [GirDocElements].
 * @property type a [GirAnyTypeOrVarargs].
 */
data class GirParameter(
    val name: String,
    val nullable: Boolean?,
    val allowNone: Boolean?,
    val introspectable: Boolean?,
    val closure: Int?,
    val destroy: Int?,
    val scope: GirScope?,
    val direction: GirDirection?,
    val callerAllocates: Boolean?,
    val optional: Boolean?,
    val skip: Boolean?,
    val transferOwnership: GirTransferOwnership?,
    val docs: GirDocElements,
    val type: GirAnyTypeOrVarargs,
)
