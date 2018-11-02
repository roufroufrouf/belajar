package id.roufroufrouf.belajar

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import id.roufroufrouf.belajar.databinding.ActivityExampleBinding

class ExampleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = DataBindingUtil.setContentView<ActivityExampleBinding>(this, R.layout.activity_example)

        setSupportActionBar(binding.toolbar)

        binding.user = User("roufroufrouf", "abdurrouf_utm@hotmail.com",
                "https://banner2.kisspng.com/20180611/grc/kisspng-kotlin-java-logo-5b1e984a7f8c09.1983974615287317225225.jpg")

        val handlers = MyClickHandlers()
        binding.handlers = handlers
        //binding.content.handlers = handlers
    }
}