package org.gtkkn.gir.model

/**
 * Return value of a callable.
 *
 * @property introspectable true if the element is introspectable. It doesn't exist in the bindings, due in general to
 *                          missing information in the annotations in the original C code.
 * @property nullable true if the parameter can have a null value.
 * @property closure the parameter is a user_data for callbacks. The value points to a different parameter that is the
 *                   actual callback.
 * @property scope indicates the lifetime of the call.
 * @property destroy the parameter is a destroy_data for callbacks. The value points to a different parameter that is
 *                   the actual callback.
 * @property skip true if the parameter can be omitted from the introspected output.
 * @property allowNone deprecated. Replaced by nullable and optional.
 * @property transferOwnership an [GirTransferOwnership].
 * @property type a [GirAnyTypeOrVarargs].
 * @property docs a [GirDocElements].
 */
data class GirReturnValue(
    val introspectable: Boolean?,
    val nullable: Boolean?,
    val closure: Int?,
    val scope: GirScope?,
    val destroy: Int?,
    val skip: Boolean?,
    val allowNone: Boolean?,
    val transferOwnership: GirTransferOwnership?,
    val type: GirAnyType,
    val docs: GirDocElements,
)
