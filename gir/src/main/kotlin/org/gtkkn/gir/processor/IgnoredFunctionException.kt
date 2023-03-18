package org.gtkkn.gir.processor

class IgnoredFunctionException(cFunctionName: String) : BlueprintException("C function $cFunctionName is ignored")
