// This is a generated file. Do not modify.
package org.gtkkn.bindings.harfbuzz

import org.gtkkn.native.harfbuzz.hb_memory_mode_t
import org.gtkkn.native.harfbuzz.hb_memory_mode_t.HB_MEMORY_MODE_DUPLICATE
import org.gtkkn.native.harfbuzz.hb_memory_mode_t.HB_MEMORY_MODE_READONLY
import org.gtkkn.native.harfbuzz.hb_memory_mode_t.HB_MEMORY_MODE_READONLY_MAY_MAKE_WRITABLE
import org.gtkkn.native.harfbuzz.hb_memory_mode_t.HB_MEMORY_MODE_WRITABLE

/**
 * @HB_MEMORY_MODE_DUPLICATE
 * @HB_MEMORY_MODE_READONLY
 * @HB_MEMORY_MODE_WRITABLE
 * @HB_MEMORY_MODE_READONLY_MAY_MAKE_WRITABLE
 * Data type holding the memory modes available to
 * client programs.
 *
 * Regarding these various memory-modes:
 *
 * - In no case shall the HarfBuzz client modify memory
 *   that is passed to HarfBuzz in a blob.  If there is
 *   any such possibility, @HB_MEMORY_MODE_DUPLICATE should be used
 *   such that HarfBuzz makes a copy immediately,
 *
 * - Use @HB_MEMORY_MODE_READONLY otherwise, unless you really really
 *   really know what you are doing,
 *
 * - @HB_MEMORY_MODE_WRITABLE is appropriate if you really made a
 *   copy of data solely for the purpose of passing to
 *   HarfBuzz and doing that just once (no reuse!),
 *
 * - If the font is mmap()ed, it's okay to use
 *   @HB_MEMORY_READONLY_MAY_MAKE_WRITABLE, however, using that mode
 *   correctly is very tricky.  Use @HB_MEMORY_MODE_READONLY instead.
 */
public enum class MemoryMode(
    public val nativeValue: hb_memory_mode_t,
) {
    DUPLICATE(HB_MEMORY_MODE_DUPLICATE),
    READONLY(HB_MEMORY_MODE_READONLY),
    WRITABLE(HB_MEMORY_MODE_WRITABLE),
    READONLY_MAY_MAKE_WRITABLE(HB_MEMORY_MODE_READONLY_MAY_MAKE_WRITABLE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: hb_memory_mode_t): MemoryMode =
            when (nativeValue) {
                HB_MEMORY_MODE_DUPLICATE -> DUPLICATE
                HB_MEMORY_MODE_READONLY -> READONLY
                HB_MEMORY_MODE_WRITABLE -> WRITABLE
                HB_MEMORY_MODE_READONLY_MAY_MAKE_WRITABLE -> READONLY_MAY_MAKE_WRITABLE
                else -> error("invalid nativeValue")
            }
    }
}
