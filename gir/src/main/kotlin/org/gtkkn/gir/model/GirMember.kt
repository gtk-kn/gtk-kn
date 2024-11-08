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
 * Element defining a member of a bit field or an enumeration.
 *
 * @property info attributes of a member (see [GirInfo]).
 * @property name name of the member.
 * @property value value of the member.
 * @property cIdentifier corresponding C type of the member.
 * @property glibNick short nickname of the member (from GEnumValue/GFlagsValue).
 * @property glibName name of the member (from GEnumValue/GFlagsValue).
 */
data class GirMember(
    val info: GirInfo,
    val name: String,
    val value: String,
    val cIdentifier: String,
    val glibNick: String?,
    val glibName: String?,
)
