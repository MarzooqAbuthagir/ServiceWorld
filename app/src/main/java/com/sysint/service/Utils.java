package com.sysint.service;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class Utils {
    @SuppressLint("StaticFieldLeak")
    static Context con;
    public static String url = "https://service.sysint.in/";

    public Utils(Context con) {
        Utils.con = con;
    }

    public static boolean isInternetOn() {
        ConnectivityManager conMgr = (ConnectivityManager) con
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo info = conMgr.getActiveNetworkInfo();
        return info != null && info.isConnected();
    }
}
