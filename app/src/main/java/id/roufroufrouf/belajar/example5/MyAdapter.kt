package id.roufroufrouf.belajar.example5

import id.roufroufrouf.belajar.R

class MyAdapter(private val data: List<TemperatureData>) : MyBaseAdapter() {

    override fun getDataAtPosition(position: Int): Any {
        return data[position]
    }

    override fun getLayoutIdForType(viewType: Int): Int {
        return R.layout.row_layout
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount(): Int {
        return data.size
    }

}