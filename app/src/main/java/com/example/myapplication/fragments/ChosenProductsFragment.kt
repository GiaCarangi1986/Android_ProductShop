package com.example.myapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.adapters.ProductItemRecyclerViewAdapter
import com.example.myapplication.model.ProductItem

class ChosenProductsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chosen_products, container, false)
    }

    private lateinit var productsRecyclerView: RecyclerView
    private lateinit var productsInBasketList: List<ProductItem>

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var product1: ProductItem = ProductItem()
        var product2: ProductItem = ProductItem()
        var product3: ProductItem = ProductItem()

        var product4: ProductItem = ProductItem()
        var product5: ProductItem = ProductItem()
        var product6: ProductItem = ProductItem()
        var product7: ProductItem = ProductItem()
        var product8: ProductItem = ProductItem()
        var product9: ProductItem = ProductItem()


        product1.name = "Яблоко"
        product1.cost = 7.0
        product1.count = 100
        product1.labelForCost = "кг/руб"

        product2.name = "Груша"
        product2.cost = 70.0
        product2.count = 23
        product2.labelForCost = "кг/руб"

        product3.name = "Банан"
        product3.cost = 12.0
        product3.count = 123
        product3.labelForCost = "кг/руб"

        product4.name = "Яблоко"
        product4.cost = 7.0
        product4.count = 100
        product4.labelForCost = "кг/руб"

        product5.name = "Груша"
        product5.cost = 70.0
        product5.count = 23
        product5.labelForCost = "кг/руб"

        product6.name = "Банан"
        product6.cost = 12.0
        product6.count = 123
        product6.labelForCost = "кг/руб"

        product7.name = "Банан"
        product7.cost = 12.0
        product7.count = 123
        product7.labelForCost = "кг/руб"

        product8.name = "Яблоко"
        product8.cost = 7.0
        product8.count = 100
        product8.labelForCost = "кг/руб"

        product9.name = "Груша"
        product9.cost = 70.0
        product9.count = 23
        product9.labelForCost = "кг/руб"


        productsInBasketList = mutableListOf(
            product1,
            product2,
            product3,
            product4,
            product5,
            product6,
            product7,
            product8,
            product9
        )

        var adapter: ProductItemRecyclerViewAdapter = ProductItemRecyclerViewAdapter(
            productsInBasketList as MutableList<ProductItem>
        )

        productsRecyclerView = view.findViewById<RecyclerView>(R.id.productsRecyclerView)
        productsRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        productsRecyclerView.adapter = adapter
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ChosenProductsFragment().apply {

            }
    }
}