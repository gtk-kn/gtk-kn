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

import com.squareup.kotlinpoet.ClassName
import net.pearx.kasechange.toPascalCase
import org.gtkkn.gir.processor.RegisteredType
import org.gtkkn.gir.processor.TypeRegistry
import org.gtkkn.gir.processor.namespaceBindingsPackageName

sealed interface GirNamedElement {
    val name: String?
    val cType: String?
    var namespace: GirNamespace

    fun shouldBeGenerated(): Boolean

    fun registerType(typeRegistry: TypeRegistry) {
        if (shouldBeGenerated()) {
            val kotlinClassName = checkNotNull(name).toPascalCase()
            val kotlinPackageName = namespaceBindingsPackageName(namespace)
            val className = ClassName(kotlinPackageName, kotlinClassName)
            var registeredType = RegisteredType(
                className = className,
                namespace = namespace,
                cType = cType,
                rawName = checkNotNull(name),
                girNamedElement = this,
            )
            if (this is GirClass) {
                registeredType = registeredType.copy(rawParentName = parent)
            }
            typeRegistry.register(registeredType)
        }
    }
}
