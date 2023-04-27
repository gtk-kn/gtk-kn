/*
 * Copyright (c) 2023 gtk-kn
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

package ext

import org.gradle.api.plugins.ExtensionAware
import org.gradle.api.provider.Property
import org.gradle.kotlin.dsl.getByType

interface PublishConfigExt : ExtensionAware {
    val ossrhUsername: Property<String>
    val ossrhPassword: Property<String>
    val signingKeyId: Property<String>
    val signingPassword: Property<String>
    val signingSecretKeyRingFile: Property<String>
}

internal inline val ConfigExt.publish: PublishConfigExt get() = extensions.getByType()
