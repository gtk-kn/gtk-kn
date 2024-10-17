// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.he.HeScore
import org.gtkkn.native.he.he_score_get_type
import org.gtkkn.native.he.he_score_new

/**
 * ## Skipped during bindings generation
 *
 * - method `score`: Array parameter of type gint is not supported
 */
public open class Score(
    pointer: CPointer<HeScore>,
) : KGTyped {
    public val gPointer: CPointer<HeScore>

    init {
        gPointer = pointer.reinterpret()
    }

    public constructor() : this(he_score_new()!!.reinterpret())

    public companion object : TypeCompanion<Score> {
        override val type: GeneratedClassKGType<Score> =
            GeneratedClassKGType(he_score_get_type()) {
                Score(it.reinterpret())
            }

        init {
            HeTypeProvider.register()
        }
    }
}
