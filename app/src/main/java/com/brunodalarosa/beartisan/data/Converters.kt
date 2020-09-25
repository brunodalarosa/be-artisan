package com.brunodalarosa.beartisan.data

import androidx.room.TypeConverter
import com.brunodalarosa.beartisan.data.ingredient.InventoryUnitMeasure
import java.util.*

class Converters {
    @TypeConverter
    fun fromTimestamp(value: Long?): Date? {
        return value?.let { Date(it) }
    }

    @TypeConverter
    fun dateToTimestamp(date: Date?): Long? {
        return date?.time?.toLong()
    }

    @TypeConverter
    fun toInventoryUnitMeasure(value: Int) = enumValues<InventoryUnitMeasure>()[value]

    @TypeConverter
    fun fromInventoryUnitMeasure(value: InventoryUnitMeasure) = value.code
}