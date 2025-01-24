// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.glib

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.glib.GFileTest
import org.gtkkn.native.glib.G_FILE_TEST_EXISTS
import org.gtkkn.native.glib.G_FILE_TEST_IS_DIR
import org.gtkkn.native.glib.G_FILE_TEST_IS_EXECUTABLE
import org.gtkkn.native.glib.G_FILE_TEST_IS_REGULAR
import org.gtkkn.native.glib.G_FILE_TEST_IS_SYMLINK

/**
 * A test to perform on a file using g_file_test().
 */
public class FileTest(public val mask: GFileTest) : Bitfield<FileTest> {
    override infix fun or(other: FileTest): FileTest = FileTest(mask or other.mask)

    public companion object {
        /**
         * true if the file is a regular file
         *     (not a directory). Note that this test will also return true
         *     if the tested file is a symlink to a regular file.
         */
        public val IS_REGULAR: FileTest = FileTest(G_FILE_TEST_IS_REGULAR)

        /**
         * true if the file is a symlink.
         */
        public val IS_SYMLINK: FileTest = FileTest(G_FILE_TEST_IS_SYMLINK)

        /**
         * true if the file is a directory.
         */
        public val IS_DIR: FileTest = FileTest(G_FILE_TEST_IS_DIR)

        /**
         * true if the file is executable.
         */
        public val IS_EXECUTABLE: FileTest = FileTest(G_FILE_TEST_IS_EXECUTABLE)

        /**
         * true if the file exists. It may or may not
         *     be a regular file.
         */
        public val EXISTS: FileTest = FileTest(G_FILE_TEST_EXISTS)
    }
}
