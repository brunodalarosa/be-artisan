package com.brunodalarosa.beartisan.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.brunodalarosa.beartisan.data.Product
import com.brunodalarosa.beartisan.databinding.SimpleProductRvItemBinding

class ProductsAdapter internal constructor(private val items: List<Product>) :
    RecyclerView.Adapter<ProductsAdapter.ProductViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = SimpleProductRvItemBinding.inflate(inflater)
        return ProductViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) = holder.bind(items[position])

    override fun getItemCount(): Int = items.size

    inner class ProductViewHolder(val binding: SimpleProductRvItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Product) {
            binding.product = item
            binding.executePendingBindings()
        }
    }
}