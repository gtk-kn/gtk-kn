// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import org.gtkkn.native.adw.AdwAnimationState
import org.gtkkn.native.adw.adw_animation_state_get_type
import org.gtkkn.native.gobject.GType

/**
 * Describes the possible states of an [class@Animation].
 *
 * The state can be controlled with [method@Animation.play],
 * [method@Animation.pause], [method@Animation.resume],
 * [method@Animation.reset] and [method@Animation.skip].
 */
public enum class AnimationState(public val nativeValue: AdwAnimationState) {
    /**
     * The animation hasn't started yet.
     */
    IDLE(AdwAnimationState.ADW_ANIMATION_IDLE),

    /**
     * The animation has been paused.
     */
    PAUSED(AdwAnimationState.ADW_ANIMATION_PAUSED),

    /**
     * The animation is currently playing.
     */
    PLAYING(AdwAnimationState.ADW_ANIMATION_PLAYING),

    /**
     * The animation has finished.
     */
    FINISHED(AdwAnimationState.ADW_ANIMATION_FINISHED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: AdwAnimationState): AnimationState = when (nativeValue) {
            AdwAnimationState.ADW_ANIMATION_IDLE -> IDLE
            AdwAnimationState.ADW_ANIMATION_PAUSED -> PAUSED
            AdwAnimationState.ADW_ANIMATION_PLAYING -> PLAYING
            AdwAnimationState.ADW_ANIMATION_FINISHED -> FINISHED
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of AnimationState
         *
         * @return the GType
         */
        public fun getType(): GType = adw_animation_state_get_type()
    }
}
