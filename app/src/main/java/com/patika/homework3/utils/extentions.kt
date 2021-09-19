package com.example.patikadev.utils

import android.content.Context
import android.content.Intent
import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.navigation.fragment.findNavController

inline fun<reified T : AppCompatActivity> Context.startActivity(block : Intent.() -> Unit = {}){

    val intent  = Intent(this , T::class.java)
    startActivity(
        intent.also {
            block.invoke(it)
        }
    )
}

fun Fragment.navigateFragment(id:Int){
    findNavController().navigate(id)
}

fun View.visible(){
    this.visibility = View.VISIBLE
}

fun View.gone(){
    this.visibility = View.GONE
}

//Display popup when fragment call on back
fun Fragment.onBack() =
    requireActivity().onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
        override fun handleOnBackPressed() {
            AlertDialog.Builder(requireContext())
                .setTitle("Uyarı")
                .setMessage("Uygulamadan çıkmak istediğinize emin misiniz?")
                .setCancelable(false)
                .setNegativeButton("Evet") {dialog ,_ ->
                    requireActivity().finish()
                }
                .setPositiveButton("Hayır") { dialog, _ ->
                    dialog.dismiss()
                }.show()
        }

    })