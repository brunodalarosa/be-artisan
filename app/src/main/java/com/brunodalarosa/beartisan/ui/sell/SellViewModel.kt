package com.brunodalarosa.beartisan.ui.sell

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.brunodalarosa.beartisan.data.Product
import com.brunodalarosa.beartisan.repo.ProductRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class SellViewModel @ViewModelInject constructor(private val productRepository: ProductRepository) :
    ViewModel() {

    private val _title = MutableLiveData<String>().apply {
        value = "Product list :o"
    }

    val title: LiveData<String> = _title

    val allProducts: LiveData<List<Product>> = productRepository.allProducts

    fun insertProduct(product: Product) = viewModelScope.launch(Dispatchers.IO) {
        productRepository.insert(product)
    }

    // Test methods
    fun PopulateProductTableWithTestData() = viewModelScope.launch(Dispatchers.IO) {
        productRepository.populateDatabaseWithTestData()
    }
}