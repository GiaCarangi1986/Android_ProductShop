package com.example.myapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentContainerView
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.myapplication.R

private const val ARG_PARAM1 = "windowType"

class BasketFragment : Fragment() {

    private var windowType: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            windowType = it.getString(ARG_PARAM1)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_basket, container, false)
    }

    private lateinit var backButton: Button
    private lateinit var homeButton: Button
    private lateinit var fragmentContainerView : FragmentContainerView


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fragmentContainerView = requireActivity().findViewById(R.id.fragmentContainerView2)

        var navController = Navigation.findNavController(requireActivity(), R.id.fragmentContainerView2)
        var navControllerMain = Navigation.findNavController(requireActivity(), R.id.fragmentContainerView)

        if(windowType.equals("category")){
//            val navHostFragment = requireActivity().supportFragmentManager.findFragmentById(R.id.fragmentContainerView2) as NavHostFragment
//            val navController = navHostFragment.navController
//            navController.navigate(R.id.categoryFragment)

            navController.navigate(R.id.categoryFragment)
        }

        backButton = requireActivity().findViewById<Button>(R.id.back_basket)
        backButton.setOnClickListener{
            findNavController().navigate(R.id.action_basketFragment_to_mainFragment)
        }
        homeButton = requireActivity().findViewById<Button>(R.id.home_backet)
        homeButton.setOnClickListener{
            findNavController().navigate(R.id.action_basketFragment_to_mainFragment)
        }

    }

    companion object {
        @JvmStatic
        fun newInstance(windowType: String) =
            BasketFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, windowType)
                }
            }
    }
}