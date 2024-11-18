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

# Check if the Docker image is built with the correct UID and GID
is_image_built_with_uid_gid() {
  local image_uid_gid
  image_uid_gid=$(docker run --rm --user "$CURRENT_UID:$CURRENT_GID" "$IMAGE_NAME" id 2>/dev/null || echo "invalid")

  [[ "$image_uid_gid" == *"uid=$CURRENT_UID"* ]] && [[ "$image_uid_gid" == *"gid=$CURRENT_GID"* ]]
}

# Build the Docker image with the current UID and GID
build_docker_image() {
  echo "Building Docker image '$IMAGE_NAME' with UID=$CURRENT_UID and GID=$CURRENT_GID..."
  docker build --build-arg UID="$CURRENT_UID" --build-arg GID="$CURRENT_GID" -t "$IMAGE_NAME" -f "$DOCKERFILE" "$BUILD_CONTEXT"
}

# Main Script

check_docker

if ! is_image_built_with_uid_gid; then
  echo "Docker image '$IMAGE_NAME' is not built with UID=$CURRENT_UID and GID=$CURRENT_GID."
  build_docker_image
fi

# Run the Docker container with the mounted volumes
echo "Running Gradle in the Docker container..."
docker run --rm -it \
  -v "$(pwd):/app" \
  -v "$HOME/.gradle:/home/developer/.gradle" \
  -v "$HOME/.m2:/home/developer/.m2" \
  -w /app \
  --user "$CURRENT_UID:$CURRENT_GID" \
  "$IMAGE_NAME" "$@"
