/*
 * Copyright (c) 2024 gtk-kn
 *
 * This file is part of gtk-kn.
 * gtk-kn is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * gtk-kn is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with gtk-kn. If not, see https://www.gnu.org/licenses/.
 */

package org.gtkkn.gir.model

/**
 * Indicates the lifetime of the call.
 *
 * For language bindings which want to know when the resources required to do the call can be freed.
 */
enum class GirScope {
    /**
     * Valid until a GDestroyNotify argument is called.
     */
    NOTIFIED,

    /**
     * Only valid for the duration of the first callback invocation (can only be called once).
     */
    ASYNC,

    /**
     * Only valid for the duration of the call, can be called multiple times during the call.
     */
    CALL,

    /**
     * Valid until the process terminates.
     */
    FOREVER,
    ;

    companion object {
        fun fromString(str: String): GirScope = when (str) {
            "notified" -> NOTIFIED
            "async" -> ASYNC
            "call" -> CALL
            "forever" -> FOREVER
            else -> error("String '$str' is not a valid Scope value")
        }
    }
}
