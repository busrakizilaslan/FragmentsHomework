package com.busrayalcin.fragmentshomework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.busrayalcin.fragmentshomework.databinding.FragmentHomePageBinding


class HomePageFragment : Fragment() {

    private lateinit var binding: FragmentHomePageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentHomePageBinding.inflate(inflater,container,false)

        binding.buttonPageA.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_homePageFragment_to_pageAFragment)
        }

        binding.buttonPageX.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_homePageFragment_to_pageXFragment)
        }

        return binding.root
    }

}