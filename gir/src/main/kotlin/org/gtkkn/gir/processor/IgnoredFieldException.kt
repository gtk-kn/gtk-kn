package org.gtkkn.gir.processor

/**
 * Exception thrown during gir processing when a record field should be ignored.
 */
class IgnoredFieldException(fieldName: String, reason: String = "ignored") : BlueprintException(
    "Record field $fieldName is $reason"
)
