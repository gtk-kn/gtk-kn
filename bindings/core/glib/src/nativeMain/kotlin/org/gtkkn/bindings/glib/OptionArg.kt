// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GOptionArg

/**
 * The #GOptionArg enum values determine which type of extra argument the
 * options expect to find. If an option expects an extra argument, it can
 * be specified in several ways; with a short option: `-x arg`, with a long
 * option: `--name arg` or combined in a single argument: `--name=arg`.
 */
public enum class OptionArg(
    public val nativeValue: GOptionArg,
) {
    /**
     * No extra argument. This is useful for simple flags or booleans.
     */
    NONE(GOptionArg.G_OPTION_ARG_NONE),

    /**
     * The option takes a UTF-8 string argument.
     */
    STRING(GOptionArg.G_OPTION_ARG_STRING),

    /**
     * The option takes an integer argument.
     */
    INT(GOptionArg.G_OPTION_ARG_INT),

    /**
     * The option provides a callback (of type
     *     #GOptionArgFunc) to parse the extra argument.
     */
    CALLBACK(GOptionArg.G_OPTION_ARG_CALLBACK),

    /**
     * The option takes a filename as argument, which will
     *        be in the GLib filename encoding rather than UTF-8.
     */
    FILENAME(GOptionArg.G_OPTION_ARG_FILENAME),

    /**
     * The option takes a string argument, multiple
     *     uses of the option are collected into an array of strings.
     */
    STRING_ARRAY(GOptionArg.G_OPTION_ARG_STRING_ARRAY),

    /**
     * The option takes a filename as argument,
     *     multiple uses of the option are collected into an array of strings.
     */
    FILENAME_ARRAY(GOptionArg.G_OPTION_ARG_FILENAME_ARRAY),

    /**
     * The option takes a double argument. The argument
     *     can be formatted either for the user's locale or for the "C" locale.
     *     Since 2.12
     */
    DOUBLE(GOptionArg.G_OPTION_ARG_DOUBLE),

    /**
     * The option takes a 64-bit integer. Like
     *     %G_OPTION_ARG_INT but for larger numbers. The number can be in
     *     decimal base, or in hexadecimal (when prefixed with `0x`, for
     *     example, `0xffffffff`). Since 2.12
     */
    INT64(GOptionArg.G_OPTION_ARG_INT64),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GOptionArg): OptionArg =
            when (nativeValue) {
                GOptionArg.G_OPTION_ARG_NONE -> NONE
                GOptionArg.G_OPTION_ARG_STRING -> STRING
                GOptionArg.G_OPTION_ARG_INT -> INT
                GOptionArg.G_OPTION_ARG_CALLBACK -> CALLBACK
                GOptionArg.G_OPTION_ARG_FILENAME -> FILENAME
                GOptionArg.G_OPTION_ARG_STRING_ARRAY -> STRING_ARRAY
                GOptionArg.G_OPTION_ARG_FILENAME_ARRAY -> FILENAME_ARRAY
                GOptionArg.G_OPTION_ARG_DOUBLE -> DOUBLE
                GOptionArg.G_OPTION_ARG_INT64 -> INT64
                else -> error("invalid nativeValue")
            }
    }
}
