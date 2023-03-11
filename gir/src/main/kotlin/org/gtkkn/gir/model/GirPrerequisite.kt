package org.gtkkn.gir.model

/**
 * Interface which is pre-required to implement another interface.
 *
 * This node is generally using within an interface element.
 *
 * @property name name of the required prerequisite class or interface.
 */
data class GirPrerequisite(
    val name: String,
)
