package id.roufroufrouf.belajar.example5

import android.content.Intent
import android.widget.Toast
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.app.Activity
import id.roufroufrouf.belajar.R
import id.roufroufrouf.belajar.databinding.ActivityExampleFiveBinding


class Example5Activity : Activity(), Example5ActivityContract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityExampleFiveBinding>(this@Example5Activity, R.layout.activity_example_five)
        val mainActivityPresenter = Example5ActivityPresenter(this)
        val temperatureData = TemperatureData("Hamburg", "10")
        binding.temp = temperatureData
        binding.presenter = mainActivityPresenter
    }

    override fun showData(temperatureData: TemperatureData) {
        val celsius = temperatureData.getCelsius()
        Toast.makeText(this, celsius, Toast.LENGTH_SHORT).show()
    }

    override fun startSecondActivity() {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }
}