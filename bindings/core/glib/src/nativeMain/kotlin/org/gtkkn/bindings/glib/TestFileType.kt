// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.bindings.glib.annotations.GLibVersion2_38
import org.gtkkn.native.glib.GTestFileType
import org.gtkkn.native.glib.GTestFileType.G_TEST_BUILT
import org.gtkkn.native.glib.GTestFileType.G_TEST_DIST

/**
 * The type of file to return the filename for, when used with
 * g_test_build_filename().
 *
 * These two options correspond rather directly to the 'dist' and
 * 'built' terminology that automake uses and are explicitly used to
 * distinguish between the 'srcdir' and 'builddir' being separate.  All
 * files in your project should either be dist (in the
 * `EXTRA_DIST` or `dist_schema_DATA`
 * sense, in which case they will always be in the srcdir) or built (in
 * the `BUILT_SOURCES` sense, in which case they will
 * always be in the builddir).
 *
 * Note: as a general rule of automake, files that are generated only as
 * part of the build-from-git process (but then are distributed with the
 * tarball) always go in srcdir (even if doing a srcdir != builddir
 * build from git) and are considered as distributed files.
 * @since 2.38
 */
@GLibVersion2_38
public enum class TestFileType(
    public val nativeValue: GTestFileType,
) {
    /**
     * a file that was included in the distribution tarball
     */
    DIST(G_TEST_DIST),

    /**
     * a file that was built on the compiling machine
     */
    BUILT(G_TEST_BUILT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GTestFileType): TestFileType =
            when (nativeValue) {
                G_TEST_DIST -> DIST
                G_TEST_BUILT -> BUILT
                else -> error("invalid nativeValue")
            }
    }
}
