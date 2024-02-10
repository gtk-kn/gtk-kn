// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import org.gtkkn.native.gdk.GdkNotifyType
import org.gtkkn.native.gdk.GdkNotifyType.GDK_NOTIFY_ANCESTOR
import org.gtkkn.native.gdk.GdkNotifyType.GDK_NOTIFY_INFERIOR
import org.gtkkn.native.gdk.GdkNotifyType.GDK_NOTIFY_NONLINEAR
import org.gtkkn.native.gdk.GdkNotifyType.GDK_NOTIFY_NONLINEAR_VIRTUAL
import org.gtkkn.native.gdk.GdkNotifyType.GDK_NOTIFY_UNKNOWN
import org.gtkkn.native.gdk.GdkNotifyType.GDK_NOTIFY_VIRTUAL

/**
 * Specifies the kind of crossing for enter and leave events.
 *
 * See the X11 protocol specification of LeaveNotify for
 * full details of crossing event generation.
 */
public enum class NotifyType(
    public val nativeValue: GdkNotifyType,
) {
    /**
     * the surface is entered from an ancestor or
     *   left towards an ancestor.
     */
    ANCESTOR(GDK_NOTIFY_ANCESTOR),

    /**
     * the pointer moves between an ancestor and an
     *   inferior of the surface.
     */
    VIRTUAL(GDK_NOTIFY_VIRTUAL),

    /**
     * the surface is entered from an inferior or
     *   left towards an inferior.
     */
    INFERIOR(GDK_NOTIFY_INFERIOR),

    /**
     * the surface is entered from or left towards
     *   a surface which is neither an ancestor nor an inferior.
     */
    NONLINEAR(GDK_NOTIFY_NONLINEAR),

    /**
     * the pointer moves between two surfaces
     *   which are not ancestors of each other and the surface is part of
     *   the ancestor chain between one of these surfaces and their least
     *   common ancestor.
     */
    NONLINEAR_VIRTUAL(GDK_NOTIFY_NONLINEAR_VIRTUAL),

    /**
     * an unknown type of enter/leave event occurred.
     */
    UNKNOWN(GDK_NOTIFY_UNKNOWN),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GdkNotifyType): NotifyType =
            when (nativeValue) {
                GDK_NOTIFY_ANCESTOR -> ANCESTOR
                GDK_NOTIFY_VIRTUAL -> VIRTUAL
                GDK_NOTIFY_INFERIOR -> INFERIOR
                GDK_NOTIFY_NONLINEAR -> NONLINEAR
                GDK_NOTIFY_NONLINEAR_VIRTUAL -> NONLINEAR_VIRTUAL
                GDK_NOTIFY_UNKNOWN -> UNKNOWN
                else -> error("invalid nativeValue")
            }
    }
}
