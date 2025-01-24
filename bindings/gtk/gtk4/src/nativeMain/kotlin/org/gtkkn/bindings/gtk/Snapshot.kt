// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.cairo.Context
import org.gtkkn.bindings.gdk.Paintable
import org.gtkkn.bindings.gdk.Rgba
import org.gtkkn.bindings.gdk.Texture
import org.gtkkn.bindings.glib.Bytes
import org.gtkkn.bindings.graphene.Matrix
import org.gtkkn.bindings.graphene.Point
import org.gtkkn.bindings.graphene.Point3d
import org.gtkkn.bindings.graphene.Rect
import org.gtkkn.bindings.graphene.Size
import org.gtkkn.bindings.graphene.Vec3
import org.gtkkn.bindings.graphene.Vec4
import org.gtkkn.bindings.gsk.BlendMode
import org.gtkkn.bindings.gsk.FillRule
import org.gtkkn.bindings.gsk.GlShader
import org.gtkkn.bindings.gsk.MaskMode
import org.gtkkn.bindings.gsk.Path
import org.gtkkn.bindings.gsk.RenderNode
import org.gtkkn.bindings.gsk.RoundedRect
import org.gtkkn.bindings.gsk.ScalingFilter
import org.gtkkn.bindings.gsk.Stroke
import org.gtkkn.bindings.gsk.Transform
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_10
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_14
import org.gtkkn.bindings.pango.Direction
import org.gtkkn.bindings.pango.Layout
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkSnapshot
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.glib.gfloat
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.gtk_snapshot_append_cairo
import org.gtkkn.native.gtk.gtk_snapshot_append_color
import org.gtkkn.native.gtk.gtk_snapshot_append_fill
import org.gtkkn.native.gtk.gtk_snapshot_append_inset_shadow
import org.gtkkn.native.gtk.gtk_snapshot_append_layout
import org.gtkkn.native.gtk.gtk_snapshot_append_node
import org.gtkkn.native.gtk.gtk_snapshot_append_outset_shadow
import org.gtkkn.native.gtk.gtk_snapshot_append_scaled_texture
import org.gtkkn.native.gtk.gtk_snapshot_append_stroke
import org.gtkkn.native.gtk.gtk_snapshot_append_texture
import org.gtkkn.native.gtk.gtk_snapshot_free_to_node
import org.gtkkn.native.gtk.gtk_snapshot_free_to_paintable
import org.gtkkn.native.gtk.gtk_snapshot_get_type
import org.gtkkn.native.gtk.gtk_snapshot_gl_shader_pop_texture
import org.gtkkn.native.gtk.gtk_snapshot_new
import org.gtkkn.native.gtk.gtk_snapshot_perspective
import org.gtkkn.native.gtk.gtk_snapshot_pop
import org.gtkkn.native.gtk.gtk_snapshot_push_blend
import org.gtkkn.native.gtk.gtk_snapshot_push_blur
import org.gtkkn.native.gtk.gtk_snapshot_push_clip
import org.gtkkn.native.gtk.gtk_snapshot_push_color_matrix
import org.gtkkn.native.gtk.gtk_snapshot_push_cross_fade
import org.gtkkn.native.gtk.gtk_snapshot_push_fill
import org.gtkkn.native.gtk.gtk_snapshot_push_gl_shader
import org.gtkkn.native.gtk.gtk_snapshot_push_mask
import org.gtkkn.native.gtk.gtk_snapshot_push_opacity
import org.gtkkn.native.gtk.gtk_snapshot_push_repeat
import org.gtkkn.native.gtk.gtk_snapshot_push_rounded_clip
import org.gtkkn.native.gtk.gtk_snapshot_push_stroke
import org.gtkkn.native.gtk.gtk_snapshot_render_background
import org.gtkkn.native.gtk.gtk_snapshot_render_focus
import org.gtkkn.native.gtk.gtk_snapshot_render_frame
import org.gtkkn.native.gtk.gtk_snapshot_render_insertion_cursor
import org.gtkkn.native.gtk.gtk_snapshot_render_layout
import org.gtkkn.native.gtk.gtk_snapshot_restore
import org.gtkkn.native.gtk.gtk_snapshot_rotate
import org.gtkkn.native.gtk.gtk_snapshot_rotate_3d
import org.gtkkn.native.gtk.gtk_snapshot_save
import org.gtkkn.native.gtk.gtk_snapshot_scale
import org.gtkkn.native.gtk.gtk_snapshot_scale_3d
import org.gtkkn.native.gtk.gtk_snapshot_to_node
import org.gtkkn.native.gtk.gtk_snapshot_to_paintable
import org.gtkkn.native.gtk.gtk_snapshot_transform
import org.gtkkn.native.gtk.gtk_snapshot_transform_matrix
import org.gtkkn.native.gtk.gtk_snapshot_translate
import org.gtkkn.native.gtk.gtk_snapshot_translate_3d
import kotlin.Unit

/**
 * `GtkSnapshot` assists in creating [class@Gsk.RenderNode]s for widgets.
 *
 * It functions in a similar way to a cairo context, and maintains a stack
 * of render nodes and their associated transformations.
 *
 * The node at the top of the stack is the one that `gtk_snapshot_append_…()`
 * functions operate on. Use the `gtk_snapshot_push_…()` functions and
 * [method@Snapshot.pop] to change the current node.
 *
 * The typical way to obtain a `GtkSnapshot` object is as an argument to
 * the [vfunc@Gtk.Widget.snapshot] vfunc. If you need to create your own
 * `GtkSnapshot`, use [ctor@Gtk.Snapshot.new].
 *
 * ## Skipped during bindings generation
 *
 * - parameter `border_width`: Array parameter of type gfloat is not supported
 * - parameter `stops`: Array parameter of type Gsk.ColorStop is not supported
 * - parameter `stops`: Array parameter of type Gsk.ColorStop is not supported
 * - parameter `stops`: Array parameter of type Gsk.ColorStop is not supported
 * - parameter `stops`: Array parameter of type Gsk.ColorStop is not supported
 * - parameter `stops`: Array parameter of type Gsk.ColorStop is not supported
 * - method `push_debug`: Varargs parameter is not supported
 * - parameter `shadow`: Array parameter of type Gsk.Shadow is not supported
 */
public open class Snapshot(public val gtkSnapshotPointer: CPointer<GdkSnapshot>) :
    org.gtkkn.bindings.gdk.Snapshot(gtkSnapshotPointer.reinterpret()),
    KGTyped {
    /**
     * Creates a new `GtkSnapshot`.
     *
     * @return a newly-allocated `GtkSnapshot`
     */
    public constructor() : this(gtk_snapshot_new()!!.reinterpret())

    /**
     * Creates a new [class@Gsk.CairoNode] and appends it to the current
     * render node of @snapshot, without changing the current node.
     *
     * @param bounds the bounds for the new node
     * @return a `cairo_t` suitable for drawing the contents of
     *   the newly created render node
     */
    public open fun appendCairo(bounds: Rect): Context =
        gtk_snapshot_append_cairo(gtkSnapshotPointer.reinterpret(), bounds.grapheneRectPointer)!!.run {
            Context(this)
        }

    /**
     * Creates a new render node drawing the @color into the
     * given @bounds and appends it to the current render node
     * of @snapshot.
     *
     * You should try to avoid calling this function if
     * @color is transparent.
     *
     * @param color the color to draw
     * @param bounds the bounds for the new node
     */
    public open fun appendColor(color: Rgba, bounds: Rect): Unit =
        gtk_snapshot_append_color(gtkSnapshotPointer.reinterpret(), color.gdkRgbaPointer, bounds.grapheneRectPointer)

    /**
     * A convenience method to fill a path with a color.
     *
     * See [method@Gtk.Snapshot.push_fill] if you need
     * to fill a path with more complex content than
     * a color.
     *
     * @param path The path describing the area to fill
     * @param fillRule The fill rule to use
     * @param color the color to fill the path with
     * @since 4.14
     */
    @GtkVersion4_14
    public open fun appendFill(path: Path, fillRule: FillRule, color: Rgba): Unit = gtk_snapshot_append_fill(
        gtkSnapshotPointer.reinterpret(),
        path.gskPathPointer,
        fillRule.nativeValue,
        color.gdkRgbaPointer
    )

    /**
     * Appends an inset shadow into the box given by @outline.
     *
     * @param outline outline of the region surrounded by shadow
     * @param color color of the shadow
     * @param dx horizontal offset of shadow
     * @param dy vertical offset of shadow
     * @param spread how far the shadow spreads towards the inside
     * @param blurRadius how much blur to apply to the shadow
     */
    public open fun appendInsetShadow(
        outline: RoundedRect,
        color: Rgba,
        dx: gfloat,
        dy: gfloat,
        spread: gfloat,
        blurRadius: gfloat,
    ): Unit = gtk_snapshot_append_inset_shadow(
        gtkSnapshotPointer.reinterpret(),
        outline.gskRoundedRectPointer,
        color.gdkRgbaPointer,
        dx,
        dy,
        spread,
        blurRadius
    )

    public open fun appendLayout(layout: Layout, color: Rgba): Unit =
        gtk_snapshot_append_layout(gtkSnapshotPointer.reinterpret(), layout.pangoLayoutPointer, color.gdkRgbaPointer)

    /**
     * Appends @node to the current render node of @snapshot,
     * without changing the current node.
     *
     * If @snapshot does not have a current node yet, @node
     * will become the initial node.
     *
     * @param node a `GskRenderNode`
     */
    public open fun appendNode(node: RenderNode): Unit =
        gtk_snapshot_append_node(gtkSnapshotPointer.reinterpret(), node.gskRenderNodePointer)

    /**
     * Appends an outset shadow node around the box given by @outline.
     *
     * @param outline outline of the region surrounded by shadow
     * @param color color of the shadow
     * @param dx horizontal offset of shadow
     * @param dy vertical offset of shadow
     * @param spread how far the shadow spreads towards the outside
     * @param blurRadius how much blur to apply to the shadow
     */
    public open fun appendOutsetShadow(
        outline: RoundedRect,
        color: Rgba,
        dx: gfloat,
        dy: gfloat,
        spread: gfloat,
        blurRadius: gfloat,
    ): Unit = gtk_snapshot_append_outset_shadow(
        gtkSnapshotPointer.reinterpret(),
        outline.gskRoundedRectPointer,
        color.gdkRgbaPointer,
        dx,
        dy,
        spread,
        blurRadius
    )

    /**
     * Creates a new render node drawing the @texture
     * into the given @bounds and appends it to the
     * current render node of @snapshot.
     *
     * In contrast to [method@Gtk.Snapshot.append_texture],
     * this function provides control about how the filter
     * that is used when scaling.
     *
     * @param texture the texture to render
     * @param filter the filter to use
     * @param bounds the bounds for the new node
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun appendScaledTexture(texture: Texture, filter: ScalingFilter, bounds: Rect): Unit =
        gtk_snapshot_append_scaled_texture(
            gtkSnapshotPointer.reinterpret(),
            texture.gdkTexturePointer,
            filter.nativeValue,
            bounds.grapheneRectPointer
        )

    /**
     * A convenience method to stroke a path with a color.
     *
     * See [method@Gtk.Snapshot.push_stroke] if you need
     * to stroke a path with more complex content than
     * a color.
     *
     * @param path The path describing the area to fill
     * @param stroke The stroke attributes
     * @param color the color to fill the path with
     * @since 4.14
     */
    @GtkVersion4_14
    public open fun appendStroke(path: Path, stroke: Stroke, color: Rgba): Unit = gtk_snapshot_append_stroke(
        gtkSnapshotPointer.reinterpret(),
        path.gskPathPointer,
        stroke.gskStrokePointer,
        color.gdkRgbaPointer
    )

    /**
     * Creates a new render node drawing the @texture
     * into the given @bounds and appends it to the
     * current render node of @snapshot.
     *
     * If the texture needs to be scaled to fill @bounds,
     * linear filtering is used. See [method@Gtk.Snapshot.append_scaled_texture]
     * if you need other filtering, such as nearest-neighbour.
     *
     * @param texture the texture to render
     * @param bounds the bounds for the new node
     */
    public open fun appendTexture(texture: Texture, bounds: Rect): Unit = gtk_snapshot_append_texture(
        gtkSnapshotPointer.reinterpret(),
        texture.gdkTexturePointer,
        bounds.grapheneRectPointer
    )

    /**
     * Returns the node that was constructed by @snapshot
     * and frees @snapshot.
     *
     * See also [method@Gtk.Snapshot.to_node].
     *
     * @return a newly-created [class@Gsk.RenderNode]
     */
    public open fun freeToNode(): RenderNode? = gtk_snapshot_free_to_node(gtkSnapshotPointer.reinterpret())?.run {
        RenderNode.RenderNodeImpl(this)
    }

    /**
     * Returns a paintable for the node that was
     * constructed by @snapshot and frees @snapshot.
     *
     * @param size The size of the resulting paintable
     *   or null to use the bounds of the snapshot
     * @return a newly-created [iface@Gdk.Paintable]
     */
    public open fun freeToPaintable(size: Size? = null): Paintable? =
        gtk_snapshot_free_to_paintable(gtkSnapshotPointer.reinterpret(), size?.grapheneSizePointer)?.run {
            Paintable.PaintableImpl(reinterpret())
        }

    /**
     * Removes the top element from the stack of render nodes and
     * adds it to the nearest [class@Gsk.GLShaderNode] below it.
     *
     * This must be called the same number of times as the number
     * of textures is needed for the shader in
     * [method@Gtk.Snapshot.push_gl_shader].
     */
    public open fun glShaderPopTexture(): Unit = gtk_snapshot_gl_shader_pop_texture(gtkSnapshotPointer.reinterpret())

    /**
     * Applies a perspective projection transform.
     *
     * See [method@Gsk.Transform.perspective] for a discussion on the details.
     *
     * @param depth distance of the z=0 plane
     */
    public open fun perspective(depth: gfloat): Unit = gtk_snapshot_perspective(gtkSnapshotPointer.reinterpret(), depth)

    /**
     * Removes the top element from the stack of render nodes,
     * and appends it to the node underneath it.
     */
    public open fun pop(): Unit = gtk_snapshot_pop(gtkSnapshotPointer.reinterpret())

    /**
     * Blends together two images with the given blend mode.
     *
     * Until the first call to [method@Gtk.Snapshot.pop], the
     * bottom image for the blend operation will be recorded.
     * After that call, the top image to be blended will be
     * recorded until the second call to [method@Gtk.Snapshot.pop].
     *
     * Calling this function requires two subsequent calls
     * to [method@Gtk.Snapshot.pop].
     *
     * @param blendMode blend mode to use
     */
    public open fun pushBlend(blendMode: BlendMode): Unit =
        gtk_snapshot_push_blend(gtkSnapshotPointer.reinterpret(), blendMode.nativeValue.value)

    /**
     * Blurs an image.
     *
     * The image is recorded until the next call to [method@Gtk.Snapshot.pop].
     *
     * @param radius the blur radius to use. Must be positive
     */
    public open fun pushBlur(radius: gdouble): Unit = gtk_snapshot_push_blur(gtkSnapshotPointer.reinterpret(), radius)

    /**
     * Clips an image to a rectangle.
     *
     * The image is recorded until the next call to [method@Gtk.Snapshot.pop].
     *
     * @param bounds the rectangle to clip to
     */
    public open fun pushClip(bounds: Rect): Unit =
        gtk_snapshot_push_clip(gtkSnapshotPointer.reinterpret(), bounds.grapheneRectPointer)

    /**
     * Modifies the colors of an image by applying an affine transformation
     * in RGB space.
     *
     * In particular, the colors will be transformed by applying
     *
     *     pixel = transpose(color_matrix) * pixel + color_offset
     *
     * for every pixel. The transformation operates on unpremultiplied
     * colors, with color components ordered R, G, B, A.
     *
     * The image is recorded until the next call to [method@Gtk.Snapshot.pop].
     *
     * @param colorMatrix the color matrix to use
     * @param colorOffset the color offset to use
     */
    public open fun pushColorMatrix(colorMatrix: Matrix, colorOffset: Vec4): Unit = gtk_snapshot_push_color_matrix(
        gtkSnapshotPointer.reinterpret(),
        colorMatrix.grapheneMatrixPointer,
        colorOffset.grapheneVec4Pointer
    )

    /**
     * Snapshots a cross-fade operation between two images with the
     * given @progress.
     *
     * Until the first call to [method@Gtk.Snapshot.pop], the start image
     * will be snapshot. After that call, the end image will be recorded
     * until the second call to [method@Gtk.Snapshot.pop].
     *
     * Calling this function requires two subsequent calls
     * to [method@Gtk.Snapshot.pop].
     *
     * @param progress progress between 0.0 and 1.0
     */
    public open fun pushCrossFade(progress: gdouble): Unit =
        gtk_snapshot_push_cross_fade(gtkSnapshotPointer.reinterpret(), progress)

    /**
     * Fills the area given by @path and @fill_rule with an image and discards everything
     * outside of it.
     *
     * The image is recorded until the next call to [method@Gtk.Snapshot.pop].
     *
     * If you want to fill the path with a color, [method@Gtk.Snapshot.append_fill]
     * may be more convenient.
     *
     * @param path The path describing the area to fill
     * @param fillRule The fill rule to use
     * @since 4.14
     */
    @GtkVersion4_14
    public open fun pushFill(path: Path, fillRule: FillRule): Unit =
        gtk_snapshot_push_fill(gtkSnapshotPointer.reinterpret(), path.gskPathPointer, fillRule.nativeValue)

    /**
     * Push a [class@Gsk.GLShaderNode].
     *
     * The node uses the given [class@Gsk.GLShader] and uniform values
     * Additionally this takes a list of @n_children other nodes
     * which will be passed to the [class@Gsk.GLShaderNode].
     *
     * The @take_args argument is a block of data to use for uniform
     * arguments, as per types and offsets defined by the @shader.
     * Normally this is generated by [method@Gsk.GLShader.format_args]
     * or [struct@Gsk.ShaderArgsBuilder].
     *
     * The snapshotter takes ownership of @take_args, so the caller should
     * not free it after this.
     *
     * If the renderer doesn't support GL shaders, or if there is any
     * problem when compiling the shader, then the node will draw pink.
     * You should use [method@Gsk.GLShader.compile] to ensure the @shader
     * will work for the renderer before using it.
     *
     * If the shader requires textures (see [method@Gsk.GLShader.get_n_textures]),
     * then it is expected that you call [method@Gtk.Snapshot.gl_shader_pop_texture]
     * the number of times that are required. Each of these calls will generate
     * a node that is added as a child to the `GskGLShaderNode`, which in turn
     * will render these offscreen and pass as a texture to the shader.
     *
     * Once all textures (if any) are pop:ed, you must call the regular
     * [method@Gtk.Snapshot.pop].
     *
     * If you want to use pre-existing textures as input to the shader rather
     * than rendering new ones, use [method@Gtk.Snapshot.append_texture] to
     * push a texture node. These will be used directly rather than being
     * re-rendered.
     *
     * For details on how to write shaders, see [class@Gsk.GLShader].
     *
     * @param shader The code to run
     * @param bounds the rectangle to render into
     * @param takeArgs Data block with arguments for the shader.
     */
    public open fun pushGlShader(shader: GlShader, bounds: Rect, takeArgs: Bytes): Unit = gtk_snapshot_push_gl_shader(
        gtkSnapshotPointer.reinterpret(),
        shader.gskGlShaderPointer,
        bounds.grapheneRectPointer,
        takeArgs.glibBytesPointer
    )

    /**
     * Until the first call to [method@Gtk.Snapshot.pop], the
     * mask image for the mask operation will be recorded.
     *
     * After that call, the source image will be recorded until
     * the second call to [method@Gtk.Snapshot.pop].
     *
     * Calling this function requires 2 subsequent calls to gtk_snapshot_pop().
     *
     * @param maskMode mask mode to use
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun pushMask(maskMode: MaskMode): Unit =
        gtk_snapshot_push_mask(gtkSnapshotPointer.reinterpret(), maskMode.nativeValue)

    /**
     * Modifies the opacity of an image.
     *
     * The image is recorded until the next call to [method@Gtk.Snapshot.pop].
     *
     * @param opacity the opacity to use
     */
    public open fun pushOpacity(opacity: gdouble): Unit =
        gtk_snapshot_push_opacity(gtkSnapshotPointer.reinterpret(), opacity)

    /**
     * Creates a node that repeats the child node.
     *
     * The child is recorded until the next call to [method@Gtk.Snapshot.pop].
     *
     * @param bounds the bounds within which to repeat
     * @param childBounds the bounds of the child or null
     *   to use the full size of the collected child node
     */
    public open fun pushRepeat(bounds: Rect, childBounds: Rect? = null): Unit = gtk_snapshot_push_repeat(
        gtkSnapshotPointer.reinterpret(),
        bounds.grapheneRectPointer,
        childBounds?.grapheneRectPointer
    )

    /**
     * Clips an image to a rounded rectangle.
     *
     * The image is recorded until the next call to [method@Gtk.Snapshot.pop].
     *
     * @param bounds the rounded rectangle to clip to
     */
    public open fun pushRoundedClip(bounds: RoundedRect): Unit =
        gtk_snapshot_push_rounded_clip(gtkSnapshotPointer.reinterpret(), bounds.gskRoundedRectPointer)

    /**
     * Strokes the given @path with the attributes given by @stroke and
     * an image.
     *
     * The image is recorded until the next call to [method@Gtk.Snapshot.pop].
     *
     * Note that the strokes are subject to the same transformation as
     * everything else, so uneven scaling will cause horizontal and vertical
     * strokes to have different widths.
     *
     * If you want to stroke the path with a color, [method@Gtk.Snapshot.append_stroke]
     * may be more convenient.
     *
     * @param path The path to stroke
     * @param stroke The stroke attributes
     * @since 4.14
     */
    @GtkVersion4_14
    public open fun pushStroke(path: Path, stroke: Stroke): Unit =
        gtk_snapshot_push_stroke(gtkSnapshotPointer.reinterpret(), path.gskPathPointer, stroke.gskStrokePointer)

    /**
     * Creates a render node for the CSS background according to @context,
     * and appends it to the current node of @snapshot, without changing
     * the current node.
     *
     * @param context the style context that defines the background
     * @param x X origin of the rectangle
     * @param y Y origin of the rectangle
     * @param width rectangle width
     * @param height rectangle height
     */
    public open fun renderBackground(
        context: StyleContext,
        x: gdouble,
        y: gdouble,
        width: gdouble,
        height: gdouble,
    ): Unit = gtk_snapshot_render_background(
        gtkSnapshotPointer.reinterpret(),
        context.gtkStyleContextPointer,
        x,
        y,
        width,
        height
    )

    /**
     * Creates a render node for the focus outline according to @context,
     * and appends it to the current node of @snapshot, without changing
     * the current node.
     *
     * @param context the style context that defines the focus ring
     * @param x X origin of the rectangle
     * @param y Y origin of the rectangle
     * @param width rectangle width
     * @param height rectangle height
     */
    public open fun renderFocus(context: StyleContext, x: gdouble, y: gdouble, width: gdouble, height: gdouble): Unit =
        gtk_snapshot_render_focus(gtkSnapshotPointer.reinterpret(), context.gtkStyleContextPointer, x, y, width, height)

    /**
     * Creates a render node for the CSS border according to @context,
     * and appends it to the current node of @snapshot, without changing
     * the current node.
     *
     * @param context the style context that defines the frame
     * @param x X origin of the rectangle
     * @param y Y origin of the rectangle
     * @param width rectangle width
     * @param height rectangle height
     */
    public open fun renderFrame(context: StyleContext, x: gdouble, y: gdouble, width: gdouble, height: gdouble): Unit =
        gtk_snapshot_render_frame(gtkSnapshotPointer.reinterpret(), context.gtkStyleContextPointer, x, y, width, height)

    /**
     * Draws a text caret using @snapshot at the specified index of @layout.
     *
     * @param context a `GtkStyleContext`
     * @param x X origin
     * @param y Y origin
     * @param layout the `PangoLayout` of the text
     * @param index the index in the `PangoLayout`
     * @param direction the `PangoDirection` of the text
     */
    public open fun renderInsertionCursor(
        context: StyleContext,
        x: gdouble,
        y: gdouble,
        layout: Layout,
        index: gint,
        direction: Direction,
    ): Unit = gtk_snapshot_render_insertion_cursor(
        gtkSnapshotPointer.reinterpret(),
        context.gtkStyleContextPointer,
        x,
        y,
        layout.pangoLayoutPointer,
        index,
        direction.nativeValue
    )

    /**
     * Creates a render node for rendering @layout according to the style
     * information in @context, and appends it to the current node of @snapshot,
     * without changing the current node.
     *
     * @param context the style context that defines the text
     * @param x X origin of the rectangle
     * @param y Y origin of the rectangle
     * @param layout the `PangoLayout` to render
     */
    public open fun renderLayout(context: StyleContext, x: gdouble, y: gdouble, layout: Layout): Unit =
        gtk_snapshot_render_layout(
            gtkSnapshotPointer.reinterpret(),
            context.gtkStyleContextPointer,
            x,
            y,
            layout.pangoLayoutPointer
        )

    /**
     * Restores @snapshot to the state saved by a preceding call to
     * [method@Snapshot.save] and removes that state from the stack of
     * saved states.
     */
    public open fun restore(): Unit = gtk_snapshot_restore(gtkSnapshotPointer.reinterpret())

    /**
     * Rotates @@snapshot's coordinate system by @angle degrees in 2D space -
     * or in 3D speak, rotates around the Z axis. The rotation happens around
     * the origin point of (0, 0) in the @snapshot's current coordinate system.
     *
     * To rotate around axes other than the Z axis, use [method@Gsk.Transform.rotate_3d].
     *
     * @param angle the rotation angle, in degrees (clockwise)
     */
    public open fun rotate(angle: gfloat): Unit = gtk_snapshot_rotate(gtkSnapshotPointer.reinterpret(), angle)

    /**
     * Rotates @snapshot's coordinate system by @angle degrees around @axis.
     *
     * For a rotation in 2D space, use [method@Gsk.Transform.rotate].
     *
     * @param angle the rotation angle, in degrees (clockwise)
     * @param axis The rotation axis
     */
    public open fun rotate3d(angle: gfloat, axis: Vec3): Unit =
        gtk_snapshot_rotate_3d(gtkSnapshotPointer.reinterpret(), angle, axis.grapheneVec3Pointer)

    /**
     * Makes a copy of the current state of @snapshot and saves it
     * on an internal stack.
     *
     * When [method@Gtk.Snapshot.restore] is called, @snapshot will
     * be restored to the saved state.
     *
     * Multiple calls to [method@Gtk.Snapshot.save] and [method@Gtk.Snapshot.restore]
     * can be nested; each call to `gtk_snapshot_restore()` restores the state from
     * the matching paired `gtk_snapshot_save()`.
     *
     * It is necessary to clear all saved states with corresponding
     * calls to `gtk_snapshot_restore()`.
     */
    public open fun save(): Unit = gtk_snapshot_save(gtkSnapshotPointer.reinterpret())

    /**
     * Scales @snapshot's coordinate system in 2-dimensional space by
     * the given factors.
     *
     * Use [method@Gtk.Snapshot.scale_3d] to scale in all 3 dimensions.
     *
     * @param factorX scaling factor on the X axis
     * @param factorY scaling factor on the Y axis
     */
    public open fun scale(factorX: gfloat, factorY: gfloat): Unit =
        gtk_snapshot_scale(gtkSnapshotPointer.reinterpret(), factorX, factorY)

    /**
     * Scales @snapshot's coordinate system by the given factors.
     *
     * @param factorX scaling factor on the X axis
     * @param factorY scaling factor on the Y axis
     * @param factorZ scaling factor on the Z axis
     */
    public open fun scale3d(factorX: gfloat, factorY: gfloat, factorZ: gfloat): Unit =
        gtk_snapshot_scale_3d(gtkSnapshotPointer.reinterpret(), factorX, factorY, factorZ)

    /**
     * Returns the render node that was constructed
     * by @snapshot.
     *
     * Note that this function may return null if nothing has been
     * added to the snapshot or if its content does not produce pixels
     * to be rendered.
     *
     * After calling this function, it is no longer possible to
     * add more nodes to @snapshot. The only function that should
     * be called after this is [method@GObject.Object.unref].
     *
     * @return the constructed `GskRenderNode` or
     *   null if there are no nodes to render.
     */
    public open fun toNode(): RenderNode? = gtk_snapshot_to_node(gtkSnapshotPointer.reinterpret())?.run {
        RenderNode.RenderNodeImpl(this)
    }

    /**
     * Returns a paintable encapsulating the render node
     * that was constructed by @snapshot.
     *
     * After calling this function, it is no longer possible to
     * add more nodes to @snapshot. The only function that should
     * be called after this is [method@GObject.Object.unref].
     *
     * @param size The size of the resulting paintable
     *   or null to use the bounds of the snapshot
     * @return a new `GdkPaintable`
     */
    public open fun toPaintable(size: Size? = null): Paintable? =
        gtk_snapshot_to_paintable(gtkSnapshotPointer.reinterpret(), size?.grapheneSizePointer)?.run {
            Paintable.PaintableImpl(reinterpret())
        }

    /**
     * Transforms @snapshot's coordinate system with the given @transform.
     *
     * @param transform the transform to apply
     */
    public open fun transform(transform: Transform? = null): Unit =
        gtk_snapshot_transform(gtkSnapshotPointer.reinterpret(), transform?.gskTransformPointer)

    /**
     * Transforms @snapshot's coordinate system with the given @matrix.
     *
     * @param matrix the matrix to multiply the transform with
     */
    public open fun transformMatrix(matrix: Matrix): Unit =
        gtk_snapshot_transform_matrix(gtkSnapshotPointer.reinterpret(), matrix.grapheneMatrixPointer)

    /**
     * Translates @snapshot's coordinate system by @point in 2-dimensional space.
     *
     * @param point the point to translate the snapshot by
     */
    public open fun translate(point: Point): Unit =
        gtk_snapshot_translate(gtkSnapshotPointer.reinterpret(), point.graphenePointPointer)

    /**
     * Translates @snapshot's coordinate system by @point.
     *
     * @param point the point to translate the snapshot by
     */
    public open fun translate3d(point: Point3d): Unit =
        gtk_snapshot_translate_3d(gtkSnapshotPointer.reinterpret(), point.graphenePoint3dPointer)

    public companion object : TypeCompanion<Snapshot> {
        override val type: GeneratedClassKGType<Snapshot> =
            GeneratedClassKGType(gtk_snapshot_get_type()) { Snapshot(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of Snapshot
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_snapshot_get_type()
    }
}
