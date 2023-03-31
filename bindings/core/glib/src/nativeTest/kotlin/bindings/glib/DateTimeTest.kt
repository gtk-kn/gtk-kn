package bindings.glib

import kotlinx.datetime.Clock
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.toLocalDateTime
import native.glib.g_date_time_compare
import kotlin.test.Test
import kotlin.test.assertEquals

class DateTimeTest {
    private val dt1 = DateTime.new(TimeZone.newUtc(), 2022, 4, 1, 10, 30, 15.0)

    @Test
    fun testConstructors() {
        val dtNow: LocalDateTime = Clock.System.now().toLocalDateTime(kotlinx.datetime.TimeZone.currentSystemDefault())
        val dtGlibNow = DateTime.newNowLocal()
        assertEquals(dtNow.year, dtGlibNow.getYear())
        assertEquals(dtNow.monthNumber, dtGlibNow.getMonth())
        assertEquals(dtNow.dayOfMonth, dtGlibNow.getDayOfMonth())
        assertEquals(dtNow.dayOfWeek.ordinal + 1, dtGlibNow.getDayOfWeek())
        assertEquals(dtNow.hour, dtGlibNow.getHour())
        assertEquals(dtNow.minute, dtGlibNow.getMinute())
        assertEquals(dtNow.second, dtGlibNow.getSecond())


        val dtUtcNow = Clock.System.now().toEpochMilliseconds() / 1000
        val dtGlibUtcNow = DateTime.newNowUtc()
        assertEquals(dtUtcNow, dtGlibUtcNow.toUnix())
    }

    @Test
    fun testComparisonOperators() {
        val dt2 = DateTime.new(TimeZone.newUtc(), 2022, 4, 1, 10, 30, 15.0)
        assertEquals(dt1, dt2)
//        assertEquals(0, g_date_time_compare(dt1.glibDateTimePointer, dt2.glibDateTimePointer))
    }

    @Test
    fun testArithmeticOperators() {
        val dt2 = dt1.addDays(1)
        assertEquals(dt2, DateTime.new(TimeZone.newUtc(), 2022, 4, 2, 10, 30, 15.0))

        val dt3 = dt1.addSeconds(-30.0)
        assertEquals(dt3, DateTime.new(TimeZone.newUtc(), 2022, 4, 1, 10, 29, 45.0))
    }

    @Test
    fun testFormatting() {
        assertEquals(dt1.format("%Y-%m-%d %H:%M:%S"), "2022-04-01 10:30:15")
    }
}
