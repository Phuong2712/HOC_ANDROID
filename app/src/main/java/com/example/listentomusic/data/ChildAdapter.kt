package com.example.listentomusic.data

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.listentomusic.R

class ChildAdapter(private val parentItem: ParentItem) :
    RecyclerView.Adapter<ChildAdapter.childViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): childViewHolder{
        val itemChild = LayoutInflater.from(parent.context).inflate(
            R.layout.list_music, parent, false
        )
        return childViewHolder(itemChild)
    }

    override fun getItemCount(): Int {
        return when (parentItem.title){
            "Thư giãn" -> ChildList.relax_list.size
            "Tình yêu" -> ChildList.love_list.size
            "Remix" -> ChildList.remix_list.size
            else -> 0
        }
    }

    override fun onBindViewHolder(holder: childViewHolder, position: Int) {
        return when (parentItem.title){
            "Thư giãn" -> holder.bindData(ChildList.relax_list[position])
            "Tình yêu" -> holder.bindData(ChildList.love_list[position])
            "Remix" -> holder.bindData(ChildList.remix_list[position])
            else -> {}
        }
    }

    inner class childViewHolder(val view : View) : RecyclerView.ViewHolder(view){
        private val imageView : ImageView = view.findViewById(R.id.iv_music)
        private val nameSong : TextView = view.findViewById(R.id.etName_music)
        private val authorSong : TextView = view.findViewById(R.id.etAuthor_music)

        fun bindData(item : ChildItem){
            imageView.setImageResource(item.ItemResId)
            nameSong.text = item.textSong
            authorSong.text = item.textAuthor
        }
    }
}