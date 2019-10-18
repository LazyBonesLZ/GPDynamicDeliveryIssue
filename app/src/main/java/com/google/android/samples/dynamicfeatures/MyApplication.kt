package com.google.android.samples.dynamicfeatures

import android.app.Activity
import android.app.Application
import android.content.Context
import android.os.Bundle
import androidx.multidex.MultiDex
import androidx.multidex.MultiDexApplication
import com.google.android.play.core.splitcompat.SplitCompat

class MyApplication:MultiDexApplication(),Application.ActivityLifecycleCallbacks {
    override fun onActivityPaused(p0: Activity?) {
        
    }

    override fun onActivityResumed(p0: Activity?) {
        
    }

    override fun onActivityStarted(p0: Activity?) {
        
    }

    override fun onActivityDestroyed(p0: Activity?) {
        
    }

    override fun onActivitySaveInstanceState(p0: Activity?, p1: Bundle?) {
        
    }

    override fun onActivityStopped(p0: Activity?) {
        
    }

    override fun onActivityCreated(p0: Activity?, p1: Bundle?) {
        
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
        SplitCompat.install(this)
    }

    override fun onCreate() {
        super.onCreate()
        registerActivityLifecycleCallbacks(this)
    }
}