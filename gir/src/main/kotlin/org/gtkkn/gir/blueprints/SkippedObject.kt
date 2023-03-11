package org.gtkkn.gir.blueprints

/**
 * Container class for encapsulating information about a skipped object.
 */
data class SkippedObject(
    val objectType: String,
    val objectName: String,
    val reason: String
) {
    /**
     * Build a user readable message with support for overriding the length of the object and type names
     * so they can be nicely formatted when printing a list of these objects
     */
    fun fullMessage(
        objectNameLength: Int = objectName.length,
        objectTypeLength: Int = objectType.length,
    ): String =
        "Skipped ${objectType.padEnd(objectTypeLength, ' ')}\t${objectName.padEnd(objectNameLength, ' ')}\t($reason)"
}