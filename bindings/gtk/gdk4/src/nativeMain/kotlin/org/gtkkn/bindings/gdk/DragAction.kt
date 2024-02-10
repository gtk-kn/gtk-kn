// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gdk.GDK_ACTION_ASK
import org.gtkkn.native.gdk.GDK_ACTION_COPY
import org.gtkkn.native.gdk.GDK_ACTION_LINK
import org.gtkkn.native.gdk.GDK_ACTION_MOVE
import org.gtkkn.native.gdk.GdkDragAction

/**
 * Used in `GdkDrop` and `GdkDrag` to indicate the actions that the
 * destination can and should do with the dropped data.
 */
public class DragAction(
    public val mask: GdkDragAction,
) : Bitfield<DragAction> {
    override infix fun or(other: DragAction): DragAction = DragAction(mask or other.mask)

    public companion object {
        /**
         * Copy the data.
         */
        public val COPY: DragAction = DragAction(GDK_ACTION_COPY)

        /**
         * Move the data, i.e. first copy it, then delete
         *   it from the source using the DELETE target of the X selection protocol.
         */
        public val MOVE: DragAction = DragAction(GDK_ACTION_MOVE)

        /**
         * Add a link to the data. Note that this is only
         *   useful if source and destination agree on what it means, and is not
         *   supported on all platforms.
         */
        public val LINK: DragAction = DragAction(GDK_ACTION_LINK)

        /**
         * Ask the user what to do with the data.
         */
        public val ASK: DragAction = DragAction(GDK_ACTION_ASK)
    }
}
