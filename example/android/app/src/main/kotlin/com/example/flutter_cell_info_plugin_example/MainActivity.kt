package com.xdkomel.flutter_cell_info_plugin_example

import io.flutter.embedding.android.FlutterActivity
import androidx.core.app.ActivityCompat
import android.Manifest

class MainActivity : FlutterActivity() {
    override fun onStart() {
        super.onStart()

        ActivityCompat.requestPermissions(
            this,
            arrayOf(
                Manifest.permission.READ_PHONE_STATE,
                Manifest.permission.ACCESS_COARSE_LOCATION,
                Manifest.permission.ACCESS_FINE_LOCATION
            ),
            33
        )
    }
}
