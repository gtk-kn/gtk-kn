/*
 * Copyright (c) 2025 gtk-kn
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
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
