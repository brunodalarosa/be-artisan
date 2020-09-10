package com.brunodalarosa.beartisan.util

import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject

class DateFormatter @Inject constructor() {

    private val formatter = SimpleDateFormat("dd/mm/yyyy HH:mm:ss", Locale.US)

    fun formatDate(timestamp: Long): String {
        return formatter.format(Date(timestamp))
    }
}