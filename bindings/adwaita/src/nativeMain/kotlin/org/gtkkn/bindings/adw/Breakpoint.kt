// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.adw.annotations.AdwVersion1_4
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gobject.Value
import org.gtkkn.bindings.gtk.Buildable
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwBreakpoint
import org.gtkkn.native.adw.adw_breakpoint_add_setter
import org.gtkkn.native.adw.adw_breakpoint_get_condition
import org.gtkkn.native.adw.adw_breakpoint_get_type
import org.gtkkn.native.adw.adw_breakpoint_new
import org.gtkkn.native.adw.adw_breakpoint_set_condition
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkBuildable
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * Describes a breakpoint for [class@Window] or [class@Dialog].
 *
 * Breakpoints are used to create adaptive UI, allowing to change the layout
 * depending on available size.
 *
 * Breakpoint is a size threshold, specified by its condition, as well as one or
 * more setters.
 *
 * Each setter has a target object, a property and a value. When a breakpoint
 * is applied, each setter sets the target property on their target object to
 * the specified value, and reset it back to the original value when it's
 * unapplied.
 *
 * For more complicated scenarios, [signal@Breakpoint::apply] and
 * [signal@Breakpoint::unapply] can be used instead.
 *
 * Breakpoints can be used within [class@Window], [class@ApplicationWindow],
 * [class@Dialog] or [class@BreakpointBin].
 *
 * ## `AdwBreakpoint` as `GtkBuildable`:
 *
 * `AdwBreakpoint` supports specifying its condition via the `<condition>`
 * element. The contents of the element must be a string in a format accepted by
 * [func@BreakpointCondition.parse].
 *
 * It also supports adding setters via the `<setter>` element. Each `<setter>`
 * element must have the `object` attribute specifying the target object, and
 * the `property` attribute specifying the property name. The contents of the
 * element are used as the setter value.
 *
 * For `G_TYPE_OBJECT` and `G_TYPE_BOXED` derived properties, empty contents are
 * treated as `NULL`.
 *
 * Setter values can be translated with the usual `translatable`, `context` and
 * `comments` attributes.
 *
 * Example of an `AdwBreakpoint` UI definition:
 *
 * ```xml
 * <object class="AdwBreakpoint">
 *   <condition>max-width: 400px</condition>
 *   <setter object="button" property="visible">True</setter>
 *   <setter object="box" property="orientation">vertical</setter>
 *   <setter object="page" property="title" translatable="yes">Example</setter>
 * </object>
 * ```
 *
 * ## Skipped during bindings generation
 *
 * - parameter `args`: va_list type is not supported
 * - parameter `objects`: Array parameter of type GObject.Object is not supported
 *
 * @since 1.4
 */
@AdwVersion1_4
public class Breakpoint(pointer: CPointer<AdwBreakpoint>) :
    Object(pointer.reinterpret()),
    Buildable,
    KGTyped {
    public val adwBreakpointPointer: CPointer<AdwBreakpoint>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    /**
     * The breakpoint's condition.
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public var condition: BreakpointCondition?
        /**
         * Gets the condition for @self.
         *
         * @return the condition
         * @since 1.4
         */
        get() = adw_breakpoint_get_condition(adwBreakpointPointer)?.run {
            BreakpointCondition(this)
        }

        /**
         * Sets the condition for @self.
         *
         * @param condition the new condition
         * @since 1.4
         */
        @AdwVersion1_4
        set(condition) = adw_breakpoint_set_condition(adwBreakpointPointer, condition?.gPointer)

    /**
     * Creates a new `AdwBreakpoint` with @condition.
     *
     * @param condition the condition
     * @return the newly created `AdwBreakpoint`
     * @since 1.4
     */
    public constructor(condition: BreakpointCondition) : this(adw_breakpoint_new(condition.gPointer)!!.reinterpret())

    /**
     * Adds a setter to @self.
     *
     * The setter will automatically set @property on @object to @value when
     * applying the breakpoint, and set it back to its original value upon
     * unapplying it.
     *
     * ::: note
     *     Setting properties to their original values does not work for properties
     *     that have irreversible side effects. For example, changing
     *     [property@Gtk.Button:label] while [property@Gtk.Button:icon-name] is set
     *     will reset the icon. However, resetting the label will not set
     *     `icon-name` to its original value.
     *
     * Use the [signal@Breakpoint::apply] and [signal@Breakpoint::unapply] signals
     * for those properties instead, as follows:
     *
     * ```c
     * static void
     * breakpoint_apply_cb (MyWidget *self)
     * {
     *   gtk_button_set_icon_name (self->button, "go-previous-symbolic");
     * }
     *
     * static void
     * breakpoint_apply_cb (MyWidget *self)
     * {
     *   gtk_button_set_label (self->button, _("_Back"));
     * }
     *
     * // ...
     *
     * g_signal_connect_swapped (breakpoint, "apply",
     *                           G_CALLBACK (breakpoint_apply_cb), self);
     * g_signal_connect_swapped (breakpoint, "unapply",
     *                           G_CALLBACK (breakpoint_unapply_cb), self);
     * ```
     *
     * @param object the target object
     * @param property the target property
     * @param value the value to set
     * @since 1.4
     */
    @AdwVersion1_4
    public fun addSetter(`object`: Object, `property`: String, `value`: Value): Unit =
        adw_breakpoint_add_setter(adwBreakpointPointer, `object`.gPointer, `property`, `value`.gPointer)

    /**
     * Emitted when the breakpoint is applied.
     *
     * This signal is emitted after the setters have been applied.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 1.4
     */
    @AdwVersion1_4
    public fun onApply(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer,
            "apply",
            onApplyFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "apply" signal. See [onApply].
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public fun emitApply() {
        g_signal_emit_by_name(gPointer.reinterpret(), "apply")
    }

    /**
     * Emitted when the breakpoint is unapplied.
     *
     * This signal is emitted before resetting the setter values.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 1.4
     */
    @AdwVersion1_4
    public fun onUnapply(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer,
            "unapply",
            onUnapplyFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "unapply" signal. See [onUnapply].
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public fun emitUnapply() {
        g_signal_emit_by_name(gPointer.reinterpret(), "unapply")
    }

    public companion object : TypeCompanion<Breakpoint> {
        override val type: GeneratedClassKGType<Breakpoint> =
            GeneratedClassKGType(adw_breakpoint_get_type()) { Breakpoint(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of Breakpoint
         *
         * @return the GType
         */
        public fun getType(): GType = adw_breakpoint_get_type()
    }
}

private val onApplyFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onUnapplyFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
