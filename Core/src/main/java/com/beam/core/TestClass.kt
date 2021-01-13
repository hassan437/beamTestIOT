package com.beam.core

import android.content.Context
import android.widget.Toast




class TestClass {

    fun showToast(c: Context?, message: String?) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
    }
}