package com.example.myapplication.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.model.ProductItem

class ProductItemRecyclerViewAdapter (private val productsInBasket: MutableList<ProductItem>) : RecyclerView.Adapter<ProductItemRecyclerViewAdapter.ViewHolder>() {

    override fun getItemCount() = productsInBasket.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.chosen_product_recycler_view_item, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nameOfProductTextView!!.text = productsInBasket.get(position).name
       // holder.searchProductItemTextView!!.text = productsInBasket.get(position).
        holder.priceOfProductTextView!!.text = productsInBasket.get(position).cost.toString()
        holder.unitOfMeasurementTextView!!.text = productsInBasket.get(position).labelForCost
        holder.countOfProductsInCatalogTextView!!.text = productsInBasket.get(position).count.toString()
    }

    class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {
        var searchProductItemTextView: TextView? = null
        var nameOfProductTextView: TextView? = null
        var priceOfProductTextView: TextView? = null
        var unitOfMeasurementTextView: TextView? = null
        var countOfProductsInCatalogTextView: TextView? = null
        init {
            searchProductItemTextView = itemView?.findViewById(R.id.search_product_item_text)
            nameOfProductTextView = itemView?.findViewById(R.id.name_of_product_text)
            priceOfProductTextView = itemView?.findViewById(R.id.price_of_product_chosen_product)
            unitOfMeasurementTextView = itemView?.findViewById(R.id.unit_of_measurement)
            countOfProductsInCatalogTextView = itemView?.findViewById(R.id.count_of_products_in_catalog_text)
        }
    }
}