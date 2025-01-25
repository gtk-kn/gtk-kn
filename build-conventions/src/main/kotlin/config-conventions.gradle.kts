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

import ext.ConfigExt
import ext.VersionsExt

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
plugins {
    id("local-properties-convention")
}

group = "org.gtkkn"

extensions.create<ConfigExt>("config").apply {
    website.convention("http://gtk-kn.org/")
    vcsUrl.convention("https://gitlab.com/gtk-kn/gtk-kn.git")
    extensions.create<VersionsExt>("versions").apply {
        common.convention("0.0.2-SNAPSHOT")
        adwaita.convention(common)
        core.convention(common)
        coroutines.convention(common)
        gradlePlugin.convention(common)
        gtk4.convention(common)
        gtksource.convention(common)
        javascriptcore.convention(common)
        soup.convention(common)
        webkit2.convention(common)
    }
}
