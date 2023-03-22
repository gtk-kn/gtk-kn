package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.MemberName

/**
 * Blueprint for a class constructor.
 *
 * While typically Kotlin constructors have no name, the [kotlinName] property is generated
 * for use as companion factory methods.
 *
 * @property kotlinName kotlin method name for use as companion object factory method.
 * @property nativeName native function name to call.
 * @property nativeMemberName KP MemberName for the native function.
 * @property returnTypeInfo typeInfo of the return type.
 * @property parameters list of parameter blueprints
 * @property kdoc the KDoc of the constructor
 * @property returnTypeKDoc the KDoc of the return type
 */
data class ConstructorBlueprint(
    val kotlinName: String,
    val nativeName: String,
    val nativeMemberName: MemberName, // not enum member, but the KP reference to the native function name
    val returnTypeInfo: TypeInfo,
    val parameters: List<ParameterBlueprint>,
    val kdoc: String?,
    val returnTypeKDoc: String?,
)
