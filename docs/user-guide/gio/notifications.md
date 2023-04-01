# Using Notifications

GNOME applications should use notifications to inform the user that something has happened that requires their
attention.

Notifications should not be intrusive, or distracting.

For more information on when to use notifications, you should follow the [Human
Interface Guidelines](https://developer.gnome.org/hig/patterns/feedback/notifications.html).

!!! note

    Remember that users can disable notifications for specific applications, or globally. You should not rely
    exclusively on notifications.

## Prerequisites

In order to use notifications in GNOME you will need to:

* use a GIO `Application` or a GTK `Application`
* provide a valid desktop file with the same name as your `application ID`
* ensure that your application can be activated via D-Bus

The desktop file and D-Bus activation provide notification persistence, allowing
the desktop to associate the notification to the application even if the
application is not running.

## Anatomy of a notification

A typical notification has a number of ingredients:

* a one-line **title**
* a longer, descriptive **message body** (optional)
* an **icon** (optional)
* **actions**, each with a label for use in a button (optional)
* additionally, notifications may be marked as **urgent**

# Creating a notification

To send a notification, first create a `Notification` object, and add the
data for your notification to it:

``` kotlin
val notification = Notification("Lunch is ready")
notification.setBody("Today we have pancakes and salad, and fruit and cake for dessert")

val file = File.newForPath("fruitbowl.png")
val icon = FileIcon(file)

notification.setIcon(icon)
```

Note that the title should be short; the body can be longer, say a paragraph.
The icon may be displayed at a small size (say, 24×24), so choose an icon that is remains readable at small size.

To show your notification to the user, use the `Application` function for this purpose:

``` kotlin
// The application instance will acquire a reference on the
// notification object
app.sendNotification("lunch-is-ready", notification)
```

You need to provide an id for your notification here. This can be used if you want to make updates to an existing
notification: simply send a notification with the same id. Note that the `Notification` object does not have to be kept
around after sending the notification; you can unref it right away. It is not a 'live' object that is associated with
the visible notification.

## Adding actions

Often, you want the user to be able to react to the notification in some way, other than just dismissing
it. `Notification` lets you do this by associating actions with your notification. These will typically be presented as
buttons in the popup. One action has a special role, it is the 'default' action that gets activated when the user clicks
on the notification, not on a particular button.

``` kotlin
notification.setDefaultAction("app.go-to-lunch")
notification.addButton("5 minutes", "app.reply-5-minutes")
notification.addButton("Order takeout", "app.order-takeout")
```

The actions are referred to here with their 'app.' prefixed name. This indicates that the actions have to be added to
your `Application`. You can not use any other actions in `Notifications` (window-specific actions with a 'win.' prefix,
or key shorcuts using other prefixes will not work).

## Actions with parameters

A common pattern is to pass a 'target' parameter to the action that contains sufficient details about the notification
to let your application react in a meaningful way.

As an example, here is how a notification about a newly installed application could provide a launch button:

``` kotlin
val title = appname + " is now installed";
val notification = Notification(title);

notification.addButtonWithTargetValue("Launch", "app.launch", Variant.newString(appid))

app.sendNotification("app-installed", notification);
```

To make this work, your application needs to have a suitable 'launch' action that takes the application id as a string
parameter:

``` kotlin
val action = SimpleAction("launch", null)

// the "launchApplication()" function is defined elsewhere
action.connectActivate(handler = launchApplication())

app.addAction(action)
```

## Stale notifications

Sometimes, a notification is no longer relevant and should not persist any longer. In those cases, you can explicitly
withdraw it, like this:

``` kotlin
if (isNowTeaTime())
    app.withdrawNotification("lunch-is-ready")
```

## Disabling notifications

If your application uses notifications, you should allow users to disable them.

GNOME has a blanket "do not disturb" mode, but each application can be individually controlled through the
"Notifications" settings panel.

In order to make your application appear in the panel, add the following line to your desktop file:

``` ini
X-GNOME-UsesNotifications=true
```
