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

# Define the virtual environment directory and requirements file
VENV_DIR="venv"
REQUIREMENTS_FILE="mkdocs-requirements.txt"

# Function to clean up (deactivate virtual environment)
cleanup() {
    if [[ -n "${VIRTUAL_ENV:-}" ]]; then
        echo "Deactivating virtual environment..."
        deactivate
    fi
}
trap cleanup EXIT

# Create the virtual environment if it doesn't exist
if [[ ! -d "$VENV_DIR" ]]; then
    echo "Creating virtual environment in $VENV_DIR..."
    python3 -m venv "$VENV_DIR"
fi

# Activate the virtual environment
echo "Activating virtual environment..."
source "$VENV_DIR/bin/activate"

# Upgrade dependencies with pur if "upgrade" parameter is provided
if [[ "${1:-}" == "upgrade" ]]; then
    echo "Upgrade mode detected."

    # Check if pur is installed, install if missing
    if ! command -v pur &>/dev/null; then
        echo "pur is not installed. Installing it now..."
        pip install pur
    fi

    # Run pur to update mkdocs-requirements.txt
    echo "Updating dependencies in $REQUIREMENTS_FILE using pur..."
    pur -r "$REQUIREMENTS_FILE"

    echo "Upgrade complete."
    exit 0
fi

# Check for unknown parameters
if [[ $# -gt 0 ]]; then
    echo "Unrecognized parameter: $1"
    echo "Usage: $0 [upgrade]"
    exit 1
fi

# Upgrade pip and install dependencies
echo "Upgrading pip and installing dependencies..."
pip install --upgrade pip
pip install -r "$REQUIREMENTS_FILE"

# Run MkDocs server
echo "Starting MkDocs server..."
# To see which process is using port 8000: sudo lsof -i :8000
mkdocs serve
