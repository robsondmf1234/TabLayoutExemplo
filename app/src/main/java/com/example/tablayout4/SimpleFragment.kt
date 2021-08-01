package com.example.tablayout4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class SimpleFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? =
        TextView(requireContext()).apply {
        text = arguments?.getString("text") ?: ""
    }

    companion object {
        fun newInstance(s: String) = SimpleFragment().apply {
                arguments = Bundle().apply {
                    putString("text", s)
                }
            }
    }
}