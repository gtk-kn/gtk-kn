package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.LambdaTypeName

interface ClosureBlueprint : CallableBlueprint {
    val lambdaTypeName: LambdaTypeName
    val hasInstanceParameter: Boolean
}
