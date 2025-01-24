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

package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.ClassName
import org.gtkkn.gir.ext.capitalized
import org.gtkkn.gir.model.GirInfo
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.processor.BlueprintException
import org.gtkkn.gir.processor.ProcessorContext
import org.gtkkn.gir.processor.namespaceBindingsPackageName

class OptInVersionsBlueprintBuilder(
    context: ProcessorContext,
    private val girNamespace: GirNamespace,
    private val girInfo: GirInfo?,
) : BlueprintBuilder<OptInVersionBlueprint>(context) {
    override fun blueprintObjectType(): String = "version"

    override fun blueprintObjectName(): String = girInfo?.version.toString()

    override fun buildInternal(): OptInVersionBlueprint {
        if (girInfo?.version == null) {
            throw BlueprintException("girInfo version is null")
        }
        val namespaceName = checkNotNull(girNamespace.name)
        val kotlinClassName = "${namespaceName.capitalized()}Version${girInfo.version.replace(".", "_")}"
        val kotlinPackageName = namespaceBindingsPackageName(girNamespace) + ".annotations"

        val optInVersionBlueprint = OptInVersionBlueprint(
            kotlinName = kotlinClassName,
            typeName = ClassName(kotlinPackageName, kotlinClassName),
            message = "This API requires $namespaceName version ${girInfo.version} or higher.",
            version = girInfo.version,
        )
        context.addOptInVersionsBlueprints(girNamespace, optInVersionBlueprint)
        return optInVersionBlueprint
    }
}
