package org.gtkkn.gir.blueprints

import org.gtkkn.gir.log.logger
import org.gtkkn.gir.processor.BlueprintException
import org.gtkkn.gir.processor.NotIntrospectableException
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
    } catch (ex: NotIntrospectableException) {
        logger.debug("Skipping not introspectable object: ${ex.objectName}")
        skip(ex.message, documented = false)
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
    private fun skip(reason: String, documented: Boolean = false): BlueprintResult.Skip<T> =
        BlueprintResult.Skip(
            SkippedObject(
                objectType = blueprintObjectType(),
                objectName = blueprintObjectName(),
                reason = reason,
                documented = documented,
            ),
        )

    /**
     * Utility method for returning a successful blueprint.
     */
    private fun ok(obj: T) = BlueprintResult.Ok(obj)
}
