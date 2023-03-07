package org.gtkkn.gir.model

/**
 * Position of the documentation in the original source code.
 *
 * @property filename file name of the source of the documentation.
 * @property line the first line of the documentation in the source code.
 * @property column the first column of the documentation in the source code.
 */
data class GirSourcePosition(
    val filename: String,
    val line: String,
    val column: String?,
)
