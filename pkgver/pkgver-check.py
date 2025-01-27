#!/usr/bin/env python3
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

import subprocess
import sys
from typing import List, Tuple, Optional, Dict

# Libraries of interest
LIBRARIES = [
    "cairo",
    "gdk-pixbuf-2.0",
    "gio-unix-2.0",
    "glib-2.0",
    "gmodule-2.0",
    "gobject-2.0",
    "graphene-1.0",
    "gtk4",
    "gtksourceview-5",
    "harfbuzz",
    "javascriptcoregtk-6.0",
    "libadwaita-1",
    "libsoup-3.0",
    "pango",
    "pangocairo",
    "webkitgtk-6.0"
]

RED = "\033[31m"  # ANSI code for red
RESET = "\033[0m"  # ANSI code to reset formatting


def get_pkg_config_version(lib: str) -> str:
    """
    Returns the version (string) of the library using pkg-config --modversion.
    If the library is not found, returns "N/A".
    """
    try:
        version = subprocess.check_output(
            ["pkg-config", "--modversion", lib],
            stderr=subprocess.DEVNULL
        ).decode().strip()
        return version
    except subprocess.CalledProcessError:
        return "N/A"
    except FileNotFoundError:
        # pkg-config not installed or not in PATH
        return "N/A"


def parse_version(version_str: str) -> Optional[Tuple[int, ...]]:
    """
    Parse a semantic version string into a tuple of integers for comparison.
    Non-numeric suffixes in each dotted portion are stripped.
      e.g. "1.10.3" -> (1, 10, 3)
           "1.10.3-dev" -> (1, 10, 3)
           "2.0" -> (2, 0)
    If version_str is "N/A", return None to indicate no version.
    """
    if version_str == "N/A":
        return None

    parts = version_str.split(".")
    numeric_parts: List[int] = []
    for part in parts:
        # Strip any non-digit suffix (like "-dev", etc.)
        num_str = ""
        for ch in part:
            if ch.isdigit():
                num_str += ch
            else:
                break
        if num_str == "":
            # no digits found, treat as 0
            numeric_parts.append(0)
        else:
            numeric_parts.append(int(num_str))
    return tuple(numeric_parts)


def compare_versions(host_ver: Optional[Tuple[int, ...]], file_ver: Optional[Tuple[int, ...]]) -> int:
    """
    Compare two version tuples (or None).
    Returns:
      -1 if host_ver < file_ver
       0 if host_ver == file_ver
       1 if host_ver > file_ver
    If one of them is None (meaning "N/A"), interpret that as a missing library,
    which we consider 'lower' if the other is a valid version.
    """
    if host_ver is None and file_ver is None:
        return 0  # both N/A => consider equal
    if host_ver is None:
        return -1  # "N/A" is definitely lower than a real version
    if file_ver is None:
        return 1  # real version is higher than "N/A"

    # At this point, neither host_ver nor file_ver is None
    max_len = max(len(host_ver), len(file_ver))
    for i in range(max_len):
        hv = host_ver[i] if i < len(host_ver) else 0
        fv = file_ver[i] if i < len(file_ver) else 0
        if hv < fv:
            return -1
        elif hv > fv:
            return 1
    return 0


def create_file(filename: str) -> None:
    """
    Creates a file with NAME=VERSION for each library.
    """
    with open(filename, "w", encoding="utf-8") as f:
        for lib in LIBRARIES:
            version = get_pkg_config_version(lib)
            f.write(f"{lib}={version}\n")
    print(f"Created {filename} with library versions.")


def compare_with_file(filename: str) -> None:
    """
    Reads versions from a file (NAME=VERSION) and compares them to
    the host system's versions.
    """
    # Read file versions
    file_versions: Dict[str, str] = {}
    with open(filename, "r", encoding="utf-8") as f:
        for line in f:
            line = line.strip()
            if not line or "=" not in line:
                continue
            lib_name, lib_ver = line.split("=", 1)
            file_versions[lib_name] = lib_ver

    # For each library, get the host version, parse, compare
    for lib in LIBRARIES:
        file_ver_str = file_versions.get(lib, "N/A")  # might not be in file
        host_ver_str = get_pkg_config_version(lib)

        file_ver_parsed = parse_version(file_ver_str)
        host_ver_parsed = parse_version(host_ver_str)

        cmp_result = compare_versions(host_ver_parsed, file_ver_parsed)

        # Print results
        if cmp_result < 0:
            print(f"{RED}[LOWER]   {lib}: host={host_ver_str} < file={file_ver_str}{RESET}")
        else:
            print(f"[OK]      {lib}: host={host_ver_str}, file={file_ver_str}")


def main() -> None:
    args = sys.argv[1:]
    if not args:
        print("Usage:")
        print("  script.py -c <filename>    # create file of library versions")
        print("  script.py <filename>       # compare host with specified file")
        sys.exit(1)

    if args[0] == "-c":
        if len(args) < 2:
            print("Error: missing filename after -c")
            sys.exit(1)
        create_file(args[1])
    else:
        # Single argument assumed to be the file to compare
        compare_with_file(args[0])


if __name__ == "__main__":
    main()
