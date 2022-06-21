package com.example.convinassignment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.convinassignment.databinding.ListItemRecyclerViewBinding

class MainScreenAdapter: RecyclerView.Adapter<MainScreenAdapter.MainScreenViewHolder>() {

    private lateinit var binding: ListItemRecyclerViewBinding

    inner class MainScreenViewHolder(val binding: ListItemRecyclerViewBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainScreenViewHolder {
        binding = ListItemRecyclerViewBinding.inflate(LayoutInflater.from(parent.context))
        return MainScreenViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MainScreenViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }


}