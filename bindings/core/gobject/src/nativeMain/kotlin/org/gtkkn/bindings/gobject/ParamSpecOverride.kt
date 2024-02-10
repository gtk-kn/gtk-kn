// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.native.gobject.GParamSpecOverride

/**
 * A #GParamSpec derived structure that redirects operations to
 * other types of #GParamSpec.
 *
 * All operations other than getting or setting the value are redirected,
 * including accessing the nick and blurb, validating a value, and so
 * forth.
 *
 * See g_param_spec_get_redirect_target() for retrieving the overridden
 * property. #GParamSpecOverride is used in implementing
 * g_object_class_override_property(), and will not be directly useful
 * unless you are implementing a new base type similar to GObject.
 * @since 2.4
 */
public open class ParamSpecOverride(
    pointer: CPointer<GParamSpecOverride>,
) : ParamSpec(pointer.reinterpret()) {
    public val gobjectParamSpecOverridePointer: CPointer<GParamSpecOverride>
        get() = gPointer.reinterpret()
}
