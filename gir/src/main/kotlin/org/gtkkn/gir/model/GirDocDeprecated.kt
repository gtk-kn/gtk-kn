package org.gtkkn.gir.model

/**
 * Deprecated documentation of an element. Kept for historical reasons in general.
 *
 * @property preserveSpace preserve the original formatting of the documentation from the source code.
 * @property preserveWhitespace keep the whitespace as they were in the source code.
 * @property text text of the deprecated documentation.
 */
data class GirDocDeprecated(
    val preserveSpace: Boolean,
    val preserveWhitespace: Boolean,
    val text: String,
)
