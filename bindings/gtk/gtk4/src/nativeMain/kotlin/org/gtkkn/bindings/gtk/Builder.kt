// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.SList
import org.gtkkn.bindings.gobject.Closure
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gobject.ParamSpec
import org.gtkkn.bindings.gobject.Value
import org.gtkkn.bindings.gtk.Gtk.resolveException
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.toCStringList
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkBuilder
import org.gtkkn.native.gtk.gtk_builder_add_from_file
import org.gtkkn.native.gtk.gtk_builder_add_from_resource
import org.gtkkn.native.gtk.gtk_builder_add_from_string
import org.gtkkn.native.gtk.gtk_builder_add_objects_from_file
import org.gtkkn.native.gtk.gtk_builder_add_objects_from_resource
import org.gtkkn.native.gtk.gtk_builder_add_objects_from_string
import org.gtkkn.native.gtk.gtk_builder_create_closure
import org.gtkkn.native.gtk.gtk_builder_expose_object
import org.gtkkn.native.gtk.gtk_builder_extend_with_template
import org.gtkkn.native.gtk.gtk_builder_get_current_object
import org.gtkkn.native.gtk.gtk_builder_get_object
import org.gtkkn.native.gtk.gtk_builder_get_objects
import org.gtkkn.native.gtk.gtk_builder_get_scope
import org.gtkkn.native.gtk.gtk_builder_get_translation_domain
import org.gtkkn.native.gtk.gtk_builder_get_type
import org.gtkkn.native.gtk.gtk_builder_get_type_from_name
import org.gtkkn.native.gtk.gtk_builder_new
import org.gtkkn.native.gtk.gtk_builder_new_from_file
import org.gtkkn.native.gtk.gtk_builder_new_from_resource
import org.gtkkn.native.gtk.gtk_builder_new_from_string
import org.gtkkn.native.gtk.gtk_builder_set_current_object
import org.gtkkn.native.gtk.gtk_builder_set_scope
import org.gtkkn.native.gtk.gtk_builder_set_translation_domain
import org.gtkkn.native.gtk.gtk_builder_value_from_string
import org.gtkkn.native.gtk.gtk_builder_value_from_string_type
import kotlin.Boolean
import kotlin.Long
import kotlin.Result
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * A `GtkBuilder` reads XML descriptions of a user interface and
 * instantiates the described objects.
 *
 * To create a `GtkBuilder` from a user interface description, call
 * [ctor@Gtk.Builder.new_from_file], [ctor@Gtk.Builder.new_from_resource]
 * or [ctor@Gtk.Builder.new_from_string].
 *
 * In the (unusual) case that you want to add user interface
 * descriptions from multiple sources to the same `GtkBuilder` you can
 * call [ctor@Gtk.Builder.new] to get an empty builder and populate it by
 * (multiple) calls to [method@Gtk.Builder.add_from_file],
 * [method@Gtk.Builder.add_from_resource] or
 * [method@Gtk.Builder.add_from_string].
 *
 * A `GtkBuilder` holds a reference to all objects that it has constructed
 * and drops these references when it is finalized. This finalization can
 * cause the destruction of non-widget objects or widgets which are not
 * contained in a toplevel window. For toplevel windows constructed by a
 * builder, it is the responsibility of the user to call
 * [method@Gtk.Window.destroy] to get rid of them and all the widgets
 * they contain.
 *
 * The functions [method@Gtk.Builder.get_object] and
 * [method@Gtk.Builder.get_objects] can be used to access the widgets in
 * the interface by the names assigned to them inside the UI description.
 * Toplevel windows returned by these functions will stay around until the
 * user explicitly destroys them with [method@Gtk.Window.destroy]. Other
 * widgets will either be part of a larger hierarchy constructed by the
 * builder (in which case you should not have to worry about their lifecycle),
 * or without a parent, in which case they have to be added to some container
 * to make use of them. Non-widget objects need to be reffed with
 * g_object_ref() to keep them beyond the lifespan of the builder.
 *
 * ## GtkBuilder UI Definitions
 *
 * `GtkBuilder` parses textual descriptions of user interfaces which are
 * specified in XML format. We refer to these descriptions as “GtkBuilder
 * UI definitions” or just “UI definitions” if the context is clear.
 *
 * ### Structure of UI definitions
 *
 * UI definition files are always encoded in UTF-8.
 *
 * The toplevel element is `<interface>`. It optionally takes a “domain”
 * attribute, which will make the builder look for translated strings
 * using `dgettext()` in the domain specified. This can also be done by
 * calling [method@Gtk.Builder.set_translation_domain] on the builder.
 * For example:
 *
 * ```xml
 * <?xml version="1.0" encoding="UTF-8">
 * <interface domain="your-app">
 *   ...
 * </interface>
 * ```
 *
 * ### Requirements
 *
 * The target toolkit version(s) are described by `<requires>` elements,
 * the “lib” attribute specifies the widget library in question (currently
 * the only supported value is “gtk”) and the “version” attribute specifies
 * the target version in the form “`<major>`.`<minor>`”. `GtkBuilder` will
 * error out if the version requirements are not met. For example:
 *
 * ```xml
 * <?xml version="1.0" encoding="UTF-8">
 * <interface domain="your-app">
 *   <requires lib="gtk" version="4.0" />
 * </interface>
 * ```
 *
 * ### Objects
 *
 * Objects are defined as children of the `<interface>` element.
 *
 * Objects are described by `<object>` elements, which can contain
 * `<property>` elements to set properties, `<signal>` elements which
 * connect signals to handlers, and `<child>` elements, which describe
 * child objects.
 *
 * Typically, the specific kind of object represented by an `<object>`
 * element is specified by the “class” attribute. If the type has not
 * been loaded yet, GTK tries to find the `get_type()` function from the
 * class name by applying heuristics. This works in most cases, but if
 * necessary, it is possible to specify the name of the `get_type()`
 * function explicitly with the "type-func" attribute. If your UI definition
 * is referencing internal types, you should make sure to call
 * `g_type_ensure()` for each object type before parsing the UI definition.
 *
 * Objects may be given a name with the “id” attribute, which allows the
 * application to retrieve them from the builder with
 * [method@Gtk.Builder.get_object]. An id is also necessary to use the
 * object as property value in other parts of the UI definition. GTK
 * reserves ids starting and ending with `___` (three consecutive
 * underscores) for its own purposes.
 *
 * ### Properties
 *
 * Setting properties of objects is pretty straightforward with the
 * `<property>` element: the “name” attribute specifies the name of the
 * property, and the content of the element specifies the value:
 *
 * ```xml
 * <object class="GtkButton">
 *   <property name="label">Hello, world</property>
 * </object>
 * ```
 *
 * If the “translatable” attribute is set to a true value, GTK uses
 * `gettext()` (or `dgettext()` if the builder has a translation domain set)
 * to find a translation for the value. This happens before the value
 * is parsed, so it can be used for properties of any type, but it is
 * probably most useful for string properties. It is also possible to
 * specify a context to disambiguate short strings, and comments which
 * may help the translators:
 *
 * ```xml
 * <object class="GtkButton">
 *   <property name="label" translatable="yes" context="button">Hello, world</property>
 * </object>
 * ```
 *
 * `GtkBuilder` can parse textual representations for the most common
 * property types:
 *
 * - characters
 * - strings
 * - integers
 * - floating-point numbers
 * - booleans (strings like “TRUE”, “t”, “yes”, “y”, “1” are interpreted
 *   as true values, strings like “FALSE”, “f”, “no”, “n”, “0” are interpreted
 *   as false values)
 * - enumeration types (can be specified by their full C identifier their short
 *   name used when registering the enumeration type, or their integer value)
 * - flag types (can be specified by their C identifier, short name, integer
 *   value, and optionally combined with “|” for bitwise OR, e.g.
 *   “GTK_INPUT_HINT_EMOJI|GTK_INPUT_HINT_LOWERCASE”, or “emoji|lowercase”)
 * - colors (in a format understood by [method@Gdk.RGBA.parse])
 * - `GVariant` (can be specified in the format understood by
 *    [func@GLib.Variant.parse])
 * - pixbufs (can be specified as a filename of an image file to load)
 *
 * Objects can be referred to by their name and by default refer to
 * objects declared in the local XML fragment and objects exposed via
 * [method@Gtk.Builder.expose_object]. In general, `GtkBuilder` allows
 * forward references to objects declared in the local XML; an object
 * doesn’t have to be constructed before it can be referred to. The
 * exception to this rule is that an object has to be constructed before
 * it can be used as the value of a construct-only property.
 *
 * ### Child objects
 *
 * Many widgets have properties for child widgets, such as
 * [property@Gtk.Expander:child]. In this case, the preferred way to
 * specify the child widget in a ui file is to simply set the property:
 *
 * ```xml
 * <object class="GtkExpander">
 *   <property name="child">
 *     <object class="GtkLabel">
 *     ...
 *     </object>
 *   </property>
 * </object>
 * ```
 *
 * Generic containers that can contain an arbitrary number of children,
 * such as [class@Gtk.Box] instead use the `<child>` element. A `<child>`
 * element contains an `<object>` element which describes the child object.
 * Most often, child objects are widgets inside a container, but they can
 * also be, e.g., actions in an action group, or columns in a tree model.
 *
 * Any object type that implements the [iface@Gtk.Buildable] interface can
 * specify how children may be added to it. Since many objects and widgets that
 * are included with GTK already implement the `GtkBuildable` interface,
 * typically child objects can be added using the `<child>` element without
 * having to be concerned about the underlying implementation.
 *
 * See the [`GtkWidget` documentation](class.Widget.html#gtkwidget-as-gtkbuildable)
 * for many examples of using `GtkBuilder` with widgets, including setting
 * child objects using the `<child>` element.
 *
 * A noteworthy special case to the general rule that only objects implementing
 * `GtkBuildable` may specify how to handle the `<child>` element is that
 * `GtkBuilder` provides special support for adding objects to a
 * [class@Gio.ListStore] by using the `<child>` element. For instance:
 *
 * ```xml
 * <object class="GListStore">
 *   <property name="item-type">MyObject</property>
 *   <child>
 *     <object class="MyObject" />
 *   </child>
 *   ...
 * </object>
 * ```
 *
 * ### Property bindings
 *
 * It is also possible to bind a property value to another object's
 * property value using the attributes "bind-source" to specify the
 * source object of the binding, and optionally, "bind-property" and
 * "bind-flags" to specify the source property and source binding flags
 * respectively. Internally, `GtkBuilder` implements this using
 * [class@GObject.Binding] objects.
 *
 * For instance, in the example below the “label” property of the
 * `bottom_label` widget is bound to the “label” property of the
 * `top_button` widget:
 *
 * ```xml
 * <object class="GtkBox">
 *   <property name="orientation">vertical</property>
 *   <child>
 *     <object class="GtkButton" id="top_button">
 *       <property name="label">Hello, world</property>
 *     </object>
 *   </child>
 *   <child>
 *     <object class="GtkLabel" id="bottom_label">
 *       <property name="label"
 *                 bind-source="top_button"
 *                 bind-property="label"
 *                 bind-flags="sync-create" />
 *     </object>
 *   </child>
 * </object>
 * ```
 *
 * For more information, see the documentation of the
 * [method@GObject.Object.bind_property] method.
 *
 * Please note that another way to set up bindings between objects in .ui files
 * is to use the `GtkExpression` methodology. See the
 * [`GtkExpression` documentation](class.Expression.html#gtkexpression-in-ui-files)
 * for more information.
 *
 * ### Internal children
 *
 * Sometimes it is necessary to refer to widgets which have implicitly
 * been constructed by GTK as part of a composite widget, to set
 * properties on them or to add further children (e.g. the content area
 * of a `GtkDialog`). This can be achieved by setting the “internal-child”
 * property of the `<child>` element to a true value. Note that `GtkBuilder`
 * still requires an `<object>` element for the internal child, even if it
 * has already been constructed.
 *
 * ### Specialized children
 *
 * A number of widgets have different places where a child can be added
 * (e.g. tabs vs. page content in notebooks). This can be reflected in
 * a UI definition by specifying the “type” attribute on a `<child>`
 * The possible values for the “type” attribute are described in the
 * sections describing the widget-specific portions of UI definitions.
 *
 * ### Signal handlers and function pointers
 *
 * Signal handlers are set up with the `<signal>` element. The “name”
 * attribute specifies the name of the signal, and the “handler” attribute
 * specifies the function to connect to the signal.
 *
 * ```xml
 * <object class="GtkButton" id="hello_button">
 *   <signal name="clicked" handler="hello_button__clicked" />
 * </object>
 * ```
 *
 * The remaining attributes, “after”, “swapped” and “object”, have the
 * same meaning as the corresponding parameters of the
 * [func@GObject.signal_connect_object] or [func@GObject.signal_connect_data]
 * functions:
 *
 * - “after” matches the `G_CONNECT_AFTER` flag, and will ensure that the
 *   handler is called after the default class closure for the signal
 * - “swapped” matches the `G_CONNECT_SWAPPED` flag, and will swap the
 *   instance and closure arguments when invoking the signal handler
 * - “object” will bind the signal handler to the lifetime of the object
 *   referenced by the attribute
 *
 * By default "swapped" will be set to "yes" if not specified otherwise, in
 * the case where "object" is set, for convenience. A “last_modification_time”
 * attribute is also allowed, but it does not have a meaning to the builder.
 *
 * When compiling applications for Windows, you must declare signal callbacks
 * with the `G_MODULE_EXPORT` decorator, or they will not be put in the symbol
 * table:
 *
 * ```c
 * G_MODULE_EXPORT void
 * hello_button__clicked (GtkButton *button,
 *                        gpointer data)
 * {
 *   // ...
 * }
 * ```
 *
 * On Linux and Unix, this is not necessary; applications should instead
 * be compiled with the `-Wl,--export-dynamic` argument inside their compiler
 * flags, and linked against `gmodule-export-2.0`.
 *
 * ## Example UI Definition
 *
 * ```xml
 * <interface>
 *   <object class="GtkDialog" id="dialog1">
 *     <child internal-child="content_area">
 *       <object class="GtkBox">
 *         <child internal-child="action_area">
 *           <object class="GtkBox">
 *             <child>
 *               <object class="GtkButton" id="ok_button">
 *                 <property name="label" translatable="yes">_Ok</property>
 *                 <property name="use-underline">True</property>
 *                 <signal name="clicked" handler="ok_button_clicked"/>
 *               </object>
 *             </child>
 *           </object>
 *         </child>
 *       </object>
 *     </child>
 *   </object>
 * </interface>
 * ```
 *
 * ## Using GtkBuildable for extending UI definitions
 *
 * Objects can implement the [iface@Gtk.Buildable] interface to add custom
 * elements and attributes to the XML. Typically, any extension will be
 * documented in each type that implements the interface.
 *
 * ## Templates
 *
 * When describing a [class@Gtk.Widget], you can use the `<template>` tag to
 * describe a UI bound to a specific widget type. GTK will automatically load
 * the UI definition when instantiating the type, and bind children and
 * signal handlers to instance fields and function symbols.
 *
 * For more information, see the [`GtkWidget` documentation](class.Widget.html#building-composite-widgets-from-template-xml)
 * for details.
 *
 * ## Skipped during bindings generation
 *
 * - method `scope`: Property TypeInfo of getter and setter do not match
 */
public open class Builder(pointer: CPointer<GtkBuilder>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val gtkBuilderPointer: CPointer<GtkBuilder>
        get() = gPointer.reinterpret()

    /**
     * The object the builder is evaluating for.
     */
    public open var currentObject: Object?
        /**
         * Gets the current object set via gtk_builder_set_current_object().
         *
         * @return the current object
         */
        get() = gtk_builder_get_current_object(gtkBuilderPointer.reinterpret())?.run {
            Object(reinterpret())
        }

        /**
         * Sets the current object for the @builder.
         *
         * The current object can be thought of as the `this` object that the
         * builder is working for and will often be used as the default object
         * when an object is optional.
         *
         * [method@Gtk.Widget.init_template] for example will set the current
         * object to the widget the template is inited for. For functions like
         * [ctor@Gtk.Builder.new_from_resource], the current object will be null.
         *
         * @param currentObject the new current object
         */
        set(
            currentObject
        ) = gtk_builder_set_current_object(gtkBuilderPointer.reinterpret(), currentObject?.gPointer?.reinterpret())

    /**
     * The translation domain used when translating property values that
     * have been marked as translatable.
     *
     * If the translation domain is null, `GtkBuilder` uses gettext(),
     * otherwise g_dgettext().
     */
    public open var translationDomain: String?
        /**
         * Gets the translation domain of @builder.
         *
         * @return the translation domain
         */
        get() = gtk_builder_get_translation_domain(gtkBuilderPointer.reinterpret())?.toKString()

        /**
         * Sets the translation domain of @builder.
         *
         * @param domain the translation domain
         */
        set(domain) = gtk_builder_set_translation_domain(gtkBuilderPointer.reinterpret(), domain)

    /**
     * Creates a new empty builder object.
     *
     * This function is only useful if you intend to make multiple calls
     * to [method@Gtk.Builder.add_from_file], [method@Gtk.Builder.add_from_resource]
     * or [method@Gtk.Builder.add_from_string] in order to merge multiple UI
     * descriptions into a single builder.
     *
     * @return a new (empty) `GtkBuilder` object
     */
    public constructor() : this(gtk_builder_new()!!.reinterpret())

    /**
     * Parses the UI definition in the file @filename.
     *
     * If there is an error opening the file or parsing the description then
     * the program will be aborted. You should only ever attempt to parse
     * user interface descriptions that are shipped as part of your program.
     *
     * @param filename filename of user interface description file
     * @return a `GtkBuilder` containing the described interface
     */
    public constructor(filename: String) : this(gtk_builder_new_from_file(filename)!!.reinterpret())

    /**
     * Parses the UI definition in @string.
     *
     * If @string is null-terminated, then @length should be -1.
     * If @length is not -1, then it is the length of @string.
     *
     * If there is an error parsing @string then the program will be
     * aborted. You should not attempt to parse user interface description
     * from untrusted sources.
     *
     * @param string a user interface (XML) description
     * @param length the length of @string, or -1
     * @return a `GtkBuilder` containing the interface described by @string
     */
    public constructor(string: String, length: Long) : this(gtk_builder_new_from_string(string, length)!!.reinterpret())

    /**
     * Parses a file containing a UI definition and merges it with
     * the current contents of @builder.
     *
     * This function is useful if you need to call
     * [method@Gtk.Builder.set_current_object]) to add user data to
     * callbacks before loading GtkBuilder UI. Otherwise, you probably
     * want [ctor@Gtk.Builder.new_from_file] instead.
     *
     * If an error occurs, 0 will be returned and @error will be assigned a
     * `GError` from the `GTK_BUILDER_ERROR`, `G_MARKUP_ERROR` or `G_FILE_ERROR`
     * domains.
     *
     * It’s not really reasonable to attempt to handle failures of this
     * call. You should not use this function with untrusted files (ie:
     * files that are not part of your application). Broken `GtkBuilder`
     * files can easily crash your program, and it’s possible that memory
     * was leaked leading up to the reported failure. The only reasonable
     * thing to do when an error is detected is to call `g_error()`.
     *
     * @param filename the name of the file to parse
     * @return true on success, false if an error occurred
     */
    public open fun addFromFile(filename: String): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gtk_builder_add_from_file(gtkBuilderPointer.reinterpret(), filename, gError.ptr).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Parses a resource file containing a UI definition
     * and merges it with the current contents of @builder.
     *
     * This function is useful if you need to call
     * [method@Gtk.Builder.set_current_object] to add user data to
     * callbacks before loading GtkBuilder UI. Otherwise, you probably
     * want [ctor@Gtk.Builder.new_from_resource] instead.
     *
     * If an error occurs, 0 will be returned and @error will be assigned a
     * `GError` from the %GTK_BUILDER_ERROR, %G_MARKUP_ERROR or %G_RESOURCE_ERROR
     * domain.
     *
     * It’s not really reasonable to attempt to handle failures of this
     * call.  The only reasonable thing to do when an error is detected is
     * to call g_error().
     *
     * @param resourcePath the path of the resource file to parse
     * @return true on success, false if an error occurred
     */
    public open fun addFromResource(resourcePath: String): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gtk_builder_add_from_resource(
            gtkBuilderPointer.reinterpret(),
            resourcePath,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Parses a string containing a UI definition and merges it
     * with the current contents of @builder.
     *
     * This function is useful if you need to call
     * [method@Gtk.Builder.set_current_object] to add user data to
     * callbacks before loading `GtkBuilder` UI. Otherwise, you probably
     * want [ctor@Gtk.Builder.new_from_string] instead.
     *
     * Upon errors false will be returned and @error will be assigned a
     * `GError` from the %GTK_BUILDER_ERROR, %G_MARKUP_ERROR or
     * %G_VARIANT_PARSE_ERROR domain.
     *
     * It’s not really reasonable to attempt to handle failures of this
     * call.  The only reasonable thing to do when an error is detected is
     * to call g_error().
     *
     * @param buffer the string to parse
     * @param length the length of @buffer (may be -1 if @buffer is nul-terminated)
     * @return true on success, false if an error occurred
     */
    public open fun addFromString(buffer: String, length: Long): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gtk_builder_add_from_string(
            gtkBuilderPointer.reinterpret(),
            buffer,
            length,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Parses a file containing a UI definition building only the
     * requested objects and merges them with the current contents
     * of @builder.
     *
     * Upon errors, 0 will be returned and @error will be assigned a
     * `GError` from the %GTK_BUILDER_ERROR, %G_MARKUP_ERROR or %G_FILE_ERROR
     * domain.
     *
     * If you are adding an object that depends on an object that is not
     * its child (for instance a `GtkTreeView` that depends on its
     * `GtkTreeModel`), you have to explicitly list all of them in @object_ids.
     *
     * @param filename the name of the file to parse
     * @param objectIds nul-terminated array of objects to build
     * @return true on success, false if an error occurred
     */
    public open fun addObjectsFromFile(filename: String, objectIds: List<String>): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gtk_builder_add_objects_from_file(
            gtkBuilderPointer.reinterpret(),
            filename,
            objectIds.toCStringList(this),
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Parses a resource file containing a UI definition, building
     * only the requested objects and merges them with the current
     * contents of @builder.
     *
     * Upon errors, 0 will be returned and @error will be assigned a
     * `GError` from the %GTK_BUILDER_ERROR, %G_MARKUP_ERROR or %G_RESOURCE_ERROR
     * domain.
     *
     * If you are adding an object that depends on an object that is not
     * its child (for instance a `GtkTreeView` that depends on its
     * `GtkTreeModel`), you have to explicitly list all of them in @object_ids.
     *
     * @param resourcePath the path of the resource file to parse
     * @param objectIds nul-terminated array of objects to build
     * @return true on success, false if an error occurred
     */
    public open fun addObjectsFromResource(resourcePath: String, objectIds: List<String>): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gtk_builder_add_objects_from_resource(
            gtkBuilderPointer.reinterpret(),
            resourcePath,
            objectIds.toCStringList(this),
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Parses a string containing a UI definition, building only the
     * requested objects and merges them with the current contents of
     * @builder.
     *
     * Upon errors false will be returned and @error will be assigned a
     * `GError` from the %GTK_BUILDER_ERROR or %G_MARKUP_ERROR domain.
     *
     * If you are adding an object that depends on an object that is not
     * its child (for instance a `GtkTreeView` that depends on its
     * `GtkTreeModel`), you have to explicitly list all of them in @object_ids.
     *
     * @param buffer the string to parse
     * @param length the length of @buffer (may be -1 if @buffer is nul-terminated)
     * @param objectIds nul-terminated array of objects to build
     * @return true on success, false if an error occurred
     */
    public open fun addObjectsFromString(buffer: String, length: Long, objectIds: List<String>): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = gtk_builder_add_objects_from_string(
                gtkBuilderPointer.reinterpret(),
                buffer,
                length,
                objectIds.toCStringList(this),
                gError.ptr
            ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Creates a closure to invoke the function called @function_name.
     *
     * This is using the create_closure() implementation of @builder's
     * [iface@Gtk.BuilderScope].
     *
     * If no closure could be created, null will be returned and @error
     * will be set.
     *
     * @param functionName name of the function to look up
     * @param flags closure creation flags
     * @param object Object to create the closure with
     * @return A new closure for invoking @function_name
     */
    public open fun createClosure(
        functionName: String,
        flags: BuilderClosureFlags,
        `object`: Object? = null,
    ): Result<Closure?> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gtk_builder_create_closure(
            gtkBuilderPointer.reinterpret(),
            functionName,
            flags.mask,
            `object`?.gPointer?.reinterpret(),
            gError.ptr
        )?.run {
            Closure(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Add @object to the @builder object pool so it can be
     * referenced just like any other object built by builder.
     *
     * Only a single object may be added using @name. However,
     * it is not an error to expose the same object under multiple
     * names. `gtk_builder_get_object()` may be used to determine
     * if an object has already been added with @name.
     *
     * @param name the name of the object exposed to the builder
     * @param object the object to expose
     */
    public open fun exposeObject(name: String, `object`: Object): Unit =
        gtk_builder_expose_object(gtkBuilderPointer.reinterpret(), name, `object`.gPointer.reinterpret())

    /**
     * Main private entry point for building composite components
     * from template XML.
     *
     * Most likely you do not need to call this function in applications as
     * templates are handled by `GtkWidget`.
     *
     * @param object the object that is being extended
     * @param templateType the type that the template is for
     * @param buffer the string to parse
     * @param length the length of @buffer (may be -1 if @buffer is nul-terminated)
     * @return A positive value on success, 0 if an error occurred
     */
    public open fun extendWithTemplate(
        `object`: Object,
        templateType: GType,
        buffer: String,
        length: Long,
    ): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gtk_builder_extend_with_template(
            gtkBuilderPointer.reinterpret(),
            `object`.gPointer.reinterpret(),
            templateType,
            buffer,
            length,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Gets the object named @name.
     *
     * Note that this function does not increment the reference count
     * of the returned object.
     *
     * @param name name of object to get
     * @return the object named @name
     */
    public open fun getObject(name: String): Object? =
        gtk_builder_get_object(gtkBuilderPointer.reinterpret(), name)?.run {
            Object(reinterpret())
        }

    /**
     * Gets all objects that have been constructed by @builder.
     *
     * Note that this function does not increment the reference
     * counts of the returned objects.
     *
     * @return a
     *   newly-allocated `GSList` containing all the objects
     *   constructed by the `GtkBuilder instance`. It should be
     *   freed by g_slist_free()
     */
    public open fun getObjects(): SList = gtk_builder_get_objects(gtkBuilderPointer.reinterpret())!!.run {
        SList(reinterpret())
    }

    /**
     * Gets the scope in use that was set via gtk_builder_set_scope().
     *
     * @return the current scope
     */
    public open fun getScope(): BuilderScope = gtk_builder_get_scope(gtkBuilderPointer.reinterpret())!!.run {
        BuilderScope.wrap(reinterpret())
    }

    /**
     * Looks up a type by name.
     *
     * This is using the virtual function that `GtkBuilder` has
     * for that purpose. This is mainly used when implementing
     * the `GtkBuildable` interface on a type.
     *
     * @param typeName type name to lookup
     * @return the `GType` found for @type_name or %G_TYPE_INVALID
     *   if no type was found
     */
    public open fun getTypeFromName(typeName: String): GType =
        gtk_builder_get_type_from_name(gtkBuilderPointer.reinterpret(), typeName)

    /**
     * Sets the scope the builder should operate in.
     *
     * If @scope is null, a new [class@Gtk.BuilderCScope] will be created.
     *
     * @param scope the scope to use
     */
    public open fun setScope(scope: BuilderScope? = null): Unit =
        gtk_builder_set_scope(gtkBuilderPointer.reinterpret(), scope?.gtkBuilderScopePointer)

    /**
     * Demarshals a value from a string.
     *
     * This function calls g_value_init() on the @value argument,
     * so it need not be initialised beforehand.
     *
     * Can handle char, uchar, boolean, int, uint, long,
     * ulong, enum, flags, float, double, string, `GdkRGBA` and
     * `GtkAdjustment` type values.
     *
     * Upon errors false will be returned and @error will be
     * assigned a `GError` from the %GTK_BUILDER_ERROR domain.
     *
     * @param pspec the `GParamSpec` for the property
     * @param string the string representation of the value
     * @param value the `GValue` to store the result in
     * @return true on success
     */
    public open fun valueFromString(pspec: ParamSpec, string: String, `value`: Value): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gtk_builder_value_from_string(
            gtkBuilderPointer.reinterpret(),
            pspec.gPointer.reinterpret(),
            string,
            `value`.gobjectValuePointer.reinterpret(),
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Demarshals a value from a string.
     *
     * Unlike [method@Gtk.Builder.value_from_string], this function
     * takes a `GType` instead of `GParamSpec`.
     *
     * Calls g_value_init() on the @value argument, so it
     * need not be initialised beforehand.
     *
     * Upon errors false will be returned and @error will be
     * assigned a `GError` from the %GTK_BUILDER_ERROR domain.
     *
     * @param type the `GType` of the value
     * @param string the string representation of the value
     * @param value the `GValue` to store the result in
     * @return true on success
     */
    public open fun valueFromStringType(type: GType, string: String, `value`: Value): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gtk_builder_value_from_string_type(
            gtkBuilderPointer.reinterpret(),
            type,
            string,
            `value`.gobjectValuePointer.reinterpret(),
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    public companion object : TypeCompanion<Builder> {
        override val type: GeneratedClassKGType<Builder> =
            GeneratedClassKGType(gtk_builder_get_type()) { Builder(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Parses the UI definition in the file @filename.
         *
         * If there is an error opening the file or parsing the description then
         * the program will be aborted. You should only ever attempt to parse
         * user interface descriptions that are shipped as part of your program.
         *
         * @param filename filename of user interface description file
         * @return a `GtkBuilder` containing the described interface
         */
        public fun newFromFile(filename: String): Builder = Builder(gtk_builder_new_from_file(filename)!!.reinterpret())

        /**
         * Parses the UI definition at @resource_path.
         *
         * If there is an error locating the resource or parsing the
         * description, then the program will be aborted.
         *
         * @param resourcePath a `GResource` resource path
         * @return a `GtkBuilder` containing the described interface
         */
        public fun newFromResource(resourcePath: String): Builder =
            Builder(gtk_builder_new_from_resource(resourcePath)!!.reinterpret())

        /**
         * Get the GType of Builder
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_builder_get_type()
    }
}
