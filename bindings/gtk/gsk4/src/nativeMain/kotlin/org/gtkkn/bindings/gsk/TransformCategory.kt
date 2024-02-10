// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import org.gtkkn.native.gsk.GskTransformCategory
import org.gtkkn.native.gsk.GskTransformCategory.GSK_TRANSFORM_CATEGORY_2D
import org.gtkkn.native.gsk.GskTransformCategory.GSK_TRANSFORM_CATEGORY_2D_AFFINE
import org.gtkkn.native.gsk.GskTransformCategory.GSK_TRANSFORM_CATEGORY_2D_TRANSLATE
import org.gtkkn.native.gsk.GskTransformCategory.GSK_TRANSFORM_CATEGORY_3D
import org.gtkkn.native.gsk.GskTransformCategory.GSK_TRANSFORM_CATEGORY_ANY
import org.gtkkn.native.gsk.GskTransformCategory.GSK_TRANSFORM_CATEGORY_IDENTITY
import org.gtkkn.native.gsk.GskTransformCategory.GSK_TRANSFORM_CATEGORY_UNKNOWN

/**
 * The categories of matrices relevant for GSK and GTK.
 *
 * Note that any category includes matrices of all later categories.
 * So if you want to for example check if a matrix is a 2D matrix,
 * `category >= GSK_TRANSFORM_CATEGORY_2D` is the way to do this.
 *
 * Also keep in mind that rounding errors may cause matrices to not
 * conform to their categories. Otherwise, matrix operations done via
 * multiplication will not worsen categories. So for the matrix
 * multiplication `C = A * B`, `category(C) = MIN (category(A), category(B))`.
 */
public enum class TransformCategory(
    public val nativeValue: GskTransformCategory,
) {
    /**
     * The category of the matrix has not been
     *   determined.
     */
    UNKNOWN(GSK_TRANSFORM_CATEGORY_UNKNOWN),

    /**
     * Analyzing the matrix concluded that it does
     *   not fit in any other category.
     */
    ANY(GSK_TRANSFORM_CATEGORY_ANY),

    /**
     * The matrix is a 3D matrix. This means that
     *   the w column (the last column) has the values (0, 0, 0, 1).
     */
    `3D`(GSK_TRANSFORM_CATEGORY_3D),

    /**
     * The matrix is a 2D matrix. This is equivalent
     *   to graphene_matrix_is_2d() returning true. In particular, this
     *   means that Cairo can deal with the matrix.
     */
    `2D`(GSK_TRANSFORM_CATEGORY_2D),

    /**
     * The matrix is a combination of 2D scale
     *   and 2D translation operations. In particular, this means that any
     *   rectangle can be transformed exactly using this matrix.
     */
    `2D_AFFINE`(GSK_TRANSFORM_CATEGORY_2D_AFFINE),

    /**
     * The matrix is a 2D translation.
     */
    `2D_TRANSLATE`(GSK_TRANSFORM_CATEGORY_2D_TRANSLATE),

    /**
     * The matrix is the identity matrix.
     */
    IDENTITY(GSK_TRANSFORM_CATEGORY_IDENTITY),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GskTransformCategory): TransformCategory =
            when (nativeValue) {
                GSK_TRANSFORM_CATEGORY_UNKNOWN -> UNKNOWN
                GSK_TRANSFORM_CATEGORY_ANY -> ANY
                GSK_TRANSFORM_CATEGORY_3D -> `3D`
                GSK_TRANSFORM_CATEGORY_2D -> `2D`
                GSK_TRANSFORM_CATEGORY_2D_AFFINE -> `2D_AFFINE`
                GSK_TRANSFORM_CATEGORY_2D_TRANSLATE -> `2D_TRANSLATE`
                GSK_TRANSFORM_CATEGORY_IDENTITY -> IDENTITY
                else -> error("invalid nativeValue")
            }
    }
}
