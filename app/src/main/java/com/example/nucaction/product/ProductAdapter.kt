package com.example.nucaction.product

import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.nucaction.R

class ProductAdapter(private val productList: List<Product>) : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    class ProductViewHolder private constructor(view: View) : RecyclerView.ViewHolder(view) {

        private val imageView: ImageView = view.findViewById(R.id.product_image)
        private val titleView: TextView = view.findViewById(R.id.product_title)
        private val subtitleView: TextView = view.findViewById(R.id.product_subtitle)
        private val imageSize: Int = view.resources.getDimensionPixelOffset(R.dimen.product_item_image_size)

        fun bindProduct(product: Product) {
            imageView.setImageDrawable(null)
            if (!TextUtils.isEmpty(product.imageUrl)) {
                ImageDownloadTask(imageView, imageSize).execute(product.imageUrl)
            } else {
                imageView.setImageResource(R.drawable.logo_google_cloud)
            }
            titleView.text = product.title
            subtitleView.text = product.subtitle
        }

        companion object {
            fun create(parent: ViewGroup) =
                ProductViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.product_item, parent, false))
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder =
        ProductViewHolder.create(parent)

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.bindProduct(productList[position])
    }

    override fun getItemCount(): Int = productList.size
}
