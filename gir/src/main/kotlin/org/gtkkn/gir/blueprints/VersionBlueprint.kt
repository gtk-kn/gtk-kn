package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.ClassName

data class VersionBlueprint(
    val name: String,
    val annotationTypeName: ClassName,
)
