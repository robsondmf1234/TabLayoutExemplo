package com.example.tablayout4

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class MyFragmentAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    //retorna a quantidade de abas que tera no Tablayout
    override fun getItemCount(): Int {
        return 5
    }

    override fun createFragment(position: Int): Fragment {
        return SimpleFragment.newInstance("Position: ${position}")
    }
}