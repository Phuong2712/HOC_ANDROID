package com.example.listentomusic.data

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listentomusic.R

class ParentAdapter(private val parentData: List<ParentItem>) :
    RecyclerView.Adapter<ParentAdapter.parentViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): parentViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return parentViewHolder(view)
    }

    override fun onBindViewHolder(holder: parentViewHolder, position: Int) {
        holder.bindData(parentData[position])
    }

    override fun getItemCount(): Int {
        return parentData.size
    }

    inner class parentViewHolder(val view : View) : RecyclerView.ViewHolder(view){
        private val childRecyclerView : RecyclerView = view.findViewById(R.id.recyclerViewListMusic)
        private val textTitle : TextView = view.findViewById(R.id.tvTitle)

        fun bindData(item : ParentItem){
            textTitle.text = item.title
            childRecyclerView.adapter = ChildAdapter(item)
            childRecyclerView.layoutManager = LinearLayoutManager(
                view.context,
                LinearLayoutManager.HORIZONTAL,
                false
            )
        }

    }
}
