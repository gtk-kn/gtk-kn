/*
 * Copyright (c) 2025 gtk-kn
 *
 * SPDX-License-Identifier: LGPL-2.1-or-later
 *
 * This file is part of gtk-kn.
 * gtk-kn is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, see <http://www.gnu.org/licenses/>.
 */

package org.gtkkn.extensions.glib.cinterop

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.invoke
import kotlinx.cinterop.reinterpret
import org.gtkkn.native.gobject.GType
import platform.posix.RTLD_LAZY
import platform.posix.dlopen
import platform.posix.dlsym

/**
 * Lazily initializes a handle for dynamic symbol resolution.
 *
 * This handle is initialized with `dlopen(null, RTLD_LAZY)`, which searches for symbols
 * within the main program and any already-loaded shared libraries.
 * It is used by [loadSymbolFunction] to dynamically resolve function pointers at runtime.
 *
 * @throws IllegalStateException if the handle cannot be initialized.
 */
@PublishedApi
internal val dlopenHandle: CPointer<out CPointed> by lazy { checkNotNull(dlopen(null, RTLD_LAZY)) }

/**
 * Dynamically resolves a symbol as a C function pointer of type [T].
 *
 * This function searches for the specified symbol name within the main program and any
 * already-loaded shared libraries. If the symbol is found, it is reinterpreted as a
 * function pointer of the given type [T]. If the symbol is not found, `null` is returned.
 *
 * @param T The Kotlin representation of the C function pointer's type signature (e.g., `() -> GType`).
 * @param symbolName The name of the symbol to resolve (e.g., `"adw_about_dialog_get_type"`).
 * @return The function pointer if the symbol is found, or `null` if the symbol cannot be resolved.
 */
public inline fun <reified T : Function<*>> loadSymbolFunction(symbolName: String): CPointer<CFunction<T>>? =
    dlsym(dlopenHandle, symbolName)?.reinterpret()

/**
 * Gets the GType of a symbol if it exists.
 *
 * This function dynamically resolves the specified symbol as a C function pointer and invokes it
 * to retrieve the `GType`.
 * The resolution is restricted to the main program and already-loaded shared libraries.
 * If the symbol cannot be found, `null` is returned, allowing the caller to handle missing symbols gracefully.
 *
 * @param getTypeFunctionName The name of the symbol to resolve and invoke (e.g., `"adw_about_dialog_get_type"`).
 * @return The `GType` associated with the symbol, or `null` if the symbol cannot be resolved.
 */
public fun getTypeOrNull(getTypeFunctionName: String): GType? =
    loadSymbolFunction<() -> GType>(getTypeFunctionName)?.invoke()
