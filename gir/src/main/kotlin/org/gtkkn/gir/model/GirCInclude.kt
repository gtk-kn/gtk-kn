package org.gtkkn.gir.model

/**
 * Dependant C header file which should be included in C programs.
 *
 * @property name file name of the C header file. The path can be relative.
 */
data class GirCInclude(
    val name: String,
)
