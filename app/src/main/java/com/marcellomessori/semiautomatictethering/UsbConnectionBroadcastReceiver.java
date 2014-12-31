package com.marcellomessori.semiautomatictethering;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.widget.Toast;

public class UsbConnectionBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        IntentFilter extraFilterToGetBatteryInfo = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
        Intent extraIntentToGetBatteryInfo = context.registerReceiver(null, extraFilterToGetBatteryInfo);

        int chargePlug = extraIntentToGetBatteryInfo.getIntExtra(BatteryManager.EXTRA_PLUGGED, -1);
        boolean usbCharge = chargePlug == BatteryManager.BATTERY_PLUGGED_USB;

        if (usbCharge) {
            Toast.makeText(context, "USB Device Connected", Toast.LENGTH_LONG).show();

                            Intent tetherSettings = new Intent();
                tetherSettings.setClassName("com.android.settings", "com.android.settings.TetherSettings");
                startActivity(tetherSettings);

        }

    }
}
