package org.gtkkn.gir.model

data class GirDoc(
    val preserveSpace: Boolean,
    val preserveWhitespace: Boolean,
    val text: String,
    val filename: String,
    val line: String,
    val column: String?,
)
