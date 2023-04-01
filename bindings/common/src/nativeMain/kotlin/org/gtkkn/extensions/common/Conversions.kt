package org.gtkkn.extensions.common

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CArrayPointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.CPointerVarOf
import kotlinx.cinterop.MemScope
import kotlinx.cinterop.allocArrayOf
import kotlinx.cinterop.cstr
import kotlinx.cinterop.get
import kotlinx.cinterop.toKString

public fun Int.asBoolean(): Boolean = this > 0

public fun Boolean.asGBoolean(): Int = if (this) 1 else 0

/**
 * Convert a Kotlin [List<String>] into its native equivalent.
 */
public fun List<String>.toCStringList(scope: MemScope): CArrayPointer<CPointerVarOf<CPointer<ByteVar>>> = with(scope) {
    return allocArrayOf(this@toCStringList.map { it.cstr.getPointer(this) } + null)
}

/**
 * Convert a native char** into a Kotlin [List<String>].
 */
public fun CArrayPointer<CPointerVarOf<CPointer<ByteVar>>>.toKStringList(): List<String> = buildList {
    var i = 0
    while (this@toKStringList[i] != null) {
        add(this@toKStringList[i]!!.toKString())
        i++
    }
}
