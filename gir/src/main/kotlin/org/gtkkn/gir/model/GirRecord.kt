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

package org.gtkkn.gir.model

/**
 * Record definition, equivalent to a C struct, that is a simple structure, not a class.
 *
 * @property info Common attributes for GIR elements.
 * @property name Name of the record.
 * @property cType Corresponding C type of the record.
 * @property disguised Indicates if the record is disguised (typedef that doesn't look like a pointer
 *                     but is internally).
 * @property opaque Indicates if the record lacks a public structure definition.
 * @property pointer Indicates if the record is a typedef struct pointer.
 * @property glibTypeName GObject compatible type name of the record.
 * @property glibGetType Function to get the GObject compatible type of the record.
 * @property cSymbolPrefix Prefix to filter out from C functions.
 * @property foreign Indicates if the record is foreign (not in a supported library).
 * @property glibIsGTypeStructFor GObject compatible gtype this record represents.
 * @property copyFunction Name of the function used to copy the record.
 * @property freeFunction Name of the function used to free the record.
 * @property doc Documentation elements.
 * @property annotations Annotations associated with the record.
 * @property fields Fields within the record.
 * @property functions Functions within the record.
 * @property functionInlines Inline functions within the record.
 * @property unions Unions within the record.
 * @property methods Methods within the record.
 * @property methodInlines Inline methods within the record.
 * @property constructors Constructors for the record.
 */
@Suppress("DataClassShouldBeImmutable", "LateinitUsage", "LongMethod")
data class GirRecord(
    val info: GirInfo,
    override val name: String,
    override val cType: String? = null,
    val disguised: Boolean? = null,
    val opaque: Boolean? = null,
    val pointer: Boolean? = null,
    val glibTypeName: String? = null,
    val glibGetType: String? = null,
    val cSymbolPrefix: String? = null,
    val foreign: Boolean? = null,
    val glibIsGTypeStructFor: String? = null,
    val copyFunction: String? = null,
    val freeFunction: String? = null,
    val doc: GirDoc? = null,
    val annotations: List<GirAnnotation> = emptyList(),
    val fields: List<GirField> = emptyList(),
    val functions: List<GirFunction> = emptyList(),
    val functionInlines: List<GirFunctionInline> = emptyList(),
    val unions: List<GirUnion> = emptyList(),
    val methods: List<GirMethod> = emptyList(),
    val methodInlines: List<GirMethodInline> = emptyList(),
    val constructors: List<GirConstructor> = emptyList(),
) : GirNode, GirNamedElement {
    override lateinit var parentNode: GirNode
    override lateinit var namespace: GirNamespace
    override fun initializeChildren(namespace: GirNamespace) {
        info.initialize(this, namespace)
        doc?.initialize(this, namespace)
        annotations.forEach { it.initialize(this, namespace) }
        fields.forEach { it.initialize(this, namespace) }
        constructors.forEach { it.initialize(this, namespace) }
        functions.forEach { it.initialize(this, namespace) }
        functionInlines.forEach { it.initialize(this, namespace) }
        unions.forEach { it.initialize(this, namespace) }
        methods.forEach { it.initialize(this, namespace) }
        methodInlines.forEach { it.initialize(this, namespace) }
        constructors.forEach { it.initialize(this, namespace) }
    }

    override fun shouldBeGenerated(): Boolean {
        val isNotIgnoredPrivate = cType == "GPrivate" || !name.endsWith("Private")
        return info.gtkKnIgnore != true && isNotIgnoredPrivate
    }
}
