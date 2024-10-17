// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.Builder
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.he.HeWelcomeScreen
import org.gtkkn.native.he.he_welcome_screen_add_child
import org.gtkkn.native.he.he_welcome_screen_get_appname
import org.gtkkn.native.he.he_welcome_screen_get_description
import org.gtkkn.native.he.he_welcome_screen_get_type
import org.gtkkn.native.he.he_welcome_screen_new
import org.gtkkn.native.he.he_welcome_screen_set_appname
import org.gtkkn.native.he.he_welcome_screen_set_description
import kotlin.String
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - method `appname`: Property has no getter nor setter
 * - method `description`: Property has no getter nor setter
 */
public open class WelcomeScreen(
    pointer: CPointer<HeWelcomeScreen>,
) : Bin(pointer.reinterpret()), KGTyped {
    public val heWelcomeScreenPointer: CPointer<HeWelcomeScreen>
        get() = gPointer.reinterpret()

    /**
     *
     *
     * @param appname
     * @param description
     */
    public constructor(appname: String, description: String) : this(
        he_welcome_screen_new(
            appname,
            description
        )!!.reinterpret()
    )

    public open fun getAppname(): String =
        he_welcome_screen_get_appname(heWelcomeScreenPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setAppname(`value`: String): Unit =
        he_welcome_screen_set_appname(heWelcomeScreenPointer.reinterpret(), `value`)

    public open fun getDescription(): String =
        he_welcome_screen_get_description(heWelcomeScreenPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setDescription(`value`: String): Unit =
        he_welcome_screen_set_description(heWelcomeScreenPointer.reinterpret(), `value`)

    /**
     *
     *
     * @param builder
     * @param child
     * @param type
     */
    open override fun addChild(
        builder: Builder,
        child: Object,
        type: String?,
    ): Unit =
        he_welcome_screen_add_child(
            heWelcomeScreenPointer.reinterpret(),
            builder.gtkBuilderPointer.reinterpret(),
            child.gPointer.reinterpret(),
            type
        )

    public companion object : TypeCompanion<WelcomeScreen> {
        override val type: GeneratedClassKGType<WelcomeScreen> =
            GeneratedClassKGType(he_welcome_screen_get_type()) {
                WelcomeScreen(it.reinterpret())
            }

        init {
            HeTypeProvider.register()
        }
    }
}
