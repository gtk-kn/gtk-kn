// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.pango.PangoAttrLanguage
import org.gtkkn.native.pango.pango_attr_language_new
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * The `PangoAttrLanguage` structure is used to represent attributes that
 * are languages.
 *
 * ## Skipped during bindings generation
 *
 * - field `attr`: Attribute
 */
public class AttrLanguage(pointer: CPointer<PangoAttrLanguage>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val pangoAttrLanguagePointer: CPointer<PangoAttrLanguage> = pointer

    /**
     * the `PangoLanguage` which is the value of the attribute
     */
    public var `value`: Language?
        get() = pangoAttrLanguagePointer.pointed.value?.run {
            Language(reinterpret())
        }

        @UnsafeFieldSetter
        set(`value`) {
            pangoAttrLanguagePointer.pointed.value = value?.pangoLanguagePointer
        }

    /**
     * Allocate a new AttrLanguage.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<PangoAttrLanguage>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to AttrLanguage and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<PangoAttrLanguage>, Cleaner>,
    ) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new AttrLanguage using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<PangoAttrLanguage>().ptr)

    /**
     * Allocate a new AttrLanguage.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param value the `PangoLanguage` which is the value of the attribute
     */
    public constructor(`value`: Language?) : this() {
        this.value = value
    }

    /**
     * Allocate a new AttrLanguage using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param value the `PangoLanguage` which is the value of the attribute
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(`value`: Language?, scope: AutofreeScope) : this(scope) {
        this.value = value
    }

    override fun toString(): String = "AttrLanguage(value=$value)"

    public companion object {
        /**
         * Create a new language tag attribute.
         *
         * @param language language tag
         * @return the newly allocated
         *   `PangoAttribute`, which should be freed with
         *   [method@Pango.Attribute.destroy]
         */
        public fun new(language: Language): Attribute =
            pango_attr_language_new(language.pangoLanguagePointer.reinterpret())!!.run {
                Attribute(reinterpret())
            }
    }
}
