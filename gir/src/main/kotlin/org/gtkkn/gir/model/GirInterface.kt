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
 * Abstract interface to other classes.
 *
 * @property info Common attributes for GIR elements.
 * @property name Name of the interface.
 * @property glibTypeName Type name compatible with the GObject type system.
 * @property glibGetType Function to get the GObject compatible type of the interface.
 * @property cSymbolPrefix Prefix to filter out from C functions.
 * @property cType Corresponding C type.
 * @property glibTypeStruct GObject compatible C structure defining the interface.
 * @property doc Documentation elements.
 * @property annotations Annotations associated with the interface.
 * @property prerequisites Interfaces required to implement this interface.
 * @property implements Implemented interfaces.
 * @property functions Functions defined in the interface.
 * @property functionInlines Inline functions defined in the interface.
 * @property constructor Constructor for the interface.
 * @property methods Methods defined in the interface.
 * @property methodInlines Inline methods defined in the interface.
 * @property virtualMethods Virtual methods defined in the interface.
 * @property fields Fields associated with the interface.
 * @property properties Properties of the interface.
 * @property signals Signals associated with the interface.
 * @property callbacks Callbacks defined in the interface.
 * @property constants Constants defined in the interface.
 */
@Suppress("DataClassShouldBeImmutable", "LateinitUsage", "LongMethod")
data class GirInterface(
    val info: GirInfo,
    override val name: String? = null,
    val glibTypeName: String,
    val glibGetType: String,
    val cSymbolPrefix: String? = null,
    override val cType: String? = null,
    val glibTypeStruct: String? = null,
    val doc: GirDoc? = null,
    val annotations: List<GirAnnotation> = emptyList(),
    val prerequisites: List<GirPrerequisite> = emptyList(),
    val implements: List<GirImplements> = emptyList(),
    val functions: List<GirFunction> = emptyList(),
    val functionInlines: List<GirFunctionInline> = emptyList(),
    val constructor: GirConstructor? = null,
    val methods: List<GirMethod> = emptyList(),
    val methodInlines: List<GirMethodInline> = emptyList(),
    val virtualMethods: List<GirVirtualMethod> = emptyList(),
    val fields: List<GirField> = emptyList(),
    val properties: List<GirProperty> = emptyList(),
    val signals: List<GirSignal> = emptyList(),
    val callbacks: List<GirCallback> = emptyList(),
    val constants: List<GirConstant> = emptyList(),
) : GirNode, GirNamedElement {
    override lateinit var parentNode: GirNode
    override lateinit var namespace: GirNamespace
    override fun initializeChildren(namespace: GirNamespace) {
        info.initialize(this, namespace)
        doc?.initialize(this, namespace)
        annotations.forEach { it.initialize(this, namespace) }
        prerequisites.forEach { it.initialize(this, namespace) }
        implements.forEach { it.initialize(this, namespace) }
        functions.forEach { it.initialize(this, namespace) }
        functionInlines.forEach { it.initialize(this, namespace) }
        constructor?.initialize(this, namespace)
        methods.forEach { it.initialize(this, namespace) }
        methodInlines.forEach { it.initialize(this, namespace) }
        virtualMethods.forEach { it.initialize(this, namespace) }
        fields.forEach { it.initialize(this, namespace) }
        properties.forEach { it.initialize(this, namespace) }
        signals.forEach { it.initialize(this, namespace) }
        callbacks.forEach { it.initialize(this, namespace) }
        constants.forEach { it.initialize(this, namespace) }
    }
}
