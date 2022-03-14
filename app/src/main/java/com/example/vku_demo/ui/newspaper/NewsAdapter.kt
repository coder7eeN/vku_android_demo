package com.example.vku_demo.ui.newspaper

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.vku_demo.databinding.ItemRecyclerNewsBinding

/**
 * @author huypham on 3/14/22
 */
class NewsAdapter(val context: Context): RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val binding =
            ItemRecyclerNewsBinding.inflate(LayoutInflater.from(context), parent, false)
        return NewsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    inner class NewsViewHolder(val binding: ItemRecyclerNewsBinding): RecyclerView.ViewHolder(binding.root) {

    }
}
