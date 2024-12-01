#!/bin/bash

#
# Copyright (c) 2024 gtk-kn
#
# This file is part of gtk-kn.
# gtk-kn is free software: you can redistribute it and/or modify
# it under the terms of the GNU General Public License as published by
# the Free Software Foundation, either version 3 of the License, or
# (at your option) any later version.
# gtk-kn is distributed in the hope that it will be useful,
# but WITHOUT ANY WARRANTY; without even the implied warranty of
# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
# GNU Lesser General Public License for more details.
# You should have received a copy of the GNU General Public License
# along with gtk-kn. If not, see https://www.gnu.org/licenses/.
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
