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

package org.gtkkn.compose.gtk.platform

import co.touchlab.kermit.Logger


/**
 * Sets up required side effects on the platform that the compose tree later depends on.
 *
 * **Must be called as early in the program as possible**
 */
internal fun loadPlatformSideEffects(
    logger: Logger,
) {
    logger.d { "Loading platform side effects" }

    logger.v { "Injecting GioMainDispatcher as Dispatchers.Main" }
//    @Suppress("INVISIBLE_MEMBER")
//    Dispatchers.injectMain(GioMainDispatcher(Dispatchers.Default, false, logger))
}
