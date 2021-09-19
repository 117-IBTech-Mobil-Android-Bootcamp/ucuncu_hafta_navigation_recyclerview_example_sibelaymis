package com.patika.homework3.ui.recyclerview.fragments

import android.os.Bundle
import android.os.CountDownTimer
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.patikadev.utils.navigateFragment
import com.patika.homework3.R
import com.patika.homework3.base.BaseFragment


class SplashFragment : BaseFragment() {

    override fun getLayoutID(): Int = R.layout.fragment_splash

    private val DELAY  :  Long = 3 * 1000
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //Navigate battle fragment after 3 seconds
        val timer = object: CountDownTimer(DELAY, 1000) {
            override fun onTick(millisUntilFinished: Long) {
            }

            override fun onFinish() {
                navigateFragment(R.id.action_splashFragment_to_navigation_home)
                findNavController().popBackStack(R.id.splashFragment,true)
            }
        }.start()
    }

    //hide bottom navigation bar
    override fun isNavigationbarVisible() = false
}