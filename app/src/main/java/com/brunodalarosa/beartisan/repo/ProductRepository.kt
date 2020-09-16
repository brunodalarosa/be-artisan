package com.brunodalarosa.beartisan.repo

import androidx.lifecycle.LiveData
import com.brunodalarosa.beartisan.data.AppDatabase
import com.brunodalarosa.beartisan.data.Product
import javax.inject.Inject

class ProductRepository @Inject constructor(appDatabase: AppDatabase) {

    private val productDao = appDatabase.productDao()

    val allProducts: LiveData<List<Product>> = productDao.getAll()

    suspend fun insert(product: Product) {
        productDao.insert(product)
    }
}