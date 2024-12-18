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
 * Element defining a union type, similar to union in C but extended with fields and methods.
 *
 * @property info Common attributes for GIR elements.
 * @property name Name of the union.
 * @property cType C type defining the union.
 * @property cSymbolPrefix Prefix to filter out from C functions.
 * @property glibTypeName GObject compatible type name.
 * @property glibGetType Function to retrieve the GObject compatible type of the union.
 * @property copyFunction Name of the function used to copy the union.
 * @property freeFunction Name of the function used to free the union.
 * @property doc Documentation elements.
 * @property annotations Annotations associated with the union.
 * @property fields Fields within the union.
 * @property constructors Constructors for the union.
 * @property methods Methods within the union.
 * @property methodInlines Inline methods within the union.
 * @property functions Functions within the union.
 * @property functionInlines Inline functions within the union.
 * @property records Records associated with the union.
 */
@Suppress("DataClassShouldBeImmutable", "LateinitUsage", "LongMethod")
data class GirUnion(
    val info: GirInfo,
    override val name: String? = null,
    override val cType: String? = null,
    val cSymbolPrefix: String? = null,
    val glibTypeName: String? = null,
    val glibGetType: String? = null,
    val copyFunction: String? = null,
    val freeFunction: String? = null,
    val doc: GirDoc? = null,
    val annotations: List<GirAnnotation> = emptyList(),
    val fields: List<GirField> = emptyList(),
    val constructors: List<GirConstructor> = emptyList(),
    val methods: List<GirMethod> = emptyList(),
    val methodInlines: List<GirMethodInline> = emptyList(),
    val functions: List<GirFunction> = emptyList(),
    val functionInlines: List<GirFunctionInline> = emptyList(),
    val records: List<GirRecord> = emptyList(),
) : GirNode, GirNamedElement {
    override lateinit var parentNode: GirNode
    override lateinit var namespace: GirNamespace
    override fun initializeChildren(namespace: GirNamespace) {
        info.initialize(this, namespace)
        doc?.initialize(this, namespace)
        annotations.forEach { it.initialize(this, namespace) }
        fields.forEach { it.initialize(this, namespace) }
        constructors.forEach { it.initialize(this, namespace) }
        methods.forEach { it.initialize(this, namespace) }
        methodInlines.forEach { it.initialize(this, namespace) }
        functions.forEach { it.initialize(this, namespace) }
        functionInlines.forEach { it.initialize(this, namespace) }
        records.forEach { it.initialize(this, namespace) }
    }

    fun shouldBeGenerated(): Boolean =
        info.shouldBeGenerated() && name != "priv" && cType != "priv"
}
