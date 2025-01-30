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

# Update the system and package lists
pacman -Syu --noconfirm

# Install packages without prompts
pacman -S --noconfirm \
  git \
  libxcrypt-compat \
  pkgconf \
  jdk17-openjdk \
  python-pip \
  gcc-multilib \
  glib2 \
  gobject-introspection \
  libadwaita \
  gtksourceview5 \
  webkitgtk-6.0

# Clean up package cache to reduce image size
pacman -Scc --noconfirm


