package com.example.credearn.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.credearn.databinding.CategoryitemBinding
import com.example.credearn.model.categoryModelClass

class categoryAdapter(var categoryList:ArrayList<categoryModelClass>):RecyclerView.Adapter<categoryAdapter.MycategoryViewholder>() {
    class MycategoryViewholder(var binding:CategoryitemBinding):RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): categoryAdapter.MycategoryViewholder {
        return MycategoryViewholder(CategoryitemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: categoryAdapter.MycategoryViewholder, position: Int) {
        var dataList=categoryList[position]
        holder.binding.categoryImage.setImageResource(dataList.catImage)
        holder.binding.category.text=dataList.catText
    }

    override fun getItemCount()=categoryList.size

}