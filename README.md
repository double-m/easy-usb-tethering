## Easy USB Tethering for Android

### Why this app?

I often connect to the Internet via USB tethering: life is too short to go to *Settings -> More...
-> Tethering and portable hotspot* everytime.

### Ok, but why this one?

I have been using other apps that do more or less the same job and I'm grateful to their authors.
Eventually I decided to code mine in order to have exactly what I need:

- the shortcut should be activated only after plugging to a device that needs data connection, not to a charger;
- the source code should be open source (this is published on GitHub and released under GPLv3);
- the memory space occupied on the target should be very small (here's about 70KB);
- and yes, I needed an excuse to publish my first Android app.

### Clone, modify and contribute

The easiest way is opening Android Studio, selecting *VCS -> Checkout from Version Control -> Git*,
then specifying
[https://github.com/double-m/easy-usb-tethering.git](<https://github.com/double-m/easy-usb-tethering.git>)
as "Vcs Repository URL".

### Gradle vs Maven

If you prefer, there's a branch with a Maven version. Master's on Gradle.

### Tested on:

- Wiko Iggy, Android 4.2.2, Kernel 3.4.5
- Samsung Galaxy Tab 2 (GT-P3100), Android 4.2.2, Kernel 3.0.31
