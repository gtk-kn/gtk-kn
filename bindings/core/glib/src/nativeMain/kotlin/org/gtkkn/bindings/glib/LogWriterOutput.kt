// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GLogWriterOutput
import org.gtkkn.native.glib.GLogWriterOutput.G_LOG_WRITER_HANDLED
import org.gtkkn.native.glib.GLogWriterOutput.G_LOG_WRITER_UNHANDLED

/**
 * Return values from #GLogWriterFuncs to indicate whether the given log entry
 * was successfully handled by the writer, or whether there was an error in
 * handling it (and hence a fallback writer should be used).
 *
 * If a #GLogWriterFunc ignores a log entry, it should return
 * %G_LOG_WRITER_HANDLED.
 * @since 2.50
 */
public enum class LogWriterOutput(
    public val nativeValue: GLogWriterOutput,
) {
    /**
     * Log writer has handled the log entry.
     */
    HANDLED(G_LOG_WRITER_HANDLED),

    /**
     * Log writer could not handle the log entry.
     */
    UNHANDLED(G_LOG_WRITER_UNHANDLED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GLogWriterOutput): LogWriterOutput =
            when (nativeValue) {
                G_LOG_WRITER_HANDLED -> HANDLED
                G_LOG_WRITER_UNHANDLED -> UNHANDLED
                else -> error("invalid nativeValue")
            }
    }
}
