package com.example.cs481api



import retrofit2.Call
import retrofit2.http.GET

import android.provider.ContactsContract.Data
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PostAdapter(val PostModel: MutableList<PostModel>)  : RecyclerView.Adapter<PostViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_post, parent, false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        return holder.bindView(PostModel[position])
    }

    override fun getItemCount(): Int {
        return PostModel.size
    }
}

class PostViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

    private val tvTitle: TextView = itemView.findViewById(R.id.tvTitle)
    private val tvBody: TextView = itemView.findViewById(R.id.tvBody)


    fun bindView(postModel: PostModel){
        tvTitle.text = postModel.title
        tvBody.text = postModel.body
    }
}