package com.example.ui

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.maincomponents.MainActivity
import com.example.maincomponents.R

class ContactAdapter(private val context: Activity, private val arrayList: ArrayList<MainActivity.Contact>) :
    ArrayAdapter<MainActivity.Contact>(
        context,
        R.layout.item_contact,
        arrayList
    ) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater : LayoutInflater = LayoutInflater.from(context)
        val view: View = inflater.inflate(R.layout.item_contact,null)

        val tv_full_name: TextView = view.findViewById(R.id.tv_full_name)
        val tv_phone_number: TextView = view.findViewById(R.id.tv_phone_number)

        tv_full_name.text = arrayList[position].name
        tv_phone_number.text = arrayList[position].phoneNumber

        return view
    }
}