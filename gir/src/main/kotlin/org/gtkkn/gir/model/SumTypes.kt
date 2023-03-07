package org.gtkkn.gir.model

/**
 * A sealed interface to represent either a [GirCallback] or a  [GirAnyType]
 */
sealed interface GirCallbackOrAnyType

/**
 * A sealed interface to represent either a [GirAnyType] or a  [GirVarArgs]
 */
sealed interface GirAnyTypeOrVarargs

/**
 * A sealed interface to represent either a [GirType] or a  [GirArrayType]
 */
sealed interface GirAnyType : GirAnyTypeOrVarargs, GirCallbackOrAnyType
