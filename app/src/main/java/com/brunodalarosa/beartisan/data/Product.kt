package com.brunodalarosa.beartisan.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "products")
data class Product(
    val name: String,
    val description: String,
    val stock: Int,
    val price: Double
) {
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0
}