// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.bindings.glib.annotations.GLibVersion2_14
import org.gtkkn.native.glib.GUserDirectory

/**
 * These are logical ids for special directories which are defined
 * depending on the platform used. You should use g_get_user_special_dir()
 * to retrieve the full path associated to the logical id.
 *
 * The #GUserDirectory enumeration can be extended at later date. Not
 * every platform has a directory for every logical id in this
 * enumeration.
 * @since 2.14
 */
@GLibVersion2_14
public enum class UserDirectory(
    public val nativeValue: GUserDirectory,
) {
    /**
     * the user's Desktop directory
     */
    DIRECTORY_DESKTOP(GUserDirectory.G_USER_DIRECTORY_DESKTOP),

    /**
     * the user's Documents directory
     */
    DIRECTORY_DOCUMENTS(GUserDirectory.G_USER_DIRECTORY_DOCUMENTS),

    /**
     * the user's Downloads directory
     */
    DIRECTORY_DOWNLOAD(GUserDirectory.G_USER_DIRECTORY_DOWNLOAD),

    /**
     * the user's Music directory
     */
    DIRECTORY_MUSIC(GUserDirectory.G_USER_DIRECTORY_MUSIC),

    /**
     * the user's Pictures directory
     */
    DIRECTORY_PICTURES(GUserDirectory.G_USER_DIRECTORY_PICTURES),

    /**
     * the user's shared directory
     */
    DIRECTORY_PUBLIC_SHARE(GUserDirectory.G_USER_DIRECTORY_PUBLIC_SHARE),

    /**
     * the user's Templates directory
     */
    DIRECTORY_TEMPLATES(GUserDirectory.G_USER_DIRECTORY_TEMPLATES),

    /**
     * the user's Movies directory
     */
    DIRECTORY_VIDEOS(GUserDirectory.G_USER_DIRECTORY_VIDEOS),

    /**
     * the number of enum values
     */
    N_DIRECTORIES(GUserDirectory.G_USER_N_DIRECTORIES),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GUserDirectory): UserDirectory =
            when (nativeValue) {
                GUserDirectory.G_USER_DIRECTORY_DESKTOP -> DIRECTORY_DESKTOP
                GUserDirectory.G_USER_DIRECTORY_DOCUMENTS -> DIRECTORY_DOCUMENTS
                GUserDirectory.G_USER_DIRECTORY_DOWNLOAD -> DIRECTORY_DOWNLOAD
                GUserDirectory.G_USER_DIRECTORY_MUSIC -> DIRECTORY_MUSIC
                GUserDirectory.G_USER_DIRECTORY_PICTURES -> DIRECTORY_PICTURES
                GUserDirectory.G_USER_DIRECTORY_PUBLIC_SHARE -> DIRECTORY_PUBLIC_SHARE
                GUserDirectory.G_USER_DIRECTORY_TEMPLATES -> DIRECTORY_TEMPLATES
                GUserDirectory.G_USER_DIRECTORY_VIDEOS -> DIRECTORY_VIDEOS
                GUserDirectory.G_USER_N_DIRECTORIES -> N_DIRECTORIES
                else -> error("invalid nativeValue")
            }
    }
}
