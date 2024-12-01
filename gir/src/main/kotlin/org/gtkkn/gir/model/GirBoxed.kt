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
 * Boxed type (wrapper to opaque C structures registered by the type system).
 *
 * @property info Common attributes for GIR elements.
 * @property glibName GObject compatible name of the boxed type.
 * @property cSymbolPrefix Prefix to filter out from C functions.
 * @property glibTypeName GObject compatible type name of the boxed type.
 * @property glibGetType Function to get the GObject compatible type of the boxed type.
 * @property doc Documentation elements.
 * @property annotations Annotations associated with the boxed type.
 * @property functions Functions within the boxed type.
 * @property functionInlines Inline functions within the boxed type.
 */
@Suppress("DataClassShouldBeImmutable", "LateinitUsage", "LongMethod")
data class GirBoxed(
    val info: GirInfo,
    val glibName: String,
    val cSymbolPrefix: String? = null,
    val glibTypeName: String? = null,
    val glibGetType: String? = null,
    val doc: GirDoc? = null,
    val annotations: List<GirAnnotation> = emptyList(),
    val functions: List<GirFunction> = emptyList(),
    val functionInlines: List<GirFunctionInline> = emptyList(),
) : GirNode {
    override lateinit var parentNode: GirNode
    override lateinit var namespace: GirNamespace
    override fun initializeChildren(namespace: GirNamespace) {
        info.initialize(this, namespace)
        doc?.initialize(this, namespace)
        annotations.forEach { it.initialize(this, namespace) }
        functions.forEach { it.initialize(this, namespace) }
        functionInlines.forEach { it.initialize(this, namespace) }
    }
}
