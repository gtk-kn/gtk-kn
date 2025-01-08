# Using Notifications

In GNOME applications, notifications inform users about events that need attention. Notifications should be
non-intrusive and not overly distracting.

Refer to the [Human Interface Guidelines](https://developer.gnome.org/hig/patterns/feedback/notifications.html) for best
practices on using notifications.

!!! note

    Users can disable notifications for specific applications or globally, so avoid relying solely on notifications to convey critical information.

## Prerequisites

To use notifications in GNOME, ensure:

- Your app uses a GIO `Application` or a class derived from it, such as GTK `Application` or ADW `Application`.
- A valid desktop file matches your `application ID`.
- Your application supports D-Bus activation.

These requirements allow notifications to persist and associate with the app, even when it isn’t running.

## Notification Structure

A notification typically includes:

- A short **title**
- An optional **message body**
- An optional **icon**
- Optional **actions** (buttons for user interaction)
- An optional **urgent** status

## Creating a Notification

To send a notification, create a `Notification` object and add the necessary details:

``` kotlin
val notification = Notification("Lunch is ready")
notification.setBody("Today we have pancakes, salad, fruit, and cake for dessert")

val file = File.newForPath("fruitbowl.png")
val icon = FileIcon(file)
notification.setIcon(icon)
```

Keep titles brief, with longer messages in the body. Icons should be legible at small sizes (e.g., 24×24 pixels).

To display the notification, use your `Application` instance:

``` kotlin
// The application instance will acquire a reference on the
// notification object
app.sendNotification("lunch-is-ready", notification)
```

Provide an ID for the notification, which allows updating it by re-sending with the same ID. Once sent, the
`Notification` object is independent of the visible notification, so you can release it immediately.

## Adding Actions

To allow user interaction, you can add actions to your notification, typically shown as buttons. A **default action**
triggers when the user clicks the notification itself.

``` kotlin
notification.setDefaultAction("app.go-to-lunch")
notification.addButton("5 minutes", "app.reply-5-minutes")
notification.addButton("Order takeout", "app.order-takeout")
```

Actions use an `app.` prefix to indicate they belong to your `Application`. Only application-level actions work in
notifications (no window-specific or keyboard shortcuts).

## Actions with Parameters

Pass parameters to actions to make notifications more dynamic. For example, a launch button for a newly installed app:

``` kotlin
val title = "$appName is now installed"
val notification = Notification(title)
notification.addButtonWithTargetValue("Launch", "app.launch", Variant.newString(appid))

app.sendNotification("app-installed", notification);
```

In your application, define an action that accepts the application ID as a parameter:

``` kotlin
val action = SimpleAction("launch", VariantType.new("s"))

// Assuming `launchApplication()` is defined elsewhere
action.onActivate(handler = launchApplication())
app.addAction(action)
```

## Removing Notifications

If a notification becomes irrelevant, you can withdraw it:

``` kotlin
if (isNowTeaTime())
    app.withdrawNotification("lunch-is-ready")
```

## Disabling Notifications

Allow users to disable notifications if desired. GNOME’s "Do Not Disturb" mode controls notifications globally, but
individual applications appear in the "Notifications" settings panel if the following line is added to the desktop file:

``` ini
X-GNOME-UsesNotifications=true
```
