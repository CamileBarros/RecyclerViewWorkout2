package com.camile.recyclerviewworkout2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.camile.recyclerviewworkout2.models.SevenWonders
import kotlinx.android.synthetic.main.seven_wonders_details.view.*
import kotlinx.android.synthetic.main.seven_wonders_list.view.*

class SevenWondersAdapter(private val onItemClicked : (SevenWonders) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private var items : List<SevenWonders> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        return SevenWondersViewHolder (
            LayoutInflater.from(parent.context).inflate(R.layout.seven_wonders_list,
                parent, false)

        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder){
            is SevenWondersViewHolder -> {
                holder.bind(items[position], onItemClicked)
            }
        }
    }

    override fun getItemCount(): Int {

        return items.size

    }

    fun setDataSet (list: List<SevenWonders>){
        this.items = list
    }

    class SevenWondersViewHolder constructor(
        itemView : View

    ): RecyclerView.ViewHolder(itemView){
        private val wonderName = itemView.name
        private val wonderLocal = itemView.local
        private val wonderPhoto = itemView.photo
        private val wonderDescription = itemView.description_details

        fun bind(sevenWonders: SevenWonders, onItemClicked: (SevenWonders) -> Unit) {
            wonderName.text = sevenWonders.name
            wonderLocal.text = sevenWonders.local
            wonderDescription.text = sevenWonders.description


            itemView.setOnClickListener{
                onItemClicked(sevenWonders)


            val requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_baseline_refresh_24)
                .error(R.drawable.ic_baseline_error_24)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(sevenWonders.photo)
                .into(wonderPhoto)

                }
        }

    }

}