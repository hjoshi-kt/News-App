package com.example.newsapp.listeners

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.core.app.NotificationCompat
import androidx.core.content.ContextCompat.startActivity
import com.example.newsapp.R
import com.example.newsapp.util.Utils
import com.moengage.pushbase.model.NotificationPayload
import com.moengage.pushbase.push.PushMessageListener


class CustomPushMessageListener : PushMessageListener() {

    override fun onCreateNotification(
        context: Context,
        notificationPayload: NotificationPayload
    ): NotificationCompat.Builder? {
//        Log.d(Utils.NEWS_APP_LOG,"notification received")
//        Log.d(Utils.NEWS_APP_LOG, notificationPayload.toString())

        return super.onCreateNotification(context, notificationPayload)

//        return NotificationCompat
//            .Builder(context, notificationPayload.channelId)
//            .setSmallIcon(R.drawable.location)
//            .setContentTitle(notificationPayload.text.message)
    }

    override fun onNotificationReceived(context: Context, payload: Bundle) {
//        Log.d(Utils.NEWS_APP_LOG, "notification received")
//        Log.d(Utils.NEWS_APP_LOG, payload.toString())
        super.onNotificationReceived(context, payload)
    }

    override fun onNotificationClick(activity: Activity, payload: Bundle): Boolean {
//        Log.d(Utils.NEWS_APP_LOG, "notification clicked")
//        Log.d(Utils.NEWS_APP_LOG, payload.toString())
//        var show = "true"
//        payload.getString("show")?.let { show = it }
//        if (show == "false") {
//            activity.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.github.com")))
//        } else {
//            activity.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com")))
//        }
        return true
    }

    override fun isNotificationRequired(context: Context, payload: Bundle): Boolean {
//        Log.d(Utils.NEWS_APP_LOG, "check show notification")
//        Log.d(Utils.NEWS_APP_LOG, payload.toString())
//        var show = "true"
//        payload.getString("show")?.let { show = it }
        return super.isNotificationRequired(context, payload)
//        return show.toBoolean()
    }

    override fun handleCustomAction(context: Context, payload: String) {
//        Log.d(Utils.NEWS_APP_LOG, "custom action")
//        Log.d(Utils.NEWS_APP_LOG, payload)
        super.handleCustomAction(context, payload)
    }
}