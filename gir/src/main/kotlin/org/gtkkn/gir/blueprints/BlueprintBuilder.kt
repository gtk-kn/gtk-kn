package org.gtkkn.gir.blueprints

import org.gtkkn.gir.processor.BlueprintException
import org.gtkkn.gir.processor.ProcessorContext
import org.gtkkn.gir.processor.UnresolvableTypeException

/**
 * Abstract class for Blueprint builders that provides helper methods
 * and general structure.
 */
abstract class BlueprintBuilder<T : Any>(val context: ProcessorContext) {
    protected val skippedObjects = mutableListOf<SkippedObject>()

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
     */
    fun build(): BlueprintResult<T> = try {
        ok(buildInternal())
    } catch (ex: BlueprintException) {
        skip(ex.message)
    }

    /**
     * Implementations of this method should have all the resolution and throw [UnresolvableTypeException] logic.
     */
    @Throws(UnresolvableTypeException::class)
    protected abstract fun buildInternal(): T

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
