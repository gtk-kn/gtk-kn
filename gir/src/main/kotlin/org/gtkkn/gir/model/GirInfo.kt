package org.gtkkn.gir.model

/**
 * Container for Info.attrs which contains base information for most elements like version,
 * deprecation and stability.
 */
data class GirInfo(
    val introspectable: Boolean?,
    val deprecated: Boolean?,
    val deprecatedVersion: String?,
    val version: String?,
    val stability: String?, // Stable, Unstable, Private // TODO enum?
    val annotations: List<GirAnnotation>,
    val docs: GirDocElements,
)
