// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_6
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.toCStringList
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitUserStyleSheet
import org.gtkkn.native.webkit.webkit_user_style_sheet_get_type
import org.gtkkn.native.webkit.webkit_user_style_sheet_new
import org.gtkkn.native.webkit.webkit_user_style_sheet_new_for_world
import org.gtkkn.native.webkit.webkit_user_style_sheet_ref
import org.gtkkn.native.webkit.webkit_user_style_sheet_unref
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * A CSS style sheet which can be injected in loaded pages.
 * @since 2.6
 */
@WebKitVersion2_6
public class UserStyleSheet(public val webkitUserStyleSheetPointer: CPointer<WebKitUserStyleSheet>) :
    ProxyInstance(webkitUserStyleSheetPointer) {
    /**
     * Atomically increments the reference count of @user_style_sheet by one.
     *
     * This function is MT-safe and may be called from any thread.
     *
     * @return The passed #WebKitUserStyleSheet
     * @since 2.6
     */
    @WebKitVersion2_6
    public fun ref(): UserStyleSheet = webkit_user_style_sheet_ref(webkitUserStyleSheetPointer)!!.run {
        UserStyleSheet(this)
    }

    /**
     * Atomically decrements the reference count of @user_style_sheet by one.
     *
     * If the reference count drops to 0, all memory allocated by
     * #WebKitUserStyleSheet is released. This function is MT-safe and may be
     * called from any thread.
     *
     * @since 2.6
     */
    @WebKitVersion2_6
    public fun unref(): Unit = webkit_user_style_sheet_unref(webkitUserStyleSheetPointer)

    public companion object {
        /**
         * Creates a new user style sheet.
         *
         * Style sheets can be applied to some URIs
         * only by passing non-null values for @allow_list or @block_list. Passing a
         * null allow_list implies that all URIs are on the allow_list. The style
         * sheet is applied if an URI matches the allow_list and not the block_list.
         * URI patterns must be of the form `[protocol]://[host]/[path]`, where the
         * *host* and *path* components can contain the wildcard character (`*`) to
         * represent zero or more other characters.
         *
         * @param source Source code of the user style sheet.
         * @param injectedFrames A #WebKitUserContentInjectedFrames value
         * @param level A #WebKitUserStyleLevel
         * @param allowList An allow_list of URI patterns or null
         * @param blockList A block_list of URI patterns or null
         * @return A new #WebKitUserStyleSheet
         * @since 2.6
         */
        public fun new(
            source: String,
            injectedFrames: UserContentInjectedFrames,
            level: UserStyleLevel,
            allowList: List<String>? = null,
            blockList: List<String>? = null,
        ): UserStyleSheet {
            memScoped {
                return UserStyleSheet(
                    webkit_user_style_sheet_new(
                        source,
                        injectedFrames.nativeValue,
                        level.nativeValue,
                        allowList?.toCStringList(this),
                        blockList?.toCStringList(this)
                    )!!.reinterpret()
                )
            }
        }

        /**
         * Creates a new user style sheet for script world.
         *
         * Creates a new user style sheet for script world with name @world_name.
         * See webkit_user_style_sheet_new() for a full description.
         *
         * @param source Source code of the user style sheet.
         * @param injectedFrames A #WebKitUserContentInjectedFrames value
         * @param level A #WebKitUserStyleLevel
         * @param worldName the name of a #WebKitScriptWorld
         * @param allowList An allow_list of URI patterns or null
         * @param blockList A block_list of URI patterns or null
         * @return A new #WebKitUserStyleSheet
         * @since 2.22
         */
        public fun newForWorld(
            source: String,
            injectedFrames: UserContentInjectedFrames,
            level: UserStyleLevel,
            worldName: String,
            allowList: List<String>? = null,
            blockList: List<String>? = null,
        ): UserStyleSheet {
            memScoped {
                return UserStyleSheet(
                    webkit_user_style_sheet_new_for_world(
                        source,
                        injectedFrames.nativeValue,
                        level.nativeValue,
                        worldName,
                        allowList?.toCStringList(this),
                        blockList?.toCStringList(this)
                    )!!.reinterpret()
                )
            }
        }

        /**
         * Get the GType of UserStyleSheet
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_user_style_sheet_get_type()
    }
}
