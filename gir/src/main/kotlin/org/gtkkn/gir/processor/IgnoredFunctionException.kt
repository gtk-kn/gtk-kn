package org.gtkkn.gir.processor

/**
 * Exception thrown during gir processing when a function should be ignored.
 */
class IgnoredFunctionException(cFunctionName: String) : BlueprintException("C function $cFunctionName is ignored")

