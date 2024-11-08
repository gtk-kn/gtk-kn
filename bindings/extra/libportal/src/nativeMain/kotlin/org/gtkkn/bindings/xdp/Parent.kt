// This is a generated file. Do not modify.
package org.gtkkn.bindings.xdp

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.xdp.XdpParent
import org.gtkkn.native.xdp.xdp_parent_copy
import org.gtkkn.native.xdp.xdp_parent_free
import kotlin.Unit

/**
 * Parent window abstraction.
 *
 * The [struct@Parent] struct provides an abstract way to represent
 * a window, without introducing a dependency on a toolkit
 * library.
 *
 * An XdpParent implementation for GTK is included in the
 * `portal-gtk3.h` and `portal-gtk4.h` header files, in the form of inline functions.
 * To create a XdpParent for a GTK window, use
 * `xdp_parent_new_gtk()`.
 */
public class Parent(
    pointer: CPointer<XdpParent>,
) : Record {
    public val xdpParentPointer: CPointer<XdpParent> = pointer

    /**
     * Copies @source into a new [struct@Parent].
     *
     * @return an [struct@Parent] that is a copy of @source
     */
    public fun copy(): Parent =
        xdp_parent_copy(xdpParentPointer.reinterpret())!!.run {
            Parent(reinterpret())
        }

    /**
     * Frees @parent.
     */
    public fun free(): Unit = xdp_parent_free(xdpParentPointer.reinterpret())

    public companion object : RecordCompanion<Parent, XdpParent> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Parent = Parent(pointer.reinterpret())
    }
}
