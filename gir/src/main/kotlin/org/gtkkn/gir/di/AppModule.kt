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

package org.gtkkn.gir.di

import org.gtkkn.gir.Application
import org.gtkkn.gir.coroutines.DefaultCoroutineDispatcherProvider
import org.gtkkn.gir.generator.BindingsGenerator
import org.gtkkn.gir.parser.gir.GirParser
import org.gtkkn.gir.parser.metadata.MetadataParser
import org.gtkkn.gir.processor.Phase2Processor
import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.instance
import org.kodein.di.singleton

val appModule = DI.Module("AppModule") {
    bind<Application>() with singleton {
        Application(
            girParser = instance(),
            phase2Processor = instance(),
            bindingsGenerator = instance(),
            config = instance(tag = "config"),
            dispatcherProvider = instance(),
        )
    }
    bind<BindingsGenerator>() with singleton { BindingsGenerator(instance(tag = "config")) }
    bind<DefaultCoroutineDispatcherProvider>() with singleton { DefaultCoroutineDispatcherProvider() }
    bind<GirParser>() with singleton { GirParser(instance()) }
    bind<MetadataParser>() with singleton { MetadataParser() }
    bind<Phase2Processor>() with singleton { Phase2Processor(instance(tag = "config")) }
}
