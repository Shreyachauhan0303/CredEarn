package com.example.credearn.ui.theme.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.credearn.R
import com.example.credearn.adapter.categoryAdapter
import com.example.credearn.databinding.FragmentHomeBinding
import com.example.credearn.model.categoryModelClass

class HomeFragment : Fragment() {

    private val binding: FragmentHomeBinding  by lazy {
        FragmentHomeBinding.inflate(layoutInflater)
    }
    private var categoryList=ArrayList<categoryModelClass>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        categoryList.add(categoryModelClass(R.drawable.scince,"Subject1"))
        categoryList.add(categoryModelClass(R.drawable.english1,"Subject1"))
        categoryList.add(categoryModelClass(R.drawable.history,"Subject1"))
        categoryList.add(categoryModelClass(R.drawable.mathmetic,"Subject1"))
        binding.catRecyclerView.layoutManager=GridLayoutManager(requireContext(),2)
        val adapter=categoryAdapter(categoryList)
        binding.catRecyclerView.adapter=adapter
        binding.catRecyclerView.setHasFixedSize(true)
    }
    companion object{

    }

}