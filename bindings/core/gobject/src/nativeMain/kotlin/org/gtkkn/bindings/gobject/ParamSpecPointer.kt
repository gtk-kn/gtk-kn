// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.native.gobject.GParamSpecPointer

/**
 * A #GParamSpec derived structure that contains the meta data for pointer properties.
 */
public open class ParamSpecPointer(public val gobjectParamSpecPointerPointer: CPointer<GParamSpecPointer>) :
    ParamSpec(gobjectParamSpecPointerPointer.reinterpret())
