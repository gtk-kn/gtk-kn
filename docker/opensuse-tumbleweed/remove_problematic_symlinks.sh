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

# Usage: ./remove_problematic_symlinks.sh <directory>
# This script removes symbolic links that create loops in the specified directory.
# Workaround for https://youtrack.jetbrains.com/issue/KT-30594/Interop-compile-always-crashes-at-open-suse-due-to-symlink-loops

# Check for a provided directory
if [ -z "$1" ]; then
    echo "Usage: $0 <directory>"
    exit 1
fi

DIR="$1"

# Validate directory
if [ ! -d "$DIR" ]; then
    echo "Error: $DIR is not a valid directory."
    exit 1
fi

# Resolve the path to the directory of this script
SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"

# Path to the detect_symlink_loops.sh script in the same directory
DETECT_SCRIPT="$SCRIPT_DIR/detect_symlink_loops.sh"

# Check if the detect script exists and is executable
if [ ! -x "$DETECT_SCRIPT" ]; then
    echo "Error: $DETECT_SCRIPT not found or not executable."
    exit 1
fi

# Invoke detect_symlink_loops.sh and remove each problematic symlink
"$DETECT_SCRIPT" "$DIR" | while read -r symlink; do
    if [ -L "$symlink" ]; then
        target=$(readlink "$symlink")
        echo "Removing problematic symlink: $symlink -> $target"
        echo "To recreate, run: ln -s $target $symlink"
        rm "$symlink"
    fi
done
