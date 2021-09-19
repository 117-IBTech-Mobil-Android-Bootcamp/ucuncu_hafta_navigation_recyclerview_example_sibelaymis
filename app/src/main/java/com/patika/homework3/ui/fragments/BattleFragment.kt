package com.patika.homework3.ui.recyclerview.fragments

import android.os.Bundle
import android.view.View
import com.example.patikadev.utils.onBack
import com.patika.homework3.R
import com.patika.homework3.base.BaseFragment

class BattleFragment : BaseFragment() {

    override fun getLayoutID(): Int = R.layout.fragment_battle
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onBack()

    }
}