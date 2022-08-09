package com.example.recyclerapi.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerapi.R
import com.example.recyclerapi.data.response.PahlawanResponseItem
import com.example.recyclerapi.databinding.RowItemBinding

class Adapter(private val datas: ArrayList<PahlawanResponseItem>):
    RecyclerView.Adapter<Adapter.MyViewHolder>() {
    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val binding = RowItemBinding.bind(view)
        val tvNama = binding.tvNama
        val tvAsal = binding.tvAsal
        val tvUsia = binding.tvUsia
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.row_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvNama.text = datas[position].nama
        holder.tvAsal.text = datas[position].asal.toString()
        holder.tvUsia.text = datas[position].usia
    }

    override fun getItemCount(): Int = datas.size

    fun setData(data: List<PahlawanResponseItem>?) {
        if (data == null) return
        datas.clear()
        datas.addAll(data)
    }
}