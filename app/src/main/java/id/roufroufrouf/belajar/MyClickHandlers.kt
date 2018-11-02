package id.roufroufrouf.belajar

import android.view.View
import android.widget.Toast

class MyClickHandlers(var user: id.roufroufrouf.belajar.model.User = id.roufroufrouf.belajar.model.User()) {
    fun onFabClicked(view: View) {
        Toast.makeText(view.context, "FAB clicked!", Toast.LENGTH_SHORT).show()
    }

    fun onButtonClick(view: View) {
        Toast.makeText(view.context, "Button clicked!", Toast.LENGTH_SHORT).show()
    }

    fun onButtonClickWithParam(view: View, user: User) {
        Toast.makeText(view.context, "Button clicked! Name: " + user.avatar!!, Toast.LENGTH_SHORT).show()
    }

    fun onButtonLongPressed(view: View): Boolean {
        Toast.makeText(view.context, "Button long pressed!", Toast.LENGTH_SHORT).show()
        return false
    }

    fun onProfileImageLongPressed(view: View): Boolean {
        Toast.makeText(view.context, "Profile image long pressed!", Toast.LENGTH_LONG).show()
        return false
    }

    fun onProfileFabClicked(view: View) {
        user.name = "Sir David Attenborough"
        user.profileImage = "https://api.androidhive.info/images/nature/david1.jpg"

        // updating ObservableField
        user.numberOfPosts?.set(5500L)
        user.numberOfFollowers?.set(5050890L)
        user.numberOfFollowing?.set(180L)
    }

    fun onFollowersClicked(view: View) {
        Toast.makeText(view.context, "Followers is clicked!", Toast.LENGTH_SHORT).show()
    }

    fun onFollowingClicked(view: View) {
        Toast.makeText(view.context, "Following is clicked!", Toast.LENGTH_SHORT).show()
    }

    fun onPostsClicked(view: View) {
        Toast.makeText(view.context, "Posts is clicked!", Toast.LENGTH_SHORT).show()
    }
}