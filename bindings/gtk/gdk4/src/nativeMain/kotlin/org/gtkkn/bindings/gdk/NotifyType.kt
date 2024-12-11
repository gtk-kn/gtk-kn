// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import org.gtkkn.native.gdk.GdkNotifyType
import org.gtkkn.native.gdk.gdk_notify_type_get_type
import org.gtkkn.native.gobject.GType

/**
 * Specifies the kind of crossing for enter and leave events.
 *
 * See the X11 protocol specification of LeaveNotify for
 * full details of crossing event generation.
 */
public enum class NotifyType(public val nativeValue: GdkNotifyType) {
    /**
     * the surface is entered from an ancestor or
     *   left towards an ancestor.
     */
    ANCESTOR(GdkNotifyType.GDK_NOTIFY_ANCESTOR),

    /**
     * the pointer moves between an ancestor and an
     *   inferior of the surface.
     */
    VIRTUAL(GdkNotifyType.GDK_NOTIFY_VIRTUAL),

    /**
     * the surface is entered from an inferior or
     *   left towards an inferior.
     */
    INFERIOR(GdkNotifyType.GDK_NOTIFY_INFERIOR),

    /**
     * the surface is entered from or left towards
     *   a surface which is neither an ancestor nor an inferior.
     */
    NONLINEAR(GdkNotifyType.GDK_NOTIFY_NONLINEAR),

    /**
     * the pointer moves between two surfaces
     *   which are not ancestors of each other and the surface is part of
     *   the ancestor chain between one of these surfaces and their least
     *   common ancestor.
     */
    NONLINEAR_VIRTUAL(GdkNotifyType.GDK_NOTIFY_NONLINEAR_VIRTUAL),

    /**
     * an unknown type of enter/leave event occurred.
     */
    UNKNOWN(GdkNotifyType.GDK_NOTIFY_UNKNOWN),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GdkNotifyType): NotifyType = when (nativeValue) {
            GdkNotifyType.GDK_NOTIFY_ANCESTOR -> ANCESTOR
            GdkNotifyType.GDK_NOTIFY_VIRTUAL -> VIRTUAL
            GdkNotifyType.GDK_NOTIFY_INFERIOR -> INFERIOR
            GdkNotifyType.GDK_NOTIFY_NONLINEAR -> NONLINEAR
            GdkNotifyType.GDK_NOTIFY_NONLINEAR_VIRTUAL -> NONLINEAR_VIRTUAL
            GdkNotifyType.GDK_NOTIFY_UNKNOWN -> UNKNOWN
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of NotifyType
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_notify_type_get_type()
    }
}
