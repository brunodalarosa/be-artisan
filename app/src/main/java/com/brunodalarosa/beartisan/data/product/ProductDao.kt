package com.brunodalarosa.beartisan.data.product

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface ProductDao {

    @Query("SELECT * from products")
    fun getAll(): LiveData<List<Product>>

    @Insert(onConflict = OnConflictStrategy.ABORT)
    suspend fun insert(product: Product)

    @Query("DELETE FROM products")
    suspend fun clear()

    @Query("SELECT COUNT(*) from products")
    fun getTotalCount(): Int

}