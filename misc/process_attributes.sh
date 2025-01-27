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

# Define the file URL and the desired local filename
file_url="https://gitlab.gnome.org/GNOME/gobject-introspection/-/raw/main/docs/gir-1.2.rnc"
local_file="gir_attributes.txt"

# Download the file if it doesn't already exist
if [ ! -f "$local_file" ]; then
  echo "Downloading file..."
  curl -o "$local_file" "$file_url"
  if [ $? -ne 0 ]; then
    echo "Error: Failed to download the file from $file_url"
    exit 1
  fi
  echo "File downloaded as '$local_file'."
fi

# Check if the file exists after download
if [ ! -f "$local_file" ]; then
  echo "Error: File '$local_file' is missing!"
  exit 1
fi

# Process the file
grep '^    attribute ' "$local_file" | \
  sed 's/^    attribute //' | \
  sed 's/[,?]*$//' | \
  sort | uniq > "${local_file}.tmp" && mv "${local_file}.tmp" "$local_file"

echo "File '$local_file' has been updated with cleaned, sorted, and unique attributes."
