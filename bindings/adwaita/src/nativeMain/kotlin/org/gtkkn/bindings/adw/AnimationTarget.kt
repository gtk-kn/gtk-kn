// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwAnimationTarget
import org.gtkkn.native.adw.adw_animation_target_get_type
import org.gtkkn.native.gobject.GType

/**
 * Represents a value [class@Animation] can animate.
 */
public abstract class AnimationTarget(public val adwAnimationTargetPointer: CPointer<AdwAnimationTarget>) :
    Object(adwAnimationTargetPointer.reinterpret()),
    KGTyped {
    /**
     * The AnimationTargetImpl type represents a native instance of the abstract AnimationTarget class.
     *
     * @constructor Creates a new instance of AnimationTarget for the provided [CPointer].
     */
    public class AnimationTargetImpl(pointer: CPointer<AdwAnimationTarget>) : AnimationTarget(pointer)

    public companion object : TypeCompanion<AnimationTarget> {
        override val type: GeneratedClassKGType<AnimationTarget> =
            GeneratedClassKGType(adw_animation_target_get_type()) { AnimationTargetImpl(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of AnimationTarget
         *
         * @return the GType
         */
        public fun getType(): GType = adw_animation_target_get_type()
    }
}
