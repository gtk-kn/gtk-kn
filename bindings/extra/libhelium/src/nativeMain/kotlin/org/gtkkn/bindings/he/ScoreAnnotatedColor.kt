// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.he.HeScoreAnnotatedColor
import org.gtkkn.native.he.he_score_annotated_color_get_type
import org.gtkkn.native.he.he_score_annotated_color_new

public open class ScoreAnnotatedColor(
    pointer: CPointer<HeScoreAnnotatedColor>,
) : KGTyped {
    public val gPointer: CPointer<HeScoreAnnotatedColor>

    init {
        gPointer = pointer.reinterpret()
    }

    public constructor() : this(he_score_annotated_color_new()!!.reinterpret())

    public companion object : TypeCompanion<ScoreAnnotatedColor> {
        override val type: GeneratedClassKGType<ScoreAnnotatedColor> =
            GeneratedClassKGType(he_score_annotated_color_get_type()) {
                ScoreAnnotatedColor(it.reinterpret())
            }

        init {
            HeTypeProvider.register()
        }
    }
}
