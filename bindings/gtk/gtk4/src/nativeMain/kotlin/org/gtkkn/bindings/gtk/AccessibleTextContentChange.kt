// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.bindings.gtk.annotations.GtkVersion4_14
import org.gtkkn.native.gtk.GtkAccessibleTextContentChange

/**
 * The type of contents change operation.
 * @since 4.14
 */
@GtkVersion4_14
public enum class AccessibleTextContentChange(
    public val nativeValue: GtkAccessibleTextContentChange,
) {
    /**
     * contents change as the result of
     *   an insert operation
     */
    INSERT(GtkAccessibleTextContentChange.GTK_ACCESSIBLE_TEXT_CONTENT_CHANGE_INSERT),

    /**
     * contents change as the result of
     *   a remove operation
     */
    REMOVE(GtkAccessibleTextContentChange.GTK_ACCESSIBLE_TEXT_CONTENT_CHANGE_REMOVE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkAccessibleTextContentChange): AccessibleTextContentChange =
            when (nativeValue) {
                GtkAccessibleTextContentChange.GTK_ACCESSIBLE_TEXT_CONTENT_CHANGE_INSERT -> INSERT
                GtkAccessibleTextContentChange.GTK_ACCESSIBLE_TEXT_CONTENT_CHANGE_REMOVE -> REMOVE
                else -> error("invalid nativeValue")
            }
    }
}
