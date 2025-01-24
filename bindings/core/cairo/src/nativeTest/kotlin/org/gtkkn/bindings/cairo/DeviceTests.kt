/*
 * Copyright (c) 2025 gtk-kn
 *
 * SPDX-License-Identifier: LGPL-2.1-or-later
 *
 * This file is part of gtk-kn.
 * gtk-kn is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, see <http://www.gnu.org/licenses/>.
 */

package org.gtkkn.bindings.cairo

import kotlin.test.Test
import kotlin.test.assertEquals

class DeviceTests {
    @Test
    fun `should create script device with success status`() {
        val scriptPath = "/tmp/test_device.script"
        val device = Script.create(scriptPath)
        assertEquals(Status.SUCCESS, device.status(), "Device should have SUCCESS status after creation")
        device.finish()  // Clean up
    }

    @Test
    fun `finish should keep device in success status`() {
        val scriptPath = "/tmp/finish_test.script"
        val device = Script.create(scriptPath)
        device.finish()
        assertEquals(Status.SUCCESS, device.status(), "Device should remain in SUCCESS status after finish()")
    }

    @Test
    fun `flush should keep device in success status`() {
        val scriptPath = "/tmp/flush_test.script"
        val device = Script.create(scriptPath)
        device.flush()
        assertEquals(Status.SUCCESS, device.status(), "Device should remain in SUCCESS status after flush()")
        device.finish()  // Clean up
    }

    @Test
    fun `getDeviceType should return SCRIPT`() {
        val scriptPath = "/tmp/device_type_test.script"
        val device = Script.create(scriptPath)
        val deviceType = device.getDeviceType()
        assertEquals(DeviceType.SCRIPT, deviceType, "Expected device type to be SCRIPT for a Script device")
        assertEquals(Status.SUCCESS, device.status(), "Device should be SUCCESS after checking device type")
        device.finish()  // Clean up
    }

    @Test
    fun `acquire and release should maintain success status`() {
        val scriptPath = "/tmp/acquire_release_test.script"
        val device = Script.create(scriptPath)
        val acquireStatus = device.acquire()
        assertEquals(Status.SUCCESS, acquireStatus, "Acquiring the device should return SUCCESS")
        device.release()
        assertEquals(Status.SUCCESS, device.status(), "Device should remain in SUCCESS status after release()")
        device.finish()  // Clean up
    }
}
