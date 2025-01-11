// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gtk.Actionable
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.bindings.gtksource.annotations.GtkSourceVersion5_4
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkActionable
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtksource.GtkSourceStyleSchemePreview
import org.gtkkn.native.gtksource.gtk_source_style_scheme_preview_get_scheme
import org.gtkkn.native.gtksource.gtk_source_style_scheme_preview_get_selected
import org.gtkkn.native.gtksource.gtk_source_style_scheme_preview_get_type
import org.gtkkn.native.gtksource.gtk_source_style_scheme_preview_new
import org.gtkkn.native.gtksource.gtk_source_style_scheme_preview_set_selected
import kotlin.Boolean
import kotlin.ULong
import kotlin.Unit

/**
 * A preview widget for [class@StyleScheme].
 *
 * This widget provides a convenient [class@Gtk.Widget] to preview a [class@StyleScheme].
 *
 * The [property@StyleSchemePreview:selected] property can be used to manage
 * the selection state of a single preview widget.
 * @since 5.4
 */
@GtkSourceVersion5_4
public open class StyleSchemePreview(
    public val gtksourceStyleSchemePreviewPointer: CPointer<GtkSourceStyleSchemePreview>,
) : Widget(gtksourceStyleSchemePreviewPointer.reinterpret()),
    Actionable,
    KGTyped {
    override val gtkActionablePointer: CPointer<GtkActionable>
        get() = handle.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    public open val scheme: StyleScheme
        /**
         * Gets the #GtkSourceStyleScheme previewed by the widget.
         *
         * @return a #GtkSourceStyleScheme
         * @since 5.4
         */
        get() = gtk_source_style_scheme_preview_get_scheme(gtksourceStyleSchemePreviewPointer)!!.run {
            StyleScheme(this)
        }

    public open var selected: Boolean
        get() = gtk_source_style_scheme_preview_get_selected(gtksourceStyleSchemePreviewPointer).asBoolean()
        set(
            selected
        ) = gtk_source_style_scheme_preview_set_selected(gtksourceStyleSchemePreviewPointer, selected.asGBoolean())

    /**
     * Creates a new #GtkSourceStyleSchemePreview to preview the style scheme
     * provided in @scheme.
     *
     * @param scheme a #GtkSourceStyleScheme
     * @return a #GtkWidget
     * @since 5.4
     */
    public constructor(
        scheme: StyleScheme,
    ) : this(gtk_source_style_scheme_preview_new(scheme.gtksourceStyleSchemePointer)!!.reinterpret())

    /**
     *
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onActivate(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtksourceStyleSchemePreviewPointer,
            "activate",
            onActivateFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "activate" signal. See [onActivate].
     */
    public fun emitActivate() {
        g_signal_emit_by_name(gtksourceStyleSchemePreviewPointer.reinterpret(), "activate")
    }

    public companion object : TypeCompanion<StyleSchemePreview> {
        override val type: GeneratedClassKGType<StyleSchemePreview> =
            GeneratedClassKGType(gtk_source_style_scheme_preview_get_type()) {
                StyleSchemePreview(it.reinterpret())
            }

        init {
            GtksourceTypeProvider.register()
        }

        /**
         * Get the GType of StyleSchemePreview
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_style_scheme_preview_get_type()
    }
}

private val onActivateFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
