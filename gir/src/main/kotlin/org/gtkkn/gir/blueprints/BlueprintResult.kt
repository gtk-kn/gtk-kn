package org.gtkkn.gir.blueprints

/**
 * Result type that for Blueprint builders.
 *
 * A blueprint build can either return a succesfully built blueprint
 * or a [SkippedObject] encapsulating the object and the reason why it was skipped.
 */
sealed class BlueprintResult<T : Any> {
    data class Ok<T : Any>(val blueprint: T) : BlueprintResult<T>()
    data class Skip<T : Any>(val skippedObject: SkippedObject) : BlueprintResult<T>()
}
