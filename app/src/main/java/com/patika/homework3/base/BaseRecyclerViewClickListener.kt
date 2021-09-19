package com.patika.homework3.base

import com.patika.homework3.ui.recyclerview.model.AvatarModel

interface BaseRecyclerViewClickListener<T> {
    fun onItemClicked(clickedObject: T,position: Int)
}