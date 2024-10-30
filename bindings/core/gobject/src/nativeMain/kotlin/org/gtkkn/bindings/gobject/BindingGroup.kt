// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GBindingGroup
import org.gtkkn.native.gobject.g_binding_group_bind
import org.gtkkn.native.gobject.g_binding_group_bind_with_closures
import org.gtkkn.native.gobject.g_binding_group_dup_source
import org.gtkkn.native.gobject.g_binding_group_get_type
import org.gtkkn.native.gobject.g_binding_group_new
import org.gtkkn.native.gobject.g_binding_group_set_source
import kotlin.String
import kotlin.Unit

/**
 * `GBindingGroup` can be used to bind multiple properties
 * from an object collectively.
 *
 * Use the various methods to bind properties from a single source
 * object to multiple destination objects. Properties can be bound
 * bidirectionally and are connected when the source object is set
 * with [method@GObject.BindingGroup.set_source].
 *
 * ## Skipped during bindings generation
 *
 * - method `bind_full`: g_binding_group_bind_full is shadowedBy bind_with_closures
 * - method `source`: Property has no getter
 *
 * @since 2.72
 */
public open class BindingGroup(
    pointer: CPointer<GBindingGroup>,
) : Object(pointer.reinterpret()),
    KGTyped {
    public val gobjectBindingGroupPointer: CPointer<GBindingGroup>
        get() = gPointer.reinterpret()

    /**
     * Creates a new #GBindingGroup.
     *
     * @return a new #GBindingGroup
     * @since 2.72
     */
    public constructor() : this(g_binding_group_new()!!.reinterpret())

    /**
     * Creates a binding between @source_property on the source object
     * and @target_property on @target. Whenever the @source_property
     * is changed the @target_property is updated using the same value.
     * The binding flag %G_BINDING_SYNC_CREATE is automatically specified.
     *
     * See g_object_bind_property() for more information.
     *
     * @param sourceProperty the property on the source to bind
     * @param target the target #GObject
     * @param targetProperty the property on @target to bind
     * @param flags the flags used to create the #GBinding
     * @since 2.72
     */
    public open fun bind(
        sourceProperty: String,
        target: Object,
        targetProperty: String,
        flags: BindingFlags,
    ): Unit =
        g_binding_group_bind(
            gobjectBindingGroupPointer.reinterpret(),
            sourceProperty,
            target.gPointer.reinterpret(),
            targetProperty,
            flags.mask
        )

    /**
     * Creates a binding between @source_property on the source object and
     * @target_property on @target, allowing you to set the transformation
     * functions to be used by the binding. The binding flag
     * %G_BINDING_SYNC_CREATE is automatically specified.
     *
     * This function is the language bindings friendly version of
     * g_binding_group_bind_property_full(), using #GClosures
     * instead of function pointers.
     *
     * See g_object_bind_property_with_closures() for more information.
     *
     * @param sourceProperty the property on the source to bind
     * @param target the target #GObject
     * @param targetProperty the property on @target to bind
     * @param flags the flags used to create the #GBinding
     * @param transformTo a #GClosure wrapping the
     *     transformation function from the source object to the @target,
     *     or null to use the default
     * @param transformFrom a #GClosure wrapping the
     *     transformation function from the @target to the source object,
     *     or null to use the default
     * @since 2.72
     */
    public open fun bindFull(
        sourceProperty: String,
        target: Object,
        targetProperty: String,
        flags: BindingFlags,
        transformTo: Closure? = null,
        transformFrom: Closure? = null,
    ): Unit =
        g_binding_group_bind_with_closures(
            gobjectBindingGroupPointer.reinterpret(),
            sourceProperty,
            target.gPointer.reinterpret(),
            targetProperty,
            flags.mask,
            transformTo?.gobjectClosurePointer,
            transformFrom?.gobjectClosurePointer
        )

    /**
     * Gets the source object used for binding properties.
     *
     * @return a #GObject or null.
     * @since 2.72
     */
    public open fun dupSource(): Object? =
        g_binding_group_dup_source(gobjectBindingGroupPointer.reinterpret())?.run {
            Object(reinterpret())
        }

    /**
     * Sets @source as the source object used for creating property
     * bindings. If there is already a source object all bindings from it
     * will be removed.
     *
     * Note that all properties that have been bound must exist on @source.
     *
     * @param source the source #GObject,
     *   or null to clear it
     * @since 2.72
     */
    public open fun setSource(source: Object? = null): Unit =
        g_binding_group_set_source(gobjectBindingGroupPointer.reinterpret(), source?.gPointer?.reinterpret())

    public companion object : TypeCompanion<BindingGroup> {
        override val type: GeneratedClassKGType<BindingGroup> =
            GeneratedClassKGType(g_binding_group_get_type()) { BindingGroup(it.reinterpret()) }

        init {
            GobjectTypeProvider.register()
        }
    }
}
