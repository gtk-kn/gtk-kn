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

package org.gtkkn.extensions.gobject

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Gobject
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gobject.TypeQuery
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.allocateScoped
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_object_new
import org.gtkkn.native.gobject.g_type_check_instance_is_a

/**
 * Companion object base class used for declaring Kotlin classes that are registered
 * in the GObject type system.
 *
 * When defining custom GObject classes:
 * - Extend from [Object] or another non-final class.
 * - Use [newInstancePointer] when calling through to the superclass constructor.
 * - Add a companion object that extends from [ObjectSubclassCompanion] and pass in
 *   your class, typeName and parent type.
 *
 * ```
 * class MyClass() : Object(newInstancePointer()) {
 *     companion object : ObjectSubclassCompanion<MyClass>("MyClass", Object.type) {
 *     }
 * }
 * ```
 */
public open class ObjectSubclassCompanion<T : Object>(
    private val typeName: String,
    private val parentType: GeneratedClassKGType<Object>,
) {
    /**
     * Type information of the registered class.
     */
    public val type: UserDefinedKGType<T> by lazy {
        UserDefinedKGType(registerType()) { instanceFromPointer(it.reinterpret()) }
    }

    /**
     * GType of the registered class.
     *
     * This property can also be found on [type]. This is a utility accessor
     * that makes calling methods and constructors that take a GType argument
     * less verbose.
     */
    public val gType: GType get() = type.gType

    /**
     * Initialize a new g_object with [gType] and return a [CPointer] to it.
     *
     * This method is supposed to be used when calling through to the parent
     * constructor when defining custom GObject-derived classes.
     *
     * @return [CPointer] pointing to the newly create g_object.
     * @see ObjectSubclassCompanion
     */
    public inline fun <reified T : CPointed> newInstancePointer(): CPointer<T> =
        checkNotNull(g_object_new(type.gType, null, null)).reinterpret()

    /**
     * Convert a CPointer pointing to a g_object of this [gType] back into
     * the associated Kotlin instance.
     *
     * This method will throw when the types do not match or no instance is associated.
     */
    public fun instanceFromPointer(pointer: CPointer<out CPointed>): T {
        if (!g_type_check_instance_is_a(pointer.reinterpret(), gType).asBoolean()) {
            error("pointer is not a $typeName")
        }
        @Suppress("UNCHECKED_CAST")
        return TypeRegistry.getInstanceData(pointer).data as T
    }

    private fun registerType(): GType = memScoped {
        val typeQueryResult = TypeQuery.allocateScoped(this)
        Gobject.typeQuery(parentType.gType, typeQueryResult)

        val parentClassSize = typeQueryResult.classSize.toLong()
        val parentInstanceSize = typeQueryResult.instanceSize.toLong()

        return TypeRegistry.registerType(
            typeName,
            parentType.gType,
            parentClassSize,
            parentInstanceSize,
        )
    }
}
