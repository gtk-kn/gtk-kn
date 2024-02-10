// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkAssistantPageType
import org.gtkkn.native.gtk.GtkAssistantPageType.GTK_ASSISTANT_PAGE_CONFIRM
import org.gtkkn.native.gtk.GtkAssistantPageType.GTK_ASSISTANT_PAGE_CONTENT
import org.gtkkn.native.gtk.GtkAssistantPageType.GTK_ASSISTANT_PAGE_CUSTOM
import org.gtkkn.native.gtk.GtkAssistantPageType.GTK_ASSISTANT_PAGE_INTRO
import org.gtkkn.native.gtk.GtkAssistantPageType.GTK_ASSISTANT_PAGE_PROGRESS
import org.gtkkn.native.gtk.GtkAssistantPageType.GTK_ASSISTANT_PAGE_SUMMARY

/**
 * Determines the page role inside a `GtkAssistant`.
 *
 * The role is used to handle buttons sensitivity and visibility.
 *
 * Note that an assistant needs to end its page flow with a page of type
 * %GTK_ASSISTANT_PAGE_CONFIRM, %GTK_ASSISTANT_PAGE_SUMMARY or
 * %GTK_ASSISTANT_PAGE_PROGRESS to be correct.
 *
 * The Cancel button will only be shown if the page isn’t “committed”.
 * See gtk_assistant_commit() for details.
 */
public enum class AssistantPageType(
    public val nativeValue: GtkAssistantPageType,
) {
    /**
     * The page has regular contents. Both the
     *  Back and forward buttons will be shown.
     */
    CONTENT(GTK_ASSISTANT_PAGE_CONTENT),

    /**
     * The page contains an introduction to the
     *  assistant task. Only the Forward button will be shown if there is a
     *   next page.
     */
    INTRO(GTK_ASSISTANT_PAGE_INTRO),

    /**
     * The page lets the user confirm or deny the
     *  changes. The Back and Apply buttons will be shown.
     */
    CONFIRM(GTK_ASSISTANT_PAGE_CONFIRM),

    /**
     * The page informs the user of the changes
     *  done. Only the Close button will be shown.
     */
    SUMMARY(GTK_ASSISTANT_PAGE_SUMMARY),

    /**
     * Used for tasks that take a long time to
     *  complete, blocks the assistant until the page is marked as complete.
     *   Only the back button will be shown.
     */
    PROGRESS(GTK_ASSISTANT_PAGE_PROGRESS),

    /**
     * Used for when other page types are not
     *  appropriate. No buttons will be shown, and the application must
     *  add its own buttons through gtk_assistant_add_action_widget().
     */
    CUSTOM(GTK_ASSISTANT_PAGE_CUSTOM),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkAssistantPageType): AssistantPageType =
            when (nativeValue) {
                GTK_ASSISTANT_PAGE_CONTENT -> CONTENT
                GTK_ASSISTANT_PAGE_INTRO -> INTRO
                GTK_ASSISTANT_PAGE_CONFIRM -> CONFIRM
                GTK_ASSISTANT_PAGE_SUMMARY -> SUMMARY
                GTK_ASSISTANT_PAGE_PROGRESS -> PROGRESS
                GTK_ASSISTANT_PAGE_CUSTOM -> CUSTOM
                else -> error("invalid nativeValue")
            }
    }
}
