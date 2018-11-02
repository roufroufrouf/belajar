package id.roufroufrouf.belajar.example5

import com.bumptech.glide.Glide
import android.databinding.BindingAdapter
import android.databinding.adapters.TextViewBindingAdapter.setText
import android.widget.ImageView
import android.widget.TextView


@BindingAdapter("titleText")
fun setText(view: TextView, text: String?) {
    view.text = text
}

@BindingAdapter("android:src")
fun setImageUrl(view: ImageView, url: String?) {
    Glide.with(view.context).load(url).into(view)
}