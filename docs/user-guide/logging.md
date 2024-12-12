# Logging in `gtk-kn`

This document explains the logging API provided by `gtk-kn`, including how to configure, use, and customize it for your
application.

---

## Overview

The `gtk-kn` logging API is designed for flexibility and performance, providing features like:

- **Lazy Evaluation**: Log messages are defined as lambdas, evaluated only if logging is enabled, avoiding unnecessary
  computation.
- **Automatic Domain Derivation**: By default, the log domain is the calling class's name, simplifying log organization.
- **Customizable Loggers**: Choose from built-in logging backends:
    - **`GLibLogLogger`**: Integrates with GLib's logging system.
    - **`LogcatStyleLogger`**: Mimics Android Logcat formatting.

!!! warning

    To enable logging, a logger (`LogLogger`) must be explicitly installed. Without a logger, no logs will be generated.

---

## Installing a Logger

You must install a logger before logs are captured. Depending on your needs, you can install a logger for debug builds,
release builds, or both.

### Install for Both Debug and Release Builds

Use this method to enable logging in all build types.

**Examples:**

```kotlin
LogcatStyleLogger.install()
```

```kotlin
LogcatStyleLogger.install(time = false, color = false)
```

The second example disables timestamps and colors for the log output.

- **`time`**: Adds timestamps to each log message (default: `true`).
- **`color`**: Enables ANSI color coding in the log output (default: `true`).

### Install Only for Debug Builds

Use this method to enable logging only during development.

```kotlin
LogcatStyleLogger.installOnDebuggableApp(time = true, color = true)
```

- Typically used for verbose debugging information.
- The logger will not be installed in release builds.

### Install Only for Release Builds

Use this method to log messages selectively in release builds.

```kotlin
GLibLogLogger.installOnReleaseApp(minPriority = LogPriority.MESSAGE)
```

- **`minPriority`**: The minimum log priority to capture (default: `LogPriority.MESSAGE`).
- Useful for filtering out lower-priority logs like `DEBUG` or `INFO` in production.

**Example:**

```kotlin
GLibLogLogger.installOnReleaseApp(minPriority = LogPriority.CRITICAL)
```

This setup logs only critical and error messages in release builds.

### Debug Logs in Release Builds

For both loggers, debug logs can still be enabled in release builds using the GLib `g_log` mechanism:

```bash
export G_MESSAGES_DEBUG=all
```

To restrict debug logs to a specific domain (only works with `GLibLogLogger`):

```bash
export G_MESSAGES_DEBUG=my_app
```

To disable debug logs in release builds entirely, explicitly set `minPriority` to `LogPriority.MESSAGE` or higher when
calling `installOnReleaseApp`.

---

## Logging Messages

Once a logger is installed, you can use the `log` function to create logs. It provides several options to customize
logging.

### Basic Usage

```kotlin
log { "This is a debug message" }
```

- **Default priority**: `LogPriority.DEBUG`.
- **Default domain**: Derived automatically from the calling class name.

### Custom Log Domain

Specify a custom domain for the log using the `logDomain` parameter. This is helpful for grouping logs by context.

```kotlin
log(logDomain = "MyComponent") { "This is a log from MyComponent" }
```

### Custom Log Priority

Control the log severity with the `priority` parameter. Available levels:

- `LogPriority.DEBUG`: Debugging information.
- `LogPriority.INFO`: General information.
- `LogPriority.MESSAGE`: Non-critical notifications.
- `LogPriority.WARNING`: Warnings that do not interrupt execution.
- `LogPriority.CRITICAL`: Critical issues requiring attention.
- `LogPriority.ERROR`: Fatal errors (**Note:** it will terminate the application with a `SIGTRAP`!).

**Example:**

```kotlin
log(priority = LogPriority.WARNING) { "This is a warning message" }
```

!!! warning

    Use `LogPriority.CRITICAL` for critical issues that are non-fatal. Use `LogPriority.ERROR` only if termination
    is desired.

### Logging Outside a Class

Use the overload of the `log` function when `this` is unavailable, such as in top-level functions or static contexts.

```kotlin
log(logDomain = "GlobalDomain", priority = LogPriority.INFO) { "This is a global log message" }
```

### Logging Exceptions

Log exceptions directly using the `org.gtkkn.extensions.glib.util.log` function. Choose the appropriate priority level.

```kotlin
try {
    // Some operation that might fail
} catch (e: Exception) {
    log(LogPriority.CRITICAL) { "Critical error: ${e.message}" }
}
```

---

## Examples of Log Output

### Setup Example Logs

```kotlin
fun printLogs() {
    log(LogPriority.DEBUG) { "This is a debug message" }
    log(LogPriority.INFO) { "This is an info message" }
    log(LogPriority.MESSAGE) { "This is a message" }
    log(LogPriority.WARNING) { "This is a warning message" }
    log(LogPriority.CRITICAL) { "This is a critical message" }
    log(LogPriority.ERROR) { "This is an error message" }
}
```

### Using `LogcatStyleLogger`

**Setup:**

```kotlin
LogcatStyleLogger.install(time = true, color = false)
printLogs()
```

**Output:**

```
12-12 17:12:07.282 194173 D ApplicationWindow: This is a debug message
12-12 17:12:07.282 194173 I ApplicationWindow: This is an info message
12-12 17:12:07.282 194173 M ApplicationWindow: This is a message
12-12 17:12:07.282 194173 W ApplicationWindow: This is a warning message
12-12 17:12:07.282 194173 C ApplicationWindow: This is a critical message
12-12 17:12:07.282 194173 E ApplicationWindow: This is an error message
LogPriority.ERROR is considered fatal and will terminate the application. Use LogPriority.CRITICAL for non-fatal critical errors. Sending SIGTRAP.
```

### Using `GLibLogLogger`

**Setup:**

```kotlin
GLibLogLogger.install()
printLogs()
```

**Output:**

```
(myapp.kexe:195167): ApplicationWindow-DEBUG: 17:14:30.305: This is a debug message
ApplicationWindow-INFO: 17:14:30.305: This is an info message
ApplicationWindow-Message: 17:14:30.305: This is a message

(myapp.kexe:195167): ApplicationWindow-WARNING **: 17:14:30.305: This is a warning message

(myapp.kexe:195167): ApplicationWindow-CRITICAL **: 17:14:30.305: This is a critical message

(myapp.kexe:195167): ApplicationWindow-ERROR **: 17:14:30.305: This is an error message
```

---

## Logger Comparison

### `GLibLogLogger`

- Integrates with GLib's native logging system.
- Respects `G_MESSAGES_DEBUG` environment variable for enabling debug logs with specific log domains in release builds.

### `LogcatStyleLogger`

- Mimics Android's Logcat formatting.
- Supports optional timestamps (`time`) and ANSI color coding (`color`).
- Ideal for debugging in console or file-based logs.
