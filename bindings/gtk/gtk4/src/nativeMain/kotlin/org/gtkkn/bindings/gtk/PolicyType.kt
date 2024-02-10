// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkPolicyType
import org.gtkkn.native.gtk.GtkPolicyType.GTK_POLICY_ALWAYS
import org.gtkkn.native.gtk.GtkPolicyType.GTK_POLICY_AUTOMATIC
import org.gtkkn.native.gtk.GtkPolicyType.GTK_POLICY_EXTERNAL
import org.gtkkn.native.gtk.GtkPolicyType.GTK_POLICY_NEVER

/**
 * Determines how the size should be computed to achieve the one of the
 * visibility mode for the scrollbars.
 */
public enum class PolicyType(
    public val nativeValue: GtkPolicyType,
) {
    /**
     * The scrollbar is always visible. The view size is
     *   independent of the content.
     */
    ALWAYS(GTK_POLICY_ALWAYS),

    /**
     * The scrollbar will appear and disappear as necessary.
     *   For example, when all of a `GtkTreeView` can not be seen.
     */
    AUTOMATIC(GTK_POLICY_AUTOMATIC),

    /**
     * The scrollbar should never appear. In this mode the
     *   content determines the size.
     */
    NEVER(GTK_POLICY_NEVER),

    /**
     * Don't show a scrollbar, but don't force the
     *   size to follow the content. This can be used e.g. to make multiple
     *   scrolled windows share a scrollbar.
     */
    EXTERNAL(GTK_POLICY_EXTERNAL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkPolicyType): PolicyType =
            when (nativeValue) {
                GTK_POLICY_ALWAYS -> ALWAYS
                GTK_POLICY_AUTOMATIC -> AUTOMATIC
                GTK_POLICY_NEVER -> NEVER
                GTK_POLICY_EXTERNAL -> EXTERNAL
                else -> error("invalid nativeValue")
            }
    }
}
