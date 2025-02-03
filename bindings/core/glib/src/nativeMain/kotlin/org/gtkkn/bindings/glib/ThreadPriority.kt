// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GThreadPriority

/**
 * # ⚠️ Deprecated ⚠️
 *
 * This is deprecated since version 2.32.
 *
 * Thread priorities no longer have any effect.
 * ---
 *
 * Thread priorities.
 */
public enum class ThreadPriority(public val nativeValue: GThreadPriority) {
    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 2.32.
     *
     * Thread priorities no longer have any effect.
     * ---
     *
     * a priority lower than normal
     */
    LOW(GThreadPriority.G_THREAD_PRIORITY_LOW),

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 2.32.
     *
     * Thread priorities no longer have any effect.
     * ---
     *
     * the default priority
     */
    NORMAL(GThreadPriority.G_THREAD_PRIORITY_NORMAL),

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 2.32.
     *
     * Thread priorities no longer have any effect.
     * ---
     *
     * a priority higher than normal
     */
    HIGH(GThreadPriority.G_THREAD_PRIORITY_HIGH),

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 2.32.
     *
     * Thread priorities no longer have any effect.
     * ---
     *
     * the highest priority
     */
    URGENT(GThreadPriority.G_THREAD_PRIORITY_URGENT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GThreadPriority): ThreadPriority = when (nativeValue) {
            GThreadPriority.G_THREAD_PRIORITY_LOW -> LOW
            GThreadPriority.G_THREAD_PRIORITY_NORMAL -> NORMAL
            GThreadPriority.G_THREAD_PRIORITY_HIGH -> HIGH
            GThreadPriority.G_THREAD_PRIORITY_URGENT -> URGENT
            else -> error("invalid nativeValue")
        }
    }
}
