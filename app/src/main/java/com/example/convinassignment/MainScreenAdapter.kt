package com.example.convinassignment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.convinassignment.databinding.ListItemRecyclerViewBinding

class MainScreenAdapter: RecyclerView.Adapter<MainScreenAdapter.MainScreenViewHolder>() {

    private lateinit var binding: ListItemRecyclerViewBinding
    val emptyList = ArrayList<String>()



    inner class MainScreenViewHolder(val binding: ListItemRecyclerViewBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainScreenViewHolder {
        binding = ListItemRecyclerViewBinding.inflate(LayoutInflater.from(parent.context))
        return MainScreenViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MainScreenViewHolder, position: Int) {
        holder.binding.tvNumber.text =emptyList[position]
    }

    override fun getItemCount(): Int {
        return emptyList.size
    }

    fun addValueOnSwipe() {
    emptyList.add((emptyList.size + 1).toString())
        notifyDataSetChanged()
    }


}