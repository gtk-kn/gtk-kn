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
 * GObject inherited class definition.
 *
 * @property info Common attributes for GIR elements.
 * @property name Name of the class.
 * @property glibTypeName GObject compatible type name of the class.
 * @property glibGetType Function to get the GObject compatible type of the class.
 * @property parent Name of the parent class, if any.
 * @property glibTypeStruct GObject compatible C structure defining the class.
 * @property glibRefFunc GObject compatible function to increase the reference count of the class.
 * @property glibUnrefFunc GObject compatible function to decrease the reference count of the class.
 * @property glibSetValueFunc GObject compatible function to set a property value of the class.
 * @property glibGetValueFunc GObject compatible function to get a property value of the class.
 * @property cType C type of the class.
 * @property cSymbolPrefix Prefix to filter out from C functions.
 * @property abstract Indicates if the class is abstract.
 * @property glibFundamental Indicates if the class is fundamental (top-level).
 * @property final Indicates if the class is final (non-derivable).
 * @property doc Documentation elements.
 * @property annotations Annotations associated with the class.
 * @property implements Interfaces implemented by the class.
 * @property constructors Constructors for the class.
 * @property methods Methods defined in the class.
 * @property methodInlines Inline methods defined in the class.
 * @property functions Functions within the class.
 * @property functionInlines Inline functions within the class.
 * @property virtualMethods Virtual methods defined in the class.
 * @property fields Fields defined in the class.
 * @property properties Properties of the class.
 * @property signals Signals emitted by the class.
 * @property unions Unions associated with the class.
 * @property constants Constants defined in the class.
 * @property records Records within the class.
 * @property callbacks Callbacks defined in the class.
 */
@Suppress("DataClassShouldBeImmutable", "LateinitUsage", "LongMethod")
data class GirClass(
    val info: GirInfo,
    override val name: String,
    val glibTypeName: String,
    val glibGetType: String,
    val parent: String? = null,
    val glibTypeStruct: String? = null,
    val glibRefFunc: String? = null,
    val glibUnrefFunc: String? = null,
    val glibSetValueFunc: String? = null,
    val glibGetValueFunc: String? = null,
    override val cType: String? = null,
    val cSymbolPrefix: String? = null,
    val abstract: Boolean? = null,
    val glibFundamental: Boolean? = null,
    val final: Boolean? = null,
    val doc: GirDoc? = null,
    val annotations: List<GirAnnotation> = emptyList(),
    val implements: List<GirImplements> = emptyList(),
    val constructors: List<GirConstructor> = emptyList(),
    val methods: List<GirMethod> = emptyList(),
    val methodInlines: List<GirMethodInline> = emptyList(),
    val functions: List<GirFunction> = emptyList(),
    val functionInlines: List<GirFunctionInline> = emptyList(),
    val virtualMethods: List<GirVirtualMethod> = emptyList(),
    val fields: List<GirField> = emptyList(),
    val properties: List<GirProperty> = emptyList(),
    val signals: List<GirSignal> = emptyList(),
    val unions: List<GirUnion> = emptyList(),
    val constants: List<GirConstant> = emptyList(),
    val records: List<GirRecord> = emptyList(),
    val callbacks: List<GirCallback> = emptyList(),
) : GirNode, GirNamedElement {
    override lateinit var parentNode: GirNode
    override lateinit var namespace: GirNamespace
    override fun initializeChildren(namespace: GirNamespace) {
        info.initialize(this, namespace)
        doc?.initialize(this, namespace)
        annotations.forEach { it.initialize(this, namespace) }
        implements.forEach { it.initialize(this, namespace) }
        constructors.forEach { it.initialize(this, namespace) }
        methods.forEach { it.initialize(this, namespace) }
        methodInlines.forEach { it.initialize(this, namespace) }
        functions.forEach { it.initialize(this, namespace) }
        functionInlines.forEach { it.initialize(this, namespace) }
        virtualMethods.forEach { it.initialize(this, namespace) }
        fields.forEach { it.initialize(this, namespace) }
        properties.forEach { it.initialize(this, namespace) }
        signals.forEach { it.initialize(this, namespace) }
        unions.forEach { it.initialize(this, namespace) }
        constants.forEach { it.initialize(this, namespace) }
        records.forEach { it.initialize(this, namespace) }
        callbacks.forEach { it.initialize(this, namespace) }
    }
}
