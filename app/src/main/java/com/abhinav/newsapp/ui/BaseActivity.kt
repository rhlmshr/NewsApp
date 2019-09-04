package com.abhinav.newsapp.ui

import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity

/**
 * Created by abhinav.sharma on 01/11/17.
 */
open class BaseActivity : AppCompatActivity() {

    fun addFragment(fragment: Fragment, layoutResId: Int, tag : String) {
        supportFragmentManager.beginTransaction()
                .add(layoutResId, fragment, tag)
                .commit()
    }

    fun addFragmentWithBackStack(fragment: Fragment, layoutResId: Int, tag: String){
        supportFragmentManager.beginTransaction()
                .add(layoutResId, fragment, tag)
                .addToBackStack(tag)
                .commit()
    }
}