package org.gtkkn.gir.processor

/**
 * Exception thrown during gir processing when a type should be ignored.
 */
class IgnoredTypeException(cType: String) : BlueprintException("C Type $cType is ignored")
