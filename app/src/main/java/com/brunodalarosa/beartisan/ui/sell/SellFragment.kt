package com.brunodalarosa.beartisan.ui.sell

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.brunodalarosa.beartisan.R
import com.brunodalarosa.beartisan.databinding.FragmentSellBinding
import com.brunodalarosa.beartisan.ui.adapters.ProductsAdapter
import com.brunodalarosa.beartisan.util.Constants
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SellFragment : Fragment() {

    private val sellViewModel: SellViewModel by viewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val binding: FragmentSellBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_sell,
            container,
            false
        )

        binding.lifecycleOwner = this
        binding.viewmodel = sellViewModel

        if (Constants.debug) {
            sellViewModel.PopulateProductTableWithTestData()
        }

        val adapter = ProductsAdapter(listOf())
        binding.productsRv.adapter = adapter
        binding.productsRv.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)

        return binding.root
    }
}