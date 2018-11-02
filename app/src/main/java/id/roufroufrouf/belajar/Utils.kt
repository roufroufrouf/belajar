package id.roufroufrouf.belajar

import com.bumptech.glide.Glide
import android.databinding.BindingAdapter
import android.util.Log
import android.widget.ImageView
import com.squareup.picasso.Picasso


fun toUpper(s: String?): String? {
    return s?.toUpperCase()
}

@BindingAdapter("imageUrl")
fun ImageView.setImageUrl(imageUrl: String?) {
    Glide.with(context).load(imageUrl).into(this)
//    Picasso.get().load(imageUrl).into(this)
}

fun convertToSuffix(count: Long?): String {
    if (count == null) return ""
    if (count < 1000) return "" + count
    val exp = (Math.log(count.toDouble()) / Math.log(1000.0)).toInt()
    return String.format("%.1f%c",
            count / Math.pow(1000.0, exp.toDouble()),
            "kmgtpe"[exp - 1])
}