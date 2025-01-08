// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.Quark
import org.gtkkn.bindings.gobject.annotations.GObjectVersion2_10
import org.gtkkn.bindings.gobject.annotations.GObjectVersion2_38
import org.gtkkn.bindings.gobject.annotations.GObjectVersion2_4
import org.gtkkn.bindings.gobject.annotations.GObjectVersion2_46
import org.gtkkn.bindings.gobject.annotations.GObjectVersion2_66
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.gobject.GParamSpec
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_param_spec_get_blurb
import org.gtkkn.native.gobject.g_param_spec_get_default_value
import org.gtkkn.native.gobject.g_param_spec_get_name
import org.gtkkn.native.gobject.g_param_spec_get_name_quark
import org.gtkkn.native.gobject.g_param_spec_get_nick
import org.gtkkn.native.gobject.g_param_spec_get_qdata
import org.gtkkn.native.gobject.g_param_spec_get_redirect_target
import org.gtkkn.native.gobject.g_param_spec_internal
import org.gtkkn.native.gobject.g_param_spec_is_valid_name
import org.gtkkn.native.gobject.g_param_spec_ref
import org.gtkkn.native.gobject.g_param_spec_ref_sink
import org.gtkkn.native.gobject.g_param_spec_set_qdata
import org.gtkkn.native.gobject.g_param_spec_sink
import org.gtkkn.native.gobject.g_param_spec_steal_qdata
import org.gtkkn.native.gobject.g_param_spec_unref
import kotlin.Boolean
import kotlin.String
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
 * - parameter `destroy`: GLib.DestroyNotify
 */
public open class ParamSpec(pointer: CPointer<GParamSpec>) {
    public val gPointer: CPointer<GParamSpec> = pointer

    /**
     * Get the short description of a #GParamSpec.
     *
     * @return the short description of @pspec.
     */
    public open fun getBlurb(): String? = g_param_spec_get_blurb(gPointer)?.toKString()

    /**
     * Gets the default value of @pspec as a pointer to a #GValue.
     *
     * The #GValue will remain valid for the life of @pspec.
     *
     * @return a pointer to a #GValue which must not be modified
     * @since 2.38
     */
    @GObjectVersion2_38
    public open fun getDefaultValue(): Value = g_param_spec_get_default_value(gPointer)!!.run {
        Value(this)
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
        g_param_spec_get_name(gPointer)?.toKString() ?: error("Expected not null string")

    /**
     * Gets the GQuark for the name.
     *
     * @return the GQuark for @pspec->name.
     * @since 2.46
     */
    @GObjectVersion2_46
    public open fun getNameQuark(): Quark = g_param_spec_get_name_quark(gPointer)

    /**
     * Get the nickname of a #GParamSpec.
     *
     * @return the nickname of @pspec.
     */
    public open fun getNick(): String =
        g_param_spec_get_nick(gPointer)?.toKString() ?: error("Expected not null string")

    /**
     * Gets back user data pointers stored via g_param_spec_set_qdata().
     *
     * @param quark a #GQuark, naming the user data pointer
     * @return the user data pointer set, or null
     */
    public open fun getQdata(quark: Quark): gpointer? = g_param_spec_get_qdata(gPointer, quark)

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
    @GObjectVersion2_4
    public open fun getRedirectTarget(): ParamSpec? = g_param_spec_get_redirect_target(gPointer)?.run {
        ParamSpec(this)
    }

    /**
     * Increments the reference count of @pspec.
     *
     * @return the #GParamSpec that was passed into this function
     */
    public open fun ref(): ParamSpec = g_param_spec_ref(gPointer)!!.run {
        ParamSpec(this)
    }

    /**
     * Convenience function to ref and sink a #GParamSpec.
     *
     * @return the #GParamSpec that was passed into this function
     * @since 2.10
     */
    @GObjectVersion2_10
    public open fun refSink(): ParamSpec = g_param_spec_ref_sink(gPointer)!!.run {
        ParamSpec(this)
    }

    /**
     * Sets an opaque, named pointer on a #GParamSpec. The name is
     * specified through a #GQuark (retrieved e.g. via
     * g_quark_from_static_string()), and the pointer can be gotten back
     * from the @pspec with g_param_spec_get_qdata().  Setting a
     * previously set user data pointer, overrides (frees) the old pointer
     * set, using null as pointer essentially removes the data stored.
     *
     * @param quark a #GQuark, naming the user data pointer
     * @param data an opaque user data pointer
     */
    public open fun setQdata(quark: Quark, `data`: gpointer? = null): Unit =
        g_param_spec_set_qdata(gPointer, quark, `data`)

    /**
     * The initial reference count of a newly created #GParamSpec is 1,
     * even though no one has explicitly called g_param_spec_ref() on it
     * yet. So the initial reference count is flagged as "floating", until
     * someone calls `g_param_spec_ref (pspec); g_param_spec_sink
     * (pspec);` in sequence on it, taking over the initial
     * reference count (thus ending up with a @pspec that has a reference
     * count of 1 still, but is not flagged "floating" anymore).
     */
    public open fun sink(): Unit = g_param_spec_sink(gPointer)

    /**
     * Gets back user data pointers stored via g_param_spec_set_qdata()
     * and removes the @data from @pspec without invoking its destroy()
     * function (if any was set).  Usually, calling this function is only
     * required to update user data pointers with a destroy notifier.
     *
     * @param quark a #GQuark, naming the user data pointer
     * @return the user data pointer set, or null
     */
    public open fun stealQdata(quark: Quark): gpointer? = g_param_spec_steal_qdata(gPointer, quark)

    /**
     * Decrements the reference count of a @pspec.
     */
    public open fun unref(): Unit = g_param_spec_unref(gPointer)

    public companion object {
        /**
         * Creates a new #GParamSpec instance.
         *
         * See [canonical parameter names][canonical-parameter-names] for details of
         * the rules for @name. Names which violate these rules lead to undefined
         * behaviour.
         *
         * Beyond the name, #GParamSpecs have two more descriptive strings, the
         * @nick and @blurb, which may be used as a localized label and description.
         * For GTK and related libraries these are considered deprecated and may be
         * omitted, while for other libraries such as GStreamer and its plugins they
         * are essential. When in doubt, follow the conventions used in the
         * surrounding code and supporting libraries.
         *
         * @param paramType the #GType for the property; must be derived from %G_TYPE_PARAM
         * @param name the canonical name of the property
         * @param nick the nickname of the property
         * @param blurb a short description of the property
         * @param flags a combination of #GParamFlags
         * @return (transfer floating): a newly allocated
         *     #GParamSpec instance, which is initially floating
         */
        public fun `internal`(
            paramType: GType,
            name: String,
            nick: String? = null,
            blurb: String? = null,
            flags: ParamFlags,
        ): ParamSpec = g_param_spec_internal(paramType, name, nick, blurb, flags.mask)!!.run {
            ParamSpec(reinterpret())
        }

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
        @GObjectVersion2_66
        public fun isValidName(name: String): Boolean = g_param_spec_is_valid_name(name).asBoolean()
    }
}
