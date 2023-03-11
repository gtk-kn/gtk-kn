package org.gtkkn.gir.model

/**
 * A sealed interface to represent either a [GirType] or a  [GirArrayType]
 */
sealed interface GirAnyType : GirAnyTypeOrVarargs, GirCallbackOrAnyType
