package org.gtkkn.gir.model

/**
 * Enum used by many elements for the transfer of ownership, with for example, a returned value.
 */
enum class GirTransferOwnership {
    /**
     * The recipient does not own the value.
     */
    NONE,

    /**
     * The recipient owns the container but not the value (for arrays or lists for example).
     */
    CONTAINER,

    /**
     * Te recipient owns the entire value. For details, see
     * https://gi.readthedocs.io/en/latest/annotations/giannotations.html#memory-and-lifecycle-management.
     */
    FULL,
    ;

    companion object {
        fun fromString(str: String): GirTransferOwnership = when (str) {
            "none" -> NONE
            "container" -> CONTAINER
            "full" -> FULL
            else -> error("String '$str' is not a valid TransferOwnership value")
        }
    }
}
