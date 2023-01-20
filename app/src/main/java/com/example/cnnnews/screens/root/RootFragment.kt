package com.example.cnnnews.screens.root

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import com.example.cnnnews.R
import com.example.cnnnews.ViewPageAdapter
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.fragment_root.view.*


class RootFragment : Fragment() {

    private var ctx: Context?= null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        ctx = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =inflater.inflate(R.layout.fragment_root,container,false)
        view.tabLayout.tabIconTint = null
        view.viewPager.adapter = ViewPageAdapter(ctx as FragmentActivity)
        TabLayoutMediator(view.tabLayout,view.viewPager){ tab,pos->
            when(pos){
                0->{
                    tab.setIcon(R.drawable.home_icon)
                }
                1->{
                    tab.setIcon(R.drawable.bookmark_icon)
                }
            }
        }.attach()

        return view
    }


}