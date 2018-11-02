package id.roufroufrouf.belajar.view

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import id.roufroufrouf.belajar.R
import id.roufroufrouf.belajar.databinding.PostRowItemBinding
import id.roufroufrouf.belajar.model.Post

public class PostsAdapter(private var postList: List<Post>, private var listener: (Post) -> Unit) : RecyclerView.Adapter<PostsAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MyViewHolder {
        //val view = LayoutInflater.from(p0.context).inflate(R.layout.post_row_item, p0, false)
        val postRowItemBinding = DataBindingUtil.inflate<PostRowItemBinding>(
                LayoutInflater.from(p0.context), R.layout.post_row_item, p0, false
        )
        return MyViewHolder(postRowItemBinding)
    }

    override fun getItemCount(): Int = postList.size

    override fun onBindViewHolder(p0: MyViewHolder, p1: Int) = p0.bind(postList.get(p1), listener)

    inner class MyViewHolder(val binding: PostRowItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(post: Post, listener: (Post) -> Unit) {
            binding.post = post
            binding.thumbnail.setOnClickListener { listener(post) }
        }
    }
}