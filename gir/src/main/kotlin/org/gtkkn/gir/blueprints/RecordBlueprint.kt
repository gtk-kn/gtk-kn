package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.TypeName

data class RecordBlueprint(
    val kotlinName: String,
    val kotlinTypeName: ClassName,
    val objectPointerTypeName: TypeName,
    val objectPointerName: String,
    val constructors: List<ConstructorBlueprint>,
    val functions: List<FunctionBlueprint>,
    val methods: List<MethodBlueprint>,
    val fields: List<FieldBlueprint>,
    val skippedObjects: List<SkippedObject>,
    val kdoc: String?,
    val version: String?,
)
