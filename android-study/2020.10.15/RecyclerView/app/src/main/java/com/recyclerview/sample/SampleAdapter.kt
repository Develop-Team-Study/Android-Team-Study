package com.recyclerview.sample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class SampleAdapter : RecyclerView.Adapter<SampleAdapter.ViewHolder>() {

    private val boxList = ArrayList<Int>()

    // onCreateViewHolder() - 아이템 뷰를 위한 뷰홀더 객체 생성하여 리턴.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_sample, parent, false)

        return ViewHolder(view)
    }

    //position에 해당하는 데이터를 뷰홀더의 아이템뷰에 표시.
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(boxList[position])
    }

    override fun getItemCount(): Int = boxList.size  // 전체 데이터 개수 리

    fun add(data: Int){
        boxList.add(data)
        notifyDataSetChanged()
    }

    // 아이템 뷰를 저장하는 뷰홀더 클래스.
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val boxImage = itemView.findViewById<ImageView>(R.id.item_image_view)

        fun bind(num: Int) {
            if (num == 1) {
                boxImage.setImageResource(R.drawable.ic_first_box)
            } else boxImage.setImageResource(R.drawable.ic_second_box)
        }
    }
}