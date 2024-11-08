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
 * Documentation of elements.
 *
 * @property docVersion version of the documentation.
 * @property docStability give the stability of the documentation.
 * @property doc documentation of an element.
 * @property docDeprecated deprecated documentation of an element. Kept for historical reasons in general.
 * @property sourcePosition position of the documentation in the original source code.
 */
data class GirDocElements(
    val docVersion: GirDocVersion?,
    val docStability: GirDocStability?,
    val doc: GirDoc?,
    val docDeprecated: GirDocDeprecated?,
    val sourcePosition: GirSourcePosition?,
)
