package com.example.whatsapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class fragment_adpter(mainActivity: MainActivity,supportFragmentManager:  FragmentManager):
           FragmentPagerAdapter(supportFragmentManager) {
    override fun getCount(): Int {
        return 3;
    }

    override fun getItem(position: Int): Fragment {
   return when(position) {
       0 -> chatFragment()
       1 -> statusFragment()
       else -> callFragment()
   }
    }
}
