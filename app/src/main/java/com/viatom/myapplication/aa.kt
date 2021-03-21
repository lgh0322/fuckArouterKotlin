package com.viatom.myapplication

import android.app.Application
import com.alibaba.android.arouter.BuildConfig
import com.alibaba.android.arouter.launcher.ARouter

class aa:Application() {
    override fun onCreate() {
        super.onCreate()

            ARouter.openLog();     // 打印日志
            ARouter.openDebug();

        ARouter.init(this);

    }
}