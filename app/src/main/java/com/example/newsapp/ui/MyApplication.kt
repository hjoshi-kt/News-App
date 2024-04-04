package com.example.newsapp.ui

import android.app.Application
import com.example.newsapp.R
import com.example.newsapp.listeners.CustomPushMessageListener
import com.moengage.core.DataCenter
import com.moengage.core.LogLevel
import com.moengage.core.MoECoreHelper
import com.moengage.core.MoEngage
import com.moengage.core.analytics.MoEAnalyticsHelper
import com.moengage.core.config.FcmConfig
import com.moengage.core.config.LogConfig
import com.moengage.core.config.NotificationConfig
import com.moengage.core.config.StorageEncryptionConfig
import com.moengage.core.config.StorageSecurityConfig
import com.moengage.core.enableAdIdTracking
import com.moengage.core.model.UserGender
import com.moengage.pushbase.MoEPushHelper
import java.util.Date

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        val moEngage = MoEngage.Builder(this, "48VL1XKY8O8FKT6MO00XGEWA", DataCenter.DATA_CENTER_1)
            .configureNotificationMetaData(NotificationConfig(R.drawable.location, R.drawable.location, R.color.dark_blue,true, true, false))
            .configureFcm(FcmConfig(false))
            .configureLogs(LogConfig(LogLevel.VERBOSE, true))
            .build()
        MoEngage.initialiseDefaultInstance(moEngage)
        MoEPushHelper.getInstance().registerMessageListener(CustomPushMessageListener())
        MoEAnalyticsHelper.setUniqueId(this, "mo-joshi")
        MoEAnalyticsHelper.setFirstName(this,"Himanshu")
        MoEAnalyticsHelper.setLastName(this,"Joshi")
        MoEAnalyticsHelper.setUserName(this,"Himanshu Joshi")
        MoEAnalyticsHelper.setGender(this,UserGender.MALE)
        MoEAnalyticsHelper.setMobileNumber(this,"8394023254")
        MoEAnalyticsHelper.setBirthDate(this, Date(2024,0,21))
        MoEAnalyticsHelper.setEmailId(this,"himanshu.joshi@moengage.com")
        MoEAnalyticsHelper.setUserAttribute(this,"locality", "Uttarakhand")
        enableAdIdTracking(this)
    }
}