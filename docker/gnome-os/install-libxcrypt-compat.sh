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

set -euo pipefail

# Variables
pkgname="libxcrypt"
pkgver="4.4.36"
build_dir="build-libxcrypt-compat"
download_url="https://github.com/besser82/libxcrypt/releases/download/v${pkgver}/${pkgname}-${pkgver}.tar.xz"
temp_prefix="/tmp/libxcrypt-install"

# Check for required commands
for cmd in gcc make curl tar ldconfig; do
    if ! command -v "$cmd" &> /dev/null; then
        echo "Error: '$cmd' is required but not installed." >&2
        exit 1
    fi
done

# Ensure the script is run as root (required for installation to /usr)
if [[ $EUID -ne 0 ]]; then
    echo "Please run this script as root or using sudo." >&2
    exit 1
fi

# Detect the correct library directory
detect_lib_dir() {
    for dir in "/usr/lib/x86_64-linux-gnu" "/usr/lib64" "/usr/lib"; do
        if [[ -d $dir ]]; then
            echo "$dir"
            return 0
        fi
    done
    echo "Error: Could not determine library directory." >&2
    exit 1
}

lib_dir=$(detect_lib_dir)
echo "Detected library directory: $lib_dir"

# Create a temporary directory for the build process
tmp_dir=$(mktemp -d)
trap 'rm -rf "$tmp_dir"' EXIT

cd "$tmp_dir"

# Download the source code
echo "Downloading ${pkgname}-${pkgver}..."
curl -fsSL -o "${pkgname}-${pkgver}.tar.xz" "$download_url"

# Extract the source code
echo "Extracting ${pkgname}-${pkgver}..."
tar -xf "${pkgname}-${pkgver}.tar.xz"

# Create build directory
mkdir "$build_dir"
cd "$build_dir"

# Configure the build for libxcrypt-compat
echo "Configuring the build..."
"../${pkgname}-${pkgver}/configure" \
    --prefix="$temp_prefix" \
    --disable-static \
    --enable-hashes=strong,glibc \
    --enable-obsolete-api=glibc \
    --disable-failure-tokens

# Compile the source code
echo "Compiling the source code..."
make

# Install to temporary prefix
echo "Installing to temporary directory: $temp_prefix"
make install

# Move required files to the correct library directory
echo "Installing libcrypt.so.1* to $lib_dir"
cp -P "$temp_prefix/lib/libcrypt.so.1"* "$lib_dir"

# Remove unnecessary files to keep the installation minimal
echo "Cleaning up unnecessary files..."
rm -rf $temp_prefix

# Update the dynamic linker run-time bindings
echo "Updating the library cache..."
ldconfig

echo "libxcrypt-compat installed successfully to $lib_dir"
