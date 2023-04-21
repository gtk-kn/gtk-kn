/*
 * Copyright (c) 2023 gtk-kn
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

package org.gtkkn.gir.blueprints

/**
 * Container class for encapsulating information about a skipped object.
 *
 * @property objectType type of the object that was skipped.
 * @property objectName name of the object that was skipped.
 * @property reason reason why the object was skipped.
 * @property documented true if the skip should be documented in skipfiles or kdocs.
 */
data class SkippedObject(
    val objectType: String,
    val objectName: String,
    val reason: String,
    val documented: Boolean = true,
) {
    /**
     * Build a user readable message with support for overriding the length of the object and type names
     * so they can be nicely formatted when printing a list of these objects
     */
    fun textMessage(
        objectNameLength: Int = objectName.length,
        objectTypeLength: Int = objectType.length,
    ): String =
        "Skipped ${objectType.padEnd(objectTypeLength, ' ')}\t${objectName.padEnd(objectNameLength, ' ')}\t($reason)"

    fun kDocMessage(): String = "- $objectType `$objectName`: $reason"
}
