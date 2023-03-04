package org.gtkkn.gir.model

data class GirRepository(
    val version: String,
    val cIdentifierPrefixes: String?,
    val cSymbolPrefixes: String?,
    val includes: List<GirInclude>,
    val cIncludes: List<GirCInclude>,
    val packages: List<GirPackage>,
    val namespace: GirNamespace,
)
