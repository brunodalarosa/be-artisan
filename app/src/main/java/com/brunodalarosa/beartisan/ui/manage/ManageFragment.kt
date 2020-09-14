package com.brunodalarosa.beartisan.ui.manage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.brunodalarosa.beartisan.R
import com.brunodalarosa.beartisan.databinding.FragmentManageBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ManageFragment : Fragment() {

    private val manageViewModel: ManageViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentManageBinding = DataBindingUtil.inflate(
                inflater,
                R.layout.fragment_manage,
                container,
                false
            )

        binding.lifecycleOwner = this
        binding.viewmodel = manageViewModel

        return binding.root
    }
}