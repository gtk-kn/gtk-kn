---
description: Learn how to use gtk-kn's flexible logging API.
---

# Logging in `gtk-kn`

## Overview

The `gtk-kn` logging API is designed for flexibility and performance, providing features like:

- **Lazy Evaluation**: Log messages are defined as lambdas, evaluated only if logging is enabled, avoiding unnecessary
  computation.
- **Automatic Domain Derivation**: By default, the log domain is the calling class's name, simplifying log organization.
- **Customizable Loggers**: Choose from built-in logging backends:
    - **`GLibLogLogger`**: Integrates with GLib's logging system.
    - **`LogcatStyleLogger`**: Mimics Android Logcat formatting.

!!! warning

    To enable logging, a logger (`Log`) must be explicitly installed. Without a logger, no logs will be generated.

---

## Installing a Logger

You must install a logger before logs are captured. Depending on your needs, you can install a logger for debug builds,
release builds, or both.

### Install for Both Debug and Release Builds

Use this method to enable logging in all build types.

**Examples:**

```kotlin
Log.installConsoleLogWriter()
```

```kotlin
Log.installConsoleLogWriter(time = false)
```

The second example disables timestamps and colors for the log output.

- **`time`**: Adds timestamps to each log message (default: `true`).

### Install Only for Debug Builds

Use this method to enable logging only during development.

```kotlin
Log.installConsoleLogWriterForDebugBuilds(time = true)
```

- Typically used for verbose debugging information.
- The logger will not be installed in release builds.

### Install Only for Release Builds

Use this method to log messages selectively in release builds.

```kotlin
Log.installGLibLogWriterForReleaseBuilds(minLevel = LogLevel.MESSAGE)
```

- **`minLevel`**: The minimum log priority to capture (default: `LogPriority.MESSAGE`).
- Useful for filtering out lower-priority logs like `DEBUG` or `INFO` in production.

**Example:**

```kotlin
Log.installGLibLogWriterForReleaseBuilds(minPriority = LogPriority.CRITICAL)
```

This setup logs only critical and error messages in release builds.

### Debug Logs in Release Builds

For both loggers, debug logs can still be enabled in release builds using the GLib `g_log` mechanism:

```bash
export G_MESSAGES_DEBUG=all
```

To restrict debug logs to a specific domain (only works with `GLibLogWriter`):

```bash
export G_MESSAGES_DEBUG=my_app
```

To disable debug logs in release builds entirely, explicitly set `minLevel` to `LogLevel.MESSAGE` or higher.

---

## Logging Messages

Once a logger is installed, you can use the `log` function to create logs. It provides several options to customize
logging.

### Basic Usage

```kotlin
log { "This is a debug message" }
```

- **Default level**: `LogLevel.DEBUG`.
- **Default domain**: Derived automatically from the calling class name.

### Custom Log Domain

Specify a custom domain for the log using the `domain` parameter. This is helpful for grouping logs by context.

```kotlin
log(domain = "MyComponent") { "This is a log from MyComponent" }
```

### Custom Log Level

Control the log severity with the `level` parameter. Available levels:

- `LogLevel.DEBUG`: Debugging information.
- `LogLevel.INFO`: General information.
- `LogLevel.MESSAGE`: Non-critical notifications.
- `LogLevel.WARNING`: Warnings that do not interrupt execution.
- `LogLevel.CRITICAL`: Critical issues requiring attention.
- `LogLevel.ERROR`: Fatal errors (**Note:** it will terminate the application with a `SIGTRAP`!).

**Example:**

```kotlin
log(level = LogLevel.WARNING) { "This is a warning message" }
```

!!! warning

    Use `LogLevel.CRITICAL` for critical issues that are non-fatal. Use `LogLevel.ERROR` only if termination
    is desired.

### Logging Outside a Class

Use the overload of the `log` function when `this` is unavailable, such as in top-level functions or static contexts.

```kotlin
log(domain = "GlobalDomain", level = LogLevel.INFO) { "This is a global log message" }
```

### Logging Exceptions

Log exceptions directly using the `org.gtkkn.extensions.glib.util.log` function. Choose the appropriate priority level.

```kotlin
try {
    // Some operation that might fail
} catch (e: Exception) {
    log(LogLevel.CRITICAL) { "Critical error: ${e.message}" }
}
```

---

## Examples of Log Output

### Setup Example Logs

```kotlin
fun printLogs() {
    log(LogLevel.DEBUG) { "This is a debug message" }
    log(LogLevel.INFO) { "This is an info message" }
    log(LogLevel.MESSAGE) { "This is a message" }
    log(LogLevel.WARNING) { "This is a warning message" }
    log(LogLevel.CRITICAL) { "This is a critical message" }
    log(LogLevel.ERROR) { "This is an error message" }
}
```

### Using `LogcatStyleLogger`

**Setup:**

```kotlin
Log.installConsoleLogWriter(time = true)
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
LogLevel.ERROR is considered fatal and will terminate the application. Use LogLevel.CRITICAL for non-fatal critical errors. Sending SIGTRAP.
```

### Using `GLibLogWriter`

**Setup:**

```kotlin
Log.installGLibLogWriter()
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
