package org.gtkkn.gir.processor

/**
 * Exception thrown during gir processing when a signal should be ignored.
 */
class IgnoredSignalException(signalName: String) : BlueprintException("Signal $signalName is ignored")
