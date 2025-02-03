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

import com.squareup.kotlinpoet.MemberName
import net.pearx.kasechange.toPascalCase
import org.gtkkn.gir.log.logger
import org.gtkkn.gir.model.GirNamespace
import org.gtkkn.gir.processor.BlueprintException
import org.gtkkn.gir.processor.NotIntrospectableException
import org.gtkkn.gir.processor.ProcessorContext
import org.gtkkn.gir.processor.SkippedObjectException
import org.gtkkn.gir.processor.UnresolvableTypeException
import org.gtkkn.gir.processor.namespaceBindingsPackageName

/**
 * Abstract class for Blueprint builders that provides helper methods
 * and general structure.
 */
abstract class BlueprintBuilder<T : Any>(val context: ProcessorContext) {
    protected val skippedObjects = mutableListOf<SkippedObject>()

    /**
     * Return the type of object this blueprint is for.
     */
    abstract fun blueprintObjectType(): String

    /**
     * Return the name of the object this blueprint is for.
     */
    abstract fun blueprintObjectName(): String

    /**
     * Main build method.
     */
    fun build(): BlueprintResult<T> = try {
        ok(buildInternal())
    } catch (ex: SkippedObjectException) {
        // propagate skipped object
        BlueprintResult.Skip(ex.skippedObject)
    } catch (ex: NotIntrospectableException) {
        logger.debug { "Skipping not introspectable object: ${ex.objectName}" }
        skip(ex.message, documented = false)
    } catch (ex: BlueprintException) {
        skip(ex.message)
    }

    /**
     * Implementations of this method should have all the resolution and throw [UnresolvableTypeException] logic.
     */
    @Throws(UnresolvableTypeException::class)
    protected abstract fun buildInternal(): T

    protected fun GirNamespace.exceptionResolvingFunction() =
        MemberName(
            packageName = namespaceBindingsPackageName(this) + "." + checkNotNull(name).toPascalCase(),
            simpleName = "resolveException",
        )

    /**
     * Utility method for returning a SkippedObject.
     */
    private fun skip(reason: String, documented: Boolean = true): BlueprintResult.Skip<T> =
        BlueprintResult.Skip(
            SkippedObject(
                objectType = blueprintObjectType(),
                objectName = blueprintObjectName(),
                reason = reason,
                documented = documented,
            ),
        )

    /**
     * Utility method for returning a successful blueprint.
     */
    private fun ok(obj: T) = BlueprintResult.Ok(obj)
}
