package com.example.shaurmasvelimikvarsogond

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class photosAdapter(private var links:List<photos>, private val context: Context): RecyclerView.Adapter<photosAdapter.ImageViewHolder>() {
    class ImageViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val photoView: ImageView = itemView.findViewById(R.id.imageView)
    }

    override fun getItemCount(): Int = links.size

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val p = links[position]

        Glide.with(context)
            .load(p.link)
            .placeholder(R.drawable.ic_launcher_background)
            .centerCrop()
            .into(holder.photoView)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.photo_main, parent, false)
        return ImageViewHolder(view)
    }
}