// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.RGBA
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_28
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.webkit.WebKitInputMethodUnderline
import org.gtkkn.native.webkit.webkit_input_method_underline_copy
import org.gtkkn.native.webkit.webkit_input_method_underline_free
import org.gtkkn.native.webkit.webkit_input_method_underline_new
import org.gtkkn.native.webkit.webkit_input_method_underline_set_color
import kotlin.UInt
import kotlin.Unit

/**
 * Range of text in an preedit string to be shown underlined.
 * @since 2.28
 */
@WebKitVersion2_28
public class InputMethodUnderline(
    pointer: CPointer<WebKitInputMethodUnderline>,
) : Record {
    public val webkitInputMethodUnderlinePointer: CPointer<WebKitInputMethodUnderline> = pointer

    /**
     * Make a copy of the #WebKitInputMethodUnderline.
     *
     * @return A copy of passed in #WebKitInputMethodUnderline
     * @since 2.28
     */
    @WebKitVersion2_28
    public fun copy(): InputMethodUnderline =
        webkit_input_method_underline_copy(webkitInputMethodUnderlinePointer.reinterpret())!!.run {
            InputMethodUnderline(reinterpret())
        }

    /**
     * Free the #WebKitInputMethodUnderline.
     *
     * @since 2.28
     */
    @WebKitVersion2_28
    public fun free(): Unit = webkit_input_method_underline_free(webkitInputMethodUnderlinePointer.reinterpret())

    /**
     * Set the color of the underline.
     *
     * If @rgba is null the foreground text color will be used
     * for the underline too.
     *
     * @param rgba a #GdkRGBA or null
     * @since 2.28
     */
    @WebKitVersion2_28
    public fun setColor(rgba: RGBA? = null): Unit =
        webkit_input_method_underline_set_color(
            webkitInputMethodUnderlinePointer.reinterpret(),
            rgba?.gdkRGBAPointer?.reinterpret()
        )

    public companion object : RecordCompanion<InputMethodUnderline, WebKitInputMethodUnderline> {
        /**
         * Create a new #WebKitInputMethodUnderline for the given range in preedit string
         *
         * @param startOffset the start offset in preedit string
         * @param endOffset the end offset in preedit string
         * @return A newly created #WebKitInputMethodUnderline
         * @since 2.28
         */
        public fun new(
            startOffset: UInt,
            endOffset: UInt,
        ): InputMethodUnderline =
            InputMethodUnderline(webkit_input_method_underline_new(startOffset, endOffset)!!.reinterpret())

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): InputMethodUnderline =
            InputMethodUnderline(pointer.reinterpret())
    }
}
