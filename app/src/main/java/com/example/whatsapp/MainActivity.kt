package com.example.whatsapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    lateinit var view_pager: ViewPager
    lateinit var tab_view: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding()

        tab_view.addTab(tab_view.newTab().setText("CHAT"))
        tab_view.addTab(tab_view.newTab().setText("STATUS"))
        tab_view.addTab(tab_view.newTab().setText("CALL"))

        var adapter = fragment_adpter(this, supportFragmentManager)
        view_pager.adapter = adapter

        view_pager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tab_view))

        tab_view.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                view_pager.currentItem = tab!!.position
            }
            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }
            override fun onTabReselected(tab: TabLayout.Tab?) {
            }
        })
    }

    private fun binding()
    {
        tab_view = findViewById<TabLayout>(R.id.tab_view)
        view_pager = findViewById<ViewPager>(R.id.view_pager)
    }
}



