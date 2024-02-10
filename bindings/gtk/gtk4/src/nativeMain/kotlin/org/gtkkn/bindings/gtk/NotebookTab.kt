// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkNotebookTab
import org.gtkkn.native.gtk.GtkNotebookTab.GTK_NOTEBOOK_TAB_FIRST
import org.gtkkn.native.gtk.GtkNotebookTab.GTK_NOTEBOOK_TAB_LAST

/**
 * The parameter used in the action signals of `GtkNotebook`.
 */
public enum class NotebookTab(
    public val nativeValue: GtkNotebookTab,
) {
    /**
     * the first tab in the notebook
     */
    FIRST(GTK_NOTEBOOK_TAB_FIRST),

    /**
     * the last tab in the notebook
     */
    LAST(GTK_NOTEBOOK_TAB_LAST),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkNotebookTab): NotebookTab =
            when (nativeValue) {
                GTK_NOTEBOOK_TAB_FIRST -> FIRST
                GTK_NOTEBOOK_TAB_LAST -> LAST
                else -> error("invalid nativeValue")
            }
    }
}
