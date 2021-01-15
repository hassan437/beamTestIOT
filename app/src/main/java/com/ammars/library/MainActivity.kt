package com.ammars.library

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.beam.core.TestClass

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val test = TestClass()
        test.showToast(applicationContext, "Hi")
    }
}