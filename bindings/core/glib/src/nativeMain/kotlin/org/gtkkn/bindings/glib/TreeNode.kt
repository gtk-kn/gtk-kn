// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import org.gtkkn.bindings.glib.annotations.GLibVersion2_68
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GTreeNode

/**
 * An opaque type which identifies a specific node in a #GTree.
 *
 * ## Skipped during bindings generation
 *
 * - method `key`: Return type gpointer is unsupported
 * - method `next`: Return type TreeNode is unsupported
 * - method `previous`: Return type TreeNode is unsupported
 * - method `value`: Return type gpointer is unsupported
 *
 * @since 2.68
 */
@GLibVersion2_68
public class TreeNode(pointer: CPointer<GTreeNode>) : ProxyInstance(pointer) {
    public val glibTreeNodePointer: CPointer<GTreeNode> = pointer
}
