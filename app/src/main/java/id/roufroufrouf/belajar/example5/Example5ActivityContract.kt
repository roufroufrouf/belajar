package id.roufroufrouf.belajar.example5

interface Example5ActivityContract {
    interface Presenter {
        fun onShowData(temperatureData: TemperatureData)
        fun showList()
    }

    interface View {
        fun showData(temperatureData: TemperatureData)
        fun startSecondActivity()
    }
}