#!/usr/bin/env bash
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

set -euo pipefail

# Input validation
if [[ $# -lt 3 ]]; then
    echo "Usage: $0 [JDK_VERSION] [JDK_ARCH] [JDK_PLATFORM]" >&2
    exit 1
fi

# Parse arguments
jdk_version=$1
jdk_arch=$2
jdk_platform=$3

# Define download URL based on JDK version
declare -A download_urls=(
    [8]="https://github.com/adoptium/temurin8-binaries/releases/download/jdk8u392-b08/OpenJDK8U-jdk_${jdk_arch}_${jdk_platform}_hotspot_8u392b08.tar.gz"
    [11]="https://github.com/adoptium/temurin11-binaries/releases/download/jdk-11.0.21%2B9/OpenJDK11U-jdk_${jdk_arch}_${jdk_platform}_hotspot_11.0.21_9.tar.gz"
    [17]="https://github.com/adoptium/temurin17-binaries/releases/download/jdk-17.0.9%2B9/OpenJDK17U-jdk_${jdk_arch}_${jdk_platform}_hotspot_17.0.9_9.tar.gz"
    [21]="https://github.com/adoptium/temurin21-binaries/releases/download/jdk-21.0.1%2B12/OpenJDK21U-jdk_${jdk_arch}_${jdk_platform}_hotspot_21.0.1_12.tar.gz"
)

# Check if the version is supported
download_url="${download_urls[$jdk_version]:-}"
if [[ -z $download_url ]]; then
    echo "Error: Unsupported JDK version '${jdk_version}'" >&2
    exit 1
fi

# Set target installation directory
install_dir="/opt/java/jdk-${jdk_version}"

# Create the directory if it doesn't exist
mkdir -p "$install_dir"

# Download and extract the JDK
tmp_file=$(mktemp)
trap 'rm -f "$tmp_file"' EXIT

echo "Downloading JDK ${jdk_version}..."
curl -fsSL -o "$tmp_file" "$download_url"

echo "Installing JDK ${jdk_version} to ${install_dir}..."
tar -xvf "$tmp_file" -C "$install_dir" --strip-components=1

echo "JDK ${jdk_version} installed successfully at ${install_dir}."
