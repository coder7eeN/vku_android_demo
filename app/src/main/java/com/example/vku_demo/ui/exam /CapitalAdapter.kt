package com.example.vku_demo.ui.exam

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.vku_demo.databinding.ItemRecyclerCapitalBinding
import kotlin.random.Random

/**
 * @author huypham on 3/15/22
 */
class CapitalAdapter(
    private val context: Context,
    private val capitals: MutableList<String>,
    private val cols: MutableList<Int>
) : RecyclerView.Adapter<CapitalAdapter.CapitalViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CapitalViewHolder {
        val binding =
            ItemRecyclerCapitalBinding.inflate(LayoutInflater.from(context), parent, false)
        return CapitalViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CapitalViewHolder, position: Int) {
        val capitalName = capitals[position]
        val randomIndex = Random.nextInt(cols.size)
        val col = cols[randomIndex]

        holder.bindData(capitalName, col)
    }

    override fun getItemCount(): Int = capitals.size

    inner class CapitalViewHolder(val binding: ItemRecyclerCapitalBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindData(capitalName: String, col: Int) {
            binding.tvCapitalName.text = capitalName
            binding.clCapital.setBackgroundResource(col)
        }
    }
}
