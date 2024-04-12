package com.example.listentomusic.data

import com.example.listentomusic.data.ChildList.love_list
import com.example.listentomusic.data.ChildList.relax_list
import com.example.listentomusic.data.ChildList.remix_list

object ParentList {
    val song = listOf(
        ParentItem("Thư giãn", relax_list),
        ParentItem("Tình yêu", love_list),
        ParentItem("Remix", remix_list),
    )
}