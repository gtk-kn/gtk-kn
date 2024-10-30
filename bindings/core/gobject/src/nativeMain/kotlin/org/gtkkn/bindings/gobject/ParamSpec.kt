// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.native.gobject.GParamSpec
import org.gtkkn.native.gobject.g_param_spec_get_blurb
import org.gtkkn.native.gobject.g_param_spec_get_default_value
import org.gtkkn.native.gobject.g_param_spec_get_name
import org.gtkkn.native.gobject.g_param_spec_get_name_quark
import org.gtkkn.native.gobject.g_param_spec_get_nick
import org.gtkkn.native.gobject.g_param_spec_get_redirect_target
import org.gtkkn.native.gobject.g_param_spec_is_valid_name
import org.gtkkn.native.gobject.g_param_spec_sink
import kotlin.Boolean
import kotlin.String
import kotlin.UInt
import kotlin.Unit

/**
 * `GParamSpec` encapsulates the metadata required to specify parameters, such as `GObject` properties.
 *
 * ## Parameter names
 *
 * A property name consists of one or more segments consisting of ASCII letters
 * and digits, separated by either the `-` or `_` character. The first
 * character of a property name must be a letter. These are the same rules as
 * for signal naming (see [func@GObject.signal_new]).
 *
 * When creating and looking up a `GParamSpec`, either separator can be
 * used, but they cannot be mixed. Using `-` is considerably more
 * efficient, and is the ‘canonical form’. Using `_` is discouraged.
 *
 * ## Skipped during bindings generation
 *
 * - method `get_qdata`: Return type gpointer is unsupported
 * - parameter `data`: gpointer
 * - method `steal_qdata`: Return type gpointer is unsupported
 */
public open class ParamSpec(
    pointer: CPointer<GParamSpec>,
) {
    public val gPointer: CPointer<GParamSpec>

    init {
        gPointer = pointer.reinterpret()
    }

    /**
     * Get the short description of a #GParamSpec.
     *
     * @return the short description of @pspec.
     */
    public open fun getBlurb(): String? = g_param_spec_get_blurb(gPointer.reinterpret())?.toKString()

    /**
     * Gets the default value of @pspec as a pointer to a #GValue.
     *
     * The #GValue will remain valid for the life of @pspec.
     *
     * @return a pointer to a #GValue which must not be modified
     * @since 2.38
     */
    public open fun getDefaultValue(): Value =
        g_param_spec_get_default_value(gPointer.reinterpret())!!.run {
            Value(reinterpret())
        }

    /**
     * Get the name of a #GParamSpec.
     *
     * The name is always an "interned" string (as per g_intern_string()).
     * This allows for pointer-value comparisons.
     *
     * @return the name of @pspec.
     */
    public open fun getName(): String =
        g_param_spec_get_name(gPointer.reinterpret())?.toKString() ?: error("Expected not null string")

    /**
     * Gets the GQuark for the name.
     *
     * @return the GQuark for @pspec->name.
     * @since 2.46
     */
    public open fun getNameQuark(): UInt = g_param_spec_get_name_quark(gPointer.reinterpret())

    /**
     * Get the nickname of a #GParamSpec.
     *
     * @return the nickname of @pspec.
     */
    public open fun getNick(): String =
        g_param_spec_get_nick(gPointer.reinterpret())?.toKString() ?: error("Expected not null string")

    /**
     * If the paramspec redirects operations to another paramspec,
     * returns that paramspec. Redirect is used typically for
     * providing a new implementation of a property in a derived
     * type while preserving all the properties from the parent
     * type. Redirection is established by creating a property
     * of type #GParamSpecOverride. See g_object_class_override_property()
     * for an example of the use of this capability.
     *
     * @return paramspec to which requests on this
     *          paramspec should be redirected, or null if none.
     * @since 2.4
     */
    public open fun getRedirectTarget(): ParamSpec? =
        g_param_spec_get_redirect_target(gPointer.reinterpret())?.run {
            ParamSpec(reinterpret())
        }

    /**
     * The initial reference count of a newly created #GParamSpec is 1,
     * even though no one has explicitly called g_param_spec_ref() on it
     * yet. So the initial reference count is flagged as "floating", until
     * someone calls `g_param_spec_ref (pspec); g_param_spec_sink
     * (pspec);` in sequence on it, taking over the initial
     * reference count (thus ending up with a @pspec that has a reference
     * count of 1 still, but is not flagged "floating" anymore).
     */
    public open fun sink(): Unit = g_param_spec_sink(gPointer.reinterpret())

    public companion object {
        /**
         * Validate a property name for a #GParamSpec. This can be useful for
         * dynamically-generated properties which need to be validated at run-time
         * before actually trying to create them.
         *
         * See [canonical parameter names][canonical-parameter-names] for details of
         * the rules for valid names.
         *
         * @param name the canonical name of the property
         * @return true if @name is a valid property name, false otherwise.
         * @since 2.66
         */
        public fun isValidName(name: String): Boolean = g_param_spec_is_valid_name(name).asBoolean()
    }
}
