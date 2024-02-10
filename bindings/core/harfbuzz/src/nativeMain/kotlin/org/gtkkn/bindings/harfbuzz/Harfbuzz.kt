// This is a generated file. Do not modify.
package org.gtkkn.bindings.harfbuzz

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.Bytes
import org.gtkkn.extensions.common.toKStringList
import org.gtkkn.native.harfbuzz.hb_blob_copy_writable_or_fail
import org.gtkkn.native.harfbuzz.hb_blob_create_from_file
import org.gtkkn.native.harfbuzz.hb_blob_create_sub_blob
import org.gtkkn.native.harfbuzz.hb_blob_get_empty
import org.gtkkn.native.harfbuzz.hb_blob_get_length
import org.gtkkn.native.harfbuzz.hb_blob_make_immutable
import org.gtkkn.native.harfbuzz.hb_blob_t
import org.gtkkn.native.harfbuzz.hb_buffer_append
import org.gtkkn.native.harfbuzz.hb_buffer_clear_contents
import org.gtkkn.native.harfbuzz.hb_buffer_create
import org.gtkkn.native.harfbuzz.hb_buffer_get_cluster_level
import org.gtkkn.native.harfbuzz.hb_buffer_get_content_type
import org.gtkkn.native.harfbuzz.hb_buffer_get_direction
import org.gtkkn.native.harfbuzz.hb_buffer_get_empty
import org.gtkkn.native.harfbuzz.hb_buffer_get_flags
import org.gtkkn.native.harfbuzz.hb_buffer_get_length
import org.gtkkn.native.harfbuzz.hb_buffer_get_script
import org.gtkkn.native.harfbuzz.hb_buffer_get_segment_properties
import org.gtkkn.native.harfbuzz.hb_buffer_get_unicode_funcs
import org.gtkkn.native.harfbuzz.hb_buffer_guess_segment_properties
import org.gtkkn.native.harfbuzz.hb_buffer_normalize_glyphs
import org.gtkkn.native.harfbuzz.hb_buffer_reset
import org.gtkkn.native.harfbuzz.hb_buffer_reverse
import org.gtkkn.native.harfbuzz.hb_buffer_reverse_clusters
import org.gtkkn.native.harfbuzz.hb_buffer_reverse_range
import org.gtkkn.native.harfbuzz.hb_buffer_serialize_list_formats
import org.gtkkn.native.harfbuzz.hb_buffer_set_cluster_level
import org.gtkkn.native.harfbuzz.hb_buffer_set_content_type
import org.gtkkn.native.harfbuzz.hb_buffer_set_direction
import org.gtkkn.native.harfbuzz.hb_buffer_set_flags
import org.gtkkn.native.harfbuzz.hb_buffer_set_script
import org.gtkkn.native.harfbuzz.hb_buffer_set_segment_properties
import org.gtkkn.native.harfbuzz.hb_buffer_set_unicode_funcs
import org.gtkkn.native.harfbuzz.hb_face_builder_create
import org.gtkkn.native.harfbuzz.hb_face_collect_unicodes
import org.gtkkn.native.harfbuzz.hb_face_collect_variation_selectors
import org.gtkkn.native.harfbuzz.hb_face_count
import org.gtkkn.native.harfbuzz.hb_face_create
import org.gtkkn.native.harfbuzz.hb_face_get_empty
import org.gtkkn.native.harfbuzz.hb_face_get_glyph_count
import org.gtkkn.native.harfbuzz.hb_face_get_index
import org.gtkkn.native.harfbuzz.hb_face_get_upem
import org.gtkkn.native.harfbuzz.hb_face_make_immutable
import org.gtkkn.native.harfbuzz.hb_face_reference_blob
import org.gtkkn.native.harfbuzz.hb_face_set_glyph_count
import org.gtkkn.native.harfbuzz.hb_face_set_index
import org.gtkkn.native.harfbuzz.hb_face_set_upem
import org.gtkkn.native.harfbuzz.hb_face_t
import org.gtkkn.native.harfbuzz.hb_font_create
import org.gtkkn.native.harfbuzz.hb_font_create_sub_font
import org.gtkkn.native.harfbuzz.hb_font_funcs_create
import org.gtkkn.native.harfbuzz.hb_font_funcs_get_empty
import org.gtkkn.native.harfbuzz.hb_font_funcs_make_immutable
import org.gtkkn.native.harfbuzz.hb_font_get_empty
import org.gtkkn.native.harfbuzz.hb_font_get_extents_for_direction
import org.gtkkn.native.harfbuzz.hb_font_get_face
import org.gtkkn.native.harfbuzz.hb_font_get_parent
import org.gtkkn.native.harfbuzz.hb_font_get_ptem
import org.gtkkn.native.harfbuzz.hb_font_make_immutable
import org.gtkkn.native.harfbuzz.hb_font_set_face
import org.gtkkn.native.harfbuzz.hb_font_set_parent
import org.gtkkn.native.harfbuzz.hb_font_set_ppem
import org.gtkkn.native.harfbuzz.hb_font_set_ptem
import org.gtkkn.native.harfbuzz.hb_font_set_scale
import org.gtkkn.native.harfbuzz.hb_font_set_var_named_instance
import org.gtkkn.native.harfbuzz.hb_font_t
import org.gtkkn.native.harfbuzz.hb_ft_font_changed
import org.gtkkn.native.harfbuzz.hb_ft_font_get_load_flags
import org.gtkkn.native.harfbuzz.hb_ft_font_set_funcs
import org.gtkkn.native.harfbuzz.hb_ft_font_set_load_flags
import org.gtkkn.native.harfbuzz.hb_ft_font_unlock_face
import org.gtkkn.native.harfbuzz.hb_glib_blob_create
import org.gtkkn.native.harfbuzz.hb_glib_get_unicode_funcs
import org.gtkkn.native.harfbuzz.hb_glyph_info_get_glyph_flags
import org.gtkkn.native.harfbuzz.hb_map_clear
import org.gtkkn.native.harfbuzz.hb_map_create
import org.gtkkn.native.harfbuzz.hb_map_get_empty
import org.gtkkn.native.harfbuzz.hb_map_get_population
import org.gtkkn.native.harfbuzz.hb_ot_color_palette_get_count
import org.gtkkn.native.harfbuzz.hb_ot_color_palette_get_flags
import org.gtkkn.native.harfbuzz.hb_ot_font_set_funcs
import org.gtkkn.native.harfbuzz.hb_ot_layout_get_glyphs_in_class
import org.gtkkn.native.harfbuzz.hb_ot_layout_lookup_substitute_closure
import org.gtkkn.native.harfbuzz.hb_ot_layout_lookups_substitute_closure
import org.gtkkn.native.harfbuzz.hb_ot_meta_reference_entry
import org.gtkkn.native.harfbuzz.hb_ot_metrics_get_variation
import org.gtkkn.native.harfbuzz.hb_ot_var_get_axis_count
import org.gtkkn.native.harfbuzz.hb_ot_var_get_named_instance_count
import org.gtkkn.native.harfbuzz.hb_script_get_horizontal_direction
import org.gtkkn.native.harfbuzz.hb_script_t
import org.gtkkn.native.harfbuzz.hb_segment_properties_hash
import org.gtkkn.native.harfbuzz.hb_set_clear
import org.gtkkn.native.harfbuzz.hb_set_create
import org.gtkkn.native.harfbuzz.hb_set_get_empty
import org.gtkkn.native.harfbuzz.hb_set_get_population
import org.gtkkn.native.harfbuzz.hb_set_intersect
import org.gtkkn.native.harfbuzz.hb_set_invert
import org.gtkkn.native.harfbuzz.hb_set_set
import org.gtkkn.native.harfbuzz.hb_set_subtract
import org.gtkkn.native.harfbuzz.hb_set_symmetric_difference
import org.gtkkn.native.harfbuzz.hb_set_union
import org.gtkkn.native.harfbuzz.hb_shape_list_shapers
import org.gtkkn.native.harfbuzz.hb_shape_plan_get_empty
import org.gtkkn.native.harfbuzz.hb_shape_plan_get_shaper
import org.gtkkn.native.harfbuzz.hb_unicode_combining_class_t
import org.gtkkn.native.harfbuzz.hb_unicode_funcs_create
import org.gtkkn.native.harfbuzz.hb_unicode_funcs_get_default
import org.gtkkn.native.harfbuzz.hb_unicode_funcs_get_empty
import org.gtkkn.native.harfbuzz.hb_unicode_funcs_get_parent
import org.gtkkn.native.harfbuzz.hb_unicode_funcs_make_immutable
import org.gtkkn.native.harfbuzz.hb_unicode_funcs_t
import org.gtkkn.native.harfbuzz.hb_unicode_general_category_t
import org.gtkkn.native.harfbuzz.hb_version_string
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.UInt
import kotlin.Unit
import kotlin.collections.List

/**
 * ## Skipped during bindings generation
 *
 * - parameter `length`: length: Out parameter is not supported
 * - parameter `length`: length: Out parameter is not supported
 * - function `blob_is_immutable`: Return type bool_t is unsupported
 * - parameter `codepoint`: codepoint_t
 * - parameter `text`: codepoint_t
 * - parameter `text`: guint8
 * - parameter `text`: Array parameter of type guint16 is not supported
 * - parameter `text`: Array parameter of type guint32 is not supported
 * - parameter `text`: guint8
 * - function `buffer_allocation_successful`: Return type bool_t is unsupported
 * - parameter `buf`: Unsupported string with cType char
 * - parameter `buf`: Unsupported string with cType char
 * - parameter `dottedcircle_glyph`: codepoint_t
 * - parameter `length`: length: Out parameter is not supported
 * - parameter `length`: length: Out parameter is not supported
 * - function `buffer_get_invisible_glyph`: Return type codepoint_t is unsupported
 * - function `buffer_get_language`: Return type language_t is unsupported
 * - function `buffer_get_replacement_codepoint`: Return type codepoint_t is unsupported
 * - function `buffer_has_positions`: Return type bool_t is unsupported
 * - function `buffer_pre_allocate`: Return type bool_t is unsupported
 * - parameter `buf`: buf: Out parameter is not supported
 * - parameter `str`: guint8
 * - function `buffer_serialize_format_to_string`: C function hb_buffer_serialize_format_to_string
 * is ignored
 * - parameter `buf`: buf: Out parameter is not supported
 * - parameter `buf`: buf: Out parameter is not supported
 * - parameter `invisible`: codepoint_t
 * - parameter `language`: language_t
 * - function `buffer_set_length`: Return type bool_t is unsupported
 * - parameter `destroy`: destroy_func_t
 * - parameter `replacement`: codepoint_t
 * - parameter `color`: color_t
 * - parameter `color`: color_t
 * - parameter `color`: color_t
 * - parameter `color`: color_t
 * - parameter `str`: guint8
 * - function `direction_to_string`: C function hb_direction_to_string is ignored
 * - parameter `tag`: tag_t
 * - parameter `variation_selector`: codepoint_t
 * - parameter `destroy`: destroy_func_t
 * - parameter `table_count`: table_count: Out parameter is not supported
 * - function `face_is_immutable`: Return type bool_t is unsupported
 * - parameter `tag`: tag_t
 * - parameter `str`: guint8
 * - function `feature_to_string`: C function hb_feature_to_string is ignored
 * - function `font_add_glyph_origin_for_direction`: In/Out parameter is not supported
 * - function `font_funcs_is_immutable`: Return type bool_t is unsupported
 * - function `font_funcs_set_font_h_extents_func`: callback font_get_font_h_extents_func_t not
 * found
 * - function `font_funcs_set_font_v_extents_func`: callback font_get_font_v_extents_func_t not
 * found
 * - parameter `destroy`: destroy_func_t
 * - parameter `destroy`: destroy_func_t
 * - parameter `destroy`: destroy_func_t
 * - parameter `destroy`: destroy_func_t
 * - function `font_funcs_set_glyph_h_advance_func`: callback font_get_glyph_h_advance_func_t not
 * found
 * - function `font_funcs_set_glyph_h_advances_func`: callback font_get_glyph_h_advances_func_t not
 * found
 * - function `font_funcs_set_glyph_h_kerning_func`: callback font_get_glyph_h_kerning_func_t not
 * found
 * - function `font_funcs_set_glyph_h_origin_func`: callback font_get_glyph_h_origin_func_t not
 * found
 * - parameter `destroy`: destroy_func_t
 * - function `font_funcs_set_glyph_v_advance_func`: callback font_get_glyph_v_advance_func_t not
 * found
 * - function `font_funcs_set_glyph_v_advances_func`: callback font_get_glyph_v_advances_func_t not
 * found
 * - function `font_funcs_set_glyph_v_kerning_func`: callback font_get_glyph_v_kerning_func_t not
 * found
 * - function `font_funcs_set_glyph_v_origin_func`: callback font_get_glyph_v_origin_func_t not
 * found
 * - parameter `destroy`: destroy_func_t
 * - parameter `destroy`: destroy_func_t
 * - parameter `destroy`: destroy_func_t
 * - parameter `unicode`: codepoint_t
 * - parameter `glyph`: codepoint_t
 * - parameter `first_glyph`: codepoint_t
 * - parameter `glyph`: codepoint_t
 * - parameter `glyph`: codepoint_t
 * - parameter `glyph`: codepoint_t
 * - parameter `glyph`: codepoint_t
 * - parameter `name`: Unsupported string with cType char
 * - parameter `glyph`: codepoint_t
 * - parameter `first_glyph`: codepoint_t
 * - parameter `left_glyph`: codepoint_t
 * - parameter `glyph`: codepoint_t
 * - parameter `first_glyph`: codepoint_t
 * - parameter `glyph`: codepoint_t
 * - parameter `glyph`: codepoint_t
 * - parameter `glyph`: codepoint_t
 * - parameter `first_glyph`: codepoint_t
 * - parameter `top_glyph`: codepoint_t
 * - parameter `glyph`: codepoint_t
 * - function `font_get_h_extents`: Return type bool_t is unsupported
 * - parameter `unicode`: codepoint_t
 * - parameter `first_unicode`: codepoint_t
 * - parameter `x_ppem`: x_ppem: Out parameter is not supported
 * - parameter `x_scale`: x_scale: Out parameter is not supported
 * - function `font_get_v_extents`: Return type bool_t is unsupported
 * - parameter `length`: Unsupported pointer to primitive type
 * - parameter `unicode`: codepoint_t
 * - parameter `s`: guint8
 * - function `font_glyph_to_string`: C function hb_font_glyph_to_string is ignored
 * - function `font_is_immutable`: Return type bool_t is unsupported
 * - function `font_set_funcs`: callback font_funcs_t not found
 * - parameter `font_data`: gpointer
 * - parameter `coords`: Array parameter of type gfloat is not supported
 * - parameter `coords`: Array parameter of type gint is not supported
 * - parameter `variations`: variation_t
 * - function `font_subtract_glyph_origin_for_direction`: In/Out parameter is not supported
 * - function `glib_script_from_script`: C function hb_glib_script_from_script is ignored
 * - function `glib_script_to_script`: C function hb_glib_script_to_script is ignored
 * - parameter `str`: guint8
 * - function `language_get_default`: Return type language_t is unsupported
 * - function `language_to_string`: C function hb_language_to_string is ignored
 * - function `map_allocation_successful`: Return type bool_t is unsupported
 * - parameter `key`: codepoint_t
 * - parameter `key`: codepoint_t
 * - parameter `key`: codepoint_t
 * - function `map_is_empty`: Return type bool_t is unsupported
 * - parameter `key`: codepoint_t
 * - parameter `glyph`: codepoint_t
 * - parameter `glyph`: codepoint_t
 * - parameter `glyph`: codepoint_t
 * - function `ot_color_has_layers`: Return type bool_t is unsupported
 * - function `ot_color_has_palettes`: Return type bool_t is unsupported
 * - function `ot_color_has_png`: Return type bool_t is unsupported
 * - function `ot_color_has_svg`: Return type bool_t is unsupported
 * - function `ot_color_palette_color_get_name_id`: Return type ot_name_id_t is unsupported
 * - parameter `color_count`: color_count: Out parameter is not supported
 * - function `ot_color_palette_get_name_id`: Return type ot_name_id_t is unsupported
 * - parameter `table_tag`: tag_t
 * - parameter `table_tag`: tag_t
 * - parameter `table_tag`: tag_t
 * - parameter `table_tag`: tag_t
 * - parameter `table_tag`: tag_t
 * - parameter `table_tag`: tag_t
 * - parameter `glyph`: codepoint_t
 * - parameter `script_tag`: tag_t
 * - parameter `glyph`: codepoint_t
 * - parameter `glyph`: codepoint_t
 * - parameter `design_size`: design_size: Out parameter is not supported
 * - function `ot_layout_has_glyph_classes`: Return type bool_t is unsupported
 * - function `ot_layout_has_positioning`: Return type bool_t is unsupported
 * - function `ot_layout_has_substitution`: Return type bool_t is unsupported
 * - parameter `table_tag`: tag_t
 * - parameter `table_tag`: tag_t
 * - parameter `table_tag`: tag_t
 * - parameter `table_tag`: tag_t
 * - parameter `table_tag`: tag_t
 * - parameter `table_tag`: tag_t
 * - parameter `glyph`: codepoint_t
 * - parameter `glyphs`: codepoint_t
 * - parameter `table_tag`: tag_t
 * - parameter `table_tag`: tag_t
 * - parameter `table_tag`: tag_t
 * - parameter `table_tag`: tag_t
 * - parameter `table_tag`: tag_t
 * - parameter `table_tag`: tag_t
 * - parameter `table_tag`: tag_t
 * - parameter `table_tag`: tag_t
 * - parameter `table_tag`: tag_t
 * - parameter `table_tag`: tag_t
 * - function `ot_math_get_constant`: Return type position_t is unsupported
 * - parameter `glyph`: codepoint_t
 * - parameter `glyph`: codepoint_t
 * - parameter `glyph`: codepoint_t
 * - parameter `glyph`: codepoint_t
 * - parameter `glyph`: codepoint_t
 * - function `ot_math_get_min_connector_overlap`: Return type position_t is unsupported
 * - function `ot_math_has_data`: Return type bool_t is unsupported
 * - parameter `glyph`: codepoint_t
 * - parameter `entries_count`: entries_count: Out parameter is not supported
 * - parameter `position`: position: Out parameter is not supported
 * - function `ot_metrics_get_x_variation`: Return type position_t is unsupported
 * - function `ot_metrics_get_y_variation`: Return type position_t is unsupported
 * - parameter `name_id`: ot_name_id_t
 * - parameter `name_id`: ot_name_id_t
 * - parameter `name_id`: ot_name_id_t
 * - parameter `num_entries`: num_entries: Out parameter is not supported
 * - parameter `features`: feature_t
 * - parameter `language`: language_t
 * - parameter `tag`: tag_t
 * - parameter `tag`: tag_t
 * - parameter `script_tag_1`: tag_t
 * - parameter `language`: language_t
 * - parameter `script_tag`: tag_t
 * - parameter `axis_tag`: tag_t
 * - parameter `axis_tag`: tag_t
 * - parameter `axes_count`: axes_count: Out parameter is not supported
 * - parameter `axes_count`: axes_count: Out parameter is not supported
 * - function `ot_var_has_data`: Return type bool_t is unsupported
 * - parameter `coords_length`: coords_length: Out parameter is not supported
 * - function `ot_var_named_instance_get_postscript_name_id`: Return type ot_name_id_t is
 * unsupported
 * - function `ot_var_named_instance_get_subfamily_name_id`: Return type ot_name_id_t is unsupported
 * - parameter `design_coords`: Unsupported pointer to primitive type
 * - parameter `coords`: coords: Out parameter is not supported
 * - parameter `tag`: tag_t
 * - parameter `str`: guint8
 * - function `script_to_iso15924_tag`: Return type tag_t is unsupported
 * - function `segment_properties_equal`: Return type bool_t is unsupported
 * - parameter `codepoint`: codepoint_t
 * - parameter `first`: codepoint_t
 * - function `set_allocation_successful`: Return type bool_t is unsupported
 * - parameter `codepoint`: codepoint_t
 * - parameter `first`: codepoint_t
 * - function `set_get_max`: Return type codepoint_t is unsupported
 * - function `set_get_min`: Return type codepoint_t is unsupported
 * - parameter `codepoint`: codepoint_t
 * - function `set_is_empty`: Return type bool_t is unsupported
 * - function `set_is_equal`: Return type bool_t is unsupported
 * - function `set_is_subset`: Return type bool_t is unsupported
 * - function `set_next`: In/Out parameter is not supported
 * - function `set_next_range`: In/Out parameter is not supported
 * - function `set_previous`: In/Out parameter is not supported
 * - function `set_previous_range`: In/Out parameter is not supported
 * - parameter `features`: feature_t
 * - parameter `features`: feature_t
 * - parameter `user_features`: feature_t
 * - parameter `user_features`: feature_t
 * - parameter `user_features`: feature_t
 * - parameter `user_features`: feature_t
 * - parameter `features`: feature_t
 * - parameter `str`: guint8
 * - function `tag_to_string`: C function hb_tag_to_string is ignored
 * - parameter `unicode`: codepoint_t
 * - parameter `a`: codepoint_t
 * - parameter `ab`: codepoint_t
 * - parameter `u`: codepoint_t
 * - parameter `unicode`: codepoint_t
 * - function `unicode_funcs_is_immutable`: Return type bool_t is unsupported
 * - parameter `destroy`: destroy_func_t
 * - parameter `destroy`: destroy_func_t
 * - parameter `destroy`: destroy_func_t
 * - parameter `destroy`: destroy_func_t
 * - parameter `destroy`: destroy_func_t
 * - parameter `destroy`: destroy_func_t
 * - parameter `destroy`: destroy_func_t
 * - parameter `destroy`: destroy_func_t
 * - parameter `unicode`: codepoint_t
 * - parameter `unicode`: codepoint_t
 * - parameter `unicode`: codepoint_t
 * - function `variation_from_string`: Return type bool_t is unsupported
 * - function `variation_to_string`: C function hb_variation_to_string is ignored
 * - parameter `major`: major: Out parameter is not supported
 * - function `version_atleast`: Return type bool_t is unsupported
 * - callback `buffer_message_func_t`: Return type bool_t is unsupported
 * - callback `font_get_font_extents_func_t`: Return type bool_t is unsupported
 * - callback `font_get_glyph_advance_func_t`: Return type position_t is unsupported
 * - callback `font_get_glyph_contour_point_func_t`: Return type bool_t is unsupported
 * - callback `font_get_glyph_extents_func_t`: Return type bool_t is unsupported
 * - callback `font_get_glyph_from_name_func_t`: Return type bool_t is unsupported
 * - callback `font_get_glyph_func_t`: Return type bool_t is unsupported
 * - callback `font_get_glyph_kerning_func_t`: Return type position_t is unsupported
 * - callback `font_get_glyph_name_func_t`: Return type bool_t is unsupported
 * - callback `font_get_glyph_origin_func_t`: Return type bool_t is unsupported
 * - callback `font_get_nominal_glyph_func_t`: Return type bool_t is unsupported
 * - callback `font_get_variation_glyph_func_t`: Return type bool_t is unsupported
 * - callback `unicode_compose_func_t`: Return type bool_t is unsupported
 * - callback `unicode_decompose_func_t`: Return type bool_t is unsupported
 * - callback `unicode_mirroring_func_t`: Return type codepoint_t is unsupported
 * - constant `LANGUAGE_INVALID`: language_t
 * - constant `MAP_VALUE_INVALID`: codepoint_t
 * - constant `SET_VALUE_INVALID`: codepoint_t
 * - record `language_t`: Disguised records are ignored
 */
public object Harfbuzz {
    /**
     * Used when getting or setting AAT feature selectors. Indicates that
     * there is no selector index corresponding to the selector of interest.
     */
    public const val AAT_LAYOUT_NO_SELECTOR_INDEX: Int = 65535

    /**
     * The default code point for replacing invalid characters in a given encoding.
     * Set to U+FFFD REPLACEMENT CHARACTER.
     *
     * @since 0.9.31
     */
    public const val BUFFER_REPLACEMENT_CODEPOINT_DEFAULT: Int = 65533

    /**
     *
     *
     * @since 2.0.0
     */
    public const val FEATURE_GLOBAL_START: Int = 0

    public const val OT_LAYOUT_DEFAULT_LANGUAGE_INDEX: Int = 65535

    public const val OT_LAYOUT_NO_FEATURE_INDEX: Int = 65535

    public const val OT_LAYOUT_NO_SCRIPT_INDEX: Int = 65535

    public const val OT_LAYOUT_NO_VARIATIONS_INDEX: UInt = UInt.MAX_VALUE

    /**
     *
     *
     * @since 2.0.0
     */
    public const val OT_MAX_TAGS_PER_LANGUAGE: Int = 3

    /**
     *
     *
     * @since 2.0.0
     */
    public const val OT_MAX_TAGS_PER_SCRIPT: Int = 3

    /**
     *
     *
     * @since 1.4.2
     */
    public const val OT_VAR_NO_AXIS_INDEX: UInt = UInt.MAX_VALUE

    /**
     *
     *
     * @since 1.9.0
     */
    public const val UNICODE_MAX: Int = 1114111

    /**
     * See Unicode 6.1 for details on the maximum decomposition length.
     */
    public const val UNICODE_MAX_DECOMPOSITION_LEN: Int = 19

    public const val VERSION_MAJOR: Int = 2

    public const val VERSION_MICRO: Int = 4

    public const val VERSION_MINOR: Int = 7

    public const val VERSION_STRING: String = "2.7.4"

    /**
     * Makes a writable copy of @blob.
     *
     * @param blob A blob.
     * @return The new blob, or nullptr if allocation failed
     * @since 1.8.0
     */
    public fun blobCopyWritableOrFail(blob: Blob): Blob =
        hb_blob_copy_writable_or_fail(blob.harfbuzzblob_tPointer)!!.run {
            Blob(reinterpret())
        }

    /**
     * Creates a new blob containing the data from the
     * specified binary font file.
     *
     * @param fileName A font filename
     * @return An #hb_blob_t pointer with the content of the file
     * @since 1.7.7
     */
    public fun blobCreateFromFile(fileName: String): Blob =
        hb_blob_create_from_file(fileName)!!.run {
            Blob(reinterpret())
        }

    /**
     * Returns a blob that represents a range of bytes in @parent.  The new
     * blob is always created with %HB_MEMORY_MODE_READONLY, meaning that it
     * will never modify data in the parent blob.  The parent data is not
     * expected to be modified, and will result in undefined behavior if it
     * is.
     *
     * Makes @parent immutable.
     *
     * @param parent Parent blob.
     * @param offset Start offset of sub-blob within @parent, in bytes.
     * @param length Length of sub-blob.
     * @return New blob, or the empty blob if something failed or if
     * @length is zero or @offset is beyond the end of @parent's data.  Destroy
     * with hb_blob_destroy().
     * @since 0.9.2
     */
    public fun blobCreateSubBlob(
        parent: Blob,
        offset: UInt,
        length: UInt,
    ): Blob =
        hb_blob_create_sub_blob(parent.harfbuzzblob_tPointer, offset, length)!!.run {
            Blob(reinterpret())
        }

    /**
     * Returns the singleton empty blob.
     *
     * See TODO:link object types for more information.
     *
     * @return The empty blob.
     * @since 0.9.2
     */
    public fun blobGetEmpty(): Blob =
        hb_blob_get_empty()!!.run {
            Blob(reinterpret())
        }

    /**
     * Fetches the length of a blob's data.
     *
     * @param blob a blob.
     * @return the length of @blob data in bytes.
     * @since 0.9.2
     */
    public fun blobGetLength(blob: Blob): UInt = hb_blob_get_length(blob.harfbuzzblob_tPointer)

    /**
     * Makes a blob immutable.
     *
     * @param blob a blob
     * @since 0.9.2
     */
    public fun blobMakeImmutable(blob: Blob): Unit = hb_blob_make_immutable(blob.harfbuzzblob_tPointer)

    /**
     * Append (part of) contents of another buffer to this buffer.
     *
     * @param buffer An #hb_buffer_t
     * @param source source #hb_buffer_t
     * @param start start index into source buffer to copy.  Use 0 to copy from start of buffer.
     * @param end end index into source buffer to copy.  Use @HB_FEATURE_GLOBAL_END to copy to end
     * of buffer.
     * @since 1.5.0
     */
    public fun bufferAppend(
        buffer: Buffer,
        source: Buffer,
        start: UInt,
        end: UInt,
    ): Unit =
        hb_buffer_append(
            buffer.harfbuzzbuffer_tPointer,
            source.harfbuzzbuffer_tPointer,
            start,
            end
        )

    /**
     * Similar to hb_buffer_reset(), but does not clear the Unicode functions and
     * the replacement code point.
     *
     * @param buffer An #hb_buffer_t
     * @since 0.9.11
     */
    public fun bufferClearContents(buffer: Buffer): Unit = hb_buffer_clear_contents(buffer.harfbuzzbuffer_tPointer)

    /**
     * Creates a new #hb_buffer_t with all properties to defaults.
     *
     * @return
     * A newly allocated #hb_buffer_t with a reference count of 1. The initial
     * reference count should be released with hb_buffer_destroy() when you are done
     * using the #hb_buffer_t. This function never returns null. If memory cannot
     * be allocated, a special #hb_buffer_t object will be returned on which
     * hb_buffer_allocation_successful() returns %false.
     * @since 0.9.2
     */
    public fun bufferCreate(): Buffer =
        hb_buffer_create()!!.run {
            Buffer(reinterpret())
        }

    /**
     * Fetches the cluster level of a buffer. The #hb_buffer_cluster_level_t
     * dictates one aspect of how HarfBuzz will treat non-base characters
     * during shaping.
     *
     * @param buffer An #hb_buffer_t
     * @return The cluster level of @buffer
     * @since 0.9.42
     */
    public fun bufferGetClusterLevel(buffer: Buffer): BufferClusterLevel =
        hb_buffer_get_cluster_level(buffer.harfbuzzbuffer_tPointer).run {
            BufferClusterLevel.fromNativeValue(this)
        }

    /**
     * Fetches the type of @buffer contents. Buffers are either empty, contain
     * characters (before shaping), or contain glyphs (the result of shaping).
     *
     * @param buffer An #hb_buffer_t
     * @return The type of @buffer contents
     * @since 0.9.5
     */
    public fun bufferGetContentType(buffer: Buffer): BufferContentType =
        hb_buffer_get_content_type(buffer.harfbuzzbuffer_tPointer).run {
            BufferContentType.fromNativeValue(this)
        }

    /**
     * See hb_buffer_set_direction()
     *
     * @param buffer An #hb_buffer_t
     * @return The direction of the @buffer.
     * @since 0.9.2
     */
    public fun bufferGetDirection(buffer: Buffer): Direction =
        hb_buffer_get_direction(buffer.harfbuzzbuffer_tPointer).run {
            Direction.fromNativeValue(this)
        }

    /**
     * Fetches an empty #hb_buffer_t.
     *
     * @return The empty buffer
     * @since 0.9.2
     */
    public fun bufferGetEmpty(): Buffer =
        hb_buffer_get_empty()!!.run {
            Buffer(reinterpret())
        }

    /**
     * Fetches the #hb_buffer_flags_t of @buffer.
     *
     * @param buffer An #hb_buffer_t
     * @return The @buffer flags
     * @since 0.9.7
     */
    public fun bufferGetFlags(buffer: Buffer): BufferFlags =
        hb_buffer_get_flags(buffer.harfbuzzbuffer_tPointer).run {
            BufferFlags(this)
        }

    /**
     * Returns the number of items in the buffer.
     *
     * @param buffer An #hb_buffer_t
     * @return The @buffer length.
     * The value valid as long as buffer has not been modified.
     * @since 0.9.2
     */
    public fun bufferGetLength(buffer: Buffer): UInt = hb_buffer_get_length(buffer.harfbuzzbuffer_tPointer)

    /**
     * Fetches the script of @buffer.
     *
     * @param buffer An #hb_buffer_t
     * @return The #hb_script_t of the @buffer
     * @since 0.9.2
     */
    public fun bufferGetScript(buffer: Buffer): Script =
        hb_buffer_get_script(buffer.harfbuzzbuffer_tPointer).run {
            Script.fromNativeValue(this)
        }

    /**
     * Sets @props to the #hb_segment_properties_t of @buffer.
     *
     * @param buffer An #hb_buffer_t
     * @param props The output #hb_segment_properties_t
     * @since 0.9.7
     */
    public fun bufferGetSegmentProperties(
        buffer: Buffer,
        props: SegmentProperties,
    ): Unit =
        hb_buffer_get_segment_properties(
            buffer.harfbuzzbuffer_tPointer,
            props.harfbuzzsegment_properties_tPointer
        )

    /**
     * Fetches the Unicode-functions structure of a buffer.
     *
     * @param buffer An #hb_buffer_t
     * @return The Unicode-functions structure
     * @since 0.9.2
     */
    public fun bufferGetUnicodeFuncs(buffer: Buffer): UnicodeFuncs =
        hb_buffer_get_unicode_funcs(buffer.harfbuzzbuffer_tPointer)!!.run {
            UnicodeFuncs(reinterpret())
        }

    /**
     * Sets unset buffer segment properties based on buffer Unicode
     * contents.  If buffer is not empty, it must have content type
     * %HB_BUFFER_CONTENT_TYPE_UNICODE.
     *
     * If buffer script is not set (ie. is %HB_SCRIPT_INVALID), it
     * will be set to the Unicode script of the first character in
     * the buffer that has a script other than %HB_SCRIPT_COMMON,
     * %HB_SCRIPT_INHERITED, and %HB_SCRIPT_UNKNOWN.
     *
     * Next, if buffer direction is not set (ie. is %HB_DIRECTION_INVALID),
     * it will be set to the natural horizontal direction of the
     * buffer script as returned by hb_script_get_horizontal_direction().
     * If hb_script_get_horizontal_direction() returns %HB_DIRECTION_INVALID,
     * then %HB_DIRECTION_LTR is used.
     *
     * Finally, if buffer language is not set (ie. is %HB_LANGUAGE_INVALID),
     * it will be set to the process's default language as returned by
     * hb_language_get_default().  This may change in the future by
     * taking buffer script into consideration when choosing a language.
     * Note that hb_language_get_default() is NOT threadsafe the first time
     * it is called.  See documentation for that function for details.
     *
     * @param buffer An #hb_buffer_t
     * @since 0.9.7
     */
    public fun bufferGuessSegmentProperties(buffer: Buffer): Unit =
        hb_buffer_guess_segment_properties(buffer.harfbuzzbuffer_tPointer)

    /**
     * Reorders a glyph buffer to have canonical in-cluster glyph order / position.
     * The resulting clusters should behave identical to pre-reordering clusters.
     *
     * <note>This has nothing to do with Unicode normalization.</note>
     *
     * @param buffer An #hb_buffer_t
     * @since 0.9.2
     */
    public fun bufferNormalizeGlyphs(buffer: Buffer): Unit = hb_buffer_normalize_glyphs(buffer.harfbuzzbuffer_tPointer)

    /**
     * Resets the buffer to its initial status, as if it was just newly created
     * with hb_buffer_create().
     *
     * @param buffer An #hb_buffer_t
     * @since 0.9.2
     */
    public fun bufferReset(buffer: Buffer): Unit = hb_buffer_reset(buffer.harfbuzzbuffer_tPointer)

    /**
     * Reverses buffer contents.
     *
     * @param buffer An #hb_buffer_t
     * @since 0.9.2
     */
    public fun bufferReverse(buffer: Buffer): Unit = hb_buffer_reverse(buffer.harfbuzzbuffer_tPointer)

    /**
     * Reverses buffer clusters.  That is, the buffer contents are
     * reversed, then each cluster (consecutive items having the
     * same cluster number) are reversed again.
     *
     * @param buffer An #hb_buffer_t
     * @since 0.9.2
     */
    public fun bufferReverseClusters(buffer: Buffer): Unit = hb_buffer_reverse_clusters(buffer.harfbuzzbuffer_tPointer)

    /**
     * Reverses buffer contents between @start and @end.
     *
     * @param buffer An #hb_buffer_t
     * @param start start index
     * @param end end index
     * @since 0.9.41
     */
    public fun bufferReverseRange(
        buffer: Buffer,
        start: UInt,
        end: UInt,
    ): Unit = hb_buffer_reverse_range(buffer.harfbuzzbuffer_tPointer, start, end)

    /**
     * Returns a list of supported buffer serialization formats.
     *
     * @return
     * A string array of buffer serialization formats. Should not be freed.
     * @since 0.9.7
     */
    public fun bufferSerializeListFormats(): List<String> =
        hb_buffer_serialize_list_formats()?.toKStringList()
            ?: error("Expected not null string array")

    /**
     * Sets the cluster level of a buffer. The #hb_buffer_cluster_level_t
     * dictates one aspect of how HarfBuzz will treat non-base characters
     * during shaping.
     *
     * @param buffer An #hb_buffer_t
     * @param clusterLevel The cluster level to set on the buffer
     * @since 0.9.42
     */
    public fun bufferSetClusterLevel(
        buffer: Buffer,
        clusterLevel: BufferClusterLevel,
    ): Unit = hb_buffer_set_cluster_level(buffer.harfbuzzbuffer_tPointer, clusterLevel.nativeValue)

    /**
     * Sets the type of @buffer contents. Buffers are either empty, contain
     * characters (before shaping), or contain glyphs (the result of shaping).
     *
     * @param buffer An #hb_buffer_t
     * @param contentType The type of buffer contents to set
     * @since 0.9.5
     */
    public fun bufferSetContentType(
        buffer: Buffer,
        contentType: BufferContentType,
    ): Unit = hb_buffer_set_content_type(buffer.harfbuzzbuffer_tPointer, contentType.nativeValue)

    /**
     * Set the text flow direction of the buffer. No shaping can happen without
     * setting @buffer direction, and it controls the visual direction for the
     * output glyphs; for RTL direction the glyphs will be reversed. Many layout
     * features depend on the proper setting of the direction, for example,
     * reversing RTL text before shaping, then shaping with LTR direction is not
     * the same as keeping the text in logical order and shaping with RTL
     * direction.
     *
     * @param buffer An #hb_buffer_t
     * @param direction the #hb_direction_t of the @buffer
     * @since 0.9.2
     */
    public fun bufferSetDirection(
        buffer: Buffer,
        direction: Direction,
    ): Unit = hb_buffer_set_direction(buffer.harfbuzzbuffer_tPointer, direction.nativeValue)

    /**
     * Sets @buffer flags to @flags. See #hb_buffer_flags_t.
     *
     * @param buffer An #hb_buffer_t
     * @param flags The buffer flags to set
     * @since 0.9.7
     */
    public fun bufferSetFlags(
        buffer: Buffer,
        flags: BufferFlags,
    ): Unit = hb_buffer_set_flags(buffer.harfbuzzbuffer_tPointer, flags.mask)

    /**
     * Sets the script of @buffer to @script.
     *
     * Script is crucial for choosing the proper shaping behaviour for scripts that
     * require it (e.g. Arabic) and the which OpenType features defined in the font
     * to be applied.
     *
     * You can pass one of the predefined #hb_script_t values, or use
     * hb_script_from_string() or hb_script_from_iso15924_tag() to get the
     * corresponding script from an ISO 15924 script tag.
     *
     * @param buffer An #hb_buffer_t
     * @param script An #hb_script_t to set.
     * @since 0.9.2
     */
    public fun bufferSetScript(
        buffer: Buffer,
        script: Script,
    ): Unit = hb_buffer_set_script(buffer.harfbuzzbuffer_tPointer, script.nativeValue)

    /**
     * Sets the segment properties of the buffer, a shortcut for calling
     * hb_buffer_set_direction(), hb_buffer_set_script() and
     * hb_buffer_set_language() individually.
     *
     * @param buffer An #hb_buffer_t
     * @param props An #hb_segment_properties_t to use
     * @since 0.9.7
     */
    public fun bufferSetSegmentProperties(
        buffer: Buffer,
        props: SegmentProperties,
    ): Unit =
        hb_buffer_set_segment_properties(
            buffer.harfbuzzbuffer_tPointer,
            props.harfbuzzsegment_properties_tPointer
        )

    /**
     * Sets the Unicode-functions structure of a buffer to
     * @unicode_funcs.
     *
     * @param buffer An #hb_buffer_t
     * @param unicodeFuncs The Unicode-functions structure
     * @since 0.9.2
     */
    public fun bufferSetUnicodeFuncs(
        buffer: Buffer,
        unicodeFuncs: UnicodeFuncs,
    ): Unit =
        hb_buffer_set_unicode_funcs(
            buffer.harfbuzzbuffer_tPointer,
            unicodeFuncs.harfbuzzunicode_funcs_tPointer
        )

    /**
     * Creates a #hb_face_t that can be used with hb_face_builder_add_table().
     * After tables are added to the face, it can be compiled to a binary
     * font file by calling hb_face_reference_blob().
     *
     * @return New face.
     * @since 1.9.0
     */
    public fun faceBuilderCreate(): Face =
        hb_face_builder_create()!!.run {
            Face(reinterpret())
        }

    /**
     * Collects all of the Unicode characters covered by @face and adds
     * them to the #hb_set_t set @out.
     *
     * @param face A face object
     * @param out The set to add Unicode characters to
     * @since 1.9.0
     */
    public fun faceCollectUnicodes(
        face: Face,
        `out`: Set,
    ): Unit = hb_face_collect_unicodes(face.harfbuzzface_tPointer, `out`.harfbuzzset_tPointer)

    /**
     * Collects all Unicode "Variation Selector" characters covered by @face and adds
     * them to the #hb_set_t set @out.
     *
     * @param face A face object
     * @param out The set to add Variation Selector characters to
     * @since 1.9.0
     */
    public fun faceCollectVariationSelectors(
        face: Face,
        `out`: Set,
    ): Unit =
        hb_face_collect_variation_selectors(
            face.harfbuzzface_tPointer,
            `out`.harfbuzzset_tPointer
        )

    /**
     * Fetches the number of faces in a blob.
     *
     * @param blob a blob.
     * @return Number of faces in @blob
     * @since 1.7.7
     */
    public fun faceCount(blob: Blob): UInt = hb_face_count(blob.harfbuzzblob_tPointer)

    /**
     * Constructs a new face object from the specified blob and
     * a face index into that blob. This is used for blobs of
     * file formats such as Dfont and TTC that can contain more
     * than one face.
     *
     * @param blob #hb_blob_t to work upon
     * @param index The index of the face within @blob
     * @return The new face object
     * @since 0.9.2
     */
    public fun faceCreate(
        blob: Blob,
        index: UInt,
    ): Face =
        hb_face_create(blob.harfbuzzblob_tPointer, index)!!.run {
            Face(reinterpret())
        }

    /**
     * Fetches the singleton empty face object.
     *
     * @return The empty face object
     * @since 0.9.2
     */
    public fun faceGetEmpty(): Face =
        hb_face_get_empty()!!.run {
            Face(reinterpret())
        }

    /**
     * Fetches the glyph-count value of the specified face object.
     *
     * @param face A face object
     * @return The glyph-count value of @face
     * @since 0.9.7
     */
    public fun faceGetGlyphCount(face: Face): UInt = hb_face_get_glyph_count(face.harfbuzzface_tPointer)

    /**
     * Fetches the face-index corresponding to the given face.
     *
     * <note>Note: face indices within a collection are zero-based.</note>
     *
     * @param face A face object
     * @return The index of @face.
     * @since 0.9.2
     */
    public fun faceGetIndex(face: Face): UInt = hb_face_get_index(face.harfbuzzface_tPointer)

    /**
     * Fetches the units-per-em (upem) value of the specified face object.
     *
     * @param face A face object
     * @return The upem value of @face
     * @since 0.9.2
     */
    public fun faceGetUpem(face: Face): UInt = hb_face_get_upem(face.harfbuzzface_tPointer)

    /**
     * Makes the given face object immutable.
     *
     * @param face A face object
     * @since 0.9.2
     */
    public fun faceMakeImmutable(face: Face): Unit = hb_face_make_immutable(face.harfbuzzface_tPointer)

    /**
     * Fetches a pointer to the binary blob that contains the
     * specified face. Returns an empty blob if referencing face data is not
     * possible.
     *
     * @param face A face object
     * @return A pointer to the blob for @face
     * @since 0.9.2
     */
    public fun faceReferenceBlob(face: Face): Blob =
        hb_face_reference_blob(face.harfbuzzface_tPointer)!!.run {
            Blob(reinterpret())
        }

    /**
     * Sets the glyph count for a face object to the specified value.
     *
     * @param face A face object
     * @param glyphCount The glyph-count value to assign
     * @since 0.9.7
     */
    public fun faceSetGlyphCount(
        face: Face,
        glyphCount: UInt,
    ): Unit = hb_face_set_glyph_count(face.harfbuzzface_tPointer, glyphCount)

    /**
     * Assigns the specified face-index to @face. Fails if the
     * face is immutable.
     *
     * <note>Note: face indices within a collection are zero-based.</note>
     *
     * @param face A face object
     * @param index The index to assign
     * @since 0.9.2
     */
    public fun faceSetIndex(
        face: Face,
        index: UInt,
    ): Unit = hb_face_set_index(face.harfbuzzface_tPointer, index)

    /**
     * Sets the units-per-em (upem) for a face object to the specified value.
     *
     * @param face A face object
     * @param upem The units-per-em value to assign
     * @since 0.9.2
     */
    public fun faceSetUpem(
        face: Face,
        upem: UInt,
    ): Unit = hb_face_set_upem(face.harfbuzzface_tPointer, upem)

    /**
     * Constructs a new font object from the specified face.
     *
     * @param face a face.
     * @return The new font object
     * @since 0.9.2
     */
    public fun fontCreate(face: Face): Font =
        hb_font_create(face.harfbuzzface_tPointer)!!.run {
            Font(reinterpret())
        }

    /**
     * Constructs a sub-font font object from the specified @parent font,
     * replicating the parent's properties.
     *
     * @param parent The parent font object
     * @return The new sub-font font object
     * @since 0.9.2
     */
    public fun fontCreateSubFont(parent: Font): Font =
        hb_font_create_sub_font(parent.harfbuzzfont_tPointer)!!.run {
            Font(reinterpret())
        }

    /**
     * Creates a new #hb_font_funcs_t structure of font functions.
     *
     * @return The font-functions structure
     * @since 0.9.2
     */
    public fun fontFuncsCreate(): FontFuncs =
        hb_font_funcs_create()!!.run {
            FontFuncs(reinterpret())
        }

    /**
     * Fetches an empty font-functions structure.
     *
     * @return The font-functions structure
     * @since 0.9.2
     */
    public fun fontFuncsGetEmpty(): FontFuncs =
        hb_font_funcs_get_empty()!!.run {
            FontFuncs(reinterpret())
        }

    /**
     * Makes a font-functions structure immutable.
     *
     * @param ffuncs The font-functions structure
     * @since 0.9.2
     */
    public fun fontFuncsMakeImmutable(ffuncs: FontFuncs): Unit =
        hb_font_funcs_make_immutable(ffuncs.harfbuzzfont_funcs_tPointer)

    /**
     * Fetches the empty font object.
     *
     * @return The empty font object
     * @since 0.9.2
     */
    public fun fontGetEmpty(): Font =
        hb_font_get_empty()!!.run {
            Font(reinterpret())
        }

    /**
     * Fetches the extents for a font in a text segment of the
     * specified direction.
     *
     * Calls the appropriate direction-specific variant (horizontal
     * or vertical) depending on the value of @direction.
     *
     * @param font #hb_font_t to work upon
     * @param direction The direction of the text segment
     * @param extents The #hb_glyph_extents_t retrieved
     * @since 1.1.3
     */
    public fun fontGetExtentsForDirection(
        font: Font,
        direction: Direction,
        extents: FontExtents,
    ): Unit =
        hb_font_get_extents_for_direction(
            font.harfbuzzfont_tPointer,
            direction.nativeValue,
            extents.harfbuzzfont_extents_tPointer
        )

    /**
     * Fetches the face associated with the specified font object.
     *
     * @param font #hb_font_t to work upon
     * @return The #hb_face_t value
     * @since 0.9.2
     */
    public fun fontGetFace(font: Font): Face =
        hb_font_get_face(font.harfbuzzfont_tPointer)!!.run {
            Face(reinterpret())
        }

    /**
     * Fetches the parent font of @font.
     *
     * @param font #hb_font_t to work upon
     * @return The parent font object
     * @since 0.9.2
     */
    public fun fontGetParent(font: Font): Font =
        hb_font_get_parent(font.harfbuzzfont_tPointer)!!.run {
            Font(reinterpret())
        }

    /**
     * Fetches the "point size" of a font. Used in CoreText to
     * implement optical sizing.
     *
     * @param font #hb_font_t to work upon
     * @return Point size.  A value of zero means "not set."
     * @since 0.9.2
     */
    public fun fontGetPtem(font: Font): Float = hb_font_get_ptem(font.harfbuzzfont_tPointer)

    /**
     * Makes @font immutable.
     *
     * @param font #hb_font_t to work upon
     * @since 0.9.2
     */
    public fun fontMakeImmutable(font: Font): Unit = hb_font_make_immutable(font.harfbuzzfont_tPointer)

    /**
     * Sets @face as the font-face value of @font.
     *
     * @param font #hb_font_t to work upon
     * @param face The #hb_face_t to assign
     * @since 1.4.3
     */
    public fun fontSetFace(
        font: Font,
        face: Face,
    ): Unit = hb_font_set_face(font.harfbuzzfont_tPointer, face.harfbuzzface_tPointer)

    /**
     * Sets the parent font of @font.
     *
     * @param font #hb_font_t to work upon
     * @param parent The parent font object to assign
     * @since 1.0.5
     */
    public fun fontSetParent(
        font: Font,
        parent: Font,
    ): Unit = hb_font_set_parent(font.harfbuzzfont_tPointer, parent.harfbuzzfont_tPointer)

    /**
     * Sets the horizontal and vertical pixels-per-em (ppem) of a font.
     *
     * @param font #hb_font_t to work upon
     * @param xPpem Horizontal ppem value to assign
     * @param yPpem Vertical ppem value to assign
     * @since 0.9.2
     */
    public fun fontSetPpem(
        font: Font,
        xPpem: UInt,
        yPpem: UInt,
    ): Unit = hb_font_set_ppem(font.harfbuzzfont_tPointer, xPpem, yPpem)

    /**
     * Sets the "point size" of a font. Set to zero to unset.
     * Used in CoreText to implement optical sizing.
     *
     * <note>Note: There are 72 points in an inch.</note>
     *
     * @param font #hb_font_t to work upon
     * @param ptem font size in points.
     * @since 1.6.0
     */
    public fun fontSetPtem(
        font: Font,
        ptem: Float,
    ): Unit = hb_font_set_ptem(font.harfbuzzfont_tPointer, ptem)

    /**
     * Sets the horizontal and vertical scale of a font.
     *
     * @param font #hb_font_t to work upon
     * @param xScale Horizontal scale value to assign
     * @param yScale Vertical scale value to assign
     * @since 0.9.2
     */
    public fun fontSetScale(
        font: Font,
        xScale: Int,
        yScale: Int,
    ): Unit = hb_font_set_scale(font.harfbuzzfont_tPointer, xScale, yScale)

    /**
     * Sets design coords of a font from a named instance index.
     *
     * @param font a font.
     * @param instanceIndex named instance index.
     * @since 2.6.0
     */
    public fun fontSetVarNamedInstance(
        font: Font,
        instanceIndex: UInt,
    ): Unit = hb_font_set_var_named_instance(font.harfbuzzfont_tPointer, instanceIndex)

    /**
     *
     *
     * @param font
     */
    public fun ftFontChanged(font: Font): Unit = hb_ft_font_changed(font.harfbuzzfont_tPointer)

    /**
     * Fetches the FT_Load_Glyph load flags of the specified #hb_font_t.
     *
     * For more information, see
     * https://www.freetype.org/freetype2/docs/reference/ft2-base_interface.html#ft_load_xxx
     *
     * @param font #hb_font_t to work upon
     * @return FT_Load_Glyph flags found
     * @since 1.0.5
     */
    public fun ftFontGetLoadFlags(font: Font): Int = hb_ft_font_get_load_flags(font.harfbuzzfont_tPointer)

    /**
     * Configures the font-functions structure of the specified
     * #hb_font_t font object to use FreeType font functions.
     *
     * In particular, you can use this function to configure an
     * existing #hb_face_t face object for use with FreeType font
     * functions even if that #hb_face_t face object was initially
     * created with hb_face_create(), and therefore was not
     * initially configured to use FreeType font functions.
     *
     * An #hb_face_t face object created with hb_ft_face_create()
     * is preconfigured for FreeType font functions and does not
     * require this function to be used.
     *
     * <note>Note: Internally, this function creates an FT_Face.
     * </note>
     *
     * @param font #hb_font_t to work upon
     * @since 1.0.5
     */
    public fun ftFontSetFuncs(font: Font): Unit = hb_ft_font_set_funcs(font.harfbuzzfont_tPointer)

    /**
     * Sets the FT_Load_Glyph load flags for the specified #hb_font_t.
     *
     * For more information, see
     * https://www.freetype.org/freetype2/docs/reference/ft2-base_interface.html#ft_load_xxx
     *
     * @param font #hb_font_t to work upon
     * @param loadFlags The FreeType load flags to set
     * @since 1.0.5
     */
    public fun ftFontSetLoadFlags(
        font: Font,
        loadFlags: Int,
    ): Unit = hb_ft_font_set_load_flags(font.harfbuzzfont_tPointer, loadFlags)

    /**
     *
     *
     * @param font
     * @since 2.6.5
     */
    public fun ftFontUnlockFace(font: Font): Unit = hb_ft_font_unlock_face(font.harfbuzzfont_tPointer)

    /**
     * Creates an #hb_blob_t blob from the specified
     * GBytes data structure.
     *
     * @param gbytes the GBytes structure to work upon
     * @return the new #hb_blob_t blob object
     * @since 0.9.38
     */
    public fun glibBlobCreate(gbytes: Bytes): Blob =
        hb_glib_blob_create(gbytes.glibBytesPointer)!!.run {
            Blob(reinterpret())
        }

    /**
     * Fetches a Unicode-functions structure that is populated
     * with the appropriate GLib function for each method.
     *
     * @return a pointer to the #hb_unicode_funcs_t Unicode-functions structure
     * @since 0.9.38
     */
    public fun glibGetUnicodeFuncs(): UnicodeFuncs =
        hb_glib_get_unicode_funcs()!!.run {
            UnicodeFuncs(reinterpret())
        }

    /**
     * Returns glyph flags encoded within a #hb_glyph_info_t.
     *
     * @param info a #hb_glyph_info_t
     * @return The #hb_glyph_flags_t encoded within @info
     * @since 1.5.0
     */
    public fun glyphInfoGetGlyphFlags(info: GlyphInfo): GlyphFlags =
        hb_glyph_info_get_glyph_flags(info.harfbuzzglyph_info_tPointer).run {
            GlyphFlags(this)
        }

    /**
     * Clears out the contents of @map.
     *
     * @param map A map
     * @since 1.7.7
     */
    public fun mapClear(map: Map): Unit = hb_map_clear(map.harfbuzzmap_tPointer)

    /**
     * Creates a new, initially empty map.
     *
     * @return The new #hb_map_t
     * @since 1.7.7
     */
    public fun mapCreate(): Map =
        hb_map_create()!!.run {
            Map(reinterpret())
        }

    /**
     * Fetches the singleton empty #hb_map_t.
     *
     * @return The empty #hb_map_t
     * @since 1.7.7
     */
    public fun mapGetEmpty(): Map =
        hb_map_get_empty()!!.run {
            Map(reinterpret())
        }

    /**
     * Returns the number of key-value pairs in the map.
     *
     * @param map A map
     * @return The population of @map
     * @since 1.7.7
     */
    public fun mapGetPopulation(map: Map): UInt = hb_map_get_population(map.harfbuzzmap_tPointer)

    /**
     * Fetches the number of color palettes in a face.
     *
     * @param face #hb_face_t to work upon
     * @return the number of palettes found
     * @since 2.1.0
     */
    public fun otColorPaletteGetCount(face: Face): UInt = hb_ot_color_palette_get_count(face.harfbuzzface_tPointer)

    /**
     * Fetches the flags defined for a color palette.
     *
     * @param face #hb_face_t to work upon
     * @param paletteIndex The index of the color palette
     * @return the #hb_ot_color_palette_flags_t of the requested color palette
     * @since 2.1.0
     */
    public fun otColorPaletteGetFlags(
        face: Face,
        paletteIndex: UInt,
    ): OtColorPaletteFlags =
        hb_ot_color_palette_get_flags(face.harfbuzzface_tPointer, paletteIndex).run {
            OtColorPaletteFlags(this)
        }

    /**
     * Sets the font functions to use when working with @font.
     *
     * @param font #hb_font_t to work upon
     * @since 0.9.28
     */
    public fun otFontSetFuncs(font: Font): Unit = hb_ot_font_set_funcs(font.harfbuzzfont_tPointer)

    /**
     * Retrieves the set of all glyphs from the face that belong to the requested
     * glyph class in the face's GDEF table.
     *
     * @param face The #hb_face_t to work on
     * @param klass The #hb_ot_layout_glyph_class_t GDEF class to retrieve
     * @param glyphs The #hb_set_t set of all glyphs belonging to the requested
     *          class.
     * @since 0.9.7
     */
    public fun otLayoutGetGlyphsInClass(
        face: Face,
        klass: OtLayoutGlyphClass,
        glyphs: Set,
    ): Unit =
        hb_ot_layout_get_glyphs_in_class(
            face.harfbuzzface_tPointer,
            klass.nativeValue,
            glyphs.harfbuzzset_tPointer
        )

    /**
     * Compute the transitive closure of glyphs needed for a
     * specified lookup.
     *
     * @param face #hb_face_t to work upon
     * @param lookupIndex index of the feature lookup to query
     * @param glyphs Array of glyphs comprising the transitive closure of the lookup
     * @since 0.9.7
     */
    public fun otLayoutLookupSubstituteClosure(
        face: Face,
        lookupIndex: UInt,
        glyphs: Set,
    ): Unit =
        hb_ot_layout_lookup_substitute_closure(
            face.harfbuzzface_tPointer,
            lookupIndex,
            glyphs.harfbuzzset_tPointer
        )

    /**
     * Compute the transitive closure of glyphs needed for all of the
     * provided lookups.
     *
     * @param face #hb_face_t to work upon
     * @param lookups The set of lookups to query
     * @param glyphs Array of glyphs comprising the transitive closure of the lookups
     * @since 1.8.1
     */
    public fun otLayoutLookupsSubstituteClosure(
        face: Face,
        lookups: Set,
        glyphs: Set,
    ): Unit =
        hb_ot_layout_lookups_substitute_closure(
            face.harfbuzzface_tPointer,
            lookups.harfbuzzset_tPointer,
            glyphs.harfbuzzset_tPointer
        )

    /**
     * It fetches metadata entry of a given tag from a font.
     *
     * @param face a #hb_face_t object.
     * @param metaTag tag of metadata you like to have.
     * @return A blob containing the blob.
     * @since 2.6.0
     */
    public fun otMetaReferenceEntry(
        face: Face,
        metaTag: OtMetaTag,
    ): Blob =
        hb_ot_meta_reference_entry(face.harfbuzzface_tPointer, metaTag.nativeValue)!!.run {
            Blob(reinterpret())
        }

    /**
     *
     *
     * @param font
     * @param metricsTag
     * @since 2.6.0
     */
    public fun otMetricsGetVariation(
        font: Font,
        metricsTag: OtMetricsTag,
    ): Float = hb_ot_metrics_get_variation(font.harfbuzzfont_tPointer, metricsTag.nativeValue)

    /**
     * Fetches the number of OpenType variation axes included in the face.
     *
     * @param face The #hb_face_t to work on
     * @return the number of variation axes defined
     * @since 1.4.2
     */
    public fun otVarGetAxisCount(face: Face): UInt = hb_ot_var_get_axis_count(face.harfbuzzface_tPointer)

    /**
     * Fetches the number of named instances included in the face.
     *
     * @param face The #hb_face_t to work on
     * @return the number of named instances defined
     * @since 2.2.0
     */
    public fun otVarGetNamedInstanceCount(face: Face): UInt =
        hb_ot_var_get_named_instance_count(face.harfbuzzface_tPointer)

    /**
     * Fetches the #hb_direction_t of a script when it is
     * set horizontally. All right-to-left scripts will return
     * #HB_DIRECTION_RTL. All left-to-right scripts will return
     * #HB_DIRECTION_LTR.  Scripts that can be written either
     * horizontally or vertically will return #HB_DIRECTION_INVALID.
     * Unknown scripts will return #HB_DIRECTION_LTR.
     *
     * @param script The #hb_script_t to query
     * @return The horizontal #hb_direction_t of @script
     * @since 0.9.2
     */
    public fun scriptGetHorizontalDirection(script: Script): Direction =
        hb_script_get_horizontal_direction(script.nativeValue).run {
            Direction.fromNativeValue(this)
        }

    /**
     * Creates a hash representing @p.
     *
     * @param p #hb_segment_properties_t to hash.
     * @return A hash of @p.
     * @since 0.9.7
     */
    public fun segmentPropertiesHash(p: SegmentProperties): UInt =
        hb_segment_properties_hash(p.harfbuzzsegment_properties_tPointer)

    /**
     * Clears out the contents of a set.
     *
     * @param set A set
     * @since 0.9.2
     */
    public fun setClear(`set`: Set): Unit = hb_set_clear(`set`.harfbuzzset_tPointer)

    /**
     * Creates a new, initially empty set.
     *
     * @return The new #hb_set_t
     * @since 0.9.2
     */
    public fun setCreate(): Set =
        hb_set_create()!!.run {
            Set(reinterpret())
        }

    /**
     * Fetches the singleton empty #hb_set_t.
     *
     * @return The empty #hb_set_t
     * @since 0.9.2
     */
    public fun setGetEmpty(): Set =
        hb_set_get_empty()!!.run {
            Set(reinterpret())
        }

    /**
     * Returns the number of elements in the set.
     *
     * @param set A set
     * @return The population of @set
     * @since 0.9.7
     */
    public fun setGetPopulation(`set`: Set): UInt = hb_set_get_population(`set`.harfbuzzset_tPointer)

    /**
     * Makes @set the intersection of @set and @other.
     *
     * @param set A set
     * @param other Another set
     * @since 0.9.2
     */
    public fun setIntersect(
        `set`: Set,
        other: Set,
    ): Unit = hb_set_intersect(`set`.harfbuzzset_tPointer, other.harfbuzzset_tPointer)

    /**
     * Inverts the contents of @set.
     *
     * @param set A set
     * @since 0.9.10
     */
    public fun setInvert(`set`: Set): Unit = hb_set_invert(`set`.harfbuzzset_tPointer)

    /**
     * Makes the contents of @set equal to the contents of @other.
     *
     * @param set A set
     * @param other Another set
     * @since 0.9.2
     */
    public fun setSet(
        `set`: Set,
        other: Set,
    ): Unit =
        hb_set_set(
            `set`.harfbuzzset_tPointer,
            other.harfbuzzset_tPointer
        )

    /**
     * Subtracts the contents of @other from @set.
     *
     * @param set A set
     * @param other Another set
     * @since 0.9.2
     */
    public fun setSubtract(
        `set`: Set,
        other: Set,
    ): Unit = hb_set_subtract(`set`.harfbuzzset_tPointer, other.harfbuzzset_tPointer)

    /**
     * Makes @set the symmetric difference of @set
     * and @other.
     *
     * @param set A set
     * @param other Another set
     * @since 0.9.2
     */
    public fun setSymmetricDifference(
        `set`: Set,
        other: Set,
    ): Unit = hb_set_symmetric_difference(`set`.harfbuzzset_tPointer, other.harfbuzzset_tPointer)

    /**
     * Makes @set the union of @set and @other.
     *
     * @param set A set
     * @param other Another set
     * @since 0.9.2
     */
    public fun setUnion(
        `set`: Set,
        other: Set,
    ): Unit =
        hb_set_union(
            `set`.harfbuzzset_tPointer,
            other.harfbuzzset_tPointer
        )

    /**
     * Retrieves the list of shapers supported by HarfBuzz.
     *
     * @return an array of
     *    constant strings
     * @since 0.9.2
     */
    public fun shapeListShapers(): List<String> =
        hb_shape_list_shapers()?.toKStringList()
            ?: error("Expected not null string array")

    /**
     * Fetches the singleton empty shaping plan.
     *
     * @return The empty shaping plan
     * @since 0.9.7
     */
    public fun shapePlanGetEmpty(): ShapePlan =
        hb_shape_plan_get_empty()!!.run {
            ShapePlan(reinterpret())
        }

    /**
     * Fetches the shaper from a given shaping plan.
     *
     * @param shapePlan A shaping plan
     * @return The shaper
     * @since 0.9.7
     */
    public fun shapePlanGetShaper(shapePlan: ShapePlan): String =
        hb_shape_plan_get_shaper(shapePlan.harfbuzzshape_plan_tPointer)?.toKString()
            ?: error("Expected not null string")

    /**
     * Creates a new #hb_unicode_funcs_t structure of Unicode functions.
     *
     * @param parent Parent Unicode-functions structure
     * @return The Unicode-functions structure
     * @since 0.9.2
     */
    public fun unicodeFuncsCreate(parent: UnicodeFuncs? = null): UnicodeFuncs =
        hb_unicode_funcs_create(parent?.harfbuzzunicode_funcs_tPointer)!!.run {
            UnicodeFuncs(reinterpret())
        }

    /**
     * Fetches a pointer to the default Unicode-functions structure that is used
     * when no functions are explicitly set on #hb_buffer_t.
     *
     * @return a pointer to the #hb_unicode_funcs_t Unicode-functions structure
     * @since 0.9.2
     */
    public fun unicodeFuncsGetDefault(): UnicodeFuncs =
        hb_unicode_funcs_get_default()!!.run {
            UnicodeFuncs(reinterpret())
        }

    /**
     * Fetches the singleton empty Unicode-functions structure.
     *
     * @return The empty Unicode-functions structure
     * @since 0.9.2
     */
    public fun unicodeFuncsGetEmpty(): UnicodeFuncs =
        hb_unicode_funcs_get_empty()!!.run {
            UnicodeFuncs(reinterpret())
        }

    /**
     * Fetches the parent of the Unicode-functions structure
     * @ufuncs.
     *
     * @param ufuncs The Unicode-functions structure
     * @return The parent Unicode-functions structure
     * @since 0.9.2
     */
    public fun unicodeFuncsGetParent(ufuncs: UnicodeFuncs): UnicodeFuncs =
        hb_unicode_funcs_get_parent(ufuncs.harfbuzzunicode_funcs_tPointer)!!.run {
            UnicodeFuncs(reinterpret())
        }

    /**
     * Makes the specified Unicode-functions structure
     * immutable.
     *
     * @param ufuncs The Unicode-functions structure
     * @since 0.9.2
     */
    public fun unicodeFuncsMakeImmutable(ufuncs: UnicodeFuncs): Unit =
        hb_unicode_funcs_make_immutable(ufuncs.harfbuzzunicode_funcs_tPointer)

    /**
     * Returns library version as a string with three components.
     *
     * @return Library version string
     * @since 0.9.2
     */
    public fun versionString(): String =
        hb_version_string()?.toKString()
            ?: error("Expected not null string")
}

public val destroy_func_tFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()

public val font_get_glyph_advances_func_tFunc: CPointer<
    CFunction<
        (
            CPointer<hb_font_t>,
            UInt,
            UInt,
            UInt,
        ) -> Unit
        >
    > =
    staticCFunction {
            font: CPointer<hb_font_t>?,
            count: UInt,
            glyphStride: UInt,
            advanceStride: UInt,
            userData: COpaquePointer,
        ->
        userData.asStableRef<
            (
                font: Font,
                count: UInt,
                glyphStride: UInt,
                advanceStride: UInt,
            ) -> Unit
            >().get().invoke(
            font!!.run {
                Font(reinterpret())
            },
            count,
            glyphStride,
            advanceStride
        )
    }
        .reinterpret()

public val font_get_nominal_glyphs_func_tFunc: CPointer<
    CFunction<
        (
            CPointer<hb_font_t>,
            UInt,
            UInt,
            UInt,
        ) -> UInt
        >
    > =
    staticCFunction {
            font: CPointer<hb_font_t>?,
            count: UInt,
            unicodeStride: UInt,
            glyphStride: UInt,
            userData: COpaquePointer,
        ->
        userData.asStableRef<
            (
                font: Font,
                count: UInt,
                unicodeStride: UInt,
                glyphStride: UInt,
            ) -> UInt
            >().get().invoke(
            font!!.run {
                Font(reinterpret())
            },
            count,
            unicodeStride,
            glyphStride
        )
    }
        .reinterpret()

public val reference_table_func_tFunc:
    CPointer<CFunction<(CPointer<hb_face_t>) -> CPointer<hb_blob_t>>> =
    staticCFunction {
            face: CPointer<hb_face_t>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(face: Face) -> Blob>().get().invoke(
            face!!.run {
                Face(reinterpret())
            }
        ).harfbuzzblob_tPointer
    }
        .reinterpret()

public val unicode_combining_class_func_tFunc:
    CPointer<CFunction<(CPointer<hb_unicode_funcs_t>) -> hb_unicode_combining_class_t>> =
    staticCFunction {
            ufuncs: CPointer<hb_unicode_funcs_t>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(ufuncs: UnicodeFuncs) -> UnicodeCombiningClass>().get().invoke(
            ufuncs!!.run {
                UnicodeFuncs(reinterpret())
            }
        ).nativeValue
    }
        .reinterpret()

public val unicode_decompose_compatibility_func_tFunc:
    CPointer<CFunction<(CPointer<hb_unicode_funcs_t>) -> UInt>> =
    staticCFunction {
            ufuncs: CPointer<hb_unicode_funcs_t>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(ufuncs: UnicodeFuncs) -> UInt>().get().invoke(
            ufuncs!!.run {
                UnicodeFuncs(reinterpret())
            }
        )
    }
        .reinterpret()

public val unicode_eastasian_width_func_tFunc:
    CPointer<CFunction<(CPointer<hb_unicode_funcs_t>) -> UInt>> =
    staticCFunction {
            ufuncs: CPointer<hb_unicode_funcs_t>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(ufuncs: UnicodeFuncs) -> UInt>().get().invoke(
            ufuncs!!.run {
                UnicodeFuncs(reinterpret())
            }
        )
    }
        .reinterpret()

public val unicode_general_category_func_tFunc:
    CPointer<CFunction<(CPointer<hb_unicode_funcs_t>) -> hb_unicode_general_category_t>> =
    staticCFunction {
            ufuncs: CPointer<hb_unicode_funcs_t>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(ufuncs: UnicodeFuncs) -> UnicodeGeneralCategory>().get().invoke(
            ufuncs!!.run {
                UnicodeFuncs(reinterpret())
            }
        ).nativeValue
    }
        .reinterpret()

public val unicode_script_func_tFunc:
    CPointer<CFunction<(CPointer<hb_unicode_funcs_t>) -> hb_script_t>> =
    staticCFunction {
            ufuncs: CPointer<hb_unicode_funcs_t>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(ufuncs: UnicodeFuncs) -> Script>().get().invoke(
            ufuncs!!.run {
                UnicodeFuncs(reinterpret())
            }
        ).nativeValue
    }
        .reinterpret()

public typealias destroy_func_t = () -> Unit

/**
 * A virtual method for the #hb_font_funcs_t of an #hb_font_t object.
 *
 * This method should retrieve the advances for a sequence of glyphs.
 *
 * - param `font`
 * - param `count`
 * - param `glyphStride`
 * - param `advanceStride`
 */
public typealias font_get_glyph_advances_func_t = (
    font: Font,
    count: UInt,
    glyphStride: UInt,
    advanceStride: UInt,
) -> Unit

/**
 * A virtual method for the #hb_font_funcs_t of an #hb_font_t object.
 *
 * This method should retrieve the nominal glyph IDs for a sequence of
 * Unicode code points. Glyph IDs must be returned in a #hb_codepoint_t
 * output parameter.
 *
 * - param `font`
 * - param `count`
 * - param `unicodeStride`
 * - param `glyphStride`
 */
public typealias font_get_nominal_glyphs_func_t = (
    font: Font,
    count: UInt,
    unicodeStride: UInt,
    glyphStride: UInt,
) -> UInt

/**
 *
 *
 * - param `face`
 */
public typealias reference_table_func_t = (face: Face) -> Blob

/**
 * A virtual method for the #hb_unicode_funcs_t structure.
 *
 * This method should retrieve the Canonical Combining Class (ccc)
 * property for a specified Unicode code point.
 *
 * - param `ufuncs` A Unicode-functions structure
 * - return The #hb_unicode_combining_class_t of @unicode
 */
public typealias unicode_combining_class_func_t = (ufuncs: UnicodeFuncs) -> UnicodeCombiningClass

/**
 * Fully decompose @u to its Unicode compatibility decomposition. The codepoints of the
 * decomposition will be written to @decomposed.
 * The complete length of the decomposition will be returned.
 *
 * If @u has no compatibility decomposition, zero should be returned.
 *
 * The Unicode standard guarantees that a buffer of length %HB_UNICODE_MAX_DECOMPOSITION_LEN
 * codepoints will always be sufficient for any
 * compatibility decomposition plus an terminating value of 0.  Consequently, @decompose must be
 * allocated by the caller to be at least this length.  Implementations
 * of this function type must ensure that they do not write past the provided array.
 *
 * - param `ufuncs` a Unicode function structure
 * - return number of codepoints in the full compatibility decomposition of @u, or 0 if no
 * decomposition available.
 */
public typealias unicode_decompose_compatibility_func_t = (ufuncs: UnicodeFuncs) -> UInt

/**
 *
 *
 * - param `ufuncs`
 */
public typealias unicode_eastasian_width_func_t = (ufuncs: UnicodeFuncs) -> UInt

/**
 * A virtual method for the #hb_unicode_funcs_t structure.
 *
 * This method should retrieve the General Category property for
 * a specified Unicode code point.
 *
 * - param `ufuncs` A Unicode-functions structure
 * - return The #hb_unicode_general_category_t of @unicode
 */
public typealias unicode_general_category_func_t = (ufuncs: UnicodeFuncs) -> UnicodeGeneralCategory

/**
 * A virtual method for the #hb_unicode_funcs_t structure.
 *
 * This method should retrieve the Script property for a
 * specified Unicode code point.
 *
 * - param `ufuncs` A Unicode-functions structure
 * - return The #hb_script_t of @unicode
 */
public typealias unicode_script_func_t = (ufuncs: UnicodeFuncs) -> Script
