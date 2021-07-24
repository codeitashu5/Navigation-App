package com.ashupandey.navigationapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.ashupandey.navigationapp.databinding.FragmentTechnologyBinding
import com.ashupandey.navigationapp.recycler.techonolgy.CustomRecyclerTechno

class FragmentTechnology : Fragment() {
    //because the layout the view are been created and destroyed several time in the app
    private  var _binding : FragmentTechnologyBinding? = null
    //so we do not have to use ?. where we know that it not going to be null for sure
    private val binding get() = _binding!!

    //in the onCreate
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //here we inflate the layout and return the view having the root
        _binding = FragmentTechnologyBinding.inflate(inflater
            ,container,
            false)
        //got the root view containing
        val view = binding.root
        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
     // I Will be using an recycler view to display these technologies
        val list  =  listOf("Android","web Dev","cloud","Ios DEV","Django","IOT","Rubey","kiCKASS DEV","madness")
        binding.recyclerView.adapter = CustomRecyclerTechno(list)
        binding.recyclerView.layoutManager = GridLayoutManager(requireContext(),4)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}