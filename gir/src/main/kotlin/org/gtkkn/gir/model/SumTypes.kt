package org.gtkkn.gir.model

sealed interface GirCallbackOrAnyType

sealed interface GirAnyTypeOrVarargs

sealed interface GirAnyType : GirAnyTypeOrVarargs, GirCallbackOrAnyType
