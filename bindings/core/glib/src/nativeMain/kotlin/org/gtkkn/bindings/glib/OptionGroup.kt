// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.annotations.GLibVersion2_44
import org.gtkkn.bindings.glib.annotations.GLibVersion2_6
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.native.glib.GOptionGroup
import org.gtkkn.native.glib.g_option_group_free
import org.gtkkn.native.glib.g_option_group_ref
import org.gtkkn.native.glib.g_option_group_set_translate_func
import org.gtkkn.native.glib.g_option_group_set_translation_domain
import org.gtkkn.native.glib.g_option_group_unref
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_option_group_get_type
import kotlin.String
import kotlin.Unit

/**
 * A `GOptionGroup` struct defines the options in a single
 * group. The struct has only private fields and should not be directly accessed.
 *
 * All options in a group share the same translation function. Libraries which
 * need to parse commandline options are expected to provide a function for
 * getting a `GOptionGroup` holding their options, which
 * the application can then add to its #GOptionContext.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `entries`: Not-pointer record OptionEntry is ignored
 * - parameter `error_func`: OptionErrorFunc
 * - parameter `pre_parse_func`: OptionParseFunc
 * - parameter `destroy`: DestroyNotify
 */
public class OptionGroup(pointer: CPointer<GOptionGroup>) : ProxyInstance(pointer) {
    public val gPointer: CPointer<GOptionGroup> = pointer

    /**
     * Frees a #GOptionGroup. Note that you must not free groups
     * which have been added to a #GOptionContext.
     *
     * @since 2.6
     */
    @GLibVersion2_6
    public fun free(): Unit = g_option_group_free(gPointer.reinterpret())

    /**
     * Increments the reference count of @group by one.
     *
     * @return a #GOptionGroup
     * @since 2.44
     */
    @GLibVersion2_44
    public fun ref(): OptionGroup = g_option_group_ref(gPointer.reinterpret())!!.run {
        OptionGroup(reinterpret())
    }

    /**
     * Sets the function which is used to translate user-visible strings,
     * for `--help` output. Different groups can use different
     * #GTranslateFuncs. If @func is null, strings are not translated.
     *
     * If you are using gettext(), you only need to set the translation
     * domain, see g_option_group_set_translation_domain().
     *
     * @param func the #GTranslateFunc, or null
     * @since 2.6
     */
    @GLibVersion2_6
    public fun setTranslateFunc(func: TranslateFunc?): Unit = g_option_group_set_translate_func(
        gPointer.reinterpret(),
        func?.let {
            TranslateFuncFunc.reinterpret()
        },
        func?.let { StableRef.create(func).asCPointer() },
        func?.let { staticStableRefDestroy.reinterpret() }
    )

    /**
     * A convenience function to use gettext() for translating
     * user-visible strings.
     *
     * @param domain the domain to use
     * @since 2.6
     */
    @GLibVersion2_6
    public fun setTranslationDomain(domain: String): Unit =
        g_option_group_set_translation_domain(gPointer.reinterpret(), domain)

    /**
     * Decrements the reference count of @group by one.
     * If the reference count drops to 0, the @group will be freed.
     * and all memory allocated by the @group is released.
     *
     * @since 2.44
     */
    @GLibVersion2_44
    public fun unref(): Unit = g_option_group_unref(gPointer.reinterpret())

    public companion object {
        /**
         * Get the GType of OptionGroup
         *
         * @return the GType
         */
        public fun getType(): GType = g_option_group_get_type()
    }
}
