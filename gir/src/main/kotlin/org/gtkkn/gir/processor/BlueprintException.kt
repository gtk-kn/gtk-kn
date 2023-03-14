package org.gtkkn.gir.processor

/**
 * An Exception base class for all exceptions that can be thrown during Phase 2 blueprint building.
 */
open class BlueprintException(message: String) : Exception(message) {
    override val message: String = message
}
