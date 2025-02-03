// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.adw.AdwCallbackAnimationTarget
import org.gtkkn.native.adw.adw_callback_animation_target_get_type
import org.gtkkn.native.adw.adw_callback_animation_target_new
import org.gtkkn.native.gobject.GType

/**
 * An [class@AnimationTarget] that calls a given callback during the
 * animation.
 */
public class CallbackAnimationTarget(
    public val adwCallbackAnimationTargetPointer: CPointer<AdwCallbackAnimationTarget>,
) : AnimationTarget(adwCallbackAnimationTargetPointer.reinterpret()),
    KGTyped {
    init {
        Adw
    }

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
    ) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<CallbackAnimationTarget> {
        override val type: GeneratedClassKGType<CallbackAnimationTarget> =
            GeneratedClassKGType(getTypeOrNull()!!) { CallbackAnimationTarget(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of CallbackAnimationTarget
         *
         * @return the GType
         */
        public fun getType(): GType = adw_callback_animation_target_get_type()

        /**
         * Gets the GType of from the symbol `adw_callback_animation_target_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("adw_callback_animation_target_get_type")
    }
}
