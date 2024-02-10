// This is a generated file. Do not modify.
package org.gtkkn.bindings.graphene

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.graphene.graphene_simd4x4f_t

/**
 * ## Skipped during bindings generation
 *
 * - field `x`: Record field x is private
 * - field `y`: Record field y is private
 * - field `z`: Record field z is private
 * - field `w`: Record field w is private
 */
public class Simd4X4F(
    pointer: CPointer<graphene_simd4x4f_t>,
) : Record {
    public val grapheneSimd4X4FPointer: CPointer<graphene_simd4x4f_t> = pointer

    public companion object : RecordCompanion<Simd4X4F, graphene_simd4x4f_t> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Simd4X4F = Simd4X4F(pointer.reinterpret())
    }
}
