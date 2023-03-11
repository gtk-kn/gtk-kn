package org.gtkkn.gir.blueprints

/**
 * Container class for encapsulating information about a skipped object.
 */
data class SkippedObject(
    val objectType: String,
    val objectName: String,
    val reason: String
)
