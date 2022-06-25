package com.busrayalcin.fragmentshomework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.busrayalcin.fragmentshomework.databinding.FragmentPageABinding


class PageAFragment : Fragment() {

    private lateinit var binding:FragmentPageABinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentPageABinding.inflate(inflater,container,false)
        binding.buttonPageB.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_pageAFragment_to_pageBFragment)
        }

        return binding.root
    }

}