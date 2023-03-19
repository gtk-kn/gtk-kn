package org.gtkkn.gir.processor

/**
 * Exception thrown during gir processing when a type could not be resolved.
 */
class UnresolvableTypeException(reason: String) : BlueprintException(reason)
