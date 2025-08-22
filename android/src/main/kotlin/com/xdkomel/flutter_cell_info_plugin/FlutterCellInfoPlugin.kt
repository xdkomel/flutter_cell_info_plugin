package com.xdkomel.flutter_cell_info_plugin

import android.content.Context
import androidx.annotation.NonNull
import androidx.core.content.ContextCompat
import android.Manifest
import 	android.content.pm.PackageManager

import io.flutter.embedding.engine.plugins.FlutterPlugin
import io.flutter.plugin.common.MethodCall
import io.flutter.plugin.common.MethodChannel
import io.flutter.plugin.common.MethodChannel.MethodCallHandler
import io.flutter.plugin.common.MethodChannel.Result

/** CellInfoPlugin */
class FlutterCellInfoPlugin : FlutterPlugin, MethodCallHandler {
    /// The MethodChannel that will the communication between Flutter and native Android
    ///
    /// This local reference serves to register the plugin with the Flutter Engine and unregister it
    /// when the Flutter Engine is detached from the Activity
    private val cellInfoPermissions = arrayOf(
        Manifest.permission.READ_PHONE_STATE,
        Manifest.permission.ACCESS_COARSE_LOCATION,
        Manifest.permission.ACCESS_FINE_LOCATION )
    private lateinit var cellInfoChannel: MethodChannel
    private lateinit var simInfoChannel: MethodChannel
    private lateinit var shared_preference: MethodChannel
    private var context: Context? = null

    override fun onAttachedToEngine(@NonNull flutterPluginBinding: FlutterPlugin.FlutterPluginBinding) {
        context = flutterPluginBinding.applicationContext

        cellInfoChannel = MethodChannel(flutterPluginBinding.binaryMessenger, "com.xdkomel.flutter_cell_info_plugin/method_channel")
        cellInfoChannel.setMethodCallHandler(this)
    }

    override fun onMethodCall(@NonNull call: MethodCall, @NonNull result: Result) {
        if (call.method == "cell_info") {
            onCellInfo(call, result)
        } else if (call.method == "sim_info") {
            val net = NetMonster()
            net.simsInfo(context!!, result)
        } else if (call.method == "shared_preference") {
            result.success(SharedHelper.getString(context, "cells_info_response"))
        } else {
            result.notImplemented()
        }
    }

    private fun onCellInfo(@NonNull call: MethodCall, @NonNull result: Result) {
        val ctx = context
        if (ctx == null) {
            result.error("FAILURE", "Context is not set, cannot check permissions to access cell info. Terminate.", null)
            return
        }
        val permissionsGiven = cellInfoPermissions
            .map { ContextCompat.checkSelfPermission(ctx, it) }
            .all { it == PackageManager.PERMISSION_GRANTED }
        if (!permissionsGiven) {
            result.error("FAILURE", "Not enough permissions to get cell info", null)
            return
        } 
        val net = NetMonster()
        net.requestData(context!!, result)
    }

    override fun onDetachedFromEngine(@NonNull binding: FlutterPlugin.FlutterPluginBinding) {
        cellInfoChannel.setMethodCallHandler(null)
    }
}
