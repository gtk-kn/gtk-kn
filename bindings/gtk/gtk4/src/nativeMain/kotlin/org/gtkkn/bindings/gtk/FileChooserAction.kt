// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkFileChooserAction

/**
 * Describes whether a `GtkFileChooser` is being used to open existing files
 * or to save to a possibly new file.
 */
public enum class FileChooserAction(
    public val nativeValue: GtkFileChooserAction,
) {
    /**
     * Indicates open mode.  The file chooser
     *  will only let the user pick an existing file.
     */
    OPEN(GtkFileChooserAction.GTK_FILE_CHOOSER_ACTION_OPEN),

    /**
     * Indicates save mode.  The file chooser
     *  will let the user pick an existing file, or type in a new
     *  filename.
     */
    SAVE(GtkFileChooserAction.GTK_FILE_CHOOSER_ACTION_SAVE),

    /**
     * Indicates an Open mode for
     *  selecting folders.  The file chooser will let the user pick an
     *  existing folder.
     */
    SELECT_FOLDER(GtkFileChooserAction.GTK_FILE_CHOOSER_ACTION_SELECT_FOLDER),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkFileChooserAction): FileChooserAction =
            when (nativeValue) {
                GtkFileChooserAction.GTK_FILE_CHOOSER_ACTION_OPEN -> OPEN
                GtkFileChooserAction.GTK_FILE_CHOOSER_ACTION_SAVE -> SAVE
                GtkFileChooserAction.GTK_FILE_CHOOSER_ACTION_SELECT_FOLDER -> SELECT_FOLDER
                else -> error("invalid nativeValue")
            }
    }
}
