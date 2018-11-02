package id.roufroufrouf.belajar.example6

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import id.roufroufrouf.belajar.databinding.RowExSixLayoutBinding

class PromotionAdapter(private val items: List<PromotionItemViewModel>) : RecyclerView.Adapter<PromotionAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = RowExSixLayoutBinding.inflate(inflater)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(items[position])

    inner class ViewHolder(val binding: RowExSixLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: PromotionItemViewModel) {
            binding.item = item
            binding.promotionItemSpecialLabel.visibility = if (item.isSpecial) View.VISIBLE else View.GONE
            binding.executePendingBindings()
        }
    }
}