package org.gtkkn.common

public fun Int.asBoolean(): Boolean = this > 0

public fun Boolean.asGBoolean(): Int = if (this) 1 else 0
