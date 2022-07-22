package com.kim.pizzaorderapp_kim_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kim.pizzaorderapp_kim_practice.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    lateinit var mvpa : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }
    override fun setupEvents() {

    }

    override fun setValues() {

        mvpa = MainViewPagerAdapter(supportFragmentManager)
        mainViewPager.adapter = mvpa


    mainTabLayout.setupWithViewPager(mainViewPager)

    }




}