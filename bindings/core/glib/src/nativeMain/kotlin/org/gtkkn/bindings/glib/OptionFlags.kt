// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.glib

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.glib.GOptionFlags
import org.gtkkn.native.glib.G_OPTION_FLAG_FILENAME
import org.gtkkn.native.glib.G_OPTION_FLAG_HIDDEN
import org.gtkkn.native.glib.G_OPTION_FLAG_IN_MAIN
import org.gtkkn.native.glib.G_OPTION_FLAG_NOALIAS
import org.gtkkn.native.glib.G_OPTION_FLAG_NONE
import org.gtkkn.native.glib.G_OPTION_FLAG_NO_ARG
import org.gtkkn.native.glib.G_OPTION_FLAG_OPTIONAL_ARG
import org.gtkkn.native.glib.G_OPTION_FLAG_REVERSE

/**
 * Flags which modify individual options.
 */
public class OptionFlags(public val mask: GOptionFlags) : Bitfield<OptionFlags> {
    override infix fun or(other: OptionFlags): OptionFlags = OptionFlags(mask or other.mask)

    public companion object {
        /**
         * No flags. Since: 2.42.
         */
        public val NONE: OptionFlags = OptionFlags(G_OPTION_FLAG_NONE)

        /**
         * The option doesn't appear in `--help` output.
         */
        public val HIDDEN: OptionFlags = OptionFlags(G_OPTION_FLAG_HIDDEN)

        /**
         * The option appears in the main section of the
         *     `--help` output, even if it is defined in a group.
         */
        public val IN_MAIN: OptionFlags = OptionFlags(G_OPTION_FLAG_IN_MAIN)

        /**
         * For options of the %G_OPTION_ARG_NONE kind, this
         *     flag indicates that the sense of the option is reversed. i.e. false will
         *     be stored into the argument rather than true.
         */
        public val REVERSE: OptionFlags = OptionFlags(G_OPTION_FLAG_REVERSE)

        /**
         * For options of the %G_OPTION_ARG_CALLBACK kind,
         *     this flag indicates that the callback does not take any argument
         *     (like a %G_OPTION_ARG_NONE option). Since 2.8
         */
        public val NO_ARG: OptionFlags = OptionFlags(G_OPTION_FLAG_NO_ARG)

        /**
         * For options of the %G_OPTION_ARG_CALLBACK
         *     kind, this flag indicates that the argument should be passed to the
         *     callback in the GLib filename encoding rather than UTF-8. Since 2.8
         */
        public val FILENAME: OptionFlags = OptionFlags(G_OPTION_FLAG_FILENAME)

        /**
         * For options of the %G_OPTION_ARG_CALLBACK
         *     kind, this flag indicates that the argument supply is optional.
         *     If no argument is given then data of %GOptionParseFunc will be
         *     set to NULL. Since 2.8
         */
        public val OPTIONAL_ARG: OptionFlags = OptionFlags(G_OPTION_FLAG_OPTIONAL_ARG)

        /**
         * This flag turns off the automatic conflict
         *     resolution which prefixes long option names with `groupname-` if
         *     there is a conflict. This option should only be used in situations
         *     where aliasing is necessary to model some legacy commandline interface.
         *     It is not safe to use this option, unless all option groups are under
         *     your direct control. Since 2.8.
         */
        public val NOALIAS: OptionFlags = OptionFlags(G_OPTION_FLAG_NOALIAS)
    }
}
