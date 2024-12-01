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
 * Element defining a signal as defined in the GObject system.
 *
 * @property info Common attributes for GIR elements.
 * @property name Name of the signal.
 * @property detailed Indicates if the signal has a detailed parameter.
 * @property whenEmitted Specifies when to run the signal during the 5 steps of signal emission.
 * @property action Indicates if the signal can be freely emitted from user code.
 * @property noHooks Indicates if no emission hooks are supported for this signal.
 * @property noRecurse Indicates if the signal avoids recursive emission for the same object.
 * @property emitter The emitter method for the signal.
 * @property doc Documentation elements.
 * @property annotations Annotations associated with the signal.
 * @property parameters Parameters for the signal.
 * @property returnValue Return value of the signal.
 */
@Suppress("DataClassShouldBeImmutable", "LateinitUsage", "LongMethod")
data class GirSignal(
    val info: GirInfo,
    val name: String,
    val detailed: Boolean? = null,
    val whenEmitted: String? = null,
    val action: Boolean? = null,
    val noHooks: Boolean? = null,
    val noRecurse: Boolean? = null,
    val emitter: String? = null,
    val doc: GirDoc? = null,
    val annotations: List<GirAnnotation> = emptyList(),
    val parameters: GirParameters? = null,
    val returnValue: GirReturnValue? = null,
) : GirNode {
    override lateinit var parentNode: GirNode
    override lateinit var namespace: GirNamespace
    override fun initializeChildren(namespace: GirNamespace) {
        info.initialize(this, namespace)
        doc?.initialize(this, namespace)
        annotations.forEach { it.initialize(this, namespace) }
        parameters?.initialize(this, namespace)
        returnValue?.initialize(this, namespace)
    }
}
