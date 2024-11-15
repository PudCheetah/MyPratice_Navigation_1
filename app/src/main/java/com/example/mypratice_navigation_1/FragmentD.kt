package com.example.mypratice_navigation_1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.example.mypratice_navigation_1.databinding.FragmentABinding
import com.example.mypratice_navigation_1.databinding.FragmentDBinding

class FragmentD : Fragment() {
    private lateinit var binding: FragmentDBinding

    //A、B採用了傳統方法，C、D採用擴展函數

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDBinding.inflate(inflater, container, false)
        val navController = findNavController()
        binding.button4.setOnClickListener {
            navController.navigate(R.id.action_fragmentD_to_fragmentA)
        }
        return binding.root
    }
}