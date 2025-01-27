// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.gobject.KGType
import org.gtkkn.extensions.gobject.TypeProvider
import kotlin.collections.Map
import kotlin.reflect.KClass

public object GdkTypeProvider : TypeProvider {
    override val typeMap: Map<KClass<*>, KGType<*>> = buildMap {
        if (getTypeOrNull("gdk_app_launch_context_get_type") !=
            null
        ) {
            put(AppLaunchContext::class, AppLaunchContext.type)
        }
        if (getTypeOrNull("gdk_button_event_get_type") != null) put(ButtonEvent::class, ButtonEvent.type)
        if (getTypeOrNull("gdk_cairo_context_get_type") != null) put(CairoContext::class, CairoContext.type)
        if (getTypeOrNull("gdk_clipboard_get_type") != null) put(Clipboard::class, Clipboard.type)
        if (getTypeOrNull("gdk_content_deserializer_get_type") !=
            null
        ) {
            put(ContentDeserializer::class, ContentDeserializer.type)
        }
        if (getTypeOrNull("gdk_content_provider_get_type") != null) put(ContentProvider::class, ContentProvider.type)
        if (getTypeOrNull("gdk_content_serializer_get_type") !=
            null
        ) {
            put(ContentSerializer::class, ContentSerializer.type)
        }
        if (getTypeOrNull("gdk_crossing_event_get_type") != null) put(CrossingEvent::class, CrossingEvent.type)
        if (getTypeOrNull("gdk_cursor_get_type") != null) put(Cursor::class, Cursor.type)
        if (getTypeOrNull("gdk_dnd_event_get_type") != null) put(DndEvent::class, DndEvent.type)
        if (getTypeOrNull("gdk_delete_event_get_type") != null) put(DeleteEvent::class, DeleteEvent.type)
        if (getTypeOrNull("gdk_device_get_type") != null) put(Device::class, Device.type)
        if (getTypeOrNull("gdk_device_tool_get_type") != null) put(DeviceTool::class, DeviceTool.type)
        if (getTypeOrNull("gdk_display_get_type") != null) put(Display::class, Display.type)
        if (getTypeOrNull("gdk_display_manager_get_type") != null) put(DisplayManager::class, DisplayManager.type)
        if (getTypeOrNull("gdk_dmabuf_texture_get_type") != null) put(DmabufTexture::class, DmabufTexture.type)
        if (getTypeOrNull("gdk_dmabuf_texture_builder_get_type") !=
            null
        ) {
            put(DmabufTextureBuilder::class, DmabufTextureBuilder.type)
        }
        if (getTypeOrNull("gdk_drag_get_type") != null) put(Drag::class, Drag.type)
        if (getTypeOrNull("gdk_draw_context_get_type") != null) put(DrawContext::class, DrawContext.type)
        if (getTypeOrNull("gdk_drop_get_type") != null) put(Drop::class, Drop.type)
        if (getTypeOrNull("gdk_event_get_type") != null) put(Event::class, Event.type)
        if (getTypeOrNull("gdk_focus_event_get_type") != null) put(FocusEvent::class, FocusEvent.type)
        if (getTypeOrNull("gdk_frame_clock_get_type") != null) put(FrameClock::class, FrameClock.type)
        if (getTypeOrNull("gdk_gl_context_get_type") != null) put(GlContext::class, GlContext.type)
        if (getTypeOrNull("gdk_gl_texture_get_type") != null) put(GlTexture::class, GlTexture.type)
        if (getTypeOrNull("gdk_gl_texture_builder_get_type") !=
            null
        ) {
            put(GlTextureBuilder::class, GlTextureBuilder.type)
        }
        if (getTypeOrNull("gdk_grab_broken_event_get_type") != null) put(GrabBrokenEvent::class, GrabBrokenEvent.type)
        if (getTypeOrNull("gdk_key_event_get_type") != null) put(KeyEvent::class, KeyEvent.type)
        if (getTypeOrNull("gdk_memory_texture_get_type") != null) put(MemoryTexture::class, MemoryTexture.type)
        if (getTypeOrNull("gdk_monitor_get_type") != null) put(Monitor::class, Monitor.type)
        if (getTypeOrNull("gdk_motion_event_get_type") != null) put(MotionEvent::class, MotionEvent.type)
        if (getTypeOrNull("gdk_pad_event_get_type") != null) put(PadEvent::class, PadEvent.type)
        if (getTypeOrNull("gdk_proximity_event_get_type") != null) put(ProximityEvent::class, ProximityEvent.type)
        if (getTypeOrNull("gdk_scroll_event_get_type") != null) put(ScrollEvent::class, ScrollEvent.type)
        if (getTypeOrNull("gdk_seat_get_type") != null) put(Seat::class, Seat.type)
        if (getTypeOrNull("gdk_snapshot_get_type") != null) put(Snapshot::class, Snapshot.type)
        if (getTypeOrNull("gdk_surface_get_type") != null) put(Surface::class, Surface.type)
        if (getTypeOrNull("gdk_texture_get_type") != null) put(Texture::class, Texture.type)
        if (getTypeOrNull("gdk_touch_event_get_type") != null) put(TouchEvent::class, TouchEvent.type)
        if (getTypeOrNull("gdk_touchpad_event_get_type") != null) put(TouchpadEvent::class, TouchpadEvent.type)
        if (getTypeOrNull("gdk_vulkan_context_get_type") != null) put(VulkanContext::class, VulkanContext.type)
        if (getTypeOrNull("gdk_device_pad_get_type") != null) put(DevicePad::class, DevicePad.type)
        if (getTypeOrNull("gdk_drag_surface_get_type") != null) put(DragSurface::class, DragSurface.type)
        if (getTypeOrNull("gdk_paintable_get_type") != null) put(Paintable::class, Paintable.type)
        if (getTypeOrNull("gdk_popup_get_type") != null) put(Popup::class, Popup.type)
        if (getTypeOrNull("gdk_toplevel_get_type") != null) put(Toplevel::class, Toplevel.type)
    }
}
