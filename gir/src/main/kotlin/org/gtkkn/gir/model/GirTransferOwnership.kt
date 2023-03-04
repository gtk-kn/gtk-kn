package org.gtkkn.gir.model

enum class GirTransferOwnership {
    None,
    Container,
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
