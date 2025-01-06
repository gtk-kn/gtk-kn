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
 * A callback closure, that is, a function called when a signal is emitted.
 *
 * @property info Common attributes for GIR elements.
 * @property name Name of the callback.
 * @property cType The C type returned by the callback closure.
 * @property throws Indicates if the callback can throw an error.
 * @property doc Documentation elements.
 * @property annotations Annotations associated with the callback.
 * @property parameters Parameters for the callback.
 * @property returnValue Return value of the callback.
 */
@Suppress("DataClassShouldBeImmutable", "LateinitUsage", "LongMethod")
data class GirCallback(
    val info: GirInfo,
    override val name: String,
    override val cType: String? = null,
    val throws: Boolean? = null,
    val doc: GirDoc? = null,
    val annotations: List<GirAnnotation> = emptyList(),
    val parameters: GirParameters? = null,
    val returnValue: GirReturnValue? = null,
) : GirFieldType, GirNamedElement {
    override lateinit var parentNode: GirNode
    override lateinit var namespace: GirNamespace
    override fun initializeChildren(namespace: GirNamespace) {
        info.initialize(this, namespace)
        doc?.initialize(this, namespace)
        annotations.forEach { it.initialize(this, namespace) }
        parameters?.initialize(this, namespace)
        returnValue?.initialize(this, namespace)
    }

    override fun shouldBeGenerated() = info.gtkKnIgnore != true
}
