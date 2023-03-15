package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.TypeName

data class ImplementsInterfaceBlueprint(
    val interfaceTypeName: TypeName,
    val interfacePointerTypeName: TypeName,
    val interfacePointerName: String,
)
