// This is a generated file. Do not modify.
package org.gtkkn.bindings.jsc

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.Callback
import org.gtkkn.bindings.gobject.CallbackFunc
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.jsc.JSCClass
import org.gtkkn.native.jsc.jsc_class_add_constructor_variadic
import org.gtkkn.native.jsc.jsc_class_add_method_variadic
import org.gtkkn.native.jsc.jsc_class_get_name
import org.gtkkn.native.jsc.jsc_class_get_parent
import org.gtkkn.native.jsc.jsc_class_get_type
import kotlin.String
import kotlin.Unit

/**
 * A JSSClass represents a custom JavaScript class registered by the user in a #JSCContext.
 * It allows to create new JavaScripts objects whose instances are created by the user using
 * this API.
 * It's possible to add constructors, properties and methods for a JSSClass by providing
 * #GCallback<!-- -->s to implement them.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `parameter_types`: Array parameter of type GType is not supported
 * - parameter `parameter_types`: Array parameter of type GType is not supported
 * - parameter `getter`: GObject.Callback
 * - method `context`: Property has no getter nor setter
 */
public class Class(pointer: CPointer<JSCClass>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val jscClassPointer: CPointer<JSCClass>
        get() = gPointer.reinterpret()

    /**
     * The name of the class.
     */
    public val name: String
        /**
         * Get the class name of @jsc_class
         *
         * @return the name of @jsc_class
         */
        get() = jsc_class_get_name(jscClassPointer.reinterpret())?.toKString() ?: error("Expected not null string")

    /**
     * The parent class or null in case of final classes.
     */
    public val parent: Class
        /**
         * Get the parent class of @jsc_class
         *
         * @return the parent class of @jsc_class
         */
        get() = jsc_class_get_parent(jscClassPointer.reinterpret())!!.run {
            Class(reinterpret())
        }

    /**
     * Add a constructor to @jsc_class. If @name is null, the class name will be used. When <function>new</function>
     * is used with the constructor or jsc_value_constructor_call() is called, @callback is invoked receiving
     * a #GPtrArray of #JSCValue<!-- -->s as arguments and @user_data as the last parameter. When the constructor object
     * is cleared in the #JSCClass context, @destroy_notify is called with @user_data as parameter.
     *
     * This function creates the constructor, which needs to be added to an object as a property to be able to use it. Use
     * jsc_context_set_value() to make the constructor available in the global object.
     *
     * Note that the value returned by @callback is adopted by @jsc_class, and the #GDestroyNotify passed to
     * jsc_context_register_class() is responsible for disposing of it.
     *
     * @param name the constructor name or null
     * @param callback a #GCallback to be called to create an instance of @jsc_class
     * @param returnType the #GType of the constructor return value
     * @return a #JSCValue representing the class constructor.
     */
    public fun addConstructorVariadic(name: String? = null, callback: Callback, returnType: GType): Value =
        jsc_class_add_constructor_variadic(
            jscClassPointer.reinterpret(),
            name,
            CallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            returnType
        )!!.run {
            Value(reinterpret())
        }

    /**
     * Add method with @name to @jsc_class. When the method is called by JavaScript or jsc_value_object_invoke_method(),
     * @callback is called receiving the class instance as first parameter, followed by a #GPtrArray of #JSCValue<!-- -->s
     * with the method arguments and then @user_data as last parameter. When the method is cleared in the #JSCClass context,
     * @destroy_notify is called with @user_data as parameter.
     *
     * Note that the value returned by @callback must be transfer full. In case of non-refcounted boxed types, you should use
     * %G_TYPE_POINTER instead of the actual boxed #GType to ensure that the instance owned by #JSCClass is used.
     * If you really want to return a new copy of the boxed type, use #JSC_TYPE_VALUE and return a #JSCValue created
     * with jsc_value_new_object() that receives the copy as the instance parameter.
     *
     * @param name the method name
     * @param callback a #GCallback to be called to invoke method @name of @jsc_class
     * @param returnType the #GType of the method return value, or %G_TYPE_NONE if the method is void.
     */
    public fun addMethodVariadic(name: String, callback: Callback, returnType: GType): Unit =
        jsc_class_add_method_variadic(
            jscClassPointer.reinterpret(),
            name,
            CallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            returnType
        )

    public companion object : TypeCompanion<Class> {
        override val type: GeneratedClassKGType<Class> =
            GeneratedClassKGType(jsc_class_get_type()) { Class(it.reinterpret()) }

        init {
            JavascriptcoreTypeProvider.register()
        }

        /**
         * Get the GType of Class
         *
         * @return the GType
         */
        public fun getType(): GType = jsc_class_get_type()
    }
}
