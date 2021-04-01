package com.example.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class MyLibFile {

    public static void showMsg(Context c){
        Toast.makeText(c,"ShowMyToastMsg", Toast.LENGTH_SHORT).show();
    }
}
