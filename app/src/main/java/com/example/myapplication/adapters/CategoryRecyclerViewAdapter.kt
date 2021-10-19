package com.example.myapplication.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.model.Category
import com.example.myapplication.model.ProductItem

class CategoryRecyclerViewAdapter(private val categoryList: MutableList<Category>) :
    RecyclerView.Adapter<CategoryRecyclerViewAdapter.ViewHolder>() {
    override fun getItemCount() = categoryList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.seacrh_product_recycler_view_item, parent, false)
        return ViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.categoryTextView!!.text = categoryList.get(position).name
        //TODO: Добавить добавление картинки
    }

    class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {
        var categoryTextView: TextView? = null
        var categoryImageView: ImageView? = null

        init {
            categoryTextView = itemView?.findViewById(R.id.categoryTextView)
            categoryImageView = itemView?.findViewById(R.id.categoryImageView)
        }
    }
}