package com.brunodalarosa.beartisan.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Log::class, Product::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun logDao(): LogDao
    abstract fun productDao(): ProductDao
}