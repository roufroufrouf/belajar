package id.roufroufrouf.belajar.view

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.GridLayoutManager
import android.util.TypedValue
import android.widget.Toast
import id.roufroufrouf.belajar.MyClickHandlers
import id.roufroufrouf.belajar.R
import id.roufroufrouf.belajar.databinding.ActivityExampleMainBinding
import id.roufroufrouf.belajar.model.Post
import id.roufroufrouf.belajar.model.User
import id.roufroufrouf.belajar.utils.GridSpacingItemDecoration
import kotlinx.android.synthetic.main.activity_example_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = DataBindingUtil.setContentView<ActivityExampleMainBinding>(this, R.layout.activity_example_main)

        setSupportActionBar(toolbar)
        supportActionBar?.setTitle(R.string.toolbar_profile)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val handlers = MyClickHandlers()

        val rvBinding = binding.exampleContent.recyclerView
        rvBinding?.let {
            it.layoutManager = GridLayoutManager(this@MainActivity, 3)
            it.addItemDecoration(GridSpacingItemDecoration(3, dpToPx(4), true))
            it.itemAnimator = DefaultItemAnimator()
            it.isNestedScrollingEnabled = false
            val myAdapter = PostsAdapter(getPosts()) {
                Toast.makeText(applicationContext, "Post clicked! " + it.imageUrl, Toast.LENGTH_SHORT).show()
            }
            it.adapter = myAdapter
        }

        val user = User()
        user.name = "David Attenborough"
        user.email = "david@natgeo.com"
        user.profileImage = "https://api.androidhive.info/images/nature/david.jpg"
        user.about = "Naturalist"

        // ObservableField doesn't have setter method, instead will
        // be called using set() method
        user.numberOfPosts?.set(3400L)
        user.numberOfFollowers?.set(3050890L)
        user.numberOfFollowing?.set(150L)

        // display user
        binding.user = user

        // assign click handlers
        binding.exampleContent.handlers = handlers
    }

    private fun getPosts(): List<Post> {
        val posts = mutableListOf<Post>()
        for (i in 1..9) {
            val post = Post()
            post.imageUrl = "https://api.androidhive.info/images/nature/$i.jpg"

            posts.add(post)
        }

        return posts
    }

    /**
     * Converting dp to pixel
     */
    private fun dpToPx(dp: Int): Int {
        val r = resources
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp.toFloat(), r.displayMetrics))
    }
}