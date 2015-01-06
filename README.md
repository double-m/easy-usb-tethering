## Easy USB Tethering for Android

[<img src="https://developer.android.com/images/brand/en_generic_rgb_wo_45.png" alt="Get it on Google Play">](https://play.google.com/store/apps/details?id=com.marcellomessori.easyusbtethering)

### Why this app?

I often connect to the Internet via USB tethering: life is too short to go to *Settings -> More...
-> Tethering and portable hotspot* every time, so I need a shortcut.

### Ok, but why this one?

I have been using other apps that do more or less the same job and I'm grateful to their authors.
Eventually I decided to code mine in order to have exactly what I need:

- activation only when USB plugging to a device that needs data connection and not in the case of a mere battery charger;
- open source (this is published on GitHub and released under GPLv3);
- a very small amount of memory required in the target device (only 50KB needed).

### Clone, modify and contribute

The easiest way is to open Android Studio, select *VCS -> Checkout from Version Control -> Git*,
then specify
[https://github.com/double-m/easy-usb-tethering.git](<https://github.com/double-m/easy-usb-tethering.git>)
as "Vcs Repository URL".

### Gradle or Maven

This is a native Gradle project, so you can execute:

```
user@linuxbox:/path/to/projectdir$ ./gradlew installDebug
```

I've added `pom.xml` and `app/pom.xml` so you can compile with Maven; just set
`<properties><android.home>` and execute:

```
user@linuxbox:/path/to/projectdir$ mvn -pl app clean install android:redeploy android:run # opt1
user@linuxbox:/path/to/projectdir/app$ mvn clean install android:redeploy android:run     # opt2
```

### Tested on:

- Wiko Iggy (Android 4.2.2, Kernel 3.4.5),
- Samsung Galaxy Tab 2 (GT-P3100, Android 4.2.2, Kernel 3.0.31).
