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

package org.gtkkn.gir.blueprints

import com.squareup.kotlinpoet.ClassName
import org.gtkkn.gir.model.GirInfo
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.processor.BlueprintException
import org.gtkkn.gir.processor.ProcessorContext

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
        val namespaceName = girNamespace.name
        val kotlinClassName = "${namespaceName}Version${girInfo.version.replace(".", "_")}"
        val kotlinPackageName = context.getKotlinPackageName("${girNamespace.name}.annotations")

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
