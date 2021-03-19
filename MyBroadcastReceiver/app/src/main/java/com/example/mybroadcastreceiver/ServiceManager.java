package com.example.mybroadcastreceiver;

import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class ServiceManager extends Application {
    static ServiceManager wifiInstance;
    @Override
    public void onCreate() {
        super.onCreate();
        wifiInstance = this;
    }
    public static synchronized ServiceManager getInstance() {
        return wifiInstance;
    }
}
