package com.busrayalcin.fragmentshomework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.busrayalcin.fragmentshomework.databinding.FragmentPageBBinding


class PageBFragment : Fragment() {

    private lateinit var binding:FragmentPageBBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentPageBBinding.inflate(inflater,container,false)
        binding.buttonPageY.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_pageBFragment_to_pageYFragment)
        }
        return binding.root
    }

}