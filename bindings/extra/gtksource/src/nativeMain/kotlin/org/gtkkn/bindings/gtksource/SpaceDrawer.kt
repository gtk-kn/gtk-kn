// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.Settings
import org.gtkkn.bindings.gio.SettingsBindFlags
import org.gtkkn.bindings.glib.Variant
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtksource.GtkSourceSpaceDrawer
import org.gtkkn.native.gtksource.gtk_source_space_drawer_bind_matrix_setting
import org.gtkkn.native.gtksource.gtk_source_space_drawer_get_enable_matrix
import org.gtkkn.native.gtksource.gtk_source_space_drawer_get_matrix
import org.gtkkn.native.gtksource.gtk_source_space_drawer_get_type
import org.gtkkn.native.gtksource.gtk_source_space_drawer_get_types_for_locations
import org.gtkkn.native.gtksource.gtk_source_space_drawer_new
import org.gtkkn.native.gtksource.gtk_source_space_drawer_set_enable_matrix
import org.gtkkn.native.gtksource.gtk_source_space_drawer_set_matrix
import org.gtkkn.native.gtksource.gtk_source_space_drawer_set_types_for_locations
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Represent white space characters with symbols.
 *
 * #GtkSourceSpaceDrawer provides a way to visualize white spaces, by drawing
 * symbols.
 *
 * Call [method@View.get_space_drawer] to get the `GtkSourceSpaceDrawer`
 * instance of a certain [class@View].
 *
 * By default, no white spaces are drawn because the
 * [property@SpaceDrawer:enable-matrix] is false.
 *
 * To draw white spaces, [method@SpaceDrawer.set_types_for_locations] can
 * be called to set the [property@SpaceDrawer:matrix] property (by default all
 * space types are enabled at all locations). Then call
 * [method@SpaceDrawer.set_enable_matrix].
 *
 * For a finer-grained method, there is also the [class@Tag]'s
 * [property@Tag:draw-spaces] property.
 *
 * # Example
 *
 * To draw non-breaking spaces everywhere and draw all types of trailing spaces
 * except newlines:
 * ```c
 * gtk_source_space_drawer_set_types_for_locations (space_drawer,
 *                                                  GTK_SOURCE_SPACE_LOCATION_ALL,
 *                                                  GTK_SOURCE_SPACE_TYPE_NBSP);
 *
 * gtk_source_space_drawer_set_types_for_locations (space_drawer,
 *                                                  GTK_SOURCE_SPACE_LOCATION_TRAILING,
 *                                                  GTK_SOURCE_SPACE_TYPE_ALL &
 *                                                  ~GTK_SOURCE_SPACE_TYPE_NEWLINE);
 *
 * gtk_source_space_drawer_set_enable_matrix (space_drawer, TRUE);
 * ```
 *
 * # Use-case: draw unwanted white spaces
 *
 * A possible use-case is to draw only unwanted white spaces. Examples:
 *
 * - Draw all trailing spaces.
 * - If the indentation and alignment must be done with spaces, draw tabs.
 *
 * And non-breaking spaces can always be drawn, everywhere, to distinguish them
 * from normal spaces.
 *
 * ## Skipped during bindings generation
 *
 * - method `matrix`: Property TypeInfo of getter and setter do not match
 */
public open class SpaceDrawer(
    pointer: CPointer<GtkSourceSpaceDrawer>,
) : Object(pointer.reinterpret()),
    KGTyped {
    public val gtksourceSpaceDrawerPointer: CPointer<GtkSourceSpaceDrawer>
        get() = gPointer.reinterpret()

    /**
     * Whether the [property@SpaceDrawer:matrix] property is enabled.
     */
    public open var enableMatrix: Boolean
        /**
         *
         *
         * @return whether the #GtkSourceSpaceDrawer:matrix property is enabled.
         */
        get() = gtk_source_space_drawer_get_enable_matrix(gtksourceSpaceDrawerPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the [property@SpaceDrawer:matrix] property is enabled.
         *
         * @param enableMatrix the new value.
         */
        set(
            enableMatrix
        ) =
            gtk_source_space_drawer_set_enable_matrix(
                gtksourceSpaceDrawerPointer.reinterpret(),
                enableMatrix.asGBoolean()
            )

    /**
     * Creates a new #GtkSourceSpaceDrawer object.
     *
     * Useful for storing space drawing settings independently of a [class@View].
     *
     * @return a new #GtkSourceSpaceDrawer.
     */
    public constructor() : this(gtk_source_space_drawer_new()!!.reinterpret())

    /**
     * Binds the [property@SpaceDrawer:matrix] property to a [class@Gio.Settings] key.
     *
     * The [class@Gio.Settings] key must be of the same type as the
     * [property@SpaceDrawer:matrix] property, that is, `"au"`.
     *
     * The [method@Gio.Settings.bind] function cannot be used, because the default GIO
     * mapping functions don't support [struct@GLib.Variant] properties (maybe it will be
     * supported by a future GIO version, in which case this function can be
     * deprecated).
     *
     * @param settings a #GSettings object.
     * @param key the @settings key to bind.
     * @param flags flags for the binding.
     */
    public open fun bindMatrixSetting(
        settings: Settings,
        key: String,
        flags: SettingsBindFlags,
    ): Unit =
        gtk_source_space_drawer_bind_matrix_setting(
            gtksourceSpaceDrawerPointer.reinterpret(),
            settings.gioSettingsPointer.reinterpret(),
            key,
            flags.mask
        )

    /**
     *
     *
     * @return whether the #GtkSourceSpaceDrawer:matrix property is enabled.
     */
    public open fun getEnableMatrix(): Boolean =
        gtk_source_space_drawer_get_enable_matrix(gtksourceSpaceDrawerPointer.reinterpret()).asBoolean()

    /**
     * Gets the value of the [property@SpaceDrawer:matrix] property, as a [struct@GLib.Variant].
     *
     * An empty array can be returned in case the matrix is a zero matrix.
     *
     * The [method@SpaceDrawer.get_types_for_locations] function may be more
     * convenient to use.
     *
     * @return the #GtkSourceSpaceDrawer:matrix value as a new floating #GVariant
     *   instance.
     */
    public open fun getMatrix(): Variant =
        gtk_source_space_drawer_get_matrix(gtksourceSpaceDrawerPointer.reinterpret())!!.run {
            Variant(reinterpret())
        }

    /**
     * If only one location is specified, this function returns what kind of
     * white spaces are drawn at that location.
     *
     * The value is retrieved from the [property@SpaceDrawer:matrix] property.
     *
     * If several locations are specified, this function returns the logical AND for
     * those locations. Which means that if a certain kind of white space is present
     * in the return value, then that kind of white space is drawn at all the
     * specified @locations.
     *
     * @param locations one or several #GtkSourceSpaceLocationFlags.
     * @return a combination of #GtkSourceSpaceTypeFlags.
     */
    public open fun getTypesForLocations(locations: SpaceLocationFlags): SpaceTypeFlags =
        gtk_source_space_drawer_get_types_for_locations(gtksourceSpaceDrawerPointer.reinterpret(), locations.mask).run {
            SpaceTypeFlags(this)
        }

    /**
     * Sets whether the [property@SpaceDrawer:matrix] property is enabled.
     *
     * @param enableMatrix the new value.
     */
    public open fun setEnableMatrix(enableMatrix: Boolean): Unit =
        gtk_source_space_drawer_set_enable_matrix(gtksourceSpaceDrawerPointer.reinterpret(), enableMatrix.asGBoolean())

    /**
     * Sets a new value to the [property@SpaceDrawer:matrix] property, as a [struct@GLib.Variant].
     *
     * If @matrix is null, then an empty array is set.
     *
     * If @matrix is floating, it is consumed.
     *
     * The [method@SpaceDrawer.set_types_for_locations] function may be more
     * convenient to use.
     *
     * @param matrix the new matrix value, or null.
     */
    public open fun setMatrix(matrix: Variant? = null): Unit =
        gtk_source_space_drawer_set_matrix(gtksourceSpaceDrawerPointer.reinterpret(), matrix?.glibVariantPointer)

    /**
     * Modifies the [property@SpaceDrawer:matrix] property at the specified
     * @locations.
     *
     * @param locations one or several #GtkSourceSpaceLocationFlags.
     * @param types a combination of #GtkSourceSpaceTypeFlags.
     */
    public open fun setTypesForLocations(
        locations: SpaceLocationFlags,
        types: SpaceTypeFlags,
    ): Unit =
        gtk_source_space_drawer_set_types_for_locations(
            gtksourceSpaceDrawerPointer.reinterpret(),
            locations.mask,
            types.mask
        )

    public companion object : TypeCompanion<SpaceDrawer> {
        override val type: GeneratedClassKGType<SpaceDrawer> =
            GeneratedClassKGType(gtk_source_space_drawer_get_type()) { SpaceDrawer(it.reinterpret()) }

        init {
            GtksourceTypeProvider.register()
        }
    }
}
