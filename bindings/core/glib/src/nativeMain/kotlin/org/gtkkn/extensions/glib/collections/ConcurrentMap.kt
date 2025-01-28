/*
 * Copyright (c) 2025 gtk-kn
 *
 * SPDX-License-Identifier: LGPL-2.1-or-later
 *
 * This file is part of gtk-kn.
 * gtk-kn is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, see <http://www.gnu.org/licenses/>.
 */

package org.gtkkn.extensions.glib.collections

import kotlinx.atomicfu.locks.ReentrantLock
import kotlinx.atomicfu.locks.withLock

/**
 * A thread-safe [MutableMap] for Kotlin/Native, based on a [LinkedHashMap] protected
 * by a [ReentrantLock].
 */
public class ConcurrentMap<Key, Value>(
    initialCapacity: Int = 16
) : MutableMap<Key, Value> {
    private val delegate = LinkedHashMap<Key, Value>(initialCapacity)
    private val lock = ReentrantLock()

    override val size: Int
        get() = lock.withLock { delegate.size }

    override val entries: MutableSet<MutableMap.MutableEntry<Key, Value>>
        get() = lock.withLock { LinkedHashMap(delegate).entries }

    override val keys: MutableSet<Key>
        get() = lock.withLock { LinkedHashMap(delegate).keys }

    override val values: MutableCollection<Value>
        get() = lock.withLock { LinkedHashMap(delegate).values }

    /**
     * Computes [block] and inserts the result in the map under [key]
     * if [key] does not yet have a mapping. The [block] will be evaluated at most once.
     */
    public fun computeIfAbsent(key: Key, block: () -> Value): Value = lock.withLock {
        if (delegate.containsKey(key)) {
            return delegate[key]!!
        }
        val value = block()
        delegate[key] = value
        return value
    }

    /**
     * If the value for the specified [key] is present, attempts to compute a new mapping given
     * the key and its current mapped value. This entire method invocation is performed atomically.
     *
     * The [remappingFunction] is invoked exactly once if the [key] is present. If it returns `null`,
     * the existing mapping is removed; otherwise, the map is updated to the new value.
     *
     * @param key the key for which a value may be present
     * @param remappingFunction the function used to compute a new value, if a mapping for [key] exists
     * @return the new value associated with [key], or `null` if none
     */
    public fun computeIfPresent(key: Key, remappingFunction: (Key, Value) -> Value?): Value? = lock.withLock {
        val oldValue = delegate[key] ?: return null
        val newValue = remappingFunction(key, oldValue)
        if (newValue == null) {
            delegate.remove(key)
            return null
        }
        delegate[key] = newValue
        return newValue
    }

    override fun containsKey(key: Key): Boolean = lock.withLock { delegate.containsKey(key) }

    override fun containsValue(value: Value): Boolean = lock.withLock { delegate.containsValue(value) }

    override fun get(key: Key): Value? = lock.withLock { delegate[key] }

    override fun isEmpty(): Boolean = lock.withLock { delegate.isEmpty() }

    override fun clear() {
        lock.withLock {
            delegate.clear()
        }
    }

    override fun put(key: Key, value: Value): Value? = lock.withLock {
        delegate.put(key, value)
    }

    override fun putAll(from: Map<out Key, Value>) {
        lock.withLock {
            delegate.putAll(from)
        }
    }

    /**
     * Maps the specified [key] to [value] if it is not already mapped. If the map already contains
     * a value for [key], it returns the existing value and does not modify the map.
     *
     * @param key the key with which the specified value is to be associated
     * @param value the value to be associated with the specified key
     * @return the previous value associated with [key], or `null` if there was no mapping
     */
    public fun putIfAbsent(key: Key, value: Value): Value? = lock.withLock {
        val existing = delegate[key]
        if (existing == null) {
            delegate[key] = value
            null
        } else {
            existing
        }
    }

    override fun remove(key: Key): Value? = lock.withLock {
        delegate.remove(key)
    }

    /**
     * Removes the entry [key] -> [value] if it exists, returning `true` if removed.
     */
    public fun remove(key: Key, value: Value): Boolean = lock.withLock {
        if (delegate[key] != value) return false
        delegate.remove(key)
        return true
    }

    override fun hashCode(): Int = lock.withLock { delegate.hashCode() }

    override fun equals(other: Any?): Boolean = lock.withLock {
        if (other !is Map<*, *>) return false
        return delegate == other
    }

    override fun toString(): String = lock.withLock { "ConcurrentMap by $delegate" }
}
