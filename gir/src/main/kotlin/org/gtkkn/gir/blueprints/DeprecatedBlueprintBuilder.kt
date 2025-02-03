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

import org.gtkkn.gir.model.GirDoc
import org.gtkkn.gir.model.GirInfo
import org.gtkkn.gir.processor.BlueprintException
import org.gtkkn.gir.processor.ProcessorContext

class DeprecatedBlueprintBuilder(
    context: ProcessorContext,
    private val girInfo: GirInfo?,
    private val girDoc: GirDoc?,
) : BlueprintBuilder<DeprecatedBlueprint>(context) {
    override fun blueprintObjectType(): String = "deprecated"

    override fun blueprintObjectName(): String = girInfo?.deprecated.toString()

    override fun buildInternal(): DeprecatedBlueprint {
        if (girInfo?.deprecated != true) {
            throw BlueprintException("Not deprecated")
        }

        val deprecatedBlueprint = DeprecatedBlueprint(
            version = girInfo.deprecatedVersion,
            message = girDoc?.docDeprecated?.text,
        )
        return deprecatedBlueprint
    }
}
