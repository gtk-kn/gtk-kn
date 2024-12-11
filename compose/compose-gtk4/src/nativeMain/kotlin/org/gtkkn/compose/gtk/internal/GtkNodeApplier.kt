/*
 * Copyright (c) 2024 gtk-kn
 *
 * This file is part of gtk-kn.
 * gtk-kn is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * gtk-kn is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with gtk-kn. If not, see https://www.gnu.org/licenses/.
 */

package org.gtkkn.compose.gtk.internal

import androidx.compose.runtime.AbstractApplier
import co.touchlab.kermit.Logger
import org.gtkkn.compose.gtk.node.AnyGtkContainerNode
import org.gtkkn.compose.gtk.node.AnyGtkNode
import org.gtkkn.compose.gtk.node.GtkContainerNode

@GtkComposeInternalApi
@PublishedApi
internal class GtkNodeApplier(
    root: AnyGtkContainerNode,
    logger: Logger,
) : AbstractApplier<AnyGtkNode>(root) {
    private val logger = logger.withTag(this::class.simpleName!!)

    override fun insertTopDown(index: Int, instance: AnyGtkNode) {
        // ignored. Building tree bottom-up
    }

    override fun insertBottomUp(index: Int, instance: AnyGtkNode) {
        val parent = current
        if (parent is GtkContainerNode) {
            logger.d { "[$parent] Inserting child $instance at $index" }
            parent.insert(index, instance)
            logger.v { "[$parent] Inserted child $instance at $index" }
        } else {
            logger.e { "[$parent] Trying to insert $instance to non-container node at index $index" }
        }
    }

    override fun remove(index: Int, count: Int) {
        // 0 1 2 3 4 5
        // from=1, count=2
        // 0 3 4 5
        val parent = current
        if (parent is GtkContainerNode) {
            logger.d { "[$parent] Removing $count children at $index" }
            parent.remove(index, count)
            logger.v { "[$parent] Removed $count children at $index" }
        } else {
            logger.e { "[$parent] Trying to remove $count children at index $index from non-container node" }
        }
    }

    override fun move(from: Int, to: Int, count: Int) {
        // 0 1 2 3 4 5
        // from=1, to=3, count=2
        // 0 3 4 1 2 5
        val parent = current
        if (parent is GtkContainerNode) {
            logger.d { "[$parent] Moving $count children from $from to $to" }
            parent.move(from, to, count)
            logger.v { "[$parent] Moved $count children from $from to $to" }
        } else {
            logger.e { "[$parent] Trying to move $count children from $from to $to within non-container node" }
        }
    }

    override fun onClear() {
        val parent = root
        if (parent is GtkContainerNode) {
            logger.d { "[$parent] Clearing children" }
            parent.clear()
            logger.v { "[$parent] Cleared children" }
        } else {
            logger.e { "[$parent] Trying to clear children of non-container node" }
        }
    }
}
