/*
 * Copyright (c) 2023 gtk-kn
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.gtkkn.extensions.gobject

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.native.gobject.GType

/**
 * Interface for GObject type information holders.
 */
public sealed interface KGType<out T : Any> {
    public val gType: GType
    public val convertPointerFunc: (CPointer<CPointed>) -> T
}

/**
 * [KGType] implementation for generated classes.
 */
public data class GeneratedClassKGType<out T : Any>(
    override val gType: GType,
    override val convertPointerFunc: (CPointer<CPointed>) -> T
) : KGType<T>

/**
 * [KGType] implementation for generated interfaces.
 */
public data class GeneratedInterfaceKGType<out T : Any>(
    override val gType: GType,
    override val convertPointerFunc: (CPointer<CPointed>) -> T
) : KGType<T>

/**
 * [KGType] implementation for user defined types.
 */
public data class UserDefinedKGType<out T : Object>(
    override val gType: GType,
    override val convertPointerFunc: (CPointer<CPointed>) -> T
) : KGType<T>
