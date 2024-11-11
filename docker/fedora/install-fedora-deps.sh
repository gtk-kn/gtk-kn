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

set -v

# Update package lists
dnf check-update || true

# Install packages without prompts
dnf install -y \
  java-17-openjdk-devel \
  python3-pip \
  gcc \
  glib2-devel \
  gobject-introspection-devel \
  libadwaita-devel \
  gtksourceview5-devel \
  webkitgtk6.0-devel

# Clean up package lists to reduce image size
dnf clean all

