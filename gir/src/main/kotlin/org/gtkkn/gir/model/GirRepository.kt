package org.gtkkn.gir.model

/**
 * Root node of a GIR repository.
 *
 * It contains  namespaces, which can in turn be implemented in several libraries.
 *
 * @property version version number of the repository.
 * @property cIdentifierPrefixes prefixes to filter out from C identifiers for data structures and types. For example,
 *                               GtkWindow will be Window. If c:symbol-prefixes is not used, then this element is used
 *                               for both.
 * @property cSymbolPrefixes prefixes to filter out from C functions. For example, gtk_window_new will lose gtk_.
 * @property includes a list of [GirInclude] that a repository can contain.
 * @property cIncludes a list of [GirCInclude] that a repository can contain.
 * @property packages a list of [GirPackage] that a repository can contain.
 * @property namespace a list of [GirNamespace] that a repository can contain.
 */
data class GirRepository(
    val version: String,
    val cIdentifierPrefixes: String?,
    val cSymbolPrefixes: String?,
    val includes: List<GirInclude>,
    val cIncludes: List<GirCInclude>,
    val packages: List<GirPackage>,
    val namespace: GirNamespace,
)
