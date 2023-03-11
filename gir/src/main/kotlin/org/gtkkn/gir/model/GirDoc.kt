package org.gtkkn.gir.model

/**
 * Documentation of an element.
 *
 * @property preserveSpace preserve the original formatting of the documentation from the source code.
 * @property preserveWhitespace keep the whitespace as they were in the source code.
 * @property filename the file containing this documentation.
 * @property line the first line of the documentation in the source code.
 * @property column the first column of the documentation in the source code.
 * @property text the text of the documentation.
 */
data class GirDoc(
    val preserveSpace: Boolean,
    val preserveWhitespace: Boolean,
    val filename: String,
    val line: String,
    val column: String?,
    val text: String,
)
