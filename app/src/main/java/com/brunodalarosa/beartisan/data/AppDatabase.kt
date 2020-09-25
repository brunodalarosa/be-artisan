package com.brunodalarosa.beartisan.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.brunodalarosa.beartisan.data.ingredient.Ingredient
import com.brunodalarosa.beartisan.data.ingredient.IngredientDao
import com.brunodalarosa.beartisan.data.product.Product
import com.brunodalarosa.beartisan.data.product.ProductDao

@Database(entities = [Log::class, Product::class, Ingredient::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun logDao(): LogDao
    abstract fun productDao(): ProductDao
    abstract fun ingredientDao(): IngredientDao
}