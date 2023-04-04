/*
 * Copyright (c) 2023 gtk-kt
 *
 * This file is part of gtk-kt.
 * gtk-kt is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * gtk-kt is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with gtk-kt. If not, see https://www.gnu.org/licenses/.
 */

package org.gtkkn.gir.model

/**
 * Give the stability of the documentation.
 *
 * @property preserveSpace preserve the original formatting of the documentation from the source code.
 * @property preserveWhitespace preserve the original formatting of the documentation from the source code.
 *                              Recommended to use this instead of xml:space.
 * @property text a text value about the stability of the documentation. Usually a simple description like stable or
 *                unstable.
 */
data class GirDocStability(
    val preserveSpace: Boolean,
    val preserveWhitespace: Boolean,
    val text: String,
)
