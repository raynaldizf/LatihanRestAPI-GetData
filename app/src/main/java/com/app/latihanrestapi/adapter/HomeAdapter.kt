package com.app.latihanrestapi.adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.app.latihanrestapi.databinding.UserListBinding
import com.app.latihanrestapi.model.request.DataAllMahasiswa

class HomeAdapter(private var dataMhs : List<DataAllMahasiswa>) : RecyclerView.Adapter<HomeAdapter.ViewHolder>(){

    class ViewHolder(val binding : UserListBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = UserListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataMhs.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.txtNama.text = dataMhs[position].nama
        holder.binding.txtNim.text = dataMhs[position].nIM
        holder.binding.txtTelepon.text = dataMhs[position].telepon
        holder.binding.cardView.setOnClickListener{
            val bundle = Bundle()
            bundle.putString("nim",dataMhs[position].nIM)
            bundle.putString("nama",dataMhs[position].nama)
            bundle.putString("telepon",dataMhs[position].telepon)
            Navigation.findNavController(it).navigate(com.app.latihanrestapi.R.id.action_homeFragment_to_detailFragment, bundle)
        }
    }
}