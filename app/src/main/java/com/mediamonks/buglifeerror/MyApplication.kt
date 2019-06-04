package com.mediamonks.buglifeerror

import android.app.Application
import com.buglife.sdk.Buglife
import com.buglife.sdk.InvocationMethod

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        Buglife.initWithApiKey(this, "7yMgRsl1AzstFqU66kr2Fwtt")
        Buglife.setInvocationMethod(InvocationMethod.SCREENSHOT)
    }

}
