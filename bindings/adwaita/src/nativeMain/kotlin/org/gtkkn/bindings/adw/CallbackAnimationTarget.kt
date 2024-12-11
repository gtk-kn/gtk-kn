// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwCallbackAnimationTarget
import org.gtkkn.native.adw.adw_callback_animation_target_get_type
import org.gtkkn.native.adw.adw_callback_animation_target_new
import org.gtkkn.native.gobject.GType

/**
 * An [class@AnimationTarget] that calls a given callback during the
 * animation.
 */
public class CallbackAnimationTarget(pointer: CPointer<AdwCallbackAnimationTarget>) :
    AnimationTarget(pointer.reinterpret()),
    KGTyped {
    public val adwCallbackAnimationTargetPointer: CPointer<AdwCallbackAnimationTarget>
        get() = gPointer.reinterpret()

    /**
     * Creates a new `AdwAnimationTarget` that calls the given @callback during
     * the animation.
     *
     * @param callback the callback to call
     * @return the newly created callback target
     */
    public constructor(
        callback: AnimationTargetFunc,
    ) : this(
        adw_callback_animation_target_new(
            AnimationTargetFuncFunc.reinterpret(),
            StableRef.create(callback).asCPointer(),
            staticStableRefDestroy.reinterpret()
        )!!.reinterpret()
    )

    public companion object : TypeCompanion<CallbackAnimationTarget> {
        override val type: GeneratedClassKGType<CallbackAnimationTarget> =
            GeneratedClassKGType(adw_callback_animation_target_get_type()) {
                CallbackAnimationTarget(it.reinterpret())
            }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of CallbackAnimationTarget
         *
         * @return the GType
         */
        public fun getType(): GType = adw_callback_animation_target_get_type()
    }
}
