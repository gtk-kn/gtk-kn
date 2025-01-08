// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkDevicePad
import org.gtkkn.native.gdk.gdk_device_pad_get_feature_group
import org.gtkkn.native.gdk.gdk_device_pad_get_group_n_modes
import org.gtkkn.native.gdk.gdk_device_pad_get_n_features
import org.gtkkn.native.gdk.gdk_device_pad_get_n_groups
import org.gtkkn.native.gdk.gdk_device_pad_get_type
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType

/**
 * `GdkDevicePad` is an interface implemented by devices of type
 * %GDK_SOURCE_TABLET_PAD
 *
 * It allows querying the features provided by the pad device.
 *
 * Tablet pads may contain one or more groups, each containing a subset
 * of the buttons/rings/strips available. [method@Gdk.DevicePad.get_n_groups]
 * can be used to obtain the number of groups, [method@Gdk.DevicePad.get_n_features]
 * and [method@Gdk.DevicePad.get_feature_group] can be combined to find out
 * the number of buttons/rings/strips the device has, and how are they grouped.
 *
 * Each of those groups have different modes, which may be used to map each
 * individual pad feature to multiple actions. Only one mode is effective
 * (current) for each given group, different groups may have different
 * current modes. The number of available modes in a group can be found
 * out through [method@Gdk.DevicePad.get_group_n_modes], and the current mode
 * for a given group will be notified through events of type `GDK_PAD_GROUP_MODE`.
 */
public interface DevicePad :
    Interface,
    KGTyped {
    public val gdkDevicePadPointer: CPointer<GdkDevicePad>

    /**
     * Returns the group the given @feature and @idx belong to.
     *
     * f the feature or index do not exist in @pad, -1 is returned.
     *
     * @param feature the feature type to get the group from
     * @param featureIdx the index of the feature to get the group from
     * @return The group number of the queried pad feature.
     */
    public fun getFeatureGroup(feature: DevicePadFeature, featureIdx: gint): gint =
        gdk_device_pad_get_feature_group(gdkDevicePadPointer, feature.nativeValue, featureIdx)

    /**
     * Returns the number of modes that @group may have.
     *
     * @param groupIdx group to get the number of available modes from
     * @return The number of modes available in @group.
     */
    public fun getGroupNModes(groupIdx: gint): gint = gdk_device_pad_get_group_n_modes(gdkDevicePadPointer, groupIdx)

    /**
     * Returns the number of features a tablet pad has.
     *
     * @param feature a pad feature
     * @return The amount of elements of type @feature that this pad has.
     */
    public fun getNFeatures(feature: DevicePadFeature): gint =
        gdk_device_pad_get_n_features(gdkDevicePadPointer, feature.nativeValue)

    /**
     * Returns the number of groups this pad device has.
     *
     * Pads have at least one group. A pad group is a subcollection of
     * buttons/strip/rings that is affected collectively by a same
     * current mode.
     *
     * @return The number of button/ring/strip groups in the pad.
     */
    public fun getNGroups(): gint = gdk_device_pad_get_n_groups(gdkDevicePadPointer)

    private data class Wrapper(private val pointer: CPointer<GdkDevicePad>) : DevicePad {
        override val gdkDevicePadPointer: CPointer<GdkDevicePad> = pointer
    }

    public companion object : TypeCompanion<DevicePad> {
        override val type: GeneratedInterfaceKGType<DevicePad> =
            GeneratedInterfaceKGType(gdk_device_pad_get_type()) { Wrapper(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GdkDevicePad>): DevicePad = Wrapper(pointer)

        /**
         * Get the GType of DevicePad
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_device_pad_get_type()
    }
}
