// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GThreadPriority

/**
 * Thread priorities.
 */
public enum class ThreadPriority(public val nativeValue: GThreadPriority) {
    /**
     * a priority lower than normal
     */
    LOW(GThreadPriority.G_THREAD_PRIORITY_LOW),

    /**
     * the default priority
     */
    NORMAL(GThreadPriority.G_THREAD_PRIORITY_NORMAL),

    /**
     * a priority higher than normal
     */
    HIGH(GThreadPriority.G_THREAD_PRIORITY_HIGH),

    /**
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
