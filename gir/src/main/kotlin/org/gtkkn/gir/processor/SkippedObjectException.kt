package org.gtkkn.gir.processor

import org.gtkkn.gir.blueprints.SkippedObject

class SkippedObjectException(val skippedObject: SkippedObject) : BlueprintException(
    "Skipped object: ${skippedObject.objectName}: ${skippedObject.reason}",
)
