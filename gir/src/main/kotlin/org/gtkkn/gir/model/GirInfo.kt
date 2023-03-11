package org.gtkkn.gir.model

/**
 * Container for Info.attrs which contains base information for most elements like version, deprecation and stability.
 *
 * @property introspectable true if the element is introspectable. It doesn't exist in the bindings, due in general to
 *                          missing information in the annotations in the original C code.
 * @property deprecated true if the element has been deprecated.
 * @property deprecatedVersion version number from which this element is deprecated.
 * @property version version number of an element.
 * @property stability give the stability status of the element. Can take the values "Stable", "Unstable" or "Private"
 * @property annotations a list of [GirAnnotation].
 * @property docs a [GirDocElements].
 */
data class GirInfo(
    val introspectable: Boolean?,
    val deprecated: Boolean?,
    val deprecatedVersion: String?,
    val version: String?,
    val stability: Stability?,
    val annotations: List<GirAnnotation>,
    val docs: GirDocElements,
) {
    enum class Stability {
        STABLE,
        UNSTABLE,
        PRIVATE;

        companion object {
            fun fromString(str: String): Stability = when (str) {
                "Stable" -> STABLE
                "Unstable" -> UNSTABLE
                "Private" -> PRIVATE
                else -> error("String '$str' is not a valid Stability value")
            }
        }
    }
}
