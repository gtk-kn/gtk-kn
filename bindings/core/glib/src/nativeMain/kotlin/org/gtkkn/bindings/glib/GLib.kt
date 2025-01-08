// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.cstr
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.annotations.GLibVersion2_10
import org.gtkkn.bindings.glib.annotations.GLibVersion2_12
import org.gtkkn.bindings.glib.annotations.GLibVersion2_14
import org.gtkkn.bindings.glib.annotations.GLibVersion2_16
import org.gtkkn.bindings.glib.annotations.GLibVersion2_18
import org.gtkkn.bindings.glib.annotations.GLibVersion2_2
import org.gtkkn.bindings.glib.annotations.GLibVersion2_20
import org.gtkkn.bindings.glib.annotations.GLibVersion2_22
import org.gtkkn.bindings.glib.annotations.GLibVersion2_24
import org.gtkkn.bindings.glib.annotations.GLibVersion2_26
import org.gtkkn.bindings.glib.annotations.GLibVersion2_28
import org.gtkkn.bindings.glib.annotations.GLibVersion2_30
import org.gtkkn.bindings.glib.annotations.GLibVersion2_32
import org.gtkkn.bindings.glib.annotations.GLibVersion2_34
import org.gtkkn.bindings.glib.annotations.GLibVersion2_36
import org.gtkkn.bindings.glib.annotations.GLibVersion2_38
import org.gtkkn.bindings.glib.annotations.GLibVersion2_4
import org.gtkkn.bindings.glib.annotations.GLibVersion2_40
import org.gtkkn.bindings.glib.annotations.GLibVersion2_44
import org.gtkkn.bindings.glib.annotations.GLibVersion2_46
import org.gtkkn.bindings.glib.annotations.GLibVersion2_50
import org.gtkkn.bindings.glib.annotations.GLibVersion2_52
import org.gtkkn.bindings.glib.annotations.GLibVersion2_58
import org.gtkkn.bindings.glib.annotations.GLibVersion2_6
import org.gtkkn.bindings.glib.annotations.GLibVersion2_60
import org.gtkkn.bindings.glib.annotations.GLibVersion2_62
import org.gtkkn.bindings.glib.annotations.GLibVersion2_64
import org.gtkkn.bindings.glib.annotations.GLibVersion2_68
import org.gtkkn.bindings.glib.annotations.GLibVersion2_70
import org.gtkkn.bindings.glib.annotations.GLibVersion2_72
import org.gtkkn.bindings.glib.annotations.GLibVersion2_74
import org.gtkkn.bindings.glib.annotations.GLibVersion2_76
import org.gtkkn.bindings.glib.annotations.GLibVersion2_78
import org.gtkkn.bindings.glib.annotations.GLibVersion2_8
import org.gtkkn.bindings.glib.annotations.GLibVersion2_80
import org.gtkkn.extensions.glib.GLibException
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.ext.toCStringList
import org.gtkkn.extensions.glib.ext.toKStringList
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
import org.gtkkn.native.glib.GSequenceIter
import org.gtkkn.native.glib.GSource
import org.gtkkn.native.glib.GString
import org.gtkkn.native.glib.GTreeNode
import org.gtkkn.native.glib.g_access
import org.gtkkn.native.glib.g_aligned_alloc
import org.gtkkn.native.glib.g_aligned_alloc0
import org.gtkkn.native.glib.g_aligned_free
import org.gtkkn.native.glib.g_aligned_free_sized
import org.gtkkn.native.glib.g_ascii_digit_value
import org.gtkkn.native.glib.g_ascii_strcasecmp
import org.gtkkn.native.glib.g_ascii_strdown
import org.gtkkn.native.glib.g_ascii_strncasecmp
import org.gtkkn.native.glib.g_ascii_strup
import org.gtkkn.native.glib.g_ascii_tolower
import org.gtkkn.native.glib.g_ascii_toupper
import org.gtkkn.native.glib.g_ascii_xdigit_value
import org.gtkkn.native.glib.g_assert_warning
import org.gtkkn.native.glib.g_assertion_message
import org.gtkkn.native.glib.g_assertion_message_cmpint
import org.gtkkn.native.glib.g_assertion_message_cmpstr
import org.gtkkn.native.glib.g_assertion_message_error
import org.gtkkn.native.glib.g_assertion_message_expr
import org.gtkkn.native.glib.g_atomic_rc_box_acquire
import org.gtkkn.native.glib.g_atomic_rc_box_alloc
import org.gtkkn.native.glib.g_atomic_rc_box_alloc0
import org.gtkkn.native.glib.g_atomic_rc_box_dup
import org.gtkkn.native.glib.g_atomic_rc_box_get_size
import org.gtkkn.native.glib.g_atomic_rc_box_release
import org.gtkkn.native.glib.g_basename
import org.gtkkn.native.glib.g_bit_nth_lsf
import org.gtkkn.native.glib.g_bit_nth_msf
import org.gtkkn.native.glib.g_bit_storage
import org.gtkkn.native.glib.g_blow_chunks
import org.gtkkn.native.glib.g_build_filenamev
import org.gtkkn.native.glib.g_build_pathv
import org.gtkkn.native.glib.g_canonicalize_filename
import org.gtkkn.native.glib.g_chdir
import org.gtkkn.native.glib.g_child_watch_add_full
import org.gtkkn.native.glib.g_child_watch_source_new
import org.gtkkn.native.glib.g_clear_error
import org.gtkkn.native.glib.g_close
import org.gtkkn.native.glib.g_closefrom
import org.gtkkn.native.glib.g_compute_checksum_for_bytes
import org.gtkkn.native.glib.g_compute_checksum_for_string
import org.gtkkn.native.glib.g_compute_hmac_for_bytes
import org.gtkkn.native.glib.g_convert_error_quark
import org.gtkkn.native.glib.g_dataset_destroy
import org.gtkkn.native.glib.g_dataset_foreach
import org.gtkkn.native.glib.g_dataset_id_get_data
import org.gtkkn.native.glib.g_dataset_id_remove_no_notify
import org.gtkkn.native.glib.g_dcgettext
import org.gtkkn.native.glib.g_dgettext
import org.gtkkn.native.glib.g_direct_equal
import org.gtkkn.native.glib.g_direct_hash
import org.gtkkn.native.glib.g_dngettext
import org.gtkkn.native.glib.g_double_equal
import org.gtkkn.native.glib.g_double_hash
import org.gtkkn.native.glib.g_dpgettext
import org.gtkkn.native.glib.g_dpgettext2
import org.gtkkn.native.glib.g_environ_getenv
import org.gtkkn.native.glib.g_environ_setenv
import org.gtkkn.native.glib.g_environ_unsetenv
import org.gtkkn.native.glib.g_fdwalk_set_cloexec
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
import org.gtkkn.native.glib.g_free
import org.gtkkn.native.glib.g_free_sized
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
import org.gtkkn.native.glib.g_hostname_is_ascii_encoded
import org.gtkkn.native.glib.g_hostname_is_ip_address
import org.gtkkn.native.glib.g_hostname_is_non_ascii
import org.gtkkn.native.glib.g_hostname_to_ascii
import org.gtkkn.native.glib.g_hostname_to_unicode
import org.gtkkn.native.glib.g_idle_add_full
import org.gtkkn.native.glib.g_idle_add_once
import org.gtkkn.native.glib.g_idle_remove_by_data
import org.gtkkn.native.glib.g_idle_source_new
import org.gtkkn.native.glib.g_int64_equal
import org.gtkkn.native.glib.g_int64_hash
import org.gtkkn.native.glib.g_int_equal
import org.gtkkn.native.glib.g_int_hash
import org.gtkkn.native.glib.g_intern_static_string
import org.gtkkn.native.glib.g_intern_string
import org.gtkkn.native.glib.g_io_add_watch_full
import org.gtkkn.native.glib.g_io_create_watch
import org.gtkkn.native.glib.g_listenv
import org.gtkkn.native.glib.g_log_default_handler
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
import org.gtkkn.native.glib.g_main_current_source
import org.gtkkn.native.glib.g_main_depth
import org.gtkkn.native.glib.g_malloc
import org.gtkkn.native.glib.g_malloc0
import org.gtkkn.native.glib.g_malloc0_n
import org.gtkkn.native.glib.g_malloc_n
import org.gtkkn.native.glib.g_markup_error_quark
import org.gtkkn.native.glib.g_markup_escape_text
import org.gtkkn.native.glib.g_mem_is_system_malloc
import org.gtkkn.native.glib.g_mem_profile
import org.gtkkn.native.glib.g_mem_set_vtable
import org.gtkkn.native.glib.g_memdup
import org.gtkkn.native.glib.g_memdup2
import org.gtkkn.native.glib.g_mkdir_with_parents
import org.gtkkn.native.glib.g_mkdtemp
import org.gtkkn.native.glib.g_mkdtemp_full
import org.gtkkn.native.glib.g_mkstemp
import org.gtkkn.native.glib.g_mkstemp_full
import org.gtkkn.native.glib.g_number_parser_error_quark
import org.gtkkn.native.glib.g_on_error_query
import org.gtkkn.native.glib.g_on_error_stack_trace
import org.gtkkn.native.glib.g_option_error_quark
import org.gtkkn.native.glib.g_path_get_basename
import org.gtkkn.native.glib.g_path_get_dirname
import org.gtkkn.native.glib.g_path_is_absolute
import org.gtkkn.native.glib.g_path_skip_root
import org.gtkkn.native.glib.g_pattern_match
import org.gtkkn.native.glib.g_pattern_match_simple
import org.gtkkn.native.glib.g_pattern_match_string
import org.gtkkn.native.glib.g_pointer_bit_lock_mask_ptr
import org.gtkkn.native.glib.g_poll
import org.gtkkn.native.glib.g_qsort_with_data
import org.gtkkn.native.glib.g_quark_from_static_string
import org.gtkkn.native.glib.g_quark_from_string
import org.gtkkn.native.glib.g_quark_to_string
import org.gtkkn.native.glib.g_quark_try_string
import org.gtkkn.native.glib.g_random_double
import org.gtkkn.native.glib.g_random_double_range
import org.gtkkn.native.glib.g_random_int
import org.gtkkn.native.glib.g_random_int_range
import org.gtkkn.native.glib.g_random_set_seed
import org.gtkkn.native.glib.g_rc_box_acquire
import org.gtkkn.native.glib.g_rc_box_alloc
import org.gtkkn.native.glib.g_rc_box_alloc0
import org.gtkkn.native.glib.g_rc_box_dup
import org.gtkkn.native.glib.g_rc_box_get_size
import org.gtkkn.native.glib.g_rc_box_release
import org.gtkkn.native.glib.g_realloc
import org.gtkkn.native.glib.g_realloc_n
import org.gtkkn.native.glib.g_ref_string_acquire
import org.gtkkn.native.glib.g_ref_string_length
import org.gtkkn.native.glib.g_ref_string_new
import org.gtkkn.native.glib.g_ref_string_new_intern
import org.gtkkn.native.glib.g_ref_string_new_len
import org.gtkkn.native.glib.g_ref_string_release
import org.gtkkn.native.glib.g_reload_user_special_dirs_cache
import org.gtkkn.native.glib.g_return_if_fail_warning
import org.gtkkn.native.glib.g_rmdir
import org.gtkkn.native.glib.g_set_application_name
import org.gtkkn.native.glib.g_set_prgname
import org.gtkkn.native.glib.g_setenv
import org.gtkkn.native.glib.g_shell_error_quark
import org.gtkkn.native.glib.g_shell_quote
import org.gtkkn.native.glib.g_shell_unquote
import org.gtkkn.native.glib.g_slice_alloc
import org.gtkkn.native.glib.g_slice_alloc0
import org.gtkkn.native.glib.g_slice_copy
import org.gtkkn.native.glib.g_slice_free1
import org.gtkkn.native.glib.g_slice_free_chain_with_offset
import org.gtkkn.native.glib.g_slice_get_config
import org.gtkkn.native.glib.g_slice_set_config
import org.gtkkn.native.glib.g_spaced_primes_closest
import org.gtkkn.native.glib.g_spawn_check_exit_status
import org.gtkkn.native.glib.g_spawn_check_wait_status
import org.gtkkn.native.glib.g_spawn_close_pid
import org.gtkkn.native.glib.g_spawn_command_line_async
import org.gtkkn.native.glib.g_spawn_error_quark
import org.gtkkn.native.glib.g_spawn_exit_error_quark
import org.gtkkn.native.glib.g_str_equal
import org.gtkkn.native.glib.g_str_has_prefix
import org.gtkkn.native.glib.g_str_has_suffix
import org.gtkkn.native.glib.g_str_hash
import org.gtkkn.native.glib.g_str_is_ascii
import org.gtkkn.native.glib.g_str_match_string
import org.gtkkn.native.glib.g_str_to_ascii
import org.gtkkn.native.glib.g_strcanon
import org.gtkkn.native.glib.g_strcasecmp
import org.gtkkn.native.glib.g_strchomp
import org.gtkkn.native.glib.g_strchug
import org.gtkkn.native.glib.g_strcmp0
import org.gtkkn.native.glib.g_strcompress
import org.gtkkn.native.glib.g_strdelimit
import org.gtkkn.native.glib.g_strdown
import org.gtkkn.native.glib.g_strdup
import org.gtkkn.native.glib.g_strdupv
import org.gtkkn.native.glib.g_strerror
import org.gtkkn.native.glib.g_strescape
import org.gtkkn.native.glib.g_strfreev
import org.gtkkn.native.glib.g_strip_context
import org.gtkkn.native.glib.g_strjoinv
import org.gtkkn.native.glib.g_strlcat
import org.gtkkn.native.glib.g_strlcpy
import org.gtkkn.native.glib.g_strncasecmp
import org.gtkkn.native.glib.g_strndup
import org.gtkkn.native.glib.g_strnfill
import org.gtkkn.native.glib.g_strreverse
import org.gtkkn.native.glib.g_strrstr
import org.gtkkn.native.glib.g_strrstr_len
import org.gtkkn.native.glib.g_strsignal
import org.gtkkn.native.glib.g_strsplit
import org.gtkkn.native.glib.g_strsplit_set
import org.gtkkn.native.glib.g_strstr_len
import org.gtkkn.native.glib.g_strup
import org.gtkkn.native.glib.g_strv_contains
import org.gtkkn.native.glib.g_strv_equal
import org.gtkkn.native.glib.g_strv_length
import org.gtkkn.native.glib.g_test_assert_expected_messages_internal
import org.gtkkn.native.glib.g_test_bug
import org.gtkkn.native.glib.g_test_bug_base
import org.gtkkn.native.glib.g_test_disable_crash_reporting
import org.gtkkn.native.glib.g_test_expect_message
import org.gtkkn.native.glib.g_test_fail
import org.gtkkn.native.glib.g_test_failed
import org.gtkkn.native.glib.g_test_get_dir
import org.gtkkn.native.glib.g_test_get_path
import org.gtkkn.native.glib.g_test_incomplete
import org.gtkkn.native.glib.g_test_log_set_fatal_handler
import org.gtkkn.native.glib.g_test_log_type_name
import org.gtkkn.native.glib.g_test_queue_free
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
import org.gtkkn.native.glib.g_test_trap_subprocess_with_envp
import org.gtkkn.native.glib.g_timeout_add_full
import org.gtkkn.native.glib.g_timeout_add_once
import org.gtkkn.native.glib.g_timeout_add_seconds_full
import org.gtkkn.native.glib.g_timeout_add_seconds_once
import org.gtkkn.native.glib.g_timeout_source_new
import org.gtkkn.native.glib.g_timeout_source_new_seconds
import org.gtkkn.native.glib.g_try_malloc
import org.gtkkn.native.glib.g_try_malloc0
import org.gtkkn.native.glib.g_try_malloc0_n
import org.gtkkn.native.glib.g_try_malloc_n
import org.gtkkn.native.glib.g_try_realloc
import org.gtkkn.native.glib.g_try_realloc_n
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
import org.gtkkn.native.glib.g_unix_error_quark
import org.gtkkn.native.glib.g_unix_fd_add
import org.gtkkn.native.glib.g_unix_fd_add_full
import org.gtkkn.native.glib.g_unix_fd_source_new
import org.gtkkn.native.glib.g_unix_set_fd_nonblocking
import org.gtkkn.native.glib.g_unix_signal_add_full
import org.gtkkn.native.glib.g_unix_signal_source_new
import org.gtkkn.native.glib.g_unlink
import org.gtkkn.native.glib.g_unsetenv
import org.gtkkn.native.glib.g_usleep
import org.gtkkn.native.glib.g_utf8_casefold
import org.gtkkn.native.glib.g_utf8_collate
import org.gtkkn.native.glib.g_utf8_collate_key
import org.gtkkn.native.glib.g_utf8_collate_key_for_filename
import org.gtkkn.native.glib.g_utf8_find_next_char
import org.gtkkn.native.glib.g_utf8_find_prev_char
import org.gtkkn.native.glib.g_utf8_get_char
import org.gtkkn.native.glib.g_utf8_get_char_validated
import org.gtkkn.native.glib.g_utf8_make_valid
import org.gtkkn.native.glib.g_utf8_normalize
import org.gtkkn.native.glib.g_utf8_offset_to_pointer
import org.gtkkn.native.glib.g_utf8_pointer_to_offset
import org.gtkkn.native.glib.g_utf8_prev_char
import org.gtkkn.native.glib.g_utf8_strchr
import org.gtkkn.native.glib.g_utf8_strdown
import org.gtkkn.native.glib.g_utf8_strlen
import org.gtkkn.native.glib.g_utf8_strncpy
import org.gtkkn.native.glib.g_utf8_strrchr
import org.gtkkn.native.glib.g_utf8_strreverse
import org.gtkkn.native.glib.g_utf8_strup
import org.gtkkn.native.glib.g_utf8_substring
import org.gtkkn.native.glib.g_utf8_truncate_middle
import org.gtkkn.native.glib.g_uuid_string_is_valid
import org.gtkkn.native.glib.g_uuid_string_random
import org.gtkkn.native.glib.g_warn_message
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gint64
import org.gtkkn.native.glib.gint8
import org.gtkkn.native.glib.glib_check_version
import org.gtkkn.native.glib.glong
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.glib.gsize
import org.gtkkn.native.glib.guint
import org.gtkkn.native.glib.guint16
import org.gtkkn.native.glib.guint32
import org.gtkkn.native.glib.guint64
import org.gtkkn.native.glib.guint8
import org.gtkkn.native.glib.guintptr
import org.gtkkn.native.glib.gulong
import org.gtkkn.native.glib.gunichar
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_strv_get_type
import org.gtkkn.native.gobject.g_variant_get_gtype
import kotlin.Boolean
import kotlin.Char
import kotlin.Long
import kotlin.Result
import kotlin.Short
import kotlin.Unit
import kotlin.collections.List

/**
 * ## Skipped during bindings generation
 *
 * - alias `Strv`: Unsupported string with cType gchar**
 * - parameter `out_num`: out_num: Out parameter is not supported
 * - parameter `out_num`: out_num: Out parameter is not supported
 * - parameter `endptr`: endptr: Out parameter is not supported
 * - parameter `endptr`: endptr: Out parameter is not supported
 * - parameter `endptr`: endptr: Out parameter is not supported
 * - function `assertion_message_cmpnum`: C function g_assertion_message_cmpnum is ignored
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
 * - parameter `atomic`: Unsupported pointer to primitive type
 * - parameter `clear_func`: DestroyNotify
 * - parameter `arc`: Unsupported pointer to primitive type
 * - parameter `arc`: Unsupported pointer to primitive type
 * - parameter `arc`: Unsupported pointer to primitive type
 * - parameter `arc`: Unsupported pointer to primitive type
 * - parameter `out_len`: out_len: Out parameter is not supported
 * - function `base64_decode_inplace`: In/Out parameter is not supported
 * - function `base64_decode_step`: In/Out parameter is not supported
 * - parameter `data`: Array parameter of type guint8 is not supported
 * - function `base64_encode_close`: In/Out parameter is not supported
 * - function `base64_encode_step`: In/Out parameter is not supported
 * - parameter `address`: Unsupported pointer to primitive type
 * - parameter `address`: Unsupported pointer to primitive type
 * - parameter `address`: Unsupported pointer to primitive type
 * - function `build_filename`: Varargs parameter is not supported
 * - parameter `args`: va_list type is not supported
 * - function `build_path`: Varargs parameter is not supported
 * - parameter `tag_ptr`: Unsupported pointer to primitive type
 * - parameter `list_ptr`: Unsupported pointer-to-pointer cType GList**
 * - function `clear_pointer`: In/Out parameter is not supported
 * - parameter `slist_ptr`: Unsupported pointer-to-pointer cType GSList**
 * - parameter `data`: Array parameter of type guint8 is not supported
 * - parameter `key`: Array parameter of type guint8 is not supported
 * - parameter `key`: Array parameter of type guint8 is not supported
 * - parameter `str`: Array parameter of type guint8 is not supported
 * - parameter `str`: Array parameter of type guint8 is not supported
 * - parameter `str`: Array parameter of type guint8 is not supported
 * - parameter `datalist`: Unsupported pointer-to-pointer cType GData**
 * - parameter `datalist`: Unsupported pointer-to-pointer cType GData**
 * - parameter `datalist`: Unsupported pointer-to-pointer cType GData**
 * - parameter `datalist`: Unsupported pointer-to-pointer cType GData**
 * - parameter `datalist`: Unsupported pointer-to-pointer cType GData**
 * - parameter `datalist`: Unsupported pointer-to-pointer cType GData**
 * - parameter `datalist`: Unsupported pointer-to-pointer cType GData**
 * - parameter `datalist`: Unsupported pointer-to-pointer cType GData**
 * - parameter `datalist`: Unsupported pointer-to-pointer cType GData**
 * - parameter `datalist`: Unsupported pointer-to-pointer cType GData**
 * - parameter `datalist`: Unsupported pointer-to-pointer cType GData**
 * - parameter `datalist`: Unsupported pointer-to-pointer cType GData**
 * - parameter `datalist`: Unsupported pointer-to-pointer cType GData**
 * - parameter `destroy_func`: DestroyNotify
 * - parameter `contents`: contents: Out parameter is not supported
 * - parameter `name_used`: name_used: Out parameter is not supported
 * - parameter `contents`: Array parameter of type guint8 is not supported
 * - parameter `contents`: Array parameter of type guint8 is not supported
 * - parameter `hostname`: hostname: Out parameter is not supported
 * - parameter `bytes_read`: bytes_read: Out parameter is not supported
 * - parameter `bytes_read`: bytes_read: Out parameter is not supported
 * - function `fopen`: Return type gpointer is unsupported
 * - function `fprintf`: Varargs parameter is not supported
 * - parameter `stream`: Unsupported pointer to primitive type
 * - parameter `charset`: charset: Out parameter is not supported
 * - parameter `charset`: charset: Out parameter is not supported
 * - parameter `filename_charsets`: filename_charsets: Out parameter is not supported
 * - function `iconv`: In/Out parameter is not supported
 * - parameter `bytes_read`: bytes_read: Out parameter is not supported
 * - parameter `opsysstring`: Array parameter of type guint8 is not supported
 * - function `log`: Varargs parameter is not supported
 * - function `log_set_default_handler`: Return type LogFunc is unsupported
 * - function `log_structured`: Varargs parameter is not supported
 * - parameter `fields`: Array parameter of type LogField is not supported
 * - function `log_structured_standard`: Varargs parameter is not supported
 * - parameter `fields`: Array parameter of type LogField is not supported
 * - parameter `domains`: Unsupported string with cType const gchar* const*
 * - parameter `fields`: Array parameter of type LogField is not supported
 * - parameter `fields`: Array parameter of type LogField is not supported
 * - parameter `fields`: Array parameter of type LogField is not supported
 * - parameter `fields`: Array parameter of type LogField is not supported
 * - parameter `args`: va_list type is not supported
 * - function `markup_collect_attributes`: Varargs parameter is not supported
 * - function `markup_printf_escaped`: Varargs parameter is not supported
 * - parameter `args`: va_list type is not supported
 * - parameter `nullify_location`: Unsupported pointer to primitive type
 * - parameter `keys`: Array parameter of type DebugKey is not supported
 * - parameter `address`: Unsupported pointer to primitive type
 * - parameter `out_ptr`: out_ptr: Out parameter is not supported
 * - parameter `address`: Unsupported pointer to primitive type
 * - parameter `address`: Unsupported pointer to primitive type
 * - parameter `address`: Unsupported pointer to primitive type
 * - function `prefix_error`: In/Out parameter is not supported
 * - function `prefix_error_literal`: In/Out parameter is not supported
 * - function `print`: Varargs parameter is not supported
 * - function `printerr`: Varargs parameter is not supported
 * - function `printf`: Varargs parameter is not supported
 * - parameter `args`: va_list type is not supported
 * - parameter `dest`: dest: Out parameter is not supported
 * - function `propagate_prefixed_error`: Varargs parameter is not supported
 * - parameter `clear_func`: DestroyNotify
 * - parameter `rc`: Unsupported pointer to primitive type
 * - parameter `rc`: Unsupported pointer to primitive type
 * - parameter `rc`: Unsupported pointer to primitive type
 * - parameter `rc`: Unsupported pointer to primitive type
 * - function `set_error`: Varargs parameter is not supported
 * - parameter `err`: err: Out parameter is not supported
 * - parameter `func`: PrintFunc
 * - parameter `func`: PrintFunc
 * - parameter `argcp`: argcp: Out parameter is not supported
 * - parameter `n_values`: Unsupported pointer to primitive type
 * - function `snprintf`: Varargs parameter is not supported
 * - parameter `child_pid`: child_pid: Out parameter is not supported
 * - parameter `child_pid`: child_pid: Out parameter is not supported
 * - parameter `child_pid`: child_pid: Out parameter is not supported
 * - parameter `source_fds`: Array parameter of type gint is not supported
 * - parameter `standard_output`: standard_output: Out parameter is not supported
 * - parameter `standard_output`: standard_output: Out parameter is not supported
 * - function `sprintf`: Varargs parameter is not supported
 * - parameter `ascii_alternates`: ascii_alternates: Out parameter is not supported
 * - function `strconcat`: Varargs parameter is not supported
 * - function `strdup_printf`: Varargs parameter is not supported
 * - parameter `args`: va_list type is not supported
 * - function `strjoin`: Varargs parameter is not supported
 * - parameter `endptr`: endptr: Out parameter is not supported
 * - parameter `test_func`: TestDataFunc
 * - parameter `test_func`: TestDataFunc
 * - parameter `test_func`: TestFunc
 * - parameter `data_setup`: TestFixtureFunc
 * - function `test_build_filename`: Varargs parameter is not supported
 * - parameter `data_setup`: TestFixtureFunc
 * - function `test_fail_printf`: Varargs parameter is not supported
 * - function `test_get_filename`: Varargs parameter is not supported
 * - function `test_incomplete_printf`: Varargs parameter is not supported
 * - function `test_init`: Varargs parameter is not supported
 * - function `test_maximized_result`: Varargs parameter is not supported
 * - function `test_message`: Varargs parameter is not supported
 * - function `test_minimized_result`: Varargs parameter is not supported
 * - parameter `destroy_func`: DestroyNotify
 * - function `test_skip_printf`: Varargs parameter is not supported
 * - parameter `str`: Array parameter of type gunichar is not supported
 * - parameter `str`: Array parameter of type gunichar is not supported
 * - parameter `ch`: ch: Out parameter is not supported
 * - parameter `a`: a: Out parameter is not supported
 * - parameter `result`: result: Out parameter is not supported
 * - parameter `mirrored_ch`: mirrored_ch: Out parameter is not supported
 * - parameter `outbuf`: outbuf: Out parameter is not supported
 * - parameter `result_len`: Unsupported pointer to primitive type
 * - parameter `string`: Array parameter of type gunichar is not supported
 * - function `unix_get_passwd_entry`: Return type gpointer is unsupported
 * - parameter `fds`: Array parameter of type gint is not supported
 * - parameter `str`: Array parameter of type guint16 is not supported
 * - parameter `str`: Array parameter of type guint16 is not supported
 * - parameter `items_read`: items_read: Out parameter is not supported
 * - parameter `items_written`: items_written: Out parameter is not supported
 * - parameter `items_read`: items_read: Out parameter is not supported
 * - parameter `str`: Array parameter of type guint8 is not supported
 * - parameter `str`: Array parameter of type guint8 is not supported
 * - parameter `utb`: Unsupported pointer to primitive type
 * - parameter `string`: string: Out parameter is not supported
 * - parameter `file`: Unsupported pointer to primitive type
 * - parameter `args`: va_list type is not supported
 * - parameter `args`: va_list type is not supported
 * - parameter `args`: va_list type is not supported
 * - callback `OptionArgFunc`: Callbacks that throw are not supported
 * - callback `OptionErrorFunc`: Callbacks that throw are not supported
 * - callback `OptionParseFunc`: Callbacks that throw are not supported
 */
public object GLib {
    public const val ALLOCATOR_LIST: gint = 1

    public const val ALLOCATOR_NODE: gint = 3

    public const val ALLOCATOR_SLIST: gint = 2

    public const val ALLOC_AND_FREE: gint = 2

    public const val ALLOC_ONLY: gint = 1

    public const val ANALYZER_ANALYZING: gint = 1

    /**
     * A good size for a buffer to be passed into [func@GLib.ascii_dtostr].
     * It is guaranteed to be enough for all output of that function
     * on systems with 64bit IEEE-compatible doubles.
     *
     * The typical usage would be something like:
     * ```C
     * char buf[G_ASCII_DTOSTR_BUF_SIZE];
     *
     * fprintf (out, "value=%s\n", g_ascii_dtostr (buf, sizeof (buf), value));
     * ```
     */
    public const val ASCII_DTOSTR_BUF_SIZE: gint = 39

    /**
     * Evaluates to the initial reference count for `gatomicrefcount`.
     *
     * This macro is useful for initializing `gatomicrefcount` fields inside
     * structures, for instance:
     *
     * |[<!-- language="C" -->
     * typedef struct {
     *   gatomicrefcount ref_count;
     *   char *name;
     *   char *address;
     * } Person;
     *
     * static const Person default_person = {
     *   .ref_count = G_ATOMIC_REF_COUNT_INIT,
     *   .name = "Default name",
     *   .address = "Default address",
     * };
     * ]|
     *
     * @since 2.78
     */
    public const val ATOMIC_REF_COUNT_INIT: gint = 1

    public const val BIG_ENDIAN: gint = 4321

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

    public const val C_STD_VERSION: gint = 199000

    /**
     * A bitmask that restricts the possible flags passed to
     * g_datalist_set_flags(). Passing a flags value where
     * flags & ~G_DATALIST_FLAGS_MASK != 0 is an error.
     */
    public const val DATALIST_FLAGS_MASK: gint = 3

    /**
     * Represents an invalid #GDateDay.
     */
    public const val DATE_BAD_DAY: gint = 0

    /**
     * Represents an invalid Julian day number.
     */
    public const val DATE_BAD_JULIAN: gint = 0

    /**
     * Represents an invalid year.
     */
    public const val DATE_BAD_YEAR: gint = 0

    public const val DIR_SEPARATOR: gint = 47

    public const val DIR_SEPARATOR_S: kotlin.String = "/"

    public const val E: gdouble = 2.718282

    public const val GINT16_FORMAT: kotlin.String = "hi"

    public const val GINT16_MODIFIER: kotlin.String = "h"

    public const val GINT32_FORMAT: kotlin.String = "i"

    public const val GINT32_MODIFIER: kotlin.String = ""

    public const val GINT64_FORMAT: kotlin.String = "li"

    public const val GINT64_MODIFIER: kotlin.String = "l"

    public const val GINTPTR_FORMAT: kotlin.String = "li"

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

    public const val GSIZE_FORMAT: kotlin.String = "lu"

    public const val GSIZE_MODIFIER: kotlin.String = "l"

    public const val GSSIZE_FORMAT: kotlin.String = "li"

    public const val GSSIZE_MODIFIER: kotlin.String = "l"

    public const val GUINT16_FORMAT: kotlin.String = "hu"

    public const val GUINT32_FORMAT: kotlin.String = "u"

    public const val GUINT64_FORMAT: kotlin.String = "lu"

    public const val GUINTPTR_FORMAT: kotlin.String = "lu"

    public const val HAVE_GINT64: gint = 1

    public const val HAVE_GNUC_VARARGS: gint = 1

    public const val HAVE_GNUC_VISIBILITY: gint = 1

    public const val HAVE_GROWING_STACK: gint = 0

    public const val HAVE_ISO_VARARGS: gint = 1

    /**
     * The position of the first bit which is not reserved for internal
     * use be the #GHook implementation, i.e.
     * `1 << G_HOOK_FLAG_USER_SHIFT` is the first
     * bit which can be used for application-defined flags.
     */
    public const val HOOK_FLAG_USER_SHIFT: gint = 4

    public const val IEEE754_DOUBLE_BIAS: gint = 1023

    public const val IEEE754_FLOAT_BIAS: gint8 = Byte.MAX_VALUE

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
     * [Startup Notification Protocol Specification](http://www.freedesktop.org/Standards/startup-notification-spec).
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

    public const val LITTLE_ENDIAN: gint = 1234

    public const val LN10: gdouble = 2.302585

    public const val LN2: gdouble = 0.693147

    public const val LOG_2_BASE_10: gdouble = 0.301030

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
     * For example, GTK uses this in its `Makefile.am`:
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
     * [Using Structured Logging](logging.html#using-structured-logging).
     */
    public const val LOG_FATAL_MASK: gint = 5

    /**
     * Log levels below `1<<G_LOG_LEVEL_USER_SHIFT` are used by GLib.
     * Higher bits can be used for user-defined log levels.
     */
    public const val LOG_LEVEL_USER_SHIFT: gint = 8

    /**
     * The major version number of the GLib library.
     *
     * Like #glib_major_version, but from the headers used at
     * application compile time, rather than from the library
     * linked against at application run time.
     */
    public const val MAJOR_VERSION: gint = 2

    public const val MAXINT16: Short = Short.MAX_VALUE

    public const val MAXINT32: gint = Int.MAX_VALUE

    public const val MAXINT64: gint64 = Long.MAX_VALUE

    public const val MAXINT8: gint8 = Byte.MAX_VALUE

    public const val MAXUINT16: guint16 = 65535u

    public const val MAXUINT32: guint32 = UInt.MAX_VALUE

    public const val MAXUINT64: guint64 = ULong.MAX_VALUE

    public const val MAXUINT8: guint8 = UByte.MAX_VALUE

    /**
     * The micro version number of the GLib library.
     *
     * Like #gtk_micro_version, but from the headers used at
     * application compile time, rather than from the library
     * linked against at application run time.
     */
    public const val MICRO_VERSION: gint = 0

    /**
     * The minimum value which can be held in a #gint16.
     *
     * @since 2.4
     */
    public const val MININT16: Short = Short.MIN_VALUE

    /**
     * The minimum value which can be held in a #gint32.
     *
     * @since 2.4
     */
    public const val MININT32: gint = Int.MIN_VALUE

    /**
     * The minimum value which can be held in a #gint64.
     */
    public const val MININT64: gint64 = Long.MIN_VALUE

    /**
     * The minimum value which can be held in a #gint8.
     *
     * @since 2.4
     */
    public const val MININT8: gint8 = Byte.MIN_VALUE

    /**
     * The minor version number of the GLib library.
     *
     * Like #gtk_minor_version, but from the headers used at
     * application compile time, rather than from the library
     * linked against at application run time.
     */
    public const val MINOR_VERSION: gint = 80

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

    public const val PDP_ENDIAN: gint = 3412

    public const val PI: gdouble = 3.141593

    /**
     * A format specifier that can be used in printf()-style format strings
     * when printing a #GPid.
     *
     * @since 2.50
     */
    public const val PID_FORMAT: kotlin.String = "i"

    public const val PI_2: gdouble = 1.570796

    public const val PI_4: gdouble = 0.785398

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
    public const val PRIORITY_DEFAULT: gint = 0

    /**
     * Use this for default priority idle functions.
     *
     * In GLib this priority is used when adding idle functions with
     * g_idle_add().
     */
    public const val PRIORITY_DEFAULT_IDLE: gint = 200

    /**
     * Use this for high priority event sources.
     *
     * It is not used within GLib or GTK.
     */
    public const val PRIORITY_HIGH: gint = -100

    /**
     * Use this for high priority idle functions.
     *
     * GTK uses %G_PRIORITY_HIGH_IDLE + 10 for resizing operations,
     * and %G_PRIORITY_HIGH_IDLE + 20 for redrawing operations. (This is
     * done to ensure that any pending resizes are processed before any
     * pending redraws, so that widgets are not redrawn twice unnecessarily.)
     */
    public const val PRIORITY_HIGH_IDLE: gint = 100

    /**
     * Use this for very low priority background tasks.
     *
     * It is not used within GLib or GTK.
     */
    public const val PRIORITY_LOW: gint = 300

    /**
     * Evaluates to the initial reference count for `grefcount`.
     *
     * This macro is useful for initializing `grefcount` fields inside
     * structures, for instance:
     *
     * |[<!-- language="C" -->
     * typedef struct {
     *   grefcount ref_count;
     *   char *name;
     *   char *address;
     * } Person;
     *
     * static const Person default_person = {
     *   .ref_count = G_REF_COUNT_INIT,
     *   .name = "Default name",
     *   .address = "Default address",
     * };
     * ]|
     *
     * @since 2.78
     */
    public const val REF_COUNT_INIT: gint = -1

    public const val SEARCHPATH_SEPARATOR: gint = 58

    public const val SEARCHPATH_SEPARATOR_S: kotlin.String = ":"

    public const val SIZEOF_LONG: gint = 8

    public const val SIZEOF_SIZE_T: gint = 8

    public const val SIZEOF_SSIZE_T: gint = 8

    public const val SIZEOF_VOID_P: gint = 8

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

    public const val SQRT2: gdouble = 1.414214

    /**
     * The standard delimiters, used in [func@GLib.strdelimit].
     */
    public const val STR_DELIMITERS: kotlin.String = "_-|> <."

    public const val SYSDEF_AF_INET: gint = 2

    public const val SYSDEF_AF_INET6: gint = 10

    public const val SYSDEF_AF_UNIX: gint = 1

    public const val SYSDEF_MSG_DONTROUTE: gint = 4

    public const val SYSDEF_MSG_OOB: gint = 1

    public const val SYSDEF_MSG_PEEK: gint = 2

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
    public const val TIME_SPAN_DAY: gint64 = 86400000000

    /**
     * Evaluates to a time span of one hour.
     *
     * @since 2.26
     */
    public const val TIME_SPAN_HOUR: gint64 = 3600000000

    /**
     * Evaluates to a time span of one millisecond.
     *
     * @since 2.26
     */
    public const val TIME_SPAN_MILLISECOND: gint64 = 1000

    /**
     * Evaluates to a time span of one minute.
     *
     * @since 2.26
     */
    public const val TIME_SPAN_MINUTE: gint64 = 60000000

    /**
     * Evaluates to a time span of one second.
     *
     * @since 2.26
     */
    public const val TIME_SPAN_SECOND: gint64 = 1000000

    /**
     * The maximum length (in codepoints) of a compatibility or canonical
     * decomposition of a single Unicode character.
     *
     * This is as defined by Unicode 6.1.
     *
     * @since 2.32
     */
    public const val UNICHAR_MAX_DECOMPOSITION_LENGTH: gint = 18

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
    public const val USEC_PER_SEC: gint = 1000000

    public const val VA_COPY_AS_ARRAY: gint = 1

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
    public const val VERSION_MIN_REQUIRED: gint = 2

    public const val WIN32_MSG_HANDLE: gint = 19981206

    public const val macro__has_attribute___noreturn__: gint = 0

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
    @GLibVersion2_8
    public fun access(filename: kotlin.String, mode: gint): gint = g_access(filename, mode)

    /**
     * This function is similar to g_malloc(), allocating (@n_blocks * @n_block_bytes)
     * bytes, but care is taken to align the allocated memory to with the given
     * alignment value. Additionally, it will detect possible overflow during
     * multiplication.
     *
     * If the allocation fails (because the system is out of memory),
     * the program is terminated.
     *
     * Aligned memory allocations returned by this function can only be
     * freed using g_aligned_free_sized() or g_aligned_free().
     *
     * @param nBlocks the number of blocks to allocate
     * @param nBlockBytes the size of each block in bytes
     * @param alignment the alignment to be enforced, which must be a positive power of 2
     *   and a multiple of `sizeof(void*)`
     * @return the allocated memory
     * @since 2.72
     */
    @GLibVersion2_72
    public fun alignedAlloc(nBlocks: gsize, nBlockBytes: gsize, alignment: gsize): gpointer? =
        g_aligned_alloc(nBlocks, nBlockBytes, alignment)

    /**
     * This function is similar to g_aligned_alloc(), but it will
     * also clear the allocated memory before returning it.
     *
     * @param nBlocks the number of blocks to allocate
     * @param nBlockBytes the size of each block in bytes
     * @param alignment the alignment to be enforced, which must be a positive power of 2
     *   and a multiple of `sizeof(void*)`
     * @return the allocated, cleared memory
     * @since 2.72
     */
    @GLibVersion2_72
    public fun alignedAlloc0(nBlocks: gsize, nBlockBytes: gsize, alignment: gsize): gpointer? =
        g_aligned_alloc0(nBlocks, nBlockBytes, alignment)

    /**
     * Frees the memory allocated by g_aligned_alloc().
     *
     * @param mem the memory to deallocate
     * @since 2.72
     */
    @GLibVersion2_72
    public fun alignedFree(mem: gpointer? = null): Unit = g_aligned_free(mem)

    /**
     * Frees the memory pointed to by @mem, assuming it is has the given @size and
     * @alignment.
     *
     * If @mem is null this is a no-op (and @size is ignored).
     *
     * It is an error if @size doesn’t match the size, or @alignment doesn’t match
     * the alignment, passed when @mem was allocated. @size and @alignment are
     * passed to this function to allow optimizations in the allocator. If you
     * don’t know either of them, use g_aligned_free() instead.
     *
     * @param mem the memory to free
     * @param alignment alignment of @mem
     * @param size size of @mem, in bytes
     * @since 2.76
     */
    @GLibVersion2_76
    public fun alignedFreeSized(mem: gpointer? = null, alignment: gsize, size: gsize): Unit =
        g_aligned_free_sized(mem, alignment, size)

    /**
     * Determines the numeric value of a character as a decimal digit. If the
     * character is not a decimal digit according to [func@GLib.ascii_isdigit],
     * `-1` is returned.
     *
     * Differs from [func@GLib.unichar_digit_value] because it takes a char, so
     * there's no worry about sign extension if characters are signed.
     *
     * @param c an ASCII character
     * @return the numerical value of @c if it is a decimal digit, `-1` otherwise
     */
    public fun asciiDigitValue(c: Char): gint = g_ascii_digit_value(c.code.toByte())

    /**
     * Compare two strings, ignoring the case of ASCII characters.
     *
     * Unlike the BSD `strcasecmp()` function, this only recognizes standard
     * ASCII letters and ignores the locale, treating all non-ASCII
     * bytes as if they are not letters.
     *
     * This function should be used only on strings that are known to be
     * in encodings where the bytes corresponding to ASCII letters always
     * represent themselves. This includes UTF-8 and the ISO-8859-*
     * charsets, but not for instance double-byte encodings like the
     * Windows Codepage 932, where the trailing bytes of double-byte
     * characters include all ASCII letters. If you compare two CP932
     * strings using this function, you will get false matches.
     *
     * Both @s1 and @s2 must be non-`NULL`.
     *
     * @param s1 string to compare with @s2
     * @param s2 string to compare with @s1
     * @return 0 if the strings match, a negative value if @s1 < @s2,
     *   or a positive value if @s1 > @s2
     */
    public fun asciiStrcasecmp(s1: kotlin.String, s2: kotlin.String): gint = g_ascii_strcasecmp(s1, s2)

    /**
     * Converts all upper case ASCII letters to lower case ASCII letters, with
     * semantics that exactly match [func@GLib.ascii_tolower].
     *
     * @param str a string
     * @param len length of @str in bytes, or `-1` if @str is nul-terminated
     * @return a newly-allocated string, with all the upper case characters in
     *   @str converted to lower case. (Note that this is unlike the old
     *   [func@GLib.strdown], which modified the string in place.)
     */
    public fun asciiStrdown(str: kotlin.String, len: Long): kotlin.String =
        g_ascii_strdown(str, len)?.toKString() ?: error("Expected not null string")

    /**
     * Compare @s1 and @s2, ignoring the case of ASCII characters and any
     * characters after the first @n in each string. If either string is
     * less than @n bytes long, comparison will stop at the first nul byte
     * encountered.
     *
     * Unlike the BSD `strncasecmp()` function, this only recognizes standard
     * ASCII letters and ignores the locale, treating all non-ASCII
     * characters as if they are not letters.
     *
     * The same warning as in [func@GLib.ascii_strcasecmp] applies: Use this
     * function only on strings known to be in encodings where bytes
     * corresponding to ASCII letters always represent themselves.
     *
     * @param s1 string to compare with @s2
     * @param s2 string to compare with @s1
     * @param n number of characters to compare
     * @return 0 if the strings match, a negative value if @s1 < @s2,
     *   or a positive value if @s1 > @s2
     */
    public fun asciiStrncasecmp(s1: kotlin.String, s2: kotlin.String, n: gsize): gint = g_ascii_strncasecmp(s1, s2, n)

    /**
     * Converts all lower case ASCII letters to upper case ASCII letters, with
     * semantics that exactly match [func@GLib.ascii_toupper].
     *
     * @param str a string
     * @param len length of @str in bytes, or `-1` if @str is nul-terminated
     * @return a newly-allocated string, with all the lower case characters
     *   in @str converted to upper case. (Note that this is unlike the old
     *   [func@GLib.strup], which modified the string in place.)
     */
    public fun asciiStrup(str: kotlin.String, len: Long): kotlin.String =
        g_ascii_strup(str, len)?.toKString() ?: error("Expected not null string")

    /**
     * Convert a character to ASCII lower case. If the character is not an
     * ASCII upper case letter, it is returned unchanged.
     *
     * Unlike the standard C library `tolower()` function, this only
     * recognizes standard ASCII letters and ignores the locale, returning
     * all non-ASCII characters unchanged, even if they are lower case
     * letters in a particular character set. Also unlike the standard
     * library function, this takes and returns a char, not an int, so
     * don't call it on `EOF` but no need to worry about casting to `guchar`
     * before passing a possibly non-ASCII character in.
     *
     * @param c any character
     * @return the result of the conversion
     */
    public fun asciiTolower(c: Char): Char = g_ascii_tolower(c.code.toByte()).toInt().toChar()

    /**
     * Convert a character to ASCII upper case. If the character is not an
     * ASCII lower case letter, it is returned unchanged.
     *
     * Unlike the standard C library `toupper()` function, this only
     * recognizes standard ASCII letters and ignores the locale, returning
     * all non-ASCII characters unchanged, even if they are upper case
     * letters in a particular character set. Also unlike the standard
     * library function, this takes and returns a char, not an int, so
     * don't call it on `EOF` but no need to worry about casting to `guchar`
     * before passing a possibly non-ASCII character in.
     *
     * @param c any character
     * @return the result of the conversion
     */
    public fun asciiToupper(c: Char): Char = g_ascii_toupper(c.code.toByte()).toInt().toChar()

    /**
     * Determines the numeric value of a character as a hexadecimal digit. If the
     * character is not a hex digit according to [func@GLib.ascii_isxdigit],
     * `-1` is returned.
     *
     * Differs from [func@GLib.unichar_xdigit_value] because it takes a char, so
     * there's no worry about sign extension if characters are signed.
     *
     * Differs from [func@GLib.unichar_xdigit_value] because it takes a char, so
     * there's no worry about sign extension if characters are signed.
     *
     * @param c an ASCII character
     * @return the numerical value of @c if it is a hex digit, `-1` otherwise
     */
    public fun asciiXdigitValue(c: Char): gint = g_ascii_xdigit_value(c.code.toByte())

    public fun assertWarning(
        logDomain: kotlin.String,
        `file`: kotlin.String,
        line: gint,
        prettyFunction: kotlin.String,
        expression: kotlin.String,
    ): Unit = g_assert_warning(logDomain, `file`, line, prettyFunction, expression)

    public fun assertionMessage(
        domain: kotlin.String,
        `file`: kotlin.String,
        line: gint,
        func: kotlin.String,
        message: kotlin.String,
    ): Unit = g_assertion_message(domain, `file`, line, func, message)

    public fun assertionMessageCmpint(
        domain: kotlin.String,
        `file`: kotlin.String,
        line: gint,
        func: kotlin.String,
        expr: kotlin.String,
        arg1: guint64,
        cmp: kotlin.String,
        arg2: guint64,
        numtype: Char,
    ): Unit = g_assertion_message_cmpint(domain, `file`, line, func, expr, arg1, cmp, arg2, numtype.code.toByte())

    public fun assertionMessageCmpstr(
        domain: kotlin.String,
        `file`: kotlin.String,
        line: gint,
        func: kotlin.String,
        expr: kotlin.String,
        arg1: kotlin.String,
        cmp: kotlin.String,
        arg2: kotlin.String,
    ): Unit = g_assertion_message_cmpstr(domain, `file`, line, func, expr, arg1, cmp, arg2)

    public fun assertionMessageError(
        domain: kotlin.String,
        `file`: kotlin.String,
        line: gint,
        func: kotlin.String,
        expr: kotlin.String,
        error: Error,
        errorDomain: Quark,
        errorCode: gint,
    ): Unit = g_assertion_message_error(domain, `file`, line, func, expr, error.gPointer, errorDomain, errorCode)

    /**
     * Internal function used to print messages from the public g_assert() and
     * g_assert_not_reached() macros.
     *
     * @param domain log domain
     * @param file file containing the assertion
     * @param line line number of the assertion
     * @param func function containing the assertion
     * @param expr expression which failed
     */
    public fun assertionMessageExpr(
        domain: kotlin.String? = null,
        `file`: kotlin.String,
        line: gint,
        func: kotlin.String,
        expr: kotlin.String? = null,
    ): Unit = g_assertion_message_expr(domain, `file`, line, func, expr)

    /**
     * Atomically acquires a reference on the data pointed by @mem_block.
     *
     * @param memBlock a pointer to reference counted data
     * @return a pointer to the data,
     *   with its reference count increased
     * @since 2.58
     */
    @GLibVersion2_58
    public fun atomicRcBoxAcquire(memBlock: gpointer): gpointer = g_atomic_rc_box_acquire(memBlock)!!

    /**
     * Allocates @block_size bytes of memory, and adds atomic
     * reference counting semantics to it.
     *
     * The data will be freed when its reference count drops to
     * zero.
     *
     * The allocated data is guaranteed to be suitably aligned for any
     * built-in type.
     *
     * @param blockSize the size of the allocation, must be greater than 0
     * @return a pointer to the allocated memory
     * @since 2.58
     */
    @GLibVersion2_58
    public fun atomicRcBoxAlloc(blockSize: gsize): gpointer = g_atomic_rc_box_alloc(blockSize)!!

    /**
     * Allocates @block_size bytes of memory, and adds atomic
     * reference counting semantics to it.
     *
     * The contents of the returned data is set to zero.
     *
     * The data will be freed when its reference count drops to
     * zero.
     *
     * The allocated data is guaranteed to be suitably aligned for any
     * built-in type.
     *
     * @param blockSize the size of the allocation, must be greater than 0
     * @return a pointer to the allocated memory
     * @since 2.58
     */
    @GLibVersion2_58
    public fun atomicRcBoxAlloc0(blockSize: gsize): gpointer = g_atomic_rc_box_alloc0(blockSize)!!

    /**
     * Allocates a new block of data with atomic reference counting
     * semantics, and copies @block_size bytes of @mem_block
     * into it.
     *
     * @param blockSize the number of bytes to copy, must be greater than 0
     * @param memBlock the memory to copy
     * @return a pointer to the allocated
     *   memory
     * @since 2.58
     */
    @GLibVersion2_58
    public fun atomicRcBoxDup(blockSize: gsize, memBlock: gpointer): gpointer =
        g_atomic_rc_box_dup(blockSize, memBlock)!!

    /**
     * Retrieves the size of the reference counted data pointed by @mem_block.
     *
     * @param memBlock a pointer to reference counted data
     * @return the size of the data, in bytes
     * @since 2.58
     */
    @GLibVersion2_58
    public fun atomicRcBoxGetSize(memBlock: gpointer): gsize = g_atomic_rc_box_get_size(memBlock)

    /**
     * Atomically releases a reference on the data pointed by @mem_block.
     *
     * If the reference was the last one, it will free the
     * resources allocated for @mem_block.
     *
     * @param memBlock a pointer to reference counted data
     * @since 2.58
     */
    @GLibVersion2_58
    public fun atomicRcBoxRelease(memBlock: gpointer): Unit = g_atomic_rc_box_release(memBlock)

    /**
     * Gets the name of the file without any leading directory
     * components. It returns a pointer into the given file name
     * string.
     *
     * @param fileName the name of the file
     * @return the name of the file without any leading
     *   directory components
     */
    public fun basename(fileName: kotlin.String): kotlin.String =
        g_basename(fileName)?.toKString() ?: error("Expected not null string")

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
    public fun bitNthLsf(mask: gulong, nthBit: gint): gint = g_bit_nth_lsf(mask, nthBit)

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
    public fun bitNthMsf(mask: gulong, nthBit: gint): gint = g_bit_nth_msf(mask, nthBit)

    /**
     * Gets the number of bits used to hold @number,
     * e.g. if @number is 4, 3 bits are needed.
     *
     * @param number a #guint
     * @return the number of bits used to hold @number
     */
    public fun bitStorage(number: gulong): guint = g_bit_storage(number)

    public fun blowChunks(): Unit = g_blow_chunks()

    /**
     * Creates a filename from a vector of elements using the correct
     * separator for the current platform.
     *
     * This function behaves exactly like g_build_filename(), but takes the path
     * elements as a string array, instead of varargs. This function is mainly
     * meant for language bindings.
     *
     * If you are building a path programmatically you may want to use
     * #GPathBuf instead.
     *
     * @param args null-terminated
     *   array of strings containing the path elements.
     * @return the newly allocated path
     * @since 2.8
     */
    @GLibVersion2_8
    public fun buildFilenamev(args: List<kotlin.String>): kotlin.String = memScoped {
        return g_build_filenamev(args.toCStringList(this))?.toKString() ?: error("Expected not null string")
    }

    /**
     * Behaves exactly like g_build_path(), but takes the path elements
     * as a string array, instead of variadic arguments.
     *
     * This function is mainly meant for language bindings.
     *
     * @param separator a string used to separator the elements of the path.
     * @param args null-terminated
     *   array of strings containing the path elements.
     * @return a newly-allocated string that
     *     must be freed with g_free().
     * @since 2.8
     */
    @GLibVersion2_8
    public fun buildPathv(separator: kotlin.String, args: List<kotlin.String>): kotlin.String = memScoped {
        return g_build_pathv(separator, args.toCStringList(this))?.toKString() ?: error("Expected not null string")
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
     *   canonical file path
     * @since 2.58
     */
    @GLibVersion2_58
    public fun canonicalizeFilename(filename: kotlin.String, relativeTo: kotlin.String? = null): kotlin.String =
        g_canonicalize_filename(filename, relativeTo)?.toKString() ?: error("Expected not null string")

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
    @GLibVersion2_8
    public fun chdir(path: kotlin.String): gint = g_chdir(path)

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
    @GLibVersion2_6
    public fun checkVersion(requiredMajor: guint, requiredMinor: guint, requiredMicro: guint): kotlin.String? =
        glib_check_version(requiredMajor, requiredMinor, requiredMicro)?.toKString()

    /**
     * Sets a function to be called when the child indicated by @pid
     * exits, at the priority @priority.
     *
     * If you obtain @pid from g_spawn_async() or g_spawn_async_with_pipes()
     * you will need to pass %G_SPAWN_DO_NOT_REAP_CHILD as flag to
     * the spawn function for the child watching to work.
     *
     * In many programs, you will want to call g_spawn_check_wait_status()
     * in the callback to determine whether or not the child exited
     * successfully.
     *
     * Also, note that on platforms where #GPid must be explicitly closed
     * (see g_spawn_close_pid()) @pid must not be closed while the source
     * is still active.  Typically, you should invoke g_spawn_close_pid()
     * in the callback function for the source.
     *
     * GLib supports only a single callback per process id.
     * On POSIX platforms, the same restrictions mentioned for
     * g_child_watch_source_new() apply to this function.
     *
     * This internally creates a main loop source using
     * g_child_watch_source_new() and attaches it to the main loop context
     * using g_source_attach(). You can do these steps manually if you
     * need greater control.
     *
     * @param priority the priority of the idle source. Typically this will be in the
     *   range between %G_PRIORITY_DEFAULT_IDLE and %G_PRIORITY_HIGH_IDLE.
     * @param pid process to watch. On POSIX the positive pid of a child process. On
     * Windows a handle for a process (which doesn't have to be a child).
     * @param function function to call
     * @return the ID (greater than 0) of the event source.
     * @since 2.4
     */
    @GLibVersion2_4
    public fun childWatchAdd(priority: gint, pid: Pid, function: ChildWatchFunc): guint = g_child_watch_add_full(
        priority,
        pid,
        ChildWatchFuncFunc.reinterpret(),
        StableRef.create(function).asCPointer(),
        staticStableRefDestroy.reinterpret()
    )

    /**
     * Creates a new child_watch source.
     *
     * The source will not initially be associated with any #GMainContext
     * and must be added to one with g_source_attach() before it will be
     * executed.
     *
     * Note that child watch sources can only be used in conjunction with
     * `g_spawn...` when the %G_SPAWN_DO_NOT_REAP_CHILD flag is used.
     *
     * Note that on platforms where #GPid must be explicitly closed
     * (see g_spawn_close_pid()) @pid must not be closed while the
     * source is still active. Typically, you will want to call
     * g_spawn_close_pid() in the callback function for the source.
     *
     * On POSIX platforms, the following restrictions apply to this API
     * due to limitations in POSIX process interfaces:
     *
     * * @pid must be a child of this process
     * * @pid must be positive
     * * the application must not call `waitpid` with a non-positive
     *   first argument, for instance in another thread
     * * the application must not wait for @pid to exit by any other
     *   mechanism, including `waitpid(pid, ...)` or a second child-watch
     *   source for the same @pid
     * * the application must not ignore `SIGCHLD`
     * * Before 2.78, the application could not send a signal (`kill()`) to the
     *   watched @pid in a race free manner. Since 2.78, you can do that while the
     *   associated #GMainContext is acquired.
     * * Before 2.78, even after destroying the #GSource, you could not
     *   be sure that @pid wasn't already reaped. Hence, it was also not
     *   safe to `kill()` or `waitpid()` on the process ID after the child watch
     *   source was gone. Destroying the source before it fired made it
     *   impossible to reliably reap the process.
     *
     * If any of those conditions are not met, this and related APIs will
     * not work correctly. This can often be diagnosed via a GLib warning
     * stating that `ECHILD` was received by `waitpid`.
     *
     * Calling `waitpid` for specific processes other than @pid remains a
     * valid thing to do.
     *
     * @param pid process to watch. On POSIX the positive pid of a child process. On
     * Windows a handle for a process (which doesn't have to be a child).
     * @return the newly-created child watch source
     * @since 2.4
     */
    @GLibVersion2_4
    public fun childWatchSourceNew(pid: Pid): Source = g_child_watch_source_new(pid)!!.run {
        Source(this)
    }

    /**
     * If @err or *@err is null, does nothing. Otherwise,
     * calls g_error_free() on *@err and sets *@err to null.
     */
    public fun clearError(): Result<Unit> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_clear_error(gError.ptr)
        return if (gError.pointed != null) {
            Result.failure(org.gtkkn.bindings.glib.GLib.resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * This wraps the close() call. In case of error, %errno will be
     * preserved, but the error will also be stored as a #GError in @error.
     * In case of success, %errno is undefined.
     *
     * Besides using #GError, there is another major reason to prefer this
     * function over the call provided by the system; on Unix, it will
     * attempt to correctly handle %EINTR, which has platform-specific
     * semantics.
     *
     * It is a bug to call this function with an invalid file descriptor.
     *
     * On POSIX platforms since GLib 2.76, this function is async-signal safe
     * if (and only if) @error is null and @fd is a valid open file descriptor.
     * This makes it safe to call from a signal handler or a #GSpawnChildSetupFunc
     * under those conditions.
     * See [`signal(7)`](man:signal(7)) and
     * [`signal-safety(7)`](man:signal-safety(7)) for more details.
     *
     * @param fd A file descriptor
     * @return true on success, false if there was an error.
     * @since 2.36
     */
    @GLibVersion2_36
    public fun close(fd: gint): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_close(fd, gError.ptr).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(org.gtkkn.bindings.glib.GLib.resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Close every file descriptor equal to or greater than @lowfd.
     *
     * Typically @lowfd will be 3, to leave standard input, standard output
     * and standard error open.
     *
     * This is the same as Linux `close_range (lowfd, ~0U, 0)`,
     * but portable to other OSs and to older versions of Linux.
     * Equivalently, it is the same as BSD `closefrom (lowfd)`, but portable,
     * and async-signal-safe on all OSs.
     *
     * This function is async-signal safe, making it safe to call from a
     * signal handler or a [callback@GLib.SpawnChildSetupFunc], as long as @lowfd is
     * non-negative.
     * See [`signal(7)`](man:signal(7)) and
     * [`signal-safety(7)`](man:signal-safety(7)) for more details.
     *
     * @param lowfd Minimum fd to close, which must be non-negative
     * @return 0 on success, -1 with errno set on error
     * @since 2.80
     */
    @GLibVersion2_80
    public fun closefrom(lowfd: gint): gint = g_closefrom(lowfd)

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
    @GLibVersion2_34
    public fun computeChecksumForBytes(checksumType: ChecksumType, `data`: Bytes): kotlin.String? =
        g_compute_checksum_for_bytes(checksumType.nativeValue, `data`.gPointer)?.toKString()

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
    @GLibVersion2_16
    public fun computeChecksumForString(checksumType: ChecksumType, str: kotlin.String, length: Long): kotlin.String? =
        g_compute_checksum_for_string(checksumType.nativeValue, str, length)?.toKString()

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
    @GLibVersion2_50
    public fun computeHmacForBytes(digestType: ChecksumType, key: Bytes, `data`: Bytes): kotlin.String =
        g_compute_hmac_for_bytes(digestType.nativeValue, key.gPointer, `data`.gPointer)?.toKString()
            ?: error("Expected not null string")

    public fun convertErrorQuark(): Quark = g_convert_error_quark()

    /**
     * Destroys the dataset, freeing all memory allocated, and calling any
     * destroy functions set for data elements.
     *
     * @param datasetLocation the location identifying the dataset.
     */
    public fun datasetDestroy(datasetLocation: gpointer): Unit = g_dataset_destroy(datasetLocation)

    /**
     * Calls the given function for each data element which is associated
     * with the given location. Note that this function is NOT thread-safe.
     * So unless @dataset_location can be protected from any modifications
     * during invocation of this function, it should not be called.
     *
     * @func can make changes to the dataset, but the iteration will not
     * reflect changes made during the g_dataset_foreach() call, other
     * than skipping over elements that are removed.
     *
     * @param datasetLocation the location identifying the dataset.
     * @param func the function to call for each data element.
     */
    public fun datasetForeach(datasetLocation: gpointer, func: DataForeachFunc): Unit =
        g_dataset_foreach(datasetLocation, DataForeachFuncFunc.reinterpret(), StableRef.create(func).asCPointer())

    /**
     * Gets the data element corresponding to a #GQuark.
     *
     * @param datasetLocation the location identifying the dataset.
     * @param keyId the #GQuark id to identify the data element.
     * @return the data element corresponding to
     *          the #GQuark, or null if it is not found.
     */
    public fun datasetIdGetData(datasetLocation: gpointer, keyId: Quark): gpointer? =
        g_dataset_id_get_data(datasetLocation, keyId)

    /**
     * Removes an element, without calling its destroy notification
     * function.
     *
     * @param datasetLocation the location identifying the dataset.
     * @param keyId the #GQuark ID identifying the data element.
     * @return the data previously stored at @key_id,
     *          or null if none.
     */
    public fun datasetIdRemoveNoNotify(datasetLocation: gpointer, keyId: Quark): gpointer? =
        g_dataset_id_remove_no_notify(datasetLocation, keyId)

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
    @GLibVersion2_26
    public fun dcgettext(domain: kotlin.String? = null, msgid: kotlin.String, category: gint): kotlin.String =
        memScoped {
            return g_dcgettext(domain?.cstr?.ptr, msgid.cstr.ptr, category)?.toKString()
                ?: error("Expected not null string")
        }

    /**
     * This function is a wrapper of dgettext() which does not translate
     * the message if the default domain as set with textdomain() has no
     * translations for the current locale.
     *
     * The advantage of using this function over dgettext() proper is that
     * libraries using this function (like GTK) will not use translations
     * if the application using the library does not have translations for
     * the current locale.  This results in a consistent English-only
     * interface instead of one having partial translations.  For this
     * feature to work, the call to textdomain() and setlocale() should
     * precede any g_dgettext() invocations.  For GTK, it means calling
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
     * cases the application should call textdomain() after initializing GTK.
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
    @GLibVersion2_18
    public fun dgettext(domain: kotlin.String? = null, msgid: kotlin.String): kotlin.String = memScoped {
        return g_dgettext(domain?.cstr?.ptr, msgid.cstr.ptr)?.toKString() ?: error("Expected not null string")
    }

    /**
     * Compares two #gpointer arguments and returns true if they are equal.
     * It can be passed to g_hash_table_new() as the @key_equal_func
     * parameter, when using opaque pointers compared by pointer value as
     * keys in a #GHashTable.
     *
     * This equality function is also appropriate for keys that are integers
     * stored in pointers, such as `GINT_TO_POINTER (n)`.
     *
     * @param v1 a key
     * @param v2 a key to compare with @v1
     * @return true if the two keys match.
     */
    public fun directEqual(v1: gpointer? = null, v2: gpointer? = null): Boolean = g_direct_equal(v1, v2).asBoolean()

    /**
     * Converts a gpointer to a hash value.
     * It can be passed to g_hash_table_new() as the @hash_func parameter,
     * when using opaque pointers compared by pointer value as keys in a
     * #GHashTable.
     *
     * This hash function is also appropriate for keys that are integers
     * stored in pointers, such as `GINT_TO_POINTER (n)`.
     *
     * @param v a #gpointer key
     * @return a hash value corresponding to the key.
     */
    public fun directHash(v: gpointer? = null): guint = g_direct_hash(v)

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
    @GLibVersion2_18
    public fun dngettext(
        domain: kotlin.String? = null,
        msgid: kotlin.String,
        msgidPlural: kotlin.String,
        n: gulong,
    ): kotlin.String = memScoped {
        return g_dngettext(domain?.cstr?.ptr, msgid.cstr.ptr, msgidPlural.cstr.ptr, n)?.toKString()
            ?: error("Expected not null string")
    }

    /**
     * Compares the two #gdouble values being pointed to and returns
     * true if they are equal.
     * It can be passed to g_hash_table_new() as the @key_equal_func
     * parameter, when using non-null pointers to doubles as keys in a
     * #GHashTable.
     *
     * @param v1 a pointer to a #gdouble key
     * @param v2 a pointer to a #gdouble key to compare with @v1
     * @return true if the two keys match.
     * @since 2.22
     */
    @GLibVersion2_22
    public fun doubleEqual(v1: gpointer, v2: gpointer): Boolean = g_double_equal(v1, v2).asBoolean()

    /**
     * Converts a pointer to a #gdouble to a hash value.
     * It can be passed to g_hash_table_new() as the @hash_func parameter,
     * It can be passed to g_hash_table_new() as the @hash_func parameter,
     * when using non-null pointers to doubles as keys in a #GHashTable.
     *
     * @param v a pointer to a #gdouble key
     * @return a hash value corresponding to the key.
     * @since 2.22
     */
    @GLibVersion2_22
    public fun doubleHash(v: gpointer): guint = g_double_hash(v)

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
    @GLibVersion2_16
    public fun dpgettext(domain: kotlin.String? = null, msgctxtid: kotlin.String, msgidoffset: gsize): kotlin.String =
        memScoped {
            return g_dpgettext(domain?.cstr?.ptr, msgctxtid.cstr.ptr, msgidoffset)?.toKString()
                ?: error("Expected not null string")
        }

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
    @GLibVersion2_18
    public fun dpgettext2(domain: kotlin.String? = null, context: kotlin.String, msgid: kotlin.String): kotlin.String =
        g_dpgettext2(domain, context, msgid)?.toKString() ?: error("Expected not null string")

    /**
     * Returns the value of the environment variable @variable in the
     * provided list @envp.
     *
     * @param envp an environment list (eg, as returned from g_get_environ()), or null
     *     for an empty environment list
     * @param variable the environment variable to get
     * @return the value of the environment variable, or null if
     *     the environment variable is not set in @envp. The returned
     *     string is owned by @envp, and will be freed if @variable is
     *     set or unset again.
     * @since 2.32
     */
    @GLibVersion2_32
    public fun environGetenv(envp: List<kotlin.String>? = null, variable: kotlin.String): kotlin.String? = memScoped {
        return g_environ_getenv(envp?.toCStringList(this), variable)?.toKString()
    }

    /**
     * Sets the environment variable @variable in the provided list
     * @envp to @value.
     *
     * @param envp an environment list that can be freed using g_strfreev() (e.g., as
     *     returned from g_get_environ()), or null for an empty
     *     environment list
     * @param variable the environment variable to set, must not
     *     contain '='
     * @param value the value for to set the variable to
     * @param overwrite whether to change the variable if it already exists
     * @return the updated environment list. Free it using g_strfreev().
     * @since 2.32
     */
    @GLibVersion2_32
    public fun environSetenv(
        envp: List<kotlin.String>? = null,
        variable: kotlin.String,
        `value`: kotlin.String,
        overwrite: Boolean,
    ): List<kotlin.String> = memScoped {
        return g_environ_setenv(envp?.toCStringList(this), variable, `value`, overwrite.asGBoolean())?.toKStringList()
            ?: error("Expected not null string array")
    }

    /**
     * Removes the environment variable @variable from the provided
     * environment @envp.
     *
     * @param envp an environment list that can be freed using g_strfreev() (e.g., as
     *     returned from g_get_environ()), or null for an empty environment list
     * @param variable the environment variable to remove, must not
     *     contain '='
     * @return the updated environment list. Free it using g_strfreev().
     * @since 2.32
     */
    @GLibVersion2_32
    public fun environUnsetenv(envp: List<kotlin.String>? = null, variable: kotlin.String): List<kotlin.String> =
        memScoped {
            return g_environ_unsetenv(envp?.toCStringList(this), variable)?.toKStringList()
                ?: error("Expected not null string array")
        }

    /**
     * Mark every file descriptor equal to or greater than @lowfd to be closed
     * at the next `execve()` or similar, as if via the `FD_CLOEXEC` flag.
     *
     * Typically @lowfd will be 3, to leave standard input, standard output
     * and standard error open after exec.
     *
     * This is the same as Linux `close_range (lowfd, ~0U, CLOSE_RANGE_CLOEXEC)`,
     * but portable to other OSs and to older versions of Linux.
     *
     * This function is async-signal safe, making it safe to call from a
     * signal handler or a [callback@GLib.SpawnChildSetupFunc], as long as @lowfd is
     * non-negative.
     * See [`signal(7)`](man:signal(7)) and
     * [`signal-safety(7)`](man:signal-safety(7)) for more details.
     *
     * @param lowfd Minimum fd to act on, which must be non-negative
     * @return 0 on success, -1 with errno set on error
     * @since 2.80
     */
    @GLibVersion2_80
    public fun fdwalkSetCloexec(lowfd: gint): gint = g_fdwalk_set_cloexec(lowfd)

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
    public fun fileErrorFromErrno(errNo: gint): FileError = g_file_error_from_errno(errNo).run {
        FileError.fromNativeValue(this)
    }

    public fun fileErrorQuark(): Quark = g_file_error_quark()

    /**
     * Reads the contents of the symbolic link @filename like the POSIX
     * `readlink()` function.
     *
     * The returned string is in the encoding used for filenames. Use
     * g_filename_to_utf8() to convert it to UTF-8.
     *
     * The returned string may also be a relative path. Use g_build_filename()
     * to convert it to an absolute path:
     *
     * |[<!-- language="C" -->
     * g_autoptr(GError) local_error = NULL;
     * g_autofree gchar *link_target = g_file_read_link ("/etc/localtime", &local_error);
     *
     * if (local_error != NULL)
     *   g_error ("Error reading link: %s", local_error->message);
     *
     * if (!g_path_is_absolute (link_target))
     *   {
     *     g_autofree gchar *absolute_link_target = g_build_filename ("/etc", link_target, NULL);
     *     g_free (link_target);
     *     link_target = g_steal_pointer (&absolute_link_target);
     *   }
     * ]|
     *
     * @param filename the symbolic link
     * @return A newly-allocated string with
     *   the contents of the symbolic link, or null if an error occurred.
     * @since 2.4
     */
    @GLibVersion2_4
    public fun fileReadLink(filename: kotlin.String): Result<kotlin.String> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_file_read_link(filename, gError.ptr)?.toKString()
        return if (gError.pointed != null) {
            Result.failure(org.gtkkn.bindings.glib.GLib.resolveException(Error(gError.pointed!!.ptr)))
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
     * of the condition changing before you actually perform the operation,
     * see [TOCTOU](https://en.wikipedia.org/wiki/Time-of-check_to_time-of-use).
     *
     * For example, you might think you could use %G_FILE_TEST_IS_SYMLINK
     * to know whether it is safe to write to a file without being
     * tricked into writing into a different location. It doesn't work!
     *
     * |[<!-- language="C" -->
     *  // DON'T DO THIS
     *  if (!g_file_test (filename, G_FILE_TEST_IS_SYMLINK))
     *    {
     *      fd = g_open (filename, O_WRONLY);
     *      // write to fd
     *    }
     *
     *  // DO THIS INSTEAD
     *  fd = g_open (filename, O_WRONLY | O_NOFOLLOW | O_CLOEXEC);
     *  if (fd == -1)
     *    {
     *      // check error
     *      if (errno == ELOOP)
     *        // file is a symlink and can be ignored
     *      else
     *        // handle errors as before
     *    }
     *  else
     *    {
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
    public fun fileTest(filename: kotlin.String, test: FileTest): Boolean = g_file_test(filename, test.mask).asBoolean()

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
    @GLibVersion2_6
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
    @GLibVersion2_6
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
    public fun filenameToUri(filename: kotlin.String, hostname: kotlin.String? = null): Result<kotlin.String> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_filename_to_uri(filename, hostname, gError.ptr)?.toKString()
            return if (gError.pointed != null) {
                Result.failure(org.gtkkn.bindings.glib.GLib.resolveException(Error(gError.pointed!!.ptr)))
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
    public fun findProgramInPath(program: kotlin.String): kotlin.String? = g_find_program_in_path(program)?.toKString()

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
    @GLibVersion2_30
    public fun formatSize(size: guint64): kotlin.String =
        g_format_size(size)?.toKString() ?: error("Expected not null string")

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
    @GLibVersion2_16
    public fun formatSizeForDisplay(size: gint64): kotlin.String =
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
    @GLibVersion2_30
    public fun formatSizeFull(size: guint64, flags: FormatSizeFlags): kotlin.String =
        g_format_size_full(size, flags.mask)?.toKString() ?: error("Expected not null string")

    /**
     * Frees the memory pointed to by @mem.
     *
     * If you know the allocated size of @mem, calling g_free_sized() may be faster,
     * depending on the libc implementation in use.
     *
     * Starting from GLib 2.78, this may happen automatically in case a GCC
     * compatible compiler is used with some optimization level and the allocated
     * size is known at compile time (see [documentation of
     * `__builtin_object_size()`](https://gcc.gnu.org/onlinedocs/gcc/Object-Size-Checking.html)
     * to understand its caveats).
     *
     * If @mem is null it simply returns, so there is no need to check @mem
     * against null before calling this function.
     *
     * @param mem the memory to free
     */
    public fun free(mem: gpointer? = null): Unit = g_free(mem)

    /**
     * Frees the memory pointed to by @mem, assuming it is has the given @size.
     *
     * If @mem is null this is a no-op (and @size is ignored).
     *
     * It is an error if @size doesn’t match the size passed when @mem was
     * allocated. @size is passed to this function to allow optimizations in the
     * allocator. If you don’t know the allocation size, use g_free() instead.
     *
     * In case a GCC compatible compiler is used, this function may be used
     * automatically via g_free() if the allocated size is known at compile time,
     * since GLib 2.78.
     *
     * @param mem the memory to free
     * @param size size of @mem, in bytes
     * @since 2.76
     */
    @GLibVersion2_76
    public fun freeSized(mem: gpointer? = null, size: gsize): Unit = g_free_sized(mem, size)

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
    @GLibVersion2_2
    public fun getApplicationName(): kotlin.String? = g_get_application_name()?.toKString()

    /**
     * Gets the character set for the current locale.
     *
     * @return a newly allocated string containing the name
     *     of the character set. This string must be freed with g_free().
     */
    public fun getCodeset(): kotlin.String = g_get_codeset()?.toKString() ?: error("Expected not null string")

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
    public fun getCurrentDir(): kotlin.String = g_get_current_dir()?.toKString() ?: error("Expected not null string")

    /**
     * Equivalent to the UNIX gettimeofday() function, but portable.
     *
     * You may find g_get_real_time() to be more convenient.
     *
     * @param result #GTimeVal structure in which to store current time.
     */
    public fun getCurrentTime(result: TimeVal): Unit = g_get_current_time(result.gPointer)

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
     * @return the list of environment variables
     * @since 2.28
     */
    @GLibVersion2_28
    public fun getEnviron(): List<kotlin.String> =
        g_get_environ()?.toKStringList() ?: error("Expected not null string array")

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
    public fun getHomeDir(): kotlin.String = g_get_home_dir()?.toKString() ?: error("Expected not null string")

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
    @GLibVersion2_8
    public fun getHostName(): kotlin.String = g_get_host_name()?.toKString() ?: error("Expected not null string")

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
    @GLibVersion2_6
    public fun getLanguageNames(): List<kotlin.String> =
        g_get_language_names()?.toKStringList() ?: error("Expected not null string array")

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
     *    It must not be modified or freed. It must be copied if planned to be used in another thread.
     * @since 2.58
     */
    @GLibVersion2_58
    public fun getLanguageNamesWithCategory(categoryName: kotlin.String): List<kotlin.String> =
        g_get_language_names_with_category(categoryName)?.toKStringList() ?: error("Expected not null string array")

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
    @GLibVersion2_28
    public fun getLocaleVariants(locale: kotlin.String): List<kotlin.String> =
        g_get_locale_variants(locale)?.toKStringList() ?: error("Expected not null string array")

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
    @GLibVersion2_28
    public fun getMonotonicTime(): gint64 = g_get_monotonic_time()

    /**
     * Determine the approximate number of threads that the system will
     * schedule simultaneously for this process.  This is intended to be
     * used as a parameter to g_thread_pool_new() for CPU bound tasks and
     * similar cases.
     *
     * @return Number of schedulable threads, always greater than 0
     * @since 2.36
     */
    @GLibVersion2_36
    public fun getNumProcessors(): guint = g_get_num_processors()

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
    @GLibVersion2_64
    public fun getOsInfo(keyName: kotlin.String): kotlin.String? = g_get_os_info(keyName)?.toKString()

    /**
     * Gets the name of the program. This name should not be localized,
     * in contrast to g_get_application_name().
     *
     * If you are using #GApplication the program name is set in
     * g_application_run(). In case of GDK or GTK it is set in
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
    public fun getRealName(): kotlin.String = g_get_real_name()?.toKString() ?: error("Expected not null string")

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
    @GLibVersion2_28
    public fun getRealTime(): gint64 = g_get_real_time()

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
     * @return a null-terminated array of strings owned by GLib that must not be
     *     modified or freed.
     * @since 2.6
     */
    @GLibVersion2_6
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
     * @return a null-terminated array of strings owned by GLib that must not be
     *     modified or freed.
     * @since 2.6
     */
    @GLibVersion2_6
    public fun getSystemDataDirs(): List<kotlin.String> =
        g_get_system_data_dirs()?.toKStringList() ?: error("Expected not null string array")

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
    public fun getTmpDir(): kotlin.String = g_get_tmp_dir()?.toKString() ?: error("Expected not null string")

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
     * See the [documentation for `FOLDERID_InternetCache`](https://docs.microsoft.com/en-us/windows/win32/shell/knownfolderid).
     *
     * The return value is cached and modifying it at runtime is not supported, as
     * it’s not thread-safe to modify environment variables at runtime.
     *
     * @return a string owned by GLib that
     *   must not be modified or freed.
     * @since 2.6
     */
    @GLibVersion2_6
    public fun getUserCacheDir(): kotlin.String =
        g_get_user_cache_dir()?.toKString() ?: error("Expected not null string")

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
     * [documentation for `FOLDERID_LocalAppData`](https://docs.microsoft.com/en-us/windows/win32/shell/knownfolderid).
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
    @GLibVersion2_6
    public fun getUserConfigDir(): kotlin.String =
        g_get_user_config_dir()?.toKString() ?: error("Expected not null string")

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
     * [documentation for `FOLDERID_LocalAppData`](https://docs.microsoft.com/en-us/windows/win32/shell/knownfolderid).
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
    @GLibVersion2_6
    public fun getUserDataDir(): kotlin.String = g_get_user_data_dir()?.toKString() ?: error("Expected not null string")

    /**
     * Gets the user name of the current user. The encoding of the returned
     * string is system-defined. On UNIX, it might be the preferred file name
     * encoding, or something else, and there is no guarantee that it is even
     * consistent on a machine. On Windows, it is always UTF-8.
     *
     * @return the user name of the current user.
     */
    public fun getUserName(): kotlin.String = g_get_user_name()?.toKString() ?: error("Expected not null string")

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
    @GLibVersion2_28
    public fun getUserRuntimeDir(): kotlin.String =
        g_get_user_runtime_dir()?.toKString() ?: error("Expected not null string")

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
    @GLibVersion2_14
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
     * [documentation for `FOLDERID_LocalAppData`](https://docs.microsoft.com/en-us/windows/win32/shell/knownfolderid).
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
    @GLibVersion2_72
    public fun getUserStateDir(): kotlin.String =
        g_get_user_state_dir()?.toKString() ?: error("Expected not null string")

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
    @GLibVersion2_22
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
    @GLibVersion2_22
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
    @GLibVersion2_22
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
    @GLibVersion2_22
    public fun hostnameToAscii(hostname: kotlin.String): kotlin.String? = g_hostname_to_ascii(hostname)?.toKString()

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
    @GLibVersion2_22
    public fun hostnameToUnicode(hostname: kotlin.String): kotlin.String? = g_hostname_to_unicode(hostname)?.toKString()

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
    public fun idleAdd(priority: gint, function: SourceFunc): guint = g_idle_add_full(
        priority,
        SourceFuncFunc.reinterpret(),
        StableRef.create(function).asCPointer(),
        staticStableRefDestroy.reinterpret()
    )

    /**
     * Adds a function to be called whenever there are no higher priority
     * events pending to the default main loop. The function is given the
     * default idle priority, %G_PRIORITY_DEFAULT_IDLE.
     *
     * The function will only be called once and then the source will be
     * automatically removed from the main context.
     *
     * This function otherwise behaves like g_idle_add().
     *
     * @param function function to call
     * @return the ID (greater than 0) of the event source
     * @since 2.74
     */
    @GLibVersion2_74
    public fun idleAddOnce(function: SourceOnceFunc): guint =
        g_idle_add_once(SourceOnceFuncFunc.reinterpret(), StableRef.create(function).asCPointer())

    /**
     * Removes the idle function with the given data.
     *
     * @param data the data for the idle source's callback.
     * @return true if an idle source was found and removed.
     */
    public fun idleRemoveByData(`data`: gpointer? = null): Boolean = g_idle_remove_by_data(`data`).asBoolean()

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
    public fun idleSourceNew(): Source = g_idle_source_new()!!.run {
        Source(this)
    }

    /**
     * Compares the two #gint64 values being pointed to and returns
     * true if they are equal.
     * It can be passed to g_hash_table_new() as the @key_equal_func
     * parameter, when using non-null pointers to 64-bit integers as keys in a
     * #GHashTable.
     *
     * @param v1 a pointer to a #gint64 key
     * @param v2 a pointer to a #gint64 key to compare with @v1
     * @return true if the two keys match.
     * @since 2.22
     */
    @GLibVersion2_22
    public fun int64Equal(v1: gpointer, v2: gpointer): Boolean = g_int64_equal(v1, v2).asBoolean()

    /**
     * Converts a pointer to a #gint64 to a hash value.
     *
     * It can be passed to g_hash_table_new() as the @hash_func parameter,
     * when using non-null pointers to 64-bit integer values as keys in a
     * #GHashTable.
     *
     * @param v a pointer to a #gint64 key
     * @return a hash value corresponding to the key.
     * @since 2.22
     */
    @GLibVersion2_22
    public fun int64Hash(v: gpointer): guint = g_int64_hash(v)

    /**
     * Compares the two #gint values being pointed to and returns
     * true if they are equal.
     * It can be passed to g_hash_table_new() as the @key_equal_func
     * parameter, when using non-null pointers to integers as keys in a
     * #GHashTable.
     *
     * Note that this function acts on pointers to #gint, not on #gint
     * directly: if your hash table's keys are of the form
     * `GINT_TO_POINTER (n)`, use g_direct_equal() instead.
     *
     * @param v1 a pointer to a #gint key
     * @param v2 a pointer to a #gint key to compare with @v1
     * @return true if the two keys match.
     */
    public fun intEqual(v1: gpointer, v2: gpointer): Boolean = g_int_equal(v1, v2).asBoolean()

    /**
     * Converts a pointer to a #gint to a hash value.
     * It can be passed to g_hash_table_new() as the @hash_func parameter,
     * when using non-null pointers to integer values as keys in a #GHashTable.
     *
     * Note that this function acts on pointers to #gint, not on #gint
     * directly: if your hash table's keys are of the form
     * `GINT_TO_POINTER (n)`, use g_direct_hash() instead.
     *
     * @param v a pointer to a #gint key
     * @return a hash value corresponding to the key.
     */
    public fun intHash(v: gpointer): guint = g_int_hash(v)

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
    @GLibVersion2_10
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
    @GLibVersion2_10
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
    public fun ioAddWatch(channel: IoChannel, priority: gint, condition: IoCondition, func: IoFunc): guint =
        g_io_add_watch_full(
            channel.gPointer,
            priority,
            condition.mask,
            IoFuncFunc.reinterpret(),
            StableRef.create(func).asCPointer(),
            staticStableRefDestroy.reinterpret()
        )

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
    public fun ioCreateWatch(channel: IoChannel, condition: IoCondition): Source =
        g_io_create_watch(channel.gPointer, condition.mask)!!.run {
            Source(this)
        }

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
     * @return a null-terminated list of strings which must be freed with
     *     g_strfreev().
     * @since 2.8
     */
    @GLibVersion2_8
    public fun listenv(): List<kotlin.String> = g_listenv()?.toKStringList() ?: error("Expected not null string array")

    /**
     * The default log handler set up by GLib; [func@GLib.log_set_default_handler]
     * allows to install an alternate default log handler.
     *
     * This is used if no log handler has been set for the particular log
     * domain and log level combination. It outputs the message to `stderr`
     * or `stdout` and if the log level is fatal it calls [func@GLib.BREAKPOINT]. It automatically
     * prints a new-line character after the message, so one does not need to be
     * manually included in @message.
     *
     * The behavior of this log handler can be influenced by a number of
     * environment variables:
     *
     *   - `G_MESSAGES_PREFIXED`: A `:`-separated list of log levels for which
     *     messages should be prefixed by the program name and PID of the
     *     application.
     *   - `G_MESSAGES_DEBUG`: A space-separated list of log domains for
     *     which debug and informational messages are printed. By default
     *     these messages are not printed. If you need to set the allowed
     *     domains at runtime, use [func@GLib.log_writer_default_set_debug_domains].
     *
     * `stderr` is used for levels [flags@GLib.LogLevelFlags.LEVEL_ERROR],
     * [flags@GLib.LogLevelFlags.LEVEL_CRITICAL], [flags@GLib.LogLevelFlags.LEVEL_WARNING] and
     * [flags@GLib.LogLevelFlags.LEVEL_MESSAGE]. `stdout` is used for
     * the rest, unless `stderr` was requested by
     * [func@GLib.log_writer_default_set_use_stderr].
     *
     * This has no effect if structured logging is enabled; see
     * [Using Structured Logging](logging.html#using-structured-logging).
     *
     * @param logDomain the log domain of the message, or `NULL` for the
     *   default `""` application domain
     * @param logLevel the level of the message
     * @param message the message
     * @param unusedData data passed from [func@GLib.log] which is unused
     */
    public fun logDefaultHandler(
        logDomain: kotlin.String? = null,
        logLevel: LogLevelFlags,
        message: kotlin.String? = null,
        unusedData: gpointer? = null,
    ): Unit = g_log_default_handler(logDomain, logLevel.mask, message, unusedData)

    /**
     * Return whether debug output from the GLib logging system is enabled.
     *
     * Note that this should not be used to conditionalise calls to [func@GLib.debug] or
     * other logging functions; it should only be used from [type@GLib.LogWriterFunc]
     * implementations.
     *
     * Note also that the value of this does not depend on `G_MESSAGES_DEBUG`, nor
     * [func@GLib.log_writer_default_set_debug_domains]; see the docs for [func@GLib.log_set_debug_enabled].
     *
     * @return `TRUE` if debug output is enabled, `FALSE` otherwise
     * @since 2.72
     */
    @GLibVersion2_72
    public fun logGetDebugEnabled(): Boolean = g_log_get_debug_enabled().asBoolean()

    /**
     * Removes the log handler.
     *
     * This has no effect if structured logging is enabled; see
     * [Using Structured Logging](logging.html#using-structured-logging).
     *
     * @param logDomain the log domain
     * @param handlerId the ID of the handler, which was returned
     *   in [func@GLib.log_set_handler]
     */
    public fun logRemoveHandler(logDomain: kotlin.String, handlerId: guint): Unit =
        g_log_remove_handler(logDomain, handlerId)

    /**
     * Sets the message levels which are always fatal, in any log domain.
     *
     * When a message with any of these levels is logged the program terminates.
     * You can only set the levels defined by GLib to be fatal.
     * [flags@GLib.LogLevelFlags.LEVEL_ERROR] is always fatal.
     *
     * You can also make some message levels fatal at runtime by setting
     * the `G_DEBUG` environment variable (see
     * [Running GLib Applications](glib-running.html)).
     *
     * Libraries should not call this function, as it affects all messages logged
     * by a process, including those from other libraries.
     *
     * Structured log messages (using [func@GLib.log_structured] and
     * [func@GLib.log_structured_array]) are fatal only if the default log writer is used;
     * otherwise it is up to the writer function to determine which log messages
     * are fatal. See [Using Structured Logging](logging.html#using-structured-logging).
     *
     * @param fatalMask the mask containing bits set for each level of error which is
     *   to be fatal
     * @return the old fatal mask
     */
    public fun logSetAlwaysFatal(fatalMask: LogLevelFlags): LogLevelFlags = g_log_set_always_fatal(fatalMask.mask).run {
        LogLevelFlags(this)
    }

    /**
     * Enable or disable debug output from the GLib logging system for all domains.
     *
     * This value interacts disjunctively with `G_MESSAGES_DEBUG` and
     * [func@GLib.log_writer_default_set_debug_domains] — if any of them would allow
     * a debug message to be outputted, it will be.
     *
     * Note that this should not be used from within library code to enable debug
     * output — it is intended for external use.
     *
     * @param enabled `TRUE` to enable debug output, `FALSE` otherwise
     * @since 2.72
     */
    @GLibVersion2_72
    public fun logSetDebugEnabled(enabled: Boolean): Unit = g_log_set_debug_enabled(enabled.asGBoolean())

    /**
     * Sets the log levels which are fatal in the given domain.
     *
     * [flags@GLib.LogLevelFlags.LEVEL_ERROR] is always fatal.
     *
     * This has no effect on structured log messages (using [func@GLib.log_structured] or
     * [func@GLib.log_structured_array]). To change the fatal behaviour for specific log
     * messages, programs must install a custom log writer function using
     * [func@GLib.log_set_writer_func]. See
     * [Using Structured Logging](logging.html#using-structured-logging).
     *
     * This function is mostly intended to be used with
     * [flags@GLib.LogLevelFlags.LEVEL_CRITICAL].  You should typically not set
     * [flags@GLib.LogLevelFlags.LEVEL_WARNING], [flags@GLib.LogLevelFlags.LEVEL_MESSAGE], [flags@GLib.LogLevelFlags.LEVEL_INFO] or
     * [flags@GLib.LogLevelFlags.LEVEL_DEBUG] as fatal except inside of test programs.
     *
     * @param logDomain the log domain
     * @param fatalMask the new fatal mask
     * @return the old fatal mask for the log domain
     */
    public fun logSetFatalMask(logDomain: kotlin.String, fatalMask: LogLevelFlags): LogLevelFlags =
        g_log_set_fatal_mask(logDomain, fatalMask.mask).run {
            LogLevelFlags(this)
        }

    /**
     * Like [func@GLib.log_set_handler], but takes a destroy notify for the @user_data.
     *
     * This has no effect if structured logging is enabled; see
     * [Using Structured Logging](logging.html#using-structured-logging).
     *
     * @param logDomain the log domain, or `NULL` for the default `""`
     *   application domain
     * @param logLevels the log levels to apply the log handler for.
     *   To handle fatal and recursive messages as well, combine
     *   the log levels with the [flags@GLib.LogLevelFlags.FLAG_FATAL] and
     *   [flags@GLib.LogLevelFlags.FLAG_RECURSION] bit flags.
     * @param logFunc the log handler function
     * @return the ID of the new handler
     * @since 2.46
     */
    @GLibVersion2_46
    public fun logSetHandler(logDomain: kotlin.String? = null, logLevels: LogLevelFlags, logFunc: LogFunc): guint =
        g_log_set_handler_full(
            logDomain,
            logLevels.mask,
            LogFuncFunc.reinterpret(),
            StableRef.create(logFunc).asCPointer(),
            staticStableRefDestroy.reinterpret()
        )

    /**
     * Set a writer function which will be called to format and write out each log
     * message.
     *
     * Each program should set a writer function, or the default writer
     * ([func@GLib.log_writer_default]) will be used.
     *
     * Libraries **must not** call this function — only programs are allowed to
     * install a writer function, as there must be a single, central point where
     * log messages are formatted and outputted.
     *
     * There can only be one writer function. It is an error to set more than one.
     *
     * @param func log writer function, which must not be `NULL`
     * @since 2.50
     */
    @GLibVersion2_50
    public fun logSetWriterFunc(func: LogWriterFunc?): Unit = g_log_set_writer_func(
        func?.let {
            LogWriterFuncFunc.reinterpret()
        },
        func?.let { StableRef.create(func).asCPointer() },
        func?.let { staticStableRefDestroy.reinterpret() }
    )

    /**
     * Log a message with structured data, accepting the data within a [type@GLib.Variant].
     *
     * This version is especially useful for use in other languages, via introspection.
     *
     * The only mandatory item in the @fields dictionary is the `"MESSAGE"` which must
     * contain the text shown to the user.
     *
     * The values in the @fields dictionary are likely to be of type `G_VARIANT_TYPE_STRING`.
     * Array of bytes (`G_VARIANT_TYPE_BYTESTRING`) is also
     * supported. In this case the message is handled as binary and will be forwarded
     * to the log writer as such. The size of the array should not be higher than
     * `G_MAXSSIZE`. Otherwise it will be truncated to this size. For other types
     * [method@GLib.Variant.print] will be used to convert the value into a string.
     *
     * For more details on its usage and about the parameters, see [func@GLib.log_structured].
     *
     * @param logDomain log domain, usually `G_LOG_DOMAIN`
     * @param logLevel log level, either from [type@GLib.LogLevelFlags], or a user-defined
     *    level
     * @param fields a dictionary ([type@GLib.Variant] of the type `G_VARIANT_TYPE_VARDICT`)
     * containing the key-value pairs of message data.
     * @since 2.50
     */
    @GLibVersion2_50
    public fun logVariant(logDomain: kotlin.String? = null, logLevel: LogLevelFlags, fields: Variant): Unit =
        g_log_variant(logDomain, logLevel.mask, fields.gPointer)

    /**
     * Configure whether the built-in log functions will output all log messages to
     * `stderr`.
     *
     * The built-in log functions are [func@GLib.log_default_handler] for the
     * old-style API, and both [func@GLib.log_writer_default] and
     * [func@GLib.log_writer_standard_streams] for the structured API.
     *
     * By default, log messages of levels [flags@GLib.LogLevelFlags.LEVEL_INFO] and
     * [flags@GLib.LogLevelFlags.LEVEL_DEBUG] are sent to `stdout`, and other log messages are
     * sent to `stderr`. This is problematic for applications that intend
     * to reserve `stdout` for structured output such as JSON or XML.
     *
     * This function sets global state. It is not thread-aware, and should be
     * called at the very start of a program, before creating any other threads
     * or creating objects that could create worker threads of their own.
     *
     * @param useStderr If `TRUE`, use `stderr` for log messages that would
     *  normally have appeared on `stdout`
     * @since 2.68
     */
    @GLibVersion2_68
    public fun logWriterDefaultSetUseStderr(useStderr: Boolean): Unit =
        g_log_writer_default_set_use_stderr(useStderr.asGBoolean())

    /**
     * Check whether [func@GLib.log_writer_default] and [func@GLib.log_default_handler] would
     * ignore a message with the given domain and level.
     *
     * As with [func@GLib.log_default_handler], this function drops debug and informational
     * messages unless their log domain (or `all`) is listed in the space-separated
     * `G_MESSAGES_DEBUG` environment variable, or by [func@GLib.log_writer_default_set_debug_domains].
     *
     * This can be used when implementing log writers with the same filtering
     * behaviour as the default, but a different destination or output format:
     *
     * ```c
     * if (g_log_writer_default_would_drop (log_level, log_domain))
     *   return G_LOG_WRITER_HANDLED;
     * ]|
     *
     * or to skip an expensive computation if it is only needed for a debugging
     * message, and `G_MESSAGES_DEBUG` is not set:
     *
     * ```c
     * if (!g_log_writer_default_would_drop (G_LOG_LEVEL_DEBUG, G_LOG_DOMAIN))
     *   {
     *     g_autofree gchar *result = expensive_computation (my_object);
     *
     *     g_debug ("my_object result: %s", result);
     *   }
     * ```
     *
     * @param logLevel log level, either from [type@GLib.LogLevelFlags], or a user-defined
     *    level
     * @param logDomain log domain
     * @return `TRUE` if the log message would be dropped by GLib’s
     *   default log handlers
     * @since 2.68
     */
    @GLibVersion2_68
    public fun logWriterDefaultWouldDrop(logLevel: LogLevelFlags, logDomain: kotlin.String? = null): Boolean =
        g_log_writer_default_would_drop(logLevel.mask, logDomain).asBoolean()

    /**
     * Check whether the given @output_fd file descriptor is a connection to the
     * systemd journal, or something else (like a log file or `stdout` or
     * `stderr`).
     *
     * Invalid file descriptors are accepted and return `FALSE`, which allows for
     * the following construct without needing any additional error handling:
     * ```c
     * is_journald = g_log_writer_is_journald (fileno (stderr));
     * ```
     *
     * @param outputFd output file descriptor to check
     * @return `TRUE` if @output_fd points to the journal, `FALSE` otherwise
     * @since 2.50
     */
    @GLibVersion2_50
    public fun logWriterIsJournald(outputFd: gint): Boolean = g_log_writer_is_journald(outputFd).asBoolean()

    /**
     * Check whether the given @output_fd file descriptor supports
     * [ANSI color escape sequences](https://en.wikipedia.org/wiki/ANSI_escape_code).
     *
     * If so, they can safely be used when formatting log messages.
     *
     * @param outputFd output file descriptor to check
     * @return `TRUE` if ANSI color escapes are supported, `FALSE` otherwise
     * @since 2.50
     */
    @GLibVersion2_50
    public fun logWriterSupportsColor(outputFd: gint): Boolean = g_log_writer_supports_color(outputFd).asBoolean()

    /**
     * Returns the currently firing source for this thread.
     *
     * @return The currently firing source or null.
     * @since 2.12
     */
    @GLibVersion2_12
    public fun mainCurrentSource(): Source? = g_main_current_source()?.run {
        Source(this)
    }

    /**
     * Returns the depth of the stack of calls to
     * g_main_context_dispatch() on any #GMainContext in the current thread.
     * That is, when called from the toplevel, it gives 0. When
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
    public fun mainDepth(): gint = g_main_depth()

    /**
     * Allocates @n_bytes bytes of memory.
     * If @n_bytes is 0 it returns null.
     *
     * If the allocation fails (because the system is out of memory),
     * the program is terminated.
     *
     * @param nBytes the number of bytes to allocate
     * @return a pointer to the allocated memory
     */
    public fun malloc(nBytes: gsize): gpointer? = g_malloc(nBytes)

    /**
     * Allocates @n_bytes bytes of memory, initialized to 0's.
     * If @n_bytes is 0 it returns null.
     *
     * If the allocation fails (because the system is out of memory),
     * the program is terminated.
     *
     * @param nBytes the number of bytes to allocate
     * @return a pointer to the allocated memory
     */
    public fun malloc0(nBytes: gsize): gpointer? = g_malloc0(nBytes)

    /**
     * This function is similar to g_malloc0(), allocating (@n_blocks * @n_block_bytes) bytes,
     * but care is taken to detect possible overflow during multiplication.
     *
     * If the allocation fails (because the system is out of memory),
     * the program is terminated.
     *
     * @param nBlocks the number of blocks to allocate
     * @param nBlockBytes the size of each block in bytes
     * @return a pointer to the allocated memory
     * @since 2.24
     */
    @GLibVersion2_24
    public fun malloc0N(nBlocks: gsize, nBlockBytes: gsize): gpointer? = g_malloc0_n(nBlocks, nBlockBytes)

    /**
     * This function is similar to g_malloc(), allocating (@n_blocks * @n_block_bytes) bytes,
     * but care is taken to detect possible overflow during multiplication.
     *
     * If the allocation fails (because the system is out of memory),
     * the program is terminated.
     *
     * @param nBlocks the number of blocks to allocate
     * @param nBlockBytes the size of each block in bytes
     * @return a pointer to the allocated memory
     * @since 2.24
     */
    @GLibVersion2_24
    public fun mallocN(nBlocks: gsize, nBlockBytes: gsize): gpointer? = g_malloc_n(nBlocks, nBlockBytes)

    public fun markupErrorQuark(): Quark = g_markup_error_quark()

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
    public fun markupEscapeText(text: kotlin.String, length: Long): kotlin.String =
        g_markup_escape_text(text, length)?.toKString() ?: error("Expected not null string")

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
    public fun memSetVtable(vtable: MemVTable): Unit = g_mem_set_vtable(vtable.gPointer)

    /**
     * Allocates @byte_size bytes of memory, and copies @byte_size bytes into it
     * from @mem. If @mem is `NULL` it returns `NULL`.
     *
     * @param mem the memory to copy
     * @param byteSize the number of bytes to copy
     * @return a pointer to the newly-allocated copy of the memory
     */
    public fun memdup(mem: gpointer? = null, byteSize: guint): gpointer? = g_memdup(mem, byteSize)

    /**
     * Allocates @byte_size bytes of memory, and copies @byte_size bytes into it
     * from @mem. If @mem is `NULL` it returns `NULL`.
     *
     * This replaces [func@GLib.memdup], which was prone to integer overflows when
     * converting the argument from a `gsize` to a `guint`.
     *
     * @param mem the memory to copy
     * @param byteSize the number of bytes to copy
     * @return a pointer to the newly-allocated copy of the memory
     * @since 2.68
     */
    @GLibVersion2_68
    public fun memdup2(mem: gpointer? = null, byteSize: gsize): gpointer? = g_memdup2(mem, byteSize)

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
    @GLibVersion2_8
    public fun mkdirWithParents(pathname: kotlin.String, mode: gint): gint = g_mkdir_with_parents(pathname, mode)

    /**
     * Creates a temporary directory. See the mkdtemp() documentation
     * on most UNIX-like systems.
     *
     * The parameter is a string that should follow the rules for
     * mkdtemp() templates, i.e. contain the string "XXXXXX".
     * g_mkdtemp() is slightly more flexible than mkdtemp() in that the
     * sequence does not have to occur at the very end of the template.
     * The X string will be modified to form the name of a directory that
     * didn't exist.
     * The string should be in the GLib file name encoding. Most importantly,
     * on Windows it should be in UTF-8.
     *
     * If you are going to be creating a temporary directory inside the
     * directory returned by g_get_tmp_dir(), you might want to use
     * g_dir_make_tmp() instead.
     *
     * @param tmpl template directory name
     * @return A pointer to @tmpl, which has been
     *   modified to hold the directory name.  In case of errors, null is
     *   returned and %errno will be set.
     * @since 2.30
     */
    @GLibVersion2_30
    public fun mkdtemp(tmpl: kotlin.String): kotlin.String? = g_mkdtemp(tmpl.cstr)?.toKString()

    /**
     * Creates a temporary directory. See the mkdtemp() documentation
     * on most UNIX-like systems.
     *
     * The parameter is a string that should follow the rules for
     * mkdtemp() templates, i.e. contain the string "XXXXXX".
     * g_mkdtemp_full() is slightly more flexible than mkdtemp() in that the
     * sequence does not have to occur at the very end of the template
     * and you can pass a @mode. The X string will be modified to form
     * the name of a directory that didn't exist. The string should be
     * in the GLib file name encoding. Most importantly, on Windows it
     * should be in UTF-8.
     *
     * If you are going to be creating a temporary directory inside the
     * directory returned by g_get_tmp_dir(), you might want to use
     * g_dir_make_tmp() instead.
     *
     * @param tmpl template directory name
     * @param mode permissions to create the temporary directory with
     * @return A pointer to @tmpl, which has been
     *   modified to hold the directory name. In case of errors, null is
     *   returned, and %errno will be set.
     * @since 2.30
     */
    @GLibVersion2_30
    public fun mkdtempFull(tmpl: kotlin.String, mode: gint): kotlin.String? =
        g_mkdtemp_full(tmpl.cstr, mode)?.toKString()

    /**
     * Opens a temporary file. See the mkstemp() documentation
     * on most UNIX-like systems.
     *
     * The parameter is a string that should follow the rules for
     * mkstemp() templates, i.e. contain the string "XXXXXX".
     * g_mkstemp() is slightly more flexible than mkstemp() in that the
     * sequence does not have to occur at the very end of the template.
     * The X string will be modified to form the name of a file that
     * didn't exist. The string should be in the GLib file name encoding.
     * Most importantly, on Windows it should be in UTF-8.
     *
     * @param tmpl template filename
     * @return A file handle (as from open()) to the file
     *   opened for reading and writing. The file is opened in binary
     *   mode on platforms where there is a difference. The file handle
     *   should be closed with close(). In case of errors, -1 is
     *   returned and %errno will be set.
     */
    public fun mkstemp(tmpl: kotlin.String): gint = g_mkstemp(tmpl.cstr)

    /**
     * Opens a temporary file. See the mkstemp() documentation
     * on most UNIX-like systems.
     *
     * The parameter is a string that should follow the rules for
     * mkstemp() templates, i.e. contain the string "XXXXXX".
     * g_mkstemp_full() is slightly more flexible than mkstemp()
     * in that the sequence does not have to occur at the very end of the
     * template and you can pass a @mode and additional @flags. The X
     * string will be modified to form the name of a file that didn't exist.
     * The string should be in the GLib file name encoding. Most importantly,
     * on Windows it should be in UTF-8.
     *
     * @param tmpl template filename
     * @param flags flags to pass to an open() call in addition to O_EXCL
     *   and O_CREAT, which are passed automatically
     * @param mode permissions to create the temporary file with
     * @return A file handle (as from open()) to the file
     *   opened for reading and writing. The file handle should be
     *   closed with close(). In case of errors, -1 is returned
     *   and %errno will be set.
     * @since 2.22
     */
    @GLibVersion2_22
    public fun mkstempFull(tmpl: kotlin.String, flags: gint, mode: gint): gint = g_mkstemp_full(tmpl.cstr, flags, mode)

    public fun numberParserErrorQuark(): Quark = g_number_parser_error_quark()

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

    public fun optionErrorQuark(): Quark = g_option_error_quark()

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
     *   containing the last component of the filename
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
     * Matches a string against a compiled pattern. Passing the correct
     * length of the string given is mandatory. The reversed string can be
     * omitted by passing null, this is more efficient if the reversed
     * version of the string to be matched is not at hand, as
     * g_pattern_match() will only construct it if the compiled pattern
     * requires reverse matches.
     *
     * Note that, if the user code will (possibly) match a string against a
     * multitude of patterns containing wildcards, chances are high that
     * some patterns will require a reversed string. In this case, it's
     * more efficient to provide the reversed string to avoid multiple
     * constructions thereof in the various calls to g_pattern_match().
     *
     * Note also that the reverse of a UTF-8 encoded string can in general
     * not be obtained by g_strreverse(). This works only if the string
     * does not contain any multibyte characters. GLib offers the
     * g_utf8_strreverse() function to reverse UTF-8 encoded strings.
     *
     * @param pspec a #GPatternSpec
     * @param stringLength the length of @string (in bytes, i.e. strlen(),
     *     not g_utf8_strlen())
     * @param string the UTF-8 encoded string to match
     * @param stringReversed the reverse of @string or null
     * @return true if @string matches @pspec
     */
    public fun patternMatch(
        pspec: PatternSpec,
        stringLength: guint,
        string: kotlin.String,
        stringReversed: kotlin.String? = null,
    ): Boolean = g_pattern_match(pspec.gPointer, stringLength, string, stringReversed).asBoolean()

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
    public fun patternMatchSimple(pattern: kotlin.String, string: kotlin.String): Boolean =
        g_pattern_match_simple(pattern, string).asBoolean()

    /**
     * Matches a string against a compiled pattern. If the string is to be
     * matched against more than one pattern, consider using
     * g_pattern_match() instead while supplying the reversed string.
     *
     * @param pspec a #GPatternSpec
     * @param string the UTF-8 encoded string to match
     * @return true if @string matches @pspec
     */
    public fun patternMatchString(pspec: PatternSpec, string: kotlin.String): Boolean =
        g_pattern_match_string(pspec.gPointer, string).asBoolean()

    /**
     * This mangles @ptr as g_pointer_bit_lock() and g_pointer_bit_unlock()
     * do.
     *
     * @param ptr the pointer to mask
     * @param lockBit the bit to set/clear. If set to `G_MAXUINT`, the
     *   lockbit is taken from @preserve_ptr or @ptr (depending on @preserve_mask).
     * @param set whether to set (lock) the bit or unset (unlock). This
     *   has no effect, if @lock_bit is set to `G_MAXUINT`.
     * @param preserveMask if non-zero, a bit-mask for @preserve_ptr. The
     *   @preserve_mask bits from @preserve_ptr are set in the result.
     *   Note that the @lock_bit bit will be always set according to @set,
     *   regardless of @preserve_mask and @preserve_ptr (unless @lock_bit is
     *   `G_MAXUINT`).
     * @param preservePtr if @preserve_mask is non-zero, the bits
     *   from this pointer are set in the result.
     * @return the mangled pointer.
     * @since 2.80
     */
    @GLibVersion2_80
    public fun pointerBitLockMaskPtr(
        ptr: gpointer? = null,
        lockBit: guint,
        `set`: Boolean,
        preserveMask: guintptr,
        preservePtr: gpointer? = null,
    ): gpointer? = g_pointer_bit_lock_mask_ptr(ptr, lockBit, `set`.asGBoolean(), preserveMask, preservePtr)

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
    @GLibVersion2_20
    public fun poll(fds: PollFd, nfds: guint, timeout: gint): gint = g_poll(fds.gPointer, nfds, timeout)

    /**
     * This is just like the standard C qsort() function, but
     * the comparison routine accepts a user data argument.
     *
     * This is guaranteed to be a stable sort since version 2.32.
     *
     * @param pbase start of array to sort
     * @param totalElems elements in the array
     * @param size size of each element
     * @param compareFunc function to compare elements
     */
    public fun qsortWithData(pbase: gpointer, totalElems: gint, size: gsize, compareFunc: CompareDataFunc): Unit =
        g_qsort_with_data(
            pbase,
            totalElems,
            size,
            CompareDataFuncFunc.reinterpret(),
            StableRef.create(compareFunc).asCPointer()
        )

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
     * function in GTK theme engines).
     *
     * This function must not be used before library constructors have finished
     * running. In particular, this means it cannot be used to initialize global
     * variables in C++.
     *
     * @param string a string
     * @return the #GQuark identifying the string, or 0 if @string is null
     */
    public fun quarkFromStaticString(string: kotlin.String? = null): Quark = g_quark_from_static_string(string)

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
    public fun quarkFromString(string: kotlin.String? = null): Quark = g_quark_from_string(string)

    /**
     * Gets the string associated with the given #GQuark.
     *
     * @param quark a #GQuark.
     * @return the string associated with the #GQuark
     */
    public fun quarkToString(quark: Quark): kotlin.String =
        g_quark_to_string(quark)?.toKString() ?: error("Expected not null string")

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
    public fun quarkTryString(string: kotlin.String? = null): Quark = g_quark_try_string(string)

    /**
     * Returns a random #gdouble equally distributed over the range [0..1).
     *
     * @return a random number
     */
    public fun randomDouble(): gdouble = g_random_double()

    /**
     * Returns a random #gdouble equally distributed over the range
     * [@begin..@end).
     *
     * @param begin lower closed bound of the interval
     * @param end upper open bound of the interval
     * @return a random number
     */
    public fun randomDoubleRange(begin: gdouble, end: gdouble): gdouble = g_random_double_range(begin, end)

    /**
     * Return a random #guint32 equally distributed over the range
     * [0..2^32-1].
     *
     * @return a random number
     */
    public fun randomInt(): guint = g_random_int()

    /**
     * Returns a random #gint32 equally distributed over the range
     * [@begin..@end-1].
     *
     * @param begin lower closed bound of the interval
     * @param end upper open bound of the interval
     * @return a random number
     */
    public fun randomIntRange(begin: gint, end: gint): gint = g_random_int_range(begin, end)

    /**
     * Sets the seed for the global random number generator, which is used
     * by the g_random_* functions, to @seed.
     *
     * @param seed a value to reinitialize the global random number generator
     */
    public fun randomSetSeed(seed: guint): Unit = g_random_set_seed(seed)

    /**
     * Acquires a reference on the data pointed by @mem_block.
     *
     * @param memBlock a pointer to reference counted data
     * @return a pointer to the data,
     *   with its reference count increased
     * @since 2.58
     */
    @GLibVersion2_58
    public fun rcBoxAcquire(memBlock: gpointer): gpointer = g_rc_box_acquire(memBlock)!!

    /**
     * Allocates @block_size bytes of memory, and adds reference
     * counting semantics to it.
     *
     * The data will be freed when its reference count drops to
     * zero.
     *
     * The allocated data is guaranteed to be suitably aligned for any
     * built-in type.
     *
     * @param blockSize the size of the allocation, must be greater than 0
     * @return a pointer to the allocated memory
     * @since 2.58
     */
    @GLibVersion2_58
    public fun rcBoxAlloc(blockSize: gsize): gpointer = g_rc_box_alloc(blockSize)!!

    /**
     * Allocates @block_size bytes of memory, and adds reference
     * counting semantics to it.
     *
     * The contents of the returned data is set to zero.
     *
     * The data will be freed when its reference count drops to
     * zero.
     *
     * The allocated data is guaranteed to be suitably aligned for any
     * built-in type.
     *
     * @param blockSize the size of the allocation, must be greater than 0
     * @return a pointer to the allocated memory
     * @since 2.58
     */
    @GLibVersion2_58
    public fun rcBoxAlloc0(blockSize: gsize): gpointer = g_rc_box_alloc0(blockSize)!!

    /**
     * Allocates a new block of data with reference counting
     * semantics, and copies @block_size bytes of @mem_block
     * into it.
     *
     * @param blockSize the number of bytes to copy, must be greater than 0
     * @param memBlock the memory to copy
     * @return a pointer to the allocated
     *   memory
     * @since 2.58
     */
    @GLibVersion2_58
    public fun rcBoxDup(blockSize: gsize, memBlock: gpointer): gpointer = g_rc_box_dup(blockSize, memBlock)!!

    /**
     * Retrieves the size of the reference counted data pointed by @mem_block.
     *
     * @param memBlock a pointer to reference counted data
     * @return the size of the data, in bytes
     * @since 2.58
     */
    @GLibVersion2_58
    public fun rcBoxGetSize(memBlock: gpointer): gsize = g_rc_box_get_size(memBlock)

    /**
     * Releases a reference on the data pointed by @mem_block.
     *
     * If the reference was the last one, it will free the
     * resources allocated for @mem_block.
     *
     * @param memBlock a pointer to reference counted data
     * @since 2.58
     */
    @GLibVersion2_58
    public fun rcBoxRelease(memBlock: gpointer): Unit = g_rc_box_release(memBlock)

    /**
     * Reallocates the memory pointed to by @mem, so that it now has space for
     * @n_bytes bytes of memory. It returns the new address of the memory, which may
     * have been moved. @mem may be null, in which case it's considered to
     * have zero-length. @n_bytes may be 0, in which case null will be returned
     * and @mem will be freed unless it is null.
     *
     * If the allocation fails (because the system is out of memory),
     * the program is terminated.
     *
     * @param mem the memory to reallocate
     * @param nBytes new size of the memory in bytes
     * @return the new address of the allocated memory
     */
    public fun realloc(mem: gpointer? = null, nBytes: gsize): gpointer? = g_realloc(mem, nBytes)

    /**
     * This function is similar to g_realloc(), allocating (@n_blocks * @n_block_bytes) bytes,
     * but care is taken to detect possible overflow during multiplication.
     *
     * If the allocation fails (because the system is out of memory),
     * the program is terminated.
     *
     * @param mem the memory to reallocate
     * @param nBlocks the number of blocks to allocate
     * @param nBlockBytes the size of each block in bytes
     * @return the new address of the allocated memory
     * @since 2.24
     */
    @GLibVersion2_24
    public fun reallocN(mem: gpointer? = null, nBlocks: gsize, nBlockBytes: gsize): gpointer? =
        g_realloc_n(mem, nBlocks, nBlockBytes)

    /**
     * Acquires a reference on a string.
     *
     * @param str a reference counted string
     * @return the given string, with its reference count increased
     * @since 2.58
     */
    @GLibVersion2_58
    public fun refStringAcquire(str: kotlin.String): kotlin.String =
        g_ref_string_acquire(str.cstr)?.toKString() ?: error("Expected not null string")

    /**
     * Retrieves the length of @str.
     *
     * @param str a reference counted string
     * @return the length of the given string, in bytes
     * @since 2.58
     */
    @GLibVersion2_58
    public fun refStringLength(str: kotlin.String): gsize = g_ref_string_length(str.cstr)

    /**
     * Creates a new reference counted string and copies the contents of @str
     * into it.
     *
     * @param str a NUL-terminated string
     * @return the newly created reference counted string
     * @since 2.58
     */
    @GLibVersion2_58
    public fun refStringNew(str: kotlin.String): kotlin.String =
        g_ref_string_new(str)?.toKString() ?: error("Expected not null string")

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
    @GLibVersion2_58
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
    @GLibVersion2_58
    public fun refStringNewLen(str: kotlin.String, len: Long): kotlin.String =
        g_ref_string_new_len(str, len)?.toKString() ?: error("Expected not null string")

    /**
     * Releases a reference on a string; if it was the last reference, the
     * resources allocated by the string are freed as well.
     *
     * @param str a reference counted string
     * @since 2.58
     */
    @GLibVersion2_58
    public fun refStringRelease(str: kotlin.String): Unit = g_ref_string_release(str.cstr)

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
    @GLibVersion2_22
    public fun reloadUserSpecialDirsCache(): Unit = g_reload_user_special_dirs_cache()

    /**
     * Internal function used to print messages from the public [func@GLib.return_if_fail]
     * and [func@GLib.return_val_if_fail] macros.
     *
     * @param logDomain log domain
     * @param prettyFunction function containing the assertion
     * @param expression expression which failed
     */
    public fun returnIfFailWarning(
        logDomain: kotlin.String? = null,
        prettyFunction: kotlin.String,
        expression: kotlin.String? = null,
    ): Unit = g_return_if_fail_warning(logDomain, prettyFunction, expression)

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
    @GLibVersion2_6
    public fun rmdir(filename: kotlin.String): gint = g_rmdir(filename)

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
    @GLibVersion2_2
    public fun setApplicationName(applicationName: kotlin.String): Unit = g_set_application_name(applicationName)

    /**
     * Sets the name of the program. This name should not be localized,
     * in contrast to g_set_application_name().
     *
     * If you are using #GApplication the program name is set in
     * g_application_run(). In case of GDK or GTK it is set in
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
    @GLibVersion2_4
    public fun setenv(variable: kotlin.String, `value`: kotlin.String, overwrite: Boolean): Boolean =
        g_setenv(variable, `value`, overwrite.asGBoolean()).asBoolean()

    public fun shellErrorQuark(): Quark = g_shell_error_quark()

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
    public fun shellUnquote(quotedString: kotlin.String): Result<kotlin.String> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_shell_unquote(quotedString, gError.ptr)?.toKString()
        return if (gError.pointed != null) {
            Result.failure(org.gtkkn.bindings.glib.GLib.resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Allocates a block of memory from the libc allocator.
     *
     * The block address handed out can be expected to be aligned
     * to at least `1 * sizeof (void*)`.
     *
     * Since GLib 2.76 this always uses the system malloc() implementation
     * internally.
     *
     * @param blockSize the number of bytes to allocate
     * @return a pointer to the allocated memory block, which will
     *   be null if and only if @mem_size is 0
     * @since 2.10
     */
    @GLibVersion2_10
    public fun sliceAlloc(blockSize: gsize): gpointer? = g_slice_alloc(blockSize)

    /**
     * Allocates a block of memory via g_slice_alloc() and initializes
     * the returned memory to 0.
     *
     * Since GLib 2.76 this always uses the system malloc() implementation
     * internally.
     *
     * @param blockSize the number of bytes to allocate
     * @return a pointer to the allocated block, which will be null
     *    if and only if @mem_size is 0
     * @since 2.10
     */
    @GLibVersion2_10
    public fun sliceAlloc0(blockSize: gsize): gpointer? = g_slice_alloc0(blockSize)

    /**
     * Allocates a block of memory from the slice allocator
     * and copies @block_size bytes into it from @mem_block.
     *
     * @mem_block must be non-null if @block_size is non-zero.
     *
     * Since GLib 2.76 this always uses the system malloc() implementation
     * internally.
     *
     * @param blockSize the number of bytes to allocate
     * @param memBlock the memory to copy
     * @return a pointer to the allocated memory block,
     *    which will be null if and only if @mem_size is 0
     * @since 2.14
     */
    @GLibVersion2_14
    public fun sliceCopy(blockSize: gsize, memBlock: gpointer? = null): gpointer? = g_slice_copy(blockSize, memBlock)

    /**
     * Frees a block of memory.
     *
     * The memory must have been allocated via g_slice_alloc() or
     * g_slice_alloc0() and the @block_size has to match the size
     * specified upon allocation. Note that the exact release behaviour
     * can be changed with the [`G_DEBUG=gc-friendly`][G_DEBUG] environment
     * variable.
     *
     * If @mem_block is null, this function does nothing.
     *
     * Since GLib 2.76 this always uses the system free_sized() implementation
     * internally.
     *
     * @param blockSize the size of the block
     * @param memBlock a pointer to the block to free
     * @since 2.10
     */
    @GLibVersion2_10
    public fun sliceFree1(blockSize: gsize, memBlock: gpointer? = null): Unit = g_slice_free1(blockSize, memBlock)

    /**
     * Frees a linked list of memory blocks of structure type @type.
     *
     * The memory blocks must be equal-sized, allocated via
     * g_slice_alloc() or g_slice_alloc0() and linked together by a
     * @next pointer (similar to #GSList). The offset of the @next
     * field in each block is passed as third argument.
     * Note that the exact release behaviour can be changed with the
     * [`G_DEBUG=gc-friendly`][G_DEBUG] environment variable.
     *
     * If @mem_chain is null, this function does nothing.
     *
     * Since GLib 2.76 this always uses the system free_sized() implementation
     * internally.
     *
     * @param blockSize the size of the blocks
     * @param memChain a pointer to the first block of the chain
     * @param nextOffset the offset of the @next field in the blocks
     * @since 2.10
     */
    @GLibVersion2_10
    public fun sliceFreeChainWithOffset(blockSize: gsize, memChain: gpointer? = null, nextOffset: gsize): Unit =
        g_slice_free_chain_with_offset(blockSize, memChain, nextOffset)

    public fun sliceGetConfig(ckey: SliceConfig): gint64 = g_slice_get_config(ckey.nativeValue)

    public fun sliceSetConfig(ckey: SliceConfig, `value`: gint64): Unit = g_slice_set_config(ckey.nativeValue, `value`)

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
    public fun spacedPrimesClosest(num: guint): guint = g_spaced_primes_closest(num)

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
    @GLibVersion2_34
    public fun spawnCheckExitStatus(waitStatus: gint): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_spawn_check_exit_status(waitStatus, gError.ptr).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(org.gtkkn.bindings.glib.GLib.resolveException(Error(gError.pointed!!.ptr)))
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
    @GLibVersion2_70
    public fun spawnCheckWaitStatus(waitStatus: gint): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_spawn_check_wait_status(waitStatus, gError.ptr).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(org.gtkkn.bindings.glib.GLib.resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * On some platforms, notably Windows, the #GPid type represents a resource
     * which must be closed to prevent resource leaking. g_spawn_close_pid()
     * is provided for this purpose. It should be used on all platforms, even
     * though it doesn't do anything under UNIX.
     *
     * @param pid The process reference to close
     */
    public fun spawnClosePid(pid: Pid): Unit = g_spawn_close_pid(pid)

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
    public fun spawnCommandLineAsync(commandLine: kotlin.String): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_spawn_command_line_async(commandLine, gError.ptr).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(org.gtkkn.bindings.glib.GLib.resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    public fun spawnErrorQuark(): Quark = g_spawn_error_quark()

    public fun spawnExitErrorQuark(): Quark = g_spawn_exit_error_quark()

    /**
     * Compares two strings for byte-by-byte equality and returns true
     * if they are equal. It can be passed to g_hash_table_new() as the
     * @key_equal_func parameter, when using non-null strings as keys in a
     * #GHashTable.
     *
     * This function is typically used for hash table comparisons, but can be used
     * for general purpose comparisons of non-null strings. For a null-safe string
     * comparison function, see g_strcmp0().
     *
     * @param v1 a key
     * @param v2 a key to compare with @v1
     * @return true if the two keys match
     */
    public fun strEqual(v1: gpointer, v2: gpointer): Boolean = g_str_equal(v1, v2).asBoolean()

    /**
     * Looks whether the string @str begins with @prefix.
     *
     * @param str a string to look in
     * @param prefix the prefix to look for
     * @return true if @str begins with @prefix, false otherwise
     * @since 2.2
     */
    @GLibVersion2_2
    public fun strHasPrefix(str: kotlin.String, prefix: kotlin.String): Boolean =
        g_str_has_prefix(str, prefix).asBoolean()

    /**
     * Looks whether a string ends with @suffix.
     *
     * @param str a string to look in
     * @param suffix the suffix to look for
     * @return true if @str ends with @suffix, false otherwise
     * @since 2.2
     */
    @GLibVersion2_2
    public fun strHasSuffix(str: kotlin.String, suffix: kotlin.String): Boolean =
        g_str_has_suffix(str, suffix).asBoolean()

    /**
     * Converts a string to a hash value.
     *
     * This function implements the widely used "djb" hash apparently
     * posted by Daniel Bernstein to comp.lang.c some time ago.  The 32
     * bit unsigned hash value starts at 5381 and for each byte 'c' in
     * the string, is updated: `hash = hash * 33 + c`. This function
     * uses the signed value of each byte.
     *
     * It can be passed to g_hash_table_new() as the @hash_func parameter,
     * when using non-null strings as keys in a #GHashTable.
     *
     * Note that this function may not be a perfect fit for all use cases.
     * For example, it produces some hash collisions with strings as short
     * as 2.
     *
     * @param v a string key
     * @return a hash value corresponding to the key
     */
    public fun strHash(v: gpointer): guint = g_str_hash(v)

    /**
     * Determines if a string is pure ASCII. A string is pure ASCII if it
     * contains no bytes with the high bit set.
     *
     * @param str a string
     * @return true if @str is ASCII
     * @since 2.40
     */
    @GLibVersion2_40
    public fun strIsAscii(str: kotlin.String): Boolean = g_str_is_ascii(str).asBoolean()

    /**
     * Checks if a search conducted for @search_term should match
     * @potential_hit.
     *
     * This function calls [func@GLib.str_tokenize_and_fold] on both
     * @search_term and @potential_hit. ASCII alternates are never taken
     * for @search_term but will be taken for @potential_hit according to
     * the value of @accept_alternates.
     *
     * A hit occurs when each folded token in @search_term is a prefix of a
     * folded token from @potential_hit.
     *
     * Depending on how you're performing the search, it will typically be
     * faster to call `g_str_tokenize_and_fold()` on each string in
     * your corpus and build an index on the returned folded tokens, then
     * call `g_str_tokenize_and_fold()` on the search term and
     * perform lookups into that index.
     *
     * As some examples, searching for ‘fred’ would match the potential hit
     * ‘Smith, Fred’ and also ‘Frédéric’.  Searching for ‘Fréd’ would match
     * ‘Frédéric’ but not ‘Frederic’ (due to the one-directional nature of
     * accent matching).  Searching ‘fo’ would match ‘Foo’ and ‘Bar Foo
     * Baz’, but not ‘SFO’ (because no word has ‘fo’ as a prefix).
     *
     * @param searchTerm the search term from the user
     * @param potentialHit the text that may be a hit
     * @param acceptAlternates if true, ASCII alternates are accepted
     * @return true if @potential_hit is a hit
     * @since 2.40
     */
    @GLibVersion2_40
    public fun strMatchString(
        searchTerm: kotlin.String,
        potentialHit: kotlin.String,
        acceptAlternates: Boolean,
    ): Boolean = g_str_match_string(searchTerm, potentialHit, acceptAlternates.asGBoolean()).asBoolean()

    /**
     * Transliterate @str to plain ASCII.
     *
     * For best results, @str should be in composed normalised form.
     *
     * This function performs a reasonably good set of character
     * replacements.  The particular set of replacements that is done may
     * change by version or even by runtime environment.
     *
     * If the source language of @str is known, it can used to improve the
     * accuracy of the translation by passing it as @from_locale.  It should
     * be a valid POSIX locale string (of the form
     * `language[_territory][.codeset][@modifier]`).
     *
     * If @from_locale is null then the current locale is used.
     *
     * If you want to do translation for no specific locale, and you want it
     * to be done independently of the currently locale, specify `"C"` for
     * @from_locale.
     *
     * @param str a string, in UTF-8
     * @param fromLocale the source locale, if known
     * @return a string in plain ASCII
     * @since 2.40
     */
    @GLibVersion2_40
    public fun strToAscii(str: kotlin.String, fromLocale: kotlin.String? = null): kotlin.String =
        g_str_to_ascii(str, fromLocale)?.toKString() ?: error("Expected not null string")

    /**
     * For each character in @string, if the character is not in @valid_chars,
     * replaces the character with @substitutor.
     *
     * Modifies @string in place, and return @string itself, not a copy. The
     * return value is to allow nesting such as:
     * ```C
     * g_ascii_strup (g_strcanon (str, "abc", '?'))
     * ```
     *
     * In order to modify a copy, you may use [func@GLib.strdup]:
     * ```C
     * reformatted = g_strcanon (g_strdup (const_str), "abc", '?');
     * …
     * g_free (reformatted);
     * ```
     *
     * @param string a nul-terminated array of bytes
     * @param validChars bytes permitted in @string
     * @param substitutor replacement character for disallowed bytes
     * @return the modified @string
     */
    public fun strcanon(string: kotlin.String, validChars: kotlin.String, substitutor: Char): kotlin.String =
        g_strcanon(string.cstr, validChars, substitutor.code.toByte())?.toKString() ?: error("Expected not null string")

    /**
     * A case-insensitive string comparison, corresponding to the standard
     * `strcasecmp()` function on platforms which support it.
     *
     * @param s1 string to compare with @s2
     * @param s2 string to compare with @s1
     * @return 0 if the strings match, a negative value if @s1 < @s2,
     *   or a positive value if @s1 > @s2
     */
    public fun strcasecmp(s1: kotlin.String, s2: kotlin.String): gint = g_strcasecmp(s1, s2)

    /**
     * Removes trailing whitespace from a string.
     *
     * This function doesn't allocate or reallocate any memory;
     * it modifies @string in place. Therefore, it cannot be used
     * on statically allocated strings.
     *
     * The pointer to @string is returned to allow the nesting of functions.
     *
     * Also see [func@GLib.strchug] and [func@GLib.strstrip].
     *
     * @param string a string to remove the trailing whitespace from
     * @return the modified @string
     */
    public fun strchomp(string: kotlin.String): kotlin.String =
        g_strchomp(string.cstr)?.toKString() ?: error("Expected not null string")

    /**
     * Removes leading whitespace from a string, by moving the rest
     * of the characters forward.
     *
     * This function doesn't allocate or reallocate any memory;
     * it modifies @string in place. Therefore, it cannot be used on
     * statically allocated strings.
     *
     * The pointer to @string is returned to allow the nesting of functions.
     *
     * Also see [func@GLib.strchomp] and [func@GLib.strstrip].
     *
     * @param string a string to remove the leading whitespace from
     * @return the modified @string
     */
    public fun strchug(string: kotlin.String): kotlin.String =
        g_strchug(string.cstr)?.toKString() ?: error("Expected not null string")

    /**
     * Compares @str1 and @str2 like strcmp(). Handles null
     * gracefully by sorting it before non-null strings.
     * Comparing two null pointers returns 0.
     *
     * @param str1 a C string or null
     * @param str2 another C string or null
     * @return an integer less than, equal to, or greater than zero, if @str1 is <, == or > than @str2.
     * @since 2.16
     */
    @GLibVersion2_16
    public fun strcmp0(str1: kotlin.String? = null, str2: kotlin.String? = null): gint = g_strcmp0(str1, str2)

    /**
     * Replaces all escaped characters with their one byte equivalent.
     *
     * This function does the reverse conversion of [func@GLib.strescape].
     *
     * @param source a string to compress
     * @return a newly-allocated copy of @source with all escaped
     *   character compressed
     */
    public fun strcompress(source: kotlin.String): kotlin.String =
        g_strcompress(source)?.toKString() ?: error("Expected not null string")

    /**
     * Converts any delimiter characters in @string to @new_delimiter.
     *
     * Any characters in @string which are found in @delimiters are
     * changed to the @new_delimiter character. Modifies @string in place,
     * and returns @string itself, not a copy.
     *
     * The return value is to allow nesting such as:
     * ```C
     * g_ascii_strup (g_strdelimit (str, "abc", '?'))
     * ```
     *
     * In order to modify a copy, you may use [func@GLib.strdup]:
     * ```C
     * reformatted = g_strdelimit (g_strdup (const_str), "abc", '?');
     * …
     * g_free (reformatted);
     * ```
     *
     * @param string the string to convert
     * @param delimiters a string containing the current delimiters, or
     *   `NULL` to use the standard delimiters defined in [const@GLib.STR_DELIMITERS]
     * @param newDelimiter the new delimiter character
     * @return the modified @string
     */
    public fun strdelimit(
        string: kotlin.String,
        delimiters: kotlin.String? = null,
        newDelimiter: Char,
    ): kotlin.String = g_strdelimit(string.cstr, delimiters, newDelimiter.code.toByte())?.toKString()
        ?: error("Expected not null string")

    /**
     * Converts a string to lower case.
     *
     * @param string the string to convert
     * @return the string
     */
    public fun strdown(string: kotlin.String): kotlin.String =
        g_strdown(string.cstr)?.toKString() ?: error("Expected not null string")

    /**
     * Duplicates a string. If @str is `NULL` it returns `NULL`.
     *
     * @param str the string to duplicate
     * @return a newly-allocated copy of @str
     */
    public fun strdup(str: kotlin.String? = null): kotlin.String =
        g_strdup(str)?.toKString() ?: error("Expected not null string")

    /**
     * Copies an array of strings. The copy is a deep copy; each string is also
     * copied.
     *
     * If called on a `NULL` value, `g_strdupv()` simply returns `NULL`.
     *
     * @param strArray an array of strings to copy
     * @return a
     *   newly-allocated array of strings. Use [func@GLib.strfreev] to free it.
     */
    public fun strdupv(strArray: List<kotlin.String>? = null): List<kotlin.String>? = memScoped {
        return g_strdupv(strArray?.toCStringList(this))?.toKStringList()
    }

    /**
     * Returns a string corresponding to the given error code, e.g. "no
     * such process".
     *
     * Unlike `strerror()`, this always returns a string in
     * UTF-8 encoding, and the pointer is guaranteed to remain valid for
     * the lifetime of the process. If the error code is unknown, it returns a
     * string like “Unknown error <code\>”.
     *
     * Note that the string may be translated according to the current locale.
     *
     * The value of `errno` will not be changed by this function. However, it may
     * be changed by intermediate function calls, so you should save its value
     * as soon as the call returns:
     * ```C
     * int saved_errno;
     *
     * ret = read (blah);
     * saved_errno = errno;
     *
     * g_strerror (saved_errno);
     * ```
     *
     * @param errnum the system error number. See the standard C `errno` documentation
     * @return the string describing the error code
     */
    public fun strerror(errnum: gint): kotlin.String =
        g_strerror(errnum)?.toKString() ?: error("Expected not null string")

    /**
     * Escapes the special characters '\b', '\f', '\n', '\r', '\t', '\v', '\'
     * and '"' in the string @source by inserting a '\' before
     * them. Additionally all characters in the range 0x01-0x1F (everything
     * below SPACE) and in the range 0x7F-0xFF (all non-ASCII chars) are
     * replaced with a '\' followed by their octal representation.
     * Characters supplied in @exceptions are not escaped.
     *
     * [func@GLib.strcompress] does the reverse conversion.
     *
     * @param source a string to escape
     * @param exceptions a string of characters not to escape in @source
     * @return a newly-allocated copy of @source with special characters escaped
     */
    public fun strescape(source: kotlin.String, exceptions: kotlin.String? = null): kotlin.String =
        g_strescape(source, exceptions)?.toKString() ?: error("Expected not null string")

    /**
     * Frees an array of strings, as well as each string it contains.
     *
     * If @str_array is `NULL`, this function simply returns.
     *
     * @param strArray an
     *   array of strings to free
     */
    public fun strfreev(strArray: List<kotlin.String>? = null): Unit = memScoped {
        return g_strfreev(strArray?.toCStringList(this))
    }

    /**
     * An auxiliary function for gettext() support (see Q_()).
     *
     * @param msgid a string
     * @param msgval another string
     * @return @msgval, unless @msgval is identical to @msgid
     *     and contains a '|' character, in which case a pointer to
     *     the substring of msgid after the first '|' character is returned.
     * @since 2.4
     */
    @GLibVersion2_4
    public fun stripContext(msgid: kotlin.String, msgval: kotlin.String): kotlin.String =
        g_strip_context(msgid, msgval)?.toKString() ?: error("Expected not null string")

    /**
     * Joins an array of strings together to form one long string, with the
     * optional @separator inserted between each of them.
     *
     * If @str_array has no items, the return value will be an
     * empty string. If @str_array contains a single item, @separator will not
     * appear in the resulting string.
     *
     * @param separator a string to insert between each of the strings
     * @param strArray an array of strings to join
     * @return a newly-allocated string containing all of the strings joined
     *   together, with @separator between them
     */
    public fun strjoinv(separator: kotlin.String? = null, strArray: List<kotlin.String>): kotlin.String = memScoped {
        return g_strjoinv(separator, strArray.toCStringList(this))?.toKString() ?: error("Expected not null string")
    }

    /**
     * Portability wrapper that calls `strlcat()` on systems which have it,
     * and emulates it otherwise. Appends nul-terminated @src string to @dest,
     * guaranteeing nul-termination for @dest. The total size of @dest won't
     * exceed @dest_size.
     *
     * At most @dest_size - 1 characters will be copied. Unlike `strncat()`,
     * @dest_size is the full size of dest, not the space left over. This
     * function does not allocate memory. It always nul-terminates (unless
     * @dest_size == 0 or there were no nul characters in the @dest_size
     * characters of dest to start with).
     *
     * Caveat: this is supposedly a more secure alternative to `strcat()` or
     * `strncat()`, but for real security [func@GLib.strconcat] is harder to mess up.
     *
     * @param dest destination buffer, already containing one nul-terminated string
     * @param src source buffer
     * @param destSize length of @dest buffer in bytes (not length of existing string
     *   inside @dest)
     * @return size of attempted result, which is `MIN (dest_size, strlen
     *   (original dest)) + strlen (src)`, so if @retval >= @dest_size,
     *   truncation occurred
     */
    public fun strlcat(dest: kotlin.String, src: kotlin.String, destSize: gsize): gsize =
        g_strlcat(dest.cstr, src, destSize)

    /**
     * Portability wrapper that calls `strlcpy()` on systems which have it,
     * and emulates `strlcpy()` otherwise. Copies @src to @dest; @dest is
     * guaranteed to be nul-terminated; @src must be nul-terminated;
     * @dest_size is the buffer size, not the number of bytes to copy.
     *
     * At most @dest_size - 1 characters will be copied. Always nul-terminates
     * (unless @dest_size is 0). This function does not allocate memory. Unlike
     * `strncpy()`, this function doesn't pad @dest (so it's often faster). It
     * returns the size of the attempted result, `strlen (src)`, so if
     * @retval >= @dest_size, truncation occurred.
     *
     * Caveat: `strlcpy()` is supposedly more secure than `strcpy()` or `strncpy()`,
     * but if you really want to avoid screwups, [func@GLib.strdup] is an even better
     * idea.
     *
     * @param dest destination buffer
     * @param src source buffer
     * @param destSize length of @dest in bytes
     * @return length of @src
     */
    public fun strlcpy(dest: kotlin.String, src: kotlin.String, destSize: gsize): gsize =
        g_strlcpy(dest.cstr, src, destSize)

    /**
     * A case-insensitive string comparison, corresponding to the standard
     * `strncasecmp()` function on platforms which support it. It is similar
     * to [func@GLib.strcasecmp] except it only compares the first @n characters of
     * the strings.
     *
     * @param s1 string to compare with @s2
     * @param s2 string to compare with @s1
     * @param n the maximum number of characters to compare
     * @return 0 if the strings match, a negative value if @s1 < @s2,
     *   or a positive value if @s1 > @s2
     */
    public fun strncasecmp(s1: kotlin.String, s2: kotlin.String, n: guint): gint = g_strncasecmp(s1, s2, n)

    /**
     * Duplicates the first @n bytes of a string, returning a newly-allocated
     * buffer @n + 1 bytes long which will always be nul-terminated. If @str
     * is less than @n bytes long the buffer is padded with nuls. If @str is
     * `NULL` it returns `NULL`.
     *
     * To copy a number of characters from a UTF-8 encoded string,
     * use [func@GLib.utf8_strncpy] instead.
     *
     * @param str the string to duplicate
     * @param n the maximum number of bytes to copy from @str
     * @return a newly-allocated buffer containing the first
     *    @n bytes of @str
     */
    public fun strndup(str: kotlin.String? = null, n: gsize): kotlin.String? = g_strndup(str, n)?.toKString()

    /**
     * Creates a new string @length bytes long filled with @fill_char.
     *
     * @param length the length of the new string
     * @param fillChar the byte to fill the string with
     * @return a newly-allocated string filled with @fill_char
     */
    public fun strnfill(length: gsize, fillChar: Char): kotlin.String =
        g_strnfill(length, fillChar.code.toByte())?.toKString() ?: error("Expected not null string")

    /**
     * Reverses all of the bytes in a string. For example,
     * `g_strreverse ("abcdef")` will result in "fedcba".
     *
     * Note that `g_strreverse()` doesn't work on UTF-8 strings
     * containing multibyte characters. For that purpose, use
     * [func@GLib.utf8_strreverse].
     *
     * @param string the string to reverse
     * @return the @string, reversed in place
     */
    public fun strreverse(string: kotlin.String): kotlin.String =
        g_strreverse(string.cstr)?.toKString() ?: error("Expected not null string")

    /**
     * Searches the string @haystack for the last occurrence
     * of the string @needle.
     *
     * @param haystack a string to search in
     * @param needle the string to search for
     * @return a pointer to the found occurrence, or `NULL` if not found
     */
    public fun strrstr(haystack: kotlin.String, needle: kotlin.String): kotlin.String =
        g_strrstr(haystack, needle)?.toKString() ?: error("Expected not null string")

    /**
     * Searches the string @haystack for the last occurrence
     * of the string @needle, limiting the length of the search
     * to @haystack_len.
     *
     * @param haystack a string to search in
     * @param haystackLen the maximum length of @haystack in bytes. A length of `-1`
     *   can be used to mean "search the entire string", like [func@GLib.strrstr]
     * @param needle the string to search for
     * @return a pointer to the found occurrence, or `NULL` if not found
     */
    public fun strrstrLen(haystack: kotlin.String, haystackLen: Long, needle: kotlin.String): kotlin.String =
        g_strrstr_len(haystack, haystackLen, needle)?.toKString() ?: error("Expected not null string")

    /**
     * Returns a string describing the given signal, e.g. "Segmentation fault".
     * If the signal is unknown, it returns “unknown signal (<signum\>)”.
     *
     * You should use this function in preference to `strsignal()`, because it
     * returns a string in UTF-8 encoding, and since not all platforms support
     * the `strsignal()` function.
     *
     * @param signum the signal number. See the `signal` documentation
     * @return the string describing the signal
     */
    public fun strsignal(signum: gint): kotlin.String =
        g_strsignal(signum)?.toKString() ?: error("Expected not null string")

    /**
     * Splits a string into a maximum of @max_tokens pieces, using the given
     * @delimiter. If @max_tokens is reached, the remainder of @string is
     * appended to the last token.
     *
     * As an example, the result of `g_strsplit (":a:bc::d:", ":", -1)` is an array
     * containing the six strings "", "a", "bc", "", "d" and "".
     *
     * As a special case, the result of splitting the empty string "" is an empty
     * array, not an array containing a single string. The reason for this
     * special case is that being able to represent an empty array is typically
     * more useful than consistent handling of empty elements. If you do need
     * to represent empty elements, you'll need to check for the empty string
     * before calling `g_strsplit()`.
     *
     * @param string a string to split
     * @param delimiter a string which specifies the places at which to split
     *   the string. The delimiter is not included in any of the resulting
     *   strings, unless @max_tokens is reached.
     * @param maxTokens the maximum number of pieces to split @string into
     *   If this is less than 1, the string is split completely
     * @return a newly-allocated array of strings, freed with
     *   [func@GLib.strfreev]
     */
    public fun strsplit(string: kotlin.String, delimiter: kotlin.String, maxTokens: gint): List<kotlin.String> =
        g_strsplit(string, delimiter, maxTokens)?.toKStringList() ?: error("Expected not null string array")

    /**
     * Splits @string into a number of tokens not containing any of the characters
     * in @delimiters. A token is the (possibly empty) longest string that does not
     * contain any of the characters in @delimiters. If @max_tokens is reached, the
     * remainder is appended to the last token.
     *
     * For example, the result of g_strsplit_set ("abc:def/ghi", ":/", -1) is an
     * array containing the three strings "abc", "def", and "ghi".
     *
     * The result of g_strsplit_set (":def/ghi:", ":/", -1) is an array containing
     * the four strings "", "def", "ghi", and "".
     *
     * As a special case, the result of splitting the empty string "" is an empty
     * array, not an array containing a single string. The reason for this
     * special case is that being able to represent an empty array is typically
     * more useful than consistent handling of empty elements. If you do need
     * to represent empty elements, you'll need to check for the empty string
     * before calling `g_strsplit_set()`.
     *
     * Note that this function works on bytes not characters, so it can't be used
     * to delimit UTF-8 strings for anything but ASCII characters.
     *
     * @param string a string to split
     * @param delimiters a string containing characters that are used to split the
     *   string. Can be empty, which will result in no string splitting
     * @param maxTokens the maximum number of tokens to split @string into.
     *   If this is less than 1, the string is split completely
     * @return a newly-allocated array of strings. Use
     *   [func@GLib.strfreev] to free it.
     * @since 2.4
     */
    @GLibVersion2_4
    public fun strsplitSet(string: kotlin.String, delimiters: kotlin.String, maxTokens: gint): List<kotlin.String> =
        g_strsplit_set(string, delimiters, maxTokens)?.toKStringList() ?: error("Expected not null string array")

    /**
     * Searches the string @haystack for the first occurrence
     * of the string @needle, limiting the length of the search
     * to @haystack_len or a nul terminator byte (whichever is reached first).
     *
     * A length of `-1` can be used to mean “search the entire string”, like
     * `strstr()`.
     *
     * @param haystack a string to search in
     * @param haystackLen the maximum length of @haystack in bytes, or `-1` to
     *   search it entirely
     * @param needle the string to search for
     * @return a pointer to the found occurrence, or `NULL` if not found
     */
    public fun strstrLen(haystack: kotlin.String, haystackLen: Long, needle: kotlin.String): kotlin.String =
        g_strstr_len(haystack, haystackLen, needle)?.toKString() ?: error("Expected not null string")

    /**
     * Converts a string to upper case.
     *
     * @param string the string to convert
     * @return the string
     */
    public fun strup(string: kotlin.String): kotlin.String =
        g_strup(string.cstr)?.toKString() ?: error("Expected not null string")

    /**
     * Checks if an array of strings contains the string @str according to
     * [func@GLib.str_equal]. @strv must not be `NULL`.
     *
     * @param strv an array of strings to search in
     * @param str the string to search for
     * @return true if @str is an element of @strv
     * @since 2.44
     */
    @GLibVersion2_44
    public fun strvContains(strv: List<kotlin.String>, str: kotlin.String): Boolean = memScoped {
        return g_strv_contains(strv.toCStringList(this), str).asBoolean()
    }

    /**
     * Checks if two arrays of strings contain exactly the same elements in
     * exactly the same order.
     *
     * Elements are compared using [func@GLib.str_equal]. To match independently
     * of order, sort the arrays first (using [func@GLib.qsort_with_data]
     * or similar).
     *
     * Elements are compared using [func@GLib.str_equal]. To match independently
     * of order, sort the arrays first (using [func@GLib.qsort_with_data]
     * or similar).
     *
     * Two empty arrays are considered equal. Neither @strv1 nor @strv2 may be
     * `NULL`.
     *
     * @param strv1 an array of strings to compare to @strv2
     * @param strv2 an array of strings to compare to @strv1
     * @return true if @strv1 and @strv2 are equal
     * @since 2.60
     */
    @GLibVersion2_60
    public fun strvEqual(strv1: List<kotlin.String>, strv2: List<kotlin.String>): Boolean = memScoped {
        return g_strv_equal(strv1.toCStringList(this), strv2.toCStringList(this)).asBoolean()
    }

    public fun strvGetType(): GType = g_strv_get_type()

    /**
     * Returns the length of an array of strings. @str_array must not be `NULL`.
     *
     * @param strArray an array of strings
     * @return length of @str_array
     * @since 2.6
     */
    @GLibVersion2_6
    public fun strvLength(strArray: List<kotlin.String>): guint = memScoped {
        return g_strv_length(strArray.toCStringList(this))
    }

    public fun testAssertExpectedMessagesInternal(
        domain: kotlin.String,
        `file`: kotlin.String,
        line: gint,
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
    @GLibVersion2_16
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
    @GLibVersion2_16
    public fun testBugBase(uriPattern: kotlin.String): Unit = g_test_bug_base(uriPattern)

    /**
     * Attempt to disable system crash reporting infrastructure.
     *
     * This function should be called before exercising code paths that are
     * expected or intended to crash, to avoid wasting resources in system-wide
     * crash collection infrastructure such as systemd-coredump or abrt.
     *
     * @since 2.78
     */
    @GLibVersion2_78
    public fun testDisableCrashReporting(): Unit = g_test_disable_crash_reporting()

    /**
     * Indicates that a message with the given @log_domain and @log_level,
     * with text matching @pattern, is expected to be logged.
     *
     * When this message is logged, it will not be printed, and the test case will
     * not abort.
     *
     * This API may only be used with the old logging API ([func@GLib.log] without
     * `G_LOG_USE_STRUCTURED` defined). It will not work with the structured logging
     * API. See [Testing for Messages](logging.html#testing-for-messages).
     *
     * Use [func@GLib.test_assert_expected_messages] to assert that all
     * previously-expected messages have been seen and suppressed.
     *
     * You can call this multiple times in a row, if multiple messages are
     * expected as a result of a single call. (The messages must appear in
     * the same order as the calls to [func@GLib.test_expect_message].)
     *
     * For example:
     *
     * ```c
     * // g_main_context_push_thread_default() should fail if the
     * // context is already owned by another thread.
     * g_test_expect_message (G_LOG_DOMAIN,
     *                        G_LOG_LEVEL_CRITICAL,
     *                        "assertion*acquired_context*failed");
     * g_main_context_push_thread_default (bad_context);
     * g_test_assert_expected_messages ();
     * ```
     *
     * Note that you cannot use this to test [func@GLib.error] messages, since
     * [func@GLib.error] intentionally never returns even if the program doesn’t
     * abort; use [func@GLib.test_trap_subprocess] in this case.
     *
     * If messages at [flags@GLib.LogLevelFlags.LEVEL_DEBUG] are emitted, but not explicitly
     * expected via [func@GLib.test_expect_message] then they will be ignored.
     *
     * @param logDomain the log domain of the message
     * @param logLevel the log level of the message
     * @param pattern a glob-style pattern (see [type@GLib.PatternSpec])
     * @since 2.34
     */
    @GLibVersion2_34
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
    @GLibVersion2_30
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
    @GLibVersion2_38
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
    @GLibVersion2_38
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
     * Note that this is a test path, not a file system path.
     *
     * @return the test path for the test currently being run
     * @since 2.68
     */
    @GLibVersion2_68
    public fun testGetPath(): kotlin.String = g_test_get_path()?.toKString() ?: error("Expected not null string")

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
    @GLibVersion2_38
    public fun testIncomplete(msg: kotlin.String? = null): Unit = g_test_incomplete(msg)

    /**
     * Installs a non-error fatal log handler which can be
     * used to decide whether log messages which are counted
     * as fatal abort the program.
     *
     * The use case here is that you are running a test case
     * that depends on particular libraries or circumstances
     * and cannot prevent certain known critical or warning
     * messages. So you install a handler that compares the
     * domain and message to precisely not abort in such a case.
     *
     * Note that the handler is reset at the beginning of
     * any test case, so you have to set it inside each test
     * function which needs the special behavior.
     *
     * This handler has no effect on g_error messages.
     *
     * This handler also has no effect on structured log messages (using
     * [func@GLib.log_structured] or [func@GLib.log_structured_array]). To change the fatal
     * behaviour for specific log messages, programs must install a custom log
     * writer function using [func@GLib.log_set_writer_func].See
     * [Using Structured Logging](logging.html#using-structured-logging).
     *
     * @param logFunc the log handler function.
     * @since 2.22
     */
    @GLibVersion2_22
    public fun testLogSetFatalHandler(logFunc: TestLogFatalFunc): Unit =
        g_test_log_set_fatal_handler(TestLogFatalFuncFunc.reinterpret(), StableRef.create(logFunc).asCPointer())

    public fun testLogTypeName(logType: TestLogType): kotlin.String =
        g_test_log_type_name(logType.nativeValue)?.toKString() ?: error("Expected not null string")

    /**
     * Enqueue a pointer to be released with g_free() during the next
     * teardown phase. This is equivalent to calling g_test_queue_destroy()
     * with a destroy callback of g_free().
     *
     * @param gfreePointer the pointer to be stored.
     * @since 2.16
     */
    @GLibVersion2_16
    public fun testQueueFree(gfreePointer: gpointer? = null): Unit = g_test_queue_free(gfreePointer)

    /**
     * Get a reproducible random floating point number,
     * see g_test_rand_int() for details on test case random numbers.
     *
     * @return a random number from the seeded random number generator.
     * @since 2.16
     */
    @GLibVersion2_16
    public fun testRandDouble(): gdouble = g_test_rand_double()

    /**
     * Get a reproducible random floating pointer number out of a specified range,
     * see g_test_rand_int() for details on test case random numbers.
     *
     * @param rangeStart the minimum value returned by this function
     * @param rangeEnd the minimum value not returned by this function
     * @return a number with @range_start <= number < @range_end.
     * @since 2.16
     */
    @GLibVersion2_16
    public fun testRandDoubleRange(rangeStart: gdouble, rangeEnd: gdouble): gdouble =
        g_test_rand_double_range(rangeStart, rangeEnd)

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
    @GLibVersion2_16
    public fun testRandInt(): gint = g_test_rand_int()

    /**
     * Get a reproducible random integer number out of a specified range,
     * see g_test_rand_int() for details on test case random numbers.
     *
     * @param begin the minimum value returned by this function
     * @param end the smallest value not to be returned by this function
     * @return a number with @begin <= number < @end.
     * @since 2.16
     */
    @GLibVersion2_16
    public fun testRandIntRange(begin: gint, end: gint): gint = g_test_rand_int_range(begin, end)

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
    @GLibVersion2_16
    public fun testRun(): gint = g_test_run()

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
    @GLibVersion2_38
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
    @GLibVersion2_38
    public fun testSkip(msg: kotlin.String? = null): Unit = g_test_skip(msg)

    /**
     * Returns true (after g_test_init() has been called) if the test
     * program is running under g_test_trap_subprocess().
     *
     * @return true if the test program is running under
     * g_test_trap_subprocess().
     * @since 2.38
     */
    @GLibVersion2_38
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
    @GLibVersion2_62
    public fun testSummary(summary: kotlin.String): Unit = g_test_summary(summary)

    /**
     * Get the number of seconds since the last start of the timer with
     * g_test_timer_start().
     *
     * @return the time since the last start of the timer in seconds, as a double
     * @since 2.16
     */
    @GLibVersion2_16
    public fun testTimerElapsed(): gdouble = g_test_timer_elapsed()

    /**
     * Report the last result of g_test_timer_elapsed().
     *
     * @return the last result of g_test_timer_elapsed(), as a double
     * @since 2.16
     */
    @GLibVersion2_16
    public fun testTimerLast(): gdouble = g_test_timer_last()

    /**
     * Start a timing test. Call g_test_timer_elapsed() when the task is supposed
     * to be done. Call this function again to restart the timer.
     *
     * @since 2.16
     */
    @GLibVersion2_16
    public fun testTimerStart(): Unit = g_test_timer_start()

    public fun testTrapAssertions(
        domain: kotlin.String,
        `file`: kotlin.String,
        line: gint,
        func: kotlin.String,
        assertionFlags: guint64,
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
    @GLibVersion2_16
    public fun testTrapFork(usecTimeout: guint64, testTrapFlags: TestTrapFlags): Boolean =
        g_test_trap_fork(usecTimeout, testTrapFlags.mask).asBoolean()

    /**
     * Check the result of the last g_test_trap_subprocess() call.
     *
     * @return true if the last test subprocess terminated successfully.
     * @since 2.16
     */
    @GLibVersion2_16
    public fun testTrapHasPassed(): Boolean = g_test_trap_has_passed().asBoolean()

    /**
     * Check the result of the last g_test_trap_subprocess() call.
     *
     * @return true if the last test subprocess got killed due to a timeout.
     * @since 2.16
     */
    @GLibVersion2_16
    public fun testTrapReachedTimeout(): Boolean = g_test_trap_reached_timeout().asBoolean()

    /**
     * Respawns the test program to run only @test_path in a subprocess.
     *
     * This is equivalent to calling g_test_trap_subprocess_with_envp() with `envp`
     * set to null. See the documentation for that function for full details.
     *
     * @param testPath Test to run in a subprocess
     * @param usecTimeout Timeout for the subprocess test in micro seconds.
     * @param testFlags Flags to modify subprocess behaviour.
     * @since 2.38
     */
    @GLibVersion2_38
    public fun testTrapSubprocess(
        testPath: kotlin.String? = null,
        usecTimeout: guint64,
        testFlags: TestSubprocessFlags,
    ): Unit = g_test_trap_subprocess(testPath, usecTimeout, testFlags.mask)

    /**
     * Respawns the test program to run only @test_path in a subprocess with the
     * given @envp environment.
     *
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
     * If @envp is null, the parent process’ environment will be inherited.
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
     * Internally, this function tracks the child process using
     * g_child_watch_source_new(), so your process must not ignore `SIGCHLD`, and
     * must not attempt to watch or wait for the child process via another
     * mechanism.
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
     *     g_test_trap_subprocess (NULL, 0, G_TEST_SUBPROCESS_DEFAULT);
     *     g_test_trap_assert_failed ();
     *     g_test_trap_assert_stderr ("*ERROR*too large*");
     *   }
     *
     *   static void
     *   test_different_username (void)
     *   {
     *     if (g_test_subprocess ())
     *       {
     *         // Code under test goes here
     *         g_message ("Username is now simulated as %s", g_getenv ("USER"));
     *         return;
     *       }
     *
     *     // Reruns this same test in a subprocess
     *     g_autoptr(GStrv) envp = g_get_environ ();
     *     envp = g_environ_setenv (g_steal_pointer (&envp), "USER", "charlie", TRUE);
     *     g_test_trap_subprocess_with_envp (NULL, envp, 0, G_TEST_SUBPROCESS_DEFAULT);
     *     g_test_trap_assert_passed ();
     *     g_test_trap_assert_stdout ("Username is now simulated as charlie");
     *   }
     *
     *   int
     *   main (int argc, char **argv)
     *   {
     *     g_test_init (&argc, &argv, NULL);
     *
     *     g_test_add_func ("/myobject/create-large-object",
     *                      test_create_large_object);
     *     g_test_add_func ("/myobject/different-username",
     *                      test_different_username);
     *     return g_test_run ();
     *   }
     * ]|
     *
     * @param testPath Test to run in a subprocess
     * @param envp Environment
     *   to run the test in, or null to inherit the parent’s environment. This must
     *   be in the GLib filename encoding.
     * @param usecTimeout Timeout for the subprocess test in micro seconds.
     * @param testFlags Flags to modify subprocess behaviour.
     * @since 2.80
     */
    @GLibVersion2_80
    public fun testTrapSubprocessWithEnvp(
        testPath: kotlin.String? = null,
        envp: List<kotlin.String>? = null,
        usecTimeout: guint64,
        testFlags: TestSubprocessFlags,
    ): Unit = memScoped {
        return g_test_trap_subprocess_with_envp(testPath, envp?.toCStringList(this), usecTimeout, testFlags.mask)
    }

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
    public fun timeoutAdd(priority: gint, interval: guint, function: SourceFunc): guint = g_timeout_add_full(
        priority,
        interval,
        SourceFuncFunc.reinterpret(),
        StableRef.create(function).asCPointer(),
        staticStableRefDestroy.reinterpret()
    )

    /**
     * Sets a function to be called after @interval milliseconds have elapsed,
     * with the default priority, %G_PRIORITY_DEFAULT.
     *
     * The given @function is called once and then the source will be automatically
     * removed from the main context.
     *
     * This function otherwise behaves like g_timeout_add().
     *
     * @param interval the time after which the function will be called, in
     *   milliseconds (1/1000ths of a second)
     * @param function function to call
     * @return the ID (greater than 0) of the event source
     * @since 2.74
     */
    @GLibVersion2_74
    public fun timeoutAddOnce(interval: guint, function: SourceOnceFunc): guint =
        g_timeout_add_once(interval, SourceOnceFuncFunc.reinterpret(), StableRef.create(function).asCPointer())

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
    @GLibVersion2_14
    public fun timeoutAddSeconds(priority: gint, interval: guint, function: SourceFunc): guint =
        g_timeout_add_seconds_full(
            priority,
            interval,
            SourceFuncFunc.reinterpret(),
            StableRef.create(function).asCPointer(),
            staticStableRefDestroy.reinterpret()
        )

    /**
     * This function behaves like g_timeout_add_once() but with a range in seconds.
     *
     * @param interval the time after which the function will be called, in seconds
     * @param function function to call
     * @return the ID (greater than 0) of the event source
     * @since 2.78
     */
    @GLibVersion2_78
    public fun timeoutAddSecondsOnce(interval: guint, function: SourceOnceFunc): guint =
        g_timeout_add_seconds_once(interval, SourceOnceFuncFunc.reinterpret(), StableRef.create(function).asCPointer())

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
    public fun timeoutSourceNew(interval: guint): Source = g_timeout_source_new(interval)!!.run {
        Source(this)
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
    @GLibVersion2_14
    public fun timeoutSourceNewSeconds(interval: guint): Source = g_timeout_source_new_seconds(interval)!!.run {
        Source(this)
    }

    /**
     * Attempts to allocate @n_bytes, and returns null on failure.
     * Contrast with g_malloc(), which aborts the program on failure.
     *
     * @param nBytes number of bytes to allocate.
     * @return the allocated memory, or null.
     */
    public fun tryMalloc(nBytes: gsize): gpointer? = g_try_malloc(nBytes)

    /**
     * Attempts to allocate @n_bytes, initialized to 0's, and returns null on
     * failure. Contrast with g_malloc0(), which aborts the program on failure.
     *
     * @param nBytes number of bytes to allocate
     * @return the allocated memory, or null
     * @since 2.8
     */
    @GLibVersion2_8
    public fun tryMalloc0(nBytes: gsize): gpointer? = g_try_malloc0(nBytes)

    /**
     * This function is similar to g_try_malloc0(), allocating (@n_blocks * @n_block_bytes) bytes,
     * but care is taken to detect possible overflow during multiplication.
     *
     * @param nBlocks the number of blocks to allocate
     * @param nBlockBytes the size of each block in bytes
     * @return the allocated memory, or null
     * @since 2.24
     */
    @GLibVersion2_24
    public fun tryMalloc0N(nBlocks: gsize, nBlockBytes: gsize): gpointer? = g_try_malloc0_n(nBlocks, nBlockBytes)

    /**
     * This function is similar to g_try_malloc(), allocating (@n_blocks * @n_block_bytes) bytes,
     * but care is taken to detect possible overflow during multiplication.
     *
     * @param nBlocks the number of blocks to allocate
     * @param nBlockBytes the size of each block in bytes
     * @return the allocated memory, or null.
     * @since 2.24
     */
    @GLibVersion2_24
    public fun tryMallocN(nBlocks: gsize, nBlockBytes: gsize): gpointer? = g_try_malloc_n(nBlocks, nBlockBytes)

    /**
     * Attempts to realloc @mem to a new size, @n_bytes, and returns null
     * on failure. Contrast with g_realloc(), which aborts the program
     * on failure.
     *
     * If @mem is null, behaves the same as g_try_malloc().
     *
     * @param mem previously-allocated memory, or null.
     * @param nBytes number of bytes to allocate.
     * @return the allocated memory, or null.
     */
    public fun tryRealloc(mem: gpointer? = null, nBytes: gsize): gpointer? = g_try_realloc(mem, nBytes)

    /**
     * This function is similar to g_try_realloc(), allocating (@n_blocks * @n_block_bytes) bytes,
     * but care is taken to detect possible overflow during multiplication.
     *
     * @param mem previously-allocated memory, or null.
     * @param nBlocks the number of blocks to allocate
     * @param nBlockBytes the size of each block in bytes
     * @return the allocated memory, or null.
     * @since 2.24
     */
    @GLibVersion2_24
    public fun tryReallocN(mem: gpointer? = null, nBlocks: gsize, nBlockBytes: gsize): gpointer? =
        g_try_realloc_n(mem, nBlocks, nBlockBytes)

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
    public fun unicharBreakType(c: gunichar): UnicodeBreakType = g_unichar_break_type(c).run {
        UnicodeBreakType.fromNativeValue(this)
    }

    /**
     * Determines the canonical combining class of a Unicode character.
     *
     * @param uc a Unicode character
     * @return the combining class of the character
     * @since 2.14
     */
    @GLibVersion2_14
    public fun unicharCombiningClass(uc: gunichar): gint = g_unichar_combining_class(uc)

    /**
     * Determines the numeric value of a character as a decimal
     * digit.
     *
     * @param c a Unicode character
     * @return If @c is a decimal digit (according to
     * g_unichar_isdigit()), its numeric value. Otherwise, -1.
     */
    public fun unicharDigitValue(c: gunichar): gint = g_unichar_digit_value(c)

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
    @GLibVersion2_14
    public fun unicharGetScript(ch: gunichar): UnicodeScript = g_unichar_get_script(ch).run {
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
    public fun unicharIsalnum(c: gunichar): Boolean = g_unichar_isalnum(c).asBoolean()

    /**
     * Determines whether a character is alphabetic (i.e. a letter).
     * Given some UTF-8 text, obtain a character value with
     * g_utf8_get_char().
     *
     * @param c a Unicode character
     * @return true if @c is an alphabetic character
     */
    public fun unicharIsalpha(c: gunichar): Boolean = g_unichar_isalpha(c).asBoolean()

    /**
     * Determines whether a character is a control character.
     * Given some UTF-8 text, obtain a character value with
     * g_utf8_get_char().
     *
     * @param c a Unicode character
     * @return true if @c is a control character
     */
    public fun unicharIscntrl(c: gunichar): Boolean = g_unichar_iscntrl(c).asBoolean()

    /**
     * Determines if a given character is assigned in the Unicode
     * standard.
     *
     * @param c a Unicode character
     * @return true if the character has an assigned value
     */
    public fun unicharIsdefined(c: gunichar): Boolean = g_unichar_isdefined(c).asBoolean()

    /**
     * Determines whether a character is numeric (i.e. a digit).  This
     * covers ASCII 0-9 and also digits in other languages/scripts.  Given
     * some UTF-8 text, obtain a character value with g_utf8_get_char().
     *
     * @param c a Unicode character
     * @return true if @c is a digit
     */
    public fun unicharIsdigit(c: gunichar): Boolean = g_unichar_isdigit(c).asBoolean()

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
    public fun unicharIsgraph(c: gunichar): Boolean = g_unichar_isgraph(c).asBoolean()

    /**
     * Determines whether a character is a lowercase letter.
     * Given some UTF-8 text, obtain a character value with
     * g_utf8_get_char().
     *
     * @param c a Unicode character
     * @return true if @c is a lowercase letter
     */
    public fun unicharIslower(c: gunichar): Boolean = g_unichar_islower(c).asBoolean()

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
    @GLibVersion2_14
    public fun unicharIsmark(c: gunichar): Boolean = g_unichar_ismark(c).asBoolean()

    /**
     * Determines whether a character is printable.
     * Unlike g_unichar_isgraph(), returns true for spaces.
     * Given some UTF-8 text, obtain a character value with
     * g_utf8_get_char().
     *
     * @param c a Unicode character
     * @return true if @c is printable
     */
    public fun unicharIsprint(c: gunichar): Boolean = g_unichar_isprint(c).asBoolean()

    /**
     * Determines whether a character is punctuation or a symbol.
     * Given some UTF-8 text, obtain a character value with
     * g_utf8_get_char().
     *
     * @param c a Unicode character
     * @return true if @c is a punctuation or symbol character
     */
    public fun unicharIspunct(c: gunichar): Boolean = g_unichar_ispunct(c).asBoolean()

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
    public fun unicharIsspace(c: gunichar): Boolean = g_unichar_isspace(c).asBoolean()

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
    public fun unicharIstitle(c: gunichar): Boolean = g_unichar_istitle(c).asBoolean()

    /**
     * Determines if a character is uppercase.
     *
     * @param c a Unicode character
     * @return true if @c is an uppercase character
     */
    public fun unicharIsupper(c: gunichar): Boolean = g_unichar_isupper(c).asBoolean()

    /**
     * Determines if a character is typically rendered in a double-width
     * cell.
     *
     * @param c a Unicode character
     * @return true if the character is wide
     */
    public fun unicharIswide(c: gunichar): Boolean = g_unichar_iswide(c).asBoolean()

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
    @GLibVersion2_12
    public fun unicharIswideCjk(c: gunichar): Boolean = g_unichar_iswide_cjk(c).asBoolean()

    /**
     * Determines if a character is a hexadecimal digit.
     *
     * @param c a Unicode character.
     * @return true if the character is a hexadecimal digit
     */
    public fun unicharIsxdigit(c: gunichar): Boolean = g_unichar_isxdigit(c).asBoolean()

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
    @GLibVersion2_14
    public fun unicharIszerowidth(c: gunichar): Boolean = g_unichar_iszerowidth(c).asBoolean()

    /**
     * Converts a character to lower case.
     *
     * @param c a Unicode character.
     * @return the result of converting @c to lower case.
     *               If @c is not an upperlower or titlecase character,
     *               or has no lowercase equivalent @c is returned unchanged.
     */
    public fun unicharTolower(c: gunichar): gunichar = g_unichar_tolower(c)

    /**
     * Converts a character to the titlecase.
     *
     * @param c a Unicode character
     * @return the result of converting @c to titlecase.
     *               If @c is not an uppercase or lowercase character,
     *               @c is returned unchanged.
     */
    public fun unicharTotitle(c: gunichar): gunichar = g_unichar_totitle(c)

    /**
     * Converts a character to uppercase.
     *
     * @param c a Unicode character
     * @return the result of converting @c to uppercase.
     *               If @c is not a lowercase or titlecase character,
     *               or has no upper case equivalent @c is returned unchanged.
     */
    public fun unicharToupper(c: gunichar): gunichar = g_unichar_toupper(c)

    /**
     * Classifies a Unicode character by type.
     *
     * @param c a Unicode character
     * @return the type of the character.
     */
    public fun unicharType(c: gunichar): UnicodeType = g_unichar_type(c).run {
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
    public fun unicharValidate(ch: gunichar): Boolean = g_unichar_validate(ch).asBoolean()

    /**
     * Determines the numeric value of a character as a hexadecimal
     * digit.
     *
     * @param c a Unicode character
     * @return If @c is a hex digit (according to
     * g_unichar_isxdigit()), its numeric value. Otherwise, -1.
     */
    public fun unicharXdigitValue(c: gunichar): gint = g_unichar_xdigit_value(c)

    public fun unixErrorQuark(): Quark = g_unix_error_quark()

    /**
     * Sets a function to be called when the IO condition, as specified by
     * @condition becomes true for @fd.
     *
     * @function will be called when the specified IO condition becomes
     * true.  The function is expected to clear whatever event caused the
     * IO condition to become true and return true in order to be notified
     * when it happens again.  If @function returns false then the watch
     * will be cancelled.
     *
     * The return value of this function can be passed to g_source_remove()
     * to cancel the watch at any time that it exists.
     *
     * The source will never close the fd -- you must do it yourself.
     *
     * @param fd a file descriptor
     * @param condition IO conditions to watch for on @fd
     * @param function a #GUnixFDSourceFunc
     * @return the ID (greater than 0) of the event source
     * @since 2.36
     */
    @GLibVersion2_36
    public fun unixFdAdd(fd: gint, condition: IoCondition, function: UnixFdSourceFunc): guint =
        g_unix_fd_add(fd, condition.mask, UnixFdSourceFuncFunc.reinterpret(), StableRef.create(function).asCPointer())

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
    @GLibVersion2_36
    public fun unixFdAddFull(priority: gint, fd: gint, condition: IoCondition, function: UnixFdSourceFunc): guint =
        g_unix_fd_add_full(
            priority,
            fd,
            condition.mask,
            UnixFdSourceFuncFunc.reinterpret(),
            StableRef.create(function).asCPointer(),
            staticStableRefDestroy.reinterpret()
        )

    /**
     * Creates a #GSource to watch for a particular I/O condition on a file
     * descriptor.
     *
     * The source will never close the @fd — you must do it yourself.
     *
     * Any callback attached to the returned #GSource must have type
     * #GUnixFDSourceFunc.
     *
     * @param fd a file descriptor
     * @param condition I/O conditions to watch for on @fd
     * @return the newly created #GSource
     * @since 2.36
     */
    @GLibVersion2_36
    public fun unixFdSourceNew(fd: gint, condition: IoCondition): Source =
        g_unix_fd_source_new(fd, condition.mask)!!.run {
            Source(this)
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
    @GLibVersion2_30
    public fun unixSetFdNonblocking(fd: gint, nonblock: Boolean): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_unix_set_fd_nonblocking(fd, nonblock.asGBoolean(), gError.ptr).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(org.gtkkn.bindings.glib.GLib.resolveException(Error(gError.pointed!!.ptr)))
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
    @GLibVersion2_30
    public fun unixSignalAdd(priority: gint, signum: gint, handler: SourceFunc): guint = g_unix_signal_add_full(
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
     * g_main_loop_quit().  It is not safe to do any of this from a regular
     * UNIX signal handler; such a handler may be invoked while malloc() or
     * another library function is running, causing reentrancy issues if the
     * handler attempts to use those functions.  None of the GLib/GObject
     * API is safe against this kind of reentrancy.
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
    @GLibVersion2_30
    public fun unixSignalSourceNew(signum: gint): Source = g_unix_signal_source_new(signum)!!.run {
        Source(this)
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
    @GLibVersion2_6
    public fun unlink(filename: kotlin.String): gint = g_unlink(filename)

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
    @GLibVersion2_4
    public fun unsetenv(variable: kotlin.String): Unit = g_unsetenv(variable)

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
    public fun usleep(microseconds: gulong): Unit = g_usleep(microseconds)

    /**
     * Converts a string into a form that is independent of case. The
     * result will not correspond to any particular case, but can be
     * compared for equality or ordered with the results of calling
     * g_utf8_casefold() on other strings.
     *
     * Note that calling g_utf8_casefold() followed by g_utf8_collate() is
     * only an approximation to the correct linguistic case insensitive
     * ordering, though it is a fairly good one. Getting this exactly
     * right would require a more sophisticated collation function that
     * takes case sensitivity into account. GLib does not currently
     * provide such a function.
     *
     * @param str a UTF-8 encoded string
     * @param len length of @str, in bytes, or -1 if @str is nul-terminated.
     * @return a newly allocated string, that is a
     *   case independent form of @str.
     */
    public fun utf8Casefold(str: kotlin.String, len: Long): kotlin.String =
        g_utf8_casefold(str, len)?.toKString() ?: error("Expected not null string")

    /**
     * Compares two strings for ordering using the linguistically
     * correct rules for the [current locale][setlocale].
     * When sorting a large number of strings, it will be significantly
     * faster to obtain collation keys with g_utf8_collate_key() and
     * compare the keys with strcmp() when sorting instead of sorting
     * the original strings.
     *
     * If the two strings are not comparable due to being in different collation
     * sequences, the result is undefined. This can happen if the strings are in
     * different language scripts, for example.
     *
     * @param str1 a UTF-8 encoded string
     * @param str2 a UTF-8 encoded string
     * @return < 0 if @str1 compares before @str2,
     *   0 if they compare equal, > 0 if @str1 compares after @str2.
     */
    public fun utf8Collate(str1: kotlin.String, str2: kotlin.String): gint = g_utf8_collate(str1, str2)

    /**
     * Converts a string into a collation key that can be compared
     * with other collation keys produced by the same function using
     * strcmp().
     *
     * The results of comparing the collation keys of two strings
     * with strcmp() will always be the same as comparing the two
     * original keys with g_utf8_collate().
     *
     * Note that this function depends on the [current locale][setlocale].
     *
     * @param str a UTF-8 encoded string.
     * @param len length of @str, in bytes, or -1 if @str is nul-terminated.
     * @return a newly allocated string. This string should
     *   be freed with g_free() when you are done with it.
     */
    public fun utf8CollateKey(str: kotlin.String, len: Long): kotlin.String =
        g_utf8_collate_key(str, len)?.toKString() ?: error("Expected not null string")

    /**
     * Converts a string into a collation key that can be compared
     * with other collation keys produced by the same function using strcmp().
     *
     * In order to sort filenames correctly, this function treats the dot '.'
     * as a special case. Most dictionary orderings seem to consider it
     * insignificant, thus producing the ordering "event.c" "eventgenerator.c"
     * "event.h" instead of "event.c" "event.h" "eventgenerator.c". Also, we
     * would like to treat numbers intelligently so that "file1" "file10" "file5"
     * is sorted as "file1" "file5" "file10".
     *
     * Note that this function depends on the [current locale][setlocale].
     *
     * @param str a UTF-8 encoded string.
     * @param len length of @str, in bytes, or -1 if @str is nul-terminated.
     * @return a newly allocated string. This string should
     *   be freed with g_free() when you are done with it.
     * @since 2.8
     */
    @GLibVersion2_8
    public fun utf8CollateKeyForFilename(str: kotlin.String, len: Long): kotlin.String =
        g_utf8_collate_key_for_filename(str, len)?.toKString() ?: error("Expected not null string")

    /**
     * Finds the start of the next UTF-8 character in the string after @p.
     *
     * @p does not have to be at the beginning of a UTF-8 character. No check
     * is made to see if the character found is actually valid other than
     * it starts with an appropriate byte.
     *
     * If @end is null, the return value will never be null: if the end of the
     * string is reached, a pointer to the terminating nul byte is returned. If
     * @end is non-null, the return value will be null if the end of the string
     * is reached.
     *
     * @param p a pointer to a position within a UTF-8 encoded string
     * @param end a pointer to the byte following the end of the string,
     *     or null to indicate that the string is nul-terminated
     * @return a pointer to the found character or null if @end is
     *    set and is reached
     */
    public fun utf8FindNextChar(p: kotlin.String, end: kotlin.String? = null): kotlin.String? =
        g_utf8_find_next_char(p, end)?.toKString()

    /**
     * Given a position @p with a UTF-8 encoded string @str, find the start
     * of the previous UTF-8 character starting before @p. Returns null if no
     * UTF-8 characters are present in @str before @p.
     *
     * @p does not have to be at the beginning of a UTF-8 character. No check
     * is made to see if the character found is actually valid other than
     * it starts with an appropriate byte.
     *
     * @param str pointer to the beginning of a UTF-8 encoded string
     * @param p pointer to some position within @str
     * @return a pointer to the found character or null.
     */
    public fun utf8FindPrevChar(str: kotlin.String, p: kotlin.String): kotlin.String? =
        g_utf8_find_prev_char(str, p)?.toKString()

    /**
     * Converts a sequence of bytes encoded as UTF-8 to a Unicode character.
     *
     * If @p does not point to a valid UTF-8 encoded character, results
     * are undefined. If you are not sure that the bytes are complete
     * valid Unicode characters, you should use g_utf8_get_char_validated()
     * instead.
     *
     * @param p a pointer to Unicode character encoded as UTF-8
     * @return the resulting character
     */
    public fun utf8GetChar(p: kotlin.String): gunichar = g_utf8_get_char(p)

    /**
     * Convert a sequence of bytes encoded as UTF-8 to a Unicode character.
     * This function checks for incomplete characters, for invalid characters
     * such as characters that are out of the range of Unicode, and for
     * overlong encodings of valid characters.
     *
     * Note that g_utf8_get_char_validated() returns (gunichar)-2 if
     * @max_len is positive and any of the bytes in the first UTF-8 character
     * sequence are nul.
     *
     * @param p a pointer to Unicode character encoded as UTF-8
     * @param maxLen the maximum number of bytes to read, or -1 if @p is nul-terminated
     * @return the resulting character. If @p points to a partial
     *     sequence at the end of a string that could begin a valid
     *     character (or if @max_len is zero), returns (gunichar)-2;
     *     otherwise, if @p does not point to a valid UTF-8 encoded
     *     Unicode character, returns (gunichar)-1.
     */
    public fun utf8GetCharValidated(p: kotlin.String, maxLen: Long): gunichar = g_utf8_get_char_validated(p, maxLen)

    /**
     * If the provided string is valid UTF-8, return a copy of it. If not,
     * return a copy in which bytes that could not be interpreted as valid Unicode
     * are replaced with the Unicode replacement character (U+FFFD).
     *
     * For example, this is an appropriate function to use if you have received
     * a string that was incorrectly declared to be UTF-8, and you need a valid
     * UTF-8 version of it that can be logged or displayed to the user, with the
     * assumption that it is close enough to ASCII or UTF-8 to be mostly
     * readable as-is.
     *
     * @param str string to coerce into UTF-8
     * @param len the maximum length of @str to use, in bytes. If @len < 0,
     *     then the string is nul-terminated.
     * @return a valid UTF-8 string whose content resembles @str
     * @since 2.52
     */
    @GLibVersion2_52
    public fun utf8MakeValid(str: kotlin.String, len: Long): kotlin.String =
        g_utf8_make_valid(str, len)?.toKString() ?: error("Expected not null string")

    /**
     * Converts a string into canonical form, standardizing
     * such issues as whether a character with an accent
     * is represented as a base character and combining
     * accent or as a single precomposed character. The
     * string has to be valid UTF-8, otherwise null is
     * returned. You should generally call g_utf8_normalize()
     * before comparing two Unicode strings.
     *
     * The normalization mode %G_NORMALIZE_DEFAULT only
     * standardizes differences that do not affect the
     * text content, such as the above-mentioned accent
     * representation. %G_NORMALIZE_ALL also standardizes
     * the "compatibility" characters in Unicode, such
     * as SUPERSCRIPT THREE to the standard forms
     * (in this case DIGIT THREE). Formatting information
     * may be lost but for most text operations such
     * characters should be considered the same.
     *
     * %G_NORMALIZE_DEFAULT_COMPOSE and %G_NORMALIZE_ALL_COMPOSE
     * are like %G_NORMALIZE_DEFAULT and %G_NORMALIZE_ALL,
     * but returned a result with composed forms rather
     * than a maximally decomposed form. This is often
     * useful if you intend to convert the string to
     * a legacy encoding or pass it to a system with
     * less capable Unicode handling.
     *
     * @param str a UTF-8 encoded string.
     * @param len length of @str, in bytes, or -1 if @str is nul-terminated.
     * @param mode the type of normalization to perform.
     * @return a newly allocated string, that
     *   is the normalized form of @str, or null if @str
     *   is not valid UTF-8.
     */
    public fun utf8Normalize(str: kotlin.String, len: Long, mode: NormalizeMode): kotlin.String? =
        g_utf8_normalize(str, len, mode.nativeValue)?.toKString()

    /**
     * Converts from an integer character offset to a pointer to a position
     * within the string.
     *
     * Since 2.10, this function allows to pass a negative @offset to
     * step backwards. It is usually worth stepping backwards from the end
     * instead of forwards if @offset is in the last fourth of the string,
     * since moving forward is about 3 times faster than moving backward.
     *
     * Note that this function doesn't abort when reaching the end of @str.
     * Therefore you should be sure that @offset is within string boundaries
     * before calling that function. Call g_utf8_strlen() when unsure.
     * This limitation exists as this function is called frequently during
     * text rendering and therefore has to be as fast as possible.
     *
     * @param str a UTF-8 encoded string
     * @param offset a character offset within @str
     * @return the resulting pointer
     */
    public fun utf8OffsetToPointer(str: kotlin.String, offset: glong): kotlin.String =
        g_utf8_offset_to_pointer(str, offset)?.toKString() ?: error("Expected not null string")

    /**
     * Converts from a pointer to position within a string to an integer
     * character offset.
     *
     * Since 2.10, this function allows @pos to be before @str, and returns
     * a negative offset in this case.
     *
     * @param str a UTF-8 encoded string
     * @param pos a pointer to a position within @str
     * @return the resulting character offset
     */
    public fun utf8PointerToOffset(str: kotlin.String, pos: kotlin.String): glong = g_utf8_pointer_to_offset(str, pos)

    /**
     * Finds the previous UTF-8 character in the string before @p.
     *
     * @p does not have to be at the beginning of a UTF-8 character. No check
     * is made to see if the character found is actually valid other than
     * it starts with an appropriate byte. If @p might be the first
     * character of the string, you must use g_utf8_find_prev_char() instead.
     *
     * @param p a pointer to a position within a UTF-8 encoded string
     * @return a pointer to the found character
     */
    public fun utf8PrevChar(p: kotlin.String): kotlin.String =
        g_utf8_prev_char(p)?.toKString() ?: error("Expected not null string")

    /**
     * Finds the leftmost occurrence of the given Unicode character
     * in a UTF-8 encoded string, while limiting the search to @len bytes.
     * If @len is -1, allow unbounded search.
     *
     * @param p a nul-terminated UTF-8 encoded string
     * @param len the maximum length of @p
     * @param c a Unicode character
     * @return null if the string does not contain the character,
     *     otherwise, a pointer to the start of the leftmost occurrence
     *     of the character in the string.
     */
    public fun utf8Strchr(p: kotlin.String, len: Long, c: gunichar): kotlin.String? =
        g_utf8_strchr(p, len, c)?.toKString()

    /**
     * Converts all Unicode characters in the string that have a case
     * to lowercase. The exact manner that this is done depends
     * on the current locale, and may result in the number of
     * characters in the string changing.
     *
     * @param str a UTF-8 encoded string
     * @param len length of @str, in bytes, or -1 if @str is nul-terminated.
     * @return a newly allocated string, with all characters
     *    converted to lowercase.
     */
    public fun utf8Strdown(str: kotlin.String, len: Long): kotlin.String =
        g_utf8_strdown(str, len)?.toKString() ?: error("Expected not null string")

    /**
     * Computes the length of the string in characters, not including
     * the terminating nul character. If the @max'th byte falls in the
     * middle of a character, the last (partial) character is not counted.
     *
     * @param p pointer to the start of a UTF-8 encoded string
     * @param max the maximum number of bytes to examine. If @max
     *       is less than 0, then the string is assumed to be
     *       nul-terminated. If @max is 0, @p will not be examined and
     *       may be null. If @max is greater than 0, up to @max
     *       bytes are examined
     * @return the length of the string in characters
     */
    public fun utf8Strlen(p: kotlin.String, max: Long): glong = g_utf8_strlen(p, max)

    /**
     * Like the standard C strncpy() function, but copies a given number
     * of characters instead of a given number of bytes. The @src string
     * must be valid UTF-8 encoded text. (Use g_utf8_validate() on all
     * text before trying to use UTF-8 utility functions with it.)
     *
     * Note you must ensure @dest is at least 4 * @n + 1 to fit the
     * largest possible UTF-8 characters
     *
     * @param dest buffer to fill with characters from @src
     * @param src UTF-8 encoded string
     * @param n character count
     * @return @dest
     */
    public fun utf8Strncpy(dest: kotlin.String, src: kotlin.String, n: gsize): kotlin.String =
        g_utf8_strncpy(dest.cstr, src, n)?.toKString() ?: error("Expected not null string")

    /**
     * Find the rightmost occurrence of the given Unicode character
     * in a UTF-8 encoded string, while limiting the search to @len bytes.
     * If @len is -1, allow unbounded search.
     *
     * @param p a nul-terminated UTF-8 encoded string
     * @param len the maximum length of @p
     * @param c a Unicode character
     * @return null if the string does not contain the character,
     *     otherwise, a pointer to the start of the rightmost occurrence
     *     of the character in the string.
     */
    public fun utf8Strrchr(p: kotlin.String, len: Long, c: gunichar): kotlin.String? =
        g_utf8_strrchr(p, len, c)?.toKString()

    /**
     * Reverses a UTF-8 string. @str must be valid UTF-8 encoded text.
     * (Use g_utf8_validate() on all text before trying to use UTF-8
     * utility functions with it.)
     *
     * This function is intended for programmatic uses of reversed strings.
     * It pays no attention to decomposed characters, combining marks, byte
     * order marks, directional indicators (LRM, LRO, etc) and similar
     * characters which might need special handling when reversing a string
     * for display purposes.
     *
     * Note that unlike g_strreverse(), this function returns
     * newly-allocated memory, which should be freed with g_free() when
     * no longer needed.
     *
     * @param str a UTF-8 encoded string
     * @param len the maximum length of @str to use, in bytes. If @len < 0,
     *     then the string is nul-terminated.
     * @return a newly-allocated string which is the reverse of @str
     * @since 2.2
     */
    @GLibVersion2_2
    public fun utf8Strreverse(str: kotlin.String, len: Long): kotlin.String =
        g_utf8_strreverse(str, len)?.toKString() ?: error("Expected not null string")

    /**
     * Converts all Unicode characters in the string that have a case
     * to uppercase. The exact manner that this is done depends
     * on the current locale, and may result in the number of
     * characters in the string increasing. (For instance, the
     * German ess-zet will be changed to SS.)
     *
     * @param str a UTF-8 encoded string
     * @param len length of @str, in bytes, or -1 if @str is nul-terminated.
     * @return a newly allocated string, with all characters
     *    converted to uppercase.
     */
    public fun utf8Strup(str: kotlin.String, len: Long): kotlin.String =
        g_utf8_strup(str, len)?.toKString() ?: error("Expected not null string")

    /**
     * Copies a substring out of a UTF-8 encoded string.
     * The substring will contain @end_pos - @start_pos characters.
     *
     * Since GLib 2.72, `-1` can be passed to @end_pos to indicate the
     * end of the string.
     *
     * @param str a UTF-8 encoded string
     * @param startPos a character offset within @str
     * @param endPos another character offset within @str,
     *   or `-1` to indicate the end of the string
     * @return a newly allocated copy of the requested
     *     substring. Free with g_free() when no longer needed.
     * @since 2.30
     */
    @GLibVersion2_30
    public fun utf8Substring(str: kotlin.String, startPos: glong, endPos: glong): kotlin.String =
        g_utf8_substring(str, startPos, endPos)?.toKString() ?: error("Expected not null string")

    /**
     * Cuts off the middle of the string, preserving half of @truncate_length
     * characters at the beginning and half at the end.
     *
     * If @string is already short enough, this returns a copy of @string.
     * If @truncate_length is `0`, an empty string is returned.
     *
     * @param string a nul-terminated UTF-8 encoded string
     * @param truncateLength the new size of @string, in characters, including the ellipsis character
     * @return a newly-allocated copy of @string ellipsized in the middle
     * @since 2.78
     */
    @GLibVersion2_78
    public fun utf8TruncateMiddle(string: kotlin.String, truncateLength: gsize): kotlin.String =
        g_utf8_truncate_middle(string, truncateLength)?.toKString() ?: error("Expected not null string")

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
    @GLibVersion2_52
    public fun uuidStringIsValid(str: kotlin.String): Boolean = g_uuid_string_is_valid(str).asBoolean()

    /**
     * Generates a random UUID (RFC 4122 version 4) as a string. It has the same
     * randomness guarantees as #GRand, so must not be used for cryptographic
     * purposes such as key generation, nonces, salts or one-time pads.
     *
     * @return A string that should be freed with g_free().
     * @since 2.52
     */
    @GLibVersion2_52
    public fun uuidStringRandom(): kotlin.String =
        g_uuid_string_random()?.toKString() ?: error("Expected not null string")

    public fun variantGetGtype(): GType = g_variant_get_gtype()

    /**
     * Internal function used to print messages from the public [func@GLib.warn_if_reached]
     * and [func@GLib.warn_if_fail] macros.
     *
     * @param domain log domain
     * @param file file containing the warning
     * @param line line number of the warning
     * @param func function containing the warning
     * @param warnexpr expression which failed
     */
    public fun warnMessage(
        domain: kotlin.String? = null,
        `file`: kotlin.String,
        line: gint,
        func: kotlin.String,
        warnexpr: kotlin.String? = null,
    ): Unit = g_warn_message(domain, `file`, line, func, warnexpr)

    public fun resolveException(error: Error): GLibException {
        val ex = when (error.domain) {
            BookmarkFileError.quark() -> BookmarkFileError.fromErrorOrNull(error)
                ?.let {
                    BookmarkFileErrorException(error, it)
                }
            ConvertError.quark() -> ConvertError.fromErrorOrNull(error)
                ?.let {
                    ConvertErrorException(error, it)
                }
            FileError.quark() -> FileError.fromErrorOrNull(error)
                ?.let {
                    FileErrorException(error, it)
                }
            IoChannelError.quark() -> IoChannelError.fromErrorOrNull(error)
                ?.let {
                    IoChannelErrorException(error, it)
                }
            KeyFileError.quark() -> KeyFileError.fromErrorOrNull(error)
                ?.let {
                    KeyFileErrorException(error, it)
                }
            MarkupError.quark() -> MarkupError.fromErrorOrNull(error)
                ?.let {
                    MarkupErrorException(error, it)
                }
            NumberParserError.quark() -> NumberParserError.fromErrorOrNull(error)
                ?.let {
                    NumberParserErrorException(error, it)
                }
            OptionError.quark() -> OptionError.fromErrorOrNull(error)
                ?.let {
                    OptionErrorException(error, it)
                }
            RegexError.quark() -> RegexError.fromErrorOrNull(error)
                ?.let {
                    RegexErrorException(error, it)
                }
            ShellError.quark() -> ShellError.fromErrorOrNull(error)
                ?.let {
                    ShellErrorException(error, it)
                }
            SpawnError.quark() -> SpawnError.fromErrorOrNull(error)
                ?.let {
                    SpawnErrorException(error, it)
                }
            ThreadError.quark() -> ThreadError.fromErrorOrNull(error)
                ?.let {
                    ThreadErrorException(error, it)
                }
            UriError.quark() -> UriError.fromErrorOrNull(error)
                ?.let {
                    UriErrorException(error, it)
                }
            VariantParseError.quark() -> VariantParseError.fromErrorOrNull(error)
                ?.let {
                    VariantParseErrorException(error, it)
                }
            else -> null
        }
        return ex ?: GLibException(error)
    }
}

public val CacheDestroyFuncFunc: CPointer<CFunction<(gpointer?) -> Unit>> = staticCFunction {
        `value`: gpointer?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(`value`: gpointer?) -> Unit>().get().invoke(`value`)
}
    .reinterpret()

public val CacheDupFuncFunc: CPointer<CFunction<(gpointer?) -> gpointer?>> = staticCFunction {
        `value`: gpointer?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(`value`: gpointer?) -> gpointer?>().get().invoke(`value`)
}
    .reinterpret()

public val CacheNewFuncFunc: CPointer<CFunction<(gpointer?) -> gpointer?>> = staticCFunction {
        key: gpointer?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(key: gpointer?) -> gpointer?>().get().invoke(key)
}
    .reinterpret()

public val ChildWatchFuncFunc: CPointer<CFunction<(Pid, gint) -> Unit>> = staticCFunction {
        pid: Pid,
        waitStatus: gint,
        userData: gpointer?,
    ->
    userData!!.asStableRef<(pid: Pid, waitStatus: gint) -> Unit>().get().invoke(pid, waitStatus)
}
    .reinterpret()

public val ClearHandleFuncFunc: CPointer<CFunction<(guint) -> Unit>> = staticCFunction {
        handleId: guint,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(handleId: guint) -> Unit>().get().invoke(handleId)
}
    .reinterpret()

public val CompareDataFuncFunc: CPointer<CFunction<(gpointer?, gpointer?) -> gint>> =
    staticCFunction {
            a: gpointer?,
            b: gpointer?,
            userData: gpointer?,
        ->
        userData!!.asStableRef<(a: gpointer?, b: gpointer?) -> gint>().get().invoke(a, b)
    }
        .reinterpret()

public val CompareFuncFunc: CPointer<CFunction<(gpointer?, gpointer?) -> gint>> = staticCFunction {
        a: gpointer?,
        b: gpointer?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(a: gpointer?, b: gpointer?) -> gint>().get().invoke(a, b)
}
    .reinterpret()

public val CompletionFuncFunc: CPointer<CFunction<(gpointer?) -> CPointer<ByteVar>>> =
    staticCFunction {
            item: gpointer?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(item: gpointer?) -> kotlin.String>().get().invoke(item).let { g_strdup(it) }
    }
        .reinterpret()

public val CompletionStrncmpFuncFunc: CPointer<
    CFunction<
        (
            CPointer<ByteVar>,
            CPointer<ByteVar>,
            gsize,
        ) -> gint
        >
    > = staticCFunction {
        s1: CPointer<ByteVar>?,
        s2: CPointer<ByteVar>?,
        n: gsize,
        userData: COpaquePointer,
    ->
    userData.asStableRef<
        (
            s1: kotlin.String,
            s2: kotlin.String,
            n: gsize,
        ) -> gint
        >().get().invoke(
        s1?.toKString() ?: error("Expected not null string"),
        s2?.toKString() ?: error("Expected not null string"),
        n
    )
}
    .reinterpret()

public val CopyFuncFunc: CPointer<CFunction<(gpointer, gpointer?) -> gpointer>> = staticCFunction {
        src: gpointer,
        `data`: gpointer?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(src: gpointer, `data`: gpointer?) -> gpointer>().get().invoke(src!!, `data`)
}
    .reinterpret()

public val DataForeachFuncFunc: CPointer<CFunction<(Quark, gpointer?) -> Unit>> = staticCFunction {
        keyId: Quark,
        `data`: gpointer?,
        userData: gpointer?,
    ->
    userData!!.asStableRef<(keyId: Quark, `data`: gpointer?) -> Unit>().get().invoke(keyId, `data`)
}
    .reinterpret()

public val DestroyNotifyFunc: CPointer<CFunction<(gpointer?) -> Unit>> = staticCFunction {
        `data`: gpointer?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(`data`: gpointer?) -> Unit>().get().invoke(`data`)
}
    .reinterpret()

public val DuplicateFuncFunc: CPointer<CFunction<(gpointer?) -> gpointer?>> = staticCFunction {
        `data`: gpointer?,
        userData: gpointer?,
    ->
    userData!!.asStableRef<(`data`: gpointer?) -> gpointer?>().get().invoke(`data`)
}
    .reinterpret()

public val EqualFuncFunc: CPointer<CFunction<(gpointer?, gpointer?) -> gboolean>> =
    staticCFunction {
            a: gpointer?,
            b: gpointer?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(a: gpointer?, b: gpointer?) -> Boolean>().get().invoke(a, b).asGBoolean()
    }
        .reinterpret()

public val EqualFuncFullFunc: CPointer<CFunction<(gpointer?, gpointer?) -> gboolean>> =
    staticCFunction {
            a: gpointer?,
            b: gpointer?,
            userData: gpointer?,
        ->
        userData!!.asStableRef<(a: gpointer?, b: gpointer?) -> Boolean>().get().invoke(a, b).asGBoolean()
    }
        .reinterpret()

public val ErrorClearFuncFunc: CPointer<CFunction<(CPointer<org.gtkkn.native.glib.GError>) -> Unit>> =
    staticCFunction {
            error: CPointer<org.gtkkn.native.glib.GError>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(error: Error) -> Unit>().get().invoke(
            error!!.run {
                Error(this)
            }
        )
    }
        .reinterpret()

public val ErrorCopyFuncFunc:
    CPointer<CFunction<(CPointer<org.gtkkn.native.glib.GError>, CPointer<org.gtkkn.native.glib.GError>) -> Unit>> =
    staticCFunction {
            srcError: CPointer<org.gtkkn.native.glib.GError>?,
            destError: CPointer<org.gtkkn.native.glib.GError>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(srcError: Error, destError: Error) -> Unit>().get().invoke(
            srcError!!.run {
                Error(this)
            },
            destError!!.run {
                Error(this)
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
                Error(this)
            }
        )
    }
        .reinterpret()

public val FreeFuncFunc: CPointer<CFunction<(gpointer?) -> Unit>> = staticCFunction {
        `data`: gpointer?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(`data`: gpointer?) -> Unit>().get().invoke(`data`)
}
    .reinterpret()

public val FuncFunc: CPointer<CFunction<(gpointer?) -> Unit>> = staticCFunction {
        `data`: gpointer?,
        userData: gpointer?,
    ->
    userData!!.asStableRef<(`data`: gpointer?) -> Unit>().get().invoke(`data`)
}
    .reinterpret()

public val HFuncFunc: CPointer<CFunction<(gpointer?, gpointer?) -> Unit>> = staticCFunction {
        key: gpointer?,
        `value`: gpointer?,
        userData: gpointer?,
    ->
    userData!!.asStableRef<(key: gpointer?, `value`: gpointer?) -> Unit>().get().invoke(key, `value`)
}
    .reinterpret()

public val HrFuncFunc: CPointer<CFunction<(gpointer?, gpointer?) -> gboolean>> = staticCFunction {
        key: gpointer?,
        `value`: gpointer?,
        userData: gpointer?,
    ->
    userData!!.asStableRef<(key: gpointer?, `value`: gpointer?) -> Boolean>().get().invoke(key, `value`).asGBoolean()
}
    .reinterpret()

public val HashFuncFunc: CPointer<CFunction<(gpointer?) -> guint>> = staticCFunction {
        key: gpointer?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(key: gpointer?) -> guint>().get().invoke(key)
}
    .reinterpret()

public val HookCheckFuncFunc: CPointer<CFunction<(gpointer?) -> gboolean>> = staticCFunction {
        `data`: gpointer?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(`data`: gpointer?) -> Boolean>().get().invoke(`data`).asGBoolean()
}
    .reinterpret()

public val HookCheckMarshallerFunc: CPointer<CFunction<(CPointer<GHook>, gpointer?) -> gboolean>> =
    staticCFunction {
            hook: CPointer<GHook>?,
            marshalData: gpointer?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(hook: Hook, marshalData: gpointer?) -> Boolean>().get().invoke(
            hook!!.run {
                Hook(this)
            },
            marshalData
        ).asGBoolean()
    }
        .reinterpret()

public val HookCompareFuncFunc: CPointer<CFunction<(CPointer<GHook>, CPointer<GHook>) -> gint>> =
    staticCFunction {
            newHook: CPointer<GHook>?,
            sibling: CPointer<GHook>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(newHook: Hook, sibling: Hook) -> gint>().get().invoke(
            newHook!!.run {
                Hook(this)
            },
            sibling!!.run {
                Hook(this)
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
                HookList(this)
            },
            hook!!.run {
                Hook(this)
            }
        )
    }
        .reinterpret()

public val HookFindFuncFunc: CPointer<CFunction<(CPointer<GHook>, gpointer?) -> gboolean>> =
    staticCFunction {
            hook: CPointer<GHook>?,
            `data`: gpointer?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(hook: Hook, `data`: gpointer?) -> Boolean>().get().invoke(
            hook!!.run {
                Hook(this)
            },
            `data`
        ).asGBoolean()
    }
        .reinterpret()

public val HookFuncFunc: CPointer<CFunction<(gpointer?) -> Unit>> = staticCFunction {
        `data`: gpointer?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(`data`: gpointer?) -> Unit>().get().invoke(`data`)
}
    .reinterpret()

public val HookMarshallerFunc: CPointer<CFunction<(CPointer<GHook>, gpointer?) -> Unit>> =
    staticCFunction {
            hook: CPointer<GHook>?,
            marshalData: gpointer?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(hook: Hook, marshalData: gpointer?) -> Unit>().get().invoke(
            hook!!.run {
                Hook(this)
            },
            marshalData
        )
    }
        .reinterpret()

public val IoFuncFunc: CPointer<
    CFunction<
        (
            CPointer<GIOChannel>,
            GIOCondition,
            gpointer?,
        ) -> gboolean
        >
    > = staticCFunction {
        source: CPointer<GIOChannel>?,
        condition: GIOCondition,
        `data`: gpointer?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<
        (
            source: IoChannel,
            condition: IoCondition,
            `data`: gpointer?,
        ) -> Boolean
        >().get().invoke(
        source!!.run {
            IoChannel(this)
        },
        condition.run {
            IoCondition(this)
        },
        `data`
    ).asGBoolean()
}
    .reinterpret()

public val LogFuncFunc: CPointer<
    CFunction<
        (
            CPointer<ByteVar>?,
            GLogLevelFlags,
            CPointer<ByteVar>,
        ) -> Unit
        >
    > = staticCFunction {
        logDomain: CPointer<ByteVar>?,
        logLevel: GLogLevelFlags,
        message: CPointer<ByteVar>?,
        userData: gpointer?,
    ->
    userData!!.asStableRef<
        (
            logDomain: kotlin.String?,
            logLevel: LogLevelFlags,
            message: kotlin.String,
        ) -> Unit
        >().get().invoke(
        logDomain?.toKString(),
        logLevel.run {
            LogLevelFlags(this)
        },
        message?.toKString() ?: error("Expected not null string")
    )
}
    .reinterpret()

public val LogWriterFuncFunc: CPointer<CFunction<(GLogLevelFlags, gsize) -> GLogWriterOutput>> =
    staticCFunction {
            logLevel: GLogLevelFlags,
            nFields: gsize,
            userData: gpointer?,
        ->
        userData!!.asStableRef<(logLevel: LogLevelFlags, nFields: gsize) -> LogWriterOutput>().get().invoke(
            logLevel.run {
                LogLevelFlags(this)
            },
            nFields
        ).nativeValue
    }
        .reinterpret()

public val NodeForeachFuncFunc: CPointer<CFunction<(CPointer<GNode>, gpointer?) -> Unit>> =
    staticCFunction {
            node: CPointer<GNode>?,
            `data`: gpointer?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(node: Node, `data`: gpointer?) -> Unit>().get().invoke(
            node!!.run {
                Node(this)
            },
            `data`
        )
    }
        .reinterpret()

public val NodeTraverseFuncFunc: CPointer<CFunction<(CPointer<GNode>, gpointer?) -> gboolean>> =
    staticCFunction {
            node: CPointer<GNode>?,
            `data`: gpointer?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(node: Node, `data`: gpointer?) -> Boolean>().get().invoke(
            node!!.run {
                Node(this)
            },
            `data`
        ).asGBoolean()
    }
        .reinterpret()

public val PollFuncFunc: CPointer<
    CFunction<
        (
            CPointer<GPollFD>,
            guint,
            gint,
        ) -> gint
        >
    > = staticCFunction {
        ufds: CPointer<GPollFD>?,
        nfsd: guint,
        timeout: gint,
        userData: COpaquePointer,
    ->
    userData.asStableRef<
        (
            ufds: PollFd,
            nfsd: guint,
            timeout: gint,
        ) -> gint
        >().get().invoke(
        ufds!!.run {
            PollFd(this)
        },
        nfsd,
        timeout
    )
}
    .reinterpret()

public val PrintFuncFunc: CPointer<CFunction<(CPointer<ByteVar>) -> Unit>> = staticCFunction {
        string: CPointer<ByteVar>?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(string: kotlin.String) -> Unit>().get().invoke(
        string?.toKString() ?: error("Expected not null string")
    )
}
    .reinterpret()

public val RegexEvalCallbackFunc:
    CPointer<CFunction<(CPointer<GMatchInfo>, CPointer<GString>) -> gboolean>> =
    staticCFunction {
            matchInfo: CPointer<GMatchInfo>?,
            result: CPointer<GString>?,
            userData: gpointer?,
        ->
        userData!!.asStableRef<(matchInfo: MatchInfo, result: String) -> Boolean>().get().invoke(
            matchInfo!!.run {
                MatchInfo(this)
            },
            result!!.run {
                String(this)
            }
        ).asGBoolean()
    }
        .reinterpret()

public val ScannerMsgFuncFunc: CPointer<
    CFunction<
        (
            CPointer<GScanner>,
            CPointer<ByteVar>,
            gboolean,
        ) -> Unit
        >
    > = staticCFunction {
        scanner: CPointer<GScanner>?,
        message: CPointer<ByteVar>?,
        error: gboolean,
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
            Scanner(this)
        },
        message?.toKString() ?: error("Expected not null string"),
        error.asBoolean()
    )
}
    .reinterpret()

public val SequenceIterCompareFuncFunc: CPointer<
    CFunction<
        (
            CPointer<GSequenceIter>,
            CPointer<GSequenceIter>,
            gpointer?,
        ) -> gint
        >
    > = staticCFunction {
        a: CPointer<GSequenceIter>?,
        b: CPointer<GSequenceIter>?,
        `data`: gpointer?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<
        (
            a: SequenceIter,
            b: SequenceIter,
            `data`: gpointer?,
        ) -> gint
        >().get().invoke(
        a!!.run {
            SequenceIter(this)
        },
        b!!.run {
            SequenceIter(this)
        },
        `data`
    )
}
    .reinterpret()

public val SourceDisposeFuncFunc: CPointer<CFunction<(CPointer<GSource>) -> Unit>> =
    staticCFunction {
            source: CPointer<GSource>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(source: Source) -> Unit>().get().invoke(
            source!!.run {
                Source(this)
            }
        )
    }
        .reinterpret()

public val SourceDummyMarshalFunc: CPointer<CFunction<() -> Unit>> = staticCFunction { userData: COpaquePointer ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

public val SourceFuncFunc: CPointer<CFunction<() -> gboolean>> = staticCFunction { userData: gpointer? ->
    userData!!.asStableRef<() -> Boolean>().get().invoke().asGBoolean()
}
    .reinterpret()

public val SourceOnceFuncFunc: CPointer<CFunction<() -> Unit>> = staticCFunction { userData: gpointer? ->
    userData!!.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

public val SpawnChildSetupFuncFunc: CPointer<CFunction<(gpointer?) -> Unit>> = staticCFunction {
        `data`: gpointer?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(`data`: gpointer?) -> Unit>().get().invoke(`data`)
}
    .reinterpret()

public val TestDataFuncFunc: CPointer<CFunction<() -> Unit>> = staticCFunction { userData: gpointer? ->
    userData!!.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

public val TestFixtureFuncFunc: CPointer<CFunction<(gpointer) -> Unit>> = staticCFunction {
        fixture: gpointer,
        userData: gpointer?,
    ->
    userData!!.asStableRef<(fixture: gpointer) -> Unit>().get().invoke(fixture!!)
}
    .reinterpret()

public val TestFuncFunc: CPointer<CFunction<() -> Unit>> = staticCFunction { userData: COpaquePointer ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

public val TestLogFatalFuncFunc: CPointer<
    CFunction<
        (
            CPointer<ByteVar>,
            GLogLevelFlags,
            CPointer<ByteVar>,
        ) -> gboolean
        >
    > = staticCFunction {
        logDomain: CPointer<ByteVar>?,
        logLevel: GLogLevelFlags,
        message: CPointer<ByteVar>?,
        userData: gpointer?,
    ->
    userData!!.asStableRef<
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

public val ThreadFuncFunc: CPointer<CFunction<(gpointer?) -> gpointer?>> = staticCFunction {
        `data`: gpointer?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(`data`: gpointer?) -> gpointer?>().get().invoke(`data`)
}
    .reinterpret()

public val TranslateFuncFunc:
    CPointer<CFunction<(CPointer<ByteVar>, gpointer?) -> CPointer<ByteVar>>> = staticCFunction {
            str: CPointer<ByteVar>?,
            `data`: gpointer?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(str: kotlin.String, `data`: gpointer?) -> kotlin.String>().get().invoke(
            str?.toKString() ?: error("Expected not null string"),
            `data`
        ).let { g_strdup(it) }
    }
        .reinterpret()

public val TraverseFuncFunc: CPointer<
    CFunction<
        (
            gpointer?,
            gpointer?,
            gpointer?,
        ) -> gboolean
        >
    > = staticCFunction {
        key: gpointer?,
        `value`: gpointer?,
        `data`: gpointer?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<
        (
            key: gpointer?,
            `value`: gpointer?,
            `data`: gpointer?,
        ) -> Boolean
        >().get().invoke(key, `value`, `data`).asGBoolean()
}
    .reinterpret()

public val TraverseNodeFuncFunc: CPointer<CFunction<(CPointer<GTreeNode>, gpointer?) -> gboolean>> =
    staticCFunction {
            node: CPointer<GTreeNode>?,
            `data`: gpointer?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(node: TreeNode, `data`: gpointer?) -> Boolean>().get().invoke(
            node!!.run {
                TreeNode(this)
            },
            `data`
        ).asGBoolean()
    }
        .reinterpret()

public val UnixFdSourceFuncFunc: CPointer<CFunction<(gint, GIOCondition) -> gboolean>> =
    staticCFunction {
            fd: gint,
            condition: GIOCondition,
            userData: gpointer?,
        ->
        userData!!.asStableRef<(fd: gint, condition: IoCondition) -> Boolean>().get().invoke(
            fd,
            condition.run {
                IoCondition(this)
            }
        ).asGBoolean()
    }
        .reinterpret()

public val VoidFuncFunc: CPointer<CFunction<() -> Unit>> = staticCFunction { userData: COpaquePointer ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

/**
 * Specifies the type of the @value_destroy_func and @key_destroy_func
 * functions passed to g_cache_new(). The functions are passed a
 * pointer to the #GCache key or #GCache value and should free any
 * memory and other resources associated with it.
 *
 * - param `value` the #GCache value to destroy
 */
public typealias CacheDestroyFunc = (`value`: gpointer?) -> Unit

/**
 * Specifies the type of the @key_dup_func function passed to
 * g_cache_new(). The function is passed a key
 * (__not__ a value as the prototype implies) and
 * should return a duplicate of the key.
 *
 * - param `value` the #GCache key to destroy (__not__ a
 *         #GCache value as it seems)
 * - return a copy of the #GCache key
 */
public typealias CacheDupFunc = (`value`: gpointer?) -> gpointer?

/**
 * Specifies the type of the @value_new_func function passed to
 * g_cache_new(). It is passed a #GCache key and should create the
 * value corresponding to the key.
 *
 * - param `key` a #GCache key
 * - return a new #GCache value corresponding to the key.
 */
public typealias CacheNewFunc = (key: gpointer?) -> gpointer?

/**
 * Prototype of a #GChildWatchSource callback, called when a child
 * process has exited.
 *
 * To interpret @wait_status, see the documentation
 * for g_spawn_check_wait_status(). In particular,
 * on Unix platforms, note that it is usually not equal
 * to the integer passed to `exit()` or returned from `main()`.
 *
 * - param `pid` the process id of the child process
 * - param `waitStatus` Status information about the child process, encoded
 *               in a platform-specific manner
 */
public typealias ChildWatchFunc = (pid: Pid, waitStatus: gint) -> Unit

/**
 * Specifies the type of function passed to g_clear_handle_id().
 * The implementation is expected to free the resource identified
 * by @handle_id; for instance, if @handle_id is a #GSource ID,
 * g_source_remove() can be used.
 *
 * - param `handleId` the handle ID to clear
 */
public typealias ClearHandleFunc = (handleId: guint) -> Unit

/**
 * Specifies the type of a comparison function used to compare two
 * values.  The function should return a negative integer if the first
 * value comes before the second, 0 if they are equal, or a positive
 * integer if the first value comes after the second.
 *
 * - param `a` a value
 * - param `b` a value to compare with
 * - return negative value if @a < @b; zero if @a = @b; positive
 *          value if @a > @b
 */
public typealias CompareDataFunc = (a: gpointer?, b: gpointer?) -> gint

/**
 * Specifies the type of a comparison function used to compare two
 * values.  The function should return a negative integer if the first
 * value comes before the second, 0 if they are equal, or a positive
 * integer if the first value comes after the second.
 *
 * - param `a` a value
 * - param `b` a value to compare with
 * - return negative value if @a < @b; zero if @a = @b; positive
 *          value if @a > @b
 */
public typealias CompareFunc = (a: gpointer?, b: gpointer?) -> gint

/**
 * Specifies the type of the function passed to g_completion_new(). It
 * should return the string corresponding to the given target item.
 * This is used when you use data structures as #GCompletion items.
 *
 * - param `item` the completion item.
 * - return the string corresponding to the item.
 */
public typealias CompletionFunc = (item: gpointer?) -> kotlin.String

/**
 * Specifies the type of the function passed to
 * g_completion_set_compare(). This is used when you use strings as
 * #GCompletion items.
 *
 * - param `s1` string to compare with @s2.
 * - param `s2` string to compare with @s1.
 * - param `n` maximal number of bytes to compare.
 * - return an integer less than, equal to, or greater than zero if
 *          the first @n bytes of @s1 is found, respectively, to be
 *          less than, to match, or to be greater than the first @n
 *          bytes of @s2.
 */
public typealias CompletionStrncmpFunc = (
    s1: kotlin.String,
    s2: kotlin.String,
    n: gsize,
) -> gint

/**
 * A function of this signature is used to copy the node data
 * when doing a deep-copy of a tree.
 *
 * - param `src` A pointer to the data which should be copied
 * - param `data` Additional data
 * - return A pointer to the copy
 */
public typealias CopyFunc = (src: gpointer, `data`: gpointer?) -> gpointer

/**
 * Specifies the type of function passed to g_dataset_foreach(). It is
 * called with each #GQuark id and associated data element, together
 * with the @user_data parameter supplied to g_dataset_foreach().
 *
 * - param `keyId` the #GQuark id to identifying the data element.
 * - param `data` the data element.
 */
public typealias DataForeachFunc = (keyId: Quark, `data`: gpointer?) -> Unit

/**
 * Specifies the type of function which is called when a data element
 * is destroyed. It is passed the pointer to the data element and
 * should free any memory and resources allocated for it.
 *
 * - param `data` the data element.
 */
public typealias DestroyNotify = (`data`: gpointer?) -> Unit

/**
 * The type of functions that are used to 'duplicate' an object.
 * What this means depends on the context, it could just be
 * incrementing the reference count, if @data is a ref-counted
 * object.
 *
 * - param `data` the data to duplicate
 * - return a duplicate of data
 */
public typealias DuplicateFunc = (`data`: gpointer?) -> gpointer?

/**
 * Specifies the type of a function used to test two values for
 * equality. The function should return true if both values are equal
 * and false otherwise.
 *
 * - param `a` a value
 * - param `b` a value to compare with
 * - return true if @a = @b; false otherwise
 */
public typealias EqualFunc = (a: gpointer?, b: gpointer?) -> Boolean

/**
 * Specifies the type of a function used to test two values for
 * equality. The function should return true if both values are equal
 * and false otherwise.
 *
 * This is a version of #GEqualFunc which provides a @user_data closure from
 * the caller.
 *
 * - param `a` a value
 * - param `b` a value to compare with
 * - return true if @a = @b; false otherwise
 */
public typealias EqualFuncFull = (a: gpointer?, b: gpointer?) -> Boolean

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
 * not currently used in GLib or GTK.
 *
 * - param `data` a data pointer
 */
public typealias FreeFunc = (`data`: gpointer?) -> Unit

/**
 * Specifies the type of functions passed to g_list_foreach() and
 * g_slist_foreach().
 *
 * - param `data` the element's data
 */
public typealias Func = (`data`: gpointer?) -> Unit

/**
 * Specifies the type of the function passed to g_hash_table_foreach().
 * It is called with each key/value pair, together with the @user_data
 * parameter which is passed to g_hash_table_foreach().
 *
 * - param `key` a key
 * - param `value` the value corresponding to the key
 */
public typealias HFunc = (key: gpointer?, `value`: gpointer?) -> Unit

/**
 * Specifies the type of the function passed to
 * g_hash_table_foreach_remove(). It is called with each key/value
 * pair, together with the @user_data parameter passed to
 * g_hash_table_foreach_remove(). It should return true if the
 * key/value pair should be removed from the #GHashTable.
 *
 * - param `key` a key
 * - param `value` the value associated with the key
 * - return true if the key/value pair should be removed from the
 *     #GHashTable
 */
public typealias HrFunc = (key: gpointer?, `value`: gpointer?) -> Boolean

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
 * - param `key` a key
 * - return the hash value corresponding to the key
 */
public typealias HashFunc = (key: gpointer?) -> guint

/**
 * Defines the type of a hook function that can be invoked
 * by g_hook_list_invoke_check().
 *
 * - param `data` the data field of the #GHook is passed to the hook function here
 * - return false if the #GHook should be destroyed
 */
public typealias HookCheckFunc = (`data`: gpointer?) -> Boolean

/**
 * Defines the type of function used by g_hook_list_marshal_check().
 *
 * - param `hook` a #GHook
 * - param `marshalData` user data
 * - return false if @hook should be destroyed
 */
public typealias HookCheckMarshaller = (hook: Hook, marshalData: gpointer?) -> Boolean

/**
 * Defines the type of function used to compare #GHook elements in
 * g_hook_insert_sorted().
 *
 * - param `newHook` the #GHook being inserted
 * - param `sibling` the #GHook to compare with @new_hook
 * - return a value <= 0 if @new_hook should be before @sibling
 */
public typealias HookCompareFunc = (newHook: Hook, sibling: Hook) -> gint

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
 * - param `data` user data passed to g_hook_find_func()
 * - return true if the required #GHook has been found
 */
public typealias HookFindFunc = (hook: Hook, `data`: gpointer?) -> Boolean

/**
 * Defines the type of a hook function that can be invoked
 * by g_hook_list_invoke().
 *
 * - param `data` the data field of the #GHook is passed to the hook function here
 */
public typealias HookFunc = (`data`: gpointer?) -> Unit

/**
 * Defines the type of function used by g_hook_list_marshal().
 *
 * - param `hook` a #GHook
 * - param `marshalData` user data
 */
public typealias HookMarshaller = (hook: Hook, marshalData: gpointer?) -> Unit

/**
 * Specifies the type of function passed to g_io_add_watch() or
 * g_io_add_watch_full(), which is called when the requested condition
 * on a #GIOChannel is satisfied.
 *
 * - param `source` the #GIOChannel event source
 * - param `condition` the condition which has been satisfied
 * - param `data` user data set in g_io_add_watch() or g_io_add_watch_full()
 * - return the function should return false if the event source
 *          should be removed
 */
public typealias IoFunc = (
    source: IoChannel,
    condition: IoCondition,
    `data`: gpointer?,
) -> Boolean

/**
 * Specifies the prototype of log handler functions.
 *
 * The default log handler, [func@GLib.log_default_handler], automatically appends a
 * new-line character to @message when printing it. It is advised that any
 * custom log handler functions behave similarly, so that logging calls in user
 * code do not need modifying to add a new-line character to the message if the
 * log handler is changed.
 *
 * This is not used if structured logging is enabled; see
 * [Using Structured Logging](logging.html#using-structured-logging).
 *
 * - param `logDomain` the log domain of the message
 * - param `logLevel` the log level of the message (including the
 *   fatal and recursion flags)
 * - param `message` the message to process
 */
public typealias LogFunc = (
    logDomain: kotlin.String?,
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
public typealias LogWriterFunc = (logLevel: LogLevelFlags, nFields: gsize) -> LogWriterOutput

/**
 * Specifies the type of function passed to g_node_children_foreach().
 * The function is called with each child node, together with the user
 * data passed to g_node_children_foreach().
 *
 * - param `node` a #GNode.
 * - param `data` user data passed to g_node_children_foreach().
 */
public typealias NodeForeachFunc = (node: Node, `data`: gpointer?) -> Unit

/**
 * Specifies the type of function passed to g_node_traverse(). The
 * function is called with each of the nodes visited, together with the
 * user data passed to g_node_traverse(). If the function returns
 * true, then the traversal is stopped.
 *
 * - param `node` a #GNode.
 * - param `data` user data passed to g_node_traverse().
 * - return true to stop the traversal.
 */
public typealias NodeTraverseFunc = (node: Node, `data`: gpointer?) -> Boolean

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
    ufds: PollFd,
    nfsd: guint,
    timeout: gint,
) -> gint

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
 * - param `a` a #GSequenceIter
 * - param `b` a #GSequenceIter
 * - param `data` user data
 * - return zero if the iterators are equal, a negative value if @a
 *     comes before @b, and a positive value if @b comes before @a.
 */
public typealias SequenceIterCompareFunc = (
    a: SequenceIter,
    b: SequenceIter,
    `data`: gpointer?,
) -> gint

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
 * A source function that is only called once before being removed from the main
 * context automatically.
 *
 * See: g_idle_add_once(), g_timeout_add_once()
 */
public typealias SourceOnceFunc = () -> Unit

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
 *
 * - param `data` user data passed to the function.
 */
public typealias SpawnChildSetupFunc = (`data`: gpointer?) -> Unit

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
 *
 * - param `fixture` the test fixture
 */
public typealias TestFixtureFunc = (fixture: gpointer) -> Unit

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
 * Specifies the type of the @func functions passed to g_thread_new()
 * or g_thread_try_new().
 *
 * - param `data` data passed to the thread
 * - return the return value of the thread
 */
public typealias ThreadFunc = (`data`: gpointer?) -> gpointer?

/**
 * The type of functions which are used to translate user-visible
 * strings, for <option>--help</option> output.
 *
 * - param `str` the untranslated string
 * - param `data` user data specified when installing the function, e.g.
 *  in g_option_group_set_translate_func()
 * - return a translation of the string for the current locale.
 *  The returned string is owned by GLib and must not be freed.
 */
public typealias TranslateFunc = (str: kotlin.String, `data`: gpointer?) -> kotlin.String

/**
 * Specifies the type of function passed to g_tree_traverse(). It is
 * passed the key and value of each node, together with the @user_data
 * parameter passed to g_tree_traverse(). If the function returns
 * true, the traversal is stopped.
 *
 * - param `key` a key of a #GTree node
 * - param `value` the value corresponding to the key
 * - param `data` user data passed to g_tree_traverse()
 * - return true to stop the traversal
 */
public typealias TraverseFunc = (
    key: gpointer?,
    `value`: gpointer?,
    `data`: gpointer?,
) -> Boolean

/**
 * Specifies the type of function passed to g_tree_foreach_node(). It is
 * passed each node, together with the @user_data parameter passed to
 * g_tree_foreach_node(). If the function returns true, the traversal is
 * stopped.
 *
 * - param `node` a #GTreeNode
 * - param `data` user data passed to g_tree_foreach_node()
 * - return true to stop the traversal
 */
public typealias TraverseNodeFunc = (node: TreeNode, `data`: gpointer?) -> Boolean

/**
 * The type of functions to be called when a UNIX fd watch source
 * triggers.
 *
 * - param `fd` the fd that triggered the event
 * - param `condition` the IO conditions reported on @fd
 * - return false if the source should be removed
 */
public typealias UnixFdSourceFunc = (fd: gint, condition: IoCondition) -> Boolean

/**
 * Declares a type of function which takes no arguments
 * and has no return value. It is used to specify the type
 * function passed to g_atexit().
 */
public typealias VoidFunc = () -> Unit

/**
 * Integer representing a day of the month; between 1 and 31.
 *
 * The %G_DATE_BAD_DAY value represents an invalid day of the month.
 */
public typealias DateDay = guint8

/**
 * Integer type representing a year.
 *
 * The %G_DATE_BAD_YEAR value is the invalid value. The year
 * must be 1 or higher; negative ([BCE](https://en.wikipedia.org/wiki/Common_Era))
 * years are not allowed.
 *
 * The year is represented with four digits.
 */
public typealias DateYear = guint16

/**
 * Opaque type. See g_main_context_pusher_new() for details.
 */
public typealias MainContextPusher = Unit

/**
 * Opaque type. See g_mutex_locker_new() for details.
 */
public typealias MutexLocker = Unit

/**
 * A type which is used to hold a process identification.
 *
 * On UNIX, processes are identified by a process id (an integer),
 * while Windows uses process handles (which are pointers).
 *
 * GPid is used in GLib only for descendant processes spawned with
 * the g_spawn functions.
 */
public typealias Pid = gint

/**
 * A GQuark is a non-zero integer which uniquely identifies a
 * particular string.
 *
 * A GQuark value of zero is associated to `NULL`.
 *
 * Given either the string or the `GQuark` identifier it is possible to
 * retrieve the other.
 *
 * Quarks are used for both
 * [datasets and keyed data lists](datalist-and-dataset.html).
 *
 * To create a new quark from a string, use [func@GLib.quark_from_string]
 * or [func@GLib.quark_from_static_string].
 *
 * To find the string corresponding to a given `GQuark`, use
 * [func@GLib.quark_to_string].
 *
 * To find the `GQuark` corresponding to a given string, use
 * [func@GLib.quark_try_string].
 *
 * Another use for the string pool maintained for the quark functions
 * is string interning, using [func@GLib.intern_string] or
 * [func@GLib.intern_static_string]. An interned string is a canonical
 * representation for a string. One important advantage of interned
 * strings is that they can be compared for equality by a simple
 * pointer comparison, rather than using `strcmp()`.
 */
public typealias Quark = guint

/**
 * Opaque type. See g_rw_lock_reader_locker_new() for details.
 */
public typealias RwLockReaderLocker = Unit

/**
 * Opaque type. See g_rw_lock_writer_locker_new() for details.
 */
public typealias RwLockWriterLocker = Unit

/**
 * Opaque type. See g_rec_mutex_locker_new() for details.
 */
public typealias RecMutexLocker = Unit

/**
 * A typedef for a reference-counted string. A pointer to a #GRefString can be
 * treated like a standard `char*` array by all code, but can additionally have
 * `g_ref_string_*()` methods called on it. `g_ref_string_*()` methods cannot be
 * called on `char*` arrays not allocated using g_ref_string_new().
 *
 * If using #GRefString with autocleanups, g_autoptr() must be used rather than
 * g_autofree(), so that the reference counting metadata is also freed.
 */
public typealias RefString = Char

/**
 * Simply a replacement for `time_t`. It has been deprecated
 * since it is not equivalent to `time_t` on 64-bit platforms
 * with a 64-bit `time_t`.
 *
 * Unrelated to #GTimer.
 *
 * Note that #GTime is defined to always be a 32-bit integer,
 * unlike `time_t` which may be 64-bit on some systems. Therefore,
 * #GTime will overflow in the year 2038, and you cannot use the
 * address of a #GTime variable as argument to the UNIX time()
 * function.
 *
 * Instead, do the following:
 *
 * |[<!-- language="C" -->
 * time_t ttime;
 * GTime gtime;
 *
 * time (&ttime);
 * gtime = (GTime)ttime;
 * ]|
 */
public typealias Time = gint

/**
 * A value representing an interval of time, in microseconds.
 */
public typealias TimeSpan = gint64
