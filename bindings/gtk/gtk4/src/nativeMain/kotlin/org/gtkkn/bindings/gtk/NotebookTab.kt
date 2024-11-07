// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkNotebookTab

/**
 * The parameter used in the action signals of `GtkNotebook`.
 */
public enum class NotebookTab(
    public val nativeValue: GtkNotebookTab,
) {
    /**
     * the first tab in the notebook
     */
    FIRST(GtkNotebookTab.GTK_NOTEBOOK_TAB_FIRST),

    /**
     * the last tab in the notebook
     */
    LAST(GtkNotebookTab.GTK_NOTEBOOK_TAB_LAST),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkNotebookTab): NotebookTab =
            when (nativeValue) {
                GtkNotebookTab.GTK_NOTEBOOK_TAB_FIRST -> FIRST
                GtkNotebookTab.GTK_NOTEBOOK_TAB_LAST -> LAST
                else -> error("invalid nativeValue")
            }
    }
}
