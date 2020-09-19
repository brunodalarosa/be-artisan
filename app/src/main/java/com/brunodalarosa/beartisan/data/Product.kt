package com.brunodalarosa.beartisan.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "products")
data class Product(
    val name: String,
    val description: String,
    val price: Double,
    val stock: Int
) {
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0
}