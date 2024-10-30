// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GBinding
import org.gtkkn.native.gobject.g_binding_dup_source
import org.gtkkn.native.gobject.g_binding_dup_target
import org.gtkkn.native.gobject.g_binding_get_flags
import org.gtkkn.native.gobject.g_binding_get_source
import org.gtkkn.native.gobject.g_binding_get_source_property
import org.gtkkn.native.gobject.g_binding_get_target
import org.gtkkn.native.gobject.g_binding_get_target_property
import org.gtkkn.native.gobject.g_binding_get_type
import org.gtkkn.native.gobject.g_binding_unbind
import kotlin.String
import kotlin.Unit

/**
 * `GObject` instance (or source) and another property on another `GObject`
 * instance (or target).
 *
 * Whenever the source property changes, the same value is applied to the
 * target property; for instance, the following binding:
 *
 * ```c
 *   g_object_bind_property (object1, "property-a",
 *                           object2, "property-b",
 *                           G_BINDING_DEFAULT);
 * ```
 *
 * will cause the property named "property-b" of @object2 to be updated
 * every time [method@GObject.set] or the specific accessor changes the value of
 * the property "property-a" of @object1.
 *
 * It is possible to create a bidirectional binding between two properties
 * of two `GObject` instances, so that if either property changes, the
 * other is updated as well, for instance:
 *
 * ```c
 *   g_object_bind_property (object1, "property-a",
 *                           object2, "property-b",
 *                           G_BINDING_BIDIRECTIONAL);
 * ```
 *
 * will keep the two properties in sync.
 *
 * It is also possible to set a custom transformation function (in both
 * directions, in case of a bidirectional binding) to apply a custom
 * transformation from the source value to the target value before
 * applying it; for instance, the following binding:
 *
 * ```c
 *   g_object_bind_property_full (adjustment1, "value",
 *                                adjustment2, "value",
 *                                G_BINDING_BIDIRECTIONAL,
 *                                celsius_to_fahrenheit,
 *                                fahrenheit_to_celsius,
 *                                NULL, NULL);
 * ```
 *
 * will keep the "value" property of the two adjustments in sync; the
 * @celsius_to_fahrenheit function will be called whenever the "value"
 * property of @adjustment1 changes and will transform the current value
 * of the property before applying it to the "value" property of @adjustment2.
 *
 * Vice versa, the @fahrenheit_to_celsius function will be called whenever
 * the "value" property of @adjustment2 changes, and will transform the
 * current value of the property before applying it to the "value" property
 * of @adjustment1.
 *
 * Note that #GBinding does not resolve cycles by itself; a cycle like
 *
 * ```
 *   object1:propertyA -> object2:propertyB
 *   object2:propertyB -> object3:propertyC
 *   object3:propertyC -> object1:propertyA
 * ```
 *
 * might lead to an infinite loop. The loop, in this particular case,
 * can be avoided if the objects emit the `GObject::notify` signal only
 * if the value has effectively been changed. A binding is implemented
 * using the `GObject::notify` signal, so it is susceptible to all the
 * various ways of blocking a signal emission, like [func@GObject.signal_stop_emission]
 * or [func@GObject.signal_handler_block].
 *
 * A binding will be severed, and the resources it allocates freed, whenever
 * either one of the `GObject` instances it refers to are finalized, or when
 * the #GBinding instance loses its last reference.
 *
 * Bindings for languages with garbage collection can use
 * [method@GObject.Binding.unbind] to explicitly release a binding between the source
 * and target properties, instead of relying on the last reference on the
 * binding, source, and target instances to drop.
 * @since 2.26
 */
public open class Binding(
    pointer: CPointer<GBinding>,
) : Object(pointer.reinterpret()),
    KGTyped {
    public val gobjectBindingPointer: CPointer<GBinding>
        get() = gPointer.reinterpret()

    /**
     * Flags to be used to control the #GBinding
     *
     * @since 2.26
     */
    public open val flags: BindingFlags
        /**
         * Retrieves the flags passed when constructing the #GBinding.
         *
         * @return the #GBindingFlags used by the #GBinding
         * @since 2.26
         */
        get() =
            g_binding_get_flags(gobjectBindingPointer.reinterpret()).run {
                BindingFlags(this)
            }

    /**
     * The #GObject that should be used as the source of the binding
     *
     * @since 2.26
     */
    public open val source: Object?
        /**
         * Retrieves the #GObject instance used as the source of the binding.
         *
         * A #GBinding can outlive the source #GObject as the binding does not hold a
         * strong reference to the source. If the source is destroyed before the
         * binding then this function will return null.
         *
         * Use g_binding_dup_source() if the source or binding are used from different
         * threads as otherwise the pointer returned from this function might become
         * invalid if the source is finalized from another thread in the meantime.
         *
         * @return the source #GObject, or null if the
         *     source does not exist any more.
         * @since 2.26
         */
        get() =
            g_binding_get_source(gobjectBindingPointer.reinterpret())?.run {
                Object(reinterpret())
            }

    /**
     * The name of the property of #GBinding:source that should be used
     * as the source of the binding.
     *
     * This should be in [canonical form][canonical-parameter-names] to get the
     * best performance.
     *
     * @since 2.26
     */
    public open val sourceProperty: String
        /**
         * Retrieves the name of the property of #GBinding:source used as the source
         * of the binding.
         *
         * @return the name of the source property
         * @since 2.26
         */
        get() =
            g_binding_get_source_property(gobjectBindingPointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

    /**
     * The #GObject that should be used as the target of the binding
     *
     * @since 2.26
     */
    public open val target: Object?
        /**
         * Retrieves the #GObject instance used as the target of the binding.
         *
         * A #GBinding can outlive the target #GObject as the binding does not hold a
         * strong reference to the target. If the target is destroyed before the
         * binding then this function will return null.
         *
         * Use g_binding_dup_target() if the target or binding are used from different
         * threads as otherwise the pointer returned from this function might become
         * invalid if the target is finalized from another thread in the meantime.
         *
         * @return the target #GObject, or null if the
         *     target does not exist any more.
         * @since 2.26
         */
        get() =
            g_binding_get_target(gobjectBindingPointer.reinterpret())?.run {
                Object(reinterpret())
            }

    /**
     * The name of the property of #GBinding:target that should be used
     * as the target of the binding.
     *
     * This should be in [canonical form][canonical-parameter-names] to get the
     * best performance.
     *
     * @since 2.26
     */
    public open val targetProperty: String
        /**
         * Retrieves the name of the property of #GBinding:target used as the target
         * of the binding.
         *
         * @return the name of the target property
         * @since 2.26
         */
        get() =
            g_binding_get_target_property(gobjectBindingPointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

    /**
     * Retrieves the #GObject instance used as the source of the binding.
     *
     * A #GBinding can outlive the source #GObject as the binding does not hold a
     * strong reference to the source. If the source is destroyed before the
     * binding then this function will return null.
     *
     * @return the source #GObject, or null if the
     *     source does not exist any more.
     * @since 2.68
     */
    public open fun dupSource(): Object? =
        g_binding_dup_source(gobjectBindingPointer.reinterpret())?.run {
            Object(reinterpret())
        }

    /**
     * Retrieves the #GObject instance used as the target of the binding.
     *
     * A #GBinding can outlive the target #GObject as the binding does not hold a
     * strong reference to the target. If the target is destroyed before the
     * binding then this function will return null.
     *
     * @return the target #GObject, or null if the
     *     target does not exist any more.
     * @since 2.68
     */
    public open fun dupTarget(): Object? =
        g_binding_dup_target(gobjectBindingPointer.reinterpret())?.run {
            Object(reinterpret())
        }

    /**
     * Retrieves the flags passed when constructing the #GBinding.
     *
     * @return the #GBindingFlags used by the #GBinding
     * @since 2.26
     */
    public open fun getFlags(): BindingFlags =
        g_binding_get_flags(gobjectBindingPointer.reinterpret()).run {
            BindingFlags(this)
        }

    /**
     * Retrieves the #GObject instance used as the source of the binding.
     *
     * A #GBinding can outlive the source #GObject as the binding does not hold a
     * strong reference to the source. If the source is destroyed before the
     * binding then this function will return null.
     *
     * Use g_binding_dup_source() if the source or binding are used from different
     * threads as otherwise the pointer returned from this function might become
     * invalid if the source is finalized from another thread in the meantime.
     *
     * @return the source #GObject, or null if the
     *     source does not exist any more.
     * @since 2.26
     */
    public open fun getSource(): Object? =
        g_binding_get_source(gobjectBindingPointer.reinterpret())?.run {
            Object(reinterpret())
        }

    /**
     * Retrieves the name of the property of #GBinding:source used as the source
     * of the binding.
     *
     * @return the name of the source property
     * @since 2.26
     */
    public open fun getSourceProperty(): String =
        g_binding_get_source_property(gobjectBindingPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Retrieves the #GObject instance used as the target of the binding.
     *
     * A #GBinding can outlive the target #GObject as the binding does not hold a
     * strong reference to the target. If the target is destroyed before the
     * binding then this function will return null.
     *
     * Use g_binding_dup_target() if the target or binding are used from different
     * threads as otherwise the pointer returned from this function might become
     * invalid if the target is finalized from another thread in the meantime.
     *
     * @return the target #GObject, or null if the
     *     target does not exist any more.
     * @since 2.26
     */
    public open fun getTarget(): Object? =
        g_binding_get_target(gobjectBindingPointer.reinterpret())?.run {
            Object(reinterpret())
        }

    /**
     * Retrieves the name of the property of #GBinding:target used as the target
     * of the binding.
     *
     * @return the name of the target property
     * @since 2.26
     */
    public open fun getTargetProperty(): String =
        g_binding_get_target_property(gobjectBindingPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Explicitly releases the binding between the source and the target
     * property expressed by @binding.
     *
     * This function will release the reference that is being held on
     * the @binding instance if the binding is still bound; if you want to hold on
     * to the #GBinding instance after calling g_binding_unbind(), you will need
     * to hold a reference to it.
     *
     * Note however that this function does not take ownership of @binding, it
     * only unrefs the reference that was initially created by
     * g_object_bind_property() and is owned by the binding.
     *
     * @since 2.38
     */
    public open fun unbind(): Unit = g_binding_unbind(gobjectBindingPointer.reinterpret())

    public companion object : TypeCompanion<Binding> {
        override val type: GeneratedClassKGType<Binding> =
            GeneratedClassKGType(g_binding_get_type()) { Binding(it.reinterpret()) }

        init {
            GobjectTypeProvider.register()
        }
    }
}
