// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.adw.annotations.AdwVersion1_2
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gobject.ParamSpec
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwPropertyAnimationTarget
import org.gtkkn.native.adw.adw_property_animation_target_get_object
import org.gtkkn.native.adw.adw_property_animation_target_get_pspec
import org.gtkkn.native.adw.adw_property_animation_target_get_type
import org.gtkkn.native.adw.adw_property_animation_target_new
import org.gtkkn.native.adw.adw_property_animation_target_new_for_pspec
import kotlin.String

/**
 * An [class@AnimationTarget] changing the value of a property of a
 * [class@GObject.Object] instance.
 * @since 1.2
 */
@AdwVersion1_2
public class PropertyAnimationTarget(
    pointer: CPointer<AdwPropertyAnimationTarget>,
) : AnimationTarget(pointer.reinterpret()),
    KGTyped {
    public val adwPropertyAnimationTargetPointer: CPointer<AdwPropertyAnimationTarget>
        get() = gPointer.reinterpret()

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
        get() =
            adw_property_animation_target_get_object(adwPropertyAnimationTargetPointer.reinterpret())!!.run {
                Object(reinterpret())
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
        get() =
            adw_property_animation_target_get_pspec(adwPropertyAnimationTargetPointer.reinterpret())!!.run {
                ParamSpec(reinterpret())
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
    ) : this(adw_property_animation_target_new(`object`.gPointer.reinterpret(), propertyName)!!.reinterpret())

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
            `object`.gPointer.reinterpret(),
            pspec.gPointer.reinterpret()
        )!!.reinterpret()
    )

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
    @AdwVersion1_2
    public fun getObject(): Object =
        adw_property_animation_target_get_object(adwPropertyAnimationTargetPointer.reinterpret())!!.run {
            Object(reinterpret())
        }

    /**
     * Gets the `GParamSpec` of the property animated by @self.
     *
     * @return the animated property's `GParamSpec`
     * @since 1.2
     */
    @AdwVersion1_2
    public fun getPspec(): ParamSpec =
        adw_property_animation_target_get_pspec(adwPropertyAnimationTargetPointer.reinterpret())!!.run {
            ParamSpec(reinterpret())
        }

    public companion object : TypeCompanion<PropertyAnimationTarget> {
        override val type: GeneratedClassKGType<PropertyAnimationTarget> =
            GeneratedClassKGType(
                adw_property_animation_target_get_type()
            ) { PropertyAnimationTarget(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }
    }
}
