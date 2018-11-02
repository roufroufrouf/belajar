package id.roufroufrouf.belajar.example3

import android.databinding.ObservableField

class DemoViewModel {
    val buttonVisible = true
    val text = ObservableField("Data binding works!")

    fun buttonClicked() {
        text.set("Button clicked!")
    }
}