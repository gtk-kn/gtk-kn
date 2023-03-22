package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.TypeName

data class ClassBlueprint(
    val kotlinName: String,
    val nativeName: String,
    val typeName: ClassName,
    val parentTypeName: TypeName?,
    val implementsInterfaces: List<ImplementsInterfaceBlueprint>,
    val methods: List<MethodBlueprint>,
    val constructors: List<ConstructorBlueprint>,
    val skippedObjects: List<SkippedObject>,
    val objectPointerName: String,
    val objectPointerTypeName: TypeName,
    val kdoc: String?,
) {
    val hasParent: Boolean get() = parentTypeName != null
}
