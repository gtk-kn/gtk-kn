// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.webkit.WEBKIT_HIT_TEST_RESULT_CONTEXT_DOCUMENT
import org.gtkkn.native.webkit.WEBKIT_HIT_TEST_RESULT_CONTEXT_EDITABLE
import org.gtkkn.native.webkit.WEBKIT_HIT_TEST_RESULT_CONTEXT_IMAGE
import org.gtkkn.native.webkit.WEBKIT_HIT_TEST_RESULT_CONTEXT_LINK
import org.gtkkn.native.webkit.WEBKIT_HIT_TEST_RESULT_CONTEXT_MEDIA
import org.gtkkn.native.webkit.WEBKIT_HIT_TEST_RESULT_CONTEXT_SCROLLBAR
import org.gtkkn.native.webkit.WEBKIT_HIT_TEST_RESULT_CONTEXT_SELECTION
import org.gtkkn.native.webkit.WebKitHitTestResultContext

/**
 * Enum values with flags representing the context of a #WebKitHitTestResult.
 */
public class HitTestResultContext(
    public val mask: WebKitHitTestResultContext,
) : Bitfield<HitTestResultContext> {
    override infix fun or(other: HitTestResultContext): HitTestResultContext = HitTestResultContext(mask or other.mask)

    public companion object {
        /**
         * anywhere in the document.
         */
        public val DOCUMENT: HitTestResultContext =
            HitTestResultContext(WEBKIT_HIT_TEST_RESULT_CONTEXT_DOCUMENT)

        /**
         * a hyperlink element.
         */
        public val LINK: HitTestResultContext =
            HitTestResultContext(WEBKIT_HIT_TEST_RESULT_CONTEXT_LINK)

        /**
         * an image element.
         */
        public val IMAGE: HitTestResultContext =
            HitTestResultContext(WEBKIT_HIT_TEST_RESULT_CONTEXT_IMAGE)

        /**
         * a video or audio element.
         */
        public val MEDIA: HitTestResultContext =
            HitTestResultContext(WEBKIT_HIT_TEST_RESULT_CONTEXT_MEDIA)

        /**
         * an editable element
         */
        public val EDITABLE: HitTestResultContext =
            HitTestResultContext(WEBKIT_HIT_TEST_RESULT_CONTEXT_EDITABLE)

        /**
         * a scrollbar element.
         */
        public val SCROLLBAR: HitTestResultContext =
            HitTestResultContext(WEBKIT_HIT_TEST_RESULT_CONTEXT_SCROLLBAR)

        /**
         * a selected element. Since 2.8
         */
        public val SELECTION: HitTestResultContext =
            HitTestResultContext(WEBKIT_HIT_TEST_RESULT_CONTEXT_SELECTION)
    }
}
