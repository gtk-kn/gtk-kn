package org.gtkkn.gir.model

/**
 * Version of the documentation.
 *
 * @property preserveSpace preserve the original formatting of the documentation from the source code.
 * @property preserveWhitespace preserve the original formatting of the documentation from the source code.
 *                              Recommended to use this instead of xml:space.
 * @property text the text of the version of the documentation.
 */
data class GirDocVersion(
    val preserveSpace: Boolean,
    val preserveWhitespace: Boolean,
    val text: String,
)
