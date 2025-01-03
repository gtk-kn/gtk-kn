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

package org.gtkkn.compose.gtk.util

import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.snapshots.SnapshotStateObserver
import kotlinx.coroutines.channels.Channel

/**
 * When [UpdateEffect] enters the composition it will call [update] and will capture all state
 * which is used in this function.
 *
 * When any state is changed, [update] will be called again on the next recomposition.
 *
 * [update] always be called in UI thread.
 */
@Composable
internal fun UpdateEffect(update: () -> Unit) {
    val tasks = remember { Channel<() -> Unit>(Channel.RENDEZVOUS) }
    val currentUpdate by rememberUpdatedState(update)

    LaunchedEffect(Unit) {
        for (task in tasks) {
            task()
        }
    }

    DisposableEffect(Unit) {
        val snapshotObserver = SnapshotStateObserver { command ->
            command()
        }
        snapshotObserver.start()

        @Suppress("LateinitUsage")
        lateinit var sendUpdate: (Unit) -> Unit
        fun performUpdate() {
            snapshotObserver.observeReads(
                Unit,
                onValueChangedForScope = sendUpdate,
            ) {
                currentUpdate()
            }
        }
        sendUpdate = { tasks.trySend(::performUpdate) }

        performUpdate()

        onDispose {
            snapshotObserver.stop()
            snapshotObserver.clear()
        }
    }
}
