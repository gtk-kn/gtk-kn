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

# Usage: ./detect_symlink_loops.sh <directory>
# This script detects symbolic links that create loops to directories in the provided directory.

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

# Function to check if a directory is an ancestor of another
is_ancestor() {
    local dir="$1"
    local target="$2"

    # Traverse up the directory tree from target
    while [ "$target" != "/" ]; do
        if [ "$target" == "$dir" ]; then
            return 0
        fi
        target=$(dirname "$target")
    done
    return 1
}

# Function to detect symlink loops
find_symlink_loops() {
    local dir="$1"

    # Iterate over all symbolic links in the directory
    find "$dir" -type l | while read -r symlink; do
        # Resolve the symlink to its target
        resolved_path=$(readlink -f "$symlink" 2>/dev/null)

        # Check if the resolved path is a directory
        if [ -d "$resolved_path" ]; then
            # Check if the resolved path is an ancestor of the symlink itself
            if is_ancestor "$resolved_path" "$(dirname "$symlink")"; then
                echo "$symlink"
            fi
        fi
    done
}

# Run the loop detection
find_symlink_loops "$DIR"
