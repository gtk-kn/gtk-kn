package org.gtkkn.gir.processor

/**
 * Exception thrown during gir processing when a type is not introspectable.
 */
class NotIntrospectableException(val objectName: String) : BlueprintException("$objectName is not introspectable")
