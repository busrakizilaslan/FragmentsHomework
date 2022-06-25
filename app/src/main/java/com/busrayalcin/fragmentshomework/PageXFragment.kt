package com.busrayalcin.fragmentshomework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.busrayalcin.fragmentshomework.databinding.FragmentPageXBinding


class PageXFragment : Fragment() {

    private lateinit var binding:FragmentPageXBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentPageXBinding.inflate(inflater,container,false)
        binding.buttonPageY1.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_pageXFragment_to_pageYFragment)
        }
        return binding.root
    }

}