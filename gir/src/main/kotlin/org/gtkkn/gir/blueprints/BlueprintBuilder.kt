package org.gtkkn.gir.blueprints

import org.gtkkn.gir.processor.ProcessorContext

/**
 * Abstract class for Blueprint builders that provides helper methods
 * and general structure.
 */
abstract class BlueprintBuilder<T : Any>(val context: ProcessorContext) {

    /**
     * Return the type of object this blueprint is for.
     */
    abstract fun blueprintObjectType(): String

    /**
     * Return the name of the object this blueprint is for.
     */
    abstract fun blueprintObjectName(): String

    /**
     * Main build method.
     *
     * Implementations of this method should have all the resolution and skip logic.
     */
    abstract fun build(): BlueprintResult<T>

    /**
     * Utility method for returning a SkippedObject.
     */
    fun skip(reason: String): BlueprintResult.Skip<T> =
        BlueprintResult.Skip(SkippedObject(blueprintObjectType(), blueprintObjectName(), reason))

    /**
     * Utility method for returning a successful blueprint.
     */
    fun ok(obj: T) = BlueprintResult.Ok(obj)
}
