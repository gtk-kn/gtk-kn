// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.webkit

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitContextMenuAction
import org.gtkkn.native.webkit.webkit_context_menu_action_get_type

/**
 * Enum values used to denote the stock actions for
 * #WebKitContextMenuItem<!-- -->s
 */
public enum class ContextMenuAction(public val nativeValue: WebKitContextMenuAction) {
    /**
     * No action, used by separator menu items.
     */
    NO_ACTION(WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_NO_ACTION),

    /**
     * Open current link.
     */
    OPEN_LINK(WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_OPEN_LINK),

    /**
     * Open current link in a new window.
     */
    OPEN_LINK_IN_NEW_WINDOW(WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_OPEN_LINK_IN_NEW_WINDOW),

    /**
     * Download link destination.
     */
    DOWNLOAD_LINK_TO_DISK(WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_DOWNLOAD_LINK_TO_DISK),

    /**
     * Copy link location to the clipboard.
     */
    COPY_LINK_TO_CLIPBOARD(WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_COPY_LINK_TO_CLIPBOARD),

    /**
     * Open current image in a new window.
     */
    OPEN_IMAGE_IN_NEW_WINDOW(WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_OPEN_IMAGE_IN_NEW_WINDOW),

    /**
     * Download current image.
     */
    DOWNLOAD_IMAGE_TO_DISK(WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_DOWNLOAD_IMAGE_TO_DISK),

    /**
     * Copy current image to the clipboard.
     */
    COPY_IMAGE_TO_CLIPBOARD(WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_COPY_IMAGE_TO_CLIPBOARD),

    /**
     * Copy current image location to the clipboard.
     */
    COPY_IMAGE_URL_TO_CLIPBOARD(WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_COPY_IMAGE_URL_TO_CLIPBOARD),

    /**
     * Open current frame in a new window.
     */
    OPEN_FRAME_IN_NEW_WINDOW(WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_OPEN_FRAME_IN_NEW_WINDOW),

    /**
     * Load the previous history item.
     */
    GO_BACK(WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_GO_BACK),

    /**
     * Load the next history item.
     */
    GO_FORWARD(WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_GO_FORWARD),

    /**
     * Stop any ongoing loading operation.
     */
    STOP(WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_STOP),

    /**
     * Reload the contents of current view.
     */
    RELOAD(WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_RELOAD),

    /**
     * Copy current selection the clipboard.
     */
    COPY(WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_COPY),

    /**
     * Cut current selection to the clipboard.
     */
    CUT(WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_CUT),

    /**
     * Paste clipboard contents.
     */
    PASTE(WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_PASTE),

    /**
     * Delete current selection.
     */
    DELETE(WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_DELETE),

    /**
     * Select all text.
     */
    SELECT_ALL(WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_SELECT_ALL),

    /**
     * Input methods menu.
     */
    INPUT_METHODS(WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_INPUT_METHODS),

    /**
     * Unicode menu.
     */
    UNICODE(WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_UNICODE),

    /**
     * A proposed replacement for a misspelled word.
     */
    SPELLING_GUESS(WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_SPELLING_GUESS),

    /**
     * An indicator that spellchecking found no proposed replacements.
     */
    NO_GUESSES_FOUND(WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_NO_GUESSES_FOUND),

    /**
     * Causes the spellchecker to ignore the word for this session.
     */
    IGNORE_SPELLING(WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_IGNORE_SPELLING),

    /**
     * Causes the spellchecker to add the word to the dictionary.
     */
    LEARN_SPELLING(WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_LEARN_SPELLING),

    /**
     * Ignore grammar.
     */
    IGNORE_GRAMMAR(WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_IGNORE_GRAMMAR),

    /**
     * Font options menu.
     */
    FONT_MENU(WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_FONT_MENU),

    /**
     * Bold.
     */
    BOLD(WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_BOLD),

    /**
     * Italic.
     */
    ITALIC(WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_ITALIC),

    /**
     * Underline.
     */
    UNDERLINE(WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_UNDERLINE),

    /**
     * Outline.
     */
    OUTLINE(WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_OUTLINE),

    /**
     * Open current element in the inspector.
     */
    INSPECT_ELEMENT(WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_INSPECT_ELEMENT),

    /**
     * Open current video element in a new window.
     */
    OPEN_VIDEO_IN_NEW_WINDOW(WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_OPEN_VIDEO_IN_NEW_WINDOW),

    /**
     * Open current audio element in a new window.
     */
    OPEN_AUDIO_IN_NEW_WINDOW(WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_OPEN_AUDIO_IN_NEW_WINDOW),

    /**
     * Copy video link location in to the clipboard.
     */
    COPY_VIDEO_LINK_TO_CLIPBOARD(WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_COPY_VIDEO_LINK_TO_CLIPBOARD),

    /**
     * Copy audio link location in to the clipboard.
     */
    COPY_AUDIO_LINK_TO_CLIPBOARD(WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_COPY_AUDIO_LINK_TO_CLIPBOARD),

    /**
     * Enable or disable media controls.
     */
    TOGGLE_MEDIA_CONTROLS(WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_TOGGLE_MEDIA_CONTROLS),

    /**
     * Enable or disable media loop.
     */
    TOGGLE_MEDIA_LOOP(WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_TOGGLE_MEDIA_LOOP),

    /**
     * Show current video element in fullscreen mode.
     */
    ENTER_VIDEO_FULLSCREEN(WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_ENTER_VIDEO_FULLSCREEN),

    /**
     * Play current media element.
     */
    MEDIA_PLAY(WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_MEDIA_PLAY),

    /**
     * Pause current media element.
     */
    MEDIA_PAUSE(WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_MEDIA_PAUSE),

    /**
     * Mute current media element.
     */
    MEDIA_MUTE(WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_MEDIA_MUTE),

    /**
     * Download video to disk. Since 2.2
     */
    DOWNLOAD_VIDEO_TO_DISK(WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_DOWNLOAD_VIDEO_TO_DISK),

    /**
     * Download audio to disk. Since 2.2
     */
    DOWNLOAD_AUDIO_TO_DISK(WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_DOWNLOAD_AUDIO_TO_DISK),

    /**
     * Insert an emoji. Since 2.26
     */
    INSERT_EMOJI(WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_INSERT_EMOJI),

    /**
     * Paste clipboard contents as plain text. Since 2.30
     */
    PASTE_AS_PLAIN_TEXT(WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_PASTE_AS_PLAIN_TEXT),

    /**
     * Custom action defined by applications.
     */
    CUSTOM(WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_CUSTOM),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: WebKitContextMenuAction): ContextMenuAction = when (nativeValue) {
            WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_NO_ACTION -> NO_ACTION
            WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_OPEN_LINK -> OPEN_LINK
            WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_OPEN_LINK_IN_NEW_WINDOW -> OPEN_LINK_IN_NEW_WINDOW
            WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_DOWNLOAD_LINK_TO_DISK -> DOWNLOAD_LINK_TO_DISK
            WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_COPY_LINK_TO_CLIPBOARD -> COPY_LINK_TO_CLIPBOARD
            WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_OPEN_IMAGE_IN_NEW_WINDOW -> OPEN_IMAGE_IN_NEW_WINDOW
            WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_DOWNLOAD_IMAGE_TO_DISK -> DOWNLOAD_IMAGE_TO_DISK
            WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_COPY_IMAGE_TO_CLIPBOARD -> COPY_IMAGE_TO_CLIPBOARD
            WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_COPY_IMAGE_URL_TO_CLIPBOARD -> COPY_IMAGE_URL_TO_CLIPBOARD
            WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_OPEN_FRAME_IN_NEW_WINDOW -> OPEN_FRAME_IN_NEW_WINDOW
            WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_GO_BACK -> GO_BACK
            WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_GO_FORWARD -> GO_FORWARD
            WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_STOP -> STOP
            WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_RELOAD -> RELOAD
            WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_COPY -> COPY
            WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_CUT -> CUT
            WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_PASTE -> PASTE
            WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_DELETE -> DELETE
            WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_SELECT_ALL -> SELECT_ALL
            WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_INPUT_METHODS -> INPUT_METHODS
            WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_UNICODE -> UNICODE
            WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_SPELLING_GUESS -> SPELLING_GUESS
            WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_NO_GUESSES_FOUND -> NO_GUESSES_FOUND
            WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_IGNORE_SPELLING -> IGNORE_SPELLING
            WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_LEARN_SPELLING -> LEARN_SPELLING
            WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_IGNORE_GRAMMAR -> IGNORE_GRAMMAR
            WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_FONT_MENU -> FONT_MENU
            WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_BOLD -> BOLD
            WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_ITALIC -> ITALIC
            WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_UNDERLINE -> UNDERLINE
            WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_OUTLINE -> OUTLINE
            WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_INSPECT_ELEMENT -> INSPECT_ELEMENT
            WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_OPEN_VIDEO_IN_NEW_WINDOW -> OPEN_VIDEO_IN_NEW_WINDOW
            WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_OPEN_AUDIO_IN_NEW_WINDOW -> OPEN_AUDIO_IN_NEW_WINDOW
            WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_COPY_VIDEO_LINK_TO_CLIPBOARD -> COPY_VIDEO_LINK_TO_CLIPBOARD
            WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_COPY_AUDIO_LINK_TO_CLIPBOARD -> COPY_AUDIO_LINK_TO_CLIPBOARD
            WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_TOGGLE_MEDIA_CONTROLS -> TOGGLE_MEDIA_CONTROLS
            WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_TOGGLE_MEDIA_LOOP -> TOGGLE_MEDIA_LOOP
            WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_ENTER_VIDEO_FULLSCREEN -> ENTER_VIDEO_FULLSCREEN
            WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_MEDIA_PLAY -> MEDIA_PLAY
            WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_MEDIA_PAUSE -> MEDIA_PAUSE
            WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_MEDIA_MUTE -> MEDIA_MUTE
            WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_DOWNLOAD_VIDEO_TO_DISK -> DOWNLOAD_VIDEO_TO_DISK
            WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_DOWNLOAD_AUDIO_TO_DISK -> DOWNLOAD_AUDIO_TO_DISK
            WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_INSERT_EMOJI -> INSERT_EMOJI
            WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_PASTE_AS_PLAIN_TEXT -> PASTE_AS_PLAIN_TEXT
            WebKitContextMenuAction.WEBKIT_CONTEXT_MENU_ACTION_CUSTOM -> CUSTOM
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of ContextMenuAction
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_context_menu_action_get_type()
    }
}
