package com.example.mypratice_navigation_1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.mypratice_navigation_1.databinding.FragmentABinding
import com.example.mypratice_navigation_1.databinding.FragmentCBinding

class FragmentC : Fragment() {
    private lateinit var binding: FragmentCBinding

    //A、B採用了傳統方法，C、D採用擴展函數

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCBinding.inflate(inflater, container, false)
        val navController = findNavController()
        binding.button3.setOnClickListener {
            navController.navigate(R.id.action_fragmentC_to_fragmentD)
        }
        return binding.root
    }
}