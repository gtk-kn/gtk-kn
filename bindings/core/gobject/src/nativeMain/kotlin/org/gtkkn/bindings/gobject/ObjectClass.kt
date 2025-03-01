// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import org.gtkkn.bindings.gobject.annotations.GObjectVersion2_4
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GObjectClass
import org.gtkkn.native.gobject.g_object_class_find_property
import org.gtkkn.native.gobject.g_object_class_install_property
import org.gtkkn.native.gobject.g_object_class_override_property
import kotlin.String
import kotlin.Unit

/**
 * The class structure for the GObject type.
 *
 * |[<!-- language="C" -->
 * // Example of implementing a singleton using a constructor.
 * static MySingleton *the_singleton = NULL;
 *
 * static GObject*
 * my_singleton_constructor (GType                  type,
 *                           guint                  n_construct_params,
 *                           GObjectConstructParam *construct_params)
 * {
 *   GObject *object;
 *
 *   if (!the_singleton)
 *     {
 *       object = G_OBJECT_CLASS (parent_class)->constructor (type,
 *                                                            n_construct_params,
 *                                                            construct_params);
 *       the_singleton = MY_SINGLETON (object);
 *     }
 *   else
 *     object = g_object_ref (G_OBJECT (the_singleton));
 *
 *   return object;
 * }
 * ]|
 *
 * ## Skipped during bindings generation
 *
 * - parameter `pspecs`: Array parameter of type ParamSpec is not supported
 * - parameter `n_properties`: n_properties: Out parameter is not supported
 * - field `g_type_class`: Field with not-pointer record/union GTypeClass is not supported
 * - field `constructor`: Fields with callbacks are not supported
 * - field `set_property`: Fields with callbacks are not supported
 * - field `get_property`: Fields with callbacks are not supported
 * - field `dispose`: Fields with callbacks are not supported
 * - field `finalize`: Fields with callbacks are not supported
 * - field `dispatch_properties_changed`: Fields with callbacks are not supported
 * - field `notify`: Fields with callbacks are not supported
 * - field `constructed`: Fields with callbacks are not supported
 */
public class ObjectClass(public val gobjectObjectClassPointer: CPointer<GObjectClass>) :
    ProxyInstance(gobjectObjectClassPointer) {
    /**
     * Allocate a new ObjectClass.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<GObjectClass>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

    /**
     * Allocate a new ObjectClass using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GObjectClass>().ptr)

    /**
     * Looks up the #GParamSpec for a property of a class.
     *
     * @param propertyName the name of the property to look up
     * @return the #GParamSpec for the property, or
     *          null if the class doesn't have a property of that name
     */
    public fun findProperty(propertyName: String): ParamSpec =
        g_object_class_find_property(gobjectObjectClassPointer, propertyName)!!.run {
            ParamSpec.ParamSpecImpl(this)
        }

    /**
     * Installs a new property.
     *
     * All properties should be installed during the class initializer.  It
     * is possible to install properties after that, but doing so is not
     * recommend, and specifically, is not guaranteed to be thread-safe vs.
     * use of properties on the same type on other threads.
     *
     * Note that it is possible to redefine a property in a derived class,
     * by installing a property with the same name. This can be useful at times,
     * e.g. to change the range of allowed values or the default value.
     *
     * @param propertyId the id for the new property
     * @param pspec the #GParamSpec for the new property
     */
    public fun installProperty(propertyId: guint, pspec: ParamSpec): Unit =
        g_object_class_install_property(gobjectObjectClassPointer, propertyId, pspec.gobjectParamSpecPointer)

    /**
     * Registers @property_id as referring to a property with the name
     * @name in a parent class or in an interface implemented by @oclass.
     * This allows this class to "override" a property implementation in
     * a parent class or to provide the implementation of a property from
     * an interface.
     *
     * Internally, overriding is implemented by creating a property of type
     * #GParamSpecOverride; generally operations that query the properties of
     * the object class, such as g_object_class_find_property() or
     * g_object_class_list_properties() will return the overridden
     * property. However, in one case, the @construct_properties argument of
     * the @constructor virtual function, the #GParamSpecOverride is passed
     * instead, so that the @param_id field of the #GParamSpec will be
     * correct.  For virtually all uses, this makes no difference. If you
     * need to get the overridden property, you can call
     * g_param_spec_get_redirect_target().
     *
     * @param propertyId the new property ID
     * @param name the name of a property registered in a parent class or
     *  in an interface of this class.
     * @since 2.4
     */
    @GObjectVersion2_4
    public fun overrideProperty(propertyId: guint, name: String): Unit =
        g_object_class_override_property(gobjectObjectClassPointer, propertyId, name)
}
