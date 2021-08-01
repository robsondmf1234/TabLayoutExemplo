package com.example.tablayout4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val listaDeTitulos: MutableList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pager.adapter = MyFragmentAdapter(this)
        TabLayoutMediator(tabs, pager) { tab, position ->
            tab.text = "Aba $position"
        }.attach()
    }
}