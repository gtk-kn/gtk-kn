/*
 * Copyright (c) 2023 gtk-kn
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.gtkkn.extensions.gobject

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Gobject
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gobject.ParamFlags
import org.gtkkn.bindings.gobject.TypeQuery
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.allocateScoped
import org.gtkkn.extensions.gobject.properties.BooleanProperty
import org.gtkkn.extensions.gobject.properties.ClassPropertyDelegateProvider
import org.gtkkn.extensions.gobject.properties.IntProperty
import org.gtkkn.extensions.gobject.properties.StringProperty
import org.gtkkn.native.gobject.GObjectClass
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_object_new
import org.gtkkn.native.gobject.g_type_check_instance_is_a

/**
 * Companion object base class used for declaring Kotlin classes that are registered
 * in the GObject type system.
 *
 *
 * ## Subclassing Object and other native types
 *
 * When defining custom GObject classes:
 * - Extend from [Object] or another non-final class.
 * - Use [newInstancePointer] when calling through to the superclass constructor.
 * - Add a companion object that extends from [ObjectType] and pass in
 *   your class, typeName and parent type.
 *
 * ```
 * // MyClass with a no-arg constructor, calling through to Object using newInstancePointer
 * class MyClass() : Object(newInstancePointer()) {
 *
 *     // companion object that holds the type information
 *     companion object : ObjectType<MyClass>("MyClass", Object.type) {
 *     }
 * }
 * ```
 *
 * Note that you should always use the pointer constructor from the parent class and not
 * a utility constructor.
 *
 *
 * ## Subclassing Kotlin types
 *
 * When extending from a parent Kotlin class that is already a Kotlin Object subclass,
 * some extra restrictions apply.
 *
 * Simply extending from the parent class and calling its Kotlin constructor is not enough
 * as this will end up calling [newInstancePointer] from the parent type.
 *
 * Instead, the Parent class should have a primary constructor taking a [CPointer] as an argument,
 * which is passed along to the constructor of its parent native class. And then the child class
 * can have the same setup as mentioned above where the primary constructor uses its own
 * [newInstancePointer] method before passing the pointer along to the Parent constructor.
 *
 * ```
 * // Parent class that extends from Object
 * // primary constructor takes an instance pointer and passes it to the native constructor
 * open class ParentClass(pointer: CPointer<CPointed>) : Object(pointer.reinterpret()) {
 *
 *     // utility no-arg constructor
 *     constructor() : this(newInstancePointer())
 *
 *     companion object : ObjectType<ParentClass>("ParentClass", Object.type) {
 *     }
 * }
 *
 * // Child class that extends from Parent
 * // primary constructor uses newInstancePointer and passes it to Parent primary constructor
 * class ChildClass() : ParentClass(newInstancePointer()) {
 *
 *     companion object : ObjectType<ChildClass>("ChildClass", ParentClass.type) {
 *     }
 * }
 * ```
 *
 * When your Parent class has additional constructor overloads with other arguments, you need
 * to make sure that each additional constructor that is used by Child classes also has a pointer
 * argument.
 *
 */
@Suppress("ClassOrdering")
public open class ObjectType<T : Object>(
    private val typeName: String,
    private val parentType: KGType<Object>,
) {

    internal val classProperties: ClassProperties = ClassProperties()

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

    public val stringProperty: ClassPropertyDelegateProvider<T, String> =
        ClassPropertyDelegateProvider { propertyName ->
            StringProperty(Gobject.paramSpecString(propertyName, null, null, "", ParamFlags.READWRITE))
        }

    public val intProperty: ClassPropertyDelegateProvider<T, Int> =
        ClassPropertyDelegateProvider { propertyName ->
            IntProperty(
                Gobject.paramSpecInt(propertyName, null, null, Int.MIN_VALUE, Int.MAX_VALUE, 0, ParamFlags.READWRITE),
            )
        }

    public val booleanProperty: ClassPropertyDelegateProvider<T, Boolean> =
        ClassPropertyDelegateProvider { propertyName ->
            BooleanProperty(
                Gobject.paramSpecBoolean(propertyName, null, null, false, ParamFlags.READWRITE),
            )
        }

    public fun stringProperty(
        name: String? = null,
        nick: String? = null,
        blurb: String? = null,
        defaultValue: String = "",
        flags: ParamFlags = ParamFlags.READWRITE
    ): ClassPropertyDelegateProvider<T, String> = ClassPropertyDelegateProvider { propertyName ->
        StringProperty(
            Gobject.paramSpecString(
                name ?: propertyName,
                nick, blurb, defaultValue, flags,
            ),
        )
    }

    public fun intProperty(
        name: String? = null,
        nick: String? = null,
        blurb: String? = null,
        minimum: Int = Int.MIN_VALUE,
        maximum: Int = Int.MAX_VALUE,
        defaultValue: Int = 0,
        flags: ParamFlags = ParamFlags.READWRITE
    ): ClassPropertyDelegateProvider<T, Int> = ClassPropertyDelegateProvider { propertyName ->
        IntProperty(
            Gobject.paramSpecInt(
                name ?: propertyName,
                nick, blurb, minimum, maximum, defaultValue, flags,
            ),
        )
    }

    public fun booleanProperty(
        name: String? = null,
        nick: String? = null,
        blurb: String? = null,
        defaultValue: Boolean = false,
        flags: ParamFlags = ParamFlags.READWRITE
    ): ClassPropertyDelegateProvider<T, Boolean> = ClassPropertyDelegateProvider { propertyName ->
        BooleanProperty(
            Gobject.paramSpecBoolean(
                name ?: propertyName,
                nick, blurb, defaultValue, flags,
            ),
        )
    }

    /**
     * Initialize a new g_object with [gType] and return a [CPointer] to it.
     *
     * This method is supposed to be used when calling through to the parent
     * constructor when defining custom GObject-derived classes.
     *
     * @return [CPointer] pointing to the newly create g_object.
     * @see ObjectType
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

    public open fun classInit(objectClass: CPointer<GObjectClass>): Unit {}

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
            this@ObjectType,
        )
    }
}
