package com.marcellomessori.easyusbtethering;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;

public class UsbConnectionBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        IntentFilter extraFilterToGetBatteryInfo = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
        Intent extraIntentToGetBatteryInfo = context.getApplicationContext().registerReceiver(null, extraFilterToGetBatteryInfo);

        int chargePlug = extraIntentToGetBatteryInfo.getIntExtra(BatteryManager.EXTRA_PLUGGED, -1);
        boolean usbCharge = chargePlug == BatteryManager.BATTERY_PLUGGED_USB;

        if (usbCharge) {
            Intent tetherSettings = new Intent();
            tetherSettings.setClassName("com.android.settings", "com.android.settings.TetherSettings");
            tetherSettings.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(tetherSettings);
        }

    }
}
