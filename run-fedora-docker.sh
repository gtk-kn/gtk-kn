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

# Exit on errors and undefined variables, and propagate errors in pipes
set -euo pipefail

# Variables
IMAGE_NAME="fedora"
DOCKERFILE="docker/fedora/Dockerfile"
BUILD_CONTEXT="."
CURRENT_UID=$(id -u)
CURRENT_GID=$(id -g)

# Functions

# Check if Docker is installed
check_docker() {
  if ! command -v docker &>/dev/null; then
    echo "Error: Docker is not installed or not in PATH." >&2
    exit 1
  fi
}

# Check if the image's "developer" user has the correct UID/GID
is_image_built_with_uid_gid() {
  # We'll run `id developer` without `--user` to use the image’s *default* user.
  # If the "developer" user does not exist or has different UID/GID, it should fail or not match.
  local output
  if ! output="$(docker run --rm "$IMAGE_NAME" id developer 2>/dev/null || true)"; then
    # If the command itself errors (e.g. user doesn't exist), return failure
    return 1
  fi

  # output should look like: uid=1000(developer) gid=1000(developer) groups=1000(developer)
  # We'll parse the numeric UID and GID from this string.
  local found_uid found_gid
  found_uid="$(echo "$output" | sed -n 's/.*uid=\([0-9]\+\).*/\1/p')"
  found_gid="$(echo "$output" | sed -n 's/.*gid=\([0-9]\+\).*/\1/p')"

  # Check if they match the host's UID and GID
  [[ "$found_uid" == "$CURRENT_UID" && "$found_gid" == "$CURRENT_GID" ]]
}

# Build the Docker image with the current UID and GID
build_docker_image() {
  echo "Building Docker image '$IMAGE_NAME' with UID=$CURRENT_UID and GID=$CURRENT_GID..."
  docker build \
    --build-arg UID="$CURRENT_UID" \
    --build-arg GID="$CURRENT_GID" \
    -t "$IMAGE_NAME" \
    -f "$DOCKERFILE" \
    "$BUILD_CONTEXT"
}

# Main Script

check_docker

# Check if the Docker image is built with the correct UID and GID
if ! is_image_built_with_uid_gid; then
  echo "Docker image '$IMAGE_NAME' is not built with UID=$CURRENT_UID and GID=$CURRENT_GID."
  build_docker_image
else
  echo "Docker image '$IMAGE_NAME' is already built with UID=$CURRENT_UID and GID=$CURRENT_GID."
fi

# Now run the container with the forced user, so local file permissions match host.
echo "Running Gradle in the Docker container..."
mkdir -p "$HOME"/.m2
mkdir -p "$(pwd)"/build/{gradle,konan}
docker run --rm -it \
  -v "$(pwd):/app" \
  -v "$(pwd)/build/gradle:/home/developer/.gradle" \
  -v "$(pwd)/build/konan:/home/developer/.konan" \
  -v "$HOME/.m2:/home/developer/.m2" \
  -w /app \
  --user "$CURRENT_UID:$CURRENT_GID" \
  "$IMAGE_NAME" \
  "$@"
