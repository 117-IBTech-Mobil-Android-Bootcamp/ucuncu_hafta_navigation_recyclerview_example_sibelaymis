package com.patika.homework3.ui.recyclerview.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContentProviderCompat
import androidx.fragment.app.Fragment
import com.example.patikadev.utils.onBack
import com.patika.homework3.R
import com.patika.homework3.base.BaseFragment

class DecksFragment : BaseFragment() {

    override fun getLayoutID(): Int = R.layout.fragment_decks

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onBack()
    }
}