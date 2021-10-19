package com.example.myapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.adapters.CategoryRecyclerViewAdapter
import com.example.myapplication.model.Category

class CategoryFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    private lateinit var categoryRecyclerView: RecyclerView
    private lateinit var categoriesList : List<Category>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_category, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var product1 : Category = Category("Молочные продукты")
        var product2 : Category = Category("Овощи")
        var product3 : Category = Category("Винные изделия")

        var product4 : Category = Category("Фрукты")
        var product5 : Category = Category("Мясные изделия")
        var product6 : Category = Category("Хлебобулочные изделия")
        var product7: Category = Category("Ягоды")



        categoriesList = mutableListOf(product1, product2, product3, product4, product5, product6,product7)

        var adapter : CategoryRecyclerViewAdapter = CategoryRecyclerViewAdapter(
            categoriesList as MutableList<Category>
        )

        categoryRecyclerView = requireActivity().findViewById<RecyclerView>(R.id.categoryRecyclerView)
        categoryRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        categoryRecyclerView.adapter = adapter

    }

    companion object {

        @JvmStatic
        fun newInstance() =
            CategoryFragment().apply {
            }
    }
}