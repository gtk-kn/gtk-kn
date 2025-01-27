#!/usr/bin/env bash
#
# Copyright (c) 2025 gtk-kn
#
# SPDX-License-Identifier: LGPL-2.1-or-later
#
# This file is part of gtk-kn.
# gtk-kn is free software; you can redistribute it and/or
# modify it under the terms of the GNU Lesser General Public
# License as published by the Free Software Foundation; either
# version 2.1 of the License, or (at your option) any later version.
#
# This library is distributed in the hope that it will be useful,
# but WITHOUT ANY WARRANTY; without even the implied warranty of
# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
# Lesser General Public License for more details.
#
# You should have received a copy of the GNU Lesser General Public
# License along with this library; if not, see <http://www.gnu.org/licenses/>.
#

set -e -v

./gradlew :gir:run
./gradlew :gradle-plugin:check
./gradlew check
./gradlew gradle-plugin:publishToMavenLocal

# https://gitlab.com/gtk-kn/gtk-kn/-/issues/115
# Determine the OS and architecture
OS=$(uname -s)
ARCH=$(uname -m)

if [[ "$OS" == "Linux" && "$ARCH" == "x86_64" ]]; then
    ./gradlew publishLinuxX64PublicationToMavenLocal
elif [[ "$OS" == "Darwin" && "$ARCH" == "arm64" ]]; then
    ./gradlew publishMacosArm64PublicationToMavenLocal
else
    echo "Error: The current OS ($OS) and architecture ($ARCH) are not supported."
    exit 1
fi
