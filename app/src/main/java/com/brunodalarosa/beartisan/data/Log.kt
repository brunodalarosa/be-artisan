package com.brunodalarosa.beartisan.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "logs")
data class Log(val msg: String, val timestamp: Date) {

    @PrimaryKey(autoGenerate = true)
    var id: Long = 0
}