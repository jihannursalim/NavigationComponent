package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponent.databinding.FragmentKeduaBinding

class FragmentKedua : Fragment() {

    lateinit var binding: FragmentKeduaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentKeduaBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnFrDua.setOnClickListener {
            val name = binding.etFrDua.text.toString()
            val bund = Bundle()
            bund.putString("NAMA", name)
            findNavController().navigate(R.id.action_fragmentKedua2_to_fragmentKetiga2, bund)
        }
    }

}