package com.brunodalarosa.beartisan.data.ingredient

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface IngredientDao {

    @Query("SELECT * from ingredients")
    fun getAll(): LiveData<List<Ingredient>>

    @Insert(onConflict = OnConflictStrategy.ABORT)
    suspend fun insert(ingredient: Ingredient)

    @Query("DELETE FROM ingredients")
    suspend fun clear()

    @Query("SELECT COUNT(*) from ingredients")
    fun getTotalCount(): Int
}