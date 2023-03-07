package org.gtkkn.gir.model

/**
 * Give the stability of the documentation.
 *
 * @property preserveSpace preserve the original formatting of the documentation from the source code.
 * @property preserveWhitespace preserve the original formatting of the documentation from the source code.
 *                              Recommended to use this instead of xml:space.
 * @property text a text value about the stability of the documentation. Usually a simple description like stable or
 *                unstable.
 */
data class GirDocStability(
    val preserveSpace: Boolean,
    val preserveWhitespace: Boolean,
    val text: String
)
