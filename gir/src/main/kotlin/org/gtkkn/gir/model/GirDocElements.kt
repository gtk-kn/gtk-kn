package org.gtkkn.gir.model

data class GirDocElements(
    val docVersion: GirDocVersion?,
    val docStability: GirDocStability?,
    val docDeprecated: GirDocDeprecated?,
    val doc: GirDoc?,
    val sourcePosition: GirSourcePosition?,
)
