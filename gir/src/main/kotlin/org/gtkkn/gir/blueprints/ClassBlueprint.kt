package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.TypeName

data class ClassBlueprint(
    val kotlinName: String,
    val nativeName: String,
    val typeName: TypeName,
    val parentTypeName: TypeName?,
    val implementsInterfaces: List<TypeName>,
    val methods: List<MethodBlueprint>,
    val skippedObjects: List<SkippedObject>,
)
