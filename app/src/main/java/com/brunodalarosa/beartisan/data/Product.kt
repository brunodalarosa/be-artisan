package com.brunodalarosa.beartisan.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "products")
data class Product(
    @PrimaryKey(autoGenerate = true) val id: Long,
    val name: String,
    val description: String,
    val stock: Int,
    val price: Double
)