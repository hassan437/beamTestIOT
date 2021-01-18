package com.ammars.core

import android.content.Context
import android.widget.Toast
import java.math.BigDecimal

class Convertor {

    fun showToast1(c: Context?, message: String?) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
    }

    fun add(x: BigDecimal, y: BigDecimal?): BigDecimal? {
        return x.add(y)
    }

    fun substract(x: BigDecimal, y: BigDecimal?): BigDecimal? {
        return x.subtract(y)
    }

    fun multiply(x: BigDecimal, y: BigDecimal?): BigDecimal? {
        return x.multiply(y)
    }

    fun divide(x: BigDecimal, y: BigDecimal?): BigDecimal? {
        return x.divide(y)
    }
}