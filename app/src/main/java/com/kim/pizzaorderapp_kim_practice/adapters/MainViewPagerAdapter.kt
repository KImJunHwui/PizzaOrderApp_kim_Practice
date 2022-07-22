package com.kim.pizzaorderapp_kim_practice.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.PagerAdapter
import com.kim.pizzaorderapp_kim_practice.fragments.ChickenStoreListFragment
import com.kim.pizzaorderapp_kim_practice.fragments.PizzaStoreListFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm){

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){

            0 -> "피자 가게"
            else -> "치킨 가게"
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        return when(position){

            0 -> ChickenStoreListFragment()
            else -> PizzaStoreListFragment()
        }
    }
}