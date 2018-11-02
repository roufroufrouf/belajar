package id.roufroufrouf.belajar

import android.databinding.BindingAdapter
import android.widget.ImageView
import com.bumptech.glide.Glide

data class User(
        var name: String? = null,
        var email: String? = null,
        var avatar: String? = null
)
