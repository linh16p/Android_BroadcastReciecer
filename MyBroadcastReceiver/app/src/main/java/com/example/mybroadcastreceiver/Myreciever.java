package com.example.mybroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.view.textservice.TextServicesManager;
import android.widget.Toast;

public class Myreciever extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
    }
    public static boolean isConnected() {
        ConnectivityManager
                cm = (ConnectivityManager) ServiceManager.getInstance().getApplicationContext()
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo ni = cm.getActiveNetworkInfo();
        return ni != null && ni.isConnectedOrConnecting();
    }
}
