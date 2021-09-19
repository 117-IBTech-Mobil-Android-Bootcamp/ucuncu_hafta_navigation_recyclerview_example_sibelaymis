package com.patika.homework3.ui.recyclerview.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.patikadev.utils.navigateFragment
import com.example.patikadev.utils.onBack
import com.patika.homework3.R
import com.patika.homework3.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_profile.*

class ProfileFragment : BaseFragment() {

    override fun getLayoutID(): Int = R.layout.fragment_profile


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onBack()
        //Navigate avatar fragment when click edit button
        edit_btn.setOnClickListener {
            navigateFragment(R.id.action_navigation_notifications_to_avatarFragment)
        }

    }
}