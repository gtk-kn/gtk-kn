// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.common.toCStringList
import org.gtkkn.extensions.common.toKStringList
import org.gtkkn.extensions.glib.GlibException
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.GHook
import org.gtkkn.native.glib.GHookList
import org.gtkkn.native.glib.GIOChannel
import org.gtkkn.native.glib.GIOCondition
import org.gtkkn.native.glib.GLogLevelFlags
import org.gtkkn.native.glib.GLogWriterOutput
import org.gtkkn.native.glib.GMatchInfo
import org.gtkkn.native.glib.GNode
import org.gtkkn.native.glib.GPollFD
import org.gtkkn.native.glib.GScanner
import org.gtkkn.native.glib.GSource
import org.gtkkn.native.glib.GString
import org.gtkkn.native.glib.g_access
import org.gtkkn.native.glib.g_assert_warning
import org.gtkkn.native.glib.g_assertion_message
import org.gtkkn.native.glib.g_assertion_message_cmpstr
import org.gtkkn.native.glib.g_assertion_message_error
import org.gtkkn.native.glib.g_basename
import org.gtkkn.native.glib.g_bit_nth_lsf
import org.gtkkn.native.glib.g_bit_nth_msf
import org.gtkkn.native.glib.g_bit_storage
import org.gtkkn.native.glib.g_bookmark_file_error_quark
import org.gtkkn.native.glib.g_build_filenamev
import org.gtkkn.native.glib.g_build_pathv
import org.gtkkn.native.glib.g_canonicalize_filename
import org.gtkkn.native.glib.g_chdir
import org.gtkkn.native.glib.g_checksum_type_get_length
import org.gtkkn.native.glib.g_clear_error
import org.gtkkn.native.glib.g_close
import org.gtkkn.native.glib.g_compute_checksum_for_bytes
import org.gtkkn.native.glib.g_compute_checksum_for_string
import org.gtkkn.native.glib.g_compute_hmac_for_bytes
import org.gtkkn.native.glib.g_convert_error_quark
import org.gtkkn.native.glib.g_date_valid_julian
import org.gtkkn.native.glib.g_date_valid_month
import org.gtkkn.native.glib.g_date_valid_weekday
import org.gtkkn.native.glib.g_dcgettext
import org.gtkkn.native.glib.g_dgettext
import org.gtkkn.native.glib.g_dir_make_tmp
import org.gtkkn.native.glib.g_dngettext
import org.gtkkn.native.glib.g_dpgettext
import org.gtkkn.native.glib.g_dpgettext2
import org.gtkkn.native.glib.g_environ_getenv
import org.gtkkn.native.glib.g_environ_setenv
import org.gtkkn.native.glib.g_environ_unsetenv
import org.gtkkn.native.glib.g_file_error_from_errno
import org.gtkkn.native.glib.g_file_error_quark
import org.gtkkn.native.glib.g_file_read_link
import org.gtkkn.native.glib.g_file_test
import org.gtkkn.native.glib.g_filename_display_basename
import org.gtkkn.native.glib.g_filename_display_name
import org.gtkkn.native.glib.g_filename_to_uri
import org.gtkkn.native.glib.g_find_program_in_path
import org.gtkkn.native.glib.g_format_size
import org.gtkkn.native.glib.g_format_size_for_display
import org.gtkkn.native.glib.g_format_size_full
import org.gtkkn.native.glib.g_get_application_name
import org.gtkkn.native.glib.g_get_codeset
import org.gtkkn.native.glib.g_get_current_dir
import org.gtkkn.native.glib.g_get_current_time
import org.gtkkn.native.glib.g_get_environ
import org.gtkkn.native.glib.g_get_home_dir
import org.gtkkn.native.glib.g_get_host_name
import org.gtkkn.native.glib.g_get_language_names
import org.gtkkn.native.glib.g_get_language_names_with_category
import org.gtkkn.native.glib.g_get_locale_variants
import org.gtkkn.native.glib.g_get_monotonic_time
import org.gtkkn.native.glib.g_get_num_processors
import org.gtkkn.native.glib.g_get_os_info
import org.gtkkn.native.glib.g_get_prgname
import org.gtkkn.native.glib.g_get_real_name
import org.gtkkn.native.glib.g_get_real_time
import org.gtkkn.native.glib.g_get_system_config_dirs
import org.gtkkn.native.glib.g_get_system_data_dirs
import org.gtkkn.native.glib.g_get_tmp_dir
import org.gtkkn.native.glib.g_get_user_cache_dir
import org.gtkkn.native.glib.g_get_user_config_dir
import org.gtkkn.native.glib.g_get_user_data_dir
import org.gtkkn.native.glib.g_get_user_name
import org.gtkkn.native.glib.g_get_user_runtime_dir
import org.gtkkn.native.glib.g_get_user_special_dir
import org.gtkkn.native.glib.g_get_user_state_dir
import org.gtkkn.native.glib.g_getenv
import org.gtkkn.native.glib.g_hash_table_destroy
import org.gtkkn.native.glib.g_hash_table_new_similar
import org.gtkkn.native.glib.g_hash_table_remove_all
import org.gtkkn.native.glib.g_hash_table_size
import org.gtkkn.native.glib.g_hash_table_steal_all
import org.gtkkn.native.glib.g_hash_table_unref
import org.gtkkn.native.glib.g_hook_destroy
import org.gtkkn.native.glib.g_hook_destroy_link
import org.gtkkn.native.glib.g_hook_free
import org.gtkkn.native.glib.g_hook_insert_before
import org.gtkkn.native.glib.g_hook_prepend
import org.gtkkn.native.glib.g_hook_unref
import org.gtkkn.native.glib.g_hostname_is_ascii_encoded
import org.gtkkn.native.glib.g_hostname_is_ip_address
import org.gtkkn.native.glib.g_hostname_is_non_ascii
import org.gtkkn.native.glib.g_hostname_to_ascii
import org.gtkkn.native.glib.g_hostname_to_unicode
import org.gtkkn.native.glib.g_idle_add_full
import org.gtkkn.native.glib.g_idle_source_new
import org.gtkkn.native.glib.g_intern_static_string
import org.gtkkn.native.glib.g_intern_string
import org.gtkkn.native.glib.g_io_add_watch_full
import org.gtkkn.native.glib.g_io_channel_error_from_errno
import org.gtkkn.native.glib.g_io_channel_error_quark
import org.gtkkn.native.glib.g_io_create_watch
import org.gtkkn.native.glib.g_key_file_error_quark
import org.gtkkn.native.glib.g_listenv
import org.gtkkn.native.glib.g_log_get_debug_enabled
import org.gtkkn.native.glib.g_log_remove_handler
import org.gtkkn.native.glib.g_log_set_always_fatal
import org.gtkkn.native.glib.g_log_set_debug_enabled
import org.gtkkn.native.glib.g_log_set_fatal_mask
import org.gtkkn.native.glib.g_log_set_handler_full
import org.gtkkn.native.glib.g_log_set_writer_func
import org.gtkkn.native.glib.g_log_variant
import org.gtkkn.native.glib.g_log_writer_default_set_use_stderr
import org.gtkkn.native.glib.g_log_writer_default_would_drop
import org.gtkkn.native.glib.g_log_writer_is_journald
import org.gtkkn.native.glib.g_log_writer_supports_color
import org.gtkkn.native.glib.g_main_context_default
import org.gtkkn.native.glib.g_main_context_get_thread_default
import org.gtkkn.native.glib.g_main_context_ref_thread_default
import org.gtkkn.native.glib.g_main_current_source
import org.gtkkn.native.glib.g_main_depth
import org.gtkkn.native.glib.g_markup_error_quark
import org.gtkkn.native.glib.g_markup_escape_text
import org.gtkkn.native.glib.g_mem_is_system_malloc
import org.gtkkn.native.glib.g_mem_profile
import org.gtkkn.native.glib.g_mem_set_vtable
import org.gtkkn.native.glib.g_mkdir_with_parents
import org.gtkkn.native.glib.g_number_parser_error_quark
import org.gtkkn.native.glib.g_on_error_query
import org.gtkkn.native.glib.g_on_error_stack_trace
import org.gtkkn.native.glib.g_option_error_quark
import org.gtkkn.native.glib.g_path_get_basename
import org.gtkkn.native.glib.g_path_get_dirname
import org.gtkkn.native.glib.g_path_is_absolute
import org.gtkkn.native.glib.g_path_skip_root
import org.gtkkn.native.glib.g_pattern_match_simple
import org.gtkkn.native.glib.g_poll
import org.gtkkn.native.glib.g_quark_from_static_string
import org.gtkkn.native.glib.g_quark_from_string
import org.gtkkn.native.glib.g_quark_try_string
import org.gtkkn.native.glib.g_random_double
import org.gtkkn.native.glib.g_random_double_range
import org.gtkkn.native.glib.g_random_int
import org.gtkkn.native.glib.g_random_int_range
import org.gtkkn.native.glib.g_random_set_seed
import org.gtkkn.native.glib.g_ref_string_new
import org.gtkkn.native.glib.g_ref_string_new_intern
import org.gtkkn.native.glib.g_ref_string_new_len
import org.gtkkn.native.glib.g_regex_error_quark
import org.gtkkn.native.glib.g_regex_escape_nul
import org.gtkkn.native.glib.g_regex_match_simple
import org.gtkkn.native.glib.g_regex_split_simple
import org.gtkkn.native.glib.g_reload_user_special_dirs_cache
import org.gtkkn.native.glib.g_rmdir
import org.gtkkn.native.glib.g_set_application_name
import org.gtkkn.native.glib.g_set_prgname
import org.gtkkn.native.glib.g_setenv
import org.gtkkn.native.glib.g_shell_error_quark
import org.gtkkn.native.glib.g_shell_quote
import org.gtkkn.native.glib.g_shell_unquote
import org.gtkkn.native.glib.g_slice_get_config
import org.gtkkn.native.glib.g_slice_set_config
import org.gtkkn.native.glib.g_source_remove
import org.gtkkn.native.glib.g_source_set_name_by_id
import org.gtkkn.native.glib.g_spaced_primes_closest
import org.gtkkn.native.glib.g_spawn_check_exit_status
import org.gtkkn.native.glib.g_spawn_check_wait_status
import org.gtkkn.native.glib.g_spawn_command_line_async
import org.gtkkn.native.glib.g_spawn_error_quark
import org.gtkkn.native.glib.g_spawn_exit_error_quark
import org.gtkkn.native.glib.g_test_assert_expected_messages_internal
import org.gtkkn.native.glib.g_test_bug
import org.gtkkn.native.glib.g_test_bug_base
import org.gtkkn.native.glib.g_test_expect_message
import org.gtkkn.native.glib.g_test_fail
import org.gtkkn.native.glib.g_test_failed
import org.gtkkn.native.glib.g_test_get_dir
import org.gtkkn.native.glib.g_test_get_path
import org.gtkkn.native.glib.g_test_incomplete
import org.gtkkn.native.glib.g_test_log_type_name
import org.gtkkn.native.glib.g_test_rand_double
import org.gtkkn.native.glib.g_test_rand_double_range
import org.gtkkn.native.glib.g_test_rand_int
import org.gtkkn.native.glib.g_test_rand_int_range
import org.gtkkn.native.glib.g_test_run
import org.gtkkn.native.glib.g_test_set_nonfatal_assertions
import org.gtkkn.native.glib.g_test_skip
import org.gtkkn.native.glib.g_test_subprocess
import org.gtkkn.native.glib.g_test_summary
import org.gtkkn.native.glib.g_test_timer_elapsed
import org.gtkkn.native.glib.g_test_timer_last
import org.gtkkn.native.glib.g_test_timer_start
import org.gtkkn.native.glib.g_test_trap_assertions
import org.gtkkn.native.glib.g_test_trap_fork
import org.gtkkn.native.glib.g_test_trap_has_passed
import org.gtkkn.native.glib.g_test_trap_reached_timeout
import org.gtkkn.native.glib.g_test_trap_subprocess
import org.gtkkn.native.glib.g_thread_error_quark
import org.gtkkn.native.glib.g_thread_pool_get_max_idle_time
import org.gtkkn.native.glib.g_thread_pool_get_max_unused_threads
import org.gtkkn.native.glib.g_thread_pool_get_num_unused_threads
import org.gtkkn.native.glib.g_thread_pool_set_max_idle_time
import org.gtkkn.native.glib.g_thread_pool_set_max_unused_threads
import org.gtkkn.native.glib.g_thread_pool_stop_unused_threads
import org.gtkkn.native.glib.g_thread_self
import org.gtkkn.native.glib.g_thread_yield
import org.gtkkn.native.glib.g_time_val_from_iso8601
import org.gtkkn.native.glib.g_timeout_add_full
import org.gtkkn.native.glib.g_timeout_add_seconds_full
import org.gtkkn.native.glib.g_timeout_source_new
import org.gtkkn.native.glib.g_timeout_source_new_seconds
import org.gtkkn.native.glib.g_unichar_break_type
import org.gtkkn.native.glib.g_unichar_combining_class
import org.gtkkn.native.glib.g_unichar_digit_value
import org.gtkkn.native.glib.g_unichar_get_script
import org.gtkkn.native.glib.g_unichar_isalnum
import org.gtkkn.native.glib.g_unichar_isalpha
import org.gtkkn.native.glib.g_unichar_iscntrl
import org.gtkkn.native.glib.g_unichar_isdefined
import org.gtkkn.native.glib.g_unichar_isdigit
import org.gtkkn.native.glib.g_unichar_isgraph
import org.gtkkn.native.glib.g_unichar_islower
import org.gtkkn.native.glib.g_unichar_ismark
import org.gtkkn.native.glib.g_unichar_isprint
import org.gtkkn.native.glib.g_unichar_ispunct
import org.gtkkn.native.glib.g_unichar_isspace
import org.gtkkn.native.glib.g_unichar_istitle
import org.gtkkn.native.glib.g_unichar_isupper
import org.gtkkn.native.glib.g_unichar_iswide
import org.gtkkn.native.glib.g_unichar_iswide_cjk
import org.gtkkn.native.glib.g_unichar_isxdigit
import org.gtkkn.native.glib.g_unichar_iszerowidth
import org.gtkkn.native.glib.g_unichar_tolower
import org.gtkkn.native.glib.g_unichar_totitle
import org.gtkkn.native.glib.g_unichar_toupper
import org.gtkkn.native.glib.g_unichar_type
import org.gtkkn.native.glib.g_unichar_validate
import org.gtkkn.native.glib.g_unichar_xdigit_value
import org.gtkkn.native.glib.g_unicode_script_from_iso15924
import org.gtkkn.native.glib.g_unicode_script_to_iso15924
import org.gtkkn.native.glib.g_unix_error_quark
import org.gtkkn.native.glib.g_unix_fd_add_full
import org.gtkkn.native.glib.g_unix_fd_source_new
import org.gtkkn.native.glib.g_unix_set_fd_nonblocking
import org.gtkkn.native.glib.g_unix_signal_add_full
import org.gtkkn.native.glib.g_unix_signal_source_new
import org.gtkkn.native.glib.g_unlink
import org.gtkkn.native.glib.g_unsetenv
import org.gtkkn.native.glib.g_uri_build
import org.gtkkn.native.glib.g_uri_build_with_user
import org.gtkkn.native.glib.g_uri_error_quark
import org.gtkkn.native.glib.g_uri_escape_string
import org.gtkkn.native.glib.g_uri_is_valid
import org.gtkkn.native.glib.g_uri_join
import org.gtkkn.native.glib.g_uri_join_with_user
import org.gtkkn.native.glib.g_uri_list_extract_uris
import org.gtkkn.native.glib.g_uri_parse
import org.gtkkn.native.glib.g_uri_parse_params
import org.gtkkn.native.glib.g_uri_parse_scheme
import org.gtkkn.native.glib.g_uri_peek_scheme
import org.gtkkn.native.glib.g_uri_resolve_relative
import org.gtkkn.native.glib.g_uri_unescape_bytes
import org.gtkkn.native.glib.g_uri_unescape_segment
import org.gtkkn.native.glib.g_uri_unescape_string
import org.gtkkn.native.glib.g_usleep
import org.gtkkn.native.glib.g_uuid_string_is_valid
import org.gtkkn.native.glib.g_uuid_string_random
import org.gtkkn.native.glib.g_variant_is_object_path
import org.gtkkn.native.glib.g_variant_is_signature
import org.gtkkn.native.glib.g_variant_parse_error_print_context
import org.gtkkn.native.glib.g_variant_parse_error_quark
import org.gtkkn.native.glib.g_variant_parser_get_error_quark
import org.gtkkn.native.glib.g_variant_type_checked_
import org.gtkkn.native.glib.g_variant_type_string_get_depth_
import org.gtkkn.native.glib.g_variant_type_string_is_valid
import org.gtkkn.native.glib.glib_check_version
import kotlin.Boolean
import kotlin.Char
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Result
import kotlin.Short
import kotlin.UInt
import kotlin.ULong
import kotlin.UShort
import kotlin.Unit
import kotlin.collections.List

/**
 * ## Skipped during bindings generation
 *
 * - function `aligned_alloc`: Return type gpointer is unsupported
 * - function `aligned_alloc0`: Return type gpointer is unsupported
 * - parameter `mem`: gpointer
 * - function `ascii_digit_value`: C function g_ascii_digit_value is ignored
 * - function `ascii_dtostr`: C function g_ascii_dtostr is ignored
 * - function `ascii_formatd`: C function g_ascii_formatd is ignored
 * - function `ascii_strcasecmp`: C function g_ascii_strcasecmp is ignored
 * - function `ascii_strdown`: C function g_ascii_strdown is ignored
 * - function `ascii_string_to_signed`: C function g_ascii_string_to_signed is ignored
 * - function `ascii_string_to_unsigned`: C function g_ascii_string_to_unsigned is ignored
 * - function `ascii_strncasecmp`: C function g_ascii_strncasecmp is ignored
 * - function `ascii_strtod`: C function g_ascii_strtod is ignored
 * - function `ascii_strtoll`: C function g_ascii_strtoll is ignored
 * - function `ascii_strtoull`: C function g_ascii_strtoull is ignored
 * - function `ascii_strup`: C function g_ascii_strup is ignored
 * - function `ascii_tolower`: C function g_ascii_tolower is ignored
 * - function `ascii_toupper`: C function g_ascii_toupper is ignored
 * - function `ascii_xdigit_value`: C function g_ascii_xdigit_value is ignored
 * - parameter `arg1`: Unsupported string with cType const char* const*
 * - parameter `func`: VoidFunc
 * - parameter `atomic`: Unsupported pointer to primitive type
 * - parameter `atomic`: Unsupported pointer to primitive type
 * - parameter `atomic`: Unsupported pointer to primitive type
 * - parameter `atomic`: Unsupported pointer to primitive type
 * - parameter `atomic`: Unsupported pointer to primitive type
 * - parameter `atomic`: Unsupported pointer to primitive type
 * - parameter `atomic`: Unsupported pointer to primitive type
 * - parameter `atomic`: Unsupported pointer to primitive type
 * - parameter `atomic`: Unsupported pointer to primitive type
 * - parameter `atomic`: Unsupported pointer to primitive type
 * - parameter `atomic`: gpointer
 * - parameter `atomic`: gpointer
 * - parameter `atomic`: gpointer
 * - parameter `atomic`: gpointer
 * - parameter `atomic`: gpointer
 * - parameter `atomic`: gpointer
 * - parameter `atomic`: gpointer
 * - parameter `mem_block`: gpointer
 * - function `atomic_rc_box_alloc`: Return type gpointer is unsupported
 * - function `atomic_rc_box_alloc0`: Return type gpointer is unsupported
 * - parameter `mem_block`: gpointer
 * - parameter `mem_block`: gpointer
 * - parameter `mem_block`: gpointer
 * - parameter `mem_block`: gpointer
 * - parameter `arc`: Unsupported pointer to primitive type
 * - parameter `arc`: Unsupported pointer to primitive type
 * - parameter `arc`: Unsupported pointer to primitive type
 * - parameter `arc`: Unsupported pointer to primitive type
 * - parameter `out_len`: out_len: Out parameter is not supported
 * - function `base64_decode_inplace`: In/Out parameter is not supported
 * - parameter `data`: guint8
 * - function `base64_encode_close`: In/Out parameter is not supported
 * - function `base64_encode_step`: In/Out parameter is not supported
 * - parameter `address`: Unsupported pointer to primitive type
 * - parameter `address`: Unsupported pointer to primitive type
 * - parameter `address`: Unsupported pointer to primitive type
 * - parameter `array`: guint8
 * - parameter `array`: guint8
 * - function `byte_array_new`: guint8
 * - parameter `data`: guint8
 * - parameter `array`: guint8
 * - parameter `array`: guint8
 * - parameter `pid`: Pid
 * - parameter `pid`: Pid
 * - parameter `data`: guint8
 * - parameter `key`: guint8
 * - parameter `key`: guint8
 * - parameter `str`: guint8
 * - parameter `str`: guint8
 * - parameter `datalist`: Data
 * - parameter `datalist`: Data
 * - parameter `datalist`: Data
 * - parameter `datalist`: Data
 * - parameter `datalist`: Data
 * - parameter `datalist`: Data
 * - parameter `dataset_location`: gpointer
 * - parameter `dataset_location`: gpointer
 * - parameter `dataset_location`: gpointer
 * - parameter `year`: DateYear
 * - parameter `year`: DateYear
 * - parameter `year`: DateYear
 * - parameter `year`: DateYear
 * - function `date_strftime`: C function g_date_strftime is ignored
 * - parameter `day`: DateDay
 * - parameter `day`: DateDay
 * - parameter `year`: DateYear
 * - parameter `v1`: gpointer
 * - parameter `v`: gpointer
 * - parameter `v1`: gpointer
 * - parameter `v`: gpointer
 * - parameter `contents`: contents: Out parameter is not supported
 * - parameter `name_used`: name_used: Out parameter is not supported
 * - parameter `contents`: guint8
 * - parameter `contents`: guint8
 * - parameter `hostname`: hostname: Out parameter is not supported
 * - parameter `bytes_read`: bytes_read: Out parameter is not supported
 * - parameter `bytes_read`: bytes_read: Out parameter is not supported
 * - parameter `mem`: gpointer
 * - parameter `charset`: charset: Out parameter is not supported
 * - parameter `charset`: charset: Out parameter is not supported
 * - parameter `filename_charsets`: filename_charsets: Out parameter is not supported
 * - parameter `key`: gpointer
 * - parameter `key`: gpointer
 * - parameter `key`: gpointer
 * - parameter `key`: gpointer
 * - parameter `lookup_key`: gpointer
 * - parameter `key`: gpointer
 * - parameter `key`: gpointer
 * - parameter `key`: gpointer
 * - parameter `lookup_key`: gpointer
 * - parameter `data`: gpointer
 * - parameter `v1`: gpointer
 * - parameter `v`: gpointer
 * - parameter `v1`: gpointer
 * - parameter `v`: gpointer
 * - parameter `bytes_read`: bytes_read: Out parameter is not supported
 * - parameter `opsysstring`: guint8
 * - parameter `unused_data`: gpointer
 * - parameter `fields`: LogField
 * - parameter `fields`: LogField
 * - parameter `fields`: LogField
 * - parameter `fields`: LogField
 * - parameter `fields`: LogField
 * - function `malloc`: Return type gpointer is unsupported
 * - function `malloc0`: Return type gpointer is unsupported
 * - function `malloc0_n`: Return type gpointer is unsupported
 * - function `malloc_n`: Return type gpointer is unsupported
 * - parameter `mem`: gpointer
 * - parameter `mem`: gpointer
 * - parameter `nullify_location`: gpointer
 * - parameter `location`: gpointer
 * - parameter `location`: gpointer
 * - parameter `keys`: DebugKey
 * - parameter `address`: gpointer
 * - parameter `address`: gpointer
 * - parameter `address`: gpointer
 * - function `prefix_error_literal`: C function g_prefix_error_literal is ignored
 * - parameter `dest`: dest: Out parameter is not supported
 * - function `quark_to_string`: C function g_quark_to_string is ignored
 * - parameter `mem_block`: gpointer
 * - function `rc_box_alloc`: Return type gpointer is unsupported
 * - function `rc_box_alloc0`: Return type gpointer is unsupported
 * - parameter `mem_block`: gpointer
 * - parameter `mem_block`: gpointer
 * - parameter `mem_block`: gpointer
 * - parameter `mem_block`: gpointer
 * - parameter `mem`: gpointer
 * - parameter `mem`: gpointer
 * - parameter `rc`: Unsupported pointer to primitive type
 * - parameter `rc`: Unsupported pointer to primitive type
 * - parameter `rc`: Unsupported pointer to primitive type
 * - parameter `rc`: Unsupported pointer to primitive type
 * - parameter `str`: Unsupported string type with cType: char*
 * - parameter `str`: Unsupported string type with cType: char*
 * - parameter `str`: Unsupported string type with cType: char*
 * - parameter `has_references`: has_references: Out parameter is not supported
 * - parameter `string`: Unsupported string with cType gchar
 * - parameter `iter`: SequenceIter
 * - parameter `iter`: SequenceIter
 * - parameter `src`: SequenceIter
 * - parameter `dest`: SequenceIter
 * - parameter `begin`: SequenceIter
 * - parameter `iter`: SequenceIter
 * - parameter `begin`: SequenceIter
 * - parameter `iter`: SequenceIter
 * - parameter `a`: SequenceIter
 * - parameter `err`: err: Out parameter is not supported
 * - parameter `argcp`: argcp: Out parameter is not supported
 * - function `slice_alloc`: Return type gpointer is unsupported
 * - function `slice_alloc0`: Return type gpointer is unsupported
 * - parameter `mem_block`: gpointer
 * - parameter `mem_block`: gpointer
 * - parameter `mem_chain`: gpointer
 * - parameter `n_values`: Unsupported pointer to primitive type
 * - parameter `user_data`: gpointer
 * - parameter `user_data`: gpointer
 * - parameter `child_pid`: child_pid: Out parameter is not supported
 * - parameter `child_pid`: child_pid: Out parameter is not supported
 * - parameter `child_pid`: child_pid: Out parameter is not supported
 * - parameter `source_fds`: Array parameter of type gint is not supported
 * - parameter `pid`: Pid
 * - parameter `standard_output`: standard_output: Out parameter is not supported
 * - parameter `standard_output`: standard_output: Out parameter is not supported
 * - function `stpcpy`: C function g_stpcpy is ignored
 * - function `str_equal`: C function g_str_equal is ignored
 * - function `str_has_prefix`: C function g_str_has_prefix is ignored
 * - function `str_has_suffix`: C function g_str_has_suffix is ignored
 * - function `str_hash`: C function g_str_hash is ignored
 * - function `str_is_ascii`: C function g_str_is_ascii is ignored
 * - function `str_match_string`: C function g_str_match_string is ignored
 * - function `str_to_ascii`: C function g_str_to_ascii is ignored
 * - function `str_tokenize_and_fold`: C function g_str_tokenize_and_fold is ignored
 * - function `strcanon`: C function g_strcanon is ignored
 * - function `strcasecmp`: C function g_strcasecmp is ignored
 * - function `strchomp`: C function g_strchomp is ignored
 * - function `strchug`: C function g_strchug is ignored
 * - function `strcmp0`: C function g_strcmp0 is ignored
 * - function `strcompress`: C function g_strcompress is ignored
 * - function `strdelimit`: C function g_strdelimit is ignored
 * - function `strdown`: C function g_strdown is ignored
 * - function `strdup`: C function g_strdup is ignored
 * - function `strerror`: C function g_strerror is ignored
 * - function `strescape`: C function g_strescape is ignored
 * - function `strfreev`: C function g_strfreev is ignored
 * - function `strip_context`: C function g_strip_context is ignored
 * - function `strjoinv`: C function g_strjoinv is ignored
 * - function `strlcat`: C function g_strlcat is ignored
 * - function `strlcpy`: C function g_strlcpy is ignored
 * - function `strncasecmp`: C function g_strncasecmp is ignored
 * - function `strndup`: C function g_strndup is ignored
 * - function `strnfill`: C function g_strnfill is ignored
 * - function `strreverse`: C function g_strreverse is ignored
 * - function `strrstr`: C function g_strrstr is ignored
 * - function `strrstr_len`: C function g_strrstr_len is ignored
 * - function `strsignal`: C function g_strsignal is ignored
 * - function `strstr_len`: C function g_strstr_len is ignored
 * - function `strtod`: C function g_strtod is ignored
 * - function `strup`: C function g_strup is ignored
 * - function `strv_contains`: C function g_strv_contains is ignored
 * - function `strv_equal`: C function g_strv_equal is ignored
 * - function `strv_get_type`: C function g_strv_get_type is ignored
 * - function `strv_length`: C function g_strv_length is ignored
 * - parameter `test_data`: gpointer
 * - parameter `test_data`: gpointer
 * - parameter `test_func`: TestFunc
 * - parameter `destroy_func`: DestroyNotify
 * - parameter `gfree_pointer`: gpointer
 * - parameter `suite`: TestSuite
 * - parameter `retval`: gpointer
 * - function `trash_stack_height`: C function g_trash_stack_height is ignored
 * - function `trash_stack_peek`: Return type gpointer is unsupported
 * - function `trash_stack_pop`: Return type gpointer is unsupported
 * - parameter `data_p`: gpointer
 * - function `try_malloc`: Return type gpointer is unsupported
 * - function `try_malloc0`: Return type gpointer is unsupported
 * - function `try_malloc0_n`: Return type gpointer is unsupported
 * - function `try_malloc_n`: Return type gpointer is unsupported
 * - parameter `mem`: gpointer
 * - parameter `mem`: gpointer
 * - parameter `str`: Unsupported pointer to primitive type
 * - parameter `str`: Unsupported pointer to primitive type
 * - parameter `ch`: ch: Out parameter is not supported
 * - parameter `a`: a: Out parameter is not supported
 * - parameter `result`: result: Out parameter is not supported
 * - parameter `mirrored_ch`: Unsupported pointer to primitive type
 * - parameter `outbuf`: outbuf: Out parameter is not supported
 * - parameter `result_len`: Unsupported pointer to primitive type
 * - parameter `string`: Unsupported pointer to primitive type
 * - function `unix_get_passwd_entry`: Return type gpointer is unsupported
 * - parameter `fds`: Unsupported pointer to primitive type
 * - parameter `unescaped`: guint8
 * - parameter `scheme`: scheme: Out parameter is not supported
 * - parameter `scheme`: scheme: Out parameter is not supported
 * - parameter `scheme`: scheme: Out parameter is not supported
 * - parameter `str`: Unsupported pointer to primitive type
 * - parameter `str`: Unsupported pointer to primitive type
 * - function `utf8_casefold`: C function g_utf8_casefold is ignored
 * - function `utf8_collate`: C function g_utf8_collate is ignored
 * - function `utf8_collate_key`: C function g_utf8_collate_key is ignored
 * - function `utf8_collate_key_for_filename`: C function g_utf8_collate_key_for_filename is ignored
 * - function `utf8_find_next_char`: C function g_utf8_find_next_char is ignored
 * - function `utf8_find_prev_char`: C function g_utf8_find_prev_char is ignored
 * - function `utf8_get_char`: C function g_utf8_get_char is ignored
 * - function `utf8_get_char_validated`: C function g_utf8_get_char_validated is ignored
 * - function `utf8_make_valid`: C function g_utf8_make_valid is ignored
 * - function `utf8_normalize`: C function g_utf8_normalize is ignored
 * - function `utf8_offset_to_pointer`: C function g_utf8_offset_to_pointer is ignored
 * - function `utf8_pointer_to_offset`: C function g_utf8_pointer_to_offset is ignored
 * - function `utf8_prev_char`: C function g_utf8_prev_char is ignored
 * - function `utf8_strchr`: C function g_utf8_strchr is ignored
 * - function `utf8_strdown`: C function g_utf8_strdown is ignored
 * - function `utf8_strlen`: C function g_utf8_strlen is ignored
 * - function `utf8_strncpy`: C function g_utf8_strncpy is ignored
 * - function `utf8_strrchr`: C function g_utf8_strrchr is ignored
 * - function `utf8_strreverse`: C function g_utf8_strreverse is ignored
 * - function `utf8_strup`: C function g_utf8_strup is ignored
 * - function `utf8_substring`: C function g_utf8_substring is ignored
 * - function `utf8_to_ucs4`: C function g_utf8_to_ucs4 is ignored
 * - function `utf8_to_ucs4_fast`: C function g_utf8_to_ucs4_fast is ignored
 * - function `utf8_to_utf16`: C function g_utf8_to_utf16 is ignored
 * - function `utf8_validate`: C function g_utf8_validate is ignored
 * - function `utf8_validate_len`: C function g_utf8_validate_len is ignored
 * - function `variant_get_gtype`: C function g_variant_get_gtype is ignored
 * - parameter `endptr`: Unsupported string with cType const gchar**
 * - parameter `endptr`: endptr: Out parameter is not supported
 * - callback `CopyFunc`: Return type gpointer is unsupported
 * - callback `DuplicateFunc`: Return type gpointer is unsupported
 * - callback `OptionArgFunc`: Callbacks that throw are not supported
 * - callback `OptionErrorFunc`: Callbacks that throw are not supported
 * - callback `OptionParseFunc`: Callbacks that throw are not supported
 * - callback `ThreadFunc`: Return type gpointer is unsupported
 * - callback `TranslateFunc`: Callback with String return value is not supported
 * - constant `MAXINT8`: gint8
 * - constant `MAXUINT8`: guint8
 * - constant `MININT8`: gint8
 * - record `AsyncQueue`: Disguised records are ignored
 * - record `BookmarkFile`: Disguised records are ignored
 * - record `Data`: Disguised records are ignored
 * - record `Dir`: Disguised records are ignored
 * - record `Hmac`: Disguised records are ignored
 * - record `OptionContext`: Disguised records are ignored
 * - record `Rand`: Disguised records are ignored
 * - record `Sequence`: Disguised records are ignored
 * - record `SequenceIter`: Disguised records are ignored
 * - record `SourcePrivate`: Disguised records are ignored
 * - record `StatBuf`: Disguised records are ignored
 * - record `StringChunk`: Disguised records are ignored
 * - record `StrvBuilder`: Disguised records are ignored
 * - record `TestCase`: Disguised records are ignored
 * - record `TestSuite`: Disguised records are ignored
 * - record `Timer`: Disguised records are ignored
 * - record `TreeNode`: Disguised records are ignored
 */
public object Glib {
    public const val ANALYZER_ANALYZING: Int = 1

    /**
     * A good size for a buffer to be passed into g_ascii_dtostr().
     * It is guaranteed to be enough for all output of that function
     * on systems with 64bit IEEE-compatible doubles.
     *
     * The typical usage would be something like:
     * |[<!-- language="C" -->
     *   char buf[G_ASCII_DTOSTR_BUF_SIZE];
     *
     *   fprintf (out, "value=%s\n", g_ascii_dtostr (buf, sizeof (buf), value));
     * ]|
     */
    public const val ASCII_DTOSTR_BUF_SIZE: Int = 39

    /**
     * Specifies one of the possible types of byte order.
     * See %G_BYTE_ORDER.
     */
    public const val BIG_ENDIAN: Int = 4321

    /**
     * The set of uppercase ASCII alphabet characters.
     * Used for specifying valid identifier characters
     * in #GScannerConfig.
     */
    public const val CSET_A_2_Z: kotlin.String = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    /**
     * The set of ASCII digits.
     * Used for specifying valid identifier characters
     * in #GScannerConfig.
     */
    public const val CSET_DIGITS: kotlin.String = "0123456789"

    /**
     * The set of lowercase ASCII alphabet characters.
     * Used for specifying valid identifier characters
     * in #GScannerConfig.
     */
    public const val CSET_a_2_z: kotlin.String = "abcdefghijklmnopqrstuvwxyz"

    /**
     * A bitmask that restricts the possible flags passed to
     * g_datalist_set_flags(). Passing a flags value where
     * flags & ~G_DATALIST_FLAGS_MASK != 0 is an error.
     */
    public const val DATALIST_FLAGS_MASK: Int = 3

    /**
     * Represents an invalid #GDateDay.
     */
    public const val DATE_BAD_DAY: Int = 0

    /**
     * Represents an invalid Julian day number.
     */
    public const val DATE_BAD_JULIAN: Int = 0

    /**
     * Represents an invalid year.
     */
    public const val DATE_BAD_YEAR: Int = 0

    /**
     * The directory separator character.
     * This is '/' on UNIX machines and '\' under Windows.
     */
    public const val DIR_SEPARATOR: Int = 47

    /**
     * The directory separator as a string.
     * This is "/" on UNIX machines and "\" under Windows.
     */
    public const val DIR_SEPARATOR_S: kotlin.String = "/"

    /**
     * The base of natural logarithms.
     */
    public const val E: Double = 2.718282

    /**
     * This is the platform dependent conversion specifier for scanning and
     * printing values of type #gint16. It is a string literal, but doesn't
     * include the percent-sign, such that you can add precision and length
     * modifiers between percent-sign and conversion specifier.
     *
     * |[<!-- language="C" -->
     * gint16 in;
     * gint32 out;
     * sscanf ("42", "%" G_GINT16_FORMAT, &in)
     * out = in * 1000;
     * g_print ("%" G_GINT32_FORMAT, out);
     * ]|
     */
    public const val GINT16_FORMAT: kotlin.String = "hi"

    /**
     * The platform dependent length modifier for conversion specifiers
     * for scanning and printing values of type #gint16 or #guint16. It
     * is a string literal, but doesn't include the percent-sign, such
     * that you can add precision and length modifiers between percent-sign
     * and conversion specifier and append a conversion specifier.
     *
     * The following example prints "0x7b";
     * |[<!-- language="C" -->
     * gint16 value = 123;
     * g_print ("%#" G_GINT16_MODIFIER "x", value);
     * ]|
     *
     * @since 2.4
     */
    public const val GINT16_MODIFIER: kotlin.String = "h"

    /**
     * This is the platform dependent conversion specifier for scanning
     * and printing values of type #gint32. See also %G_GINT16_FORMAT.
     */
    public const val GINT32_FORMAT: kotlin.String = "i"

    /**
     * The platform dependent length modifier for conversion specifiers
     * for scanning and printing values of type #gint32 or #guint32. It
     * is a string literal. See also %G_GINT16_MODIFIER.
     *
     * @since 2.4
     */
    public const val GINT32_MODIFIER: kotlin.String = ""

    /**
     * This is the platform dependent conversion specifier for scanning
     * and printing values of type #gint64. See also %G_GINT16_FORMAT.
     *
     * Some platforms do not support scanning and printing 64-bit integers,
     * even though the types are supported. On such platforms %G_GINT64_FORMAT
     * is not defined. Note that scanf() may not support 64-bit integers, even
     * if %G_GINT64_FORMAT is defined. Due to its weak error handling, scanf()
     * is not recommended for parsing anyway; consider using g_ascii_strtoull()
     * instead.
     */
    public const val GINT64_FORMAT: kotlin.String = "li"

    /**
     * The platform dependent length modifier for conversion specifiers
     * for scanning and printing values of type #gint64 or #guint64.
     * It is a string literal.
     *
     * Some platforms do not support printing 64-bit integers, even
     * though the types are supported. On such platforms %G_GINT64_MODIFIER
     * is not defined.
     *
     * @since 2.4
     */
    public const val GINT64_MODIFIER: kotlin.String = "l"

    /**
     * This is the platform dependent conversion specifier for scanning
     * and printing values of type #gintptr.
     *
     * @since 2.22
     */
    public const val GINTPTR_FORMAT: kotlin.String = "li"

    /**
     * The platform dependent length modifier for conversion specifiers
     * for scanning and printing values of type #gintptr or #guintptr.
     * It is a string literal.
     *
     * @since 2.22
     */
    public const val GINTPTR_MODIFIER: kotlin.String = "l"

    /**
     * Expands to "" on all modern compilers, and to  __FUNCTION__ on gcc
     * version 2.x. Don't use it.
     */
    public const val GNUC_FUNCTION: kotlin.String = ""

    /**
     * Expands to "" on all modern compilers, and to __PRETTY_FUNCTION__
     * on gcc version 2.x. Don't use it.
     */
    public const val GNUC_PRETTY_FUNCTION: kotlin.String = ""

    /**
     * This is the platform dependent conversion specifier for scanning
     * and printing values of type #gsize. See also %G_GINT16_FORMAT.
     *
     * @since 2.6
     */
    public const val GSIZE_FORMAT: kotlin.String = "lu"

    /**
     * The platform dependent length modifier for conversion specifiers
     * for scanning and printing values of type #gsize. It
     * is a string literal.
     *
     * @since 2.6
     */
    public const val GSIZE_MODIFIER: kotlin.String = "l"

    /**
     * This is the platform dependent conversion specifier for scanning
     * and printing values of type #gssize. See also %G_GINT16_FORMAT.
     *
     * @since 2.6
     */
    public const val GSSIZE_FORMAT: kotlin.String = "li"

    /**
     * The platform dependent length modifier for conversion specifiers
     * for scanning and printing values of type #gssize. It
     * is a string literal.
     *
     * @since 2.6
     */
    public const val GSSIZE_MODIFIER: kotlin.String = "l"

    /**
     * This is the platform dependent conversion specifier for scanning
     * and printing values of type #guint16. See also %G_GINT16_FORMAT
     */
    public const val GUINT16_FORMAT: kotlin.String = "hu"

    /**
     * This is the platform dependent conversion specifier for scanning
     * and printing values of type #guint32. See also %G_GINT16_FORMAT.
     */
    public const val GUINT32_FORMAT: kotlin.String = "u"

    /**
     * This is the platform dependent conversion specifier for scanning
     * and printing values of type #guint64. See also %G_GINT16_FORMAT.
     *
     * Some platforms do not support scanning and printing 64-bit integers,
     * even though the types are supported. On such platforms %G_GUINT64_FORMAT
     * is not defined.  Note that scanf() may not support 64-bit integers, even
     * if %G_GINT64_FORMAT is defined. Due to its weak error handling, scanf()
     * is not recommended for parsing anyway; consider using g_ascii_strtoull()
     * instead.
     */
    public const val GUINT64_FORMAT: kotlin.String = "lu"

    /**
     * This is the platform dependent conversion specifier
     * for scanning and printing values of type #guintptr.
     *
     * @since 2.22
     */
    public const val GUINTPTR_FORMAT: kotlin.String = "lu"

    public const val HAVE_GINT64: Int = 1

    public const val HAVE_GNUC_VARARGS: Int = 1

    /**
     * Defined to 1 if gcc-style visibility handling is supported.
     */
    public const val HAVE_GNUC_VISIBILITY: Int = 1

    public const val HAVE_GROWING_STACK: Int = 0

    public const val HAVE_ISO_VARARGS: Int = 1

    /**
     * The position of the first bit which is not reserved for internal
     * use be the #GHook implementation, i.e.
     * `1 << G_HOOK_FLAG_USER_SHIFT` is the first
     * bit which can be used for application-defined flags.
     */
    public const val HOOK_FLAG_USER_SHIFT: Int = 4

    /**
     * The bias by which exponents in double-precision floats are offset.
     */
    public const val IEEE754_DOUBLE_BIAS: Int = 1023

    /**
     * The bias by which exponents in single-precision floats are offset.
     */
    public const val IEEE754_FLOAT_BIAS: Int = 127

    /**
     * The name of the main group of a desktop entry file, as defined in the
     * [Desktop Entry Specification](http://freedesktop.org/Standards/desktop-entry-spec).
     * Consult the specification for more
     * details about the meanings of the keys below.
     *
     * @since 2.14
     */
    public const val KEY_FILE_DESKTOP_GROUP: kotlin.String = "Desktop Entry"

    /**
     * A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a string list
     * giving the available application actions.
     *
     * @since 2.38
     */
    public const val KEY_FILE_DESKTOP_KEY_ACTIONS: kotlin.String = "Actions"

    /**
     * A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a list
     * of strings giving the categories in which the desktop entry
     * should be shown in a menu.
     *
     * @since 2.14
     */
    public const val KEY_FILE_DESKTOP_KEY_CATEGORIES: kotlin.String = "Categories"

    /**
     * A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a localized
     * string giving the tooltip for the desktop entry.
     *
     * @since 2.14
     */
    public const val KEY_FILE_DESKTOP_KEY_COMMENT: kotlin.String = "Comment"

    /**
     * A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a boolean
     * set to true if the application is D-Bus activatable.
     *
     * @since 2.38
     */
    public const val KEY_FILE_DESKTOP_KEY_DBUS_ACTIVATABLE: kotlin.String = "DBusActivatable"

    /**
     * A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a string
     * giving the command line to execute. It is only valid for desktop
     * entries with the `Application` type.
     *
     * @since 2.14
     */
    public const val KEY_FILE_DESKTOP_KEY_EXEC: kotlin.String = "Exec"

    /**
     * A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a localized
     * string giving the generic name of the desktop entry.
     *
     * @since 2.14
     */
    public const val KEY_FILE_DESKTOP_KEY_GENERIC_NAME: kotlin.String = "GenericName"

    /**
     * A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a boolean
     * stating whether the desktop entry has been deleted by the user.
     *
     * @since 2.14
     */
    public const val KEY_FILE_DESKTOP_KEY_HIDDEN: kotlin.String = "Hidden"

    /**
     * A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a localized
     * string giving the name of the icon to be displayed for the desktop
     * entry.
     *
     * @since 2.14
     */
    public const val KEY_FILE_DESKTOP_KEY_ICON: kotlin.String = "Icon"

    /**
     * A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a list
     * of strings giving the MIME types supported by this desktop entry.
     *
     * @since 2.14
     */
    public const val KEY_FILE_DESKTOP_KEY_MIME_TYPE: kotlin.String = "MimeType"

    /**
     * A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a localized
     * string giving the specific name of the desktop entry.
     *
     * @since 2.14
     */
    public const val KEY_FILE_DESKTOP_KEY_NAME: kotlin.String = "Name"

    /**
     * A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a list of
     * strings identifying the environments that should not display the
     * desktop entry.
     *
     * @since 2.14
     */
    public const val KEY_FILE_DESKTOP_KEY_NOT_SHOW_IN: kotlin.String = "NotShowIn"

    /**
     * A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a boolean
     * stating whether the desktop entry should be shown in menus.
     *
     * @since 2.14
     */
    public const val KEY_FILE_DESKTOP_KEY_NO_DISPLAY: kotlin.String = "NoDisplay"

    /**
     * A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a list of
     * strings identifying the environments that should display the
     * desktop entry.
     *
     * @since 2.14
     */
    public const val KEY_FILE_DESKTOP_KEY_ONLY_SHOW_IN: kotlin.String = "OnlyShowIn"

    /**
     * A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a string
     * containing the working directory to run the program in. It is only
     * valid for desktop entries with the `Application` type.
     *
     * @since 2.14
     */
    public const val KEY_FILE_DESKTOP_KEY_PATH: kotlin.String = "Path"

    /**
     * A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a boolean
     * stating whether the application supports the
     * [Startup Notification Protocol
     * Specification](http://www.freedesktop.org/Standards/startup-notification-spec).
     *
     * @since 2.14
     */
    public const val KEY_FILE_DESKTOP_KEY_STARTUP_NOTIFY: kotlin.String = "StartupNotify"

    /**
     * A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is string
     * identifying the WM class or name hint of a window that the application
     * will create, which can be used to emulate Startup Notification with
     * older applications.
     *
     * @since 2.14
     */
    public const val KEY_FILE_DESKTOP_KEY_STARTUP_WM_CLASS: kotlin.String = "StartupWMClass"

    /**
     * A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a boolean
     * stating whether the program should be run in a terminal window.
     *
     * It is only valid for desktop entries with the `Application` type.
     *
     * @since 2.14
     */
    public const val KEY_FILE_DESKTOP_KEY_TERMINAL: kotlin.String = "Terminal"

    /**
     * A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a string
     * giving the file name of a binary on disk used to determine if the
     * program is actually installed. It is only valid for desktop entries
     * with the `Application` type.
     *
     * @since 2.14
     */
    public const val KEY_FILE_DESKTOP_KEY_TRY_EXEC: kotlin.String = "TryExec"

    /**
     * A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a string
     * giving the type of the desktop entry.
     *
     * Usually %G_KEY_FILE_DESKTOP_TYPE_APPLICATION,
     * %G_KEY_FILE_DESKTOP_TYPE_LINK, or
     * %G_KEY_FILE_DESKTOP_TYPE_DIRECTORY.
     *
     * @since 2.14
     */
    public const val KEY_FILE_DESKTOP_KEY_TYPE: kotlin.String = "Type"

    /**
     * A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a string
     * giving the URL to access. It is only valid for desktop entries
     * with the `Link` type.
     *
     * @since 2.14
     */
    public const val KEY_FILE_DESKTOP_KEY_URL: kotlin.String = "URL"

    /**
     * A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a string
     * giving the version of the Desktop Entry Specification used for
     * the desktop entry file.
     *
     * @since 2.14
     */
    public const val KEY_FILE_DESKTOP_KEY_VERSION: kotlin.String = "Version"

    /**
     * The value of the %G_KEY_FILE_DESKTOP_KEY_TYPE, key for desktop
     * entries representing applications.
     *
     * @since 2.14
     */
    public const val KEY_FILE_DESKTOP_TYPE_APPLICATION: kotlin.String = "Application"

    /**
     * The value of the %G_KEY_FILE_DESKTOP_KEY_TYPE, key for desktop
     * entries representing directories.
     *
     * @since 2.14
     */
    public const val KEY_FILE_DESKTOP_TYPE_DIRECTORY: kotlin.String = "Directory"

    /**
     * The value of the %G_KEY_FILE_DESKTOP_KEY_TYPE, key for desktop
     * entries representing links to documents.
     *
     * @since 2.14
     */
    public const val KEY_FILE_DESKTOP_TYPE_LINK: kotlin.String = "Link"

    /**
     * Specifies one of the possible types of byte order.
     * See %G_BYTE_ORDER.
     */
    public const val LITTLE_ENDIAN: Int = 1234

    /**
     * The natural logarithm of 10.
     */
    public const val LN10: Double = 2.302585

    /**
     * The natural logarithm of 2.
     */
    public const val LN2: Double = 0.693147

    /**
     * Multiplying the base 2 exponent by this number yields the base 10 exponent.
     */
    public const val LOG_2_BASE_10: Double = 0.301030

    /**
     * Defines the log domain. See [Log Domains](#log-domains).
     *
     * Libraries should define this so that any messages
     * which they log can be differentiated from messages from other
     * libraries and application code. But be careful not to define
     * it in any public header files.
     *
     * Log domains must be unique, and it is recommended that they are the
     * application or library name, optionally followed by a hyphen and a sub-domain
     * name. For example, `bloatpad` or `bloatpad-io`.
     *
     * If undefined, it defaults to the default null (or `""`) log domain; this is
     * not advisable, as it cannot be filtered against using the `G_MESSAGES_DEBUG`
     * environment variable.
     *
     * For example, GTK+ uses this in its `Makefile.am`:
     * |[
     * AM_CPPFLAGS = -DG_LOG_DOMAIN=\"Gtk\"
     * ]|
     *
     * Applications can choose to leave it as the default null (or `""`)
     * domain. However, defining the domain offers the same advantages as
     * above.
     */
    public const val LOG_DOMAIN: Char = '0'

    /**
     * GLib log levels that are considered fatal by default.
     *
     * This is not used if structured logging is enabled; see
     * [Using Structured Logging][using-structured-logging].
     */
    public const val LOG_FATAL_MASK: Int = 5

    /**
     * Log levels below 1<<G_LOG_LEVEL_USER_SHIFT are used by GLib.
     * Higher bits can be used for user-defined log levels.
     */
    public const val LOG_LEVEL_USER_SHIFT: Int = 8

    /**
     * The major version number of the GLib library.
     *
     * Like #glib_major_version, but from the headers used at
     * application compile time, rather than from the library
     * linked against at application run time.
     */
    public const val MAJOR_VERSION: Int = 2

    /**
     * The maximum value which can be held in a #gint16.
     *
     * @since 2.4
     */
    public const val MAXINT16: Short = 32767

    /**
     * The maximum value which can be held in a #gint32.
     *
     * @since 2.4
     */
    public const val MAXINT32: Int = Int.MAX_VALUE

    /**
     * The maximum value which can be held in a #gint64.
     */
    public const val MAXINT64: Long = Long.MAX_VALUE

    /**
     * The maximum value which can be held in a #guint16.
     *
     * @since 2.4
     */
    public const val MAXUINT16: UShort = 65535u

    /**
     * The maximum value which can be held in a #guint32.
     *
     * @since 2.4
     */
    public const val MAXUINT32: UInt = UInt.MAX_VALUE

    /**
     * The maximum value which can be held in a #guint64.
     */
    public const val MAXUINT64: ULong = ULong.MAX_VALUE

    /**
     * The micro version number of the GLib library.
     *
     * Like #gtk_micro_version, but from the headers used at
     * application compile time, rather than from the library
     * linked against at application run time.
     */
    public const val MICRO_VERSION: Int = 3

    /**
     * The minimum value which can be held in a #gint16.
     *
     * @since 2.4
     */
    public const val MININT16: Short = -32768

    /**
     * The minimum value which can be held in a #gint32.
     *
     * @since 2.4
     */
    public const val MININT32: Int = Int.MIN_VALUE

    /**
     * The minimum value which can be held in a #gint64.
     */
    public const val MININT64: Long = Long.MIN_VALUE

    /**
     * The minor version number of the GLib library.
     *
     * Like #gtk_minor_version, but from the headers used at
     * application compile time, rather than from the library
     * linked against at application run time.
     */
    public const val MINOR_VERSION: Int = 71

    public const val MODULE_SUFFIX: kotlin.String = "so"

    /**
     * If a long option in the main group has this name, it is not treated as a
     * regular option. Instead it collects all non-option arguments which would
     * otherwise be left in `argv`. The option must be of type
     * %G_OPTION_ARG_CALLBACK, %G_OPTION_ARG_STRING_ARRAY
     * or %G_OPTION_ARG_FILENAME_ARRAY.
     *
     *
     * Using %G_OPTION_REMAINING instead of simply scanning `argv`
     * for leftover arguments has the advantage that GOption takes care of
     * necessary encoding conversions for strings or filenames.
     *
     * @since 2.6
     */
    public const val OPTION_REMAINING: kotlin.String = ""

    /**
     * Specifies one of the possible types of byte order
     * (currently unused). See %G_BYTE_ORDER.
     */
    public const val PDP_ENDIAN: Int = 3412

    /**
     * The value of pi (ratio of circle's circumference to its diameter).
     */
    public const val PI: Double = 3.141593

    /**
     * A format specifier that can be used in printf()-style format strings
     * when printing a #GPid.
     *
     * @since 2.50
     */
    public const val PID_FORMAT: kotlin.String = "i"

    /**
     * Pi divided by 2.
     */
    public const val PI_2: Double = 1.570796

    /**
     * Pi divided by 4.
     */
    public const val PI_4: Double = 0.785398

    /**
     * A format specifier that can be used in printf()-style format strings
     * when printing the @fd member of a #GPollFD.
     */
    public const val POLLFD_FORMAT: kotlin.String = "%d"

    /**
     * Use this for default priority event sources.
     *
     * In GLib this priority is used when adding timeout functions
     * with g_timeout_add(). In GDK this priority is used for events
     * from the X server.
     */
    public const val PRIORITY_DEFAULT: Int = 0

    /**
     * Use this for default priority idle functions.
     *
     * In GLib this priority is used when adding idle functions with
     * g_idle_add().
     */
    public const val PRIORITY_DEFAULT_IDLE: Int = 200

    /**
     * Use this for high priority event sources.
     *
     * It is not used within GLib or GTK+.
     */
    public const val PRIORITY_HIGH: Int = -100

    /**
     * Use this for high priority idle functions.
     *
     * GTK+ uses %G_PRIORITY_HIGH_IDLE + 10 for resizing operations,
     * and %G_PRIORITY_HIGH_IDLE + 20 for redrawing operations. (This is
     * done to ensure that any pending resizes are processed before any
     * pending redraws, so that widgets are not redrawn twice unnecessarily.)
     */
    public const val PRIORITY_HIGH_IDLE: Int = 100

    /**
     * Use this for very low priority background tasks.
     *
     * It is not used within GLib or GTK+.
     */
    public const val PRIORITY_LOW: Int = 300

    /**
     * The search path separator character.
     * This is ':' on UNIX machines and ';' under Windows.
     */
    public const val SEARCHPATH_SEPARATOR: Int = 58

    /**
     * The search path separator as a string.
     * This is ":" on UNIX machines and ";" under Windows.
     */
    public const val SEARCHPATH_SEPARATOR_S: kotlin.String = ":"

    public const val SIZEOF_LONG: Int = 8

    public const val SIZEOF_SIZE_T: Int = 8

    public const val SIZEOF_SSIZE_T: Int = 8

    public const val SIZEOF_VOID_P: Int = 8

    /**
     * Use this macro as the return value of a #GSourceFunc to leave
     * the #GSource in the main loop.
     *
     * @since 2.32
     */
    public const val SOURCE_CONTINUE: Boolean = true

    /**
     * Use this macro as the return value of a #GSourceFunc to remove
     * the #GSource from the main loop.
     *
     * @since 2.32
     */
    public const val SOURCE_REMOVE: Boolean = false

    /**
     * The square root of two.
     */
    public const val SQRT2: Double = 1.414214

    /**
     * The standard delimiters, used in g_strdelimit().
     */
    public const val STR_DELIMITERS: kotlin.String = "_-|> <."

    public const val SYSDEF_AF_INET: Int = 2

    public const val SYSDEF_AF_INET6: Int = 10

    public const val SYSDEF_AF_UNIX: Int = 1

    public const val SYSDEF_MSG_DONTROUTE: Int = 4

    public const val SYSDEF_MSG_OOB: Int = 1

    public const val SYSDEF_MSG_PEEK: Int = 2

    /**
     * Creates a unique temporary directory for each unit test and uses
     * g_set_user_dirs() to set XDG directories to point into subdirectories of it
     * for the duration of the unit test. The directory tree is cleaned up after the
     * test finishes successfully. Note that this doesn’t take effect until
     * g_test_run() is called, so calls to (for example) g_get_user_home_dir() will
     * return the system-wide value when made in a test program’s main() function.
     *
     * The following functions will return subdirectories of the temporary directory
     * when this option is used. The specific subdirectory paths in use are not
     * guaranteed to be stable API — always use a getter function to retrieve them.
     *
     *  - g_get_home_dir()
     *  - g_get_user_cache_dir()
     *  - g_get_system_config_dirs()
     *  - g_get_user_config_dir()
     *  - g_get_system_data_dirs()
     *  - g_get_user_data_dir()
     *  - g_get_user_state_dir()
     *  - g_get_user_runtime_dir()
     *
     * The subdirectories may not be created by the test harness; as with normal
     * calls to functions like g_get_user_cache_dir(), the caller must be prepared
     * to create the directory if it doesn’t exist.
     *
     * @since 2.60
     */
    public const val TEST_OPTION_ISOLATE_DIRS: kotlin.String = "isolate_dirs"

    /**
     * Evaluates to a time span of one day.
     *
     * @since 2.26
     */
    public const val TIME_SPAN_DAY: Long = 86400000000

    /**
     * Evaluates to a time span of one hour.
     *
     * @since 2.26
     */
    public const val TIME_SPAN_HOUR: Long = 3600000000

    /**
     * Evaluates to a time span of one millisecond.
     *
     * @since 2.26
     */
    public const val TIME_SPAN_MILLISECOND: Long = 1000

    /**
     * Evaluates to a time span of one minute.
     *
     * @since 2.26
     */
    public const val TIME_SPAN_MINUTE: Long = 60000000

    /**
     * Evaluates to a time span of one second.
     *
     * @since 2.26
     */
    public const val TIME_SPAN_SECOND: Long = 1000000

    /**
     * The maximum length (in codepoints) of a compatibility or canonical
     * decomposition of a single Unicode character.
     *
     * This is as defined by Unicode 6.1.
     *
     * @since 2.32
     */
    public const val UNICHAR_MAX_DECOMPOSITION_LENGTH: Int = 18

    /**
     * Generic delimiters characters as defined in
     * [RFC 3986](https://tools.ietf.org/html/rfc3986). Includes `:/?#[]@`.
     *
     * @since 2.16
     */
    public const val URI_RESERVED_CHARS_GENERIC_DELIMITERS: kotlin.String = ":/?#[]@"

    /**
     * Subcomponent delimiter characters as defined in
     * [RFC 3986](https://tools.ietf.org/html/rfc3986). Includes `!$&'()*+,;=`.
     *
     * @since 2.16
     */
    public const val URI_RESERVED_CHARS_SUBCOMPONENT_DELIMITERS: kotlin.String = "!${'$'}&'()*+,;="

    /**
     * Number of microseconds in one second (1 million).
     * This macro is provided for code readability.
     */
    public const val USEC_PER_SEC: Int = 1000000

    public const val VA_COPY_AS_ARRAY: Int = 1

    /**
     * A macro that should be defined by the user prior to including
     * the glib.h header.
     * The definition should be one of the predefined GLib version
     * macros: %GLIB_VERSION_2_26, %GLIB_VERSION_2_28,...
     *
     * This macro defines the earliest version of GLib that the package is
     * required to be able to compile against.
     *
     * If the compiler is configured to warn about the use of deprecated
     * functions, then using functions that were deprecated in version
     * %GLIB_VERSION_MIN_REQUIRED or earlier will cause warnings (but
     * using functions deprecated in later releases will not).
     *
     * @since 2.32
     */
    public const val VERSION_MIN_REQUIRED: Int = 2

    public const val WIN32_MSG_HANDLE: Int = 19981206

    public const val macro__has_attribute___noreturn__: Int = 0

    /**
     * A wrapper for the POSIX access() function. This function is used to
     * test a pathname for one or several of read, write or execute
     * permissions, or just existence.
     *
     * On Windows, the file protection mechanism is not at all POSIX-like,
     * and the underlying function in the C library only checks the
     * FAT-style READONLY attribute, and does not look at the ACL of a
     * file at all. This function is this in practise almost useless on
     * Windows. Software that needs to handle file permissions on Windows
     * more exactly should use the Win32 API.
     *
     * See your C library manual for more details about access().
     *
     * @param filename a pathname in the GLib file name encoding
     *     (UTF-8 on Windows)
     * @param mode as in access()
     * @return zero if the pathname refers to an existing file system
     *     object that has all the tested permissions, or -1 otherwise
     *     or on error.
     * @since 2.8
     */
    public fun access(
        filename: kotlin.String,
        mode: Int,
    ): Int = g_access(filename, mode)

    /**
     *
     *
     * @param logDomain
     * @param file
     * @param line
     * @param prettyFunction
     * @param expression
     */
    public fun assertWarning(
        logDomain: kotlin.String,
        `file`: kotlin.String,
        line: Int,
        prettyFunction: kotlin.String,
        expression: kotlin.String,
    ): Unit = g_assert_warning(logDomain, `file`, line, prettyFunction, expression)

    /**
     *
     *
     * @param domain
     * @param file
     * @param line
     * @param func
     * @param message
     */
    public fun assertionMessage(
        domain: kotlin.String,
        `file`: kotlin.String,
        line: Int,
        func: kotlin.String,
        message: kotlin.String,
    ): Unit = g_assertion_message(domain, `file`, line, func, message)

    /**
     *
     *
     * @param domain
     * @param file
     * @param line
     * @param func
     * @param expr
     * @param arg1
     * @param cmp
     * @param arg2
     */
    public fun assertionMessageCmpstr(
        domain: kotlin.String,
        `file`: kotlin.String,
        line: Int,
        func: kotlin.String,
        expr: kotlin.String,
        arg1: kotlin.String,
        cmp: kotlin.String,
        arg2: kotlin.String,
    ): Unit = g_assertion_message_cmpstr(domain, `file`, line, func, expr, arg1, cmp, arg2)

    /**
     *
     *
     * @param domain
     * @param file
     * @param line
     * @param func
     * @param expr
     * @param error
     * @param errorDomain
     * @param errorCode
     */
    public fun assertionMessageError(
        domain: kotlin.String,
        `file`: kotlin.String,
        line: Int,
        func: kotlin.String,
        expr: kotlin.String,
        error: Error,
        errorDomain: UInt,
        errorCode: Int,
    ): Unit =
        g_assertion_message_error(
            domain,
            `file`,
            line,
            func,
            expr,
            error.glibErrorPointer,
            errorDomain,
            errorCode
        )

    /**
     * Gets the name of the file without any leading directory
     * components. It returns a pointer into the given file name
     * string.
     *
     * @param fileName the name of the file
     * @return the name of the file without any leading
     *     directory components
     */
    public fun basename(fileName: kotlin.String): kotlin.String =
        g_basename(fileName)?.toKString()
            ?: error("Expected not null string")

    /**
     * Find the position of the first bit set in @mask, searching
     * from (but not including) @nth_bit upwards. Bits are numbered
     * from 0 (least significant) to sizeof(#gulong) * 8 - 1 (31 or 63,
     * usually). To start searching from the 0th bit, set @nth_bit to -1.
     *
     * @param mask a #gulong containing flags
     * @param nthBit the index of the bit to start the search from
     * @return the index of the first bit set which is higher than @nth_bit, or -1
     *    if no higher bits are set
     */
    public fun bitNthLsf(
        mask: ULong,
        nthBit: Int,
    ): Int = g_bit_nth_lsf(mask, nthBit)

    /**
     * Find the position of the first bit set in @mask, searching
     * from (but not including) @nth_bit downwards. Bits are numbered
     * from 0 (least significant) to sizeof(#gulong) * 8 - 1 (31 or 63,
     * usually). To start searching from the last bit, set @nth_bit to
     * -1 or GLIB_SIZEOF_LONG * 8.
     *
     * @param mask a #gulong containing flags
     * @param nthBit the index of the bit to start the search from
     * @return the index of the first bit set which is lower than @nth_bit, or -1
     *    if no lower bits are set
     */
    public fun bitNthMsf(
        mask: ULong,
        nthBit: Int,
    ): Int = g_bit_nth_msf(mask, nthBit)

    /**
     * Gets the number of bits used to hold @number,
     * e.g. if @number is 4, 3 bits are needed.
     *
     * @param number a #guint
     * @return the number of bits used to hold @number
     */
    public fun bitStorage(number: ULong): UInt = g_bit_storage(number)

    public fun bookmarkFileErrorQuark(): UInt = g_bookmark_file_error_quark()

    /**
     * Behaves exactly like g_build_filename(), but takes the path elements
     * as a string array, instead of varargs. This function is mainly
     * meant for language bindings.
     *
     * @param args null-terminated
     *     array of strings containing the path elements.
     * @return a newly-allocated string that
     *     must be freed with g_free().
     * @since 2.8
     */
    public fun buildFilenamev(args: List<kotlin.String>): kotlin.String =
        memScoped {
            return g_build_filenamev(args.toCStringList(this))?.toKString()
                ?: error("Expected not null string")
        }

    /**
     * Behaves exactly like g_build_path(), but takes the path elements
     * as a string array, instead of varargs. This function is mainly
     * meant for language bindings.
     *
     * @param separator a string used to separator the elements of the path.
     * @param args null-terminated
     *     array of strings containing the path elements.
     * @return a newly-allocated string that
     *     must be freed with g_free().
     * @since 2.8
     */
    public fun buildPathv(
        separator: kotlin.String,
        args: List<kotlin.String>,
    ): kotlin.String =
        memScoped {
            return g_build_pathv(separator, args.toCStringList(this))?.toKString()
                ?: error("Expected not null string")
        }

    /**
     * Gets the canonical file name from @filename. All triple slashes are turned into
     * single slashes, and all `..` and `.`s resolved against @relative_to.
     *
     * Symlinks are not followed, and the returned path is guaranteed to be absolute.
     *
     * If @filename is an absolute path, @relative_to is ignored. Otherwise,
     * @relative_to will be prepended to @filename to make it absolute. @relative_to
     * must be an absolute path, or null. If @relative_to is null, it'll fallback
     * to g_get_current_dir().
     *
     * This function never fails, and will canonicalize file paths even if they don't
     * exist.
     *
     * No file system I/O is done.
     *
     * @param filename the name of the file
     * @param relativeTo the relative directory, or null
     * to use the current working directory
     * @return a newly allocated string with the
     * canonical file path
     * @since 2.58
     */
    public fun canonicalizeFilename(
        filename: kotlin.String,
        relativeTo: kotlin.String? = null,
    ): kotlin.String =
        g_canonicalize_filename(filename, relativeTo)?.toKString()
            ?: error("Expected not null string")

    /**
     * A wrapper for the POSIX chdir() function. The function changes the
     * current directory of the process to @path.
     *
     * See your C library manual for more details about chdir().
     *
     * @param path a pathname in the GLib file name encoding
     *     (UTF-8 on Windows)
     * @return 0 on success, -1 if an error occurred.
     * @since 2.8
     */
    public fun chdir(path: kotlin.String): Int = g_chdir(path)

    /**
     * Checks that the GLib library in use is compatible with the
     * given version.
     *
     * Generally you would pass in the constants %GLIB_MAJOR_VERSION,
     * %GLIB_MINOR_VERSION, %GLIB_MICRO_VERSION as the three arguments
     * to this function; that produces a check that the library in use
     * is compatible with the version of GLib the application or module
     * was compiled against.
     *
     * Compatibility is defined by two things: first the version
     * of the running library is newer than the version
     * `@required_major.required_minor.@required_micro`. Second
     * the running library must be binary compatible with the
     * version `@required_major.@required_minor.@required_micro`
     * (same major version.)
     *
     * @param requiredMajor the required major version
     * @param requiredMinor the required minor version
     * @param requiredMicro the required micro version
     * @return null if the GLib library is
     *   compatible with the given version, or a string describing the
     *   version mismatch. The returned string is owned by GLib and must
     *   not be modified or freed.
     * @since 2.6
     */
    public fun checkVersion(
        requiredMajor: UInt,
        requiredMinor: UInt,
        requiredMicro: UInt,
    ): kotlin.String? = glib_check_version(requiredMajor, requiredMinor, requiredMicro)?.toKString()

    /**
     * Gets the length in bytes of digests of type @checksum_type
     *
     * @param checksumType a #GChecksumType
     * @return the checksum length, or -1 if @checksum_type is
     * not supported.
     * @since 2.16
     */
    public fun checksumTypeGetLength(checksumType: ChecksumType): Long =
        g_checksum_type_get_length(checksumType.nativeValue)

    /**
     * If @err or *@err is null, does nothing. Otherwise,
     * calls g_error_free() on *@err and sets *@err to null.
     */
    public fun clearError(): Result<Unit> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_clear_error(gError.ptr)
            return if (gError.pointed != null) {
                Result.failure(org.gtkkn.bindings.glib.Glib.resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * This wraps the close() call; in case of error, %errno will be
     * preserved, but the error will also be stored as a #GError in @error.
     *
     * Besides using #GError, there is another major reason to prefer this
     * function over the call provided by the system; on Unix, it will
     * attempt to correctly handle %EINTR, which has platform-specific
     * semantics.
     *
     * @param fd A file descriptor
     * @return true on success, false if there was an error.
     * @since 2.36
     */
    public fun close(fd: Int): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_close(fd, gError.ptr).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(org.gtkkn.bindings.glib.Glib.resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Computes the checksum for a binary @data. This is a
     * convenience wrapper for g_checksum_new(), g_checksum_get_string()
     * and g_checksum_free().
     *
     * The hexadecimal string returned will be in lower case.
     *
     * @param checksumType a #GChecksumType
     * @param data binary blob to compute the digest of
     * @return the digest of the binary data as a
     *   string in hexadecimal, or null if g_checksum_new() fails for
     *   @checksum_type. The returned string should be freed with g_free() when
     *   done using it.
     * @since 2.34
     */
    public fun computeChecksumForBytes(
        checksumType: ChecksumType,
        `data`: Bytes,
    ): kotlin.String =
        g_compute_checksum_for_bytes(
            checksumType.nativeValue,
            `data`.glibBytesPointer
        )?.toKString() ?: error("Expected not null string")

    /**
     * Computes the checksum of a string.
     *
     * The hexadecimal string returned will be in lower case.
     *
     * @param checksumType a #GChecksumType
     * @param str the string to compute the checksum of
     * @param length the length of the string, or -1 if the string is null-terminated.
     * @return the checksum as a hexadecimal string,
     *   or null if g_checksum_new() fails for @checksum_type. The returned string
     *   should be freed with g_free() when done using it.
     * @since 2.16
     */
    public fun computeChecksumForString(
        checksumType: ChecksumType,
        str: kotlin.String,
        length: Long,
    ): kotlin.String =
        g_compute_checksum_for_string(
            checksumType.nativeValue, str,
            length
        )?.toKString() ?: error("Expected not null string")

    /**
     * Computes the HMAC for a binary @data. This is a
     * convenience wrapper for g_hmac_new(), g_hmac_get_string()
     * and g_hmac_unref().
     *
     * The hexadecimal string returned will be in lower case.
     *
     * @param digestType a #GChecksumType to use for the HMAC
     * @param key the key to use in the HMAC
     * @param data binary blob to compute the HMAC of
     * @return the HMAC of the binary data as a string in hexadecimal.
     *   The returned string should be freed with g_free() when done using it.
     * @since 2.50
     */
    public fun computeHmacForBytes(
        digestType: ChecksumType,
        key: Bytes,
        `data`: Bytes,
    ): kotlin.String =
        g_compute_hmac_for_bytes(
            digestType.nativeValue, key.glibBytesPointer,
            `data`.glibBytesPointer
        )?.toKString() ?: error("Expected not null string")

    public fun convertErrorQuark(): UInt = g_convert_error_quark()

    /**
     * Returns true if the Julian day is valid. Anything greater than zero
     * is basically a valid Julian, though there is a 32-bit limit.
     *
     * @param julianDate Julian day to check
     * @return true if the Julian day is valid
     */
    public fun dateValidJulian(julianDate: UInt): Boolean = g_date_valid_julian(julianDate).asBoolean()

    /**
     * Returns true if the month value is valid. The 12 #GDateMonth
     * enumeration values are the only valid months.
     *
     * @param month month
     * @return true if the month is valid
     */
    public fun dateValidMonth(month: DateMonth): Boolean = g_date_valid_month(month.nativeValue).asBoolean()

    /**
     * Returns true if the weekday is valid. The seven #GDateWeekday enumeration
     * values are the only valid weekdays.
     *
     * @param weekday weekday
     * @return true if the weekday is valid
     */
    public fun dateValidWeekday(weekday: DateWeekday): Boolean = g_date_valid_weekday(weekday.nativeValue).asBoolean()

    /**
     * This is a variant of g_dgettext() that allows specifying a locale
     * category instead of always using `LC_MESSAGES`. See g_dgettext() for
     * more information about how this functions differs from calling
     * dcgettext() directly.
     *
     * @param domain the translation domain to use, or null to use
     *   the domain set with textdomain()
     * @param msgid message to translate
     * @param category a locale category
     * @return the translated string for the given locale category
     * @since 2.26
     */
    public fun dcgettext(
        domain: kotlin.String? = null,
        msgid: kotlin.String,
        category: Int,
    ): kotlin.String =
        g_dcgettext(domain, msgid, category)?.toKString()
            ?: error("Expected not null string")

    /**
     * This function is a wrapper of dgettext() which does not translate
     * the message if the default domain as set with textdomain() has no
     * translations for the current locale.
     *
     * The advantage of using this function over dgettext() proper is that
     * libraries using this function (like GTK+) will not use translations
     * if the application using the library does not have translations for
     * the current locale.  This results in a consistent English-only
     * interface instead of one having partial translations.  For this
     * feature to work, the call to textdomain() and setlocale() should
     * precede any g_dgettext() invocations.  For GTK+, it means calling
     * textdomain() before gtk_init or its variants.
     *
     * This function disables translations if and only if upon its first
     * call all the following conditions hold:
     *
     * - @domain is not null
     *
     * - textdomain() has been called to set a default text domain
     *
     * - there is no translations available for the default text domain
     *   and the current locale
     *
     * - current locale is not "C" or any English locales (those
     *   starting with "en_")
     *
     * Note that this behavior may not be desired for example if an application
     * has its untranslated messages in a language other than English. In those
     * cases the application should call textdomain() after initializing GTK+.
     *
     * Applications should normally not use this function directly,
     * but use the _() macro for translations.
     *
     * @param domain the translation domain to use, or null to use
     *   the domain set with textdomain()
     * @param msgid message to translate
     * @return The translated string
     * @since 2.18
     */
    public fun dgettext(
        domain: kotlin.String? = null,
        msgid: kotlin.String,
    ): kotlin.String = g_dgettext(domain, msgid)?.toKString() ?: error("Expected not null string")

    /**
     * Creates a subdirectory in the preferred directory for temporary
     * files (as returned by g_get_tmp_dir()).
     *
     * @tmpl should be a string in the GLib file name encoding containing
     * a sequence of six 'X' characters, as the parameter to g_mkstemp().
     * However, unlike these functions, the template should only be a
     * basename, no directory components are allowed. If template is
     * null, a default template is used.
     *
     * Note that in contrast to g_mkdtemp() (and mkdtemp()) @tmpl is not
     * modified, and might thus be a read-only literal string.
     *
     * @param tmpl Template for directory name,
     *     as in g_mkdtemp(), basename only, or null for a default template
     * @return The actual name used. This string
     *     should be freed with g_free() when not needed any longer and is
     *     is in the GLib file name encoding. In case of errors, null is
     *     returned and @error will be set.
     * @since 2.30
     */
    public fun dirMakeTmp(tmpl: kotlin.String? = null): Result<kotlin.String> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_dir_make_tmp(tmpl, gError.ptr)?.toKString()
            return if (gError.pointed != null) {
                Result.failure(org.gtkkn.bindings.glib.Glib.resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * This function is a wrapper of dngettext() which does not translate
     * the message if the default domain as set with textdomain() has no
     * translations for the current locale.
     *
     * See g_dgettext() for details of how this differs from dngettext()
     * proper.
     *
     * @param domain the translation domain to use, or null to use
     *   the domain set with textdomain()
     * @param msgid message to translate
     * @param msgidPlural plural form of the message
     * @param n the quantity for which translation is needed
     * @return The translated string
     * @since 2.18
     */
    public fun dngettext(
        domain: kotlin.String? = null,
        msgid: kotlin.String,
        msgidPlural: kotlin.String,
        n: ULong,
    ): kotlin.String =
        g_dngettext(domain, msgid, msgidPlural, n)?.toKString()
            ?: error("Expected not null string")

    /**
     * This function is a variant of g_dgettext() which supports
     * a disambiguating message context. GNU gettext uses the
     * '\004' character to separate the message context and
     * message id in @msgctxtid.
     * If 0 is passed as @msgidoffset, this function will fall back to
     * trying to use the deprecated convention of using "|" as a separation
     * character.
     *
     * This uses g_dgettext() internally. See that functions for differences
     * with dgettext() proper.
     *
     * Applications should normally not use this function directly,
     * but use the C_() macro for translations with context.
     *
     * @param domain the translation domain to use, or null to use
     *   the domain set with textdomain()
     * @param msgctxtid a combined message context and message id, separated
     *   by a \004 character
     * @param msgidoffset the offset of the message id in @msgctxid
     * @return The translated string
     * @since 2.16
     */
    public fun dpgettext(
        domain: kotlin.String? = null,
        msgctxtid: kotlin.String,
        msgidoffset: ULong,
    ): kotlin.String =
        g_dpgettext(domain, msgctxtid, msgidoffset)?.toKString()
            ?: error("Expected not null string")

    /**
     * This function is a variant of g_dgettext() which supports
     * a disambiguating message context. GNU gettext uses the
     * '\004' character to separate the message context and
     * message id in @msgctxtid.
     *
     * This uses g_dgettext() internally. See that functions for differences
     * with dgettext() proper.
     *
     * This function differs from C_() in that it is not a macro and
     * thus you may use non-string-literals as context and msgid arguments.
     *
     * @param domain the translation domain to use, or null to use
     *   the domain set with textdomain()
     * @param context the message context
     * @param msgid the message
     * @return The translated string
     * @since 2.18
     */
    public fun dpgettext2(
        domain: kotlin.String? = null,
        context: kotlin.String,
        msgid: kotlin.String,
    ): kotlin.String =
        g_dpgettext2(domain, context, msgid)?.toKString()
            ?: error("Expected not null string")

    /**
     * Returns the value of the environment variable @variable in the
     * provided list @envp.
     *
     * @param envp
     *     an environment list (eg, as returned from g_get_environ()), or null
     *     for an empty environment list
     * @param variable the environment variable to get
     * @return the value of the environment variable, or null if
     *     the environment variable is not set in @envp. The returned
     *     string is owned by @envp, and will be freed if @variable is
     *     set or unset again.
     * @since 2.32
     */
    public fun environGetenv(
        envp: List<kotlin.String>? = null,
        variable: kotlin.String,
    ): kotlin.String? =
        memScoped {
            return g_environ_getenv(envp?.toCStringList(this), variable)?.toKString()
        }

    /**
     * Sets the environment variable @variable in the provided list
     * @envp to @value.
     *
     * @param envp
     *     an environment list that can be freed using g_strfreev() (e.g., as
     *     returned from g_get_environ()), or null for an empty
     *     environment list
     * @param variable the environment variable to set, must not
     *     contain '='
     * @param value the value for to set the variable to
     * @param overwrite whether to change the variable if it already exists
     * @return
     *     the updated environment list. Free it using g_strfreev().
     * @since 2.32
     */
    public fun environSetenv(
        envp: List<kotlin.String>? = null,
        variable: kotlin.String,
        `value`: kotlin.String,
        overwrite: Boolean,
    ): List<kotlin.String> =
        memScoped {
            return g_environ_setenv(
                envp?.toCStringList(this), variable, `value`,
                overwrite.asGBoolean()
            )?.toKStringList() ?: error("Expected not null string array")
        }

    /**
     * Removes the environment variable @variable from the provided
     * environment @envp.
     *
     * @param envp
     *     an environment list that can be freed using g_strfreev() (e.g., as
     *     returned from g_get_environ()), or null for an empty environment list
     * @param variable the environment variable to remove, must not
     *     contain '='
     * @return
     *     the updated environment list. Free it using g_strfreev().
     * @since 2.32
     */
    public fun environUnsetenv(
        envp: List<kotlin.String>? = null,
        variable: kotlin.String,
    ): List<kotlin.String> =
        memScoped {
            return g_environ_unsetenv(envp?.toCStringList(this), variable)?.toKStringList()
                ?: error("Expected not null string array")
        }

    /**
     * Gets a #GFileError constant based on the passed-in @err_no.
     *
     * For example, if you pass in `EEXIST` this function returns
     * %G_FILE_ERROR_EXIST. Unlike `errno` values, you can portably
     * assume that all #GFileError values will exist.
     *
     * Normally a #GFileError value goes into a #GError returned
     * from a function that manipulates files. So you would use
     * g_file_error_from_errno() when constructing a #GError.
     *
     * @param errNo an "errno" value
     * @return #GFileError corresponding to the given @err_no
     */
    public fun fileErrorFromErrno(errNo: Int): FileError =
        g_file_error_from_errno(errNo).run {
            FileError.fromNativeValue(this)
        }

    public fun fileErrorQuark(): UInt = g_file_error_quark()

    /**
     * Reads the contents of the symbolic link @filename like the POSIX
     * readlink() function.  The returned string is in the encoding used
     * for filenames. Use g_filename_to_utf8() to convert it to UTF-8.
     *
     * @param filename the symbolic link
     * @return A newly-allocated string with
     *     the contents of the symbolic link, or null if an error occurred.
     * @since 2.4
     */
    public fun fileReadLink(filename: kotlin.String): Result<kotlin.String> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_file_read_link(filename, gError.ptr)?.toKString()
            return if (gError.pointed != null) {
                Result.failure(org.gtkkn.bindings.glib.Glib.resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * Returns true if any of the tests in the bitfield @test are
     * true. For example, `(G_FILE_TEST_EXISTS | G_FILE_TEST_IS_DIR)`
     * will return true if the file exists; the check whether it's a
     * directory doesn't matter since the existence test is true. With
     * the current set of available tests, there's no point passing in
     * more than one test at a time.
     *
     * Apart from %G_FILE_TEST_IS_SYMLINK all tests follow symbolic links,
     * so for a symbolic link to a regular file g_file_test() will return
     * true for both %G_FILE_TEST_IS_SYMLINK and %G_FILE_TEST_IS_REGULAR.
     *
     * Note, that for a dangling symbolic link g_file_test() will return
     * true for %G_FILE_TEST_IS_SYMLINK and false for all other flags.
     *
     * You should never use g_file_test() to test whether it is safe
     * to perform an operation, because there is always the possibility
     * of the condition changing before you actually perform the operation.
     * For example, you might think you could use %G_FILE_TEST_IS_SYMLINK
     * to know whether it is safe to write to a file without being
     * tricked into writing into a different location. It doesn't work!
     * |[<!-- language="C" -->
     *  // DON'T DO THIS
     *  if (!g_file_test (filename, G_FILE_TEST_IS_SYMLINK))
     *    {
     *      fd = g_open (filename, O_WRONLY);
     *      // write to fd
     *    }
     * ]|
     *
     * Another thing to note is that %G_FILE_TEST_EXISTS and
     * %G_FILE_TEST_IS_EXECUTABLE are implemented using the access()
     * system call. This usually doesn't matter, but if your program
     * is setuid or setgid it means that these tests will give you
     * the answer for the real user ID and group ID, rather than the
     * effective user ID and group ID.
     *
     * On Windows, there are no symlinks, so testing for
     * %G_FILE_TEST_IS_SYMLINK will always return false. Testing for
     * %G_FILE_TEST_IS_EXECUTABLE will just check that the file exists and
     * its name indicates that it is executable, checking for well-known
     * extensions and those listed in the `PATHEXT` environment variable.
     *
     * @param filename a filename to test in the
     *     GLib file name encoding
     * @param test bitfield of #GFileTest flags
     * @return whether a test was true
     */
    public fun fileTest(
        filename: kotlin.String,
        test: FileTest,
    ): Boolean =
        g_file_test(
            filename,
            test.mask
        ).asBoolean()

    /**
     * Returns the display basename for the particular filename, guaranteed
     * to be valid UTF-8. The display name might not be identical to the filename,
     * for instance there might be problems converting it to UTF-8, and some files
     * can be translated in the display.
     *
     * If GLib cannot make sense of the encoding of @filename, as a last resort it
     * replaces unknown characters with U+FFFD, the Unicode replacement character.
     * You can search the result for the UTF-8 encoding of this character (which is
     * "\357\277\275" in octal notation) to find out if @filename was in an invalid
     * encoding.
     *
     * You must pass the whole absolute pathname to this functions so that
     * translation of well known locations can be done.
     *
     * This function is preferred over g_filename_display_name() if you know the
     * whole path, as it allows translation.
     *
     * @param filename an absolute pathname in the
     *     GLib file name encoding
     * @return a newly allocated string containing
     *   a rendition of the basename of the filename in valid UTF-8
     * @since 2.6
     */
    public fun filenameDisplayBasename(filename: kotlin.String): kotlin.String =
        g_filename_display_basename(filename)?.toKString() ?: error("Expected not null string")

    /**
     * Converts a filename into a valid UTF-8 string. The conversion is
     * not necessarily reversible, so you should keep the original around
     * and use the return value of this function only for display purposes.
     * Unlike g_filename_to_utf8(), the result is guaranteed to be non-null
     * even if the filename actually isn't in the GLib file name encoding.
     *
     * If GLib cannot make sense of the encoding of @filename, as a last resort it
     * replaces unknown characters with U+FFFD, the Unicode replacement character.
     * You can search the result for the UTF-8 encoding of this character (which is
     * "\357\277\275" in octal notation) to find out if @filename was in an invalid
     * encoding.
     *
     * If you know the whole pathname of the file you should use
     * g_filename_display_basename(), since that allows location-based
     * translation of filenames.
     *
     * @param filename a pathname hopefully in the
     *     GLib file name encoding
     * @return a newly allocated string containing
     *   a rendition of the filename in valid UTF-8
     * @since 2.6
     */
    public fun filenameDisplayName(filename: kotlin.String): kotlin.String =
        g_filename_display_name(filename)?.toKString() ?: error("Expected not null string")

    /**
     * Converts an absolute filename to an escaped ASCII-encoded URI, with the path
     * component following Section 3.3. of RFC 2396.
     *
     * @param filename an absolute filename specified in the GLib file
     *     name encoding, which is the on-disk file name bytes on Unix, and UTF-8
     *     on Windows
     * @param hostname A UTF-8 encoded hostname, or null for none.
     * @return a newly-allocated string holding the resulting
     *               URI, or null on an error.
     */
    public fun filenameToUri(
        filename: kotlin.String,
        hostname: kotlin.String? = null,
    ): Result<kotlin.String> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_filename_to_uri(filename, hostname, gError.ptr)?.toKString()
            return if (gError.pointed != null) {
                Result.failure(org.gtkkn.bindings.glib.Glib.resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * Locates the first executable named @program in the user's path, in the
     * same way that execvp() would locate it. Returns an allocated string
     * with the absolute path name, or null if the program is not found in
     * the path. If @program is already an absolute path, returns a copy of
     * @program if @program exists and is executable, and null otherwise.
     *
     * On Windows, if @program does not have a file type suffix, tries
     * with the suffixes .exe, .cmd, .bat and .com, and the suffixes in
     * the `PATHEXT` environment variable.
     *
     * On Windows, it looks for the file in the same way as CreateProcess()
     * would. This means first in the directory where the executing
     * program was loaded from, then in the current directory, then in the
     * Windows 32-bit system directory, then in the Windows directory, and
     * finally in the directories in the `PATH` environment variable. If
     * the program is found, the return value contains the full name
     * including the type suffix.
     *
     * @param program a program name in the GLib file name encoding
     * @return a newly-allocated
     *   string with the absolute path, or null
     */
    public fun findProgramInPath(program: kotlin.String): kotlin.String =
        g_find_program_in_path(program)?.toKString() ?: error("Expected not null string")

    /**
     * Formats a size (for example the size of a file) into a human readable
     * string.  Sizes are rounded to the nearest size prefix (kB, MB, GB)
     * and are displayed rounded to the nearest tenth. E.g. the file size
     * 3292528 bytes will be converted into the string "3.2 MB". The returned string
     * is UTF-8, and may use a non-breaking space to separate the number and units,
     * to ensure they aren’t separated when line wrapped.
     *
     * The prefix units base is 1000 (i.e. 1 kB is 1000 bytes).
     *
     * This string should be freed with g_free() when not needed any longer.
     *
     * See g_format_size_full() for more options about how the size might be
     * formatted.
     *
     * @param size a size in bytes
     * @return a newly-allocated formatted string containing
     *   a human readable file size
     * @since 2.30
     */
    public fun formatSize(size: ULong): kotlin.String =
        g_format_size(size)?.toKString()
            ?: error("Expected not null string")

    /**
     * Formats a size (for example the size of a file) into a human
     * readable string. Sizes are rounded to the nearest size prefix
     * (KB, MB, GB) and are displayed rounded to the nearest tenth.
     * E.g. the file size 3292528 bytes will be converted into the
     * string "3.1 MB".
     *
     * The prefix units base is 1024 (i.e. 1 KB is 1024 bytes).
     *
     * This string should be freed with g_free() when not needed any longer.
     *
     * @param size a size in bytes
     * @return a newly-allocated formatted string
     *   containing a human readable file size
     * @since 2.16
     */
    public fun formatSizeForDisplay(size: Long): kotlin.String =
        g_format_size_for_display(size)?.toKString() ?: error("Expected not null string")

    /**
     * Formats a size.
     *
     * This function is similar to g_format_size() but allows for flags
     * that modify the output. See #GFormatSizeFlags.
     *
     * @param size a size in bytes
     * @param flags #GFormatSizeFlags to modify the output
     * @return a newly-allocated formatted string
     *   containing a human readable file size
     * @since 2.30
     */
    public fun formatSizeFull(
        size: ULong,
        flags: FormatSizeFlags,
    ): kotlin.String = g_format_size_full(size, flags.mask)?.toKString() ?: error("Expected not null string")

    /**
     * Gets a human-readable name for the application, as set by
     * g_set_application_name(). This name should be localized if
     * possible, and is intended for display to the user.  Contrast with
     * g_get_prgname(), which gets a non-localized name. If
     * g_set_application_name() has not been called, returns the result of
     * g_get_prgname() (which may be null if g_set_prgname() has also not
     * been called).
     *
     * @return human-readable application
     *   name. May return null
     * @since 2.2
     */
    public fun getApplicationName(): kotlin.String? = g_get_application_name()?.toKString()

    /**
     * Gets the character set for the current locale.
     *
     * @return a newly allocated string containing the name
     *     of the character set. This string must be freed with g_free().
     */
    public fun getCodeset(): kotlin.String =
        g_get_codeset()?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the current directory.
     *
     * The returned string should be freed when no longer needed.
     * The encoding of the returned string is system defined.
     * On Windows, it is always UTF-8.
     *
     * Since GLib 2.40, this function will return the value of the "PWD"
     * environment variable if it is set and it happens to be the same as
     * the current directory.  This can make a difference in the case that
     * the current directory is the target of a symbolic link.
     *
     * @return the current directory
     */
    public fun getCurrentDir(): kotlin.String =
        g_get_current_dir()?.toKString()
            ?: error("Expected not null string")

    /**
     * Equivalent to the UNIX gettimeofday() function, but portable.
     *
     * You may find g_get_real_time() to be more convenient.
     *
     * @param result #GTimeVal structure in which to store current time.
     */
    public fun getCurrentTime(result: TimeVal): Unit = g_get_current_time(result.glibTimeValPointer)

    /**
     * Gets the list of environment variables for the current process.
     *
     * The list is null terminated and each item in the list is of the
     * form 'NAME=VALUE'.
     *
     * This is equivalent to direct access to the 'environ' global variable,
     * except portable.
     *
     * The return value is freshly allocated and it should be freed with
     * g_strfreev() when it is no longer needed.
     *
     * @return
     *     the list of environment variables
     * @since 2.28
     */
    public fun getEnviron(): List<kotlin.String> =
        g_get_environ()?.toKStringList()
            ?: error("Expected not null string array")

    /**
     * Gets the current user's home directory.
     *
     * As with most UNIX tools, this function will return the value of the
     * `HOME` environment variable if it is set to an existing absolute path
     * name, falling back to the `passwd` file in the case that it is unset.
     *
     * If the path given in `HOME` is non-absolute, does not exist, or is
     * not a directory, the result is undefined.
     *
     * Before version 2.36 this function would ignore the `HOME` environment
     * variable, taking the value from the `passwd` database instead. This was
     * changed to increase the compatibility of GLib with other programs (and
     * the XDG basedir specification) and to increase testability of programs
     * based on GLib (by making it easier to run them from test frameworks).
     *
     * If your program has a strong requirement for either the new or the
     * old behaviour (and if you don't wish to increase your GLib
     * dependency to ensure that the new behaviour is in effect) then you
     * should either directly check the `HOME` environment variable yourself
     * or unset it before calling any functions in GLib.
     *
     * @return the current user's home directory
     */
    public fun getHomeDir(): kotlin.String =
        g_get_home_dir()?.toKString()
            ?: error("Expected not null string")

    /**
     * Return a name for the machine.
     *
     * The returned name is not necessarily a fully-qualified domain name,
     * or even present in DNS or some other name service at all. It need
     * not even be unique on your local network or site, but usually it
     * is. Callers should not rely on the return value having any specific
     * properties like uniqueness for security purposes. Even if the name
     * of the machine is changed while an application is running, the
     * return value from this function does not change. The returned
     * string is owned by GLib and should not be modified or freed. If no
     * name can be determined, a default fixed string "localhost" is
     * returned.
     *
     * The encoding of the returned string is UTF-8.
     *
     * @return the host name of the machine.
     * @since 2.8
     */
    public fun getHostName(): kotlin.String =
        g_get_host_name()?.toKString()
            ?: error("Expected not null string")

    /**
     * Computes a list of applicable locale names, which can be used to
     * e.g. construct locale-dependent filenames or search paths. The returned
     * list is sorted from most desirable to least desirable and always contains
     * the default locale "C".
     *
     * For example, if LANGUAGE=de:en_US, then the returned list is
     * "de", "en_US", "en", "C".
     *
     * This function consults the environment variables `LANGUAGE`, `LC_ALL`,
     * `LC_MESSAGES` and `LANG` to find the list of locales specified by the
     * user.
     *
     * @return a null-terminated array of strings owned by GLib
     *    that must not be modified or freed.
     * @since 2.6
     */
    public fun getLanguageNames(): List<kotlin.String> =
        g_get_language_names()?.toKStringList()
            ?: error("Expected not null string array")

    /**
     * Computes a list of applicable locale names with a locale category name,
     * which can be used to construct the fallback locale-dependent filenames
     * or search paths. The returned list is sorted from most desirable to
     * least desirable and always contains the default locale "C".
     *
     * This function consults the environment variables `LANGUAGE`, `LC_ALL`,
     * @category_name, and `LANG` to find the list of locales specified by the
     * user.
     *
     * g_get_language_names() returns g_get_language_names_with_category("LC_MESSAGES").
     *
     * @param categoryName a locale category name
     * @return a null-terminated array of strings owned by
     *    the thread g_get_language_names_with_category was called from.
     *    It must not be modified or freed. It must be copied if planned to be used in another
     * thread.
     * @since 2.58
     */
    public fun getLanguageNamesWithCategory(categoryName: kotlin.String): List<kotlin.String> =
        g_get_language_names_with_category(categoryName)?.toKStringList()
            ?: error("Expected not null string array")

    /**
     * Returns a list of derived variants of @locale, which can be used to
     * e.g. construct locale-dependent filenames or search paths. The returned
     * list is sorted from most desirable to least desirable.
     * This function handles territory, charset and extra locale modifiers. See
     * [`setlocale(3)`](man:setlocale) for information about locales and their format.
     *
     * @locale itself is guaranteed to be returned in the output.
     *
     * For example, if @locale is `fr_BE`, then the returned list
     * is `fr_BE`, `fr`. If @locale is `en_GB.UTF-8@euro`, then the returned list
     * is `en_GB.UTF-8@euro`, `en_GB.UTF-8`, `en_GB@euro`, `en_GB`, `en.UTF-8@euro`,
     * `en.UTF-8`, `en@euro`, `en`.
     *
     * If you need the list of variants for the current locale,
     * use g_get_language_names().
     *
     * @param locale a locale identifier
     * @return a newly
     *   allocated array of newly allocated strings with the locale variants. Free with
     *   g_strfreev().
     * @since 2.28
     */
    public fun getLocaleVariants(locale: kotlin.String): List<kotlin.String> =
        g_get_locale_variants(locale)?.toKStringList()
            ?: error("Expected not null string array")

    /**
     * Queries the system monotonic time.
     *
     * The monotonic clock will always increase and doesn't suffer
     * discontinuities when the user (or NTP) changes the system time.  It
     * may or may not continue to tick during times where the machine is
     * suspended.
     *
     * We try to use the clock that corresponds as closely as possible to
     * the passage of time as measured by system calls such as poll() but it
     * may not always be possible to do this.
     *
     * @return the monotonic time, in microseconds
     * @since 2.28
     */
    public fun getMonotonicTime(): Long = g_get_monotonic_time()

    /**
     * Determine the approximate number of threads that the system will
     * schedule simultaneously for this process.  This is intended to be
     * used as a parameter to g_thread_pool_new() for CPU bound tasks and
     * similar cases.
     *
     * @return Number of schedulable threads, always greater than 0
     * @since 2.36
     */
    public fun getNumProcessors(): UInt = g_get_num_processors()

    /**
     * Get information about the operating system.
     *
     * On Linux this comes from the `/etc/os-release` file. On other systems, it may
     * come from a variety of sources. You can either use the standard key names
     * like %G_OS_INFO_KEY_NAME or pass any UTF-8 string key name. For example,
     * `/etc/os-release` provides a number of other less commonly used values that may
     * be useful. No key is guaranteed to be provided, so the caller should always
     * check if the result is null.
     *
     * @param keyName a key for the OS info being requested, for example %G_OS_INFO_KEY_NAME.
     * @return The associated value for the requested key or null if
     *   this information is not provided.
     * @since 2.64
     */
    public fun getOsInfo(keyName: kotlin.String): kotlin.String =
        g_get_os_info(keyName)?.toKString() ?: error("Expected not null string")

    /**
     * Gets the name of the program. This name should not be localized,
     * in contrast to g_get_application_name().
     *
     * If you are using #GApplication the program name is set in
     * g_application_run(). In case of GDK or GTK+ it is set in
     * gdk_init(), which is called by gtk_init() and the
     * #GtkApplication::startup handler. The program name is found by
     * taking the last component of @argv[0].
     *
     * @return the name of the program,
     *   or null if it has not been set yet. The returned string belongs
     *   to GLib and must not be modified or freed.
     */
    public fun getPrgname(): kotlin.String? = g_get_prgname()?.toKString()

    /**
     * Gets the real name of the user. This usually comes from the user's
     * entry in the `passwd` file. The encoding of the returned string is
     * system-defined. (On Windows, it is, however, always UTF-8.) If the
     * real user name cannot be determined, the string "Unknown" is
     * returned.
     *
     * @return the user's real name.
     */
    public fun getRealName(): kotlin.String =
        g_get_real_name()?.toKString()
            ?: error("Expected not null string")

    /**
     * Queries the system wall-clock time.
     *
     * This call is functionally equivalent to g_get_current_time() except
     * that the return value is often more convenient than dealing with a
     * #GTimeVal.
     *
     * You should only use this call if you are actually interested in the real
     * wall-clock time.  g_get_monotonic_time() is probably more useful for
     * measuring intervals.
     *
     * @return the number of microseconds since January 1, 1970 UTC.
     * @since 2.28
     */
    public fun getRealTime(): Long = g_get_real_time()

    /**
     * Returns an ordered list of base directories in which to access
     * system-wide configuration information.
     *
     * On UNIX platforms this is determined using the mechanisms described
     * in the
     * [XDG Base Directory Specification](http://www.freedesktop.org/Standards/basedir-spec).
     * In this case the list of directories retrieved will be `XDG_CONFIG_DIRS`.
     *
     * On Windows it follows XDG Base Directory Specification if `XDG_CONFIG_DIRS` is defined.
     * If `XDG_CONFIG_DIRS` is undefined, the directory that contains application
     * data for all users is used instead. A typical path is
     * `C:\Documents and Settings\All Users\Application Data`.
     * This folder is used for application data
     * that is not user specific. For example, an application can store
     * a spell-check dictionary, a database of clip art, or a log file in the
     * FOLDERID_ProgramData folder. This information will not roam and is available
     * to anyone using the computer.
     *
     * The return value is cached and modifying it at runtime is not supported, as
     * it’s not thread-safe to modify environment variables at runtime.
     *
     * @return
     *     a null-terminated array of strings owned by GLib that must not be
     *     modified or freed.
     * @since 2.6
     */
    public fun getSystemConfigDirs(): List<kotlin.String> =
        g_get_system_config_dirs()?.toKStringList() ?: error("Expected not null string array")

    /**
     * Returns an ordered list of base directories in which to access
     * system-wide application data.
     *
     * On UNIX platforms this is determined using the mechanisms described
     * in the
     * [XDG Base Directory Specification](http://www.freedesktop.org/Standards/basedir-spec)
     * In this case the list of directories retrieved will be `XDG_DATA_DIRS`.
     *
     * On Windows it follows XDG Base Directory Specification if `XDG_DATA_DIRS` is defined.
     * If `XDG_DATA_DIRS` is undefined,
     * the first elements in the list are the Application Data
     * and Documents folders for All Users. (These can be determined only
     * on Windows 2000 or later and are not present in the list on other
     * Windows versions.) See documentation for FOLDERID_ProgramData and
     * FOLDERID_PublicDocuments.
     *
     * Then follows the "share" subfolder in the installation folder for
     * the package containing the DLL that calls this function, if it can
     * be determined.
     *
     * Finally the list contains the "share" subfolder in the installation
     * folder for GLib, and in the installation folder for the package the
     * application's .exe file belongs to.
     *
     * The installation folders above are determined by looking up the
     * folder where the module (DLL or EXE) in question is located. If the
     * folder's name is "bin", its parent is used, otherwise the folder
     * itself.
     *
     * Note that on Windows the returned list can vary depending on where
     * this function is called.
     *
     * The return value is cached and modifying it at runtime is not supported, as
     * it’s not thread-safe to modify environment variables at runtime.
     *
     * @return
     *     a null-terminated array of strings owned by GLib that must not be
     *     modified or freed.
     * @since 2.6
     */
    public fun getSystemDataDirs(): List<kotlin.String> =
        g_get_system_data_dirs()?.toKStringList()
            ?: error("Expected not null string array")

    /**
     * Gets the directory to use for temporary files.
     *
     * On UNIX, this is taken from the `TMPDIR` environment variable.
     * If the variable is not set, `P_tmpdir` is
     * used, as defined by the system C library. Failing that, a
     * hard-coded default of "/tmp" is returned.
     *
     * On Windows, the `TEMP` environment variable is used, with the
     * root directory of the Windows installation (eg: "C:\") used
     * as a default.
     *
     * The encoding of the returned string is system-defined. On Windows,
     * it is always UTF-8. The return value is never null or the empty
     * string.
     *
     * @return the directory to use for temporary files.
     */
    public fun getTmpDir(): kotlin.String =
        g_get_tmp_dir()?.toKString()
            ?: error("Expected not null string")

    /**
     * Returns a base directory in which to store non-essential, cached
     * data specific to particular user.
     *
     * On UNIX platforms this is determined using the mechanisms described
     * in the
     * [XDG Base Directory Specification](http://www.freedesktop.org/Standards/basedir-spec).
     * In this case the directory retrieved will be `XDG_CACHE_HOME`.
     *
     * On Windows it follows XDG Base Directory Specification if `XDG_CACHE_HOME` is defined.
     * If `XDG_CACHE_HOME` is undefined, the directory that serves as a common
     * repository for temporary Internet files is used instead. A typical path is
     * `C:\Documents and Settings\username\Local Settings\Temporary Internet Files`.
     * See the [documentation for
     * `FOLDERID_InternetCache`](https://docs.microsoft.com/en-us/windows/win32/shell/knownfolderid).
     *
     * The return value is cached and modifying it at runtime is not supported, as
     * it’s not thread-safe to modify environment variables at runtime.
     *
     * @return a string owned by GLib that
     *   must not be modified or freed.
     * @since 2.6
     */
    public fun getUserCacheDir(): kotlin.String =
        g_get_user_cache_dir()?.toKString()
            ?: error("Expected not null string")

    /**
     * Returns a base directory in which to store user-specific application
     * configuration information such as user preferences and settings.
     *
     * On UNIX platforms this is determined using the mechanisms described
     * in the
     * [XDG Base Directory Specification](http://www.freedesktop.org/Standards/basedir-spec).
     * In this case the directory retrieved will be `XDG_CONFIG_HOME`.
     *
     * On Windows it follows XDG Base Directory Specification if `XDG_CONFIG_HOME` is defined.
     * If `XDG_CONFIG_HOME` is undefined, the folder to use for local (as opposed
     * to roaming) application data is used instead. See the
     * [documentation for
     * `FOLDERID_LocalAppData`](https://docs.microsoft.com/en-us/windows/win32/shell/knownfolderid).
     * Note that in this case on Windows it will be  the same
     * as what g_get_user_data_dir() returns.
     *
     * The return value is cached and modifying it at runtime is not supported, as
     * it’s not thread-safe to modify environment variables at runtime.
     *
     * @return a string owned by GLib that
     *   must not be modified or freed.
     * @since 2.6
     */
    public fun getUserConfigDir(): kotlin.String =
        g_get_user_config_dir()?.toKString()
            ?: error("Expected not null string")

    /**
     * Returns a base directory in which to access application data such
     * as icons that is customized for a particular user.
     *
     * On UNIX platforms this is determined using the mechanisms described
     * in the
     * [XDG Base Directory Specification](http://www.freedesktop.org/Standards/basedir-spec).
     * In this case the directory retrieved will be `XDG_DATA_HOME`.
     *
     * On Windows it follows XDG Base Directory Specification if `XDG_DATA_HOME`
     * is defined. If `XDG_DATA_HOME` is undefined, the folder to use for local (as
     * opposed to roaming) application data is used instead. See the
     * [documentation for
     * `FOLDERID_LocalAppData`](https://docs.microsoft.com/en-us/windows/win32/shell/knownfolderid).
     * Note that in this case on Windows it will be the same
     * as what g_get_user_config_dir() returns.
     *
     * The return value is cached and modifying it at runtime is not supported, as
     * it’s not thread-safe to modify environment variables at runtime.
     *
     * @return a string owned by GLib that must
     *   not be modified or freed.
     * @since 2.6
     */
    public fun getUserDataDir(): kotlin.String =
        g_get_user_data_dir()?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the user name of the current user. The encoding of the returned
     * string is system-defined. On UNIX, it might be the preferred file name
     * encoding, or something else, and there is no guarantee that it is even
     * consistent on a machine. On Windows, it is always UTF-8.
     *
     * @return the user name of the current user.
     */
    public fun getUserName(): kotlin.String =
        g_get_user_name()?.toKString()
            ?: error("Expected not null string")

    /**
     * Returns a directory that is unique to the current user on the local
     * system.
     *
     * This is determined using the mechanisms described
     * in the
     * [XDG Base Directory Specification](http://www.freedesktop.org/Standards/basedir-spec).
     * This is the directory
     * specified in the `XDG_RUNTIME_DIR` environment variable.
     * In the case that this variable is not set, we return the value of
     * g_get_user_cache_dir(), after verifying that it exists.
     *
     * The return value is cached and modifying it at runtime is not supported, as
     * it’s not thread-safe to modify environment variables at runtime.
     *
     * @return a string owned by GLib that must not be
     *     modified or freed.
     * @since 2.28
     */
    public fun getUserRuntimeDir(): kotlin.String =
        g_get_user_runtime_dir()?.toKString()
            ?: error("Expected not null string")

    /**
     * Returns the full path of a special directory using its logical id.
     *
     * On UNIX this is done using the XDG special user directories.
     * For compatibility with existing practise, %G_USER_DIRECTORY_DESKTOP
     * falls back to `$HOME/Desktop` when XDG special user directories have
     * not been set up.
     *
     * Depending on the platform, the user might be able to change the path
     * of the special directory without requiring the session to restart; GLib
     * will not reflect any change once the special directories are loaded.
     *
     * @param directory the logical id of special directory
     * @return the path to the specified special
     *   directory, or null if the logical id was not found. The returned string is
     *   owned by GLib and should not be modified or freed.
     * @since 2.14
     */
    public fun getUserSpecialDir(directory: UserDirectory): kotlin.String? =
        g_get_user_special_dir(directory.nativeValue)?.toKString()

    /**
     * Returns a base directory in which to store state files specific to
     * particular user.
     *
     * On UNIX platforms this is determined using the mechanisms described
     * in the
     * [XDG Base Directory Specification](http://www.freedesktop.org/Standards/basedir-spec).
     * In this case the directory retrieved will be `XDG_STATE_HOME`.
     *
     * On Windows it follows XDG Base Directory Specification if `XDG_STATE_HOME` is defined.
     * If `XDG_STATE_HOME` is undefined, the folder to use for local (as opposed
     * to roaming) application data is used instead. See the
     * [documentation for
     * `FOLDERID_LocalAppData`](https://docs.microsoft.com/en-us/windows/win32/shell/knownfolderid).
     * Note that in this case on Windows it will be the same
     * as what g_get_user_data_dir() returns.
     *
     * The return value is cached and modifying it at runtime is not supported, as
     * it’s not thread-safe to modify environment variables at runtime.
     *
     * @return a string owned by GLib that
     *   must not be modified or freed.
     * @since 2.72
     */
    public fun getUserStateDir(): kotlin.String =
        g_get_user_state_dir()?.toKString()
            ?: error("Expected not null string")

    /**
     * Returns the value of an environment variable.
     *
     * On UNIX, the name and value are byte strings which might or might not
     * be in some consistent character set and encoding. On Windows, they are
     * in UTF-8.
     * On Windows, in case the environment variable's value contains
     * references to other environment variables, they are expanded.
     *
     * @param variable the environment variable to get
     * @return the value of the environment variable, or null if
     *     the environment variable is not found. The returned string
     *     may be overwritten by the next call to g_getenv(), g_setenv()
     *     or g_unsetenv().
     */
    public fun getenv(variable: kotlin.String): kotlin.String? = g_getenv(variable)?.toKString()

    /**
     * Destroys all keys and values in the #GHashTable and decrements its
     * reference count by 1. If keys and/or values are dynamically allocated,
     * you should either free them first or create the #GHashTable with destroy
     * notifiers using g_hash_table_new_full(). In the latter case the destroy
     * functions you supplied will be called on all keys and values during the
     * destruction phase.
     *
     * @param hashTable a #GHashTable
     */
    public fun hashTableDestroy(hashTable: HashTable): Unit = g_hash_table_destroy(hashTable.glibHashTablePointer)

    /**
     * Creates a new #GHashTable like g_hash_table_new_full() with a reference
     * count of 1.
     *
     * It inherits the hash function, the key equal function, the key destroy function,
     * as well as the value destroy function, from @other_hash_table.
     *
     * The returned hash table will be empty; it will not contain the keys
     * or values from @other_hash_table.
     *
     * @param otherHashTable Another #GHashTable
     * @return a new #GHashTable
     * @since 2.72
     */
    public fun hashTableNewSimilar(otherHashTable: HashTable): HashTable =
        g_hash_table_new_similar(otherHashTable.glibHashTablePointer)!!.run {
            HashTable(reinterpret())
        }

    /**
     * Removes all keys and their associated values from a #GHashTable.
     *
     * If the #GHashTable was created using g_hash_table_new_full(),
     * the keys and values are freed using the supplied destroy functions,
     * otherwise you have to make sure that any dynamically allocated
     * values are freed yourself.
     *
     * @param hashTable a #GHashTable
     * @since 2.12
     */
    public fun hashTableRemoveAll(hashTable: HashTable): Unit = g_hash_table_remove_all(hashTable.glibHashTablePointer)

    /**
     * Returns the number of elements contained in the #GHashTable.
     *
     * @param hashTable a #GHashTable
     * @return the number of key/value pairs in the #GHashTable.
     */
    public fun hashTableSize(hashTable: HashTable): UInt = g_hash_table_size(hashTable.glibHashTablePointer)

    /**
     * Removes all keys and their associated values from a #GHashTable
     * without calling the key and value destroy functions.
     *
     * @param hashTable a #GHashTable
     * @since 2.12
     */
    public fun hashTableStealAll(hashTable: HashTable): Unit = g_hash_table_steal_all(hashTable.glibHashTablePointer)

    /**
     * Atomically decrements the reference count of @hash_table by one.
     * If the reference count drops to 0, all keys and values will be
     * destroyed, and all memory allocated by the hash table is released.
     * This function is MT-safe and may be called from any thread.
     *
     * @param hashTable a valid #GHashTable
     * @since 2.10
     */
    public fun hashTableUnref(hashTable: HashTable): Unit = g_hash_table_unref(hashTable.glibHashTablePointer)

    /**
     * Destroys a #GHook, given its ID.
     *
     * @param hookList a #GHookList
     * @param hookId a hook ID
     * @return true if the #GHook was found in the #GHookList and destroyed
     */
    public fun hookDestroy(
        hookList: HookList,
        hookId: ULong,
    ): Boolean = g_hook_destroy(hookList.glibHookListPointer, hookId).asBoolean()

    /**
     * Removes one #GHook from a #GHookList, marking it
     * inactive and calling g_hook_unref() on it.
     *
     * @param hookList a #GHookList
     * @param hook the #GHook to remove
     */
    public fun hookDestroyLink(
        hookList: HookList,
        hook: Hook,
    ): Unit = g_hook_destroy_link(hookList.glibHookListPointer, hook.glibHookPointer)

    /**
     * Calls the #GHookList @finalize_hook function if it exists,
     * and frees the memory allocated for the #GHook.
     *
     * @param hookList a #GHookList
     * @param hook the #GHook to free
     */
    public fun hookFree(
        hookList: HookList,
        hook: Hook,
    ): Unit = g_hook_free(hookList.glibHookListPointer, hook.glibHookPointer)

    /**
     * Inserts a #GHook into a #GHookList, before a given #GHook.
     *
     * @param hookList a #GHookList
     * @param sibling the #GHook to insert the new #GHook before
     * @param hook the #GHook to insert
     */
    public fun hookInsertBefore(
        hookList: HookList,
        sibling: Hook? = null,
        hook: Hook,
    ): Unit =
        g_hook_insert_before(
            hookList.glibHookListPointer,
            sibling?.glibHookPointer,
            hook.glibHookPointer
        )

    /**
     * Prepends a #GHook on the start of a #GHookList.
     *
     * @param hookList a #GHookList
     * @param hook the #GHook to add to the start of @hook_list
     */
    public fun hookPrepend(
        hookList: HookList,
        hook: Hook,
    ): Unit = g_hook_prepend(hookList.glibHookListPointer, hook.glibHookPointer)

    /**
     * Decrements the reference count of a #GHook.
     * If the reference count falls to 0, the #GHook is removed
     * from the #GHookList and g_hook_free() is called to free it.
     *
     * @param hookList a #GHookList
     * @param hook the #GHook to unref
     */
    public fun hookUnref(
        hookList: HookList,
        hook: Hook,
    ): Unit = g_hook_unref(hookList.glibHookListPointer, hook.glibHookPointer)

    /**
     * Tests if @hostname contains segments with an ASCII-compatible
     * encoding of an Internationalized Domain Name. If this returns
     * true, you should decode the hostname with g_hostname_to_unicode()
     * before displaying it to the user.
     *
     * Note that a hostname might contain a mix of encoded and unencoded
     * segments, and so it is possible for g_hostname_is_non_ascii() and
     * g_hostname_is_ascii_encoded() to both return true for a name.
     *
     * @param hostname a hostname
     * @return true if @hostname contains any ASCII-encoded
     * segments.
     * @since 2.22
     */
    public fun hostnameIsAsciiEncoded(hostname: kotlin.String): Boolean =
        g_hostname_is_ascii_encoded(hostname).asBoolean()

    /**
     * Tests if @hostname is the string form of an IPv4 or IPv6 address.
     * (Eg, "192.168.0.1".)
     *
     * Since 2.66, IPv6 addresses with a zone-id are accepted (RFC6874).
     *
     * @param hostname a hostname (or IP address in string form)
     * @return true if @hostname is an IP address
     * @since 2.22
     */
    public fun hostnameIsIpAddress(hostname: kotlin.String): Boolean = g_hostname_is_ip_address(hostname).asBoolean()

    /**
     * Tests if @hostname contains Unicode characters. If this returns
     * true, you need to encode the hostname with g_hostname_to_ascii()
     * before using it in non-IDN-aware contexts.
     *
     * Note that a hostname might contain a mix of encoded and unencoded
     * segments, and so it is possible for g_hostname_is_non_ascii() and
     * g_hostname_is_ascii_encoded() to both return true for a name.
     *
     * @param hostname a hostname
     * @return true if @hostname contains any non-ASCII characters
     * @since 2.22
     */
    public fun hostnameIsNonAscii(hostname: kotlin.String): Boolean = g_hostname_is_non_ascii(hostname).asBoolean()

    /**
     * Converts @hostname to its canonical ASCII form; an ASCII-only
     * string containing no uppercase letters and not ending with a
     * trailing dot.
     *
     * @param hostname a valid UTF-8 or ASCII hostname
     * @return an ASCII hostname, which must be freed,
     *    or null if @hostname is in some way invalid.
     * @since 2.22
     */
    public fun hostnameToAscii(hostname: kotlin.String): kotlin.String =
        g_hostname_to_ascii(hostname)?.toKString() ?: error("Expected not null string")

    /**
     * Converts @hostname to its canonical presentation form; a UTF-8
     * string in Unicode normalization form C, containing no uppercase
     * letters, no forbidden characters, and no ASCII-encoded segments,
     * and not ending with a trailing dot.
     *
     * Of course if @hostname is not an internationalized hostname, then
     * the canonical presentation form will be entirely ASCII.
     *
     * @param hostname a valid UTF-8 or ASCII hostname
     * @return a UTF-8 hostname, which must be freed,
     *    or null if @hostname is in some way invalid.
     * @since 2.22
     */
    public fun hostnameToUnicode(hostname: kotlin.String): kotlin.String =
        g_hostname_to_unicode(hostname)?.toKString() ?: error("Expected not null string")

    /**
     * Adds a function to be called whenever there are no higher priority
     * events pending.
     *
     * If the function returns %G_SOURCE_REMOVE or false it is automatically
     * removed from the list of event sources and will not be called again.
     *
     * See [memory management of sources][mainloop-memory-management] for details
     * on how to handle the return value and memory management of @data.
     *
     * This internally creates a main loop source using g_idle_source_new()
     * and attaches it to the global #GMainContext using g_source_attach(), so
     * the callback will be invoked in whichever thread is running that main
     * context. You can do these steps manually if you need greater control or to
     * use a custom main context.
     *
     * @param priority the priority of the idle source. Typically this will be in the
     *   range between %G_PRIORITY_DEFAULT_IDLE and %G_PRIORITY_HIGH_IDLE.
     * @param function function to call
     * @return the ID (greater than 0) of the event source.
     */
    public fun idleAdd(
        priority: Int,
        function: SourceFunc,
    ): UInt =
        g_idle_add_full(
            priority,
            SourceFuncFunc.reinterpret(),
            StableRef.create(function).asCPointer(),
            staticStableRefDestroy.reinterpret()
        )

    /**
     * Creates a new idle source.
     *
     * The source will not initially be associated with any #GMainContext
     * and must be added to one with g_source_attach() before it will be
     * executed. Note that the default priority for idle sources is
     * %G_PRIORITY_DEFAULT_IDLE, as compared to other sources which
     * have a default priority of %G_PRIORITY_DEFAULT.
     *
     * @return the newly-created idle source
     */
    public fun idleSourceNew(): Source =
        g_idle_source_new()!!.run {
            Source(reinterpret())
        }

    /**
     * Returns a canonical representation for @string. Interned strings
     * can be compared for equality by comparing the pointers, instead of
     * using strcmp(). g_intern_static_string() does not copy the string,
     * therefore @string must not be freed or modified.
     *
     * This function must not be used before library constructors have finished
     * running. In particular, this means it cannot be used to initialize global
     * variables in C++.
     *
     * @param string a static string
     * @return a canonical representation for the string
     * @since 2.10
     */
    public fun internStaticString(string: kotlin.String? = null): kotlin.String =
        g_intern_static_string(string)?.toKString() ?: error("Expected not null string")

    /**
     * Returns a canonical representation for @string. Interned strings
     * can be compared for equality by comparing the pointers, instead of
     * using strcmp().
     *
     * This function must not be used before library constructors have finished
     * running. In particular, this means it cannot be used to initialize global
     * variables in C++.
     *
     * @param string a string
     * @return a canonical representation for the string
     * @since 2.10
     */
    public fun internString(string: kotlin.String? = null): kotlin.String =
        g_intern_string(string)?.toKString() ?: error("Expected not null string")

    /**
     * Adds the #GIOChannel into the default main loop context
     * with the given priority.
     *
     * This internally creates a main loop source using g_io_create_watch()
     * and attaches it to the main loop context with g_source_attach().
     * You can do these steps manually if you need greater control.
     *
     * @param channel a #GIOChannel
     * @param priority the priority of the #GIOChannel source
     * @param condition the condition to watch for
     * @param func the function to call when the condition is satisfied
     * @return the event source id
     */
    public fun ioAddWatch(
        channel: IOChannel,
        priority: Int,
        condition: IOCondition,
        func: IOFunc,
    ): UInt =
        g_io_add_watch_full(
            channel.glibIOChannelPointer,
            priority,
            condition.mask,
            IOFuncFunc.reinterpret(),
            StableRef.create(func).asCPointer(),
            staticStableRefDestroy.reinterpret()
        )

    /**
     * Converts an `errno` error number to a #GIOChannelError.
     *
     * @param en an `errno` error number, e.g. `EINVAL`
     * @return a #GIOChannelError error number, e.g.
     *      %G_IO_CHANNEL_ERROR_INVAL.
     */
    public fun ioChannelErrorFromErrno(en: Int): IOChannelError =
        g_io_channel_error_from_errno(en).run {
            IOChannelError.fromNativeValue(this)
        }

    public fun ioChannelErrorQuark(): UInt = g_io_channel_error_quark()

    /**
     * Creates a #GSource that's dispatched when @condition is met for the
     * given @channel. For example, if condition is %G_IO_IN, the source will
     * be dispatched when there's data available for reading.
     *
     * The callback function invoked by the #GSource should be added with
     * g_source_set_callback(), but it has type #GIOFunc (not #GSourceFunc).
     *
     * g_io_add_watch() is a simpler interface to this same functionality, for
     * the case where you want to add the source to the default main loop context
     * at the default priority.
     *
     * On Windows, polling a #GSource created to watch a channel for a socket
     * puts the socket in non-blocking mode. This is a side-effect of the
     * implementation and unavoidable.
     *
     * @param channel a #GIOChannel to watch
     * @param condition conditions to watch for
     * @return a new #GSource
     */
    public fun ioCreateWatch(
        channel: IOChannel,
        condition: IOCondition,
    ): Source =
        g_io_create_watch(channel.glibIOChannelPointer, condition.mask)!!.run {
            Source(reinterpret())
        }

    public fun keyFileErrorQuark(): UInt = g_key_file_error_quark()

    /**
     * Gets the names of all variables set in the environment.
     *
     * Programs that want to be portable to Windows should typically use
     * this function and g_getenv() instead of using the environ array
     * from the C library directly. On Windows, the strings in the environ
     * array are in system codepage encoding, while in most of the typical
     * use cases for environment variables in GLib-using programs you want
     * the UTF-8 encoding that this function and g_getenv() provide.
     *
     * @return
     *     a null-terminated list of strings which must be freed with
     *     g_strfreev().
     * @since 2.8
     */
    public fun listenv(): List<kotlin.String> =
        g_listenv()?.toKStringList()
            ?: error("Expected not null string array")

    /**
     * Return whether debug output from the GLib logging system is enabled.
     *
     * Note that this should not be used to conditionalise calls to g_debug() or
     * other logging functions; it should only be used from %GLogWriterFunc
     * implementations.
     *
     * Note also that the value of this does not depend on `G_MESSAGES_DEBUG`; see
     * the docs for g_log_set_debug_enabled().
     *
     * @return true if debug output is enabled, false otherwise
     * @since 2.72
     */
    public fun logGetDebugEnabled(): Boolean = g_log_get_debug_enabled().asBoolean()

    /**
     * Removes the log handler.
     *
     * This has no effect if structured logging is enabled; see
     * [Using Structured Logging][using-structured-logging].
     *
     * @param logDomain the log domain
     * @param handlerId the id of the handler, which was returned
     *     in g_log_set_handler()
     */
    public fun logRemoveHandler(
        logDomain: kotlin.String,
        handlerId: UInt,
    ): Unit = g_log_remove_handler(logDomain, handlerId)

    /**
     * Sets the message levels which are always fatal, in any log domain.
     * When a message with any of these levels is logged the program terminates.
     * You can only set the levels defined by GLib to be fatal.
     * %G_LOG_LEVEL_ERROR is always fatal.
     *
     * You can also make some message levels fatal at runtime by setting
     * the `G_DEBUG` environment variable (see
     * [Running GLib Applications](glib-running.html)).
     *
     * Libraries should not call this function, as it affects all messages logged
     * by a process, including those from other libraries.
     *
     * Structured log messages (using g_log_structured() and
     * g_log_structured_array()) are fatal only if the default log writer is used;
     * otherwise it is up to the writer function to determine which log messages
     * are fatal. See [Using Structured Logging][using-structured-logging].
     *
     * @param fatalMask the mask containing bits set for each level
     *     of error which is to be fatal
     * @return the old fatal mask
     */
    public fun logSetAlwaysFatal(fatalMask: LogLevelFlags): LogLevelFlags =
        g_log_set_always_fatal(fatalMask.mask).run {
            LogLevelFlags(this)
        }

    /**
     * Enable or disable debug output from the GLib logging system for all domains.
     * This value interacts disjunctively with `G_MESSAGES_DEBUG` — if either of
     * them would allow a debug message to be outputted, it will be.
     *
     * Note that this should not be used from within library code to enable debug
     * output — it is intended for external use.
     *
     * @param enabled true to enable debug output, false otherwise
     * @since 2.72
     */
    public fun logSetDebugEnabled(enabled: Boolean): Unit = g_log_set_debug_enabled(enabled.asGBoolean())

    /**
     * Sets the log levels which are fatal in the given domain.
     * %G_LOG_LEVEL_ERROR is always fatal.
     *
     * This has no effect on structured log messages (using g_log_structured() or
     * g_log_structured_array()). To change the fatal behaviour for specific log
     * messages, programs must install a custom log writer function using
     * g_log_set_writer_func(). See
     * [Using Structured Logging][using-structured-logging].
     *
     * This function is mostly intended to be used with
     * %G_LOG_LEVEL_CRITICAL.  You should typically not set
     * %G_LOG_LEVEL_WARNING, %G_LOG_LEVEL_MESSAGE, %G_LOG_LEVEL_INFO or
     * %G_LOG_LEVEL_DEBUG as fatal except inside of test programs.
     *
     * @param logDomain the log domain
     * @param fatalMask the new fatal mask
     * @return the old fatal mask for the log domain
     */
    public fun logSetFatalMask(
        logDomain: kotlin.String,
        fatalMask: LogLevelFlags,
    ): LogLevelFlags =
        g_log_set_fatal_mask(logDomain, fatalMask.mask).run {
            LogLevelFlags(this)
        }

    /**
     * Like g_log_set_handler(), but takes a destroy notify for the @user_data.
     *
     * This has no effect if structured logging is enabled; see
     * [Using Structured Logging][using-structured-logging].
     *
     * @param logDomain the log domain, or null for the default ""
     *   application domain
     * @param logLevels the log levels to apply the log handler for.
     *   To handle fatal and recursive messages as well, combine
     *   the log levels with the %G_LOG_FLAG_FATAL and
     *   %G_LOG_FLAG_RECURSION bit flags.
     * @param logFunc the log handler function
     * @return the id of the new handler
     * @since 2.46
     */
    public fun logSetHandler(
        logDomain: kotlin.String? = null,
        logLevels: LogLevelFlags,
        logFunc: LogFunc,
    ): UInt =
        g_log_set_handler_full(
            logDomain,
            logLevels.mask,
            LogFuncFunc.reinterpret(),
            StableRef.create(logFunc).asCPointer(),
            staticStableRefDestroy.reinterpret()
        )

    /**
     * Set a writer function which will be called to format and write out each log
     * message. Each program should set a writer function, or the default writer
     * (g_log_writer_default()) will be used.
     *
     * Libraries **must not** call this function — only programs are allowed to
     * install a writer function, as there must be a single, central point where
     * log messages are formatted and outputted.
     *
     * There can only be one writer function. It is an error to set more than one.
     *
     * @param func log writer function, which must not be null
     * @since 2.50
     */
    public fun logSetWriterFunc(func: LogWriterFunc): Unit =
        g_log_set_writer_func(
            LogWriterFuncFunc.reinterpret(),
            StableRef.create(func).asCPointer(),
            staticStableRefDestroy.reinterpret()
        )

    /**
     * Log a message with structured data, accepting the data within a #GVariant. This
     * version is especially useful for use in other languages, via introspection.
     *
     * The only mandatory item in the @fields dictionary is the "MESSAGE" which must
     * contain the text shown to the user.
     *
     * The values in the @fields dictionary are likely to be of type String
     * (%G_VARIANT_TYPE_STRING). Array of bytes (%G_VARIANT_TYPE_BYTESTRING) is also
     * supported. In this case the message is handled as binary and will be forwarded
     * to the log writer as such. The size of the array should not be higher than
     * %G_MAXSSIZE. Otherwise it will be truncated to this size. For other types
     * g_variant_print() will be used to convert the value into a string.
     *
     * For more details on its usage and about the parameters, see g_log_structured().
     *
     * @param logDomain log domain, usually %G_LOG_DOMAIN
     * @param logLevel log level, either from #GLogLevelFlags, or a user-defined
     *    level
     * @param fields a dictionary (#GVariant of the type %G_VARIANT_TYPE_VARDICT)
     * containing the key-value pairs of message data.
     * @since 2.50
     */
    public fun logVariant(
        logDomain: kotlin.String? = null,
        logLevel: LogLevelFlags,
        fields: Variant,
    ): Unit = g_log_variant(logDomain, logLevel.mask, fields.glibVariantPointer)

    /**
     * Configure whether the built-in log functions
     * (g_log_default_handler() for the old-style API, and both
     * g_log_writer_default() and g_log_writer_standard_streams() for the
     * structured API) will output all log messages to `stderr`.
     *
     * By default, log messages of levels %G_LOG_LEVEL_INFO and
     * %G_LOG_LEVEL_DEBUG are sent to `stdout`, and other log messages are
     * sent to `stderr`. This is problematic for applications that intend
     * to reserve `stdout` for structured output such as JSON or XML.
     *
     * This function sets global state. It is not thread-aware, and should be
     * called at the very start of a program, before creating any other threads
     * or creating objects that could create worker threads of their own.
     *
     * @param useStderr If true, use `stderr` for log messages that would
     *  normally have appeared on `stdout`
     * @since 2.68
     */
    public fun logWriterDefaultSetUseStderr(useStderr: Boolean): Unit =
        g_log_writer_default_set_use_stderr(useStderr.asGBoolean())

    /**
     * Check whether g_log_writer_default() and g_log_default_handler() would
     * ignore a message with the given domain and level.
     *
     * As with g_log_default_handler(), this function drops debug and informational
     * messages unless their log domain (or `all`) is listed in the space-separated
     * `G_MESSAGES_DEBUG` environment variable.
     *
     * This can be used when implementing log writers with the same filtering
     * behaviour as the default, but a different destination or output format:
     *
     * |[<!-- language="C" -->
     *   if (g_log_writer_default_would_drop (log_level, log_domain))
     *     return G_LOG_WRITER_HANDLED;
     * ]|
     *
     * or to skip an expensive computation if it is only needed for a debugging
     * message, and `G_MESSAGES_DEBUG` is not set:
     *
     * |[<!-- language="C" -->
     *   if (!g_log_writer_default_would_drop (G_LOG_LEVEL_DEBUG, G_LOG_DOMAIN))
     *     {
     *       gchar *result = expensive_computation (my_object);
     *
     *       g_debug ("my_object result: %s", result);
     *       g_free (result);
     *     }
     * ]|
     *
     * @param logLevel log level, either from #GLogLevelFlags, or a user-defined
     *    level
     * @param logDomain log domain
     * @return true if the log message would be dropped by GLib's
     *  default log handlers
     * @since 2.68
     */
    public fun logWriterDefaultWouldDrop(
        logLevel: LogLevelFlags,
        logDomain: kotlin.String? = null,
    ): Boolean = g_log_writer_default_would_drop(logLevel.mask, logDomain).asBoolean()

    /**
     * Check whether the given @output_fd file descriptor is a connection to the
     * systemd journal, or something else (like a log file or `stdout` or
     * `stderr`).
     *
     * Invalid file descriptors are accepted and return false, which allows for
     * the following construct without needing any additional error handling:
     * |[<!-- language="C" -->
     *   is_journald = g_log_writer_is_journald (fileno (stderr));
     * ]|
     *
     * @param outputFd output file descriptor to check
     * @return true if @output_fd points to the journal, false otherwise
     * @since 2.50
     */
    public fun logWriterIsJournald(outputFd: Int): Boolean = g_log_writer_is_journald(outputFd).asBoolean()

    /**
     * Check whether the given @output_fd file descriptor supports ANSI color
     * escape sequences. If so, they can safely be used when formatting log
     * messages.
     *
     * @param outputFd output file descriptor to check
     * @return true if ANSI color escapes are supported, false otherwise
     * @since 2.50
     */
    public fun logWriterSupportsColor(outputFd: Int): Boolean = g_log_writer_supports_color(outputFd).asBoolean()

    /**
     * Returns the global default main context. This is the main context
     * used for main loop functions when a main loop is not explicitly
     * specified, and corresponds to the "main" main loop. See also
     * g_main_context_get_thread_default().
     *
     * @return the global default main context.
     */
    public fun mainContextDefault(): MainContext =
        g_main_context_default()!!.run {
            MainContext(reinterpret())
        }

    /**
     * Gets the thread-default #GMainContext for this thread. Asynchronous
     * operations that want to be able to be run in contexts other than
     * the default one should call this method or
     * g_main_context_ref_thread_default() to get a #GMainContext to add
     * their #GSources to. (Note that even in single-threaded
     * programs applications may sometimes want to temporarily push a
     * non-default context, so it is not safe to assume that this will
     * always return null if you are running in the default thread.)
     *
     * If you need to hold a reference on the context, use
     * g_main_context_ref_thread_default() instead.
     *
     * @return the thread-default #GMainContext, or
     * null if the thread-default context is the global default context.
     * @since 2.22
     */
    public fun mainContextGetThreadDefault(): MainContext? =
        g_main_context_get_thread_default()?.run {
            MainContext(reinterpret())
        }

    /**
     * Gets the thread-default #GMainContext for this thread, as with
     * g_main_context_get_thread_default(), but also adds a reference to
     * it with g_main_context_ref(). In addition, unlike
     * g_main_context_get_thread_default(), if the thread-default context
     * is the global default context, this will return that #GMainContext
     * (with a ref added to it) rather than returning null.
     *
     * @return the thread-default #GMainContext. Unref
     *     with g_main_context_unref() when you are done with it.
     * @since 2.32
     */
    public fun mainContextRefThreadDefault(): MainContext =
        g_main_context_ref_thread_default()!!.run {
            MainContext(reinterpret())
        }

    /**
     * Returns the currently firing source for this thread.
     *
     * @return The currently firing source or null.
     * @since 2.12
     */
    public fun mainCurrentSource(): Source? =
        g_main_current_source()?.run {
            Source(reinterpret())
        }

    /**
     * Returns the depth of the stack of calls to
     * g_main_context_dispatch() on any #GMainContext in the current thread.
     *  That is, when called from the toplevel, it gives 0. When
     * called from within a callback from g_main_context_iteration()
     * (or g_main_loop_run(), etc.) it returns 1. When called from within
     * a callback to a recursive call to g_main_context_iteration(),
     * it returns 2. And so forth.
     *
     * This function is useful in a situation like the following:
     * Imagine an extremely simple "garbage collected" system.
     *
     * |[<!-- language="C" -->
     * static GList *free_list;
     *
     * gpointer
     * allocate_memory (gsize size)
     * {
     *   gpointer result = g_malloc (size);
     *   free_list = g_list_prepend (free_list, result);
     *   return result;
     * }
     *
     * void
     * free_allocated_memory (void)
     * {
     *   GList *l;
     *   for (l = free_list; l; l = l->next);
     *     g_free (l->data);
     *   g_list_free (free_list);
     *   free_list = NULL;
     *  }
     *
     * []
     *
     * while (TRUE);
     *  {
     *    g_main_context_iteration (NULL, TRUE);
     *    free_allocated_memory();
     *   }
     * ]|
     *
     * This works from an application, however, if you want to do the same
     * thing from a library, it gets more difficult, since you no longer
     * control the main loop. You might think you can simply use an idle
     * function to make the call to free_allocated_memory(), but that
     * doesn't work, since the idle function could be called from a
     * recursive callback. This can be fixed by using g_main_depth()
     *
     * |[<!-- language="C" -->
     * gpointer
     * allocate_memory (gsize size)
     * {
     *   FreeListBlock *block = g_new (FreeListBlock, 1);
     *   block->mem = g_malloc (size);
     *   block->depth = g_main_depth ();
     *   free_list = g_list_prepend (free_list, block);
     *   return block->mem;
     * }
     *
     * void
     * free_allocated_memory (void)
     * {
     *   GList *l;
     *
     *   int depth = g_main_depth ();
     *   for (l = free_list; l; );
     *     {
     *       GList *next = l->next;
     *       FreeListBlock *block = l->data;
     *       if (block->depth > depth)
     *         {
     *           g_free (block->mem);
     *           g_free (block);
     *           free_list = g_list_delete_link (free_list, l);
     *         }
     *
     *       l = next;
     *     }
     *   }
     * ]|
     *
     * There is a temptation to use g_main_depth() to solve
     * problems with reentrancy. For instance, while waiting for data
     * to be received from the network in response to a menu item,
     * the menu item might be selected again. It might seem that
     * one could make the menu item's callback return immediately
     * and do nothing if g_main_depth() returns a value greater than 1.
     * However, this should be avoided since the user then sees selecting
     * the menu item do nothing. Furthermore, you'll find yourself adding
     * these checks all over your code, since there are doubtless many,
     * many things that the user could do. Instead, you can use the
     * following techniques:
     *
     * 1. Use gtk_widget_set_sensitive() or modal dialogs to prevent
     *    the user from interacting with elements while the main
     *    loop is recursing.
     *
     * 2. Avoid main loop recursion in situations where you can't handle
     *    arbitrary  callbacks. Instead, structure your code so that you
     *    simply return to the main loop and then get called again when
     *    there is more work to do.
     *
     * @return The main loop recursion level in the current thread
     */
    public fun mainDepth(): Int = g_main_depth()

    public fun markupErrorQuark(): UInt = g_markup_error_quark()

    /**
     * Escapes text so that the markup parser will parse it verbatim.
     * Less than, greater than, ampersand, etc. are replaced with the
     * corresponding entities. This function would typically be used
     * when writing out a file to be parsed with the markup parser.
     *
     * Note that this function doesn't protect whitespace and line endings
     * from being processed according to the XML rules for normalization
     * of line endings and attribute values.
     *
     * Note also that this function will produce character references in
     * the range of `&#x1;` ... `&#x1f;` for all control sequences
     * except for tabstop, newline and carriage return.  The character
     * references in this range are not valid XML 1.0, but they are
     * valid XML 1.1 and will be accepted by the GMarkup parser.
     *
     * @param text some valid UTF-8 text
     * @param length length of @text in bytes, or -1 if the text is nul-terminated
     * @return a newly allocated string with the escaped text
     */
    public fun markupEscapeText(
        text: kotlin.String,
        length: Long,
    ): kotlin.String = g_markup_escape_text(text, length)?.toKString() ?: error("Expected not null string")

    /**
     * Checks whether the allocator used by g_malloc() is the system's
     * malloc implementation. If it returns true memory allocated with
     * malloc() can be used interchangeably with memory allocated using g_malloc().
     * This function is useful for avoiding an extra copy of allocated memory returned
     * by a non-GLib-based API.
     *
     * @return if true, malloc() and g_malloc() can be mixed.
     */
    public fun memIsSystemMalloc(): Boolean = g_mem_is_system_malloc().asBoolean()

    /**
     * GLib used to support some tools for memory profiling, but this
     * no longer works. There are many other useful tools for memory
     * profiling these days which can be used instead.
     */
    public fun memProfile(): Unit = g_mem_profile()

    /**
     * This function used to let you override the memory allocation function.
     * However, its use was incompatible with the use of global constructors
     * in GLib and GIO, because those use the GLib allocators before main is
     * reached. Therefore this function is now deprecated and is just a stub.
     *
     * @param vtable table of memory allocation routines.
     */
    public fun memSetVtable(vtable: MemVTable): Unit = g_mem_set_vtable(vtable.glibMemVTablePointer)

    /**
     * Create a directory if it doesn't already exist. Create intermediate
     * parent directories as needed, too.
     *
     * @param pathname a pathname in the GLib file name encoding
     * @param mode permissions to use for newly created directories
     * @return 0 if the directory already exists, or was successfully
     * created. Returns -1 if an error occurred, with errno set.
     * @since 2.8
     */
    public fun mkdirWithParents(
        pathname: kotlin.String,
        mode: Int,
    ): Int = g_mkdir_with_parents(pathname, mode)

    public fun numberParserErrorQuark(): UInt = g_number_parser_error_quark()

    /**
     * Prompts the user with
     * `[E]xit, [H]alt, show [S]tack trace or [P]roceed`.
     * This function is intended to be used for debugging use only.
     * The following example shows how it can be used together with
     * the g_log() functions.
     *
     * |[<!-- language="C" -->
     * #include <glib.h>
     *
     * static void
     * log_handler (const gchar   *log_domain,
     *              GLogLevelFlags log_level,
     *              const gchar   *message,
     *              gpointer       user_data)
     * {
     *   g_log_default_handler (log_domain, log_level, message, user_data);
     *
     *   g_on_error_query (MY_PROGRAM_NAME);
     * }
     *
     * int
     * main (int argc, char *argv[])
     * {
     *   g_log_set_handler (MY_LOG_DOMAIN,
     *                      G_LOG_LEVEL_WARNING |
     *                      G_LOG_LEVEL_ERROR |
     *                      G_LOG_LEVEL_CRITICAL,
     *                      log_handler,
     *                      NULL);
     *   ...
     * ]|
     *
     * If "[E]xit" is selected, the application terminates with a call
     * to _exit(0).
     *
     * If "[S]tack" trace is selected, g_on_error_stack_trace() is called.
     * This invokes gdb, which attaches to the current process and shows
     * a stack trace. The prompt is then shown again.
     *
     * If "[P]roceed" is selected, the function returns.
     *
     * This function may cause different actions on non-UNIX platforms.
     *
     * On Windows consider using the `G_DEBUGGER` environment
     * variable (see [Running GLib Applications](glib-running.html)) and
     * calling g_on_error_stack_trace() instead.
     *
     * @param prgName the program name, needed by gdb for the "[S]tack trace"
     *     option. If @prg_name is null, g_get_prgname() is called to get
     *     the program name (which will work correctly if gdk_init() or
     *     gtk_init() has been called)
     */
    public fun onErrorQuery(prgName: kotlin.String): Unit = g_on_error_query(prgName)

    /**
     * Invokes gdb, which attaches to the current process and shows a
     * stack trace. Called by g_on_error_query() when the "[S]tack trace"
     * option is selected. You can get the current process's program name
     * with g_get_prgname(), assuming that you have called gtk_init() or
     * gdk_init().
     *
     * This function may cause different actions on non-UNIX platforms.
     *
     * When running on Windows, this function is *not* called by
     * g_on_error_query(). If called directly, it will raise an
     * exception, which will crash the program. If the `G_DEBUGGER` environment
     * variable is set, a debugger will be invoked to attach and
     * handle that exception (see [Running GLib Applications](glib-running.html)).
     *
     * @param prgName the program name, needed by gdb for the "[S]tack trace"
     *     option
     */
    public fun onErrorStackTrace(prgName: kotlin.String): Unit = g_on_error_stack_trace(prgName)

    public fun optionErrorQuark(): UInt = g_option_error_quark()

    /**
     * Gets the last component of the filename.
     *
     * If @file_name ends with a directory separator it gets the component
     * before the last slash. If @file_name consists only of directory
     * separators (and on Windows, possibly a drive letter), a single
     * separator is returned. If @file_name is empty, it gets ".".
     *
     * @param fileName the name of the file
     * @return a newly allocated string
     *    containing the last component of the filename
     */
    public fun pathGetBasename(fileName: kotlin.String): kotlin.String =
        g_path_get_basename(fileName)?.toKString() ?: error("Expected not null string")

    /**
     * Gets the directory components of a file name. For example, the directory
     * component of `/usr/bin/test` is `/usr/bin`. The directory component of `/`
     * is `/`.
     *
     * If the file name has no directory components "." is returned.
     * The returned string should be freed when no longer needed.
     *
     * @param fileName the name of the file
     * @return the directory components of the file
     */
    public fun pathGetDirname(fileName: kotlin.String): kotlin.String =
        g_path_get_dirname(fileName)?.toKString() ?: error("Expected not null string")

    /**
     * Returns true if the given @file_name is an absolute file name.
     * Note that this is a somewhat vague concept on Windows.
     *
     * On POSIX systems, an absolute file name is well-defined. It always
     * starts from the single root directory. For example "/usr/local".
     *
     * On Windows, the concepts of current drive and drive-specific
     * current directory introduce vagueness. This function interprets as
     * an absolute file name one that either begins with a directory
     * separator such as "\Users\tml" or begins with the root on a drive,
     * for example "C:\Windows". The first case also includes UNC paths
     * such as "\\\\myserver\docs\foo". In all cases, either slashes or
     * backslashes are accepted.
     *
     * Note that a file name relative to the current drive root does not
     * truly specify a file uniquely over time and across processes, as
     * the current drive is a per-process value and can be changed.
     *
     * File names relative the current directory on some specific drive,
     * such as "D:foo/bar", are not interpreted as absolute by this
     * function, but they obviously are not relative to the normal current
     * directory as returned by getcwd() or g_get_current_dir()
     * either. Such paths should be avoided, or need to be handled using
     * Windows-specific code.
     *
     * @param fileName a file name
     * @return true if @file_name is absolute
     */
    public fun pathIsAbsolute(fileName: kotlin.String): Boolean = g_path_is_absolute(fileName).asBoolean()

    /**
     * Returns a pointer into @file_name after the root component,
     * i.e. after the "/" in UNIX or "C:\" under Windows. If @file_name
     * is not an absolute path it returns null.
     *
     * @param fileName a file name
     * @return a pointer into @file_name after the
     *     root component
     */
    public fun pathSkipRoot(fileName: kotlin.String): kotlin.String? = g_path_skip_root(fileName)?.toKString()

    /**
     * Matches a string against a pattern given as a string. If this
     * function is to be called in a loop, it's more efficient to compile
     * the pattern once with g_pattern_spec_new() and call
     * g_pattern_match_string() repeatedly.
     *
     * @param pattern the UTF-8 encoded pattern
     * @param string the UTF-8 encoded string to match
     * @return true if @string matches @pspec
     */
    public fun patternMatchSimple(
        pattern: kotlin.String,
        string: kotlin.String,
    ): Boolean = g_pattern_match_simple(pattern, string).asBoolean()

    /**
     * Polls @fds, as with the poll() system call, but portably. (On
     * systems that don't have poll(), it is emulated using select().)
     * This is used internally by #GMainContext, but it can be called
     * directly if you need to block until a file descriptor is ready, but
     * don't want to run the full main loop.
     *
     * Each element of @fds is a #GPollFD describing a single file
     * descriptor to poll. The @fd field indicates the file descriptor,
     * and the @events field indicates the events to poll for. On return,
     * the @revents fields will be filled with the events that actually
     * occurred.
     *
     * On POSIX systems, the file descriptors in @fds can be any sort of
     * file descriptor, but the situation is much more complicated on
     * Windows. If you need to use g_poll() in code that has to run on
     * Windows, the easiest solution is to construct all of your
     * #GPollFDs with g_io_channel_win32_make_pollfd().
     *
     * @param fds file descriptors to poll
     * @param nfds the number of file descriptors in @fds
     * @param timeout amount of time to wait, in milliseconds, or -1 to wait forever
     * @return the number of entries in @fds whose @revents fields
     * were filled in, or 0 if the operation timed out, or -1 on error or
     * if the call was interrupted.
     * @since 2.20
     */
    public fun poll(
        fds: PollFD,
        nfds: UInt,
        timeout: Int,
    ): Int = g_poll(fds.glibPollFDPointer, nfds, timeout)

    /**
     * Gets the #GQuark identifying the given (static) string. If the
     * string does not currently have an associated #GQuark, a new #GQuark
     * is created, linked to the given string.
     *
     * Note that this function is identical to g_quark_from_string() except
     * that if a new #GQuark is created the string itself is used rather
     * than a copy. This saves memory, but can only be used if the string
     * will continue to exist until the program terminates. It can be used
     * with statically allocated strings in the main program, but not with
     * statically allocated memory in dynamically loaded modules, if you
     * expect to ever unload the module again (e.g. do not use this
     * function in GTK+ theme engines).
     *
     * This function must not be used before library constructors have finished
     * running. In particular, this means it cannot be used to initialize global
     * variables in C++.
     *
     * @param string a string
     * @return the #GQuark identifying the string, or 0 if @string is null
     */
    public fun quarkFromStaticString(string: kotlin.String? = null): UInt = g_quark_from_static_string(string)

    /**
     * Gets the #GQuark identifying the given string. If the string does
     * not currently have an associated #GQuark, a new #GQuark is created,
     * using a copy of the string.
     *
     * This function must not be used before library constructors have finished
     * running. In particular, this means it cannot be used to initialize global
     * variables in C++.
     *
     * @param string a string
     * @return the #GQuark identifying the string, or 0 if @string is null
     */
    public fun quarkFromString(string: kotlin.String? = null): UInt = g_quark_from_string(string)

    /**
     * Gets the #GQuark associated with the given string, or 0 if string is
     * null or it has no associated #GQuark.
     *
     * If you want the GQuark to be created if it doesn't already exist,
     * use g_quark_from_string() or g_quark_from_static_string().
     *
     * This function must not be used before library constructors have finished
     * running.
     *
     * @param string a string
     * @return the #GQuark associated with the string, or 0 if @string is
     *     null or there is no #GQuark associated with it
     */
    public fun quarkTryString(string: kotlin.String? = null): UInt = g_quark_try_string(string)

    /**
     * Returns a random #gdouble equally distributed over the range [0..1).
     *
     * @return a random number
     */
    public fun randomDouble(): Double = g_random_double()

    /**
     * Returns a random #gdouble equally distributed over the range
     * [@begin..@end).
     *
     * @param begin lower closed bound of the interval
     * @param end upper open bound of the interval
     * @return a random number
     */
    public fun randomDoubleRange(
        begin: Double,
        end: Double,
    ): Double =
        g_random_double_range(
            begin,
            end
        )

    /**
     * Return a random #guint32 equally distributed over the range
     * [0..2^32-1].
     *
     * @return a random number
     */
    public fun randomInt(): UInt = g_random_int()

    /**
     * Returns a random #gint32 equally distributed over the range
     * [@begin..@end-1].
     *
     * @param begin lower closed bound of the interval
     * @param end upper open bound of the interval
     * @return a random number
     */
    public fun randomIntRange(
        begin: Int,
        end: Int,
    ): Int = g_random_int_range(begin, end)

    /**
     * Sets the seed for the global random number generator, which is used
     * by the g_random_* functions, to @seed.
     *
     * @param seed a value to reinitialize the global random number generator
     */
    public fun randomSetSeed(seed: UInt): Unit = g_random_set_seed(seed)

    /**
     * Creates a new reference counted string and copies the contents of @str
     * into it.
     *
     * @param str a NUL-terminated string
     * @return the newly created reference counted string
     * @since 2.58
     */
    public fun refStringNew(str: kotlin.String): kotlin.String =
        g_ref_string_new(str)?.toKString()
            ?: error("Expected not null string")

    /**
     * Creates a new reference counted string and copies the content of @str
     * into it.
     *
     * If you call this function multiple times with the same @str, or with
     * the same contents of @str, it will return a new reference, instead of
     * creating a new string.
     *
     * @param str a NUL-terminated string
     * @return the newly created reference
     *   counted string, or a new reference to an existing string
     * @since 2.58
     */
    public fun refStringNewIntern(str: kotlin.String): kotlin.String =
        g_ref_string_new_intern(str)?.toKString() ?: error("Expected not null string")

    /**
     * Creates a new reference counted string and copies the contents of @str
     * into it, up to @len bytes.
     *
     * Since this function does not stop at nul bytes, it is the caller's
     * responsibility to ensure that @str has at least @len addressable bytes.
     *
     * @param str a string
     * @param len length of @str to use, or -1 if @str is nul-terminated
     * @return the newly created reference counted string
     * @since 2.58
     */
    public fun refStringNewLen(
        str: kotlin.String,
        len: Long,
    ): kotlin.String = g_ref_string_new_len(str, len)?.toKString() ?: error("Expected not null string")

    public fun regexErrorQuark(): UInt = g_regex_error_quark()

    /**
     * Escapes the nul characters in @string to "\x00".  It can be used
     * to compile a regex with embedded nul characters.
     *
     * For completeness, @length can be -1 for a nul-terminated string.
     * In this case the output string will be of course equal to @string.
     *
     * @param string the string to escape
     * @param length the length of @string
     * @return a newly-allocated escaped string
     * @since 2.30
     */
    public fun regexEscapeNul(
        string: kotlin.String,
        length: Int,
    ): kotlin.String = g_regex_escape_nul(string, length)?.toKString() ?: error("Expected not null string")

    /**
     * Scans for a match in @string for @pattern.
     *
     * This function is equivalent to g_regex_match() but it does not
     * require to compile the pattern with g_regex_new(), avoiding some
     * lines of code when you need just to do a match without extracting
     * substrings, capture counts, and so on.
     *
     * If this function is to be called on the same @pattern more than
     * once, it's more efficient to compile the pattern once with
     * g_regex_new() and then use g_regex_match().
     *
     * @param pattern the regular expression
     * @param string the string to scan for matches
     * @param compileOptions compile options for the regular expression, or 0
     * @param matchOptions match options, or 0
     * @return true if the string matched, false otherwise
     * @since 2.14
     */
    public fun regexMatchSimple(
        pattern: kotlin.String,
        string: kotlin.String,
        compileOptions: RegexCompileFlags,
        matchOptions: RegexMatchFlags,
    ): Boolean =
        g_regex_match_simple(
            pattern,
            string,
            compileOptions.mask,
            matchOptions.mask
        ).asBoolean()

    /**
     * Breaks the string on the pattern, and returns an array of
     * the tokens. If the pattern contains capturing parentheses,
     * then the text for each of the substrings will also be returned.
     * If the pattern does not match anywhere in the string, then the
     * whole string is returned as the first token.
     *
     * This function is equivalent to g_regex_split() but it does
     * not require to compile the pattern with g_regex_new(), avoiding
     * some lines of code when you need just to do a split without
     * extracting substrings, capture counts, and so on.
     *
     * If this function is to be called on the same @pattern more than
     * once, it's more efficient to compile the pattern once with
     * g_regex_new() and then use g_regex_split().
     *
     * As a special case, the result of splitting the empty string ""
     * is an empty vector, not a vector containing a single string.
     * The reason for this special case is that being able to represent
     * an empty vector is typically more useful than consistent handling
     * of empty elements. If you do need to represent empty elements,
     * you'll need to check for the empty string before calling this
     * function.
     *
     * A pattern that can match empty strings splits @string into
     * separate characters wherever it matches the empty string between
     * characters. For example splitting "ab c" using as a separator
     * "\s*", you will get "a", "b" and "c".
     *
     * @param pattern the regular expression
     * @param string the string to scan for matches
     * @param compileOptions compile options for the regular expression, or 0
     * @param matchOptions match options, or 0
     * @return a null-terminated array of strings. Free
     * it using g_strfreev()
     * @since 2.14
     */
    public fun regexSplitSimple(
        pattern: kotlin.String,
        string: kotlin.String,
        compileOptions: RegexCompileFlags,
        matchOptions: RegexMatchFlags,
    ): List<kotlin.String> =
        g_regex_split_simple(
            pattern, string, compileOptions.mask,
            matchOptions.mask
        )?.toKStringList() ?: error("Expected not null string array")

    /**
     * Resets the cache used for g_get_user_special_dir(), so
     * that the latest on-disk version is used. Call this only
     * if you just changed the data on disk yourself.
     *
     * Due to thread safety issues this may cause leaking of strings
     * that were previously returned from g_get_user_special_dir()
     * that can't be freed. We ensure to only leak the data for
     * the directories that actually changed value though.
     *
     * @since 2.22
     */
    public fun reloadUserSpecialDirsCache(): Unit = g_reload_user_special_dirs_cache()

    /**
     * A wrapper for the POSIX rmdir() function. The rmdir() function
     * deletes a directory from the filesystem.
     *
     * See your C library manual for more details about how rmdir() works
     * on your system.
     *
     * @param filename a pathname in the GLib file name encoding
     *     (UTF-8 on Windows)
     * @return 0 if the directory was successfully removed, -1 if an error
     *    occurred
     * @since 2.6
     */
    public fun rmdir(filename: kotlin.String): Int = g_rmdir(filename)

    /**
     * Sets a human-readable name for the application. This name should be
     * localized if possible, and is intended for display to the user.
     * Contrast with g_set_prgname(), which sets a non-localized name.
     * g_set_prgname() will be called automatically by gtk_init(),
     * but g_set_application_name() will not.
     *
     * Note that for thread safety reasons, this function can only
     * be called once.
     *
     * The application name will be used in contexts such as error messages,
     * or when displaying an application's name in the task list.
     *
     * @param applicationName localized name of the application
     * @since 2.2
     */
    public fun setApplicationName(applicationName: kotlin.String): Unit = g_set_application_name(applicationName)

    /**
     * Sets the name of the program. This name should not be localized,
     * in contrast to g_set_application_name().
     *
     * If you are using #GApplication the program name is set in
     * g_application_run(). In case of GDK or GTK+ it is set in
     * gdk_init(), which is called by gtk_init() and the
     * #GtkApplication::startup handler. The program name is found by
     * taking the last component of @argv[0].
     *
     * Since GLib 2.72, this function can be called multiple times
     * and is fully thread safe. Prior to GLib 2.72, this function
     * could only be called once per process.
     *
     * @param prgname the name of the program.
     */
    public fun setPrgname(prgname: kotlin.String): Unit = g_set_prgname(prgname)

    /**
     * Sets an environment variable. On UNIX, both the variable's name and
     * value can be arbitrary byte strings, except that the variable's name
     * cannot contain '='. On Windows, they should be in UTF-8.
     *
     * Note that on some systems, when variables are overwritten, the memory
     * used for the previous variables and its value isn't reclaimed.
     *
     * You should be mindful of the fact that environment variable handling
     * in UNIX is not thread-safe, and your program may crash if one thread
     * calls g_setenv() while another thread is calling getenv(). (And note
     * that many functions, such as gettext(), call getenv() internally.)
     * This function is only safe to use at the very start of your program,
     * before creating any other threads (or creating objects that create
     * worker threads of their own).
     *
     * If you need to set up the environment for a child process, you can
     * use g_get_environ() to get an environment array, modify that with
     * g_environ_setenv() and g_environ_unsetenv(), and then pass that
     * array directly to execvpe(), g_spawn_async(), or the like.
     *
     * @param variable the environment variable to set, must not
     *     contain '='.
     * @param value the value for to set the variable to.
     * @param overwrite whether to change the variable if it already exists.
     * @return false if the environment variable couldn't be set.
     * @since 2.4
     */
    public fun setenv(
        variable: kotlin.String,
        `value`: kotlin.String,
        overwrite: Boolean,
    ): Boolean = g_setenv(variable, `value`, overwrite.asGBoolean()).asBoolean()

    public fun shellErrorQuark(): UInt = g_shell_error_quark()

    /**
     * Quotes a string so that the shell (/bin/sh) will interpret the
     * quoted string to mean @unquoted_string.
     *
     * If you pass a filename to the shell, for example, you should first
     * quote it with this function.
     *
     * The return value must be freed with g_free().
     *
     * The quoting style used is undefined (single or double quotes may be
     * used).
     *
     * @param unquotedString a literal string
     * @return quoted string
     */
    public fun shellQuote(unquotedString: kotlin.String): kotlin.String =
        g_shell_quote(unquotedString)?.toKString() ?: error("Expected not null string")

    /**
     * Unquotes a string as the shell (/bin/sh) would.
     *
     * This function only handles quotes; if a string contains file globs,
     * arithmetic operators, variables, backticks, redirections, or other
     * special-to-the-shell features, the result will be different from the
     * result a real shell would produce (the variables, backticks, etc.
     * will be passed through literally instead of being expanded).
     *
     * This function is guaranteed to succeed if applied to the result of
     * g_shell_quote(). If it fails, it returns null and sets the
     * error.
     *
     * The @quoted_string need not actually contain quoted or escaped text;
     * g_shell_unquote() simply goes through the string and unquotes/unescapes
     * anything that the shell would. Both single and double quotes are
     * handled, as are escapes including escaped newlines.
     *
     * The return value must be freed with g_free().
     *
     * Possible errors are in the %G_SHELL_ERROR domain.
     *
     * Shell quoting rules are a bit strange. Single quotes preserve the
     * literal string exactly. escape sequences are not allowed; not even
     * `\'` - if you want a `'` in the quoted text, you have to do something
     * like `'foo'\''bar'`. Double quotes allow `$`, ```, `"`, `\`, and
     * newline to be escaped with backslash. Otherwise double quotes
     * preserve things literally.
     *
     * @param quotedString shell-quoted string
     * @return an unquoted string
     */
    public fun shellUnquote(quotedString: kotlin.String): Result<kotlin.String> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_shell_unquote(quotedString, gError.ptr)?.toKString()
            return if (gError.pointed != null) {
                Result.failure(org.gtkkn.bindings.glib.Glib.resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     *
     *
     * @param ckey
     */
    public fun sliceGetConfig(ckey: SliceConfig): Long = g_slice_get_config(ckey.nativeValue)

    /**
     *
     *
     * @param ckey
     * @param value
     */
    public fun sliceSetConfig(
        ckey: SliceConfig,
        `value`: Long,
    ): Unit = g_slice_set_config(ckey.nativeValue, `value`)

    /**
     * Removes the source with the given ID from the default main context. You must
     * use g_source_destroy() for sources added to a non-default main context.
     *
     * The ID of a #GSource is given by g_source_get_id(), or will be
     * returned by the functions g_source_attach(), g_idle_add(),
     * g_idle_add_full(), g_timeout_add(), g_timeout_add_full(),
     * g_child_watch_add(), g_child_watch_add_full(), g_io_add_watch(), and
     * g_io_add_watch_full().
     *
     * It is a programmer error to attempt to remove a non-existent source.
     *
     * More specifically: source IDs can be reissued after a source has been
     * destroyed and therefore it is never valid to use this function with a
     * source ID which may have already been removed.  An example is when
     * scheduling an idle to run in another thread with g_idle_add(): the
     * idle may already have run and been removed by the time this function
     * is called on its (now invalid) source ID.  This source ID may have
     * been reissued, leading to the operation being performed against the
     * wrong source.
     *
     * @param tag the ID of the source to remove.
     * @return true if the source was found and removed.
     */
    public fun sourceRemove(tag: UInt): Boolean = g_source_remove(tag).asBoolean()

    /**
     * Sets the name of a source using its ID.
     *
     * This is a convenience utility to set source names from the return
     * value of g_idle_add(), g_timeout_add(), etc.
     *
     * It is a programmer error to attempt to set the name of a non-existent
     * source.
     *
     * More specifically: source IDs can be reissued after a source has been
     * destroyed and therefore it is never valid to use this function with a
     * source ID which may have already been removed.  An example is when
     * scheduling an idle to run in another thread with g_idle_add(): the
     * idle may already have run and been removed by the time this function
     * is called on its (now invalid) source ID.  This source ID may have
     * been reissued, leading to the operation being performed against the
     * wrong source.
     *
     * @param tag a #GSource ID
     * @param name debug name for the source
     * @since 2.26
     */
    public fun sourceSetNameById(
        tag: UInt,
        name: kotlin.String,
    ): Unit = g_source_set_name_by_id(tag, name)

    /**
     * Gets the smallest prime number from a built-in array of primes which
     * is larger than @num. This is used within GLib to calculate the optimum
     * size of a #GHashTable.
     *
     * The built-in array of primes ranges from 11 to 13845163 such that
     * each prime is approximately 1.5-2 times the previous prime.
     *
     * @param num a #guint
     * @return the smallest prime number from a built-in array of primes
     *     which is larger than @num
     */
    public fun spacedPrimesClosest(num: UInt): UInt = g_spaced_primes_closest(num)

    /**
     * An old name for g_spawn_check_wait_status(), deprecated because its
     * name is misleading.
     *
     * Despite the name of the function, @wait_status must be the wait status
     * as returned by g_spawn_sync(), g_subprocess_get_status(), `waitpid()`,
     * etc. On Unix platforms, it is incorrect for it to be the exit status
     * as passed to `exit()` or returned by g_subprocess_get_exit_status() or
     * `WEXITSTATUS()`.
     *
     * @param waitStatus A status as returned from g_spawn_sync()
     * @return true if child exited successfully, false otherwise (and
     *     @error will be set)
     * @since 2.34
     */
    public fun spawnCheckExitStatus(waitStatus: Int): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_spawn_check_exit_status(waitStatus, gError.ptr).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(org.gtkkn.bindings.glib.Glib.resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Set @error if @wait_status indicates the child exited abnormally
     * (e.g. with a nonzero exit code, or via a fatal signal).
     *
     * The g_spawn_sync() and g_child_watch_add() family of APIs return the
     * status of subprocesses encoded in a platform-specific way.
     * On Unix, this is guaranteed to be in the same format waitpid() returns,
     * and on Windows it is guaranteed to be the result of GetExitCodeProcess().
     *
     * Prior to the introduction of this function in GLib 2.34, interpreting
     * @wait_status required use of platform-specific APIs, which is problematic
     * for software using GLib as a cross-platform layer.
     *
     * Additionally, many programs simply want to determine whether or not
     * the child exited successfully, and either propagate a #GError or
     * print a message to standard error. In that common case, this function
     * can be used. Note that the error message in @error will contain
     * human-readable information about the wait status.
     *
     * The @domain and @code of @error have special semantics in the case
     * where the process has an "exit code", as opposed to being killed by
     * a signal. On Unix, this happens if WIFEXITED() would be true of
     * @wait_status. On Windows, it is always the case.
     *
     * The special semantics are that the actual exit code will be the
     * code set in @error, and the domain will be %G_SPAWN_EXIT_ERROR.
     * This allows you to differentiate between different exit codes.
     *
     * If the process was terminated by some means other than an exit
     * status (for example if it was killed by a signal), the domain will be
     * %G_SPAWN_ERROR and the code will be %G_SPAWN_ERROR_FAILED.
     *
     * This function just offers convenience; you can of course also check
     * the available platform via a macro such as %G_OS_UNIX, and use
     * WIFEXITED() and WEXITSTATUS() on @wait_status directly. Do not attempt
     * to scan or parse the error message string; it may be translated and/or
     * change in future versions of GLib.
     *
     * Prior to version 2.70, g_spawn_check_exit_status() provides the same
     * functionality, although under a misleading name.
     *
     * @param waitStatus A platform-specific wait status as returned from g_spawn_sync()
     * @return true if child exited successfully, false otherwise (and
     *   @error will be set)
     * @since 2.70
     */
    public fun spawnCheckWaitStatus(waitStatus: Int): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_spawn_check_wait_status(waitStatus, gError.ptr).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(org.gtkkn.bindings.glib.Glib.resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * A simple version of g_spawn_async() that parses a command line with
     * g_shell_parse_argv() and passes it to g_spawn_async().
     *
     * Runs a command line in the background. Unlike g_spawn_async(), the
     * %G_SPAWN_SEARCH_PATH flag is enabled, other flags are not. Note
     * that %G_SPAWN_SEARCH_PATH can have security implications, so
     * consider using g_spawn_async() directly if appropriate. Possible
     * errors are those from g_shell_parse_argv() and g_spawn_async().
     *
     * The same concerns on Windows apply as for g_spawn_command_line_sync().
     *
     * @param commandLine a command line
     * @return true on success, false if error is set
     */
    public fun spawnCommandLineAsync(commandLine: kotlin.String): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_spawn_command_line_async(commandLine, gError.ptr).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(org.gtkkn.bindings.glib.Glib.resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    public fun spawnErrorQuark(): UInt = g_spawn_error_quark()

    public fun spawnExitErrorQuark(): UInt = g_spawn_exit_error_quark()

    /**
     *
     *
     * @param domain
     * @param file
     * @param line
     * @param func
     */
    public fun testAssertExpectedMessagesInternal(
        domain: kotlin.String,
        `file`: kotlin.String,
        line: Int,
        func: kotlin.String,
    ): Unit = g_test_assert_expected_messages_internal(domain, `file`, line, func)

    /**
     * This function adds a message to test reports that
     * associates a bug URI with a test case.
     *
     * Bug URIs are constructed from a base URI set with g_test_bug_base()
     * and @bug_uri_snippet. If g_test_bug_base() has not been called, it is
     * assumed to be the empty string, so a full URI can be provided to
     * g_test_bug() instead.
     *
     * Since GLib 2.70, the base URI is not prepended to @bug_uri_snippet if it
     * is already a valid URI.
     *
     * @param bugUriSnippet Bug specific bug tracker URI or URI portion.
     * @since 2.16
     */
    public fun testBug(bugUriSnippet: kotlin.String): Unit = g_test_bug(bugUriSnippet)

    /**
     * Specify the base URI for bug reports.
     *
     * The base URI is used to construct bug report messages for
     * g_test_message() when g_test_bug() is called.
     * Calling this function outside of a test case sets the
     * default base URI for all test cases. Calling it from within
     * a test case changes the base URI for the scope of the test
     * case only.
     * Bug URIs are constructed by appending a bug specific URI
     * portion to @uri_pattern, or by replacing the special string
     * `%s` within @uri_pattern if that is present.
     *
     * If g_test_bug_base() is not called, bug URIs are formed solely
     * from the value provided by g_test_bug().
     *
     * @param uriPattern the base pattern for bug URIs
     * @since 2.16
     */
    public fun testBugBase(uriPattern: kotlin.String): Unit = g_test_bug_base(uriPattern)

    /**
     * Indicates that a message with the given @log_domain and @log_level,
     * with text matching @pattern, is expected to be logged. When this
     * message is logged, it will not be printed, and the test case will
     * not abort.
     *
     * This API may only be used with the old logging API (g_log() without
     * %G_LOG_USE_STRUCTURED defined). It will not work with the structured logging
     * API. See [Testing for Messages][testing-for-messages].
     *
     * Use g_test_assert_expected_messages() to assert that all
     * previously-expected messages have been seen and suppressed.
     *
     * You can call this multiple times in a row, if multiple messages are
     * expected as a result of a single call. (The messages must appear in
     * the same order as the calls to g_test_expect_message().)
     *
     * For example:
     *
     * |[<!-- language="C" -->
     *   // g_main_context_push_thread_default() should fail if the
     *   // context is already owned by another thread.
     *   g_test_expect_message (G_LOG_DOMAIN,
     *                          G_LOG_LEVEL_CRITICAL,
     *                          "assertion*acquired_context*failed");
     *   g_main_context_push_thread_default (bad_context);
     *   g_test_assert_expected_messages ();
     * ]|
     *
     * Note that you cannot use this to test g_error() messages, since
     * g_error() intentionally never returns even if the program doesn't
     * abort; use g_test_trap_subprocess() in this case.
     *
     * If messages at %G_LOG_LEVEL_DEBUG are emitted, but not explicitly
     * expected via g_test_expect_message() then they will be ignored.
     *
     * @param logDomain the log domain of the message
     * @param logLevel the log level of the message
     * @param pattern a glob-style [pattern][glib-Glob-style-pattern-matching]
     * @since 2.34
     */
    public fun testExpectMessage(
        logDomain: kotlin.String? = null,
        logLevel: LogLevelFlags,
        pattern: kotlin.String,
    ): Unit = g_test_expect_message(logDomain, logLevel.mask, pattern)

    /**
     * Indicates that a test failed. This function can be called
     * multiple times from the same test. You can use this function
     * if your test failed in a recoverable way.
     *
     * Do not use this function if the failure of a test could cause
     * other tests to malfunction.
     *
     * Calling this function will not stop the test from running, you
     * need to return from the test function yourself. So you can
     * produce additional diagnostic messages or even continue running
     * the test.
     *
     * If not called from inside a test, this function does nothing.
     *
     * Note that unlike g_test_skip() and g_test_incomplete(), this
     * function does not log a message alongside the test failure.
     * If details of the test failure are available, either log them with
     * g_test_message() before g_test_fail(), or use g_test_fail_printf()
     * instead.
     *
     * @since 2.30
     */
    public fun testFail(): Unit = g_test_fail()

    /**
     * Returns whether a test has already failed. This will
     * be the case when g_test_fail(), g_test_incomplete()
     * or g_test_skip() have been called, but also if an
     * assertion has failed.
     *
     * This can be useful to return early from a test if
     * continuing after a failed assertion might be harmful.
     *
     * The return value of this function is only meaningful
     * if it is called from inside a test function.
     *
     * @return true if the test has failed
     * @since 2.38
     */
    public fun testFailed(): Boolean = g_test_failed().asBoolean()

    /**
     * Gets the pathname of the directory containing test files of the type
     * specified by @file_type.
     *
     * This is approximately the same as calling g_test_build_filename("."),
     * but you don't need to free the return value.
     *
     * @param fileType the type of file (built vs. distributed)
     * @return the path of the directory, owned by GLib
     * @since 2.38
     */
    public fun testGetDir(fileType: TestFileType): kotlin.String =
        g_test_get_dir(fileType.nativeValue)?.toKString() ?: error("Expected not null string")

    /**
     * Gets the test path for the test currently being run.
     *
     * In essence, it will be the same string passed as the first argument to
     * e.g. g_test_add() when the test was added.
     *
     * This function returns a valid string only within a test function.
     *
     * @return the test path for the test currently being run
     * @since 2.68
     */
    public fun testGetPath(): kotlin.String =
        g_test_get_path()?.toKString()
            ?: error("Expected not null string")

    /**
     * Indicates that a test failed because of some incomplete
     * functionality. This function can be called multiple times
     * from the same test.
     *
     * Calling this function will not stop the test from running, you
     * need to return from the test function yourself. So you can
     * produce additional diagnostic messages or even continue running
     * the test.
     *
     * If not called from inside a test, this function does nothing.
     *
     * @param msg explanation
     * @since 2.38
     */
    public fun testIncomplete(msg: kotlin.String? = null): Unit = g_test_incomplete(msg)

    /**
     *
     *
     * @param logType
     */
    public fun testLogTypeName(logType: TestLogType): kotlin.String =
        g_test_log_type_name(logType.nativeValue)?.toKString()
            ?: error("Expected not null string")

    /**
     * Get a reproducible random floating point number,
     * see g_test_rand_int() for details on test case random numbers.
     *
     * @return a random number from the seeded random number generator.
     * @since 2.16
     */
    public fun testRandDouble(): Double = g_test_rand_double()

    /**
     * Get a reproducible random floating pointer number out of a specified range,
     * see g_test_rand_int() for details on test case random numbers.
     *
     * @param rangeStart the minimum value returned by this function
     * @param rangeEnd the minimum value not returned by this function
     * @return a number with @range_start <= number < @range_end.
     * @since 2.16
     */
    public fun testRandDoubleRange(
        rangeStart: Double,
        rangeEnd: Double,
    ): Double = g_test_rand_double_range(rangeStart, rangeEnd)

    /**
     * Get a reproducible random integer number.
     *
     * The random numbers generated by the g_test_rand_*() family of functions
     * change with every new test program start, unless the --seed option is
     * given when starting test programs.
     *
     * For individual test cases however, the random number generator is
     * reseeded, to avoid dependencies between tests and to make --seed
     * effective for all test cases.
     *
     * @return a random number from the seeded random number generator.
     * @since 2.16
     */
    public fun testRandInt(): Int = g_test_rand_int()

    /**
     * Get a reproducible random integer number out of a specified range,
     * see g_test_rand_int() for details on test case random numbers.
     *
     * @param begin the minimum value returned by this function
     * @param end the smallest value not to be returned by this function
     * @return a number with @begin <= number < @end.
     * @since 2.16
     */
    public fun testRandIntRange(
        begin: Int,
        end: Int,
    ): Int = g_test_rand_int_range(begin, end)

    /**
     * Runs all tests under the toplevel suite which can be retrieved
     * with g_test_get_root(). Similar to g_test_run_suite(), the test
     * cases to be run are filtered according to test path arguments
     * (`-p testpath` and `-s testpath`) as parsed by g_test_init().
     * g_test_run_suite() or g_test_run() may only be called once in a
     * program.
     *
     * In general, the tests and sub-suites within each suite are run in
     * the order in which they are defined. However, note that prior to
     * GLib 2.36, there was a bug in the `g_test_add_*`
     * functions which caused them to create multiple suites with the same
     * name, meaning that if you created tests "/foo/simple",
     * "/bar/simple", and "/foo/using-bar" in that order, they would get
     * run in that order (since g_test_run() would run the first "/foo"
     * suite, then the "/bar" suite, then the second "/foo" suite). As of
     * 2.36, this bug is fixed, and adding the tests in that order would
     * result in a running order of "/foo/simple", "/foo/using-bar",
     * "/bar/simple". If this new ordering is sub-optimal (because it puts
     * more-complicated tests before simpler ones, making it harder to
     * figure out exactly what has failed), you can fix it by changing the
     * test paths to group tests by suite in a way that will result in the
     * desired running order. Eg, "/simple/foo", "/simple/bar",
     * "/complex/foo-using-bar".
     *
     * However, you should never make the actual result of a test depend
     * on the order that tests are run in. If you need to ensure that some
     * particular code runs before or after a given test case, use
     * g_test_add(), which lets you specify setup and teardown functions.
     *
     * If all tests are skipped or marked as incomplete (expected failures),
     * this function will return 0 if producing TAP output, or 77 (treated
     * as "skip test" by Automake) otherwise.
     *
     * @return 0 on success, 1 on failure (assuming it returns at all),
     *   0 or 77 if all tests were skipped with g_test_skip() and/or
     *   g_test_incomplete()
     * @since 2.16
     */
    public fun testRun(): Int = g_test_run()

    /**
     * Changes the behaviour of the various `g_assert_*()` macros,
     * g_test_assert_expected_messages() and the various
     * `g_test_trap_assert_*()` macros to not abort to program, but instead
     * call g_test_fail() and continue. (This also changes the behavior of
     * g_test_fail() so that it will not cause the test program to abort
     * after completing the failed test.)
     *
     * Note that the g_assert_not_reached() and g_assert() macros are not
     * affected by this.
     *
     * This function can only be called after g_test_init().
     *
     * @since 2.38
     */
    public fun testSetNonfatalAssertions(): Unit = g_test_set_nonfatal_assertions()

    /**
     * Indicates that a test was skipped.
     *
     * Calling this function will not stop the test from running, you
     * need to return from the test function yourself. So you can
     * produce additional diagnostic messages or even continue running
     * the test.
     *
     * If not called from inside a test, this function does nothing.
     *
     * @param msg explanation
     * @since 2.38
     */
    public fun testSkip(msg: kotlin.String? = null): Unit = g_test_skip(msg)

    /**
     * Returns true (after g_test_init() has been called) if the test
     * program is running under g_test_trap_subprocess().
     *
     * @return true if the test program is running under
     * g_test_trap_subprocess().
     * @since 2.38
     */
    public fun testSubprocess(): Boolean = g_test_subprocess().asBoolean()

    /**
     * Set the summary for a test, which describes what the test checks, and how it
     * goes about checking it. This may be included in test report output, and is
     * useful documentation for anyone reading the source code or modifying a test
     * in future. It must be a single line.
     *
     * This should be called at the top of a test function.
     *
     * For example:
     * |[<!-- language="C" -->
     * static void
     * test_array_sort (void)
     * {
     *   g_test_summary ("Test my_array_sort() sorts the array correctly and stably, "
     *                   "including testing zero length and one-element arrays.");
     *
     *   …
     * }
     * ]|
     *
     * @param summary One or two sentences summarising what the test checks, and how it
     *    checks it.
     * @since 2.62
     */
    public fun testSummary(summary: kotlin.String): Unit = g_test_summary(summary)

    /**
     * Get the number of seconds since the last start of the timer with
     * g_test_timer_start().
     *
     * @return the time since the last start of the timer in seconds, as a double
     * @since 2.16
     */
    public fun testTimerElapsed(): Double = g_test_timer_elapsed()

    /**
     * Report the last result of g_test_timer_elapsed().
     *
     * @return the last result of g_test_timer_elapsed(), as a double
     * @since 2.16
     */
    public fun testTimerLast(): Double = g_test_timer_last()

    /**
     * Start a timing test. Call g_test_timer_elapsed() when the task is supposed
     * to be done. Call this function again to restart the timer.
     *
     * @since 2.16
     */
    public fun testTimerStart(): Unit = g_test_timer_start()

    /**
     *
     *
     * @param domain
     * @param file
     * @param line
     * @param func
     * @param assertionFlags
     * @param pattern
     */
    public fun testTrapAssertions(
        domain: kotlin.String,
        `file`: kotlin.String,
        line: Int,
        func: kotlin.String,
        assertionFlags: ULong,
        pattern: kotlin.String,
    ): Unit = g_test_trap_assertions(domain, `file`, line, func, assertionFlags, pattern)

    /**
     * Fork the current test program to execute a test case that might
     * not return or that might abort.
     *
     * If @usec_timeout is non-0, the forked test case is aborted and
     * considered failing if its run time exceeds it.
     *
     * The forking behavior can be configured with the #GTestTrapFlags flags.
     *
     * In the following example, the test code forks, the forked child
     * process produces some sample output and exits successfully.
     * The forking parent process then asserts successful child program
     * termination and validates child program outputs.
     *
     * |[<!-- language="C" -->
     *   static void
     *   test_fork_patterns (void)
     *   {
     *     if (g_test_trap_fork (0, G_TEST_TRAP_SILENCE_STDOUT | G_TEST_TRAP_SILENCE_STDERR))
     *       {
     *         g_print ("some stdout text: somagic17\n");
     *         g_printerr ("some stderr text: semagic43\n");
     *         exit (0); // successful test run
     *       }
     *     g_test_trap_assert_passed ();
     *     g_test_trap_assert_stdout ("*somagic17*");
     *     g_test_trap_assert_stderr ("*semagic43*");
     *   }
     * ]|
     *
     * @param usecTimeout Timeout for the forked test in micro seconds.
     * @param testTrapFlags Flags to modify forking behaviour.
     * @return true for the forked child and false for the executing parent process.
     * @since 2.16
     */
    public fun testTrapFork(
        usecTimeout: ULong,
        testTrapFlags: TestTrapFlags,
    ): Boolean = g_test_trap_fork(usecTimeout, testTrapFlags.mask).asBoolean()

    /**
     * Check the result of the last g_test_trap_subprocess() call.
     *
     * @return true if the last test subprocess terminated successfully.
     * @since 2.16
     */
    public fun testTrapHasPassed(): Boolean = g_test_trap_has_passed().asBoolean()

    /**
     * Check the result of the last g_test_trap_subprocess() call.
     *
     * @return true if the last test subprocess got killed due to a timeout.
     * @since 2.16
     */
    public fun testTrapReachedTimeout(): Boolean = g_test_trap_reached_timeout().asBoolean()

    /**
     * Respawns the test program to run only @test_path in a subprocess.
     * This can be used for a test case that might not return, or that
     * might abort.
     *
     * If @test_path is null then the same test is re-run in a subprocess.
     * You can use g_test_subprocess() to determine whether the test is in
     * a subprocess or not.
     *
     * @test_path can also be the name of the parent test, followed by
     * "`/subprocess/`" and then a name for the specific subtest (or just
     * ending with "`/subprocess`" if the test only has one child test);
     * tests with names of this form will automatically be skipped in the
     * parent process.
     *
     * If @usec_timeout is non-0, the test subprocess is aborted and
     * considered failing if its run time exceeds it.
     *
     * The subprocess behavior can be configured with the
     * #GTestSubprocessFlags flags.
     *
     * You can use methods such as g_test_trap_assert_passed(),
     * g_test_trap_assert_failed(), and g_test_trap_assert_stderr() to
     * check the results of the subprocess. (But note that
     * g_test_trap_assert_stdout() and g_test_trap_assert_stderr()
     * cannot be used if @test_flags specifies that the child should
     * inherit the parent stdout/stderr.)
     *
     * If your `main ()` needs to behave differently in
     * the subprocess, you can call g_test_subprocess() (after calling
     * g_test_init()) to see whether you are in a subprocess.
     *
     * The following example tests that calling
     * `my_object_new(1000000)` will abort with an error
     * message.
     *
     * |[<!-- language="C" -->
     *   static void
     *   test_create_large_object (void)
     *   {
     *     if (g_test_subprocess ())
     *       {
     *         my_object_new (1000000);
     *         return;
     *       }
     *
     *     // Reruns this same test in a subprocess
     *     g_test_trap_subprocess (NULL, 0, 0);
     *     g_test_trap_assert_failed ();
     *     g_test_trap_assert_stderr ("*ERROR*too large*");
     *   }
     *
     *   int
     *   main (int argc, char **argv)
     *   {
     *     g_test_init (&argc, &argv, NULL);
     *
     *     g_test_add_func ("/myobject/create_large_object",
     *                      test_create_large_object);
     *     return g_test_run ();
     *   }
     * ]|
     *
     * @param testPath Test to run in a subprocess
     * @param usecTimeout Timeout for the subprocess test in micro seconds.
     * @param testFlags Flags to modify subprocess behaviour.
     * @since 2.38
     */
    public fun testTrapSubprocess(
        testPath: kotlin.String? = null,
        usecTimeout: ULong,
        testFlags: TestSubprocessFlags,
    ): Unit = g_test_trap_subprocess(testPath, usecTimeout, testFlags.mask)

    public fun threadErrorQuark(): UInt = g_thread_error_quark()

    /**
     * This function will return the maximum @interval that a
     * thread will wait in the thread pool for new tasks before
     * being stopped.
     *
     * If this function returns 0, threads waiting in the thread
     * pool for new work are not stopped.
     *
     * @return the maximum @interval (milliseconds) to wait
     *     for new tasks in the thread pool before stopping the
     *     thread
     * @since 2.10
     */
    public fun threadPoolGetMaxIdleTime(): UInt = g_thread_pool_get_max_idle_time()

    /**
     * Returns the maximal allowed number of unused threads.
     *
     * @return the maximal number of unused threads
     */
    public fun threadPoolGetMaxUnusedThreads(): Int = g_thread_pool_get_max_unused_threads()

    /**
     * Returns the number of currently unused threads.
     *
     * @return the number of currently unused threads
     */
    public fun threadPoolGetNumUnusedThreads(): UInt = g_thread_pool_get_num_unused_threads()

    /**
     * This function will set the maximum @interval that a thread
     * waiting in the pool for new tasks can be idle for before
     * being stopped. This function is similar to calling
     * g_thread_pool_stop_unused_threads() on a regular timeout,
     * except this is done on a per thread basis.
     *
     * By setting @interval to 0, idle threads will not be stopped.
     *
     * The default value is 15000 (15 seconds).
     *
     * @param interval the maximum @interval (in milliseconds)
     *     a thread can be idle
     * @since 2.10
     */
    public fun threadPoolSetMaxIdleTime(interval: UInt): Unit = g_thread_pool_set_max_idle_time(interval)

    /**
     * Sets the maximal number of unused threads to @max_threads.
     * If @max_threads is -1, no limit is imposed on the number
     * of unused threads.
     *
     * The default value is 2.
     *
     * @param maxThreads maximal number of unused threads
     */
    public fun threadPoolSetMaxUnusedThreads(maxThreads: Int): Unit = g_thread_pool_set_max_unused_threads(maxThreads)

    /**
     * Stops all currently unused threads. This does not change the
     * maximal number of unused threads. This function can be used to
     * regularly stop all unused threads e.g. from g_timeout_add().
     */
    public fun threadPoolStopUnusedThreads(): Unit = g_thread_pool_stop_unused_threads()

    /**
     * This function returns the #GThread corresponding to the
     * current thread. Note that this function does not increase
     * the reference count of the returned struct.
     *
     * This function will return a #GThread even for threads that
     * were not created by GLib (i.e. those created by other threading
     * APIs). This may be useful for thread identification purposes
     * (i.e. comparisons) but you must not use GLib functions (such
     * as g_thread_join()) on these threads.
     *
     * @return the #GThread representing the current thread
     */
    public fun threadSelf(): Thread =
        g_thread_self()!!.run {
            Thread(reinterpret())
        }

    /**
     * Causes the calling thread to voluntarily relinquish the CPU, so
     * that other threads can run.
     *
     * This function is often used as a method to make busy wait less evil.
     */
    public fun threadYield(): Unit = g_thread_yield()

    /**
     * Converts a string containing an ISO 8601 encoded date and time
     * to a #GTimeVal and puts it into @time_.
     *
     * @iso_date must include year, month, day, hours, minutes, and
     * seconds. It can optionally include fractions of a second and a time
     * zone indicator. (In the absence of any time zone indication, the
     * timestamp is assumed to be in local time.)
     *
     * Any leading or trailing space in @iso_date is ignored.
     *
     * This function was deprecated, along with #GTimeVal itself, in GLib 2.62.
     * Equivalent functionality is available using code like:
     * |[
     * GDateTime *dt = g_date_time_new_from_iso8601 (iso8601_string, NULL);
     * gint64 time_val = g_date_time_to_unix (dt);
     * g_date_time_unref (dt);
     * ]|
     *
     * @param isoDate an ISO 8601 encoded date string
     * @param time a #GTimeVal
     * @return true if the conversion was successful.
     * @since 2.12
     */
    public fun timeValFromIso8601(
        isoDate: kotlin.String,
        time: TimeVal,
    ): Boolean = g_time_val_from_iso8601(isoDate, time.glibTimeValPointer).asBoolean()

    /**
     * Sets a function to be called at regular intervals, with the given
     * priority.  The function is called repeatedly until it returns
     * false, at which point the timeout is automatically destroyed and
     * the function will not be called again.  The @notify function is
     * called when the timeout is destroyed.  The first call to the
     * function will be at the end of the first @interval.
     *
     * Note that timeout functions may be delayed, due to the processing of other
     * event sources. Thus they should not be relied on for precise timing.
     * After each call to the timeout function, the time of the next
     * timeout is recalculated based on the current time and the given interval
     * (it does not try to 'catch up' time lost in delays).
     *
     * See [memory management of sources][mainloop-memory-management] for details
     * on how to handle the return value and memory management of @data.
     *
     * This internally creates a main loop source using g_timeout_source_new()
     * and attaches it to the global #GMainContext using g_source_attach(), so
     * the callback will be invoked in whichever thread is running that main
     * context. You can do these steps manually if you need greater control or to
     * use a custom main context.
     *
     * The interval given is in terms of monotonic time, not wall clock time.
     * See g_get_monotonic_time().
     *
     * @param priority the priority of the timeout source. Typically this will be in
     *   the range between %G_PRIORITY_DEFAULT and %G_PRIORITY_HIGH.
     * @param interval the time between calls to the function, in milliseconds
     *   (1/1000ths of a second)
     * @param function function to call
     * @return the ID (greater than 0) of the event source.
     */
    public fun timeoutAdd(
        priority: Int,
        interval: UInt,
        function: SourceFunc,
    ): UInt =
        g_timeout_add_full(
            priority,
            interval,
            SourceFuncFunc.reinterpret(),
            StableRef.create(function).asCPointer(),
            staticStableRefDestroy.reinterpret()
        )

    /**
     * Sets a function to be called at regular intervals, with @priority.
     *
     * The function is called repeatedly until it returns %G_SOURCE_REMOVE
     * or false, at which point the timeout is automatically destroyed and
     * the function will not be called again.
     *
     * Unlike g_timeout_add(), this function operates at whole second granularity.
     * The initial starting point of the timer is determined by the implementation
     * and the implementation is expected to group multiple timers together so that
     * they fire all at the same time. To allow this grouping, the @interval to the
     * first timer is rounded and can deviate up to one second from the specified
     * interval. Subsequent timer iterations will generally run at the specified
     * interval.
     *
     * Note that timeout functions may be delayed, due to the processing of other
     * event sources. Thus they should not be relied on for precise timing.
     * After each call to the timeout function, the time of the next
     * timeout is recalculated based on the current time and the given @interval
     *
     * See [memory management of sources][mainloop-memory-management] for details
     * on how to handle the return value and memory management of @data.
     *
     * If you want timing more precise than whole seconds, use g_timeout_add()
     * instead.
     *
     * The grouping of timers to fire at the same time results in a more power
     * and CPU efficient behavior so if your timer is in multiples of seconds
     * and you don't require the first timer exactly one second from now, the
     * use of g_timeout_add_seconds() is preferred over g_timeout_add().
     *
     * This internally creates a main loop source using
     * g_timeout_source_new_seconds() and attaches it to the main loop context
     * using g_source_attach(). You can do these steps manually if you need
     * greater control.
     *
     * It is safe to call this function from any thread.
     *
     * The interval given is in terms of monotonic time, not wall clock
     * time.  See g_get_monotonic_time().
     *
     * @param priority the priority of the timeout source. Typically this will be in
     *   the range between %G_PRIORITY_DEFAULT and %G_PRIORITY_HIGH.
     * @param interval the time between calls to the function, in seconds
     * @param function function to call
     * @return the ID (greater than 0) of the event source.
     * @since 2.14
     */
    public fun timeoutAddSeconds(
        priority: Int,
        interval: UInt,
        function: SourceFunc,
    ): UInt =
        g_timeout_add_seconds_full(
            priority,
            interval,
            SourceFuncFunc.reinterpret(),
            StableRef.create(function).asCPointer(),
            staticStableRefDestroy.reinterpret()
        )

    /**
     * Creates a new timeout source.
     *
     * The source will not initially be associated with any #GMainContext
     * and must be added to one with g_source_attach() before it will be
     * executed.
     *
     * The interval given is in terms of monotonic time, not wall clock
     * time.  See g_get_monotonic_time().
     *
     * @param interval the timeout interval in milliseconds.
     * @return the newly-created timeout source
     */
    public fun timeoutSourceNew(interval: UInt): Source =
        g_timeout_source_new(interval)!!.run {
            Source(reinterpret())
        }

    /**
     * Creates a new timeout source.
     *
     * The source will not initially be associated with any #GMainContext
     * and must be added to one with g_source_attach() before it will be
     * executed.
     *
     * The scheduling granularity/accuracy of this timeout source will be
     * in seconds.
     *
     * The interval given is in terms of monotonic time, not wall clock time.
     * See g_get_monotonic_time().
     *
     * @param interval the timeout interval in seconds
     * @return the newly-created timeout source
     * @since 2.14
     */
    public fun timeoutSourceNewSeconds(interval: UInt): Source =
        g_timeout_source_new_seconds(interval)!!.run {
            Source(reinterpret())
        }

    /**
     * Determines the break type of @c. @c should be a Unicode character
     * (to derive a character from UTF-8 encoded text, use
     * g_utf8_get_char()). The break type is used to find word and line
     * breaks ("text boundaries"), Pango implements the Unicode boundary
     * resolution algorithms and normally you would use a function such
     * as pango_break() instead of caring about break types yourself.
     *
     * @param c a Unicode character
     * @return the break type of @c
     */
    public fun unicharBreakType(c: UInt): UnicodeBreakType =
        g_unichar_break_type(c).run {
            UnicodeBreakType.fromNativeValue(this)
        }

    /**
     * Determines the canonical combining class of a Unicode character.
     *
     * @param uc a Unicode character
     * @return the combining class of the character
     * @since 2.14
     */
    public fun unicharCombiningClass(uc: UInt): Int = g_unichar_combining_class(uc)

    /**
     * Determines the numeric value of a character as a decimal
     * digit.
     *
     * @param c a Unicode character
     * @return If @c is a decimal digit (according to
     * g_unichar_isdigit()), its numeric value. Otherwise, -1.
     */
    public fun unicharDigitValue(c: UInt): Int = g_unichar_digit_value(c)

    /**
     * Looks up the #GUnicodeScript for a particular character (as defined
     * by Unicode Standard Annex \#24). No check is made for @ch being a
     * valid Unicode character; if you pass in invalid character, the
     * result is undefined.
     *
     * This function is equivalent to pango_script_for_unichar() and the
     * two are interchangeable.
     *
     * @param ch a Unicode character
     * @return the #GUnicodeScript for the character.
     * @since 2.14
     */
    public fun unicharGetScript(ch: UInt): UnicodeScript =
        g_unichar_get_script(ch).run {
            UnicodeScript.fromNativeValue(this)
        }

    /**
     * Determines whether a character is alphanumeric.
     * Given some UTF-8 text, obtain a character value
     * with g_utf8_get_char().
     *
     * @param c a Unicode character
     * @return true if @c is an alphanumeric character
     */
    public fun unicharIsalnum(c: UInt): Boolean = g_unichar_isalnum(c).asBoolean()

    /**
     * Determines whether a character is alphabetic (i.e. a letter).
     * Given some UTF-8 text, obtain a character value with
     * g_utf8_get_char().
     *
     * @param c a Unicode character
     * @return true if @c is an alphabetic character
     */
    public fun unicharIsalpha(c: UInt): Boolean = g_unichar_isalpha(c).asBoolean()

    /**
     * Determines whether a character is a control character.
     * Given some UTF-8 text, obtain a character value with
     * g_utf8_get_char().
     *
     * @param c a Unicode character
     * @return true if @c is a control character
     */
    public fun unicharIscntrl(c: UInt): Boolean = g_unichar_iscntrl(c).asBoolean()

    /**
     * Determines if a given character is assigned in the Unicode
     * standard.
     *
     * @param c a Unicode character
     * @return true if the character has an assigned value
     */
    public fun unicharIsdefined(c: UInt): Boolean = g_unichar_isdefined(c).asBoolean()

    /**
     * Determines whether a character is numeric (i.e. a digit).  This
     * covers ASCII 0-9 and also digits in other languages/scripts.  Given
     * some UTF-8 text, obtain a character value with g_utf8_get_char().
     *
     * @param c a Unicode character
     * @return true if @c is a digit
     */
    public fun unicharIsdigit(c: UInt): Boolean = g_unichar_isdigit(c).asBoolean()

    /**
     * Determines whether a character is printable and not a space
     * (returns false for control characters, format characters, and
     * spaces). g_unichar_isprint() is similar, but returns true for
     * spaces. Given some UTF-8 text, obtain a character value with
     * g_utf8_get_char().
     *
     * @param c a Unicode character
     * @return true if @c is printable unless it's a space
     */
    public fun unicharIsgraph(c: UInt): Boolean = g_unichar_isgraph(c).asBoolean()

    /**
     * Determines whether a character is a lowercase letter.
     * Given some UTF-8 text, obtain a character value with
     * g_utf8_get_char().
     *
     * @param c a Unicode character
     * @return true if @c is a lowercase letter
     */
    public fun unicharIslower(c: UInt): Boolean = g_unichar_islower(c).asBoolean()

    /**
     * Determines whether a character is a mark (non-spacing mark,
     * combining mark, or enclosing mark in Unicode speak).
     * Given some UTF-8 text, obtain a character value
     * with g_utf8_get_char().
     *
     * Note: in most cases where isalpha characters are allowed,
     * ismark characters should be allowed to as they are essential
     * for writing most European languages as well as many non-Latin
     * scripts.
     *
     * @param c a Unicode character
     * @return true if @c is a mark character
     * @since 2.14
     */
    public fun unicharIsmark(c: UInt): Boolean = g_unichar_ismark(c).asBoolean()

    /**
     * Determines whether a character is printable.
     * Unlike g_unichar_isgraph(), returns true for spaces.
     * Given some UTF-8 text, obtain a character value with
     * g_utf8_get_char().
     *
     * @param c a Unicode character
     * @return true if @c is printable
     */
    public fun unicharIsprint(c: UInt): Boolean = g_unichar_isprint(c).asBoolean()

    /**
     * Determines whether a character is punctuation or a symbol.
     * Given some UTF-8 text, obtain a character value with
     * g_utf8_get_char().
     *
     * @param c a Unicode character
     * @return true if @c is a punctuation or symbol character
     */
    public fun unicharIspunct(c: UInt): Boolean = g_unichar_ispunct(c).asBoolean()

    /**
     * Determines whether a character is a space, tab, or line separator
     * (newline, carriage return, etc.).  Given some UTF-8 text, obtain a
     * character value with g_utf8_get_char().
     *
     * (Note: don't use this to do word breaking; you have to use
     * Pango or equivalent to get word breaking right, the algorithm
     * is fairly complex.)
     *
     * @param c a Unicode character
     * @return true if @c is a space character
     */
    public fun unicharIsspace(c: UInt): Boolean = g_unichar_isspace(c).asBoolean()

    /**
     * Determines if a character is titlecase. Some characters in
     * Unicode which are composites, such as the DZ digraph
     * have three case variants instead of just two. The titlecase
     * form is used at the beginning of a word where only the
     * first letter is capitalized. The titlecase form of the DZ
     * digraph is U+01F2 LATIN CAPITAL LETTTER D WITH SMALL LETTER Z.
     *
     * @param c a Unicode character
     * @return true if the character is titlecase
     */
    public fun unicharIstitle(c: UInt): Boolean = g_unichar_istitle(c).asBoolean()

    /**
     * Determines if a character is uppercase.
     *
     * @param c a Unicode character
     * @return true if @c is an uppercase character
     */
    public fun unicharIsupper(c: UInt): Boolean = g_unichar_isupper(c).asBoolean()

    /**
     * Determines if a character is typically rendered in a double-width
     * cell.
     *
     * @param c a Unicode character
     * @return true if the character is wide
     */
    public fun unicharIswide(c: UInt): Boolean = g_unichar_iswide(c).asBoolean()

    /**
     * Determines if a character is typically rendered in a double-width
     * cell under legacy East Asian locales.  If a character is wide according to
     * g_unichar_iswide(), then it is also reported wide with this function, but
     * the converse is not necessarily true. See the
     * [Unicode Standard Annex #11](http://www.unicode.org/reports/tr11/)
     * for details.
     *
     * If a character passes the g_unichar_iswide() test then it will also pass
     * this test, but not the other way around.  Note that some characters may
     * pass both this test and g_unichar_iszerowidth().
     *
     * @param c a Unicode character
     * @return true if the character is wide in legacy East Asian locales
     * @since 2.12
     */
    public fun unicharIswideCjk(c: UInt): Boolean = g_unichar_iswide_cjk(c).asBoolean()

    /**
     * Determines if a character is a hexadecimal digit.
     *
     * @param c a Unicode character.
     * @return true if the character is a hexadecimal digit
     */
    public fun unicharIsxdigit(c: UInt): Boolean = g_unichar_isxdigit(c).asBoolean()

    /**
     * Determines if a given character typically takes zero width when rendered.
     * The return value is true for all non-spacing and enclosing marks
     * (e.g., combining accents), format characters, zero-width
     * space, but not U+00AD SOFT HYPHEN.
     *
     * A typical use of this function is with one of g_unichar_iswide() or
     * g_unichar_iswide_cjk() to determine the number of cells a string occupies
     * when displayed on a grid display (terminals).  However, note that not all
     * terminals support zero-width rendering of zero-width marks.
     *
     * @param c a Unicode character
     * @return true if the character has zero width
     * @since 2.14
     */
    public fun unicharIszerowidth(c: UInt): Boolean = g_unichar_iszerowidth(c).asBoolean()

    /**
     * Converts a character to lower case.
     *
     * @param c a Unicode character.
     * @return the result of converting @c to lower case.
     *               If @c is not an upperlower or titlecase character,
     *               or has no lowercase equivalent @c is returned unchanged.
     */
    public fun unicharTolower(c: UInt): UInt = g_unichar_tolower(c)

    /**
     * Converts a character to the titlecase.
     *
     * @param c a Unicode character
     * @return the result of converting @c to titlecase.
     *               If @c is not an uppercase or lowercase character,
     *               @c is returned unchanged.
     */
    public fun unicharTotitle(c: UInt): UInt = g_unichar_totitle(c)

    /**
     * Converts a character to uppercase.
     *
     * @param c a Unicode character
     * @return the result of converting @c to uppercase.
     *               If @c is not a lowercase or titlecase character,
     *               or has no upper case equivalent @c is returned unchanged.
     */
    public fun unicharToupper(c: UInt): UInt = g_unichar_toupper(c)

    /**
     * Classifies a Unicode character by type.
     *
     * @param c a Unicode character
     * @return the type of the character.
     */
    public fun unicharType(c: UInt): UnicodeType =
        g_unichar_type(c).run {
            UnicodeType.fromNativeValue(this)
        }

    /**
     * Checks whether @ch is a valid Unicode character. Some possible
     * integer values of @ch will not be valid. 0 is considered a valid
     * character, though it's normally a string terminator.
     *
     * @param ch a Unicode character
     * @return true if @ch is a valid Unicode character
     */
    public fun unicharValidate(ch: UInt): Boolean = g_unichar_validate(ch).asBoolean()

    /**
     * Determines the numeric value of a character as a hexadecimal
     * digit.
     *
     * @param c a Unicode character
     * @return If @c is a hex digit (according to
     * g_unichar_isxdigit()), its numeric value. Otherwise, -1.
     */
    public fun unicharXdigitValue(c: UInt): Int = g_unichar_xdigit_value(c)

    /**
     * Looks up the Unicode script for @iso15924.  ISO 15924 assigns four-letter
     * codes to scripts.  For example, the code for Arabic is 'Arab'.
     * This function accepts four letter codes encoded as a @guint32 in a
     * big-endian fashion.  That is, the code expected for Arabic is
     * 0x41726162 (0x41 is ASCII code for 'A', 0x72 is ASCII code for 'r', etc).
     *
     * See
     * [Codes for the representation of names of
     * scripts](http://unicode.org/iso15924/codelists.html)
     * for details.
     *
     * @param iso15924 a Unicode script
     * @return the Unicode script for @iso15924, or
     *   of %G_UNICODE_SCRIPT_INVALID_CODE if @iso15924 is zero and
     *   %G_UNICODE_SCRIPT_UNKNOWN if @iso15924 is unknown.
     * @since 2.30
     */
    public fun unicodeScriptFromIso15924(iso15924: UInt): UnicodeScript =
        g_unicode_script_from_iso15924(iso15924).run {
            UnicodeScript.fromNativeValue(this)
        }

    /**
     * Looks up the ISO 15924 code for @script.  ISO 15924 assigns four-letter
     * codes to scripts.  For example, the code for Arabic is 'Arab'.  The
     * four letter codes are encoded as a @guint32 by this function in a
     * big-endian fashion.  That is, the code returned for Arabic is
     * 0x41726162 (0x41 is ASCII code for 'A', 0x72 is ASCII code for 'r', etc).
     *
     * See
     * [Codes for the representation of names of
     * scripts](http://unicode.org/iso15924/codelists.html)
     * for details.
     *
     * @param script a Unicode script
     * @return the ISO 15924 code for @script, encoded as an integer,
     *   of zero if @script is %G_UNICODE_SCRIPT_INVALID_CODE or
     *   ISO 15924 code 'Zzzz' (script code for UNKNOWN) if @script is not understood.
     * @since 2.30
     */
    public fun unicodeScriptToIso15924(script: UnicodeScript): UInt = g_unicode_script_to_iso15924(script.nativeValue)

    public fun unixErrorQuark(): UInt = g_unix_error_quark()

    /**
     * Sets a function to be called when the IO condition, as specified by
     * @condition becomes true for @fd.
     *
     * This is the same as g_unix_fd_add(), except that it allows you to
     * specify a non-default priority and a provide a #GDestroyNotify for
     * @user_data.
     *
     * @param priority the priority of the source
     * @param fd a file descriptor
     * @param condition IO conditions to watch for on @fd
     * @param function a #GUnixFDSourceFunc
     * @return the ID (greater than 0) of the event source
     * @since 2.36
     */
    public fun unixFdAddFull(
        priority: Int,
        fd: Int,
        condition: IOCondition,
        function: UnixFDSourceFunc,
    ): UInt =
        g_unix_fd_add_full(
            priority,
            fd,
            condition.mask,
            UnixFDSourceFuncFunc.reinterpret(),
            StableRef.create(function).asCPointer(),
            staticStableRefDestroy.reinterpret()
        )

    /**
     * Creates a #GSource to watch for a particular IO condition on a file
     * descriptor.
     *
     * The source will never close the fd -- you must do it yourself.
     *
     * @param fd a file descriptor
     * @param condition IO conditions to watch for on @fd
     * @return the newly created #GSource
     * @since 2.36
     */
    public fun unixFdSourceNew(
        fd: Int,
        condition: IOCondition,
    ): Source =
        g_unix_fd_source_new(
            fd,
            condition.mask
        )!!.run {
            Source(reinterpret())
        }

    /**
     * Control the non-blocking state of the given file descriptor,
     * according to @nonblock. On most systems this uses %O_NONBLOCK, but
     * on some older ones may use %O_NDELAY.
     *
     * @param fd A file descriptor
     * @param nonblock If true, set the descriptor to be non-blocking
     * @return true if successful
     * @since 2.30
     */
    public fun unixSetFdNonblocking(
        fd: Int,
        nonblock: Boolean,
    ): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_unix_set_fd_nonblocking(fd, nonblock.asGBoolean(), gError.ptr).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(org.gtkkn.bindings.glib.Glib.resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * A convenience function for g_unix_signal_source_new(), which
     * attaches to the default #GMainContext.  You can remove the watch
     * using g_source_remove().
     *
     * @param priority the priority of the signal source. Typically this will be in
     *            the range between %G_PRIORITY_DEFAULT and %G_PRIORITY_HIGH.
     * @param signum Signal number
     * @param handler Callback
     * @return An ID (greater than 0) for the event source
     * @since 2.30
     */
    public fun unixSignalAdd(
        priority: Int,
        signum: Int,
        handler: SourceFunc,
    ): UInt =
        g_unix_signal_add_full(
            priority,
            signum,
            SourceFuncFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret()
        )

    /**
     * Create a #GSource that will be dispatched upon delivery of the UNIX
     * signal @signum.  In GLib versions before 2.36, only `SIGHUP`, `SIGINT`,
     * `SIGTERM` can be monitored.  In GLib 2.36, `SIGUSR1` and `SIGUSR2`
     * were added. In GLib 2.54, `SIGWINCH` was added.
     *
     * Note that unlike the UNIX default, all sources which have created a
     * watch will be dispatched, regardless of which underlying thread
     * invoked g_unix_signal_source_new().
     *
     * For example, an effective use of this function is to handle `SIGTERM`
     * cleanly; flushing any outstanding files, and then calling
     * g_main_loop_quit ().  It is not safe to do any of this a regular
     * UNIX signal handler; your handler may be invoked while malloc() or
     * another library function is running, causing reentrancy if you
     * attempt to use it from the handler.  None of the GLib/GObject API
     * is safe against this kind of reentrancy.
     *
     * The interaction of this source when combined with native UNIX
     * functions like sigprocmask() is not defined.
     *
     * The source will not initially be associated with any #GMainContext
     * and must be added to one with g_source_attach() before it will be
     * executed.
     *
     * @param signum A signal number
     * @return A newly created #GSource
     * @since 2.30
     */
    public fun unixSignalSourceNew(signum: Int): Source =
        g_unix_signal_source_new(signum)!!.run {
            Source(reinterpret())
        }

    /**
     * A wrapper for the POSIX unlink() function. The unlink() function
     * deletes a name from the filesystem. If this was the last link to the
     * file and no processes have it opened, the diskspace occupied by the
     * file is freed.
     *
     * See your C library manual for more details about unlink(). Note
     * that on Windows, it is in general not possible to delete files that
     * are open to some process, or mapped into memory.
     *
     * @param filename a pathname in the GLib file name encoding
     *     (UTF-8 on Windows)
     * @return 0 if the name was successfully deleted, -1 if an error
     *    occurred
     * @since 2.6
     */
    public fun unlink(filename: kotlin.String): Int = g_unlink(filename)

    /**
     * Removes an environment variable from the environment.
     *
     * Note that on some systems, when variables are overwritten, the
     * memory used for the previous variables and its value isn't reclaimed.
     *
     * You should be mindful of the fact that environment variable handling
     * in UNIX is not thread-safe, and your program may crash if one thread
     * calls g_unsetenv() while another thread is calling getenv(). (And note
     * that many functions, such as gettext(), call getenv() internally.) This
     * function is only safe to use at the very start of your program, before
     * creating any other threads (or creating objects that create worker
     * threads of their own).
     *
     * If you need to set up the environment for a child process, you can
     * use g_get_environ() to get an environment array, modify that with
     * g_environ_setenv() and g_environ_unsetenv(), and then pass that
     * array directly to execvpe(), g_spawn_async(), or the like.
     *
     * @param variable the environment variable to remove, must
     *     not contain '='
     * @since 2.4
     */
    public fun unsetenv(variable: kotlin.String): Unit = g_unsetenv(variable)

    /**
     * Creates a new #GUri from the given components according to @flags.
     *
     * See also g_uri_build_with_user(), which allows specifying the
     * components of the "userinfo" separately.
     *
     * @param flags flags describing how to build the #GUri
     * @param scheme the URI scheme
     * @param userinfo the userinfo component, or null
     * @param host the host component, or null
     * @param port the port, or `-1`
     * @param path the path component
     * @param query the query component, or null
     * @param fragment the fragment, or null
     * @return a new #GUri
     * @since 2.66
     */
    public fun uriBuild(
        flags: UriFlags,
        scheme: kotlin.String,
        userinfo: kotlin.String? = null,
        host: kotlin.String? = null,
        port: Int,
        path: kotlin.String,
        query: kotlin.String? = null,
        fragment: kotlin.String? = null,
    ): Uri =
        g_uri_build(flags.mask, scheme, userinfo, host, port, path, query, fragment)!!.run {
            Uri(reinterpret())
        }

    /**
     * Creates a new #GUri from the given components according to @flags
     * (%G_URI_FLAGS_HAS_PASSWORD is added unconditionally). The @flags must be
     * coherent with the passed values, in particular use `%`-encoded values with
     * %G_URI_FLAGS_ENCODED.
     *
     * In contrast to g_uri_build(), this allows specifying the components
     * of the ‘userinfo’ field separately. Note that @user must be non-null
     * if either @password or @auth_params is non-null.
     *
     * @param flags flags describing how to build the #GUri
     * @param scheme the URI scheme
     * @param user the user component of the userinfo, or null
     * @param password the password component of the userinfo, or null
     * @param authParams the auth params of the userinfo, or null
     * @param host the host component, or null
     * @param port the port, or `-1`
     * @param path the path component
     * @param query the query component, or null
     * @param fragment the fragment, or null
     * @return a new #GUri
     * @since 2.66
     */
    public fun uriBuildWithUser(
        flags: UriFlags,
        scheme: kotlin.String,
        user: kotlin.String? = null,
        password: kotlin.String? = null,
        authParams: kotlin.String? = null,
        host: kotlin.String? = null,
        port: Int,
        path: kotlin.String,
        query: kotlin.String? = null,
        fragment: kotlin.String? = null,
    ): Uri =
        g_uri_build_with_user(
            flags.mask, scheme, user, password, authParams, host, port, path,
            query, fragment
        )!!.run {
            Uri(reinterpret())
        }

    public fun uriErrorQuark(): UInt = g_uri_error_quark()

    /**
     * Escapes a string for use in a URI.
     *
     * Normally all characters that are not "unreserved" (i.e. ASCII
     * alphanumerical characters plus dash, dot, underscore and tilde) are
     * escaped. But if you specify characters in @reserved_chars_allowed
     * they are not escaped. This is useful for the "reserved" characters
     * in the URI specification, since those are allowed unescaped in some
     * portions of a URI.
     *
     * @param unescaped the unescaped input string.
     * @param reservedCharsAllowed a string of reserved
     *   characters that are allowed to be used, or null.
     * @param allowUtf8 true if the result can include UTF-8 characters.
     * @return an escaped version of @unescaped. The
     * returned string should be freed when no longer needed.
     * @since 2.16
     */
    public fun uriEscapeString(
        unescaped: kotlin.String,
        reservedCharsAllowed: kotlin.String? = null,
        allowUtf8: Boolean,
    ): kotlin.String =
        g_uri_escape_string(
            unescaped, reservedCharsAllowed,
            allowUtf8.asGBoolean()
        )?.toKString() ?: error("Expected not null string")

    /**
     * Parses @uri_string according to @flags, to determine whether it is a valid
     * [absolute URI][relative-absolute-uris], i.e. it does not need to be resolved
     * relative to another URI using g_uri_parse_relative().
     *
     * If it’s not a valid URI, an error is returned explaining how it’s invalid.
     *
     * See g_uri_split(), and the definition of #GUriFlags, for more
     * information on the effect of @flags.
     *
     * @param uriString a string containing an absolute URI
     * @param flags flags for parsing @uri_string
     * @return true if @uri_string is a valid absolute URI, false on error.
     * @since 2.66
     */
    public fun uriIsValid(
        uriString: kotlin.String,
        flags: UriFlags,
    ): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_uri_is_valid(uriString, flags.mask, gError.ptr).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(org.gtkkn.bindings.glib.Glib.resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Joins the given components together according to @flags to create
     * an absolute URI string. @path may not be null (though it may be the empty
     * string).
     *
     * When @host is present, @path must either be empty or begin with a slash (`/`)
     * character. When @host is not present, @path cannot begin with two slash
     *    characters (`//`). See
     * [RFC 3986, section 3](https://tools.ietf.org/html/rfc3986#section-3).
     *
     * See also g_uri_join_with_user(), which allows specifying the
     * components of the ‘userinfo’ separately.
     *
     * %G_URI_FLAGS_HAS_PASSWORD and %G_URI_FLAGS_HAS_AUTH_PARAMS are ignored if set
     * in @flags.
     *
     * @param flags flags describing how to build the URI string
     * @param scheme the URI scheme, or null
     * @param userinfo the userinfo component, or null
     * @param host the host component, or null
     * @param port the port, or `-1`
     * @param path the path component
     * @param query the query component, or null
     * @param fragment the fragment, or null
     * @return an absolute URI string
     * @since 2.66
     */
    public fun uriJoin(
        flags: UriFlags,
        scheme: kotlin.String? = null,
        userinfo: kotlin.String? = null,
        host: kotlin.String? = null,
        port: Int,
        path: kotlin.String,
        query: kotlin.String? = null,
        fragment: kotlin.String? = null,
    ): kotlin.String =
        g_uri_join(
            flags.mask, scheme, userinfo, host, port, path, query,
            fragment
        )?.toKString() ?: error("Expected not null string")

    /**
     * Joins the given components together according to @flags to create
     * an absolute URI string. @path may not be null (though it may be the empty
     * string).
     *
     * In contrast to g_uri_join(), this allows specifying the components
     * of the ‘userinfo’ separately. It otherwise behaves the same.
     *
     * %G_URI_FLAGS_HAS_PASSWORD and %G_URI_FLAGS_HAS_AUTH_PARAMS are ignored if set
     * in @flags.
     *
     * @param flags flags describing how to build the URI string
     * @param scheme the URI scheme, or null
     * @param user the user component of the userinfo, or null
     * @param password the password component of the userinfo, or
     *   null
     * @param authParams the auth params of the userinfo, or
     *   null
     * @param host the host component, or null
     * @param port the port, or `-1`
     * @param path the path component
     * @param query the query component, or null
     * @param fragment the fragment, or null
     * @return an absolute URI string
     * @since 2.66
     */
    public fun uriJoinWithUser(
        flags: UriFlags,
        scheme: kotlin.String? = null,
        user: kotlin.String? = null,
        password: kotlin.String? = null,
        authParams: kotlin.String? = null,
        host: kotlin.String? = null,
        port: Int,
        path: kotlin.String,
        query: kotlin.String? = null,
        fragment: kotlin.String? = null,
    ): kotlin.String =
        g_uri_join_with_user(
            flags.mask, scheme, user, password, authParams, host,
            port, path, query, fragment
        )?.toKString() ?: error("Expected not null string")

    /**
     * Splits an URI list conforming to the text/uri-list
     * mime type defined in RFC 2483 into individual URIs,
     * discarding any comments. The URIs are not validated.
     *
     * @param uriList an URI list
     * @return a newly allocated null-terminated list
     *   of strings holding the individual URIs. The array should be freed
     *   with g_strfreev().
     * @since 2.6
     */
    public fun uriListExtractUris(uriList: kotlin.String): List<kotlin.String> =
        g_uri_list_extract_uris(uriList)?.toKStringList()
            ?: error("Expected not null string array")

    /**
     * Parses @uri_string according to @flags. If the result is not a
     * valid [absolute URI][relative-absolute-uris], it will be discarded, and an
     * error returned.
     *
     * @param uriString a string representing an absolute URI
     * @param flags flags describing how to parse @uri_string
     * @return a new #GUri, or NULL on error.
     * @since 2.66
     */
    public fun uriParse(
        uriString: kotlin.String,
        flags: UriFlags,
    ): Result<Uri> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_uri_parse(uriString, flags.mask, gError.ptr)?.run {
                    Uri(reinterpret())
                }

            return if (gError.pointed != null) {
                Result.failure(org.gtkkn.bindings.glib.Glib.resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * Many URI schemes include one or more attribute/value pairs as part of the URI
     * value. This method can be used to parse them into a hash table. When an
     * attribute has multiple occurrences, the last value is the final returned
     * value. If you need to handle repeated attributes differently, use
     * #GUriParamsIter.
     *
     * The @params string is assumed to still be `%`-encoded, but the returned
     * values will be fully decoded. (Thus it is possible that the returned values
     * may contain `=` or @separators, if the value was encoded in the input.)
     * Invalid `%`-encoding is treated as with the %G_URI_FLAGS_PARSE_RELAXED
     * rules for g_uri_parse(). (However, if @params is the path or query string
     * from a #GUri that was parsed without %G_URI_FLAGS_PARSE_RELAXED and
     * %G_URI_FLAGS_ENCODED, then you already know that it does not contain any
     * invalid encoding.)
     *
     * %G_URI_PARAMS_WWW_FORM is handled as documented for g_uri_params_iter_init().
     *
     * If %G_URI_PARAMS_CASE_INSENSITIVE is passed to @flags, attributes will be
     * compared case-insensitively, so a params string `attr=123&Attr=456` will only
     * return a single attribute–value pair, `Attr=456`. Case will be preserved in
     * the returned attributes.
     *
     * If @params cannot be parsed (for example, it contains two @separators
     * characters in a row), then @error is set and null is returned.
     *
     * @param params a `%`-encoded string containing `attribute=value`
     *   parameters
     * @param length the length of @params, or `-1` if it is nul-terminated
     * @param separators the separator byte character set between parameters. (usually
     *   `&`, but sometimes `;` or both `&;`). Note that this function works on
     *   bytes not characters, so it can't be used to delimit UTF-8 strings for
     *   anything but ASCII characters. You may pass an empty set, in which case
     *   no splitting will occur.
     * @param flags flags to modify the way the parameters are handled.
     * @return
     *     A hash table of attribute/value pairs, with both names and values
     *     fully-decoded; or null on error.
     * @since 2.66
     */
    public fun uriParseParams(
        params: kotlin.String,
        length: Long,
        separators: kotlin.String,
        flags: UriParamsFlags,
    ): Result<HashTable> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_uri_parse_params(params, length, separators, flags.mask, gError.ptr)?.run {
                    HashTable(reinterpret())
                }

            return if (gError.pointed != null) {
                Result.failure(org.gtkkn.bindings.glib.Glib.resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * Gets the scheme portion of a URI string.
     * [RFC 3986](https://tools.ietf.org/html/rfc3986#section-3) decodes the scheme
     * as:
     * |[
     * URI = scheme ":" hier-part [ "?" query ] [ "#" fragment ]
     * ]|
     * Common schemes include `file`, `https`, `svn+ssh`, etc.
     *
     * @param uri a valid URI.
     * @return The ‘scheme’ component of the URI, or
     *     null on error. The returned string should be freed when no longer needed.
     * @since 2.16
     */
    public fun uriParseScheme(uri: kotlin.String): kotlin.String? = g_uri_parse_scheme(uri)?.toKString()

    /**
     * Gets the scheme portion of a URI string.
     * [RFC 3986](https://tools.ietf.org/html/rfc3986#section-3) decodes the scheme
     * as:
     * |[
     * URI = scheme ":" hier-part [ "?" query ] [ "#" fragment ]
     * ]|
     * Common schemes include `file`, `https`, `svn+ssh`, etc.
     *
     * Unlike g_uri_parse_scheme(), the returned scheme is normalized to
     * all-lowercase and does not need to be freed.
     *
     * @param uri a valid URI.
     * @return The ‘scheme’ component of the URI, or
     *     null on error. The returned string is normalized to all-lowercase, and
     *     interned via g_intern_string(), so it does not need to be freed.
     * @since 2.66
     */
    public fun uriPeekScheme(uri: kotlin.String): kotlin.String? = g_uri_peek_scheme(uri)?.toKString()

    /**
     * Parses @uri_ref according to @flags and, if it is a
     * [relative URI][relative-absolute-uris], resolves it relative to
     * @base_uri_string. If the result is not a valid absolute URI, it will be
     * discarded, and an error returned.
     *
     * (If @base_uri_string is null, this just returns @uri_ref, or
     * null if @uri_ref is invalid or not absolute.)
     *
     * @param baseUriString a string representing a base URI
     * @param uriRef a string representing a relative or absolute URI
     * @param flags flags describing how to parse @uri_ref
     * @return the resolved URI string,
     * or NULL on error.
     * @since 2.66
     */
    public fun uriResolveRelative(
        baseUriString: kotlin.String? = null,
        uriRef: kotlin.String,
        flags: UriFlags,
    ): Result<kotlin.String> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_uri_resolve_relative(
                    baseUriString,
                    uriRef,
                    flags.mask,
                    gError.ptr
                )?.toKString()
            return if (gError.pointed != null) {
                Result.failure(org.gtkkn.bindings.glib.Glib.resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * Unescapes a segment of an escaped string as binary data.
     *
     * Note that in contrast to g_uri_unescape_string(), this does allow
     * nul bytes to appear in the output.
     *
     * If any of the characters in @illegal_characters appears as an escaped
     * character in @escaped_string, then that is an error and null will be
     * returned. This is useful if you want to avoid for instance having a slash
     * being expanded in an escaped path element, which might confuse pathname
     * handling.
     *
     * @param escapedString A URI-escaped string
     * @param length the length (in bytes) of @escaped_string to escape, or `-1` if it
     *   is nul-terminated.
     * @param illegalCharacters a string of illegal characters
     *   not to be allowed, or null.
     * @return an unescaped version of @escaped_string
     *     or null on error (if decoding failed, using %G_URI_ERROR_FAILED error
     *     code). The returned #GBytes should be unreffed when no longer needed.
     * @since 2.66
     */
    public fun uriUnescapeBytes(
        escapedString: kotlin.String,
        length: Long,
        illegalCharacters: kotlin.String? = null,
    ): Result<Bytes> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_uri_unescape_bytes(
                    escapedString,
                    length,
                    illegalCharacters,
                    gError.ptr
                )?.run {
                    Bytes(reinterpret())
                }

            return if (gError.pointed != null) {
                Result.failure(org.gtkkn.bindings.glib.Glib.resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * Unescapes a segment of an escaped string.
     *
     * If any of the characters in @illegal_characters or the NUL
     * character appears as an escaped character in @escaped_string, then
     * that is an error and null will be returned. This is useful if you
     * want to avoid for instance having a slash being expanded in an
     * escaped path element, which might confuse pathname handling.
     *
     * Note: `NUL` byte is not accepted in the output, in contrast to
     * g_uri_unescape_bytes().
     *
     * @param escapedString A string, may be null
     * @param escapedStringEnd Pointer to end of @escaped_string,
     *   may be null
     * @param illegalCharacters An optional string of illegal
     *   characters not to be allowed, may be null
     * @return an unescaped version of @escaped_string,
     * or null on error. The returned string should be freed when no longer
     * needed.  As a special case if null is given for @escaped_string, this
     * function will return null.
     * @since 2.16
     */
    public fun uriUnescapeSegment(
        escapedString: kotlin.String? = null,
        escapedStringEnd: kotlin.String? = null,
        illegalCharacters: kotlin.String? = null,
    ): kotlin.String? =
        g_uri_unescape_segment(
            escapedString,
            escapedStringEnd,
            illegalCharacters
        )?.toKString()

    /**
     * Unescapes a whole escaped string.
     *
     * If any of the characters in @illegal_characters or the NUL
     * character appears as an escaped character in @escaped_string, then
     * that is an error and null will be returned. This is useful if you
     * want to avoid for instance having a slash being expanded in an
     * escaped path element, which might confuse pathname handling.
     *
     * @param escapedString an escaped string to be unescaped.
     * @param illegalCharacters a string of illegal characters
     *   not to be allowed, or null.
     * @return an unescaped version of @escaped_string.
     * The returned string should be freed when no longer needed.
     * @since 2.16
     */
    public fun uriUnescapeString(
        escapedString: kotlin.String,
        illegalCharacters: kotlin.String? =
            null,
    ): kotlin.String? =
        g_uri_unescape_string(
            escapedString,
            illegalCharacters
        )?.toKString()

    /**
     * Pauses the current thread for the given number of microseconds.
     *
     * There are 1 million microseconds per second (represented by the
     * %G_USEC_PER_SEC macro). g_usleep() may have limited precision,
     * depending on hardware and operating system; don't rely on the exact
     * length of the sleep.
     *
     * @param microseconds number of microseconds to pause
     */
    public fun usleep(microseconds: ULong): Unit = g_usleep(microseconds)

    /**
     * Parses the string @str and verify if it is a UUID.
     *
     * The function accepts the following syntax:
     *
     * - simple forms (e.g. `f81d4fae-7dec-11d0-a765-00a0c91e6bf6`)
     *
     * Note that hyphens are required within the UUID string itself,
     * as per the aforementioned RFC.
     *
     * @param str a string representing a UUID
     * @return true if @str is a valid UUID, false otherwise.
     * @since 2.52
     */
    public fun uuidStringIsValid(str: kotlin.String): Boolean = g_uuid_string_is_valid(str).asBoolean()

    /**
     * Generates a random UUID (RFC 4122 version 4) as a string. It has the same
     * randomness guarantees as #GRand, so must not be used for cryptographic
     * purposes such as key generation, nonces, salts or one-time pads.
     *
     * @return A string that should be freed with g_free().
     * @since 2.52
     */
    public fun uuidStringRandom(): kotlin.String =
        g_uuid_string_random()?.toKString()
            ?: error("Expected not null string")

    /**
     * Determines if a given string is a valid D-Bus object path.  You
     * should ensure that a string is a valid D-Bus object path before
     * passing it to g_variant_new_object_path().
     *
     * A valid object path starts with `/` followed by zero or more
     * sequences of characters separated by `/` characters.  Each sequence
     * must contain only the characters `[A-Z][a-z][0-9]_`.  No sequence
     * (including the one following the final `/` character) may be empty.
     *
     * @param string a normal C nul-terminated string
     * @return true if @string is a D-Bus object path
     * @since 2.24
     */
    public fun variantIsObjectPath(string: kotlin.String): Boolean = g_variant_is_object_path(string).asBoolean()

    /**
     * Determines if a given string is a valid D-Bus type signature.  You
     * should ensure that a string is a valid D-Bus type signature before
     * passing it to g_variant_new_signature().
     *
     * D-Bus type signatures consist of zero or more definite #GVariantType
     * strings in sequence.
     *
     * @param string a normal C nul-terminated string
     * @return true if @string is a D-Bus type signature
     * @since 2.24
     */
    public fun variantIsSignature(string: kotlin.String): Boolean = g_variant_is_signature(string).asBoolean()

    /**
     * Pretty-prints a message showing the context of a #GVariant parse
     * error within the string for which parsing was attempted.
     *
     * The resulting string is suitable for output to the console or other
     * monospace media where newlines are treated in the usual way.
     *
     * The message will typically look something like one of the following:
     *
     * |[
     * unterminated string constant:
     *   (1, 2, 3, 'abc
     *             ^^^^
     * ]|
     *
     * or
     *
     * |[
     * unable to find a common type:
     *   [1, 2, 3, 'str']
     *    ^        ^^^^^
     * ]|
     *
     * The format of the message may change in a future version.
     *
     * @error must have come from a failed attempt to g_variant_parse() and
     * @source_str must be exactly the same string that caused the error.
     * If @source_str was not nul-terminated when you passed it to
     * g_variant_parse() then you must add nul termination before using this
     * function.
     *
     * @param error a #GError from the #GVariantParseError domain
     * @param sourceStr the string that was given to the parser
     * @return the printed message
     * @since 2.40
     */
    public fun variantParseErrorPrintContext(
        error: Error,
        sourceStr: kotlin.String,
    ): kotlin.String =
        g_variant_parse_error_print_context(error.glibErrorPointer, sourceStr)?.toKString()
            ?: error("Expected not null string")

    public fun variantParseErrorQuark(): UInt = g_variant_parse_error_quark()

    /**
     * Same as g_variant_error_quark().
     */
    public fun variantParserGetErrorQuark(): UInt = g_variant_parser_get_error_quark()

    /**
     *
     *
     * @param arg0
     */
    public fun variantTypeChecked(arg0: kotlin.String): VariantType =
        g_variant_type_checked_(arg0)!!.run {
            VariantType(reinterpret())
        }

    /**
     *
     *
     * @param typeString
     */
    public fun variantTypeStringGetDepth(typeString: kotlin.String): ULong =
        g_variant_type_string_get_depth_(typeString)

    /**
     * Checks if @type_string is a valid GVariant type string.  This call is
     * equivalent to calling g_variant_type_string_scan() and confirming
     * that the following character is a nul terminator.
     *
     * @param typeString a pointer to any string
     * @return true if @type_string is exactly one valid type string
     *
     * Since 2.24
     */
    public fun variantTypeStringIsValid(typeString: kotlin.String): Boolean =
        g_variant_type_string_is_valid(typeString).asBoolean()

    public fun resolveException(error: Error): GlibException {
        val ex =
            when (error.domain) {
                BookmarkFileError.quark() ->
                    BookmarkFileError.fromErrorOrNull(error)
                        ?.let {
                            BookmarkFileErrorException(error, it)
                        }
                ConvertError.quark() ->
                    ConvertError.fromErrorOrNull(error)
                        ?.let {
                            ConvertErrorException(error, it)
                        }
                FileError.quark() ->
                    FileError.fromErrorOrNull(error)
                        ?.let {
                            FileErrorException(error, it)
                        }
                IOChannelError.quark() ->
                    IOChannelError.fromErrorOrNull(error)
                        ?.let {
                            IOChannelErrorException(error, it)
                        }
                KeyFileError.quark() ->
                    KeyFileError.fromErrorOrNull(error)
                        ?.let {
                            KeyFileErrorException(error, it)
                        }
                MarkupError.quark() ->
                    MarkupError.fromErrorOrNull(error)
                        ?.let {
                            MarkupErrorException(error, it)
                        }
                NumberParserError.quark() ->
                    NumberParserError.fromErrorOrNull(error)
                        ?.let {
                            NumberParserErrorException(error, it)
                        }
                OptionError.quark() ->
                    OptionError.fromErrorOrNull(error)
                        ?.let {
                            OptionErrorException(error, it)
                        }
                RegexError.quark() ->
                    RegexError.fromErrorOrNull(error)
                        ?.let {
                            RegexErrorException(error, it)
                        }
                ShellError.quark() ->
                    ShellError.fromErrorOrNull(error)
                        ?.let {
                            ShellErrorException(error, it)
                        }
                SpawnError.quark() ->
                    SpawnError.fromErrorOrNull(error)
                        ?.let {
                            SpawnErrorException(error, it)
                        }
                ThreadError.quark() ->
                    ThreadError.fromErrorOrNull(error)
                        ?.let {
                            ThreadErrorException(error, it)
                        }
                UriError.quark() ->
                    UriError.fromErrorOrNull(error)
                        ?.let {
                            UriErrorException(error, it)
                        }
                VariantParseError.quark() ->
                    VariantParseError.fromErrorOrNull(error)
                        ?.let {
                            VariantParseErrorException(error, it)
                        }
                else -> null
            }
        return ex ?: GlibException(error)
    }
}

public val ChildWatchFuncFunc: CPointer<CFunction<(Int) -> Unit>> =
    staticCFunction {
            waitStatus: Int,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(waitStatus: Int) -> Unit>().get().invoke(waitStatus)
    }
        .reinterpret()

public val ClearHandleFuncFunc: CPointer<CFunction<(UInt) -> Unit>> =
    staticCFunction {
            handleId: UInt,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(handleId: UInt) -> Unit>().get().invoke(handleId)
    }
        .reinterpret()

public val CompareDataFuncFunc: CPointer<CFunction<() -> Int>> =
    staticCFunction {
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Int>().get().invoke()
    }
        .reinterpret()

public val CompareFuncFunc: CPointer<CFunction<() -> Int>> =
    staticCFunction {
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Int>().get().invoke()
    }
        .reinterpret()

public val DataForeachFuncFunc: CPointer<CFunction<(UInt) -> Unit>> =
    staticCFunction {
            keyId: UInt,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(keyId: UInt) -> Unit>().get().invoke(keyId)
    }
        .reinterpret()

public val DestroyNotifyFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()

public val EqualFuncFunc: CPointer<CFunction<() -> Int>> =
    staticCFunction {
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Boolean>().get().invoke().asGBoolean()
    }
        .reinterpret()

public val ErrorClearFuncFunc: CPointer<CFunction<(CPointer<org.gtkkn.native.glib.GError>) -> Unit>> =
    staticCFunction {
            error: CPointer<org.gtkkn.native.glib.GError>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(error: Error) -> Unit>().get().invoke(
            error!!.run {
                Error(reinterpret())
            }
        )
    }
        .reinterpret()

public val ErrorCopyFuncFunc: CPointer<
    CFunction<
        (
            CPointer<org.gtkkn.native.glib.GError>,
            CPointer<org.gtkkn.native.glib.GError>,
        ) -> Unit
        >
    > =
    staticCFunction {
            srcError: CPointer<org.gtkkn.native.glib.GError>?,
            destError: CPointer<org.gtkkn.native.glib.GError>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<
            (
                srcError: Error,
                destError: Error,
            ) -> Unit
            >().get().invoke(
            srcError!!.run {
                Error(reinterpret())
            },
            destError!!.run {
                Error(reinterpret())
            }
        )
    }
        .reinterpret()

public val ErrorInitFuncFunc: CPointer<CFunction<(CPointer<org.gtkkn.native.glib.GError>) -> Unit>> =
    staticCFunction {
            error: CPointer<org.gtkkn.native.glib.GError>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(error: Error) -> Unit>().get().invoke(
            error!!.run {
                Error(reinterpret())
            }
        )
    }
        .reinterpret()

public val FreeFuncFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()

public val FuncFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()

public val HFuncFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()

public val HRFuncFunc: CPointer<CFunction<() -> Int>> =
    staticCFunction {
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Boolean>().get().invoke().asGBoolean()
    }
        .reinterpret()

public val HashFuncFunc: CPointer<CFunction<() -> UInt>> =
    staticCFunction {
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> UInt>().get().invoke()
    }
        .reinterpret()

public val HookCheckFuncFunc: CPointer<CFunction<() -> Int>> =
    staticCFunction {
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Boolean>().get().invoke().asGBoolean()
    }
        .reinterpret()

public val HookCheckMarshallerFunc: CPointer<CFunction<(CPointer<GHook>) -> Int>> =
    staticCFunction {
            hook: CPointer<GHook>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(hook: Hook) -> Boolean>().get().invoke(
            hook!!.run {
                Hook(reinterpret())
            }
        ).asGBoolean()
    }
        .reinterpret()

public val HookCompareFuncFunc: CPointer<CFunction<(CPointer<GHook>, CPointer<GHook>) -> Int>> =
    staticCFunction {
            newHook: CPointer<GHook>?,
            sibling: CPointer<GHook>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(newHook: Hook, sibling: Hook) -> Int>().get().invoke(
            newHook!!.run {
                Hook(reinterpret())
            },
            sibling!!.run {
                Hook(reinterpret())
            }
        )
    }
        .reinterpret()

public val HookFinalizeFuncFunc: CPointer<CFunction<(CPointer<GHookList>, CPointer<GHook>) -> Unit>> =
    staticCFunction {
            hookList: CPointer<GHookList>?,
            hook: CPointer<GHook>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(hookList: HookList, hook: Hook) -> Unit>().get().invoke(
            hookList!!.run {
                HookList(reinterpret())
            },
            hook!!.run {
                Hook(reinterpret())
            }
        )
    }
        .reinterpret()

public val HookFindFuncFunc: CPointer<CFunction<(CPointer<GHook>) -> Int>> =
    staticCFunction {
            hook: CPointer<GHook>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(hook: Hook) -> Boolean>().get().invoke(
            hook!!.run {
                Hook(reinterpret())
            }
        ).asGBoolean()
    }
        .reinterpret()

public val HookFuncFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()

public val HookMarshallerFunc: CPointer<CFunction<(CPointer<GHook>) -> Unit>> =
    staticCFunction {
            hook: CPointer<GHook>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(hook: Hook) -> Unit>().get().invoke(
            hook!!.run {
                Hook(reinterpret())
            }
        )
    }
        .reinterpret()

public val IOFuncFunc: CPointer<CFunction<(CPointer<GIOChannel>, GIOCondition) -> Int>> =
    staticCFunction {
            source: CPointer<GIOChannel>?,
            condition: GIOCondition,
            userData: COpaquePointer,
        ->
        userData.asStableRef<
            (
                source: IOChannel,
                condition: IOCondition,
            ) -> Boolean
            >().get().invoke(
            source!!.run {
                IOChannel(reinterpret())
            },
            condition.run {
                IOCondition(this)
            }
        ).asGBoolean()
    }
        .reinterpret()

public val LogFuncFunc: CPointer<
    CFunction<
        (
            CPointer<ByteVar>,
            GLogLevelFlags,
            CPointer<ByteVar>,
        ) -> Unit
        >
    > =
    staticCFunction {
            logDomain: CPointer<ByteVar>?,
            logLevel: GLogLevelFlags,
            message: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<
            (
                logDomain: kotlin.String,
                logLevel: LogLevelFlags,
                message: kotlin.String,
            ) -> Unit
            >().get().invoke(
            logDomain?.toKString() ?: error("Expected not null string"),
            logLevel.run {
                LogLevelFlags(this)
            },
            message?.toKString() ?: error("Expected not null string")
        )
    }
        .reinterpret()

public val LogWriterFuncFunc: CPointer<CFunction<(GLogLevelFlags, ULong) -> GLogWriterOutput>> =
    staticCFunction {
            logLevel: GLogLevelFlags,
            nFields: ULong,
            userData: COpaquePointer,
        ->
        userData.asStableRef<
            (
                logLevel: LogLevelFlags,
                nFields: ULong,
            ) -> LogWriterOutput
            >().get().invoke(
            logLevel.run {
                LogLevelFlags(this)
            },
            nFields
        ).nativeValue
    }
        .reinterpret()

public val NodeForeachFuncFunc: CPointer<CFunction<(CPointer<GNode>) -> Unit>> =
    staticCFunction {
            node: CPointer<GNode>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(node: Node) -> Unit>().get().invoke(
            node!!.run {
                Node(reinterpret())
            }
        )
    }
        .reinterpret()

public val NodeTraverseFuncFunc: CPointer<CFunction<(CPointer<GNode>) -> Int>> =
    staticCFunction {
            node: CPointer<GNode>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(node: Node) -> Boolean>().get().invoke(
            node!!.run {
                Node(reinterpret())
            }
        ).asGBoolean()
    }
        .reinterpret()

public val PollFuncFunc: CPointer<
    CFunction<
        (
            CPointer<GPollFD>,
            UInt,
            Int,
        ) -> Int
        >
    > =
    staticCFunction {
            ufds: CPointer<GPollFD>?,
            nfsd: UInt,
            timeout: Int,
            userData: COpaquePointer,
        ->
        userData.asStableRef<
            (
                ufds: PollFD,
                nfsd: UInt,
                timeout: Int,
            ) -> Int
            >().get().invoke(
            ufds!!.run {
                PollFD(reinterpret())
            },
            nfsd,
            timeout
        )
    }
        .reinterpret()

public val PrintFuncFunc: CPointer<CFunction<(CPointer<ByteVar>) -> Unit>> =
    staticCFunction {
            string: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(string: kotlin.String) -> Unit>().get().invoke(
            string?.toKString()
                ?: error("Expected not null string")
        )
    }
        .reinterpret()

public val RegexEvalCallbackFunc: CPointer<
    CFunction<
        (
            CPointer<GMatchInfo>,
            CPointer<GString>,
        ) -> Int
        >
    > =
    staticCFunction {
            matchInfo: CPointer<GMatchInfo>?,
            result: CPointer<GString>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<
            (
                matchInfo: MatchInfo,
                result: String,
            ) -> Boolean
            >().get().invoke(
            matchInfo!!.run {
                MatchInfo(reinterpret())
            },
            result!!.run {
                String(reinterpret())
            }
        ).asGBoolean()
    }
        .reinterpret()

public val ScannerMsgFuncFunc: CPointer<
    CFunction<
        (
            CPointer<GScanner>,
            CPointer<ByteVar>,
            Int,
        ) -> Unit
        >
    > =
    staticCFunction {
            scanner: CPointer<GScanner>?,
            message: CPointer<ByteVar>?,
            error: Int,
            userData: COpaquePointer,
        ->
        userData.asStableRef<
            (
                scanner: Scanner,
                message: kotlin.String,
                error: Boolean,
            ) -> Unit
            >().get().invoke(
            scanner!!.run {
                Scanner(reinterpret())
            },
            message?.toKString() ?: error("Expected not null string"),
            error.asBoolean()
        )
    }
        .reinterpret()

public val SequenceIterCompareFuncFunc: CPointer<CFunction<() -> Int>> =
    staticCFunction {
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Int>().get().invoke()
    }
        .reinterpret()

public val SourceDisposeFuncFunc: CPointer<CFunction<(CPointer<GSource>) -> Unit>> =
    staticCFunction {
            source: CPointer<GSource>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(source: Source) -> Unit>().get().invoke(
            source!!.run {
                Source(reinterpret())
            }
        )
    }
        .reinterpret()

public val SourceDummyMarshalFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()

public val SourceFuncFunc: CPointer<CFunction<() -> Int>> =
    staticCFunction {
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Boolean>().get().invoke().asGBoolean()
    }
        .reinterpret()

public val SpawnChildSetupFuncFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()

public val TestDataFuncFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()

public val TestFixtureFuncFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()

public val TestFuncFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()

public val TestLogFatalFuncFunc: CPointer<
    CFunction<
        (
            CPointer<ByteVar>,
            GLogLevelFlags,
            CPointer<ByteVar>,
        ) -> Int
        >
    > =
    staticCFunction {
            logDomain: CPointer<ByteVar>?,
            logLevel: GLogLevelFlags,
            message: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<
            (
                logDomain: kotlin.String,
                logLevel: LogLevelFlags,
                message: kotlin.String,
            ) -> Boolean
            >().get().invoke(
            logDomain?.toKString() ?: error("Expected not null string"),
            logLevel.run {
                LogLevelFlags(this)
            },
            message?.toKString() ?: error("Expected not null string")
        ).asGBoolean()
    }
        .reinterpret()

public val TraverseFuncFunc: CPointer<CFunction<() -> Int>> =
    staticCFunction {
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Boolean>().get().invoke().asGBoolean()
    }
        .reinterpret()

public val TraverseNodeFuncFunc: CPointer<CFunction<() -> Int>> =
    staticCFunction {
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Boolean>().get().invoke().asGBoolean()
    }
        .reinterpret()

public val UnixFDSourceFuncFunc: CPointer<CFunction<(Int, GIOCondition) -> Int>> =
    staticCFunction {
            fd: Int,
            condition: GIOCondition,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(fd: Int, condition: IOCondition) -> Boolean>().get().invoke(
            fd,
            condition.run {
                IOCondition(this)
            }
        ).asGBoolean()
    }
        .reinterpret()

public val VoidFuncFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()

/**
 * Prototype of a #GChildWatchSource callback, called when a child
 * process has exited.
 *
 * To interpret @wait_status, see the documentation
 * for g_spawn_check_wait_status(). In particular,
 * on Unix platforms, note that it is usually not equal
 * to the integer passed to `exit()` or returned from `main()`.
 *
 * - param `waitStatus` Status information about the child process, encoded
 *               in a platform-specific manner
 */
public typealias ChildWatchFunc = (waitStatus: Int) -> Unit

/**
 * Specifies the type of function passed to g_clear_handle_id().
 * The implementation is expected to free the resource identified
 * by @handle_id; for instance, if @handle_id is a #GSource ID,
 * g_source_remove() can be used.
 *
 * - param `handleId` the handle ID to clear
 */
public typealias ClearHandleFunc = (handleId: UInt) -> Unit

/**
 * Specifies the type of a comparison function used to compare two
 * values.  The function should return a negative integer if the first
 * value comes before the second, 0 if they are equal, or a positive
 * integer if the first value comes after the second.
 *
 * - return negative value if @a < @b; zero if @a = @b; positive
 *          value if @a > @b
 */
public typealias CompareDataFunc = () -> Int

/**
 * Specifies the type of a comparison function used to compare two
 * values.  The function should return a negative integer if the first
 * value comes before the second, 0 if they are equal, or a positive
 * integer if the first value comes after the second.
 *
 * - return negative value if @a < @b; zero if @a = @b; positive
 *          value if @a > @b
 */
public typealias CompareFunc = () -> Int

/**
 * Specifies the type of function passed to g_dataset_foreach(). It is
 * called with each #GQuark id and associated data element, together
 * with the @user_data parameter supplied to g_dataset_foreach().
 *
 * - param `keyId` the #GQuark id to identifying the data element.
 */
public typealias DataForeachFunc = (keyId: UInt) -> Unit

/**
 * Specifies the type of function which is called when a data element
 * is destroyed. It is passed the pointer to the data element and
 * should free any memory and resources allocated for it.
 */
public typealias DestroyNotify = () -> Unit

/**
 * Specifies the type of a function used to test two values for
 * equality. The function should return true if both values are equal
 * and false otherwise.
 *
 * - return true if @a = @b; false otherwise
 */
public typealias EqualFunc = () -> Boolean

/**
 * Specifies the type of function which is called when an extended
 * error instance is freed. It is passed the error pointer about to be
 * freed, and should free the error's private data fields.
 *
 * Normally, it is better to use G_DEFINE_EXTENDED_ERROR(), as it
 * already takes care of getting the private data from @error.
 *
 * - param `error` extended error to clear
 */
public typealias ErrorClearFunc = (error: Error) -> Unit

/**
 * Specifies the type of function which is called when an extended
 * error instance is copied. It is passed the pointer to the
 * destination error and source error, and should copy only the fields
 * of the private data from @src_error to @dest_error.
 *
 * Normally, it is better to use G_DEFINE_EXTENDED_ERROR(), as it
 * already takes care of getting the private data from @src_error and
 * @dest_error.
 *
 * - param `srcError` source extended error
 * - param `destError` destination extended error
 */
public typealias ErrorCopyFunc = (srcError: Error, destError: Error) -> Unit

/**
 * Specifies the type of function which is called just after an
 * extended error instance is created and its fields filled. It should
 * only initialize the fields in the private data, which can be
 * received with the generated `*_get_private()` function.
 *
 * Normally, it is better to use G_DEFINE_EXTENDED_ERROR(), as it
 * already takes care of getting the private data from @error.
 *
 * - param `error` extended error
 */
public typealias ErrorInitFunc = (error: Error) -> Unit

/**
 * Declares a type of function which takes an arbitrary
 * data pointer argument and has no return value. It is
 * not currently used in GLib or GTK+.
 */
public typealias FreeFunc = () -> Unit

/**
 * Specifies the type of functions passed to g_list_foreach() and
 * g_slist_foreach().
 */
public typealias Func = () -> Unit

/**
 * Specifies the type of the function passed to g_hash_table_foreach().
 * It is called with each key/value pair, together with the @user_data
 * parameter which is passed to g_hash_table_foreach().
 */
public typealias HFunc = () -> Unit

/**
 * Specifies the type of the function passed to
 * g_hash_table_foreach_remove(). It is called with each key/value
 * pair, together with the @user_data parameter passed to
 * g_hash_table_foreach_remove(). It should return true if the
 * key/value pair should be removed from the #GHashTable.
 *
 * - return true if the key/value pair should be removed from the
 *     #GHashTable
 */
public typealias HRFunc = () -> Boolean

/**
 * Specifies the type of the hash function which is passed to
 * g_hash_table_new() when a #GHashTable is created.
 *
 * The function is passed a key and should return a #guint hash value.
 * The functions g_direct_hash(), g_int_hash() and g_str_hash() provide
 * hash functions which can be used when the key is a #gpointer, #gint*,
 * and #gchar* respectively.
 *
 * g_direct_hash() is also the appropriate hash function for keys
 * of the form `GINT_TO_POINTER (n)` (or similar macros).
 *
 * A good hash functions should produce
 * hash values that are evenly distributed over a fairly large range.
 * The modulus is taken with the hash table size (a prime number) to
 * find the 'bucket' to place each key into. The function should also
 * be very fast, since it is called for each key lookup.
 *
 * Note that the hash functions provided by GLib have these qualities,
 * but are not particularly robust against manufactured keys that
 * cause hash collisions. Therefore, you should consider choosing
 * a more secure hash function when using a GHashTable with keys
 * that originate in untrusted data (such as HTTP requests).
 * Using g_str_hash() in that situation might make your application
 * vulnerable to
 * [Algorithmic Complexity Attacks](https://lwn.net/Articles/474912/).
 *
 * The key to choosing a good hash is unpredictability.  Even
 * cryptographic hashes are very easy to find collisions for when the
 * remainder is taken modulo a somewhat predictable prime number.  There
 * must be an element of randomness that an attacker is unable to guess.
 *
 * - return the hash value corresponding to the key
 */
public typealias HashFunc = () -> UInt

/**
 * Defines the type of a hook function that can be invoked
 * by g_hook_list_invoke_check().
 *
 * - return false if the #GHook should be destroyed
 */
public typealias HookCheckFunc = () -> Boolean

/**
 * Defines the type of function used by g_hook_list_marshal_check().
 *
 * - param `hook` a #GHook
 * - return false if @hook should be destroyed
 */
public typealias HookCheckMarshaller = (hook: Hook) -> Boolean

/**
 * Defines the type of function used to compare #GHook elements in
 * g_hook_insert_sorted().
 *
 * - param `newHook` the #GHook being inserted
 * - param `sibling` the #GHook to compare with @new_hook
 * - return a value <= 0 if @new_hook should be before @sibling
 */
public typealias HookCompareFunc = (newHook: Hook, sibling: Hook) -> Int

/**
 * Defines the type of function to be called when a hook in a
 * list of hooks gets finalized.
 *
 * - param `hookList` a #GHookList
 * - param `hook` the hook in @hook_list that gets finalized
 */
public typealias HookFinalizeFunc = (hookList: HookList, hook: Hook) -> Unit

/**
 * Defines the type of the function passed to g_hook_find().
 *
 * - param `hook` a #GHook
 * - return true if the required #GHook has been found
 */
public typealias HookFindFunc = (hook: Hook) -> Boolean

/**
 * Defines the type of a hook function that can be invoked
 * by g_hook_list_invoke().
 */
public typealias HookFunc = () -> Unit

/**
 * Defines the type of function used by g_hook_list_marshal().
 *
 * - param `hook` a #GHook
 */
public typealias HookMarshaller = (hook: Hook) -> Unit

/**
 * Specifies the type of function passed to g_io_add_watch() or
 * g_io_add_watch_full(), which is called when the requested condition
 * on a #GIOChannel is satisfied.
 *
 * - param `source` the #GIOChannel event source
 * - param `condition` the condition which has been satisfied
 * - return the function should return false if the event source
 *          should be removed
 */
public typealias IOFunc = (source: IOChannel, condition: IOCondition) -> Boolean

/**
 * Specifies the prototype of log handler functions.
 *
 * The default log handler, g_log_default_handler(), automatically appends a
 * new-line character to @message when printing it. It is advised that any
 * custom log handler functions behave similarly, so that logging calls in user
 * code do not need modifying to add a new-line character to the message if the
 * log handler is changed.
 *
 * This is not used if structured logging is enabled; see
 * [Using Structured Logging][using-structured-logging].
 *
 * - param `logDomain` the log domain of the message
 * - param `logLevel` the log level of the message (including the
 *     fatal and recursion flags)
 * - param `message` the message to process
 */
public typealias LogFunc = (
    logDomain: kotlin.String,
    logLevel: LogLevelFlags,
    message: kotlin.String,
) -> Unit

/**
 * Writer function for log entries. A log entry is a collection of one or more
 * #GLogFields, using the standard [field names from journal
 * specification](https://www.freedesktop.org/software/systemd/man/systemd.journal-fields.html).
 * See g_log_structured() for more information.
 *
 * Writer functions must ignore fields which they do not recognise, unless they
 * can write arbitrary binary output, as field values may be arbitrary binary.
 *
 * @log_level is guaranteed to be included in @fields as the `PRIORITY` field,
 * but is provided separately for convenience of deciding whether or where to
 * output the log entry.
 *
 * Writer functions should return %G_LOG_WRITER_HANDLED if they handled the log
 * message successfully or if they deliberately ignored it. If there was an
 * error handling the message (for example, if the writer function is meant to
 * send messages to a remote logging server and there is a network error), it
 * should return %G_LOG_WRITER_UNHANDLED. This allows writer functions to be
 * chained and fall back to simpler handlers in case of failure.
 *
 * - param `logLevel` log level of the message
 * - param `nFields` number of @fields
 * - return %G_LOG_WRITER_HANDLED if the log entry was handled successfully;
 *   %G_LOG_WRITER_UNHANDLED otherwise
 */
public typealias LogWriterFunc = (logLevel: LogLevelFlags, nFields: ULong) -> LogWriterOutput

/**
 * Specifies the type of function passed to g_node_children_foreach().
 * The function is called with each child node, together with the user
 * data passed to g_node_children_foreach().
 *
 * - param `node` a #GNode.
 */
public typealias NodeForeachFunc = (node: Node) -> Unit

/**
 * Specifies the type of function passed to g_node_traverse(). The
 * function is called with each of the nodes visited, together with the
 * user data passed to g_node_traverse(). If the function returns
 * true, then the traversal is stopped.
 *
 * - param `node` a #GNode.
 * - return true to stop the traversal.
 */
public typealias NodeTraverseFunc = (node: Node) -> Boolean

/**
 * Specifies the type of function passed to g_main_context_set_poll_func().
 * The semantics of the function should match those of the poll() system call.
 *
 * - param `ufds` an array of #GPollFD elements
 * - param `nfsd` the number of elements in @ufds
 * - param `timeout` the maximum time to wait for an event of the file descriptors.
 *     A negative value indicates an infinite timeout.
 * - return the number of #GPollFD elements which have events or errors
 *     reported, or -1 if an error occurred.
 */
public typealias PollFunc = (
    ufds: PollFD,
    nfsd: UInt,
    timeout: Int,
) -> Int

/**
 * Specifies the type of the print handler functions.
 * These are called with the complete formatted string to output.
 *
 * - param `string` the message to output
 */
public typealias PrintFunc = (string: kotlin.String) -> Unit

/**
 * Specifies the type of the function passed to g_regex_replace_eval().
 * It is called for each occurrence of the pattern in the string passed
 * to g_regex_replace_eval(), and it should append the replacement to
 * @result.
 *
 * - param `matchInfo` the #GMatchInfo generated by the match.
 *     Use g_match_info_get_regex() and g_match_info_get_string() if you
 *     need the #GRegex or the matched string.
 * - param `result` a #GString containing the new string
 * - return false to continue the replacement process, true to stop it
 */
public typealias RegexEvalCallback = (matchInfo: MatchInfo, result: String) -> Boolean

/**
 * Specifies the type of the message handler function.
 *
 * - param `scanner` a #GScanner
 * - param `message` the message
 * - param `error` true if the message signals an error,
 *     false if it signals a warning.
 */
public typealias ScannerMsgFunc = (
    scanner: Scanner,
    message: kotlin.String,
    error: Boolean,
) -> Unit

/**
 * A #GSequenceIterCompareFunc is a function used to compare iterators.
 * It must return zero if the iterators compare equal, a negative value
 * if @a comes before @b, and a positive value if @b comes before @a.
 *
 * - return zero if the iterators are equal, a negative value if @a
 *     comes before @b, and a positive value if @b comes before @a.
 */
public typealias SequenceIterCompareFunc = () -> Int

/**
 * Dispose function for @source. See g_source_set_dispose_function() for
 * details.
 *
 * - param `source` #GSource that is currently being disposed
 */
public typealias SourceDisposeFunc = (source: Source) -> Unit

/**
 * This is just a placeholder for #GClosureMarshal,
 * which cannot be used here for dependency reasons.
 */
public typealias SourceDummyMarshal = () -> Unit

/**
 * Specifies the type of function passed to g_timeout_add(),
 * g_timeout_add_full(), g_idle_add(), and g_idle_add_full().
 *
 * When calling g_source_set_callback(), you may need to cast a function of a
 * different type to this type. Use G_SOURCE_FUNC() to avoid warnings about
 * incompatible function types.
 *
 * - return false if the source should be removed. %G_SOURCE_CONTINUE and
 * %G_SOURCE_REMOVE are more memorable names for the return value.
 */
public typealias SourceFunc = () -> Boolean

/**
 * Specifies the type of the setup function passed to g_spawn_async(),
 * g_spawn_sync() and g_spawn_async_with_pipes(), which can, in very
 * limited ways, be used to affect the child's execution.
 *
 * On POSIX platforms, the function is called in the child after GLib
 * has performed all the setup it plans to perform, but before calling
 * exec(). Actions taken in this function will only affect the child,
 * not the parent.
 *
 * On Windows, the function is called in the parent. Its usefulness on
 * Windows is thus questionable. In many cases executing the child setup
 * function in the parent can have ill effects, and you should be very
 * careful when porting software to Windows that uses child setup
 * functions.
 *
 * However, even on POSIX, you are extremely limited in what you can
 * safely do from a #GSpawnChildSetupFunc, because any mutexes that were
 * held by other threads in the parent process at the time of the fork()
 * will still be locked in the child process, and they will never be
 * unlocked (since the threads that held them don't exist in the child).
 * POSIX allows only async-signal-safe functions (see signal(7)) to be
 * called in the child between fork() and exec(), which drastically limits
 * the usefulness of child setup functions.
 *
 * In particular, it is not safe to call any function which may
 * call malloc(), which includes POSIX functions such as setenv().
 * If you need to set up the child environment differently from
 * the parent, you should use g_get_environ(), g_environ_setenv(),
 * and g_environ_unsetenv(), and then pass the complete environment
 * list to the `g_spawn...` function.
 */
public typealias SpawnChildSetupFunc = () -> Unit

/**
 * The type used for test case functions that take an extra pointer
 * argument.
 */
public typealias TestDataFunc = () -> Unit

/**
 * The type used for functions that operate on test fixtures.  This is
 * used for the fixture setup and teardown functions as well as for the
 * testcases themselves.
 *
 * @user_data is a pointer to the data that was given when registering
 * the test case.
 *
 * @fixture will be a pointer to the area of memory allocated by the
 * test framework, of the size requested.  If the requested size was
 * zero then @fixture will be equal to @user_data.
 */
public typealias TestFixtureFunc = () -> Unit

/**
 * The type used for test case functions.
 */
public typealias TestFunc = () -> Unit

/**
 * Specifies the prototype of fatal log handler functions.
 *
 * - param `logDomain` the log domain of the message
 * - param `logLevel` the log level of the message (including the fatal and recursion flags)
 * - param `message` the message to process
 * - return true if the program should abort, false otherwise
 */
public typealias TestLogFatalFunc = (
    logDomain: kotlin.String,
    logLevel: LogLevelFlags,
    message: kotlin.String,
) -> Boolean

/**
 * Specifies the type of function passed to g_tree_traverse(). It is
 * passed the key and value of each node, together with the @user_data
 * parameter passed to g_tree_traverse(). If the function returns
 * true, the traversal is stopped.
 *
 * - return true to stop the traversal
 */
public typealias TraverseFunc = () -> Boolean

/**
 * Specifies the type of function passed to g_tree_foreach_node(). It is
 * passed each node, together with the @user_data parameter passed to
 * g_tree_foreach_node(). If the function returns true, the traversal is
 * stopped.
 *
 * - return true to stop the traversal
 */
public typealias TraverseNodeFunc = () -> Boolean

/**
 * The type of functions to be called when a UNIX fd watch source
 * triggers.
 *
 * - param `fd` the fd that triggered the event
 * - param `condition` the IO conditions reported on @fd
 * - return false if the source should be removed
 */
public typealias UnixFDSourceFunc = (fd: Int, condition: IOCondition) -> Boolean

/**
 * Declares a type of function which takes no arguments
 * and has no return value. It is used to specify the type
 * function passed to g_atexit().
 */
public typealias VoidFunc = () -> Unit
