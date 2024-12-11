// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import org.gtkkn.bindings.gsk.annotations.GskVersion4_14
import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gsk.GSK_PATH_FOREACH_ALLOW_CONIC
import org.gtkkn.native.gsk.GSK_PATH_FOREACH_ALLOW_CUBIC
import org.gtkkn.native.gsk.GSK_PATH_FOREACH_ALLOW_ONLY_LINES
import org.gtkkn.native.gsk.GSK_PATH_FOREACH_ALLOW_QUAD
import org.gtkkn.native.gsk.GskPathForeachFlags
import org.gtkkn.native.gsk.gsk_path_foreach_flags_get_type

/**
 * Flags that can be passed to gsk_path_foreach() to influence what
 * kinds of operations the path is decomposed into.
 *
 * By default, [method@Gsk.Path.foreach] will only emit a path with all
 * operations flattened to straight lines to allow for maximum compatibility.
 * The only operations emitted will be `GSK_PATH_MOVE`, `GSK_PATH_LINE` and
 * `GSK_PATH_CLOSE`.
 * @since 4.14
 */
public class PathForeachFlags(public val mask: GskPathForeachFlags) : Bitfield<PathForeachFlags> {
    override infix fun or(other: PathForeachFlags): PathForeachFlags = PathForeachFlags(mask or other.mask)

    @GskVersion4_14
    public companion object {
        /**
         * The default behavior, only allow lines.
         */
        public val ONLY_LINES: PathForeachFlags =
            PathForeachFlags(GSK_PATH_FOREACH_ALLOW_ONLY_LINES)

        /**
         * Allow emission of `GSK_PATH_QUAD` operations
         */
        public val QUAD: PathForeachFlags = PathForeachFlags(GSK_PATH_FOREACH_ALLOW_QUAD)

        /**
         * Allow emission of `GSK_PATH_CUBIC` operations.
         */
        public val CUBIC: PathForeachFlags = PathForeachFlags(GSK_PATH_FOREACH_ALLOW_CUBIC)

        /**
         * Allow emission of `GSK_PATH_CONIC` operations.
         */
        public val CONIC: PathForeachFlags = PathForeachFlags(GSK_PATH_FOREACH_ALLOW_CONIC)

        /**
         * Get the GType of PathForeachFlags
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_path_foreach_flags_get_type()
    }
}
