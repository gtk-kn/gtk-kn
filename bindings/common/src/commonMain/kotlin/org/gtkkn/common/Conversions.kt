package org.gtkkn.common

public inline fun Int.asBoolean(): Boolean = this > 0

public inline fun Boolean.asGBoolean(): Int = if (this) 1 else 0
