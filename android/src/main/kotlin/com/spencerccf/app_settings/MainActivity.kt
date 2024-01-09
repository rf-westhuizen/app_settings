package com.spencerccf.app_settings

import android.app.Activity
import android.content.Intent
import androidx.annotation.NonNull
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.plugin.common.MethodChannel
import android.content.Context
import android.graphics.PixelFormat
import android.os.Bundle
import android.os.Handler
import android.view.Gravity
import android.view.WindowManager
import java.lang.reflect.Method
import android.os.Build // Add this import statement

class MainActivity: FlutterActivity() {

//    var currentFocus = false
//    var isPaused = false
//    var collapseNotificationHandler: Handler? = null
//
//    override fun onWindowFocusChanged(hasFocus: Boolean) {
//        currentFocus = hasFocus
//        if (!hasFocus) {
//            // Method that handles the loss of window focus
//            collapseNow()
//        }
//    }

//    fun collapseNow() {
//        if (collapseNotificationHandler == null) {
//            collapseNotificationHandler = Handler()
//        }
//        if (!currentFocus && !isPaused) {
//            collapseNotificationHandler?.postDelayed(object : Runnable {
//                override fun run() {
//                    val statusBarService: Any? = getSystemService("statusbar")
//                    var statusBarManager: Class<*>? = null
//                    try {
//                        statusBarManager = Class.forName("android.app.StatusBarManager")
//                    } catch (e: ClassNotFoundException) {
//                        e.printStackTrace()
//                    }
//                    var collapseStatusBar: Method? = null
//                    try {
//                        collapseStatusBar = if (Build.VERSION.SDK_INT > 16) {
//                            statusBarManager?.getMethod("collapsePanels")
//                        } else {
//                            statusBarManager?.getMethod("collapse")
//                        }
//                    } catch (e: NoSuchMethodException) {
//                        e.printStackTrace()
//                    }
//                    collapseStatusBar?.isAccessible = true
//                    try {
//                        collapseStatusBar?.invoke(statusBarService)
//                    } catch (e: IllegalArgumentException) {
//                        e.printStackTrace()
//                    } catch (e: IllegalAccessException) {
//                        e.printStackTrace()
//                    } catch (e: java.lang.reflect.InvocationTargetException) {
//                        e.printStackTrace()
//                    }
//                    if (!currentFocus && !isPaused) {
//                        collapseNotificationHandler?.postDelayed(this, 100L)
//                    }
//                }
//            }, 300L)
//        }
//    }

//    override fun onPause() {
//        super.onPause()
//        isPaused = true
//    }
//
//    override fun onResume() {
//        super.onResume()
//        isPaused = false
//    }

}
