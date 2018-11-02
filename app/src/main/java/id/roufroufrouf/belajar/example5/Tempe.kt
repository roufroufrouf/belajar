package id.roufroufrouf.belajar.example5

import android.databinding.BaseObservable
import android.databinding.Bindable
import id.roufroufrouf.belajar.BR

class Tempe(private var location: String?, private var celsius: String?) : BaseObservable() {
    var url = "http://lorempixel.com/400/200/"

    @Bindable
    fun getCelsius(): String? {
        return celsius
    }

    @Bindable
    fun getLocation(): String? {
        return location
    }

    fun setLocation(location: String) {
        this.location = location
        notifyPropertyChanged(BR.location)
    }

    fun setCelsius(celsius: String) {
        this.celsius = celsius
        notifyPropertyChanged(BR.celsius)
    }
}