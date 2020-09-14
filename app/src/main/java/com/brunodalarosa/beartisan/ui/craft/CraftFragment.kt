package com.brunodalarosa.beartisan.ui.craft

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.brunodalarosa.beartisan.R
import com.brunodalarosa.beartisan.databinding.FragmentCraftBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CraftFragment : Fragment() {

    private val craftViewModel: CraftViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentCraftBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_craft,
            container,
            false
        )

        binding.lifecycleOwner = this
        binding.viewmodel = craftViewModel

        return binding.root
    }
}