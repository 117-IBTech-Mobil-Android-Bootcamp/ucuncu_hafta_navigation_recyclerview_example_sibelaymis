package com.patika.homework3.ui.recyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.example.patikadev.utils.gone
import com.patika.homework3.R
import com.patika.homework3.base.BaseRecyclerViewClickListener
import com.patika.homework3.ui.recyclerview.model.AvatarModel

class AvatarRecyclerviewAdapter(private val avatarList: List<AvatarModel>) :
    RecyclerView.Adapter<AvatarViewHolder>() {

    private var itemClickListener: BaseRecyclerViewClickListener<AvatarModel>? = null
    var lastItemSelectedPos = -1

    constructor(
        avatarList: List<AvatarModel>,
        itemClickListener: BaseRecyclerViewClickListener<AvatarModel>
    ) : this(avatarList) {
        this.itemClickListener = itemClickListener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AvatarViewHolder {
        return AvatarViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.avatar_view, parent, false)
        )
    }

    override fun onBindViewHolder(holder: AvatarViewHolder, position: Int) {
        val avatar = this.avatarList[position]
        holder.setData(avatar)
        holder.customizeItem(position)
        holder.itemView.setOnClickListener {
            if(lastItemSelectedPos!=-1) {
                avatarList[lastItemSelectedPos].isCheck = lastItemSelectedPos == position
                notifyChanges(avatarList[lastItemSelectedPos])
            }
            avatar.isCheck=position==holder.adapterPosition
            notifyChanges(avatar)
            lastItemSelectedPos=holder.adapterPosition
        }

    }

    override fun getItemCount(): Int = this.avatarList.size

    fun notifyChanges(clickedObject:AvatarModel){
        val clickedIndex=this.avatarList.indexOf(clickedObject)
        notifyItemChanged(clickedIndex)
    }

}

class AvatarViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val viewTitle = itemView.findViewById<AppCompatTextView>(R.id.view_title)
    private val avatarIcon = itemView.findViewById<AppCompatImageView>(R.id.avatar_icon)
    private val checkboxImageView =itemView.findViewById<AppCompatImageView>(R.id.checkbox_imageview)


    //Set avatar data to view
    fun setData(avatar: AvatarModel) {
        viewTitle.text = avatar.text
        avatarIcon.setImageResource(avatar.icon)
        checkboxImageView.setImageResource(if (avatar.isCheck) R.drawable.ic_success_outline else R.drawable.ic_avatarbg)
    }

    //Customize avatar by position
    fun customizeItem(position: Int) {
        when(position){
            0->{
                avatarIcon.gone()
                checkboxImageView.gone()
            }
            else->{
                viewTitle.gone()
            }
        }
    }


}