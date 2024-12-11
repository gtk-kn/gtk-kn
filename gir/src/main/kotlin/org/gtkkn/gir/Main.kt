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

package org.gtkkn.gir

import kotlinx.coroutines.runBlocking
import org.gtkkn.gir.cli.parseConfig
import org.gtkkn.gir.di.AppComponent
import org.gtkkn.gir.di.create
import org.gtkkn.gir.log.configureLog4j

fun main(args: Array<String>): Unit = runBlocking {
    val config = parseConfig(args)
    configureLog4j(config.logLevel)

    val appComponent = AppComponent::class.create(config)

    val application: Application = appComponent.application
    application.run()
}
