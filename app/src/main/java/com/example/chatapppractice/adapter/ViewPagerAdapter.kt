package com.example.chatapppractice.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.chatapppractice.tabFragment.CallsFragment
import com.example.chatapppractice.tabFragment.ChatFragment
import com.example.chatapppractice.tabFragment.StatusFragment

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) : FragmentStateAdapter(fragmentManager,lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0-> ChatFragment()
            1-> StatusFragment()

            2-> CallsFragment()
            else ->
            {
                Fragment()
            }

        }
    }
}