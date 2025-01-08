// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import org.gtkkn.bindings.pango.annotations.PangoVersion1_20
import org.gtkkn.bindings.pango.annotations.PangoVersion1_50
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.pango.PangoAttribute
import org.gtkkn.native.pango.pango_attribute_as_color
import org.gtkkn.native.pango.pango_attribute_as_float
import org.gtkkn.native.pango.pango_attribute_as_font_desc
import org.gtkkn.native.pango.pango_attribute_as_font_features
import org.gtkkn.native.pango.pango_attribute_as_int
import org.gtkkn.native.pango.pango_attribute_as_language
import org.gtkkn.native.pango.pango_attribute_as_shape
import org.gtkkn.native.pango.pango_attribute_as_size
import org.gtkkn.native.pango.pango_attribute_as_string
import org.gtkkn.native.pango.pango_attribute_copy
import org.gtkkn.native.pango.pango_attribute_destroy
import org.gtkkn.native.pango.pango_attribute_equal
import org.gtkkn.native.pango.pango_attribute_get_type
import org.gtkkn.native.pango.pango_attribute_init
import kotlin.Boolean
import kotlin.Pair
import kotlin.String
import kotlin.Unit
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * The `PangoAttribute` structure represents the common portions of all
 * attributes.
 *
 * Particular types of attributes include this structure as their initial
 * portion. The common portion of the attribute holds the range to which
 * the value in the type-specific part of the attribute applies and should
 * be initialized using [method@Pango.Attribute.init]. By default, an attribute
 * will have an all-inclusive range of [0,%G_MAXUINT].
 */
public class Attribute(pointer: CPointer<PangoAttribute>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val gPointer: CPointer<PangoAttribute> = pointer

    /**
     * the class structure holding information about the type of the attribute
     */
    public var klass: AttrClass?
        get() = gPointer.pointed.klass?.run {
            AttrClass(this)
        }

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.klass = value?.gPointer
        }

    /**
     * the start index of the range (in bytes).
     */
    public var startIndex: guint
        get() = gPointer.pointed.start_index

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.start_index = value
        }

    /**
     * end index of the range (in bytes). The character at this index
     *   is not included in the range.
     */
    public var endIndex: guint
        get() = gPointer.pointed.end_index

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.end_index = value
        }

    /**
     * Allocate a new Attribute.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<PangoAttribute>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to Attribute and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<PangoAttribute>, Cleaner>,
    ) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new Attribute using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<PangoAttribute>().ptr)

    /**
     * Allocate a new Attribute.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param klass the class structure holding information about the type of the attribute
     * @param startIndex the start index of the range (in bytes).
     * @param endIndex end index of the range (in bytes). The character at this index
     *   is not included in the range.
     */
    public constructor(
        klass: AttrClass?,
        startIndex: guint,
        endIndex: guint,
    ) : this() {
        this.klass = klass
        this.startIndex = startIndex
        this.endIndex = endIndex
    }

    /**
     * Allocate a new Attribute using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param klass the class structure holding information about the type of the attribute
     * @param startIndex the start index of the range (in bytes).
     * @param endIndex end index of the range (in bytes). The character at this index
     *   is not included in the range.
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        klass: AttrClass?,
        startIndex: guint,
        endIndex: guint,
        scope: AutofreeScope,
    ) : this(scope) {
        this.klass = klass
        this.startIndex = startIndex
        this.endIndex = endIndex
    }

    /**
     * Returns the attribute cast to `PangoAttrColor`.
     *
     * This is mainly useful for language bindings.
     *
     * @return The attribute as `PangoAttrColor`,
     *   or null if it's not a color attribute
     * @since 1.50
     */
    @PangoVersion1_50
    public fun asColor(): AttrColor? = pango_attribute_as_color(gPointer)?.run {
        AttrColor(this)
    }

    /**
     * Returns the attribute cast to `PangoAttrFloat`.
     *
     * This is mainly useful for language bindings.
     *
     * @return The attribute as `PangoAttrFloat`,
     *   or null if it's not a floating point attribute
     * @since 1.50
     */
    @PangoVersion1_50
    public fun asFloat(): AttrFloat? = pango_attribute_as_float(gPointer)?.run {
        AttrFloat(this)
    }

    /**
     * Returns the attribute cast to `PangoAttrFontDesc`.
     *
     * This is mainly useful for language bindings.
     *
     * @return The attribute as `PangoAttrFontDesc`,
     *   or null if it's not a font description attribute
     * @since 1.50
     */
    @PangoVersion1_50
    public fun asFontDesc(): AttrFontDesc? = pango_attribute_as_font_desc(gPointer)?.run {
        AttrFontDesc(this)
    }

    /**
     * Returns the attribute cast to `PangoAttrFontFeatures`.
     *
     * This is mainly useful for language bindings.
     *
     * @return The attribute as `PangoAttrFontFeatures`,
     *   or null if it's not a font features attribute
     * @since 1.50
     */
    @PangoVersion1_50
    public fun asFontFeatures(): AttrFontFeatures? = pango_attribute_as_font_features(gPointer)?.run {
        AttrFontFeatures(this)
    }

    /**
     * Returns the attribute cast to `PangoAttrInt`.
     *
     * This is mainly useful for language bindings.
     *
     * @return The attribute as `PangoAttrInt`,
     *   or null if it's not an integer attribute
     * @since 1.50
     */
    @PangoVersion1_50
    public fun asInt(): AttrInt? = pango_attribute_as_int(gPointer)?.run {
        AttrInt(this)
    }

    /**
     * Returns the attribute cast to `PangoAttrLanguage`.
     *
     * This is mainly useful for language bindings.
     *
     * @return The attribute as `PangoAttrLanguage`,
     *   or null if it's not a language attribute
     * @since 1.50
     */
    @PangoVersion1_50
    public fun asLanguage(): AttrLanguage? = pango_attribute_as_language(gPointer)?.run {
        AttrLanguage(this)
    }

    /**
     * Returns the attribute cast to `PangoAttrShape`.
     *
     * This is mainly useful for language bindings.
     *
     * @return The attribute as `PangoAttrShape`,
     *   or null if it's not a shape attribute
     * @since 1.50
     */
    @PangoVersion1_50
    public fun asShape(): AttrShape? = pango_attribute_as_shape(gPointer)?.run {
        AttrShape(this)
    }

    /**
     * Returns the attribute cast to `PangoAttrSize`.
     *
     * This is mainly useful for language bindings.
     *
     * @return The attribute as `PangoAttrSize`,
     *   or NULL if it's not a size attribute
     * @since 1.50
     */
    @PangoVersion1_50
    public fun asSize(): AttrSize? = pango_attribute_as_size(gPointer)?.run {
        AttrSize(this)
    }

    /**
     * Returns the attribute cast to `PangoAttrString`.
     *
     * This is mainly useful for language bindings.
     *
     * @return The attribute as `PangoAttrString`,
     *   or null if it's not a string attribute
     * @since 1.50
     */
    @PangoVersion1_50
    public fun asString(): AttrString? = pango_attribute_as_string(gPointer)?.run {
        AttrString(this)
    }

    /**
     * Make a copy of an attribute.
     *
     * @return the newly allocated
     *   `PangoAttribute`, which should be freed with
     *   [method@Pango.Attribute.destroy].
     */
    public fun copy(): Attribute = pango_attribute_copy(gPointer)!!.run {
        Attribute(this)
    }

    /**
     * Destroy a `PangoAttribute` and free all associated memory.
     */
    public fun destroy(): Unit = pango_attribute_destroy(gPointer)

    /**
     * Compare two attributes for equality.
     *
     * This compares only the actual value of the two
     * attributes and not the ranges that the attributes
     * apply to.
     *
     * @param attr2 another `PangoAttribute`
     * @return true if the two attributes have the same value
     */
    public fun equal(attr2: Attribute): Boolean = pango_attribute_equal(gPointer, attr2.gPointer).asBoolean()

    /**
     * Initializes @attr's klass to @klass, it's start_index to
     * %PANGO_ATTR_INDEX_FROM_TEXT_BEGINNING and end_index to
     * %PANGO_ATTR_INDEX_TO_TEXT_END such that the attribute applies
     * to the entire text by default.
     *
     * @param klass a `PangoAttrClass`
     * @since 1.20
     */
    @PangoVersion1_20
    public fun `init`(klass: AttrClass): Unit = pango_attribute_init(gPointer, klass.gPointer)

    override fun toString(): String = "Attribute(klass=$klass, startIndex=$startIndex, endIndex=$endIndex)"

    public companion object {
        /**
         * Get the GType of Attribute
         *
         * @return the GType
         */
        public fun getType(): GType = pango_attribute_get_type()
    }
}
