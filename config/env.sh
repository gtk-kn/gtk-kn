#
# Copyright (c) 2023 gtk-kn
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

### A script to setup few cli utilities to work with the gtk-kn project in a dir-agnostic way
### Commands:
###   croot - change to project's root
###   gomod - go to a given module
###   gw - execute gradle wrapper at project root from current directory

SOURCE=${BASH_SOURCE[0]}
# resolve $SOURCE until the file is no longer a symlink
while [ -L "$SOURCE" ]; do
  ROOT=$(cd -P "$(dirname "$SOURCE")" >/dev/null 2>&1 && pwd)
  SOURCE=$(readlink "$SOURCE")
  # if $SOURCE was a relative symlink, we need to resolve it relative to the path where the symlink file was located
  [[ $SOURCE != /* ]] && SOURCE=$ROOT/$SOURCE
done
ROOT=$(cd -P "$(dirname "$SOURCE")/.." >/dev/null 2>&1 && pwd)

alias croot="cd $ROOT"
alias gw="$ROOT/gradlew"
#alias gomod="find $ROOT -type d -name "

function gomod() {
  if [[ -z "$1" ]]; then
    printf "%s\n" "Modules:"
    for c in $(find $ROOT -type d -printf '%p\n'); do
      if [[ -f "$c/build.gradle.kts" ]]; then
        name="$(basename $c)"
        printf "\t%-20s%s\n" "$name" "$ROOT/$c"
      fi
    done
  else
    for c in $(find . -type d -name "$1" -printf '%p\n' |
      sort -n -k 1); do
      if [[ -f "$c/build.gradle.kts" ]]; then
        cd "$ROOT/$c" && return
      fi
    done
    echo "Module $1 not found"
  fi
}
