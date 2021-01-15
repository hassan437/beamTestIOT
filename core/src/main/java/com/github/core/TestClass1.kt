package com.github.core

import android.content.Context
import android.widget.Toast

class TestClass1 {

    fun showToast1(c: Context?, message: String?) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
    }
}