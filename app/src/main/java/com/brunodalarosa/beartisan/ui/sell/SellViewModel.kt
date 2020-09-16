package com.brunodalarosa.beartisan.ui.sell

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.brunodalarosa.beartisan.repo.ProductRepository

class SellViewModel @ViewModelInject constructor(productRepository: ProductRepository) :
    ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is the sell Fragment"
    }

    val text: LiveData<String> = _text
}