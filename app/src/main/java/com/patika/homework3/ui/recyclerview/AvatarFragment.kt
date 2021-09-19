package com.patika.homework3.ui.recyclerview

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import com.patika.homework3.R
import com.patika.homework3.base.BaseFragment
import com.patika.homework3.base.BaseRecyclerViewClickListener
import com.patika.homework3.ui.recyclerview.adapter.AvatarRecyclerviewAdapter
import com.patika.homework3.ui.recyclerview.model.AvatarModel
import kotlinx.android.synthetic.main.fragment_avatar.*


class AvatarFragment : BaseFragment() {

    private lateinit var avatarRecyclerviewAdapter: AvatarRecyclerviewAdapter

    override fun getLayoutID() = R.layout.fragment_avatar

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        prepareView()
    }

    override fun isNavigationbarVisible() = false

    fun prepareView() {

        //prepare avatar objects
        var avatarList = listOf(
            AvatarModel(0, 0, "Kullanıcı adınızı oluşturun ve size uygun bir avatar seçin"),
            AvatarModel(1, R.drawable.ic_avatar01),
            AvatarModel(2, R.drawable.ic_avatar02),
            AvatarModel(3, R.drawable.ic_avatar03),
            AvatarModel(4, R.drawable.ic_avatar04),
            AvatarModel(5, R.drawable.ic_avatar05),
            AvatarModel(6, R.drawable.ic_avatar06),
            AvatarModel(7, R.drawable.ic_avatar07),
            AvatarModel(8, R.drawable.ic_avatar08),
            AvatarModel(9, R.drawable.ic_avatar09),
            AvatarModel(10, R.drawable.ic_avatar01),
            AvatarModel(11, R.drawable.ic_avatar02),
            AvatarModel(12, R.drawable.ic_avatar03),
            AvatarModel(13, R.drawable.ic_avatar04),
            AvatarModel(14, R.drawable.ic_avatar05),
            AvatarModel(15, R.drawable.ic_avatar06),
            AvatarModel(16, R.drawable.ic_avatar07),
            AvatarModel(17, R.drawable.ic_avatar08),
            AvatarModel(18, R.drawable.ic_avatar09)
        )

        //Customize gridlayout by position
        val layoutManager = GridLayoutManager(this.context, 3)
        layoutManager.spanSizeLookup = object : GridLayoutManager.SpanSizeLookup() {
            override fun getSpanSize(position: Int): Int {
                return when (position) {
                    0 -> 3
                    else -> 1
                }
            }
        }
        recyclerview.layoutManager = layoutManager
        avatarRecyclerviewAdapter = AvatarRecyclerviewAdapter(avatarList)
        recyclerview.adapter = avatarRecyclerviewAdapter

    }

}

