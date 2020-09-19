package com.brunodalarosa.beartisan.repo

import androidx.lifecycle.LiveData
import com.brunodalarosa.beartisan.data.AppDatabase
import com.brunodalarosa.beartisan.data.Product
import com.brunodalarosa.beartisan.data.ProductDao
import javax.inject.Inject

class ProductRepository @Inject constructor(appDatabase: AppDatabase) {

    private val productDao = appDatabase.productDao()

    val allProducts: LiveData<List<Product>> = productDao.getAll()

    suspend fun insert(product: Product) {
        productDao.insert(product)
    }

    // Testing methods
    suspend fun populateDatabaseWithTestData() {
        val BombomMorango = Product("Bombom de morango", "bem gostoso", 3.5, 5)
        val BoloCenoura = Product("Bolo de cenoura", "com muita cobertura de chocolate", 2.5, 5)
        val Cafe = Product("Cafe", "Moído na hora!", 2.0, 10)

        productDao.insert(BombomMorango)
        productDao.insert(BoloCenoura)
        productDao.insert(Cafe)
    }
}