package id.roufroufrouf.belajar.example5

import java.util.Arrays.asList
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.os.Bundle
import android.app.Activity
import id.roufroufrouf.belajar.R
import java.util.*


class SecondActivity : Activity() {

    private var recyclerView: RecyclerView? = null
    private var mAdapter: RecyclerView.Adapter<*>? = null
    private var mLayoutManager: RecyclerView.LayoutManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_main)
        recyclerView = findViewById(R.id.my_recycler_view)

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView!!.setHasFixedSize(true)

        // use a linear layout manager
        mLayoutManager = LinearLayoutManager(this)
        recyclerView!!.layoutManager = mLayoutManager

        val items = Arrays.asList(TemperatureData("Hamburg", "5"), TemperatureData("Berlin", "6"))

        // define an adapter
        mAdapter = MyAdapter(items)
        recyclerView!!.adapter = mAdapter
    }
}