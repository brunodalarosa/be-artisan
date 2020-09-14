package com.brunodalarosa.beartisan.ui.sell

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SellViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is the sell Fragment"
    }
    val text: LiveData<String> = _text
}