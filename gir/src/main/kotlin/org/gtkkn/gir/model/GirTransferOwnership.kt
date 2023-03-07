package org.gtkkn.gir.model

/**
 * Enum used by many elements for the transfer of ownership, with for example, a returned value.
 */
enum class GirTransferOwnership {
    /**
     * The recipient does not own the value.
     */
    None,

    /**
     * The recipient owns the container but not the value (for arrays or lists for example).
     */
    Container,

    /**
     * Te recipient owns the entire value. For details, see
     * https://gi.readthedocs.io/en/latest/annotations/giannotations.html#memory-and-lifecycle-management.
     */
    Full;

    companion object {
        fun fromString(str: String): GirTransferOwnership = when (str) {
            "none" -> None
            "container" -> Container
            "full" -> Full
            else -> throw IllegalArgumentException("String '$str' is not a valid TransferOwnership value")
        }
    }
}
