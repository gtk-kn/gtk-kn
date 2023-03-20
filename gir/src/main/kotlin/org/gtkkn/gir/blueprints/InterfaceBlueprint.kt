package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.TypeName
import sun.misc.Signal

data class InterfaceBlueprint(
    val kotlinName: String,
    val nativeName: String,
    val typeName: ClassName,
    val methods: List<MethodBlueprint>,
    val signals: List<SignalBlueprint>,
    val skippedObjects: List<SkippedObject>,
    val objectPointerName: String,
    val objectPointerTypeName: TypeName,
)
