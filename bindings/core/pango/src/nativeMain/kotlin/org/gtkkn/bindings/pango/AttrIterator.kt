// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.SList
import org.gtkkn.bindings.pango.annotations.PangoVersion1_2
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.pango.PangoAttrIterator
import org.gtkkn.native.pango.pango_attr_iterator_copy
import org.gtkkn.native.pango.pango_attr_iterator_destroy
import org.gtkkn.native.pango.pango_attr_iterator_get
import org.gtkkn.native.pango.pango_attr_iterator_get_attrs
import org.gtkkn.native.pango.pango_attr_iterator_next
import kotlin.Boolean
import kotlin.Unit

/**
 * A `PangoAttrIterator` is used to iterate through a `PangoAttrList`.
 *
 * A new iterator is created with [method@Pango.AttrList.get_iterator].
 * Once the iterator is created, it can be advanced through the style
 * changes in the text using [method@Pango.AttrIterator.next]. At each
 * style change, the range of the current style segment and the attributes
 * currently in effect can be queried.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `language`: language: Out parameter is not supported
 * - parameter `start`: start: Out parameter is not supported
 */
public class AttrIterator(
    pointer: CPointer<PangoAttrIterator>,
) : Record {
    public val pangoAttrIteratorPointer: CPointer<PangoAttrIterator> = pointer

    /**
     * Copy a `PangoAttrIterator`.
     *
     * @return the newly allocated
     *   `PangoAttrIterator`, which should be freed with
     *   [method@Pango.AttrIterator.destroy]
     */
    public fun copy(): AttrIterator =
        pango_attr_iterator_copy(pangoAttrIteratorPointer.reinterpret())!!.run {
            AttrIterator(reinterpret())
        }

    /**
     * Destroy a `PangoAttrIterator` and free all associated memory.
     */
    public fun destroy(): Unit = pango_attr_iterator_destroy(pangoAttrIteratorPointer.reinterpret())

    /**
     * Find the current attribute of a particular type
     * at the iterator location.
     *
     * When multiple attributes of the same type overlap,
     * the attribute whose range starts closest to the
     * current location is used.
     *
     * @param type the type of attribute to find
     * @return the current
     *   attribute of the given type, or null if no attribute
     *   of that type applies to the current location.
     */
    public fun `get`(type: AttrType): Attribute? =
        pango_attr_iterator_get(pangoAttrIteratorPointer.reinterpret(), type.nativeValue)?.run {
            Attribute(reinterpret())
        }

    /**
     * Gets a list of all attributes at the current position of the
     * iterator.
     *
     * @return
     *   a list of all attributes for the current range. To free
     *   this value, call [method@Pango.Attribute.destroy] on each
     *   value and g_slist_free() on the list.
     * @since 1.2
     */
    @PangoVersion1_2
    public fun getAttrs(): SList =
        pango_attr_iterator_get_attrs(pangoAttrIteratorPointer.reinterpret())!!.run {
            SList(reinterpret())
        }

    /**
     * Advance the iterator until the next change of style.
     *
     * @return false if the iterator is at the end
     *   of the list, otherwise true
     */
    public fun next(): Boolean = pango_attr_iterator_next(pangoAttrIteratorPointer.reinterpret()).asBoolean()

    public companion object : RecordCompanion<AttrIterator, PangoAttrIterator> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): AttrIterator =
            AttrIterator(pointer.reinterpret())
    }
}
