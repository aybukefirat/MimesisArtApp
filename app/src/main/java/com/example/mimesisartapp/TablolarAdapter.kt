package com.example.mimesisartapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TablolarAdapter (private val mContext: Context, private val tablolarListesi: List<Tablolar>)
    : RecyclerView.Adapter<TablolarAdapter.CardTasarimHolder>(){

    inner class CardTasarimHolder(view: View):RecyclerView.ViewHolder(view){

        var imageViewResim: ImageView
        var textViewResimTitle : TextView
        var textViewPainter : TextView
        var buttonDetails : Button

        init {
            imageViewResim = view.findViewById(R.id.imageViewResim)
            textViewResimTitle = view.findViewById(R.id.textViewResimTitle)
            textViewPainter = view.findViewById(R.id.textViewPainter)
            buttonDetails = view.findViewById(R.id.buttonDetails)

        }


    }

    override fun getItemCount(): Int {
        return tablolarListesi.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimHolder {
        val tasarim = LayoutInflater.from(mContext).inflate(R.layout.card_design,parent,false)
        return CardTasarimHolder(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimHolder, position: Int) {
        val tablo = tablolarListesi[position]
        holder.textViewResimTitle.text = tablo.tablo_ad
        holder.imageViewResim.setImageResource(
            mContext.resources.getIdentifier(tablo.tablo_img_ad, "drawable",mContext.packageName))

    }
}