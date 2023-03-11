package org.gtkkn.gir.model

/**
 * Documentation of elements.
 *
 * @property docVersion version of the documentation.
 * @property docStability give the stability of the documentation.
 * @property doc documentation of an element.
 * @property docDeprecated deprecated documentation of an element. Kept for historical reasons in general.
 * @property sourcePosition position of the documentation in the original source code.
 */
data class GirDocElements(
    val docVersion: GirDocVersion?,
    val docStability: GirDocStability?,
    val doc: GirDoc?,
    val docDeprecated: GirDocDeprecated?,
    val sourcePosition: GirSourcePosition?,
)
