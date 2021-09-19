package com.patika.homework3.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.patika.homework3.ui.MainActivity

abstract class BaseFragment : Fragment(), FragmentInterface {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(getLayoutID(), container, false)
    }

    override fun onResume() {
        super.onResume()

        val baseActivity = activity as MainActivity
        if(isNavigationbarVisible())
            baseActivity.showNavigation()
        else
            baseActivity.hideNavigation()


    }

    abstract fun getLayoutID() : Int


}