#!/usr/bin/env bash
#
# Copyright (c) 2025 gtk-kn
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

set -e -v

# Check if Xcode is installed
if ! /usr/bin/xcrun xcodebuild -version &> /dev/null
then
  echo "Xcode is not installed or the license has not been accepted. Please install Xcode and accept the license to proceed."
  exit 1
fi

# Check if Homebrew is installed, install if missing
if ! command -v brew &> /dev/null
then
  echo "Homebrew not found. Installing..."
  /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
fi

# Update Homebrew
brew update

# Install packages
brew install \
  openjdk@17 \
  pkgconf \
  gtk4 \
  libadwaita \
  gtksourceview5
