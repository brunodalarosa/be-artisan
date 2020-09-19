package com.brunodalarosa.beartisan.ui.product

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.brunodalarosa.beartisan.data.Product
import com.brunodalarosa.beartisan.repo.ProductRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class NewProductViewModel @ViewModelInject constructor(private val productRepository: ProductRepository) : ViewModel() {

    fun insertProduct(product: Product) = viewModelScope.launch(Dispatchers.IO) {
        productRepository.insert(product)
    }

}