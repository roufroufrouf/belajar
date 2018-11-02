package id.roufroufrouf.belajar

import android.content.Intent
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import id.roufroufrouf.belajar.databinding.ActivityMainBinding
import id.roufroufrouf.belajar.example3.DemoActivity
import id.roufroufrouf.belajar.example5.Example5Activity
import id.roufroufrouf.belajar.example6.ExSixActivity
import id.roufroufrouf.belajar.view.MainActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        binding.user = User("Abdurrouf", "roufroufrouf@gmail.com",
                "https://vignette.wikia.nocookie.net/bungostraydogs/images/1/1e/Profile-icon-9.png/revision/latest?cb=20171030104015")

        btnCek?.setOnClickListener {
            binding.user = User("Rouf Dev", "roufdev@gmail.com")
        }

        btnToExample2?.setOnClickListener {
            startActivity(Intent(this, ExampleActivity::class.java))
        }

        btnToExample3?.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        btnToExample4?.setOnClickListener {
            startActivity(Intent(this, DemoActivity::class.java))
        }

        btnToExample5?.setOnClickListener {
            startActivity(Intent(this, Example5Activity::class.java))
        }

        btnToExample6?.setOnClickListener {
            startActivity(Intent(this, ExSixActivity::class.java))
        }
    }
}
//ref : https://www.androidhive.info/android-working-with-databinding/