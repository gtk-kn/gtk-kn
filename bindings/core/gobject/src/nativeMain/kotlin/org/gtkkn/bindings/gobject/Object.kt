// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gobject.annotations.GObjectVersion2_10
import org.gtkkn.bindings.gobject.annotations.GObjectVersion2_26
import org.gtkkn.bindings.gobject.annotations.GObjectVersion2_4
import org.gtkkn.bindings.gobject.annotations.GObjectVersion2_70
import org.gtkkn.bindings.gobject.annotations.GObjectVersion2_8
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.extensions.gobject.associateCustomObject
import org.gtkkn.native.gobject.GObject
import org.gtkkn.native.gobject.GParamSpec
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_object_add_toggle_ref
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
import org.gtkkn.native.gobject.g_object_remove_toggle_ref
import org.gtkkn.native.gobject.g_object_run_dispose
import org.gtkkn.native.gobject.g_object_set_property
import org.gtkkn.native.gobject.g_object_take_ref
import org.gtkkn.native.gobject.g_object_thaw_notify
import org.gtkkn.native.gobject.g_object_unref
import org.gtkkn.native.gobject.g_object_watch_closure
import org.gtkkn.native.gobject.g_object_weak_ref
import org.gtkkn.native.gobject.g_object_weak_unref
import org.gtkkn.native.gobject.g_signal_connect_data
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * The base object type.
 *
 * `GObject` is the fundamental type providing the common attributes and
 * methods for all object types in GTK, Pango and other libraries
 * based on GObject. The `GObject` class provides methods for object
 * construction and destruction, property access methods, and signal
 * support. Signals are described in detail [here][gobject-Signals].
 *
 * For a tutorial on implementing a new `GObject` class, see [How to define and
 * implement a new GObject](tutorial.html#how-to-define-and-implement-a-new-gobject).
 * For a list of naming conventions for GObjects and their methods, see the
 * [GType conventions](concepts.html#conventions). For the high-level concepts
 * behind GObject, read
 * [Instantiatable classed types: Objects](concepts.html#instantiatable-classed-types-objects).
 *
 * Since GLib 2.72, all `GObject`s are guaranteed to be aligned to at least the
 * alignment of the largest basic GLib type (typically this is `guint64` or
 * `gdouble`). If you need larger alignment for an element in a `GObject`, you
 * should allocate it on the heap (aligned), or arrange for your `GObject` to be
 * appropriately padded. This guarantee applies to the `GObject` (or derived)
 * struct, the `GObjectClass` (or derived) struct, and any private data allocated
 * by `G_ADD_PRIVATE()`.
 *
 * ## Skipped during bindings generation
 *
 * - method `add_weak_pointer`: In/Out parameter is not supported
 * - method `connect`: Varargs parameter is not supported
 * - method `disconnect`: Varargs parameter is not supported
 * - method `dup_data`: Return type gpointer is unsupported
 * - method `dup_qdata`: Return type gpointer is unsupported
 * - method `get`: Varargs parameter is not supported
 * - method `get_data`: Return type gpointer is unsupported
 * - method `get_qdata`: Return type gpointer is unsupported
 * - parameter `var_args`: va_list
 * - parameter `values`: Value
 * - method `remove_weak_pointer`: In/Out parameter is not supported
 * - parameter `oldval`: gpointer
 * - parameter `oldval`: gpointer
 * - method `set`: Varargs parameter is not supported
 * - parameter `data`: gpointer
 * - parameter `data`: gpointer
 * - parameter `data`: gpointer
 * - parameter `data`: gpointer
 * - parameter `var_args`: va_list
 * - parameter `values`: Value
 * - method `steal_data`: Return type gpointer is unsupported
 * - method `steal_qdata`: Return type gpointer is unsupported
 * - constructor `new`: Varargs parameter is not supported
 * - parameter `var_args`: va_list
 * - parameter `values`: Value
 * - parameter `parameters`: Parameter
 * - parameter `data`: gpointer
 * - parameter `n_properties_p`: n_properties_p: Out parameter is not supported
 */
public open class Object(pointer: CPointer<GObject>) : KGTyped {
    public val gPointer: CPointer<GObject>
    init {
        gPointer = pointer.reinterpret()
        associateCustomObject()
    }

    /**
     * Increases the reference count of the object by one and sets a
     * callback to be called when all other references to the object are
     * dropped, or when this is already the last reference to the object
     * and another reference is established.
     *
     * This functionality is intended for binding @object to a proxy
     * object managed by another memory manager. This is done with two
     * paired references: the strong reference added by
     * g_object_add_toggle_ref() and a reverse reference to the proxy
     * object which is either a strong reference or weak reference.
     *
     * The setup is that when there are no other references to @object,
     * only a weak reference is held in the reverse direction from @object
     * to the proxy object, but when there are other references held to
     * @object, a strong reference is held. The @notify callback is called
     * when the reference from @object to the proxy object should be
     * "toggled" from strong to weak (@is_last_ref true) or weak to strong
     * (@is_last_ref false).
     *
     * Since a (normal) reference must be held to the object before
     * calling g_object_add_toggle_ref(), the initial state of the reverse
     * link is always strong.
     *
     * Multiple toggle references may be added to the same gobject,
     * however if there are multiple toggle references to an object, none
     * of them will ever be notified until all but one are removed.  For
     * this reason, you should only ever use a toggle reference if there
     * is important state in the proxy object.
     *
     * Note that if you unref the object on another thread, then @notify might
     * still be invoked after g_object_remove_toggle_ref(), and the object argument
     * might be a dangling pointer. If the object is destroyed on other threads,
     * you must take care of that yourself.
     *
     * A g_object_add_toggle_ref() must be released with g_object_remove_toggle_ref().
     *
     * @param notify a function to call when this reference is the
     *  last reference to the object, or is no longer
     *  the last reference.
     * @since 2.8
     */
    @GObjectVersion2_8
    public open fun addToggleRef(notify: ToggleNotify): Unit = g_object_add_toggle_ref(
        gPointer.reinterpret(),
        ToggleNotifyFunc.reinterpret(),
        StableRef.create(notify).asCPointer()
    )

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
    @GObjectVersion2_26
    public open fun bindProperty(
        sourceProperty: String,
        target: Object,
        targetProperty: String,
        flags: BindingFlags,
    ): Binding = g_object_bind_property(
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
    @GObjectVersion2_26
    public open fun bindPropertyFull(
        sourceProperty: String,
        target: Object,
        targetProperty: String,
        flags: BindingFlags,
        transformTo: Closure,
        transformFrom: Closure,
    ): Binding = g_object_bind_property_with_closures(
        gPointer.reinterpret(),
        sourceProperty,
        target.gPointer.reinterpret(),
        targetProperty,
        flags.mask,
        transformTo.gobjectClosurePointer.reinterpret(),
        transformFrom.gobjectClosurePointer.reinterpret()
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
    @GObjectVersion2_10
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
    public open fun getProperty(propertyName: String, `value`: Value): Unit =
        g_object_get_property(gPointer.reinterpret(), propertyName, `value`.gobjectValuePointer.reinterpret())

    /**
     * Checks whether @object has a [floating][floating-ref] reference.
     *
     * @return true if @object has a floating reference
     * @since 2.10
     */
    @GObjectVersion2_10
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
    public open fun notify(propertyName: String): Unit = g_object_notify(gPointer.reinterpret(), propertyName)

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
     *   typedef enum
     *   {
     *     PROP_FOO = 1,
     *     PROP_LAST
     *   } MyObjectProperty;
     *
     *   static GParamSpec *properties[PROP_LAST];
     *
     *   static void
     *   my_object_class_init (MyObjectClass *klass)
     *   {
     *     properties[PROP_FOO] = g_param_spec_int ("foo", NULL, NULL,
     *                                              0, 100,
     *                                              50,
     *                                              G_PARAM_READWRITE | G_PARAM_STATIC_STRINGS);
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
    @GObjectVersion2_26
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
    public open fun ref(): Object = g_object_ref(gPointer.reinterpret())!!.run {
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
    @GObjectVersion2_10
    public open fun refSink(): Object = g_object_ref_sink(gPointer.reinterpret())!!.run {
        Object(reinterpret())
    }

    /**
     * Removes a reference added with g_object_add_toggle_ref(). The
     * reference count of the object is decreased by one.
     *
     * Note that if you unref the object on another thread, then @notify might
     * still be invoked after g_object_remove_toggle_ref(), and the object argument
     * might be a dangling pointer. If the object is destroyed on other threads,
     * you must take care of that yourself.
     *
     * @param notify a function to call when this reference is the
     *  last reference to the object, or is no longer
     *  the last reference.
     * @since 2.8
     */
    @GObjectVersion2_8
    public open fun removeToggleRef(notify: ToggleNotify): Unit = g_object_remove_toggle_ref(
        gPointer.reinterpret(),
        ToggleNotifyFunc.reinterpret(),
        StableRef.create(notify).asCPointer()
    )

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
    public open fun setProperty(propertyName: String, `value`: Value): Unit =
        g_object_set_property(gPointer.reinterpret(), propertyName, `value`.gobjectValuePointer.reinterpret())

    /**
     * If @object is floating, sink it.  Otherwise, do nothing.
     *
     * In other words, this function will convert a floating reference (if
     * present) into a full reference.
     *
     * Typically you want to use g_object_ref_sink() in order to
     * automatically do the correct thing with respect to floating or
     * non-floating references, but there is one specific scenario where
     * this function is helpful.
     *
     * The situation where this function is helpful is when creating an API
     * that allows the user to provide a callback function that returns a
     * GObject. We certainly want to allow the user the flexibility to
     * return a non-floating reference from this callback (for the case
     * where the object that is being returned already exists).
     *
     * At the same time, the API style of some popular GObject-based
     * libraries (such as Gtk) make it likely that for newly-created GObject
     * instances, the user can be saved some typing if they are allowed to
     * return a floating reference.
     *
     * Using this function on the return value of the user's callback allows
     * the user to do whichever is more convenient for them. The caller will
     * alway receives exactly one full reference to the value: either the
     * one that was returned in the first place, or a floating reference
     * that has been converted to a full reference.
     *
     * This function has an odd interaction when combined with
     * g_object_ref_sink() running at the same time in another thread on
     * the same #GObject instance. If g_object_ref_sink() runs first then
     * the result will be that the floating reference is converted to a hard
     * reference. If g_object_take_ref() runs first then the result will be
     * that the floating reference is converted to a hard reference and an
     * additional reference on top of that one is added. It is best to avoid
     * this situation.
     *
     * @return @object
     * @since 2.70
     */
    @GObjectVersion2_70
    public open fun takeRef(): Object = g_object_take_ref(gPointer.reinterpret())!!.run {
        Object(reinterpret())
    }

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
        g_object_watch_closure(gPointer.reinterpret(), closure.gobjectClosurePointer.reinterpret())

    /**
     * Adds a weak reference callback to an object. Weak references are
     * used for notification when an object is disposed. They are called
     * "weak references" because they allow you to safely hold a pointer
     * to an object without calling g_object_ref() (g_object_ref() adds a
     * strong reference, that is, forces the object to stay alive).
     *
     * Note that the weak references created by this method are not
     * thread-safe: they cannot safely be used in one thread if the
     * object's last g_object_unref() might happen in another thread.
     * Use #GWeakRef if thread-safety is required.
     *
     * @param notify callback to invoke before the object is freed
     */
    public open fun weakRef(notify: WeakNotify): Unit =
        g_object_weak_ref(gPointer.reinterpret(), WeakNotifyFunc.reinterpret(), StableRef.create(notify).asCPointer())

    /**
     * Removes a weak reference callback to an object.
     *
     * @param notify callback to search for
     */
    public open fun weakUnref(notify: WeakNotify): Unit =
        g_object_weak_unref(gPointer.reinterpret(), WeakNotifyFunc.reinterpret(), StableRef.create(notify).asCPointer())

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
     * @param handler the Callback to connect. Params: `pspec` the #GParamSpec of the property which changed.
     */
    public fun connectNotify(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (pspec: ParamSpec) -> Unit,
    ): ULong = g_signal_connect_data(
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
        @GObjectVersion2_4
        public fun interfaceFindProperty(gIface: TypeInterface, propertyName: String): ParamSpec =
            g_object_interface_find_property(gIface.gobjectTypeInterfacePointer.reinterpret(), propertyName)!!.run {
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
        @GObjectVersion2_4
        public fun interfaceInstallProperty(gIface: TypeInterface, pspec: ParamSpec): Unit =
            g_object_interface_install_property(
                gIface.gobjectTypeInterfacePointer.reinterpret(),
                pspec.gPointer.reinterpret()
            )

        /**
         * Get the GType of Object
         *
         * @return the GType
         */
        public fun getType(): GType = g_object_get_type()
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
