package com.viatom.fa

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route

@Route(path="/zu/wa")
class Ga:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(TextView(this).apply {
            text="sdlkjfjlksdljkfjlksdqqqqqqqqqqqqqqqqq"
        })
    }
}