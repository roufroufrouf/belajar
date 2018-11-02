package id.roufroufrouf.belajar.example3

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import id.roufroufrouf.belajar.R
import id.roufroufrouf.belajar.databinding.ActivityDemoBinding

public class DemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityDemoBinding>(this, R.layout.activity_demo)
        binding.vm = DemoViewModel() // Injecting the view model into the layout file
    }
}