package com.example.myapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R

class ProductListFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_products, container, false)
    }

    private lateinit var backButton: Button


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        backButton = requireActivity().findViewById<Button>(R.id.back_product_list)
        backButton.setOnClickListener{
            findNavController().navigate(R.id.action_basketFragment_to_mainFragment)
        }


    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ProductListFragment().apply {

            }
    }
}