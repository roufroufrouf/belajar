package id.roufroufrouf.belajar.example5

public class Example5ActivityPresenter(private val view: Example5ActivityContract.View) : Example5ActivityContract.Presenter {
    override fun onShowData(temperatureData: TemperatureData) {
        view.showData(temperatureData)
    }

    override fun showList() {
        view.startSecondActivity()
    }
}