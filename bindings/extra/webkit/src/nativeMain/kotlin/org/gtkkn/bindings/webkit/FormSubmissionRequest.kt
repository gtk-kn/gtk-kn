// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitFormSubmissionRequest
import org.gtkkn.native.webkit.webkit_form_submission_request_get_type
import org.gtkkn.native.webkit.webkit_form_submission_request_submit
import kotlin.Unit

/**
 * Represents a form submission request.
 *
 * When a form is about to be submitted in a #WebKitWebView, the
 * #WebKitWebView::submit-form signal is emitted. Its request argument
 * contains information about the text fields of the form, that are
 * typically used to store login information, returned as lists by
 * webkit_form_submission_request_list_text_fields(). You can submit the
 * form with webkit_form_submission_request_submit().
 *
 * ## Skipped during bindings generation
 *
 * - parameter `field_names`: field_names: Out parameter is not supported
 */
public class FormSubmissionRequest(
    public val webkitFormSubmissionRequestPointer: CPointer<WebKitFormSubmissionRequest>,
) : Object(webkitFormSubmissionRequestPointer.reinterpret()),
    KGTyped {
    /**
     * Continue the form submission.
     */
    public fun submit(): Unit = webkit_form_submission_request_submit(webkitFormSubmissionRequestPointer)

    public companion object : TypeCompanion<FormSubmissionRequest> {
        override val type: GeneratedClassKGType<FormSubmissionRequest> =
            GeneratedClassKGType(getTypeOrNull("webkit_form_submission_request_get_type")!!) {
                FormSubmissionRequest(it.reinterpret())
            }

        init {
            WebkitTypeProvider.register()
        }

        /**
         * Get the GType of FormSubmissionRequest
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_form_submission_request_get_type()
    }
}
