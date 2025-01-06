// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.ext.toKStringList
import org.gtkkn.native.glib.g_free
import org.gtkkn.native.glib.g_strdup
import org.gtkkn.native.gtk.GtkRecentData
import kotlin.Boolean
import kotlin.Pair
import kotlin.String
import kotlin.collections.List
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * Meta-data to be passed to gtk_recent_manager_add_full() when
 * registering a recently used resource.
 */
public class RecentData(pointer: CPointer<GtkRecentData>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val gPointer: CPointer<GtkRecentData> = pointer

    /**
     * a UTF-8 encoded string, containing the name of the recently
     *   used resource to be displayed, or null;
     */
    public var displayName: String?
        get() = gPointer.pointed.display_name?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.display_name?.let { g_free(it) }
            gPointer.pointed.display_name = value?.let { g_strdup(it) }
        }

    /**
     * a UTF-8 encoded string, containing a short description of
     *   the resource, or null;
     */
    public var description: String?
        get() = gPointer.pointed.description?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.description?.let { g_free(it) }
            gPointer.pointed.description = value?.let { g_strdup(it) }
        }

    /**
     * the MIME type of the resource;
     */
    public var mimeType: String?
        get() = gPointer.pointed.mime_type?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.mime_type?.let { g_free(it) }
            gPointer.pointed.mime_type = value?.let { g_strdup(it) }
        }

    /**
     * the name of the application that is registering this recently
     *   used resource;
     */
    public var appName: String?
        get() = gPointer.pointed.app_name?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.app_name?.let { g_free(it) }
            gPointer.pointed.app_name = value?.let { g_strdup(it) }
        }

    /**
     * command line used to launch this resource; may contain the
     *   “\%f” and “\%u” escape characters which will be expanded
     *   to the resource file path and URI respectively when the command line
     *   is retrieved;
     */
    public var appExec: String?
        get() = gPointer.pointed.app_exec?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.app_exec?.let { g_free(it) }
            gPointer.pointed.app_exec = value?.let { g_strdup(it) }
        }

    /**
     * a vector of strings containing
     *   groups names;
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val groups: List<String>?
        get() = gPointer.pointed.groups?.toKStringList()

    /**
     * whether this resource should be displayed only by the
     *   applications that have registered it or not.
     */
    public var isPrivate: Boolean
        get() = gPointer.pointed.is_private.asBoolean()

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.is_private = value.asGBoolean()
        }

    /**
     * Allocate a new RecentData.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GtkRecentData>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to RecentData and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<GtkRecentData>, Cleaner>,
    ) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new RecentData using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GtkRecentData>().ptr)

    /**
     * Allocate a new RecentData.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param displayName a UTF-8 encoded string, containing the name of the recently
     *   used resource to be displayed, or null;
     * @param description a UTF-8 encoded string, containing a short description of
     *   the resource, or null;
     * @param mimeType the MIME type of the resource;
     * @param appName the name of the application that is registering this recently
     *   used resource;
     * @param appExec command line used to launch this resource; may contain the
     *   “\%f” and “\%u” escape characters which will be expanded
     *   to the resource file path and URI respectively when the command line
     *   is retrieved;
     * @param isPrivate whether this resource should be displayed only by the
     *   applications that have registered it or not.
     */
    public constructor(
        displayName: String?,
        description: String?,
        mimeType: String?,
        appName: String?,
        appExec: String?,
        isPrivate: Boolean,
    ) : this() {
        this.displayName = displayName
        this.description = description
        this.mimeType = mimeType
        this.appName = appName
        this.appExec = appExec
        this.isPrivate = isPrivate
    }

    /**
     * Allocate a new RecentData using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param displayName a UTF-8 encoded string, containing the name of the recently
     *   used resource to be displayed, or null;
     * @param description a UTF-8 encoded string, containing a short description of
     *   the resource, or null;
     * @param mimeType the MIME type of the resource;
     * @param appName the name of the application that is registering this recently
     *   used resource;
     * @param appExec command line used to launch this resource; may contain the
     *   “\%f” and “\%u” escape characters which will be expanded
     *   to the resource file path and URI respectively when the command line
     *   is retrieved;
     * @param isPrivate whether this resource should be displayed only by the
     *   applications that have registered it or not.
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        displayName: String?,
        description: String?,
        mimeType: String?,
        appName: String?,
        appExec: String?,
        isPrivate: Boolean,
        scope: AutofreeScope,
    ) : this(scope) {
        this.displayName = displayName
        this.description = description
        this.mimeType = mimeType
        this.appName = appName
        this.appExec = appExec
        this.isPrivate = isPrivate
    }

    override fun toString(): String =
        "RecentData(displayName=$displayName, description=$description, mimeType=$mimeType, appName=$appName, appExec=$appExec, groups=$groups, isPrivate=$isPrivate)"
}
