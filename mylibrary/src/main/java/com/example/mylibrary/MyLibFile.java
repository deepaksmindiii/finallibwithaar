package com.example.mylibrary;

import android.content.Context;
import android.widget.Toast;

import com.jio.healthdevice.JioHealthDeviceManager;

public class MyLibFile {
    public static JioHealthDeviceManager deviceManager;

    public static void showMsg(Context c){
        deviceManager = JioHealthDeviceManager.getInstance(c);
        Toast.makeText(c,"ShowMyToastMsg"+deviceManager.toString(), Toast.LENGTH_SHORT).show();
    }
}
