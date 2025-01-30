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

# Update package lists
dnf check-update || true

# Install packages without prompts
dnf install -y \
  git \
  libxcrypt-compat \
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

