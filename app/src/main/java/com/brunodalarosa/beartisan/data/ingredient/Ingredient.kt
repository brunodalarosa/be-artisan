package com.brunodalarosa.beartisan.data.ingredient

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "ingredients")
data class Ingredient(
    val name: String,
    val category: Long,
    val measure: InventoryUnitMeasure,
    val inventory: Int,
) {
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0
}