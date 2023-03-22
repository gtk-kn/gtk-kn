package org.gtkkn.gir.blueprints

/**
 * Container class for encapsulating information about a skipped object.
 *
 * @property objectType type of the object that was skipped.
 * @property objectName name of the object that was skipped.
 * @property reason reason why the object was skipped.
 * @property documented true if the skip should be documented in skipfiles or kdocs.
 */
data class SkippedObject(
    val objectType: String,
    val objectName: String,
    val reason: String,
    val documented: Boolean = true,
) {
    /**
     * Build a user readable message with support for overriding the length of the object and type names
     * so they can be nicely formatted when printing a list of these objects
     */
    fun fullMessage(
        objectNameLength: Int = objectName.length,
        objectTypeLength: Int = objectType.length,
    ): String =
        "- ${objectType.padEnd(objectTypeLength, ' ')}\t${objectName.padEnd(objectNameLength, ' ')}:\t$reason"
}
