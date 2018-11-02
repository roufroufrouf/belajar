package id.roufroufrouf.belajar.example6

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import id.roufroufrouf.belajar.R
import kotlinx.android.synthetic.main.activity_ex_six.*

public class ExSixActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex_six)

        val datas = mutableListOf(
                PromotionItemViewModel("title1", "subtitle1", "desc1", true),
                PromotionItemViewModel("title2", "subtitle2", "desc2", false),
                PromotionItemViewModel("title3", "subtitle3", "desc3", true)
        )

        rvExSix?.setHasFixedSize(true)
        rvExSix?.layoutManager = LinearLayoutManager(this)
        val adapter = PromotionAdapter(datas)
        rvExSix?.adapter = adapter
    }
}