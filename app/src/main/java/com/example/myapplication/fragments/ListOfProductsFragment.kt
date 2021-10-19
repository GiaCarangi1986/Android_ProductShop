package com.example.myapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.adapters.ProductItemInListRecyclerViewAdapter
import com.example.myapplication.model.ProductItem

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ListOfProductsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ListOfProductsFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.actions_all_produsts_fragment, container, false)
    }

    private lateinit var productsRecyclerView: RecyclerView
    private lateinit var allProductsList : List<ProductItem> ;

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var product1 : ProductItem = ProductItem()
        var product2 : ProductItem = ProductItem()
        var product3 : ProductItem = ProductItem()

        var product4 : ProductItem = ProductItem()
        var product5 : ProductItem = ProductItem()
        var product6 : ProductItem = ProductItem()
        var product7: ProductItem = ProductItem()

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

        allProductsList = mutableListOf(product1, product2, product3, product4, product5, product6,product7)

        var adapter : ProductItemInListRecyclerViewAdapter = ProductItemInListRecyclerViewAdapter(
            allProductsList as MutableList<ProductItem>
        )

        productsRecyclerView = requireActivity().findViewById<RecyclerView>(R.id.products_list_recycler_view)
        productsRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        productsRecyclerView.adapter = adapter
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ChosenProductsFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ChosenProductsFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}