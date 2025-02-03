// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.adw.annotations.AdwVersion1_2
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gobject.ParamSpec
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.adw.AdwPropertyAnimationTarget
import org.gtkkn.native.adw.adw_property_animation_target_get_object
import org.gtkkn.native.adw.adw_property_animation_target_get_pspec
import org.gtkkn.native.adw.adw_property_animation_target_get_type
import org.gtkkn.native.adw.adw_property_animation_target_new
import org.gtkkn.native.adw.adw_property_animation_target_new_for_pspec
import org.gtkkn.native.gobject.GType
import kotlin.String

/**
 * An [class@AnimationTarget] changing the value of a property of a
 * [class@GObject.Object] instance.
 * @since 1.2
 */
@AdwVersion1_2
public class PropertyAnimationTarget(
    public val adwPropertyAnimationTargetPointer: CPointer<AdwPropertyAnimationTarget>,
) : AnimationTarget(adwPropertyAnimationTargetPointer.reinterpret()),
    KGTyped {
    init {
        Adw
    }

    /**
     * The object whose property will be animated.
     *
     * The `AdwPropertyAnimationTarget` instance does not hold a strong reference
     * on the object; make sure the object is kept alive throughout the target's
     * lifetime.
     *
     * @since 1.2
     */
    @AdwVersion1_2
    public val `object`: Object
        /**
         * Gets the object animated by @self.
         *
         * The `AdwPropertyAnimationTarget` instance does not hold a strong reference on
         * the object; make sure the object is kept alive throughout the target's
         * lifetime.
         *
         * @return the animated object
         * @since 1.2
         */
        get() = adw_property_animation_target_get_object(adwPropertyAnimationTargetPointer)!!.run {
            InstanceCache.get(this, true) { Object(reinterpret()) }!!
        }

    /**
     * The `GParamSpec` of the property to be animated.
     *
     * @since 1.2
     */
    @AdwVersion1_2
    public val pspec: ParamSpec
        /**
         * Gets the `GParamSpec` of the property animated by @self.
         *
         * @return the animated property's `GParamSpec`
         * @since 1.2
         */
        get() = adw_property_animation_target_get_pspec(adwPropertyAnimationTargetPointer)!!.run {
            ParamSpec.ParamSpecImpl(this)
        }

    /**
     * Creates a new `AdwPropertyAnimationTarget` for the @property_name property on
     * @object.
     *
     * @param object an object to be animated
     * @param propertyName the name of the property on @object to animate
     * @return the newly created `AdwPropertyAnimationTarget`
     * @since 1.2
     */
    public constructor(
        `object`: Object,
        propertyName: String,
    ) : this(adw_property_animation_target_new(`object`.gobjectObjectPointer, propertyName)!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * Creates a new `AdwPropertyAnimationTarget` for the @pspec property on
     * @object.
     *
     * @param object an object to be animated
     * @param pspec the param spec of the property on @object to animate
     * @return new newly created `AdwPropertyAnimationTarget`
     * @since 1.2
     */
    public constructor(
        `object`: Object,
        pspec: ParamSpec,
    ) : this(
        adw_property_animation_target_new_for_pspec(
            `object`.gobjectObjectPointer,
            pspec.gobjectParamSpecPointer
        )!!.reinterpret()
    ) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<PropertyAnimationTarget> {
        override val type: GeneratedClassKGType<PropertyAnimationTarget> =
            GeneratedClassKGType(getTypeOrNull()!!) { PropertyAnimationTarget(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of PropertyAnimationTarget
         *
         * @return the GType
         */
        public fun getType(): GType = adw_property_animation_target_get_type()

        /**
         * Gets the GType of from the symbol `adw_property_animation_target_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("adw_property_animation_target_get_type")
    }
}
