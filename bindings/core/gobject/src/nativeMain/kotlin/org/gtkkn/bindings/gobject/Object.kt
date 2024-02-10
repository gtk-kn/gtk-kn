// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.extensions.gobject.associateCustomObject
import org.gtkkn.native.gobject.GObject
import org.gtkkn.native.gobject.GParamSpec
import org.gtkkn.native.gobject.g_object_bind_property
import org.gtkkn.native.gobject.g_object_bind_property_with_closures
import org.gtkkn.native.gobject.g_object_force_floating
import org.gtkkn.native.gobject.g_object_freeze_notify
import org.gtkkn.native.gobject.g_object_get_property
import org.gtkkn.native.gobject.g_object_get_type
import org.gtkkn.native.gobject.g_object_interface_find_property
import org.gtkkn.native.gobject.g_object_interface_install_property
import org.gtkkn.native.gobject.g_object_is_floating
import org.gtkkn.native.gobject.g_object_notify
import org.gtkkn.native.gobject.g_object_notify_by_pspec
import org.gtkkn.native.gobject.g_object_ref
import org.gtkkn.native.gobject.g_object_ref_sink
import org.gtkkn.native.gobject.g_object_run_dispose
import org.gtkkn.native.gobject.g_object_set_property
import org.gtkkn.native.gobject.g_object_thaw_notify
import org.gtkkn.native.gobject.g_object_unref
import org.gtkkn.native.gobject.g_object_watch_closure
import org.gtkkn.native.gobject.g_signal_connect_data
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * The base object type.
 *
 * All the fields in the `GObject` structure are private to the implementation
 * and should never be accessed directly.
 *
 * Since GLib 2.72, all #GObjects are guaranteed to be aligned to at least the
 * alignment of the largest basic GLib type (typically this is #guint64 or
 * #gdouble). If you need larger alignment for an element in a #GObject, you
 * should allocate it on the heap (aligned), or arrange for your #GObject to be
 * appropriately padded. This guarantee applies to the #GObject (or derived)
 * struct, the #GObjectClass (or derived) struct, and any private data allocated
 * by G_ADD_PRIVATE().
 *
 * ## Skipped during bindings generation
 *
 * - method `bind_property_full`: g_object_bind_property_full is shadowedBy
 * bind_property_with_closures
 * - method `get_data`: Return type gpointer is unsupported
 * - method `get_qdata`: Return type gpointer is unsupported
 * - parameter `values`: Value
 * - parameter `data`: gpointer
 * - method `steal_data`: Return type gpointer is unsupported
 * - method `steal_qdata`: Return type gpointer is unsupported
 * - parameter `parameters`: Parameter
 * - parameter `data`: gpointer
 * - parameter `n_properties_p`: n_properties_p: Out parameter is not supported
 */
public open class Object(
    pointer: CPointer<GObject>,
) : KGTyped {
    public val gPointer: CPointer<GObject>

    init {
        gPointer = pointer.reinterpret()
        associateCustomObject()
    }

    /**
     * Creates a binding between @source_property on @source and @target_property
     * on @target.
     *
     * Whenever the @source_property is changed the @target_property is
     * updated using the same value. For instance:
     *
     * |[<!-- language="C" -->
     *   g_object_bind_property (action, "active", widget, "sensitive", 0);
     * ]|
     *
     * Will result in the "sensitive" property of the widget #GObject instance to be
     * updated with the same value of the "active" property of the action #GObject
     * instance.
     *
     * If @flags contains %G_BINDING_BIDIRECTIONAL then the binding will be mutual:
     * if @target_property on @target changes then the @source_property on @source
     * will be updated as well.
     *
     * The binding will automatically be removed when either the @source or the
     * @target instances are finalized. To remove the binding without affecting the
     * @source and the @target you can just call g_object_unref() on the returned
     * #GBinding instance.
     *
     * Removing the binding by calling g_object_unref() on it must only be done if
     * the binding, @source and @target are only used from a single thread and it
     * is clear that both @source and @target outlive the binding. Especially it
     * is not safe to rely on this if the binding, @source or @target can be
     * finalized from different threads. Keep another reference to the binding and
     * use g_binding_unbind() instead to be on the safe side.
     *
     * A #GObject can have multiple bindings.
     *
     * @param sourceProperty the property on @source to bind
     * @param target the target #GObject
     * @param targetProperty the property on @target to bind
     * @param flags flags to pass to #GBinding
     * @return the #GBinding instance representing the
     *     binding between the two #GObject instances. The binding is released
     *     whenever the #GBinding reference count reaches zero.
     * @since 2.26
     */
    public open fun bindProperty(
        sourceProperty: String,
        target: Object,
        targetProperty: String,
        flags: BindingFlags,
    ): Binding =
        g_object_bind_property(
            gPointer.reinterpret(),
            sourceProperty,
            target.gPointer.reinterpret(),
            targetProperty,
            flags.mask
        )!!.run {
            Binding(reinterpret())
        }

    /**
     * Creates a binding between @source_property on @source and @target_property
     * on @target, allowing you to set the transformation functions to be used by
     * the binding.
     *
     * This function is the language bindings friendly version of
     * g_object_bind_property_full(), using #GClosures instead of
     * function pointers.
     *
     * @param sourceProperty the property on @source to bind
     * @param target the target #GObject
     * @param targetProperty the property on @target to bind
     * @param flags flags to pass to #GBinding
     * @param transformTo a #GClosure wrapping the transformation function
     *     from the @source to the @target, or null to use the default
     * @param transformFrom a #GClosure wrapping the transformation function
     *     from the @target to the @source, or null to use the default
     * @return the #GBinding instance representing the
     *     binding between the two #GObject instances. The binding is released
     *     whenever the #GBinding reference count reaches zero.
     * @since 2.26
     */
    public open fun bindPropertyFull(
        sourceProperty: String,
        target: Object,
        targetProperty: String,
        flags: BindingFlags,
        transformTo: Closure,
        transformFrom: Closure,
    ): Binding =
        g_object_bind_property_with_closures(
            gPointer.reinterpret(),
            sourceProperty,
            target.gPointer.reinterpret(),
            targetProperty,
            flags.mask,
            transformTo.gobjectClosurePointer,
            transformFrom.gobjectClosurePointer
        )!!.run {
            Binding(reinterpret())
        }

    /**
     * This function is intended for #GObject implementations to re-enforce
     * a [floating][floating-ref] object reference. Doing this is seldom
     * required: all #GInitiallyUnowneds are created with a floating reference
     * which usually just needs to be sunken by calling g_object_ref_sink().
     *
     * @since 2.10
     */
    public open fun forceFloating(): Unit = g_object_force_floating(gPointer.reinterpret())

    /**
     * Increases the freeze count on @object. If the freeze count is
     * non-zero, the emission of "notify" signals on @object is
     * stopped. The signals are queued until the freeze count is decreased
     * to zero. Duplicate notifications are squashed so that at most one
     * #GObject::notify signal is emitted for each property modified while the
     * object is frozen.
     *
     * This is necessary for accessors that modify multiple properties to prevent
     * premature notification while the object is still being modified.
     */
    public open fun freezeNotify(): Unit = g_object_freeze_notify(gPointer.reinterpret())

    /**
     * Gets a property of an object.
     *
     * The @value can be:
     *
     *  - an empty #GValue initialized by %G_VALUE_INIT, which will be
     *    automatically initialized with the expected type of the property
     *    (since GLib 2.60)
     *  - a #GValue initialized with the expected type of the property
     *  - a #GValue initialized with a type to which the expected type
     *    of the property can be transformed
     *
     * In general, a copy is made of the property contents and the caller is
     * responsible for freeing the memory by calling g_value_unset().
     *
     * Note that g_object_get_property() is really intended for language
     * bindings, g_object_get() is much more convenient for C programming.
     *
     * @param propertyName the name of the property to get
     * @param value return location for the property value
     */
    public open fun getProperty(
        propertyName: String,
        `value`: Value,
    ): Unit = g_object_get_property(gPointer.reinterpret(), propertyName, `value`.gobjectValuePointer)

    /**
     * Checks whether @object has a [floating][floating-ref] reference.
     *
     * @return true if @object has a floating reference
     * @since 2.10
     */
    public open fun isFloating(): Boolean = g_object_is_floating(gPointer.reinterpret()).asBoolean()

    /**
     * Emits a "notify" signal for the property @property_name on @object.
     *
     * When possible, eg. when signaling a property change from within the class
     * that registered the property, you should use g_object_notify_by_pspec()
     * instead.
     *
     * Note that emission of the notify signal may be blocked with
     * g_object_freeze_notify(). In this case, the signal emissions are queued
     * and will be emitted (in reverse order) when g_object_thaw_notify() is
     * called.
     *
     * @param propertyName the name of a property installed on the class of @object.
     */
    public open fun notify(propertyName: String): Unit =
        g_object_notify(
            gPointer.reinterpret(),
            propertyName
        )

    /**
     * Emits a "notify" signal for the property specified by @pspec on @object.
     *
     * This function omits the property name lookup, hence it is faster than
     * g_object_notify().
     *
     * One way to avoid using g_object_notify() from within the
     * class that registered the properties, and using g_object_notify_by_pspec()
     * instead, is to store the GParamSpec used with
     * g_object_class_install_property() inside a static array, e.g.:
     *
     * |[<!-- language="C" -->
     *   enum
     *   {
     *     PROP_0,
     *     PROP_FOO,
     *     PROP_LAST
     *   };
     *
     *   static GParamSpec *properties[PROP_LAST];
     *
     *   static void
     *   my_object_class_init (MyObjectClass *klass)
     *   {
     *     properties[PROP_FOO] = g_param_spec_int ("foo", "Foo", "The foo",
     *                                              0, 100,
     *                                              50,
     *                                              G_PARAM_READWRITE);
     *     g_object_class_install_property (gobject_class,
     *                                      PROP_FOO,
     *                                      properties[PROP_FOO]);
     *   }
     * ]|
     *
     * and then notify a change on the "foo" property with:
     *
     * |[<!-- language="C" -->
     *   g_object_notify_by_pspec (self, properties[PROP_FOO]);
     * ]|
     *
     * @param pspec the #GParamSpec of a property installed on the class of @object.
     * @since 2.26
     */
    public open fun notifyByPspec(pspec: ParamSpec): Unit =
        g_object_notify_by_pspec(gPointer.reinterpret(), pspec.gPointer.reinterpret())

    /**
     * Increases the reference count of @object.
     *
     * Since GLib 2.56, if `GLIB_VERSION_MAX_ALLOWED` is 2.56 or greater, the type
     * of @object will be propagated to the return type (using the GCC typeof()
     * extension), so any casting the caller needs to do on the return type must be
     * explicit.
     *
     * @return the same @object
     */
    public open fun ref(): Object =
        g_object_ref(gPointer.reinterpret())!!.run {
            Object(reinterpret())
        }

    /**
     * Increase the reference count of @object, and possibly remove the
     * [floating][floating-ref] reference, if @object has a floating reference.
     *
     * In other words, if the object is floating, then this call "assumes
     * ownership" of the floating reference, converting it to a normal
     * reference by clearing the floating flag while leaving the reference
     * count unchanged.  If the object is not floating, then this call
     * adds a new normal reference increasing the reference count by one.
     *
     * Since GLib 2.56, the type of @object will be propagated to the return type
     * under the same conditions as for g_object_ref().
     *
     * @return @object
     * @since 2.10
     */
    public open fun refSink(): Object =
        g_object_ref_sink(gPointer.reinterpret())!!.run {
            Object(reinterpret())
        }

    /**
     * Releases all references to other objects. This can be used to break
     * reference cycles.
     *
     * This function should only be called from object system implementations.
     */
    public open fun runDispose(): Unit = g_object_run_dispose(gPointer.reinterpret())

    /**
     * Sets a property on an object.
     *
     * @param propertyName the name of the property to set
     * @param value the value
     */
    public open fun setProperty(
        propertyName: String,
        `value`: Value,
    ): Unit = g_object_set_property(gPointer.reinterpret(), propertyName, `value`.gobjectValuePointer)

    /**
     * Reverts the effect of a previous call to
     * g_object_freeze_notify(). The freeze count is decreased on @object
     * and when it reaches zero, queued "notify" signals are emitted.
     *
     * Duplicate notifications for each property are squashed so that at most one
     * #GObject::notify signal is emitted for each property, in the reverse order
     * in which they have been queued.
     *
     * It is an error to call this function when the freeze count is zero.
     */
    public open fun thawNotify(): Unit = g_object_thaw_notify(gPointer.reinterpret())

    /**
     * Decreases the reference count of @object. When its reference count
     * drops to 0, the object is finalized (i.e. its memory is freed).
     *
     * If the pointer to the #GObject may be reused in future (for example, if it is
     * an instance variable of another object), it is recommended to clear the
     * pointer to null rather than retain a dangling pointer to a potentially
     * invalid #GObject instance. Use g_clear_object() for this.
     */
    public open fun unref(): Unit = g_object_unref(gPointer.reinterpret())

    /**
     * This function essentially limits the life time of the @closure to
     * the life time of the object. That is, when the object is finalized,
     * the @closure is invalidated by calling g_closure_invalidate() on
     * it, in order to prevent invocations of the closure with a finalized
     * (nonexisting) object. Also, g_object_ref() and g_object_unref() are
     * added as marshal guards to the @closure, to ensure that an extra
     * reference count is held on @object during invocation of the
     * @closure.  Usually, this function will be called on closures that
     * use this @object as closure data.
     *
     * @param closure #GClosure to watch
     */
    public open fun watchClosure(closure: Closure): Unit =
        g_object_watch_closure(gPointer.reinterpret(), closure.gobjectClosurePointer)

    /**
     * The notify signal is emitted on an object when one of its properties has
     * its value set through g_object_set_property(), g_object_set(), et al.
     *
     * Note that getting this signal doesn’t itself guarantee that the value of
     * the property has actually changed. When it is emitted is determined by the
     * derived GObject class. If the implementor did not create the property with
     * %G_PARAM_EXPLICIT_NOTIFY, then any call to g_object_set_property() results
     * in ::notify being emitted, even if the new value is the same as the old.
     * If they did pass %G_PARAM_EXPLICIT_NOTIFY, then this signal is emitted only
     * when they explicitly call g_object_notify() or g_object_notify_by_pspec(),
     * and common practice is to do that only when the value has actually changed.
     *
     * This signal is typically used to obtain change notification for a
     * single property, by specifying the property name as a detail in the
     * g_signal_connect() call, like this:
     *
     * |[<!-- language="C" -->
     * g_signal_connect (text_view->buffer, "notify::paste-target-list",
     *                   G_CALLBACK (gtk_text_view_target_list_notify),
     *                   text_view)
     * ]|
     *
     * It is important to note that you must use
     * [canonical parameter names][canonical-parameter-names] as
     * detail strings for the notify signal.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `pspec` the #GParamSpec of the property which
     * changed.
     */
    public fun connectNotify(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (pspec: ParamSpec) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "notify",
            connectNotifyFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<Object> {
        override val type: GeneratedClassKGType<Object> =
            GeneratedClassKGType(g_object_get_type()) { Object(it.reinterpret()) }

        init {
            GobjectTypeProvider.register()
        }

        /**
         * Find the #GParamSpec with the given name for an
         * interface. Generally, the interface vtable passed in as @g_iface
         * will be the default vtable from g_type_default_interface_ref(), or,
         * if you know the interface has already been loaded,
         * g_type_default_interface_peek().
         *
         * @param gIface any interface vtable for the
         *  interface, or the default vtable for the interface
         * @param propertyName name of a property to look up.
         * @return the #GParamSpec for the property of the
         *          interface with the name @property_name, or null if no
         *          such property exists.
         * @since 2.4
         */
        public fun interfaceFindProperty(
            gIface: TypeInterface,
            propertyName: String,
        ): ParamSpec =
            g_object_interface_find_property(
                gIface.gobjectTypeInterfacePointer,
                propertyName
            )!!.run {
                ParamSpec(reinterpret())
            }

        /**
         * Add a property to an interface; this is only useful for interfaces
         * that are added to GObject-derived types. Adding a property to an
         * interface forces all objects classes with that interface to have a
         * compatible property. The compatible property could be a newly
         * created #GParamSpec, but normally
         * g_object_class_override_property() will be used so that the object
         * class only needs to provide an implementation and inherits the
         * property description, default value, bounds, and so forth from the
         * interface property.
         *
         * This function is meant to be called from the interface's default
         * vtable initialization function (the @class_init member of
         * #GTypeInfo.) It must not be called after after @class_init has
         * been called for any object types implementing this interface.
         *
         * If @pspec is a floating reference, it will be consumed.
         *
         * @param gIface any interface vtable for the
         *    interface, or the default
         *  vtable for the interface.
         * @param pspec the #GParamSpec for the new property
         * @since 2.4
         */
        public fun interfaceInstallProperty(
            gIface: TypeInterface,
            pspec: ParamSpec,
        ): Unit =
            g_object_interface_install_property(
                gIface.gobjectTypeInterfacePointer,
                pspec.gPointer.reinterpret()
            )
    }
}

private val connectNotifyFunc: CPointer<CFunction<(CPointer<GParamSpec>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            pspec: CPointer<GParamSpec>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(pspec: ParamSpec) -> Unit>().get().invoke(
            pspec!!.run {
                ParamSpec(reinterpret())
            }
        )
    }
        .reinterpret()
