package com.brunodalarosa.beartisan.ui.product

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.brunodalarosa.beartisan.R
import com.brunodalarosa.beartisan.data.product.Product
import com.brunodalarosa.beartisan.databinding.ActivityNewProductBinding
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.AndroidEntryPoint
import java.lang.Exception

@AndroidEntryPoint
class NewProductActivity : AppCompatActivity() {

    private val newProductViewModel: NewProductViewModel by viewModels()

    private lateinit var binding: ActivityNewProductBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityNewProductBinding = DataBindingUtil.setContentView(this, R.layout.activity_new_product)
        binding.lifecycleOwner = this
        binding.executePendingBindings()

        binding.btnBack.setOnClickListener { onBackPressed() }
        binding.btnSave.setOnClickListener { onSaveButtonClicked() }

        this.binding = binding
    }

    private fun onSaveButtonClicked() {
        if (validateNewProductInputs()) {
            val name = binding.etName.text.toString()
            val description = binding.etDescription.text.toString()
            val price = binding.etPrice.text.toString().toDouble()
            val stock = if (binding.etStock.text.toString().isEmpty()) 0 else binding.etStock.text.toString().toInt()

            newProductViewModel.insertProduct(Product(name, description, price, stock))

            setResult(RESULT_OK)
            finish()
        } else {
            Snackbar.make(binding.root, getString(R.string.new_product_generic_error), Snackbar.LENGTH_SHORT).show()
        }
    }

    private fun validateNewProductInputs(): Boolean {
        if (binding.etName.text.toString().isEmpty()) return false

        try {
            val productPrice: Double = binding.etPrice.text.toString().toDouble()
            if (productPrice <= 0) return false
        } catch (exception: Exception) {
            return false
        }

        try {
            val productStock: Int = if (binding.etStock.text.toString().isEmpty()) 0 else binding.etStock.text.toString().toInt()
            if (productStock < 0) return false
        } catch (exception: Exception) {
            return false
        }

        return true
    }

    override fun onBackPressed() {
        setResult(RESULT_CANCELED)
        finish()
    }
}