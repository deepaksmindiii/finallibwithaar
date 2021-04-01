package com.example.mygroundapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mylibraryshowtoast.ShowMyToastMsg
import com.jio.healthdevice.JioHealthDeviceManager

class MainActivity : AppCompatActivity() {

    var deviceManager: JioHealthDeviceManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        useJioHealthAAR()
        ShowMyToastMsg.showMsg(this,"mmmmm")
        ShowMyToastMsg.showParentMsg(this,"showParentMsg")
    }

    fun useJioHealthAAR(){
        deviceManager = JioHealthDeviceManager.getInstance(applicationContext)
    }
}