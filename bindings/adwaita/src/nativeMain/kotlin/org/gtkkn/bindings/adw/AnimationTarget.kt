// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.adw.AdwAnimationTarget
import org.gtkkn.native.adw.adw_animation_target_get_type
import org.gtkkn.native.gobject.GType

/**
 * Represents a value [class@Animation] can animate.
 */
public abstract class AnimationTarget(public val adwAnimationTargetPointer: CPointer<AdwAnimationTarget>) :
    Object(adwAnimationTargetPointer.reinterpret()),
    KGTyped {
    init {
        Adw
    }

    /**
     * The AnimationTargetImpl type represents a native instance of the abstract AnimationTarget class.
     *
     * @constructor Creates a new instance of AnimationTarget for the provided [CPointer].
     */
    public class AnimationTargetImpl(pointer: CPointer<AdwAnimationTarget>) : AnimationTarget(pointer)

    public companion object : TypeCompanion<AnimationTarget> {
        override val type: GeneratedClassKGType<AnimationTarget> =
            GeneratedClassKGType(getTypeOrNull()!!) { AnimationTargetImpl(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of AnimationTarget
         *
         * @return the GType
         */
        public fun getType(): GType = adw_animation_target_get_type()

        /**
         * Gets the GType of from the symbol `adw_animation_target_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("adw_animation_target_get_type")
    }
}
