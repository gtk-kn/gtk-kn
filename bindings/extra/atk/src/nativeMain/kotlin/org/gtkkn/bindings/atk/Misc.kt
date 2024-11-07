// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.atk.annotations.AtkVersion1_13
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.atk.AtkMisc
import org.gtkkn.native.atk.atk_misc_get_instance
import org.gtkkn.native.atk.atk_misc_get_type
import org.gtkkn.native.atk.atk_misc_threads_enter
import org.gtkkn.native.atk.atk_misc_threads_leave
import kotlin.Unit

/**
 * A set of ATK utility functions for thread locking
 *
 * A set of utility functions for thread locking. This interface and
 * all his related methods are deprecated since 2.12.
 */
public open class Misc(
    pointer: CPointer<AtkMisc>,
) : Object(pointer.reinterpret()),
    KGTyped {
    public val atkMiscPointer: CPointer<AtkMisc>
        get() = gPointer.reinterpret()

    /**
     * Take the thread mutex for the GUI toolkit,
     * if one exists.
     * (This method is implemented by the toolkit ATK implementation layer;
     *  for instance, for GTK+, GAIL implements this via GDK_THREADS_ENTER).
     *
     * @since 1.13
     */
    @AtkVersion1_13
    public open fun threadsEnter(): Unit = atk_misc_threads_enter(atkMiscPointer.reinterpret())

    /**
     * Release the thread mutex for the GUI toolkit,
     * if one exists. This method, and atk_misc_threads_enter,
     * are needed in some situations by threaded application code which
     * services ATK requests, since fulfilling ATK requests often
     * requires calling into the GUI toolkit.  If a long-running or
     * potentially blocking call takes place inside such a block, it should
     * be bracketed by atk_misc_threads_leave/atk_misc_threads_enter calls.
     * (This method is implemented by the toolkit ATK implementation layer;
     *  for instance, for GTK+, GAIL implements this via GDK_THREADS_LEAVE).
     *
     * @since 1.13
     */
    @AtkVersion1_13
    public open fun threadsLeave(): Unit = atk_misc_threads_leave(atkMiscPointer.reinterpret())

    public companion object : TypeCompanion<Misc> {
        override val type: GeneratedClassKGType<Misc> =
            GeneratedClassKGType(atk_misc_get_type()) { Misc(it.reinterpret()) }

        init {
            AtkTypeProvider.register()
        }

        /**
         * Obtain the singleton instance of AtkMisc for this application.
         *
         * @return The singleton instance of AtkMisc for this application.
         * @since 1.13
         */
        @AtkVersion1_13
        public fun getInstance(): Misc =
            atk_misc_get_instance()!!.run {
                Misc(reinterpret())
            }
    }
}
